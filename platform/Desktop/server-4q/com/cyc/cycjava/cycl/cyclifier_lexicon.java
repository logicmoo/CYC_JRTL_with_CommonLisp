package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class cyclifier_lexicon extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.cyclifier_lexicon";
    public static final String myFingerPrint = "eae34c8cecdb52dc180c81a584138bf1e35a486542ced37bca12610a1e426fd1";
    private static final SubLSymbol $sym0$CYCLIFIER_LEXICON;
    private static final SubLSymbol $sym1$SEMTRANS_LEXICON;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$OBJECT;
    private static final SubLSymbol $sym4$INSTANCE_COUNT;
    private static final SubLSymbol $sym5$ABSTRACT_LEXICON;
    private static final SubLSymbol $sym6$DEFAULT_EXCLUDE_MTS;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$DEFAULT_EXCLUDE_PREDICATES;
    private static final SubLSymbol $sym9$DEFAULT_BASE_MT;
    private static final SubLObject $const10$AllGeneralEnglishValidatedLexical;
    private static final SubLSymbol $sym11$DEFAULT_KB_SPEC;
    private static final SubLObject $const12$AbstractLexiconSpecification;
    private static final SubLSymbol $sym13$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS;
    private static final SubLSymbol $sym14$ISOLATED_P;
    private static final SubLSymbol $sym15$INSTANCE_NUMBER;
    private static final SubLSymbol $sym16$ALLOWED_MTS;
    private static final SubLSymbol $kw17$UNINITIALIZED;
    private static final SubLSymbol $sym18$EXCLUDED_MTS;
    private static final SubLSymbol $sym19$BASE_MT;
    private static final SubLSymbol $sym20$ROOT_MT;
    private static final SubLSymbol $sym21$EXCLUDED_PREDS;
    private static final SubLSymbol $sym22$EXCLUDED_POS_LIST;
    private static final SubLSymbol $sym23$TRIE;
    private static final SubLSymbol $sym24$CACHE;
    private static final SubLSymbol $sym25$IGNORE_CACHE_;
    private static final SubLSymbol $sym26$CASE_SENSITIVITY;
    private static final SubLSymbol $sym27$ALLOW_FABRICATION_;
    private static final SubLSymbol $sym28$LEARNED;
    private static final SubLSymbol $sym29$ACTIVE_LEARNERS;
    private static final SubLSymbol $sym30$ALLOW_STEMMING;
    private static final SubLSymbol $sym31$STOP_WORDS;
    private static final SubLSymbol $sym32$MY_TERM_LEXICON;
    private static final SubLSymbol $sym33$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE;
    private static final SubLSymbol $sym34$CREATE_LEX_ENTRIES_NUMBER;
    private static final SubLList $list35;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$LEX_ENTRY;
    private static final SubLSymbol $sym39$SET;
    private static final SubLSymbol $kw40$STRING;
    private static final SubLSymbol $kw41$SEMTRANS;
    private static final SubLObject $const42$thereExistAtLeast;
    private static final SubLList $list43;
    private static final SubLSymbol $kw44$CYC_POS;
    private static final SubLObject $const45$Number_SP;
    private static final SubLSymbol $kw46$PENN_TAGS;
    private static final SubLList $list47;
    private static final SubLSymbol $sym48$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD;
    private static final SubLSymbol $sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD;
    private static final SubLList $list50;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLObject $const53$Verb;
    private static final SubLObject $const54$thereExists;
    private static final SubLSymbol $kw55$ACTION;
    private static final SubLObject $const56$and;
    private static final SubLList $list57;
    private static final SubLSymbol $kw58$FRAME;
    private static final SubLSymbol $kw59$WORD_UNIT;
    private static final SubLSymbol $kw60$INFLECTIONS;
    private static final SubLList $list61;
    private static final SubLObject $const62$Noun;
    private static final SubLSymbol $sym63$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const64$EverythingPSC;
    private static final SubLObject $const65$isa;
    private static final SubLObject $const66$equals;
    private static final SubLSymbol $kw67$NOUN;
    private static final SubLObject $const68$RegularNounFrame;
    private static final SubLSymbol $sym69$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD;
    private static final SubLSymbol $sym70$FABRICATE_VERBAL_SEMTRANS;
    private static final SubLList $list71;
    private static final SubLList $list72;
    private static final SubLSymbol $sym73$CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD;
    private static final SubLObject $const74$StateFn;
    private static final SubLSymbol $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION;
    private static final SubLList $list76;
    private static final SubLSymbol $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA;
    private static final SubLSymbol $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS;
    private static final SubLSymbol $sym79$FABRICATE;
    private static final SubLList $list80;
    private static final SubLList $list81;
    private static final SubLList $list82;
    private static final SubLSymbol $sym83$STRINGP;
    private static final SubLSymbol $sym84$LISTP;
    private static final SubLSymbol $sym85$KEYWORDP;
    private static final SubLSymbol $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 803L)
    public static SubLObject new_cyclifier_lexicon() {
        return object.new_class_instance((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 893L)
    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym3$OBJECT, (SubLObject)cyclifier_lexicon.$sym4$INSTANCE_COUNT, (SubLObject)cyclifier_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym6$DEFAULT_EXCLUDE_MTS, (SubLObject)cyclifier_lexicon.$list7);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym9$DEFAULT_BASE_MT, cyclifier_lexicon.$const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym11$DEFAULT_KB_SPEC, cyclifier_lexicon.$const12$AbstractLexiconSpecification);
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 893L)
    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym3$OBJECT, (SubLObject)cyclifier_lexicon.$sym14$ISOLATED_P, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym3$OBJECT, (SubLObject)cyclifier_lexicon.$sym15$INSTANCE_NUMBER, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym16$ALLOWED_MTS, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym18$EXCLUDED_MTS, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym19$BASE_MT, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym20$ROOT_MT, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym21$EXCLUDED_PREDS, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym22$EXCLUDED_POS_LIST, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym23$TRIE, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym24$CACHE, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym25$IGNORE_CACHE_, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym26$CASE_SENSITIVITY, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym27$ALLOW_FABRICATION_, (SubLObject)cyclifier_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym28$LEARNED, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym29$ACTIVE_LEARNERS, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym30$ALLOW_STEMMING, (SubLObject)cyclifier_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym31$STOP_WORDS, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym1$SEMTRANS_LEXICON, (SubLObject)cyclifier_lexicon.$sym32$MY_TERM_LEXICON, (SubLObject)cyclifier_lexicon.NIL);
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 893L)
    public static SubLObject cyclifier_lexicon_p(final SubLObject v_cyclifier_lexicon) {
        return classes.subloop_instanceof_class(v_cyclifier_lexicon, (SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 1260L)
    public static SubLObject cyclifier_lexicon_create_lex_entries_number_method(final SubLObject self, final SubLObject number_string) {
        final SubLObject lex_entry = object.new_class_instance((SubLObject)cyclifier_lexicon.$sym38$LEX_ENTRY);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw40$STRING, number_string);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw41$SEMTRANS, (SubLObject)ConsesLow.listS(cyclifier_lexicon.$const42$thereExistAtLeast, numeral_parser.string_to_interval(number_string), (SubLObject)cyclifier_lexicon.$list43));
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw44$CYC_POS, cyclifier_lexicon.$const45$Number_SP);
        methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw46$PENN_TAGS, (SubLObject)cyclifier_lexicon.$list47);
        return (SubLObject)ConsesLow.list(lex_entry);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 1698L)
    public static SubLObject cyclifier_lexicon_create_lex_entries_nl_trie_word_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject lex_entries = (SubLObject)cyclifier_lexicon.NIL;
        final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, (SubLObject)cyclifier_lexicon.UNPROVIDED);
        if (cyclifier_lexicon.NIL != lexicon_vars.semtrans_predP(pred)) {
            SubLObject cdolist_list_var = cycl_utilities.hl_to_el(nl_trie.nl_trie_word_semtrans_templates(nl_trie_entry));
            SubLObject semtrans = (SubLObject)cyclifier_lexicon.NIL;
            semtrans = cdolist_list_var.first();
            while (cyclifier_lexicon.NIL != cdolist_list_var) {
                final SubLObject wu = nl_trie.nl_trie_word_word_unit(nl_trie_entry, (SubLObject)cyclifier_lexicon.UNPROVIDED);
                final SubLObject pos = nl_trie.nl_trie_entry_pos(nl_trie_entry);
                final SubLObject frame = nl_trie.nl_trie_word_frame(nl_trie_entry);
                final SubLObject inflections = (SubLObject)((cyclifier_lexicon.NIL != wu) ? conses_high.intersection(lexicon_accessors.preds_of_stringXword(string, wu, (SubLObject)cyclifier_lexicon.UNPROVIDED, (SubLObject)cyclifier_lexicon.UNPROVIDED, (SubLObject)cyclifier_lexicon.UNPROVIDED), lexicon_utilities.preds_of_pos(pos, (SubLObject)cyclifier_lexicon.UNPROVIDED), (SubLObject)cyclifier_lexicon.UNPROVIDED, (SubLObject)cyclifier_lexicon.UNPROVIDED) : cyclifier_lexicon.$list52);
                final SubLObject lex_entry = object.new_class_instance((SubLObject)cyclifier_lexicon.$sym38$LEX_ENTRY);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw44$CYC_POS, pos);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw41$SEMTRANS, (SubLObject)((cyclifier_lexicon.NIL != lexicon_accessors.genl_posP(pos, cyclifier_lexicon.$const53$Verb, (SubLObject)cyclifier_lexicon.UNPROVIDED) && cyclifier_lexicon.NIL != davidsonian_p(semtrans)) ? ConsesLow.list(cyclifier_lexicon.$const54$thereExists, (SubLObject)cyclifier_lexicon.$kw55$ACTION, (SubLObject)ConsesLow.listS(cyclifier_lexicon.$const56$and, semtrans, (SubLObject)cyclifier_lexicon.$list57)) : semtrans));
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw58$FRAME, frame);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw59$WORD_UNIT, wu);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw40$STRING, string);
                methods.funcall_instance_method_with_2_args(lex_entry, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw60$INFLECTIONS, inflections);
                lex_entries = (SubLObject)ConsesLow.cons(lex_entry, lex_entries);
                cdolist_list_var = cdolist_list_var.rest();
                semtrans = cdolist_list_var.first();
            }
        }
        else if (cyclifier_lexicon.NIL != subl_promotions.memberP(nl_trie.nl_trie_entry_semantic_pred(nl_trie_entry, (SubLObject)cyclifier_lexicon.UNPROVIDED), (SubLObject)cyclifier_lexicon.$list61, (SubLObject)cyclifier_lexicon.UNPROVIDED, (SubLObject)cyclifier_lexicon.UNPROVIDED) && cyclifier_lexicon.NIL != lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(nl_trie_entry), cyclifier_lexicon.$const62$Noun, (SubLObject)cyclifier_lexicon.UNPROVIDED)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)cyclifier_lexicon.$sym63$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(cyclifier_lexicon.$const64$EverythingPSC, thread);
                SubLObject cdolist_list_var2 = nl_trie.nl_trie_entry_denots(nl_trie_entry);
                SubLObject denot = (SubLObject)cyclifier_lexicon.NIL;
                denot = cdolist_list_var2.first();
                while (cyclifier_lexicon.NIL != cdolist_list_var2) {
                    if (cyclifier_lexicon.NIL == fort_types_interface.isa_predicateP(denot, (SubLObject)cyclifier_lexicon.UNPROVIDED)) {
                        final SubLObject lex_entry2 = object.new_class_instance((SubLObject)cyclifier_lexicon.$sym38$LEX_ENTRY);
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw60$INFLECTIONS, nl_trie.nl_trie_word_pos_preds(nl_trie_entry));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw44$CYC_POS, nl_trie.nl_trie_word_pos(nl_trie_entry));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw41$SEMTRANS, (SubLObject)ConsesLow.list((cyclifier_lexicon.NIL != fort_types_interface.isa_collectionP(denot, (SubLObject)cyclifier_lexicon.UNPROVIDED)) ? cyclifier_lexicon.$const65$isa : cyclifier_lexicon.$const66$equals, (SubLObject)cyclifier_lexicon.$kw67$NOUN, cycl_utilities.hl_to_el(denot)));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw58$FRAME, cyclifier_lexicon.$const68$RegularNounFrame);
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw59$WORD_UNIT, nl_trie.nl_trie_word_word_unit(nl_trie_entry, (SubLObject)cyclifier_lexicon.UNPROVIDED));
                        methods.funcall_instance_method_with_2_args(lex_entry2, (SubLObject)cyclifier_lexicon.$sym39$SET, (SubLObject)cyclifier_lexicon.$kw40$STRING, string);
                        lex_entries = (SubLObject)ConsesLow.cons(lex_entry2, lex_entries);
                    }
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    denot = cdolist_list_var2.first();
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return lex_entries;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 3735L)
    public static SubLObject cyclifier_lexicon_fabricate_verbal_semtrans_method(final SubLObject self, final SubLObject string, final SubLObject keywords) {
        SubLObject semtranses = (SubLObject)cyclifier_lexicon.NIL;
        SubLObject cdolist_list_var = semtrans_lexicon.semtrans_lexicon_fabricate_verbal_semtrans_method(self, string, keywords);
        SubLObject semtrans = (SubLObject)cyclifier_lexicon.NIL;
        semtrans = cdolist_list_var.first();
        while (cyclifier_lexicon.NIL != cdolist_list_var) {
            semtranses = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(cyclifier_lexicon.$const54$thereExists, (SubLObject)cyclifier_lexicon.$kw55$ACTION, (SubLObject)ConsesLow.listS(cyclifier_lexicon.$const56$and, semtrans, (SubLObject)cyclifier_lexicon.$list57)), semtranses);
            cdolist_list_var = cdolist_list_var.rest();
            semtrans = cdolist_list_var.first();
        }
        return semtranses;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4243L)
    public static SubLObject davidsonian_p(final SubLObject cycl) {
        final SubLObject stack = stacks.create_stack();
        SubLObject literal = (SubLObject)cyclifier_lexicon.NIL;
        stacks.stack_push(cycl, stack);
        while (cyclifier_lexicon.NIL == stacks.stack_empty_p(stack)) {
            final SubLObject entry = stacks.stack_pop(stack);
            if (cyclifier_lexicon.NIL != el_utilities.literalP(entry)) {
                literal = entry;
                if (cycl_utilities.formula_arg1(literal, (SubLObject)cyclifier_lexicon.UNPROVIDED).eql((SubLObject)cyclifier_lexicon.$kw55$ACTION)) {
                    return (SubLObject)cyclifier_lexicon.T;
                }
            }
            SubLObject cdolist_list_var = cycl_utilities.formula_args(entry, (SubLObject)cyclifier_lexicon.UNPROVIDED);
            SubLObject arg = (SubLObject)cyclifier_lexicon.NIL;
            arg = cdolist_list_var.first();
            while (cyclifier_lexicon.NIL != cdolist_list_var) {
                stacks.stack_push(arg, stack);
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4475L)
    public static SubLObject ensure_davidsonian(final SubLObject cycl) {
        return (cyclifier_lexicon.NIL != davidsonian_p(cycl)) ? cycl : make_davidsonian(cycl);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4667L)
    public static SubLObject make_davidsonian(final SubLObject cycl) {
        return (SubLObject)ConsesLow.list(cyclifier_lexicon.$const65$isa, (SubLObject)cyclifier_lexicon.$kw55$ACTION, (SubLObject)ConsesLow.list(cyclifier_lexicon.$const74$StateFn, cycl));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4836L)
    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym3$OBJECT, (SubLObject)cyclifier_lexicon.$sym4$INSTANCE_COUNT, (SubLObject)cyclifier_lexicon.ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym6$DEFAULT_EXCLUDE_MTS, (SubLObject)cyclifier_lexicon.$list7);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym8$DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym9$DEFAULT_BASE_MT, cyclifier_lexicon.$const10$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym11$DEFAULT_KB_SPEC, cyclifier_lexicon.$const12$AbstractLexiconSpecification);
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4836L)
    public static SubLObject subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym3$OBJECT, (SubLObject)cyclifier_lexicon.$sym14$ISOLATED_P, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym3$OBJECT, (SubLObject)cyclifier_lexicon.$sym15$INSTANCE_NUMBER, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym16$ALLOWED_MTS, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym18$EXCLUDED_MTS, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym19$BASE_MT, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym20$ROOT_MT, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym21$EXCLUDED_PREDS, (SubLObject)cyclifier_lexicon.$kw17$UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym22$EXCLUDED_POS_LIST, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym23$TRIE, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym24$CACHE, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym25$IGNORE_CACHE_, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym26$CASE_SENSITIVITY, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym27$ALLOW_FABRICATION_, (SubLObject)cyclifier_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym28$LEARNED, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym29$ACTIVE_LEARNERS, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym30$ALLOW_STEMMING, (SubLObject)cyclifier_lexicon.T);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym5$ABSTRACT_LEXICON, (SubLObject)cyclifier_lexicon.$sym31$STOP_WORDS, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_initialize_slot(new_instance, (SubLObject)cyclifier_lexicon.$sym1$SEMTRANS_LEXICON, (SubLObject)cyclifier_lexicon.$sym32$MY_TERM_LEXICON, (SubLObject)cyclifier_lexicon.NIL);
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 4836L)
    public static SubLObject cyclifier_lexicon_wXo_fabrication_p(final SubLObject cyclifier_lexicon_wXo_fabrication) {
        return classes.subloop_instanceof_class(cyclifier_lexicon_wXo_fabrication, (SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 5149L)
    public static SubLObject cyclifier_lexicon_wXo_fabrication_fabricate_method(final SubLObject self, final SubLObject string, final SubLObject keywords, final SubLObject penn) {
        assert cyclifier_lexicon.NIL != Types.stringp(string) : string;
        assert cyclifier_lexicon.NIL != Types.listp(keywords) : keywords;
        assert cyclifier_lexicon.NIL != Types.keywordp(penn) : penn;
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/cyclifier-lexicon.lisp", position = 5355L)
    public static SubLObject new_cyclifier_lexicon_wXo_fabrication() {
        return object.new_class_instance((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
    }
    
    public static SubLObject declare_cyclifier_lexicon_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "new_cyclifier_lexicon", "NEW-CYCLIFIER-LEXICON", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "subloop_reserved_initialize_cyclifier_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "subloop_reserved_initialize_cyclifier_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "cyclifier_lexicon_p", "CYCLIFIER-LEXICON-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "cyclifier_lexicon_create_lex_entries_number_method", "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "cyclifier_lexicon_create_lex_entries_nl_trie_word_method", "CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "cyclifier_lexicon_fabricate_verbal_semtrans_method", "CYCLIFIER-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "davidsonian_p", "DAVIDSONIAN-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "ensure_davidsonian", "ENSURE-DAVIDSONIAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "make_davidsonian", "MAKE-DAVIDSONIAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-CLASS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-INSTANCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "cyclifier_lexicon_wXo_fabrication_p", "CYCLIFIER-LEXICON-W/O-FABRICATION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "cyclifier_lexicon_wXo_fabrication_fabricate_method", "CYCLIFIER-LEXICON-W/O-FABRICATION-FABRICATE-METHOD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.cyclifier_lexicon", "new_cyclifier_lexicon_wXo_fabrication", "NEW-CYCLIFIER-LEXICON-W/O-FABRICATION", 0, 0, false);
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    public static SubLObject init_cyclifier_lexicon_file() {
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    public static SubLObject setup_cyclifier_lexicon_file() {
        classes.subloop_new_class((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$sym1$SEMTRANS_LEXICON, (SubLObject)cyclifier_lexicon.NIL, (SubLObject)cyclifier_lexicon.NIL, (SubLObject)cyclifier_lexicon.$list2);
        classes.class_set_implements_slot_listeners((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$sym13$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$sym33$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE);
        subloop_reserved_initialize_cyclifier_lexicon_class((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier_lexicon.$sym34$CREATE_LEX_ENTRIES_NUMBER, (SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$list35, (SubLObject)cyclifier_lexicon.$list36, (SubLObject)cyclifier_lexicon.$list37);
        methods.subloop_register_instance_method((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$sym34$CREATE_LEX_ENTRIES_NUMBER, (SubLObject)cyclifier_lexicon.$sym48$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier_lexicon.$sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD, (SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$list35, (SubLObject)cyclifier_lexicon.$list50, (SubLObject)cyclifier_lexicon.$list51);
        methods.subloop_register_instance_method((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD, (SubLObject)cyclifier_lexicon.$sym69$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier_lexicon.$sym70$FABRICATE_VERBAL_SEMTRANS, (SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$list35, (SubLObject)cyclifier_lexicon.$list71, (SubLObject)cyclifier_lexicon.$list72);
        methods.subloop_register_instance_method((SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.$sym70$FABRICATE_VERBAL_SEMTRANS, (SubLObject)cyclifier_lexicon.$sym73$CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD);
        classes.subloop_new_class((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, (SubLObject)cyclifier_lexicon.$sym0$CYCLIFIER_LEXICON, (SubLObject)cyclifier_lexicon.NIL, (SubLObject)cyclifier_lexicon.NIL, (SubLObject)cyclifier_lexicon.$list76);
        classes.class_set_implements_slot_listeners((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, (SubLObject)cyclifier_lexicon.NIL);
        classes.subloop_note_class_initialization_function((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, (SubLObject)cyclifier_lexicon.$sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA);
        classes.subloop_note_instance_initialization_function((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, (SubLObject)cyclifier_lexicon.$sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS);
        subloop_reserved_initialize_cyclifier_lexicon_wXo_fabrication_class((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION);
        methods.methods_incorporate_instance_method((SubLObject)cyclifier_lexicon.$sym79$FABRICATE, (SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, (SubLObject)cyclifier_lexicon.$list80, (SubLObject)cyclifier_lexicon.$list81, (SubLObject)cyclifier_lexicon.$list82);
        methods.subloop_register_instance_method((SubLObject)cyclifier_lexicon.$sym75$CYCLIFIER_LEXICON_W_O_FABRICATION, (SubLObject)cyclifier_lexicon.$sym79$FABRICATE, (SubLObject)cyclifier_lexicon.$sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD);
        return (SubLObject)cyclifier_lexicon.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_cyclifier_lexicon_file();
    }
    
    @Override
	public void initializeVariables() {
        init_cyclifier_lexicon_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_cyclifier_lexicon_file();
    }
    
    static {
        me = (SubLFile)new cyclifier_lexicon();
        $sym0$CYCLIFIER_LEXICON = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON");
        $sym1$SEMTRANS_LEXICON = SubLObjectFactory.makeSymbol("SEMTRANS-LEXICON");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC"), (SubLObject)SubLObjectFactory.makeKeyword("CLASS"), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"), (SubLObject)SubLObjectFactory.makeKeyword("VALUE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclifierLexiconSpecification"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NUMBER"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING")), (SubLObject)SubLObjectFactory.makeKeyword("PROTECTED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-VERBAL-SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"))));
        $sym3$OBJECT = SubLObjectFactory.makeSymbol("OBJECT");
        $sym4$INSTANCE_COUNT = SubLObjectFactory.makeSymbol("INSTANCE-COUNT");
        $sym5$ABSTRACT_LEXICON = SubLObjectFactory.makeSymbol("ABSTRACT-LEXICON");
        $sym6$DEFAULT_EXCLUDE_MTS = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-MTS");
        $list7 = ConsesLow.list(new SubLObject[] { constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WebSearchDataMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RelationParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNetMappingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PornographyJargonMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommonEnglishMisspellingsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputereseLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclishMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertionsMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishWordSenseAssertions-HoldingMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporaryLexicalAssertions-WordNetImportMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RedundantLexicalMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PDATemplateTestMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishParaphraseMt")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SupplementalDeterminerSemTransLexicalMt")) });
        $sym8$DEFAULT_EXCLUDE_PREDICATES = SubLObjectFactory.makeSymbol("DEFAULT-EXCLUDE-PREDICATES");
        $sym9$DEFAULT_BASE_MT = SubLObjectFactory.makeSymbol("DEFAULT-BASE-MT");
        $const10$AllGeneralEnglishValidatedLexical = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));
        $sym11$DEFAULT_KB_SPEC = SubLObjectFactory.makeSymbol("DEFAULT-KB-SPEC");
        $const12$AbstractLexiconSpecification = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AbstractLexiconSpecification"));
        $sym13$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_CLASS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-CLASS");
        $sym14$ISOLATED_P = SubLObjectFactory.makeSymbol("ISOLATED-P");
        $sym15$INSTANCE_NUMBER = SubLObjectFactory.makeSymbol("INSTANCE-NUMBER");
        $sym16$ALLOWED_MTS = SubLObjectFactory.makeSymbol("ALLOWED-MTS");
        $kw17$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym18$EXCLUDED_MTS = SubLObjectFactory.makeSymbol("EXCLUDED-MTS");
        $sym19$BASE_MT = SubLObjectFactory.makeSymbol("BASE-MT");
        $sym20$ROOT_MT = SubLObjectFactory.makeSymbol("ROOT-MT");
        $sym21$EXCLUDED_PREDS = SubLObjectFactory.makeSymbol("EXCLUDED-PREDS");
        $sym22$EXCLUDED_POS_LIST = SubLObjectFactory.makeSymbol("EXCLUDED-POS-LIST");
        $sym23$TRIE = SubLObjectFactory.makeSymbol("TRIE");
        $sym24$CACHE = SubLObjectFactory.makeSymbol("CACHE");
        $sym25$IGNORE_CACHE_ = SubLObjectFactory.makeSymbol("IGNORE-CACHE?");
        $sym26$CASE_SENSITIVITY = SubLObjectFactory.makeSymbol("CASE-SENSITIVITY");
        $sym27$ALLOW_FABRICATION_ = SubLObjectFactory.makeSymbol("ALLOW-FABRICATION?");
        $sym28$LEARNED = SubLObjectFactory.makeSymbol("LEARNED");
        $sym29$ACTIVE_LEARNERS = SubLObjectFactory.makeSymbol("ACTIVE-LEARNERS");
        $sym30$ALLOW_STEMMING = SubLObjectFactory.makeSymbol("ALLOW-STEMMING");
        $sym31$STOP_WORDS = SubLObjectFactory.makeSymbol("STOP-WORDS");
        $sym32$MY_TERM_LEXICON = SubLObjectFactory.makeSymbol("MY-TERM-LEXICON");
        $sym33$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_INSTANCE = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-INSTANCE");
        $sym34$CREATE_LEX_ENTRIES_NUMBER = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NUMBER");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PROTECTED"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING"));
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING-TO-INTERVAL"), (SubLObject)SubLObjectFactory.makeSymbol("NUMBER-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("RESTR"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPE")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("PENN-TAGS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CD")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY")))));
        $sym38$LEX_ENTRY = SubLObjectFactory.makeSymbol("LEX-ENTRY");
        $sym39$SET = SubLObjectFactory.makeSymbol("SET");
        $kw40$STRING = SubLObjectFactory.makeKeyword("STRING");
        $kw41$SEMTRANS = SubLObjectFactory.makeKeyword("SEMTRANS");
        $const42$thereExistAtLeast = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExistAtLeast"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeKeyword("RESTR"), (SubLObject)SubLObjectFactory.makeKeyword("SCOPE")));
        $kw44$CYC_POS = SubLObjectFactory.makeKeyword("CYC-POS");
        $const45$Number_SP = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Number-SP"));
        $kw46$PENN_TAGS = SubLObjectFactory.makeKeyword("PENN-TAGS");
        $list47 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CD"));
        $sym48$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NUMBER_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NUMBER-METHOD");
        $sym49$CREATE_LEX_ENTRIES_NL_TRIE_WORD = SubLObjectFactory.makeSymbol("CREATE-LEX-ENTRIES-NL-TRIE-WORD");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"));
        $list51 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"), (SubLObject)cyclifier_lexicon.NIL), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PCOND"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS-PRED?"), (SubLObject)SubLObjectFactory.makeSymbol("PRED")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-SEMTRANS-TEMPLATES"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")))), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FRAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("WU"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERSECTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS-OF-STRING&WORD"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("WU")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PREDS-OF-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)SubLObjectFactory.makeSymbol("POS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-POS?"), (SubLObject)SubLObjectFactory.makeSymbol("POS"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAVIDSONIAN-P"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCOPE"))))), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), (SubLObject)SubLObjectFactory.makeSymbol("FRAME")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("WU")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("INFLECTIONS")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) }))), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CAND"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MEMBER?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-SEMANTIC-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString"))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENL-POS?"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITH-ALL-MTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DENOT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY-DENOTS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PUNLESS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-PREDICATE?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), (SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CLET"), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-CLASS-INSTANCE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"))))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("INFLECTIONS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS-PREDS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("CYC-POS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-POS"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ISA-COLLECTION?"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"))), (SubLObject)SubLObjectFactory.makeKeyword("NOUN"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-TO-EL"), (SubLObject)SubLObjectFactory.makeSymbol("DENOT")))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("FRAME"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("WORD-UNIT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-WORD-WORD-UNIT"), (SubLObject)SubLObjectFactory.makeSymbol("NL-TRIE-ENTRY"))), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIM"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("SET")), (SubLObject)SubLObjectFactory.makeKeyword("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRY"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES")) })))))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("LEX-ENTRIES"))));
        $list52 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singular")));
        $const53$Verb = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Verb"));
        $const54$thereExists = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists"));
        $kw55$ACTION = SubLObjectFactory.makeKeyword("ACTION");
        $const56$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list57 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCOPE"));
        $kw58$FRAME = SubLObjectFactory.makeKeyword("FRAME");
        $kw59$WORD_UNIT = SubLObjectFactory.makeKeyword("WORD-UNIT");
        $kw60$INFLECTIONS = SubLObjectFactory.makeKeyword("INFLECTIONS");
        $list61 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")));
        $const62$Noun = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Noun"));
        $sym63$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const64$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $const65$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $const66$equals = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("equals"));
        $kw67$NOUN = SubLObjectFactory.makeKeyword("NOUN");
        $const68$RegularNounFrame = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RegularNounFrame"));
        $sym69$CYCLIFIER_LEXICON_CREATE_LEX_ENTRIES_NL_TRIE_WORD_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-CREATE-LEX-ENTRIES-NL-TRIE-WORD-METHOD");
        $sym70$FABRICATE_VERBAL_SEMTRANS = SubLObjectFactory.makeSymbol("FABRICATE-VERBAL-SEMTRANS");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("@param STRING string; an English word\n   @param KEYWORDS list; a list of keywords to be incorporated into the fabricated semtrans\n   @return el-formula-p; a verbal semtrans for STRING incorporating KEYWORDS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLET"), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"), (SubLObject)cyclifier_lexicon.NIL)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CDOLIST"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FABRICATE-VERBAL-SEMTRANS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPER"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CPUSH"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("thereExists")), (SubLObject)SubLObjectFactory.makeKeyword("ACTION"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BQ-LIST*"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SCOPE"))))), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)SubLObjectFactory.makeSymbol("SEMTRANSES"))));
        $sym73$CYCLIFIER_LEXICON_FABRICATE_VERBAL_SEMTRANS_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-FABRICATE-VERBAL-SEMTRANS-METHOD");
        $const74$StateFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StateFn"));
        $sym75$CYCLIFIER_LEXICON_W_O_FABRICATION = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION");
        $list76 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEF-INSTANCE-METHOD"), (SubLObject)SubLObjectFactory.makeSymbol("FABRICATE"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN")), (SubLObject)SubLObjectFactory.makeKeyword("PUBLIC")));
        $sym77$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_CLA = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-CLASS");
        $sym78$SUBLOOP_RESERVED_INITIALIZE_CYCLIFIER_LEXICON_W_O_FABRICATION_INS = SubLObjectFactory.makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCLIFIER-LEXICON-W/O-FABRICATION-INSTANCE");
        $sym79$FABRICATE = SubLObjectFactory.makeSymbol("FABRICATE");
        $list80 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("PUBLIC"));
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"));
        $list82 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDS"), (SubLObject)SubLObjectFactory.makeSymbol("LISTP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CHECK-TYPE"), (SubLObject)SubLObjectFactory.makeSymbol("PENN"), (SubLObject)SubLObjectFactory.makeSymbol("KEYWORDP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)cyclifier_lexicon.NIL));
        $sym83$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym84$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym85$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym86$CYCLIFIER_LEXICON_W_O_FABRICATION_FABRICATE_METHOD = SubLObjectFactory.makeSymbol("CYCLIFIER-LEXICON-W/O-FABRICATION-FABRICATE-METHOD");
    }
}

/*

	Total time: 310 ms
	
*/
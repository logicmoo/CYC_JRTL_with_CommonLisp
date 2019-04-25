package com.cyc.cycjava.cycl.sbhl;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sbhl_module_declarations extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations";
    public static final String myFingerPrint = "83b42acb7154f9a7cf01a767d8e102ba10a4a72a0ba9749399ec7845b72f2b18";
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13034L)
    private static SubLSymbol $sbhl_modules_initializedP$;
    private static final SubLObject $const0$genls;
    private static final SubLSymbol $kw1$LINK_PRED;
    private static final SubLSymbol $kw2$LINK_STYLE;
    private static final SubLObject $const3$DirectedMultigraph;
    private static final SubLSymbol $kw4$NAUT_FORWARD_TRUE_GENERATORS;
    private static final SubLList $list5;
    private static final SubLSymbol $kw6$MODULE_TYPE;
    private static final SubLSymbol $kw7$SIMPLE_REFLEXIVE;
    private static final SubLSymbol $kw8$TYPE_TEST;
    private static final SubLSymbol $sym9$COLLECTION_P;
    private static final SubLSymbol $kw10$DISJOINS_MODULE;
    private static final SubLObject $const11$disjointWith;
    private static final SubLSymbol $kw12$PATH_TERMINATING_MARK__FN;
    private static final SubLSymbol $sym13$SBHL_MARKED_P;
    private static final SubLSymbol $kw14$MARKING_FN;
    private static final SubLSymbol $sym15$SET_SBHL_MARKING_STATE_TO_MARKED;
    private static final SubLSymbol $kw16$UNMARKING_FN;
    private static final SubLSymbol $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED;
    private static final SubLSymbol $kw18$ROOT;
    private static final SubLObject $const19$Thing;
    private static final SubLSymbol $kw20$INDEX_ARG;
    private static final SubLObject $const21$Multigraph;
    private static final SubLSymbol $kw22$DISJOINS;
    private static final SubLSymbol $kw23$TRANSFERS_THROUGH_MODULE;
    private static final SubLSymbol $kw24$TRANSFERS_VIA_ARG;
    private static final SubLObject $const25$isa;
    private static final SubLList $list26;
    private static final SubLSymbol $kw27$TRANSFERS_THROUGH;
    private static final SubLObject $const28$quotedIsa;
    private static final SubLList $list29;
    private static final SubLObject $const30$genlMt;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$MICROTHEORY_P;
    private static final SubLObject $const33$intensionallyIncompatibleMt;
    private static final SubLObject $const34$negationMt;
    private static final SubLObject $const35$genlPreds;
    private static final SubLSymbol $sym36$PREDICATE_P;
    private static final SubLObject $const37$negationPreds;
    private static final SubLSymbol $kw38$MODULE_INVERTS_ARGUMENTS;
    private static final SubLObject $const39$genlInverse;
    private static final SubLSymbol $sym40$SBHL_PREDICATE_PATH_TERMINATION_P;
    private static final SubLSymbol $sym41$SBHL_PREDICATE_MARKING_FN;
    private static final SubLSymbol $sym42$SBHL_PREDICATE_UNMARKING_FN;
    private static final SubLSymbol $kw43$PREDICATE_SEARCH_P;
    private static final SubLSymbol $kw44$ADD_NODE_TO_RESULT_TEST;
    private static final SubLSymbol $sym45$NOT_GENL_INVERSE_MODE_P;
    private static final SubLSymbol $kw46$ACCESSIBLE_LINK_PREDS;
    private static final SubLList $list47;
    private static final SubLSymbol $kw48$SIMPLE_NON_REFLEXIVE;
    private static final SubLSymbol $kw49$INVERTS_ARGUMENTS_OF_MODULE;
    private static final SubLObject $const50$negationInverse;
    private static final SubLSymbol $sym51$GENL_INVERSE_MODE_P;
    private static final SubLList $list52;
    private static final SubLList $list53;
    private static final SubLList $list54;
    private static final SubLObject $const55$incompatibleMt;
    private static final SubLObject $const56$weak_HL_TimePrecedence;
    private static final SubLSymbol $kw57$MODULE_TAG;
    private static final SubLSymbol $kw58$WEAK;
    private static final SubLSymbol $kw59$TIME;
    private static final SubLSymbol $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P;
    private static final SubLSymbol $sym61$INCREMENT_SBHL_MARKING_STATE_BY_ZERO;
    private static final SubLSymbol $kw62$MARKING_INCREMENT;
    private static final SubLSymbol $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P;
    private static final SubLList $list64;
    private static final SubLObject $const65$weakSuccessor_HL_TimePrecedence;
    private static final SubLSymbol $kw66$WEAK_SUCCESSOR;
    private static final SubLSymbol $sym67$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE;
    private static final SubLObject $const68$strict_HL_TimePrecedence;
    private static final SubLSymbol $kw69$STRICT;
    private static final SubLSymbol $sym70$INCREMENT_SBHL_MARKING_STATE_BY_ONE;
    private static final SubLObject $const71$successorStrict_HL_TimePrecedence;
    private static final SubLSymbol $kw72$SUCCESSOR_STRICT;
    private static final SubLSymbol $sym73$INCREMENT_SBHL_MARKING_STATE_BY_TWO;
    private static final SubLSymbol $sym74$_SBHL_MODULES_INITIALIZED__;
    private static final SubLSymbol $kw75$SBHL_GRAPH;
    private static final SubLSymbol $kw76$GRAPH;
    private static final SubLList $list77;
    private static final SubLString $str78$sbhl_module__A__graph__A__tt_modu;
    private static final SubLString $str79$missing;
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 555L)
    public static SubLObject initialize_genls_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const0$genls, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const0$genls), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw4$NAUT_FORWARD_TRUE_GENERATORS, (SubLObject)sbhl_module_declarations.$list5), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw7$SIMPLE_REFLEXIVE), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym9$COLLECTION_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw10$DISJOINS_MODULE, sbhl_module_declarations.$const11$disjointWith), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw18$ROOT, sbhl_module_declarations.$const19$Thing), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 1298L)
    public static SubLObject initialize_disjoint_with_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const11$disjointWith, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const11$disjointWith), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const21$Multigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw22$DISJOINS), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym9$COLLECTION_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const0$genls), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 1920L)
    public static SubLObject initialize_isa_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const25$isa, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const25$isa), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw4$NAUT_FORWARD_TRUE_GENERATORS, (SubLObject)sbhl_module_declarations.$list26), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw27$TRANSFERS_THROUGH), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const0$genls), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.TWO_INTEGER) }));
        sbhl_link_methods.initialize_isa_arg2_naut_table();
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 2726L)
    public static SubLObject initialize_quoted_isa_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const28$quotedIsa, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const28$quotedIsa), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw4$NAUT_FORWARD_TRUE_GENERATORS, (SubLObject)sbhl_module_declarations.$list29), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw27$TRANSFERS_THROUGH), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const0$genls), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.TWO_INTEGER) }));
        sbhl_link_methods.initialize_quoted_isa_arg2_naut_table();
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 3443L)
    public static SubLObject initialize_genl_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const30$genlMt, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const30$genlMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw4$NAUT_FORWARD_TRUE_GENERATORS, (SubLObject)sbhl_module_declarations.$list31), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw7$SIMPLE_REFLEXIVE), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym32$MICROTHEORY_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw10$DISJOINS_MODULE, sbhl_module_declarations.$const33$intensionallyIncompatibleMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw18$ROOT, mt_vars.$mt_root$.getGlobalValue()), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 4126L)
    public static SubLObject initialize_negation_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const34$negationMt, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const34$negationMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const21$Multigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw22$DISJOINS), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym32$MICROTHEORY_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const30$genlMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 4739L)
    public static SubLObject initialize_genl_preds_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const35$genlPreds, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const35$genlPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw7$SIMPLE_REFLEXIVE), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym36$PREDICATE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw10$DISJOINS_MODULE, sbhl_module_declarations.$const37$negationPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw38$MODULE_INVERTS_ARGUMENTS, sbhl_module_declarations.$const39$genlInverse), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym40$SBHL_PREDICATE_PATH_TERMINATION_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym41$SBHL_PREDICATE_MARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym42$SBHL_PREDICATE_UNMARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw43$PREDICATE_SEARCH_P, (SubLObject)sbhl_module_declarations.T), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym45$NOT_GENL_INVERSE_MODE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list47), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 5647L)
    public static SubLObject initialize_genl_inverse_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const39$genlInverse, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const39$genlInverse), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw48$SIMPLE_NON_REFLEXIVE), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym36$PREDICATE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw49$INVERTS_ARGUMENTS_OF_MODULE, sbhl_module_declarations.$const35$genlPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw10$DISJOINS_MODULE, sbhl_module_declarations.$const50$negationInverse), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym40$SBHL_PREDICATE_PATH_TERMINATION_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym41$SBHL_PREDICATE_MARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym42$SBHL_PREDICATE_UNMARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw43$PREDICATE_SEARCH_P, (SubLObject)sbhl_module_declarations.T), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym51$GENL_INVERSE_MODE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list52), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 6464L)
    public static SubLObject initialize_negation_preds_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const37$negationPreds, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const37$negationPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const21$Multigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw22$DISJOINS), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym36$PREDICATE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw38$MODULE_INVERTS_ARGUMENTS, sbhl_module_declarations.$const50$negationInverse), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym40$SBHL_PREDICATE_PATH_TERMINATION_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym41$SBHL_PREDICATE_MARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym42$SBHL_PREDICATE_UNMARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw43$PREDICATE_SEARCH_P, (SubLObject)sbhl_module_declarations.T), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym45$NOT_GENL_INVERSE_MODE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list53), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const35$genlPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 7323L)
    public static SubLObject initialize_negation_inverse_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const50$negationInverse, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const50$negationInverse), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const21$Multigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw22$DISJOINS), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym36$PREDICATE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw49$INVERTS_ARGUMENTS_OF_MODULE, sbhl_module_declarations.$const37$negationPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym40$SBHL_PREDICATE_PATH_TERMINATION_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym41$SBHL_PREDICATE_MARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym42$SBHL_PREDICATE_UNMARKING_FN), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw43$PREDICATE_SEARCH_P, (SubLObject)sbhl_module_declarations.T), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym51$GENL_INVERSE_MODE_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list54), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const35$genlPreds), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 8193L)
    public static SubLObject initialize_incompatible_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const55$incompatibleMt, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const55$incompatibleMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const21$Multigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw22$DISJOINS), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym32$MICROTHEORY_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const30$genlMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 8829L)
    public static SubLObject initialize_intensionally_incompatible_mt_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const33$intensionallyIncompatibleMt, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const33$intensionallyIncompatibleMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const21$Multigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw22$DISJOINS), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw8$TYPE_TEST, (SubLObject)sbhl_module_declarations.$sym32$MICROTHEORY_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym13$SBHL_MARKED_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym15$SET_SBHL_MARKING_STATE_TO_MARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw23$TRANSFERS_THROUGH_MODULE, sbhl_module_declarations.$const30$genlMt), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw24$TRANSFERS_VIA_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
    public static SubLObject initialize_weak_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const56$weak_HL_TimePrecedence, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const56$weak_HL_TimePrecedence), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw57$MODULE_TAG, (SubLObject)sbhl_module_declarations.$kw58$WEAK), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw59$TIME), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym61$INCREMENT_SBHL_MARKING_STATE_BY_ZERO), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw62$MARKING_INCREMENT, (SubLObject)sbhl_module_declarations.ZERO_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list64), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
    public static SubLObject initialize_weak_successor_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const65$weakSuccessor_HL_TimePrecedence, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const65$weakSuccessor_HL_TimePrecedence), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw57$MODULE_TAG, (SubLObject)sbhl_module_declarations.$kw66$WEAK_SUCCESSOR), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw59$TIME), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym67$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw62$MARKING_INCREMENT, (SubLObject)sbhl_module_declarations.MINUS_ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list64), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
    public static SubLObject initialize_strict_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const68$strict_HL_TimePrecedence, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const68$strict_HL_TimePrecedence), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw57$MODULE_TAG, (SubLObject)sbhl_module_declarations.$kw69$STRICT), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw59$TIME), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym70$INCREMENT_SBHL_MARKING_STATE_BY_ONE), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw62$MARKING_INCREMENT, (SubLObject)sbhl_module_declarations.ONE_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list64), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 9425L)
    public static SubLObject initialize_successor_strict_precedence_module() {
        sbhl_module_utilities.init_sbhl_module_data(sbhl_module_declarations.$const71$successorStrict_HL_TimePrecedence, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)sbhl_module_declarations.$kw1$LINK_PRED, sbhl_module_declarations.$const71$successorStrict_HL_TimePrecedence), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw57$MODULE_TAG, (SubLObject)sbhl_module_declarations.$kw72$SUCCESSOR_STRICT), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw2$LINK_STYLE, sbhl_module_declarations.$const3$DirectedMultigraph), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw6$MODULE_TYPE, (SubLObject)sbhl_module_declarations.$kw59$TIME), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw12$PATH_TERMINATING_MARK__FN, (SubLObject)sbhl_module_declarations.$sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw14$MARKING_FN, (SubLObject)sbhl_module_declarations.$sym73$INCREMENT_SBHL_MARKING_STATE_BY_TWO), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw16$UNMARKING_FN, (SubLObject)sbhl_module_declarations.$sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw62$MARKING_INCREMENT, (SubLObject)sbhl_module_declarations.TWO_INTEGER), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw44$ADD_NODE_TO_RESULT_TEST, (SubLObject)sbhl_module_declarations.$sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw46$ACCESSIBLE_LINK_PREDS, (SubLObject)sbhl_module_declarations.$list64), ConsesLow.list((SubLObject)sbhl_module_declarations.$kw20$INDEX_ARG, (SubLObject)sbhl_module_declarations.ONE_INTEGER) }));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13230L)
    public static SubLObject sbhl_modules_initializedP() {
        return sbhl_module_declarations.$sbhl_modules_initializedP$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13315L)
    public static SubLObject note_sbhl_modules_initialized() {
        sbhl_module_declarations.$sbhl_modules_initializedP$.setGlobalValue((SubLObject)sbhl_module_declarations.T);
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 13420L)
    public static SubLObject initialize_sbhl_modules(SubLObject forceP) {
        if (forceP == sbhl_module_declarations.UNPROVIDED) {
            forceP = (SubLObject)sbhl_module_declarations.NIL;
        }
        if (sbhl_module_declarations.NIL != forceP || sbhl_module_declarations.NIL == sbhl_modules_initializedP()) {
            sbhl_module_vars.reset_sbhl_modules();
            initialize_genls_module();
            initialize_disjoint_with_module();
            initialize_isa_module();
            initialize_quoted_isa_module();
            initialize_genl_mt_module();
            initialize_intensionally_incompatible_mt_module();
            initialize_incompatible_mt_module();
            initialize_genl_preds_module();
            initialize_genl_inverse_module();
            initialize_negation_preds_module();
            initialize_negation_inverse_module();
            initialize_weak_precedence_module();
            initialize_weak_successor_precedence_module();
            initialize_strict_precedence_module();
            initialize_successor_strict_precedence_module();
            note_sbhl_modules_initialized();
        }
        else {
            sbhl_module_vars.check_sbhl_modules_store_for_legacy_format();
        }
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 14542L)
    public static SubLObject convert_legacy_sbhl_modules_to_structs(SubLObject forceP) {
        if (forceP == sbhl_module_declarations.UNPROVIDED) {
            forceP = (SubLObject)sbhl_module_declarations.NIL;
        }
        final SubLObject sbhl_graph_dictionary = dictionary.new_dictionary((SubLObject)sbhl_module_declarations.UNPROVIDED, (SubLObject)sbhl_module_declarations.UNPROVIDED);
        SubLObject cdolist_list_var = sbhl_module_utilities.get_sbhl_predicates();
        SubLObject pred = (SubLObject)sbhl_module_declarations.NIL;
        pred = cdolist_list_var.first();
        while (sbhl_module_declarations.NIL != cdolist_list_var) {
            final SubLObject legacy_module = sbhl_module_vars.get_sbhl_module(pred);
            if (sbhl_module_declarations.NIL != dictionary.dictionary_p(legacy_module)) {
                dictionary.dictionary_enter(sbhl_graph_dictionary, pred, dictionary.dictionary_lookup(legacy_module, (SubLObject)sbhl_module_declarations.$kw75$SBHL_GRAPH, (SubLObject)sbhl_module_declarations.UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        }
        if (sbhl_module_declarations.NIL == dictionary.dictionary_empty_p(sbhl_graph_dictionary) || sbhl_module_declarations.NIL != forceP) {
            initialize_sbhl_modules((SubLObject)sbhl_module_declarations.T);
            cdolist_list_var = dictionary.dictionary_keys(sbhl_graph_dictionary);
            pred = (SubLObject)sbhl_module_declarations.NIL;
            pred = cdolist_list_var.first();
            while (sbhl_module_declarations.NIL != cdolist_list_var) {
                final SubLObject module = sbhl_module_vars.get_sbhl_module(pred);
                final SubLObject v_graph = dictionary.dictionary_lookup(sbhl_graph_dictionary, pred, (SubLObject)sbhl_module_declarations.UNPROVIDED);
                if (sbhl_module_declarations.NIL != sbhl_module_vars.sbhl_module_p(module) && sbhl_module_declarations.NIL == dictionary.dictionary_p(module)) {
                    sbhl_module_vars.set_sbhl_module_property(module, (SubLObject)sbhl_module_declarations.$kw76$GRAPH, v_graph);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            }
        }
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sbhl/sbhl-module-declarations.lisp", position = 15802L)
    public static SubLObject verify_sbhl_modules(SubLObject auto_correctP) {
        if (auto_correctP == sbhl_module_declarations.UNPROVIDED) {
            auto_correctP = (SubLObject)sbhl_module_declarations.NIL;
        }
        SubLObject cdolist_list_var = sbhl_module_vars.get_sbhl_modules();
        SubLObject cons = (SubLObject)sbhl_module_declarations.NIL;
        cons = cdolist_list_var.first();
        while (sbhl_module_declarations.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)sbhl_module_declarations.NIL;
            SubLObject module = (SubLObject)sbhl_module_declarations.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sbhl_module_declarations.$list77);
            key = current.first();
            current = (module = current.rest());
            PrintLow.format((SubLObject)sbhl_module_declarations.T, (SubLObject)sbhl_module_declarations.$str78$sbhl_module__A__graph__A__tt_modu, new SubLObject[] { sbhl_module_utilities.get_sbhl_link_pred(module), sbhl_module_vars.get_sbhl_module_graph(module).isHashtable() ? Hashtables.hash_table_count(sbhl_module_vars.get_sbhl_module_graph(module)) : sbhl_module_declarations.$str79$missing, sbhl_module_utilities.get_sbhl_transfers_through_module(module) });
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    public static SubLObject declare_sbhl_module_declarations_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_genls_module", "INITIALIZE-GENLS-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_disjoint_with_module", "INITIALIZE-DISJOINT-WITH-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_isa_module", "INITIALIZE-ISA-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_quoted_isa_module", "INITIALIZE-QUOTED-ISA-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_genl_mt_module", "INITIALIZE-GENL-MT-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_negation_mt_module", "INITIALIZE-NEGATION-MT-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_genl_preds_module", "INITIALIZE-GENL-PREDS-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_genl_inverse_module", "INITIALIZE-GENL-INVERSE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_negation_preds_module", "INITIALIZE-NEGATION-PREDS-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_negation_inverse_module", "INITIALIZE-NEGATION-INVERSE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_incompatible_mt_module", "INITIALIZE-INCOMPATIBLE-MT-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_intensionally_incompatible_mt_module", "INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_weak_precedence_module", "INITIALIZE-WEAK-PRECEDENCE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_weak_successor_precedence_module", "INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_strict_precedence_module", "INITIALIZE-STRICT-PRECEDENCE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_successor_strict_precedence_module", "INITIALIZE-SUCCESSOR-STRICT-PRECEDENCE-MODULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "sbhl_modules_initializedP", "SBHL-MODULES-INITIALIZED?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "note_sbhl_modules_initialized", "NOTE-SBHL-MODULES-INITIALIZED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "initialize_sbhl_modules", "INITIALIZE-SBHL-MODULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "convert_legacy_sbhl_modules_to_structs", "CONVERT-LEGACY-SBHL-MODULES-TO-STRUCTS", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations", "verify_sbhl_modules", "VERIFY-SBHL-MODULES", 0, 1, false);
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    public static SubLObject init_sbhl_module_declarations_file() {
        sbhl_module_declarations.$sbhl_modules_initializedP$ = SubLFiles.deflexical("*SBHL-MODULES-INITIALIZED?*", (SubLObject)(maybeDefault((SubLObject)sbhl_module_declarations.$sym74$_SBHL_MODULES_INITIALIZED__, sbhl_module_declarations.$sbhl_modules_initializedP$, sbhl_module_declarations.NIL)));
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    public static SubLObject setup_sbhl_module_declarations_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)sbhl_module_declarations.$sym74$_SBHL_MODULES_INITIALIZED__);
        return (SubLObject)sbhl_module_declarations.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sbhl_module_declarations_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sbhl_module_declarations_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sbhl_module_declarations_file();
    }
    
    static {
        me = (SubLFile)new sbhl_module_declarations();
        sbhl_module_declarations.$sbhl_modules_initializedP$ = null;
        $const0$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $kw1$LINK_PRED = SubLObjectFactory.makeKeyword("LINK-PRED");
        $kw2$LINK_STYLE = SubLObjectFactory.makeKeyword("LINK-STYLE");
        $const3$DirectedMultigraph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DirectedMultigraph"));
        $kw4$NAUT_FORWARD_TRUE_GENERATORS = SubLObjectFactory.makeKeyword("NAUT-FORWARD-TRUE-GENERATORS");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-RESULT-GENL"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-GENL-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-GENL"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-GENL-RELN"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-GENL-VIA-ARG-ARG-GENL"));
        $kw6$MODULE_TYPE = SubLObjectFactory.makeKeyword("MODULE-TYPE");
        $kw7$SIMPLE_REFLEXIVE = SubLObjectFactory.makeKeyword("SIMPLE-REFLEXIVE");
        $kw8$TYPE_TEST = SubLObjectFactory.makeKeyword("TYPE-TEST");
        $sym9$COLLECTION_P = SubLObjectFactory.makeSymbol("COLLECTION-P");
        $kw10$DISJOINS_MODULE = SubLObjectFactory.makeKeyword("DISJOINS-MODULE");
        $const11$disjointWith = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disjointWith"));
        $kw12$PATH_TERMINATING_MARK__FN = SubLObjectFactory.makeKeyword("PATH-TERMINATING-MARK?-FN");
        $sym13$SBHL_MARKED_P = SubLObjectFactory.makeSymbol("SBHL-MARKED-P");
        $kw14$MARKING_FN = SubLObjectFactory.makeKeyword("MARKING-FN");
        $sym15$SET_SBHL_MARKING_STATE_TO_MARKED = SubLObjectFactory.makeSymbol("SET-SBHL-MARKING-STATE-TO-MARKED");
        $kw16$UNMARKING_FN = SubLObjectFactory.makeKeyword("UNMARKING-FN");
        $sym17$SET_SBHL_MARKING_STATE_TO_UNMARKED = SubLObjectFactory.makeSymbol("SET-SBHL-MARKING-STATE-TO-UNMARKED");
        $kw18$ROOT = SubLObjectFactory.makeKeyword("ROOT");
        $const19$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $kw20$INDEX_ARG = SubLObjectFactory.makeKeyword("INDEX-ARG");
        $const21$Multigraph = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Multigraph"));
        $kw22$DISJOINS = SubLObjectFactory.makeKeyword("DISJOINS");
        $kw23$TRANSFERS_THROUGH_MODULE = SubLObjectFactory.makeKeyword("TRANSFERS-THROUGH-MODULE");
        $kw24$TRANSFERS_VIA_ARG = SubLObjectFactory.makeKeyword("TRANSFERS-VIA-ARG");
        $const25$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-RESULT-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-ISA-ARGS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-INTER-ARG-ISA-RELN"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-ISA-VIA-ARG-ARG-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-ISA-ARG-ISAS"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-ISA-WHEN-ARG-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("RESULT-ISA-VIA-CLOSED-UNDER"));
        $kw27$TRANSFERS_THROUGH = SubLObjectFactory.makeKeyword("TRANSFERS-THROUGH");
        $const28$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $list29 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-EVALUATION-RESULT-QUOTED-ISA"), (SubLObject)SubLObjectFactory.makeSymbol("SBHL-RESULT-QUOTED-ISA"));
        $const30$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SBHL-NAUT-FORWARD-GENL-MTS"));
        $sym32$MICROTHEORY_P = SubLObjectFactory.makeSymbol("MICROTHEORY-P");
        $const33$intensionallyIncompatibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("intensionallyIncompatibleMt"));
        $const34$negationMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationMt"));
        $const35$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $sym36$PREDICATE_P = SubLObjectFactory.makeSymbol("PREDICATE-P");
        $const37$negationPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds"));
        $kw38$MODULE_INVERTS_ARGUMENTS = SubLObjectFactory.makeKeyword("MODULE-INVERTS-ARGUMENTS");
        $const39$genlInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse"));
        $sym40$SBHL_PREDICATE_PATH_TERMINATION_P = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-PATH-TERMINATION-P");
        $sym41$SBHL_PREDICATE_MARKING_FN = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-MARKING-FN");
        $sym42$SBHL_PREDICATE_UNMARKING_FN = SubLObjectFactory.makeSymbol("SBHL-PREDICATE-UNMARKING-FN");
        $kw43$PREDICATE_SEARCH_P = SubLObjectFactory.makeKeyword("PREDICATE-SEARCH-P");
        $kw44$ADD_NODE_TO_RESULT_TEST = SubLObjectFactory.makeKeyword("ADD-NODE-TO-RESULT-TEST");
        $sym45$NOT_GENL_INVERSE_MODE_P = SubLObjectFactory.makeSymbol("NOT-GENL-INVERSE-MODE-P");
        $kw46$ACCESSIBLE_LINK_PREDS = SubLObjectFactory.makeKeyword("ACCESSIBLE-LINK-PREDS");
        $list47 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")));
        $kw48$SIMPLE_NON_REFLEXIVE = SubLObjectFactory.makeKeyword("SIMPLE-NON-REFLEXIVE");
        $kw49$INVERTS_ARGUMENTS_OF_MODULE = SubLObjectFactory.makeKeyword("INVERTS-ARGUMENTS-OF-MODULE");
        $const50$negationInverse = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse"));
        $sym51$GENL_INVERSE_MODE_P = SubLObjectFactory.makeSymbol("GENL-INVERSE-MODE-P");
        $list52 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")));
        $list53 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")));
        $list54 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationInverse")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("negationPreds")));
        $const55$incompatibleMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("incompatibleMt"));
        $const56$weak_HL_TimePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence"));
        $kw57$MODULE_TAG = SubLObjectFactory.makeKeyword("MODULE-TAG");
        $kw58$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $kw59$TIME = SubLObjectFactory.makeKeyword("TIME");
        $sym60$SBHL_NODES_MARK_EXCEEDS_TEMPORAL_THRESHOLD_P = SubLObjectFactory.makeSymbol("SBHL-NODES-MARK-EXCEEDS-TEMPORAL-THRESHOLD-P");
        $sym61$INCREMENT_SBHL_MARKING_STATE_BY_ZERO = SubLObjectFactory.makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ZERO");
        $kw62$MARKING_INCREMENT = SubLObjectFactory.makeKeyword("MARKING-INCREMENT");
        $sym63$SBHL_NODE_VALID_FOR_TEMPORAL_SEARCH_RESULT_P = SubLObjectFactory.makeSymbol("SBHL-NODE-VALID-FOR-TEMPORAL-SEARCH-RESULT-P");
        $list64 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("successorStrict-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strict-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weak-HL-TimePrecedence")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weakSuccessor-HL-TimePrecedence")));
        $const65$weakSuccessor_HL_TimePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("weakSuccessor-HL-TimePrecedence"));
        $kw66$WEAK_SUCCESSOR = SubLObjectFactory.makeKeyword("WEAK-SUCCESSOR");
        $sym67$INCREMENT_SBHL_MARKING_STATE_BY_MINUS_ONE = SubLObjectFactory.makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-MINUS-ONE");
        $const68$strict_HL_TimePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strict-HL-TimePrecedence"));
        $kw69$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $sym70$INCREMENT_SBHL_MARKING_STATE_BY_ONE = SubLObjectFactory.makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-ONE");
        $const71$successorStrict_HL_TimePrecedence = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("successorStrict-HL-TimePrecedence"));
        $kw72$SUCCESSOR_STRICT = SubLObjectFactory.makeKeyword("SUCCESSOR-STRICT");
        $sym73$INCREMENT_SBHL_MARKING_STATE_BY_TWO = SubLObjectFactory.makeSymbol("INCREMENT-SBHL-MARKING-STATE-BY-TWO");
        $sym74$_SBHL_MODULES_INITIALIZED__ = SubLObjectFactory.makeSymbol("*SBHL-MODULES-INITIALIZED?*");
        $kw75$SBHL_GRAPH = SubLObjectFactory.makeKeyword("SBHL-GRAPH");
        $kw76$GRAPH = SubLObjectFactory.makeKeyword("GRAPH");
        $list77 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MODULE"));
        $str78$sbhl_module__A__graph__A__tt_modu = SubLObjectFactory.makeString("sbhl-module ~A: graph=~A  tt-module=~A~%");
        $str79$missing = SubLObjectFactory.makeString("missing");
    }
}

/*

	Total time: 136 ms
	
*/
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class cyclifier_interface extends SubLTranslatedFile {
    public static final SubLFile me = new cyclifier_interface();

    public static final String myName = "com.cyc.cycjava.cycl.cyclifier_interface";

    public static final String myFingerPrint = "8fb7014bce55611a8fcb7f12252da615772db2c07da1e2b1ca52892963aeb11a";

    // defparameter
    // Definitions
    public static final SubLSymbol $cyclification_in_progress$ = makeSymbol("*CYCLIFICATION-IN-PROGRESS*");

    // defparameter
    // list of things that have already been completely cyclified
    public static final SubLSymbol $cyclification_complete$ = makeSymbol("*CYCLIFICATION-COMPLETE*");

    // defparameter
    public static final SubLSymbol $allow_duplicate_cyclificationsP$ = makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*");

    // defparameter
    private static final SubLSymbol $context_keyword_equivalence$ = makeSymbol("*CONTEXT-KEYWORD-EQUIVALENCE*");



    public static final SubLList $list1 = list(makeSymbol("MEMBER?"), makeSymbol("SELF"), makeSymbol("*CYCLIFICATION-IN-PROGRESS*"), list(makeSymbol("QUOTE"), EQ));



    public static final SubLList $list3 = list(list(makeSymbol("*CYCLIFICATION-IN-PROGRESS*"), list(makeSymbol("CONS"), makeSymbol("SELF"), makeSymbol("*CYCLIFICATION-IN-PROGRESS*"))));



    public static final SubLList $list5 = list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("*ALLOW-DUPLICATE-CYCLIFICATIONS?*")), list(makeSymbol("MEMBER"), makeSymbol("SELF"), makeSymbol("*CYCLIFICATION-COMPLETE*"), list(makeSymbol("QUOTE"), EQ)));

    public static final SubLList $list6 = list(makeSymbol("CPUSH"), makeSymbol("SELF"), makeSymbol("*CYCLIFICATION-COMPLETE*"));

    public static final SubLSymbol CYCLIFIABLE = makeSymbol("CYCLIFIABLE");

    public static final SubLList $list8 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CYCLIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFIABLE-QUESTION-P"), NIL, makeKeyword("PUBLIC")));



    public static final SubLList $list10 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list11 = list(makeSymbol("&OPTIONAL"), makeSymbol("PROPERTIES"));

    public static final SubLList $list12 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYCLIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CYCLIFIER")), makeSymbol("PROPERTIES"))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("WHILE"), list(makeSymbol("FIM"), makeSymbol("CYCLIFIER"), list(makeSymbol("QUOTE"), makeSymbol("HAS-NEXT?"))), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("CYCLIFIER"), list(makeSymbol("QUOTE"), makeSymbol("NEXT"))), makeSymbol("CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("NREVERSE"), makeSymbol("CYCLS")))));



    public static final SubLList $list14 = list(list(new SubLObject[]{ makeSymbol("CDESTRUCTURING-BIND"), list(new SubLObject[]{ makeSymbol("&KEY"), list(makeSymbol("LEXICON"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFIER-LEXICON")))), list(makeSymbol("SCORE-FUNCTION"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFICATION-SCORE"))), list(makeSymbol("OUTPUT"), makeKeyword("BRIEF")), list(makeSymbol("WFF-CHECK?"), T), makeSymbol("CONTEXT"), list(makeSymbol("DISAMBIGUATOR"), NIL), list(makeSymbol("COREFERENCE-RESOLVER"), NIL), list(makeSymbol("ERROR-HANDLING"), makeKeyword("THROW")), list(makeSymbol("SUBCYCLIFIER-POOL"), list(makeSymbol("NEW-CYCLIFIER-POOL"), list(makeSymbol("LIST"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("DATE-CYCLIFIER")))))), makeSymbol("&ALLOW-OTHER-KEYS") }), makeSymbol("PROPERTIES"), list(makeSymbol("CHECK-TYPE"), makeSymbol("LEXICON"), makeSymbol("CYCLIFIER-LEXICON-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("SCORE-FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("OUTPUT"), makeSymbol("KEYWORDP")), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("CONTEXT"), makeSymbol("PARSE-TREE-CONTEXT-P")), list(makeSymbol("CHECK-TYPE"), makeSymbol("WFF-CHECK?"), makeSymbol("BOOLEANP")), list(makeSymbol("MUST"), list(makeSymbol("MEMBER"), makeSymbol("ERROR-HANDLING"), list(makeSymbol("QUOTE"), list(makeKeyword("THROW"), makeKeyword("WARN"), makeKeyword("IGNORE")))), makeString("Invalid error-handling tag ~a"), makeSymbol("ERROR-HANDLING")), list(makeSymbol("CHECK-TYPE-IF-PRESENT"), makeSymbol("SUBCYCLIFIER-POOL"), makeSymbol("CYCLIFIER-POOL-P")), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CYCLIFIER"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFIER"))))), list(makeSymbol("SET-CYCLIFIER-SCORE-FUNCTION"), makeSymbol("CYCLIFIER"), makeSymbol("SCORE-FUNCTION")), list(makeSymbol("SET-CYCLIFIER-OUTPUT"), makeSymbol("CYCLIFIER"), makeSymbol("OUTPUT")), list(makeSymbol("SET-CYCLIFIER-ERROR-HANDLING"), makeSymbol("CYCLIFIER"), makeSymbol("ERROR-HANDLING")), list(makeSymbol("SET-CYCLIFIER-SUBCYCLIFIER-POOL"), makeSymbol("CYCLIFIER"), makeSymbol("SUBCYCLIFIER-POOL")), list(makeSymbol("PWHEN"), makeSymbol("LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("LEXIFY")), makeSymbol("LEXICON"))), list(makeSymbol("PWHEN"), makeSymbol("DISAMBIGUATOR"), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("CONTEXT")), list(makeSymbol("CSETQ"), makeSymbol("CONTEXT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(makeSymbol("QUOTE"), makeSymbol("PARSE-TREE-CONTEXT"))))), list(makeSymbol("FIM"), makeSymbol("DISAMBIGUATOR"), list(makeSymbol("QUOTE"), makeSymbol("DISAMBIGUATE")), makeSymbol("SELF"), makeSymbol("CONTEXT"))), list(makeSymbol("IGNORE"), makeSymbol("COREFERENCE-RESOLVER")), list(makeSymbol("SET-CYCLIFIER-TREE"), makeSymbol("CYCLIFIER"), makeSymbol("SELF")), list(makeSymbol("SET-CYCLIFIER-WFF-CHECK?"), makeSymbol("CYCLIFIER"), makeSymbol("WFF-CHECK?")), list(makeSymbol("PWHEN"), makeSymbol("WFF-CHECK?"), list(makeSymbol("SET-CYCLIFIER-MEMOIZATION-STATE"), makeSymbol("CYCLIFIER"), list(makeSymbol("NEW-MEMOIZATION-STATE"))), list(makeSymbol("SET-CYCLIFIER-SBHL-RESOURCE"), makeSymbol("CYCLIFIER"), list(makeSymbol("NEW-SBHL-MARKING-SPACE-RESOURCE"), TEN_INTEGER))), list(makeSymbol("RET"), makeSymbol("CYCLIFIER")) }) }));

    public static final SubLSymbol PARSE_TREE_INTERFACE = makeSymbol("PARSE-TREE-INTERFACE");

    public static final SubLList $list16 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SISTER"), list(makeSymbol("I"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DAUGHTER"), list(makeSymbol("I"))));

    public static final SubLSymbol CYCLIFIABLE_PHRASE = makeSymbol("CYCLIFIABLE-PHRASE");

    public static final SubLList $list18 = list(makeSymbol("CYCLIFIABLE"));

    public static final SubLList $list19 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYCLIFIABLE")));

    public static final SubLSymbol CYCLIFIABLE_NOUN_PHRASE = makeSymbol("CYCLIFIABLE-NOUN-PHRASE");

    public static final SubLList $list21 = list(makeSymbol("CYCLIFIABLE-PHRASE"));

    public static final SubLList $list22 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYCLIFIABLE-PHRASE")));



    public static final SubLList $list24 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VP-COORDINATE-PHRASE-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT-VP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT-VP-COORDINATION"), NIL, makeKeyword("PROTECTED")));



    public static final SubLList $list26 = list(makeKeyword("PROTECED"));

    public static final SubLList $list27 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONJUNCTION"))))), list(makeSymbol("RET"), list(makeSymbol("CAND"), makeSymbol("CONJUNCTION"), list(makeSymbol("CNOT"), list(makeSymbol("MEMBER-IF-NOT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFIABLE-VERB-PHRASE-P")), list(makeSymbol("FIM"), makeSymbol("CONJUNCTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))))))));







    public static final SubLList $list31 = list(makeSymbol("LIST"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("QUOTE"), EQL))));

    public static final SubLList $list32 = list(makeSymbol("QUOTE"), EQL);



    public static final SubLSymbol ALIST_PUSHNEW = makeSymbol("ALIST-PUSHNEW");







    public static final SubLList $list38 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list39 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("CLET"), list(list(makeSymbol("HEADS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEADS")))), list(makeSymbol("ALL-CONJUNCTION-CYCLS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("COMPLEMENTS"), list(makeSymbol("FWHEN"), makeSymbol("HEADS"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), makeSymbol("HEADS")), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), list(makeSymbol("COMP-CYCLS"), NIL), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENTS"), list(makeSymbol("DELETE-CYCLIFIABLE"), makeSymbol("SUBJECT"), makeSymbol("COMPLEMENTS"))), list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("*CYCLIFICATION-IN-PROGRESS*"), list(makeSymbol("APPEND"), makeSymbol("HEADS"), makeSymbol("*CYCLIFICATION-IN-PROGRESS*")))), list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), makeSymbol("HEADS")), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-HEAD-CYCLS"), NIL), list(makeSymbol("MOD-CYCLS"), list(makeSymbol("GET-MOD-CYCLS"), makeSymbol("HEAD"))), list(makeSymbol("RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CONJUNCTION"), makeSymbol("RENAMINGS")), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-RLE-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPOSITE-VERBAL-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("CONJUNCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("RENAMED0"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("HEAD"), makeSymbol("RLE"), makeSymbol("RENAMING"))), list(makeSymbol("RENAMED"), list(makeSymbol("FWHEN"), makeSymbol("RENAMED0"), list(makeSymbol("LIST"), list(makeSymbol("QUANTIFY-IMPLICIT-SUBJECT"), makeSymbol("RENAMED0")))))), list(makeSymbol("ALIST-CPUSHNEW"), makeSymbol("COMPOSITE-VERBAL-CYCLS"), list(makeSymbol("RENAMING-KEY"), makeSymbol("RENAMING")), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("RENAMED"), makeSymbol("MOD-CYCLS"))))))), list(makeSymbol("CLET"), list(list(makeSymbol("SENSE-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("VALUE"), list(makeSymbol("ALIST-VALUES"), makeSymbol("COMPOSITE-VERBAL-CYCLS"))), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("VALUE"))), makeSymbol("SENSE-CYCLS"))), list(makeSymbol("CPUSH"), makeSymbol("SENSE-CYCLS"), makeSymbol("ALL-RLE-CYCLS"))))), list(makeSymbol("CPUSH"), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-RLE-CYCLS")), makeSymbol("ALL-HEAD-CYCLS")))), list(makeSymbol("CPUSH"), makeSymbol("ALL-HEAD-CYCLS"), makeSymbol("ALL-CONJUNCTION-CYCLS")))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("COMP-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("ALL-HEAD-CYCLS"), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-CONJUNCTION-CYCLS"))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS0"), NIL), list(makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM"), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-HEAD-CYCLS"))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("ITEM2"), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("ITEM"))), list(makeSymbol("CSETQ"), makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), list(makeSymbol("APPEND"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ITEM2"))), makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT")))), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("COMPLETE-CYCL-FOR-ONE-SUBJECT"), makeSymbol("COMP-CYCLS")))), makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS")))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS0"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("ALL-SUBJECTS-WITH-OBJECTS-CYCLS")))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS0"), makeSymbol("CYCLS"))))))), list(makeSymbol("RET"), makeSymbol("CYCLS"))));

    public static final SubLList $list40 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("PCOND"), list(list(makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE-P"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD-DTR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD-DAUGHTER"))))), list(makeSymbol("PWHEN"), makeSymbol("HEAD-DTR"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("HEAD-DTR"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))))), list(list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("VP-COORDINATE-PHRASE-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT-VP-COORDINATION"))))), list(T, list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("SUBJ-CYCLS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("VP-CYCLS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT-VP")))), list(makeSymbol("SUBJ-VP-CYCLS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJ-CYCLS"), list(makeSymbol("LIST"), makeSymbol("SUBJ-CYCLS"))))), list(makeSymbol("PWHEN"), makeSymbol("VP-CYCLS"), list(makeSymbol("CPUSH"), makeSymbol("VP-CYCLS"), makeSymbol("SUBJ-VP-CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("SUBJ-VP-CYCLS")))))))));



    public static final SubLList $list42 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SCYCLS"), list(makeSymbol("SUBCYCLIFIER-CYCLIFY"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("SCYCLS"), list(makeSymbol("RET"), makeSymbol("SCYCLS")))), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT")))), list(makeSymbol("SUBJ-CYCLS"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("CONJUNCTION"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONJUNCTION")))), list(makeSymbol("VPS"), list(makeSymbol("FIM"), makeSymbol("CONJUNCTION"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("VP"), makeSymbol("VPS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("VP"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT-VP"))), makeSymbol("CYCLS"))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("SUBJ-CYCLS"), makeSymbol("CYCLS")))))));

    public static final SubLSymbol CYCLIFIABLE_SENTENTIAL_PHRASE = makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE");

    public static final SubLList $list44 = list(makeSymbol("CYCLIFIABLE-VERB-PHRASE"));

    public static final SubLList $list45 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYCLIFIABLE-VERB-PHRASE")));

    public static final SubLSymbol CYCLIFIABLE_PREPOSITIONAL_PHRASE = makeSymbol("CYCLIFIABLE-PREPOSITIONAL-PHRASE");

    public static final SubLSymbol CYCLIFIABLE_WORD = makeSymbol("CYCLIFIABLE-WORD");

    public static final SubLList $list48 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PP-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MODIFIED-DEPENDENT-MEANING-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POS-FILTER-LEXES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TREE-KEYWORD-EQ-CLASSES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRAME-FILTER-LEXES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PP-COMP-FILTER-LEXES"), NIL, makeKeyword("PROTECTED")) });



    public static final SubLList $list50 = list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS"));

    public static final SubLList $list51 = list(list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")), list(makeSymbol("RET"), NIL));



    public static final SubLList $list53 = list(list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))));



    public static final SubLList $list55 = list(list(makeSymbol("RET"), list(makeSymbol("VALUES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))), NIL)));



    public static final SubLList $list57 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PPS")))), list(makeSymbol("CLET"), list(list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("PP-HEAD-STRING"), list(makeSymbol("FWHEN"), makeSymbol("PP-HEAD"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))))), list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD-STRING"), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("CYCL"))), list(makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME")))), list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell(makeString("PPCompFrame")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("CLET"), list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell(makeString("Preposition")))))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), makeSymbol("PP-HEAD-STRING")), list(makeSymbol("RET"), makeSymbol("PP"))))), list(list(makeSymbol("CAND"), list(makeSymbol("INTERSECTION"), list(makeSymbol("QUOTE"), list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"))), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(EQUALP, makeString("of"), makeSymbol("PP-HEAD-STRING"))), list(makeSymbol("RET"), makeSymbol("PP"))))))))));



    public static final SubLList $list59 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PP-COMPLEMENT")))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))))), list(makeSymbol("RET"), makeSymbol("OBL-OBJ"))));

    public static final SubLList $list60 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-NUCLEUS"))))));







    public static final SubLList $list64 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS"));

    public static final SubLList $list65 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NDISTR-COMP-CYCLS"), NIL), list(makeSymbol("DISTR-COMP-CYCLS"), NIL), list(makeSymbol("MOD-CYCLS"), NIL), list(makeSymbol("CYCLS"), NIL)), list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS"), list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))))), list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"), list(makeSymbol("GROUP-DISJUNCTIVE-RENAMINGS"), makeSymbol("RENAMINGS"))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NON-DISTRIBUTING"), makeSymbol("DISTRIBUTING")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("NON-DISTRIBUTING")), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("NDISTR-COMP-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("DISTRIBUTING")), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("DISTR-COMP-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIERS")))), list(makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"), list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("MOD-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CONJUNCTION"), makeSymbol("RENAMINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("MY-CYCLS0"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("GROUPING"), makeSymbol("CONJUNCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-AND-MODS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("GROUPING")), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING"))), makeSymbol("MOD-CYCLS")))), makeSymbol("THIS-AND-MODS"))), list(makeSymbol("CPUSH"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("THIS-AND-MODS"))), makeSymbol("NDISTR-COMP-CYCLS")))), makeSymbol("MY-CYCLS0")))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("MY-CYCLS0")))))))))), list(makeSymbol("RET"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS"), makeSymbol("DISTR-COMP-CYCLS")))))));

    public static final SubLSymbol MODIFIED_DEPENDENT_MEANING_P = makeSymbol("MODIFIED-DEPENDENT-MEANING-P");

    public static final SubLList $list67 = list(list(makeSymbol("CLET"), list(makeSymbol("SEMTRANS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("SEMTRANS"))), list(makeSymbol("RET"), T))), list(makeSymbol("RET"), NIL)));



    public static final SubLList $list69 = list(list(makeSymbol("RET"), list(makeSymbol("KEYWORD-EQ-CLASSES"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")))))))));



    public static final SubLList $list71 = list(list(makeKeyword("INF-COMP"), makeKeyword("CLAUSE")), list(makeKeyword("NOUN"), makeKeyword("REPLACE")), list(makeKeyword("PREP-OBJECT"), makeKeyword("POSSESSOR"), makeKeyword("POSS-COL")));





    private static final SubLObject $$ParticleFrameType = reader_make_constant_shell(makeString("ParticleFrameType"));

    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    public static final SubLList $list77 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("PCOND"), list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))), list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeDouble(0.75)), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(makeSymbol("RET"), makeSymbol("LEXES"))));



    public static final SubLList $list79 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PP-COMPLEMENT")))), list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")), list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME"))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell(makeString("PPCompFrame")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("CLET"), list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell(makeString("Preposition")))))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED"))), list(makeSymbol("RET"), makeSymbol("LEXES"))));



    public static final SubLList $list81 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("TREE-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("TREE-KEYWORD-EQ-CLASSES")))), list(makeSymbol("LEX-SCORES"), NIL), list(makeSymbol("MAX-SCORE"), makeInteger(-5))), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-SCORE"), list(makeSymbol("LEX-ENTRY-SCORE"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), makeSymbol("TREE-KEYWORDS")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeSymbol("LEX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("LEX-SCORE"), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), makeSymbol("LEX-SCORE"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE")), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(makeSymbol("RET"), makeSymbol("LEXES"))));

    public static final SubLSymbol NOMINAL_WORD = makeSymbol("NOMINAL-WORD");

    public static final SubLList $list83 = list(makeSymbol("CYCLIFIABLE-WORD"));

    public static final SubLList $list84 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYCLIFIABLE-WORD")));

    public static final SubLList $list85 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEFINITE-DESCRIPTION-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATIONAL-NOUN-P"), NIL, makeKeyword("PUBLIC")));

    public static final SubLList $list86 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER")))));

    public static final SubLList $list87 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), list(makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OVERT-QUANTIFIER")))), list(makeSymbol("QUANTIFIER"), list(makeSymbol("FWHEN"), makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER0"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("MODIFIED"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("MODIFIED"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("QUANTIFIER"), list(EQL, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), makeKeyword("CD")), list(makeSymbol("MEMBER"), makeKeyword("NUMBER"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NUMBER"), makeSymbol("QUANTIFIER")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSS-COL"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))), makeSymbol("CYCL"), makeSymbol("COL")), list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("CSETQ"), makeSymbol("COL"), list(makeSymbol("MAIN-COLLECTION"), makeSymbol("CYCL"), makeKeyword("NOUN"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), makeSymbol("COL")), makeSymbol("DISJUNCTS"))), list(makeSymbol("PUNLESS"), makeSymbol("DISJUNCTS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), reader_make_constant_shell(makeString("Thing"))), makeSymbol("DISJUNCTS")))))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));



    public static final SubLList $list89 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OVERT-QUANTIFIER"))))), list(makeSymbol("PCOND"), list(makeSymbol("QUANTIFIER"), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), list(makeSymbol("CNOT"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("the"))), makeSymbol("QUANTIFIER")))), list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SINGULAR-P")))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))), list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLURAL-P")))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))), list(list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("RET"), NIL)))));

    public static final SubLList $list90 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-QUANTIFIER")))), makeSymbol("RESULT")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("FIF"), makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-NUCLEUS"))))), list(makeSymbol("RET"), makeSymbol("RESULT")))));





    public static final SubLList $list93 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS-DISJ"));

    public static final SubLList $list94 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS"), NIL), makeSymbol("INDEPENDENT-MODS"), makeSymbol("DEPENDENT-MODS"), list(makeSymbol("COMP-MOD-CYCLS"), NIL)), list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("INDEPENDENT-MODS"), makeSymbol("DEPENDENT-MODS")), list(makeSymbol("PARTITION-MODIFIERS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIERS"))))), list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"), list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS-DISJ"), list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS-DISJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES"))))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS")))), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), makeSymbol("INDEPENDENT-MODS")), list(makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"), list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMINGS-CONJ"), makeSymbol("RENAMINGS-DISJ")), list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS-CONJ"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS-DISJ"), NIL), list(makeSymbol("TERM"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("TERM")))), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("RENAMINGS-CONJ")), list(makeSymbol("CLET"), list(list(makeSymbol("MY-CYCLS-WITH-MODS"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING")))))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), makeSymbol("DEPENDENT-MODS")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-NUCLEUS")), list(makeSymbol("UPDATE-KEYWORD-RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(makeSymbol("QUOTE"), makeSymbol("GET-KEYWORD-RENAMINGS"))), makeKeyword("REPLACE"), makeSymbol("TERM"))), makeSymbol("MY-CYCLS-WITH-MODS"))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS-DISJ"), list(makeSymbol("APPEND"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("MY-CYCLS-WITH-MODS"))), makeSymbol("CYCLS-DISJ"))))), list(makeSymbol("PWHEN"), makeSymbol("CYCLS-DISJ"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS-CONJ"), list(makeSymbol("APPEND"), makeSymbol("CYCLS-DISJ"), makeSymbol("CYCLS-CONJ")))))), list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS"), list(makeSymbol("MAPCAR"), list(makeSymbol("QUOTE"), makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS-CONJ"), makeSymbol("COMP-MOD-CYCLS"))))))))), list(makeSymbol("RET"), makeSymbol("CYCLS"))));



    public static final SubLList $list96 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-DETERMINER"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DET"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("DET"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("the"))), list(makeSymbol("RET"), T))), list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("HEAD"), list(makeSymbol("NAME-WORD-P"), makeSymbol("HEAD")), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(makeSymbol("QUOTE"), makeSymbol("SINGULAR-P")))), list(makeSymbol("RET"), T))), list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR"))))), list(makeSymbol("PWHEN"), makeSymbol("POS"), list(makeSymbol("RET"), T))));



    public static final SubLList $list98 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"), list(list(makeSymbol("DENOT"), list(makeSymbol("RENAME-VARIABLES"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("SEMTRANS")), list(makeSymbol("FRAME-RENAMING"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME"))))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("DENOT")))), list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(makeSymbol("QUOTE"), list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL")))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("KEYWORD"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQ)), list(makeSymbol("RET"), T))))));

    public static final SubLSymbol NAME_WORD = makeSymbol("NAME-WORD");

    public static final SubLList $list100 = list(makeSymbol("NOMINAL-WORD"));

    public static final SubLList $list101 = list(makeKeyword("EXTENDS"), list(makeSymbol("NOMINAL-WORD")));

    public static final SubLList $list102 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("PUBLIC")));

    public static final SubLList $list103 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OVERT-QUANTIFIER"))))), list(makeSymbol("RET"), list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("QUANTIFIER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("PLURAL-P")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))), makeSymbol("QUANTIFIER")))));

    public static final SubLSymbol VERBAL_WORD = makeSymbol("VERBAL-WORD");

    public static final SubLList $list105 = list(new SubLObject[]{ list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARTICLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTICLE-FILTER-LEXES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATRIX-CLAUSE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBJECT-CONTROLLER-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECT-CONTROLLER-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTROL-VERB-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROL-VERB"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROLLER"), NIL, makeKeyword("PROTECTED")) });

    public static final SubLList $list106 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), makeKeyword("NOUN")))));

    public static final SubLList $list107 = list(list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT")))), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CATEGORY"))), list(makeSymbol("QUOTE"), list(makeKeyword("VBN"), makeKeyword("VBG"))), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CNOT"), makeSymbol("SUBJECT"))), list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("INDIRECT-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBLIQUE-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CLET"), list(list(makeSymbol("CL-CYCLS"), list(makeSymbol("FIM"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CL-CYCL"), makeSymbol("CL-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("CL-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("CL-CYCL"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("CLAUSE"), makeSymbol("CL-CYCL")), makeSymbol("DISJUNCTS"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("INF-COMP"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("INF-COMP"), makeSymbol("CL-COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    public static final SubLList $list108 = list(list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))), list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CSETQ"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("DELETE-CYCLIFIABLE"), makeSymbol("SUBJECT"), makeSymbol("NON-DISTRIBUTING")))), list(makeSymbol("RET"), list(makeSymbol("VALUES"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("LIST"), makeSymbol("SUBJECT")))))));



    public static final SubLList $list110 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PARTICLE")))), list(makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME"))), list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell(makeString("ParticleFrameType")), reader_make_constant_shell(makeString("EverythingPSC")))), list(makeSymbol("PWHEN"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("CLET"), list(list(makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), reader_make_constant_shell(makeString("VerbParticle")))))), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("PUNLESS"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))), list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(makeSymbol("RET"), makeSymbol("LEXES"))));



    public static final SubLList $list112 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANCESTORS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("CYCLIFIABLE-SENTENTIAL-PHRASE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("ANCESTOR")))), list(makeSymbol("RET"), NIL));

    public static final SubLList $list113 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ANCESTORS")))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD"))), makeSymbol("SELF")))), list(makeSymbol("RET"), makeSymbol("ANCESTOR")))), list(makeSymbol("RET"), NIL));



    public static final SubLList $list115 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("IntransitiveSubjectControlFrame")), reader_make_constant_shell(makeString("TransitiveSubjectControlFrame")))))), list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));



    public static final SubLList $list117 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")), list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-LEXES")))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeKeyword("FRAME")), list(makeSymbol("QUOTE"), list(reader_make_constant_shell(makeString("ObjectControlFrame")))))), list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(makeSymbol("RET"), list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));



    public static final SubLList $list119 = list(list(makeSymbol("RET"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("SUBJECT-CONTROLLER-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("OBJECT-CONTROLLER-P"))))));



    public static final SubLList $list121 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MATRIX-CLAUSE")))), list(makeSymbol("MATRIX-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("MATRIX"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MATRIX-HEAD"), list(makeSymbol("FIM"), makeSymbol("MATRIX-HEAD"), list(makeSymbol("QUOTE"), makeSymbol("CONTROL-VERB-P")))), list(makeSymbol("RET"), makeSymbol("MATRIX-HEAD")))));



    public static final SubLList $list123 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONTROL-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-CONTROL-VERB"))))), list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("CONTROL-VERB")), list(makeSymbol("RET"), NIL)), list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("SUBJECT-CONTROLLER-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT"))))), list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("OBJECT-CONTROLLER-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-DIRECT-OBJECT"))))))));

    public static final SubLSymbol AUX_VERB_WORD = makeSymbol("AUX-VERB-WORD");

    public static final SubLList $list125 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPULA-P"), NIL, makeKeyword("PUBLIC")));



    public static final SubLList $list127 = list(list(makeSymbol("RET"), list(makeSymbol("FCOND"), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(makeSymbol("QUOTE"), list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"))), list(makeSymbol("QUOTE"), EQUALP)), makeKeyword("PRESENT")), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(makeSymbol("QUOTE"), list(makeString("was"), makeString("were"), makeString("had"), makeString("did"))), list(makeSymbol("QUOTE"), EQUALP)), makeKeyword("PAST")), list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(makeSymbol("QUOTE"), list(makeString("be"), makeString("do"), makeString("have"))), list(makeSymbol("QUOTE"), EQUALP)), makeKeyword("INFINITIVE")))));



    public static final SubLList $list129 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FIF"), makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("MAIN-VERB"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-HEADS"))), list(makeSymbol("LIST"), makeSymbol("SELF"))))));



    public static final SubLList $list131 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT")))), list(makeSymbol("PREP-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-PREPOSITIONAL-COMPLEMENT")))), list(makeSymbol("ADJ-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ADJECTIVAL-COMPLEMENT")))), list(makeSymbol("ADV-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-ADVERBIAL-COMPLEMENT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("ADV-COMPLEMENT"), makeSymbol("ADJ-COMPLEMENT"), makeSymbol("PREP-COMPLEMENT"), makeSymbol("VERBAL-COMPLEMENT"), makeSymbol("OBJECT"), makeSymbol("SUBJECT"))), list(makeSymbol("PWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("CPUSH"), makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")))), list(makeSymbol("RET"), makeSymbol("COMPLEMENTS"))));

    public static final SubLList $list132 = list(list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("COPULA-P"))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("CLET"), list(list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("RET"), list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    public static final SubLList $list133 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT")))));

    public static final SubLList $list134 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMANTIC-COMPLEMENTS")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("SUBJECT")), list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("SUBJECT")))), list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("DIRECT-OBJECT")))), list(makeSymbol("MEMBER"), makeKeyword("COMPLEMENT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCLS"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(makeSymbol("QUOTE"), makeSymbol("CYCLIFY-INT"))))), list(makeSymbol("PUNLESS"), makeSymbol("COMP-CYCLS"), list(makeSymbol("CPUSH"), NIL, makeSymbol("COMP-CYCLS"))), list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-CYCL"), makeSymbol("COMP-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("COMP-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("COMP-CYCL"))), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("COMPLEMENT"), makeSymbol("COMP-CYCL")), makeSymbol("DISJUNCTS"))))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));



    public static final SubLList $list136 = list(list(makeSymbol("RET"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))));

    public static final SubLSymbol ADJECTIVAL_WORD = makeSymbol("ADJECTIVAL-WORD");

    public static final SubLList $list138 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")));

    public static final SubLList $list139 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("RET"), list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("LIST"), makeSymbol("OBL-OBJ")))))));

    public static final SubLList $list140 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT")))));

    public static final SubLList $list141 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("OBL-OBJ"), list(makeSymbol("QUOTE"), makeSymbol("GET-HEAD")))))), list(makeSymbol("PWHEN"), makeSymbol("MODIFIED"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("CONS"), makeKeyword("REPLACE"), NIL)), makeSymbol("CONJUNCTS")))), list(makeSymbol("PWHEN"), makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBL-OBJ-HEAD")), makeSymbol("CONJUNCTS")))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    public static final SubLSymbol ADVERBIAL_WORD = makeSymbol("ADVERBIAL-WORD");

    public static final SubLList $list143 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")));

    public static final SubLList $list144 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT")))));

    public static final SubLList $list145 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(makeSymbol("QUOTE"), makeSymbol("GET-SUBJECT"))))), list(makeSymbol("OBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBJECTS"))))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("OBJECT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    public static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD");

    public static final SubLList $list147 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("PROTECTED")));

    public static final SubLList $list148 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE")))));

    public static final SubLList $list149 = list(list(makeSymbol("PUNLESS"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-STRING"))), makeString("that")), list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-MODIFIEDS"))))), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CLAUSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("NOMINAL-WORD-P"), makeSymbol("MODIFIED"))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED"))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CLAUSE"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("CLAUSE"), makeSymbol("CLAUSE")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL)))));

    public static final SubLSymbol QUANTIFIER_WORD = makeSymbol("QUANTIFIER-WORD");

    public static final SubLList $list151 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("NOUN"), makeKeyword("RESTR"), makeKeyword("SCOPE")))));

    public static final SubLList $list152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL)), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("NOUN"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NOUN"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    public static final SubLSymbol PUNCTUATION_WORD = makeSymbol("PUNCTUATION-WORD");

    public static final SubLSymbol POSSESSIVE_WORD = makeSymbol("POSSESSIVE-WORD");

    public static final SubLList $list155 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED")))));

    public static final SubLList $list156 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSOR")))), list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-POSSESSED"))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSOR"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("POSSESSOR")), makeSymbol("CONJUNCTS"))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSED"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSED"), makeSymbol("KEYWORDS"), list(makeSymbol("QUOTE"), EQL))), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSED"), makeSymbol("POSSESSED")), makeSymbol("CONJUNCTS"))), list(makeSymbol("RET"), list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));



    public static final SubLSymbol BASE_P = makeSymbol("BASE-P");



    public static final SubLList $list160 = list(makeString("have"), makeString("do"));



    public static final SubLList $list162 = list(makeString("has"), makeString("does"));



    public static final SubLList $list164 = list(makeString("had"), makeString("did"));















    public static final SubLList $list172 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("LEVEL"), ONE_INTEGER));





    public static final SubLSymbol $sym175$__ = makeSymbol(">=");

    public static final SubLList $list176 = list(ZERO_INTEGER);

    public static final SubLList $list177 = list(list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("CYCLIFIABLE-VERB-PHRASE"), makeSymbol("CYCLIFY-INT")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("CYCLIFIABLE-VERB-PHRASE"), makeSymbol("CYCLIFY-INT-VP")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("CYCLIFIABLE-VERB-PHRASE"), makeSymbol("CYCLIFY-INT-VP-COORDINATION")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("CYCLIFIABLE-WORD"), makeSymbol("CYCLIFY-NUCLEUS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("NOMINAL-WORD"), makeSymbol("CYCLIFY-NUCLEUS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("CYCLIFIABLE-WORD"), makeSymbol("CYCLIFY-INT")));

    public static final SubLList $list178 = list(ONE_INTEGER);

    public static final SubLList $list179 = list(list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("NOMINAL-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("VERBAL-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("AUX-VERB-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("ADJECTIVAL-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("ADVERBIAL-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("QUANTIFIER-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("TRACE-INTERFACE-METHOD"), makeSymbol("POSSESSIVE-WORD"), makeSymbol("GET-KEYWORD-RENAMINGS")));

    public static SubLObject without_recursive_cyclification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PUNLESS, $list1, listS(CLET, $list3, append(body, NIL)));
    }

    public static SubLObject without_duplicate_cyclification(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PROGN, listS(PUNLESS, $list5, $list6, append(body, NIL)));
    }

    public static SubLObject cyclifiable_p(final SubLObject cyclifiable) {
        return interfaces.subloop_instanceof_interface(cyclifiable, CYCLIFIABLE);
    }

    public static SubLObject parse_tree_interface_p(final SubLObject parse_tree_interface) {
        return interfaces.subloop_instanceof_interface(parse_tree_interface, PARSE_TREE_INTERFACE);
    }

    public static SubLObject cyclifiable_phrase_p(final SubLObject cyclifiable_phrase) {
        return interfaces.subloop_instanceof_interface(cyclifiable_phrase, CYCLIFIABLE_PHRASE);
    }

    public static SubLObject cyclifiable_noun_phrase_p(final SubLObject cyclifiable_noun_phrase) {
        return interfaces.subloop_instanceof_interface(cyclifiable_noun_phrase, CYCLIFIABLE_NOUN_PHRASE);
    }

    public static SubLObject cyclifiable_verb_phrase_p(final SubLObject cyclifiable_verb_phrase) {
        return interfaces.subloop_instanceof_interface(cyclifiable_verb_phrase, CYCLIFIABLE_VERB_PHRASE);
    }

    public static SubLObject resolve_cyclifiable_coreferences(final SubLObject cyclifiables, final SubLObject resolver) {
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(resolver, RUN, cyclifiables);
        SubLObject corefering = NIL;
        corefering = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject referents = methods.funcall_instance_method_with_0_args(corefering.first(), GET_REFS);
            SubLObject cdolist_list_var_$1 = corefering.rest();
            SubLObject word = NIL;
            word = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                instances.set_slot(word, REFS, referents);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                word = cdolist_list_var_$1.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            corefering = cdolist_list_var.first();
        } 
        return cyclifiables;
    }

    public static SubLObject alist_cpushnew(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        SubLObject key = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(current, datum, $list31);
        list = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list31);
        value = current.first();
        current = current.rest();
        final SubLObject test = (current.isCons()) ? current.first() : $list32;
        destructuring_bind_must_listp(current, datum, $list31);
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(ALIST_PUSHNEW, list, key, value, test));
        }
        cdestructuring_bind_error(datum, $list31);
        return NIL;
    }

    public static SubLObject get_mod_cycls(final SubLObject word) {
        SubLObject mod_cycls = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(word, GET_MODIFIERS);
        SubLObject modifier = NIL;
        modifier = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
            if (NIL != mod_cycl) {
                mod_cycls = cons(mod_cycl, mod_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            modifier = cdolist_list_var.first();
        } 
        return mod_cycls;
    }

    public static SubLObject cyclifiable_sentential_phrase_p(final SubLObject cyclifiable_sentential_phrase) {
        return interfaces.subloop_instanceof_interface(cyclifiable_sentential_phrase, CYCLIFIABLE_SENTENTIAL_PHRASE);
    }

    public static SubLObject cyclifiable_prepositional_phrase_p(final SubLObject cyclifiable_prepositional_phrase) {
        return interfaces.subloop_instanceof_interface(cyclifiable_prepositional_phrase, CYCLIFIABLE_PREPOSITIONAL_PHRASE);
    }

    public static SubLObject cyclifiable_word_p(final SubLObject cyclifiable_word) {
        return interfaces.subloop_instanceof_interface(cyclifiable_word, CYCLIFIABLE_WORD);
    }

    public static SubLObject renaming_key(final SubLObject renaming) {
        SubLObject cdolist_list_var = renaming;
        SubLObject keyXvalue = NIL;
        keyXvalue = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (keyXvalue.first().eql($SUBJECT)) {
                return keyXvalue.rest();
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyXvalue = cdolist_list_var.first();
        } 
        return $DEFAULT;
    }

    public static SubLObject group_disjunctive_renamings(final SubLObject disjunction) {
        final SubLObject groupings = make_hash_table(SIXTEEN_INTEGER, EQL, UNPROVIDED);
        SubLObject new_disjunction = NIL;
        SubLObject cdolist_list_var = disjunction;
        SubLObject conjunction = NIL;
        conjunction = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject groups = NIL;
            SubLObject cdolist_list_var_$2 = conjunction;
            SubLObject renaming = NIL;
            renaming = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                final SubLObject key = renaming_key(renaming);
                sethash(key, groupings, cons(renaming, gethash(key, groupings, NIL)));
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                renaming = cdolist_list_var_$2.first();
            } 
            SubLObject key = NIL;
            SubLObject group = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(groupings);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    group = getEntryValue(cdohash_entry);
                    groups = cons(group, groups);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            clrhash(groupings);
            new_disjunction = cons(groups, new_disjunction);
            cdolist_list_var = cdolist_list_var.rest();
            conjunction = cdolist_list_var.first();
        } 
        return new_disjunction;
    }

    public static SubLObject keyword_eq_classes(final SubLObject keywords) {
        SubLObject equivalence_classes = NIL;
        SubLObject cdolist_list_var = keywords;
        SubLObject keyword = NIL;
        keyword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (!keyword.eql($ACTION)) {
                final SubLObject equivalence_class = get_keyword_equivalence_class(keyword);
                if (NIL == subl_promotions.memberP(equivalence_class, equivalence_classes, EQUAL, UNPROVIDED)) {
                    equivalence_classes = cons(equivalence_class, equivalence_classes);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyword = cdolist_list_var.first();
        } 
        return equivalence_classes;
    }

    public static SubLObject lex_keyword_eq_classes(final SubLObject lex) {
        return keyword_eq_classes(cyclifier.lexical_keywords(lex));
    }

    public static SubLObject lex_entry_score(final SubLObject lex, final SubLObject tree_eq_classes) {
        final SubLObject lex_eq_classes = lex_keyword_eq_classes(lex);
        final SubLObject intersection = intersection(tree_eq_classes, lex_eq_classes, EQUAL, UNPROVIDED);
        final SubLObject difference = union(set_difference(tree_eq_classes, intersection, EQUAL, UNPROVIDED), set_difference(lex_eq_classes, intersection, EQUAL, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        final SubLObject frame = methods.funcall_instance_method_with_1_args(lex, GET, $FRAME);
        final SubLObject bonus = (NIL != isa.isaP(frame, $$ParticleFrameType, $$EverythingPSC, UNPROVIDED)) ? ONE_INTEGER : ZERO_INTEGER;
        return add(subtract(length(intersection), length(difference)), bonus);
    }

    public static SubLObject get_keyword_equivalence_class(final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = $context_keyword_equivalence$.getDynamicValue(thread);
        SubLObject eq_class = NIL;
        eq_class = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != subl_promotions.memberP(keyword, eq_class, EQL, UNPROVIDED)) {
                return eq_class;
            }
            cdolist_list_var = cdolist_list_var.rest();
            eq_class = cdolist_list_var.first();
        } 
        return list(keyword);
    }

    public static SubLObject nominal_word_p(final SubLObject nominal_word) {
        return interfaces.subloop_instanceof_interface(nominal_word, NOMINAL_WORD);
    }

    public static SubLObject disjunctive_keyword_renamings(final SubLObject conjuncts, final SubLObject disjuncts) {
        SubLObject renamings = NIL;
        if (NIL != disjuncts) {
            SubLObject cdolist_list_var = disjuncts;
            SubLObject disj = NIL;
            disj = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                renamings = cons(list_utilities.cross_products(cons(list(disj), conjuncts)), renamings);
                cdolist_list_var = cdolist_list_var.rest();
                disj = cdolist_list_var.first();
            } 
        } else
            if (NIL != conjuncts) {
                renamings = cons(list_utilities.cross_products(conjuncts), renamings);
            } else {
                renamings = cons(list(NIL), renamings);
            }

        return renamings;
    }

    public static SubLObject coordinate_keyword_renaming(final SubLObject keyword, final SubLObject word) {
        SubLObject renamings = NIL;
        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(word, GET_REFS);
        SubLObject ref = NIL;
        ref = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            renamings = cons(cons(keyword, ref), renamings);
            cdolist_list_var = cdolist_list_var.rest();
            ref = cdolist_list_var.first();
        } 
        return renamings;
    }

    public static SubLObject partition_modifiers(final SubLObject modifiers) {
        SubLObject independents = NIL;
        SubLObject dependents = NIL;
        SubLObject cdolist_list_var = modifiers;
        SubLObject modifier = NIL;
        modifier = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject mod_head = methods.funcall_instance_method_with_0_args(modifier, GET_HEAD);
            if (NIL != mod_head) {
                if (NIL != methods.funcall_instance_method_with_0_args(mod_head, MODIFIED_DEPENDENT_MEANING_P)) {
                    dependents = cons(mod_head, dependents);
                } else {
                    independents = cons(mod_head, independents);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            modifier = cdolist_list_var.first();
        } 
        return values(independents, dependents);
    }

    public static SubLObject apply_lex_renaming(final SubLObject word, final SubLObject rle, final SubLObject renaming) {
        final SubLObject renamed_formula = cyclifier.rename_variables(cyclifier.rename_variables(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS), cyclifier.frame_renaming(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME))), renaming);
        if (NIL != renamed_formula) {
            return cyclifier.new_cyclification(renamed_formula, word, cyclifier.rle_confidence(rle));
        }
        return NIL;
    }

    public static SubLObject update_keyword_renaming(final SubLObject renaming, final SubLObject key, final SubLObject new_value) {
        SubLObject cdolist_list_var = renaming;
        SubLObject keyXvalue = NIL;
        keyXvalue = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (keyXvalue.first().eql(key)) {
                rplacd(keyXvalue, new_value);
            }
            cdolist_list_var = cdolist_list_var.rest();
            keyXvalue = cdolist_list_var.first();
        } 
        return renaming;
    }

    public static SubLObject update_keyword_renamings(final SubLObject renamings_disj, final SubLObject key, final SubLObject new_value) {
        SubLObject cdolist_list_var = renamings_disj;
        SubLObject renamings_conj = NIL;
        renamings_conj = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = renamings_conj;
            SubLObject renaming = NIL;
            renaming = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                update_keyword_renaming(renaming, key, new_value);
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                renaming = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            renamings_conj = cdolist_list_var.first();
        } 
        return renamings_disj;
    }

    public static SubLObject name_word_p(final SubLObject name_word) {
        return interfaces.subloop_instanceof_interface(name_word, NAME_WORD);
    }

    public static SubLObject verbal_word_p(final SubLObject verbal_word) {
        return interfaces.subloop_instanceof_interface(verbal_word, VERBAL_WORD);
    }

    public static SubLObject delete_cyclifiable(final SubLObject cyclifiable, final SubLObject list) {
        SubLObject new_list = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == methods.funcall_instance_method_with_1_args(element, EQUAL, cyclifiable)) {
                new_list = cons(element, new_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return nreverse(new_list);
    }

    public static SubLObject aux_verb_word_p(final SubLObject aux_verb_word) {
        return interfaces.subloop_instanceof_interface(aux_verb_word, AUX_VERB_WORD);
    }

    public static SubLObject adjectival_word_p(final SubLObject adjectival_word) {
        return interfaces.subloop_instanceof_interface(adjectival_word, ADJECTIVAL_WORD);
    }

    public static SubLObject adverbial_word_p(final SubLObject adverbial_word) {
        return interfaces.subloop_instanceof_interface(adverbial_word, ADVERBIAL_WORD);
    }

    public static SubLObject prepositional_or_particle_word_p(final SubLObject prepositional_or_particle_word) {
        return interfaces.subloop_instanceof_interface(prepositional_or_particle_word, PREPOSITIONAL_OR_PARTICLE_WORD);
    }

    public static SubLObject quantifier_word_p(final SubLObject quantifier_word) {
        return interfaces.subloop_instanceof_interface(quantifier_word, QUANTIFIER_WORD);
    }

    public static SubLObject punctuation_word_p(final SubLObject punctuation_word) {
        return interfaces.subloop_instanceof_interface(punctuation_word, PUNCTUATION_WORD);
    }

    public static SubLObject possessive_word_p(final SubLObject possessive_word) {
        return interfaces.subloop_instanceof_interface(possessive_word, POSSESSIVE_WORD);
    }

    public static SubLObject compute_main_verb_tag(final SubLObject word) {
        final SubLObject string = methods.funcall_instance_method_with_0_args(word, GET_STRING);
        if (NIL != methods.funcall_instance_method_with_0_args(word, BASE_P)) {
            return $VB;
        }
        if (NIL != member(string, $list160, EQUAL, UNPROVIDED)) {
            return $VBP;
        }
        if (NIL != member(string, $list162, EQUAL, UNPROVIDED)) {
            return $VBZ;
        }
        if (NIL != member(string, $list164, EQUAL, UNPROVIDED)) {
            final SubLObject aunt = methods.funcall_instance_method_with_1_args(methods.funcall_instance_method_with_0_args(word, GET_MOTHER), GET_SISTER, MINUS_ONE_INTEGER);
            return (NIL != aunt) && (NIL != aux_verb_word_p(aunt)) ? $VBN : $VBD;
        }
        if (methods.funcall_instance_method_with_0_args(word, GET_CATEGORY) == $AUXG) {
            return $VBG;
        }
        return methods.funcall_instance_method_with_0_args(word, GET_CATEGORY);
    }

    public static SubLObject trace_cyclifier(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        final SubLObject level = (current.isCons()) ? current.first() : ONE_INTEGER;
        destructuring_bind_must_listp(current, datum, $list172);
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list172);
            return NIL;
        }
        assert NIL != subl_promotions.non_negative_integer_p(level) : "subl_promotions.non_negative_integer_p(level) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(level) " + level;
        return list(PROGN, listS(PWHEN, listS($sym175$__, level, $list176), $list177), listS(PWHEN, listS($sym175$__, level, $list178), $list179));
    }

    public static SubLObject declare_cyclifier_interface_file() {
        declareMacro(me, "without_recursive_cyclification", "WITHOUT-RECURSIVE-CYCLIFICATION");
        declareMacro(me, "without_duplicate_cyclification", "WITHOUT-DUPLICATE-CYCLIFICATION");
        declareFunction(me, "cyclifiable_p", "CYCLIFIABLE-P", 1, 0, false);
        declareFunction(me, "parse_tree_interface_p", "PARSE-TREE-INTERFACE-P", 1, 0, false);
        declareFunction(me, "cyclifiable_phrase_p", "CYCLIFIABLE-PHRASE-P", 1, 0, false);
        declareFunction(me, "cyclifiable_noun_phrase_p", "CYCLIFIABLE-NOUN-PHRASE-P", 1, 0, false);
        declareFunction(me, "cyclifiable_verb_phrase_p", "CYCLIFIABLE-VERB-PHRASE-P", 1, 0, false);
        declareFunction(me, "resolve_cyclifiable_coreferences", "RESOLVE-CYCLIFIABLE-COREFERENCES", 2, 0, false);
        declareMacro(me, "alist_cpushnew", "ALIST-CPUSHNEW");
        declareFunction(me, "get_mod_cycls", "GET-MOD-CYCLS", 1, 0, false);
        declareFunction(me, "cyclifiable_sentential_phrase_p", "CYCLIFIABLE-SENTENTIAL-PHRASE-P", 1, 0, false);
        declareFunction(me, "cyclifiable_prepositional_phrase_p", "CYCLIFIABLE-PREPOSITIONAL-PHRASE-P", 1, 0, false);
        declareFunction(me, "cyclifiable_word_p", "CYCLIFIABLE-WORD-P", 1, 0, false);
        declareFunction(me, "renaming_key", "RENAMING-KEY", 1, 0, false);
        declareFunction(me, "group_disjunctive_renamings", "GROUP-DISJUNCTIVE-RENAMINGS", 1, 0, false);
        declareFunction(me, "keyword_eq_classes", "KEYWORD-EQ-CLASSES", 1, 0, false);
        declareFunction(me, "lex_keyword_eq_classes", "LEX-KEYWORD-EQ-CLASSES", 1, 0, false);
        declareFunction(me, "lex_entry_score", "LEX-ENTRY-SCORE", 2, 0, false);
        declareFunction(me, "get_keyword_equivalence_class", "GET-KEYWORD-EQUIVALENCE-CLASS", 1, 0, false);
        declareFunction(me, "nominal_word_p", "NOMINAL-WORD-P", 1, 0, false);
        declareFunction(me, "disjunctive_keyword_renamings", "DISJUNCTIVE-KEYWORD-RENAMINGS", 2, 0, false);
        declareFunction(me, "coordinate_keyword_renaming", "COORDINATE-KEYWORD-RENAMING", 2, 0, false);
        declareFunction(me, "partition_modifiers", "PARTITION-MODIFIERS", 1, 0, false);
        declareFunction(me, "apply_lex_renaming", "APPLY-LEX-RENAMING", 3, 0, false);
        declareFunction(me, "update_keyword_renaming", "UPDATE-KEYWORD-RENAMING", 3, 0, false);
        declareFunction(me, "update_keyword_renamings", "UPDATE-KEYWORD-RENAMINGS", 3, 0, false);
        declareFunction(me, "name_word_p", "NAME-WORD-P", 1, 0, false);
        declareFunction(me, "verbal_word_p", "VERBAL-WORD-P", 1, 0, false);
        declareFunction(me, "delete_cyclifiable", "DELETE-CYCLIFIABLE", 2, 0, false);
        declareFunction(me, "aux_verb_word_p", "AUX-VERB-WORD-P", 1, 0, false);
        declareFunction(me, "adjectival_word_p", "ADJECTIVAL-WORD-P", 1, 0, false);
        declareFunction(me, "adverbial_word_p", "ADVERBIAL-WORD-P", 1, 0, false);
        declareFunction(me, "prepositional_or_particle_word_p", "PREPOSITIONAL-OR-PARTICLE-WORD-P", 1, 0, false);
        declareFunction(me, "quantifier_word_p", "QUANTIFIER-WORD-P", 1, 0, false);
        declareFunction(me, "punctuation_word_p", "PUNCTUATION-WORD-P", 1, 0, false);
        declareFunction(me, "possessive_word_p", "POSSESSIVE-WORD-P", 1, 0, false);
        declareFunction(me, "compute_main_verb_tag", "COMPUTE-MAIN-VERB-TAG", 1, 0, false);
        declareMacro(me, "trace_cyclifier", "TRACE-CYCLIFIER");
        return NIL;
    }

    public static SubLObject init_cyclifier_interface_file() {
        defparameter("*CYCLIFICATION-IN-PROGRESS*", NIL);
        defparameter("*CYCLIFICATION-COMPLETE*", NIL);
        defparameter("*ALLOW-DUPLICATE-CYCLIFICATIONS?*", NIL);
        defparameter("*CONTEXT-KEYWORD-EQUIVALENCE*", $list71);
        return NIL;
    }

    public static SubLObject setup_cyclifier_interface_file() {
        interfaces.new_interface(CYCLIFIABLE, NIL, NIL, $list8);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY, CYCLIFIABLE, $list10, $list11, $list12);
        interfaces.interfaces_add_interface_instance_method(GET_CYCLIFIER, CYCLIFIABLE, $list10, $list11, $list14);
        interfaces.new_interface(PARSE_TREE_INTERFACE, NIL, NIL, $list16);
        interfaces.new_interface(CYCLIFIABLE_PHRASE, $list18, $list19, NIL);
        interfaces.new_interface(CYCLIFIABLE_NOUN_PHRASE, $list21, $list22, NIL);
        interfaces.new_interface(CYCLIFIABLE_VERB_PHRASE, $list21, $list22, $list24);
        interfaces.interfaces_add_interface_instance_method(VP_COORDINATE_PHRASE_P, CYCLIFIABLE_VERB_PHRASE, $list26, NIL, $list27);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_INT_VP, CYCLIFIABLE_VERB_PHRASE, $list38, NIL, $list39);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_INT, CYCLIFIABLE_VERB_PHRASE, $list38, NIL, $list40);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_INT_VP_COORDINATION, CYCLIFIABLE_VERB_PHRASE, $list38, NIL, $list42);
        interfaces.new_interface(CYCLIFIABLE_SENTENTIAL_PHRASE, $list44, $list45, NIL);
        interfaces.new_interface(CYCLIFIABLE_PREPOSITIONAL_PHRASE, $list21, $list22, NIL);
        interfaces.new_interface(CYCLIFIABLE_WORD, $list18, $list19, $list48);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, CYCLIFIABLE_WORD, $list38, $list50, $list51);
        interfaces.interfaces_add_interface_instance_method(GET_SEMANTIC_COMPLEMENTS, CYCLIFIABLE_WORD, $list10, NIL, $list53);
        interfaces.interfaces_add_interface_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, CYCLIFIABLE_WORD, $list38, NIL, $list55);
        interfaces.interfaces_add_interface_instance_method(GET_PP_COMPLEMENT, CYCLIFIABLE_WORD, $list10, NIL, $list57);
        interfaces.interfaces_add_interface_instance_method(GET_OBLIQUE_OBJECT, CYCLIFIABLE_WORD, $list10, NIL, $list59);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_INT, CYCLIFIABLE_WORD, $list38, NIL, $list60);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_NUCLEUS, CYCLIFIABLE_WORD, $list38, $list64, $list65);
        interfaces.interfaces_add_interface_instance_method(MODIFIED_DEPENDENT_MEANING_P, CYCLIFIABLE_WORD, $list38, NIL, $list67);
        interfaces.interfaces_add_interface_instance_method(TREE_KEYWORD_EQ_CLASSES, CYCLIFIABLE_WORD, $list38, NIL, $list69);
        interfaces.interfaces_add_interface_instance_method(POS_FILTER_LEXES, CYCLIFIABLE_WORD, $list38, NIL, $list77);
        interfaces.interfaces_add_interface_instance_method(PP_COMP_FILTER_LEXES, CYCLIFIABLE_WORD, $list38, NIL, $list79);
        interfaces.interfaces_add_interface_instance_method(FRAME_FILTER_LEXES, CYCLIFIABLE_WORD, $list38, NIL, $list81);
        interfaces.new_interface(NOMINAL_WORD, $list83, $list84, $list85);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, NOMINAL_WORD, $list38, $list86, $list87);
        interfaces.interfaces_add_interface_instance_method(GET_QUANTIFIER, NOMINAL_WORD, $list10, NIL, $list89);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_INT, NOMINAL_WORD, $list38, NIL, $list90);
        interfaces.interfaces_add_interface_instance_method(CYCLIFY_NUCLEUS, NOMINAL_WORD, $list38, $list93, $list94);
        interfaces.interfaces_add_interface_instance_method(DEFINITE_DESCRIPTION_P, NOMINAL_WORD, $list10, NIL, $list96);
        interfaces.interfaces_add_interface_instance_method(RELATIONAL_NOUN_P, NOMINAL_WORD, $list10, NIL, $list98);
        interfaces.new_interface(NAME_WORD, $list100, $list101, $list102);
        interfaces.interfaces_add_interface_instance_method(GET_QUANTIFIER, NAME_WORD, $list10, NIL, $list103);
        interfaces.new_interface(VERBAL_WORD, $list83, $list84, $list105);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, VERBAL_WORD, $list38, $list106, $list107);
        interfaces.interfaces_add_interface_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, VERBAL_WORD, $list38, NIL, $list108);
        interfaces.interfaces_add_interface_instance_method(PARTICLE_FILTER_LEXES, VERBAL_WORD, $list38, NIL, $list110);
        interfaces.interfaces_add_interface_instance_method(GET_MATRIX_CLAUSE, VERBAL_WORD, $list38, NIL, $list112);
        interfaces.interfaces_add_interface_instance_method(GET_MATRIX_CLAUSE, VERBAL_WORD, $list38, NIL, $list113);
        interfaces.interfaces_add_interface_instance_method(SUBJECT_CONTROLLER_P, VERBAL_WORD, $list38, NIL, $list115);
        interfaces.interfaces_add_interface_instance_method(OBJECT_CONTROLLER_P, VERBAL_WORD, $list38, NIL, $list117);
        interfaces.interfaces_add_interface_instance_method(CONTROL_VERB_P, VERBAL_WORD, $list38, NIL, $list119);
        interfaces.interfaces_add_interface_instance_method(GET_CONTROL_VERB, VERBAL_WORD, $list38, NIL, $list121);
        interfaces.interfaces_add_interface_instance_method(GET_CONTROLLER, VERBAL_WORD, $list38, NIL, $list123);
        interfaces.new_interface(AUX_VERB_WORD, $list83, $list84, $list125);
        interfaces.interfaces_add_interface_instance_method(GET_TENSE, AUX_VERB_WORD, $list10, NIL, $list127);
        interfaces.interfaces_add_interface_instance_method(GET_SEMANTIC_HEADS, AUX_VERB_WORD, $list10, NIL, $list129);
        interfaces.interfaces_add_interface_instance_method(GET_COMPLEMENTS, AUX_VERB_WORD, $list38, NIL, $list131);
        interfaces.interfaces_add_interface_instance_method(GET_SEMANTIC_COMPLEMENTS, AUX_VERB_WORD, $list38, NIL, $list132);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, AUX_VERB_WORD, $list38, $list133, $list134);
        interfaces.interfaces_add_interface_instance_method(COPULA_P, AUX_VERB_WORD, $list10, NIL, $list136);
        interfaces.new_interface(ADJECTIVAL_WORD, $list83, $list84, $list138);
        interfaces.interfaces_add_interface_instance_method(GET_COMPLEMENTS, ADJECTIVAL_WORD, $list10, NIL, $list139);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, ADJECTIVAL_WORD, $list38, $list140, $list141);
        interfaces.new_interface(ADVERBIAL_WORD, $list83, $list84, $list143);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, ADVERBIAL_WORD, $list38, $list144, $list145);
        interfaces.new_interface(PREPOSITIONAL_OR_PARTICLE_WORD, $list83, $list84, $list147);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, PREPOSITIONAL_OR_PARTICLE_WORD, $list38, $list148, $list149);
        interfaces.new_interface(QUANTIFIER_WORD, $list83, $list84, $list143);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, QUANTIFIER_WORD, $list38, $list151, $list152);
        interfaces.new_interface(PUNCTUATION_WORD, $list83, $list84, NIL);
        interfaces.new_interface(POSSESSIVE_WORD, $list83, $list84, $list143);
        interfaces.interfaces_add_interface_instance_method(GET_KEYWORD_RENAMINGS, POSSESSIVE_WORD, $list38, $list155, $list156);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cyclifier_interface_file();
    }

    @Override
    public void initializeVariables() {
        init_cyclifier_interface_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cyclifier_interface_file();
    }

    
}

/**
 * Total time: 957 ms
 */

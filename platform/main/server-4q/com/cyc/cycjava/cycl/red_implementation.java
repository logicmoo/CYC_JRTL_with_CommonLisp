package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.red_implementation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.red_implementation.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class red_implementation extends SubLTranslatedFile {
    public static final SubLFile me = new red_implementation();

    public static final String myName = "com.cyc.cycjava.cycl.red_implementation";

    public static final String myFingerPrint = "f860563e19f1ba0eb8e957f483ba4c3883c19df19bbf5dee6736f95c20a91237";



    public static final SubLList $list1 = list(new SubLObject[]{ makeKeyword("COMMENT"), makeString("RED Cyc Configuration Repository"), makeKeyword("AUTHOR"), makeString("Chester John <cjohn@cyc.com>"), makeKeyword("FILENAME"), makeString("RED Library (auto-loaded)"), makeKeyword("DEPENDS-ON"), NIL, makeKeyword("COPYRIGHT"), makeString("Copyright (c) 2004 - 2006 Cycorp Inc."), makeKeyword("URI"), makeString("http://www.opencyc.com") });

    public static final SubLString $$$RedNew = makeString("RedNew");

    public static final SubLSymbol $sym3$RED_NEW_IMPLEMENTATION_ = makeUninternedSymbol("RED-NEW-IMPLEMENTATION%");





    public static final SubLString $$$RedGetReasonCode = makeString("RedGetReasonCode");

    public static final SubLSymbol RED_GET_REASON_CODE_IMPLEMENTATION = makeSymbol("RED-GET-REASON-CODE-IMPLEMENTATION");

    public static final SubLList $list8 = list(list(makeSymbol("RED-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));



    public static final SubLString $$$RedGetReasonCodeString = makeString("RedGetReasonCodeString");

    public static final SubLSymbol $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REASON-CODE-STRING-IMPLEMENTATION%");

    public static final SubLList $list12 = list(makeKeyword("POINTER"), makeKeyword("CHAR"));

    public static final SubLString $str13$ = makeString("");

    public static final SubLString $$$RedGetReasonSubCode = makeString("RedGetReasonSubCode");

    public static final SubLSymbol RED_GET_REASON_SUB_CODE_IMPLEMENTATION = makeSymbol("RED-GET-REASON-SUB-CODE-IMPLEMENTATION");

    public static final SubLString $$$RedGetReasonSubCodeString = makeString("RedGetReasonSubCodeString");

    public static final SubLSymbol $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REASON-SUB-CODE-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedGetVersionString = makeString("RedGetVersionString");

    public static final SubLSymbol $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-VERSION-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedGetDate = makeString("RedGetDate");

    public static final SubLSymbol $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-DATE-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedGetTime = makeString("RedGetTime");

    public static final SubLSymbol $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-TIME-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedDispose = makeString("RedDispose");

    public static final SubLSymbol RED_DISPOSE_IMPLEMENTATION = makeSymbol("RED-DISPOSE-IMPLEMENTATION");

    public static final SubLString $$$RedLoadRedRepositoryFilename = makeString("RedLoadRedRepositoryFilename");

    public static final SubLSymbol $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol("RED-LOAD-REPOSITORY-IMPLEMENTATION%");

    public static final SubLList $list28 = list(list(makeSymbol("RED-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("FILENAME"), list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING")));

    public static final SubLSymbol $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-BY-NAME-IMPLEMENTATION%");

    public static final SubLList $list30 = list(list(makeSymbol("RED-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("NAME"), list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING")));

    public static final SubLString $$$RedRepositoryDispose = makeString("RedRepositoryDispose");

    public static final SubLSymbol RED_REPOSITORY_DISPOSE_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-DISPOSE-IMPLEMENTATION");

    public static final SubLList $list33 = list(list(makeSymbol("RED-REPOSITORY-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedValueExists = makeString("RedValueExists");

    public static final SubLSymbol RED_VALUE_EXISTS_IMPLEMENTATION = makeSymbol("RED-VALUE-EXISTS-IMPLEMENTATION");

    public static final SubLString $$$RedGetRepositoryName = makeString("RedGetRepositoryName");

    public static final SubLSymbol $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-NAME-IMPLEMENTATION%");

    public static final SubLString $$$RedGetRepositoryFilename = makeString("RedGetRepositoryFilename");

    public static final SubLSymbol $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION%");

    public static final SubLString $$$RedGetRepositoryTypeString = makeString("RedGetRepositoryTypeString");

    public static final SubLSymbol $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedGetRepositoryVersionString = makeString("RedGetRepositoryVersionString");

    public static final SubLSymbol $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedGetRepositoryDate = makeString("RedGetRepositoryDate");

    public static final SubLSymbol $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-DATE-IMPLEMENTATION%");

    public static final SubLString $$$RedRepositoryPointerValid = makeString("RedRepositoryPointerValid");

    public static final SubLSymbol RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-POINTER-VALID-IMPLEMENTATION");

    public static final SubLList $list48 = list(list(makeSymbol("RED-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("RED-REPOSITORY-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedGetRepositoryVersionMajor = makeString("RedGetRepositoryVersionMajor");

    public static final SubLSymbol RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-VERSION-MAJOR-IMPLEMENTATION");

    public static final SubLString $$$RedGetRepositoryVersionMinor = makeString("RedGetRepositoryVersionMinor");

    public static final SubLSymbol RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-VERSION-MINOR-IMPLEMENTATION");

    public static final SubLString $$$RedGetRepositoryVersionFix = makeString("RedGetRepositoryVersionFix");

    public static final SubLSymbol RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-VERSION-FIX-IMPLEMENTATION");

    public static final SubLString $$$RedGetRepositoryVersionSpin = makeString("RedGetRepositoryVersionSpin");

    public static final SubLSymbol RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-VERSION-SPIN-IMPLEMENTATION");

    public static final SubLString $$$RedGetRepositoryTime = makeString("RedGetRepositoryTime");

    public static final SubLSymbol $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-TIME-IMPLEMENTATION%");

    public static final SubLString $$$RedRepositoryIsValid = makeString("RedRepositoryIsValid");

    public static final SubLSymbol RED_IS_VALID_IMPLEMENTATION = makeSymbol("RED-IS-VALID-IMPLEMENTATION");

    public static final SubLString $$$RedGetRepositoryReasonCodeString = makeString("RedGetRepositoryReasonCodeString");

    public static final SubLSymbol $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-REASONCODE-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedNumberRepositories = makeString("RedNumberRepositories");

    public static final SubLSymbol RED_NUMBER_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-NUMBER-REPOSITORIES-IMPLEMENTATION");

    public static final SubLString $$$RedNumberApplicationRepositories = makeString("RedNumberApplicationRepositories");

    public static final SubLSymbol RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-NUMBER-APPLICATION-REPOSITORIES-IMPLEMENTATION");

    public static final SubLString $$$RedGetSystemRepository = makeString("RedGetSystemRepository");

    public static final SubLSymbol $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION%");

    public static final SubLString $$$RedGetMachineRepository = makeString("RedGetMachineRepository");

    public static final SubLSymbol $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION%");

    public static final SubLString $$$RedRepositoryListNew = makeString("RedRepositoryListNew");

    public static final SubLSymbol $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_ = makeUninternedSymbol("RED-REPOSITORY-LIST-NEW-IMPLEMENTATION%");

    public static final SubLList $list73 = list(list(makeSymbol("RED-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("NUMBER-ELEMENTS"), makeKeyword("INT32"), makeKeyword("INTEGER")));

    public static final SubLString $str74$RedMakeRepositoryListFromReposito = makeString("RedMakeRepositoryListFromRepository");

    public static final SubLSymbol $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol("RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION%");

    public static final SubLString $$$RedGetApplicationRepositories = makeString("RedGetApplicationRepositories");

    public static final SubLSymbol $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION%");

    public static final SubLString $str78$RedGetRepositoryListMostPrivilege = makeString("RedGetRepositoryListMostPrivilegedFirst");

    public static final SubLSymbol $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION%");

    public static final SubLString $str80$RedGetRepositoryListLeastPrivileg = makeString("RedGetRepositoryListLeastPrivilegedFirst");

    public static final SubLSymbol $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION%");

    public static final SubLString $$$RedRepositoryListDispose = makeString("RedRepositoryListDispose");

    public static final SubLSymbol RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-DISPOSE-IMPLEMENTATION");

    public static final SubLList $list84 = list(list(makeSymbol("RED-REPOSITORY-LIST-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedGetRepositoryListLength = makeString("RedGetRepositoryListLength");

    public static final SubLSymbol RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION = makeSymbol("RED-GET-REPOSITORY-LIST-LENGTH-IMPLEMENTATION");

    public static final SubLString $$$RedRepositoryListGetElement = makeString("RedRepositoryListGetElement");

    public static final SubLSymbol $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_ = makeUninternedSymbol("RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION%");

    public static final SubLList $list89 = list(list(makeSymbol("RED-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("INDEX"), makeKeyword("INT32"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedRepositoryListAddRepository = makeString("RedRepositoryListAddRepository");

    public static final SubLSymbol RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-ADD-REPOSITORY-IMPLEMENTATION");

    public static final SubLList $list92 = list(list(makeSymbol("RED-REPOSITORY-LIST-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("RED-REPOSITORY-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $str93$RedRepositoryListGetMaxRepositori = makeString("RedRepositoryListGetMaxRepositories");

    public static final SubLSymbol RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION = makeSymbol("RED-REPOSITORY-LIST-GET-MAX-REPOSITORIES-IMPLEMENTATION");

    public static final SubLString $$$RedGetTopLevelKey = makeString("RedGetTopLevelKey");

    public static final SubLSymbol $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION%");

    public static final SubLString $$$RedGetElementByKey = makeString("RedGetElementByKey");

    public static final SubLSymbol $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-ELEMENT-BY-KEY-IMPLEMENTATION%");

    public static final SubLList $list99 = list(list(makeSymbol("RED-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("KEY"), list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING")));

    public static final SubLString $$$RedElementNumberSubKeys = makeString("RedElementNumberSubKeys");

    public static final SubLSymbol RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION = makeSymbol("RED-ELEMENT-NUMBER-SUBKEYS-IMPLEMENTATION");

    public static final SubLList $list102 = list(list(makeSymbol("RED-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedGetSubKeyIterator = makeString("RedGetSubKeyIterator");

    public static final SubLSymbol $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION%");

    public static final SubLString $$$RedIteratorDispose = makeString("RedIteratorDispose");

    public static final SubLSymbol RED_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol("RED-ITERATOR-DISPOSE-IMPLEMENTATION");

    public static final SubLList $list107 = list(list(makeSymbol("RED-ITERATOR-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedIteratorHasNext = makeString("RedIteratorHasNext");

    public static final SubLSymbol RED_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol("RED-ITERATOR-HAS-NEXT-IMPLEMENTATION");

    public static final SubLString $$$RedIteratorNext = makeString("RedIteratorNext");

    public static final SubLSymbol $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_ = makeUninternedSymbol("RED-ITERATOR-NEXT-IMPLEMENTATION%");

    public static final SubLString $$$RedIteratorPeek = makeString("RedIteratorPeek");

    public static final SubLSymbol $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_ = makeUninternedSymbol("RED-ITERATOR-PEEK-IMPLEMENTATION%");

    public static final SubLString $$$RedGetKey = makeString("RedGetKey");

    public static final SubLSymbol $sym115$RED_GET_KEY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-KEY-IMPLEMENTATION%");

    public static final SubLString $$$RedGetDataTypeString = makeString("RedGetDataTypeString");

    public static final SubLSymbol $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-DATATYPE-STRING-IMPLEMENTATION%");

    public static final SubLString $$$RedGetValueSize = makeString("RedGetValueSize");

    public static final SubLSymbol RED_GET_VALUE_SIZE_IMPLEMENTATION = makeSymbol("RED-GET-VALUE-SIZE-IMPLEMENTATION");

    public static final SubLString $$$RedGetRedElementRepository = makeString("RedGetRedElementRepository");

    public static final SubLSymbol $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-RED-ELEMENT-REPOSITORY-IMPLEMENTATION%");

    public static final SubLString $$$RedGetStringValue = makeString("RedGetStringValue");

    public static final SubLSymbol $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-STRING-VALUE-IMPLEMENTATION%");

    public static final SubLString $$$RedGetBlobValue = makeString("RedGetBlobValue");

    public static final SubLSymbol $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-BLOB-VALUE-IMPLEMENTATION%");

    public static final SubLString $$$RedCopyBlobValue = makeString("RedCopyBlobValue");

    public static final SubLSymbol RED_COPY_BLOB_VALUE_IMPLEMENTATION = makeSymbol("RED-COPY-BLOB-VALUE-IMPLEMENTATION");

    public static final SubLList $list128 = list(list(makeSymbol("RED-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("INT-VECTOR"), list(makeKeyword("POINTER"), makeKeyword("INT32")), list(makeKeyword("VECTOR"), makeKeyword("FIXNUM"))));



    public static final SubLString $$$RedGetIntValue32 = makeString("RedGetIntValue32");

    public static final SubLSymbol RED_GET_INT32_VALUE_IMPLEMENTATION = makeSymbol("RED-GET-INT32-VALUE-IMPLEMENTATION");

    public static final SubLString $$$RedGetExtendedNameWithSeparator = makeString("RedGetExtendedNameWithSeparator");

    public static final SubLSymbol $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-SEPARATOR-IMPLEMENTATION%");

    public static final SubLList $list134 = list(list(makeSymbol("RED-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("KEY"), list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING")), list(makeSymbol("SEPARATOR"), makeKeyword("CHAR"), makeKeyword("FIXNUM")));

    public static final SubLString $str135$RedGetExtendedNameWithPeriodSepar = makeString("RedGetExtendedNameWithPeriodSeparator");

    public static final SubLSymbol $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-IMPLEMENTATION%");

    public static final SubLString $$$RedGetTopLevelSuperElement = makeString("RedGetTopLevelSuperElement");

    public static final SubLSymbol $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION%");

    public static final SubLString $$$RedGetSuperElementByKey = makeString("RedGetSuperElementByKey");

    public static final SubLSymbol $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-SUPER-ELEMENT-BY-KEY-IMPLEMENTATION%");

    public static final SubLList $list141 = list(list(makeSymbol("RED-SUPER-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("KEY"), list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING")));

    public static final SubLString $$$RedSuperElementSubkeyExists = makeString("RedSuperElementSubkeyExists");

    public static final SubLSymbol RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-SUBKEY-EXISTS-IMPLEMENTATION");

    public static final SubLString $$$RedSuperElementGetElement = makeString("RedSuperElementGetElement");

    public static final SubLSymbol $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_ = makeUninternedSymbol("RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION%");

    public static final SubLList $list146 = list(list(makeSymbol("RED-SUPER-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedSuperElementGetRepositoryList = makeString("RedSuperElementGetRepositoryList");

    public static final SubLSymbol $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_ = makeUninternedSymbol("RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION%");

    public static final SubLString $$$RedSuperElementDispose = makeString("RedSuperElementDispose");

    public static final SubLSymbol RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-DISPOSE-IMPLEMENTATION");

    public static final SubLString $str151$RedGetExtendedNameWithSeparatorLi = makeString("RedGetExtendedNameWithSeparatorList");

    public static final SubLSymbol $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-SEPARATOR-LIST-IMPLEMENTATION%");

    public static final SubLList $list153 = list(list(makeSymbol("RED-SUPER-ELEMENT-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")), list(makeSymbol("KEY"), list(makeKeyword("POINTER"), makeKeyword("CHAR")), makeKeyword("STRING")), list(makeSymbol("SEPARATOR"), makeKeyword("CHAR"), makeKeyword("FIXNUM")));

    public static final SubLString $str154$RedGetExtendedNameWithPeriodSepar = makeString("RedGetExtendedNameWithPeriodSeparatorList");

    public static final SubLSymbol $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION%");

    public static final SubLString $$$RedGetSuperElementIterator = makeString("RedGetSuperElementIterator");

    public static final SubLSymbol $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_ = makeUninternedSymbol("RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION%");

    public static final SubLString $$$RedSuperElementIteratorHasNext = makeString("RedSuperElementIteratorHasNext");

    public static final SubLSymbol RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-HAS-NEXT-IMPLEMENTATION");

    public static final SubLList $list160 = list(list(makeSymbol("RED-SUPER-ELEMENT-ITERATOR-STRUCT"), makeKeyword("OPAQUE"), makeKeyword("INTEGER")));

    public static final SubLString $$$RedSuperElementIteratorNext = makeString("RedSuperElementIteratorNext");

    public static final SubLSymbol $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_ = makeUninternedSymbol("RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION%");

    public static final SubLString $$$RedSuperElementIteratorPeek = makeString("RedSuperElementIteratorPeek");

    public static final SubLSymbol $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_ = makeUninternedSymbol("RED-SUPER-ELEMENT-ITERATOR-PEEK-IMPLEMENTATION%");

    public static final SubLString $str165$RedSuperElementIteratorGetReposit = makeString("RedSuperElementIteratorGetRepositoryList");

    public static final SubLSymbol $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_ = makeUninternedSymbol("RED-SUPER-ELEMENT-ITERATOR-GET-REPOSITORY-LIST-IMPLEMENTATION%");

    public static final SubLString $$$RedSuperElementIteratorDispose = makeString("RedSuperElementIteratorDispose");

    public static final SubLSymbol RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol("RED-SUPER-ELEMENT-ITERATOR-DISPOSE-IMPLEMENTATION");

    public static SubLObject red_new_implementation() {
        final SubLObject Xval = funcall($sym3$RED_NEW_IMPLEMENTATION_);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_reason_code_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_reason_sub_code_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_version_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_date_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym21$RED_GET_DATE_STRING_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_time_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym23$RED_GET_TIME_STRING_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_load_repository_implementation(final SubLObject red_struct, final SubLObject filename) {
        final SubLObject Xval = funcall($sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_, red_struct, filename);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_by_name_implementation(final SubLObject red_struct, final SubLObject name) {
        final SubLObject Xval = funcall($sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_, red_struct, name);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_name_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_filename_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_type_string_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_version_string_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_date_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_time_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_reasoncode_string_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_system_repository_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_machine_repository_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_repository_list_new_implementation(final SubLObject red_struct, final SubLObject number_elements) {
        final SubLObject Xval = funcall($sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_, red_struct, number_elements);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_make_repository_list_from_repository_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_application_repositories_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_list_most_privileged_first_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_repository_list_least_privileged_first_implementation(final SubLObject red_struct) {
        final SubLObject Xval = funcall($sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_, red_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_repository_list_get_element_implementation(final SubLObject red_repository_list_struct, final SubLObject index) {
        final SubLObject Xval = funcall($sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_, red_repository_list_struct, index);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_top_level_key_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = funcall($sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_, red_repository_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_element_by_key_implementation(final SubLObject red_element_struct, final SubLObject key) {
        final SubLObject Xval = funcall($sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_, red_element_struct, key);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_subkey_iterator_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = funcall($sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_, red_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_iterator_next_implementation(final SubLObject red_iterator_struct) {
        final SubLObject Xval = funcall($sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_, red_iterator_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_iterator_peek_implementation(final SubLObject red_iterator_struct) {
        final SubLObject Xval = funcall($sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_, red_iterator_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_key_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = funcall($sym115$RED_GET_KEY_IMPLEMENTATION_, red_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_datatype_string_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = funcall($sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_, red_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_red_element_repository_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = funcall($sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_, red_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_string_value_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = funcall($sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_, red_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_blob_value_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = funcall($sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_, red_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return $str13$;
        }
        return Xval;
    }

    public static SubLObject red_get_blob_value_internal(final SubLObject red_element_struct) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject blength = funcall(RED_GET_VALUE_SIZE_IMPLEMENTATION, red_element_struct);
        final SubLObject barray = foreign.vector_for_marshalling(blength, $FIXNUM, ZERO_INTEGER);
        funcall(RED_COPY_BLOB_VALUE_IMPLEMENTATION, red_element_struct, barray);
        return barray;
    }

    public static SubLObject red_get_blob_value_ext(final SubLObject red_element_struct) {
        foreign.ensure_foreign_shared_library_loaded($RED_SHARED, UNPROVIDED);
        final SubLObject val = red_get_blob_value_internal(red_element_struct);
        if (val.equal(ZERO_INTEGER)) {
            return NIL;
        }
        return val;
    }

    public static SubLObject red_get_extended_name_with_separator_implementation(final SubLObject red_element_struct, final SubLObject key, final SubLObject separator) {
        final SubLObject Xval = funcall($sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_, red_element_struct, key, separator);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_extended_name_with_period_separator_implementation(final SubLObject red_element_struct, final SubLObject key) {
        final SubLObject Xval = funcall($sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_, red_element_struct, key);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_top_level_super_element_implementation(final SubLObject red_repository_list_struct) {
        final SubLObject Xval = funcall($sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_, red_repository_list_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_super_element_by_key_implementation(final SubLObject red_super_element_struct, final SubLObject key) {
        final SubLObject Xval = funcall($sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_, red_super_element_struct, key);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_super_element_get_element_implementation(final SubLObject red_super_element_struct) {
        final SubLObject Xval = funcall($sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_, red_super_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_super_element_get_repository_list_implementation(final SubLObject red_super_element_struct) {
        final SubLObject Xval = funcall($sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_, red_super_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_extended_name_with_separator_list_implementation(final SubLObject red_super_element_struct, final SubLObject key, final SubLObject separator) {
        final SubLObject Xval = funcall($sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_, red_super_element_struct, key, separator);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_extended_name_with_period_separator_list_implementation(final SubLObject red_super_element_struct, final SubLObject key) {
        final SubLObject Xval = funcall($sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_, red_super_element_struct, key);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_get_super_element_iterator_implementation(final SubLObject red_super_element_struct) {
        final SubLObject Xval = funcall($sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_, red_super_element_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_super_element_iterator_next_implementation(final SubLObject red_super_element_iterator_struct) {
        final SubLObject Xval = funcall($sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_, red_super_element_iterator_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_super_element_iterator_peek_implementation(final SubLObject red_super_element_iterator_struct) {
        final SubLObject Xval = funcall($sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_, red_super_element_iterator_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject red_super_element_iterator_get_repository_list_implementation(final SubLObject red_super_element_iterator_struct) {
        final SubLObject Xval = funcall($sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_, red_super_element_iterator_struct);
        if (NIL != Alien.alien_null_ptrP(Xval, $C)) {
            return NIL;
        }
        return Xval;
    }

    public static SubLObject declare_red_implementation_file() {
        declareFunction(me, "red_new_implementation", "RED-NEW-IMPLEMENTATION", 0, 0, false);
        declareFunction(me, "red_get_reason_code_string_implementation", "RED-GET-REASON-CODE-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_reason_sub_code_string_implementation", "RED-GET-REASON-SUB-CODE-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_version_string_implementation", "RED-GET-VERSION-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_date_string_implementation", "RED-GET-DATE-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_time_string_implementation", "RED-GET-TIME-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_load_repository_implementation", "RED-LOAD-REPOSITORY-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_get_repository_by_name_implementation", "RED-GET-REPOSITORY-BY-NAME-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_get_repository_name_implementation", "RED-GET-REPOSITORY-NAME-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_filename_implementation", "RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_type_string_implementation", "RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_version_string_implementation", "RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_date_implementation", "RED-GET-REPOSITORY-DATE-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_time_implementation", "RED-GET-REPOSITORY-TIME-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_reasoncode_string_implementation", "RED-GET-REPOSITORY-REASONCODE-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_system_repository_implementation", "RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_machine_repository_implementation", "RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_repository_list_new_implementation", "RED-REPOSITORY-LIST-NEW-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_make_repository_list_from_repository_implementation", "RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_application_repositories_implementation", "RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_list_most_privileged_first_implementation", "RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_repository_list_least_privileged_first_implementation", "RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_repository_list_get_element_implementation", "RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_get_top_level_key_implementation", "RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_element_by_key_implementation", "RED-GET-ELEMENT-BY-KEY-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_get_subkey_iterator_implementation", "RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_iterator_next_implementation", "RED-ITERATOR-NEXT-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_iterator_peek_implementation", "RED-ITERATOR-PEEK-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_key_implementation", "RED-GET-KEY-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_datatype_string_implementation", "RED-GET-DATATYPE-STRING-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_red_element_repository_implementation", "RED-GET-RED-ELEMENT-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_string_value_implementation", "RED-GET-STRING-VALUE-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_blob_value_implementation", "RED-GET-BLOB-VALUE-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_blob_value_internal", "RED-GET-BLOB-VALUE-INTERNAL", 1, 0, false);
        declareFunction(me, "red_get_blob_value_ext", "RED-GET-BLOB-VALUE-EXT", 1, 0, false);
        declareFunction(me, "red_get_extended_name_with_separator_implementation", "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-IMPLEMENTATION", 3, 0, false);
        declareFunction(me, "red_get_extended_name_with_period_separator_implementation", "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_get_top_level_super_element_implementation", "RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_super_element_by_key_implementation", "RED-GET-SUPER-ELEMENT-BY-KEY-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_super_element_get_element_implementation", "RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_super_element_get_repository_list_implementation", "RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_get_extended_name_with_separator_list_implementation", "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-LIST-IMPLEMENTATION", 3, 0, false);
        declareFunction(me, "red_get_extended_name_with_period_separator_list_implementation", "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION", 2, 0, false);
        declareFunction(me, "red_get_super_element_iterator_implementation", "RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_super_element_iterator_next_implementation", "RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_super_element_iterator_peek_implementation", "RED-SUPER-ELEMENT-ITERATOR-PEEK-IMPLEMENTATION", 1, 0, false);
        declareFunction(me, "red_super_element_iterator_get_repository_list_implementation", "RED-SUPER-ELEMENT-ITERATOR-GET-REPOSITORY-LIST-IMPLEMENTATION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_red_implementation_file() {
        return NIL;
    }

    public static SubLObject setup_red_implementation_file() {
        foreign.declare_foreign_shared_library($RED_SHARED, $list1);
        Alien.def_foreign_function($RED_SHARED, $$$RedNew, $sym3$RED_NEW_IMPLEMENTATION_, NIL, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetReasonCode, RED_GET_REASON_CODE_IMPLEMENTATION, $list8, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetReasonCodeString, $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_, $list8, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetReasonSubCode, RED_GET_REASON_SUB_CODE_IMPLEMENTATION, $list8, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetReasonSubCodeString, $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_, $list8, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetVersionString, $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_, $list8, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetDate, $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_, $list8, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetTime, $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_, $list8, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedDispose, RED_DISPOSE_IMPLEMENTATION, $list8, NIL, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedLoadRedRepositoryFilename, $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_, $list28, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedLoadRedRepositoryFilename, $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_, $list30, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryDispose, RED_REPOSITORY_DISPOSE_IMPLEMENTATION, $list33, NIL, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedValueExists, RED_VALUE_EXISTS_IMPLEMENTATION, $list33, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryName, $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryFilename, $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryTypeString, $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryVersionString, $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryDate, $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryPointerValid, RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, $list48, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryVersionMajor, RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION, $list33, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryVersionMinor, RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION, $list33, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryVersionFix, RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION, $list33, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryVersionSpin, RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION, $list33, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryTime, $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryIsValid, RED_IS_VALID_IMPLEMENTATION, $list33, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryReasonCodeString, $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_, $list33, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedNumberRepositories, RED_NUMBER_REPOSITORIES_IMPLEMENTATION, $list8, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedNumberApplicationRepositories, RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, $list8, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetSystemRepository, $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_, $list8, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetMachineRepository, $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_, $list8, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryListNew, $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_, $list73, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str74$RedMakeRepositoryListFromReposito, $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_, $list33, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetApplicationRepositories, $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_, $list8, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str78$RedGetRepositoryListMostPrivilege, $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_, $list8, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str80$RedGetRepositoryListLeastPrivileg, $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_, $list8, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryListDispose, RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION, $list84, NIL, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRepositoryListLength, RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION, $list84, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryListGetElement, $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_, $list89, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedRepositoryListAddRepository, RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, $list92, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str93$RedRepositoryListGetMaxRepositori, RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION, $list84, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetTopLevelKey, $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_, $list33, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetElementByKey, $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_, $list99, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedElementNumberSubKeys, RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION, $list102, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetSubKeyIterator, $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_, $list102, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedIteratorDispose, RED_ITERATOR_DISPOSE_IMPLEMENTATION, $list107, NIL, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedIteratorHasNext, RED_ITERATOR_HAS_NEXT_IMPLEMENTATION, $list107, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedIteratorNext, $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_, $list107, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedIteratorPeek, $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_, $list107, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetKey, $sym115$RED_GET_KEY_IMPLEMENTATION_, $list102, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetDataTypeString, $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_, $list102, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetValueSize, RED_GET_VALUE_SIZE_IMPLEMENTATION, $list102, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetRedElementRepository, $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_, $list102, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetStringValue, $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_, $list102, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetBlobValue, $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_, $list102, $list12, $C, $str13$);
        Alien.def_foreign_function($RED_SHARED, $$$RedCopyBlobValue, RED_COPY_BLOB_VALUE_IMPLEMENTATION, $list128, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetIntValue32, RED_GET_INT32_VALUE_IMPLEMENTATION, $list102, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetExtendedNameWithSeparator, $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_, $list134, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str135$RedGetExtendedNameWithPeriodSepar, $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_, $list99, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetTopLevelSuperElement, $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_, $list84, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetSuperElementByKey, $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_, $list141, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementSubkeyExists, RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION, $list141, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementGetElement, $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_, $list146, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementGetRepositoryList, $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_, $list146, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementDispose, RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, $list146, NIL, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str151$RedGetExtendedNameWithSeparatorLi, $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_, $list153, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str154$RedGetExtendedNameWithPeriodSepar, $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_, $list141, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedGetSuperElementIterator, $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_, $list146, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementIteratorHasNext, RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION, $list160, $INT32, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementIteratorNext, $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_, $list160, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementIteratorPeek, $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_, $list160, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $str165$RedSuperElementIteratorGetReposit, $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_, $list160, $OPAQUE, $C, NIL);
        Alien.def_foreign_function($RED_SHARED, $$$RedSuperElementIteratorDispose, RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION, $list160, NIL, $C, NIL);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_red_implementation_file();
    }

    @Override
    public void initializeVariables() {
        init_red_implementation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_red_implementation_file();
    }

    static {










































































































































































    }
}

/**
 * Total time: 216 ms
 */

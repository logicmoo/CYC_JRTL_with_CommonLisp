package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.foreign;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Alien;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class red_implementation extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.red_implementation";
    public static final String myFingerPrint = "f860563e19f1ba0eb8e957f483ba4c3883c19df19bbf5dee6736f95c20a91237";
    private static final SubLSymbol $kw0$RED_SHARED;
    private static final SubLList $list1;
    private static final SubLString $str2$RedNew;
    private static final SubLSymbol $sym3$RED_NEW_IMPLEMENTATION_;
    private static final SubLSymbol $kw4$OPAQUE;
    private static final SubLSymbol $kw5$C;
    private static final SubLString $str6$RedGetReasonCode;
    private static final SubLSymbol $sym7$RED_GET_REASON_CODE_IMPLEMENTATION;
    private static final SubLList $list8;
    private static final SubLSymbol $kw9$INT32;
    private static final SubLString $str10$RedGetReasonCodeString;
    private static final SubLSymbol $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_;
    private static final SubLList $list12;
    private static final SubLString $str13$;
    private static final SubLString $str14$RedGetReasonSubCode;
    private static final SubLSymbol $sym15$RED_GET_REASON_SUB_CODE_IMPLEMENTATION;
    private static final SubLString $str16$RedGetReasonSubCodeString;
    private static final SubLSymbol $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_;
    private static final SubLString $str18$RedGetVersionString;
    private static final SubLSymbol $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_;
    private static final SubLString $str20$RedGetDate;
    private static final SubLSymbol $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_;
    private static final SubLString $str22$RedGetTime;
    private static final SubLSymbol $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_;
    private static final SubLString $str24$RedDispose;
    private static final SubLSymbol $sym25$RED_DISPOSE_IMPLEMENTATION;
    private static final SubLString $str26$RedLoadRedRepositoryFilename;
    private static final SubLSymbol $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_;
    private static final SubLList $list30;
    private static final SubLString $str31$RedRepositoryDispose;
    private static final SubLSymbol $sym32$RED_REPOSITORY_DISPOSE_IMPLEMENTATION;
    private static final SubLList $list33;
    private static final SubLString $str34$RedValueExists;
    private static final SubLSymbol $sym35$RED_VALUE_EXISTS_IMPLEMENTATION;
    private static final SubLString $str36$RedGetRepositoryName;
    private static final SubLSymbol $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_;
    private static final SubLString $str38$RedGetRepositoryFilename;
    private static final SubLSymbol $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_;
    private static final SubLString $str40$RedGetRepositoryTypeString;
    private static final SubLSymbol $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_;
    private static final SubLString $str42$RedGetRepositoryVersionString;
    private static final SubLSymbol $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_;
    private static final SubLString $str44$RedGetRepositoryDate;
    private static final SubLSymbol $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_;
    private static final SubLString $str46$RedRepositoryPointerValid;
    private static final SubLSymbol $sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION;
    private static final SubLList $list48;
    private static final SubLString $str49$RedGetRepositoryVersionMajor;
    private static final SubLSymbol $sym50$RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION;
    private static final SubLString $str51$RedGetRepositoryVersionMinor;
    private static final SubLSymbol $sym52$RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION;
    private static final SubLString $str53$RedGetRepositoryVersionFix;
    private static final SubLSymbol $sym54$RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION;
    private static final SubLString $str55$RedGetRepositoryVersionSpin;
    private static final SubLSymbol $sym56$RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION;
    private static final SubLString $str57$RedGetRepositoryTime;
    private static final SubLSymbol $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_;
    private static final SubLString $str59$RedRepositoryIsValid;
    private static final SubLSymbol $sym60$RED_IS_VALID_IMPLEMENTATION;
    private static final SubLString $str61$RedGetRepositoryReasonCodeString;
    private static final SubLSymbol $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_;
    private static final SubLString $str63$RedNumberRepositories;
    private static final SubLSymbol $sym64$RED_NUMBER_REPOSITORIES_IMPLEMENTATION;
    private static final SubLString $str65$RedNumberApplicationRepositories;
    private static final SubLSymbol $sym66$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION;
    private static final SubLString $str67$RedGetSystemRepository;
    private static final SubLSymbol $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_;
    private static final SubLString $str69$RedGetMachineRepository;
    private static final SubLSymbol $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_;
    private static final SubLString $str71$RedRepositoryListNew;
    private static final SubLSymbol $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_;
    private static final SubLList $list73;
    private static final SubLString $str74$RedMakeRepositoryListFromReposito;
    private static final SubLSymbol $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_;
    private static final SubLString $str76$RedGetApplicationRepositories;
    private static final SubLSymbol $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_;
    private static final SubLString $str78$RedGetRepositoryListMostPrivilege;
    private static final SubLSymbol $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_;
    private static final SubLString $str80$RedGetRepositoryListLeastPrivileg;
    private static final SubLSymbol $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_;
    private static final SubLString $str82$RedRepositoryListDispose;
    private static final SubLSymbol $sym83$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION;
    private static final SubLList $list84;
    private static final SubLString $str85$RedGetRepositoryListLength;
    private static final SubLSymbol $sym86$RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION;
    private static final SubLString $str87$RedRepositoryListGetElement;
    private static final SubLSymbol $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_;
    private static final SubLList $list89;
    private static final SubLString $str90$RedRepositoryListAddRepository;
    private static final SubLSymbol $sym91$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION;
    private static final SubLList $list92;
    private static final SubLString $str93$RedRepositoryListGetMaxRepositori;
    private static final SubLSymbol $sym94$RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION;
    private static final SubLString $str95$RedGetTopLevelKey;
    private static final SubLSymbol $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_;
    private static final SubLString $str97$RedGetElementByKey;
    private static final SubLSymbol $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_;
    private static final SubLList $list99;
    private static final SubLString $str100$RedElementNumberSubKeys;
    private static final SubLSymbol $sym101$RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION;
    private static final SubLList $list102;
    private static final SubLString $str103$RedGetSubKeyIterator;
    private static final SubLSymbol $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_;
    private static final SubLString $str105$RedIteratorDispose;
    private static final SubLSymbol $sym106$RED_ITERATOR_DISPOSE_IMPLEMENTATION;
    private static final SubLList $list107;
    private static final SubLString $str108$RedIteratorHasNext;
    private static final SubLSymbol $sym109$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION;
    private static final SubLString $str110$RedIteratorNext;
    private static final SubLSymbol $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_;
    private static final SubLString $str112$RedIteratorPeek;
    private static final SubLSymbol $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_;
    private static final SubLString $str114$RedGetKey;
    private static final SubLSymbol $sym115$RED_GET_KEY_IMPLEMENTATION_;
    private static final SubLString $str116$RedGetDataTypeString;
    private static final SubLSymbol $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_;
    private static final SubLString $str118$RedGetValueSize;
    private static final SubLSymbol $sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION;
    private static final SubLString $str120$RedGetRedElementRepository;
    private static final SubLSymbol $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_;
    private static final SubLString $str122$RedGetStringValue;
    private static final SubLSymbol $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_;
    private static final SubLString $str124$RedGetBlobValue;
    private static final SubLSymbol $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_;
    private static final SubLString $str126$RedCopyBlobValue;
    private static final SubLSymbol $sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION;
    private static final SubLList $list128;
    private static final SubLSymbol $kw129$FIXNUM;
    private static final SubLString $str130$RedGetIntValue32;
    private static final SubLSymbol $sym131$RED_GET_INT32_VALUE_IMPLEMENTATION;
    private static final SubLString $str132$RedGetExtendedNameWithSeparator;
    private static final SubLSymbol $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_;
    private static final SubLList $list134;
    private static final SubLString $str135$RedGetExtendedNameWithPeriodSepar;
    private static final SubLSymbol $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_;
    private static final SubLString $str137$RedGetTopLevelSuperElement;
    private static final SubLSymbol $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_;
    private static final SubLString $str139$RedGetSuperElementByKey;
    private static final SubLSymbol $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_;
    private static final SubLList $list141;
    private static final SubLString $str142$RedSuperElementSubkeyExists;
    private static final SubLSymbol $sym143$RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION;
    private static final SubLString $str144$RedSuperElementGetElement;
    private static final SubLSymbol $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_;
    private static final SubLList $list146;
    private static final SubLString $str147$RedSuperElementGetRepositoryList;
    private static final SubLSymbol $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_;
    private static final SubLString $str149$RedSuperElementDispose;
    private static final SubLSymbol $sym150$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION;
    private static final SubLString $str151$RedGetExtendedNameWithSeparatorLi;
    private static final SubLSymbol $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_;
    private static final SubLList $list153;
    private static final SubLString $str154$RedGetExtendedNameWithPeriodSepar;
    private static final SubLSymbol $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_;
    private static final SubLString $str156$RedGetSuperElementIterator;
    private static final SubLSymbol $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_;
    private static final SubLString $str158$RedSuperElementIteratorHasNext;
    private static final SubLSymbol $sym159$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION;
    private static final SubLList $list160;
    private static final SubLString $str161$RedSuperElementIteratorNext;
    private static final SubLSymbol $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_;
    private static final SubLString $str163$RedSuperElementIteratorPeek;
    private static final SubLSymbol $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_;
    private static final SubLString $str165$RedSuperElementIteratorGetReposit;
    private static final SubLSymbol $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_;
    private static final SubLString $str167$RedSuperElementIteratorDispose;
    private static final SubLSymbol $sym168$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION;
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 1275L)
    public static SubLObject red_new_implementation() {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym3$RED_NEW_IMPLEMENTATION_);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 2710L)
    public static SubLObject red_get_reason_code_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 4638L)
    public static SubLObject red_get_reason_sub_code_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 5050L)
    public static SubLObject red_get_version_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 5525L)
    public static SubLObject red_get_date_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym21$RED_GET_DATE_STRING_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 5913L)
    public static SubLObject red_get_time_string_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym23$RED_GET_TIME_STRING_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 6696L)
    public static SubLObject red_load_repository_implementation(final SubLObject red_struct, final SubLObject filename) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_, red_struct, filename);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 7335L)
    public static SubLObject red_get_repository_by_name_implementation(final SubLObject red_struct, final SubLObject name) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_, red_struct, name);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 8666L)
    public static SubLObject red_get_repository_name_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 9089L)
    public static SubLObject red_get_repository_filename_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 9525L)
    public static SubLObject red_get_repository_type_string_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 10046L)
    public static SubLObject red_get_repository_version_string_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 10583L)
    public static SubLObject red_get_repository_date_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 13400L)
    public static SubLObject red_get_repository_time_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 14229L)
    public static SubLObject red_get_repository_reasoncode_string_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 16835L)
    public static SubLObject red_get_system_repository_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 17234L)
    public static SubLObject red_get_machine_repository_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 17640L)
    public static SubLObject red_repository_list_new_implementation(final SubLObject red_struct, final SubLObject number_elements) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_, red_struct, number_elements);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 18153L)
    public static SubLObject red_make_repository_list_from_repository_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 18628L)
    public static SubLObject red_get_application_repositories_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 19193L)
    public static SubLObject red_get_repository_list_most_privileged_first_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 19650L)
    public static SubLObject red_get_repository_list_least_privileged_first_implementation(final SubLObject red_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_, red_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 21081L)
    public static SubLObject red_repository_list_get_element_implementation(final SubLObject red_repository_list_struct, final SubLObject index) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_, red_repository_list_struct, index);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 22587L)
    public static SubLObject red_get_top_level_key_implementation(final SubLObject red_repository_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_, red_repository_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 23066L)
    public static SubLObject red_get_element_by_key_implementation(final SubLObject red_element_struct, final SubLObject key) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_, red_element_struct, key);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 23999L)
    public static SubLObject red_get_subkey_iterator_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_, red_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 25276L)
    public static SubLObject red_iterator_next_implementation(final SubLObject red_iterator_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_, red_iterator_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 25705L)
    public static SubLObject red_iterator_peek_implementation(final SubLObject red_iterator_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_, red_iterator_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 26134L)
    public static SubLObject red_get_key_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym115$RED_GET_KEY_IMPLEMENTATION_, red_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 26550L)
    public static SubLObject red_get_datatype_string_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_, red_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 27504L)
    public static SubLObject red_get_red_element_repository_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_, red_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 27971L)
    public static SubLObject red_get_string_value_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_, red_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 28378L)
    public static SubLObject red_get_blob_value_implementation(final SubLObject red_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_, red_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.$str13$;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 29255L)
    public static SubLObject red_get_blob_value_internal(final SubLObject red_element_struct) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.UNPROVIDED);
        final SubLObject blength = Functions.funcall((SubLObject)red_implementation.$sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION, red_element_struct);
        final SubLObject barray = foreign.vector_for_marshalling(blength, (SubLObject)red_implementation.$kw129$FIXNUM, (SubLObject)red_implementation.ZERO_INTEGER);
        Functions.funcall((SubLObject)red_implementation.$sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION, red_element_struct, barray);
        return barray;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 29857L)
    public static SubLObject red_get_blob_value_ext(final SubLObject red_element_struct) {
        foreign.ensure_foreign_shared_library_loaded((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.UNPROVIDED);
        final SubLObject val = red_get_blob_value_internal(red_element_struct);
        if (val.equal((SubLObject)red_implementation.ZERO_INTEGER)) {
            return (SubLObject)red_implementation.NIL;
        }
        return val;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 31206L)
    public static SubLObject red_get_extended_name_with_separator_implementation(final SubLObject red_element_struct, final SubLObject key, final SubLObject separator) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_, red_element_struct, key, separator);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 32047L)
    public static SubLObject red_get_extended_name_with_period_separator_implementation(final SubLObject red_element_struct, final SubLObject key) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_, red_element_struct, key);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 32626L)
    public static SubLObject red_get_top_level_super_element_implementation(final SubLObject red_repository_list_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_, red_repository_list_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 33154L)
    public static SubLObject red_get_super_element_by_key_implementation(final SubLObject red_super_element_struct, final SubLObject key) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_, red_super_element_struct, key);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 34184L)
    public static SubLObject red_super_element_get_element_implementation(final SubLObject red_super_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_, red_super_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 34626L)
    public static SubLObject red_super_element_get_repository_list_implementation(final SubLObject red_super_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_, red_super_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 35510L)
    public static SubLObject red_get_extended_name_with_separator_list_implementation(final SubLObject red_super_element_struct, final SubLObject key, final SubLObject separator) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_, red_super_element_struct, key, separator);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 36384L)
    public static SubLObject red_get_extended_name_with_period_separator_list_implementation(final SubLObject red_super_element_struct, final SubLObject key) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_, red_super_element_struct, key);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 36947L)
    public static SubLObject red_get_super_element_iterator_implementation(final SubLObject red_super_element_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_, red_super_element_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 37916L)
    public static SubLObject red_super_element_iterator_next_implementation(final SubLObject red_super_element_iterator_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_, red_super_element_iterator_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 38397L)
    public static SubLObject red_super_element_iterator_peek_implementation(final SubLObject red_super_element_iterator_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_, red_super_element_iterator_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 38909L)
    public static SubLObject red_super_element_iterator_get_repository_list_implementation(final SubLObject red_super_element_iterator_struct) {
        final SubLObject Xval = Functions.funcall((SubLObject)red_implementation.$sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_, red_super_element_iterator_struct);
        if (red_implementation.NIL != Alien.alien_null_ptrP(Xval, (SubLObject)red_implementation.$kw5$C)) {
            return (SubLObject)red_implementation.NIL;
        }
        return Xval;
    }
    
    public static SubLObject declare_red_implementation_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_new_implementation", "RED-NEW-IMPLEMENTATION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_reason_code_string_implementation", "RED-GET-REASON-CODE-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_reason_sub_code_string_implementation", "RED-GET-REASON-SUB-CODE-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_version_string_implementation", "RED-GET-VERSION-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_date_string_implementation", "RED-GET-DATE-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_time_string_implementation", "RED-GET-TIME-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_load_repository_implementation", "RED-LOAD-REPOSITORY-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_by_name_implementation", "RED-GET-REPOSITORY-BY-NAME-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_name_implementation", "RED-GET-REPOSITORY-NAME-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_filename_implementation", "RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_type_string_implementation", "RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_version_string_implementation", "RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_date_implementation", "RED-GET-REPOSITORY-DATE-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_time_implementation", "RED-GET-REPOSITORY-TIME-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_reasoncode_string_implementation", "RED-GET-REPOSITORY-REASONCODE-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_system_repository_implementation", "RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_machine_repository_implementation", "RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_repository_list_new_implementation", "RED-REPOSITORY-LIST-NEW-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_make_repository_list_from_repository_implementation", "RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_application_repositories_implementation", "RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_list_most_privileged_first_implementation", "RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_repository_list_least_privileged_first_implementation", "RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_repository_list_get_element_implementation", "RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_top_level_key_implementation", "RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_element_by_key_implementation", "RED-GET-ELEMENT-BY-KEY-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_subkey_iterator_implementation", "RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_iterator_next_implementation", "RED-ITERATOR-NEXT-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_iterator_peek_implementation", "RED-ITERATOR-PEEK-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_key_implementation", "RED-GET-KEY-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_datatype_string_implementation", "RED-GET-DATATYPE-STRING-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_red_element_repository_implementation", "RED-GET-RED-ELEMENT-REPOSITORY-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_string_value_implementation", "RED-GET-STRING-VALUE-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_blob_value_implementation", "RED-GET-BLOB-VALUE-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_blob_value_internal", "RED-GET-BLOB-VALUE-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_blob_value_ext", "RED-GET-BLOB-VALUE-EXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_extended_name_with_separator_implementation", "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-IMPLEMENTATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_extended_name_with_period_separator_implementation", "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_top_level_super_element_implementation", "RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_super_element_by_key_implementation", "RED-GET-SUPER-ELEMENT-BY-KEY-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_super_element_get_element_implementation", "RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_super_element_get_repository_list_implementation", "RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_extended_name_with_separator_list_implementation", "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-LIST-IMPLEMENTATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_extended_name_with_period_separator_list_implementation", "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_get_super_element_iterator_implementation", "RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_super_element_iterator_next_implementation", "RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_super_element_iterator_peek_implementation", "RED-SUPER-ELEMENT-ITERATOR-PEEK-IMPLEMENTATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.red_implementation", "red_super_element_iterator_get_repository_list_implementation", "RED-SUPER-ELEMENT-ITERATOR-GET-REPOSITORY-LIST-IMPLEMENTATION", 1, 0, false);
        return (SubLObject)red_implementation.NIL;
    }
    
    public static SubLObject init_red_implementation_file() {
        return (SubLObject)red_implementation.NIL;
    }
    
    public static SubLObject setup_red_implementation_file() {
        foreign.declare_foreign_shared_library((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$list1);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str2$RedNew, (SubLObject)red_implementation.$sym3$RED_NEW_IMPLEMENTATION_, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str6$RedGetReasonCode, (SubLObject)red_implementation.$sym7$RED_GET_REASON_CODE_IMPLEMENTATION, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str10$RedGetReasonCodeString, (SubLObject)red_implementation.$sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str14$RedGetReasonSubCode, (SubLObject)red_implementation.$sym15$RED_GET_REASON_SUB_CODE_IMPLEMENTATION, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str16$RedGetReasonSubCodeString, (SubLObject)red_implementation.$sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str18$RedGetVersionString, (SubLObject)red_implementation.$sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str20$RedGetDate, (SubLObject)red_implementation.$sym21$RED_GET_DATE_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str22$RedGetTime, (SubLObject)red_implementation.$sym23$RED_GET_TIME_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str24$RedDispose, (SubLObject)red_implementation.$sym25$RED_DISPOSE_IMPLEMENTATION, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str26$RedLoadRedRepositoryFilename, (SubLObject)red_implementation.$sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_, (SubLObject)red_implementation.$list28, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str26$RedLoadRedRepositoryFilename, (SubLObject)red_implementation.$sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_, (SubLObject)red_implementation.$list30, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str31$RedRepositoryDispose, (SubLObject)red_implementation.$sym32$RED_REPOSITORY_DISPOSE_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str34$RedValueExists, (SubLObject)red_implementation.$sym35$RED_VALUE_EXISTS_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str36$RedGetRepositoryName, (SubLObject)red_implementation.$sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str38$RedGetRepositoryFilename, (SubLObject)red_implementation.$sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str40$RedGetRepositoryTypeString, (SubLObject)red_implementation.$sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str42$RedGetRepositoryVersionString, (SubLObject)red_implementation.$sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str44$RedGetRepositoryDate, (SubLObject)red_implementation.$sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str46$RedRepositoryPointerValid, (SubLObject)red_implementation.$sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, (SubLObject)red_implementation.$list48, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str49$RedGetRepositoryVersionMajor, (SubLObject)red_implementation.$sym50$RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str51$RedGetRepositoryVersionMinor, (SubLObject)red_implementation.$sym52$RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str53$RedGetRepositoryVersionFix, (SubLObject)red_implementation.$sym54$RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str55$RedGetRepositoryVersionSpin, (SubLObject)red_implementation.$sym56$RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str57$RedGetRepositoryTime, (SubLObject)red_implementation.$sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str59$RedRepositoryIsValid, (SubLObject)red_implementation.$sym60$RED_IS_VALID_IMPLEMENTATION, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str61$RedGetRepositoryReasonCodeString, (SubLObject)red_implementation.$sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str63$RedNumberRepositories, (SubLObject)red_implementation.$sym64$RED_NUMBER_REPOSITORIES_IMPLEMENTATION, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str65$RedNumberApplicationRepositories, (SubLObject)red_implementation.$sym66$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str67$RedGetSystemRepository, (SubLObject)red_implementation.$sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str69$RedGetMachineRepository, (SubLObject)red_implementation.$sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str71$RedRepositoryListNew, (SubLObject)red_implementation.$sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_, (SubLObject)red_implementation.$list73, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str74$RedMakeRepositoryListFromReposito, (SubLObject)red_implementation.$sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str76$RedGetApplicationRepositories, (SubLObject)red_implementation.$sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str78$RedGetRepositoryListMostPrivilege, (SubLObject)red_implementation.$sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str80$RedGetRepositoryListLeastPrivileg, (SubLObject)red_implementation.$sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_, (SubLObject)red_implementation.$list8, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str82$RedRepositoryListDispose, (SubLObject)red_implementation.$sym83$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION, (SubLObject)red_implementation.$list84, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str85$RedGetRepositoryListLength, (SubLObject)red_implementation.$sym86$RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION, (SubLObject)red_implementation.$list84, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str87$RedRepositoryListGetElement, (SubLObject)red_implementation.$sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_, (SubLObject)red_implementation.$list89, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str90$RedRepositoryListAddRepository, (SubLObject)red_implementation.$sym91$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, (SubLObject)red_implementation.$list92, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str93$RedRepositoryListGetMaxRepositori, (SubLObject)red_implementation.$sym94$RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION, (SubLObject)red_implementation.$list84, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str95$RedGetTopLevelKey, (SubLObject)red_implementation.$sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_, (SubLObject)red_implementation.$list33, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str97$RedGetElementByKey, (SubLObject)red_implementation.$sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_, (SubLObject)red_implementation.$list99, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str100$RedElementNumberSubKeys, (SubLObject)red_implementation.$sym101$RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str103$RedGetSubKeyIterator, (SubLObject)red_implementation.$sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str105$RedIteratorDispose, (SubLObject)red_implementation.$sym106$RED_ITERATOR_DISPOSE_IMPLEMENTATION, (SubLObject)red_implementation.$list107, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str108$RedIteratorHasNext, (SubLObject)red_implementation.$sym109$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION, (SubLObject)red_implementation.$list107, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str110$RedIteratorNext, (SubLObject)red_implementation.$sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_, (SubLObject)red_implementation.$list107, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str112$RedIteratorPeek, (SubLObject)red_implementation.$sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_, (SubLObject)red_implementation.$list107, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str114$RedGetKey, (SubLObject)red_implementation.$sym115$RED_GET_KEY_IMPLEMENTATION_, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str116$RedGetDataTypeString, (SubLObject)red_implementation.$sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str118$RedGetValueSize, (SubLObject)red_implementation.$sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str120$RedGetRedElementRepository, (SubLObject)red_implementation.$sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str122$RedGetStringValue, (SubLObject)red_implementation.$sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str124$RedGetBlobValue, (SubLObject)red_implementation.$sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$list12, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.$str13$);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str126$RedCopyBlobValue, (SubLObject)red_implementation.$sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION, (SubLObject)red_implementation.$list128, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str130$RedGetIntValue32, (SubLObject)red_implementation.$sym131$RED_GET_INT32_VALUE_IMPLEMENTATION, (SubLObject)red_implementation.$list102, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str132$RedGetExtendedNameWithSeparator, (SubLObject)red_implementation.$sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_, (SubLObject)red_implementation.$list134, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str135$RedGetExtendedNameWithPeriodSepar, (SubLObject)red_implementation.$sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_, (SubLObject)red_implementation.$list99, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str137$RedGetTopLevelSuperElement, (SubLObject)red_implementation.$sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_, (SubLObject)red_implementation.$list84, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str139$RedGetSuperElementByKey, (SubLObject)red_implementation.$sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_, (SubLObject)red_implementation.$list141, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str142$RedSuperElementSubkeyExists, (SubLObject)red_implementation.$sym143$RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION, (SubLObject)red_implementation.$list141, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str144$RedSuperElementGetElement, (SubLObject)red_implementation.$sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_, (SubLObject)red_implementation.$list146, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str147$RedSuperElementGetRepositoryList, (SubLObject)red_implementation.$sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_, (SubLObject)red_implementation.$list146, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str149$RedSuperElementDispose, (SubLObject)red_implementation.$sym150$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, (SubLObject)red_implementation.$list146, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str151$RedGetExtendedNameWithSeparatorLi, (SubLObject)red_implementation.$sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_, (SubLObject)red_implementation.$list153, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str154$RedGetExtendedNameWithPeriodSepar, (SubLObject)red_implementation.$sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_, (SubLObject)red_implementation.$list141, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str156$RedGetSuperElementIterator, (SubLObject)red_implementation.$sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_, (SubLObject)red_implementation.$list146, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str158$RedSuperElementIteratorHasNext, (SubLObject)red_implementation.$sym159$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION, (SubLObject)red_implementation.$list160, (SubLObject)red_implementation.$kw9$INT32, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str161$RedSuperElementIteratorNext, (SubLObject)red_implementation.$sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_, (SubLObject)red_implementation.$list160, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str163$RedSuperElementIteratorPeek, (SubLObject)red_implementation.$sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_, (SubLObject)red_implementation.$list160, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str165$RedSuperElementIteratorGetReposit, (SubLObject)red_implementation.$sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_, (SubLObject)red_implementation.$list160, (SubLObject)red_implementation.$kw4$OPAQUE, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        Alien.def_foreign_function((SubLObject)red_implementation.$kw0$RED_SHARED, (SubLObject)red_implementation.$str167$RedSuperElementIteratorDispose, (SubLObject)red_implementation.$sym168$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION, (SubLObject)red_implementation.$list160, (SubLObject)red_implementation.NIL, (SubLObject)red_implementation.$kw5$C, (SubLObject)red_implementation.NIL);
        return (SubLObject)red_implementation.NIL;
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
        me = (SubLFile)new red_implementation();
        $kw0$RED_SHARED = SubLObjectFactory.makeKeyword("RED-SHARED");
        $list1 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COMMENT"), SubLObjectFactory.makeString("RED Cyc Configuration Repository"), SubLObjectFactory.makeKeyword("AUTHOR"), SubLObjectFactory.makeString("Chester John <cjohn@cyc.com>"), SubLObjectFactory.makeKeyword("FILENAME"), SubLObjectFactory.makeString("RED Library (auto-loaded)"), SubLObjectFactory.makeKeyword("DEPENDS-ON"), red_implementation.NIL, SubLObjectFactory.makeKeyword("COPYRIGHT"), SubLObjectFactory.makeString("Copyright (c) 2004 - 2006 Cycorp Inc."), SubLObjectFactory.makeKeyword("URI"), SubLObjectFactory.makeString("http://www.opencyc.com") });
        $str2$RedNew = SubLObjectFactory.makeString("RedNew");
        $sym3$RED_NEW_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-NEW-IMPLEMENTATION%");
        $kw4$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $kw5$C = SubLObjectFactory.makeKeyword("C");
        $str6$RedGetReasonCode = SubLObjectFactory.makeString("RedGetReasonCode");
        $sym7$RED_GET_REASON_CODE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REASON-CODE-IMPLEMENTATION");
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $kw9$INT32 = SubLObjectFactory.makeKeyword("INT32");
        $str10$RedGetReasonCodeString = SubLObjectFactory.makeString("RedGetReasonCodeString");
        $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REASON-CODE-STRING-IMPLEMENTATION%");
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR"));
        $str13$ = SubLObjectFactory.makeString("");
        $str14$RedGetReasonSubCode = SubLObjectFactory.makeString("RedGetReasonSubCode");
        $sym15$RED_GET_REASON_SUB_CODE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REASON-SUB-CODE-IMPLEMENTATION");
        $str16$RedGetReasonSubCodeString = SubLObjectFactory.makeString("RedGetReasonSubCodeString");
        $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REASON-SUB-CODE-STRING-IMPLEMENTATION%");
        $str18$RedGetVersionString = SubLObjectFactory.makeString("RedGetVersionString");
        $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-VERSION-STRING-IMPLEMENTATION%");
        $str20$RedGetDate = SubLObjectFactory.makeString("RedGetDate");
        $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-DATE-STRING-IMPLEMENTATION%");
        $str22$RedGetTime = SubLObjectFactory.makeString("RedGetTime");
        $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-TIME-STRING-IMPLEMENTATION%");
        $str24$RedDispose = SubLObjectFactory.makeString("RedDispose");
        $sym25$RED_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-DISPOSE-IMPLEMENTATION");
        $str26$RedLoadRedRepositoryFilename = SubLObjectFactory.makeString("RedLoadRedRepositoryFilename");
        $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-LOAD-REPOSITORY-IMPLEMENTATION%");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FILENAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-BY-NAME-IMPLEMENTATION%");
        $list30 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $str31$RedRepositoryDispose = SubLObjectFactory.makeString("RedRepositoryDispose");
        $sym32$RED_REPOSITORY_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-DISPOSE-IMPLEMENTATION");
        $list33 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str34$RedValueExists = SubLObjectFactory.makeString("RedValueExists");
        $sym35$RED_VALUE_EXISTS_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-VALUE-EXISTS-IMPLEMENTATION");
        $str36$RedGetRepositoryName = SubLObjectFactory.makeString("RedGetRepositoryName");
        $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-NAME-IMPLEMENTATION%");
        $str38$RedGetRepositoryFilename = SubLObjectFactory.makeString("RedGetRepositoryFilename");
        $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION%");
        $str40$RedGetRepositoryTypeString = SubLObjectFactory.makeString("RedGetRepositoryTypeString");
        $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION%");
        $str42$RedGetRepositoryVersionString = SubLObjectFactory.makeString("RedGetRepositoryVersionString");
        $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION%");
        $str44$RedGetRepositoryDate = SubLObjectFactory.makeString("RedGetRepositoryDate");
        $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-DATE-IMPLEMENTATION%");
        $str46$RedRepositoryPointerValid = SubLObjectFactory.makeString("RedRepositoryPointerValid");
        $sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-POINTER-VALID-IMPLEMENTATION");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str49$RedGetRepositoryVersionMajor = SubLObjectFactory.makeString("RedGetRepositoryVersionMajor");
        $sym50$RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-VERSION-MAJOR-IMPLEMENTATION");
        $str51$RedGetRepositoryVersionMinor = SubLObjectFactory.makeString("RedGetRepositoryVersionMinor");
        $sym52$RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-VERSION-MINOR-IMPLEMENTATION");
        $str53$RedGetRepositoryVersionFix = SubLObjectFactory.makeString("RedGetRepositoryVersionFix");
        $sym54$RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-VERSION-FIX-IMPLEMENTATION");
        $str55$RedGetRepositoryVersionSpin = SubLObjectFactory.makeString("RedGetRepositoryVersionSpin");
        $sym56$RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-VERSION-SPIN-IMPLEMENTATION");
        $str57$RedGetRepositoryTime = SubLObjectFactory.makeString("RedGetRepositoryTime");
        $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-TIME-IMPLEMENTATION%");
        $str59$RedRepositoryIsValid = SubLObjectFactory.makeString("RedRepositoryIsValid");
        $sym60$RED_IS_VALID_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-IS-VALID-IMPLEMENTATION");
        $str61$RedGetRepositoryReasonCodeString = SubLObjectFactory.makeString("RedGetRepositoryReasonCodeString");
        $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-REASONCODE-STRING-IMPLEMENTATION%");
        $str63$RedNumberRepositories = SubLObjectFactory.makeString("RedNumberRepositories");
        $sym64$RED_NUMBER_REPOSITORIES_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-NUMBER-REPOSITORIES-IMPLEMENTATION");
        $str65$RedNumberApplicationRepositories = SubLObjectFactory.makeString("RedNumberApplicationRepositories");
        $sym66$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-NUMBER-APPLICATION-REPOSITORIES-IMPLEMENTATION");
        $str67$RedGetSystemRepository = SubLObjectFactory.makeString("RedGetSystemRepository");
        $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION%");
        $str69$RedGetMachineRepository = SubLObjectFactory.makeString("RedGetMachineRepository");
        $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION%");
        $str71$RedRepositoryListNew = SubLObjectFactory.makeString("RedRepositoryListNew");
        $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-REPOSITORY-LIST-NEW-IMPLEMENTATION%");
        $list73 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NUMBER-ELEMENTS"), (SubLObject)SubLObjectFactory.makeKeyword("INT32"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str74$RedMakeRepositoryListFromReposito = SubLObjectFactory.makeString("RedMakeRepositoryListFromRepository");
        $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION%");
        $str76$RedGetApplicationRepositories = SubLObjectFactory.makeString("RedGetApplicationRepositories");
        $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION%");
        $str78$RedGetRepositoryListMostPrivilege = SubLObjectFactory.makeString("RedGetRepositoryListMostPrivilegedFirst");
        $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION%");
        $str80$RedGetRepositoryListLeastPrivileg = SubLObjectFactory.makeString("RedGetRepositoryListLeastPrivilegedFirst");
        $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION%");
        $str82$RedRepositoryListDispose = SubLObjectFactory.makeString("RedRepositoryListDispose");
        $sym83$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-DISPOSE-IMPLEMENTATION");
        $list84 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str85$RedGetRepositoryListLength = SubLObjectFactory.makeString("RedGetRepositoryListLength");
        $sym86$RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-REPOSITORY-LIST-LENGTH-IMPLEMENTATION");
        $str87$RedRepositoryListGetElement = SubLObjectFactory.makeString("RedRepositoryListGetElement");
        $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION%");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INDEX"), (SubLObject)SubLObjectFactory.makeKeyword("INT32"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str90$RedRepositoryListAddRepository = SubLObjectFactory.makeString("RedRepositoryListAddRepository");
        $sym91$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-ADD-REPOSITORY-IMPLEMENTATION");
        $list92 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-REPOSITORY-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str93$RedRepositoryListGetMaxRepositori = SubLObjectFactory.makeString("RedRepositoryListGetMaxRepositories");
        $sym94$RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-REPOSITORY-LIST-GET-MAX-REPOSITORIES-IMPLEMENTATION");
        $str95$RedGetTopLevelKey = SubLObjectFactory.makeString("RedGetTopLevelKey");
        $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION%");
        $str97$RedGetElementByKey = SubLObjectFactory.makeString("RedGetElementByKey");
        $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-ELEMENT-BY-KEY-IMPLEMENTATION%");
        $list99 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $str100$RedElementNumberSubKeys = SubLObjectFactory.makeString("RedElementNumberSubKeys");
        $sym101$RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-ELEMENT-NUMBER-SUBKEYS-IMPLEMENTATION");
        $list102 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str103$RedGetSubKeyIterator = SubLObjectFactory.makeString("RedGetSubKeyIterator");
        $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION%");
        $str105$RedIteratorDispose = SubLObjectFactory.makeString("RedIteratorDispose");
        $sym106$RED_ITERATOR_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-ITERATOR-DISPOSE-IMPLEMENTATION");
        $list107 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-ITERATOR-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str108$RedIteratorHasNext = SubLObjectFactory.makeString("RedIteratorHasNext");
        $sym109$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-ITERATOR-HAS-NEXT-IMPLEMENTATION");
        $str110$RedIteratorNext = SubLObjectFactory.makeString("RedIteratorNext");
        $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-ITERATOR-NEXT-IMPLEMENTATION%");
        $str112$RedIteratorPeek = SubLObjectFactory.makeString("RedIteratorPeek");
        $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-ITERATOR-PEEK-IMPLEMENTATION%");
        $str114$RedGetKey = SubLObjectFactory.makeString("RedGetKey");
        $sym115$RED_GET_KEY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-KEY-IMPLEMENTATION%");
        $str116$RedGetDataTypeString = SubLObjectFactory.makeString("RedGetDataTypeString");
        $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-DATATYPE-STRING-IMPLEMENTATION%");
        $str118$RedGetValueSize = SubLObjectFactory.makeString("RedGetValueSize");
        $sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-VALUE-SIZE-IMPLEMENTATION");
        $str120$RedGetRedElementRepository = SubLObjectFactory.makeString("RedGetRedElementRepository");
        $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-RED-ELEMENT-REPOSITORY-IMPLEMENTATION%");
        $str122$RedGetStringValue = SubLObjectFactory.makeString("RedGetStringValue");
        $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-STRING-VALUE-IMPLEMENTATION%");
        $str124$RedGetBlobValue = SubLObjectFactory.makeString("RedGetBlobValue");
        $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-BLOB-VALUE-IMPLEMENTATION%");
        $str126$RedCopyBlobValue = SubLObjectFactory.makeString("RedCopyBlobValue");
        $sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-COPY-BLOB-VALUE-IMPLEMENTATION");
        $list128 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INT-VECTOR"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("INT32")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VECTOR"), (SubLObject)SubLObjectFactory.makeKeyword("FIXNUM"))));
        $kw129$FIXNUM = SubLObjectFactory.makeKeyword("FIXNUM");
        $str130$RedGetIntValue32 = SubLObjectFactory.makeString("RedGetIntValue32");
        $sym131$RED_GET_INT32_VALUE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-GET-INT32-VALUE-IMPLEMENTATION");
        $str132$RedGetExtendedNameWithSeparator = SubLObjectFactory.makeString("RedGetExtendedNameWithSeparator");
        $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-SEPARATOR-IMPLEMENTATION%");
        $list134 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEPARATOR"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR"), (SubLObject)SubLObjectFactory.makeKeyword("FIXNUM")));
        $str135$RedGetExtendedNameWithPeriodSepar = SubLObjectFactory.makeString("RedGetExtendedNameWithPeriodSeparator");
        $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-IMPLEMENTATION%");
        $str137$RedGetTopLevelSuperElement = SubLObjectFactory.makeString("RedGetTopLevelSuperElement");
        $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION%");
        $str139$RedGetSuperElementByKey = SubLObjectFactory.makeString("RedGetSuperElementByKey");
        $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-SUPER-ELEMENT-BY-KEY-IMPLEMENTATION%");
        $list141 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")));
        $str142$RedSuperElementSubkeyExists = SubLObjectFactory.makeString("RedSuperElementSubkeyExists");
        $sym143$RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-SUBKEY-EXISTS-IMPLEMENTATION");
        $str144$RedSuperElementGetElement = SubLObjectFactory.makeString("RedSuperElementGetElement");
        $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION%");
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str147$RedSuperElementGetRepositoryList = SubLObjectFactory.makeString("RedSuperElementGetRepositoryList");
        $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION%");
        $str149$RedSuperElementDispose = SubLObjectFactory.makeString("RedSuperElementDispose");
        $sym150$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-DISPOSE-IMPLEMENTATION");
        $str151$RedGetExtendedNameWithSeparatorLi = SubLObjectFactory.makeString("RedGetExtendedNameWithSeparatorList");
        $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-SEPARATOR-LIST-IMPLEMENTATION%");
        $list153 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("POINTER"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR")), (SubLObject)SubLObjectFactory.makeKeyword("STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SEPARATOR"), (SubLObject)SubLObjectFactory.makeKeyword("CHAR"), (SubLObject)SubLObjectFactory.makeKeyword("FIXNUM")));
        $str154$RedGetExtendedNameWithPeriodSepar = SubLObjectFactory.makeString("RedGetExtendedNameWithPeriodSeparatorList");
        $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION%");
        $str156$RedGetSuperElementIterator = SubLObjectFactory.makeString("RedGetSuperElementIterator");
        $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION%");
        $str158$RedSuperElementIteratorHasNext = SubLObjectFactory.makeString("RedSuperElementIteratorHasNext");
        $sym159$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-ITERATOR-HAS-NEXT-IMPLEMENTATION");
        $list160 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-ITERATOR-STRUCT"), (SubLObject)SubLObjectFactory.makeKeyword("OPAQUE"), (SubLObject)SubLObjectFactory.makeKeyword("INTEGER")));
        $str161$RedSuperElementIteratorNext = SubLObjectFactory.makeString("RedSuperElementIteratorNext");
        $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION%");
        $str163$RedSuperElementIteratorPeek = SubLObjectFactory.makeString("RedSuperElementIteratorPeek");
        $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-SUPER-ELEMENT-ITERATOR-PEEK-IMPLEMENTATION%");
        $str165$RedSuperElementIteratorGetReposit = SubLObjectFactory.makeString("RedSuperElementIteratorGetRepositoryList");
        $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_ = SubLObjectFactory.makeUninternedSymbol("RED-SUPER-ELEMENT-ITERATOR-GET-REPOSITORY-LIST-IMPLEMENTATION%");
        $str167$RedSuperElementIteratorDispose = SubLObjectFactory.makeString("RedSuperElementIteratorDispose");
        $sym168$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION = SubLObjectFactory.makeSymbol("RED-SUPER-ELEMENT-ITERATOR-DISPOSE-IMPLEMENTATION");
    }
}

/*

	Total time: 216 ms
	
*/
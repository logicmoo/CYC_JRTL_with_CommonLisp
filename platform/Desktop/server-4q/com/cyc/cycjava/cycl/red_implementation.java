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

public final class red_implementation
    extends
      SubLTranslatedFile
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
  public static SubLObject red_new_implementation()
  {
    final SubLObject Xval = Functions.funcall( $sym3$RED_NEW_IMPLEMENTATION_ );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 2710L)
  public static SubLObject red_get_reason_code_string_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 4638L)
  public static SubLObject red_get_reason_sub_code_string_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 5050L)
  public static SubLObject red_get_version_string_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 5525L)
  public static SubLObject red_get_date_string_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 5913L)
  public static SubLObject red_get_time_string_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 6696L)
  public static SubLObject red_load_repository_implementation(final SubLObject red_struct, final SubLObject filename)
  {
    final SubLObject Xval = Functions.funcall( $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_, red_struct, filename );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 7335L)
  public static SubLObject red_get_repository_by_name_implementation(final SubLObject red_struct, final SubLObject name)
  {
    final SubLObject Xval = Functions.funcall( $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_, red_struct, name );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 8666L)
  public static SubLObject red_get_repository_name_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 9089L)
  public static SubLObject red_get_repository_filename_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 9525L)
  public static SubLObject red_get_repository_type_string_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 10046L)
  public static SubLObject red_get_repository_version_string_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 10583L)
  public static SubLObject red_get_repository_date_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 13400L)
  public static SubLObject red_get_repository_time_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 14229L)
  public static SubLObject red_get_repository_reasoncode_string_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 16835L)
  public static SubLObject red_get_system_repository_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 17234L)
  public static SubLObject red_get_machine_repository_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 17640L)
  public static SubLObject red_repository_list_new_implementation(final SubLObject red_struct, final SubLObject number_elements)
  {
    final SubLObject Xval = Functions.funcall( $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_, red_struct, number_elements );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 18153L)
  public static SubLObject red_make_repository_list_from_repository_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 18628L)
  public static SubLObject red_get_application_repositories_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 19193L)
  public static SubLObject red_get_repository_list_most_privileged_first_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 19650L)
  public static SubLObject red_get_repository_list_least_privileged_first_implementation(final SubLObject red_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_, red_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 21081L)
  public static SubLObject red_repository_list_get_element_implementation(final SubLObject red_repository_list_struct, final SubLObject index)
  {
    final SubLObject Xval = Functions.funcall( $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_, red_repository_list_struct, index );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 22587L)
  public static SubLObject red_get_top_level_key_implementation(final SubLObject red_repository_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_, red_repository_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 23066L)
  public static SubLObject red_get_element_by_key_implementation(final SubLObject red_element_struct, final SubLObject key)
  {
    final SubLObject Xval = Functions.funcall( $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_, red_element_struct, key );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 23999L)
  public static SubLObject red_get_subkey_iterator_implementation(final SubLObject red_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_, red_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 25276L)
  public static SubLObject red_iterator_next_implementation(final SubLObject red_iterator_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_, red_iterator_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 25705L)
  public static SubLObject red_iterator_peek_implementation(final SubLObject red_iterator_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_, red_iterator_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 26134L)
  public static SubLObject red_get_key_implementation(final SubLObject red_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym115$RED_GET_KEY_IMPLEMENTATION_, red_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 26550L)
  public static SubLObject red_get_datatype_string_implementation(final SubLObject red_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_, red_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 27504L)
  public static SubLObject red_get_red_element_repository_implementation(final SubLObject red_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_, red_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 27971L)
  public static SubLObject red_get_string_value_implementation(final SubLObject red_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_, red_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 28378L)
  public static SubLObject red_get_blob_value_implementation(final SubLObject red_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_, red_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return $str13$;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 29255L)
  public static SubLObject red_get_blob_value_internal(final SubLObject red_element_struct)
  {
    foreign.ensure_foreign_shared_library_loaded( $kw0$RED_SHARED, UNPROVIDED );
    final SubLObject blength = Functions.funcall( $sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION, red_element_struct );
    final SubLObject barray = foreign.vector_for_marshalling( blength, $kw129$FIXNUM, ZERO_INTEGER );
    Functions.funcall( $sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION, red_element_struct, barray );
    return barray;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 29857L)
  public static SubLObject red_get_blob_value_ext(final SubLObject red_element_struct)
  {
    foreign.ensure_foreign_shared_library_loaded( $kw0$RED_SHARED, UNPROVIDED );
    final SubLObject val = red_get_blob_value_internal( red_element_struct );
    if( val.equal( ZERO_INTEGER ) )
    {
      return NIL;
    }
    return val;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 31206L)
  public static SubLObject red_get_extended_name_with_separator_implementation(final SubLObject red_element_struct, final SubLObject key, final SubLObject separator)
  {
    final SubLObject Xval = Functions.funcall( $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_, red_element_struct, key, separator );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 32047L)
  public static SubLObject red_get_extended_name_with_period_separator_implementation(final SubLObject red_element_struct, final SubLObject key)
  {
    final SubLObject Xval = Functions.funcall( $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_, red_element_struct, key );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 32626L)
  public static SubLObject red_get_top_level_super_element_implementation(final SubLObject red_repository_list_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_, red_repository_list_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 33154L)
  public static SubLObject red_get_super_element_by_key_implementation(final SubLObject red_super_element_struct, final SubLObject key)
  {
    final SubLObject Xval = Functions.funcall( $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_, red_super_element_struct, key );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 34184L)
  public static SubLObject red_super_element_get_element_implementation(final SubLObject red_super_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_, red_super_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 34626L)
  public static SubLObject red_super_element_get_repository_list_implementation(final SubLObject red_super_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_, red_super_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 35510L)
  public static SubLObject red_get_extended_name_with_separator_list_implementation(final SubLObject red_super_element_struct, final SubLObject key, final SubLObject separator)
  {
    final SubLObject Xval = Functions.funcall( $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_, red_super_element_struct, key, separator );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 36384L)
  public static SubLObject red_get_extended_name_with_period_separator_list_implementation(final SubLObject red_super_element_struct, final SubLObject key)
  {
    final SubLObject Xval = Functions.funcall( $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_, red_super_element_struct, key );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 36947L)
  public static SubLObject red_get_super_element_iterator_implementation(final SubLObject red_super_element_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_, red_super_element_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 37916L)
  public static SubLObject red_super_element_iterator_next_implementation(final SubLObject red_super_element_iterator_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_, red_super_element_iterator_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 38397L)
  public static SubLObject red_super_element_iterator_peek_implementation(final SubLObject red_super_element_iterator_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_, red_super_element_iterator_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  @SubLTranslatedFile.SubL(source = "cycl/red-implementation.lisp", position = 38909L)
  public static SubLObject red_super_element_iterator_get_repository_list_implementation(final SubLObject red_super_element_iterator_struct)
  {
    final SubLObject Xval = Functions.funcall( $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_, red_super_element_iterator_struct );
    if( NIL != Alien.alien_null_ptrP( Xval, $kw5$C ) )
    {
      return NIL;
    }
    return Xval;
  }

  public static SubLObject declare_red_implementation_file()
  {
    SubLFiles.declareFunction( me, "red_new_implementation", "RED-NEW-IMPLEMENTATION", 0, 0, false );
    SubLFiles.declareFunction( me, "red_get_reason_code_string_implementation", "RED-GET-REASON-CODE-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_reason_sub_code_string_implementation", "RED-GET-REASON-SUB-CODE-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_version_string_implementation", "RED-GET-VERSION-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_date_string_implementation", "RED-GET-DATE-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_time_string_implementation", "RED-GET-TIME-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_load_repository_implementation", "RED-LOAD-REPOSITORY-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_by_name_implementation", "RED-GET-REPOSITORY-BY-NAME-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_name_implementation", "RED-GET-REPOSITORY-NAME-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_filename_implementation", "RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_type_string_implementation", "RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_version_string_implementation", "RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_date_implementation", "RED-GET-REPOSITORY-DATE-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_time_implementation", "RED-GET-REPOSITORY-TIME-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_reasoncode_string_implementation", "RED-GET-REPOSITORY-REASONCODE-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_system_repository_implementation", "RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_machine_repository_implementation", "RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_repository_list_new_implementation", "RED-REPOSITORY-LIST-NEW-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_make_repository_list_from_repository_implementation", "RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_application_repositories_implementation", "RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_list_most_privileged_first_implementation", "RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_repository_list_least_privileged_first_implementation", "RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_repository_list_get_element_implementation", "RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_get_top_level_key_implementation", "RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_element_by_key_implementation", "RED-GET-ELEMENT-BY-KEY-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_get_subkey_iterator_implementation", "RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_iterator_next_implementation", "RED-ITERATOR-NEXT-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_iterator_peek_implementation", "RED-ITERATOR-PEEK-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_key_implementation", "RED-GET-KEY-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_datatype_string_implementation", "RED-GET-DATATYPE-STRING-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_red_element_repository_implementation", "RED-GET-RED-ELEMENT-REPOSITORY-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_string_value_implementation", "RED-GET-STRING-VALUE-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_blob_value_implementation", "RED-GET-BLOB-VALUE-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_blob_value_internal", "RED-GET-BLOB-VALUE-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_blob_value_ext", "RED-GET-BLOB-VALUE-EXT", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_extended_name_with_separator_implementation", "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-IMPLEMENTATION", 3, 0, false );
    SubLFiles.declareFunction( me, "red_get_extended_name_with_period_separator_implementation", "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_get_top_level_super_element_implementation", "RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_super_element_by_key_implementation", "RED-GET-SUPER-ELEMENT-BY-KEY-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_super_element_get_element_implementation", "RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_super_element_get_repository_list_implementation", "RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_get_extended_name_with_separator_list_implementation", "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-LIST-IMPLEMENTATION", 3, 0, false );
    SubLFiles.declareFunction( me, "red_get_extended_name_with_period_separator_list_implementation", "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION", 2, 0, false );
    SubLFiles.declareFunction( me, "red_get_super_element_iterator_implementation", "RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_super_element_iterator_next_implementation", "RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_super_element_iterator_peek_implementation", "RED-SUPER-ELEMENT-ITERATOR-PEEK-IMPLEMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "red_super_element_iterator_get_repository_list_implementation", "RED-SUPER-ELEMENT-ITERATOR-GET-REPOSITORY-LIST-IMPLEMENTATION", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_red_implementation_file()
  {
    return NIL;
  }

  public static SubLObject setup_red_implementation_file()
  {
    foreign.declare_foreign_shared_library( $kw0$RED_SHARED, $list1 );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str2$RedNew, $sym3$RED_NEW_IMPLEMENTATION_, NIL, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str6$RedGetReasonCode, $sym7$RED_GET_REASON_CODE_IMPLEMENTATION, $list8, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str10$RedGetReasonCodeString, $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_, $list8, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str14$RedGetReasonSubCode, $sym15$RED_GET_REASON_SUB_CODE_IMPLEMENTATION, $list8, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str16$RedGetReasonSubCodeString, $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_, $list8, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str18$RedGetVersionString, $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_, $list8, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str20$RedGetDate, $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_, $list8, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str22$RedGetTime, $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_, $list8, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str24$RedDispose, $sym25$RED_DISPOSE_IMPLEMENTATION, $list8, NIL, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str26$RedLoadRedRepositoryFilename, $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_, $list28, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str26$RedLoadRedRepositoryFilename, $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_, $list30, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str31$RedRepositoryDispose, $sym32$RED_REPOSITORY_DISPOSE_IMPLEMENTATION, $list33, NIL, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str34$RedValueExists, $sym35$RED_VALUE_EXISTS_IMPLEMENTATION, $list33, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str36$RedGetRepositoryName, $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str38$RedGetRepositoryFilename, $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str40$RedGetRepositoryTypeString, $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str42$RedGetRepositoryVersionString, $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str44$RedGetRepositoryDate, $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str46$RedRepositoryPointerValid, $sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION, $list48, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str49$RedGetRepositoryVersionMajor, $sym50$RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION, $list33, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str51$RedGetRepositoryVersionMinor, $sym52$RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION, $list33, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str53$RedGetRepositoryVersionFix, $sym54$RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION, $list33, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str55$RedGetRepositoryVersionSpin, $sym56$RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION, $list33, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str57$RedGetRepositoryTime, $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str59$RedRepositoryIsValid, $sym60$RED_IS_VALID_IMPLEMENTATION, $list33, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str61$RedGetRepositoryReasonCodeString, $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_, $list33, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str63$RedNumberRepositories, $sym64$RED_NUMBER_REPOSITORIES_IMPLEMENTATION, $list8, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str65$RedNumberApplicationRepositories, $sym66$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION, $list8, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str67$RedGetSystemRepository, $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_, $list8, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str69$RedGetMachineRepository, $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_, $list8, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str71$RedRepositoryListNew, $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_, $list73, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str74$RedMakeRepositoryListFromReposito, $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_, $list33, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str76$RedGetApplicationRepositories, $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_, $list8, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str78$RedGetRepositoryListMostPrivilege, $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_, $list8, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str80$RedGetRepositoryListLeastPrivileg, $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_, $list8, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str82$RedRepositoryListDispose, $sym83$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION, $list84, NIL, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str85$RedGetRepositoryListLength, $sym86$RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION, $list84, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str87$RedRepositoryListGetElement, $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_, $list89, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str90$RedRepositoryListAddRepository, $sym91$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION, $list92, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str93$RedRepositoryListGetMaxRepositori, $sym94$RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION, $list84, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str95$RedGetTopLevelKey, $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_, $list33, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str97$RedGetElementByKey, $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_, $list99, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str100$RedElementNumberSubKeys, $sym101$RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION, $list102, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str103$RedGetSubKeyIterator, $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_, $list102, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str105$RedIteratorDispose, $sym106$RED_ITERATOR_DISPOSE_IMPLEMENTATION, $list107, NIL, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str108$RedIteratorHasNext, $sym109$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION, $list107, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str110$RedIteratorNext, $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_, $list107, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str112$RedIteratorPeek, $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_, $list107, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str114$RedGetKey, $sym115$RED_GET_KEY_IMPLEMENTATION_, $list102, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str116$RedGetDataTypeString, $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_, $list102, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str118$RedGetValueSize, $sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION, $list102, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str120$RedGetRedElementRepository, $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_, $list102, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str122$RedGetStringValue, $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_, $list102, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str124$RedGetBlobValue, $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_, $list102, $list12, $kw5$C, $str13$ );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str126$RedCopyBlobValue, $sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION, $list128, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str130$RedGetIntValue32, $sym131$RED_GET_INT32_VALUE_IMPLEMENTATION, $list102, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str132$RedGetExtendedNameWithSeparator, $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_, $list134, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str135$RedGetExtendedNameWithPeriodSepar, $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_, $list99, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str137$RedGetTopLevelSuperElement, $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_, $list84, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str139$RedGetSuperElementByKey, $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_, $list141, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str142$RedSuperElementSubkeyExists, $sym143$RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION, $list141, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str144$RedSuperElementGetElement, $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_, $list146, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str147$RedSuperElementGetRepositoryList, $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_, $list146, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str149$RedSuperElementDispose, $sym150$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION, $list146, NIL, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str151$RedGetExtendedNameWithSeparatorLi, $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_, $list153, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str154$RedGetExtendedNameWithPeriodSepar, $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_, $list141, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str156$RedGetSuperElementIterator, $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_, $list146, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str158$RedSuperElementIteratorHasNext, $sym159$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION, $list160, $kw9$INT32, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str161$RedSuperElementIteratorNext, $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_, $list160, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str163$RedSuperElementIteratorPeek, $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_, $list160, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str165$RedSuperElementIteratorGetReposit, $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_, $list160, $kw4$OPAQUE, $kw5$C, NIL );
    Alien.def_foreign_function( $kw0$RED_SHARED, $str167$RedSuperElementIteratorDispose, $sym168$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION, $list160, NIL, $kw5$C, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_red_implementation_file();
  }

  @Override
  public void initializeVariables()
  {
    init_red_implementation_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_red_implementation_file();
  }
  static
  {
    me = new red_implementation();
    $kw0$RED_SHARED = makeKeyword( "RED-SHARED" );
    $list1 = ConsesLow.list( new SubLObject[] { makeKeyword( "COMMENT" ), makeString( "RED Cyc Configuration Repository" ), makeKeyword( "AUTHOR" ), makeString( "Chester John <cjohn@cyc.com>" ), makeKeyword(
        "FILENAME" ), makeString( "RED Library (auto-loaded)" ), makeKeyword( "DEPENDS-ON" ), NIL, makeKeyword( "COPYRIGHT" ), makeString( "Copyright (c) 2004 - 2006 Cycorp Inc." ), makeKeyword( "URI" ), makeString(
            "http://www.opencyc.com" )
    } );
    $str2$RedNew = makeString( "RedNew" );
    $sym3$RED_NEW_IMPLEMENTATION_ = makeUninternedSymbol( "RED-NEW-IMPLEMENTATION%" );
    $kw4$OPAQUE = makeKeyword( "OPAQUE" );
    $kw5$C = makeKeyword( "C" );
    $str6$RedGetReasonCode = makeString( "RedGetReasonCode" );
    $sym7$RED_GET_REASON_CODE_IMPLEMENTATION = makeSymbol( "RED-GET-REASON-CODE-IMPLEMENTATION" );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $kw9$INT32 = makeKeyword( "INT32" );
    $str10$RedGetReasonCodeString = makeString( "RedGetReasonCodeString" );
    $sym11$RED_GET_REASON_CODE_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REASON-CODE-STRING-IMPLEMENTATION%" );
    $list12 = ConsesLow.list( makeKeyword( "POINTER" ), makeKeyword( "CHAR" ) );
    $str13$ = makeString( "" );
    $str14$RedGetReasonSubCode = makeString( "RedGetReasonSubCode" );
    $sym15$RED_GET_REASON_SUB_CODE_IMPLEMENTATION = makeSymbol( "RED-GET-REASON-SUB-CODE-IMPLEMENTATION" );
    $str16$RedGetReasonSubCodeString = makeString( "RedGetReasonSubCodeString" );
    $sym17$RED_GET_REASON_SUB_CODE_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REASON-SUB-CODE-STRING-IMPLEMENTATION%" );
    $str18$RedGetVersionString = makeString( "RedGetVersionString" );
    $sym19$RED_GET_VERSION_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-VERSION-STRING-IMPLEMENTATION%" );
    $str20$RedGetDate = makeString( "RedGetDate" );
    $sym21$RED_GET_DATE_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-DATE-STRING-IMPLEMENTATION%" );
    $str22$RedGetTime = makeString( "RedGetTime" );
    $sym23$RED_GET_TIME_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-TIME-STRING-IMPLEMENTATION%" );
    $str24$RedDispose = makeString( "RedDispose" );
    $sym25$RED_DISPOSE_IMPLEMENTATION = makeSymbol( "RED-DISPOSE-IMPLEMENTATION" );
    $str26$RedLoadRedRepositoryFilename = makeString( "RedLoadRedRepositoryFilename" );
    $sym27$RED_LOAD_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-LOAD-REPOSITORY-IMPLEMENTATION%" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "FILENAME" ), ConsesLow.list( makeKeyword( "POINTER" ),
        makeKeyword( "CHAR" ) ), makeKeyword( "STRING" ) ) );
    $sym29$RED_GET_REPOSITORY_BY_NAME_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-BY-NAME-IMPLEMENTATION%" );
    $list30 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "NAME" ), ConsesLow.list( makeKeyword( "POINTER" ), makeKeyword(
        "CHAR" ) ), makeKeyword( "STRING" ) ) );
    $str31$RedRepositoryDispose = makeString( "RedRepositoryDispose" );
    $sym32$RED_REPOSITORY_DISPOSE_IMPLEMENTATION = makeSymbol( "RED-REPOSITORY-DISPOSE-IMPLEMENTATION" );
    $list33 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-REPOSITORY-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str34$RedValueExists = makeString( "RedValueExists" );
    $sym35$RED_VALUE_EXISTS_IMPLEMENTATION = makeSymbol( "RED-VALUE-EXISTS-IMPLEMENTATION" );
    $str36$RedGetRepositoryName = makeString( "RedGetRepositoryName" );
    $sym37$RED_GET_REPOSITORY_NAME_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-NAME-IMPLEMENTATION%" );
    $str38$RedGetRepositoryFilename = makeString( "RedGetRepositoryFilename" );
    $sym39$RED_GET_REPOSITORY_FILENAME_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-FILENAME-IMPLEMENTATION%" );
    $str40$RedGetRepositoryTypeString = makeString( "RedGetRepositoryTypeString" );
    $sym41$RED_GET_REPOSITORY_TYPE_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-TYPE-STRING-IMPLEMENTATION%" );
    $str42$RedGetRepositoryVersionString = makeString( "RedGetRepositoryVersionString" );
    $sym43$RED_GET_REPOSITORY_VERSION_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-VERSION-STRING-IMPLEMENTATION%" );
    $str44$RedGetRepositoryDate = makeString( "RedGetRepositoryDate" );
    $sym45$RED_GET_REPOSITORY_DATE_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-DATE-IMPLEMENTATION%" );
    $str46$RedRepositoryPointerValid = makeString( "RedRepositoryPointerValid" );
    $sym47$RED_REPOSITORY_POINTER_VALID_IMPLEMENTATION = makeSymbol( "RED-REPOSITORY-POINTER-VALID-IMPLEMENTATION" );
    $list48 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "RED-REPOSITORY-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword(
        "INTEGER" ) ) );
    $str49$RedGetRepositoryVersionMajor = makeString( "RedGetRepositoryVersionMajor" );
    $sym50$RED_GET_REPOSITORY_VERSION_MAJOR_IMPLEMENTATION = makeSymbol( "RED-GET-REPOSITORY-VERSION-MAJOR-IMPLEMENTATION" );
    $str51$RedGetRepositoryVersionMinor = makeString( "RedGetRepositoryVersionMinor" );
    $sym52$RED_GET_REPOSITORY_VERSION_MINOR_IMPLEMENTATION = makeSymbol( "RED-GET-REPOSITORY-VERSION-MINOR-IMPLEMENTATION" );
    $str53$RedGetRepositoryVersionFix = makeString( "RedGetRepositoryVersionFix" );
    $sym54$RED_GET_REPOSITORY_VERSION_FIX_IMPLEMENTATION = makeSymbol( "RED-GET-REPOSITORY-VERSION-FIX-IMPLEMENTATION" );
    $str55$RedGetRepositoryVersionSpin = makeString( "RedGetRepositoryVersionSpin" );
    $sym56$RED_GET_REPOSITORY_VERSION_SPIN_IMPLEMENTATION = makeSymbol( "RED-GET-REPOSITORY-VERSION-SPIN-IMPLEMENTATION" );
    $str57$RedGetRepositoryTime = makeString( "RedGetRepositoryTime" );
    $sym58$RED_GET_REPOSITORY_TIME_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-TIME-IMPLEMENTATION%" );
    $str59$RedRepositoryIsValid = makeString( "RedRepositoryIsValid" );
    $sym60$RED_IS_VALID_IMPLEMENTATION = makeSymbol( "RED-IS-VALID-IMPLEMENTATION" );
    $str61$RedGetRepositoryReasonCodeString = makeString( "RedGetRepositoryReasonCodeString" );
    $sym62$RED_GET_REPOSITORY_REASONCODE_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-REASONCODE-STRING-IMPLEMENTATION%" );
    $str63$RedNumberRepositories = makeString( "RedNumberRepositories" );
    $sym64$RED_NUMBER_REPOSITORIES_IMPLEMENTATION = makeSymbol( "RED-NUMBER-REPOSITORIES-IMPLEMENTATION" );
    $str65$RedNumberApplicationRepositories = makeString( "RedNumberApplicationRepositories" );
    $sym66$RED_NUMBER_APPLICATION_REPOSITORIES_IMPLEMENTATION = makeSymbol( "RED-NUMBER-APPLICATION-REPOSITORIES-IMPLEMENTATION" );
    $str67$RedGetSystemRepository = makeString( "RedGetSystemRepository" );
    $sym68$RED_GET_SYSTEM_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-SYSTEM-REPOSITORY-IMPLEMENTATION%" );
    $str69$RedGetMachineRepository = makeString( "RedGetMachineRepository" );
    $sym70$RED_GET_MACHINE_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-MACHINE-REPOSITORY-IMPLEMENTATION%" );
    $str71$RedRepositoryListNew = makeString( "RedRepositoryListNew" );
    $sym72$RED_REPOSITORY_LIST_NEW_IMPLEMENTATION_ = makeUninternedSymbol( "RED-REPOSITORY-LIST-NEW-IMPLEMENTATION%" );
    $list73 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "NUMBER-ELEMENTS" ), makeKeyword( "INT32" ), makeKeyword(
        "INTEGER" ) ) );
    $str74$RedMakeRepositoryListFromReposito = makeString( "RedMakeRepositoryListFromRepository" );
    $sym75$RED_MAKE_REPOSITORY_LIST_FROM_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-MAKE-REPOSITORY-LIST-FROM-REPOSITORY-IMPLEMENTATION%" );
    $str76$RedGetApplicationRepositories = makeString( "RedGetApplicationRepositories" );
    $sym77$RED_GET_APPLICATION_REPOSITORIES_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-APPLICATION-REPOSITORIES-IMPLEMENTATION%" );
    $str78$RedGetRepositoryListMostPrivilege = makeString( "RedGetRepositoryListMostPrivilegedFirst" );
    $sym79$RED_GET_REPOSITORY_LIST_MOST_PRIVILEGED_FIRST_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-LIST-MOST-PRIVILEGED-FIRST-IMPLEMENTATION%" );
    $str80$RedGetRepositoryListLeastPrivileg = makeString( "RedGetRepositoryListLeastPrivilegedFirst" );
    $sym81$RED_GET_REPOSITORY_LIST_LEAST_PRIVILEGED_FIRST_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-REPOSITORY-LIST-LEAST-PRIVILEGED-FIRST-IMPLEMENTATION%" );
    $str82$RedRepositoryListDispose = makeString( "RedRepositoryListDispose" );
    $sym83$RED_REPOSITORY_LIST_DISPOSE_IMPLEMENTATION = makeSymbol( "RED-REPOSITORY-LIST-DISPOSE-IMPLEMENTATION" );
    $list84 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-REPOSITORY-LIST-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str85$RedGetRepositoryListLength = makeString( "RedGetRepositoryListLength" );
    $sym86$RED_GET_REPOSITORY_LIST_LENGTH_IMPLEMENTATION = makeSymbol( "RED-GET-REPOSITORY-LIST-LENGTH-IMPLEMENTATION" );
    $str87$RedRepositoryListGetElement = makeString( "RedRepositoryListGetElement" );
    $sym88$RED_REPOSITORY_LIST_GET_ELEMENT_IMPLEMENTATION_ = makeUninternedSymbol( "RED-REPOSITORY-LIST-GET-ELEMENT-IMPLEMENTATION%" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "INDEX" ), makeKeyword( "INT32" ), makeKeyword( "INTEGER" ) ) );
    $str90$RedRepositoryListAddRepository = makeString( "RedRepositoryListAddRepository" );
    $sym91$RED_REPOSITORY_LIST_ADD_REPOSITORY_IMPLEMENTATION = makeSymbol( "RED-REPOSITORY-LIST-ADD-REPOSITORY-IMPLEMENTATION" );
    $list92 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-REPOSITORY-LIST-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "RED-REPOSITORY-STRUCT" ), makeKeyword(
        "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str93$RedRepositoryListGetMaxRepositori = makeString( "RedRepositoryListGetMaxRepositories" );
    $sym94$RED_REPOSITORY_LIST_GET_MAX_REPOSITORIES_IMPLEMENTATION = makeSymbol( "RED-REPOSITORY-LIST-GET-MAX-REPOSITORIES-IMPLEMENTATION" );
    $str95$RedGetTopLevelKey = makeString( "RedGetTopLevelKey" );
    $sym96$RED_GET_TOP_LEVEL_KEY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-TOP-LEVEL-KEY-IMPLEMENTATION%" );
    $str97$RedGetElementByKey = makeString( "RedGetElementByKey" );
    $sym98$RED_GET_ELEMENT_BY_KEY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-ELEMENT-BY-KEY-IMPLEMENTATION%" );
    $list99 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeKeyword( "POINTER" ),
        makeKeyword( "CHAR" ) ), makeKeyword( "STRING" ) ) );
    $str100$RedElementNumberSubKeys = makeString( "RedElementNumberSubKeys" );
    $sym101$RED_ELEMENT_NUMBER_SUBKEYS_IMPLEMENTATION = makeSymbol( "RED-ELEMENT-NUMBER-SUBKEYS-IMPLEMENTATION" );
    $list102 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str103$RedGetSubKeyIterator = makeString( "RedGetSubKeyIterator" );
    $sym104$RED_GET_SUBKEY_ITERATOR_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-SUBKEY-ITERATOR-IMPLEMENTATION%" );
    $str105$RedIteratorDispose = makeString( "RedIteratorDispose" );
    $sym106$RED_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol( "RED-ITERATOR-DISPOSE-IMPLEMENTATION" );
    $list107 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-ITERATOR-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str108$RedIteratorHasNext = makeString( "RedIteratorHasNext" );
    $sym109$RED_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol( "RED-ITERATOR-HAS-NEXT-IMPLEMENTATION" );
    $str110$RedIteratorNext = makeString( "RedIteratorNext" );
    $sym111$RED_ITERATOR_NEXT_IMPLEMENTATION_ = makeUninternedSymbol( "RED-ITERATOR-NEXT-IMPLEMENTATION%" );
    $str112$RedIteratorPeek = makeString( "RedIteratorPeek" );
    $sym113$RED_ITERATOR_PEEK_IMPLEMENTATION_ = makeUninternedSymbol( "RED-ITERATOR-PEEK-IMPLEMENTATION%" );
    $str114$RedGetKey = makeString( "RedGetKey" );
    $sym115$RED_GET_KEY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-KEY-IMPLEMENTATION%" );
    $str116$RedGetDataTypeString = makeString( "RedGetDataTypeString" );
    $sym117$RED_GET_DATATYPE_STRING_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-DATATYPE-STRING-IMPLEMENTATION%" );
    $str118$RedGetValueSize = makeString( "RedGetValueSize" );
    $sym119$RED_GET_VALUE_SIZE_IMPLEMENTATION = makeSymbol( "RED-GET-VALUE-SIZE-IMPLEMENTATION" );
    $str120$RedGetRedElementRepository = makeString( "RedGetRedElementRepository" );
    $sym121$RED_GET_RED_ELEMENT_REPOSITORY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-RED-ELEMENT-REPOSITORY-IMPLEMENTATION%" );
    $str122$RedGetStringValue = makeString( "RedGetStringValue" );
    $sym123$RED_GET_STRING_VALUE_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-STRING-VALUE-IMPLEMENTATION%" );
    $str124$RedGetBlobValue = makeString( "RedGetBlobValue" );
    $sym125$RED_GET_BLOB_VALUE_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-BLOB-VALUE-IMPLEMENTATION%" );
    $str126$RedCopyBlobValue = makeString( "RedCopyBlobValue" );
    $sym127$RED_COPY_BLOB_VALUE_IMPLEMENTATION = makeSymbol( "RED-COPY-BLOB-VALUE-IMPLEMENTATION" );
    $list128 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "INT-VECTOR" ), ConsesLow.list( makeKeyword(
        "POINTER" ), makeKeyword( "INT32" ) ), ConsesLow.list( makeKeyword( "VECTOR" ), makeKeyword( "FIXNUM" ) ) ) );
    $kw129$FIXNUM = makeKeyword( "FIXNUM" );
    $str130$RedGetIntValue32 = makeString( "RedGetIntValue32" );
    $sym131$RED_GET_INT32_VALUE_IMPLEMENTATION = makeSymbol( "RED-GET-INT32-VALUE-IMPLEMENTATION" );
    $str132$RedGetExtendedNameWithSeparator = makeString( "RedGetExtendedNameWithSeparator" );
    $sym133$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-IMPLEMENTATION%" );
    $list134 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeKeyword( "POINTER" ),
        makeKeyword( "CHAR" ) ), makeKeyword( "STRING" ) ), ConsesLow.list( makeSymbol( "SEPARATOR" ), makeKeyword( "CHAR" ), makeKeyword( "FIXNUM" ) ) );
    $str135$RedGetExtendedNameWithPeriodSepar = makeString( "RedGetExtendedNameWithPeriodSeparator" );
    $sym136$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-IMPLEMENTATION%" );
    $str137$RedGetTopLevelSuperElement = makeString( "RedGetTopLevelSuperElement" );
    $sym138$RED_GET_TOP_LEVEL_SUPER_ELEMENT_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-TOP-LEVEL-SUPER-ELEMENT-IMPLEMENTATION%" );
    $str139$RedGetSuperElementByKey = makeString( "RedGetSuperElementByKey" );
    $sym140$RED_GET_SUPER_ELEMENT_BY_KEY_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-SUPER-ELEMENT-BY-KEY-IMPLEMENTATION%" );
    $list141 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-SUPER-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeKeyword( "POINTER" ),
        makeKeyword( "CHAR" ) ), makeKeyword( "STRING" ) ) );
    $str142$RedSuperElementSubkeyExists = makeString( "RedSuperElementSubkeyExists" );
    $sym143$RED_SUPER_ELEMENT_SUBKEY_EXISTS_IMPLEMENTATION = makeSymbol( "RED-SUPER-ELEMENT-SUBKEY-EXISTS-IMPLEMENTATION" );
    $str144$RedSuperElementGetElement = makeString( "RedSuperElementGetElement" );
    $sym145$RED_SUPER_ELEMENT_GET_ELEMENT_IMPLEMENTATION_ = makeUninternedSymbol( "RED-SUPER-ELEMENT-GET-ELEMENT-IMPLEMENTATION%" );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-SUPER-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str147$RedSuperElementGetRepositoryList = makeString( "RedSuperElementGetRepositoryList" );
    $sym148$RED_SUPER_ELEMENT_GET_REPOSITORY_LIST_IMPLEMENTATION_ = makeUninternedSymbol( "RED-SUPER-ELEMENT-GET-REPOSITORY-LIST-IMPLEMENTATION%" );
    $str149$RedSuperElementDispose = makeString( "RedSuperElementDispose" );
    $sym150$RED_SUPER_ELEMENT_DISPOSE_IMPLEMENTATION = makeSymbol( "RED-SUPER-ELEMENT-DISPOSE-IMPLEMENTATION" );
    $str151$RedGetExtendedNameWithSeparatorLi = makeString( "RedGetExtendedNameWithSeparatorList" );
    $sym152$RED_GET_EXTENDED_NAME_WITH_SEPARATOR_LIST_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-EXTENDED-NAME-WITH-SEPARATOR-LIST-IMPLEMENTATION%" );
    $list153 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-SUPER-ELEMENT-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ), ConsesLow.list( makeSymbol( "KEY" ), ConsesLow.list( makeKeyword( "POINTER" ),
        makeKeyword( "CHAR" ) ), makeKeyword( "STRING" ) ), ConsesLow.list( makeSymbol( "SEPARATOR" ), makeKeyword( "CHAR" ), makeKeyword( "FIXNUM" ) ) );
    $str154$RedGetExtendedNameWithPeriodSepar = makeString( "RedGetExtendedNameWithPeriodSeparatorList" );
    $sym155$RED_GET_EXTENDED_NAME_WITH_PERIOD_SEPARATOR_LIST_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-EXTENDED-NAME-WITH-PERIOD-SEPARATOR-LIST-IMPLEMENTATION%" );
    $str156$RedGetSuperElementIterator = makeString( "RedGetSuperElementIterator" );
    $sym157$RED_GET_SUPER_ELEMENT_ITERATOR_IMPLEMENTATION_ = makeUninternedSymbol( "RED-GET-SUPER-ELEMENT-ITERATOR-IMPLEMENTATION%" );
    $str158$RedSuperElementIteratorHasNext = makeString( "RedSuperElementIteratorHasNext" );
    $sym159$RED_SUPER_ELEMENT_ITERATOR_HAS_NEXT_IMPLEMENTATION = makeSymbol( "RED-SUPER-ELEMENT-ITERATOR-HAS-NEXT-IMPLEMENTATION" );
    $list160 = ConsesLow.list( ConsesLow.list( makeSymbol( "RED-SUPER-ELEMENT-ITERATOR-STRUCT" ), makeKeyword( "OPAQUE" ), makeKeyword( "INTEGER" ) ) );
    $str161$RedSuperElementIteratorNext = makeString( "RedSuperElementIteratorNext" );
    $sym162$RED_SUPER_ELEMENT_ITERATOR_NEXT_IMPLEMENTATION_ = makeUninternedSymbol( "RED-SUPER-ELEMENT-ITERATOR-NEXT-IMPLEMENTATION%" );
    $str163$RedSuperElementIteratorPeek = makeString( "RedSuperElementIteratorPeek" );
    $sym164$RED_SUPER_ELEMENT_ITERATOR_PEEK_IMPLEMENTATION_ = makeUninternedSymbol( "RED-SUPER-ELEMENT-ITERATOR-PEEK-IMPLEMENTATION%" );
    $str165$RedSuperElementIteratorGetReposit = makeString( "RedSuperElementIteratorGetRepositoryList" );
    $sym166$RED_SUPER_ELEMENT_ITERATOR_GET_REPOSITORY_LIST_IMPLEMENTATION_ = makeUninternedSymbol( "RED-SUPER-ELEMENT-ITERATOR-GET-REPOSITORY-LIST-IMPLEMENTATION%" );
    $str167$RedSuperElementIteratorDispose = makeString( "RedSuperElementIteratorDispose" );
    $sym168$RED_SUPER_ELEMENT_ITERATOR_DISPOSE_IMPLEMENTATION = makeSymbol( "RED-SUPER-ELEMENT-ITERATOR-DISPOSE-IMPLEMENTATION" );
  }
}
/*
 * 
 * Total time: 216 ms
 * 
 */
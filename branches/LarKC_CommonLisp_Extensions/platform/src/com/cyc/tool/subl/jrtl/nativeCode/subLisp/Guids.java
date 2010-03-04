/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  final class Guids extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Guids. */
  public Guids() {}
  public static final SubLFile me = new Guids();
  
  //// Public Area
  
  public static SubLSymbol $dtp_guid$ = null;
  
  public static final SubLObject guid_p(SubLObject object) {
    if (object.isGuid()) { return T; }
    return NIL;
  }
  
  public static final SubLObject guid_string_p(SubLObject object) {
    if (object.isString()) {
      return SubLObjectFactory.makeBoolean(SubLGuid.isGuidString(object.getString()));
    }
    return NIL;
  }
  
  public static final SubLObject guid_to_string(SubLObject guid) {
    return guid.toGuid().getGuidString();
  }
  
  public static final SubLObject string_to_guid(SubLObject string) {
    return SubLObjectFactory.makeGuid(string.getString());
  }
  
  public static final SubLObject crack_date_relative_guid(SubLObject guid) {
    return Errors.unimplementedMethod("Guids.crack_date_relative_guid()");
  }
  
  public static final SubLObject date_relative_guid_p(SubLObject guid) {
    return Errors.unimplementedMethod("Guids.date_relative_guid_p()");
  }
  
  public static final SubLObject guidNE(SubLObject guid1, SubLObject guid2) {
    if (guid1.toGuid().compareTo(guid2.toGuid()) != 0) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject guidL(SubLObject guid1, SubLObject guid2) {
    if (guid1.toGuid().compareTo(guid2.toGuid()) < 0) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject guidLE(SubLObject guid1, SubLObject guid2) {
    if (guid1.toGuid().compareTo(guid2.toGuid()) <= 0) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject guidE(SubLObject guid1, SubLObject guid2) {
    if (guid1.toGuid().compareTo(guid2.toGuid()) == 0) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject guidG(SubLObject guid1, SubLObject guid2) {
    if (guid1.toGuid().compareTo(guid2.toGuid()) > 0) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject guidGE(SubLObject guid1, SubLObject guid2) {
    if (guid1.toGuid().compareTo(guid2.toGuid()) >= 0) {
      return T;
    }
    return NIL;
  }
  
  public static final SubLObject make_date_relative_guid(SubLObject year, SubLObject month, SubLObject day, SubLObject offset) {
    return Errors.unimplementedMethod("Guids.make_date_relative_guid()");
  }
  
  public static final SubLObject new_guid() {
    return SubLObjectFactory.makeGuid();
  }
  
  public static final SubLObject assemble_fixnums_to_guid (SubLObject byte_vector) {
    return SubLObjectFactory.makeGuid(byte_vector.toVect());  
  }
  
  public static final SubLObject disassemble_guid_to_fixnums (SubLObject guid, SubLObject byteVector) {
    if (byteVector == UNPROVIDED) { byteVector = SubLObjectFactory.makeVector(16, ZERO_INTEGER); }
    guid.toGuid().fillByteVector(byteVector.toVect());
    return byteVector;
  }
  
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "assemble_fixnums_to_guid",    "ASSEMBLE-FIXNUMS-TO-GUID",    1, 0, false);
    SubLFiles.declareFunction(me, "disassemble_guid_to_fixnums", "DISASSEMBLE-GUID-TO-FIXNUMS", 1, 1, false);
    SubLFiles.declareFunction(me, "crack_date_relative_guid", "CRACK-DATE-RELATIVE-GUID", 1, 0, false);
    SubLFiles.declareFunction(me, "date_relative_guid_p", "DATE-RELATIVE-GUID-P", 1, 0, false);
    SubLFiles.declareFunction(me, "guid_string_p", "GUID-STRING-P", 1, 0, false);
    SubLFiles.declareFunction(me, "guid_to_string", "GUID-TO-STRING", 1, 0, false);
    SubLFiles.declareFunction(me, "guidNE", "GUID/=", 2, 0, false);
    SubLFiles.declareFunction(me, "guidL",  "GUID<",  2, 0, false);
    SubLFiles.declareFunction(me, "guidLE", "GUID<=", 2, 0, false);
    SubLFiles.declareFunction(me, "guidE",  "GUID=",  2, 0, false);
    SubLFiles.declareFunction(me, "guidG",  "GUID>",  2, 0, false);
    SubLFiles.declareFunction(me, "guidGE", "GUID>=", 2, 0, false);
    SubLFiles.declareFunction(me, "make_date_relative_guid", "MAKE-DATE-RELATIVE-GUID", 4, 0, false);
    SubLFiles.declareFunction(me, "new_guid", "NEW-GUID", 0, 0, false);
    SubLFiles.declareFunction(me, "string_to_guid", "STRING-TO-GUID", 1, 0, false);
    SubLFiles.declareFunction(me, "guid_p",         "GUID-P",         1, 0, false);
  }
  
  public void initializeVariables() {
    $dtp_guid$ = SubLFiles.defconstant(me, "*DTP-GUID*", SubLObjectFactory.makeInteger(127));
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}

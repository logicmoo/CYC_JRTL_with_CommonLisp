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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;


//// Internal Imports

//// External Imports

public  final class Structures implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Structures. */
  public Structures() {}
  public static final SubLFile me = new Structures();
  
  //// Public Area
  
  public static SubLStructDeclNative makeStructDeclNative(
      Class structClass, SubLSymbol typeName, SubLSymbol predicateName,
      SubLList slotNames, SubLList slotKeywordNames, String[] actualFieldNames,
      SubLList getterNames, SubLList setterNames, SubLSymbol printFunction) {
    final SubLSymbol[] slotNamesArray        = (SubLSymbol[]) slotNames.toArray(new SubLSymbol[slotNames.size()]);
    final SubLSymbol[] slotKeywordNamesArray = (SubLSymbol[]) slotKeywordNames.toArray(new SubLSymbol[slotKeywordNames.size()]);
    final SubLSymbol[] getterNamesArray      = (SubLSymbol[]) getterNames.toArray(new SubLSymbol[getterNames.size()]);
    final SubLSymbol[] setterNamesArray      = (SubLSymbol[]) setterNames.toArray(new SubLSymbol[setterNames.size()]);
    return new SubLStructDeclNative(
        structClass, typeName, predicateName,
        slotNamesArray, slotKeywordNamesArray, actualFieldNames,
        getterNamesArray, setterNamesArray,
        printFunction, null, false);
  }
  
  public static SubLSymbol $dtp_structures_bag$ = null;
  
  public static final SubLObject structures_bag_p(SubLObject object) {
    if (object.isStructure()) { return T; }
    return NIL;
  }
  
  public static final SubLObject new_structure(SubLObject type, SubLObject size) {
    return SubLObjectFactory.makeStructInterpreted(size.intValue());
  }
  
  public static final SubLObject clear_structure(SubLObject object, SubLObject size) {
    return Errors.error("This should never happen.");
  }
  
  public static final SubLObject clear_sub_structure(SubLObject object,
      SubLObject size, SubLObject type) {
    object.toStruct().setName(type.toSymbol());
    return object;
  }
  
  public static final SubLObject structure_type(SubLObject object, SubLObject type) {
    if (object.getType() == type) { return T; }
    return NIL;
  }
  
  public static final SubLObject structure_slot(SubLObject struct, SubLObject slot) {
    return struct.getField(slot.intValue());
  }
  
  public static final SubLObject set_structure_slot(SubLObject object, SubLObject slot, SubLObject value) {
    object.setField(slot.intValue(), value);
    return value;
  }
  
  // @todo add and analog of this for structures_bag subtypes
  public static final SubLObject register_defstruct(SubLObject name, SubLObject type, SubLObject size, SubLObject printFunction, SubLObject slots) {
    /*SubLSymbol typeTyped = type.toSymbol();
    SubLSymbol printFunctionTyped = printFunction.toSymbol();
    SubLList slotsTyped = slots.toList();
    int slotCount = slotsTyped.size();
    SubLSymbol[] fieldNames = (SubLSymbol[]) slotsTyped.toArray(new SubLSymbol[slotCount]);
    // @hack the following line is wrong!!!!!!! -APB
    SubLSymbol[] fieldNamesAlt = (SubLSymbol[]) slotsTyped.toArray(new SubLSymbol[slotCount]);
    SubLStructDecl structDecl = new SubLStructDecl(typeTyped, fieldNames, fieldNamesAlt, 
     printFunctionTyped, null, null, false);
     */
    Errors.unimplementedMethod("register-defstruct");
    return NIL;
  }
  
  // Example accessor : C-NAME from the constant defstruct
  // Example setter   : _CSETF-C-NAME associated with C-NAME
  
  private static final SubLSymbol CSETF_TOKEN = SubLObjectFactory.makeSublispSymbol("%CSETF");
  
  public static final SubLObject def_csetf(SubLObject accessor, SubLObject setter) {
    accessor.toSymbol().setProperty(CSETF_TOKEN, setter.toSymbol());
    return accessor;
  }
  
  public static final SubLSymbol getStructureSetter(SubLSymbol accessor) {
    SubLObject getter = accessor.getProperty(CSETF_TOKEN);
    return (getter == null) ? NIL : getter.toSymbol();
  }
  
  private static final int STRUCTURES_BAG_TYPE_CODE = 254;
  
  public static final SubLObject register_method(SubLObject methodTable, SubLObject type, SubLObject function) {
    if (type.isSymbol()) {
      if (methodTable == Sxhash.hashVector) {
        int index = SubLStructDecl.getTypeID(type.toSymbol());
        Sxhash.structHashMeths[index] = UnaryFunction.makeInstance(function.getFunc());
      }
      SubLObject structMethHash = methodTable.get(STRUCTURES_BAG_TYPE_CODE);
      if (structMethHash == NIL) {
        structMethHash = SubLObjectFactory.makeHashtable();
        methodTable.set(STRUCTURES_BAG_TYPE_CODE, structMethHash);
      }
      structMethHash.put(type, function);
    } else {
      methodTable.set(type.intValue(), function);
    }
    return function;
  }
  
  public static final SubLObject method_func(SubLObject object, SubLObject methodTable) {
    // @hack isReaderWriterLock() is a hack until we promote them up to top lvl and assign unique dtp number
    // @hack isSemaphore() is a hack until we promote them up to top lvl and assign unique dtp number
    if (object.isStructure() || object.isReadWriteLock() || object.isSemaphore()) { // @todo this is too slow for looking up hash methods
      SubLObject structMethHash = methodTable.get(STRUCTURES_BAG_TYPE_CODE);
      return (structMethHash == NIL)
      ? NIL : Hashtables.gethash_without_values(object.getType(), structMethHash);
    }
    return methodTable.get(object.getTypeCode().intValue());
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "structures_bag_p",    "_STRUCTURES-BAG-P",    1, 0, false);
    SubLFiles.declareFunction(me, "new_structure",       "_NEW-STRUCTURE",       2, 0, false);
    SubLFiles.declareFunction(me, "clear_structure",     "_CLEAR-STRUCTURE",     2, 0, false);
    SubLFiles.declareFunction(me, "clear_sub_structure", "_CLEAR-SUB-STRUCTURE", 3, 0, false);
    SubLFiles.declareFunction(me, "structure_type",      "_STRUCTURE-TYPE",      2, 0, false);
    SubLFiles.declareFunction(me, "structure_slot",      "_STRUCTURE-SLOT",      2, 0, false);
    SubLFiles.declareFunction(me, "set_structure_slot",  "_SET-STRUCTURE-SLOT",  3, 0, false);
    SubLFiles.declareFunction(me, "register_defstruct",  "_REGISTER-DEFSTRUCT",  5, 0, false);
    
    SubLFiles.declareFunction(me, "register_method",  "_REGISTER-METHOD",  3, 0, false);
    SubLFiles.declareFunction(me, "def_csetf",        "_DEF-CSETF",        2, 0, false);
  }
  
  public void initializeVariables() {
    $dtp_structures_bag$ = SubLFiles.defconstant(me, "*DTP-STRUCTURES-BAG*", SubLObjectFactory.makeInteger(STRUCTURES_BAG_TYPE_CODE));
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}

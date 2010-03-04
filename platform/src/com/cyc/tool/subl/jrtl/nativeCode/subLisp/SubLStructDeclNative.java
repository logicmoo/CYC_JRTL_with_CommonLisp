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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.lang.reflect.Field;
import java.util.Hashtable;

//// Internal Imports

//// External Imports

public  final class SubLStructDeclNative extends SubLStructDecl {
  
  //// Constructors
  
  public SubLStructDeclNative(
      Class structClass, SubLSymbol structName, SubLSymbol testFunction,
      SubLSymbol[] slotNames, SubLSymbol[] slotKeywordNames, String[] actualFieldNames,
      SubLSymbol[] getterNames, SubLSymbol[] setterNames,
      SubLSymbol printFunction, SubLSymbol hashFunction, boolean isInterned) {
    super(structName, getterNames, setterNames, slotKeywordNames, printFunction, 
        hashFunction, testFunction, isInterned);
    this.actualFieldNames = actualFieldNames;
    int size = actualFieldNames.length;
    fieldDecls = new Field[size];
    try {
      for (int i = 0; i < size; i++) {
        fieldDecls[i] = structClass.getDeclaredField(this.actualFieldNames[i]);
        //@hack somewhat inefficient but not called anywhere critcal
        // declaredFieldNameToFieldHash.put(declaredFieldNames.get(i), fieldDecls[i]);
      }
    } catch (Exception e) {
      Errors.error("Got invalid struct field declaration.", e);
    }
  }
  
  //// Public Area
  
  public final Field getFieldDecl(int i) {
    return fieldDecls[i];
  }
  
  public final void setFieldFromName(SubLSymbol declaredFieldName, SubLObject value) {
    Field field = (Field)declaredFieldNameToFieldHash.get(declaredFieldName);
    if (field == null) {
      Errors.error("Can't find field: "+ declaredFieldName + " on object: " + this + ".");
    }
    try {
      field.set(this, value);
    } catch (Exception e) {
      Errors.error("Unable to set field on: " + this + ".", e);
    }
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private Field[] fieldDecls;
  private Class structClass;
  private String[] actualFieldNames;
  private Hashtable declaredFieldNameToFieldHash = new Hashtable();
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}

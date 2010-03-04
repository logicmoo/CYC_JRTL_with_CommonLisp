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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.HashMap;
import java.util.Map;

//// Internal Imports

//// External Imports

public  class SubLStructDecl {
  
  //// Constructors
  
  /** Creates a new instance of SubLStructDecl. */
  SubLStructDecl(SubLSymbol structName, SubLSymbol[] getterNames,
      SubLSymbol[] setterNames, SubLSymbol[] slotKeywords, SubLSymbol printFunction,
      SubLSymbol hashFunction, SubLSymbol testFunction, boolean isInterned) {
    this.getterNames = getterNames;
    this.setterNames = setterNames;
    this.printFunction = printFunction;
    this.structName = structName;
    this.hashFunction = hashFunction;
    this.testFunction = testFunction;
    this.isInterned = isInterned;
    this.id = getTypeID(structName);
    this.slotKeywords = slotKeywords;
    this.slotNames = new SubLSymbol[getterNames.length];
    // @hack to determine original slot names
    SubLPackage pkg = structName.getPackage();
    for (int i = 0, size = slotNames.length; i < size; i++) {
      try {
        SubLSymbol slotKeyword = slotKeywords[i];
        String stotStr = slotKeyword.getName();
        SubLSymbol slotSymbol = SubLObjectFactory.makeSymbol(stotStr, pkg);
        slotNames[i] = slotSymbol;
      } catch (Exception e) {
        Errors.error(e.getMessage(), e);
      }
    }
    // @endhack
    structNameToStructDeclMap.put(structName, this);
  }
  
  //// Public Area
  
  public static final int getTypeID(SubLSymbol typeName) {
    synchronized(structNameToIDMap) {
      Integer id = (Integer) structNameToIDMap.get(typeName);
      if (id == null) {
        if (idCounter >= Sxhash.MAX_STRUCT_DECLARATIONS) {
          Errors.error("Too many sturcuture declarations.");
        }
        id = new Integer(idCounter++);
        structNameToIDMap.put(typeName, id);
      }
      return id.intValue();
    }
  }
  
  public static final SubLStructDecl getStructDecl(SubLSymbol structName) {
    SubLStructDecl structDecl = (SubLStructDecl) structNameToStructDeclMap.get(structName);
    if (structDecl == null) {
      Errors.error("Invalid struct name: " + structName);
    }
    return structDecl;
  }
  
  public final int getFieldNumForSymbol(SubLSymbol symbol) {
    for (int i = 0, size = slotNames.length; i < size; i++) {
      if (slotNames[i] == symbol) {
        return i + 2;
      }
    }
    Errors.error(symbol + " is not a valid field of struct: " + structName);
    return -1;
  }
  
  public int getId() {
    return id;
  }
  
  public final SubLSymbol getStructName() {
    return structName;
  }
  
  public final void setStructName(SubLSymbol newStructName) {
    if (structName != SubLNil.NIL) {
      Errors.error("Can't set a structure's name twice: " + newStructName);
    }
    structName = newStructName;
  }
  
  public final SubLSymbol getGetterName(int i) {
    return getterNames[i];
  }
  
  public final SubLSymbol getSetterName(int i) {
    return setterNames[i];
  }
  
  public final int getFieldCount() {
    return getterNames.length;
  }
  
  public final boolean isInterned() {
    return isInterned;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private final int id;
  
  public boolean isInterned = false;
  
  private SubLSymbol structName = SubLNil.NIL;
  
  private SubLSymbol concName = SubLNil.NIL;
  
  private SubLSymbol[] getterNames;
  
  private SubLSymbol[] slotNames;
  
  private SubLSymbol[] slotKeywords;
  
  private SubLSymbol[] setterNames;
  
  private SubLSymbol printFunction;
  
  private SubLSymbol hashFunction;
  
  private SubLSymbol testFunction;
  
  // @todo worry about synchronization
  private static final Map<SubLSymbol, SubLStructDecl> structNameToStructDeclMap
      = new HashMap<SubLSymbol, SubLStructDecl>();

  private static final Map<SubLSymbol, Integer> structNameToIDMap = new HashMap<SubLSymbol, Integer>();
  
  // @todo worry about synchronization
  protected static int idCounter =  0;
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}

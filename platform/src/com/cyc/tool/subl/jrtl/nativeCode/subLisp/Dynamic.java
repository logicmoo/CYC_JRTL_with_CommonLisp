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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolImpl;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.ArrayList;

//// Internal Imports

//// External Imports

public  class Dynamic extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Dynamic. */
  public Dynamic() {}
  public static final SubLFile me = new Dynamic();
  
  
  //// Public Area
  
  public static final SubLObject currentBinding(SubLSymbol symbol) {
    return symbol.currentBinding(SubLProcess.currentSubLThread().bindingsList);
  }
  
  public static final void bind(SubLSymbol symbol, SubLObject newValue) {
    symbol.bind(newValue, SubLProcess.currentSubLThread().bindingsList);
  }
  
  public static final void rebind(SubLSymbol symbol, SubLObject oldValue) {
    symbol.rebind(oldValue, SubLProcess.currentSubLThread().bindingsList);
  }
  
  public static final ArrayList<SubLObject> extract_dynamic_values(SubLObject variables) {
    final SubLThread $thread = SubLProcess.currentSubLThread();
    final SubLObject[] $bindings = $thread.bindingsList; 
    ArrayList<SubLObject> oldValues = new ArrayList<SubLObject>(); // @todo resource this
    for (SubLObject cur = variables; cur != NIL; cur = cur.rest()) {
      oldValues.add(cur.first().toSymbol().getDynamicValue($bindings));
    }
    return oldValues;
  }
  
  public static final void bind_dynamic_vars(SubLObject variables, SubLObject values) {
    SubLList variablesTyped = variables.toList();
    SubLList valuesTyped    = values.toList();
    SubLListListIterator iter  = null;
    SubLListListIterator iter2 = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter = resourcer.acquireSubLListListIterator(variablesTyped);
      iter2 = resourcer.acquireSubLListListIterator(valuesTyped);
      while (iter.hasNext() && iter2.hasNext()) {
        bind(iter.nextSubLObject().toSymbol(), iter2.nextSubLObject());
      }
      while (iter.hasNext()) {
        bind(iter.nextSubLObject().toSymbol(), SubLSymbolImpl.UNBOUND);
      }
    } finally {
      resourcer.releaseSubLListListIterator(iter);
      resourcer.releaseSubLListListIterator(iter2);
    }
  }
  
  public static final void rebind_dynamic_vars(SubLObject variables, ArrayList oldValues) {
    SubLList variablesTyped = variables.toList();
    SubLListListIterator iter = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter = resourcer.acquireSubLListListIterator(variablesTyped);
      int oldIndex = 0;
      SubLSymbol variable = null;
      while (iter.hasNext()) {
        variable = iter.nextSubLObject().toSymbol();
        rebind(variable, (SubLObject) oldValues.get(oldIndex++));
      }
    } finally {
      resourcer.releaseSubLListListIterator(iter);
    }
  }
  
  public static final SubLObject sublisp_throw(SubLObject tag, SubLObject result) {
    // @todo we'll need to note the catches on the binding stack so that we
    // can scan the stack first to see if TAG will be caught.  If not, we
    // should throw a SubLException "Attempt to throw to the non-existent tag"
    CatchableThrow.throwToCatch(tag, result);
    return null;
  }
  
  public static final SubLObject handleCatchableThrow(CatchableThrow ct, SubLObject target) {
    if (getTarget(ct).eql(target)) {
      return getResult(ct);
    } else {
      throw ct;
    }
  }
  
  public static final SubLObject getTarget(CatchableThrow ct) {
    return ct.getTarget();
  }
  
  public static final SubLObject getResult(CatchableThrow ct) {
    return ct.getResult();
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "sublisp_throw", "THROW", 2, 0, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}

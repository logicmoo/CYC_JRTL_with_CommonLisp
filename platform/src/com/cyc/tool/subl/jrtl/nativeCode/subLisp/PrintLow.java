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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.format;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

/**
 * <P>PrintLow is designed to...
 *
 * <P>Copyright (c) 2005 Cycorp, Inc.  All rights reserved.
 * <BR>This software is the proprietary information of Cycorp, Inc.
 * <P>Use is subject to license terms.
 *
 * @author goolsbey
 * @date March 13, 2006, 2:11 PM
 * @version $Id: PrintLow.java 126764 2009-01-07 22:27:23Z tbrussea $
 */

public final class PrintLow extends SubLTrampolineFile {
  //// Constructors
  
  /** Creates a new instance of PrintLow. */
  
  public PrintLow() {}
  public static final SubLFile me = new PrintLow();
  
  //// Public Area
  //public static SubLSymbol $print_object_method_table$ = null;
  
  public static SubLSymbol $print_level$ = null;
  public static SubLSymbol $print_length$ = null;
  
  public static final SubLObject format(SubLObject destination, SubLObject controlString, SubLObject[] args) {
    final SubLObject arg_list = SubLObjectFactory.makeList(args);
    return format.really_format(destination, controlString, arg_list);
  }
  
  public static final SubLObject format(SubLObject destination, SubLObject controlString) {
    return format.really_format(destination, controlString, NIL);
  }
  
  public static final SubLObject format(SubLObject destination, SubLObject controlString, SubLObject arg1) {
    final SubLObject arg_list = ConsesLow.list(arg1);
    return format.really_format(destination, controlString, arg_list);
  }
  
  public static final SubLObject format(SubLObject destination, SubLObject controlString, SubLObject arg1, SubLObject arg2) {
    final SubLObject arg_list = ConsesLow.list(arg1, arg2);
    return format.really_format(destination, controlString, arg_list);
  }
  
  public static final SubLObject write_to_string(SubLObject object, SubLObject[]keys) {
    final SubLObject key_list = SubLObjectFactory.makeList(keys);
    return print_high.really_write_to_string(object, key_list);
  }
  
  public static final SubLObject write(SubLObject object, SubLObject[]keys) {
    final SubLObject key_list = SubLObjectFactory.makeList(keys);
    return print_high.really_write( object, key_list);
  }
  
  public static final boolean controlPrintLength() {
    return $print_length$.getValue().isNumber();
  }
  
  public static final boolean controlPrintLevel() {
    return $print_level$.getValue().isNumber();
  }
  
  public static final int maxPrintLength() {
    if (controlPrintLength()) {
      return $print_length$.getDynamicValue().intValue();
    } else {
      // wrong, but ... should not have called it!
      return Integer.MAX_VALUE;
    }
  }
  
  public static final int maxPrintLevel() {
    if (controlPrintLevel()) {
      return $print_level$.getDynamicValue().intValue();
    } else {
      // wrong, but ... should not have called it!
      return Integer.MAX_VALUE;
    }
  }
  
  public static final SubLObject maybeIncreasePrintLevel() {
    if (controlPrintLevel()) {
      final SubLNumber nextLevel = SubLObjectFactory.makeInteger(maxPrintLevel()-1);
      SubLObject oldValue = $print_level$.getDynamicValue();
      Dynamic.bind($print_level$, nextLevel);
      return oldValue;
    }   
    return null;
  }
  
  public static final boolean shouldPrintAtCurrentLevel() {
    if (controlPrintLevel()) {
      return (maxPrintLevel() > 0);
    } else {
      // no print level control --> always print
      return true;
    }
  }
  
  public static final void maybeDecreasePrintLevel(SubLObject oldLevel) {
    if (controlPrintLevel()) {
      if (oldLevel != null) {
        Dynamic.rebind($print_level$, oldLevel);
      }
    }
  }
  
//// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "format", "FORMAT", 2, 0, true);
    SubLFiles.declareFunction(me, "write_to_string",  "WRITE-TO-STRING",  1, 0, true);
    SubLFiles.declareFunction(me, "write",  "WRITE",  1, 0, true);
    SubLFiles.declareFunction(me, "default_jrtl_print_method", "DEFAULT-JRTL-PRINT-METHOD", 2, 0, false);
  }
  
  public void initializeVariables() {
    //$print_object_method_table$ = SubLFiles.deflexical(me, "*PRINT-OBJECT-METHOD-TABLE*", SubLObjectFactory.makeVector(256, NIL));
    $print_level$ = SubLFiles.defparameter(me, "*PRINT-LEVEL*", SubLObjectFactory.makeInteger(50));
    $print_length$ = SubLFiles.defparameter(me, "*PRINT-LENGTH*", SubLObjectFactory.makeInteger(100));
  }
  
  public void runTopLevelForms() {
  }
  
  public static final void registerJRTLPrintMethods() {
    SubLSymbol defaultPrintSymbol = SubLSymbolFactory.makeSymbol("DEFAULT-JRTL-PRINT-METHOD", "SUBLISP");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), 
        Types.$dtp_package$.getGlobalValue(), defaultPrintSymbol);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), 
        Types.$dtp_lock$.getGlobalValue(), defaultPrintSymbol);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), 
        Types.$dtp_stream$.getGlobalValue(), defaultPrintSymbol);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), 
        SubLReadWriteLock.READ_WRITE_LOCK_TYPE_SYMBOL, defaultPrintSymbol);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), 
        SubLSemaphore.SEMAPHORE_TYPE_SYMBOL, defaultPrintSymbol);
    // @note the following is a no-opt because of implementation of print_high.print_object_wrapper
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), 
        Types.$dtp_hash_table$.getGlobalValue(), defaultPrintSymbol);
  }
  
  public static final SubLObject default_jrtl_print_method(SubLObject obj, SubLObject stream) {
    streams_high.writeString(obj.toString(), stream.toOutputTextStream());
    return obj;
  }
  
//// Protected Area
  
//// Private Area
  
//// Internal Rep
  
//// Main
  
}

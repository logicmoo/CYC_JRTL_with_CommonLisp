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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.net.InetAddress;

//// Internal Imports

//// External Imports

public  class Environment extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Environment. */
  public Environment() {}
  public static final SubLFile me = new Environment();
  
  //// Public Area
  
  public static SubLSymbol $lisp_implementation_type$;
  public static SubLSymbol $lisp_implementation_version$;
  public static SubLSymbol $short_site_name$;
  public static SubLSymbol $long_site_name$;
  public static SubLSymbol $machine_instance$;
  public static SubLSymbol $machine_type$;
  public static SubLSymbol $machine_version$;
  public static SubLSymbol $software_type$;
  public static SubLSymbol $software_version$;
  public static SubLSymbol $user$;
  public static SubLSymbol $process_id$;
  public static SubLSymbol $network_name$;
  
  public static final SubLObject get_machine_name(SubLObject defaultVal) {
   return $machine_instance$.getValue();
  }
  
  public static final SubLObject get_network_name(SubLObject defaultVal) {
    return $network_name$.getValue();
  }
  
  public static final SubLObject get_process_id(SubLObject defaultVal) {
    return $process_id$.getValue();
  }
  
  public static final SubLObject get_user_name(SubLObject defaultVal) {
    return $user$.getValue();
  }
  
  public static final SubLObject lisp_implementation_type() {
    return $lisp_implementation_type$.getValue();
  }
  
  public static final SubLObject lisp_implementation_version() {
    return $lisp_implementation_version$.getValue();
  }
  
  public static final SubLObject long_site_name() {
    return $long_site_name$.getValue();
  }
  
  public static final SubLObject machine_instance() {
    return $machine_instance$.getValue();
  }
  
  public static final SubLObject machine_type() {
    return $machine_type$.getValue();
  }
  
  public static final SubLObject machine_version() {
    return $machine_version$.getValue();
  }
  
  public static final SubLObject short_site_name() {
    return $short_site_name$.getValue();
  }
  
  public static final SubLObject software_type() {
    return $software_type$.getValue();
  }
  
  public static final SubLObject software_version() {
    return $software_version$.getValue();
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "get_machine_name", "GET-MACHINE-NAME", 0, 1, false);
    SubLFiles.declareFunction(me, "get_network_name", "GET-NETWORK-NAME", 0, 1, false);
    SubLFiles.declareFunction(me, "get_process_id", "GET-PROCESS-ID", 0, 1, false);
    SubLFiles.declareFunction(me, "get_user_name", "GET-USER-NAME", 0, 1, false);
    SubLFiles.declareFunction(me, "lisp_implementation_type", "LISP-IMPLEMENTATION-TYPE", 0, 0, false);
    SubLFiles.declareFunction(me, "lisp_implementation_version", "LISP-IMPLEMENTATION-VERSION", 0, 0, false);
    SubLFiles.declareFunction(me, "long_site_name", "LONG-SITE-NAME", 0, 0, false);
    SubLFiles.declareFunction(me, "machine_instance", "MACHINE-INSTANCE", 0, 0, false);
    SubLFiles.declareFunction(me, "machine_type", "MACHINE-TYPE", 0, 0, false);
    SubLFiles.declareFunction(me, "machine_version", "MACHINE-VERSION", 0, 0, false);
    SubLFiles.declareFunction(me, "short_site_name", "SHORT-SITE-NAME", 0, 0, false);
    SubLFiles.declareFunction(me, "software_type", "SOFTWARE-TYPE", 0, 0, false);
    SubLFiles.declareFunction(me, "software_version", "SOFTWARE-VERSION", 0, 0, false);
  }
  
  public void initializeVariables() {
    $lisp_implementation_type$ = SubLFiles.defconstant(me, "*LISP-IMPLEMENTATION-TYPE*",  
      SubLObjectFactory.makeString("Cycorp Java SubL Runtime Environment"));
    $lisp_implementation_version$ = SubLFiles.defconstant(me, "*LISP-IMPLEMENTATION-VERSION*",  
      SubLObjectFactory.makeString("Version 1.0")); // @todo do something better here
    $machine_version$ = SubLFiles.defconstant(me, "*MACHINE-VERSION*",  SubLNil.NIL); // @todo do something better here
    $short_site_name$ = SubLFiles.defconstant(me, "*SHORT-SITE-NAME*",  SubLNil.NIL); // @todo do something better here
    $long_site_name$ = SubLFiles.defconstant(me, "*LONG-SITE-NAME*",  SubLNil.NIL); // @todo do something better here
    $machine_type$ = SubLFiles.defconstant(me, "*MACHINE-TYPE*",  
      SubLObjectFactory.makeString(System.getProperty("os.name") +  " " + System.getProperty("os.version") 
      + " " +  System.getProperty("os.arch")));
    $machine_version$ = SubLFiles.defconstant(me, "*MACHINE-VERSION*",  SubLNil.NIL); // @todo do something better here
    $software_type$ = SubLFiles.defconstant(me, "*SOFTWARE-TYPE*",   
      SubLObjectFactory.makeString(System.getProperty("java.vm.name") + " " +  System.getProperty("java.vm.vendor")));
    $software_version$ = SubLFiles.defconstant(me, "*SOFTWARE-VERSION*",  SubLObjectFactory.makeString(System.getProperty("java.vm.version")));
    $user$ = SubLFiles.defconstant(me, "*USER*",  SubLObjectFactory.makeString(System.getProperty("user.name")));
    $process_id$ = SubLFiles.defconstant(me, "*PROCESS-ID*",SubLObjectFactory.makeInteger(0));
    try {
      InetAddress addr = InetAddress.getLocalHost();
    $machine_instance$ = SubLFiles.defconstant(me, "*MACHINE-INSTANCE*",  SubLObjectFactory.makeString(addr.getHostName()));
      $network_name$ = SubLFiles.defconstant(me, "*NETWORK-NAME*", SubLObjectFactory.makeString(addr.getHostName()));
    } catch (Exception e) {
      $network_name$ = SubLFiles.defconstant(me, "*NETWORK-NAME*", SubLObjectFactory.makeString("UNKNOWN"));
    $machine_instance$ = SubLFiles.defconstant(me, "*MACHINE-INSTANCE*",  SubLObjectFactory.makeString("UNKNOWN"));
    }
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}

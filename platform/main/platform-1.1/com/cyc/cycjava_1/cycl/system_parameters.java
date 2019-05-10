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

package  com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.file_utilities;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.system_info;

public  final class system_parameters extends SubLTranslatedFile {

  //// Constructor

  private system_parameters() {}
  public static final SubLFile me = new system_parameters();
  public static final String myName = "com.cyc.cycjava_1.cycl.system_parameters";

  //// Definitions

  /** The list of all known valid system parameter types. */
  @SubL(source = "cycl/system-parameters.lisp", position = 896) 
  private static SubLSymbol $valid_system_parameter_types$ = null;

  /** The list of system parameters defined by DEFINE-SYSTEM-PARAMETER. */
  @SubL(source = "cycl/system-parameters.lisp", position = 1173) 
  private static SubLSymbol $system_parameters$ = null;

  /** Helper function for the macro DEFINE-SYSTEM-PARAMETER */
  @SubL(source = "cycl/system-parameters.lisp", position = 1488) 
  public static final SubLObject register_system_parameter(SubLObject name, SubLObject v_default, SubLObject type, SubLObject description) {
    if ((NIL == conses_high.member(type, $valid_system_parameter_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
      Errors.warn($str3$_S__S_has_an_unknown_type__S_, $sym4$DEFINE_SYSTEM_PARAMETER, name, type);
    }
    remove_system_parameter(name);
    $system_parameters$.setGlobalValue(cons(list(name, v_default, type, description), $system_parameters$.getGlobalValue()));
    return name;
  }

  /** @param NAME: symbolp
   Remove NAME from the system parameters. */
  @SubL(source = "cycl/system-parameters.lisp", position = 1872) 
  public static final SubLObject remove_system_parameter(SubLObject name) {
    checkType(name, $sym5$SYMBOLP);
    $system_parameters$.setGlobalValue(Sequences.delete(name, $system_parameters$.getGlobalValue(), Symbols.symbol_function(EQ), Symbols.symbol_function($sym6$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  @SubL(source = "cycl/system-parameters.lisp", position = 2664) 
  public static final SubLObject system_parameter_value_unset_p(SubLObject value) {
    return Equality.eq(value, $kw12$UNSET);
  }

  @SubL(source = "cycl/system-parameters.lisp", position = 2746) 
  public static final SubLObject check_system_parameters() {
    {
      SubLObject cdolist_list_var = $system_parameters$.getGlobalValue();
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        {
          SubLObject datum = entry;
          SubLObject current = datum;
          SubLObject symbol = NIL;
          SubLObject v_default = NIL;
          SubLObject type = NIL;
          SubLObject description = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
          symbol = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
          v_default = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
          type = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list13);
          description = current.first();
          current = current.rest();
          if ((NIL == current)) {
            if ((NIL == Symbols.boundp(symbol))) {
              Errors.warn($str14$The_system_parameter__S_is_not_bo, symbol);
            } else if ((NIL != system_parameter_value_unset_p(Symbols.symbol_value(symbol)))) {
              Errors.warn($str15$The_system_parameter__S_was_not_i, symbol);
            } else {
              {
                SubLObject okP = NIL;
                SubLObject value = Symbols.symbol_value(symbol);
                SubLObject pcase_var = type;
                if (pcase_var.eql($sym16$T_OR_NIL)) {
                  okP = makeBoolean(((value == T)
                        || (value == NIL)));
                } else if (pcase_var.eql($sym17$NIL_OR_STRING)) {
                  okP = makeBoolean(((NIL == value)
                        || value.isString()));
                } else if (pcase_var.eql($sym18$STRING)) {
                  okP = Types.stringp(value);
                } else if (pcase_var.eql($sym19$FULL_PATH)) {
                  okP = Types.stringp(value);
                } else if (pcase_var.eql($sym20$INTEGER)) {
                  okP = Types.integerp(value);
                } else if (pcase_var.eql($sym21$SYMBOL)) {
                  okP = Types.symbolp(value);
                } else if (pcase_var.eql($sym22$NONE)) {
                  okP = T;
                } else {
                  okP = NIL;
                }
                if ((NIL == okP)) {
                  Errors.warn($str23$The_system_paramater__S_has_the_v, symbol, value, type);
                }
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list13);
          }
        }
      }
    }
    return NIL;
  }

  /** Load the system-parameters file. */
  @SubL(source = "cycl/system-parameters.lisp", position = 7901) 
  public static final SubLObject load_system_parameters() {
    {
      SubLObject filename = file_utilities.cyc_home_filename($list26, $str27$parameters, $str28$lisp);
      if ((NIL != Filesys.probe_file(filename))) {
        {
          SubLObject stream = NIL;
          try {
            stream = compatibility.open_text(filename, $kw44$INPUT);
            if ((!(stream.isStream()))) {
              Errors.error($str30$Unable_to_open__S, filename);
            }
            {
              SubLObject stream_4 = stream;
              SubLObject done = NIL;
              while ((NIL == done)) {
                {
                  SubLObject form = read_parameter_form(stream_4);
                  if (($kw45$EOF == form)) {
                    done = T;
                  } else {
                    evaluate_parameter_form(form);
                  }
                }
              }
            }
          } finally {
            {
              SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
              try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
                if (stream.isStream()) {
                  streams_high.close(stream, UNPROVIDED);
                }
              } finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
              }
            }
          }
        }
      } else {
        Errors.warn($str46$System_parameters_file___A__not_l, filename);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/system-parameters.lisp", position = 8435) 
  public static final SubLObject read_parameter_form(SubLObject stream) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject parameter_form = NIL;
        {
          SubLObject _prev_bind_0 = reader.$read_eval$.currentBinding(thread);
          try {
            reader.$read_eval$.bind(NIL, thread);
            parameter_form = reader.read(stream, NIL, $kw45$EOF, UNPROVIDED);
          } finally {
            reader.$read_eval$.rebind(_prev_bind_0, thread);
          }
        }
        return parameter_form;
      }
    }
  }

  @SubL(source = "cycl/system-parameters.lisp", position = 8630) 
  public static final SubLObject evaluate_parameter_form(SubLObject form) {
    {
      SubLObject datum = form;
      SubLObject current = datum;
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
      operator = current.first();
      current = current.rest();
      {
        SubLObject args = current;
        SubLObject pcase_var = operator;
        if (pcase_var.eql($sym48$IN_PACKAGE)) {
          Eval.eval($list49);
        } else if (pcase_var.eql($sym50$CSETQ)) {
          {
            SubLObject datum_5 = args;
            SubLObject current_6 = datum_5;
            SubLObject symbol = NIL;
            SubLObject value = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list51);
            symbol = current_6.first();
            current_6 = current_6.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_6, datum_5, $list51);
            value = current_6.first();
            current_6 = current_6.rest();
            if ((NIL == current_6)) {
              if ((NIL != conses_high.member(symbol, $system_parameters$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym2$FIRST)))) {
                Symbols.set(symbol, evaluate_parameter_value(value));
              }
            } else {
              cdestructuring_bind.cdestructuring_bind_error(datum_5, $list51);
            }
          }
        } else if (pcase_var.eql($sym52$CHECK_SYSTEM_PARAMETERS)) {
          check_system_parameters();
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/system-parameters.lisp", position = 9054) 
  public static final SubLObject evaluate_parameter_value(SubLObject value) {
    if (value.isAtom()) {
      return value;
    }
    {
      SubLObject datum = value;
      SubLObject current = datum;
      SubLObject operator = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list47);
      operator = current.first();
      current = current.rest();
      {
        SubLObject args = current;
        if (($sym10$QUOTE == operator)) {
          return args.first();
        }
      }
    }
    return NIL;
  }

  /** Possible values: NIL, T.  If NIL, transcript problems will cause error
breaks that make the system stop.  If T, such problems will not cause
breakage. */
  @SubL(source = "cycl/system-parameters.lisp", position = 9266) 
  public static SubLSymbol $auto_continue_transcript_problems$ = null;

  /** Possible values: NIL, T.  If NIL, agenda errors will cause the system to
halt.  If T, they will be automatically continued. */
  @SubL(source = "cycl/system-parameters.lisp", position = 9756) 
  public static SubLSymbol $continue_agenda_on_error$ = null;

  /** Possible values: T, NIL.  Type checking occurs in SBHL modules iff this
is nil. */
  @SubL(source = "cycl/system-parameters.lisp", position = 10079) 
  public static SubLSymbol $suspend_sbhl_type_checkingP$ = null;

  /** Possible values: T, NIL.  If NIL, the System Info page (accessible to
administrators only) will estimate, rather than actually count, the
number of operations in the transcript.  If T, it will actually count
them, which takes longer but is accurate. */
  @SubL(source = "cycl/system-parameters.lisp", position = 10239) 
  public static SubLSymbol $really_count_transcript_ops$ = null;

  /** Possible values: NIL, T.  If NIL, a local transcript will always be 
written when operations are done, even if those operations are also being 
written to the master transcript.  If T, then the image does not write 
to a local transcript file, and will write to the master transcript when
it is set to transmit operations.  This allows an image that is standalone,
and always in :TRANSMIT-AND-RECEIVE, to keep only a single copy of its 
operations. */
  @SubL(source = "cycl/system-parameters.lisp", position = 10569) 
  public static SubLSymbol $dont_record_operations_locally$ = null;

  /** Possible values -- :TRANSMIT-AND-RECEIVE, :RECEIVE-ONLY, 
:ISOLATED, :DEAF, :DEAD.  This is the communication mode the cyc image 
should get initialized to at startup. */
  @SubL(source = "cycl/system-parameters.lisp", position = 11101) 
  public static SubLSymbol $startup_communication_mode$ = null;

  /** Possible values: T, NIL.  If NIL, the Cyc agenda is not started at 
startup, but can be enabled later by the user.  If T, the agenda is enabled
at startup. */
  @SubL(source = "cycl/system-parameters.lisp", position = 11350) 
  public static SubLSymbol $start_agenda_at_startupP$ = null;

  /** The base port offset for all the TCP services for the Cyc image. */
  @SubL(source = "cycl/system-parameters.lisp", position = 11581) 
  public static SubLSymbol $base_tcp_port$ = null;

  /** Possible values: A number.  This parameter specifies the offset of the Cyc API
 (application program interface) service from *base-tcp-port*. */
  @SubL(source = "cycl/system-parameters.lisp", position = 12527) 
  public static SubLSymbol $fi_port_offset$ = null;

  /** Possible values: A number.  This parameter specifies the offset of the Cyc 
CFASL-server service from *base-tcp-port*. */
  @SubL(source = "cycl/system-parameters.lisp", position = 12913) 
  public static SubLSymbol $cfasl_port_offset$ = null;

  /** Possible values: T, NIL.  IF T, then API functions can access host services including the file system and outbound tcp connections.  The most secure configuration leaves this parameter NIL. */
  @SubL(source = "cycl/system-parameters.lisp", position = 13619) 
  public static SubLSymbol $permit_api_host_access$ = null;

  /** Possible values: T, NIL.  IF T, then writing to the master transcript will be controlled by the Cyc Transcript Server, which will need to be installed at your site.  You only need to set this to T if you are running multiple instances of Cyc.  If NIL, then Cyc will read and write to the master transcript without regard to other processes doing the same. */
  @SubL(source = "cycl/system-parameters.lisp", position = 13882) 
  public static SubLSymbol $use_transcript_server$ = null;

  /** Possible values: NIL or a string.  This parameter is only used if *USE-TRANSCRIPT-SERVER* is T.  If so, then this parameter should be set to the name of the host offering the 
cyc-serializer service. */
  @SubL(source = "cycl/system-parameters.lisp", position = 14312) 
  public static SubLSymbol $master_transcript_lock_host$ = null;

  /** Possible values: A number.  This parameter is only used if
*USE-TRANSCRIPT-SERVER* is T.  If so, then this
parameter should be set to the port number of the cyc-serializer
read service. */
  @SubL(source = "cycl/system-parameters.lisp", position = 14597) 
  public static SubLSymbol $master_transcript_server_port$ = null;

  /** Possible values: T, NIL.  If NIL, require authentication before allowing
modifications to the knowledge base.  If T, any user is allowed to
modify the knowledge base. */
  @SubL(source = "cycl/system-parameters.lisp", position = 14995) 
  public static SubLSymbol $allow_guest_to_editP$ = null;

  /** Possible values: The name of a constant representing a Cyclist.  This is the
default Cyclist initially logged into the system. */
  @SubL(source = "cycl/system-parameters.lisp", position = 15409) 
  public static SubLSymbol $default_cyclist_name$ = null;

  /** The directory under which Cyc images (.gif or otherwise) are stored */
  @SubL(source = "cycl/system-parameters.lisp", position = 15611) 
  public static SubLSymbol $html_image_directory$ = null;

  /** The directory under which Javascript files used by the browser are stored */
  @SubL(source = "cycl/system-parameters.lisp", position = 15929) 
  public static SubLSymbol $html_javascript_directory$ = null;

  /** The directory under which Javascript files used by the browser are stored */
  @SubL(source = "cycl/system-parameters.lisp", position = 16089) 
  public static SubLSymbol $html_css_directory$ = null;

  /** Possible values: One of the symbols :CYCORP or :UNKNOWN. If the execution context
     is set to :CYCORP, then the CYC image can assume that it is running in
     Cycorp's development environment and make strong assumptions about setup
     and infrastructure. */
  @SubL(source = "cycl/system-parameters.lisp", position = 16243) 
  public static SubLSymbol $cyc_execution_context$ = null;

  public static final SubLObject declare_system_parameters_file() {
    declareFunction(myName, "all_system_parameters", "ALL-SYSTEM-PARAMETERS", 0, 0, false);
    declareFunction(myName, "register_system_parameter", "REGISTER-SYSTEM-PARAMETER", 4, 0, false);
    declareFunction(myName, "remove_system_parameter", "REMOVE-SYSTEM-PARAMETER", 1, 0, false);
    declareMacro(myName, "define_system_parameter", "DEFINE-SYSTEM-PARAMETER");
    declareFunction(myName, "system_parameter_value_unset_p", "SYSTEM-PARAMETER-VALUE-UNSET-P", 1, 0, false);
    declareFunction(myName, "check_system_parameters", "CHECK-SYSTEM-PARAMETERS", 0, 0, false);
    declareFunction(myName, "alphanumericize_string", "ALPHANUMERICIZE-STRING", 1, 0, false);
    declareFunction(myName, "setup_system_parameters", "SETUP-SYSTEM-PARAMETERS", 1, 1, false);
    declareFunction(myName, "load_system_parameters", "LOAD-SYSTEM-PARAMETERS", 0, 0, false);
    declareFunction(myName, "read_parameter_form", "READ-PARAMETER-FORM", 1, 0, false);
    declareFunction(myName, "evaluate_parameter_form", "EVALUATE-PARAMETER-FORM", 1, 0, false);
    declareFunction(myName, "evaluate_parameter_value", "EVALUATE-PARAMETER-VALUE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_system_parameters_file() {
    $valid_system_parameter_types$ = deflexical("*VALID-SYSTEM-PARAMETER-TYPES*", $list0);
    $system_parameters$ = deflexical("*SYSTEM-PARAMETERS*", ((NIL != Symbols.boundp($sym1$_SYSTEM_PARAMETERS_)) ? ((SubLObject) $system_parameters$.getGlobalValue()) : NIL));
    $auto_continue_transcript_problems$ = defvar("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*", $kw12$UNSET);
    $continue_agenda_on_error$ = defvar("*CONTINUE-AGENDA-ON-ERROR*", $kw12$UNSET);
    $suspend_sbhl_type_checkingP$ = defvar("*SUSPEND-SBHL-TYPE-CHECKING?*", $kw12$UNSET);
    $really_count_transcript_ops$ = defvar("*REALLY-COUNT-TRANSCRIPT-OPS*", $kw12$UNSET);
    $dont_record_operations_locally$ = defvar("*DONT-RECORD-OPERATIONS-LOCALLY*", $kw12$UNSET);
    $startup_communication_mode$ = defvar("*STARTUP-COMMUNICATION-MODE*", $kw12$UNSET);
    $start_agenda_at_startupP$ = defvar("*START-AGENDA-AT-STARTUP?*", $kw12$UNSET);
    $base_tcp_port$ = defvar("*BASE-TCP-PORT*", $kw12$UNSET);
    $fi_port_offset$ = defvar("*FI-PORT-OFFSET*", $kw12$UNSET);
    $cfasl_port_offset$ = defvar("*CFASL-PORT-OFFSET*", $kw12$UNSET);
    $permit_api_host_access$ = defvar("*PERMIT-API-HOST-ACCESS*", $kw12$UNSET);
    $use_transcript_server$ = defvar("*USE-TRANSCRIPT-SERVER*", $kw12$UNSET);
    $master_transcript_lock_host$ = defvar("*MASTER-TRANSCRIPT-LOCK-HOST*", $kw12$UNSET);
    $master_transcript_server_port$ = defvar("*MASTER-TRANSCRIPT-SERVER-PORT*", $kw12$UNSET);
    $allow_guest_to_editP$ = defvar("*ALLOW-GUEST-TO-EDIT?*", $kw12$UNSET);
    $default_cyclist_name$ = defvar("*DEFAULT-CYCLIST-NAME*", $kw12$UNSET);
    $html_image_directory$ = defvar("*HTML-IMAGE-DIRECTORY*", $kw12$UNSET);
    $html_javascript_directory$ = defvar("*HTML-JAVASCRIPT-DIRECTORY*", $kw12$UNSET);
    $html_css_directory$ = defvar("*HTML-CSS-DIRECTORY*", $kw12$UNSET);
    $cyc_execution_context$ = defvar("*CYC-EXECUTION-CONTEXT*", $kw12$UNSET);
    return NIL;
  }

  public static final SubLObject setup_system_parameters_file() {
    // CVS_ID("Id: system-parameters.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym1$_SYSTEM_PARAMETERS_);
    register_system_parameter($sym53$_AUTO_CONTINUE_TRANSCRIPT_PROBLEMS_, T, $sym16$T_OR_NIL, $str54$Possible_values__NIL__T___If_NIL_);
    register_system_parameter($sym55$_CONTINUE_AGENDA_ON_ERROR_, T, $sym16$T_OR_NIL, $str56$Possible_values__NIL__T___If_NIL_);
    register_system_parameter($sym57$_SUSPEND_SBHL_TYPE_CHECKING__, NIL, $sym16$T_OR_NIL, $str58$Possible_values__T__NIL___Type_ch);
    register_system_parameter($sym59$_REALLY_COUNT_TRANSCRIPT_OPS_, NIL, $sym16$T_OR_NIL, $str60$Possible_values__T__NIL___If_NIL_);
    register_system_parameter($sym61$_DONT_RECORD_OPERATIONS_LOCALLY_, NIL, $sym16$T_OR_NIL, $str62$Possible_values__NIL__T___If_NIL_);
    register_system_parameter($sym63$_STARTUP_COMMUNICATION_MODE_, $kw64$DEAF, $sym21$SYMBOL, $str65$Possible_values_____TRANSMIT_AND_);
    register_system_parameter($sym66$_START_AGENDA_AT_STARTUP__, T, $sym16$T_OR_NIL, $str67$Possible_values__T__NIL___If_NIL_);
    register_system_parameter($sym68$_BASE_TCP_PORT_, $int69$3600, $sym20$INTEGER, $str70$The_base_port_offset_for_all_the_);
    register_system_parameter($sym71$_FI_PORT_OFFSET_, ONE_INTEGER, $sym20$INTEGER, $str72$Possible_values__A_number___This_);
    register_system_parameter($sym73$_CFASL_PORT_OFFSET_, FOURTEEN_INTEGER, $sym20$INTEGER, $str74$Possible_values__A_number___This_);
    register_system_parameter($sym75$_TCP_LOCALHOST_ONLY__, NIL, $sym16$T_OR_NIL, $str76$Possible_values__T__NIL___IF_NIL_);
    register_system_parameter($sym77$_PERMIT_API_HOST_ACCESS_, T, $sym16$T_OR_NIL, $str78$Possible_values__T__NIL___IF_T__t);
    register_system_parameter($sym79$_USE_TRANSCRIPT_SERVER_, NIL, $sym16$T_OR_NIL, $str80$Possible_values__T__NIL___IF_T__t);
    register_system_parameter($sym81$_MASTER_TRANSCRIPT_LOCK_HOST_, NIL, $sym17$NIL_OR_STRING, $str82$Possible_values__NIL_or_a_string_);
    register_system_parameter($sym83$_MASTER_TRANSCRIPT_SERVER_PORT_, $int84$3608, $sym20$INTEGER, $str85$Possible_values__A_number___This_);
    register_system_parameter($sym86$_ALLOW_GUEST_TO_EDIT__, NIL, $sym16$T_OR_NIL, $str87$Possible_values__T__NIL___If_NIL_);
    register_system_parameter($sym88$_DEFAULT_CYCLIST_NAME_, $str89$Guest, $sym18$STRING, $str90$Possible_values__The_name_of_a_co);
    register_system_parameter($sym91$_HTML_IMAGE_DIRECTORY_, $str92$_cycdoc_img_, $sym18$STRING, $str93$The_directory_under_which_Cyc_ima);
    register_system_parameter($sym94$_HTML_JAVASCRIPT_DIRECTORY_, $str95$_cycdoc_js_, $sym18$STRING, $str96$The_directory_under_which_Javascr);
    register_system_parameter($sym97$_HTML_CSS_DIRECTORY_, $str98$_cycdoc_css_, $sym18$STRING, $str96$The_directory_under_which_Javascr);
    register_system_parameter($sym99$_CYC_EXECUTION_CONTEXT_, $kw100$UNKNOWN, $sym21$SYMBOL, $str101$Possible_values__One_of_the_symbo);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("T-OR-NIL"), makeSymbol("NIL-OR-STRING"), makeSymbol("STRING"), makeSymbol("FULL-PATH"), makeSymbol("INTEGER"), makeSymbol("SYMBOL"), makeSymbol("NONE"));
  public static final SubLSymbol $sym1$_SYSTEM_PARAMETERS_ = makeSymbol("*SYSTEM-PARAMETERS*");
  public static final SubLSymbol $sym2$FIRST = makeSymbol("FIRST");
  public static final SubLString $str3$_S__S_has_an_unknown_type__S_ = makeString("~S ~S has an unknown type ~S.");
  public static final SubLSymbol $sym4$DEFINE_SYSTEM_PARAMETER = makeSymbol("DEFINE-SYSTEM-PARAMETER");
  public static final SubLSymbol $sym5$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym6$CAR = makeSymbol("CAR");
  public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));
  public static final SubLSymbol $sym8$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym9$REGISTER_SYSTEM_PARAMETER = makeSymbol("REGISTER-SYSTEM-PARAMETER");
  public static final SubLSymbol $sym10$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym11$DEFVAR = makeSymbol("DEFVAR");
  public static final SubLSymbol $kw12$UNSET = makeKeyword("UNSET");
  public static final SubLList $list13 = list(makeSymbol("SYMBOL"), makeSymbol("DEFAULT"), makeSymbol("TYPE"), makeSymbol("DESCRIPTION"));
  public static final SubLString $str14$The_system_parameter__S_is_not_bo = makeString("The system parameter ~S is not bound.");
  public static final SubLString $str15$The_system_parameter__S_was_not_i = makeString("The system parameter ~S was not initialized.");
  public static final SubLSymbol $sym16$T_OR_NIL = makeSymbol("T-OR-NIL");
  public static final SubLSymbol $sym17$NIL_OR_STRING = makeSymbol("NIL-OR-STRING");
  public static final SubLSymbol $sym18$STRING = makeSymbol("STRING");
  public static final SubLSymbol $sym19$FULL_PATH = makeSymbol("FULL-PATH");
  public static final SubLSymbol $sym20$INTEGER = makeSymbol("INTEGER");
  public static final SubLSymbol $sym21$SYMBOL = makeSymbol("SYMBOL");
  public static final SubLSymbol $sym22$NONE = makeSymbol("NONE");
  public static final SubLString $str23$The_system_paramater__S_has_the_v = makeString("The system paramater ~S has the value ~S, but it is supposed to be ~S.");
  public static final SubLObject $ic24 = Vectors.vector(new SubLObject[] {Characters.CHAR_0, Characters.CHAR_1, Characters.CHAR_2, Characters.CHAR_3, Characters.CHAR_4, Characters.CHAR_5, Characters.CHAR_6, Characters.CHAR_7, Characters.CHAR_8, Characters.CHAR_9, Characters.CHAR_A, Characters.CHAR_B, Characters.CHAR_C, Characters.CHAR_D, Characters.CHAR_E, Characters.CHAR_F});
  public static final SubLSymbol $kw25$LISP = makeKeyword("LISP");
  public static final SubLList $list26 = list(makeString("conf"));
  public static final SubLString $str27$parameters = makeString("parameters");
  public static final SubLString $str28$lisp = makeString("lisp");
  public static final SubLSymbol $kw29$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str30$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str31$________Mode__LISP__Syntax__ANSI_ = makeString(";;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10; Package: CYC;  -*-~%~%");
  public static final SubLString $str32$____Cyc_system_parameters__ = makeString(";;; Cyc system parameters~%");
  public static final SubLString $str33$_____ = makeString(";;;~%");
  public static final SubLString $str34$____Generated__A_from_CycL__A____ = makeString(";;; Generated ~A from CycL ~A~%~%");
  public static final SubLString $str35$_in_package__CYC_____ = makeString("(in-package :CYC)~%~%");
  public static final SubLString $str36$_____A__ = makeString(";;; ~A~%");
  public static final SubLString $str37$_csetq__A__S_____ = makeString("(csetq ~A ~S)~%~%");
  public static final SubLString $str38$_check_system_parameters___ = makeString("(check-system-parameters)~%");
  public static final SubLSymbol $kw39$CONFIG = makeKeyword("CONFIG");
  public static final SubLList $list40 = list(makeString("data"));
  public static final SubLString $str41$_A___A__ = makeString("~A~%~A~%");
  public static final SubLString $str42$_A___ = makeString("~A\\~%");
  public static final SubLString $str43$_A__ = makeString("~A~%");
  public static final SubLSymbol $kw44$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw45$EOF = makeKeyword("EOF");
  public static final SubLString $str46$System_parameters_file___A__not_l = makeString("System parameters file (~A) not loaded.");
  public static final SubLList $list47 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym48$IN_PACKAGE = makeSymbol("IN-PACKAGE");
  public static final SubLList $list49 = list(makeSymbol("IN-PACKAGE"), makeString("CYC"));
  public static final SubLSymbol $sym50$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list51 = list(makeSymbol("SYMBOL"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym52$CHECK_SYSTEM_PARAMETERS = makeSymbol("CHECK-SYSTEM-PARAMETERS");
  public static final SubLSymbol $sym53$_AUTO_CONTINUE_TRANSCRIPT_PROBLEMS_ = makeSymbol("*AUTO-CONTINUE-TRANSCRIPT-PROBLEMS*");
  public static final SubLString $str54$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, transcript problems will cause error\nbreaks that make the system stop.  If T, such problems will not cause\nbreakage.");
  public static final SubLSymbol $sym55$_CONTINUE_AGENDA_ON_ERROR_ = makeSymbol("*CONTINUE-AGENDA-ON-ERROR*");
  public static final SubLString $str56$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, agenda errors will cause the system to\nhalt.  If T, they will be automatically continued.");
  public static final SubLSymbol $sym57$_SUSPEND_SBHL_TYPE_CHECKING__ = makeSymbol("*SUSPEND-SBHL-TYPE-CHECKING?*");
  public static final SubLString $str58$Possible_values__T__NIL___Type_ch = makeString("Possible values: T, NIL.  Type checking occurs in SBHL modules iff this\nis nil.");
  public static final SubLSymbol $sym59$_REALLY_COUNT_TRANSCRIPT_OPS_ = makeSymbol("*REALLY-COUNT-TRANSCRIPT-OPS*");
  public static final SubLString $str60$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, the System Info page (accessible to\nadministrators only) will estimate, rather than actually count, the\nnumber of operations in the transcript.  If T, it will actually count\nthem, which takes longer but is accurate.");
  public static final SubLSymbol $sym61$_DONT_RECORD_OPERATIONS_LOCALLY_ = makeSymbol("*DONT-RECORD-OPERATIONS-LOCALLY*");
  public static final SubLString $str62$Possible_values__NIL__T___If_NIL_ = makeString("Possible values: NIL, T.  If NIL, a local transcript will always be \nwritten when operations are done, even if those operations are also being \nwritten to the master transcript.  If T, then the image does not write \nto a local transcript file, and will write to the master transcript when\nit is set to transmit operations.  This allows an image that is standalone,\nand always in :TRANSMIT-AND-RECEIVE, to keep only a single copy of its \noperations.");
  public static final SubLSymbol $sym63$_STARTUP_COMMUNICATION_MODE_ = makeSymbol("*STARTUP-COMMUNICATION-MODE*");
  public static final SubLSymbol $kw64$DEAF = makeKeyword("DEAF");
  public static final SubLString $str65$Possible_values_____TRANSMIT_AND_ = makeString("Possible values -- :TRANSMIT-AND-RECEIVE, :RECEIVE-ONLY, \n:ISOLATED, :DEAF, :DEAD.  This is the communication mode the cyc image \nshould get initialized to at startup.");
  public static final SubLSymbol $sym66$_START_AGENDA_AT_STARTUP__ = makeSymbol("*START-AGENDA-AT-STARTUP?*");
  public static final SubLString $str67$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, the Cyc agenda is not started at \nstartup, but can be enabled later by the user.  If T, the agenda is enabled\nat startup.");
  public static final SubLSymbol $sym68$_BASE_TCP_PORT_ = makeSymbol("*BASE-TCP-PORT*");
  public static final SubLInteger $int69$3600 = makeInteger(3600);
  public static final SubLString $str70$The_base_port_offset_for_all_the_ = makeString("The base port offset for all the TCP services for the Cyc image.");
  public static final SubLSymbol $sym71$_FI_PORT_OFFSET_ = makeSymbol("*FI-PORT-OFFSET*");
  public static final SubLString $str72$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the Cyc API\n (application program interface) service from *base-tcp-port*.");
  public static final SubLSymbol $sym73$_CFASL_PORT_OFFSET_ = makeSymbol("*CFASL-PORT-OFFSET*");
  public static final SubLString $str74$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter specifies the offset of the Cyc \nCFASL-server service from *base-tcp-port*.");
  public static final SubLSymbol $sym75$_TCP_LOCALHOST_ONLY__ = makeSymbol("*TCP-LOCALHOST-ONLY?*");
  public static final SubLString $str76$Possible_values__T__NIL___IF_NIL_ = makeString("Possible values: T, NIL.  IF NIL, then remote TCP clients can connect to Cyc, otherwise no remote connections are allowed. The most secure configuration leaves this parameter T, and uses a separate Web server to redirect HTTP requests to Cyc.");
  public static final SubLSymbol $sym77$_PERMIT_API_HOST_ACCESS_ = makeSymbol("*PERMIT-API-HOST-ACCESS*");
  public static final SubLString $str78$Possible_values__T__NIL___IF_T__t = makeString("Possible values: T, NIL.  IF T, then API functions can access host services including the file system and outbound tcp connections.  The most secure configuration leaves this parameter NIL.");
  public static final SubLSymbol $sym79$_USE_TRANSCRIPT_SERVER_ = makeSymbol("*USE-TRANSCRIPT-SERVER*");
  public static final SubLString $str80$Possible_values__T__NIL___IF_T__t = makeString("Possible values: T, NIL.  IF T, then writing to the master transcript will be controlled by the Cyc Transcript Server, which will need to be installed at your site.  You only need to set this to T if you are running multiple instances of Cyc.  If NIL, then Cyc will read and write to the master transcript without regard to other processes doing the same.");
  public static final SubLSymbol $sym81$_MASTER_TRANSCRIPT_LOCK_HOST_ = makeSymbol("*MASTER-TRANSCRIPT-LOCK-HOST*");
  public static final SubLString $str82$Possible_values__NIL_or_a_string_ = makeString("Possible values: NIL or a string.  This parameter is only used if *USE-TRANSCRIPT-SERVER* is T.  If so, then this parameter should be set to the name of the host offering the \ncyc-serializer service.");
  public static final SubLSymbol $sym83$_MASTER_TRANSCRIPT_SERVER_PORT_ = makeSymbol("*MASTER-TRANSCRIPT-SERVER-PORT*");
  public static final SubLInteger $int84$3608 = makeInteger(3608);
  public static final SubLString $str85$Possible_values__A_number___This_ = makeString("Possible values: A number.  This parameter is only used if\n*USE-TRANSCRIPT-SERVER* is T.  If so, then this\nparameter should be set to the port number of the cyc-serializer\nread service.");
  public static final SubLSymbol $sym86$_ALLOW_GUEST_TO_EDIT__ = makeSymbol("*ALLOW-GUEST-TO-EDIT?*");
  public static final SubLString $str87$Possible_values__T__NIL___If_NIL_ = makeString("Possible values: T, NIL.  If NIL, require authentication before allowing\nmodifications to the knowledge base.  If T, any user is allowed to\nmodify the knowledge base.");
  public static final SubLSymbol $sym88$_DEFAULT_CYCLIST_NAME_ = makeSymbol("*DEFAULT-CYCLIST-NAME*");
  public static final SubLString $str89$Guest = makeString("Guest");
  public static final SubLString $str90$Possible_values__The_name_of_a_co = makeString("Possible values: The name of a constant representing a Cyclist.  This is the\ndefault Cyclist initially logged into the system.");
  public static final SubLSymbol $sym91$_HTML_IMAGE_DIRECTORY_ = makeSymbol("*HTML-IMAGE-DIRECTORY*");
  public static final SubLString $str92$_cycdoc_img_ = makeString("/cycdoc/img/");
  public static final SubLString $str93$The_directory_under_which_Cyc_ima = makeString("The directory under which Cyc images (.gif or otherwise) are stored");
  public static final SubLSymbol $sym94$_HTML_JAVASCRIPT_DIRECTORY_ = makeSymbol("*HTML-JAVASCRIPT-DIRECTORY*");
  public static final SubLString $str95$_cycdoc_js_ = makeString("/cycdoc/js/");
  public static final SubLString $str96$The_directory_under_which_Javascr = makeString("The directory under which Javascript files used by the browser are stored");
  public static final SubLSymbol $sym97$_HTML_CSS_DIRECTORY_ = makeSymbol("*HTML-CSS-DIRECTORY*");
  public static final SubLString $str98$_cycdoc_css_ = makeString("/cycdoc/css/");
  public static final SubLSymbol $sym99$_CYC_EXECUTION_CONTEXT_ = makeSymbol("*CYC-EXECUTION-CONTEXT*");
  public static final SubLSymbol $kw100$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str101$Possible_values__One_of_the_symbo = makeString("Possible values: One of the symbols :CYCORP or :UNKNOWN. If the execution context\n     is set to :CYCORP, then the CYC image can assume that it is running in\n     Cycorp's development environment and make strong assumptions about setup\n     and infrastructure.");

  //// Initializers

  public void declareFunctions() {
    declare_system_parameters_file();
  }

  public void initializeVariables() {
    init_system_parameters_file();
  }

  public void runTopLevelForms() {
    setup_system_parameters_file();
  }

}

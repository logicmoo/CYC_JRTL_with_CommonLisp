/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYCORP-UTILITIES
 *  source file: /cyc/top/cycl/cycorp-utilities.lisp
 *  created:     2019/07/03 17:37:17
 */
public final class cycorp_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cycorp_utilities() {
    }

    public static final SubLFile me = new cycorp_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.cycorp_utilities";

    // // Definitions
    // deflexical
    private static final SubLSymbol $cycorp_global_cvs_cyc_dir$ = makeSymbol("*CYCORP-GLOBAL-CVS-CYC-DIR*");

    // deflexical
    private static final SubLSymbol $cycorp_global_cvs_cyc_lisp_dir$ = makeSymbol("*CYCORP-GLOBAL-CVS-CYC-LISP-DIR*");

    // deflexical
    private static final SubLSymbol $cycorp_global_cvs_cycl_dir$ = makeSymbol("*CYCORP-GLOBAL-CVS-CYCL-DIR*");

    // deflexical
    private static final SubLSymbol $cycorp_global_cvs_cyc_perl_dir$ = makeSymbol("*CYCORP-GLOBAL-CVS-CYC-PERL-DIR*");

    public static final SubLObject cycorp_global_cvs_cyc_dir() {
        return $cycorp_global_cvs_cyc_dir$.getGlobalValue();
    }

    public static final SubLObject cycorp_global_cvs_cyc_lisp_dir() {
        return $cycorp_global_cvs_cyc_lisp_dir$.getGlobalValue();
    }

    public static final SubLObject cycorp_global_cvs_cycl_dir() {
        return $cycorp_global_cvs_cycl_dir$.getGlobalValue();
    }

    public static final SubLObject cycorp_global_cvs_cyc_perl_dir() {
        return $cycorp_global_cvs_cyc_perl_dir$.getGlobalValue();
    }

    public static final SubLObject processes_with_substring(SubLObject string) {
        {
            SubLObject processes = NIL;
            SubLObject cdolist_list_var = all_processes();
            SubLObject proc = NIL;
            for (proc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , proc = cdolist_list_var.first()) {
                if (NIL != string_utilities.substringP(string, process_name(proc), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    processes = cons(proc, processes);
                }
            }
            return nreverse(processes);
        }
    }

    public static final SubLObject kill_processes_with_substring(SubLObject string) {
        {
            SubLObject processes = processes_with_substring(string);
            Mapping.mapc(KILL_PROCESS, processes, EMPTY_SUBL_OBJECT_ARRAY);
            return processes;
        }
    }

    public static final SubLObject kill_all_html_clients() {
        return kill_processes_with_substring($$$HTML_Client);
    }

    public static final SubLObject kill_all_cfasl_clients() {
        return kill_processes_with_substring($$$CFASL_Client);
    }

    public static final SubLObject kill_annoying_processes() {
        {
            SubLObject num_killed = ZERO_INTEGER;
            num_killed = add(num_killed, length(kill_all_html_clients()));
            num_killed = add(num_killed, length(kill_all_cfasl_clients()));
            num_killed = add(num_killed, length(kill_processes_with_substring($$$Evaluation_Request)));
            num_killed = add(num_killed, length(kill_processes_with_substring($$$List_All_Completions)));
            return num_killed;
        }
    }

    public static final SubLObject cycwiki_page_contents(SubLObject page_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject url = cycwiki_page_name_to_raw_url(page_name);
                SubLObject tmp_filename = Strings.string_downcase(file_utilities.make_temp_filename(UNPROVIDED), UNPROVIDED, UNPROVIDED);
                SubLObject result = NIL;
                SubLObject os_process = os_process_utilities.make_os_process(cconcatenate($str_alt9$wget_, format_nil.format_nil_a_no_copy(url)), $$$wget, list($str_alt11$_q, url, $str_alt12$_O, tmp_filename), StreamsLow.$standard_input$.getDynamicValue(thread), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED);
                os_process_utilities.wait_until_os_process_finished(os_process);
                result = file_utilities.get_file_lines(tmp_filename);
                Filesys.delete_file(tmp_filename);
                return result;
            }
        }
    }

    public static final SubLObject cycwiki_page_name_to_raw_url(SubLObject page_name) {
        page_name = string_utilities.replace_substring(page_name, $str_alt13$_, $str_alt14$_);
        return cconcatenate($str_alt15$http___cycwiki_cyc_com_index_php_, new SubLObject[]{ format_nil.format_nil_a_no_copy(page_name), $str_alt16$__action_raw });
    }

    public static final SubLObject declare_cycorp_utilities_file() {
        declareFunction("cycorp_global_cvs_cyc_dir", "CYCORP-GLOBAL-CVS-CYC-DIR", 0, 0, false);
        declareFunction("cycorp_global_cvs_cyc_lisp_dir", "CYCORP-GLOBAL-CVS-CYC-LISP-DIR", 0, 0, false);
        declareFunction("cycorp_global_cvs_cycl_dir", "CYCORP-GLOBAL-CVS-CYCL-DIR", 0, 0, false);
        declareFunction("cycorp_global_cvs_cyc_perl_dir", "CYCORP-GLOBAL-CVS-CYC-PERL-DIR", 0, 0, false);
        declareFunction("processes_with_substring", "PROCESSES-WITH-SUBSTRING", 1, 0, false);
        declareFunction("kill_processes_with_substring", "KILL-PROCESSES-WITH-SUBSTRING", 1, 0, false);
        declareFunction("kill_all_html_clients", "KILL-ALL-HTML-CLIENTS", 0, 0, false);
        declareFunction("kill_all_cfasl_clients", "KILL-ALL-CFASL-CLIENTS", 0, 0, false);
        declareFunction("kill_annoying_processes", "KILL-ANNOYING-PROCESSES", 0, 0, false);
        declareFunction("cycwiki_page_contents", "CYCWIKI-PAGE-CONTENTS", 1, 0, false);
        declareFunction("cycwiki_page_name_to_raw_url", "CYCWIKI-PAGE-NAME-TO-RAW-URL", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cycorp_utilities_file() {
        deflexical("*CYCORP-GLOBAL-CVS-CYC-DIR*", $str_alt0$_home_kong0_scratch_cyc_);
        deflexical("*CYCORP-GLOBAL-CVS-CYC-LISP-DIR*", cconcatenate($cycorp_global_cvs_cyc_dir$.getGlobalValue(), $str_alt1$cyc_lisp_));
        deflexical("*CYCORP-GLOBAL-CVS-CYCL-DIR*", cconcatenate($cycorp_global_cvs_cyc_lisp_dir$.getGlobalValue(), $str_alt2$cycl_));
        deflexical("*CYCORP-GLOBAL-CVS-CYC-PERL-DIR*", cconcatenate($cycorp_global_cvs_cyc_dir$.getGlobalValue(), $str_alt3$cyc_perl_));
        return NIL;
    }

    public static final SubLObject setup_cycorp_utilities_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$_home_kong0_scratch_cyc_ = makeString("/home/kong0/scratch/cyc/");

    static private final SubLString $str_alt1$cyc_lisp_ = makeString("cyc-lisp/");

    static private final SubLString $str_alt2$cycl_ = makeString("cycl/");

    static private final SubLString $str_alt3$cyc_perl_ = makeString("cyc-perl/");



    static private final SubLString $$$HTML_Client = makeString("HTML Client");

    static private final SubLString $$$CFASL_Client = makeString("CFASL Client");

    static private final SubLString $$$Evaluation_Request = makeString("Evaluation Request");

    static private final SubLString $$$List_All_Completions = makeString("List All Completions");

    static private final SubLString $str_alt9$wget_ = makeString("wget ");

    static private final SubLString $$$wget = makeString("wget");

    static private final SubLString $str_alt11$_q = makeString("-q");

    static private final SubLString $str_alt12$_O = makeString("-O");

    static private final SubLString $str_alt13$_ = makeString(" ");

    static private final SubLString $str_alt14$_ = makeString("_");

    static private final SubLString $str_alt15$http___cycwiki_cyc_com_index_php_ = makeString("http://cycwiki.cyc.com/index.php\\?title=");

    static private final SubLString $str_alt16$__action_raw = makeString("\\&action=raw");

    // // Initializers
    public void declareFunctions() {
        declare_cycorp_utilities_file();
    }

    public void initializeVariables() {
        init_cycorp_utilities_file();
    }

    public void runTopLevelForms() {
        setup_cycorp_utilities_file();
    }
}


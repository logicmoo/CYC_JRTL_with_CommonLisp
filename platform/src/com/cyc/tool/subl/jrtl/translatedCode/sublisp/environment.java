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

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SystemInfo;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class environment extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new environment();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.environment";
	public static SubLSymbol $kw0$LISP_IMPLEMENTATION_TYPE = SubLObjectFactory.makeKeyword("LISP-IMPLEMENTATION-TYPE");

	//// Definitions

	public static SubLSymbol $kw1$LISP_IMPLEMENTATION_VERSION = SubLObjectFactory
			.makeKeyword("LISP-IMPLEMENTATION-VERSION");

	public static SubLSymbol $kw2$SHORT_SITE_NAME = SubLObjectFactory.makeKeyword("SHORT-SITE-NAME");

	public static SubLSymbol $kw3$LONG_SITE_NAME = SubLObjectFactory.makeKeyword("LONG-SITE-NAME");

	public static SubLSymbol $kw4$MACHINE_INSTANCE = SubLObjectFactory.makeKeyword("MACHINE-INSTANCE");

	public static SubLSymbol $kw5$MACHINE_TYPE = SubLObjectFactory.makeKeyword("MACHINE-TYPE");

	public static SubLSymbol $kw6$MACHINE_VERSION = SubLObjectFactory.makeKeyword("MACHINE-VERSION");

	public static SubLSymbol $kw7$SOFTWARE_TYPE = SubLObjectFactory.makeKeyword("SOFTWARE-TYPE");

	public static SubLSymbol $kw8$SOFTWARE_VERSION = SubLObjectFactory.makeKeyword("SOFTWARE-VERSION");

	public static SubLSymbol $kw9$USER = SubLObjectFactory.makeKeyword("USER");

	public static SubLSymbol $kw10$PROCESS_ID = SubLObjectFactory.makeKeyword("PROCESS-ID");

	public static SubLSymbol $kw11$NETWORK_NAME = SubLObjectFactory.makeKeyword("NETWORK-NAME");

	public static SubLObject declare_environment_file() {
		SubLFiles.declareFunction(environment.myName, "my_getf", "MY-GETF", 2, 1, false);
		/*
		 * declareFunction(myName, "lisp_implementation_type",
		 * "LISP-IMPLEMENTATION-TYPE", 0, 0, false); declareFunction(myName,
		 * "lisp_implementation_version", "LISP-IMPLEMENTATION-VERSION", 0, 0,
		 * false); declareFunction(myName, "short_site_name", "SHORT-SITE-NAME",
		 * 0, 0, false); declareFunction(myName, "long_site_name",
		 * "LONG-SITE-NAME", 0, 0, false); declareFunction(myName,
		 * "machine_instance", "MACHINE-INSTANCE", 0, 0, false);
		 * declareFunction(myName, "machine_type", "MACHINE-TYPE", 0, 0, false);
		 * declareFunction(myName, "machine_version", "MACHINE-VERSION", 0, 0,
		 * false); declareFunction(myName, "software_type", "SOFTWARE-TYPE", 0,
		 * 0, false); declareFunction(myName, "software_version",
		 * "SOFTWARE-VERSION", 0, 0, false); declareFunction(myName,
		 * "get_user_name", "GET-USER-NAME", 0, 1, false);
		 * declareFunction(myName, "get_process_id", "GET-PROCESS-ID", 0, 1,
		 * false); declareFunction(myName, "get_network_name",
		 * "GET-NETWORK-NAME", 0, 1, false); declareFunction(myName,
		 * "get_machine_name", "GET-MACHINE-NAME", 0, 1, false);
		 */
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/environment.lisp", position = 1975)
	public static SubLObject get_machine_name(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject machine_name = environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
						environment.$kw4$MACHINE_INSTANCE, CommonSymbols.UNPROVIDED);
				if (CommonSymbols.NIL != machine_name)
					return machine_name;
				else
					return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
							environment.$kw11$NETWORK_NAME, v_default);
			}
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1748)
	public static SubLObject get_network_name(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			{
				SubLObject network_name = environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
						environment.$kw11$NETWORK_NAME, CommonSymbols.UNPROVIDED);
				if (CommonSymbols.NIL != network_name)
					return network_name;
				else
					return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
							environment.$kw4$MACHINE_INSTANCE, v_default);
			}
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1651)
	public static SubLObject get_process_id(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw10$PROCESS_ID,
					v_default);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1537)
	public static SubLObject get_user_name(SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw9$USER,
					v_default);
		}
	}

	public static SubLObject init_environment_file() {
		return CommonSymbols.NIL;
	}

	//// Internal Constants

	@SubL(source = "sublisp/environment.lisp", position = 801)
	public static SubLObject lisp_implementation_type() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw0$LISP_IMPLEMENTATION_TYPE, CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 897)
	public static SubLObject lisp_implementation_version() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw1$LISP_IMPLEMENTATION_VERSION, CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1077)
	public static SubLObject long_site_name() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw3$LONG_SITE_NAME, CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1153)
	public static SubLObject machine_instance() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw4$MACHINE_INSTANCE, CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1233)
	public static SubLObject machine_type() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw5$MACHINE_TYPE,
					CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1305)
	public static SubLObject machine_version() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw6$MACHINE_VERSION, CommonSymbols.UNPROVIDED);
		}
	}

	/** Return the value for INDICATOR in PLIST, or DEFAULT if not present */
	@SubL(source = "sublisp/environment.lisp", position = 432)
	public static SubLObject my_getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLObject next = CommonSymbols.NIL;
			SubLObject key = CommonSymbols.NIL;
			for (next = plist, key = next.first(); CommonSymbols.NIL != next; next = conses_high.cddr(next), key = next
					.first())
				if (indicator == key)
					return conses_high.cadr(next);
			return v_default;
		}
	}

	public static SubLObject setup_environment_file() {
		// CVS_ID("Id: environment.lisp,v 1.8 2006/03/10 20:02:57 goolsbey Exp
		// ");
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/environment.lisp", position = 999)
	public static SubLObject short_site_name() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw2$SHORT_SITE_NAME, CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1383)
	public static SubLObject software_type() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread), environment.$kw7$SOFTWARE_TYPE,
					CommonSymbols.UNPROVIDED);
		}
	}

	@SubL(source = "sublisp/environment.lisp", position = 1457)
	public static SubLObject software_version() {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return environment.my_getf(SystemInfo.$system_info$.getDynamicValue(thread),
					environment.$kw8$SOFTWARE_VERSION, CommonSymbols.UNPROVIDED);
		}
	}

	private environment() {
	}

	//// Initializers

	public void declareFunctions() {
		environment.declare_environment_file();
	}

	public void initializeVariables() {
		environment.init_environment_file();
	}

	public void runTopLevelForms() {
		environment.setup_environment_file();
	}

}

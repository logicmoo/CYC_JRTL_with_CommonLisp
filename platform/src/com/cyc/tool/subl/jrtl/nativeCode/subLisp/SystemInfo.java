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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.net.InetAddress;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public class SystemInfo implements SubLFile {

	//// Constructors

	public static SubLFile me = new SystemInfo();

	public static SubLSymbol $system_info$ = null;

	//// Public Area

	private static SubLSymbol LISP_IMPLEMENTATION_TYPE = SubLObjectFactory.makeKeyword("LISP-IMPLEMENTATION-TYPE");

	//// Initializers

	private static SubLSymbol LISP_IMPLEMENTATION_VERSION = SubLObjectFactory
			.makeKeyword("LISP-IMPLEMENTATION-VERSION");

	private static SubLSymbol SHORT_SITE_NAME = SubLObjectFactory.makeKeyword("SHORT-SITE-NAME");

	private static SubLSymbol LONG_SITE_NAME = SubLObjectFactory.makeKeyword("LONG-SITE-NAME");

	//// Protected Area

	//// Private Area

	private static SubLSymbol MACHINE_INSTANCE = SubLObjectFactory.makeKeyword("MACHINE-INSTANCE");
	private static SubLSymbol MACHINE_TYPE = SubLObjectFactory.makeKeyword("MACHINE-TYPE");
	private static SubLSymbol MACHINE_VERSION = SubLObjectFactory.makeKeyword("MACHINE-VERSION");
	private static SubLSymbol SOFTWARE_TYPE = SubLObjectFactory.makeKeyword("SOFTWARE-TYPE");
	private static SubLSymbol SOFTWARE_VERSION = SubLObjectFactory.makeKeyword("SOFTWARE-VERSION");
	private static SubLSymbol USER = SubLObjectFactory.makeKeyword("USER");
	private static SubLSymbol PROCESS_ID = SubLObjectFactory.makeKeyword("PROCESS-ID");
	private static SubLSymbol NETWORK_NAME = SubLObjectFactory.makeKeyword("NETWORK-NAME");

	/** Creates a new instance of SystemInfo. */
	public SystemInfo() {
	}

	public void declareFunctions() {

	}

	public void initializeVariables() {
		SubLList systemInfoList = CommonSymbols.NIL;
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString("Cycorp Java SubL Runtime Environment"));
		systemInfoList = systemInfoList.push(SystemInfo.LISP_IMPLEMENTATION_TYPE);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString("Version 1.0"));
		systemInfoList = systemInfoList.push(SystemInfo.LISP_IMPLEMENTATION_VERSION);
		systemInfoList = systemInfoList.push(SubLNil.NIL); // @todo do something
															// better here
		systemInfoList = systemInfoList.push(SystemInfo.MACHINE_VERSION);
		systemInfoList = systemInfoList.push(SubLNil.NIL); // @todo do something
															// better here
		systemInfoList = systemInfoList.push(SystemInfo.SHORT_SITE_NAME);
		systemInfoList = systemInfoList.push(SubLNil.NIL); // @todo do something
															// better here
		systemInfoList = systemInfoList.push(SystemInfo.LONG_SITE_NAME);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString(System.getProperty("os.name") + " "
				+ System.getProperty("os.version") + " " + System.getProperty("os.arch")));
		systemInfoList = systemInfoList.push(SystemInfo.MACHINE_TYPE);
		systemInfoList = systemInfoList.push(SubLNil.NIL); // @todo do something
															// better here
		systemInfoList = systemInfoList.push(SystemInfo.MACHINE_VERSION);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString(System.getProperty("user.name")));
		systemInfoList = systemInfoList.push(SystemInfo.USER);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeInteger(0)); // @todo
																				// do
																				// something
																				// better
																				// here
		systemInfoList = systemInfoList.push(SystemInfo.PROCESS_ID);
		try {
			InetAddress addr = InetAddress.getLocalHost();
			systemInfoList = systemInfoList.push(SubLObjectFactory.makeString(addr.getHostName()));
			systemInfoList = systemInfoList.push(SystemInfo.NETWORK_NAME);
			systemInfoList = systemInfoList.push(SubLObjectFactory.makeString(addr.getHostName()));
			systemInfoList = systemInfoList.push(SystemInfo.MACHINE_INSTANCE);
		} catch (Exception e) {
			systemInfoList = systemInfoList.push(SubLObjectFactory.makeString("UNKNOWN"));
			systemInfoList = systemInfoList.push(SystemInfo.NETWORK_NAME);
			systemInfoList = systemInfoList.push(SubLObjectFactory.makeString("UNKNOWN"));
			systemInfoList = systemInfoList.push(SystemInfo.MACHINE_INSTANCE);
		}
		SystemInfo.$system_info$ = SubLFiles.defparameter(SystemInfo.me, "*SYSTEM-INFO*", systemInfoList);
	}

	public void runTopLevelForms() {
	}

	//// Internal Rep

	//// Main

}

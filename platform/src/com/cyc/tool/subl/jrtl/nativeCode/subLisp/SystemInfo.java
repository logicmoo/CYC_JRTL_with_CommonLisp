/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.net.InetAddress;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class SystemInfo implements SubLFile {
	public static SubLFile me;
	public static SubLSymbol $system_info$;
	private static SubLSymbol LISP_IMPLEMENTATION_TYPE;
	private static SubLSymbol LISP_IMPLEMENTATION_VERSION;
	private static SubLSymbol SHORT_SITE_NAME;
	private static SubLSymbol LONG_SITE_NAME;
	private static SubLSymbol MACHINE_INSTANCE;
	private static SubLSymbol MACHINE_TYPE;
	private static SubLSymbol MACHINE_VERSION;
	private static SubLSymbol SOFTWARE_TYPE;
	private static SubLSymbol SOFTWARE_VERSION;
	private static SubLSymbol USER;
	private static SubLSymbol PROCESS_ID;
	private static SubLSymbol NETWORK_NAME;
	static {
		me = new SystemInfo();
		SystemInfo.$system_info$ = null;
		LISP_IMPLEMENTATION_TYPE = SubLObjectFactory.makeKeyword("LISP-IMPLEMENTATION-TYPE");
		LISP_IMPLEMENTATION_VERSION = SubLObjectFactory.makeKeyword("LISP-IMPLEMENTATION-VERSION");
		SHORT_SITE_NAME = SubLObjectFactory.makeKeyword("SHORT-SITE-NAME");
		LONG_SITE_NAME = SubLObjectFactory.makeKeyword("LONG-SITE-NAME");
		MACHINE_INSTANCE = SubLObjectFactory.makeKeyword("MACHINE-INSTANCE");
		MACHINE_TYPE = SubLObjectFactory.makeKeyword("MACHINE-TYPE");
		MACHINE_VERSION = SubLObjectFactory.makeKeyword("MACHINE-VERSION");
		SOFTWARE_TYPE = SubLObjectFactory.makeKeyword("SOFTWARE-TYPE");
		SOFTWARE_VERSION = SubLObjectFactory.makeKeyword("SOFTWARE-VERSION");
		USER = SubLObjectFactory.makeKeyword("USER");
		PROCESS_ID = SubLObjectFactory.makeKeyword("PROCESS-ID");
		NETWORK_NAME = SubLObjectFactory.makeKeyword("NETWORK-NAME");
	}

	@Override
	public void declareFunctions() {
	}

	@Override
	public void initializeVariables() {
		SubLList systemInfoList = SubLNil.NIL;
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString("Cycorp Java SubL Runtime Environment"));
		systemInfoList = systemInfoList.push(SystemInfo.LISP_IMPLEMENTATION_TYPE);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString("Version 1.0"));
		systemInfoList = systemInfoList.push(SystemInfo.LISP_IMPLEMENTATION_VERSION);
		systemInfoList = systemInfoList.push(SubLNil.NIL);
		systemInfoList = systemInfoList.push(SystemInfo.MACHINE_VERSION);
		systemInfoList = systemInfoList.push(SubLNil.NIL);
		systemInfoList = systemInfoList.push(SystemInfo.SHORT_SITE_NAME);
		systemInfoList = systemInfoList.push(SubLNil.NIL);
		systemInfoList = systemInfoList.push(SystemInfo.LONG_SITE_NAME);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString(System.getProperty("os.name") + " "
				+ System.getProperty("os.version") + " " + System.getProperty("os.arch")));
		systemInfoList = systemInfoList.push(SystemInfo.MACHINE_TYPE);
		systemInfoList = systemInfoList.push(SubLNil.NIL);
		systemInfoList = systemInfoList.push(SystemInfo.MACHINE_VERSION);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeString(System.getProperty("user.name")));
		systemInfoList = systemInfoList.push(SystemInfo.USER);
		systemInfoList = systemInfoList.push(SubLObjectFactory.makeInteger(0));
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

	@Override
	public void runTopLevelForms() {
	}

	public SystemInfo() {
		BeanShellCntrl.addSubLFile(this);
	}
}

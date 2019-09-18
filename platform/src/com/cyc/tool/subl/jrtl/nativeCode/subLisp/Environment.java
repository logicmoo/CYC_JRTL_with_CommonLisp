/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.net.InetAddress;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;

public class Environment extends SubLSystemTrampolineFile {
	public static SubLObject get_machine_name(SubLObject defaultVal) {
		return Environment.$machine_instance$.getValue();
	}

	public static SubLObject get_network_name(SubLObject defaultVal) {
		return Environment.$network_name$.getValue();
	}

	public static SubLObject get_process_id(SubLObject defaultVal) {
		return Environment.$process_id$.getValue();
	}

	public static SubLObject get_user_name(SubLObject defaultVal) {
		return Environment.$user$.getValue();
	}

	public static SubLObject lisp_implementation_type() {
		return Environment.$lisp_implementation_type$.getValue();
	}

	public static SubLObject lisp_implementation_version() {
		return Environment.$lisp_implementation_version$.getValue();
	}

	public static SubLObject long_site_name() {
		return Environment.$long_site_name$.getValue();
	}

	public static SubLObject machine_instance() {
		return Environment.$machine_instance$.getValue();
	}

	public static SubLObject machine_type() {
		return Environment.$machine_type$.getValue();
	}

	public static SubLObject machine_version() {
		return Environment.$machine_version$.getValue();
	}

	public static SubLObject short_site_name() {
		return Environment.$short_site_name$.getValue();
	}

	public static SubLObject software_type() {
		return Environment.$software_type$.getValue();
	}

	public static SubLObject software_version() {
		return Environment.$software_version$.getValue();
	}

	public static SubLFile me;
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
	static {
		me = new Environment();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Environment.me, "get_machine_name", "GET-MACHINE-NAME", 0, 1, false);
		SubLFiles.declareFunction(Environment.me, "get_network_name", "GET-NETWORK-NAME", 0, 1, false);
		SubLFiles.declareFunction(Environment.me, "get_process_id", "GET-PROCESS-ID", 0, 1, false);
		SubLFiles.declareFunction(Environment.me, "get_user_name", "GET-USER-NAME", 0, 1, false);
		SubLFiles.declareFunction(Environment.me, "lisp_implementation_type", "LISP-IMPLEMENTATION-TYPE", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "lisp_implementation_version", "LISP-IMPLEMENTATION-VERSION", 0, 0,
				false);
		SubLFiles.declareFunction(Environment.me, "long_site_name", "LONG-SITE-NAME", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "machine_instance", "MACHINE-INSTANCE", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "machine_type", "MACHINE-TYPE", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "machine_version", "MACHINE-VERSION", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "short_site_name", "SHORT-SITE-NAME", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "software_type", "SOFTWARE-TYPE", 0, 0, false);
		SubLFiles.declareFunction(Environment.me, "software_version", "SOFTWARE-VERSION", 0, 0, false);
	}

	@Override
	public void initializeVariables() {
		Environment.$lisp_implementation_type$ = SubLFiles.defconstant(Environment.me, "*LISP-IMPLEMENTATION-TYPE*",
				SubLObjectFactory.makeString("Cycorp Java SubL Runtime Environment"));
		Environment.$lisp_implementation_version$ = SubLFiles.defconstant(Environment.me,
				"*LISP-IMPLEMENTATION-VERSION*", SubLObjectFactory.makeString("Version 1.0"));
		Environment.$machine_version$ = SubLFiles.defconstant(Environment.me, "*MACHINE-VERSION*", SubLNil.NIL);
		Environment.$short_site_name$ = SubLFiles.defconstant(Environment.me, "*SHORT-SITE-NAME*", SubLNil.NIL);
		Environment.$long_site_name$ = SubLFiles.defconstant(Environment.me, "*LONG-SITE-NAME*", SubLNil.NIL);
		Environment.$machine_type$ = SubLFiles.defconstant(Environment.me, "*MACHINE-TYPE*",
				SubLObjectFactory.makeString(System.getProperty("os.name") + " " + System.getProperty("os.version")
						+ " " + System.getProperty("os.arch")));
		Environment.$machine_version$ = SubLFiles.defconstant(Environment.me, "*MACHINE-VERSION*", SubLNil.NIL);
		Environment.$software_type$ = SubLFiles.defconstant(Environment.me, "*SOFTWARE-TYPE*", SubLObjectFactory
				.makeString(System.getProperty("java.vm.name") + " " + System.getProperty("java.vm.vendor")));
		Environment.$software_version$ = SubLFiles.defconstant(Environment.me, "*SOFTWARE-VERSION*",
				SubLObjectFactory.makeString(System.getProperty("java.vm.version")));
		Environment.$user$ = SubLFiles.defconstant(Environment.me, "*USER*",
				SubLObjectFactory.makeString(System.getProperty("user.name")));
		Environment.$process_id$ = SubLFiles.defconstant(Environment.me, "*PROCESS-ID*",
				SubLObjectFactory.makeInteger(0));
		try {
			InetAddress addr = InetAddress.getLocalHost();
			Environment.$machine_instance$ = SubLFiles.defconstant(Environment.me, "*MACHINE-INSTANCE*",
					SubLObjectFactory.makeString(addr.getHostName()));
			Environment.$network_name$ = SubLFiles.defconstant(Environment.me, "*NETWORK-NAME*",
					SubLObjectFactory.makeString(addr.getHostName()));
		} catch (Exception e) {
			Environment.$network_name$ = SubLFiles.defconstant(Environment.me, "*NETWORK-NAME*",
					SubLObjectFactory.makeString("UNKNOWN"));
			Environment.$machine_instance$ = SubLFiles.defconstant(Environment.me, "*MACHINE-INSTANCE*",
					SubLObjectFactory.makeString("UNKNOWN"));
		}
	}

	@Override
	public void runTopLevelForms() {
	}
}

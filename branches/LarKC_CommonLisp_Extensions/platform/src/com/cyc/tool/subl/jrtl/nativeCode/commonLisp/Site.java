/*
 * Site.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Site.java 12525 2010-03-12 06:59:01Z mevenson $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLDecoder;
import java.net.UnknownHostException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class Site {
    private static SubLObject LISP_HOME;
		public static boolean isSubLisp = true;
  	public static final boolean useForNameLoader = false;
  	
	private static void init() {
		String s = System.getProperty("abcl.home");
		if (s != null) {
			String fileSeparator = System.getProperty("file.separator");
			if (!s.endsWith(fileSeparator)) {
                s += fileSeparator;
			}
			LISP_HOME = new Pathname(s);      
			return; // dmiles adds this workaround until mevenson fixes build
		}
		URL url = Lisp.class.getResource("boot.lisp");
		if (url != null) {
            if (!Pathname.isSupportedProtocol(url.getProtocol())) {
              LISP_HOME = NIL;
            } else {
              Pathname p = new Pathname(url);
              p.name = NIL;
              p.type = NIL;
              p.invalidateNamestring();
              LISP_HOME = p;
            }
      			Debug.trace("LISP_HOME = " +LISP_HOME);
			return;
		}
		Debug.trace("Unable to determine LISP_HOME.");
	}

    public static final SubLObject getLispHome(){
		if (LISP_HOME == null) {
			init();
		}
		return LISP_HOME;
	}

	// ### *lisp-home*
	private static final SubLSymbol _LISP_HOME_ = exportSpecial("*LISP-HOME*", PACKAGE_EXT, NIL);

	static {
        SubLObject p  = Site.getLispHome();
		if (p != null)
			_LISP_HOME_.setSymbolValue(p);
	}

	// ### software-type
	private static final Primitive SOFTWARE_TYPE = new software_type();

	public final static class software_type extends JavaPrimitive {
		software_type() {
			super("software-type");
		}

		@Override
		public SubLObject execute() {
			return makeString(System.getProperty("os.name"));
		}

		// ### software-version
		private static final Primitive SOFTWARE_VERSION = new software_version();

		public final static class software_version extends JavaPrimitive {
			software_version() {
				super("software-version");
			}

			@Override
			public SubLObject execute() {
				return makeString(System.getProperty("os.version"));
			}

		}
	}

	static SubLObject getHostName() {
		String hostName = null;
		InetAddress addr;
		try {
			addr = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			addr = null;
		}
		if (addr != null)
			hostName = addr.getHostName();

		return hostName != null ? makeString(hostName) : NIL;
	}

	private static final Primitive MACHINE_INSTANCE = new JavaPrimitive("machine-instance") {
		@Override
		public SubLObject execute() {
			return getHostName();
		}
	};

	private static final Primitive LONG_SITE_NAME = new JavaPrimitive("long-site-name") {
		@Override
		public SubLObject execute() {
			return getHostName();
		}
	};

	private static final Primitive SHORT_SITE_NAME = new JavaPrimitive("short-site-name") {
		@Override
		public SubLObject execute() {
			return getHostName();
		}
	};

	//### machine-type
	private static final Primitive MACHINE_TYPE = new machine_type();

	public final static class machine_type extends JavaPrimitive {
		machine_type() {
			super("machine-type");
		}

		@Override
		public SubLObject execute() {
			String s = System.getProperty("os.arch");
			if (s == null)
				s = "UNKNOWN";
			else if (s.equals("amd64"))
				s = "X86-64";
			else
				s = s.toUpperCase();
			return makeString(s);
		}

	}

	//### machine-version
	private static final Primitive MACHINE_VERSION = new machine_version();

	public final static class machine_version extends JavaPrimitive {
		machine_version() {
			super("machine-version");
		}

		@Override
		public SubLObject execute() {
			String osName = System.getProperty("os.name");
			if (osName != null && osName.toLowerCase().startsWith("linux")) {
				try {
					FileInputStream in = new FileInputStream("/proc/cpuinfo");
					if (in != null) {
						BufferedReader reader = new BufferedReader(new InputStreamReader(in));
						try {
							String s;
							while ((s = reader.readLine()) != null) {
								int start = s.indexOf("model name");
								if (start >= 0) {
									start = s.indexOf(':', start);
									if (start >= 0) {
										return makeString(s.substring(start + 1).trim());
									}
								}
							}
						} finally {
							reader.close();
						}
					}
				} catch (IOException e) {
				}
			}
			return NIL;
		}

	}

	//### lisp-implementation-type <no arguments> => description
	private static final lisp_implementation_type LISP_IMPLEMENTATION_TYPE = new lisp_implementation_type();

	public final static class lisp_implementation_type extends JavaPrimitive {
		lisp_implementation_type() {
			super("lisp-implementation-type", "");
		}

		@Override
		public SubLObject execute() {
			return makeString("Armed Bear Common Lisp");
		}

	}

	//### lisp_implementation_version
	private static final lisp_implementation_version LISP_IMPLEMENTATION_VERSION = new lisp_implementation_version();

	//lisp_implementation_version <no arguments> => description
	public final static class lisp_implementation_version extends JavaPrimitive {
		lisp_implementation_version() {
			super("lisp-implementation-version", "");
		}

		@Override
		public SubLObject execute() {
			return makeString(Version.getVersion());
		}

	}

}
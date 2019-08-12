/*
   This file is part of the LarKC platform 
   http://www.larkc.eu/

   Copyright 2010 LarKC project consortium

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Symbol;

/**
 * TODO Describe this type briefly. 
 * If necessary include a longer description and/or an example.
 * 
 * @author Administrator
 *
 */
public class SubLSystem {

    static final SubLSystem UNKNOWN_SYSTEM = new SubLSystem() {
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
	    return "UNKNOWN " + super.toString();
	}
	/* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSystem#findSymbol(java.lang.String)
	 */
	@Override
	public Symbol findSymbol(String symbolName) {
	    return super.findSymbol(symbolName);
	}
    };
    static SubLSystem SUBL_SYSTEM = new SubLSystem() {
	@Override
	public String toString() {
	    return "KNOWN " + super.toString();
	}

	/* (non-Javadoc)
	 * @see com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSystem#findSymbol(java.lang.String)
	 */
	@Override
	public Symbol findSymbol(String symbolName) {
	    Symbol findAccessibleSymbol = null;
	    if (findAccessibleSymbol == null)
		findAccessibleSymbol = Lisp.PACKAGE_SUBLISP.findAccessibleSymbol(symbolName);
	    if (findAccessibleSymbol == null)
		findAccessibleSymbol = Lisp.PACKAGE_CYC.findAccessibleSymbol(symbolName);
	    return super.findSymbol(symbolName);
	}
    };

    /**
     * TODO Describe the purpose of this method.
     * @param thePackage
     * @return
     */
    public static SubLSystem getSystem(SubLPackage thePackage) {
	if (thePackage == Lisp.PACKAGE_CYC || thePackage == Lisp.PACKAGE_SUBLISP) {
	    return SUBL_SYSTEM;
	}
	return UNKNOWN_SYSTEM;
    }

    /**
     * TODO Describe the purpose of this method.
     * @param symbolName
     * @return
     */
    public Symbol findSymbol(String symbolName) {
	return null;
    }

}

package org.logicmoo.system;

import java.util.ArrayList;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.Package;
import org.armedbear.lisp.Symbol;

import bsh.util.NameCompletion;

public class LispNameCompletion implements NameCompletion {

	String[] NO_RESULTS = new String[0];

	@Override
	public java.lang.String[] completeName(java.lang.String part) {

		if (part.length() < 3)
			return NO_RESULTS;
		part = part.toUpperCase();
		ArrayList results = null;
		org.armedbear.lisp.Package currentPackage;
		int idx = part.indexOf(":");
		if (idx == 0) {
			currentPackage = Lisp.PACKAGE_KEYWORD;
			part = part.substring(1);
		} else if (idx == -1) {
			currentPackage = Lisp.getCurrentPackage();
			part = part.substring(1);
		} else {
			String pn = part.substring(0, idx);
			part = part.substring(0, idx + 1);
			currentPackage = (Package) Package.findPackageNamed(pn);
			if (currentPackage == null)
				currentPackage = Lisp.getCurrentPackage();
		}

		if (part.length() <= 1)
			return NO_RESULTS;

		for (Symbol sym : currentPackage.getAccessibleSymbols()) {
			String n = sym.getName();
			if (n.startsWith(part)) {
				if (results == null) {
					results = new ArrayList();
				}
				results.add(n);
			}
		}

		if (results != null)
			return (String[]) results.toArray(new String[results.size()]);

		return NO_RESULTS;

	}

}

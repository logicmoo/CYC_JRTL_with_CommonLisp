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
package org.logicmoo.translate.bcel;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

import org.apache.bcel.Repository;
import org.apache.bcel.classfile.ConstantClass;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.DescendingVisitor;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.util.ClassPath.ClassFile;
import org.logicmoo.translate.FileRecurseVisitor;
import org.logicmoo.translate.PreInitLoader;

import com.cyc.cycjava.cycl.sdbc;

public class DepUntangler extends EmptyVisitor {
	/**
	 * 
	 */
	private static final String MAIN_SERVER_4Q = "main/server-4q/";
	Set incommingLinks = new HashSet();
	Set outboundLinks = new HashSet();

	private JavaClass javaClass;

	String qualifiedName;
	private ClassFile classFile;

	public DepUntangler(String qualifiedName) {
		this.qualifiedName = qualifiedName;
		resolveClass();
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return 
	 */
	public JavaClass resolveClass() {
		try {
			if (classFile == null) {
				classFile = Repository.lookupClassFile(qualifiedName);
			}
			if (javaClass == null) {
				javaClass = Repository.lookupClass(qualifiedName);
			}
		} catch (java.lang.ClassFormatError | ClassNotFoundException e) {
			System.out.println("+Error in " + this + ": " + e);
			//e.printStackTrace();
		}
		return javaClass;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * @return 
	 */
	public void printError() {
		try {
			if (classFile == null) {
				classFile = Repository.lookupClassFile(qualifiedName);
			}
			if (javaClass == null) {
				javaClass = Repository.lookupClass(qualifiedName);
			}
		} catch (java.lang.ClassFormatError | ClassNotFoundException e) {
			System.out.println("+Error in " + this + ": " + e);
			e.printStackTrace();
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DepUntangler: " + qualifiedName + "=" + javaClass;
	}

	@Override
	public void visitConstantClass(ConstantClass obj) {
		ConstantPool cp = javaClass.getConstantPool();
		String bytes = obj.getBytes(cp);
		System.out.println(bytes);
	}

	static HashMap<String, DepUntangler> javaclasses = new HashMap<String, DepUntangler>();

	static DepUntangler findSpoonInfo(String qualifiedName) {

		DepUntangler info = javaclasses.get(qualifiedName);
		if (info == null) {
			info = new DepUntangler(qualifiedName);
			javaclasses.put(qualifiedName, info);

		}
		return info;
	}

	public static void main(String[] args) throws Exception {

		PreInitLoader.readySubLisp();
		final Predicate<File> offer = new Predicate<File>() {

			@Override
			public boolean test(File source) {
				try {
					String relPath = source.getPath().replace('\\', '/');
					if (relPath.endsWith(".java")) {
						relPath = relPath.substring(0, relPath.length() - 5);
						if (relPath.startsWith(MAIN_SERVER_4Q)) {
							relPath = relPath.substring(MAIN_SERVER_4Q.length());
						}
						relPath = relPath.replace('/', '.');
						findSpoonInfo(relPath);
					}
					return true;
				} catch (Exception e1) {
					e1.printStackTrace();
					return true;
				}
			}
		};
		FileRecurseVisitor.addInputResourceMask(MAIN_SERVER_4Q, "com/cyc/cycjava/cycl/*.java", offer, 999999, true);

		sdbc.class.toString();
		for (DepUntangler visitor : javaclasses.values()) {
			final JavaClass javaClass2 = visitor.resolveClass();
			if (javaClass2 != null) {
				DescendingVisitor classWalker = new DescendingVisitor(javaClass2, visitor);
				classWalker.visit();
			} else {
				// visitor.printError();
			}
		}
	}

}
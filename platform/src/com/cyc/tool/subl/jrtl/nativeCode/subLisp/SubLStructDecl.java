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

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLStructDecl {


	//// Constructors

	// @todo worry about synchronization
	private static Map<SubLSymbol, SubLStructDecl> structNameToStructDeclMap = new HashMap<SubLSymbol, SubLStructDecl>();

	//// Public Area

	private static Map<SubLSymbol, Integer> structNameToIDMap = new HashMap<SubLSymbol, Integer>();

	// @todo worry about synchronization
	protected static int idCounter = 0;

	public static SubLStructDecl getStructDecl(SubLSymbol structName) {
		SubLStructDecl structDecl = SubLStructDecl.structNameToStructDeclMap.get(structName);
		if (structDecl == null)
			Errors.error("Invalid struct name: " + structName);
		return structDecl;
	}

	public static int getTypeID(SubLSymbol typeName) {
		synchronized (SubLStructDecl.structNameToIDMap) {
			Integer id = SubLStructDecl.structNameToIDMap.get(typeName);
			if (id == null) {
				if (SubLStructDecl.idCounter >= Sxhash.MAX_STRUCT_DECLARATIONS)
					Errors.error("Too many sturcuture declarations.");
				id = new Integer(SubLStructDecl.idCounter++);
				SubLStructDecl.structNameToIDMap.put(typeName, id);
			}
			return id.intValue();
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
	}

	private int id;

	public boolean isInterned = false;

	private SubLSymbol structName = SubLNil.NIL;

	private SubLSymbol concName = SubLNil.NIL;

	private SubLSymbol[] getterNames;

	//// Protected Area

	//// Private Area

	//// Internal Rep

	private SubLSymbol[] slotNames;

	private SubLSymbol[] slotKeywords;

	private SubLSymbol[] setterNames;

	private SubLSymbol printFunction;

	private SubLSymbol hashFunction;

	private SubLSymbol testFunction;

	private boolean isSyncronized = false;

	/** Creates a new instance of SubLStructDecl. */
	SubLStructDecl(SubLSymbol structName, SubLSymbol[] getterNames, SubLSymbol[] setterNames, SubLSymbol[] slotKeywords,
			SubLSymbol printFunction, SubLSymbol hashFunction, SubLSymbol testFunction, boolean isInterned) {
		this.getterNames = getterNames;
		this.setterNames = setterNames;
		this.printFunction = printFunction;
		this.structName = structName;
		this.hashFunction = hashFunction;
		this.testFunction = testFunction;
		this.isInterned = isInterned;
		this.id = SubLStructDecl.getTypeID(structName);
		this.slotKeywords = slotKeywords;
		this.slotNames = new SubLSymbol[getterNames.length];
		// @hack to determine original slot names
		SubLPackage pkg = structName.getPackage();
		for (int i = 0, size = this.slotNames.length; i < size; i++)
			try {
				SubLSymbol slotKeyword = slotKeywords[i];
				String stotStr = slotKeyword.getName();
				SubLSymbol slotSymbol = SubLObjectFactory.makeSymbol(stotStr, pkg);
				this.slotNames[i] = slotSymbol;
			} catch (Exception e) {
				Errors.error(e.getMessage(), e);
			}
		// @endhack
		SubLStructDecl.structNameToStructDeclMap.put(structName, this);
	}

	public int getFieldCount() {
		return this.getterNames.length;
	}

	public int getFieldNumForSymbol(SubLSymbol symbol) {
		for (int i = 0, size = this.slotNames.length; i < size; i++)
			if (this.slotNames[i] == symbol)
				return i + 2;
		Errors.error(symbol + " is not a valid field of struct: " + this.structName);
		return -1;
	}

	public SubLSymbol getGetterName(int i) {
		return this.getterNames[i];
	}

	public int getId() {
		return this.id;
	}

	public SubLSymbol getSetterName(int i) {
		return this.setterNames[i];
	}

	public SubLSymbol getStructName() {
		return this.structName;
	}

	public boolean isInterned() {
		return this.isInterned;
	}
	
	public boolean isSyncronized() {
		return this.isSyncronized ;
	}

	//// Main

	public void setStructName(SubLSymbol newStructName) {
		if (this.structName != SubLNil.NIL)
			Errors.error("Can't set a structure's name twice: " + newStructName);
		this.structName = newStructName;
	}

}

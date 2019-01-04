//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.HashMap;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLStructDecl {
	protected SubLStructDecl(SubLSymbol structName, SubLSymbol[] getterNames, SubLSymbol[] setterNames, SubLSymbol[] slotKeywords,
			SubLSymbol printFunction, SubLSymbol hashFunction, SubLSymbol testFunction, boolean isInterned) {
		this.isInterned = false;
		this.structName = SubLNil.NIL;
		concName = SubLNil.NIL;
		this.getterNames = getterNames;
		this.setterNames = setterNames;
		this.printFunction = printFunction;
		this.structName = structName;
		this.hashFunction = hashFunction;
		this.testFunction = testFunction;
		this.isInterned = isInterned;
		id = getTypeID(structName);
		this.slotKeywords = slotKeywords;
		slotNames = new SubLSymbol[getterNames.length];
		SubLPackage pkg = structName.getPackage();
		for (int i = 0, size = slotNames.length; i < size; ++i)
			try {
				SubLSymbol slotKeyword = slotKeywords[i];
				String stotStr = slotKeyword.getName();
				SubLSymbol slotSymbol = SubLObjectFactory.makeSymbol(stotStr, pkg);
				slotNames[i] = slotSymbol;
			} catch (Exception e) {
				Errors.error(e.getMessage(), e);
			}
		SubLStructDecl.structNameToStructDeclMap.put(structName, this);
	}

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
				if (SubLStructDecl.idCounter >= 2048)
					Errors.error("Too many sturcuture declarations.");
				id = new Integer(SubLStructDecl.idCounter++);
				SubLStructDecl.structNameToIDMap.put(typeName, id);
			}
			return id;
		}
	}

	public static void main(String[] args) {
	}

	private int id;
	public boolean isInterned;
	private SubLSymbol structName;
	private SubLSymbol concName;
	private SubLSymbol[] getterNames;
	private SubLSymbol[] slotNames;
	private SubLSymbol[] slotKeywords;
	final private SubLSymbol[] setterNames;
	private SubLSymbol printFunction;
	private SubLSymbol hashFunction;
	private SubLSymbol testFunction;
	private static Map<SubLSymbol, SubLStructDecl> structNameToStructDeclMap;
	private static Map<SubLSymbol, Integer> structNameToIDMap;
	protected static int idCounter;
	static {
		structNameToStructDeclMap = new HashMap<SubLSymbol, SubLStructDecl>();
		structNameToIDMap = new HashMap<SubLSymbol, Integer>();
		SubLStructDecl.idCounter = 0;
	}

	public int getFieldCount() {
		return getterNames.length;
	}

	public int getFieldNumForSymbol(SubLSymbol symbol) {
		for (int i = 0, size = slotNames.length; i < size; ++i)
			if (slotNames[i] == symbol)
				return i + 2;
		Errors.error(symbol + " is not a valid field of struct: " + structName);
		return -1;
	}

	public SubLSymbol getGetterName(int i) {
		return getterNames[i];
	}

	public int getId() {
		return id;
	}

	public SubLSymbol getSetterName(int i) {
		return setterNames[i];
	}

	public SubLSymbol getStructName() {
		return structName;
	}

	public boolean isInterned() {
		return isInterned;
	}

	public void setStructName(SubLSymbol newStructName) {
		if (structName != SubLNil.NIL)
			Errors.error("Can't set a structure's name twice: " + newStructName);
		structName = newStructName;
	}
}

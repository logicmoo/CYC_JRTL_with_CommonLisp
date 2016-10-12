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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public class Structures implements SubLFile {

	//// Constructors

	public static SubLFile me = new Structures();

	public static SubLSymbol $dtp_structures_bag$ = null;

	//// Public Area

	private static SubLSymbol CSETF_TOKEN = SubLObjectFactory.makeSublispSymbol("%CSETF");

	private static int STRUCTURES_BAG_TYPE_CODE = 254;

	public static SubLObject clear_structure(SubLObject object, SubLObject size) {
		return Errors.error("This should never happen.");
	}

	public static SubLObject clear_sub_structure(SubLObject object, SubLObject size, SubLObject type) {
		object.toStruct().setName(type.toSymbol());
		return object;
	}

	public static SubLObject def_csetf(SubLObject accessor, SubLObject setter) {
		accessor.toSymbol().setProperty(Structures.CSETF_TOKEN, setter.toSymbol());
		return accessor;
	}

	public static SubLSymbol getStructureSetter(SubLSymbol accessor) {
		SubLObject getter = accessor.getProperty(Structures.CSETF_TOKEN);
		return getter == null ? CommonSymbols.NIL : getter.toSymbol();
	}

	public static SubLStructDeclNative makeStructDeclNative(Class structClass, SubLSymbol typeName,
			SubLSymbol predicateName, SubLList slotNames, SubLList slotKeywordNames, String[] actualFieldNames,
			SubLList getterNames, SubLList setterNames, SubLSymbol printFunction) {
		SubLSymbol[] slotNamesArray = (SubLSymbol[]) slotNames.toArray(new SubLSymbol[slotNames.size()]);
		SubLSymbol[] slotKeywordNamesArray = (SubLSymbol[]) slotKeywordNames
				.toArray(new SubLSymbol[slotKeywordNames.size()]);
		SubLSymbol[] getterNamesArray = (SubLSymbol[]) getterNames.toArray(new SubLSymbol[getterNames.size()]);
		SubLSymbol[] setterNamesArray = (SubLSymbol[]) setterNames.toArray(new SubLSymbol[setterNames.size()]);
		return new SubLStructDeclNative(structClass, typeName, predicateName, slotNamesArray, slotKeywordNamesArray,
				actualFieldNames, getterNamesArray, setterNamesArray, printFunction, null, false);
	}

	public static SubLObject method_func(SubLObject object, SubLObject methodTable) {
		// @hack isReaderWriterLock() is a hack until we promote them up to top
		// lvl and assign unique dtp number
		// @hack isSemaphore() is a hack until we promote them up to top lvl and
		// assign unique dtp number
		if (object.isStructure() || object.isReadWriteLock() || object.isSemaphore()) { // @todo
																						// this
																						// is
																						// too
																						// slow
																						// for
																						// looking
																						// up
																						// hash
																						// methods
			SubLObject structMethHash = methodTable.get(Structures.STRUCTURES_BAG_TYPE_CODE);
			return structMethHash == CommonSymbols.NIL ? CommonSymbols.NIL
					: Hashtables.gethash_without_values(object.getType(), structMethHash);
		}
		return methodTable.get(object.getTypeCode().intValue());
	}

	public static SubLObject new_structure(SubLObject type, SubLObject size) {
		return SubLObjectFactory.makeStructInterpreted(size.intValue());
	}

	// @todo add and analog of this for structures_bag subtypes
	public static SubLObject register_defstruct(SubLObject name, SubLObject type, SubLObject size,
			SubLObject printFunction, SubLObject slots) {
		/*
		 * SubLSymbol typeTyped = type.toSymbol(); SubLSymbol printFunctionTyped
		 * = printFunction.toSymbol(); SubLList slotsTyped = slots.toList(); int
		 * slotCount = slotsTyped.size(); SubLSymbol[] fieldNames =
		 * (SubLSymbol[]) slotsTyped.toArray(new SubLSymbol[slotCount]);
		 * // @hack the following line is wrong!!!!!!! -APB SubLSymbol[]
		 * fieldNamesAlt = (SubLSymbol[]) slotsTyped.toArray(new
		 * SubLSymbol[slotCount]); SubLStructDecl structDecl = new
		 * SubLStructDecl(typeTyped, fieldNames, fieldNamesAlt,
		 * printFunctionTyped, null, null, false);
		 */
		Errors.unimplementedMethod("register-defstruct");
		return CommonSymbols.NIL;
	}

	// Example accessor : C-NAME from the constant defstruct
	// Example setter : _CSETF-C-NAME associated with C-NAME

	public static SubLObject register_method(SubLObject methodTable, SubLObject type, SubLObject function) {
		if (type.isSymbol()) {
			if (methodTable == Sxhash.hashVector) {
				int index = SubLStructDecl.getTypeID(type.toSymbol());
				Sxhash.structHashMeths[index] = UnaryFunction.makeInstance(function.getFunc());
			}
			SubLObject structMethHash = methodTable.get(Structures.STRUCTURES_BAG_TYPE_CODE);
			if (structMethHash == CommonSymbols.NIL) {
				structMethHash = SubLObjectFactory.makeHashtable();
				methodTable.set(Structures.STRUCTURES_BAG_TYPE_CODE, structMethHash);
			}
			structMethHash.put(type, function);
		} else
			methodTable.set(type.intValue(), function);
		return function;
	}

	public static SubLObject set_structure_slot(SubLObject object, SubLObject slot, SubLObject value) {
		object.setField(slot.intValue(), value);
		return value;
	}

	public static SubLObject structure_slot(SubLObject struct, SubLObject slot) {
		return struct.getField(slot.intValue());
	}

	public static SubLObject structure_type(SubLObject object, SubLObject type) {
		if (object.getType() == type)
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	public static SubLObject structures_bag_p(SubLObject object) {
		if (object.isStructure())
			return CommonSymbols.T;
		return CommonSymbols.NIL;
	}

	/** Creates a new instance of Structures. */
	public Structures() {
	}

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(Structures.me, "structures_bag_p", "_STRUCTURES-BAG-P", 1, 0, false);
		SubLFiles.declareFunction(Structures.me, "new_structure", "_NEW-STRUCTURE", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "clear_structure", "_CLEAR-STRUCTURE", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "clear_sub_structure", "_CLEAR-SUB-STRUCTURE", 3, 0, false);
		SubLFiles.declareFunction(Structures.me, "structure_type", "_STRUCTURE-TYPE", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "structure_slot", "_STRUCTURE-SLOT", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "set_structure_slot", "_SET-STRUCTURE-SLOT", 3, 0, false);
		SubLFiles.declareFunction(Structures.me, "register_defstruct", "_REGISTER-DEFSTRUCT", 5, 0, false);

		SubLFiles.declareFunction(Structures.me, "register_method", "_REGISTER-METHOD", 3, 0, false);
		SubLFiles.declareFunction(Structures.me, "def_csetf", "_DEF-CSETF", 2, 0, false);
	}

	public void initializeVariables() {
		Structures.$dtp_structures_bag$ = SubLFiles.defconstant(Structures.me, "*DTP-STRUCTURES-BAG*",
				SubLObjectFactory.makeInteger(Structures.STRUCTURES_BAG_TYPE_CODE));
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}

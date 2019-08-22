/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import static org.logicmoo.system.Startup.addSubLFile;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Structures implements SubLFile
{
	public static SubLObject clear_structure(SubLObject object, SubLObject size)
	{
		return Errors.error("This should never happen.");
	}

	public static SubLObject clear_sub_structure(SubLObject object, SubLObject size, SubLObject type)
	{
		object.toStruct().setName(type.toSymbol());
		return object;
	}

	public static SubLObject def_csetf(SubLObject accessor, SubLObject setter)
	{
		accessor.toSymbol().setProperty(Structures.CSETF_TOKEN, setter.toSymbol());
		return accessor;
	}

	public static SubLSymbol getStructureSetter(SubLSymbol accessor)
	{
		SubLObject getter = accessor.getProperty(Structures.CSETF_TOKEN);
		return getter == null ? SubLNil.NIL : getter.toSymbol();
	}

    public static SubLStructDeclNative makeStructDeclNative(Class structClass, SubLSymbol typeName, SubLSymbol predicateName, String[] actualFieldNames, SubLSymbol printFunction) {
	String getterPrefix = null;
	String setterPre_Prefix = null;
	SubLStructDeclNative nativ = SubLStructDeclNative.makeStructDeclNative(structClass, typeName, predicateName, getterPrefix, setterPre_Prefix, actualFieldNames, printFunction);
	return nativ;
    }

    public static SubLStructDeclNative makeStructDeclNative(Class structClass, SubLSymbol typeName, SubLSymbol predicateName, SubLList slotNames, SubLList slotKeywordNames, String[] actualFieldNames, SubLList getterNames, SubLList setterNames, SubLSymbol printFunction) {
		SubLSymbol[] slotNamesArray = (SubLSymbol[]) slotNames.toArray(new SubLSymbol[slotNames.size()]);
		SubLSymbol[] slotKeywordNamesArray = (SubLSymbol[]) slotKeywordNames.toArray(new SubLSymbol[slotKeywordNames.size()]);
		SubLSymbol[] getterNamesArray = (SubLSymbol[]) getterNames.toArray(new SubLSymbol[getterNames.size()]);
		SubLSymbol[] setterNamesArray = (SubLSymbol[]) setterNames.toArray(new SubLSymbol[setterNames.size()]);
		SubLStructDeclNative nativ =  new SubLStructDeclNative(structClass, typeName, predicateName, slotNamesArray, slotKeywordNamesArray, actualFieldNames, getterNamesArray, setterNamesArray, printFunction, null, false);
		return nativ;
	}

	public static SubLObject method_func(SubLObject object, SubLObject methodTable)
	{
		if (object.isStructure() || object.isReadWriteLock() || object.isSemaphore())
		{
			SubLObject structMethHash = methodTable.get(254);
			return structMethHash == SubLNil.NIL ? SubLNil.NIL : Hashtables.gethash_without_values(object.getType(), structMethHash);
		}
		int typeCode = object.getTypeCode().intValue();
		if (typeCode == -1) { return SubLNil.NIL; }
		SubLObject waz = methodTable.get(typeCode);
		return waz;
	}

	public static SubLObject new_structure(SubLObject type, SubLObject size)
	{
		SubLStruct struct = SubLObjectFactory.makeStructInterpreted(size.intValue());
		struct.setName(type.toSymbol());
		return struct;
	}

	public static SubLObject register_defstruct(SubLObject name, SubLObject type, SubLObject size, SubLObject printFunction, SubLObject slots)
	{
		Errors.unimplementedMethod("register-defstruct");
		return SubLNil.NIL;
	}

	public static SubLObject register_method(SubLObject methodTable, SubLObject type, SubLObject function)
	{
		if (type.isSymbol())
		{
			if (methodTable == Sxhash.hashVector)
			{
				int index = SubLStructDecl.getTypeID(type.toSymbol());
				Sxhash.structHashMeths[index] = UnaryFunction.makeInstance(function.getFunc());
			}
			SubLObject structMethHash = methodTable.get(254);
			if (structMethHash == SubLNil.NIL)
			{
				structMethHash = SubLObjectFactory.makeHashtable();
				methodTable.set(254, structMethHash);
			}
			structMethHash.put(type, function);
		}
		else
			methodTable.set(type.intValue(), function);
		return function;
	}

	public static SubLObject set_structure_slot(SubLObject object, SubLObject slot, SubLObject value)
	{
		object.setField(slot.intValue(), value);
		return value;
	}

	public static SubLObject structure_slot(SubLObject struct, SubLObject slot)
	{
		return struct.getField(slot.intValue());
	}

	public static SubLObject structure_type(SubLObject object, SubLObject type)
	{
		if (object.getType() == type) return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject structures_bag_p(SubLObject object)
	{
		if (object.isStructure()) return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static SubLSymbol $dtp_structures_bag$;
	private static SubLSymbol CSETF_TOKEN;
	private static int STRUCTURES_BAG_TYPE_CODE = 254;
	static
	{
		me = new Structures();
		Structures.$dtp_structures_bag$ = null;
		CSETF_TOKEN = SubLObjectFactory.makeSublispSymbol("%CSETF");
	}

	@Override
	public void declareFunctions()
	{
		SubLFiles.declareFunction(Structures.me, "structures_bag_p", "_STRUCTURES-BAG-P", 1, 0, false);
		SubLFiles.declareFunction(Structures.me, "new_structure", "_NEW-STRUCTURE", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "clear_structure", "_CLEAR-STRUCTURE", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "clear_sub_structure", "_CLEAR-SUB-STRUCTURE", 3, 0, false);
		SubLFiles.declareFunction(Structures.me, "structure_type", "_STRUCTURE-TYPE", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "structure_slot", "_STRUCTURE-SLOT", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "set_structure_slot", "_SET-STRUCTURE-SLOT", 3, 0, false);
		SubLFiles.declareFunction(Structures.me, "register_defstruct", "_REGISTER-DEFSTRUCT", 5, 0, false);
		SubLFiles.declareFunction(Structures.me, "method_func", "_METHOD", 2, 0, false);
		SubLFiles.declareFunction(Structures.me, "register_method", "_REGISTER-METHOD", 3, 0, false);
		SubLFiles.declareFunction(Structures.me, "def_csetf", "_DEF-CSETF", 2, 0, false);
	}

	@Override
	public void initializeVariables()
	{
		Structures.$dtp_structures_bag$ = SubLFiles.defconstant(Structures.me, "*DTP-STRUCTURES-BAG*", SubLObjectFactory.makeInteger(254));
	}

	@Override
	public void runTopLevelForms()
	{
	}

	public Structures()
	{
		addSubLFile(this);
	}
}

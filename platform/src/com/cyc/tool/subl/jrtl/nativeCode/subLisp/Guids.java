//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Guids extends SubLTrampolineFile {
	public static SubLObject assemble_fixnums_to_guid(SubLObject byte_vector) {
		return SubLObjectFactory.makeGuid(byte_vector.toVect());
	}

	public static SubLObject crack_date_relative_guid(SubLObject guid) {
		return Errors.unimplementedMethod("Guids.crack_date_relative_guid()");
	}

	public static SubLObject date_relative_guid_p(SubLObject guid) {
		return Errors.unimplementedMethod("Guids.date_relative_guid_p()");
	}

	public static SubLObject disassemble_guid_to_fixnums(SubLObject guid, SubLObject byteVector) {
		if (byteVector == CommonSymbols.UNPROVIDED)
			byteVector = SubLObjectFactory.makeVector(16, CommonSymbols.ZERO_INTEGER);
		guid.toGuid().fillByteVector(byteVector.toVect());
		return byteVector;
	}

	public static SubLObject guid_p(SubLObject object) {
		if (object.isGuid())
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject guid_string_p(SubLObject object) {
		if (object.isString())
			return SubLObjectFactory.makeBoolean(SubLGuid.isGuidString(object.getStringValue()));
		return SubLNil.NIL;
	}

	public static SubLObject guid_to_string(SubLObject guid) {
		return guid.toGuid().getGuidString();
	}

	public static SubLObject guidE(SubLObject guid1, SubLObject guid2) {
		if (guid1.toGuid().compareTo(guid2.toGuid()) == 0)
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject guidG(SubLObject guid1, SubLObject guid2) {
		if (guid1.toGuid().compareTo(guid2.toGuid()) > 0)
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject guidGE(SubLObject guid1, SubLObject guid2) {
		if (guid1.toGuid().compareTo(guid2.toGuid()) >= 0)
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject guidL(SubLObject guid1, SubLObject guid2) {
		if (guid1.toGuid().compareTo(guid2.toGuid()) < 0)
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject guidLE(SubLObject guid1, SubLObject guid2) {
		if (guid1.toGuid().compareTo(guid2.toGuid()) <= 0)
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject guidNE(SubLObject guid1, SubLObject guid2) {
		if (guid1.toGuid().compareTo(guid2.toGuid()) != 0)
			return CommonSymbols.T;
		return SubLNil.NIL;
	}

	public static SubLObject make_date_relative_guid(SubLObject year, SubLObject month, SubLObject day,
			SubLObject offset) {
		return Errors.unimplementedMethod("Guids.make_date_relative_guid()");
	}

	public static SubLObject new_guid() {
		return SubLObjectFactory.makeGuid();
	}

	public static SubLObject string_to_guid(SubLObject string) {
		return SubLObjectFactory.makeGuid(string.getStringValue());
	}

	public static SubLFile me;
	public static SubLSymbol $dtp_guid$;
	static {
		me = new Guids();
		Guids.$dtp_guid$ = null;
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Guids.me, "assemble_fixnums_to_guid", "ASSEMBLE-FIXNUMS-TO-GUID", 1, 0, false);
		SubLFiles.declareFunction(Guids.me, "disassemble_guid_to_fixnums", "DISASSEMBLE-GUID-TO-FIXNUMS", 1, 1, false);
		SubLFiles.declareFunction(Guids.me, "crack_date_relative_guid", "CRACK-DATE-RELATIVE-GUID", 1, 0, false);
		SubLFiles.declareFunction(Guids.me, "date_relative_guid_p", "DATE-RELATIVE-GUID-P", 1, 0, false);
		SubLFiles.declareFunction(Guids.me, "guid_string_p", "GUID-STRING-P", 1, 0, false);
		SubLFiles.declareFunction(Guids.me, "guid_to_string", "GUID-TO-STRING", 1, 0, false);
		SubLFiles.declareFunction(Guids.me, "guidNE", "GUID/=", 2, 0, false);
		SubLFiles.declareFunction(Guids.me, "guidL", "GUID<", 2, 0, false);
		SubLFiles.declareFunction(Guids.me, "guidLE", "GUID<=", 2, 0, false);
		SubLFiles.declareFunction(Guids.me, "guidE", "GUID=", 2, 0, false);
		SubLFiles.declareFunction(Guids.me, "guidG", "GUID>", 2, 0, false);
		SubLFiles.declareFunction(Guids.me, "guidGE", "GUID>=", 2, 0, false);
		SubLFiles.declareFunction(Guids.me, "make_date_relative_guid", "MAKE-DATE-RELATIVE-GUID", 4, 0, false);
		SubLFiles.declareFunction(Guids.me, "new_guid", "NEW-GUID", 0, 0, false);
		SubLFiles.declareFunction(Guids.me, "string_to_guid", "STRING-TO-GUID", 1, 0, false);
		SubLFiles.declareFunction(Guids.me, "guid_p", "GUID-P", 1, 0, false);
	}

	@Override
	public void initializeVariables() {
		Guids.$dtp_guid$ = SubLFiles.defconstant(Guids.me, "*DTP-GUID*", SubLObjectFactory.makeInteger(127));
	}

	@Override
	public void runTopLevelForms() {
	}
}

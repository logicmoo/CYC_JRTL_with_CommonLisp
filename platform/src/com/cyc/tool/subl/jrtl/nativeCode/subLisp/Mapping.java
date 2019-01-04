//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Mapping extends SubLTrampolineFile {
	public static SubLObject mapc(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return list.toList().mapcar(function.getFunc(), moreLists, false);
	}

	public static SubLObject mapcan(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Functions.apply(CommonSymbols.NCONC, mapcar(function, list, moreLists).toList(),
				Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject mapcar(SubLObject functionSpec, SubLObject list) {
		return mapcar(functionSpec, list, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject mapcar(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return list.toList().mapcar(function.getFunc(), moreLists, true);
	}

	public static SubLObject mapcon(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Functions.apply(CommonSymbols.NCONC, maplist(function, list, moreLists).toList(),
				Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLObject mapl(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Errors.unimplementedMethod("Mapping.mapl()");
	}

	public static SubLObject maplist(SubLObject function, SubLObject list, SubLObject[] moreLists) {
		return Errors.unimplementedMethod("Mapping.maplist()");
	}

	public static SubLFile me;
	static {
		me = new Mapping();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Mapping.me, "mapc", "MAPC", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapcan", "MAPCAN", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapcar", "MAPCAR", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapcon", "MAPCON", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "mapl", "MAPL", 2, 0, true);
		SubLFiles.declareFunction(Mapping.me, "maplist", "MAPLIST", 2, 0, true);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}

//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class Alien implements SubLFile {
	public static SubLObject alien_as_string(SubLObject alien) {
		return Errors.unimplementedMethod("Alien.alien_as_string()");
	}

	public static SubLObject alien_null_ptrP(SubLObject object, SubLObject representation) {
		return Errors.unimplementedMethod("Alien.alien_null_ptrP()");
	}

	public static SubLObject alien_p(SubLObject object) {
		return Errors.unimplementedMethod("Alien.alien_p()");
	}

	public static SubLObject def_foreign_function(SubLObject FOREIGN_SHARED_LIBRARY, SubLObject FOREIGN_NAME,
			SubLObject SYMBOL, SubLObject ARG_CONVERSION, SubLObject RET_TYPE, SubLObject CALLING_CONVENTION,
			SubLObject NULL_DEFAULT_RETURN) {
		return SubLNil.NIL;
	}

	public static SubLObject load_shared_object(SubLObject moniker, SubLObject pathname, SubLObject options) {
		return Errors.unimplementedMethod("Alien.load_shared_object()");
	}

	public static SubLObject unload_shared_object(SubLObject pathname) {
		return Errors.unimplementedMethod("Alien.unload_shared_object()");
	}

	public static SubLFile me;
	static {
		me = new Alien();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(Alien.me, "alien_p", "ALIEN-P", 1, 0, false);
		SubLFiles.declareFunction(Alien.me, "alien_null_ptrP", "ALIEN-NULL-PTR?", 2, 0, false);
		SubLFiles.declareFunction(Alien.me, "def_foreign_function", "DEF-FOREIGN-FUNCTION", 7, 0, false);
		SubLFiles.declareFunction(Alien.me, "alien_as_string", "ALIEN-AS-STRING", 1, 0, false);
		SubLFiles.declareFunction(Alien.me, "load_shared_object", "LOAD-SHARED-OBJECT", 3, 0, false);
		SubLFiles.declareFunction(Alien.me, "unload_shared_object", "UNLOAD-SHARED-OBJECT", 1, 0, false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}

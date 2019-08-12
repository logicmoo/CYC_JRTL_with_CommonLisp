package com.cyc.cycjava.cycl;

//
import static com.cyc.cycjava.cycl.assertions_low.$assertion_content_native.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;

public final class assertion_content_holder {
    public static SubLStruct makeNewInstance() {
	return structDecl.newInstance();
    }

    public static SubLObject isInstance(SubLObject v_object) {
	final SubLObject was = structDecl.isInstance(v_object);
	return was;
    }
}
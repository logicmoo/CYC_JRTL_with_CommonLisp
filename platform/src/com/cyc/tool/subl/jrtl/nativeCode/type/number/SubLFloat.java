//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface SubLFloat extends SubLNumber, SubLObject {
	List decode();

	SubLNumber digits();

	List integerDecode();

	SubLNumber precision();

	SubLNumber radix();

	SubLFloat scale(SubLInteger p0);

	SubLNumber sign();
}

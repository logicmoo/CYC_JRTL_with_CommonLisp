//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLReadWriteLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSemaphore;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.format;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class PrintLow extends SubLTrampolineFile {
	public static boolean controlPrintLength() {
		return PrintLow.$print_length$.getValue().isNumber();
	}

	public static boolean controlPrintLevel() {
		return PrintLow.$print_level$.getValue().isNumber();
	}

	public static SubLObject default_jrtl_print_method(SubLObject obj, SubLObject stream) {
		streams_high.writeString(obj.toString(), stream.toOutputTextStream());
		return obj;
	}

	public static SubLObject format(SubLObject destination, SubLObject controlString) {
		return format.really_format(destination, controlString, SubLNil.NIL);
	}

	public static SubLObject format(SubLObject destination, SubLObject controlString, SubLObject arg1) {
		SubLObject arg_list = ConsesLow.list(arg1);
		return format.really_format(destination, controlString, arg_list);
	}

	public static SubLObject format(SubLObject destination, SubLObject controlString, SubLObject arg1,
			SubLObject arg2) {
		SubLObject arg_list = ConsesLow.list(arg1, arg2);
		return format.really_format(destination, controlString, arg_list);
	}

	public static SubLObject format(SubLObject destination, SubLObject controlString, SubLObject[] args) {
		SubLObject arg_list = SubLObjectFactory.makeList(args);
		return format.really_format(destination, controlString, arg_list);
	}

	public static int maxPrintLength() {
		if (controlPrintLength())
			return PrintLow.$print_length$.getDynamicValue().intValue();
		return Integer.MAX_VALUE;
	}

	public static int maxPrintLevel() {
		if (controlPrintLevel())
			return PrintLow.$print_level$.getDynamicValue().intValue();
		return Integer.MAX_VALUE;
	}

	public static void maybeDecreasePrintLevel(SubLObject oldLevel) {
		if (controlPrintLevel() && oldLevel != null)
			Dynamic.rebind(PrintLow.$print_level$, oldLevel);
	}

	public static SubLObject maybeIncreasePrintLevel() {
		if (controlPrintLevel()) {
			SubLNumber nextLevel = SubLObjectFactory.makeInteger(maxPrintLevel() - 1);
			SubLObject oldValue = PrintLow.$print_level$.getDynamicValue();
			Dynamic.bind(PrintLow.$print_level$, nextLevel);
			return oldValue;
		}
		return null;
	}

	public static void registerJRTLPrintMethods() {
		SubLSymbol defaultPrintSymbol = SubLSymbolFactory.makeSymbol("DEFAULT-JRTL-PRINT-METHOD", "SUBLISP");
		SubLSymbol processPrintSymbol = SubLSymbolFactory.makeSymbol("PRINT-PROCESS", "SUBLISP");
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_package$.getGlobalValue(), defaultPrintSymbol);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_lock$.getGlobalValue(), defaultPrintSymbol);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_stream$.getGlobalValue(), defaultPrintSymbol);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				SubLReadWriteLock.READ_WRITE_LOCK_TYPE_SYMBOL, defaultPrintSymbol);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_process$.getGlobalValue(), processPrintSymbol);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				SubLSemaphore.SEMAPHORE_TYPE_SYMBOL, defaultPrintSymbol);
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(),
				Types.$dtp_hash_table$.getGlobalValue(), defaultPrintSymbol);
	}

	public static boolean shouldPrintAtCurrentLevel() {
		return !controlPrintLevel() || maxPrintLevel() > 0;
	}

	public static SubLObject write(SubLObject object, SubLObject[] keys) {
		SubLObject key_list = SubLObjectFactory.makeList(keys);
		return print_high.really_write(object, key_list);
	}

	public static SubLObject write_to_string(SubLObject object, SubLObject[] keys) {
		SubLObject key_list = SubLObjectFactory.makeList(keys);
		return print_high.really_write_to_string(object, key_list);
	}

	public static SubLFile me;
	public static SubLSymbol $print_level$;
	public static SubLSymbol $print_length$;
	static {
		me = new PrintLow();
		PrintLow.$print_level$ = null;
		PrintLow.$print_length$ = null;
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(PrintLow.me, "format", "FORMAT", 2, 0, true);
		SubLFiles.declareFunction(PrintLow.me, "write_to_string", "WRITE-TO-STRING", 1, 0, true);
		SubLFiles.declareFunction(PrintLow.me, "write", "WRITE", 1, 0, true);
		SubLFiles.declareFunction(PrintLow.me, "default_jrtl_print_method", "DEFAULT-JRTL-PRINT-METHOD", 2, 0, false);
	}

	@Override
	public void initializeVariables() {
		PrintLow.$print_level$ = SubLFiles.defparameter(PrintLow.me, "*PRINT-LEVEL*",
				SubLObjectFactory.makeInteger(50));
		PrintLow.$print_length$ = SubLFiles.defparameter(PrintLow.me, "*PRINT-LENGTH*",
				SubLObjectFactory.makeInteger(100));
	}

	@Override
	public void runTopLevelForms() {
	}
}

//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

public class hashtables_high implements SubLFile {
	public static SubLObject destroy_hash_table_iterator(SubLObject hash_table_iterator) {
		hash_table_iterator.toHashtableIterator().clear();
		return SubLNil.NIL;
	}

	public static SubLObject hash_table_iterator_done_p(SubLObject hash_table_iterator) {
		boolean result = !hash_table_iterator.toHashtableIterator().hasNext();
		return SubLObjectFactory.makeBoolean(result);
	}

	public static SubLObject hash_table_iterator_hash_table(SubLObject hash_table_iterator) {
		return Errors.unimplementedMethod("HASH-TABLE-ITERATOR-HASH-TABLE");
	}

	public static SubLObject hash_table_iterator_key(SubLObject hash_table_iterator) {
		return hash_table_iterator.toHashtableIterator().getCurrentKey();
	}

	public static SubLObject hash_table_iterator_next(SubLObject hash_table_iterator) {
		hash_table_iterator.toHashtableIterator().next();
		return hash_table_iterator;
	}

	public static SubLObject hash_table_iterator_p(SubLObject object) {
		return SubLObjectFactory.makeBoolean(object.isHashtableIterator());
	}

	public static SubLObject hash_table_iterator_value(SubLObject hash_table_iterator) {
		return hash_table_iterator.toHashtableIterator().getCurrentValue();
	}

	public static SubLObject make_hash_table_iterator(SubLObject hash_table) {
		return SubLObjectFactory.makeHashtableIterator(hash_table.toHashtable());
	}

	public static SubLFile me;
	private static SubLObject[] $constants;
	static {
		me = new hashtables_high();
		$constants = new SubLObject[2];
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_p", "HASH-TABLE-ITERATOR-P", 1, 0, false);
		SubLFiles.declareFunction(hashtables_high.me, "make_hash_table_iterator", "MAKE-HASH-TABLE-ITERATOR", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "destroy_hash_table_iterator", "DESTROY-HASH-TABLE-ITERATOR", 1,
				0, false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_hash_table",
				"HASH-TABLE-ITERATOR-HASH-TABLE", 1, 0, false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_done_p", "HASH-TABLE-ITERATOR-DONE-P", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_key", "HASH-TABLE-ITERATOR-KEY", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_value", "HASH-TABLE-ITERATOR-VALUE", 1, 0,
				false);
		SubLFiles.declareFunction(hashtables_high.me, "hash_table_iterator_next", "HASH-TABLE-ITERATOR-NEXT", 1, 0,
				false);
	}

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}

	public hashtables_high() {
		BeanShellCntrl.addSubLFile(this);
	}
}

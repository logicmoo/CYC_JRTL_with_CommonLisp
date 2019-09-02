/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;



import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeHashtableIterator;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;


public class hashtables_high implements SubLFile {
    public static SubLObject destroy_hash_table_iterator(SubLObject hash_table_iterator) {
        hash_table_iterator.toHashtableIterator().clear();
        return SubLNil.NIL;
    }

    public static SubLObject hash_table_iterator_done_p(SubLObject hash_table_iterator) {
        boolean result = !hash_table_iterator.toHashtableIterator().hasNext();
        return makeBoolean(result);
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
        return makeBoolean(object.isHashtableIterator());
    }

    public static SubLObject hash_table_iterator_value(SubLObject hash_table_iterator) {
        return hash_table_iterator.toHashtableIterator().getCurrentValue();
    }

    public static SubLObject make_hash_table_iterator(SubLObject hash_table) {
        return makeHashtableIterator(hash_table.toHashtable());
    }

    public static final SubLFile me = new hashtables_high();

    // Internal Constants
    private static final SubLObject[] $constants = new SubLObject[2];

    static {


    }

    @Override
    public void declareFunctions() {
        declareFunction(me, "hash_table_iterator_p", "HASH-TABLE-ITERATOR-P", 1, 0, false);
        declareFunction(me, "make_hash_table_iterator", "MAKE-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "destroy_hash_table_iterator", "DESTROY-HASH-TABLE-ITERATOR", 1, 0, false);
        declareFunction(me, "hash_table_iterator_hash_table", "HASH-TABLE-ITERATOR-HASH-TABLE", 1, 0, false);
        declareFunction(me, "hash_table_iterator_done_p", "HASH-TABLE-ITERATOR-DONE-P", 1, 0, false);
        declareFunction(me, "hash_table_iterator_key", "HASH-TABLE-ITERATOR-KEY", 1, 0, false);
        declareFunction(me, "hash_table_iterator_value", "HASH-TABLE-ITERATOR-VALUE", 1, 0, false);
        declareFunction(me, "hash_table_iterator_next", "HASH-TABLE-ITERATOR-NEXT", 1, 0, false);
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


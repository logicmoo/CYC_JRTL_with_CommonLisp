/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.armedbear.lisp.Cons;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

public class SubLArrayList extends AbstractSubLList implements SubLCons, SubLList {
    SubLArrayList() {
        dottedElement = SubLNil.NIL;
        theList = new ArrayList<SubLObject>();
    }

    SubLArrayList(ArrayList<SubLObject> theList, boolean reuseArray) {
        dottedElement = SubLNil.NIL;
        if (reuseArray)
            this.theList = theList;
        else
            this.theList = (List<SubLObject>) theList.clone();
    }

    SubLArrayList(int capacity) {
        dottedElement = SubLNil.NIL;
        theList = new ArrayList<SubLObject>(capacity);
    }

    SubLArrayList(int capacity, SubLObject defaultObject) {
        dottedElement = SubLNil.NIL;
        theList = new ArrayList<SubLObject>(capacity);
        for (int i = 0; i < capacity; ++i)
            theList.add(defaultObject);
    }

    SubLArrayList(SubLObject first, SubLObject rest) {
        dottedElement = SubLNil.NIL;
        (theList = new ArrayList<SubLObject>()).add(first);
        setRest(rest);
    }

    private List<SubLObject> theList;
    private SubLObject dottedElement;

    private SubLObject makeNthCdr(int n) {
        return Errors.error("This shouldn't be possible.");
    }

    @Override
    public SubLList addItem(SubLObject item) {
        theList.add(item);
        return this;
    }

    @Override
    public SubLList adjoin(SubLObject item) {
        return Errors.unimplementedMethod("adjoin").toList();
    }

    @Override
    public SubLList adjoin(SubLObject item, BinaryFunction test) {
        return Errors.unimplementedMethod("adjoin").toList();
    }

    @Override
    public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("adjoin").toList();
    }

    @Override
    public SubLList allElementsButLast(int howMany, boolean isDestructive) {
        return Errors.unimplementedMethod("allElementsButLast").toList();
    }

    @Override
    public SubLList append(SubLList list, boolean isReverse) {
        return Errors.unimplementedMethod("append").toList();
    }

    @Override
    public SubLList asArrayList() {
        return this;
    }

    @Override
    public SubLList asConsList() {
        SubLObject curCdr = getDottedElement();
        SubLObject curCar = null;
        for (int i = this.size() - 1; i >= 0; --i) {
            curCar = this.get(i);
            curCdr = new Cons(curCar, curCdr);
        }
        return curCdr.toList();
    }

    @Override
    public boolean canFastHash() {
        return false;
    }

    public void clear() {
        theList.clear();
    }

    @Override
    public Object clone() {
        return makeCopy();
    }

    @Override
    public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
        return Errors.unimplementedMethod("concatenate").toList();
    }

    @Override
    public SubLSequence concatenate(SubLObject[] sequences) {
        return AbstractSubLSequence.concatenate(this, sequences);
    }

    @Override
    public int consLength() {
        return this.size();
    }

    @Override
    public SubLList copyList() {
        return makeCopy().toList();
    }

    @Override
    public SubLList copyTree() {
        return Errors.unimplementedMethod("copyTree").toList();
    }

    @Override
    public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
        return AbstractSubLSequence.count(this, item, test, key, start, end);
    }

    @Override
    public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
        return AbstractSubLSequence.countIf(this, test, key, start, end);
    }

    @Override
    public SubLSequence delete(int startIndex, int endIndexExclusive) {
        if (endIndexExclusive - startIndex == 1)
            theList.remove(startIndex);
        else
            theList.subList(startIndex, endIndexExclusive).clear();
        if (theList.size() == 0)
            return SubLNil.NIL;
        return this;
    }

    @Override
    public SubLSequence fill(SubLObject item, int start, int end) {
        return AbstractSubLSequence.fill(this, item, start, end);
    }

    @Override
    public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
        return AbstractSubLSequence.find(this, item, test, key, start, end);
    }

    @Override
    public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
        return AbstractSubLSequence.findIf(this, test, key, start, end);
    }

    @Override
    public SubLObject first() {
        if (theList.size() == 0)
            new Exception().printStackTrace();
        return theList.get(0);
    }

    @Override
    public SubLObject get(int index) {
        return theList.get(index);
    }

    @Override
    public SubLObject getDottedElement() {
        return dottedElement;
    }

    @Override
    public SubLSymbol getType() {
        return Types.$dtp_cons$;
    }

    @Override
    public SubLFixnum getTypeCode() {
        return CommonSymbols.FOUR_INTEGER;
    }

    @Override
    public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
            int start2, int end2) {
        return AbstractSubLSequence.indexOfMismatch(this, otherSeq, test, key, start1, start2, end1, end2);
    }

    @Override
    public SubLList intersection(SubLList item, boolean isDestructive) {
        return Errors.unimplementedMethod("intersection").toList();
    }

    @Override
    public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
        return Errors.unimplementedMethod("intersection").toList();
    }

    @Override
    public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("intersection").toList();
    }

    @Override
    public boolean isAlien() {
        return false;
    }

    @Override
    public boolean isArrayBased() {
        return true;
    }

    @Override
    public boolean isAtom() {
        return false;
    }

    @Override
    public boolean isBigIntegerBignum() {
        return false;
    }

    @Override
    public boolean isBignum() {
        return false;
    }

    @Override
    public boolean isBoolean() {
        return false;
    }

    @Override
    public boolean isChar() {
        return false;
    }

    @Override
    public boolean isCons() {
        return true;
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    public boolean isEmpty() {
        return this.size() <= 0;
    }

    @Override
    public boolean isEnvironment() {
        return false;
    }

    @Override
    public boolean isError() {
        return false;
    }

    @Override
    public boolean isFixnum() {
        return false;
    }

    @Override
    public boolean isFunction() {
        return false;
    }

    @Override
    public boolean isFunctionSpec() {
        return false;
    }

    @Override
    public boolean isGuid() {
        return false;
    }

    @Override
    public boolean isHashtable() {
        return false;
    }

    @Override
    public boolean isHashtableIterator() {
        return false;
    }

    @Override
    public boolean isIntBignum() {
        return false;
    }

    @Override
    public boolean isInteger() {
        return false;
    }

    @Override
    public boolean isKeyhash() {
        return false;
    }

    @Override
    public boolean isKeyhashIterator() {
        return false;
    }

    @Override
    public boolean isKeyword() {
        return false;
    }

    @Override
    public boolean isList() {
        return true;
    }

    @Override
    public boolean isLock() {
        return false;
    }

    @Override
    public boolean isLongBignum() {
        return false;
    }

    @Override
    public boolean isMacroOperator() {
        return false;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    // destructive modification primitives
    @Override
    public boolean isNumber() {
        return false;
    }

    @Override
    public boolean isPackage() {
        return false;
    }

    @Override
    public boolean isPackageIterator() {
        return false;
    }

    @Override
    public boolean isProcess() {
        return false;
    }

    @Override
    public boolean isProper() {
        return getDottedElement() == SubLNil.NIL;
    }

    @Override
    public boolean isReadWriteLock() {
        return false;
    }

    @Override
    public boolean isRegexPattern() {
        return false;
    }

    @Override
    public boolean isSemaphore() {
        return false;
    }

    @Override
    public boolean isSequence() {
        return true;
    }

    @Override
    public boolean isStream() {
        return false;
    }

    @Override
    public boolean isString() {
        return false;
    }

    @Override
    public boolean isStructure() {
        return false;
    }

    @Override
    public boolean isSubList(SubLList sublist) {
        Errors.unimplementedMethod("isSubList");
        return false;
    }

    @Override
    public boolean isSubSet(SubLList list) {
        Errors.unimplementedMethod("isSubSet");
        return false;
    }

    @Override
    public boolean isSymbol() {
        return false;
    }

    @Override
    public boolean isVector() {
        return false;
    }

    @Override
    public SubLObject last(int n) {
        if (n < 0)
            Errors.error("Got bad value to function 'last': " + n);
        if (n == 0)
            return getDottedElement();
        return nthCdr(this.size() - n);
    }

    public SubLList lastCons() {
        return Errors.unimplementedMethod("lastCons").toList();
    }

    @Override
    public int listLength() {
        Errors.unimplementedMethod("listLength");
        return -1;
    }

    @Override
    public SubLList listPrefix(SubLList postFix) {
        return Errors.unimplementedMethod("listPrefix").toList();
    }

    @Override
    public SubLObject makeCopy() {
        Object[] newItems = theList.toArray();
        ArrayList<SubLObject> newArrayList = new ArrayList(Arrays.asList(newItems));
        SubLList newList = SubLObjectFactory.makeList_Dangerous(newArrayList);
        newList.setDottedElement(dottedElement);
        return newList;
    }

    @Override
    public SubLObject makeDeepCopy() {
        Errors.unimplementedMethod("SubLArrayList.makeDeepCopy()");
        return null;
    }

    @Override
    public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
        int size = newBuf.size();
        ArrayList<SubLObject> theBuf = new ArrayList<SubLObject>(size);
        for (int i = 0; i < size; ++i)
            theBuf.add(newBuf.get(i));
        SubLSequence result = SubLObjectFactory.makeList_Dangerous(theBuf);
        return result;
    }

    @Override
    public SubLList member(SubLObject item, BinaryFunction test) {
        SubLObject currentItem = null;
        SubLList result = SubLNil.NIL;
        SubLListListIterator iter = null;
        Resourcer resourcer = Resourcer.getInstance();
        try {
            iter = resourcer.acquireSubLListListIterator(this);
            int i = 0;
            while (iter.hasNext()) {
                currentItem = iter.nextSubLObject();
                if (SubLNil.NIL != test.processItem(item, currentItem)) {
                    result = iter.previousSubSeq().toList();
                    break;
                }
                ++i;
            }
        } finally {
            resourcer.releaseSubLListListIterator(iter);
        }
        return result;
    }

    @Override
    public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
        if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
            return this.member(item, test);
        SubLObject currentItem = null;
        SubLList result = SubLNil.NIL;
        SubLListListIterator iter = null;
        Resourcer resourcer = Resourcer.getInstance();
        try {
            iter = resourcer.acquireSubLListListIterator(this);
            int i = 0;
            while (iter.hasNext()) {
                currentItem = iter.nextSubLObject();
                if (SubLNil.NIL != test.processItem(item, key.processItem(currentItem))) {
                    result = iter.previousSubSeq().toList();
                    break;
                }
                ++i;
            }
        } finally {
            resourcer.releaseSubLListListIterator(iter);
        }
        return result;
    }

    @Override
    public SubLList memberIf(BinaryFunction test) {
        return Errors.unimplementedMethod("memberIf").toList();
    }

    @Override
    public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("memberIf").toList();
    }

    public SubLObject nth(int index) {
        if (index < 0)
            Errors.error("Got invalid index to nth: " + index);
        int size = this.size();
        SubLObject dottedElement = getDottedElement();
        if (index == size) {
            if (!dottedElement.isList())
                Errors.error("Unable to find element " + index + " in list: " + this);
            return dottedElement.toList().first();
        }
        if (index > size) {
            if (dottedElement == SubLNil.NIL)
                return SubLNil.NIL;
            Errors.error("Unable to find element " + index + " in list: " + this);
        }
        return theList.get(index);
    }

    @Override
    public SubLObject nthCdr(int index) {
        return Errors.error("This shouldn't be possible.");
    }

    @Override
    public SubLObject pop() {
        SubLObject result = (SubLObject) this.remove(0);
        return this;
    }

    @Override
    public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
        return AbstractSubLSequence.positionOf(this, item, test, key, start, end);
    }

    @Override
    public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
        return AbstractSubLSequence.positionOfIf(this, test, key, start, end);
    }

    @Override
    public SubLCons push(SubLObject item) {
        this.add(0, item);
        return this;
    }

    @Override
    public SubLCons pushNew(SubLObject item) {
        if (this.positionOf(item) < 0)
            return push(item);
        return this;
    }

    @Override
    public SubLCons pushNew(SubLObject item, BinaryFunction test) {
        if (this.positionOf(item, test) < 0)
            return push(item);
        return this;
    }

    @Override
    public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
        if (this.positionOf(item, test, key) < 0)
            return push(item);
        return this;
    }

    @Override
    public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
        return AbstractSubLSequence.reduce(this, func, start, end, initialValue);
    }

    @Override
    public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
            int start, int end, int count) {
        SubLSequence result = AbstractSubLSequence.remove(this, item, isDestructive, test, key, start, end, count);
        return isEmpty() ? SubLNil.NIL : result;
    }

    @Override
    public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
            int end) {
        SubLSequence result = AbstractSubLSequence.removeDuplicates(this, isDestructive, test, key, start, end);
        return isEmpty() ? SubLNil.NIL : result;
    }

    public SubLSequence removeDuplicatesFast(BinaryFunction test, int start, int end) {
        SubLSequence result = AbstractSubLSequence.removeDuplicatesFast(this, test, start, end);
        return isEmpty() ? SubLNil.NIL : result;
    }

    @Override
    public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
            int count) {
        SubLSequence result = AbstractSubLSequence.removeIf(this, test, isDestructive, key, start, end, count);
        return isEmpty() ? SubLNil.NIL : result;
    }

    @Override
    public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
        SubLSequence result = AbstractSubLSequence.replace(this, seq, start1, end1, start2, end2);
        return isEmpty() ? SubLNil.NIL : result;
    }

    @Override
    public SubLObject rest() {
        if (this.size() == 1)
            return getDottedElement();
        return makeNthCdr(1);
    }

    @Override
    public SubLSequence reverse(boolean isDestructive) {
        return AbstractSubLSequence.reverse(this, isDestructive);
    }

    @Override
    public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
            int end2) {
        return AbstractSubLSequence.search(this, otherSeq, test, key, start1, start2, end1, end2);
    }

    @Override
    public void set(int index, SubLObject element) {
        if (element == null)
            throw new InvalidSubLExpressionException("Invalid attempt to add an invalid item to a LIST: " + element);
        theList.set(index, element);
    }

    @Override
    public SubLList setDifference(SubLList item, boolean isDestructive) {
        return Errors.unimplementedMethod("setDifference").toList();
    }

    @Override
    public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
        return Errors.unimplementedMethod("setDifference").toList();
    }

    @Override
    public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("setDifference").toList();
    }

    @Override
    public SubLObject setDottedElement(SubLObject dottedElement) {
        if (dottedElement.isCons()) {
            SubLListListIterator iter = null;
            Resourcer resourcer = Resourcer.getInstance();
            try {
                iter = resourcer.acquireSubLListListIterator(dottedElement.toList());
                while (iter.hasNext() && !iter.isNextImproperElement())
                    this.addItem(iter.next());
                if (iter.isNextImproperElement())
                    this.dottedElement = iter.getDottedElement();
            } finally {
                resourcer.releaseSubLListListIterator(iter);
            }
        } else
            this.dottedElement = dottedElement;
        return this;
    }

    @Override
    public SubLCons setFirst(SubLObject first) {
        if (this.size() == 0) {
            theList.add(first);
            return this;
        }
        setNth(first, 0);
        return this;
    }

    @Override
    public SubLCons setNth(SubLObject item, int index) {
        set(index, item);
        return this;
    }

    @Override
    public SubLCons setRest(SubLObject rest) {
        try {
            if (this.size() > 1) {
                SubLObject first = first();
                theList.clear();
                theList.add(first);
            }
            if (!rest.isCons())
                setDottedElement(rest);
            else {
                SubLCons cons = rest.toCons();
                setDottedElement(cons.getDottedElement());
                for (int i = 0, size = cons.size(); i < size; ++i)
                    theList.add(cons.get(i));
            }
            return this;
        } catch (Exception e) {
            return Errors.error("Error making cons.", e).toCons();
        }
    }

    @Override
    public SubLList setXor(SubLList item, boolean isDestructive) {
        return Errors.unimplementedMethod("setXor").toList();
    }

    @Override
    public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
        return Errors.unimplementedMethod("setXor").toList();
    }

    @Override
    public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("setXor").toList();
    }

    @Override
    public int size() {
        return theList.size();
    }

    @Override
    public int size(int max) {
        return theList.size();
    }

    @Override
    public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
        if (!isProper())
            Errors.error("Can't sort improper list.");
        if (this.size() == 1) {
            if (isDestructive)
                return this;
            return makeCopy().toSeq();
        } else {
            Object[] seq = this.toArray();
            if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
                Arrays.sort(seq, new ComparatorIdentityKey<Object>(pred));
            else
                Arrays.sort(seq, new ComparatorGenericKey<Object>(pred, key));
            if (isDestructive) {
                theList = new ArrayList(Arrays.asList(seq));
                return this;
            }
            return SubLObjectFactory.makeList(seq);
        }
    }

    @Override
    public SubLSequence subSeq(int start, int end) {
        return AbstractSubLSequence.subSeq(this, start, end);
    }

    @Override
    public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
            UnaryFunction key, int start, int end, int count) {
        return AbstractSubLSequence.substitute(this, newItem, oldItem, isDestructive, test, key, start, end, count);
    }

    @Override
    public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
        return Errors.unimplementedMethod("substituteFromAList").toList();
    }

    @Override
    public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
        return Errors.unimplementedMethod("substituteFromAList").toList();
    }

    @Override
    public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("substituteFromAList").toList();
    }

    @Override
    public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
            int start, int end, int count) {
        return AbstractSubLSequence.substituteIf(this, newItem, test, isDestructive, key, start, end, count);
    }

    @Override
    public Object[] toArray() {
        if (getDottedElement() != SubLNil.NIL)
            Errors.error("Unable to convert inproper lists to arrays: " + this);
        return theList.toArray();
    }

    @Override
    public Object[] toArray(Object[] a) {
        if (getDottedElement() != SubLNil.NIL)
            Errors.error("Unable to convert inproper lists to arrays: " + this);
        return theList.toArray(a);
    }

    @Override
    public SubLCons toCons() {
        return this;
    }

    @Override
    public SubLObject[] toSubLObjectArray() {
        if (!isProper())
            Errors.error("Can't convert an inproper list to array.");
        return theList.toArray(new SubLObject[this.size()]);
    }

    @Override
    public SubLList treeEqual(SubLList tree1, SubLList tree2) {
        return Errors.unimplementedMethod("treeEqual").toList();
    }

    @Override
    public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
        return Errors.unimplementedMethod("treeEqual").toList();
    }

    @Override
    public SubLList union(SubLList item, boolean isDestructive) {
        return Errors.unimplementedMethod("union").toList();
    }

    @Override
    public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
        return Errors.unimplementedMethod("union").toList();
    }

    @Override
    public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
        return Errors.unimplementedMethod("union").toList();
    }
}

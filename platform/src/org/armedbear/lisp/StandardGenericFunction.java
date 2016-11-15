/*
 * StandardGenericFunction.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: StandardGenericFunction.java 12513 2010-03-02 22:35:36Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.util.HashMap;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StandardGenericFunctionTrampolines.CacheEntry;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StandardGenericFunctionTrampolines.EqlSpecialization;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class StandardGenericFunction extends StandardObject {
	SubLObject function;

	int numberOfRequiredArgs;

	HashMap<CacheEntry, SubLObject> cache;
	HashMap<SubLObject, SubLObject> slotCache;

	// Profiling.
	private int[] callCount = new int[12];

	private int hotCount;

	EqlSpecialization eqlSpecializations[] = new EqlSpecialization[0];

	public StandardGenericFunction() {
		super(StandardClass.STANDARD_GENERIC_FUNCTION,
				StandardClass.STANDARD_GENERIC_FUNCTION.getClassLayout().getLength());
	}

	public StandardGenericFunction(String name, SubLPackage pkg, boolean exported, Function function,
			SubLObject lambdaList, SubLObject specializers) {
		this();
		SubLSymbol symbol;
		if (exported)
			symbol = pkg.internAndExport(name.toUpperCase());
		else
			symbol = pkg.intern(name.toUpperCase());
		symbol.setSymbolFunction(this);
		this.function = function;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_NAME] = symbol;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_LAMBDA_LIST] = lambdaList;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_REQUIRED_ARGS] = lambdaList;
		this.numberOfRequiredArgs = lambdaList.cl_length();
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_INITIAL_METHODS] = Lisp.NIL;
		StandardMethod method = new StandardMethod(this, function, lambdaList, specializers);
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_METHODS] = Lisp.list(method);
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_CLASS] = StandardClass.STANDARD_METHOD;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_METHOD_COMBINATION] = LispSymbols.STANDARD;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_ARGUMENT_PRECEDENCE_ORDER] = Lisp.NIL;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_CLASSES_TO_EMF_TABLE] = Lisp.NIL;
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_DOCUMENTATION] = Lisp.NIL;
	}

	public SubLObject execute() {
		return this.function.execute();
	}

	public SubLObject execute(SubLObject arg) {
		return this.function.execute(arg);
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		return this.function.execute(first, second);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		return this.function.execute(first, second, third);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		return this.function.execute(first, second, third, fourth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		return this.function.execute(first, second, third, fourth, fifth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		return this.function.execute(first, second, third, fourth, fifth, sixth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		return this.function.execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		return this.function.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public SubLObject execute(SubLObject[] args) {
		return this.function.execute(args);
	}

	void finalizeInternal() {
		this.cache = null;
	}

	/**
	 * Returns an object representing generic function argument <tt>arg</tt> in
	 * a <tt>CacheEntry</tt>
	 *
	 * <p>
	 * In the simplest case, when this generic function does not have EQL
	 * specialized methos, and therefore only argument types are relevant for
	 * choosing applicable methods, the value returned is the class of
	 * <tt>arg</tt>
	 *
	 * <p>
	 * If the function has EQL specialized methods: - if <tt>arg</tt> is EQL to
	 * some of the EQL-specializers, a special object representing equality to
	 * that specializer is returned. - otherwise class of the <tt>arg</tt> is
	 * returned.
	 *
	 * <p>
	 * Note that we do not consider argument position, when calculating arg
	 * specialization. In rare cases (when one argument is eql-specialized to a
	 * symbol specifying class of another argument) this may result in redundant
	 * cache entries caching the same method. But the method cached is anyway
	 * correct for the arguments (because in case of cache miss, correct method
	 * is calculated by other code, which does not rely on getArgSpecialization;
	 * and because EQL is true only for objects of the same type, which
	 * guaranties that if a type-specialized methods was chached by
	 * eql-specialization, all the cache hits into this records will be from
	 * args of the conforming type).
	 *
	 * <p>
	 * Consider:
	 *
	 * <pre>
	 * <tt>
	 * (defgeneric f (a b))
	 *
	 * (defmethod f (a (b (eql 'symbol)))
	 *   "T (EQL 'SYMBOL)")
	 *
	 * (defmethod f ((a symbol) (b (eql 'symbol)))
	 *   "SYMBOL (EQL 'SYMBOL)")
	 *
	 * (f 12 'symbol)
	 * => "T (EQL 'SYMBOL)"
	 *
	 * (f 'twelve 'symbol)
	 * => "SYMBOL (EQL 'SYMBOL)"
	 *
	 * (f 'symbol 'symbol)
	 * => "SYMBOL (EQL 'SYMBOL)"
	 *
	 * </tt>
	 * </pre>
	 *
	 * After the two above calls <tt>cache</tt> will contain tree keys:
	 *
	 * <pre>
	 * { class FIXNUM, EqlSpecialization('SYMBOL) }
	 * { class SYMBOL, EqlSpecialization('SYMBOL) }
	 * { EqlSpecialization('SYMBOL), EqlSpecialization('SYMBOL) }.
	 * </pre>
	 */
	SubLObject getArgSpecialization(SubLObject arg) {
		for (EqlSpecialization eqlSpecialization : this.eqlSpecializations)
			if (eqlSpecialization.eqlTo.eql(arg))
				return eqlSpecialization;
		return arg.classOf();
	}

	public SubLObject getCallCount() {
		return Profiler.makeCallCounts(this.callCount);
	}

	public SubLObject getGenericFunctionName() {
		return this.slots[StandardGenericFunctionClass.SLOT_INDEX_NAME];
	}

	public int getHotCount() {
		return this.hotCount;
	}

	public void incrementCallCount(int arity) {
		if (arity > 10)
			arity = -1;
		++this.callCount[arity + 1];
	}

	public void incrementHotCount() {
		++this.hotCount;
	}

	public void setCallCount(int n) {
		this.callCount[0] = n;
	}

	public void setGenericFunctionName(SubLObject name) {
		this.slots[StandardGenericFunctionClass.SLOT_INDEX_NAME] = name;
	}

	public void setHotCount(int n) {
		this.hotCount = n;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.COMPILED_FUNCTION)
			if (this.function != null)
				return this.function.typep(type);
			else
				return Lisp.NIL;
		if (type == LispSymbols.STANDARD_GENERIC_FUNCTION)
			return Lisp.T;
		if (type == StandardClass.STANDARD_GENERIC_FUNCTION)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		SubLObject name = this.getGenericFunctionName();
		if (name != null) {
			StringBuilder sb = new StringBuilder();
			sb.append(this.getLispClass().getLispClassName().writeToString());
			sb.append(' ');
			sb.append(name.writeToString());
			return this.unreadableString(sb.toString());
		}
		return super.writeToString();
	}

}

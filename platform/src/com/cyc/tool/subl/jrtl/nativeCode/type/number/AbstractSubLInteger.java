//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import org.armedbear.lisp.LispInteger;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public abstract class AbstractSubLInteger extends LispInteger
		implements SubLInteger, SubLNumber, SubLObject, Comparable {
	@Override
	public SubLInteger and(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.and");
		return null;
	}


	@Override
	public SubLInteger ceiling() {
		return this;
	}

	@Override
	public SubLInteger floor() {
		return this;
	}

	@Override
	public SubLInteger greatestCommonDivisor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.greatestCommonDivisor");
		return null;
	}

	@Override
	public SubLInteger integerDivide(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.integerDivide");
		return null;
	}

	@Override
	public SubLInteger integerLength() {
		Errors.unimplementedMethod("AbstractSubLInteger.integerLength");
		return null;
	}

	@Override
	public boolean isEven() {
		return (intValue() & 0x1) == 0x0;
	}

	@Override
	public boolean isOdd() {
		return (intValue() & 0x1) == 0x1;
	}

	@Override
	public SubLInteger leastCommonMultiple(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.leastCommonMultiple");
		return null;
	}

	@Override
	public SubLInteger nand(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.nand");
		return null;
	}

	@Override
	public SubLInteger nor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.nor");
		return null;
	}

	@Override
	public SubLInteger not(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.not");
		return null;
	}

	@Override
	public SubLInteger or(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.or");
		return null;
	}

	@Override
	public SubLInteger random() {
		Errors.unimplementedMethod("AbstractSubLInteger.random");
		return null;
	}

	@Override
	public SubLInteger round() {
		return this;
	}

	@Override
	public SubLDoubleFloat toDouble() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FLOAT");
		return null;
	}

	@Override
	public SubLInteger toInteger() {
		return this;
	}

	@Override
	public SubLInteger truncate() {
		return this;
	}

	@Override
	public SubLInteger xnor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.xnor");
		return null;
	}

	@Override
	public SubLInteger xor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.xor");
		return null;
	}
}

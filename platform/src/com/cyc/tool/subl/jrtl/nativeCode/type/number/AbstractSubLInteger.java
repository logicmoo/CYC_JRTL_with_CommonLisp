/*
 * AbstractSubLInteger.java
 *
 * Created on January 6, 2006, 1:52 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

/**
 *
 * @author Tony Brusseau
 */
public abstract class AbstractSubLInteger extends AbstractSubLNumber
		implements SubLInteger, SubLNumber, SubLObject, Comparable {

	/**
	 * Creates a new instance of AbstractSubLInteger
	 */
	public AbstractSubLInteger() {
	}

	public SubLInteger and(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.and");
		return null;
	}

	public SubLInteger ceiling() {
		return this;
	}

	public SubLInteger floor() {
		return this;
	}

	public SubLInteger greatestCommonDivisor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.greatestCommonDivisor");
		return null;
	}

	public SubLInteger integerDivide(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.integerDivide");
		return null;
	}

	public SubLInteger integerLength() {
		Errors.unimplementedMethod("AbstractSubLInteger.integerLength");
		return null;
	}

	public boolean isEven() {
		// truncate to int
		return (this.intValue() & 1) == 0;
	}

	public boolean isOdd() {
		// truncate to int
		return (this.intValue() & 1) == 1;
	}

	public SubLInteger leastCommonMultiple(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.leastCommonMultiple");
		return null;
	}

	public SubLInteger nand(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.nand");
		return null;
	}

	public SubLInteger nor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.nor");
		return null;
	}

	public SubLInteger not(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.not");
		return null;
	}

	public SubLInteger or(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.or");
		return null;
	}

	public SubLInteger random() {
		Errors.unimplementedMethod("AbstractSubLInteger.random");
		return null;
	}

	public SubLInteger round() {
		return this;
	}

	/** Method created to avoid casting */
	public SubLDoubleFloat toDouble() { // SubLDoubleFloat
		Errors.error(this + " is not of type: FLOAT.");
		return null;
	}

	/** Method created to avoid casting */
	public SubLInteger toInteger() { // SubLInteger
		return this;
	}

	public SubLInteger truncate() {
		return this;
	}

	public SubLInteger xnor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.xnor");
		return null;
	}

	public SubLInteger xor(SubLInteger num) {
		Errors.unimplementedMethod("AbstractSubLInteger.xor");
		return null;
	}

}

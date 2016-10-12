/*
 * Complex.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: Complex.java 12431 2010-02-08 08:05:15Z mevenson $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class Complex extends NumericLispObject {
	public SubLObject realpart;
	public SubLObject imagpart;

	protected Complex(SubLObject realpart, SubLObject imagpart) {
		this.realpart = realpart;
		this.imagpart = imagpart;
	}

	public SubLObject ABS() {
		if (this.realpart.isZero())
			return this.imagpart.ABS();
		double real = DoubleFloat.coerceToFloat(this.realpart).value;
		double imag = DoubleFloat.coerceToFloat(this.imagpart).value;
		double result;
		if (IkvmSite.isIKVM())
			result = Math.sqrt(real * real + imag * imag); // IKVM.NET hypot is
															// broken?!
		else
			result = Math.hypot(real, imag);
		if (this.realpart instanceof DoubleFloat)
			return LispObjectFactory.makeDouble(result);
		else
			return LispObjectFactory.makeSingle((float) result);
	}

	public SubLObject add(SubLObject obj) {
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.realpart.add(c.realpart), this.imagpart.add(c.imagpart));
		}
		return LispObjectFactory.makeComplex(this.realpart.add(obj), this.imagpart);
	}

	public SubLObject classOf() {
		return BuiltInClass.COMPLEX;
	}

	public SubLObject COMPLEXP() {
		return Lisp.T;
	}

	public SubLObject dec() {
		return LispObjectFactory.makeComplex(this.realpart.sub(Fixnum.ONE), this.imagpart);
	}

	public SubLObject divideBy(SubLObject obj) {
		if (obj instanceof Complex) {
			SubLObject a = this.realpart;
			SubLObject b = this.imagpart;
			SubLObject c = ((Complex) obj).getRealPart();
			SubLObject d = ((Complex) obj).getImaginaryPart();
			SubLObject ac = a.mult(c);
			SubLObject bd = b.mult(d);
			SubLObject bc = b.mult(c);
			SubLObject ad = a.mult(d);
			SubLObject denominator = c.mult(c).add(d.mult(d));
			return LispObjectFactory.makeComplex(ac.add(bd).divideBy(denominator), bc.sub(ad).divideBy(denominator));
		}
		return LispObjectFactory.makeComplex(this.realpart.divideBy(obj), this.imagpart.divideBy(obj));
	}

	public boolean eql(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return this.realpart.eql(c.realpart) && this.imagpart.eql(c.imagpart);
		}
		return false;
	}

	public boolean equal(SubLObject obj) {
		return this.eql(obj);
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return this.realpart.numE(c.realpart) && this.imagpart.numE(c.imagpart);
		}
		if (obj.isNumber()) {
			// obj is a number, but not complex.
			if (this.imagpart instanceof SingleFloat)
				if (((SingleFloat) this.imagpart).value == 0) {
					if (obj instanceof Fixnum)
						return ((Fixnum) obj).value == ((SingleFloat) this.realpart).value;
					if (obj instanceof SingleFloat)
						return ((SingleFloat) obj).value == ((SingleFloat) this.realpart).value;
				}
			if (this.imagpart instanceof DoubleFloat)
				if (((DoubleFloat) this.imagpart).value == 0) {
					if (obj instanceof Fixnum)
						return ((Fixnum) obj).value == ((DoubleFloat) this.realpart).value;
					if (obj instanceof DoubleFloat)
						return ((DoubleFloat) obj).value == ((DoubleFloat) this.realpart).value;
				}
		}
		return false;
	}

	public SubLObject getImaginaryPart() {
		return this.imagpart;
	}

	public SubLObject getRealPart() {
		return this.realpart;
	}

	public SubLObject inc() {
		return LispObjectFactory.makeComplex(this.realpart.add(Fixnum.ONE), this.imagpart);
	}

	public boolean isNotEqualTo(SubLObject obj) {
		return !this.numE(obj);
	}

	public boolean isNumber() {
		return true;
	}

	public boolean isZero() {
		return this.realpart.isZero() && this.imagpart.isZero();
	}

	public SubLObject mult(SubLObject obj) {
		if (obj instanceof Complex) {
			SubLObject a = this.realpart;
			SubLObject b = this.imagpart;
			SubLObject c = ((Complex) obj).getRealPart();
			SubLObject d = ((Complex) obj).getImaginaryPart();
			// xy = (ac - bd) + i(ad + bc)
			// real part = ac - bd
			// imag part = ad + bc
			SubLObject ac = a.mult(c);
			SubLObject bd = b.mult(d);
			SubLObject ad = a.mult(d);
			SubLObject bc = b.mult(c);
			return LispObjectFactory.makeComplex(ac.sub(bd), ad.add(bc));
		}
		return LispObjectFactory.makeComplex(this.realpart.mult(obj), this.imagpart.mult(obj));
	}

	public boolean numE(SubLObject obj) {
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return this.realpart.numE(c.realpart) && this.imagpart.numE(c.imagpart);
		}
		if (obj.isNumber()) {
			// obj is a number, but not complex.
			if (this.imagpart instanceof SingleFloat)
				if (((SingleFloat) this.imagpart).value == 0) {
					if (obj instanceof Fixnum)
						return ((Fixnum) obj).value == ((SingleFloat) this.realpart).value;
					if (obj instanceof SingleFloat)
						return ((SingleFloat) obj).value == ((SingleFloat) this.realpart).value;
					if (obj instanceof DoubleFloat)
						return ((DoubleFloat) obj).value == ((SingleFloat) this.realpart).value;
				}
			if (this.imagpart instanceof DoubleFloat)
				if (((DoubleFloat) this.imagpart).value == 0) {
					if (obj instanceof Fixnum)
						return ((Fixnum) obj).value == ((DoubleFloat) this.realpart).value;
					if (obj instanceof SingleFloat)
						return ((SingleFloat) obj).value == ((DoubleFloat) this.realpart).value;
					if (obj instanceof DoubleFloat)
						return ((DoubleFloat) obj).value == ((DoubleFloat) this.realpart).value;
				}
			return false;
		}
		Lisp.type_error(obj, LispSymbols.NUMBER);
		// Not reached.
		return false;
	}

	public int psxhash() {
		return Lisp.mix(this.realpart.psxhash(), this.imagpart.psxhash()) & 0x7fffffff;
	}

	public SubLObject sub(SubLObject obj) {
		if (obj instanceof Complex) {
			Complex c = (Complex) obj;
			return LispObjectFactory.makeComplex(this.realpart.sub(c.realpart), this.imagpart.sub(c.imagpart));
		}
		return LispObjectFactory.makeComplex(this.realpart.sub(obj), this.imagpart);
	}

	public int sxhash() {
		return Lisp.mix(this.realpart.sxhash(), this.imagpart.sxhash()) & 0x7fffffff;
	}

	public SubLObject typeOf() {
		return LispSymbols.COMPLEX;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.COMPLEX)
			return Lisp.T;
		if (type == LispSymbols.NUMBER)
			return Lisp.T;
		if (type == BuiltInClass.COMPLEX)
			return Lisp.T;
		if (type == BuiltInClass.NUMBER)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		StringBuilder sb = new StringBuilder("#C(");
		sb.append(this.realpart.writeToString());
		sb.append(' ');
		sb.append(this.imagpart.writeToString());
		sb.append(')');
		return sb.toString();
	}
}

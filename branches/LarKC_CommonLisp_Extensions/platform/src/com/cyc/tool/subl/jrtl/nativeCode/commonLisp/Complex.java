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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class Complex extends NumericLispObject
{
  public final SubLObject realpart;
  public final SubLObject imagpart;

  protected Complex(SubLObject realpart, SubLObject imagpart)
  {
    this.realpart = realpart;
    this.imagpart = imagpart;
  }

  public SubLObject getRealPart()
  {
    return realpart;
  }

  public SubLObject getImaginaryPart()
  {
    return imagpart;
  }

  @Override
  public SubLObject typeOf()
  {
    return LispSymbols.COMPLEX;
  }

  @Override
  public SubLObject classOf()
  {
    return BuiltInClass.COMPLEX;
  }

  @Override
  public SubLObject typep(SubLObject type)
  {
    if (type == LispSymbols.COMPLEX)
      return T;
    if (type == LispSymbols.NUMBER)
      return T;
    if (type == BuiltInClass.COMPLEX)
      return T;
    if (type == BuiltInClass.NUMBER)
      return T;
    return super.typep(type);
  }

  @Override
  public boolean isNumber()
  {
    return true;
  }

  @Override
  public boolean eql(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return realpart.eql(c.realpart) && imagpart.eql(c.imagpart);
      }
    return false;
  }

  @Override
  public boolean equal(SubLObject obj)
  {
    return eql(obj);
  }

  @Override
  public boolean equalp(SubLObject obj)
  {
    if (this == obj)
      return true;
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return (realpart.numE(c.realpart) &&
                imagpart.numE(c.imagpart));
      }
    if (obj.isNumber())
      {
        // obj is a number, but not complex.
        if (imagpart instanceof SingleFloat)
          {
            if (((SingleFloat)imagpart).value == 0)
              {
                if (obj instanceof Fixnum)
                  return ((Fixnum)obj).value == ((SingleFloat)realpart).value;
                if (obj instanceof SingleFloat)
                  return ((SingleFloat)obj).value == ((SingleFloat)realpart).value;
              }
          }
        if (imagpart instanceof DoubleFloat)
          {
            if (((DoubleFloat)imagpart).value == 0)
              {
                if (obj instanceof Fixnum)
                  return ((Fixnum)obj).value == ((DoubleFloat)realpart).value;
                if (obj instanceof DoubleFloat)
                  return ((DoubleFloat)obj).value == ((DoubleFloat)realpart).value;
              }
          }
      }
    return false;
  }

  @Override
  public final SubLObject inc()
  {
    return LispObjectFactory.makeComplex(realpart.add(Fixnum.ONE), imagpart);
  }

  @Override
  public final SubLObject dec()
  {
    return LispObjectFactory.makeComplex(realpart.sub(Fixnum.ONE), imagpart);
  }

  @Override
  public SubLObject add(SubLObject obj)
  {
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return LispObjectFactory.makeComplex(realpart.add(c.realpart), imagpart.add(c.imagpart));
      }
    return LispObjectFactory.makeComplex(realpart.add(obj), imagpart);
  }

  @Override
  public SubLObject sub(SubLObject obj)
  {
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return LispObjectFactory.makeComplex(realpart.sub(c.realpart),
                           imagpart.sub(c.imagpart));
      }
    return LispObjectFactory.makeComplex(realpart.sub(obj), imagpart);
  }

  @Override
  public SubLObject mult(SubLObject obj)
  {
    if (obj instanceof Complex)
      {
        SubLObject a = realpart;
        SubLObject b = imagpart;
        SubLObject c = ((Complex)obj).getRealPart();
        SubLObject d = ((Complex)obj).getImaginaryPart();
        // xy = (ac - bd) + i(ad + bc)
        // real part = ac - bd
        // imag part = ad + bc
        SubLObject ac = a.mult(c);
        SubLObject bd = b.mult(d);
        SubLObject ad = a.mult(d);
        SubLObject bc = b.mult(c);
        return LispObjectFactory.makeComplex(ac.sub(bd), ad.add(bc));
      }
    return LispObjectFactory.makeComplex(realpart.mult(obj),
                               imagpart.mult(obj));
  }

  @Override
  public SubLObject divideBy(SubLObject obj)
  {
    if (obj instanceof Complex)
      {
        SubLObject a = realpart;
        SubLObject b = imagpart;
        SubLObject c = ((Complex)obj).getRealPart();
        SubLObject d = ((Complex)obj).getImaginaryPart();
        SubLObject ac = a.mult(c);
        SubLObject bd = b.mult(d);
        SubLObject bc = b.mult(c);
        SubLObject ad = a.mult(d);
        SubLObject denominator = c.mult(c).add(d.mult(d));
        return LispObjectFactory.makeComplex(ac.add(bd).divideBy(denominator),
                                   bc.sub(ad).divideBy(denominator));
      }
    return LispObjectFactory.makeComplex(realpart.divideBy(obj),
                               imagpart.divideBy(obj));
  }

  @Override
  public boolean numE(SubLObject obj)
  {
    if (obj instanceof Complex)
      {
        Complex c = (Complex) obj;
        return (realpart.numE(c.realpart) &&
                imagpart.numE(c.imagpart));
      }
    if (obj.isNumber())
      {
        // obj is a number, but not complex.
        if (imagpart instanceof SingleFloat)
          {
            if (((SingleFloat)imagpart).value == 0)
              {
                if (obj instanceof Fixnum)
                  return ((Fixnum)obj).value == ((SingleFloat)realpart).value;
                if (obj instanceof SingleFloat)
                  return ((SingleFloat)obj).value == ((SingleFloat)realpart).value;
                if (obj instanceof DoubleFloat)
                  return ((DoubleFloat)obj).value == ((SingleFloat)realpart).value;
              }
          }
        if (imagpart instanceof DoubleFloat)
          {
            if (((DoubleFloat)imagpart).value == 0)
              {
                if (obj instanceof Fixnum)
                  return ((Fixnum)obj).value == ((DoubleFloat)realpart).value;
                if (obj instanceof SingleFloat)
                  return ((SingleFloat)obj).value == ((DoubleFloat)realpart).value;
                if (obj instanceof DoubleFloat)
                  return ((DoubleFloat)obj).value == ((DoubleFloat)realpart).value;
              }
          }
        return false;
      }
    type_error(obj, LispSymbols.NUMBER);
    // Not reached.
    return false;
  }

  @Override
  public boolean isNotEqualTo(SubLObject obj)
  {
    return !numE(obj);
  }

  @Override
  public SubLObject ABS()
  {
    if (realpart.isZero())
      return imagpart.ABS();
    double real = DoubleFloat.coerceToFloat(realpart).value;
    double imag = DoubleFloat.coerceToFloat(imagpart).value;
    double result;
    if (IkvmSite.isIKVM()) {
    	result = Math.sqrt(real * real + imag * imag); // IKVM.NET hypot is broken?!
    } else {
    	result = Math.hypot(real, imag);
    }
    if (realpart instanceof DoubleFloat)
      return makeDouble(result);
    else
      return makeSingle((float)result);
  }

  @Override
  public boolean isZero()
  {
    return realpart.isZero() && imagpart.isZero();
  }

  @Override
  public SubLObject COMPLEXP()
  {
    return T;
  }

  @Override
  public int sxhash()
  {
    return (mix(realpart.sxhash(), imagpart.sxhash()) & 0x7fffffff);
  }

  @Override
  public int psxhash()
  {
    return (mix(realpart.psxhash(), imagpart.psxhash()) & 0x7fffffff);
  }

  @Override
  public String writeToString()
  {
    StringBuilder sb = new StringBuilder("#C(");
    sb.append(realpart.writeToString());
    sb.append(' ');
    sb.append(imagpart.writeToString());
    sb.append(')');
    return sb.toString();
  }
}

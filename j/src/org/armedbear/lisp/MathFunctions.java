/*
 * Math.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: MathFunctions.java,v 1.8 2004-06-10 23:21:19 piso Exp $
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
 */

package org.armedbear.lisp;

import java.lang.reflect.Method;

public final class MathFunctions extends Lisp
{
    // Java 1.5 provides native implementations of sinh and tanh.
    private static final boolean isJava15;
    static {
        isJava15 = System.getProperty("java.version").startsWith("1.5");
    }

    // ### sin
    private static final Primitive1 SIN = new Primitive1("sin", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return sin(arg);
        }
    };

    private static LispObject sin(LispObject arg) throws ConditionThrowable
    {
        if (arg.realp())
            return new LispFloat(Math.sin(LispFloat.coerceToFloat(arg).getValue()));
        if (arg instanceof Complex) {
            LispObject n = arg.multiplyBy(Complex.getInstance(Fixnum.ZERO,
                                                              Fixnum.ONE));
            LispObject result = exp(n);
            result = result.subtract(exp(n.multiplyBy(Fixnum.MINUS_ONE)));
            return result.divideBy(Fixnum.TWO.multiplyBy(Complex.getInstance(Fixnum.ZERO,
                                                                             Fixnum.ONE)));
        }
        return signal(new TypeError(arg, Symbol.NUMBER));
    }

    // ### cos
    private static final Primitive1 COS = new Primitive1("cos", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return cos(arg);
        }
    };

    private static LispObject cos(LispObject arg) throws ConditionThrowable
    {
        if (arg.realp())
            return new LispFloat(Math.cos(LispFloat.coerceToFloat(arg).getValue()));
        if (arg instanceof Complex) {
            LispObject n = arg.multiplyBy(Complex.getInstance(Fixnum.ZERO,
                                                              Fixnum.ONE));
            LispObject result = exp(n);
            result = result.add(exp(n.multiplyBy(Fixnum.MINUS_ONE)));
            return result.divideBy(Fixnum.TWO);
        }
        return signal(new TypeError(arg, "number"));
    }

    // ### tan
    private static final Primitive1 TAN = new Primitive1("tan", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg.realp())
                return new LispFloat(Math.tan(LispFloat.coerceToFloat(arg).value));
            return sin(arg).divideBy(cos(arg));
        }
    };

    // ### asin
    private static final Primitive1 ASIN = new Primitive1("asin", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return asin(arg);
        }
    };

    private static LispObject asin(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(asin(((Complex)arg).getRealPart()),
                                           im);
        }
        if (arg instanceof LispFloat)
            return new LispFloat(Math.asin(((LispFloat)arg).value));
        LispObject result = arg.multiplyBy(arg);
        result = Fixnum.ONE.subtract(result);
        result = sqrt(result);
        LispObject n = Complex.getInstance(Fixnum.ZERO, Fixnum.ONE);
        n = n.multiplyBy(arg);
        result = n.add(result);
        result = log(result);
        result = result.multiplyBy(Complex.getInstance(Fixnum.ZERO, Fixnum.MINUS_ONE));
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    // ### acos
    private static final Primitive1 ACOS = new Primitive1("acos", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return acos(arg);
        }
    };

    private static LispObject acos(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(acos(((Complex)arg).getRealPart()),
                                           im);
        }
        if (arg instanceof LispFloat)
            return new LispFloat(Math.acos(((LispFloat)arg).value));
        LispObject result = LispFloat.PI.divideBy(Fixnum.TWO);
        result = result.subtract(asin(arg));
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    // ### atan
    private static final Primitive ATAN =
        new Primitive("atan", "number1 &optional number2")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return atan(arg);
        }

        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            return atan(first.divideBy(second));
        }
    };

    private static LispObject atan(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(atan(((Complex)arg).getRealPart()),
                                           im);
            LispObject result = arg.multiplyBy(arg);
            result = result.add(Fixnum.ONE);
            result = Fixnum.ONE.divideBy(result);
            result = sqrt(result);
            LispObject n = Complex.getInstance(Fixnum.ZERO, Fixnum.ONE);
            n = n.multiplyBy(arg);
            n = n.add(Fixnum.ONE);
            result = n.multiplyBy(result);
            result = log(result);
            result = result.multiplyBy(Complex.getInstance(Fixnum.ZERO, Fixnum.MINUS_ONE));
            return result;
        }
        return new LispFloat(Math.atan(LispFloat.coerceToFloat(arg).getValue()));
    }

    // ### sinh
    private static final Primitive1 SINH = new Primitive1("sinh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return sinh(arg);
        }
    };

    private static Method sinhMethod = null;

    private static LispObject sinh(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(sinh(((Complex)arg).getRealPart()),
                                           im);
        }
        if (isJava15 && arg instanceof LispFloat) {
            try {
                if (sinhMethod == null) {
                    Class c = Class.forName("java.lang.Math");
                    Class[] parameterTypes = new Class[1];
                    parameterTypes[0] = Double.TYPE;
                    sinhMethod = c.getMethod("sinh", parameterTypes);
                }
                if (sinhMethod != null) {
                    Object[] args;
                    args = new Object[1];
                    args[0] = new Double(((LispFloat)arg).value);
                    Double d = (Double) sinhMethod.invoke(null, args);
                    return new LispFloat(d.doubleValue());
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
                // Fall through...
            }
        }
        LispObject result = exp(arg);
        result = result.subtract(exp(arg.multiplyBy(Fixnum.MINUS_ONE)));
        result = result.divideBy(Fixnum.TWO);
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    // ### cosh
    private static final Primitive1 COSH = new Primitive1("cosh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return cosh(arg);
        }
    };

    private static Method coshMethod = null;

    private static LispObject cosh(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(cosh(((Complex)arg).getRealPart()),
                                           im);
        }
        if (isJava15 && arg instanceof LispFloat) {
            try {
                if (coshMethod == null) {
                    Class c = Class.forName("java.lang.Math");
                    Class[] parameterTypes = new Class[1];
                    parameterTypes[0] = Double.TYPE;
                    coshMethod = c.getMethod("cosh", parameterTypes);
                }
                if (coshMethod != null) {
                    Object[] args;
                    args = new Object[1];
                    args[0] = new Double(((LispFloat)arg).value);
                    Double d = (Double) coshMethod.invoke(null, args);
                    return new LispFloat(d.doubleValue());
                }
            }
            catch (Throwable t) {
                Debug.trace(t);
                // Fall through...
            }
        }
        LispObject result = exp(arg);
        result = result.add(exp(arg.multiplyBy(Fixnum.MINUS_ONE)));
        result = result.divideBy(Fixnum.TWO);
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    private static Method tanhMethod = null;

    // ### tanh
    private static final Primitive1 TANH = new Primitive1("tanh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (isJava15 && arg instanceof LispFloat) {
                try {
                    if (tanhMethod == null) {
                        Class c = Class.forName("java.lang.Math");
                        Class[] parameterTypes = new Class[1];
                        parameterTypes[0] = Double.TYPE;
                        tanhMethod = c.getMethod("tanh", parameterTypes);
                    }
                    if (tanhMethod != null) {
                        Object[] args;
                        args = new Object[1];
                        args[0] = new Double(((LispFloat)arg).value);
                        Double d = (Double) tanhMethod.invoke(null, args);
                        return new LispFloat(d.doubleValue());
                    }
                }
                catch (Throwable t) {
                    Debug.trace(t);
                    // Fall through...
                }
            }
            return sinh(arg).divideBy(cosh(arg));
        }
    };

    // ### asinh
    private static final Primitive1 ASINH = new Primitive1("asinh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return asinh(arg);
        }
    };

    private static LispObject asinh(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(asinh(((Complex)arg).getRealPart()),
                                           im);
        }
        LispObject result = arg.multiplyBy(arg);
        result = Fixnum.ONE.add(result);
        result = sqrt(result);
        result = result.add(arg);
        result = log(result);
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    // ### acosh
    private static final Primitive1 ACOSH = new Primitive1("acosh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return acosh(arg);
        }
    };

    private static LispObject acosh(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(acosh(((Complex)arg).getRealPart()),
                                           im);
        }
        LispObject n1 = arg.add(Fixnum.ONE);
        n1 = n1.divideBy(Fixnum.TWO);
        n1 = sqrt(n1);
        LispObject n2 = arg.subtract(Fixnum.ONE);
        n2 = n2.divideBy(Fixnum.TWO);
        n2 = sqrt(n2);
        LispObject result = n1.add(n2);
        result = log(result);
        result = result.multiplyBy(Fixnum.TWO);
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    // ### atanh
    private static final Primitive1 ATANH = new Primitive1("atanh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return atanh(arg);
        }
    };

    private static LispObject atanh(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof Complex) {
            LispObject im = ((Complex)arg).getImaginaryPart();
            if (im.zerop())
                return Complex.getInstance(atanh(((Complex)arg).getRealPart()),
                                           im);
        }
        LispObject n1 = log(Fixnum.ONE.add(arg));
        LispObject n2 = log(Fixnum.ONE.subtract(arg));
        LispObject result = n1.subtract(n2);
        result = result.divideBy(Fixnum.TWO);
        if (result instanceof Complex) {
            if (arg instanceof Complex)
                return result;
            LispObject im = ((Complex)result).getImaginaryPart();
            if (im.zerop())
                return ((Complex)result).getRealPart();
        }
        return result;
    }

    // ### exp
    private static final Primitive1 EXP = new Primitive1("exp", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return exp(arg);
        }
    };

    private static LispObject exp(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof LispFloat)
            return new LispFloat(Math.exp(((LispFloat)arg).value));
        if (arg.realp())
            return new LispFloat(Math.exp(LispFloat.coerceToFloat(arg).value));
        if (arg instanceof Complex) {
            Complex argc = (Complex)arg;
            double re = LispFloat.coerceToFloat(argc.getRealPart()).getValue();
            double im = LispFloat.coerceToFloat(argc.getImaginaryPart()).getValue();
            LispFloat resX = new LispFloat(Math.exp(re) * Math.cos(im));
            LispFloat resY = new LispFloat(Math.exp(re) * Math.sin(im));
            return Complex.getInstance(resX, resY);
        }
        return signal(new TypeError(arg, Symbol.NUMBER));
    }

    // ### sqrt
    private static final Primitive1 SQRT = new Primitive1("sqrt", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return sqrt(arg);
        }
    };

    private static final LispObject sqrt(LispObject obj) throws ConditionThrowable
    {
        if (obj.realp() && !obj.minusp()) {  // returning real
            LispFloat f = LispFloat.coerceToFloat(obj);
            return new LispFloat(Math.sqrt(f.getValue()));
        } else {  // returning Complex
            if (obj.realp()) {
                return Complex.getInstance(new LispFloat(0),
                                           sqrt(Fixnum.ZERO.subtract(obj)));
            } else if (obj instanceof Complex) {
                return exp(log(obj).divideBy(Fixnum.TWO));
            }
        }
        signal(new TypeError(obj, "number"));
        return NIL;
    }

    // ### log
    private static final Primitive LOG = new Primitive("log", "number &optional base")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return log(arg);
        }
        public LispObject execute(LispObject number, LispObject base)
            throws ConditionThrowable
        {
            return log(number).divideBy(log(base));
        }
    };

    private static final LispObject log(LispObject obj) throws ConditionThrowable
    {
        if (obj.realp() && !obj.minusp()) {  // real value
            if (obj instanceof Fixnum)
                return new LispFloat(Math.log(((Fixnum)obj).getValue()));
            if (obj instanceof Bignum)
                return new LispFloat(Math.log(((Bignum)obj).floatValue()));
            if (obj instanceof Ratio)
                return new LispFloat(Math.log(((Ratio)obj).floatValue()));
            if (obj instanceof LispFloat)
                return new LispFloat(Math.log(((LispFloat)obj).getValue()));
        } else { // returning Complex
            LispFloat re, im, phase, abs;
            if (obj.realp() && obj.minusp()) {
                re = LispFloat.coerceToFloat(obj);
                abs = new LispFloat(Math.abs(re.getValue()));
                phase = new LispFloat(Math.PI);
                return Complex.getInstance(new LispFloat(Math.log(abs.getValue())), phase);
            } else if (obj instanceof Complex) {
                re = LispFloat.coerceToFloat(((Complex)obj).getRealPart());
                im = LispFloat.coerceToFloat(((Complex)obj).getImaginaryPart());
                phase = new LispFloat(Math.atan2(im.getValue(), re.getValue()));  // atan(y/x)
                abs = (LispFloat)((Complex)obj).ABS();
                return Complex.getInstance(new LispFloat(Math.log(abs.getValue())), phase);
            }
        }
        signal(new TypeError(obj, "number"));
        return NIL;
    }
}

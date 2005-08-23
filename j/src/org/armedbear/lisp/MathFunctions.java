/*
 * Math.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: MathFunctions.java,v 1.22 2005-08-23 20:49:00 piso Exp $
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
    private static final Primitive SIN = new Primitive("sin", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return sin(arg);
        }
    };

    private static LispObject sin(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof DoubleFloat)
            return new DoubleFloat(Math.sin(((DoubleFloat)arg).value));
        if (arg.realp())
            return new SingleFloat((float)Math.sin(SingleFloat.coerceToFloat(arg).value));
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
    private static final Primitive COS = new Primitive("cos", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return cos(arg);
        }
    };

    private static LispObject cos(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof DoubleFloat)
            return new DoubleFloat(Math.cos(((DoubleFloat)arg).value));
        if (arg.realp())
            return new SingleFloat((float)Math.cos(SingleFloat.coerceToFloat(arg).value));
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
    private static final Primitive TAN = new Primitive("tan", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof DoubleFloat)
                return new DoubleFloat(Math.tan(((DoubleFloat)arg).value));
            if (arg.realp())
                return new SingleFloat((float)Math.tan(SingleFloat.coerceToFloat(arg).value));
            return sin(arg).divideBy(cos(arg));
        }
    };

    // ### asin
    private static final Primitive ASIN = new Primitive("asin", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return asin(arg);
        }
    };

    private static LispObject asin(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof SingleFloat) {
            float f = ((SingleFloat)arg).value;
            if (Math.abs(f) <= 1)
                return new SingleFloat((float)Math.asin(f));
        }
        if (arg instanceof DoubleFloat) {
            double d = ((DoubleFloat)arg).value;
            if (Math.abs(d) <= 1)
                return new DoubleFloat(Math.asin(d));
        }
        LispObject result = arg.multiplyBy(arg);
        result = Fixnum.ONE.subtract(result);
        result = sqrt(result);
        LispObject n = Complex.getInstance(Fixnum.ZERO, Fixnum.ONE);
        n = n.multiplyBy(arg);
        result = n.add(result);
        result = log(result);
        result = result.multiplyBy(Complex.getInstance(Fixnum.ZERO,
                                                       Fixnum.MINUS_ONE));
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
    private static final Primitive ACOS = new Primitive("acos", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return acos(arg);
        }
    };

    private static LispObject acos(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof DoubleFloat) {
            double d = ((DoubleFloat)arg).value;
            if (Math.abs(d) <= 1)
                return new DoubleFloat(Math.acos(d));
        }
        if (arg instanceof SingleFloat) {
            float f = ((SingleFloat)arg).value;
            if (Math.abs(f) <= 1)
                return new SingleFloat((float)Math.acos(f));
        }
        LispObject result = new DoubleFloat(Math.PI/2);
        if (!(arg instanceof DoubleFloat))
            result = new SingleFloat((float)((DoubleFloat)result).value);
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
            if (arg.numberp())
                return atan(arg);
            return signal(new TypeError(arg, Symbol.NUMBER));
        }
        // "If both number1 and number2 are supplied for atan, the result is
        // the arc tangent of number1/number2."
        // y = +0     x = +0       +0
        // y = -0     x = +0       -0
        // y = +0     x = -0       +<PI>
        // y = -0     x = -0       -<PI>
        public LispObject execute(LispObject first, LispObject second)
            throws ConditionThrowable
        {
            if (!first.realp())
                return signalTypeError(first, Symbol.REAL);
            if (!second.realp())
                return signalTypeError(second, Symbol.REAL);
            if (first.floatp() && second.floatp()) {
                if (first.zerop() && second.zerop()) {
                    int sign1, sign2;
                    if (first instanceof SingleFloat) {
                        int bits = Float.floatToRawIntBits(((SingleFloat)first).value);
                        sign1 = ((bits & 0x80000000) == 0) ? 1 : -1;
                    } else {
                        long bits = Double.doubleToRawLongBits(((DoubleFloat)first).value);
                        sign1 = ((bits & 0x8000000000000000L) == 0) ? 1 : -1;
                    }
                    if (second instanceof SingleFloat) {
                        int bits = Float.floatToRawIntBits(((SingleFloat)second).value);
                        sign2 = ((bits & 0x80000000) == 0) ? 1 : -1;
                    } else {
                        long bits = Double.doubleToRawLongBits(((DoubleFloat)second).value);
                        sign2 = ((bits & 0x8000000000000000L) == 0) ? 1 : -1;
                    }
                    double result;
                    if (sign1 > 0) {
                        if (sign2 > 0)
                            result = 0.0;
                        else
                            result = -0.0;
                    } else {
                        if (sign2 < 0)
                            result = - Math.PI;
                        else
                            result = Math.PI;
                    }
                    if (first instanceof DoubleFloat || second instanceof DoubleFloat)
                        return new DoubleFloat(result);
                    else
                        return new SingleFloat((float)result);
                }
            }
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
        if (arg instanceof DoubleFloat)
            return new DoubleFloat(Math.atan(((DoubleFloat)arg).value));
        return new SingleFloat((float)Math.atan(SingleFloat.coerceToFloat(arg).value));
    }

    // ### sinh
    private static final Primitive SINH = new Primitive("sinh", "number")
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
        if (isJava15) {
            if (arg instanceof SingleFloat) {
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
                        args[0] = new Double(((SingleFloat)arg).value);
                        Double d = (Double) sinhMethod.invoke(null, args);
                        return new SingleFloat((float)d.doubleValue());
                    }
                }
                catch (Throwable t) {
                    Debug.trace(t);
                    // Fall through...
                }
            } else if (arg instanceof DoubleFloat) {
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
                        args[0] = new Double(((DoubleFloat)arg).value);
                        Double d = (Double) sinhMethod.invoke(null, args);
                        return new DoubleFloat(d.doubleValue());
                    }
                }
                catch (Throwable t) {
                    Debug.trace(t);
                    // Fall through...
                }
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
    private static final Primitive COSH = new Primitive("cosh", "number")
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
        if (isJava15) {
            if (arg instanceof SingleFloat) {
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
                        args[0] = new Double(((SingleFloat)arg).value);
                        Double d = (Double) coshMethod.invoke(null, args);
                        return new SingleFloat((float)d.doubleValue());
                    }
                }
                catch (Throwable t) {
                    Debug.trace(t);
                    // Fall through...
                }
            } else if (arg instanceof DoubleFloat) {
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
                        args[0] = new Double(((DoubleFloat)arg).value);
                        Double d = (Double) coshMethod.invoke(null, args);
                        return new DoubleFloat(d.doubleValue());
                    }
                }
                catch (Throwable t) {
                    Debug.trace(t);
                    // Fall through...
                }
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
    private static final Primitive TANH = new Primitive("tanh", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (isJava15) {
                if (arg instanceof SingleFloat) {
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
                            args[0] = new Double(((SingleFloat)arg).value);
                            Double d = (Double) tanhMethod.invoke(null, args);
                            return new SingleFloat((float)d.doubleValue());
                        }
                    }
                    catch (Throwable t) {
                        Debug.trace(t);
                        // Fall through...
                    }
                } else if (arg instanceof DoubleFloat) {
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
                            args[0] = new Double(((DoubleFloat)arg).value);
                            Double d = (Double) tanhMethod.invoke(null, args);
                            return new DoubleFloat(d.doubleValue());
                        }
                    }
                    catch (Throwable t) {
                        Debug.trace(t);
                        // Fall through...
                    }
                }
            }
            return sinh(arg).divideBy(cosh(arg));
        }
    };

    // ### asinh
    private static final Primitive ASINH = new Primitive("asinh", "number")
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
    private static final Primitive ACOSH = new Primitive("acosh", "number")
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
    private static final Primitive ATANH = new Primitive("atanh", "number")
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

    // ### cis
    private static final Primitive CIS = new Primitive("cis", "radians")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return cis(arg);
        }
    };

    private static LispObject cis(LispObject arg) throws ConditionThrowable
    {
        if (arg.realp())
            return Complex.getInstance(cos(arg), sin(arg));
        return signal(new TypeError(arg, Symbol.REAL));
    }

    // ### exp
    private static final Primitive EXP = new Primitive("exp", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return exp(arg);
        }
    };

    private static LispObject exp(LispObject arg) throws ConditionThrowable
    {
        if (arg instanceof DoubleFloat)
            return new DoubleFloat(Math.pow(Math.E, ((DoubleFloat)arg).value));
        if (arg.realp())
            return new SingleFloat((float)Math.pow(Math.E, SingleFloat.coerceToFloat(arg).value));
        if (arg instanceof Complex) {
            Complex c = (Complex) arg;
            return exp(c.getRealPart()).multiplyBy(cis(c.getImaginaryPart()));
        }
        return signal(new TypeError(arg, Symbol.NUMBER));
    }

    // ### sqrt
    private static final Primitive SQRT = new Primitive("sqrt", "number")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            return sqrt(arg);
        }
    };

    private static final LispObject sqrt(LispObject obj) throws ConditionThrowable
    {
        if (obj instanceof DoubleFloat) {
            if (obj.minusp())
                return Complex.getInstance(new DoubleFloat(0),
                                           sqrt(Fixnum.ZERO.subtract(obj)));
            return new DoubleFloat(Math.sqrt(DoubleFloat.coerceToFloat(obj).value));
        }
        if (obj.realp()) {
            if (obj.minusp())
                return Complex.getInstance(new SingleFloat(0),
                                           sqrt(Fixnum.ZERO.subtract(obj)));
            return new SingleFloat((float)Math.sqrt(SingleFloat.coerceToFloat(obj).value));
        }
        if (obj instanceof Complex)
            return exp(log(obj).divideBy(Fixnum.TWO));
        return signal(new TypeError(obj, Symbol.NUMBER));
    }

    // ### log
    private static final Primitive LOG =
        new Primitive("log", "number &optional base")
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
                return new SingleFloat((float)Math.log(((Fixnum)obj).value));
            if (obj instanceof Bignum)
                return new SingleFloat((float)Math.log(((Bignum)obj).doubleValue()));
            if (obj instanceof Ratio)
                return new SingleFloat((float)Math.log(((Ratio)obj).doubleValue()));
            if (obj instanceof SingleFloat)
                return new SingleFloat((float)Math.log(((SingleFloat)obj).value));
            if (obj instanceof DoubleFloat)
                return new DoubleFloat(Math.log(((DoubleFloat)obj).value));
        } else { // returning Complex
            if (obj.realp() && obj.minusp()) {
                if (obj instanceof DoubleFloat) {
                    DoubleFloat re = DoubleFloat.coerceToFloat(obj);
                    DoubleFloat abs = new DoubleFloat(Math.abs(re.value));
                    DoubleFloat phase = new DoubleFloat(Math.PI);
                    return Complex.getInstance(new DoubleFloat(Math.log(abs.getValue())), phase);
                } else {
                    SingleFloat re = SingleFloat.coerceToFloat(obj);
                    SingleFloat abs = new SingleFloat(Math.abs(re.value));
                    SingleFloat phase = new SingleFloat((float)Math.PI);
                    return Complex.getInstance(new SingleFloat((float)Math.log(abs.value)), phase);
                }
            } else if (obj instanceof Complex) {
                if (((Complex)obj).getRealPart() instanceof DoubleFloat) {
                    DoubleFloat re = DoubleFloat.coerceToFloat(((Complex)obj).getRealPart());
                    DoubleFloat im = DoubleFloat.coerceToFloat(((Complex)obj).getImaginaryPart());
                    DoubleFloat phase =
                        new DoubleFloat(Math.atan2(im.getValue(), re.getValue()));  // atan(y/x)
                    DoubleFloat abs = (DoubleFloat)((Complex)obj).ABS();
                    return Complex.getInstance(new DoubleFloat(Math.log(abs.getValue())), phase);
                } else {
                    SingleFloat re = SingleFloat.coerceToFloat(((Complex)obj).getRealPart());
                    SingleFloat im = SingleFloat.coerceToFloat(((Complex)obj).getImaginaryPart());
                    SingleFloat phase =
                        new SingleFloat((float)Math.atan2(im.value, re.value));  // atan(y/x)
                    SingleFloat abs = (SingleFloat)((Complex)obj).ABS();
                    return Complex.getInstance(new SingleFloat((float)Math.log(abs.value)), phase);
                }
            }
        }
        signal(new TypeError(obj, Symbol.NUMBER));
        return NIL;
    }

    // ### expt base-number power-number => result
    public static final Primitive EXPT =
        new Primitive("expt", "base-number power-number")
    {
        public LispObject execute(LispObject base, LispObject power)
            throws ConditionThrowable
        {
            if (power.zerop()) {
                if (power instanceof Fixnum) {
                    if (base instanceof SingleFloat)
                        return SingleFloat.ONE;
                    if (base instanceof DoubleFloat)
                        return DoubleFloat.ONE;
                    if (base instanceof Complex) {
                        if (((Complex)base).getRealPart() instanceof SingleFloat)
                            return Complex.getInstance(SingleFloat.ONE,
                                                       SingleFloat.ZERO);
                        if (((Complex)base).getRealPart() instanceof DoubleFloat)
                            return Complex.getInstance(DoubleFloat.ONE,
                                                       DoubleFloat.ZERO);
                    }
                    return Fixnum.ONE;
                }
                if (power instanceof DoubleFloat)
                    return DoubleFloat.ONE;
                if (base instanceof DoubleFloat)
                    return DoubleFloat.ONE;
                return SingleFloat.ONE;
            }
            if (power instanceof Fixnum) {
                if (base.rationalp())
                    return intexp(base, power);
                LispObject result;
                if (base instanceof SingleFloat)
                    result = SingleFloat.ONE;
                else if (base instanceof DoubleFloat)
                    result = DoubleFloat.ONE;
                else
                    result = Fixnum.ONE;
                int pow = ((Fixnum)power).value;
                if (pow > 0) {
                    for (int i = pow; i-- > 0;)
                        result = result.multiplyBy(base);
                } else if (pow < 0) {
                    for (int i = -pow; i-- > 0;)
                        result = result.divideBy(base);
                }
                return result;
            }
            if (base instanceof Complex || power instanceof Complex) {
                if (base.zerop() && ((Complex)power).getRealPart().plusp()) {
                    return base.multiplyBy(power);
                }
                return exp(power.multiplyBy(log(base)));
            }
            final double x; // base
            final double y; // power
            if (base instanceof Fixnum)
                x = ((Fixnum)base).value;
            else if (base instanceof Ratio)
                x = ((Ratio)base).doubleValue();
            else if (base instanceof SingleFloat)
                x = ((SingleFloat)base).value;
            else if (base instanceof DoubleFloat)
                x = ((DoubleFloat)base).value;
            else
                return signal(new LispError("EXPT: unsupported case: base is of type " +
                                            base.typeOf().writeToString()));
            if (power instanceof Ratio)
                y = ((Ratio)power).doubleValue();
            else if (power instanceof SingleFloat)
                y = ((SingleFloat)power).value;
            else if (power instanceof DoubleFloat)
                y = ((DoubleFloat)power).value;
            else
                return signal(new LispError("EXPT: unsupported case: power is of type " +
                                            power.typeOf().writeToString()));
            double r = Math.pow(x, y);
            if (Double.isNaN(r)) {
                if (x < 0) {
                    r = Math.pow(-x, y);
                    double realPart = r * Math.cos(y * Math.PI);
                    double imagPart = r * Math.sin(y * Math.PI);
                    if (base instanceof DoubleFloat || power instanceof DoubleFloat)
                        return Complex.getInstance(new DoubleFloat(realPart),
                                                   new DoubleFloat(imagPart));
                    else
                        return Complex.getInstance(new SingleFloat((float)realPart),
                                                   new SingleFloat((float)imagPart));
                }
            }
            if (base instanceof DoubleFloat || power instanceof DoubleFloat)
                return new DoubleFloat(r);
            else
                return new SingleFloat((float)r);
        }
    };

    // Adapted from SBCL.
    private static final LispObject intexp(LispObject base, LispObject power)
        throws ConditionThrowable
    {
        if (power.minusp()) {
            power = Fixnum.ZERO.subtract(power);
            return Fixnum.ONE.divideBy(intexp(base, power));
        }
        if (base.eql(Fixnum.TWO))
            return Fixnum.ONE.ash(power);
        LispObject nextn = power.ash(Fixnum.MINUS_ONE);
        LispObject total;
        if (power.oddp())
            total = base;
        else
            total = Fixnum.ONE;
        while (true) {
            if (nextn.zerop())
                return total;
            base = base.multiplyBy(base);
            power = nextn;
            nextn = power.ash(Fixnum.MINUS_ONE);
            if (power.oddp())
                total = base.multiplyBy(total);
        }
    }
}

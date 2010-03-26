package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;

import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;


import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.scripting.util.WriterOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LispObjectFactory {

	static public SubLObject makeBoolean(boolean b) {
		return b ? T : NIL;
	}

	static public SubLObject makeCharacter(char c) {
		return LispCharacter.makeChar(c);
	}
	
	static public SubLString makeString(String s) {
		return new SimpleString(s);
	}

	static public SubLString makeString(StringBuilder s) {
		return new SimpleString(s);
	}

	static public SubLString makeString(StringBuffer s) {
		return new SimpleString(s);
	}

	static public SubLString makeString(char s) {
		return new SimpleString(s);
	}

	static public SubLString makeString(char[] s) {
		return new SimpleString(s);
	}

	static public SubLString makeString(int s) {
		return new SimpleString(s);
	}

	public static SingleFloat makeFloat(float f) {
		return SingleFloat.makeFloat(f);
	}

	public static SingleFloat makeSingle(float f) {
		return SingleFloat.makeFloat(f);
	}

	public static DoubleFloat makeDouble(double f) {
		return DoubleFloat.makeDouble(f);
	}
	
	public static DoubleFloat makeDouble(char markerDorL, String f) {
		//0.000000000000000000000000000000000000000000001
		//0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000001
		double pdv = Double.parseDouble(f);
		BigDecimal db = new BigDecimal(f);
		if (pdv!=db.doubleValue() || db.precision()>62) {
			Debug.trace("precision loss " + f);
		}
		return DoubleFloat.makeDouble(Double.parseDouble(f));
	}

	public static SubLObject[] makeLispObjectArray(int f) {
		return new SubLObject[f];
	}

	public static SimpleVector makeSimpleVector(int l) {
		return new SimpleVector(l);
	}

	public static SimpleVector makeSimpleVector(SubLObject objs[]) {
		return new SimpleVector(objs);
	}

	public static SimpleVector makeSimpleVector(SubLObject obj) {
		return new SimpleVector(obj);
	}

	public static SubLCons makeCons(SubLObject car) {
		return SubLObjectFactory.makeCons(car, NIL);
	}

	public static SubLCons makeCons(SubLObject car, SubLObject cdr) {
		return SubLObjectFactory.makeCons(car, cdr);
	}

	public static SubLCons makeCons(String car, SubLObject cdr) {
		return SubLObjectFactory.makeCons(makeString(car), cdr);
	}

	public static Fixnum makeInteger(int n) {
		return (n >= 0 && n < Fixnum.MAX_POS_CACHE) ? Fixnum.constants[n] : new Fixnum(n);
	}

	public static LispInteger makeInteger(long l) {
		if (Integer.MIN_VALUE <= l && l <= Integer.MAX_VALUE)
			return makeInteger((int) l);
		else
			return LispObjectFactory.makeBignum(l);
	}

	//
	//  public static LispInteger getInstance(int i) {
	//      return LispObjectFactory.makeInteger(i);
	//  }

	public static LispInteger makeBignum(long l) {
		if (Integer.MIN_VALUE <= l && l <= Integer.MAX_VALUE)
			return makeInteger(l);
		else
			return new BigIntBignumImpl(BigInteger.valueOf(l));
	}

	public static LispInteger makeInteger(BigInteger n) {
		if (BigIntBignumImpl.MOST_NEGATIVE_FIXNUM.compareTo(n) < 0 || BigIntBignumImpl.MOST_POSITIVE_FIXNUM.compareTo(n) > 0)
			return new BigIntBignumImpl(n);
		else
			return makeInteger(n.intValue());
	}

	public static LispInteger makeInteger(String s, int radix) {
		BigInteger value = new BigInteger(s, radix);

		return makeInteger(value);
	}

	public static SubLObject makeComplex(SubLObject realpart, SubLObject imagpart)

	{
		if (!realpart.realp())
			return type_error(realpart, LispSymbols.REAL);
		if (!imagpart.realp())
			return type_error(imagpart, LispSymbols.REAL);
		if (realpart instanceof DoubleFloat)
			imagpart = DoubleFloat.coerceToFloat(imagpart);
		else if (imagpart instanceof DoubleFloat)
			realpart = DoubleFloat.coerceToFloat(realpart);
		else if (realpart instanceof SingleFloat)
			imagpart = SingleFloat.coerceToFloat(imagpart);
		else if (imagpart instanceof SingleFloat)
			realpart = SingleFloat.coerceToFloat(realpart);
		if (imagpart instanceof Fixnum) {
			if (((Fixnum) imagpart).value == 0)
				return realpart;
		}
		return new Complex(realpart, imagpart);
	}

	public static LispStream makeStream(SubLSymbol structureClass, InputStream stream, SubLObject elementType, boolean format) {
		return new Stream(structureClass, stream, elementType, format);
	}
	public static LispStream makeStream(SubLSymbol structureClass, OutputStream stream, SubLObject elementType, boolean format) {
		return new Stream(structureClass, stream, elementType, format);
	}
	public static LispStream makeStream(SubLSymbol structureClass, InputStream stream, SubLObject elementType, SubLObject format) {
		return new Stream(structureClass, stream, elementType, format);
	}
	public static LispStream makeStream(SubLSymbol structureClass, OutputStream stream, SubLObject elementType, SubLObject format) {
		return new Stream(structureClass, stream, elementType, format);
	}
	public static LispStream makeStream(SubLSymbol structureClass, InputStream stream, SubLObject elementType) {
		return new Stream(structureClass, stream, elementType);
	}
	public static LispStream makeStream(SubLSymbol structureClass, OutputStream stream, SubLObject elementType) {
		return new Stream(structureClass, stream, elementType);
	}
	
	public static SubLSymbol makeSymbol(SubLString name) {
		return new LispSymbolImpl(name);
	}
	public static SubLSymbol makeSymbol(String name) {
		return new LispSymbolImpl(name);
	}


}

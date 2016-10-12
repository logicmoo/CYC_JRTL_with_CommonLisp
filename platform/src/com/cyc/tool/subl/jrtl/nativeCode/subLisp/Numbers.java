
/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.math.BigInteger;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigIntBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Numbers extends SubLTrampolineFile {

	//// Constructors

	private static class AdditionDescription implements MultiArgMathFuncDesc {
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			return val1.add(val2);
		}

		public double getBinaryValue(double val1, double val2) {
			return val1 + val2;
		}

		public float getBinaryValue(float val1, float val2) {
			return val1 + val2;
		}

		public int getBinaryValue(int val1, int val2) {
			return val1 + val2;
		}

		public long getBinaryValue(long val1, long val2) {
			return val1 + val2;
		}

		public SubLObject getNoArgValue() {
			return CommonSymbols.ZERO_INTEGER;
		}

		public SubLObject getUnaryValue(SubLObject val) {
			return val;
		}
	}

	private static class BigIntMathFuncProcessingFunc implements MathFuncProcessingByType {
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			BigInteger firstArg = arg1.isBigIntegerBignum() ? ((SubLBigIntBignum) arg1).getBigInt()
					: new BigInteger(arg1.toString());
			BigInteger secondArg = arg2.isBigIntegerBignum() ? ((SubLBigIntBignum) arg2).getBigInt()
					: new BigInteger(arg2.toString());
			return SubLNumberFactory.makeInteger(mathFunc.getBinaryValue(firstArg, secondArg));
		}

		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			BigInteger result = args[0].isBigIntegerBignum() ? ((SubLBigIntBignum) args[0]).getBigInt()
					: new BigInteger(args[0].toString());
			for (int i = 1, size = args.length; i < size; i++)
				result = mathFunc.getBinaryValue(result, args[i].isBigIntegerBignum()
						? ((SubLBigIntBignum) args[i]).getBigInt() : new BigInteger(args[i].toString()));
			return SubLNumberFactory.makeInteger(result);
		}
	}

	static private class DecodedDouble {
		static private int decodeDoubleExponent(long longBits) {
			return (int) ((longBits & 0x7ff0000000000000L) >> 52);
		}

		static private long decodeDoubleMantissa(long longBits) {
			return longBits & 0x000fffffffffffffL;
		}

		static private int decodeDoubleSign(long longBits) {
			int signBit = (int) (longBits >> 63 & 1L);
			if (signBit == 0)
				return 1;
			else
				return -1;
		}

		public int sign;

		public int exponent;
		public long mantissa;

		public DecodedDouble(double value) {
			long longBits = Double.doubleToLongBits(value);
			this.sign = DecodedDouble.decodeDoubleSign(longBits);
			int rawExponent = DecodedDouble.decodeDoubleExponent(longBits);
			long rawMantissa = DecodedDouble.decodeDoubleMantissa(longBits);
			// see crtl's rtl/numbers.c for the details
			if (rawExponent > 0 && rawExponent < 2047) {
				this.exponent = rawExponent - 1023 - 52;
				this.mantissa = rawMantissa | 0x10000000000000L;
			} else if (rawExponent == 0) {
				if (rawMantissa != 0) {
					// denormalized number
					this.exponent = rawExponent - 1022 - 52;
					this.mantissa = rawMantissa;
				} else {
					this.exponent = 0;
					this.mantissa = 0;
				}
			} else
				throw new NumberFormatException();
		}
	}

	private static class DivisionDescription implements MultiArgMathFuncDesc {
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			if (val2.equals(BigInteger.ZERO))
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1.divide(val2);
		}

		public double getBinaryValue(double val1, double val2) {
			if (val2 == 0)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		public float getBinaryValue(float val1, float val2) {
			if (val2 == 0)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		public int getBinaryValue(int val1, int val2) {
			if (val2 == 0)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		public long getBinaryValue(long val1, long val2) {
			if (val2 == 0)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		public SubLObject getNoArgValue() {
			throw new InvalidSubLExpressionException("Error: / got 0 args, wanted at least 1 arg.");
		}

		public SubLObject getUnaryValue(SubLObject val) {
			return Numbers.invert(val);
		}
	}

	private static class DoubleMathFuncProcessingFunc implements MathFuncProcessingByType {
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			return SubLNumberFactory.makeDouble(mathFunc.getBinaryValue(arg1.doubleValue(), arg2.doubleValue()));
		}

		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			double result = args[0].doubleValue();
			for (int i = 1, size = args.length; i < size; i++)
				result = mathFunc.getBinaryValue(result, args[i].doubleValue());
			return SubLNumberFactory.makeDouble(result);
		}
	}

	private static class IntegerMathFuncProcessingFunc implements MathFuncProcessingByType {
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			return SubLNumberFactory.makeInteger(mathFunc.getBinaryValue(arg1.intValue(), arg2.intValue()));
		}

		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			int result = args[0].intValue();
			for (int i = 1, size = args.length; i < size; i++)
				result = mathFunc.getBinaryValue(result, args[i].intValue());
			return SubLNumberFactory.makeInteger(result);
		}
	}

	private static class LongMathFuncProcessingFunc implements MathFuncProcessingByType {
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			return SubLNumberFactory.makeInteger(mathFunc.getBinaryValue(arg1.longValue(), arg2.longValue()));
		}

		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			long result = args[0].longValue();
			for (int i = 1, size = args.length; i < size; i++)
				result = mathFunc.getBinaryValue(result, args[i].longValue());
			return SubLNumberFactory.makeInteger(result);
		}
	}

	private static interface MathFuncProcessingByType {
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc);

		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc);
	}

	private static interface MultiArgMathFuncDesc {
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2);

		public double getBinaryValue(double val1, double val2);

		public float getBinaryValue(float val1, float val2);

		public int getBinaryValue(int val1, int val2);

		public long getBinaryValue(long val1, long val2);

		public SubLObject getNoArgValue();

		public SubLObject getUnaryValue(SubLObject val);
	}

	private static class MultiplicationDescription implements MultiArgMathFuncDesc {
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			return val1.multiply(val2);
		}

		public double getBinaryValue(double val1, double val2) {
			return val1 * val2;
		}

		public float getBinaryValue(float val1, float val2) {
			return val1 * val2;
		}

		public int getBinaryValue(int val1, int val2) {
			return val1 * val2;
		}

		public long getBinaryValue(long val1, long val2) {
			return val1 * val2;
		}

		public SubLObject getNoArgValue() {
			return CommonSymbols.ONE_INTEGER;
		}

		public SubLObject getUnaryValue(SubLObject val) {
			return val;
		}
	}

	private static class SubtractionDescription implements MultiArgMathFuncDesc {
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			return val1.subtract(val2);
		}

		public double getBinaryValue(double val1, double val2) {
			return val1 - val2;
		}

		public float getBinaryValue(float val1, float val2) {
			return val1 - val2;
		}

		public int getBinaryValue(int val1, int val2) {
			return val1 - val2;
		}

		public long getBinaryValue(long val1, long val2) {
			return val1 - val2;
		}

		public SubLObject getNoArgValue() {
			throw new InvalidSubLExpressionException("Error: - got 0 args, wanted at least 1 arg.");
		}

		public SubLObject getUnaryValue(SubLObject val) {
			return Numbers.minus(val);
		}
	}

	public static Numbers me = new Numbers();
	//// Public Area
	public static SubLSymbol $double_float_minimum_exponent$;
	public static SubLSymbol $exp1$;
	public static SubLSymbol $most_negative_fixnum$;
	public static SubLSymbol $most_positive_fixnum$;
	public static SubLSymbol $boole_1$;
	public static SubLSymbol $boole_2$;
	public static SubLSymbol $boole_and$;
	public static SubLSymbol $boole_andc1$;
	public static SubLSymbol $boole_andc2$;
	public static SubLSymbol $boole_c1$;

	public static SubLSymbol $boole_c2$;
	public static SubLSymbol $boole_clr$;

	public static SubLSymbol $boole_eqv$;
	public static SubLSymbol $boole_ior$;

	public static SubLSymbol $boole_nand$;

	public static SubLSymbol $boole_nor$;

	public static SubLSymbol $boole_orc1$;

	public static SubLSymbol $boole_orc2$;

	public static SubLSymbol $boole_set$;

	public static SubLSymbol $boole_xor$;

	public static SubLFloat E_FLOAT = SubLObjectFactory.makeDouble(Math.E);

	public static SubLSymbol $e$;

	public static SubLFloat PI_FLOAT = SubLObjectFactory.makeDouble(Math.PI);

	public static SubLSymbol $pi$;

	//private static SubLObject RET_T = CommonSymbols.T;

	public static SubLInteger FLOAT_DIGITS = SubLNumberFactory.makeInteger(53);

	public static SubLDoubleFloat ZERO_FLOAT = SubLNumberFactory.makeDouble(0.0);

	private static SubLFixnum MINUS_EIGHT_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(-8);

	private static long[] INTEGER_LENGTH_TABLE = { 0L, // = integer-length 0
			1L, // = integer-length 1
			2L, // = integer-length 2
			4L, // = integer-length 3
			8L, // = integer-length 4
			16L, // = integer-length 5
			32L, // = integer-length 6
			64L, // = integer-length 7
			128L, // = integer-length 8
			256L, // = integer-length 9
			512L, // = integer-length 10
			1024L, // = integer-length 11
			2048L, // = integer-length 12
			4096L, // = integer-length 13
			8192L, // = integer-length 14
			16384L, // = integer-length 15
			32768L, // = integer-length 16
			65536L, // = integer-length 17
			131072L, // = integer-length 18
			262144L, // = integer-length 19
			524288L, // = integer-length 20
			1048576L, // = integer-length 21
			2097152L, // = integer-length 22
			4194304L, // = integer-length 23
			8388608L, // = integer-length 24
			16777216L, // = integer-length 25
			33554432L, // = integer-length 26
			67108864L, // = integer-length 27
			134217728L, // = integer-length 28
			268435456L, // = integer-length 29
			536870912L, // = integer-length 30
			1073741824L, // = integer-length 31
			2147483648L, // = integer-length 32
			4294967296L, // = integer-length 33
			8589934592L, // = integer-length 34
			17179869184L, // = integer-length 35
			34359738368L, // = integer-length 36
			68719476736L, // = integer-length 37
			137438953472L, // = integer-length 38
			274877906944L, // = integer-length 39
			549755813888L, // = integer-length 40
			1099511627776L, // = integer-length 41
			2199023255552L, // = integer-length 42
			4398046511104L, // = integer-length 43
			8796093022208L, // = integer-length 44
			17592186044416L, // = integer-length 45
			35184372088832L, // = integer-length 46
			70368744177664L, // = integer-length 47
			140737488355328L, // = integer-length 48
			281474976710656L, // = integer-length 49
			562949953421312L, // = integer-length 50
			1125899906842624L, // = integer-length 51
			2251799813685248L, // = integer-length 52
			4503599627370496L, // = integer-length 53
			9007199254740992L, // = integer-length 54
			18014398509481984L, // = integer-length 55
			36028797018963968L, // = integer-length 56
			72057594037927936L, // = integer-length 57
			144115188075855872L, // = integer-length 58
			288230376151711744L, // = integer-length 59
			576460752303423488L, // = integer-length 60
			1152921504606846976L, // = integer-length 61
			2305843009213693952L, // = integer-length 62
			4611686018427387904L // = integer-length 63
	};

	private static int INTEGER_TYPE_CONST = 0;

	private static int LONG_INTEGER_TYPE_CONST = 1;

	private static int BIG_INTEGER_TYPE_CONST = 2;

	private static int DOUBLE_FLOAT_TYPE_CONST = 3;

	private static int INVALID_NUMBER_TYPE_CONST = 4;

	private static MathFuncProcessingByType[] funcProcessing = { new IntegerMathFuncProcessingFunc(),
			new LongMathFuncProcessingFunc(), new BigIntMathFuncProcessingFunc(), new DoubleMathFuncProcessingFunc() };

	private static MathFuncProcessingByType INTEGER_PROCESSING_FUNC = Numbers.funcProcessing[0];

	private static MathFuncProcessingByType LONG_PROCESSING_FUNC = Numbers.funcProcessing[1];

	private static MathFuncProcessingByType BIGINT_PROCESSING_FUNC = Numbers.funcProcessing[2];

	private static MathFuncProcessingByType DOUBLE_PROCESSING_FUNC = Numbers.funcProcessing[3];

	private static MultiArgMathFuncDesc additionDesc = new AdditionDescription();

	private static MultiArgMathFuncDesc subtractionDesc = new SubtractionDescription();

	private static MultiArgMathFuncDesc multiplicationDesc = new MultiplicationDescription();

	private static MultiArgMathFuncDesc divisionDesc = new DivisionDescription();

	public static SubLObject abs(SubLObject num) {
		return num.toNumber().abs();
	}

	public static SubLObject acos(SubLObject number) {
		return SubLNumberFactory.makeDouble(Math.acos(number.doubleValue()));
	}

	public static SubLObject add(SubLObject num1, SubLObject num2) {
		return num1.add(num2);
	}

	public static SubLObject add(SubLObject num1, SubLObject num2, SubLObject num3) {
		return num1.add(num2).add(num3);
	}

	public static SubLObject add(SubLObject[] args) {
		return Numbers.processMultiArgMathFunction(args, Numbers.additionDesc);
	}

	public static SubLObject ash(SubLObject integer, SubLObject count) {
		// @hack does not deal with overflow/underflow correctly
		if (integer == CommonSymbols.ZERO_INTEGER)
			return CommonSymbols.ZERO_INTEGER;
		if (count.isLongBignum() || count.isBigIntegerBignum())
			Errors.unimplementedMethod("ASH with a shift count > 32 bits.");
		int countInt = count.intValue();
		int maxBits = Math.abs(countInt) + Math.abs(Numbers.integer_length(integer).intValue());
		if (maxBits > 63) {
			BigInteger bigIntger = integer.bigIntegerValue();

			BigInteger result = null;
			if (countInt >= 0)
				result = bigIntger.shiftLeft(countInt);
			else
				result = bigIntger.shiftRight(-countInt);
			return SubLNumberFactory.makeInteger(result);
		}
		long integerTyped = integer.longValue();
		long countTyped = count.longValue();
		long shiftAmount = Math.abs(countTyped);
		long result = integerTyped;
		if (countTyped > 0)
			result = integerTyped << shiftAmount;
		else if (countTyped < 0)
			result = integerTyped >> shiftAmount;
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject asin(SubLObject number) {
		return SubLNumberFactory.makeDouble(Math.asin(number.doubleValue()));
	}

	public static SubLObject assemble_fixnums_to_integer(SubLObject sign, SubLObject[] fixnums) {
		if (fixnums.length == 0)
			return SubLNumberFactory.makeInteger(0);
		int signTyped = Numbers.minusp(sign) == CommonSymbols.T ? -1 : 1;
		// optimize for intermediate cases
		if (fixnums.length < 8) {
			// @note since Java is signed, and the fixnums[] represent unsigned
			// bytes,
			// fixnums.length=8 will only fit iff fixnums[7] < 128
			// too complicated to check, so pick what will definitely fit into a
			// long
			long value = 0L;
			for (int i = fixnums.length - 1; i >= 0; i--) {
				SubLObject fixnum = fixnums[i];
				SubLFixnum fixnumTyped = (SubLFixnum) fixnum;
				int fixnumValue = fixnumTyped.intValue();
				int byteValue = fixnumValue & 0xFF;
				long shiftedValue = value << 8L;
				value = byteValue + shiftedValue;
			}
			long result = signTyped < 0 ? -value : value;
			return SubLNumberFactory.makeInteger(result);
		} else {
			// default case
			byte[] magnitude = new byte[fixnums.length];
			for (int i = fixnums.length - 1; i >= 0; i--) {
				SubLObject fixnum = fixnums[i];
				SubLFixnum fixnumTyped = (SubLFixnum) fixnum;
				int fixnumValue = fixnumTyped.intValue();
				int unsignedByteValue = fixnumValue & 0xFF;
				byte signedByteValue = (byte) unsignedByteValue;
				magnitude[fixnums.length - 1 - i] = signedByteValue;
			}
			BigInteger integer = new BigInteger(signTyped, magnitude);
			return SubLNumberFactory.makeInteger(integer);
		}
	}

	public static SubLObject atan(SubLObject number1, SubLObject number2) {
		if (number2 == CommonSymbols.NIL || number2 == CommonSymbols.UNPROVIDED)
			return SubLNumberFactory.makeDouble(Math.atan(number1.doubleValue()));
		else
			return SubLNumberFactory.makeDouble(Math.atan2(number1.doubleValue(), number2.doubleValue()));
	}

	public static SubLObject boole(SubLObject op, SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.boole()");
	}

	public static SubLObject ceiling(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		int signNum = num.isNegative() ? -1 : 1;
		int signDivisor = divisor.isNegative() ? -1 : 1;
		SubLObject quotient = Numbers.truncate(num, divisor);
		SubLObject remainder = Values.secondMultipleValue();
		if (signDivisor == signNum && !remainder.isZero()) {
			quotient = quotient.add(CommonSymbols.ONE_INTEGER);
			remainder = remainder.sub(divisor);
		}
		return Values.values(quotient, remainder);
	}

	public static SubLNumber convertNumberToSubLObject(BigInteger num) {
		return SubLNumberFactory.makeInteger(num);
	}

	public static SubLNumber convertNumberToSubLObject(double num) {
		return SubLNumberFactory.makeDouble(num);
	}

	public static SubLNumber convertNumberToSubLObject(float num) {
		return SubLNumberFactory.makeDouble(num);
	}

	public static SubLNumber convertNumberToSubLObject(int num) {
		return SubLNumberFactory.makeInteger(num);
	}

	public static SubLNumber convertNumberToSubLObject(long num) {
		return SubLNumberFactory.makeInteger(num);
	}

	public static SubLObject cos(SubLObject radians) {
		return SubLNumberFactory.makeDouble(Math.cos(radians.doubleValue()));
	}

	public static SubLObject decode_float(SubLObject v_float) {
		return Errors.unimplementedMethod("Numbers.decode_float()");
	}

	public static SubLObject disassemble_integer_to_fixnums(SubLObject integer) {
		if (!integer.isInteger())
			Errors.error("Expected an integer instead got: " + integer);
		SubLObject sign = CommonSymbols.ONE_INTEGER;
		if (CommonSymbols.NIL != Numbers.minusp(integer)) {
			sign = CommonSymbols.MINUS_ONE_INTEGER;
			integer = Numbers.abs(integer);
		}
		return ConsesLow.cons(sign, Numbers.disassemble_integer_to_fixnums_recursive(integer));
	}

	private static SubLObject disassemble_integer_to_fixnums_recursive(SubLObject integer) {
		if (CommonSymbols.NIL != Numbers.numE(integer, CommonSymbols.ZERO_INTEGER))
			return CommonSymbols.NIL;
		else {
			SubLObject least_significant_fixnum = bytes
					.ldb(bytes.sublisp_byte(CommonSymbols.EIGHT_INTEGER, CommonSymbols.ZERO_INTEGER), integer);
			SubLObject recursive_answer = Numbers
					.disassemble_integer_to_fixnums_recursive(Numbers.ash(integer, Numbers.MINUS_EIGHT_INTEGER));
			return ConsesLow.cons(least_significant_fixnum, recursive_answer);
		}
	}

	public static SubLObject divide(SubLObject numerator, SubLObject denominator) {
		if (numerator.isFixnum() && denominator.isFixnum()) {
			if (denominator == CommonSymbols.ZERO_INTEGER)
				Errors.error("Attempt to divide " + numerator + " by 0.");
			double result = numerator.doubleValue() / denominator.doubleValue();
			if (result == Math.round(result))
				return SubLNumberFactory.makeInteger((long) result);
			return SubLNumberFactory.makeDouble(result);
		}
		if (denominator.equals(CommonSymbols.ZERO_INTEGER) || denominator.equals(Numbers.ZERO_FLOAT)
				|| denominator.equals(CommonSymbols.ZERO_DOUBLE))
			Errors.error("Attempt to divide " + numerator + " by 0.");
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize2;
		args[0] = numerator;
		args[1] = denominator;
		return Numbers.divide(args);
	}

	public static SubLObject divide(SubLObject num, SubLObject[] numbers) {
		return Errors.unimplementedMethod("Numbers.divide()");
	}

	public static SubLObject divide(SubLObject[] args) {
		if (args.length == 0)
			Errors.error("Unexpected call to divide with 0 arguments.");
		if (args.length == 1)
			return Numbers.divide(CommonSymbols.ONE_INTEGER, args[0]);
		if (args[0].isFixnum() && args[1].isFixnum()) {
			SubLObject numerator = args[0];
			SubLObject denominator = args[1];
			if (denominator == CommonSymbols.ZERO_INTEGER)
				Errors.error("Illegal attempt to divide by 0.");
			double result = numerator.doubleValue() / denominator.doubleValue();
			if (result == Math.round(result))
				return SubLNumberFactory.makeInteger((long) result);
			return SubLNumberFactory.makeDouble(result);
		}
		return Numbers.processMultiArgMathFunction(args, Numbers.divisionDesc);
	}

	public static SubLObject evenp(SubLObject num) {
		return num.toInteger().isEven() ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject exp(SubLObject number) {
		return Numbers.expt(Numbers.$e$.getGlobalValue(), number);
	}

	public static SubLObject expt(SubLObject base, SubLObject power) {
		if (base.isInteger() && power.isInteger() && power.doubleValue() >= 0.0) {
			// @hack this wont handle BigIntegers correctly!
			long baseTyped = base.longValue();
			long powerTyped = power.longValue();
			if (powerTyped > Integer.MAX_VALUE)
				return Errors.error(
						SubLObjectFactory.makeString(
								"Cannot raise ~A to ~A; power is larger than implementation limit ~A for integers."),
						base, power, SubLNumberFactory.makeInteger(Integer.MAX_VALUE));
			BigInteger bigBase = new BigInteger(String.valueOf(baseTyped));
			BigInteger result = bigBase.pow((int) powerTyped);
			return SubLNumberFactory.makeInteger(result);
		} else {
			double baseTyped = base.doubleValue();
			double powerTyped = power.doubleValue();
			double result = Math.pow(baseTyped, powerTyped);
			return SubLNumberFactory.makeDouble(result);
		}
	}

	public static SubLObject fixnumMultiply(SubLObject fixnum1, SubLObject fixnum2) {
		return SubLNumberFactory
				.makeInteger(Numbers.truncateToFixnum(fixnum1.toFixnum().longValue() * fixnum2.toFixnum().longValue()));
	}

	public static SubLObject float_digits(SubLObject theFloat) {
		return Numbers.FLOAT_DIGITS;
	}

	public static SubLObject float_radix(SubLObject theFloat) {
		return CommonSymbols.TWO_INTEGER;
	}

	public static SubLObject float_sign(SubLObject float1, SubLObject float2) {
		if (float2 == CommonSymbols.UNPROVIDED)
			float2 = SubLNumberFactory.makeDouble(1.0);
		double float1Typed = float1.doubleValue();
		double float2Typed = float2.doubleValue();
		double result = Math.abs(float2Typed) * (float1Typed < 0 ? -1.0 : 1.0);
		return SubLNumberFactory.makeDouble(result);
	}

	public static SubLObject floor(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		int signNum = num.isNegative() ? -1 : 1;
		int signDivisor = divisor.isNegative() ? -1 : 1;
		SubLObject quotient = Numbers.truncate(num, divisor);
		SubLObject remainder = Values.secondMultipleValue();
		if (signDivisor != signNum && !remainder.isZero()) {
			quotient = quotient.sub(CommonSymbols.ONE_INTEGER);
			remainder = remainder.add(divisor);
		}
		return Values.values(quotient, remainder);
	}

	public static SubLObject inc(SubLObject val) {
		if (val.isFixnum())
			return SubLNumberFactory.makeInteger(val.intValue() + 1);
		return Numbers.add(val, CommonSymbols.ONE_INTEGER);
	}

	public static SubLObject infinity_p(SubLObject object) {
		if (object.isDouble())
			return SubLObjectFactory.makeBoolean(Double.isInfinite(object.doubleValue()));
		else
			return CommonSymbols.NIL;
	}

	public static SubLObject integer_decode_float(SubLObject theFloat) {
		DecodedDouble decodedDouble = new DecodedDouble(theFloat.doubleValue());
		SubLObject sign = SubLNumberFactory.makeInteger(decodedDouble.sign);
		SubLObject exponent = SubLNumberFactory.makeInteger(decodedDouble.exponent);
		SubLObject mantissa = SubLNumberFactory.makeInteger(decodedDouble.mantissa);
		return Values.values(mantissa, exponent, sign);
	}

	public static SubLObject integer_length(SubLObject integer) {
		SubLInteger integerTyped = (SubLInteger) integer;
		if (Numbers.zerop(integerTyped) == CommonSymbols.T)
			return SubLNumberFactory.makeInteger(0);
		else if (integer.isBigIntegerBignum()) {
			BigInteger bigIntTyped = integer.bigIntegerValue();
			int result = bigIntTyped.bitLength();
			return SubLNumberFactory.makeInteger(result);
		} else {
			long originalValue = integerTyped.longValue();
			long workValue = Math.abs(originalValue);
			int index = Arrays.binarySearch(Numbers.INTEGER_LENGTH_TABLE, workValue);
			if (index == Numbers.INTEGER_LENGTH_TABLE.length)
				return SubLNumberFactory.makeInteger(index);
			else if (index < 0) {
				int insertPosition = Math.abs(index + 1);
				int length = insertPosition - 1; // this returns the index of
													// the next higher pow2, so
													// decrement
				return SubLNumberFactory.makeInteger(Math.abs(length));
			} else if (Numbers.INTEGER_LENGTH_TABLE[index] == workValue)
				return SubLNumberFactory.makeInteger(index);
			else
				// this case should never arise ...
				return SubLNumberFactory.makeInteger(index + 1);
		}
	}

	public static SubLObject integerDivide(SubLObject num1, SubLObject num2) {
		num1.toInteger();
		num2.toInteger();
		return Numbers.truncate(num1, num2);
	}

	public static SubLObject invert(SubLObject number) {
		return Numbers.divide(CommonSymbols.ONE_INTEGER, number);
	}

	public static SubLObject isqrt(SubLObject number) {
		return Errors.unimplementedMethod("Numbers.isqrt()");
	}

	public static SubLObject jrtl_parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix) {
		int startTyped = start.intValue();
		int endTyped = end.intValue();
		int radixTyped = radix.intValue();
		String stringTyped = string.getString();
		String substring = stringTyped.substring(startTyped, endTyped);
		SubLInteger result = SubLNumberFactory.makeInteger(substring, radixTyped);
		return Values.values(result, SubLNumberFactory.makeInteger(substring.length()));
	}

	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	public static SubLObject keyhashScaleNumber(SubLObject fixnum1, SubLObject fixnum2, SubLObject mask) {
		long num1 = fixnum1.intValue();
		long num2 = fixnum2.intValue();
		long msk = mask.intValue();
		return SubLNumberFactory.makeInteger((num1 & msk) * num2 & msk);
	}

	public static SubLObject log(SubLObject number, SubLObject base) {
		if (base == CommonSymbols.UNPROVIDED)
			base = Numbers.E_FLOAT;
		if (base == Numbers.E_FLOAT) {
			double result = Math.log(number.doubleValue());
			return SubLNumberFactory.makeDouble(result);
		} else {
			double result1 = Math.log(number.doubleValue());
			double result2 = Math.log(base.doubleValue());
			double result = result1 / result2;
			return SubLNumberFactory.makeDouble(result);
		}
	}

	public static SubLObject logand(SubLObject arg1, SubLObject arg2) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize2;
		args[0] = arg1;
		args[1] = arg2;
		return Numbers.logand(args);
	}

	public static SubLObject logand(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize3;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		return Numbers.logand(args);
	}

	public static SubLObject logand(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize4;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		args[3] = arg4;
		return Numbers.logand(args);
	}

	public static SubLObject logand(SubLObject[] integers) {
		// @hack -APB
		int size = integers.length;
		if (size == 0)
			return CommonSymbols.MINUS_ONE_INTEGER;
		long result = integers[0].longValue();
		for (int i = 1; i < size; i++)
			result &= integers[i].longValue();
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject logandc1(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.logandc1()");
	}

	public static SubLObject logandc2(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.logandc2()");
	}

	public static SubLObject logbitp(SubLObject index, SubLObject integer) {
		return Errors.unimplementedMethod("Numbers.logbitp()");
	}

	public static SubLObject logcount(SubLObject integer) {
		return Errors.unimplementedMethod("Numbers.logcount()");
	}

	public static SubLObject logeqv(SubLObject[] integers) {
		return Errors.unimplementedMethod("Numbers.logeqv()");
	}

	public static SubLObject logior(SubLObject arg1, SubLObject arg2) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize2;
		args[0] = arg1;
		args[1] = arg2;
		return Numbers.logior(args);
	}

	public static SubLObject logior(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize3;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		return Numbers.logior(args);
	}

	public static SubLObject logior(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize4;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		args[3] = arg4;
		return Numbers.logior(args);
	}

	public static SubLObject logior(SubLObject[] integers) {
		// @hack -APB
		int size = integers.length;
		if (size == 0)
			return CommonSymbols.MINUS_ONE_INTEGER;
		long result = integers[0].longValue();
		for (int i = 1; i < size; i++)
			result |= integers[i].longValue();
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject lognand(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.lognand()");
	}

	public static SubLObject lognor(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.lognor()");
	}

	public static SubLObject lognot(SubLObject integer) {
		if (integer.isBigIntegerBignum())
			Errors.unimplementedMethod("LOGNOT -- on Bignums");
		// @todo be more efficient in the integer case
		long integerTyped = integer.longValue();
		integerTyped = ~integerTyped;
		return SubLNumberFactory.makeInteger(integerTyped);
	}

	public static SubLObject logorc1(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.logorc1()");
	}

	public static SubLObject logorc2(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.logorc2()");
	}

	public static SubLObject logtest(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("Numbers.logtest()");
	}

	public static SubLObject logxor(SubLObject arg1, SubLObject arg2) {
		if (arg1.isFixnum() && arg2.isFixnum())
			return SubLNumberFactory.makeInteger(Numbers.truncateToFixnum(arg1.intValue() ^ arg2.intValue()));
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize2;
		args[0] = arg1;
		args[1] = arg2;
		return Numbers.logxor(args);
	}

	public static SubLObject logxor(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize3;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		return Numbers.logxor(args);
	}

	public static SubLObject logxor(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize4;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		args[3] = arg4;
		return Numbers.logxor(args);
	}

	public static SubLObject logxor(SubLObject[] integers) {
		int size = integers.length;
		if (size == 0)
			return CommonSymbols.MINUS_ONE_INTEGER;
		SubLObject num = integers[0];
		if (!num.isFixnum())
			return Numbers.logxorOnLongs(integers);
		int result = num.toFixnum().intValue();
		for (int i = 1; i < size; i++) {
			num = integers[i];
			if (!num.isFixnum())
				return Numbers.logxorOnLongs(integers);
			result ^= num.toFixnum().intValue();
		}
		return SubLObjectFactory.makeInteger(Numbers.truncateToFixnum(result));
	}

	private static SubLObject logxorOnLongs(SubLObject[] integers) {
		// @todo make a version for bignums that fit into integers
		int size = integers.length;
		SubLObject num = integers[0];
		if (num.isBigIntegerBignum())
			return Errors.unimplementedMethod("Implement me -- logxor on Bignums.");// @todo
																					// support
																					// really
																					// big
																					// numbers
																					// here
		long result = num.longValue();
		for (int i = 1; i < size; i++) {
			num = integers[i];
			if (num.isBigIntegerBignum())
				return Errors.unimplementedMethod("Implement me -- logxor on Bignums.");// @todo
																						// support
																						// really
																						// big
																						// numbers
																						// here
			result ^= num.longValue();
		}
		return SubLObjectFactory.makeInteger(result);
	}

	// todo -- move this into the UnitTests
	static public void main(String[] args) {

	}

	public static SubLObject max(SubLObject num1, SubLObject num2) {
		return num1.numG(num2) ? num1 : num2;
	}

	public static SubLObject max(SubLObject number, SubLObject[] numbers) {
		if (numbers.length == 0)
			return number.toNumber();
		SubLObject newMax = number;
		SubLObject currentNum;
		for (int i = 0, size = numbers.length; i < size; i++) {
			currentNum = numbers[i];
			if (CommonSymbols.NIL != Numbers.numG(currentNum, newMax))
				newMax = currentNum;
		}
		return newMax;
	}

	public static SubLObject min(SubLObject num1, SubLObject num2) {
		return num1.numL(num2) ? num1 : num2;
	}

	public static SubLObject min(SubLObject number, SubLObject[] numbers) {
		if (numbers.length == 0)
			return number.toNumber();
		SubLObject newMin = number;
		SubLObject currentNum;
		for (int i = 0, size = numbers.length; i < size; i++) {
			currentNum = numbers[i];
			if (CommonSymbols.NIL != Numbers.numL(currentNum, newMin))
				newMin = currentNum;
		}
		return newMin;
	}

	public static SubLObject minus(SubLObject number) {
		if (number.isDouble())
			return CommonSymbols.ZERO_DOUBLE.sub(number);
		return CommonSymbols.ZERO_INTEGER.sub(number);
	}

	public static SubLObject minusp(SubLObject num) {
		return num.isNegative() ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject mod(SubLObject number, SubLObject divisor) {
		Numbers.floor(number, divisor);
		return Values.secondMultipleValue();
	}

	public static SubLObject multiply(SubLObject num1, SubLObject num2) {
		return num1.mult(num2);
	}

	public static SubLObject multiply(SubLObject num1, SubLObject num2, SubLObject num3) {
		return num1.mult(num2).mult(num3);
	}

	//// Protected Area

	//// Private Area

	public static SubLObject multiply(SubLObject[] args) {
		return Numbers.processMultiArgMathFunction(args, Numbers.multiplicationDesc);
	}

	private static SubLObject negate(SubLObject val) {
		return Numbers.subtract(CommonSymbols.ZERO_INTEGER, val);
	}

	public static SubLObject not_a_number_p(SubLObject object) {
		if (object.isDouble())
			return SubLObjectFactory.makeBoolean(Double.isNaN(object.doubleValue()));
		else
			return CommonSymbols.NIL;
	}

	public static SubLObject numE(SubLObject num1, SubLObject num2) {
		return num1.numE(num2) ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject numG(SubLObject num1, SubLObject num2) {
		return num1.numG(num2) ? Numbers.RET_T : CommonSymbols.NIL;
	}

	//// Internal Rep

	public static SubLObject numGE(SubLObject num1, SubLObject num2) {
		return num1.numGE(num2) ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject numL(SubLObject num1, SubLObject num2) {
		return num1.numL(num2) ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject numLE(SubLObject num1, SubLObject num2) {
		return num1.numLE(num2) ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject numNE(SubLObject num1, SubLObject num2) {
		return num1.numE(num2) ? CommonSymbols.NIL : Numbers.RET_T;
	}

	public static SubLObject oddp(SubLObject num) {
		return num.toInteger().isOdd() ? Numbers.RET_T : CommonSymbols.NIL;
	}

	public static SubLObject plusp(SubLObject num) {
		return num.isPositive() ? Numbers.RET_T : CommonSymbols.NIL;
	}

	private static SubLObject processBinaryArgMathFunction(SubLObject arg1, SubLObject arg2,
			MultiArgMathFuncDesc mathFunc) {
		MathFuncProcessingByType processingClassByType = Numbers.verifyAndProcessBinaryMathFunctionArgs(arg1, arg2,
				mathFunc);
		if (mathFunc == Numbers.multiplicationDesc && processingClassByType != Numbers.DOUBLE_PROCESSING_FUNC)
			// @hack to avoid overflow during multiplication
			processingClassByType = Numbers.BIGINT_PROCESSING_FUNC;
		return processingClassByType.processMathFunc(arg1, arg2, mathFunc);
	}

	private static SubLObject processMultiArgMathFunction(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
		MathFuncProcessingByType processingClassByType = Numbers.verifyAndProcessMathFunctionArgs(args, mathFunc);
		if (mathFunc == Numbers.multiplicationDesc
				&& processingClassByType != Numbers.funcProcessing[Numbers.DOUBLE_FLOAT_TYPE_CONST])
			// to
			// avoid
			// overflow
			// during
			// multiplication
			processingClassByType = Numbers.funcProcessing[Numbers.BIG_INTEGER_TYPE_CONST];
		int length = args.length;
		if (length < 2)
			return length == 0 ? mathFunc.getNoArgValue() : mathFunc.getUnaryValue(args[0]);
		return processingClassByType.processMathFunc(args, mathFunc);
	}

	public static SubLObject rem(SubLObject number, SubLObject divisor) {
		Numbers.truncate(number, divisor);
		return Values.secondMultipleValue();
	}

	public static SubLObject round(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		SubLObject quotient = Numbers.truncate(num, divisor);
		SubLObject remainder = Values.secondMultipleValue();
		double tempRemainder = Math.abs(remainder.doubleValue() / divisor.doubleValue());
		if (tempRemainder < .5) {
			// do nothing
		} else if (tempRemainder != .5 || CommonSymbols.NIL != Numbers.oddp(quotient)) {
			if (quotient.isZero() && !remainder.isNegative() || !quotient.isZero() && !quotient.isNegative()) {
				quotient = quotient.add(CommonSymbols.ONE_INTEGER);
				remainder = remainder.sub(divisor);
			} else {
				quotient = quotient.sub(CommonSymbols.ONE_INTEGER);
				remainder = remainder.add(divisor);
			}
			// @hack goes to floor if above algorithm fails (which it does) 8-(
			if (Math.abs(remainder.doubleValue()) > Math.abs(divisor.doubleValue())) {
				quotient = Numbers.floor(num, divisor);
				remainder = Values.secondMultipleValue();
			}
		}
		return Values.values(quotient, remainder);
	}

	public static SubLObject scale_float(SubLObject theFloat, SubLObject power) {
		// @hack
		double theFloatTyped = theFloat.doubleValue();
		long powerTyped = power.longValue();
		double result = theFloatTyped * Math.pow(Numbers.float_radix(Numbers.ZERO_FLOAT).doubleValue(), powerTyped);
		return SubLNumberFactory.makeDouble(result);
	};

	public static SubLObject sin(SubLObject radians) {
		return SubLObjectFactory.makeDouble(Math.sin(radians.doubleValue()));
	};

	public static SubLObject sqrt(SubLObject number) {
		if (CommonSymbols.ZERO_INTEGER.numG(number))
			return Errors.error("Can only take square-root of non-negative numbers");
		if (number.isBigIntegerBignum())
			return Errors.unimplementedMethod("SQRT -- on BIGNUMS: " + number);
		else {
			double result = Math.sqrt(number.doubleValue());
			if (number.isInteger() && Math.round(result) == result)
				return SubLNumberFactory.makeInteger((long) result);
			return SubLNumberFactory.makeDouble(result);
		}
	}

	public static SubLObject sublisp_float(SubLObject number, SubLObject prototype) {
		// if (prototype == UNPROVIDED) { prototype = NIL; }
		// @todo return number unchanged if already a double
		return SubLNumberFactory.makeDouble(number.doubleValue());
	};

	public static SubLObject subtract(SubLObject num1, SubLObject num2) {
		return num1.sub(num2);
	}

	public static SubLObject subtract(SubLObject num1, SubLObject num2, SubLObject num3) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize3;
		args[0] = num1;
		args[1] = num2;
		args[2] = num3;
		return Numbers.processMultiArgMathFunction(args, Numbers.subtractionDesc);
	};

	public static SubLObject subtract(SubLObject num, SubLObject[] numbers) {
		return num.sub(Numbers.add(numbers));
	}

	public static SubLObject subtract(SubLObject[] args) {
		return Numbers.processMultiArgMathFunction(args, Numbers.subtractionDesc);
	};

	public static SubLObject tan(SubLObject radians) {
		return SubLObjectFactory.makeDouble(Math.tan(radians.doubleValue()));
	}

	public static SubLObject truncate(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		if (divisor.isZero())
			Errors.error("Division by zero.");
		// @todo put this code under the appropriate number type classes
		if (num.getNumSize() <= SubLNumber.EIGHT_BYTE_INTEGER
				&& divisor.getNumSize() <= SubLNumber.EIGHT_BYTE_INTEGER) {
			long numTyped = num.longValue();
			long divTyped = divisor.longValue();
			long remainder = numTyped % divTyped;
			long quotient = (numTyped - remainder) / divTyped;
			return Values.values(SubLNumberFactory.makeInteger(quotient), SubLNumberFactory.makeInteger(remainder));
		}
		if (num.isBigIntegerBignum() || divisor.isBigIntegerBignum()) {
			if (num.isDouble() || divisor.isDouble()) {
				Errors.unimplementedMethod(
						"Numbers.truncate(" + num + ", " + divisor + ") on big integer bignums and floats.");
				return CommonSymbols.ZERO_INTEGER;
			}
			BigInteger numTyped = num.bigIntegerValue();
			BigInteger divTyped = divisor.bigIntegerValue();
			BigInteger remainder = numTyped.mod(divTyped);
			BigInteger quotient = numTyped.subtract(remainder).divide(divTyped);
			return Values.values(SubLNumberFactory.makeInteger(quotient), SubLNumberFactory.makeInteger(remainder));
		}
		double numTyped = num.doubleValue();
		double divTyped = divisor.doubleValue();
		double remainder = numTyped % divTyped;
		double quotient = (numTyped - remainder) / divTyped;
		Values.resetMultipleValues();
		return Values.values(SubLNumberFactory.makeInteger((long) quotient), SubLNumberFactory.makeDouble(remainder));
	}

	public static int truncateToFixnum(int number) {
		int result = 0;
		if (number >= 0)
			result = number & SubLNumberFactory.MAX_FIXNUM;
		else
			result = number | SubLNumberFactory.MIN_FIXNUM;
		// @note move these out of this function and write unit tests instead
		/*
		 * if ((number > 0) && (number <= SubLNumberFactory.MAX_FIXNUM)) { if
		 * (number != result) { Errors.error("trucateToFixnum is bad."); } }
		 * else if ((number < 0) && (number >= SubLNumberFactory.MIN_FIXNUM)) {
		 * if (number != result) { Errors.error("trucateToFixnum is bad."); } }
		 * else if ((result > SubLNumberFactory.MAX_FIXNUM) || (result <
		 * SubLNumberFactory.MIN_FIXNUM)) {
		 * Errors.error("trucateToFixnum is bad."); }
		 */
		// @endnote
		return result;
	}

	public static int truncateToFixnum(long number) {
		long result = 0;
		if (number >= 0)
			result = number & SubLNumberFactory.MAX_FIXNUM;
		else
			result = number | SubLNumberFactory.MIN_FIXNUM;
		// @note move these out of this function and write unit tests instead
		/*
		 * if ((number > 0) && (number <= SubLNumberFactory.MAX_FIXNUM)) { if
		 * (number != result) { Errors.error("trucateToFixnum is bad."); } }
		 * else if ((number < 0) && (number >= SubLNumberFactory.MIN_FIXNUM)) {
		 * if (number != result) { Errors.error("trucateToFixnum is bad."); } }
		 * else if ((result > SubLNumberFactory.MAX_FIXNUM) || (result <
		 * SubLNumberFactory.MIN_FIXNUM)) {
		 * Errors.error("trucateToFixnum is bad."); }
		 */
		// @endnote
		return (int) result;
	}

	private static MathFuncProcessingByType verifyAndProcessBinaryMathFunctionArgs(SubLObject arg1, SubLObject arg2,
			MultiArgMathFuncDesc mathFunc) {
		int size = Math.max(arg1.getNumSize(), arg2.getNumSize());
		switch (size) {
		case SubLNumber.FOUR_BYTE_INTEGER:
			return Numbers.LONG_PROCESSING_FUNC; // @hack should be integer but
													// we don't
		// support auto type expansion on
		// overflow/underflow
		case SubLNumber.EIGHT_BYTE_INTEGER:
			return Numbers.LONG_PROCESSING_FUNC;
		case SubLNumber.BIGINT_INTEGER:
			return Numbers.BIGINT_PROCESSING_FUNC;
		case SubLNumber.FLOATING_POINT:
			return Numbers.DOUBLE_PROCESSING_FUNC;
		default:
			Errors.error("Don't know about number of size: " + size);
			return null;
		}
	}

	private static MathFuncProcessingByType verifyAndProcessMathFunctionArgs(SubLObject[] args,
			MultiArgMathFuncDesc mathFunc) {
		int minType = mathFunc == Numbers.divisionDesc ? Numbers.DOUBLE_FLOAT_TYPE_CONST : Numbers.INTEGER_TYPE_CONST;
		SubLObject arg;
		for (int i = 0, size = args.length; i < size;) {
			arg = args[i++];
			if (!arg.isNumber())
				throw new InvalidSubLExpressionException("'" + arg + "' is not of the expected type 'NUMBER'.");
			else if (arg.isIntBignum())
				// @more correct but doesnt do escalation at this point
				// minType = (INTEGER_TYPE_CONST > minType) ? INTEGER_TYPE_CONST
				// : minType;
				minType = Numbers.LONG_INTEGER_TYPE_CONST > minType ? Numbers.LONG_INTEGER_TYPE_CONST : minType;
			else if (arg.isLongBignum())
				minType = Numbers.LONG_INTEGER_TYPE_CONST > minType ? Numbers.LONG_INTEGER_TYPE_CONST : minType;
			else if (arg.isBigIntegerBignum())
				minType = Numbers.BIG_INTEGER_TYPE_CONST > minType ? Numbers.BIG_INTEGER_TYPE_CONST : minType;
			else if (arg.isDouble())
				return Numbers.funcProcessing[Numbers.DOUBLE_FLOAT_TYPE_CONST];
		}
		return Numbers.funcProcessing[minType];
	}

	public static SubLObject zerop(SubLObject num) {
		return num.isZero() ? Numbers.RET_T : CommonSymbols.NIL;
	}

	//// Initializers

	/** There should only ever be one instance of this */
	private Numbers() {
	}

	public void declareFunctions() {
		SubLFiles.declareFunction(Numbers.me, "not_a_number_p", "NOT-A-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "infinity_p", "INFINITY-P", 1, 0, false);

		SubLFiles.declareFunction(Numbers.me, "add", "+", 0, 0, true);
		SubLFiles.declareFunction(Numbers.me, "subtract", "-", 0, 0, true); // @todo
		// make 1
		// required
		// SubLFiles.declareFunction(me, "subtract", "-", 1, 0, true); // This
		// is what we want
		SubLFiles.declareFunction(Numbers.me, "multiply", "*", 0, 0, true);
		SubLFiles.declareFunction(Numbers.me, "divide", "/", 0, 0, true); // @todo
																			// make
		// 1
		// required
		// SubLFiles.declareFunction(me, "divide", "/", 1, 0, true); // This is
		// what we want
		SubLFiles.declareFunction(Numbers.me, "integerDivide", "INT/", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "mod", "MOD", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "rem", "REM", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "expt", "EXPT", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "log", "LOG", 1, 1, false);
		SubLFiles.declareFunction(Numbers.me, "abs", "ABS", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "max", "MAX", 1, 0, true);
		SubLFiles.declareFunction(Numbers.me, "min", "MIN", 1, 0, true);

		SubLFiles.declareFunction(Numbers.me, "sublisp_float", "FLOAT", 1, 1, false);
		SubLFiles.declareFunction(Numbers.me, "scale_float", "SCALE-FLOAT", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "integer_decode_float", "INTEGER-DECODE-FLOAT", 1, 0, false);

		SubLFiles.declareFunction(Numbers.me, "numE", "=", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "numG", ">", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "numL", "<", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "numGE", ">=", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "numLE", "<=", 2, 0, false);

		SubLFiles.declareFunction(Numbers.me, "oddp", "ODDP", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "evenp", "EVENP", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "plusp", "PLUSP", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "zerop", "ZEROP", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "minusp", "MINUSP", 1, 0, false);

		SubLFiles.declareFunction(Numbers.me, "ash", "ASH", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "lognot", "LOGNOT", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logand", "LOGAND", 0, 0, true);
		SubLFiles.declareFunction(Numbers.me, "logior", "LOGIOR", 0, 0, true);

		SubLFiles.declareFunction(Numbers.me, "ceiling", "CEILING", 1, 1, false);
		SubLFiles.declareFunction(Numbers.me, "floor", "FLOOR", 1, 1, false);
		SubLFiles.declareFunction(Numbers.me, "round", "ROUND", 1, 1, false);
		SubLFiles.declareFunction(Numbers.me, "truncate", "TRUNCATE", 1, 1, false);

		SubLFiles.declareFunction(Numbers.me, "float_radix", "FLOAT-RADIX", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "float_digits", "FLOAT-DIGITS", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "float_sign", "FLOAT-SIGN", 1, 1, false);

		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		SubLFiles.declareFunction(Numbers.me, "numNE", "/=", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "acos", "ACOS", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "asin", "ASIN", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "assemble_fixnums_to_integer", "ASSEMBLE-FIXNUMS-TO-INTEGER", 1, 0, true);
		SubLFiles.declareFunction(Numbers.me, "atan", "ATAN", 1, 1, false);
		SubLFiles.declareFunction(Numbers.me, "boole", "BOOLE", 3, 0, false);
		SubLFiles.declareFunction(Numbers.me, "cos", "COS", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "decode_float", "DECODE-FLOAT", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "disassemble_integer_to_fixnums", "DISASSEMBLE-INTEGER-TO-FIXNUMS", 1, 0,
				false);
		SubLFiles.declareFunction(Numbers.me, "exp", "EXP", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "integer_length", "INTEGER-LENGTH", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "isqrt", "ISQRT", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "jrtl_parse_integer", "JRTL-PARSE-INTEGER", 4, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logandc1", "LOGANDC1", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logandc2", "LOGANDC2", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logbitp", "LOGBITP", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logcount", "LOGCOUNT", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logeqv", "LOGEQV", 0, 0, true);
		SubLFiles.declareFunction(Numbers.me, "lognand", "LOGNAND", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "lognor", "LOGNOR", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logorc1", "LOGORC1", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logorc2", "LOGORC2", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logtest", "LOGTEST", 2, 0, false);
		SubLFiles.declareFunction(Numbers.me, "logxor", "LOGXOR", 0, 0, true);
		SubLFiles.declareFunction(Numbers.me, "sin", "SIN", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "sqrt", "SQRT", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "tan", "TAN", 1, 0, false);
		SubLFiles.declareFunction(Numbers.me, "fixnumMultiply", "FIXNUM*", 2, 0, false);
	}

	public void initializeVariables() {
		Numbers.$double_float_minimum_exponent$ = SubLFiles.defconstant(Numbers.me, "*DOUBLE-FLOAT-MINIMUM-EXPONENT*",
				SubLObjectFactory.makeInteger(-1074));
		Numbers.$e$ = SubLFiles.defconstant(Numbers.me, "*E*", Numbers.E_FLOAT);
		Numbers.$pi$ = SubLFiles.defconstant(Numbers.me, "*PI*", Numbers.PI_FLOAT);
		Numbers.$most_negative_fixnum$ = SubLFiles.defconstant(Numbers.me, "*MOST-NEGATIVE-FIXNUM*",
				SubLObjectFactory.makeInteger(SubLNumberFactory.MIN_FIXNUM));
		Numbers.$most_positive_fixnum$ = SubLFiles.defconstant(Numbers.me, "*MOST-POSITIVE-FIXNUM*",
				SubLObjectFactory.makeInteger(SubLNumberFactory.MAX_FIXNUM));
		// $double_float_minimum_exponent$ = SubLFiles.defconstant(me,
		// "*DOUBLE-FLOAT-MINIMUM-EXPONENT*",
		// SubLObjectFactory.makeInteger(-1074));
		Numbers.$exp1$ = SubLFiles.defconstant(Numbers.me, "*EXP1*", SubLObjectFactory.makeDouble(2.718281828459045e0));
		// $pi$ = SubLFiles.defconstant(me, "*PI*",
		// SubLObjectFactory.makeDouble(3.141592653589793d0));
		Numbers.$boole_clr$ = SubLFiles.defconstant(Numbers.me, "BOOLE-CLR", CommonSymbols.ZERO_INTEGER);
		Numbers.$boole_set$ = SubLFiles.defconstant(Numbers.me, "BOOLE-SET", CommonSymbols.ONE_INTEGER);
		Numbers.$boole_1$ = SubLFiles.defconstant(Numbers.me, "BOOLE-1", CommonSymbols.TWO_INTEGER);
		Numbers.$boole_2$ = SubLFiles.defconstant(Numbers.me, "BOOLE-2", CommonSymbols.THREE_INTEGER);
		Numbers.$boole_c1$ = SubLFiles.defconstant(Numbers.me, "BOOLE-C1", CommonSymbols.FOUR_INTEGER);
		Numbers.$boole_c2$ = SubLFiles.defconstant(Numbers.me, "BOOLE-C2", CommonSymbols.FIVE_INTEGER);
		Numbers.$boole_and$ = SubLFiles.defconstant(Numbers.me, "BOOLE-AND", CommonSymbols.SIX_INTEGER);
		Numbers.$boole_ior$ = SubLFiles.defconstant(Numbers.me, "BOOLE-IOR", CommonSymbols.SEVEN_INTEGER);
		Numbers.$boole_eqv$ = SubLFiles.defconstant(Numbers.me, "BOOLE-EQV", CommonSymbols.NINE_INTEGER);
		Numbers.$boole_nand$ = SubLFiles.defconstant(Numbers.me, "BOOLE-NAND", CommonSymbols.TEN_INTEGER);
		Numbers.$boole_nor$ = SubLFiles.defconstant(Numbers.me, "BOOLE-NOR", CommonSymbols.ELEVEN_INTEGER);
		Numbers.$boole_xor$ = SubLFiles.defconstant(Numbers.me, "BOOLE-XOR", CommonSymbols.EIGHT_INTEGER);
		Numbers.$boole_andc1$ = SubLFiles.defconstant(Numbers.me, "BOOLE-ANDC1", CommonSymbols.TWELVE_INTEGER);
		Numbers.$boole_andc2$ = SubLFiles.defconstant(Numbers.me, "BOOLE-ANDC2", CommonSymbols.THIRTEEN_INTEGER);
		Numbers.$boole_orc1$ = SubLFiles.defconstant(Numbers.me, "BOOLE-ORC1", CommonSymbols.FOURTEEN_INTEGER);
		Numbers.$boole_orc2$ = SubLFiles.defconstant(Numbers.me, "BOOLE-ORC2", CommonSymbols.FIFTEEN_INTEGER);
	}

	public void runTopLevelForms() {
	}

}

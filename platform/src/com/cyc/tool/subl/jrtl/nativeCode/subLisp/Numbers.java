//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.math.BigInteger;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigIntBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import static org.armedbear.lisp.Lisp.NIL;
import static org.armedbear.lisp.Lisp.RET_T;
import static org.armedbear.lisp.Lisp.T;
import static org.armedbear.lisp.Lisp.UNPROVIDED;
import static org.armedbear.lisp.Symbol.STREAMP;
import static org.armedbear.lisp.Keyword.BINARY_KEYWORD;
import static org.armedbear.lisp.Keyword.START;
import static org.armedbear.lisp.Keyword.END;
import static org.armedbear.lisp.Fixnum.ZERO;

public class Numbers extends SubLTrampolineFile {
	private static class AdditionDescription implements MultiArgMathFuncDesc {
		@Override
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			return val1.add(val2);
		}

		@Override
		public double getBinaryValue(double val1, double val2) {
			return val1 + val2;
		}

		@Override
		public float getBinaryValue(float val1, float val2) {
			return val1 + val2;
		}

		@Override
		public int getBinaryValue(int val1, int val2) {
			return val1 + val2;
		}

		@Override
		public long getBinaryValue(long val1, long val2) {
			return val1 + val2;
		}

		@Override
		public SubLObject getNoArgValue() {
			return CommonSymbols.ZERO_INTEGER;
		}

		@Override
		public SubLObject getUnaryValue(SubLObject val) {
			return val;
		}
	}

	private static class BigIntMathFuncProcessingFunc implements MathFuncProcessingByType {
		@Override
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			BigInteger firstArg = arg1.isBigIntegerBignum() ? ((SubLBigIntBignum) arg1).getBigInt()
					: new BigInteger(arg1.princToString());
			BigInteger secondArg = arg2.isBigIntegerBignum() ? ((SubLBigIntBignum) arg2).getBigInt()
					: new BigInteger(arg2.princToString());
			return SubLNumberFactory.makeInteger(mathFunc.getBinaryValue(firstArg, secondArg));
		}

		@Override
		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			BigInteger result = args[0].isBigIntegerBignum() ? ((SubLBigIntBignum) args[0]).getBigInt()
					: new BigInteger(args[0].princToString());
			for (int i = 1, size = args.length; i < size; ++i)
				result = mathFunc.getBinaryValue(result, args[i].isBigIntegerBignum()
						? ((SubLBigIntBignum) args[i]).getBigInt() : new BigInteger(args[i].princToString()));
			return SubLNumberFactory.makeInteger(result);
		}
	}

	private static class DecodedDouble {
		public DecodedDouble(double value) {
			long longBits = Double.doubleToLongBits(value);
			sign = decodeDoubleSign(longBits);
			int rawExponent = decodeDoubleExponent(longBits);
			long rawMantissa = decodeDoubleMantissa(longBits);
			if (rawExponent > 0 && rawExponent < 2047) {
				exponent = rawExponent - 1023 - 52;
				mantissa = rawMantissa | 0x10000000000000L;
			} else {
				if (rawExponent != 0)
					throw new NumberFormatException();
				if (rawMantissa != 0L) {
					exponent = rawExponent - 1022 - 52;
					mantissa = rawMantissa;
				} else {
					exponent = 0;
					mantissa = 0L;
				}
			}
		}

		private static int decodeDoubleExponent(long longBits) {
			return (int) ((longBits & 0x7FF0000000000000L) >> 52);
		}

		private static long decodeDoubleMantissa(long longBits) {
			return longBits & 0xFFFFFFFFFFFFFL;
		}

		private static int decodeDoubleSign(long longBits) {
			int signBit = (int) (longBits >> 63 & 0x1L);
			if (signBit == 0)
				return 1;
			return -1;
		}

		public int sign;
		public int exponent;
		public long mantissa;
	}

	private static class DivisionDescription implements MultiArgMathFuncDesc {
		@Override
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			if (val2.equals(BigInteger.ZERO))
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1.divide(val2);
		}

		@Override
		public double getBinaryValue(double val1, double val2) {
			if (val2 == 0.0)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		@Override
		public float getBinaryValue(float val1, float val2) {
			if (val2 == 0.0f)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		@Override
		public int getBinaryValue(int val1, int val2) {
			if (val2 == 0)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		@Override
		public long getBinaryValue(long val1, long val2) {
			if (val2 == 0L)
				Errors.error("Attempt to divide " + val1 + " by zero.");
			return val1 / val2;
		}

		@Override
		public SubLObject getNoArgValue() {
			throw new InvalidSubLExpressionException("Error: / got 0 args, wanted at least 1 arg.");
		}

		@Override
		public SubLObject getUnaryValue(SubLObject val) {
			return invert(val);
		}
	}

	private static class DoubleMathFuncProcessingFunc implements MathFuncProcessingByType {
		@Override
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			return SubLNumberFactory.makeDouble(mathFunc.getBinaryValue(arg1.doubleValue(), arg2.doubleValue()));
		}

		@Override
		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			double result = args[0].doubleValue();
			for (int i = 1, size = args.length; i < size; ++i)
				result = mathFunc.getBinaryValue(result, args[i].doubleValue());
			return SubLNumberFactory.makeDouble(result);
		}
	}

	private static class IntegerMathFuncProcessingFunc implements MathFuncProcessingByType {
		@Override
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			return SubLNumberFactory.makeInteger(mathFunc.getBinaryValue(arg1.intValue(), arg2.intValue()));
		}

		@Override
		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			int result = args[0].intValue();
			for (int i = 1, size = args.length; i < size; ++i)
				result = mathFunc.getBinaryValue(result, args[i].intValue());
			return SubLNumberFactory.makeInteger(result);
		}
	}

	private static class LongMathFuncProcessingFunc implements MathFuncProcessingByType {
		@Override
		public SubLNumber processMathFunc(SubLObject arg1, SubLObject arg2, MultiArgMathFuncDesc mathFunc) {
			return SubLNumberFactory.makeInteger(mathFunc.getBinaryValue(arg1.longValue(), arg2.longValue()));
		}

		@Override
		public SubLNumber processMathFunc(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
			long result = args[0].longValue();
			for (int i = 1, size = args.length; i < size; ++i)
				result = mathFunc.getBinaryValue(result, args[i].longValue());
			return SubLNumberFactory.makeInteger(result);
		}
	}

	private interface MathFuncProcessingByType {
		SubLNumber processMathFunc(SubLObject p0, SubLObject p1, MultiArgMathFuncDesc p2);

		SubLNumber processMathFunc(SubLObject[] p0, MultiArgMathFuncDesc p1);
	}

	private interface MultiArgMathFuncDesc {
		BigInteger getBinaryValue(BigInteger p0, BigInteger p1);

		double getBinaryValue(double p0, double p1);

		float getBinaryValue(float p0, float p1);

		int getBinaryValue(int p0, int p1);

		long getBinaryValue(long p0, long p1);

		SubLObject getNoArgValue();

		SubLObject getUnaryValue(SubLObject p0);
	}

	private static class MultiplicationDescription implements MultiArgMathFuncDesc {
		@Override
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			return val1.multiply(val2);
		}

		@Override
		public double getBinaryValue(double val1, double val2) {
			return val1 * val2;
		}

		@Override
		public float getBinaryValue(float val1, float val2) {
			return val1 * val2;
		}

		@Override
		public int getBinaryValue(int val1, int val2) {
			return val1 * val2;
		}

		@Override
		public long getBinaryValue(long val1, long val2) {
			return val1 * val2;
		}

		@Override
		public SubLObject getNoArgValue() {
			return CommonSymbols.ONE_INTEGER;
		}

		@Override
		public SubLObject getUnaryValue(SubLObject val) {
			return val;
		}
	}

	private static class SubtractionDescription implements MultiArgMathFuncDesc {
		@Override
		public BigInteger getBinaryValue(BigInteger val1, BigInteger val2) {
			return val1.subtract(val2);
		}

		@Override
		public double getBinaryValue(double val1, double val2) {
			return val1 - val2;
		}

		@Override
		public float getBinaryValue(float val1, float val2) {
			return val1 - val2;
		}

		@Override
		public int getBinaryValue(int val1, int val2) {
			return val1 - val2;
		}

		@Override
		public long getBinaryValue(long val1, long val2) {
			return val1 - val2;
		}

		@Override
		public SubLObject getNoArgValue() {
			throw new InvalidSubLExpressionException("Error: - got 0 args, wanted at least 1 arg.");
		}

		@Override
		public SubLObject getUnaryValue(SubLObject val) {
			return minus(val);
		}
	}

	private static SubLObject disassemble_integer_to_fixnums_recursive(SubLObject integer) {
		if (SubLNil.NIL != numE(integer, CommonSymbols.ZERO_INTEGER))
			return SubLNil.NIL;
		SubLObject least_significant_fixnum = bytes
				.ldb(bytes.sublisp_byte(CommonSymbols.EIGHT_INTEGER, CommonSymbols.ZERO_INTEGER), integer);
		SubLObject recursive_answer = disassemble_integer_to_fixnums_recursive(
				ash(integer, MINUS_EIGHT_INTEGER));
		return ConsesLow.cons(least_significant_fixnum, recursive_answer);
	}

	private static SubLObject logxorOnLongs(SubLObject[] integers) {
		int size = integers.length;
		SubLObject num = integers[0];
		if (num.isBigIntegerBignum())
			return Errors.unimplementedMethod("Implement me -- logxor on Bignums.");
		long result = num.longValue();
		for (int i = 1; i < size; ++i) {
			num = integers[i];
			if (num.isBigIntegerBignum())
				return Errors.unimplementedMethod("Implement me -- logxor on Bignums.");
			result ^= num.longValue();
		}
		return SubLObjectFactory.makeInteger(result);
	}

	private static SubLObject negate(SubLObject val) {
		return subtract(CommonSymbols.ZERO_INTEGER, val);
	}

	private static SubLObject processBinaryArgMathFunction(SubLObject arg1, SubLObject arg2,
			MultiArgMathFuncDesc mathFunc) {
		MathFuncProcessingByType processingClassByType = verifyAndProcessBinaryMathFunctionArgs(arg1, arg2, mathFunc);
		if (mathFunc == multiplicationDesc && processingClassByType != DOUBLE_PROCESSING_FUNC)
			processingClassByType = BIGINT_PROCESSING_FUNC;
		return processingClassByType.processMathFunc(arg1, arg2, mathFunc);
	}

	private static SubLObject processMultiArgMathFunction(SubLObject[] args, MultiArgMathFuncDesc mathFunc) {
		MathFuncProcessingByType processingClassByType = verifyAndProcessMathFunctionArgs(args, mathFunc);
		if (mathFunc == multiplicationDesc && processingClassByType != funcProcessing[3])
			processingClassByType = funcProcessing[2];
		int length = args.length;
		if (length < 2)
			return length == 0 ? mathFunc.getNoArgValue() : mathFunc.getUnaryValue(args[0]);
		return processingClassByType.processMathFunc(args, mathFunc);
	}

	private static MathFuncProcessingByType verifyAndProcessBinaryMathFunctionArgs(SubLObject arg1, SubLObject arg2,
			MultiArgMathFuncDesc mathFunc) {
		int size = Math.max(arg1.getNumSize(), arg2.getNumSize());
		switch (size) {
		case 0:
			return LONG_PROCESSING_FUNC;
		case 1:
			return LONG_PROCESSING_FUNC;
		case 2:
			return BIGINT_PROCESSING_FUNC;
		case 3:
			return DOUBLE_PROCESSING_FUNC;
		default:
			Errors.error("Don't know about number of size: " + size);
			return null;
		}
	}

	private static MathFuncProcessingByType verifyAndProcessMathFunctionArgs(SubLObject[] args,
			MultiArgMathFuncDesc mathFunc) {
		int minType = mathFunc == divisionDesc ? 3 : 0;
		int i = 0;
		int size = args.length;
		while (i < size) {
			SubLObject arg = args[i++];
			if (!arg.isNumber())
				throw new InvalidSubLExpressionException("'" + arg + "' is not of the expected type 'NUMBER'.");
			if (arg.isIntBignum())
				minType = 1 > minType ? 1 : minType;
			else if (arg.isLongBignum())
				minType = 1 > minType ? 1 : minType;
			else if (arg.isBigIntegerBignum())
				minType = 2 > minType ? 2 : minType;
			else {
				if (arg.isDouble())
					return funcProcessing[3];
				continue;
			}
		}
		return funcProcessing[minType];
	}

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
		return processMultiArgMathFunction(args, additionDesc);
	}

	public static SubLObject ash(SubLObject integer, SubLObject count) {
		if (integer == CommonSymbols.ZERO_INTEGER)
			return CommonSymbols.ZERO_INTEGER;
		if (count.isLongBignum() || count.isBigIntegerBignum())
			Errors.unimplementedMethod("ASH with a shift count > 32 bits.");
		int countInt = count.intValue();
		int maxBits = Math.abs(countInt) + Math.abs(integer_length(integer).intValue());
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
		long result2 = integerTyped;
		if (countTyped > 0L)
			result2 = integerTyped << (int) shiftAmount;
		else if (countTyped < 0L)
			result2 = integerTyped >> (int) shiftAmount;
		return SubLNumberFactory.makeInteger(result2);
	}

	public static SubLObject asin(SubLObject number) {
		return SubLNumberFactory.makeDouble(Math.asin(number.doubleValue()));
	}

	public static SubLObject assemble_fixnums_to_integer(SubLObject sign, SubLObject[] fixnums) {
		if (fixnums.length == 0)
			return SubLNumberFactory.makeInteger(0);
		int signTyped = minusp(sign) == CommonSymbols.T ? -1 : 1;
		if (fixnums.length < 8) {
			long value = 0L;
			for (int i = fixnums.length - 1; i >= 0; --i) {
				SubLObject fixnum = fixnums[i];
				SubLFixnum fixnumTyped = (SubLFixnum) fixnum;
				int fixnumValue = fixnumTyped.intValue();
				int byteValue = fixnumValue & 0xFF;
				long shiftedValue = value << 8;
				value = byteValue + shiftedValue;
			}
			long result = signTyped < 0 ? -value : value;
			return SubLNumberFactory.makeInteger(result);
		}
		byte[] magnitude = new byte[fixnums.length];
		for (int j = fixnums.length - 1; j >= 0; --j) {
			SubLObject fixnum2 = fixnums[j];
			SubLFixnum fixnumTyped2 = (SubLFixnum) fixnum2;
			int fixnumValue2 = fixnumTyped2.intValue();
			int unsignedByteValue = fixnumValue2 & 0xFF;
			byte signedByteValue = (byte) unsignedByteValue;
			magnitude[fixnums.length - 1 - j] = signedByteValue;
		}
		BigInteger integer = new BigInteger(signTyped, magnitude);
		return SubLNumberFactory.makeInteger(integer);
	}

	public static SubLObject atan(SubLObject number1, SubLObject number2) {
		if (number2 == SubLNil.NIL || number2 == CommonSymbols.UNPROVIDED)
			return SubLNumberFactory.makeDouble(Math.atan(number1.doubleValue()));
		return SubLNumberFactory.makeDouble(Math.atan2(number1.doubleValue(), number2.doubleValue()));
	}

	public static SubLObject boole(SubLObject op, SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("boole()");
	}

	public static SubLObject ceiling(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		int signNum = num.isNegative() ? -1 : 1;
		int signDivisor = divisor.isNegative() ? -1 : 1;
		SubLObject quotient = truncate(num, divisor);
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
		return Errors.unimplementedMethod("decode_float()");
	}

	public static SubLObject disassemble_integer_to_fixnums(SubLObject integer) {
		if (!integer.isInteger())
			Errors.error("Expected an integer instead got: " + integer);
		SubLObject sign = CommonSymbols.ONE_INTEGER;
		if (SubLNil.NIL != minusp(integer)) {
			sign = CommonSymbols.MINUS_ONE_INTEGER;
			integer = abs(integer);
		}
		return ConsesLow.cons(sign, disassemble_integer_to_fixnums_recursive(integer));
	}

	public static SubLObject divide(SubLObject numerator, SubLObject denominator) {
		if (!numerator.isFixnum() || !denominator.isFixnum()) {
			if (denominator.eql(CommonSymbols.ZERO_INTEGER) || denominator.eql(ZERO_FLOAT)
					|| denominator.eql(CommonSymbols.ZERO_DOUBLE))
				Errors.error("Attempt to divide " + numerator + " by 0.");
			SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
			args[0] = numerator;
			args[1] = denominator;
			return divide(args);
		}
		if (denominator == CommonSymbols.ZERO_INTEGER)
			Errors.error("Attempt to divide " + numerator + " by 0.");
		double result = numerator.doubleValue() / denominator.doubleValue();
		if (result == Math.round(result))
			return SubLNumberFactory.makeInteger((long) result);
		return SubLNumberFactory.makeDouble(result);
	}

	public static SubLObject divide(SubLObject num, SubLObject[] numbers) {
		if (numbers.length == 0)
			return divide(CommonSymbols.ONE_INTEGER, num);
		SubLObject dividend = num;
		for (SubLObject divisor : numbers)
			dividend = divide(dividend, divisor);
		return dividend;
	}

	public static SubLObject divide(SubLObject[] args) {
		if (args.length == 0)
			Errors.error("Unexpected call to divide with 0 arguments.");
		if (args.length == 1)
			return divide(CommonSymbols.ONE_INTEGER, args[0]);
		if (!args[0].isFixnum() || !args[1].isFixnum())
			return processMultiArgMathFunction(args, divisionDesc);
		SubLObject numerator = args[0];
		SubLObject denominator = args[1];
		if (denominator == CommonSymbols.ZERO_INTEGER)
			Errors.error("Illegal attempt to divide by 0.");
		double result = numerator.doubleValue() / denominator.doubleValue();
		if (result == Math.round(result))
			return SubLNumberFactory.makeInteger((long) result);
		return SubLNumberFactory.makeDouble(result);
	}

	public static SubLObject evenp(SubLObject num) {
		if (!num.isInteger())
			return SubLNil.NIL;
		return num.toInteger().isEven() ? RET_T : SubLNil.NIL;
	}

	public static SubLObject exp(SubLObject number) {
		return expt($e$.getGlobalValue(), number);
	}

	public static SubLObject expt(SubLObject base, SubLObject power) {
		if (base.isInteger() && power.isInteger() && power.doubleValue() >= 0.0) {
			long baseTyped = base.longValue();
			long powerTyped = power.longValue();
			if (powerTyped > 2147483647L)
				return Errors.error(
						SubLObjectFactory.makeString(
								"Cannot raise ~A to ~A; power is larger than implementation limit ~A for integers."),
						base, power, SubLNumberFactory.makeInteger(Integer.MAX_VALUE));
			BigInteger bigBase = new BigInteger(String.valueOf(baseTyped));
			BigInteger result = bigBase.pow((int) powerTyped);
			return SubLNumberFactory.makeInteger(result);
		} else {
			double baseTyped2 = base.doubleValue();
			double powerTyped2 = power.doubleValue();
			if (baseTyped2 == 0.0 && powerTyped2 < 0.0)
				return Errors.error(SubLObjectFactory.makeString("Error: Attempt to raise 0 to non-positive power."));
			double result2 = Math.pow(baseTyped2, powerTyped2);
			return SubLNumberFactory.makeDouble(result2);
		}
	}

	public static SubLObject fixnumMultiply(SubLObject fixnum1, SubLObject fixnum2) {
		return SubLNumberFactory
				.makeInteger(truncateToFixnum(fixnum1.toFixnum().longValue() * fixnum2.toFixnum().longValue()));
	}

	public static SubLObject float_digits(SubLObject theFloat) {
		return FLOAT_DIGITS;
	}

	public static SubLObject float_radix(SubLObject theFloat) {
		return CommonSymbols.TWO_INTEGER;
	}

	public static SubLObject float_sign(SubLObject float1, SubLObject float2) {
		if (float2 == CommonSymbols.UNPROVIDED)
			float2 = SubLNumberFactory.makeDouble(1.0);
		double float1Typed = float1.doubleValue();
		double float2Typed = float2.doubleValue();
		double result = Math.abs(float2Typed) * (float1Typed < 0.0 ? -1.0 : 1.0);
		return SubLNumberFactory.makeDouble(result);
	}

	public static SubLObject floor(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		int signNum = num.isNegative() ? -1 : 1;
		int signDivisor = divisor.isNegative() ? -1 : 1;
		SubLObject quotient = truncate(num, divisor);
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
		return add(val, CommonSymbols.ONE_INTEGER);
	}

	public static SubLObject infinity_p(SubLObject object) {
		if (object.isDouble())
			return SubLObjectFactory.makeBoolean(Double.isInfinite(object.doubleValue()));
		return SubLNil.NIL;
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
		if (zerop(integerTyped) == CommonSymbols.T)
			return SubLNumberFactory.makeInteger(0);
		if (integer.isBigIntegerBignum()) {
			BigInteger bigIntTyped = integer.bigIntegerValue();
			int result = bigIntTyped.bitLength();
			return SubLNumberFactory.makeInteger(result);
		}
		long originalValue = integerTyped.longValue();
		long workValue = Math.abs(originalValue);
		int index = Arrays.binarySearch(INTEGER_LENGTH_TABLE, workValue);
		if (index == INTEGER_LENGTH_TABLE.length)
			return SubLNumberFactory.makeInteger(index);
		if (index < 0) {
			int insertPosition = Math.abs(index + 1);
			int length = insertPosition - 1;
			return SubLNumberFactory.makeInteger(Math.abs(length));
		}
		if (INTEGER_LENGTH_TABLE[index] == workValue)
			return SubLNumberFactory.makeInteger(index);
		return SubLNumberFactory.makeInteger(index + 1);
	}

	public static SubLObject integerDivide(SubLObject num1, SubLObject num2) {
		num1.toInteger();
		num2.toInteger();
		return truncate(num1, num2);
	}

	public static SubLObject invert(SubLObject number) {
		return divide(CommonSymbols.ONE_INTEGER, number);
	}

	public static SubLObject isqrt(SubLObject number) {
		number.enforceType(CommonSymbols.INTEGERP);
		return Values.values(floor(sqrt(number), CommonSymbols.ONE_INTEGER));
	}

	public static SubLObject jrtl_parse_integer(SubLObject string, SubLObject start, SubLObject end, SubLObject radix) {
		int startTyped = start.intValue();
		int endTyped = end.intValue();
		int radixTyped = radix.intValue();
		String stringTyped = string.getStringValue();
		String substring = stringTyped.substring(startTyped, endTyped);
		SubLInteger result = SubLNumberFactory.makeInteger(substring, radixTyped);
		return Values.values(result, SubLNumberFactory.makeInteger(substring.length()));
	}

	public static SubLObject keyhashScaleNumber(SubLObject fixnum1, SubLObject fixnum2, SubLObject mask) {
		long num1 = fixnum1.intValue();
		long num2 = fixnum2.intValue();
		long msk = mask.intValue();
		return SubLNumberFactory.makeInteger((num1 & msk) * num2 & msk);
	}

	public static SubLObject log(SubLObject number, SubLObject base) {
		if (base == CommonSymbols.UNPROVIDED)
			base = E_FLOAT;
		if (base == E_FLOAT) {
			double result = Math.log(number.doubleValue());
			return SubLNumberFactory.makeDouble(result);
		}
		double result2 = Math.log(number.doubleValue());
		double result3 = Math.log(base.doubleValue());
		double result4 = result2 / result3;
		return SubLNumberFactory.makeDouble(result4);
	}

	public static SubLObject logand(SubLObject arg1, SubLObject arg2) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
		args[0] = arg1;
		args[1] = arg2;
		return logand(args);
	}

	public static SubLObject logand(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		return logand(args);
	}

	public static SubLObject logand(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize4;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		args[3] = arg4;
		return logand(args);
	}

	public static SubLObject logand(SubLObject[] integers) {
		int size = integers.length;
		if (size == 0)
			return CommonSymbols.MINUS_ONE_INTEGER;
		long result = integers[0].longValue();
		for (int i = 1; i < size; ++i)
			result &= integers[i].longValue();
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject logandc1(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("logandc1()");
	}

	public static SubLObject logandc2(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("logandc2()");
	}

	public static SubLObject logbitp(SubLObject index, SubLObject integer) {
		return Errors.unimplementedMethod("logbitp()");
	}

	public static SubLObject logcount(SubLObject integer) {
		return Errors.unimplementedMethod("logcount()");
	}

	public static SubLObject logeqv(SubLObject[] integers) {
		return Errors.unimplementedMethod("logeqv()");
	}

	public static SubLObject logior(SubLObject arg1, SubLObject arg2) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
		args[0] = arg1;
		args[1] = arg2;
		return logior(args);
	}

	public static SubLObject logior(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		return logior(args);
	}

	public static SubLObject logior(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize4;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		args[3] = arg4;
		return logior(args);
	}

	public static SubLObject logior(SubLObject[] integers) {
		int size = integers.length;
		if (size == 0)
			return CommonSymbols.MINUS_ONE_INTEGER;
		long result = integers[0].longValue();
		for (int i = 1; i < size; ++i)
			result |= integers[i].longValue();
		return SubLNumberFactory.makeInteger(result);
	}

	public static SubLObject lognand(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("lognand()");
	}

	public static SubLObject lognor(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("lognor()");
	}

	public static SubLObject lognot(SubLObject integer) {
		if (integer.isBigIntegerBignum())
			Errors.unimplementedMethod("LOGNOT -- on Bignums");
		long integerTyped = integer.longValue();
		integerTyped ^= -1L;
		return SubLNumberFactory.makeInteger(integerTyped);
	}

	public static SubLObject logorc1(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("logorc1()");
	}

	public static SubLObject logorc2(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("logorc2()");
	}

	public static SubLObject logtest(SubLObject integer1, SubLObject integer2) {
		return Errors.unimplementedMethod("logtest()");
	}

	public static SubLObject logxor(SubLObject arg1, SubLObject arg2) {
		if (arg1.isFixnum() && arg2.isFixnum())
			return SubLNumberFactory.makeInteger(truncateToFixnum(arg1.intValue() ^ arg2.intValue()));
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
		args[0] = arg1;
		args[1] = arg2;
		return logxor(args);
	}

	public static SubLObject logxor(SubLObject arg1, SubLObject arg2, SubLObject arg3) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		return logxor(args);
	}

	public static SubLObject logxor(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize4;
		args[0] = arg1;
		args[1] = arg2;
		args[2] = arg3;
		args[3] = arg4;
		return logxor(args);
	}

	public static SubLObject logxor(SubLObject[] integers) {
		int size = integers.length;
		if (size == 0)
			return CommonSymbols.MINUS_ONE_INTEGER;
		SubLObject num = integers[0];
		if (!num.isFixnum())
			return logxorOnLongs(integers);
		int result = num.toFixnum().intValue();
		for (int i = 1; i < size; ++i) {
			num = integers[i];
			if (!num.isFixnum())
				return logxorOnLongs(integers);
			result ^= num.toFixnum().intValue();
		}
		return SubLObjectFactory.makeInteger(truncateToFixnum(result));
	}

	public static void main(String[] args) {
	}

	public static SubLObject max(SubLObject num1, SubLObject num2) {
		return num1.numG(num2) ? num1 : num2;
	}

	public static SubLObject max(SubLObject number, SubLObject[] numbers) {
		if (numbers.length == 0)
			return number.toNumber();
		SubLObject newMax = number;
		for (int i = 0, size = numbers.length; i < size; ++i) {
			SubLObject currentNum = numbers[i];
			if (SubLNil.NIL != numG(currentNum, newMax))
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
		for (int i = 0, size = numbers.length; i < size; ++i) {
			SubLObject currentNum = numbers[i];
			if (SubLNil.NIL != numL(currentNum, newMin))
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
		if (!num.isNumber())
			return SubLNil.NIL;
		return num.isNegative() ? RET_T : SubLNil.NIL;
	}

	public static SubLObject mod(SubLObject number, SubLObject divisor) {
		floor(number, divisor);
		return Values.secondMultipleValue();
	}

	public static SubLObject multiply(SubLObject num1, SubLObject num2) {
		return num1.mult(num2);
	}

	public static SubLObject multiply(SubLObject num1, SubLObject num2, SubLObject num3) {
		return num1.mult(num2).mult(num3);
	}

	public static SubLObject multiply(SubLObject[] args) {
		return processMultiArgMathFunction(args, multiplicationDesc);
	}

	public static SubLObject not_a_number_p(SubLObject object) {
		if (object.isDouble())
			return SubLObjectFactory.makeBoolean(Double.isNaN(object.doubleValue()));
		return SubLNil.NIL;
	}

	public static SubLObject numE(SubLObject num1, SubLObject num2) {
		return num1.numE(num2) ? RET_T : SubLNil.NIL;
	}

	public static SubLObject numG(SubLObject num1, SubLObject num2) {
		return num1.numG(num2) ? RET_T : SubLNil.NIL;
	}

	public static SubLObject numGE(SubLObject num1, SubLObject num2) {
		return num1.numGE(num2) ? RET_T : SubLNil.NIL;
	}

	public static SubLObject numL(SubLObject num1, SubLObject num2) {
		return num1.numL(num2) ? RET_T : SubLNil.NIL;
	}

	public static SubLObject numLE(SubLObject num1, SubLObject num2) {
		return num1.numLE(num2) ? RET_T : SubLNil.NIL;
	}

	public static SubLObject numNE(SubLObject num1, SubLObject num2) {
		return num1.numE(num2) ? SubLNil.NIL : RET_T;
	}

	public static SubLObject oddp(SubLObject num) {
		if (!num.isInteger())
			return SubLNil.NIL;
		return num.toInteger().isOdd() ? RET_T : SubLNil.NIL;
	}

	public static SubLObject plusp(SubLObject num) {
		if (!num.isNumber())
			return SubLNil.NIL;
		return num.isPositive() ? RET_T : SubLNil.NIL;
	}

	public static SubLObject rem(SubLObject number, SubLObject divisor) {
		truncate(number, divisor);
		return Values.secondMultipleValue();
	}

	public static SubLObject round(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		SubLObject quotient = truncate(num, divisor);
		SubLObject remainder = Values.secondMultipleValue();
		double tempRemainder = Math.abs(remainder.doubleValue() / divisor.doubleValue());
		if (tempRemainder >= 0.5)
			if (tempRemainder != 0.5 || SubLNil.NIL != oddp(quotient)) {
				if (quotient.isZero() && !remainder.isNegative() || !quotient.isZero() && !quotient.isNegative()) {
					quotient = quotient.add(CommonSymbols.ONE_INTEGER);
					remainder = remainder.sub(divisor);
				} else {
					quotient = quotient.sub(CommonSymbols.ONE_INTEGER);
					remainder = remainder.add(divisor);
				}
				if (Math.abs(remainder.doubleValue()) > Math.abs(divisor.doubleValue())) {
					quotient = floor(num, divisor);
					remainder = Values.secondMultipleValue();
				}
			}
		return Values.values(quotient, remainder);
	}

	public static SubLObject scale_float(SubLObject theFloat, SubLObject power) {
		double theFloatTyped = theFloat.doubleValue();
		long powerTyped = power.longValue();
		double result = theFloatTyped * Math.pow(float_radix(ZERO_FLOAT).doubleValue(), powerTyped);
		return SubLNumberFactory.makeDouble(result);
	}

	public static SubLObject sin(SubLObject radians) {
		return SubLObjectFactory.makeDouble(Math.sin(radians.doubleValue()));
	}

	public static SubLObject sqrt(SubLObject number) {
		if (CommonSymbols.ZERO_INTEGER.numG(number))
			return Errors.error("Can only take square-root of non-negative numbers");
		if (number.isBigIntegerBignum())
			return Errors.unimplementedMethod("SQRT -- on BIGNUMS: " + number);
		double result = Math.sqrt(number.doubleValue());
		if (number.isInteger() && Math.round(result) == result)
			return SubLNumberFactory.makeInteger((long) result);
		return SubLNumberFactory.makeDouble(result);
	}

	public static SubLObject sublisp_float(SubLObject number, SubLObject prototype) {
		return SubLNumberFactory.makeDouble(number.doubleValue());
	}

	public static SubLObject subtract(SubLObject num1, SubLObject num2) {
		return num1.sub(num2);
	}

	public static SubLObject subtract(SubLObject num1, SubLObject num2, SubLObject num3) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
		args[0] = num1;
		args[1] = num2;
		args[2] = num3;
		return processMultiArgMathFunction(args, subtractionDesc);
	}

	public static SubLObject subtract(SubLObject num, SubLObject[] numbers) {
		if (numbers.length == 0)
			return minus(num);
		return num.sub(add(numbers));
	}

	public static SubLObject subtract(SubLObject[] args) {
		return processMultiArgMathFunction(args, subtractionDesc);
	}

	public static SubLObject tan(SubLObject radians) {
		return SubLObjectFactory.makeDouble(Math.tan(radians.doubleValue()));
	}

	public static SubLObject truncate(SubLObject num, SubLObject divisor) {
		if (divisor == CommonSymbols.UNPROVIDED)
			divisor = CommonSymbols.ONE_INTEGER;
		if (divisor.isZero())
			Errors.error("Division by zero.");
		if (num.getNumSize() <= 1 && divisor.getNumSize() <= 1) {
			long numTyped = num.longValue();
			long divTyped = divisor.longValue();
			long remainder = numTyped % divTyped;
			long quotient = (numTyped - remainder) / divTyped;
			return Values.values(SubLNumberFactory.makeInteger(quotient), SubLNumberFactory.makeInteger(remainder));
		}
		if (!num.isBigIntegerBignum() && !divisor.isBigIntegerBignum()) {
			double numTyped2 = num.doubleValue();
			double divTyped2 = divisor.doubleValue();
			double remainder2 = numTyped2 % divTyped2;
			double quotient2 = (numTyped2 - remainder2) / divTyped2;
			Values.resetMultipleValues();
			return Values.values(SubLNumberFactory.makeInteger((long) quotient2),
					SubLNumberFactory.makeDouble(remainder2));
		}
		if (num.isDouble() || divisor.isDouble()) {
			Errors.unimplementedMethod(
					"truncate(" + num + ", " + divisor + ") on big integer bignums and floats.");
			return CommonSymbols.ZERO_INTEGER;
		}
		BigInteger numTyped3 = num.bigIntegerValue();
		BigInteger divTyped3 = divisor.bigIntegerValue();
		BigInteger remainder3 = numTyped3.remainder(divTyped3);
		BigInteger quotient3 = numTyped3.subtract(remainder3).divide(divTyped3);
		return Values.values(SubLNumberFactory.makeInteger(quotient3), SubLNumberFactory.makeInteger(remainder3));
	}

	public static int truncateToFixnum(int number) {
		int result = 0;
		if (number >= 0)
			result = number & SubLNumberFactory.MAX_FIXNUM;
		else
			result = number | SubLNumberFactory.MIN_FIXNUM;
		return result;
	}

	public static int truncateToFixnum(long number) {
		long result = 0L;
		if (number >= 0L)
			result = number & SubLNumberFactory.MAX_FIXNUM;
		else
			result = number | SubLNumberFactory.MIN_FIXNUM;
		return (int) result;
	}

	public static SubLObject zerop(SubLObject num) {
		if (!num.isNumber())
			return SubLNil.NIL;
		return num.isZero() ? RET_T : SubLNil.NIL;
	}

	public static Numbers me;
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
	public static SubLFloat E_FLOAT;
	public static SubLSymbol $e$;
	public static SubLFloat PI_FLOAT;
	public static SubLSymbol $pi$;
	//private static SubLObject RET_T;
	public static SubLInteger FLOAT_DIGITS;
	public static SubLDoubleFloat ZERO_FLOAT;
	private static SubLFixnum MINUS_EIGHT_INTEGER;
	private static long[] INTEGER_LENGTH_TABLE;
	private static int INTEGER_TYPE_CONST = 0;
	private static int LONG_INTEGER_TYPE_CONST = 1;
	private static int BIG_INTEGER_TYPE_CONST = 2;
	private static int DOUBLE_FLOAT_TYPE_CONST = 3;
	private static int INVALID_NUMBER_TYPE_CONST = 4;
	private static MathFuncProcessingByType[] funcProcessing;
	private static MathFuncProcessingByType INTEGER_PROCESSING_FUNC;
	private static MathFuncProcessingByType LONG_PROCESSING_FUNC;
	private static MathFuncProcessingByType BIGINT_PROCESSING_FUNC;
	private static MathFuncProcessingByType DOUBLE_PROCESSING_FUNC;
	private static MultiArgMathFuncDesc additionDesc;
	private static MultiArgMathFuncDesc subtractionDesc;
	private static MultiArgMathFuncDesc multiplicationDesc;
	private static MultiArgMathFuncDesc divisionDesc;
	static {
		me = new Numbers();
		E_FLOAT = SubLObjectFactory.makeDouble(2.718281828459045);
		PI_FLOAT = SubLObjectFactory.makeDouble(3.141592653589793);
		//RET_T = CommonSymbols.T;
		FLOAT_DIGITS = SubLNumberFactory.makeInteger(53);
		ZERO_FLOAT = SubLNumberFactory.makeDouble(0.0);
		MINUS_EIGHT_INTEGER = (SubLFixnum) SubLObjectFactory.makeInteger(-8);
		INTEGER_LENGTH_TABLE = new long[] { 0L, 1L, 2L, 4L, 8L, 16L, 32L, 64L, 128L, 256L, 512L, 1024L, 2048L, 4096L,
				8192L, 16384L, 32768L, 65536L, 131072L, 262144L, 524288L, 1048576L, 2097152L, 4194304L, 8388608L,
				16777216L, 33554432L, 67108864L, 134217728L, 268435456L, 536870912L, 1073741824L, 2147483648L,
				4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L,
				549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L,
				35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L,
				1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L,
				36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L,
				1152921504606846976L, 2305843009213693952L, 4611686018427387904L };
		funcProcessing = new MathFuncProcessingByType[] { new IntegerMathFuncProcessingFunc(),
				new LongMathFuncProcessingFunc(), new BigIntMathFuncProcessingFunc(),
				new DoubleMathFuncProcessingFunc() };
		INTEGER_PROCESSING_FUNC = funcProcessing[0];
		LONG_PROCESSING_FUNC = funcProcessing[1];
		BIGINT_PROCESSING_FUNC = funcProcessing[2];
		DOUBLE_PROCESSING_FUNC = funcProcessing[3];
		additionDesc = new AdditionDescription();
		subtractionDesc = new SubtractionDescription();
		multiplicationDesc = new MultiplicationDescription();
		divisionDesc = new DivisionDescription();
	}

	@Override
	public void declareFunctions() {
		SubLFiles.declareFunction(me, "not_a_number_p", "NOT-A-NUMBER-P", 1, 0, false);
		SubLFiles.declareFunction(me, "infinity_p", "INFINITY-P", 1, 0, false);
		SubLFiles.declareFunction(me, "add", "+", 0, 0, true);
		SubLFiles.declareFunction(me, "subtract", "-", 1, 0, true);
		SubLFiles.declareFunction(me, "multiply", "*", 0, 0, true);
		SubLFiles.declareFunction(me, "divide", "/", 1, 0, true);
		SubLFiles.declareFunction(me, "integerDivide", "INT/", 2, 0, false);
		SubLFiles.declareFunction(me, "mod", "MOD", 2, 0, false);
		SubLFiles.declareFunction(me, "rem", "REM", 2, 0, false);
		SubLFiles.declareFunction(me, "expt", "EXPT", 2, 0, false);
		SubLFiles.declareFunction(me, "log", "LOG", 1, 1, false);
		SubLFiles.declareFunction(me, "abs", "ABS", 1, 0, false);
		SubLFiles.declareFunction(me, "max", "MAX", 1, 0, true);
		SubLFiles.declareFunction(me, "min", "MIN", 1, 0, true);
		SubLFiles.declareFunction(me, "sublisp_float", "FLOAT", 1, 1, false);
		SubLFiles.declareFunction(me, "scale_float", "SCALE-FLOAT", 2, 0, false);
		SubLFiles.declareFunction(me, "integer_decode_float", "INTEGER-DECODE-FLOAT", 1, 0, false);
		SubLFiles.declareFunction(me, "numE", "=", 2, 0, false);
		SubLFiles.declareFunction(me, "numG", ">", 2, 0, false);
		SubLFiles.declareFunction(me, "numL", "<", 2, 0, false);
		SubLFiles.declareFunction(me, "numGE", ">=", 2, 0, false);
		SubLFiles.declareFunction(me, "numLE", "<=", 2, 0, false);
		SubLFiles.declareFunction(me, "oddp", "ODDP", 1, 0, false);
		SubLFiles.declareFunction(me, "evenp", "EVENP", 1, 0, false);
		SubLFiles.declareFunction(me, "plusp", "PLUSP", 1, 0, false);
		SubLFiles.declareFunction(me, "zerop", "ZEROP", 1, 0, false);
		SubLFiles.declareFunction(me, "minusp", "MINUSP", 1, 0, false);
		SubLFiles.declareFunction(me, "ash", "ASH", 2, 0, false);
		SubLFiles.declareFunction(me, "lognot", "LOGNOT", 1, 0, false);
		SubLFiles.declareFunction(me, "logand", "LOGAND", 0, 0, true);
		SubLFiles.declareFunction(me, "logior", "LOGIOR", 0, 0, true);
		SubLFiles.declareFunction(me, "ceiling", "CEILING", 1, 1, false);
		SubLFiles.declareFunction(me, "floor", "FLOOR", 1, 1, false);
		SubLFiles.declareFunction(me, "round", "ROUND", 1, 1, false);
		SubLFiles.declareFunction(me, "truncate", "TRUNCATE", 1, 1, false);
		SubLFiles.declareFunction(me, "float_radix", "FLOAT-RADIX", 1, 0, false);
		SubLFiles.declareFunction(me, "float_digits", "FLOAT-DIGITS", 1, 0, false);
		SubLFiles.declareFunction(me, "float_sign", "FLOAT-SIGN", 1, 1, false);
		SubLFiles.declareFunction(me, "numNE", "/=", 2, 0, false);
		SubLFiles.declareFunction(me, "acos", "ACOS", 1, 0, false);
		SubLFiles.declareFunction(me, "asin", "ASIN", 1, 0, false);
		SubLFiles.declareFunction(me, "assemble_fixnums_to_integer", "ASSEMBLE-FIXNUMS-TO-INTEGER", 1, 0, true);
		SubLFiles.declareFunction(me, "atan", "ATAN", 1, 1, false);
		SubLFiles.declareFunction(me, "boole", "BOOLE", 3, 0, false);
		SubLFiles.declareFunction(me, "cos", "COS", 1, 0, false);
		SubLFiles.declareFunction(me, "decode_float", "DECODE-FLOAT", 1, 0, false);
		SubLFiles.declareFunction(me, "disassemble_integer_to_fixnums", "DISASSEMBLE-INTEGER-TO-FIXNUMS", 1, 0,
				false);
		SubLFiles.declareFunction(me, "exp", "EXP", 1, 0, false);
		SubLFiles.declareFunction(me, "integer_length", "INTEGER-LENGTH", 1, 0, false);
		SubLFiles.declareFunction(me, "isqrt", "ISQRT", 1, 0, false);
		SubLFiles.declareFunction(me, "jrtl_parse_integer", "JRTL-PARSE-INTEGER", 4, 0, false);
		SubLFiles.declareFunction(me, "logandc1", "LOGANDC1", 2, 0, false);
		SubLFiles.declareFunction(me, "logandc2", "LOGANDC2", 2, 0, false);
		SubLFiles.declareFunction(me, "logbitp", "LOGBITP", 2, 0, false);
		SubLFiles.declareFunction(me, "logcount", "LOGCOUNT", 1, 0, false);
		SubLFiles.declareFunction(me, "logeqv", "LOGEQV", 0, 0, true);
		SubLFiles.declareFunction(me, "lognand", "LOGNAND", 2, 0, false);
		SubLFiles.declareFunction(me, "lognor", "LOGNOR", 2, 0, false);
		SubLFiles.declareFunction(me, "logorc1", "LOGORC1", 2, 0, false);
		SubLFiles.declareFunction(me, "logorc2", "LOGORC2", 2, 0, false);
		SubLFiles.declareFunction(me, "logtest", "LOGTEST", 2, 0, false);
		SubLFiles.declareFunction(me, "logxor", "LOGXOR", 0, 0, true);
		SubLFiles.declareFunction(me, "sin", "SIN", 1, 0, false);
		SubLFiles.declareFunction(me, "sqrt", "SQRT", 1, 0, false);
		SubLFiles.declareFunction(me, "tan", "TAN", 1, 0, false);
		SubLFiles.declareFunction(me, "fixnumMultiply", "FIXNUM*", 2, 0, false);
	}

	@Override
	public void initializeVariables() {
		$double_float_minimum_exponent$ = SubLFiles.defconstant(me, "*DOUBLE-FLOAT-MINIMUM-EXPONENT*",
				SubLObjectFactory.makeInteger(-1074));
		$e$ = SubLFiles.defconstant(me, "*E*", E_FLOAT);
		$pi$ = SubLFiles.defconstant(me, "*PI*", PI_FLOAT);
		$most_negative_fixnum$ = SubLFiles.defconstant(me, "*MOST-NEGATIVE-FIXNUM*",
				SubLObjectFactory.makeInteger(SubLNumberFactory.MIN_FIXNUM));
		$most_positive_fixnum$ = SubLFiles.defconstant(me, "*MOST-POSITIVE-FIXNUM*",
				SubLObjectFactory.makeInteger(SubLNumberFactory.MAX_FIXNUM));
		$exp1$ = SubLFiles.defconstant(me, "*EXP1*", SubLObjectFactory.makeDouble(2.718281828459045));
		$boole_clr$ = SubLFiles.defconstant(me, "BOOLE-CLR", CommonSymbols.ZERO_INTEGER);
		$boole_set$ = SubLFiles.defconstant(me, "BOOLE-SET", CommonSymbols.ONE_INTEGER);
		$boole_1$ = SubLFiles.defconstant(me, "BOOLE-1", CommonSymbols.TWO_INTEGER);
		$boole_2$ = SubLFiles.defconstant(me, "BOOLE-2", CommonSymbols.THREE_INTEGER);
		$boole_c1$ = SubLFiles.defconstant(me, "BOOLE-C1", CommonSymbols.FOUR_INTEGER);
		$boole_c2$ = SubLFiles.defconstant(me, "BOOLE-C2", CommonSymbols.FIVE_INTEGER);
		$boole_and$ = SubLFiles.defconstant(me, "BOOLE-AND", CommonSymbols.SIX_INTEGER);
		$boole_ior$ = SubLFiles.defconstant(me, "BOOLE-IOR", CommonSymbols.SEVEN_INTEGER);
		$boole_eqv$ = SubLFiles.defconstant(me, "BOOLE-EQV", CommonSymbols.NINE_INTEGER);
		$boole_nand$ = SubLFiles.defconstant(me, "BOOLE-NAND", CommonSymbols.TEN_INTEGER);
		$boole_nor$ = SubLFiles.defconstant(me, "BOOLE-NOR", CommonSymbols.ELEVEN_INTEGER);
		$boole_xor$ = SubLFiles.defconstant(me, "BOOLE-XOR", CommonSymbols.EIGHT_INTEGER);
		$boole_andc1$ = SubLFiles.defconstant(me, "BOOLE-ANDC1", CommonSymbols.TWELVE_INTEGER);
		$boole_andc2$ = SubLFiles.defconstant(me, "BOOLE-ANDC2", CommonSymbols.THIRTEEN_INTEGER);
		$boole_orc1$ = SubLFiles.defconstant(me, "BOOLE-ORC1", CommonSymbols.FOURTEEN_INTEGER);
		$boole_orc2$ = SubLFiles.defconstant(me, "BOOLE-ORC2", CommonSymbols.FIFTEEN_INTEGER);
	}

	@Override
	public void runTopLevelForms() {
	}
}

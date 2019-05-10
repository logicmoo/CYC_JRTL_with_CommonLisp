package org.jpl7;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

import org.jpl7.fli.Prolog;
import org.jpl7.fli.term_t;

/**
 * Double is a specialised Term representing a Prolog double value; if the value fits, it is held in a double field,
 * else as a BigDecimal.
 *
 * <pre>
 * Double i = new Double(1024);
 * </pre>
 *
 * Once constructed, the value of an Double instance cannot be altered. An Double can be used (and re-used) as an
 * argument of Compounds. Beware confusing jpl.Double with java.lang.Double.
 *
 * <hr>
 * Copyright (C) 2004 Paul Singleton
 * <p>
 * Copyright (C) 1998 Fred Dushin
 * <p>
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the
 * following conditions are met:
 *
 * <ol>
 * <li>Redistributions of source code must retain the above copyright notice, this list of conditions and the following
 * disclaimer.
 *
 * <li>Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the
 * following disclaimer in the documentation and/or other materials provided with the distribution.
 * </ol>
 *
 * <p>
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES,
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * <hr>
 *
 * @see org.jpl7.Term
 * @see org.jpl7.Compound
 */
public class Float extends Term
{
	private static BigDecimal BIG_MIN_LONG = BigDecimal.valueOf(java.lang.Double.MIN_VALUE);
	private static BigDecimal BIG_MAX_LONG = BigDecimal.valueOf(java.lang.Double.MAX_VALUE);

	public final Number toJavaObject()
	{
		if (bigValue == null)
		{
			return value;
		}
		else
		{
			return bigValue;
		}
	}

	/**
	 * the Double's immutable double value, iff small enough
	 */
	protected final double value;

	/**
	 * the Double's immutable BigDecimal value, iff too big for a double, else null
	 */
	protected final BigDecimal bigValue;

	/**
	 * @param value
	 *            This Double's intended (double) value
	 */
	public Float(double value)
	{
		this.bigValue = null; // value fits in a double
		this.value = value;
	}

	/**
	 * @param value
	 *            This Double's intended (BigDecimal) value
	 */
	public Float(BigDecimal value)
	{
		if (value == null)
		{
			throw new NullPointerException();
		}
		else if (value.compareTo(BIG_MIN_LONG) >= 0 && value.compareTo(BIG_MAX_LONG) <= 0)
		{
			// i.e. BIG_MIN_LONG =< value =< BIG_MAX_LONG
			this.bigValue = null; // value nevertheless fits in a double
			this.value = value.longValue();
		}
		else
		{
			this.bigValue = value;
			this.value = Double.NaN; // undefined, but 0 by convention, iff bigValue !=  null
		}
	}

	@Override
	public Term[] args()
	{
		return new Term[] {};
	}

	/**
	 * Returns the value of this Double as a java.math.BigDecimal, whether or not it fits in a double
	 *
	 * @return the value of this Double as a java.math.BigDecimal, whether or not it fits in a double
	 */
	public final BigDecimal bigFloatValue()
	{
		if (bigValue == null)
		{
			// cannot construct directly from a double
			return new BigDecimal(Double.toString(value));
		}
		else
		{
			return bigValue;
		}
	}

	@Override
	public final BigInteger bigValue()
	{
		return bigFloatValue().toBigInteger();
	}

	/**
	 * Returns the value of this Double converted to a double (perhaps Double.NEGATIVE_INFINITY or
	 * Double.POSITIVE_INFINITY)
	 *
	 * @return the value of this Double converted to a double (perhaps Double.NEGATIVE_INFINITY or
	 *         Double.POSITIVE_INFINITY)
	 */
	@Override
	public final double doubleValue()
	{
		if (bigValue == null)
		{
			return value;
		}
		else
		{
			return bigValue.doubleValue();
		}
	}

	/**
	 * two Double instances are equal if their values are equal
	 *
	 * @param obj
	 *            The Object to compare (not necessarily an Double)
	 * @return true if the Object satisfies the above condition
	 */
	@Override
	public final boolean equals(Object obj)
	{
		if (this == obj)
		{ // the very same Double
			return true; // necessarily equal
		}
		else if (obj instanceof Float)
		{
			Float that = (Float) obj;
			if (this.bigValue == null && that.bigValue == null)
			{ // both are
			  // double
				return this.value == that.value;
			}
			else if (this.bigValue != null && that.bigValue != null)
			{ // both
			  // are
			  // big
				return this.bigValue.equals(that.bigValue);
			}
			else
			{
				return false; // one is double, one is big; both are canonical (by
							  // design), hence cannot represent the same
							  // value
			}
		}
		else
		{
			return false;
		}
	}

	/**
	 * Returns the value of this Double converted to a float
	 *
	 * @return the value of this Double converted to a float
	 */
	@Override
	public final float floatValue()
	{
		if (bigValue == null)
		{
			return (float) value;
		}
		else
		{
			//throw new JPLException("cannot represent value as a long");
			return bigValue.floatValue();
		}
	}

	/**
	 * whether this Double's functor has (double) 'name' and 'arity' (c.f. traditional functor/3)
	 *
	 * @return whether this Double's functor has (double) 'name' and 'arity'
	 */
	@Override
	public final boolean hasFunctor(double val, int arity)
	{
		return this.value == val && this.bigValue == null && arity == 0;
	}

	/**
	 * whether this Double's functor has (BigDecimal) 'name' and 'arity' (c.f. traditional functor/3)
	 *
	 * @return whether this Double's functor has (BigDecimal) 'name' and 'arity'
	 */
	public final boolean hasFunctor(BigDecimal val, int arity)
	{
		return this.bigValue != null && arity == 0 && this.bigValue.equals(val);
	}

	/**
	 * Returns the value of this Double as an int if possible, else throws a JPLException
	 *
	 * @throws JPLException
	 *             if the value of this Double is too great to be represented as a Java int
	 * @return the int value of this Double
	 */
	@Override
	public final int intValue()
	{
		if (bigValue != null || value < java.lang.Integer.MIN_VALUE || value > java.lang.Integer.MAX_VALUE)
		{
			throw new JPLException("cannot represent value as an int");
		}
		else
		{
			return (int) value;
		}
	}

	/**
	 * @return whether this Double's value is too big to represent as a double
	 */
	@Override
	public final boolean isBig()
	{
		return bigValue != null; // always canonical
	}

	/**
	 * Returns the value of this org.jpl7.Double as a long
	 *
	 * @return the value of this org.jpl7.Double as a long
	 */
	@Override
	public final long longValue()
	{
		if (bigValue != null)
		{ // iff value too big for a double (always
		  // canonical)
			throw new JPLException("cannot represent value as a long");
		}
		else
		{
			return (long) value;
		}
	}

	/**
	 * To convert an Double into a Prolog term, we put its value into the term_t.
	 *
	 * @param varnames_to_vars
	 *            A Map from variable names to Prolog variables.
	 * @param term
	 *            A (previously created) term_t which is to be set to a Prolog integer
	 */
	@Override
	protected final void put(Map<String, term_t> varnames_to_vars, term_t term)
	{
		if (isBig())
		{
			Term t = Util.textToTerm(bigValue.toString());
			if (!(t instanceof Float))
			{
				t.put(varnames_to_vars, term);
			}
			Prolog.put_integer_big(term, bigValue.toString());
		}
		else
		{
			Prolog.put_float(term, doubleValue());
		}
	}

	/**
	 * a Prolog source text representation of this Double's value
	 *
	 * @return a Prolog source text representation of this Double's value
	 */
	@Override
	public String toString()
	{
		if (bigValue == null)
		{
			return Double.toString(value);
		}
		else
		{
			return bigValue.toString();
		}
	}

	/**
	 * the type of this term, as "Prolog.FLOAT"
	 *
	 * @return the type of this term, as "Prolog.FLOAT"
	 */
	@Override
	public final int type()
	{
		return Prolog.FLOAT;
	}

	@Override
	public String typeName()
	{
		return "Float";
	}

}

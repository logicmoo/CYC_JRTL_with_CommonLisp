package org.jpl7;

import java.util.Map;

import org.jpl7.fli.Prolog;
import org.jpl7.fli.atom_t;
import org.jpl7.fli.functor_t;
import org.jpl7.fli.term_t;
import org.logicmoo.system.BeanShellCntrl;

/**
 * A Compound represents a structured term, comprising a functor and one or more arguments (Terms). Direct instances of
 * Compound must have one or more arguments (it is an error to attempt to construct a Compound with zero args; a
 * JPLException will be thrown). For example, this Java expression yields a representation of the term f(a):
 *
 * <pre>
 * new Compound(&quot;f&quot;, new Term[] { new Atom(&quot;a&quot;) })
 * </pre>
 *
 * Note the use of the "anonymous array" notation to denote the arguments (an anonymous array of Term). <br>
 * Alternatively, construct the Term from Prolog source syntax:
 *
 * <pre>
 * Util.textToTerm(&quot;f(a)&quot;)
 * </pre>
 *
 * The <i>arity</i> of a Compound is the quantity of its arguments. Once constructed, neither the name nor the arity of
 * a Compound can be altered. An argument of a Compound can be replaced with the setArg() method.
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
 * @see org.jpl7.Atom
 */
public class Compound extends Term
{

	/**
	 * The (zero or more) arguments of this Compound.
	 */
	protected final Term[] args;

	/**
	 * The name of (the functor of) this Compound.
	 */
	protected final String name;

	/**
	 * Creates a Compound with name and no args (which in SWI Prolog V7 is distinct from a text atom of the same name).
	 *
	 * @param name
	 *            the name of this Compound
	 * @throws JPLException
	 *             if name is null
	 */
	public Compound(String name)
	{
		if (name == null)
		{
			throw new JPLException("cannot construct with null name");
		}
		else
		{
			this.name = name;
			this.args = new Term[] {};
		}
	}

	/**
	 * Creates a Compound with name and arity. This constructor, along with the setArg method, serves the new, native
	 * Prolog-term-to-Java-term routine, and is public only so as to be accessible via JNI: it is not intended for
	 * general use.
	 *
	 * @param name
	 *            the name of this Compound
	 * @param arity
	 *            the arity of this Compound
	 * @throws JPLException
	 *             if name is null or arity is negative
	 */
	protected Compound(String name, int arity)
	{
		if (name == null)
		{
			throw new JPLException("cannot construct with null name");
		}
		else if (arity < 0)
		{
			throw new JPLException("cannot construct with negative arity");
		}
		else
		{
			this.name = name;
			this.args = new Term[arity];
		}
	}

	/**
	 * Creates a Compound with name and (zero or more) args.
	 *
	 * @param name
	 *            the name of this Compound
	 * @param args
	 *            the (zero or more) arguments of this Compound
	 * @throws JPLException
	 *             if name is null or args is null
	 */
	public Compound(String name, Term... args)
	{
		if (name == null)
		{
			throw new JPLException("cannot construct with null name");
		}
		else if (args == null)
		{
			throw new JPLException("cannot construct with null args");
		}
		else
		{
			this.name = name;
			this.args = args;
		}
	}

	/**
	 * Returns the ith argument (counting from 1) of this Compound.
	 *
	 * @param i
	 *            the ordinal number of the required arg (1 denotes the first arg etc.)
	 * @return the ith argument (counting from 1) of this Compound
	 * @throws ArrayIndexOutOfBoundsException
	 *             if i is inappropriate
	 */
	@Override
	public final Term arg(int i)
	{
		return args[i - 1];
	}

	/**
	 * Returns the arguments of this Compound as a Term[0..arity-1] array.
	 *
	 * @return the arguments of this Compound as a Term[0..arity-1] array.
	 */
	@Override
	public final Term[] args()
	{
		return args;
	}

	/**
	 * Returns the arity (0+) of this Compound.
	 *
	 * @return the arity (0+) of this Compound
	 */
	@Override
	public final int arity()
	{
		return args.length;
	}

	/**
	 * Two Compounds are equal if they are identical (same object) or their names and arities are equal and their
	 * respective arguments are equal.
	 *
	 * @param obj
	 *            the Object to compare (not necessarily another Compound)
	 * @return true if the Object satisfies the above condition
	 */
	@Override
	public final boolean equals(Object obj)
	{
		return (this == obj || (obj instanceof Compound && name.equals(((Compound) obj).name) && Term.terms_equals(args, ((Compound) obj).args)));
	}

	/**
	 * Nothing needs to be done except to pass the buck to this Compound's args.
	 *
	 * @param varnames_to_Terms
	 *            A Map from variable names to JPL Terms
	 * @param vars_to_Vars
	 *            A Map from Prolog variables to JPL Variables
	 */
	@Override
	protected final void getSubst(Map<String, Term> varnames_to_Terms, Map<term_t, Variable> vars_to_Vars)
	{
		try
		{
			getSubstsLevel++;
			if (getSubstsLevel > 1) { return; }
			Term.getSubsts(varnames_to_Terms, vars_to_Vars, args);
		} finally
		{
			getSubstsLevel--;
		}
	}

	int getSubstsLevel = 0;

	/**
	 * Tests whether this Compound's functor has (String) 'name' and 'arity'.
	 *
	 * @return whether this Compound's functor has (String) 'name' and 'arity'
	 */
	@Override
	public final boolean hasFunctor(String name, int arity)
	{
		return name.equals(this.name) && arity == args.length;
	}

	/**
	 * whether this Term is a 'jboolean' structure denoting Java's false, i.e. @(false)
	 *
	 * @return whether this Term is a 'jboolean' structure denoting Java's false, i.e. @(false)
	 */
	@Override
	public boolean isJFalse()
	{
		return hasFunctor("@", 1) && arg(1).isAtomOfNameType("false", "text");
	}

	/**
	 * whether this Term is a 'jnull' structure, i.e. @(null)
	 *
	 * @return whether this Term is a 'jnull' structure, i.e. @(null)
	 */
	@Override
	public boolean isJNull()
	{
		return hasFunctor("@", 1) && arg(1).isAtomOfNameType("null", "text");
	}

	/**
	 * whether this Term is a 'jboolean' structure denoting Java's true, i.e. @(true)
	 *
	 * @return whether this Term is a 'jboolean' structure denoting Java's true, i.e. @(true)
	 */
	@Override
	public boolean isJTrue()
	{
		return hasFunctor("@", 1) && arg(1).isAtomOfNameType("true", "text");
	}

	/**
	 * whether this Term is a 'jvoid' structure, i.e. @(void)
	 *
	 * @return whether this Term is a 'jvoid' structure, i.e. @(void)
	 */
	@Override
	public boolean isJVoid()
	{
		return hasFunctor("@", 1) && arg(1).isAtomOfNameType("void", "text");
	}

	/**
	 * whether this Term denotes (syntax-specifically) a list cell
	 *
	 * @return whether this Term denotes (syntax-specifically) a list cell
	 */
	@Override
	public final boolean isListPair()
	{
		return hasFunctor(JPL.LIST_PAIR, 2);
	}

	/**
	 * the name (unquoted) of this Compound
	 *
	 * @return the name (unquoted) of this Compound
	 */
	@Override
	public final String name()
	{
		return name;
	}

	/**
	 * To put a Compound in a term, we create a sequence of term_t references from the Term.terms_to_term_ts() method,
	 * and then use the Prolog.cons_functor_v() method to create a Prolog compound term.
	 *
	 * @param varnames_to_vars
	 *            A Map from variable names to Prolog variables
	 * @param term
	 *            A (previously created) term_t which is to be set to a Prolog term corresponding to the Term subtype
	 *            (Atom, Variable, Compound, etc.) on which the method is invoked.
	 */

	long did = -1;

	@Override
	protected void put(Map<String, term_t> varnames_to_vars, term_t term)
	{
		if(isJFalse() || isJNull() || isJTrue() || isJVoid()) {
			did = -1;
		}
		final String name = name();
		if (true)
		{
			long at = term.value;
			if (did >= 0)
			{
				if (did == at) { return; }
				term_t was = new term_t(did);
				Prolog.put_term(term, was);
				return ;
			}
			else
			{
				did = at;
				final term_t t_args = putTerms(varnames_to_vars, args);
				final atom_t new_atom = Prolog.new_atom(name);
				final functor_t new_functor = Prolog.new_functor(new_atom, args.length);
				Prolog.cons_functor_v(term, new_functor, t_args);
			}
			return;
		}
		if (true)
		{
			final term_t t_args = putTerms(varnames_to_vars, args);
			final atom_t new_atom = Prolog.new_atom(name);
			final functor_t new_functor = Prolog.new_functor(new_atom, args.length);
			Prolog.cons_functor_v(term, new_functor, t_args);
			return;
		}
		//		if (isListNil())
		//		{
		//			Prolog.put_nil(term);
		//			return;
		//		}
		//		if (!isListPair())
		//		{
		//			Prolog.cons_functor_v(term, Prolog.new_functor(Prolog.new_atom(name()), args.length), putTerms(varnames_to_vars, args));
		//			return;
		//		}
		if (isListPair() && false)
		{
			Compound.doListPair(this, varnames_to_vars, term);
			return;
		}

	}

	private static void doListPair(Compound compound, Map<String, term_t> varnames_to_vars, term_t term)
	{
		Term lastEle;
		term_t nextTerm;
		do_compound: do
		{
			final Term args[] = compound.args();
			final int space = args.length;
			nextTerm = Prolog.new_term_refs(space);
			Prolog.cons_functor_v(term, Prolog.new_functor(Prolog.new_atom(compound.name()), space), nextTerm);
			int i = 0;
			eacharg: do
			{
				lastEle = args[i++];
				if (i == space)
				{
					if (lastEle instanceof Compound && lastEle.arity() > 0)
					{
						compound = (Compound) lastEle;
						term = nextTerm;
						continue do_compound;
					}
					else
					{
						lastEle.put(varnames_to_vars, nextTerm);
						break do_compound;
					}
				}
				lastEle.put(varnames_to_vars, nextTerm);
				nextTerm = new term_t(nextTerm.value + 1);
				continue eacharg;
			} while (true);

		} while (true);
	}

	/**
	 * Sets the i-th (from 1) arg of this Compound to the given Term instance. This method, along with the
	 * Compound(name,arity) constructor, serves the new, native Prolog-term-to-Java-term routine, and is public only so
	 * as to be accessible via JNI: it is not intended for general use.
	 *
	 * @param i
	 *            the index (1+) of the arg to be set
	 * @param arg
	 *            the Term which is to become the i-th (from 1) arg of this Compound
	 */
	public void setArg(int i, Term arg)
	{
		if (i <= 0)
		{
			throw new JPLException("bad (non-positive) argument index");
		}
		else if (i > args.length)
		{
			throw new JPLException("bad (out-of-range) argument index");
		}
		else if (arg == null)
		{
			throw new JPLException("bad (null) argument");
		}
		else
		{
			args[i - 1] = arg;
		}
	}

	/**
	 * a prefix functional representation of a Compound of the form name(arg1,...), where 'name' is quoted iff necessary
	 * (to be valid Prolog soutce text) and each argument is represented according to its toString() method.
	 *
	 * @return string representation of an Compound
	 */
	@Override
	public String toString()
	{

		try
		{
			getSubstsLevel++;
			if (getSubstsLevel > 1) { return JPL.quotedName(name) + (args.length > 0 ? "( ... )" : ""); }

			if (isListPair())
			{
				StringBuffer sb = new StringBuffer();
				asListPairString(args, sb);
				return sb.toString();
			}
			return JPL.quotedName(name) + (args.length > 0 ? "(" + Term.toString(args) + ")" : "");
		} finally
		{
			getSubstsLevel--;
		}
	}
	//int getSubstsLevel = 0;

	public void asListPairString(Term[] args, StringBuffer sb)
	{
		do
		{
			final Term car = args[0];
			final Term cdr = args[1];
			if (cdr.isListNil())
			{
				sb.append("[" + car + "]");
			}
			if (cdr.isListPair())
			{
				Compound ccdr = (Compound) cdr;
				String s = "" + cdr;
				sb.append("[" + car + "," + s.substring(1));
			}
			sb.append("[" + car + "|" + cdr + "]");
			break;
		} while (true);
	}

	/**
	 * the type of this term, as jpl.fli.Prolog.COMPOUND
	 *
	 * @return the type of this term, as jpl.fli.Prolog.COMPOUND
	 */
	@Override
	public int type()
	{
		return Prolog.COMPOUND;
	}

	/**
	 * the name of the type of this term, as "Compound"
	 *
	 * @return the name of the type of this term, as "Compound"
	 */
	@Override
	public String typeName()
	{
		return "Compound";
	}

}

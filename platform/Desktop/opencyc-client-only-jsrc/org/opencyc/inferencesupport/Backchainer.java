package org.opencyc.inferencesupport;

import java.util.*;
import java.io.*;
//import org.apache.oro.util.*;
import org.opencyc.cycobject.*;
import org.apache.jena.atlas.lib.cache.CacheLRU;
import org.opencyc.api.*;
//import org.opencyc.constraintsolver.*;
import org.opencyc.queryprocessor.*;

/**
 * Provides additional constraint rules through backwards KB inference using the input constraint
 * rules as a starting point.  Domain populating rules can be supplemented via backchaining,
 * because the answer to the query involves a search for bindings in the KB which are provided by
 * the domain populating rules.  Ordinary (non domain populating) rules on the other hand are not
 * supplemented by backchaining because they serve to restrict the domain values, as opposed to
 * populating them.<p>
 *
 * The <tt>Backchainer</tt> provides the additional constraint rules as a preparation step
 * before beginning the forward checking search for permitted bindings.
 *
 * @version $Id$
 * @author Stephen L. Reed
 *
 * <p>Copyright 2001 Cycorp, Inc., license is open source GNU LGPL.
 * <p><a href="http://www.opencyc.org/license.txt">the license</a>
 * <p><a href="http://www.opencyc.org">www.opencyc.org</a>
 * <p><a href="http://www.sourceforge.net/projects/opencyc">OpenCyc at SourceForge</a>
 * <p>
 * THIS SOFTWARE AND KNOWLEDGE BASE CONTENT ARE PROVIDED ``AS IS'' AND
 * ANY EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE OPENCYC
 * ORGANIZATION OR ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE AND KNOWLEDGE
 * BASE CONTENT, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
public class Backchainer
{

	/**
	 * The default verbosity of the query processor output.  0 --> quiet ... 9 -> maximum
	 * diagnostic input.
	 */
	public static final int DEFAULT_VERBOSITY = 3;

	/**
	 * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
	 * diagnostic input.
	 */
	protected int verbosity = DEFAULT_VERBOSITY;

	/**
	 * <tt>Unifier</tt> for this <tt>Backchainer</tt>.
	 */
	protected Unifier unifier = new Unifier(this);

	/**
	 * The list of variables in this problem or query.
	 */
	protected ArrayList variables;

	/**
	 * The microtheory in which inferences are performed.
	 */
	public CycFort mt;

	/**
	 * current depth of backchaining from an input constraint rule.
	 */
	public int backchainDepth = 0;

	/**
	 * Maximum depth of backchaining from an input constraint rule.
	 */
	public int maxBackchainDepth = 0;

	/**
	 * Indicates whether to backchain on predicates #$isa and #$genl
	 */
	protected boolean sbhlBackchain = false;

	/**
	 * Least Recently Used Cache of implication rule sets concluding a predicate, so that a reference to an
	 * existing implication rule set concluding a predicate is returned instead of gathering a duplicate.
	 */
	protected static CacheLRU implicationRuleSetCache = newCacheLRU(100);

	/**
	 * Constructs a new <tt>Backchainer</tt> object given the parent <tt>ConstraintProblem</tt>
	 * object.
	 *
	 */
	public Backchainer()
	{
	}

	private static CacheLRU newCacheLRU(int i)
	{
		return new CacheLRU(0.75f, 100);
	}

	/**
	 * Solves a problem by obtaining bindings for the given literal via backchaining.
	 *
	 * @param literal the literal for which bindings are sought via backchaining
	 * @param variables the variables used in the parent constraint problem or query.
	 * @param mt the microtheory in which inferences are performed
	 * @return an <tt>ArrayList</tt> of solutions or <tt>null</tt> if no solutions were
	 * found.  Each solution is an <tt>ArrayList</tt> of variable binding <tt>ArrayList</tt>
	 * objects, each binding having the form of an <tt>ArrayList</tt> where the first
	 * element is the <tt>CycVariable</tt> and the second element is the domain value
	 * <tt>Object</tt>.
	 */
	public ArrayList backchain(Literal literal, ArrayList variables, CycFort mt) throws IOException
	{
		this.variables = variables;
		this.mt = mt;
		ArrayList values = new ArrayList();
		CycVariable variable = (CycVariable) literal.getVariables().get(0);
		if (verbosity > 1) System.out.println("Backchaining at depth " + backchainDepth + " on\n  " + literal);
		// Reuse the existing CycAccess object.
		QueryProcessor queryProcessor = new QueryProcessor(CycAccess.current());
		queryProcessor.setVerbosity(verbosity);
		//queryProcessor.setVerbosity(9);
		// Request all solutions.
		queryProcessor.nbrSolutionsRequested = null;
		queryProcessor.mt = mt;
		// Keep the same limit on maximum backchain depth
		queryProcessor.setMaxBackchainDepth(this.maxBackchainDepth);
		// Increment the depth of backchaining.
		queryProcessor.setBackchainDepth(this.backchainDepth + 1);
		return queryProcessor.ask(literal.formula);
	}

	/**
	 * Performs backchaining inference to find sets of implication rules to conclude
	 * literals in the given list.
	 *
	 * @param literals the list of query literals
	 * @return sets of implication rules to conclude literals in the given list
	 */
	public ArrayList getBackchainRules(ArrayList literals) throws IOException
	{
		ArrayList result = new ArrayList();
		for (int i = 0; i < literals.size(); i++)
		{
			Literal literal = (Literal) literals.get(i);
			result.addAll(getBackchainRules(literal));
		}
		return result;
	}

	/**
	 * Returns the sets of conjunctive antecentant rules which can prove the given rule.
	 *
	 * @param rule a rule is to be proven via backchaining
	 * @return the sets of conjunctive antecentant rules which can prove the given rule
	 */
	public ArrayList getBackchainRules(Literal literal) throws IOException
	{
		ArrayList result = new ArrayList();
		if (verbosity > 3) System.out.println("getting rules to conclude\n" + literal);
		ArrayList candidateImplicationRules = gatherImplicationRulesConcluding(literal);
		int nbrAcceptedRules = 0;
		int nbrCandidateRules = candidateImplicationRules.size();
		for (int i = 0; i < nbrCandidateRules; i++)
		{
			CycList candidateImplicationRule = (CycList) candidateImplicationRules.get(i);
			if (verbosity > 4) System.out.println("\nConsidering implication rule\n" + candidateImplicationRule.cyclify());
			HornClause hornClause = new HornClause(candidateImplicationRule);
			ArrayList antecedants = unifier.semanticallyUnify(literal, hornClause);
			if (antecedants != null)
			{
				if (verbosity > 4) System.out.println("Unified antecedants\n" + antecedants);
				nbrAcceptedRules++;
				CycList conjunctiveAntecedantRule = new CycList();
				conjunctiveAntecedantRule.add(CycAccess.and);
				for (int j = 0; j < antecedants.size(); j++)
				{
					Literal antecedant = (Literal) antecedants.get(j);
					conjunctiveAntecedantRule.add(antecedant.getFormula());
				}
				result.add(new QueryLiteral(conjunctiveAntecedantRule));
			}
		}
		if (verbosity > 1)
		{
			System.out.println("\nSummary of accepted backchain rules");
			for (int i = 0; i < result.size(); i++)
				System.out.println("  " + ((Literal) result.get(i)).cyclify());
			System.out.println("Accepted " + nbrAcceptedRules + " backchain rules from " + nbrCandidateRules + " candidates");
		}
		return result;
	}

	/**
	 * Gathers the implication rules which conclude the given rule.
	 *
	 * @param literal the literal to be proven via backchaining
	 * @return the list of implication rules as <tt>CycList</tt> formulae which conclude the given rule
	 */
	public ArrayList gatherImplicationRulesConcluding(Literal literal) throws IOException
	{
		ArrayList result = new ArrayList();
		CycConstant predicate = literal.getPredicate();
		if (!this.sbhlBackchain && (predicate.equals(CycAccess.isa) || predicate.equals(CycAccess.genls)))
		{
			if (verbosity > 3) System.out.println("backchain inference bypassed for predicate " + predicate);
			return result;
		}
		if (CycAccess.current().isBackchainForbidden(predicate, mt))
		{
			if (verbosity > 3) System.out.println("backchain inference forbidden for predicate " + predicate);
			return result;
		}
		if (CycAccess.current().isBackchainDiscouraged(predicate, mt))
		{
			if (verbosity > 3) System.out.println("backchain inference discouraged for predicate " + predicate);
			return result;
		}
		if (CycAccess.current().isEvaluatablePredicate(predicate))
		{
			if (verbosity > 3) System.out.println("backchain inference bypassed for evaluatable predicate " + predicate);
			return result;
		}
		CycList backchainImplicationRules = CycAccess.current().getBackchainImplicationRules(literal.getPredicate(), literal.getFormula(), mt);
		for (int i = 0; i < backchainImplicationRules.size(); i++)
		{
			CycList cycListRule = (CycList) backchainImplicationRules.get(i);
			if (HornClause.isValidHornExpression(cycListRule))
				result.add(cycListRule);
			else
			{
				if (verbosity > 3) System.out.println("dropped ill-formed (backward) rule " + cycListRule.cyclify());
			}
		}
		CycList forwardChainImplicationRules = CycAccess.current().getForwardChainRules(literal.getPredicate(), literal.getFormula(), mt);
		for (int i = 0; i < forwardChainImplicationRules.size(); i++)
		{
			CycList cycListRule = (CycList) forwardChainImplicationRules.get(i);
			if (HornClause.isValidHornExpression(cycListRule))
				result.add(cycListRule);
			else
			{
				if (verbosity > 3) System.out.println("dropped ill-formed (forward) rule " + cycListRule.cyclify());
			}
		}
		return result;
	}

	/**
	 * Sets whether backchaining is performed on rules with the predicate of #$isa or #$genls.  Large
	 * numbers of rules conclude #$isa or #$genls, which are not usually relevant - so the default is
	 * false.
	 *
	 * @param sbhlBackchain whether backchaining is performed on rules with the predicate of #$isa or #$genls
	 */
	public void setSbhlBackchain(boolean sbhlBackchain)
	{
		this.sbhlBackchain = sbhlBackchain;
	}

	/**
	 * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
	 * diagnostic input.
	 *
	 * @param verbosity 0 --> quiet ... 9 -> maximum diagnostic input
	 */
	public void setVerbosity(int verbosity)
	{
		this.verbosity = verbosity;
		unifier.setVerbosity(verbosity);
	}

	/**
	 * Resets the implication rule set cache.
	 */
	public static void resetImplicationRuleSetCache()
	{
		implicationRuleSetCache = newCacheLRU(500);
	}

	/**
	 * Adds the implication rule set to the cache for the given predicate
	 *
	 * @param predicate the predicate concluded by the implication rule set
	 * @param ruleSet the set of implication rules concluding the given predicate
	 */
	public static void addCache(CycConstant predicate, ArrayList ruleSet)
	{
		implicationRuleSetCache.put(predicate, ruleSet);
	}

	/**
	 * Retrieves the implication rule set from the cache for the given predicate, returning <tt>null</tt>
	 * if not found in the cache.
	 *
	 * @param predicate the predicate concluded by the implication rule set
	 * @return the implication rule set from the cache for the given predicate, returning <tt>null</tt>
	 * if not found in the cache
	 */
	public static ArrayList getCache(CycConstant predicate)
	{
		return (ArrayList) implicationRuleSetCache.get(predicate);
	}

	/**
	 * Removes the implication rule set from the cache for the given predicate if it is contained within.
	 */
	public static void removeCache(CycConstant predicate)
	{
		Object element = implicationRuleSetCache.get(predicate);
		if (element != null) implicationRuleSetCache.put(predicate, null);
	}

	/**
	 * Returns the size of the implication rule set cache.
	 *
	 * @return an <tt>int</tt> indicating the number of implication rule sets in the cache
	 */
	public static int getCacheSize()
	{
		return (int) implicationRuleSetCache.size();
	}

	/**
	 * Sets the variables used in the parent problem.
	 */
	public void setVariables(ArrayList variables)
	{
		this.variables = variables;
	}

}
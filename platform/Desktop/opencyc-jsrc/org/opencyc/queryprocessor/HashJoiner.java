package org.opencyc.queryprocessor;

import java.util.*;
import java.io.*;
import org.apache.commons.collections.*;
import org.opencyc.util.*;
import org.opencyc.cycobject.*;
import org.opencyc.api.*;
import org.opencyc.inferencesupport.*;

/**
 * <tt>HashJoiner</tt> object to model the attributes and behavior of a query
 * processor using the hash join algorithm.<p>
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
 *
 * @see UnitTest#testHashJoiner
 */
public class HashJoiner {

    /**
     * A reference to the parent's <tt>LiteralAsker</tt> object.
     */
    protected LiteralAsker literalAsker;

    /**
     * The binding sets remaining to be joined.
     */
    ArrayList remainingBindingSets;

    /**
     * The default verbosity of the solution output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    public static final int DEFAULT_VERBOSITY = 4;

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     */
    protected int verbosity = DEFAULT_VERBOSITY;

    /**
     * Constructs a new <tt>HashJoiner</tt> object.
     */
    public HashJoiner() {
    }

    /**
     * Joins the given binding sets into a single binding set.
     *
     * @param bindingSets the list of binding sets to be joined
     * @return the binding set which is the result of the join operation
     */
    public BindingSet join(ArrayList bindingSets) throws IOException {
        remainingBindingSets = (ArrayList) bindingSets.clone();
        if (bindingSets.size() == 0)
            throw new RuntimeException("Invalid binding sets size " + bindingSets.size());
        Collections.sort(remainingBindingSets);
        BindingSet joinedBindingSet = (BindingSet) remainingBindingSets.get(0);
        remainingBindingSets.remove(0);
        if (verbosity > 4)
            System.out.println("Starting binding set for join is \n" + joinedBindingSet);
        int index;
        while (remainingBindingSets.size() > 0) {
            index = -1;
            for (int i = 1; i < remainingBindingSets.size(); i++) {
                BindingSet remainingBindingSet = (BindingSet) remainingBindingSets.get(i);
                ArrayList joinedBindingSetVariables = joinedBindingSet.getVariables();
                ArrayList remainingBindingSetVariables = remainingBindingSet.getVariables();
                if (verbosity > 4)
                    System.out.println("  candidate binding set \n  " + remainingBindingSet);
                if (OcCollectionUtils.hasIntersection(joinedBindingSetVariables,
                                                      remainingBindingSetVariables)) {
                    index = i;
                    break;
                }
            }
            BindingSet bestBindingSetForJoin;
            if (index == -1) {
                index = 0;
                bestBindingSetForJoin = (BindingSet) remainingBindingSets.get(index);
                if (verbosity > 4)
                    System.out.println("  no binding set has variables in common");
                joinedBindingSet = joinCartesianProduct(joinedBindingSet, bestBindingSetForJoin);
            }
            else {
                bestBindingSetForJoin = (BindingSet) remainingBindingSets.get(index);
                if (verbosity > 4)
                    System.out.println("  best binding set for join \n  " + bestBindingSetForJoin);
                joinedBindingSet = join(joinedBindingSet, bestBindingSetForJoin);
            }
            remainingBindingSets.remove(index);
        }
        if (joinedBindingSet.isBindingPostponed())
            // Ensure that a single literal query gets asked.
            literalAsker.ask(joinedBindingSet);
        return joinedBindingSet;
    }

    /**
     * Joins two binding sets into a single binding set.  The larger of the two binding sets will be
     * used to probe the smaller one as hash match.
     *
     * @param bindingSet1 a binding set to be joined
     * @param bindingSet2 another binding set to be joined
     * @return the binding set which is the result of the join operation
     */
    public BindingSet join(BindingSet bindingSet1, BindingSet bindingSet2)
        throws IOException {
        if (verbosity > 4)
            System.out.println("Joining (unordered)\n  " + bindingSet1 + "\n  " + bindingSet2);
        BindingSet smallerBindingSet;
        BindingSet largerBindingSet;
        if (bindingSet1.size() < bindingSet2.size()) {
            smallerBindingSet = bindingSet1;
            largerBindingSet = bindingSet2;
        }
        else {
            smallerBindingSet = bindingSet2;
            largerBindingSet = bindingSet1;
        }
        if (smallerBindingSet.isBindingPostponed())
            literalAsker.ask(smallerBindingSet);
        if (largerBindingSet.isBindingPostponed())
            return joinSelection(smallerBindingSet, largerBindingSet);
        else
            return joinBuildProbe(smallerBindingSet, largerBindingSet);
    }

    /**
     * Joins two given binding sets that have no variables in common.
     *
     * @param bindingSet1 the first binding set
     * @param bindingSet2 the second binding set
     * @return the binding set which is the result of the product join operation
     */
    public BindingSet joinCartesianProduct(BindingSet bindingSet1,
                                           BindingSet bindingSet2) throws IOException {
        if (verbosity > 4)
            System.out.println("Joining (cartesian product)\n  first " +
                               bindingSet1 +
                               "\n    with variables " + bindingSet1.getVariables() +
                               "\n  uninstantiated " + bindingSet2 +
                               "\n    with variables " + bindingSet2.getVariables());

        QueryLiteral joinedQueryLiteral = QueryLiteral.conjoin(bindingSet1.getQueryLiteral(),
                                                               bindingSet2.getQueryLiteral());
        if (verbosity > 4)
            System.out.println("  joined query \n  " + joinedQueryLiteral.cyclify() +
                               "\n    with variables " + joinedQueryLiteral.getVariables());
        BindingSet joinedBindingSet = new BindingSet(joinedQueryLiteral, bindingSet1.getMt());
        ArrayList cartesianProduct = new ArrayList();
        if (bindingSet1.isCartesianProduct())
            cartesianProduct.add(bindingSet1.getCartesianProductBindingSets());
        else
            cartesianProduct.add(bindingSet1);
        if (bindingSet2.isCartesianProduct())
            cartesianProduct.add(bindingSet2.getCartesianProductBindingSets());
        else
            cartesianProduct.add(bindingSet2);
        return joinedBindingSet;
    }

    /**
     * Joins a smaller instantiated binding set with a larger uninstantiated binding set, by
     * asking individual partial instantiations of the joined literal.
     *
     * @param smallerBindingSet the smaller fully instantiated binding
     * @param uninstantiatedBindingSet the uninstantiated binding set with larger estimated size
     * @return the binding set which is the result of the join operation
     */
    public BindingSet joinSelection(BindingSet smallerBindingSet,
                                    BindingSet uninstantiatedBindingSet) throws IOException {
        if (verbosity > 4)
            System.out.println("Joining (with smaller and uninstantiated identified)\n  smaller " +
                               smallerBindingSet +
                               "\n    with variables " + smallerBindingSet.getVariables() +
                               "\n  uninstantiated " + uninstantiatedBindingSet +
                               "\n    with variables " + uninstantiatedBindingSet.getVariables());

        QueryLiteral joinedQueryLiteral = QueryLiteral.conjoin(smallerBindingSet.getQueryLiteral(),
                                                               uninstantiatedBindingSet.getQueryLiteral());
        if (verbosity > 4)
            System.out.println("  joined query \n  " + joinedQueryLiteral.cyclify() +
                               "\n    with variables " + joinedQueryLiteral.getVariables());
        BindingSet joinedBindingSet = new BindingSet(joinedQueryLiteral, smallerBindingSet.getMt());

        if (smallerBindingSet.isCartesianProduct()) {
            //TODO
        }
        else {
            ArrayList bindingLists = null;
            for (int i = 0; i < smallerBindingSet.size(); i++)
                joinedBindingSet.addAll(literalAsker.ask(joinedQueryLiteral,
                                                         uninstantiatedBindingSet.getQueryLiteral(),
                                                         smallerBindingSet.getVariables(),
                                                         (ArrayList) smallerBindingSet.getBindingValues().get(i),
                                                         smallerBindingSet.getMt()));
            }
        if (verbosity > 3) {
            System.out.println();
            joinedBindingSet.displayBindingSet();
            System.out.println();
        }
        return joinedBindingSet;
    }

    /**
     * Joins a probe binding set with a build binding set.
     *
     * @param bindingSet1 the binding set from which a hash table is built
     * @param bindingSet2 the binding set which is probed against the build binding set
     * @return the binding set which is the result of the join operation
     */
    public BindingSet joinBuildProbe(BindingSet buildBindingSet, BindingSet probeBindingSet)
        throws IOException {
        if (verbosity > 4)
            System.out.println("Joining (with build and probe identified)\n  build " + buildBindingSet +
                                "\n    with variables " + buildBindingSet.getVariables() +
                                "\n  probe " + probeBindingSet +
                                "\n    with variables " + probeBindingSet.getVariables());

        QueryLiteral joinedQueryLiteral = QueryLiteral.conjoin(buildBindingSet.getQueryLiteral(),
                                                               probeBindingSet.getQueryLiteral());
        if (verbosity > 4)
            System.out.println("  joined query \n  " + joinedQueryLiteral.cyclify() +
                               "\n    with variables " + joinedQueryLiteral.getVariables());

        BindingSet joinedBindingSet = new BindingSet(joinedQueryLiteral, buildBindingSet.getMt());
        ArrayList intersectingVariables =
            new ArrayList(CollectionUtils.intersection(buildBindingSet.getVariables(),
                          probeBindingSet.getVariables()));
        if (verbosity > 4)
            System.out.println("    intersecting variables " + intersectingVariables + "\n");

        int intersectingVariablesSize = intersectingVariables.size();
        if (intersectingVariablesSize == 0)
            // TODO

            throw new RuntimeException("product not yet implemented for \n" + buildBindingSet +
                                       "\n" + probeBindingSet);
        // Build step.
        HashMap hashMap = new HashMap();
        ArrayList buildVariables = buildBindingSet.getVariables();
        int buildVariablesSize = buildVariables.size();
        if (verbosity > 4) {
            System.out.println("  Starting build step, with build binding set size " + buildBindingSet.size());
            for (int j = 0; j < intersectingVariablesSize; j++) {
                for (int k = 0; k < buildVariablesSize; k++)
                if (intersectingVariables.get(j).equals(buildVariables.get(k)))
                    System.out.println("    intersecting variable " + intersectingVariables.get(j) +
                                       " matches build variable at index " + k);
            }
        }
        for (int i = 0; i < buildBindingSet.size(); i++) {
            CycList key = new CycList();
            CycList buildBindingValueList = (CycList) buildBindingSet.getBindingValues().get(i);
            for (int j = 0; j < intersectingVariablesSize; j++) {
                for (int k = 0; k < buildVariablesSize; k++)
                if (intersectingVariables.get(j).equals(buildVariables.get(k)))
                    key.add(buildBindingValueList.get(k));
            }
            if (! hashMap.containsKey(key))
                hashMap.put(key, new ArrayList(3));
            ArrayList bucket = (ArrayList) hashMap.get(key);
            bucket.add(buildBindingValueList);
            if (verbosity > 7)
                System.out.println("  indexing " + buildBindingValueList.cyclify() +
                                   "\n  key " + key.cyclify());
        }
        // Probe step.
        ArrayList probeVariables = probeBindingSet.getVariables();
        int probeVariablesSize = probeVariables.size();
        ArrayList joinedVariables = joinedBindingSet.getVariables();
        int joinedVariablesSize = joinedVariables.size();
        if (verbosity > 4) {
            System.out.println("  Starting probe step, with probe binding set size " + probeBindingSet.size());
            for (int j = 0; j < intersectingVariablesSize; j++) {
                for (int k = 0; k < probeVariablesSize; k++)
                if (intersectingVariables.get(j).equals(probeVariables.get(k)))
                    System.out.println("    intersecting variable " + intersectingVariables.get(j) +
                                       " matches probe variable at index " + k);
            }
        }
        for (int i = 0; i < probeBindingSet.size(); i++) {
            CycList key = new CycList();
            CycList probeBindingValueList = (CycList) probeBindingSet.getBindingValues().get(i);
            for (int j = 0; j < intersectingVariablesSize; j++) {
                for (int k = 0; k < probeVariablesSize; k++)
                if (intersectingVariables.get(j).equals(probeVariables.get(k)))
                    key.add(probeBindingValueList.get(k));
            }
            ArrayList bucket = (ArrayList) hashMap.get(key);
            boolean keyFound = bucket != null;
            if (verbosity > 7)
                System.out.println("  probing " + probeBindingValueList.cyclify() + "\n    key " +
                                   key.cyclify() + " --> " + keyFound);
            else if (verbosity > 4 && keyFound)
                System.out.println("  probing " + probeBindingValueList.cyclify() + "\n    key " +
                                   key.cyclify() + " --> " + keyFound);
            if (keyFound) {
                for (int bucketIndex = 0; bucketIndex < bucket.size(); bucketIndex++) {
                    // Assemble the joined binding set value list from the build and probe sets.
                    CycList buildBindingValueList = (CycList) bucket.get(bucketIndex);
                    CycList joinedBindingValueList = new CycList();
                    for (int j = 0; j < joinedVariablesSize; j++) {
                        CycVariable joinedVariable = (CycVariable) joinedVariables.get(j);
                        boolean foundJoinedBindingValue = false;
                        for (int k = 0; k < buildVariablesSize; k++) {
                            if (joinedVariable.equals(buildVariables.get(k))) {
                                foundJoinedBindingValue = true;
                                joinedBindingValueList.add(buildBindingValueList.get(k));
                                break;
                            }
                        }
                        if (! foundJoinedBindingValue) {
                            for (int k = 0; k < probeVariablesSize; k++) {
                                if (joinedVariable.equals(probeVariables.get(k))) {
                                    foundJoinedBindingValue = true;
                                    joinedBindingValueList.add(probeBindingValueList.get(k));
                                    break;
                                }
                            }
                        }
                        if (! foundJoinedBindingValue)
                            throw new RuntimeException("Expected variable not found in joined binding sets \n" +
                                                       buildBindingSet + "\n" + probeBindingSet);
                    }
                    if (verbosity > 4) {
                        System.out.println("    build binding value list         " + buildBindingValueList);
                        System.out.println("    probe binding value list         " + probeBindingValueList);
                        System.out.println("    adding joined binding value list " + joinedBindingValueList);
                    }
                    joinedBindingSet.add(joinedBindingValueList);
                }
            }
        }
        if (verbosity > 3) {
            System.out.println();
            joinedBindingSet.displayBindingSet();
            System.out.println();
        }
        return joinedBindingSet;
    }

    /**
     * Sets verbosity of the constraint solver output.  0 --> quiet ... 9 -> maximum
     * diagnostic input.
     *
     * @param verbosity 0 --> quiet ... 9 -> maximum diagnostic input
     */
    public void setVerbosity(int verbosity) {
        this.verbosity = verbosity;
    }
}
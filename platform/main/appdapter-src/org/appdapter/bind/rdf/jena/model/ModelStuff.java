package org.appdapter.bind.rdf.jena.model;

import org.appdapter.core.store.RepoOper;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import com.hp.hpl.jena.util.iterator.WrappedIterator;
import java.util.Collection;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.Statement;
import java.lang.reflect.Constructor;
import com.hp.hpl.jena.shared.ReificationStyle;
import com.hp.hpl.jena.util.iterator.ExtendedIterator;
import com.hp.hpl.jena.graph.GraphUtil;
import java.util.Map;
import com.hp.hpl.jena.util.CollectionFactory;
import com.hp.hpl.jena.graph.Factory;
import com.hp.hpl.jena.graph.Graph;
import java.util.HashSet;
import java.util.ArrayList;
import com.hp.hpl.jena.rdf.model.RDFNode;
import org.appdapter.core.store.dataset.RepoDatasetFactory;
import java.util.List;
import com.hp.hpl.jena.util.IteratorCollection;
import java.util.Set;
import java.util.Iterator;
import java.util.StringTokenizer;
import com.hp.hpl.jena.graph.Triple;
import com.hp.hpl.jena.graph.impl.LiteralLabelFactory;
import com.hp.hpl.jena.graph.impl.LiteralLabel;
import com.hp.hpl.jena.rdf.model.AnonId;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.datatypes.xsd.XSDDatatype;
import com.hp.hpl.jena.shared.JenaException;
import com.hp.hpl.jena.shared.PrefixMapping;
import com.hp.hpl.jena.graph.Node;
import com.hp.hpl.jena.rdf.model.Model;

public class ModelStuff
{
    protected static Model aModel;
    protected static final Model empty;
    protected static int bnc;

    public static void fail(final String failMsg) {
        System.out.println("ModelStuff-FAIL[" + failMsg + "]");
        throw new RuntimeException(failMsg);
    }

    public static void assertTrue(final String failMsg, final boolean cond) {
        if (!cond) {
            fail(failMsg);
        }
    }

    public static void assertTrue(final boolean cond) {
        assertTrue(null, cond);
    }

    public static void assertFalse(final String failMsg, final boolean cond) {
        assertTrue(failMsg, !cond);
    }

    public static Node create(final String x) {
        return create(PrefixMapping.Extended, x);
    }

    public static Node create(final PrefixMapping pm, final String x) {
        if (x.equals("")) {
            throw new JenaException("Node.create does not accept an empty string as argument");
        }
        final char first = x.charAt(0);
        if (first == '\'' || first == '\"') {
            return Node.createLiteral(newString(pm, first, x));
        }
        if (Character.isDigit(first)) {
            return Node.createLiteral(x, "", (RDFDatatype)XSDDatatype.XSDinteger);
        }
        if (first == '_') {
            return Node.createAnon(new AnonId(x));
        }
        if (x.equals("??")) {
            return Node.ANY;
        }
        if (first == '?') {
            return Node.createVariable(x.substring(1));
        }
        if (first == '&') {
            return Node.createURI("q:" + x.substring(1));
        }
        final int colon = x.indexOf(58);
        final String d = pm.getNsPrefixURI("");
        return (colon < 0) ? Node.createURI(((d == null) ? "eh:/" : d) + x) : Node.createURI(pm.expandPrefix(x));
    }

    public static String unEscape(final String spelling) {
        if (spelling.indexOf(92) < 0) {
            return spelling;
        }
        final StringBuffer result = new StringBuffer(spelling.length());
        int start = 0;
        while (true) {
            final int b = spelling.indexOf(92, start);
            if (b < 0) {
                break;
            }
            result.append(spelling.substring(start, b));
            result.append(unEscape(spelling.charAt(b + 1)));
            start = b + 2;
        }
        result.append(spelling.substring(start));
        return result.toString();
    }

    public static char unEscape(final char ch) {
        switch (ch) {
            case '\"':
            case '\'':
            case '\\': {
                return ch;
            }
            case 'n': {
                return '\n';
            }
            case 's': {
                return ' ';
            }
            case 't': {
                return '\t';
            }
            default: {
                return 'Z';
            }
        }
    }

    public static LiteralLabel literal(final PrefixMapping pm, final String spelling, final String langOrType) {
        final String content = unEscape(spelling);
        final int colon = langOrType.indexOf(58);
        return (colon < 0) ? LiteralLabelFactory.create(content, langOrType, false) : LiteralLabelFactory.createLiteralLabel(content, "", Node.getType(pm.expandPrefix(langOrType)));
    }

    public static LiteralLabel newString(final PrefixMapping pm, final char quote, final String nodeString) {
        final int close = nodeString.lastIndexOf(quote);
        return literal(pm, nodeString.substring(1, close), nodeString.substring(close + 1));
    }

    public static Triple createTriple(final PrefixMapping pm, final String fact) {
        final StringTokenizer st = new StringTokenizer(fact);
        final Node sub = create(pm, st.nextToken());
        final Node pred = create(pm, st.nextToken());
        final Node obj = create(pm, st.nextToken());
        return Triple.create(sub, pred, obj);
    }

    public static Triple createTriple(final String fact) {
        return createTriple(PrefixMapping.Standard, fact);
    }

    public static Node node(final String x) {
        return create(x);
    }

    public static <T> Set<T> iteratorToSet(final Iterator<? extends T> it) {
        return (Set<T>)IteratorCollection.iteratorToSet((Iterator)it);
    }

    public static <T> List<T> iteratorToList(final Iterator<? extends T> it) {
        return (List<T>)IteratorCollection.iteratorToList((Iterator)it);
    }

    protected static Model extendedModel() {
        final Model result = RepoDatasetFactory.createDefaultModel();
        result.setNsPrefixes(PrefixMapping.Extended);
        return result;
    }

    protected static String nice(final RDFNode n) {
        return nice(n.asNode());
    }

    public static Triple triple(final String fact) {
        return createTriple(fact);
    }

    public static Triple triple(final PrefixMapping pm, final String fact) {
        return createTriple(pm, fact);
    }

    public static Triple[] tripleArray(final String facts) {
        final ArrayList<Triple> al = new ArrayList<Triple>();
        final StringTokenizer semis = new StringTokenizer(facts, ";");
        while (semis.hasMoreTokens()) {
            al.add(triple(PrefixMapping.Extended, semis.nextToken()));
        }
        return al.toArray(new Triple[al.size()]);
    }

    public static Set<Triple> tripleSet(final String facts) {
        final Set<Triple> result = new HashSet<Triple>();
        final StringTokenizer semis = new StringTokenizer(facts, ";");
        while (semis.hasMoreTokens()) {
            result.add(triple(semis.nextToken()));
        }
        return result;
    }

    public static List<Node> nodeList(final String items) {
        final ArrayList<Node> nl = new ArrayList<Node>();
        final StringTokenizer nodes = new StringTokenizer(items);
        while (nodes.hasMoreTokens()) {
            nl.add(node(nodes.nextToken()));
        }
        return nl;
    }

    public static Node[] nodeArray(final String items) {
        final List<Node> nl = nodeList(items);
        return nl.toArray(new Node[nl.size()]);
    }

    public static Graph graphAdd(final Graph g, final String s) {
        final StringTokenizer semis = new StringTokenizer(s, ";");
        while (semis.hasMoreTokens()) {
            g.add(triple(PrefixMapping.Extended, semis.nextToken()));
        }
        return g;
    }

    public static Graph newGraph() {
        final Graph result = Factory.createGraphMem();
        result.getPrefixMapping().setNsPrefixes(PrefixMapping.Extended);
        return result;
    }

    public static Graph graphWith(final String s) {
        return graphAdd(newGraph(), s);
    }

    public static void assertEqualsTemplate(final String title, final Graph g, final String template) {
        assertIsomorphic(title, graphWith(template), g);
    }

    public static void assertIsomorphic(final String title, final Graph expected, final Graph got) {
        if (!expected.isIsomorphicWith(got)) {
            final Map<Node, Object> map = CollectionFactory.createHashedMap();
            fail(title + ": wanted " + nice(expected, map) + "\nbut got " + nice(got, map));
        }
    }

    public static String nice(final Graph g, final Map<Node, Object> bnodes) {
        final StringBuffer b = new StringBuffer(g.size() * 100);
        final ExtendedIterator<Triple> it = (ExtendedIterator<Triple>)GraphUtil.findAll(g);
        while (it.hasNext()) {
            niceTriple(b, bnodes, (Triple)it.next());
        }
        return b.toString();
    }

    protected static void niceTriple(final StringBuffer b, final Map<Node, Object> bnodes, final Triple t) {
        b.append("\n    ");
        appendNode(b, bnodes, t.getSubject());
        appendNode(b, bnodes, t.getPredicate());
        appendNode(b, bnodes, t.getObject());
    }

    protected static void appendNode(final StringBuffer b, final Map<Node, Object> bnodes, final Node n) {
        b.append(' ');
        if (n.isBlank()) {
            Object already = bnodes.get(n);
            if (already == null) {
                bnodes.put(n, already = "_b" + ModelStuff.bnc++);
            }
            b.append(already);
        }
        else {
            b.append(nice(n));
        }
    }

    protected static String nice(final Node n) {
        return n.toString(PrefixMapping.Extended, true);
    }

    public static void assertIsomorphic(final Graph expected, final Graph got) {
        assertIsomorphic("graphs must be isomorphic", expected, got);
    }

    public static void assertContains(final String name, final String s, final Graph g) {
        assertTrue(name + " must contain " + s, g.contains(triple(s)));
    }

    public static void assertContainsAll(final String name, final Graph g, final String s) {
        final StringTokenizer semis = new StringTokenizer(s, ";");
        while (semis.hasMoreTokens()) {
            assertContains(name, semis.nextToken(), g);
        }
    }

    public static void assertOmits(final String name, final Graph g, final String s) {
        assertFalse(name + " must not contain " + s, g.contains(triple(s)));
    }

    public static void assertOmitsAll(final String name, final Graph g, final String s) {
        final StringTokenizer semis = new StringTokenizer(s, ";");
        while (semis.hasMoreTokens()) {
            assertOmits(name, g, semis.nextToken());
        }
    }

    public static boolean contains(final Graph g, final String fact) {
        return g.contains(triple(fact));
    }

    public void testContains(final Graph g, final Triple[] triples) {
        for (int i = 0; i < triples.length; ++i) {
            assertTrue("contains " + triples[i], g.contains(triples[i]));
        }
    }

    public void testContains(final Graph g, final List<Triple> triples) {
        for (int i = 0; i < triples.size(); ++i) {
            assertTrue(g.contains((Triple)triples.get(i)));
        }
    }

    public void testContains(final Graph g, final Iterator<Triple> it) {
        while (it.hasNext()) {
            assertTrue(g.contains((Triple)it.next()));
        }
    }

    public void testContains(final Graph g, final Graph other) {
        this.testContains(g, (Iterator<Triple>)GraphUtil.findAll(other));
    }

    public void testOmits(final Graph g, final Triple[] triples) {
        for (int i = 0; i < triples.length; ++i) {
            assertFalse("", g.contains(triples[i]));
        }
    }

    public void testOmits(final Graph g, final List<Triple> triples) {
        for (int i = 0; i < triples.size(); ++i) {
            assertFalse("", g.contains((Triple)triples.get(i)));
        }
    }

    public void testOmits(final Graph g, final Iterator<Triple> it) {
        while (it.hasNext()) {
            assertFalse("", g.contains((Triple)it.next()));
        }
    }

    public void testOmits(final Graph g, final Graph other) {
        this.testOmits(g, (Iterator<Triple>)GraphUtil.findAll(other));
    }

    public static Graph getGraph(final Object wrap, final Class<? extends Graph> graphClass, final ReificationStyle style) {
        try {
            final Constructor<?> cons = getConstructor(graphClass, new Class[] { ReificationStyle.class });
            if (cons != null) {
                return (Graph)cons.newInstance(style);
            }
            final Constructor<?> cons2 = getConstructor(graphClass, new Class[] { wrap.getClass(), ReificationStyle.class });
            if (cons2 != null) {
                return (Graph)cons2.newInstance(wrap, style);
            }
            throw new JenaException("no suitable graph constructor found for " + graphClass);
        }
        catch (RuntimeException e) {
            throw e;
        }
        catch (Exception e2) {
            throw new JenaException((Throwable)e2);
        }
    }

    public static Statement statement(final Model m, final String fact) {
        final StringTokenizer st = new StringTokenizer(fact);
        final Resource sub = resource(m, st.nextToken());
        final Property pred = property(m, st.nextToken());
        final RDFNode obj = rdfNode(m, st.nextToken());
        return m.createStatement(sub, pred, obj);
    }

    public static Statement statement(final String fact) {
        return statement(ModelStuff.aModel, fact);
    }

    public static RDFNode rdfNode(final Model m, final String s) {
        return m.asRDFNode(create((PrefixMapping)m, s));
    }

    public static <T extends RDFNode> T rdfNode(final Model m, final String s, final Class<T> c) {
        return (T)rdfNode(m, s).as((Class)c);
    }

    protected static Resource resource() {
        return ResourceFactory.createResource();
    }

    public static Resource resource(final String s) {
        return resource(ModelStuff.aModel, s);
    }

    public static Resource resource(final Model m, final String s) {
        return (Resource)rdfNode(m, s);
    }

    public static Property property(final String s) {
        return property(ModelStuff.aModel, s);
    }

    public static Property property(final Model m, final String s) {
        return (Property)rdfNode(m, s).as((Class)Property.class);
    }

    public static Literal literal(final Model m, final String s) {
        return (Literal)rdfNode(m, s).as((Class)Literal.class);
    }

    public static Statement[] statements(final Model m, final String facts) {
        final ArrayList<Statement> sl = new ArrayList<Statement>();
        final StringTokenizer st = new StringTokenizer(facts, ";");
        while (st.hasMoreTokens()) {
            sl.add(statement(m, st.nextToken()));
        }
        return sl.toArray(new Statement[sl.size()]);
    }

    public static Resource[] resources(final Model m, final String items) {
        final ArrayList<Resource> rl = new ArrayList<Resource>();
        final StringTokenizer st = new StringTokenizer(items);
        while (st.hasMoreTokens()) {
            rl.add(resource(m, st.nextToken()));
        }
        return rl.toArray(new Resource[rl.size()]);
    }

    public static Set<Resource> resourceSet(final String items) {
        final Set<Resource> result = new HashSet<Resource>();
        final StringTokenizer st = new StringTokenizer(items);
        while (st.hasMoreTokens()) {
            result.add(resource(st.nextToken()));
        }
        return result;
    }

    public static Model modelAdd(final Model m, final String facts) {
        final StringTokenizer semis = new StringTokenizer(facts, ";");
        while (semis.hasMoreTokens()) {
            m.add(statement(m, semis.nextToken()));
        }
        return m;
    }

    public static Model modelWithStatements(final String facts) {
        return modelWithStatements(ReificationStyle.Standard, facts);
    }

    public static Model modelWithStatements(final ReificationStyle style, final String facts) {
        return modelAdd(createModel(style), facts);
    }

    public static Model createModel(final ReificationStyle style) {
        final Model result = ModelFactory.createDefaultModel(style);
        result.setNsPrefixes(PrefixMapping.Extended);
        return result;
    }

    public static Model createMemModel() {
        return RepoDatasetFactory.createDefaultModel();
    }

    public static void assertIsoModels(final String title, final Model wanted, final Model got) {
        if (!wanted.isIsomorphicWith(got)) {
            final Map<Node, Object> map = CollectionFactory.createHashedMap();
            fail(title + ": expected " + nice(wanted.getGraph(), map) + "\n but had " + nice(got.getGraph(), map));
        }
    }

    public static void assertIsoModels(final Model wanted, final Model got) {
        assertIsoModels("models must be isomorphic", wanted, got);
    }

    public static void assertDiffer(final String title, final Object x, final Object y) {
        if (x == null) {
            if (y != null) {
                return;
            }
        }
        else if (!x.equals(y)) {
            return;
        }
        fail(((title == null) ? "objects should be different, but both were: " : title) + x);
    }

    public static void assertDiffer(final Object x, final Object y) {
        assertDiffer(null, x, y);
    }

    public static void assertInstanceOf(final Class<?> expected, final Object x) {
        if (x == null) {
            fail("expected instance of " + expected + ", but had null");
        }
        if (!expected.isInstance(x)) {
            fail("expected instance of " + expected + ", but had instance of " + x.getClass());
        }
    }

    public static <T> Set<T> listToSet(final List<T> L) {
        return (Set<T>)CollectionFactory.createHashedSet((Collection)L);
    }

    public static List<String> listOfStrings(final String s) {
        final List<String> result = new ArrayList<String>();
        final StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            result.add(st.nextToken());
        }
        return result;
    }

    public static Set<String> setOfStrings(final String s) {
        final Set<String> result = new HashSet<String>();
        final StringTokenizer st = new StringTokenizer(s);
        while (st.hasMoreTokens()) {
            result.add(st.nextToken());
        }
        return result;
    }

    public static <T> List<T> listOfOne(final T x) {
        final List<T> result = new ArrayList<T>();
        result.add(x);
        return result;
    }

    public static <T> Set<T> setOfOne(final T x) {
        final Set<T> result = new HashSet<T>();
        result.add(x);
        return result;
    }

    public static <T> List<T> append(final List<? extends T> L, final List<? extends T> R) {
        final List<T> result = new ArrayList<T>(L);
        result.addAll(R);
        return result;
    }

    protected static ExtendedIterator<String> iteratorOfStrings(final String s) {
        return (ExtendedIterator<String>)WrappedIterator.create((Iterator)listOfStrings(s).iterator());
    }

    public static void pass() {
    }

    public static Constructor<?> getConstructor(final Class<?> c, final Class<?>[] args) {
        try {
            return c.getConstructor(args);
        }
        catch (NoSuchMethodException e) {
            return null;
        }
    }

    public static boolean isPublicTestMethod(final Method m) {
        return Modifier.isPublic(m.getModifiers()) && isTestMethod(m);
    }

    public static boolean isTestMethod(final Method m) {
        return m.getName().startsWith("test") && m.getParameterTypes().length == 0 && m.getReturnType().equals(Void.TYPE);
    }

    public static boolean hasAsParent(final Class<?> subClass, final Class<?> superClass) {
        if (subClass == superClass || subClass.getSuperclass() == superClass) {
            return true;
        }
        final Class<?>[] is = subClass.getInterfaces();
        for (int i = 0; i < is.length; ++i) {
            if (hasAsParent(is[i], superClass)) {
                return true;
            }
        }
        return false;
    }

    public static void assertHasParent(final Class<?> subClass, final Class<?> superClass) {
        if (!hasAsParent(subClass, superClass)) {
            fail("" + subClass + " should have " + superClass + " as a parent");
        }
    }

    static {
        ModelStuff.aModel = extendedModel();
        empty = RepoOper.makeReadOnly(RepoDatasetFactory.createPrivateMemModel());
        ModelStuff.bnc = 1000;
    }
}

/*

	Total time: 119 ms

*/
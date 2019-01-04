package org.appdapter.bind.rdf.jena.model;

import org.slf4j.LoggerFactory;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.graph.Node_URI;
import com.hp.hpl.jena.shared.PrefixMapping;
import java.util.Iterator;
import com.hp.hpl.jena.datatypes.RDFDatatype;
import com.hp.hpl.jena.graph.impl.LiteralLabel;
import com.hp.hpl.jena.graph.Node;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.FreeIdent;
import java.math.BigInteger;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.api.trigger.AnyOper;
import com.hp.hpl.jena.rdf.model.RDFNode;
import org.appdapter.core.name.ModelIdent;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.bind.rdf.jena.assembly.AssemblerUtils;
import java.util.Map;
import org.appdapter.core.component.ComponentCache;
import org.appdapter.core.name.Ident;
import org.appdapter.core.component.IdentToObjectListener;
import java.util.LinkedList;
import org.slf4j.Logger;

public class JenaLiteralUtils
{
    public static Logger theLogger;
    public static LinkedList<IdentToObjectListener> identListeners;
    
    public static Object findComponent(final Ident ident, final Class mustBe) {
        final Map<Class, ComponentCache> cmap = getCacheMap();
        if (mustBe == Object.class || mustBe == null) {
            return anyOfAssemblerInstances(ident);
        }
        final Object[] keys;
        synchronized (cmap) {
            keys = cmap.keySet().toArray();
        }
        for (final Object k : keys) {
            final Class ck = (Class)k;
            if (mustBe.isAssignableFrom(ck)) {
                Map<Ident, Object> map = null;
                synchronized (cmap) {
                    map = (Map<Ident, Object>)cmap.get(ck).getCompCache();
                }
                synchronized (map) {
                    return map.get(ident);
                }
            }
        }
        return null;
    }
    
    public static Map<Class, ComponentCache> getCacheMap() {
        return (Map<Class, ComponentCache>)AssemblerUtils.getComponentCacheMap(AssemblerUtils.getDefaultSession());
    }
    
    public static Map<Class, ComponentCache> getObjectCacheMap() {
        return (Map<Class, ComponentCache>)AssemblerUtils.getComponentCacheMap(AssemblerUtils.getDefaultSession());
    }
    
    public static Object anyOfAssemblerInstances(final Ident ident) {
        final Map<Class, ComponentCache> cmap = getCacheMap();
        final Object[] clzes;
        synchronized (cmap) {
            clzes = cmap.values().toArray();
        }
        for (final Object c : clzes) {
            final Map<Ident, Object> map = (Map<Ident, Object>)((ComponentCache)c).getCompCache();
            synchronized (map) {
                final Object c2 = map.get(ident);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }
    
    public static <T> Object convertOrNull(Object obj, final Class<T> objNeedsToBe) {
        Object eval = obj;
        final boolean findComponent = KnownComponent.class.isAssignableFrom(objNeedsToBe);
        if (obj instanceof ModelIdent) {
            obj = ((ModelIdent)obj).getJenaResource();
        }
        if (obj instanceof RDFNode) {
            eval = convertRDFNodeStatic((RDFNode)obj, objNeedsToBe, findComponent);
            if (objNeedsToBe.isInstance(eval)) {
                return eval;
            }
            if (eval != null) {
                obj = eval;
            }
        }
        if (obj instanceof AnyOper.HasIdent) {
            eval = convertIdentNodeStatic(((AnyOper.HasIdent)obj).getIdent(), objNeedsToBe, findComponent);
            if (objNeedsToBe.isInstance(eval)) {
                return eval;
            }
            if (eval != null) {
                obj = eval;
            }
        }
        return eval;
    }
    
    public static <T> T convertRDFNodeStatic(final RDFNode e, Class<T> type, final boolean findComponent) {
        final Node node = e.asNode();
        type = (Class<T>)ReflectUtils.nonPrimitiveTypeFor((Class)type);
        if (Number.class.isAssignableFrom(type) || BigInteger.class.isAssignableFrom(type)) {
            return (T)node.getLiteral().getValue();
        }
        if (Boolean.class.isAssignableFrom(type)) {
            return (T)node.getLiteral().getValue();
        }
        if (Character.class.isAssignableFrom(type)) {
            return (T)node.getLiteral().getValue();
        }
        if (RDFNode.class.isAssignableFrom(type)) {
            final Class<? extends RDFNode> rtype = (Class<? extends RDFNode>)type;
            if (e.canAs((Class)rtype)) {
                return (T)e.as((Class)rtype);
            }
        }
        if (Ident.class.isAssignableFrom(type)) {
            return (T)new FreeIdent(e.asNode().getURI());
        }
        if (String.class.isAssignableFrom(type)) {
            try {
                String lv = node.toString(false);
                lv = unquote(lv);
                return (T)lv;
            }
            catch (Exception ex) {
                Debuggable.printStackTrace((Throwable)ex);
            }
        }
        Object eval = node;
        if (e.isLiteral()) {
            final LiteralLabel lit = node.getLiteral();
            final RDFDatatype dt = lit.getDatatype();
            if (dt != null) {
                final Class clz = dt.getJavaClass();
                if (clz != null && clz != type) {
                    return (T)convertRDFNodeStatic(e, (Class<Object>)clz, findComponent);
                }
            }
            eval = lit.getValue();
            if (!(eval instanceof String)) {
                return (T)eval;
            }
            return (T)lit;
        }
        else {
            if (e.isURIResource() && findComponent) {
                final String uri = node.getURI();
                final Ident id = (Ident)new FreeIdent(uri);
                eval = findComponent(id, type);
                if (eval == null) {
                    eval = node;
                }
            }
            if (e == eval) {
                return (T)e;
            }
            return (T)eval;
        }
    }
    
    public static <T> T convertIdentNodeStatic(final Ident id, final Class<T> type, final boolean findComponent) {
        Object eval = id;
        if (findComponent) {
            eval = findComponent(id, type);
            if (eval == null) {
                eval = id;
            }
        }
        return (T)eval;
    }
    
    private static String unquote(final String lv) {
        final int len = lv.length();
        if (!lv.startsWith("\"") || !lv.endsWith("\"")) {
            return lv;
        }
        final String clv = lv.substring(1, len - 2);
        if (!clv.endsWith("\\") && !clv.contains("\"")) {
            return clv;
        }
        return lv;
    }
    
    public static boolean isMatchAny(final Ident val) {
        return val == null;
    }
    
    public static boolean isTypeMatch(final Ident hasThingType, final Ident targetThingTypeID) {
        return isMatchAny(hasThingType) || isMatchAny(targetThingTypeID) || hasThingType.equals(targetThingTypeID);
    }
    
    public static boolean isIndividualMatch(final Ident hasThing, final Ident targetThingID) {
        return isMatchAny(hasThing) || isMatchAny(targetThingID) || hasThing.equals(targetThingID);
    }
    
    public static boolean isMatch(final Object mustBe, final Object raw) {
        return mustBe != null && raw != null && mustBe.equals(raw);
    }
    
    public static void addIdListener(final IdentToObjectListener listener) {
        synchronized (JenaLiteralUtils.identListeners) {
            JenaLiteralUtils.identListeners.remove(listener);
            JenaLiteralUtils.identListeners.add(0, listener);
        }
    }
    
    public static void removeIdListener(final IdentToObjectListener listener) {
        synchronized (JenaLiteralUtils.identListeners) {
            JenaLiteralUtils.identListeners.remove(listener);
        }
    }
    
    public static void onSetIdent(final Ident id, final Object value) {
        synchronized (JenaLiteralUtils.identListeners) {
            for (final IdentToObjectListener listener : JenaLiteralUtils.identListeners) {
                listener.registerURI(id, value);
            }
        }
    }
    
    public static void onRemoveIdent(final Ident id, final Object value) {
        synchronized (JenaLiteralUtils.identListeners) {
            for (final IdentToObjectListener listener : JenaLiteralUtils.identListeners) {
                listener.deregisterURI(id, value);
            }
        }
    }
    
    public static Object cvtToString(Object value, PrefixMapping mapping) {
        if (value == null) {
            return null;
        }
        final Object val = convertOrNull(value, Object.class);
        if (val instanceof Node_URI) {
            if (mapping == null) {
                if (value instanceof PrefixMapping) {
                    mapping = (PrefixMapping)value;
                }
                else {
                    if (value instanceof ModelIdent) {
                        value = ((ModelIdent)value).getJenaResource();
                    }
                    if (value instanceof Resource) {
                        mapping = (PrefixMapping)((Resource)value).getModel();
                    }
                }
            }
            String ustr;
            if (mapping != null) {
                ustr = ((Node_URI)val).toString(mapping, true);
                if (ustr.startsWith("http://")) {
                    final Map map = mapping.getNsPrefixMap();
                    return val;
                }
            }
            else {
                ustr = ((Node_URI)val).toString(true);
            }
            if (ustr.startsWith("http://")) {
                return val;
            }
            return ustr;
        }
        else {
            if (val instanceof Literal) {
                return val;
            }
            return val;
        }
    }
    
    static {
        JenaLiteralUtils.theLogger = LoggerFactory.getLogger((Class)JenaLiteralUtils.class);
        JenaLiteralUtils.identListeners = new LinkedList<IdentToObjectListener>();
    }
}

/*

	Total time: 70 ms
	
*/
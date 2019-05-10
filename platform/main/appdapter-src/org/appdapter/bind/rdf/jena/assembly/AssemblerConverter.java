package org.appdapter.bind.rdf.jena.assembly;

import org.slf4j.LoggerFactory;
import org.appdapter.api.trigger.AnyOper;
import java.lang.reflect.InvocationTargetException;
import org.appdapter.core.name.FreeIdent;
import java.lang.reflect.Method;
import java.beans.PropertyDescriptor;
import org.appdapter.core.name.Ident;
import java.beans.BeanInfo;
import java.util.Iterator;
import java.beans.Introspector;
import java.util.ArrayList;
import com.hp.hpl.jena.rdf.model.RDFNode;
import com.hp.hpl.jena.rdf.model.Property;
import java.util.Map;
import org.appdapter.core.item.JenaResourceItem;
import org.appdapter.core.item.Item;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.bind.rdf.jena.model.JenaLiteralUtils;
import java.util.List;
import org.appdapter.core.log.Debuggable;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.assembler.Assembler;
import org.slf4j.Logger;
import org.appdapter.core.convert.Converter;

public class AssemblerConverter implements Converter
{
    static Logger theLogger;
    Class targetClass;
    
    public AssemblerConverter(final Assembler asmblr, final Mode mode, final Class tafc) {
        this.targetClass = null;
    }
    
    @Override
    public String toString() {
        return "{" + Debuggable.toInfoStringArgV(new Object[] { "Assember=", this.targetClass, this.getClass() }) + "}";
    }
    
    @Override
	public <T> T convert(final Object obj, final Class<T> objNeedsToBe, final List maxConverts) throws NoSuchConversionException {
        try {
            final Object eval = JenaLiteralUtils.convertOrNull(obj, (Class)objNeedsToBe);
            if (objNeedsToBe.isInstance(eval)) {
                return (T)eval;
            }
            throw ReflectUtils.noSuchConversionException(obj, (Class)objNeedsToBe, (Throwable)null);
        }
        catch (Throwable e) {
            return (T)ReflectUtils.noSuchConversion(obj, (Class)objNeedsToBe, e);
        }
    }
    
    public static AssemblerConverter makeConverter(final Assembler asmblr, final Mode mode, final Class tafc) {
        return new AssemblerConverter(asmblr, mode, tafc);
    }
    
    public static void initObjectProperties(final Object target, final Item item, final Assembler asmblr, final Mode mode, final ItemAssemblyReader reader, final Class tafc) {
        JenaResourceItem resourceItem = null;
        ArrayList<Throwable> oops = null;
        int missedCount = 0;
        final AssemblerConverter converter = makeConverter(asmblr, mode, tafc);
        if (item instanceof JenaResourceItem) {
            resourceItem = (JenaResourceItem)item;
            final Map<Property, List<RDFNode>> properties = (Map<Property, List<RDFNode>>)resourceItem.getPropertyMap();
            for (final Map.Entry<Property, List<RDFNode>> e : properties.entrySet()) {
                if ("type".equals(e.getKey().getLocalName())) {
                    continue;
                }
                try {
                    if (ReflectUtils.setObjectPropertyValue(target, tafc, e.getKey().getLocalName(), (Converter)converter, (List)e.getValue(), true, true)) {
                        continue;
                    }
                    ++missedCount;
                }
                catch (Throwable t) {
                    t.printStackTrace();
                    if (oops == null) {
                        oops = new ArrayList<Throwable>();
                    }
                    oops.add(t);
                }
            }
            if (oops == null && missedCount == 0) {
                return;
            }
        }
        try {
            final BeanInfo info = Introspector.getBeanInfo(tafc);
            final Ident mainIdent = item.getIdent();
            for (final PropertyDescriptor pd : info.getPropertyDescriptors()) {
                String pdn = pd.getName();
                pdn = pdn.substring(0, 1).toLowerCase() + pdn.substring(1);
                final Class pdt = pd.getPropertyType();
                setObjectField(target, item, reader, pd.getWriteMethod(), pdn, pdt, asmblr, mode);
            }
        }
        catch (Throwable e2) {
            throw Debuggable.reThrowable(e2);
        }
    }
    
    public static void setObjectField(final Object thingActionFilterImpl, final Item item, final ItemAssemblyReader reader, final Method writeMethod, final String pdn, Class pdt, final Assembler asmblr, final Mode mode) throws IllegalAccessException, InvocationTargetException {
        if (pdt == null) {
            if (writeMethod != null) {
                pdt = writeMethod.getParameterTypes()[0];
            }
            else {
                pdt = Object.class;
            }
        }
        pdt = ReflectUtils.nonPrimitiveTypeFor(pdt);
        final String sv = reader.readConfigValString(item.getIdent(), pdn, item, (String)null);
        if (sv == null) {
            final List<Object> res = (List<Object>)reader.findOrMakeLinkedObjects(item, pdn, asmblr, mode, (List)null);
            return;
        }
        if (writeMethod == null) {
            AssemblerConverter.theLogger.warn("Missing write method on field: " + pdn + " type " + pdt.getSimpleName() + " = " + sv);
            return;
        }
        AssemblerConverter.theLogger.warn("Setting field: " + pdn + " type " + pdt.getSimpleName() + " = " + sv);
        if (pdt == String.class) {
            writeMethod.invoke(thingActionFilterImpl, sv);
        }
        else if (pdt == Ident.class) {
            writeMethod.invoke(thingActionFilterImpl, new FreeIdent(sv));
        }
    }
    
    @Override
	public Integer declaresConverts(final Object obj, final Class objClass, final Class objNeedsToBe, final List maxConverts) {
        if (obj instanceof RDFNode || obj instanceof AnyOper.HasIdent) {
            return 0;
        }
        return 1;
    }
    
    static {
        AssemblerConverter.theLogger = LoggerFactory.getLogger((Class)AssemblerConverter.class);
    }
}

/*

	Total time: 47 ms
	
*/
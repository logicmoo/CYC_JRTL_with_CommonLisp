package org.appdapter.bind.rdf.jena.assembly;

import org.appdapter.core.component.ComponentAssemblyNames;
import org.appdapter.core.item.Item;
import org.appdapter.core.name.Ident;
import com.hp.hpl.jena.rdf.model.Resource;
import org.appdapter.core.component.MutableKnownComponent;

public abstract class DynamicCachingComponentAssembler<MKC extends MutableKnownComponent> extends CachingComponentAssembler<MKC>
{
    public DynamicCachingComponentAssembler(final Resource r) {
        super(r);
    }
    
    protected Class<MKC> decideComponentClass(final Ident componentID, final Item componentConfigItem) {
        final String jfqcn = this.getReader().readConfigValString(componentID, ComponentAssemblyNames.P_javaFQCN, componentConfigItem, (String)null);
        if (jfqcn != null) {
            this.getLogger().debug("Found component class name: {} ", (Object)jfqcn);
            final Class<MKC> triggerClass = this.findClass(jfqcn);
            return triggerClass;
        }
        throw new RuntimeException("Cannot find class name for componentID: " + componentID);
    }
    
    public Class<MKC> findClass(final String btcFQCN) {
        Class c = null;
        try {
            c = Class.forName(btcFQCN);
        }
        catch (Throwable t) {
            this.getLogger().error("Problem looking up class " + btcFQCN, t);
        }
        return (Class<MKC>)c;
    }
}

/*

	Total time: 29 ms
	
*/
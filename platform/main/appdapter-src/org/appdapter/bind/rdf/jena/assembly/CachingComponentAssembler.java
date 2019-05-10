package org.appdapter.bind.rdf.jena.assembly;

import org.appdapter.core.item.JenaResourceItem;
import org.appdapter.core.component.ComponentAssemblyNames;
import org.appdapter.core.component.KnownComponent;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.assembler.Mode;
import com.hp.hpl.jena.assembler.Assembler;
import org.appdapter.core.item.Item;
import org.appdapter.core.name.Ident;
import java.util.Map;
import org.appdapter.core.component.ComponentCache;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.hp.hpl.jena.assembler.assemblers.AssemblerBase;
import org.appdapter.core.component.MutableKnownComponent;

public abstract class CachingComponentAssembler<MKC extends MutableKnownComponent> extends AssemblerBase
{
    private Logger myLogger;
    private static Logger theBackupLogger;
    public static final String DEFAULT_LABEL = "default-label-";
    public static String DEFAULT_DESC;
    protected ItemAssemblyReader myReader;

    protected Logger getLogger() {
        return this.myLogger;
    }

    public CachingComponentAssembler() {
        this.myLogger = LoggerFactory.getLogger((Class)this.getClass());
        this.myReader = (ItemAssemblyReader)new ItemAssemblyReaderImpl();
    }

    public ItemAssemblyReader getReader() {
        return this.myReader;
    }

    protected AssemblerSession getSession() {
        return AssemblerUtils.getDefaultSession();
    }

    protected ComponentCache<MKC> getCache() {
        final Class tc = this.getClass();
        final Map<Class, ComponentCache> map = (Map<Class, ComponentCache>)AssemblerUtils.getComponentCacheMap(this.getSession());
        ComponentCache<MKC> cc = (ComponentCache<MKC>)map.get(tc);
        if (cc == null) {
            cc = (ComponentCache<MKC>)new ComponentCache();
            map.put(tc, cc);
        }
        return cc;
    }

    protected abstract Class<MKC> decideComponentClass(final Ident p0, final Item p1);

    protected abstract void initExtendedFieldsAndLinks(final MKC p0, final Item p1, final Assembler p2, final Mode p3);

    public CachingComponentAssembler(final Resource assemblerConfResource) {
        this.myLogger = LoggerFactory.getLogger((Class)this.getClass());
        this.myReader = (ItemAssemblyReader)new ItemAssemblyReaderImpl();
        this.getLogger().debug("Constructing CCA {} with config resource: {} ", (Object)this, (Object)assemblerConfResource);
    }

    public static <KC extends KnownComponent> KC makeEmptyComponent(final Class<KC> knownCompClass) {
        KC knownComp = null;
        try {
            knownComp = knownCompClass.newInstance();
        }
        catch (Throwable t) {
            CachingComponentAssembler.theBackupLogger.error("Problem instantiating empty component of class {}", (Object)knownCompClass, (Object)t);
        }
        return knownComp;
    }

    public MKC fetchOrMakeComponent(final Ident compID, final Item confItem, final Assembler asmblr, final Mode mode) {
        final ComponentCache<MKC> cc = this.getCache();
        MKC knownComp = (MKC)cc.getCachedComponent(compID);
        if (knownComp == null) {
            final Class<MKC> knownCompClass = this.decideComponentClass(compID, confItem);
            knownComp = makeEmptyComponent(knownCompClass);
            knownComp.setIdent(compID);
            this.initFieldsAndLinks(knownComp, null, asmblr, mode);
            cc.putCachedComponent(compID, (MKC)knownComp);
        }
        else {
            this.getLogger().debug("Got cache hit on {} ", (Object)knownComp);
        }
        return knownComp;
    }

    private void initFieldsAndLinks(final MKC comp, final Item optionalExplicitItem, final Assembler asmblr, final Mode mode) {
        this.initLabelFields(comp, optionalExplicitItem);
        final Item infoSource = ((ItemAssemblyReaderImpl)this.myReader).chooseBestConfigItem(comp.getIdent(), optionalExplicitItem);
        if (infoSource != null) {
            this.initExtendedFieldsAndLinks(comp, infoSource, asmblr, mode);
        }
    }

    private void initLabelFields(final MKC comp, final Item optionalExplicitItem) {
        final Ident compID = comp.getIdent();
        final String labelValString = this.myReader.readConfigValString(compID, ComponentAssemblyNames.P_label, optionalExplicitItem, "default-label-");
        comp.setShortLabel(labelValString);
        final String descValString = this.myReader.readConfigValString(compID, ComponentAssemblyNames.P_description, optionalExplicitItem, CachingComponentAssembler.DEFAULT_DESC);
        comp.setDescription(descValString);
    }

    @Override
	public final Object open(final Assembler asmblr, final Resource rsrc, final Mode mode) {
        this.getLogger().debug("Assembler[{}] is opening component at: {}", (Object)this, (Object)rsrc);
        final JenaResourceItem wrapperItem = new JenaResourceItem(rsrc);
        final MKC comp = this.fetchOrMakeComponent((Ident)wrapperItem, (Item)wrapperItem, asmblr, mode);
        return comp;
    }

    static {
        CachingComponentAssembler.theBackupLogger = LoggerFactory.getLogger((Class)CachingComponentAssembler.class);
        CachingComponentAssembler.DEFAULT_DESC = "default-desc";
    }
}

/*

	Total time: 31 ms

*/
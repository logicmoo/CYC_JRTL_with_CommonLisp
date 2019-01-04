package org.appdapter.registry.basic;

import java.util.ArrayList;
import java.util.List;
import org.appdapter.api.registry.Pattern;
import org.appdapter.api.registry.Finder;
import java.util.HashMap;
import org.appdapter.api.registry.Description;
import java.util.Map;
import org.appdapter.api.registry.VerySimpleRegistry;
import org.appdapter.core.log.BasicDebugger;

public class BasicRegistry extends BasicDebugger implements VerySimpleRegistry
{
    private Map<Description, Object> myObjectsByDesc;
    
    public BasicRegistry() {
        this.myObjectsByDesc = new HashMap<Description, Object>();
    }
    
    public void registerObject(final Object o, final Description d) {
        this.myObjectsByDesc.put(d, o);
    }
    
    public <OT> Finder<OT> getFinder(final Class<OT> objClaz) {
        return (Finder<OT>)new BasicFinder(this, (Class)objClaz);
    }
    
    protected <OT> BasicFinder<OT> getBasicFinder(final Class<OT> objClaz) {
        final Finder<OT> f = this.getFinder(objClaz);
        return (BasicFinder<OT>)f;
    }
    
    public <OT> OT findRequiredUniqueMatch(final Class<OT> objClaz, final Pattern p) throws Exception {
        final BasicFinder<OT> bf = this.getBasicFinder(objClaz);
        return (OT)bf.findFirstMatch(p, 1, 1);
    }
    
    public <OT> OT findOptionalUniqueMatch(final Class<OT> objClaz, final Pattern p) throws Exception {
        final BasicFinder<OT> bf = this.getBasicFinder(objClaz);
        return (OT)bf.findFirstMatch(p, 0, 1);
    }
    
    public <OT> OT findOptionalFirstMatch(final Class<OT> objClaz, final Pattern p) {
        final BasicFinder<OT> bf = this.getBasicFinder(objClaz);
        try {
            return (OT)bf.findFirstMatch(p, 0, Integer.MAX_VALUE);
        }
        catch (Throwable t) {
            t.printStackTrace();
            throw new RuntimeException("Got unexpected exception of type " + t.getClass());
        }
    }
    
    public <OT> List<OT> findAllMatches(final Class<OT> objClaz, final Pattern p, final int minAllowed, final int maxAllowed) throws Exception {
        final BasicFinder<OT> bf = this.getBasicFinder(objClaz);
        return (List<OT>)bf.findAllMatches(p, minAllowed, maxAllowed);
    }
    
    protected <OT> List<OT> brutishlyCollectAllMatches(final Class<OT> objClz, final Pattern p) {
        final List<OT> resultList = new ArrayList<OT>();
        if (p instanceof BasicPattern) {
            final BasicPattern bp = (BasicPattern)p;
            final Description bpd = bp.getDescription();
            final Object candidate = this.myObjectsByDesc.get(bpd);
            if (candidate != null && objClz.isInstance(candidate)) {
                resultList.add((OT)candidate);
            }
            return resultList;
        }
        throw new UnsupportedOperationException("Cannot use non-BasicPattern " + p + " with BasicRegistry.");
    }
    
    public void registerNamedObject(final Object o, final String objName) {
        final BasicDescription bd = new BasicDescription(objName);
        this.registerObject(o, (Description)bd);
    }
    
    public <OT> OT findOptionalUniqueNamedObject(final Class<OT> objClaz, final String objName) throws Exception {
        final BasicDescription bd = new BasicDescription(objName);
        final Pattern p = (Pattern)new BasicPattern((Description)bd);
        return this.findOptionalUniqueMatch(objClaz, p);
    }
    
    public <OT> OT findRequiredUniqueNamedObject(final Class<OT> objClaz, final String objName) throws Exception {
        final BasicDescription bd = new BasicDescription(objName);
        final Pattern p = (Pattern)new BasicPattern((Description)bd);
        return this.findRequiredUniqueMatch(objClaz, p);
    }
}

/*

	Total time: 44 ms
	
*/
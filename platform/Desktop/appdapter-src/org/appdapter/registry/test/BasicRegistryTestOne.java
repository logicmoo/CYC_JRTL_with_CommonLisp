package org.appdapter.registry.test;

import org.appdapter.api.registry.VerySimpleRegistry;
import org.appdapter.osgi.registry.RegistryServiceFuncs;
import org.appdapter.core.log.BasicDebugger;

public class BasicRegistryTestOne extends BasicDebugger
{
    public static void main(final String[] args) {
        final BasicRegistryTestOne brto = new BasicRegistryTestOne();
        brto.doTest(args);
    }
    
    public void doTest(final String[] args) {
        this.logInfo("START - args=" + args.toString());
        final VerySimpleRegistry vsr = RegistryServiceFuncs.getTheWellKnownRegistry((Class)this.getClass());
        try {
            final String name35 = "thirty five";
            vsr.registerNamedObject((Object)new Long(35L), name35);
            final Number optNum35 = (Number)vsr.findOptionalUniqueNamedObject((Class)Number.class, name35);
            this.logInfo("Found optional number: " + optNum35);
            final Number reqNum35 = (Number)vsr.findRequiredUniqueNamedObject((Class)Number.class, "thirty five");
            this.logInfo("Found required number: " + optNum35);
            final String optFailed35 = (String)vsr.findOptionalUniqueNamedObject((Class)String.class, name35);
            this.logInfo("Should have found null: " + optFailed35);
            this.logInfo("Next line should throw.");
            final String reqFailed35 = (String)vsr.findRequiredUniqueNamedObject((Class)String.class, name35);
            this.logInfo("Oops, got: " + reqFailed35);
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

/*

	Total time: 30 ms
	
*/
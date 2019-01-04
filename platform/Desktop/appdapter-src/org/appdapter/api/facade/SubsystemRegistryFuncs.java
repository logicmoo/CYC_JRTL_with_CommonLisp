package org.appdapter.api.facade;

import org.appdapter.api.registry.VerySimpleRegistry;
import org.appdapter.core.log.BasicDebugger;

public class SubsystemRegistryFuncs extends BasicDebugger
{
    public static <SubRegType extends VerySimpleRegistry> SubRegType findOrMakeSubsystemRegistry(final VerySimpleRegistry rootReg, final Class<SubRegType> subRegClaz, final String subRegName) {
        return (SubRegType)MakableObjectHelpFuncs.findOrMakeUniqueNamedObjectWithDefCons(rootReg, (Class)subRegClaz, subRegName);
    }
    
    public static FacadeRegistry findOrMakeSubsystemFacadeRegistry(final VerySimpleRegistry rootReg, final String subsysRegName) {
        return findOrMakeSubsystemRegistry(rootReg, FacadeRegistry.class, subsysRegName);
    }
}

/*

	Total time: 19 ms
	
*/
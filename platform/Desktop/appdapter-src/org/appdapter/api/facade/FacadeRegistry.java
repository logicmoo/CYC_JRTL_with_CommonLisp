package org.appdapter.api.facade;

import org.appdapter.api.registry.VerySimpleRegistry;
import org.appdapter.registry.basic.BasicRegistry;

public class FacadeRegistry extends BasicRegistry
{
    public <OT> OT findOrMakeUniqueNamedObject(final Class<OT> objClaz, final String objName, final Maker<OT> maker) {
        return (OT)MakableObjectHelpFuncs.findOrMakeUniqueNamedObject((VerySimpleRegistry)this, (Class)objClaz, objName, (Maker)maker);
    }
    
    public <OT> OT findOrMakeUniqueNamedObjectWithDefCons(final Class<OT> objClaz, final String objName) {
        return (OT)MakableObjectHelpFuncs.findOrMakeUniqueNamedObjectWithDefCons((VerySimpleRegistry)this, (Class)objClaz, objName);
    }
    
    public <FT, FK> String chooseBestLocalFacadeName(final FacadeSpec<FT, FK> fs, final String optOverrideName) {
        String actualName = fs.getNameString();
        if (optOverrideName != null) {
            actualName = optOverrideName;
        }
        return actualName;
    }
    
    public <IFT, IFK> IFT findOrMakeInternalFacade(final FacadeSpec<IFT, IFK> fs, final String optOverrideName) {
        final Class<IFT> facadeClaz = (Class<IFT>)fs.getFacadeClass();
        final String actualName = this.chooseBestLocalFacadeName(fs, optOverrideName);
        return this.findOrMakeUniqueNamedObjectWithDefCons(facadeClaz, actualName);
    }
    
    public <EFT, EFK> void registerExternalFacade(final FacadeSpec<EFT, EFK> fs, final EFT facade, final String optOverrideName) {
        final String actualName = this.chooseBestLocalFacadeName(fs, optOverrideName);
        this.registerNamedObject((Object)facade, actualName);
    }
    
    public <EFT, EFK> EFT findExternalFacade(final FacadeSpec<EFT, EFK> fs, final String optOverrideName) {
        final Class<EFT> facadeClaz = (Class<EFT>)fs.getFacadeClass();
        final String actualName = this.chooseBestLocalFacadeName(fs, optOverrideName);
        EFT result = null;
        try {
            result = (EFT)this.findOptionalUniqueNamedObject((Class)facadeClaz, actualName);
        }
        catch (Throwable t) {
            this.logError("Problem finding object: " + actualName + " of class: " + facadeClaz);
        }
        return result;
    }
}

/*

	Total time: 30 ms
	
*/
package org.appdapter.api.facade;

import org.appdapter.registry.basic.BasicDescription;
import org.appdapter.api.registry.Description;

public abstract class BasicMaker<OT> implements Maker<OT>
{
    @Override
	public Description getRegistryDesc(final OT obj, final String objName) {
        return (Description)new BasicDescription(objName);
    }
}

/*

	Total time: 6 ms
	
*/
package org.appdapter.api.facade;

import org.slf4j.LoggerFactory;
import org.appdapter.api.registry.Description;
import org.appdapter.api.registry.VerySimpleRegistry;
import org.slf4j.Logger;

public class MakableObjectHelpFuncs
{
    private static final Logger theLogger;

    public static <OT> OT findOrMakeUniqueNamedObject(final VerySimpleRegistry vsr, final Class<OT> objClaz, final String objName, final Maker<OT> maker) {
        OT result = null;
        try {
            result = (OT)vsr.findOptionalUniqueNamedObject((Class)objClaz, objName);
            if (result == null) {
                result = (OT)maker.makeObj();
                final Description regDesc = maker.getRegistryDesc((OT)result, objName);
                vsr.registerObject((Object)result, regDesc);
            }
        }
        catch (Throwable t) {
            MakableObjectHelpFuncs.theLogger.error("findOrMakeUniqueNamedObject got finder or maker exception: ", t);
        }
        return result;
    }

    public static <OT> OT findOrMakeUniqueNamedObjectWithDefCons(final VerySimpleRegistry vsr, final Class<OT> objClaz, final String objName) {
        return findOrMakeUniqueNamedObject(vsr, objClaz, objName, (org.appdapter.api.facade.Maker<OT>)new BasicMaker<OT>() {
            public OT makeObj() {
                try {
                    MakableObjectHelpFuncs.theLogger.info("Making new object named " + objName + " using default constructor of " + objClaz);
                    return objClaz.newInstance();
                }
                catch (InstantiationException ie) {
                    MakableObjectHelpFuncs.theLogger.error("findOrMakeUniqueNamedObjectWithDefCons got default constructor exception: ", (Throwable)ie);
                    return null;
                }
                catch (IllegalAccessException iae) {
                    MakableObjectHelpFuncs.theLogger.error("findOrMakeUniqueNamedObjectWithDefCons got default constructor exception: ", (Throwable)iae);
                    return null;
                }
            }
        });
    }

    static {
        theLogger = LoggerFactory.getLogger((Class)MakableObjectHelpFuncs.class);
    }
}

/*

	Total time: 32 ms

*/
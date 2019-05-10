package org.appdapter.osgi.registry;

import org.slf4j.LoggerFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.appdapter.registry.basic.BasicRegistry;
import org.osgi.framework.ServiceReference;
import java.util.Dictionary;
import org.osgi.framework.ServiceRegistration;
import org.appdapter.api.registry.Registry;
import org.osgi.framework.BundleContext;
import org.appdapter.api.registry.VerySimpleRegistry;
import org.slf4j.Logger;

public class RegistryServiceFuncs
{
    private static Logger theLogger;
    public static Class THE_WELL_KNOWN_REG_DEFAULT_INTF;
    public static Class THE_WELL_KNOWN_REG_DEFAULT_IMPL;
    private static VerySimpleRegistry theNonOsgiWKR;

    public static <RT extends Registry> ServiceRegistration registerTheWellKnownRegistry(final BundleContext bundleCtx, final Class<RT> regClazz, final RT wellKnownReg) {
        return bundleCtx.registerService(regClazz.getName(), (Object)wellKnownReg, (Dictionary)null);
    }

    public static ServiceRegistration registerTheWellKnownRegistry(final BundleContext bundleCtx, final VerySimpleRegistry wellKnownReg) {
        return registerTheWellKnownRegistry(bundleCtx, VerySimpleRegistry.class, wellKnownReg);
    }

    public static <RT extends Registry> RT lookupTheWellKnownRegistry(final BundleContext bundleCtx, final Class<RT> rtClazz) {
        final ServiceReference ref = bundleCtx.getServiceReference(rtClazz.getName());
        if (ref == null) {
            return null;
        }
        return (RT)bundleCtx.getService(ref);
    }

    public static VerySimpleRegistry lookupTheWellKnownRegistry(final BundleContext bundleCtx) {
        return lookupTheWellKnownRegistry(bundleCtx, VerySimpleRegistry.class);
    }

    public static VerySimpleRegistry getTheWellKnownRegistryUsingReqContext(final BundleContext bundleCtx) {
        VerySimpleRegistry vsr = lookupTheWellKnownRegistry(bundleCtx);
        if (vsr == null) {
            RegistryServiceFuncs.theLogger.warn("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  Creating default WellKnownRegistry");
            final VerySimpleRegistry theVsr = (VerySimpleRegistry)new BasicRegistry();
            final ServiceRegistration sreg = registerTheWellKnownRegistry(bundleCtx, theVsr);
            RegistryServiceFuncs.theLogger.info("Got ServiceRegistration: " + sreg);
            vsr = lookupTheWellKnownRegistry(bundleCtx);
        }
        return vsr;
    }

    public static VerySimpleRegistry getTheWellKnownStaticRegistry() {
        RegistryServiceFuncs.theLogger.info("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  Getting singleton WellKnownRegistry in non-OSGi context");
        if (RegistryServiceFuncs.theNonOsgiWKR == null) {
            RegistryServiceFuncs.theLogger.warn("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%  Making singleton WellKnownRegistry for non-OSGi context");
            RegistryServiceFuncs.theNonOsgiWKR = (VerySimpleRegistry)new BasicRegistry();
        }
        return RegistryServiceFuncs.theNonOsgiWKR;
    }

    public static VerySimpleRegistry getTheWellKnownRegistryUsingOptContext(final BundleContext bundleCtx) {
        if (bundleCtx != null) {
            return getTheWellKnownRegistryUsingReqContext(bundleCtx);
        }
        return getTheWellKnownStaticRegistry();
    }

    public static VerySimpleRegistry getTheWellKnownRegistry(final Class osgiCredentialClaz) {
        BundleContext localBundleCtx = null;
        final Bundle localBundle = FrameworkUtil.getBundle(osgiCredentialClaz);
        if (localBundle != null) {
            localBundleCtx = localBundle.getBundleContext();
            if (localBundleCtx != null) {
                RegistryServiceFuncs.theLogger.debug("Found legit bundleCtx {} associated to bundle {} via credClaz {} ", new Object[] { localBundleCtx, localBundle, osgiCredentialClaz });
            }
            else {
                RegistryServiceFuncs.theLogger.warn("Bundle getBundleContext() returned null - OSGi permissions or load-ordering problem for bundle {} in state {} via credClaz {}", new Object[] { localBundle, localBundle.getState(), osgiCredentialClaz });
                final Exception e = new Exception("OSGi bundle permissions problem");
                e.fillInStackTrace();
                e.printStackTrace();
            }
        }
        else {
            RegistryServiceFuncs.theLogger.warn("%%%%%%%%%% Cannot get local bundle, so we are assumed to be outside OSGi (credentialClaz={})", (Object)osgiCredentialClaz);
        }
        return getTheWellKnownRegistryUsingOptContext(localBundleCtx);
    }

    static {
        theLogger = LoggerFactory.getLogger((Class)RegistryServiceFuncs.class);
        RegistryServiceFuncs.THE_WELL_KNOWN_REG_DEFAULT_INTF = VerySimpleRegistry.class;
        RegistryServiceFuncs.THE_WELL_KNOWN_REG_DEFAULT_IMPL = BasicRegistry.class;
    }
}

/*

	Total time: 34 ms

*/
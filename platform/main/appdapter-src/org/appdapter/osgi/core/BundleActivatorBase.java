package org.appdapter.osgi.core;

import org.appdapter.core.boot.ClassLoaderUtils;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import ext.osgi.common.MacroBundleActivatorBase;

public abstract class BundleActivatorBase extends MacroBundleActivatorBase implements BundleActivator
{
    public BundleActivatorBase() {
        ClassLoaderUtils.registerClassLoader((Object)this, (BundleContext)null);
    }

    @Override
	public void start(final BundleContext bundleCtx) throws Exception {
        super.start(bundleCtx);
        ClassLoaderUtils.registerClassLoader((Object)this, bundleCtx);
        this.getLogger().info(this.describe("start<BundleActivatorBase>", bundleCtx));
        this.scheduleFrameworkStartEventHandler(bundleCtx);
    }

	@Override
	public void stop(final BundleContext bundleCtx) throws Exception {
        super.stop(bundleCtx);
        ClassLoaderUtils.unregisterClassLoader((Object)this, bundleCtx);
        this.getLogger().info(this.describe("stop<BundleActivatorBase>", bundleCtx));
    }
}

/*

	Total time: 7 ms

*/
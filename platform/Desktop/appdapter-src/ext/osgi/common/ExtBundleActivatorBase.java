package ext.osgi.common;

import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleActivator;

public abstract class ExtBundleActivatorBase extends MacroBundleActivatorBase implements BundleActivator
{
    public void start(final BundleContext bundleCtx) throws Exception {
        super.start(bundleCtx);
    }
    
    protected void handleFrameworkStartedEvent(final BundleContext bundleCtx) throws Exception {
        if (isOSGIProperty("osgi-tests", (Object)true)) {
            this.ensureExtClassesAreFindable();
        }
    }
}

/*

	Total time: 6 ms
	
*/
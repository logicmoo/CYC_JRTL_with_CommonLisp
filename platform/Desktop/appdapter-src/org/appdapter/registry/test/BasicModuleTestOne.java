package org.appdapter.registry.test;

import org.appdapter.module.basic.NullModule;
import org.appdapter.api.registry.VerySimpleRegistry;
import org.appdapter.osgi.registry.RegistryServiceFuncs;
import org.appdapter.module.basic.EmptyTimedModule;
import org.appdapter.api.module.Module;
import org.appdapter.module.basic.BasicModulator;
import org.appdapter.api.module.Modulator;
import org.appdapter.core.log.BasicDebugger;

public class BasicModuleTestOne extends BasicDebugger
{
    public void processBatches(final Modulator mu, final int count) {
        for (int i = 0; i < count; ++i) {
            mu.processOneBatch();
        }
    }

    public void syncTest() {
        final Modulator mu = (Modulator)new BasicModulator((Object)new Ctx(), true);
        this.processBatches(mu, 5);
        final PowerModule pm1 = new PowerModule();
        pm1.setDebugImportanceThreshold(Integer.MIN_VALUE);
        mu.attachModule((Module)pm1);
        final EmptyTimedModule etm = new EmptyTimedModule();
        mu.attachModule((Module)etm);
        this.processBatches(mu, 10);
        pm1.markStopRequested();
        this.processBatches(mu, 5);
        try {
            this.logInfo("Expecting exception as we try to detach a module that was already auto-detached");
            mu.detachModule((Module)pm1);
        }
        catch (RuntimeException re) {
            this.logInfo("Caught the exception, as expected");
            this.logError("Caught expected exception, but logging as error - for fun! ", (Throwable)re);
            this.logWarning("And now, as a warning: ", (Throwable)re);
        }
        this.processBatches(mu, 5);
    }

    public void asyncTest() throws Throwable {
        final Modulator mu = (Modulator)new BasicModulator((Object)new Ctx(), false);
        final Thread runner = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        while (true) {
                            mu.processOneBatch();
                        }
                    }
                    catch (Throwable t) {
                        BasicModuleTestOne.this.logError("Caught", t);
                        continue;
                    }
                    //break;
                }
            }
        });
        runner.start();
        final PowerModule pm1 = new PowerModule();
        pm1.setDebugImportanceThreshold(Integer.MIN_VALUE);
        mu.attachModule((Module)pm1);
        Thread.sleep(200L);
        pm1.markStopRequested();
        Thread.sleep(200L);
        mu.detachModule((Module)pm1);
        Thread.sleep(200L);
    }

    public void runTest() {
        this.logInfo("------------BasicModuleTestOne-----------");
        final VerySimpleRegistry vsr = RegistryServiceFuncs.getTheWellKnownRegistry((Class)this.getClass());
        try {
            this.logInfo("========================================");
            this.logInfo("Starting syncTest()");
            this.logInfo("========================================");
            this.syncTest();
            this.logInfo("========================================");
            this.logInfo("Finished syncTest(), starting asyncTest()");
            this.logInfo("========================================");
            this.asyncTest();
            this.logInfo("========================================");
            this.logInfo("Finished asyncTest()");
            this.logInfo("========================================");
        }
        catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(final String[] args) {
        final BasicModuleTestOne bmto = new BasicModuleTestOne();
        bmto.runTest();
    }

    static class Ctx
    {
        public String myData;

        Ctx() {
            this.myData = "Yes, please!";
        }
    }

    public static class PowerModule extends NullModule<Ctx>
    {
        @Override
		public synchronized void runOnce() {
            this.enterBasicRunOnce();
            final Long runStart = this.logInfoEvent(0, true, (Long)null, "runOnce", new Object[] { "BEGIN" });
            final Ctx c = (Ctx)this.getContext();
            this.logInfoEvent(0, true, runStart, "runOnce", new Object[] { "" });
            this.exitBasicRunOnce();
        }
    }
}

/*

	Total time: 32 ms

*/
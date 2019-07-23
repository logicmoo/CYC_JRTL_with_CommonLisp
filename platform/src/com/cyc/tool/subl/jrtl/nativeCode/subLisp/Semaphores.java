/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class Semaphores extends SubLTrampolineFile {
    public static SubLObject new_semaphore(SubLObject name, SubLObject count) {
        if (count == CommonSymbols.UNPROVIDED)
            count = CommonSymbols.ONE_INTEGER;
        return SubLObjectFactory.makeSemaphore(name.toStr(), count.intValue());
    }

    public static SubLObject semaphore_current_count(SubLObject semaphore) {
        return SubLNumberFactory.makeInteger(semaphore.toSemaphore().getCount());
    }

    public static SubLObject semaphore_drain(SubLObject semaphore) {
        return SubLNumberFactory.makeInteger(semaphore.toSemaphore().drain());
    }

    public static SubLObject semaphore_name(SubLObject semaphore) {
        return semaphore.toSemaphore().getSubLName();
    }

    public static SubLObject semaphore_p(SubLObject possibleSemaphore) {
        return possibleSemaphore.isSemaphore() ? CommonSymbols.T : SubLNil.NIL;
    }

    public static SubLObject semaphore_signal(SubLObject semaphore) {
        semaphore.toSemaphore().release(1);
        return semaphore;
    }

    public static SubLObject semaphore_wait(SubLObject semaphore) {
        semaphore.toSemaphore().acquire(1);
        return semaphore;
    }

    public static SubLObject semaphore_wait_with_timeout(SubLObject semaphore, SubLObject max_secs_to_wait) {
        return semaphore.toSemaphore().acquireWithTimeoutNanoSecs(1, (long) (max_secs_to_wait.doubleValue() * 1.0E9)) ? CommonSymbols.RET_T : SubLNil.NIL;
    }

    public static SubLFile me;
    static {
        me = new Semaphores();
    }

    @Override
    public void declareFunctions() {
        try {
            SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_p", "SEMAPHORE-P", 1, 0, false);
            SubLFiles.declareFunction(Semaphores.me, "new_semaphore", "NEW-SEMAPHORE", 1, 1, false);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_name", "SEMAPHORE-NAME", 1, 0, false);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_signal", "SEMAPHORE-SIGNAL", 1, 0, false);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_wait", "SEMAPHORE-WAIT", 1, 0, false);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_drain", "SEMAPHORE-DRAIN", 1, 0, false);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_wait_with_timeout", "SEMAPHORE-WAIT-WITH-TIMEOUT", 2, 0, false);
            SubLFiles.declareFunction(Semaphores.me, "semaphore_current_count", "SEMAPHORE-CURRENT-COUNT", 1, 0, false);
        } finally {
            SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE.toPackage());
        }
    }

    @Override
    public void initializeVariables() {
    }

    @Override
    public void runTopLevelForms() {
    }
}

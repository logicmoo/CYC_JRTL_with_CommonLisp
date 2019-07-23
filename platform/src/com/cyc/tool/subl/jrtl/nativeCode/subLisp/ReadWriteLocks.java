/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class ReadWriteLocks extends SubLTrampolineFile {
	public static SubLObject new_rw_lock(SubLObject name) {
		return SubLObjectFactory.makeReadWriteLock(name.toStr());
	}

	public static SubLObject rw_lock_name(SubLObject rwLock) {
		return rwLock.toReadWriteLock().getSubLName();
	}

	public static SubLObject rw_lock_p(SubLObject possibleRWLock) {
		return possibleRWLock.isReadWriteLock() ? CommonSymbols.T : SubLNil.NIL;
	}

	public static SubLObject rw_lock_release_read_lock(SubLObject rwLock) {
		rwLock.toReadWriteLock().releaseReadLock();
		return rwLock;
	}

	public static SubLObject rw_lock_release_write_lock(SubLObject rwLock) {
		rwLock.toReadWriteLock().releaseWriteLock();
		return rwLock;
	}

	public static SubLObject rw_lock_seize_read_lock(SubLObject rwLock) {
		rwLock.toReadWriteLock().seizeReadLock();
		return rwLock;
	}

	public static SubLObject rw_lock_seize_write_lock(SubLObject rwLock) {
		rwLock.toReadWriteLock().seizeWriteLock();
		return rwLock;
	}

	public static SubLObject rw_lock_waiters(SubLObject rwLock) {
		return rwLock.toReadWriteLock().getWaiters();
	}

	public static SubLObject rw_lock_writer(SubLObject rwLock) {
		return rwLock.toReadWriteLock().getWriter();
	}

	public static SubLFile me;
	static {
		me = new ReadWriteLocks();
	}

	@Override
	public void declareFunctions() {
		try {
			SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_p", "RW-LOCK-P", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_p", "READER-WRITER-LOCK-P", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "new_rw_lock", "NEW-RW-LOCK", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "new_rw_lock", "NEW-READER-WRITER-LOCK", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_name", "RW-LOCK-NAME", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_name", "READER-WRITER-LOCK-NAME", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_seize_read_lock", "RW-LOCK-SEIZE-READ-LOCK", 1, 0,
					false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_seize_write_lock", "RW-LOCK-SEIZE-WRITE-LOCK", 1, 0,
					false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_release_read_lock", "RW-LOCK-RELEASE-READ-LOCK", 1, 0,
					false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_release_write_lock", "RW-LOCK-RELEASE-WRITE-LOCK", 1,
					0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_waiters", "RW-LOCK-WAITERS", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_waiters", "READER-WRITER-LOCK-WAITERS", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_writer", "RW-LOCK-WRITER", 1, 0, false);
			SubLFiles.declareFunction(ReadWriteLocks.me, "rw_lock_writer", "READER-WRITER-LOCK-WRITER", 1, 0, false);
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

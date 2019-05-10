package SxxMachine;

import java.util.IdentityHashMap;
import java.util.Map;

import SxxMachine.pterm.HashtableOfTerm;

/**
 * Backup of a Prolog interpreter that can later create a new interpreter.
 * <p>
 * A new interpreter can be bootstrapped by passing this copy object to a
 * PrologControl constructor. Machine copies are primarily intended to let
 * callers reuse the state constructed by running {@code consult(+File)} prior
 * to perform any module initialization or predicate evaluation.
 * <p>
 * Only the PrologClassLoader, internal hash manager and database are copied.
 * These are sections of an interpreter that relate to what code is available.
 */
public class PrologMachineCopy {
    /**
     * Save the database of a current PrologControl.
     *
     * @param ctl
     *            control to copy the database of.
     * @return the copy.
     */
    public static PrologMachineCopy save(PrologControl ctl) {
        return new PrologMachineCopy(ctl.engine, true);
    }

    /**
     * Save the database of a current Prolog interpreter.
     *
     * @param engine
     *            interpreter to copy the database of.
     * @return the copy.
     */
    public static PrologMachineCopy save(Prolog engine) {
        return new PrologMachineCopy(engine, true);
    }

    public static PrologMachineCopy cloneCheap(Prolog engine) {
        return new PrologMachineCopy(engine, false);
    }

    protected final PrologClassLoader pcl;
    protected final HashtableOfTerm hashManager;
    protected final InternalDatabase internalDB;
    private boolean noCopy;

    private PrologMachineCopy(Prolog engine, boolean deep) {
        this.pcl = engine.pcl;
        // During backup, copy all terms using a single consistent copyHash.
        // This isolates the copy from the source interpreter, in case it gets
        // modified again later.
        //
        // During restore terms are not copied.
        // try {
        // engine.copyHash.clear();
        Map<Object, Term> copyHash = new IdentityHashMap<Object, Term>();
        if (deep) {
            this.hashManager = engine.getHashManager().copyDeep(copyHash);
            this.internalDB = engine.internalDB.copyInternalDatabase(true, copyHash);
        } else {
            noCopy = true;
            this.hashManager = engine.getHashManager();
            this.internalDB = engine.internalDB;
        }
        // } finally {
        // engine.copyHash.clear();
        // }
    }

    public boolean noCopy() {
        // TODO Auto-generated method stub
        return this.noCopy;
    }

}

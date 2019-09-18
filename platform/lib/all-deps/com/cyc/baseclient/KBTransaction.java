package com.cyc.baseclient;

import com.cyc.base.cycobject.Fort;
import java.util.List;
import com.cyc.base.cycobject.ELMt;

/**
 * Defines the interface for KB Transaction, which provide support similar to that of database transactions.
 * @author daves
 */
public interface KBTransaction {

    /**
     * Begin the KBTransaction. Supported KB modification operations will be
     * recorded and available for rollback if needed.
     *
     */
    void begin();

    /**
     * Commit all of the KB modification operations that have occurred within
     * this transaction. If there are any failures, a RuntimeException will be
     * thrown. After commit() has returned (whether normally or by throwing an
     * exception), this KBTransaction will no longer be active.
     */
    void commit();

    /**
     * Roll back any KB modifications that occurred while this KBTransaction was
     * active.  After rollback(), this KBTransaction will no longer be active.
     */
    void rollback();

    /**
     * Assign to the transaction the job of asserting sentence with the relevant
     * parameters.
     *
     * @param sentence The sentence to be asserted.
     * @param mt The Microtheory in which to make the assertion
     * @param bookkeeping If true, bookkeeping will be stored along with the assertion.
     * @param transcripting If true, the new assertion will be added to the Cyc server's transcript.
     * @param wffCheckingDisabled If true, the assertion will be made to the Cyc server without any semantic well-formedness checking.
     * @param templates A list of creationTemplates that should be used when making this assertion.
     */
    void noteForAssertion(String sentence, ELMt mt, boolean bookkeeping, boolean transcripting, boolean wffCheckingDisabled, List<Fort> templates);

    /**
     * Assign to the transaction the job of asserting sentence with the relevant
     * parameters.
     *
     * @param sentence The sentence to be unasserted
     * @param mt The microtheory from which <code>sentence</code> should be
     * unasserted
     * @param bookkeeping Should bookkeeping be made when unasserting?
     * @param transcripting Should the unassertion be added to the Cyc server
     * transcript?
     */
    void noteForUnassertion(String sentence, ELMt mt, boolean bookkeeping, boolean transcripting);

    /**
     * Note in the transaction that term has been created. Unlike
     * noteForAssertion and noteForUnassertion, noteCreation does not take over
     * the creation of the constant. Instead it merely remembers on the
     * transaction that this constant has been created inside the transaction,
     * so it can be unwound as necessary if the transaction is rolled back.
     *
     * @param term The constant that was created
     */
    void noteCreation(Fort term);
}

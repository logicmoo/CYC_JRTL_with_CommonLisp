package SxxMachine;

public interface Fluent extends Term {

    @Override
    Term toClone();

    boolean isFluent();

    /**
     * Dynamically sets the persistence status of this Fluent. A persistent Fluent
     * will not have its stop method outomatically called upon backtracking. A
     * typical example would be a file or socket handle saved to the database to be
     * reused after backtracking.
     */
    void setPersistent(boolean persistent);

    /**
     * returns true if this Fluent is persistent, false otherwise
     */
    boolean getPersistent();

    void stop();

    /**
     * applies a non-persistent Fluent's stop() method on backtracking
     */
    void undo();

}
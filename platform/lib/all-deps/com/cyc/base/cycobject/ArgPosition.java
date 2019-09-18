package com.cyc.base.cycobject;

import java.util.List;

/**
 *
 * @author nwinant
 */
public interface ArgPosition extends CycObject {
  
  public ArgPosition deepCopy();

  /**
   * Get the nesting depth of this arg position. Top-level argument positions have depth 1.
   *
   * @return the nesting depth of this arg position
   */
  public int depth();

  /**
   * Destructively extend this arg position by another arg position.
   *
   * @param otherArgPos
   * @return this ArgPosition.
   */
  public ArgPosition extend(ArgPosition otherArgPos);

  /**
   * Destructively extend this arg position by one argnum.
   *
   * @param argnum
   * @return this ArgPosition.
   */
  public ArgPosition extend(Integer argnum);

  /**
   * Get the first element in this arg position's path.
   * This is the argument number of the argument of the top-level formula
   * that contains this position.
   * @return the argument number.
   */
  public Integer first();

  /**
   * Get the list of argnums for this arg position, from top level to deepest level.
   *
   * @return the list of argnums for this arg position,
   */
  public List<Integer> getPath();

  /**
   * Check if this arg position is for an ancestor of another arg position.
   *
   * @param otherArgPositionI
   * @return true iff his arg position is for an ancestor of otherArgPosition
   */
  public boolean isPrefixOf(ArgPosition otherArgPositionI);

  /**
   * Get the argnum of the designated argument in its immediate context.
   *
   * @return the argnum of the designated argument
   */
  public Integer last();

  /**
   * Does this arg position match candidate?
   *
   * @param candidate
   * @param matchEmpty Should we match the null arg position?
   * @return true iff this arg position matches candidate
   */
  public boolean matchingArgPositionI(ArgPosition candidate, boolean matchEmpty);

  /**
   * Destructively modify this ArgPosition to be its parent arg position.
   *
   * @return this ArgPosition.
   */
  public ArgPosition toParent();
}

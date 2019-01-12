/**
 * An interface for representing and generating justifications of Cyc inference answers.
 *
 *
 * @author baxter
 */
package org.opencyc.justification;

import java.util.List;
import org.opencyc.inference.InferenceAnswer;

/**
 *
 * @author baxter
 */
public interface Justification {

  /**
   * Get the root of the tree structure of this justification.
   * A suggested rendering algorithm would display this node, and recurse
   * on its child nodes iff it is to be expanded initially.
   *
   * @see org.opencyc.justification.Justification.Node#isExpandInitially()
   * @return the root node
   */
  Node getRoot();

  /**
   * Flesh out this justification, setting its root node and tree
   * structure underneath the root.
   */
  void populate();

  /**
   * Returns the inference answer justified by this object
   *
   * @return the inference answer
   */
  InferenceAnswer getAnswer();

  /**
   * Marshal this justification into a DOM tree.
   *
   * @param destination
   */
  void marshal(org.w3c.dom.Node destination);

  /**
   * An interface representing one node in a Justification tree.
   */
  public interface Node {

    /**
     * Returns the HTML string for this node.
     *
     * @return the HTML string for this node.
     */
    String getHTML();

    /**
     * Returns a string rendering of the CycL content of this node.
     *
     * @return a string rendering the CycL content of this node.
     */
    String getCycLString();

    /**
     * Returns the CycL content of this node.
     *
     * @return the CycL content of this node.
     */
    Object getCycL();

    /**
     * Returns the children of this node.
     *
     * @return the children of this node.
     */
    List<? extends Node> getChildren();

    /**
     * Is it advised that this node be expanded when first displayed to expose its children?
     *
     * @return true iff it is so advised.
     */
    boolean isExpandInitially();

    /**
     * Marshal this node into a DOM tree.
     *
     * @param destination
     */
    void marshal(org.w3c.dom.Node destination);

    /**
     * Get the number of levels between this node and the root.
     * @return the depth
     */
    public int getDepth();

    /**
     * Get the parent node of this node.
     * @return the parent node, or null if it has no parent.
     */
    Node getParent();

    /**
     * Get the label for this node.
     * @return the label, or null if none.
     */
    String getLabel();
  }
}

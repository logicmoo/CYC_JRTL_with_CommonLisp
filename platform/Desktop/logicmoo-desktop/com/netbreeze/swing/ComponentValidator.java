

package com.netbreeze.swing;
import java.awt.Component;

/**
*
* @author Henrik
* @version 1.0
*
*/
public interface ComponentValidator {

	/**
  * Checks the contents of the given control and
  * determines whether or not the data is valid.
  * Throws an exception if the component is invalid
  */
  public void validateComponent(Component control) throws InvalidComponentException;
}

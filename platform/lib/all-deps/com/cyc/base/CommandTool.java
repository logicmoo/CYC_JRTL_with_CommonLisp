package com.cyc.base;

import com.cyc.base.cycobject.FormulaSentence;
import com.cyc.base.cycobject.Fort;
import com.cyc.base.cycobject.CycList;
import com.cyc.base.cycobject.CycObject;
import java.util.List;

/**
 *
 * @author nwinant
 */
public interface CommandTool {
  
  /**
   * Converses with Cyc to perform an API command whose result is returned as a boolean.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  boolean converseBoolean(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is returned as a CycObject.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycObject converseCycObject(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is returned as an int.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  int converseInt(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is returned as a list. The symbol
   * nil is returned as the empty list.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  CycList converseList(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is returned as an object.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  Object converseObject(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command. Creates a new connection for this command if
   * the connection is not persistent.
   *
   * @param command the command string or CycList
   *
   * @return the result as an object array of two objects
   * @see com.cyc.base.CycConnectionInterface#converse(Object)
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  // @note Used by BOAPI.
  Object[] converseRaw(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is returned as a Cyc sentence.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  FormulaSentence converseSentence(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is returned as a String.
   *
   * @param command the command string or CycList
   *
   * @return the result of processing the API command
   *
   * @throws CycConnectionException if a data communication error occurs or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   * @throws RuntimeException if the return from Cyc is not a string
   */
  String converseString(Object command) throws CycConnectionException, CycApiException;

  /**
   * Converses with Cyc to perform an API command whose result is void.
   *
   * @param command the command string or CycList
   *
   * @throws CycConnectionException if cyc server host not found on the network or a data communication error occurs
   * @throws CycApiException if the api request results in a cyc server error
   */
  void converseVoid(final Object command) throws CycConnectionException, CycApiException;
  
  /**
   * Wraps the given api command string with the binding environment for bookkeeping assertions.
   *
   * @param command the given command string
   *
   * @return the given api command string with the binding environment for bookkeeping assertions
   */
  String wrapBookkeeping(String command);

  String wrapCyclistAndPurpose(String command);

  String wrapCyclistAndPurpose(String command, String cyclistName, String projectName);

  String wrapDisableWffChecking(String command);

  String wrapDynamicBinding(String command, String symbolName, String apiValue);

  String wrapForwardInferenceRulesTemplates(String command, List<Fort> templates);
}

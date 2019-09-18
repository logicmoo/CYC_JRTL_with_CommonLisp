package com.cyc.kb;

import static com.cyc.kb.BinaryPredicate.getStatus;
import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.opencyc.api.CycAccess;

import org.opencyc.api.CycApiException;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycList;
import org.opencyc.cycobject.CycNart;
import org.opencyc.cycobject.CycNaut;
import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.Guid;
import org.opencyc.nl.NLFormat;
import org.opencyc.util.DateConverter;
import org.opencyc.util.ParseException;

/**
 *
 * Each Function object is essentially a facade for a
 * <code>#$Function-Denotational</code> in a Cyc KB. This class provides
 * convenient access to many of the most important and frequently used types of
 * assertions that are relevant to CycL functions. It also provides a method to
 * create new functional terms, which can in turn be used in other assertions,
 * just as constants are.
 * <p>
 * The constructors in this class should not be used for accessing
 * <code>Function</code> objects. The
 * <code>Function</code> class contains static factory methods for the most
 * commonly used ways of accessing
 * <code>Function</code> objects, and additional API methods for
 * find/retrieving/accessing
 * <code>Function</code> objects can be found in the {@link FunctionFactory}.
 * <p>
 * A new function is by default made a
 * <code>#$ReifiableFunction</code> in the underlying Cyc Knowledge Base. A
 * future version of the API will support un-reifiable functions.
 *
 *
 * @author Vijay Raj
 * @version	"%I%, %G%"
 * @since	0.90
 * @TODO: Add examples
 */
public class Function extends Relation {

  static final Logger log = Logger.getLogger(Function.class.getName());
  private static final CycDenotationalTerm TYPE_CORE =
          new CycConstant("Function-Denotational", new Guid("bd5c40b0-9c29-11b1-9dad-c379636f7270"));

  static CycDenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }

  /**
   *
   * This is not part of the KB API. For relevant API methods, see
   * {@link FunctionFactory} or the static {@link #get} and
   * {@link #findOrCreate} methods in this class.
   *
   * @param cycFunc	the CycObject representing a #$Function-Denotational. The
   * constructor verifies that the CycObject is a #$Function
   *
   * @throws KBApiException	if cycFunc is not an #$Function
   *
   */
  Function(CycObject cycFunc) throws KBApiException {
    super(cycFunc);
  }

  /**
   * This is not part of the KB API. For relevant API methods, see
   * {@link FunctionFactory} or the static {@link #get} and
   * {@link #findOrCreate} methods in this class.
   *
   * @param funcStr	the string representing a function in the KB
   *
   * @throws KBApiException	if the function represented by funcStr is not found
   * and could not be created
   */
  Function(String funcStr) throws KBApiException {
    super(funcStr);
  }

  /**
   * This is not part of the KB API. For relevant API methods, see
   * {@link FunctionFactory} or the static {@link #get} and
   * {@link #findOrCreate} methods in this class.
   *
   * @param funcStr	the string representing a function in the KB
   * @param lookup the enum to specify LookupType: FIND or FIND_OR_CREATE
   *
   * @throws KBObjectNotFoundException	if the function represented by funcStr is
   * not found and could not be created
   */
  Function(String funcStr, LookupType lookup) throws KBApiException {
    super(funcStr, lookup);
  }

  /**
   * This is not part of the KB API. For relevant API methods, see
   * {@link FunctionFactory} or the static {@link #get} and
   * {@link #findOrCreate} methods in this class.
   *
   * @param ctx the microtheory under which the search for the function is
   * performed.
   * @param str the string representation of the function
   * @param constrainingCol the returned Function will be an instance of
   * constrainingCol
   *
   * @throws KBApiException if the returned CycObject is not a function is not
   * found
   */
  Function(Context ctx, String str, KBCollection constrainingCol) throws KBApiException, UnknownHostException, IOException {
    super();
    CycList<CycObject> res = NLFormat.getInstance(CycAccess.getCurrent()).getConstrainedCyclForString(str, constrainingCol.getCore(), ctx.getCore());
    if (res == null) {
      throw new KBApiException("Function " + str + " not found in the KB");
    }

    if (res.size() < 1) {
      throw new KBApiException("Cyc representation of " + str + " not found");
    } else if (res.size() > 1) {
      throw new KBApiException("Cyc representation of " + str + " not unique");
    } else {
      this.setCore(res.first());
    }
  }

  /**
   * Get the
   * <code>Function</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that
   * name, or if it is not already an instance of #$Function-Denotational.
   *
   * @param nameOrId
   * @return
   * @throws KBTypeException
   * @throws KBApiException
   */
  public static Function get(String nameOrId) throws KBTypeException, KBApiException {
    return KBObjectFactory.get(nameOrId, Function.class);
  }

  /**
   * Get the
   * <code>Function</code> object that corresponds to
   * <code>object</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an instance of
   * <code>#$Function-Denotational</code>.
   *
   * @param object
   * @return
   * @throws KBTypeException
   * @throws KBApiException
   */
  public static Function get(CycObject object) throws KBTypeException, KBApiException {
    return KBObjectFactory.get(object, Function.class);
  }

  /**
   * Find or create a
   * <code>Function</code> object named
   * <code>nameOrId</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of
   * <code>#$Function-Denotational</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already a
   * <code>#$Function-Denotational</code>, it will be returned. If it is not
   * already a
   * <code>#$Function-Denotational</code>, but can be made into one by addition
   * of assertions to the KB, such assertions will be made, and the object will
   * be returned. If the object in the KB cannot be turned into a
   * <code>#$Function-Denotational</code> by adding assertions (i.e. some
   * existing assertion prevents it from being a
   * <code>#$Function-Denotational</code>), a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Function findOrCreate(String nameOrId) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, Function.class);
  }

  /**
   * Find or create a Function object from
   * <code>object</code>. If
   * <code>object</code> is already a
   * <code>#$Function-Denotational</code>, an appropriate
   * <code>Function</code> object will be returned. If
   * <code>object</code> is not already a
   * <code>#$Function-Denotational</code>, but can be made into one by addition
   * of assertions to the KB, such assertions will be made, and the relevant
   * object will be returned. If
   * <code>object</code> cannot be turned into a
   * <code>#$Function-Denotational</code> by adding assertions (i.e. some
   * existing assertion prevents it from being a
   * <code>#$Function-Denotational</code>, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param object
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Function findOrCreate(CycObject object) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(object, Function.class);
  }

  /**
   * Find or create a
   * <code>Function</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in the default context. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Function-Denotational</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId
   * @param constrainingCollection
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Function findOrCreate(String nameOrId, KBCollection constrainingCollection) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, Function.class);
  }

  /**
   * Find or create a
   * <code>Function</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in the default context. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Function-Denotational</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrIdKBAPI assertSentence

Since the comment already says it's a findOrCreate method, make it actually behave that way and not assert a sentence that's already there.
   * @param constrainingCollection a string representing the additional
   * constraining collection
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Function findOrCreate(String nameOrId, String constrainingCollection) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, Function.class);
  }

  /**
   * Find or create a
   * <code>Function</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Function-Denotational</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId
   * @param constrainingCollection the additional constraining collection
   * @param ctx the context in which the resulting object must be an instance of
   * constrainingCollection
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Function findOrCreate(String nameOrId, KBCollection constrainingCollection, Context ctx) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, ctx, Function.class);
  }

  /**
   * Find or create a
   * <code>Function</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Function-Denotational</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Function-Denotational</code> and a
   * <code>constrainingCollection</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId
   * @param constrainingCollection a string representing the additional
   * constraining collection
   * @param ctx the context in which the resulting object must be an instance of
   * constrainingCollection
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Function findOrCreate(String nameOrId, String constrainingCollection, String ctx) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, ctx, Function.class);
  }

  /**
   * Checks whether entity exists in KB and is an instance of
   * #$Function-Denotational. If false, {@link #getStatus(String)} may yield
   * more information. This method is equivalent to
   * <code>KBStatus.EXISTS_AS_TYPE.equals(getStatus(nameOrId))</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Function-Denotational
   */
  public static boolean existsAsType(String nameOrId) throws KBApiException {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of
   * #$Function-Denotational. If false, {@link #getStatus(CycObject)} may yield
   * more information. This method is equivalent to
   * <code>KBStatus.EXISTS_AS_TYPE.equals(getStatus(nameOrId))</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Function-Denotational
   * @throws KBApiException
   */
  public static boolean existsAsType(CycObject object) throws KBApiException {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns a KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$Function-Denotational</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   * @throws KBApiException if the status can not be determined.
   */
  public static KBStatus getStatus(String nameOrId) throws KBApiException {
    return KBObjectFactory.getStatus(nameOrId, Function.class);
  }

  /**
   * Returns a KBStatus enum which describes whether
   * <code>object</code> exists in the KB and is an instance of
   * <code>#$Function-Denotational</code>.
   *
   * @param object the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   * @throws KBApiException if the status can not be determined.
   */
  public static KBStatus getStatus(CycObject object) throws KBApiException {
    return KBObjectFactory.getStatus(object, Function.class);
  }

  /**
   * Create an object of type
   * <code>retType</code> with
   * <code>args</code> as the arguments to this
   * <code>Function</code>. If no corresponding term exists in the Cyc KB, one
   * will be created.
   * <p>
   * Note that it can take <b>significantly longer</b> to create a term using a
   * Function than it does to create a constant because the Cyc KB triggers
   * forward rules that will add facts about the functional term. Hence, the
   * time required to create a functional term, such as
   * <code>(#$FruitFn #$Apple)</code>, is longer than the time required to
   * create a non-functional term, such as
   * <code>#$Dog</code>.
   * <p>
   *
   * The
   * <code>retType</code> parameter determines what class the returned Object
   * will be. For example, if creating
   * <code>(#$FruitFn #$AppleTree)</code>, the retType should be
   * <code>KBCollection</code> or
   * <code>FirstOrderCollection</code>. If a return type is specified that is in
   * conflict with the
   * <code>#$resultIsa</code> for the underlying
   * <code>#$Function</code>, a KBApiException may be thrown.
   *
   * @param retType	the type of object generated by this function. Must be a
   * subclass of KBObject.
   * @param args	An array of arguments for the new functional term. Arguments
   * may include any subclass of KBObject and Java Language native objects.
   * <code>Date</code> is not supported in this version.
   *
   * @return	a new KBObject of type retType
   *
   * @throws KBApiException
   */
  public <O> O findOrCreateFunctionalTerm(Class<O> retType, Object... args) throws KBApiException {
    try {
      CycList natArgs = new CycList();
      natArgs.add(this.getCore());
//      final StringBuilder fortStringBuilder = new StringBuilder("(");
//      fortStringBuilder.append(this.stringApiValue());
      for (Object aArg : args) {
        if (aArg instanceof KBObject) {
          natArgs.add(((KBObject) aArg).getCore());
          log.log(Level.FINE, "Arg: {0}", aArg.toString());
        } else if (aArg instanceof String) {
          natArgs.add(aArg);
          log.log(Level.FINE, "Arg: {0}", aArg.toString());
        } else if (aArg instanceof Date) {
          DateConverter.getInstance();
          CycObject co = DateConverter.toCycDate((Date) aArg);
          natArgs.add(co);
        } else {
          natArgs.add(aArg);
        }
      }

//      LOG.fine("Fort String: " + fortString);
//      String cyclifiedStr = cyc.cyclifyString(fortString);
//      LOG.fine("Cyclified Fort String: " + cyclifiedStr);

      CycObject co = null;
      if (this.isInstanceOf(KBCollection.get("ReifiableFunction"), Constants.uvMt())) {
        co = new CycNart(natArgs);
        ((CycNart) co).ensureReified();
      } else {
        co = new CycNaut(natArgs);
      }

      O ret = null;
      if (Context.class.isAssignableFrom(retType)) {
        ret = retType.cast(Context.findOrCreate((CycObject) co));
      } else if (Predicate.class.isAssignableFrom(retType)) {
        ret = retType.cast(Predicate.findOrCreate((CycObject) co));
      } else if (Function.class.isAssignableFrom(retType)) {
        ret = retType.cast(Function.findOrCreate((CycObject) co));
      } // Have the check for KBIndividual after all its subclasses.
      // Context, Relation are subclasses of KBIndividual.
      else if (KBIndividual.class.isAssignableFrom(retType)) {
        ret = retType.cast(KBIndividual.findOrCreate((CycObject) co)); //@todo this should probably by "get", but that currently fails on NAUTs like ((USDollarFn 2012) 5)
      } // We currently don't have a direct relation between KBIndividual and
      // KBCollection, but to be consistent, KBCollection always comes after
      // KBIndividual, since (isa KBIndividual KBCollection) and (genls KBCollection
      // KBCollection) KBCollection is reflexive
      else if (KBCollection.class.isAssignableFrom(retType)) {
        ret = retType.cast(KBCollection.findOrCreate((CycObject) co));
      } else if (KBTerm.class.isAssignableFrom(retType)) {
        ret = retType.cast(KBTerm.get((CycObject) co));
      } else if (KBObject.class.isAssignableFrom(retType)) {
        ret = retType.cast(KBObject.get((CycObject) co));
      } else {
        throw new KBApiException("Casting of type " + retType + " not supported");
      }

      return ret;
    } catch (UnknownHostException ex) {
      throw new KBApiException(ex.getMessage(), ex);
    } catch (IOException ex) {
      throw new KBApiException(ex.getMessage(), ex);
    } catch (CycApiException ex) {
      throw new KBApiException(ex.getMessage(), ex);
    } catch (ParseException pe) {
      throw new KBApiException(pe.getMessage(), pe);
    }
  }

  /**
   * Returns the
   * <code>#$resultIsa</code>s of this
   * <code>Function</code> from the default context. Any functional term using
   * this
   * <code>Function</code> will be an instance of each of these Collections.
   * <p>
   *
   * @return	all <code>#$resultIsa</code> collections for *
   * this <code>Function</code>.
   *
   * @throws KBApiException
   */
  public Collection<KBCollection> getResultIsa() throws KBApiException {
    return getResultIsa("");
  }

  /**
   * Returns the
   * <code>#$resultIs</code>as of this
   * <code>Function</code> from the context. Any functional term using this
   * <code>Function</code> will be an instance of each of these Collections.
   * <p>
   *
   * @param	ctx the string representation of the context
   *
   * @return	the relevant <code>#$resultIsa</code> collections for *
   * this <code>Function</code>.
   *
   * @throws KBApiException
   */
  public Collection<KBCollection> getResultIsa(String ctx) throws KBApiException {
    return (this.<KBCollection>getValues("resultIsa", 1, 2, ctx));
  }

  /**
   * Returns the
   * <code>#$resultIsa</code>s of this
   * <code>Function</code> from the context. Any functional term using this
   * <code>Function</code> will be an instance of each of these Collections.
   * <p>
   *
   * @param	ctx the context
   *
   * @return	the relevant <code>#$resultIsa</code> collections for *
   * this <code>Function</code>.
   *
   * @throws KBApiException
   */
  public Collection<KBCollection> getResultIsa(Context ctx) throws KBApiException {
    return (this.<KBCollection>getValues(Predicate.get("resultIsa"), 1, 2, ctx));
  }

  /**
   * creates a new
   * <code>#$resultIsa</code> {@link Fact} in the supplied context.
   * <p>
   * Future versions of this API may assume that the context is always
   * <code>#$UniversalVocabularyMt</code>.
   *
   * @param ctx	the string representing the context where the fact is asserted
   * @param collection	the string representing the resultIsa collection
   *
   * @return	this
   *
   * @throws KBApiException if the new knowledge cannot be asserted
   */
  public Function addResultIsa(String collection, String ctx) throws KBApiException {

    return addResultIsa(KBCollection.get(collection), Context.get(ctx));
  }

  /**
   * creates a new
   * <code>#$resultIsa</code> {@link Fact} in the supplied context.
   * <p>
   * Future versions of this API may assume that the context is always
   * <code>UniversalVocabularyMt</code>.
   *
   * @param ctx	the context where the fact is asserted
   * @param collection	the KBCollection the generated object is a type of
   *
   * @return	this
   *
   * @throws KBApiException if the new knowledge cannot be asserted
   */
  public Function addResultIsa(KBCollection collection, Context ctx) throws KBApiException {
    Predicate p = Predicate.get("resultIsa");
    addFact(ctx, p, 1, (Object) collection);

    return this;
  }

  /**
   * Returns the
   * <code>#$resultGenl</code>s of this
   * <code>Function</code> from the default context. Any functional term using
   * this
   * <code>Function</code> will be a specialization of each of these
   * Collections.
   * <p>
   *
   * @return	all <code>#$resultGenl</code> collections for this function
   *
   * @throws KBApiException
   */
  public Collection<KBCollection> getResultGenl()
          throws KBApiException {
    return getResultGenl("");
  }

  /**
   * Returns the
   * <code>#$resultGenl</code>s of this
   * <code>Function</code> from the context. Any functional term using this
   * <code>Function</code> will be a specialization of each of these
   * <code>KBCollection</code>s.
   * <p>
   *
   * @param	ctx the string representation of the context
   *
   * @return	all <code>#$resultGenl</code> collections for this function that
   * are visible from the context
   *
   * @throws KBApiException
   */
  public Collection<KBCollection> getResultGenl(String ctx)
          throws KBApiException {
    return (this.<KBCollection>getValues("resultGenl", 1, 2, ctx));
  }

  /**
   * Returns the
   * <code>#$resultGenl</code>s of this
   * <code>Function</code> from the context. Any functional term using this
   * <code>Function</code> will be a specialization of each of these
   * <code>KBCollection</code>s.
   * <p>
   *
   * @param	ctx the context
   *
   * @return	all <code>#$resultGenl</code> collections for this function that
   * are visible from the context
   *
   * @throws KBApiException
   */
  public java.util.Collection<KBCollection> getResultGenl(Context ctx)
          throws KBApiException {
    return (this.<KBCollection>getValues(Predicate.get("resultGenl"), 1, 2, ctx));
  }

  /**
   * creates a new
   * <code>#$resultGenl</code> {@link Fact} in the specified context.
   *
   * <p>
   * Future versions of this API may assume that the context is always
   * <code>#$UniversalVocabularyMt</code>
   *
   * @param ctx	the string representing the context where the fact is asserted
   * @param collectionStr	the string representing the <code>#$resultGenl</code>
   * collection.
   *
   * @return this
   *
   * @throws KBApiException if the new knowledge cannot be asserted
   */
  public Function addResultGenl(String collectionStr, String ctx) throws KBApiException {
    KBCollection c = KBCollection.get(collectionStr);
    return addResultGenl(c, Context.get(ctx));
  }

  /**
   * creates a new
   * <code>#$resultGenl</code> {@link Fact} in the specified context.
   *
   * <p>
   * Future versions of this API may assume that the context is always
   * <code>#$UniversalVocabularyMt</code>
   *
   * @param ctx	the context where the fact is asserted
   * @param collection	the <code>#$resultGenl</code> collection.
   *
   * @return this
   *
   * @throws KBApiException if the new knowledge cannot be asserted
   */
  public Function addResultGenl(KBCollection c, Context ctx) throws KBApiException {
    Predicate p = Predicate.get("resultGenl");
    addFact(ctx, p, 1, (Object) c);

    return this;
  }

  @Override
  String getTypeString() {
    return getClassTypeString();
  }

  /**
   * Get the string representation of the KB type that this class corresponds
   * to.
   *
   * @return
   */
  public static String getClassTypeString() {
    return "#$Function-Denotational";
  }
}

package com.cyc.kb;

import com.cyc.kb.exception.InvalidNameException;
import com.cyc.kb.exception.KBObjectNotFoundException;
import com.cyc.kb.exception.KBTypeConflictException;
import com.cyc.kb.exception.KBTypeException;
import com.cyc.kb.exception.KBApiException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.logging.Logger;
import org.opencyc.api.CycAccess;
import org.opencyc.cycobject.CycConstant;
import org.opencyc.cycobject.CycDenotationalTerm;
import org.opencyc.cycobject.CycFort;
import org.opencyc.cycobject.CycList;

import org.opencyc.cycobject.CycObject;
import org.opencyc.cycobject.Guid;
import org.opencyc.nl.NLFormat;

/**
 * Each
 * <code>Predicate</code> object is essentially a facade for a
 * <code>#$Predicate</code> in a Cyc KB. This class provides convenient access
 * to many of the most important and frequently used types of assertions that
 * are relevant to CycL predicates.
 * <p>
 * The constructors in this class should not be used for accessing
 * <code>Predicate</code> objects. The
 * <code>Predicate</code> class contains static factory methods for the most
 * commonly used ways of accessing
 * <code>Predicate</code> objects, and additional API methods for
 * find/retrieving/accessing
 * <code>Predicate</code> objects can be found in the {@link PredicateFactory}.
 * <p>
 *
 * @author Vijay Raj
 * @since 0.90
 */
// * @version "%I%, %G%"
public class Predicate extends Relation {

  static final Logger log = Logger.getLogger(Predicate.class.getName());
  private static final CycDenotationalTerm TYPE_CORE =
          new CycConstant("Predicate", new Guid("bd5880d6-9c29-11b1-9dad-c379636f7270"));

  static CycDenotationalTerm getClassTypeCore() {
    return TYPE_CORE;
  }

  /**
   * Not part of the KB API.
   *
   * @throws KBApiException
   */
  Predicate() throws KBApiException {
    super();
  }

  /**
   * Not part of the KB API.
   * <p>
   * Creates a new
   * <code>Predicate</code> from a CycObject
   *
   * @param cycPred	the CycObject wrapped by Predicate. The constructor verifies
   * that the CycObject is a #$Predicate
   *
   * @throws KBApiException if cycPred is not an #$Predicate
   */
  Predicate(CycObject cycPred) throws KBApiException {
    super(cycPred);
  }

  /**
   * Not part of the KB API.
   * <p>
   * Creates a new
   * <code>Predicate</code> from a String representation (either the name or the
   * HL ID) of a CycL
   * <code>#$Predicate</code>.
   * <p>
   *
   * @param predStr	the string representing a predicate in the KB
   *
   * @throws KBApiException if the predicate represented by predStr is not found
   * and could not be created
   */
  Predicate(String predStr) throws KBApiException {
    super(predStr);
  }

  /**
   * Not part of the KB API. finds or creates; or finds a predicate represented
   * by predStr in the underlying KB based on input ENUM
   * <p>
   *
   * @param predStr	the string representing a predicate in the KB
   * @param lookup the enum to specify LookupType: FIND or FIND_OR_CREATE
   *
   * @throws KBObjectNotFoundException	if the predicate represented by predStr
   * is not found and could not be created
   */
  Predicate(String predStr, LookupType lookup) throws KBApiException {
    super(predStr, lookup);
  }

//@todo make sure we use consistent names everywhere for cycObj and for nameOrId, or whatever we want to call that variable.
  /**
   * Not part of the KB API. finds a Predicate represented by str in the
   * underlying KB within the constrainingCol searched under the ctx (Mt) <p>
   *
   * @param ctx the microtheory under which the search for the predicate is
   * performed.
   * @param nameOrId the string representation of the predicate
   * @param constrainingCol the constraining collection of which the predicate
   * represented by str is an instance
   * @throws KBApiException if the returned CycObject is not a predicate is not
   * found
   */
  Predicate(Context ctx, String nameOrId, KBCollection constrainingCol) throws KBApiException, UnknownHostException, IOException {
    super();
    //@todo fix this--this is not how you look up a predicate...
    CycList<CycObject> res = NLFormat.getInstance(CycAccess.getCurrent()).getConstrainedCyclForString(nameOrId, constrainingCol.getCore(), ctx.getCore());
    if (res == null) {
      throw new KBApiException("Predicate " + nameOrId + " not found in the KB");
    }

    if (res.size() < 1) {
      throw new KBApiException("Cyc representation of " + nameOrId + " not found");
    } else if (res.size() > 1) {
      throw new KBApiException("Cyc representation of " + nameOrId + " not unique");
    } else {
      this.setCore(res.first());
    }
  }

  /**
   * Get the
   * <code>Predicate</code> with the name
   * <code>nameOrId</code>. Throws exceptions if there is no KB term by that
   * name, or if it is not already an instance of #$Predicate.
   *
   * @param nameOrId
   * @return
   * @throws KBTypeException
   * @throws KBApiException
   */
  public static Predicate get(String nameOrId) throws KBTypeException, KBApiException {
    return KBObjectFactory.get(nameOrId, Predicate.class);
  }

  /**
   * Get the
   * <code>Predicate</code> object that corresponds to
   * <code>object</code>. Throws exceptions if the object isn't in the KB, or if
   * it's not already an instance of
   * <code>#$Predicate</code>.
   *
   * @param object
   * @return
   * @throws KBTypeException
   * @throws KBApiException
   */
  public static Predicate get(CycObject object) throws KBTypeException, KBApiException {
    return KBObjectFactory.get(object, Predicate.class);
  }

  /**
   * Find or create a
   * <code>Predicate</code> object named
   * <code>nameOrId</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of
   * <code>#$Predicate</code>. If there is already an object in the KB called
   * <code>nameOrId</code>, and it is already a
   * <code>#$Predicate</code>, it will be returned. If it is not already a
   * <code>#$Predicate</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into a
   * <code>#$Predicate</code> by adding assertions (i.e. some existing assertion
   * prevents it from being a
   * <code>#$Predicate</code>), a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Predicate findOrCreate(String nameOrId) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, Predicate.class);
  }

  /**
   * Find or create a Predicate object from
   * <code>object</code>. If
   * <code>object</code> is already a
   * <code>#$Predicate</code>, an appropriate
   * <code>Predicate</code> object will be returned. If
   * <code>object</code> is not already a
   * <code>#$Predicate</code>, but can be made into one by addition of
   * assertions to the KB, such assertions will be made, and the relevant object
   * will be returned. If
   * <code>object</code> cannot be turned into a
   * <code>#$Predicate</code> by adding assertions (i.e. some existing assertion
   * prevents it from being a
   * <code>#$Predicate</code>, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param object
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Predicate findOrCreate(CycObject object) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(object, Predicate.class);
  }

  /**
   * Find or create a
   * <code>Predicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in the default context. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
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
  public static Predicate findOrCreate(String nameOrId, KBCollection constrainingCollection) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, Predicate.class);
  }

  /**
   * Find or create a
   * <code>Predicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in the default context. If no object
   * exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code> by adding assertions, a
   * <code>KBTypeConflictException</code>will be thrown.
   *
   * @param nameOrId
   * @param constrainingCollection a string representing the additional
   * constraining collection
   * @return
   * @throws KBTypeConflictException
   * @throws InvalidNameException
   * @throws KBApiException
   */
  public static Predicate findOrCreate(String nameOrId, String constrainingCollection) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, Predicate.class);
  }

  /**
   * Find or create a
   * <code>Predicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
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
  public static Predicate findOrCreate(String nameOrId, KBCollection constrainingCollection, Context ctx) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, ctx, Predicate.class);
  }

  /**
   * Find or create a
   * <code>Predicate</code> object named
   * <code>nameOrId</code>, and also make it an instance of
   * <code>constrainingCollection</code> in
   * <code>ctx</code>. If no object exists in the KB with the name
   * <code>nameOrId</code>, one will be created, and it will be asserted to be
   * an instance of both
   * <code>#$Predicate</code> and
   * <code>constrainingCollection</code>. If there is already an object in the
   * KB called
   * <code>nameOrId</code>, and it is already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, it will be returned. If it is not
   * already both a
   * <code>#$Predicate</code> and a
   * <code>constrainingCollection</code>, but can be made so by addition of
   * assertions to the KB, such assertions will be made, and the object will be
   * returned. If the object in the KB cannot be turned into both a
   * <code>#$Predicate</code> and a
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
  public static Predicate findOrCreate(String nameOrId, String constrainingCollection, String ctx) throws KBTypeConflictException, InvalidNameException, KBApiException {
    return KBObjectFactory.findOrCreate(nameOrId, constrainingCollection, ctx, Predicate.class);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Predicate. If
   * false, {@link #getStatus(String)} may yield more information. This method
   * is equivalent to
   * <code>KBStatus.EXISTS_AS_TYPE.equals(getStatus(nameOrId))</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Predicate
   * @throws KBApiException
   */
  public static boolean existsAsType(String nameOrId) throws KBApiException {
    return getStatus(nameOrId).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Checks whether entity exists in KB and is an instance of #$Predicate. If
   * false, {@link #getStatus(CycObject)} may yield more information. This
   * method is equivalent to
   * <code>KBStatus.EXISTS_AS_TYPE.equals(getStatus(nameOrId))</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return <code>true</code> if entity exists in KB and is an instance of
   * #$Predicate
   * @throws KBApiException
   */
  public static boolean existsAsType(CycObject object) throws KBApiException {
    return getStatus(object).equals(KBStatus.EXISTS_AS_TYPE);
  }

  /**
   * Returns a KBStatus enum which describes whether
   * <code>nameOrId</code> exists in the KB and is an instance of
   * <code>#$Predicate</code>.
   *
   * @param nameOrId either the name or HL ID of an entity in the KB
   * @return an enum describing the existential status of the entity in the KB
   * @throws KBApiException if the status can not be determined.
   */
  public static KBStatus getStatus(String nameOrId) throws KBApiException {
    return KBObjectFactory.getStatus(nameOrId, Predicate.class);

  }

  /**
   * Returns a KBStatus enum which describes whether
   * <code>object</code> exists in the KB and is an instance of
   * <code>#$Predicate</code>.
   *
   * @param object the CycObject representation of a KB entity
   * @return an enum describing the existential status of the entity in the KB
   * @throws KBApiException if the status can not be determined.
   */
  public static KBStatus getStatus(CycObject object) throws KBApiException {
    return KBObjectFactory.getStatus(object, Predicate.class);
  }

  /**
   * finds the specializations of
   * <code>this</code>, from the default context
   *
   * @return the <code>Predicate</code>s that are specialization of    * this <code>Predicate</code>
   *
   * @throws KBApiException
   */
  public java.util.Collection<Predicate> getSpecializations() throws KBApiException {
    return getSpecializations("");
  }

  /**
   * finds the specializations of
   * <code>this</code>, from a context
   *
   * @param ctx the string representing the context
   *
   * @return the <code>Predicate</code>s that are specializations of    * this <code>Predicate</code>
   *
   * @throws KBApiException
   */
  public java.util.Collection<Predicate> getSpecializations(String ctx) throws KBApiException {
    return (this.<Predicate>getValues("genlPreds", 2, 1, ctx));
  }

  /**
   * finds the specializations of this Predicate, from a context
   *
   * @param ctx the context
   *
   * @return the <code>Predicate</code>s that are getSpecializations of    * this <code>Predicate</code>
   *
   * @throws KBApiException
   */
  public java.util.Collection<Predicate> getSpecializations(Context ctx) throws KBApiException {
    return (this.<Predicate>getValues(Predicate.get("genlPreds"), 2, 1, ctx));
  }

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>this</code> is a more specific predicate than
   * <code>moreSpecific</code> in the specified context. Essentially, it asserts
   * <code>(#$genlPreds moreSpecific this)</code>
   * <p>
   *
   * @param ctx	the string representing the context where the fact is asserted
   * @param moreSpecific	the string representing the specialization (predicate)
   * of this Predicate
   *
   * @return this
   *
   * @throws KBApiException if the new knowledge cannot be asserted
   */
  public Predicate addSpecialization(String moreSpecific, String ctx)
          throws KBApiException {
    Predicate p = Predicate.get(moreSpecific);
    return addSpecialization(p, Context.get(ctx));
  }

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>moreSpecific</code> is a more specific predicate than
   * <code>this</code> in the specified context. Essentially, it asserts
   * <code>(#$genlPreds moreSpecific this)</code>
   * <p>
   *
   * @param ctx the context where the fact is asserted
   * @param moreSpecific	the specialization (predicate) of this Predicate
   *
   * @return this
   *
   * @throws KBApiException	if the new knowledge cannot be asserted
   */
  public Predicate addSpecialization(Predicate moreSpecific, Context ctx) throws KBApiException {
    Predicate gp = Predicate.get("genlPreds");
    addFact(ctx, gp, 2, (Object) moreSpecific);

    return this;
  }

  /**
   * finds the asserted generalizations of
   * <code>this</code>, from the default context
   *
   * @return the <code>Predicate</code>s that are getGeneralizations of    * this <code>Predicate</code>
   *
   * @throws KBApiException
   */
  public Collection<Predicate> getGeneralizations() throws KBApiException {
    return getGeneralizations("");
  }

  /**
   * finds the asserted generalizations of
   * <code>this</code>, from a context
   *
   * @param ctxStr the string representing the context
   *
   * @return the <code>Predicate</code>s that are getGeneralizations of    * this <code>Predicate</code>
   *
   * @throws KBApiException
   */
  public Collection<Predicate> getGeneralizations(String ctx) throws KBApiException {
    return (this.<Predicate>getValues("genlPreds", 1, 2, ctx));
  }

  /**
   * finds the asserted generalizations of
   * <code>this</code>, from a context
   *
   * @param ctxStr the string representing the context
   *
   * @return the <code>Predicate</code>s that are getGeneralizations of    * this <code>Predicate</code>
   *
   * @throws KBApiException
   */
  public Collection<Predicate> getGeneralizations(Context ctx) throws KBApiException {
    return (this.<Predicate>getValues(Predicate.get("genlPreds"), 1, 2, ctx));
  }

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>moreGeneral</code> is a more general predicate than
   * <code>this</code> in the context. Essentially, this asserts
   * <code>(genlPreds this moreGeneral)</code>
   * <p>
   *
   * @param ctx	the string representing the context where the fact is asserted
   * @param moreGeneral	the string representing the <code>Predicate</code> that
   * is to become more general than this <code>Predicate</code>
   *
   * @return this
   *
   * @throws KBApiException if the new knowledge cannot be asserted
   */
  public Predicate addGeneralization(String moreGeneral, String ctx)
          throws KBApiException {
    Predicate p = Predicate.get(moreGeneral);
    return addGeneralization(p, Context.get(ctx));
  }

  /**
   * creates a new
   * <code>Fact</code> stating that
   * <code>moreGeneral</code> is a more general predicate than
   * <code>this</code> in the context. Essentially, this asserts
   * <code>(genlPreds this moreGeneral)</code>
   * <p>
   *
   * @param ctx	the context where the fact is asserted
   * @param moreGeneral	the <code>Predicate</code> that is to become more
   * general than this
   *
   * @return this
   *
   * @throws KBApiException	if the new knowledge cannot be asserted
   */
  public Predicate addGeneralization(Predicate moreGeneral, Context ctx) throws KBApiException {
    Predicate gp = Predicate.get("genlPreds");
    addFact(ctx, gp, 1, (Object) moreGeneral);

    return this;
  }

  public boolean isGeneralizationOf(Predicate moreSpecific, Context ctx) throws KBApiException {
    try {
      return CycAccess.getCurrent().isGenlPredOf((CycFort)core, (CycFort)moreSpecific.getCore(), ctx.getCore());
    } catch (Exception e) {
      throw new KBApiException(e);
    }
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
    return "#$Predicate";
  }
}

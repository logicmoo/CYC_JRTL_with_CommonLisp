package com.cyc.baseclient;

import com.cyc.base.cycobject.ELMt;
import com.cyc.baseclient.cycobject.CycConstant;
import com.cyc.baseclient.cycobject.ELMtConstant;
import com.cyc.baseclient.cycobject.CycGuid;

/**
 *
 * @author nwinant
 */
public class CommonConstants {
    public static final ELMt baseKB = ELMtConstant.makeELMtConstant(
          new CycConstant("BaseKB", new CycGuid(
          "bd588111-9c29-11b1-9dad-c379636f7270")));
  /** Convenient reference to #$isa. */
  public static final CycConstant isa = new CycConstant("isa", new CycGuid(
          "bd588104-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$genls. */
  public static final CycConstant genls = new CycConstant("genls", new CycGuid(
          "bd58810e-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$genlMt. */
  public static final CycConstant genlMt = new CycConstant("genlMt", new CycGuid(
          "bd5880e5-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$comment. */
  public static final CycConstant comment = new CycConstant("comment", new CycGuid(
          "bd588109-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$Collection. */
  public static final CycConstant collection = new CycConstant("Collection",
          new CycGuid("bd5880cc-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$BinaryPredicate. */
  public static final CycConstant binaryPredicate = new CycConstant(
          "BinaryPredicate", new CycGuid("bd588102-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$elementOf. */
  public static final CycConstant elementOf = new CycConstant("elementOf",
          new CycGuid("c0659a2b-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$numericallyEquals. */
  public static final CycConstant numericallyEqual = new CycConstant(
          "numericallyEquals", new CycGuid("bd589d90-9c29-11b1-9dad-c379636f7270"));
  /** *********************** constants needed by CycL parser ******** */
  /** Convenient reference to #$True. */
  public static final CycConstant trueConst = new CycConstant("True", new CycGuid(
          "bd5880d9-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$False. */
  public static final CycConstant falseConst = new CycConstant("False",
          new CycGuid("bd5880d8-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$not. */
  public static final CycConstant not = new CycConstant("not", new CycGuid(
          "bd5880fb-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$and. */
  public static final CycConstant and = new CycConstant("and", new CycGuid(
          "bd5880f9-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$or. */
  public static final CycConstant or = new CycConstant("or", new CycGuid(
          "bd5880fa-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$xor. */
  public static final CycConstant xorConst = new CycConstant("xor", new CycGuid(
          "bde7f9f2-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$equiv. */
  public static final CycConstant equivConst = new CycConstant("equiv",
          new CycGuid("bda887b6-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$implies. */
  public static final CycConstant impliesConst = new CycConstant("implies",
          new CycGuid("bd5880f8-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$forAll. */
  public static final CycConstant forAllConst = new CycConstant("forAll",
          new CycGuid("bd5880f7-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$thereExists. */
  public static final CycConstant thereExistsConst = new CycConstant(
          "thereExists", new CycGuid("bd5880f6-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$thereExistExactly. */
  public static final CycConstant thereExistExactlyConst = new CycConstant(
          "thereExistExactly", new CycGuid("c10ae7b8-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$thereExistAtMost. */
  public static final CycConstant thereExistAtMostConst = new CycConstant(
          "thereExistAtMost", new CycGuid("c10af932-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$thereExistAtLeast. */
  public static final CycConstant thereExistAtLeastConst = new CycConstant(
          "thereExistAtLeast", new CycGuid("c10af5e7-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$ExapndSubLFn. */
  public static final CycConstant expandSubLFnConst = new CycConstant(
          "ExpandSubLFn", new CycGuid("c0b2bc13-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$SubLQuoteFn. */
  public static final CycConstant sublQuoteFnConst = new CycConstant(
          "SubLQuoteFn", new CycGuid("94f07021-8b0d-11d7-8701-0002b3a8515d"));
  /** Convenient reference to #$PlusFn. */
  public static final CycConstant plusFn = new CycConstant("PlusFn", new CycGuid(
          "bd5880ae-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$different. */
  public static final CycConstant different = new CycConstant("different",
          new CycGuid("bd63f343-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$Thing. */
  public static final CycConstant thing = new CycConstant("Thing", new CycGuid(
          "bd5880f4-9c29-11b1-9dad-c379636f7270"));
  /** Convenient reference to #$MtSpace. */
  public static final CycConstant mtSpace = new CycConstant("MtSpace", new CycGuid(
          "abb96eb5-e798-11d6-8ac9-0002b3a333c3"));
  /** Convenient reference to #$CurrentWorldDataCollectorMt-NonHomocentric. */
  public static final ELMt currentWorldDataMt = ELMtConstant.makeELMtConstant(
          new CycConstant("CurrentWorldDataCollectorMt-NonHomocentric",
          new CycGuid("bf192b1e-9c29-11b1-9dad-c379636f7270")));
  /** Convenient reference to #$InferencePSC. */
  public static final ELMt inferencePSC = ELMtConstant.makeELMtConstant(
          new CycConstant("InferencePSC", new CycGuid(
          "bd58915a-9c29-11b1-9dad-c379636f7270")));
  /** Convenient reference to #$AnytimePSC. */
  public static final ELMt anytimePSC = ELMtConstant.makeELMtConstant(
          new CycConstant("AnytimePSC", new CycGuid(
          "28392742-b00f-41d8-98de-8399027785de")));
  /** Convenient reference to #$EverythingPSC. */
  public static final ELMt everythingPSC = ELMtConstant.makeELMtConstant(
          new CycConstant("EverythingPSC", new CycGuid(
          "be7f041b-9c29-11b1-9dad-c379636f7270")));
  /** Convenient reference to #$UniversalVocabularyMt. */
  public static final ELMt universalVocabularyMt = ELMtConstant.makeELMtConstant(
          new CycConstant("UniversalVocabularyMt", new CycGuid(
          "dff4a041-4da2-11d6-82c0-0002b34c7c9f")));
  /** Convenient reference to #$bookkeepingMt. */
  public static final ELMt bookkeepingMt = ELMtConstant.makeELMtConstant(
          new CycConstant("BookkeepingMt", new CycGuid(
          "beaed5bd-9c29-11b1-9dad-c379636f7270")));
}

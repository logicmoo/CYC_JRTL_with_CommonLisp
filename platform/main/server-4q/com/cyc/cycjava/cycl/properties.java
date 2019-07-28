package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.properties;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.properties.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class properties extends SubLTranslatedFile {
    public static final SubLFile me = new properties();

    public static final String myName = "com.cyc.cycjava.cycl.properties";

    public static final String myFingerPrint = "2f3e74ce010cddec1c42a7e43c611715b609546b428ee69c3b57b130903b1bd5";





    // deflexical
    public static final SubLSymbol $property_types$ = makeSymbol("*PROPERTY-TYPES*");

    // deflexical
    private static final SubLSymbol $existential_rmps$ = makeSymbol("*EXISTENTIAL-RMPS*");

    // deflexical
    // ((:genl-pred <PRED>) :term :anything) -> <TYPE>
    private static final SubLSymbol $simple_binary_property_type_preds$ = makeSymbol("*SIMPLE-BINARY-PROPERTY-TYPE-PREDS*");

    // deflexical
    private static final SubLSymbol $other_simple_binary_property_patterns$ = makeSymbol("*OTHER-SIMPLE-BINARY-PROPERTY-PATTERNS*");



    // deflexical
    private static final SubLSymbol $ternary_property_patterns$ = makeSymbol("*TERNARY-PROPERTY-PATTERNS*");

    private static final SubLSymbol $kw0$CONDITIONAL_SENTENCE_ = makeKeyword("CONDITIONAL-SENTENCE?");

    public static final SubLSymbol $sym1$_TERM = makeSymbol("?TERM");

    public static final SubLList $list2 = list(reader_make_constant_shell(makeString("injuryCount")), reader_make_constant_shell(makeString("deathToll")), reader_make_constant_shell(makeString("casualtyCount")), reader_make_constant_shell(makeString("numberOfHostagesTaken")), reader_make_constant_shell(makeString("relationInstanceExistsCount")));

    private static final SubLObject $$relationInstanceExistsCount = reader_make_constant_shell(makeString("relationInstanceExistsCount"));

    private static final SubLObject $$relationInstanceExists = reader_make_constant_shell(makeString("relationInstanceExists"));

    private static final SubLObject $$dateOfEvent = reader_make_constant_shell(makeString("dateOfEvent"));

    public static final SubLSymbol $sym6$_VALUE = makeSymbol("?VALUE");

    private static final SubLObject $$temporallySubsumes = reader_make_constant_shell(makeString("temporallySubsumes"));

    private static final SubLObject $$situationLocation = reader_make_constant_shell(makeString("situationLocation"));

    private static final SubLObject $$geographicalSubRegions = reader_make_constant_shell(makeString("geographicalSubRegions"));

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLList $list11 = list(list(makeKeyword("BIND"), makeSymbol("PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("VALUE")));







    public static final SubLList $list15 = list(list(makeKeyword("BIND"), makeSymbol("PRED")), list(makeKeyword("BIND"), makeSymbol("VALUE")), makeKeyword("TERM"));

    public static final SubLList $list16 = list(makeKeyword("TERM"));

    public static final SubLSymbol INSTANCE_NAMED_FN_NAT_P = makeSymbol("INSTANCE-NAMED-FN-NAT-P");

    private static final SubLInteger $int$150000 = makeInteger(150000);













    public static final SubLString $str25$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str30$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str32$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str33$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str34$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLList $list35 = list(makeKeyword("FORT"), makeKeyword("TERM"), makeKeyword("FORT"));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLSymbol EL_EXISTENTIAL_P = makeSymbol("EL-EXISTENTIAL-P");

    private static final SubLList $list38 = list(makeSymbol("VAR"), makeSymbol("BODY"));



    private static final SubLObject $$InstanceNamedFn = reader_make_constant_shell(makeString("InstanceNamedFn"));



    private static final SubLObject $$greaterThanOrEqualTo = reader_make_constant_shell(makeString("greaterThanOrEqualTo"));



    private static final SubLObject $$CityNamedFn = reader_make_constant_shell(makeString("CityNamedFn"));

    private static final SubLObject $$TerritoryFn = reader_make_constant_shell(makeString("TerritoryFn"));

    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLSymbol $sym47$_COUNTRY = makeSymbol("?COUNTRY");

    private static final SubLObject $$countryOfCity = reader_make_constant_shell(makeString("countryOfCity"));

    private static final SubLObject $$GeographicalAgent = reader_make_constant_shell(makeString("GeographicalAgent"));

    private static final SubLObject $$GeographicalRegion = reader_make_constant_shell(makeString("GeographicalRegion"));

    private static final SubLSymbol $sym51$_TERRITORY = makeSymbol("?TERRITORY");

    private static final SubLObject $$territoryOf = reader_make_constant_shell(makeString("territoryOf"));

    private static final SubLList $list53 = list(makeSymbol("?TERRITORY"));

    private static final SubLSymbol $sym54$_BIG = makeSymbol("?BIG");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym57$PLACE_TOO_BIG_ = makeSymbol("PLACE-TOO-BIG?");

    private static final SubLString $str58$Couldn_t_find_bigger_places_for__ = makeString("Couldn't find bigger places for ~S");

    private static final SubLSymbol TOO_BIG_PLACES = makeSymbol("TOO-BIG-PLACES");

    private static final SubLList $list60 = list(reader_make_constant_shell(makeString("Planet")), reader_make_constant_shell(makeString("GeographicalHemisphere")), reader_make_constant_shell(makeString("Continent")));

    private static final SubLSymbol $too_big_places_caching_state$ = makeSymbol("*TOO-BIG-PLACES-CACHING-STATE*");

    public static final SubLList $list62 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), makeKeyword("TERM"), list(makeKeyword("TEST"), makeSymbol("EL-VAR?"))), list(list(makeKeyword("BIND"), makeSymbol("TRANS-PRED")), list(makeKeyword("BIND"), makeSymbol("VALUE")), makeKeyword("ANYTHING"))));





    public static final SubLList $list65 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(list(makeKeyword("BIND"), makeSymbol("TRANS-PRED")), list(makeKeyword("BIND"), makeSymbol("VALUE")), makeKeyword("ANYTHING")), list(list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), makeKeyword("TERM"), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")))));

    public static final SubLList $list66 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("BIND"), makeSymbol("VALUE"))), list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));



    private static final SubLObject $$IntervalMinFn = reader_make_constant_shell(makeString("IntervalMinFn"));

    public static final SubLList $list69 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("BIND"), makeSymbol("VALUE")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?"))), list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));

    private static final SubLObject $$IntervalMaxFn = reader_make_constant_shell(makeString("IntervalMaxFn"));

    public static final SubLList $list71 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("BIND"), makeSymbol("VALUE")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?"))), list(list(makeKeyword("BIND"), makeSymbol("TERN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));



    public static final SubLList $list73 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(list(makeKeyword("BIND"), makeSymbol("TERN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("BIND"), makeSymbol("VALUE")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")))));

    public static final SubLList $list74 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("BIND"), makeSymbol("VALUE"))), list(list(makeKeyword("BIND"), makeSymbol("TERN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING"))));

    public static final SubLList $list75 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(list(makeKeyword("BIND"), makeSymbol("TERN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")), list(makeKeyword("BIND"), makeSymbol("VALUE")))));

    public static final SubLList $list76 = list(reader_make_constant_shell(makeString("thereExists")), makeKeyword("ANYTHING"), list(reader_make_constant_shell(makeString("and")), list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), list(makeKeyword("BIND"), makeSymbol("BIN-PRED")), makeKeyword("TERM"), list(makeKeyword("BIND"), makeSymbol("COLLECTION")), makeKeyword("ANYTHING")), list(reader_make_constant_shell(makeString("greaterThanOrEqualTo")), list(makeKeyword("BIND"), makeSymbol("VALUE")), list(makeKeyword("TEST"), makeSymbol("EL-VAR?")))));

    public static final SubLSymbol $sym77$_VAR = makeSymbol("?VAR");

    public static final SubLList $list78 = list(makeKeyword("ANYTHING"));

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    public static final SubLSymbol $sym80$_CARDINALITY = makeSymbol("?CARDINALITY");

    private static final SubLObject $$extentCardinality = reader_make_constant_shell(makeString("extentCardinality"));









    private static final SubLInteger $int$100000 = makeInteger(100000);

    public static final SubLSymbol $sym87$REUSED_ = makeUninternedSymbol("REUSED?");



    public static final SubLSymbol $property_types_problem_store$ = makeSymbol("*PROPERTY-TYPES-PROBLEM-STORE*");

    public static final SubLList $list90 = list(makeSymbol("FIND-OR-CREATE-PROPERTY-TYPES-PROBLEM-STORE"));







    public static final SubLList $list94 = list(list(makeSymbol("DESTROY-PROBLEM-STORE"), makeSymbol("*PROPERTY-TYPES-PROBLEM-STORE*")));

    private static final SubLObject $const95$TypicalityReferenceSetPropertyTyp = reader_make_constant_shell(makeString("TypicalityReferenceSetPropertyType"));

    public static final SubLSymbol $sym96$_PROPERTY_TYPE = makeSymbol("?PROPERTY-TYPE");

    private static final SubLSymbol $MAX_TRANSFORMATION_DEPTH = makeKeyword("MAX-TRANSFORMATION-DEPTH");





    private static final SubLInteger $int$60 = makeInteger(60);



    public static final SubLSymbol $sym102$_STRING = makeSymbol("?STRING");

    private static final SubLObject $$termStrings = reader_make_constant_shell(makeString("termStrings"));

    public static final SubLList $list104 = list(makeSymbol("?STRING"));

    private static final SubLObject $$EnglishMt = reader_make_constant_shell(makeString("EnglishMt"));

    private static final SubLObject $const106$typicalityReferenceSetPropertyTyp = reader_make_constant_shell(makeString("typicalityReferenceSetPropertyTypes"));

    public static final SubLList $list107 = list(new SubLObject[]{ makeKeyword("DATE"), makeKeyword("LOCATION"), makeKeyword("PERPETRATOR"), makeKeyword("ATTACK-TYPE"), makeKeyword("TARGET"), makeKeyword("INHABITANTS"), makeKeyword("ECONOMY"), makeKeyword("RELIGION"), makeKeyword("CONTROL"), makeKeyword("CAPABILITIES"), makeKeyword("PERSONAL"), makeKeyword("CONTACT"), makeKeyword("LANGUAGE"), makeKeyword("SUB-EVENT"), makeKeyword("SUPER-EVENT"), makeKeyword("MOTIVATION") });

    public static final SubLList $list108 = list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("subEvents"))), makeKeyword("ANYTHING"), makeKeyword("TERM"));



    public static final SubLList $list110 = listS(reader_make_constant_shell(makeString("pointOfContactInfo")), makeKeyword("TERM"), makeKeyword("ANYTHING"));





    public static final SubLSymbol PROPERTY_TYPE_P_OLD = makeSymbol("PROPERTY-TYPE-P-OLD");

    public static final SubLString $str114$_S_is_not_a_list_of_property_type = makeString("~S is not a list of property types.");

    public static final SubLList $list115 = list(reader_make_constant_shell(makeString("relationInstanceExistsCount")), reader_make_constant_shell(makeString("relationInstanceExists")), reader_make_constant_shell(makeString("relationInstanceExistsRange")), reader_make_constant_shell(makeString("relationInstanceExistsMany")), reader_make_constant_shell(makeString("relationInstanceExistsMax")), reader_make_constant_shell(makeString("relationInstanceExistsMin")), reader_make_constant_shell(makeString("num-GenQuantRelnFrom")));

    public static final SubLList $list116 = list(makeKeyword("FORT"), makeKeyword("TERM"), makeKeyword("ANYTHING"));

    public static final SubLList $list117 = list(new SubLObject[]{ cons(reader_make_constant_shell(makeString("startingDate")), makeKeyword("DATE")), cons(reader_make_constant_shell(makeString("endingDate")), makeKeyword("DATE")), cons(reader_make_constant_shell(makeString("age")), makeKeyword("DATE")), cons(reader_make_constant_shell(makeString("situationLocation")), makeKeyword("LOCATION")), cons(reader_make_constant_shell(makeString("eventPartiallyOccursAt")), makeKeyword("LOCATION")), cons(reader_make_constant_shell(makeString("politiesBorderEachOther")), makeKeyword("LOCATION")), cons(reader_make_constant_shell(makeString("comesFrom-Generic")), makeKeyword("LOCATION")), cons(reader_make_constant_shell(makeString("subEvents")), makeKeyword("SUB-EVENT")), cons(reader_make_constant_shell(makeString("perpetrator")), makeKeyword("PERPETRATOR")), cons(reader_make_constant_shell(makeString("directingAgent")), makeKeyword("PERPETRATOR")), cons(reader_make_constant_shell(makeString("eventPlannedBy")), makeKeyword("PERPETRATOR")), cons(reader_make_constant_shell(makeString("inReactionTo")), makeKeyword("MOTIVATION")), cons(reader_make_constant_shell(makeString("imports")), makeKeyword("ECONOMY")), cons(reader_make_constant_shell(makeString("regionProduces")), makeKeyword("ECONOMY")), cons(reader_make_constant_shell(makeString("inhabitantTypes")), makeKeyword("INHABITANTS")), cons(reader_make_constant_shell(makeString("residentsOfRegion")), makeKeyword("INHABITANTS")), cons(reader_make_constant_shell(makeString("religionOfRule")), makeKeyword("RELIGION")), cons(reader_make_constant_shell(makeString("cultureReligions")), makeKeyword("RELIGION")), cons(reader_make_constant_shell(makeString("majorReligions")), makeKeyword("RELIGION")), cons(reader_make_constant_shell(makeString("minorReligions")), makeKeyword("RELIGION")), cons(reader_make_constant_shell(makeString("ableToControl")), makeKeyword("CONTROL")), cons(reader_make_constant_shell(makeString("owns")), makeKeyword("CONTROL")), cons(reader_make_constant_shell(makeString("personalFeatures")), makeKeyword("PERSONAL")), cons(reader_make_constant_shell(makeString("likes-Generic")), makeKeyword("PERSONAL")), cons(reader_make_constant_shell(makeString("eatsWillingly")), makeKeyword("PERSONAL")), cons(reader_make_constant_shell(makeString("relatives")), makeKeyword("PERSONAL")), cons(reader_make_constant_shell(makeString("acquaintedWith")), makeKeyword("PERSONAL")), cons(reader_make_constant_shell(makeString("eMailAddressText")), makeKeyword("CONTACT")), cons(reader_make_constant_shell(makeString("programsIn")), makeKeyword("CAPABILITIES")), cons(reader_make_constant_shell(makeString("educationLevel")), makeKeyword("CAPABILITIES")), cons(reader_make_constant_shell(makeString("fieldsOfCompetence")), makeKeyword("CAPABILITIES")), cons(reader_make_constant_shell(makeString("languagesSpokenHere")), makeKeyword("LANGUAGE")), cons(reader_make_constant_shell(makeString("languageSpoken")), makeKeyword("LANGUAGE")), cons(reader_make_constant_shell(makeString("organismKilled")), makeKeyword("TARGET")), cons(reader_make_constant_shell(makeString("thingHarmed")), makeKeyword("TARGET")), cons(reader_make_constant_shell(makeString("instrumentalRole")), makeKeyword("ATTACK-TYPE")) });

    public static final SubLList $list118 = list(cons(list(list(makeKeyword("OR"), list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("isa"))), list(makeKeyword("SPEC-PRED"), reader_make_constant_shell(makeString("isa")))), makeKeyword("TERM"), list(makeKeyword("TEST"), makeSymbol("POSSIBLE-ATTACK-TYPE?"))), makeKeyword("ATTACK-TYPE")), cons(list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("isa"))), makeKeyword("TERM"), list(makeKeyword("OR"), list(makeKeyword("GENLS"), reader_make_constant_shell(makeString("Graduate"))), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("PersonTypeByEducationLevel"))))), makeKeyword("CAPABILITIES")), cons(list(list(makeKeyword("GENL-PRED"), reader_make_constant_shell(makeString("isa"))), makeKeyword("TERM"), list(makeKeyword("ISA"), reader_make_constant_shell(makeString("PersonTypeByCulture")))), makeKeyword("PERSONAL")), cons(list(list(makeKeyword("SPEC-PRED"), reader_make_constant_shell(makeString("perpetrator"))), makeKeyword("TERM"), makeKeyword("ANYTHING")), makeKeyword("PERPETRATOR")), cons(list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("occursDuring")), reader_make_constant_shell(makeString("temporallyIntersects"))), makeKeyword("TERM"), makeKeyword("ANYTHING")), makeKeyword("DATE")), cons(list(list(makeKeyword("OR"), reader_make_constant_shell(makeString("intendedAttackTargets")), reader_make_constant_shell(makeString("intendedTargetTypeOfAttack")), reader_make_constant_shell(makeString("intendedVictim")), reader_make_constant_shell(makeString("numberOfHostagesTaken")), reader_make_constant_shell(makeString("target")), reader_make_constant_shell(makeString("bodilyActedOn")), reader_make_constant_shell(makeString("objectAttacked"))), makeKeyword("TERM"), makeKeyword("ANYTHING")), makeKeyword("TARGET")), cons(list(makeKeyword("ANYTHING"), makeKeyword("TERM"), list(makeKeyword("TEST"), makeSymbol("DATE-P"))), makeKeyword("DATE")));

    public static final SubLSymbol SIMPLE_BINARY_PROPERTY_PATTERNS = makeSymbol("SIMPLE-BINARY-PROPERTY-PATTERNS");

    public static final SubLList $list120 = cons(makeSymbol("PRED"), makeSymbol("PROPERTY-TYPE"));



    public static final SubLList $list122 = list(makeKeyword("TERM"), makeKeyword("ANYTHING"));

    public static final SubLSymbol $simple_binary_property_patterns_caching_state$ = makeSymbol("*SIMPLE-BINARY-PROPERTY-PATTERNS-CACHING-STATE*");

    public static final SubLSymbol SIMPLE_BINARY_PROPERTY_P = makeSymbol("SIMPLE-BINARY-PROPERTY-P");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLList $list126 = cons(makeSymbol("PATTERN"), makeSymbol("PROPERTY-TYPE"));

    public static final SubLList $list127 = list(cons(listS(list(makeKeyword("OR"), reader_make_constant_shell(makeString("injuryCount")), reader_make_constant_shell(makeString("deathToll")), reader_make_constant_shell(makeString("casualtyCount"))), makeKeyword("TERM"), makeKeyword("ANYTHING")), makeKeyword("TARGET")), cons(listS(reader_make_constant_shell(makeString("subSceneOfType")), makeKeyword("TERM"), makeKeyword("ANYTHING")), makeKeyword("SUB-EVENT")), cons(listS(reader_make_constant_shell(makeString("capableOf")), makeKeyword("TERM"), makeKeyword("ANYTHING")), makeKeyword("CAPABILITIES")), cons(list(reader_make_constant_shell(makeString("sponsorsAgentInAction")), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("TERM")), makeKeyword("PERPETRATOR")));

    public static final SubLList $list128 = listS(list(makeKeyword("TEST"), makeSymbol("EXISTENTIAL-RMP-P")), list(makeKeyword("BIND"), makeSymbol("PRED")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(makeKeyword("BIND"), makeSymbol("TYPE")), makeKeyword("ANYTHING"));





    private static final SubLObject $$SomeFn = reader_make_constant_shell(makeString("SomeFn"));

    public static final SubLList $list132 = list(makeSymbol("VAR"), makeSymbol("CORE"));

    public static final SubLList $list133 = list(reader_make_constant_shell(makeString("SomeFn")), reader_make_constant_shell(makeString("Thing")));

    public static final SubLSymbol EL_CONJUNCTION_P = makeSymbol("EL-CONJUNCTION-P");

    public static final SubLList $list135 = list(reader_make_constant_shell(makeString("InstanceNamedFn")), makeKeyword("STRING"), reader_make_constant_shell(makeString("AttackType")));

    private static final SubLObject $$AttackType = reader_make_constant_shell(makeString("AttackType"));

    private static final SubLObject $$AttackOnObject = reader_make_constant_shell(makeString("AttackOnObject"));

    private static final SubLObject $$HostileSocialAction = reader_make_constant_shell(makeString("HostileSocialAction"));

    private static final SubLObject $$KillingByOrganism = reader_make_constant_shell(makeString("KillingByOrganism"));

    private static final SubLObject $$CapturingSomething = reader_make_constant_shell(makeString("CapturingSomething"));

    private static final SubLObject $$IncurringDamage = reader_make_constant_shell(makeString("IncurringDamage"));

    private static final SubLObject $$ManMadeDisaster = reader_make_constant_shell(makeString("ManMadeDisaster"));

    private static final SubLObject $$ObstructionEvent = reader_make_constant_shell(makeString("ObstructionEvent"));

    private static final SubLObject $$MilitaryEvent = reader_make_constant_shell(makeString("MilitaryEvent"));

    private static final SubLObject $$ExposureToSubstance = reader_make_constant_shell(makeString("ExposureToSubstance"));

    private static final SubLObject $$ActsCommonlyConsideredCriminal = reader_make_constant_shell(makeString("ActsCommonlyConsideredCriminal"));

    private static final SubLObject $$ShootingAProjectileWeapon = reader_make_constant_shell(makeString("ShootingAProjectileWeapon"));

    public static final SubLList $list148 = list(reader_make_constant_shell(makeString("AttemptingFn")), list(makeKeyword("BIND"), makeSymbol("ACT-TYPE")));

    public static final SubLSymbol ACT_TYPE = makeSymbol("ACT-TYPE");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));

    private static final SubLObject $$functionalInArgs = reader_make_constant_shell(makeString("functionalInArgs"));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    public static final SubLList $list153 = list(reader_make_constant_shell(makeString("unknownSentence")), makeKeyword("ANYTHING"));

    public static SubLObject genl_propertyP(final SubLObject property1, final SubLObject property2, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        SubLObject ans = NIL;
        query_properties = putf(query_properties, $kw0$CONDITIONAL_SENTENCE_, T);
        final SubLObject var = $sym1$_TERM;
        final SubLObject sentence1 = property_to_sentence(property1, var);
        final SubLObject sentence2 = property_to_sentence(property2, var);
        final SubLObject query_sentence = make_implication(sentence1, sentence2);
        final SubLObject query_result = inference_kernel.new_cyc_query(query_sentence, mt, query_properties);
        ans = cyc_kernel.closed_query_success_result_p(query_result);
        return ans;
    }

    public static SubLObject more_general_properties(final SubLObject property, final SubLObject mt, SubLObject more_specifics) {
        if (more_specifics == UNPROVIDED) {
            more_specifics = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        }
        SubLObject ans = NIL;
        if (NIL != atomic_sentenceP(property)) {
            ans = add_existential_more_general_properties(ans, property, mt);
            final SubLObject property_pred = cycl_utilities.formula_arg0(property);
            if (NIL != member(property_pred, $list2, UNPROVIDED, UNPROVIDED)) {
                final SubLObject number_comparison_clauses = number_comparison_clauses(property);
                if (property_pred.eql($$relationInstanceExistsCount) && (!ZERO_INTEGER.eql(cycl_utilities.formula_arg4(property, UNPROVIDED)))) {
                    final SubLObject more_general = replace_formula_arg(ZERO_INTEGER, $$relationInstanceExists, butlast(property, UNPROVIDED));
                    ans = cons(more_general, ans);
                    note_more_specific_property(more_specifics, more_general, property);
                    SubLObject cdolist_list_var = number_comparison_clauses;
                    SubLObject number_comparison_clause = NIL;
                    number_comparison_clause = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        note_more_specific_property(more_specifics, more_general, number_comparison_clause);
                        cdolist_list_var = cdolist_list_var.rest();
                        number_comparison_clause = cdolist_list_var.first();
                    } 
                }
                SubLObject cdolist_list_var2 = number_comparison_clauses;
                SubLObject number_comparison_clause2 = NIL;
                number_comparison_clause2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    ans = cons(number_comparison_clause2, ans);
                    dictionary_utilities.dictionary_push(more_specifics, number_comparison_clause2, property);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    number_comparison_clause2 = cdolist_list_var2.first();
                } 
            } else
                if (property_pred.eql($$dateOfEvent)) {
                    final SubLObject date = cycl_utilities.formula_arg2(property, UNPROVIDED);
                    final SubLObject date_var = $sym6$_VALUE;
                    SubLObject cdolist_list_var = subsuming_dates(date);
                    SubLObject bigger_date = NIL;
                    bigger_date = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject more_general2 = make_existential(date_var, simplifier.conjoin(list(replace_formula_arg(TWO_INTEGER, date_var, property), list($$temporallySubsumes, bigger_date, date_var)), UNPROVIDED));
                        ans = cons(more_general2, ans);
                        note_more_specific_property(more_specifics, more_general2, property);
                        cdolist_list_var = cdolist_list_var.rest();
                        bigger_date = cdolist_list_var.first();
                    } 
                } else
                    if (NIL != genl_predicates.genl_predicateP(property_pred, $$situationLocation, UNPROVIDED, UNPROVIDED)) {
                        final SubLObject place = cycl_utilities.formula_arg2(property, UNPROVIDED);
                        final SubLObject place_var = $sym6$_VALUE;
                        SubLObject cdolist_list_var = bigger_places(place, mt);
                        SubLObject bigger_place = NIL;
                        bigger_place = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject more_general2 = make_existential(place_var, simplifier.conjoin(list(replace_formula_arg(TWO_INTEGER, place_var, property), list($$geographicalSubRegions, bigger_place, place_var)), UNPROVIDED));
                            ans = cons(more_general2, ans);
                            note_more_specific_property(more_specifics, more_general2, property);
                            cdolist_list_var = cdolist_list_var.rest();
                            bigger_place = cdolist_list_var.first();
                        } 
                        cdolist_list_var = place_types(place);
                        SubLObject place_type = NIL;
                        place_type = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject more_general2 = make_existential(place_var, simplifier.conjoin(list(replace_formula_arg(TWO_INTEGER, place_var, property), list($$isa, place_var, place_type)), UNPROVIDED));
                            ans = cons(more_general2, ans);
                            note_more_specific_property(more_specifics, more_general2, property);
                            cdolist_list_var = cdolist_list_var.rest();
                            place_type = cdolist_list_var.first();
                        } 
                    }


            ans = add_other_more_general_properties(ans, property, mt, more_specifics);
            ans = nreverse(ans);
        } else
            if (NIL != el_existential_p(property)) {
                ans = add_less_constrained_existential_properties(ans, property, mt, more_specifics);
            }

        return values(ans, more_specifics);
    }

    public static SubLObject add_existential_more_general_properties(SubLObject ans, final SubLObject property, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list11);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
            if (NIL == genl_predicates.genl_predicateP(pred, $$isa, mt, UNPROVIDED)) {
                final SubLObject var = $sym6$_VALUE;
                final SubLObject item_var;
                final SubLObject existential_property = item_var = make_existential(var, list(pred, $TERM, var));
                if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var, ans);
                }
                SubLObject cdolist_list_var = isa.min_isa(value, mt, UNPROVIDED);
                SubLObject v_isa = NIL;
                v_isa = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject item_var2;
                    final SubLObject existential_property_$1 = item_var2 = make_existential(var, simplifier.conjoin(list(list($$isa, var, v_isa), list(pred, $TERM, var)), UNPROVIDED));
                    if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        ans = cons(item_var2, ans);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_isa = cdolist_list_var.first();
                } 
            }
        }
        thread.resetMultipleValues();
        success = formula_pattern_match.formula_matches_pattern(property, $list15);
        v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
            final SubLObject var = $sym6$_VALUE;
            final SubLObject item_var;
            final SubLObject existential_property = item_var = make_existential(var, listS(pred, var, $list16));
            if (NIL == member(item_var, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                ans = cons(item_var, ans);
            }
            SubLObject cdolist_list_var = isa.min_isa(value, mt, UNPROVIDED);
            SubLObject v_isa = NIL;
            v_isa = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject item_var2;
                final SubLObject existential_property_$2 = item_var2 = make_existential(var, simplifier.conjoin(list(list($$isa, var, v_isa), listS(pred, var, $list16)), UNPROVIDED));
                if (NIL == member(item_var2, ans, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    ans = cons(item_var2, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_isa = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static SubLObject add_other_more_general_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        ans = add_instance_named_fn_properties(ans, property, mt, more_specifics);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            ans = add_genl_preds_properties(ans, property, more_specifics, mt);
            ans = add_genls_properties(ans, property, more_specifics);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject add_instance_named_fn_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics) {
        final SubLObject infn_argnum = position_if(INSTANCE_NAMED_FN_NAT_P, property, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != infn_argnum) {
            final SubLObject infn = cycl_utilities.formula_arg(property, infn_argnum, UNPROVIDED);
            final SubLObject type = cycl_utilities.nat_arg2(infn, UNPROVIDED);
            final SubLObject var = $sym6$_VALUE;
            final SubLObject more_general = make_existential(var, simplifier.conjoin(list(replace_formula_arg(infn_argnum, var, property), list($$isa, var, type)), UNPROVIDED));
            ans = cons(more_general, ans);
            note_more_specific_property(more_specifics, more_general, property);
        }
        return ans;
    }

    public static SubLObject add_genl_preds_properties(SubLObject ans, final SubLObject property, final SubLObject more_specifics, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property_pred = cycl_utilities.formula_arg0(property);
        SubLObject more = NIL;
        final SubLObject max = THREE_INTEGER;
        final SubLObject generality_estimate_cutoff = $int$150000;
        SubLObject stopP = NIL;
        if (NIL == stopP) {
            final SubLObject node_var = property_pred;
            final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$5 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(property_pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$6 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list(property_pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == stopP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$9 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$9;
                                        final SubLObject _prev_bind_0_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9)) {
                                                stopP = numG(cardinality_estimates.generality_estimate(genl_pred), generality_estimate_cutoff);
                                                if (((NIL == stopP) && (!genl_pred.eql(property_pred))) && (NIL != constant_p(genl_pred))) {
                                                    final SubLObject more_general = replace_formula_arg(ZERO_INTEGER, genl_pred, property);
                                                    more = cons(more_general, more);
                                                    stopP = list_utilities.lengthGE(more, max, UNPROVIDED);
                                                    if (NIL == stopP) {
                                                        SubLObject csome_list_var = more_general_properties(more_general, mt, more_specifics);
                                                        SubLObject more_more_general = NIL;
                                                        more_more_general = csome_list_var.first();
                                                        while ((NIL == stopP) && (NIL != csome_list_var)) {
                                                            final SubLObject item_var = more_more_general;
                                                            if (NIL == member(item_var, more, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                                                more = cons(item_var, more);
                                                            }
                                                            stopP = list_utilities.lengthGE(more, max, UNPROVIDED);
                                                            csome_list_var = csome_list_var.rest();
                                                            more_more_general = csome_list_var.first();
                                                        } 
                                                    }
                                                    note_more_specific_property(more_specifics, more_general, property);
                                                }
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$7;
                                            SubLObject _prev_bind_1_$7;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$13;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$8;
                                            SubLObject iteration_state_$15;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$9;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$17;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$10;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var3;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == stopP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var_$9);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == stopP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$13 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$13)) {
                                                                        _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$13, thread);
                                                                            for (iteration_state_$15 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == stopP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$15)); iteration_state_$15 = dictionary_contents.do_dictionary_contents_next(iteration_state_$15)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$15);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == stopP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == stopP) {
                                                                                                    csome_list_var2 = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                    while ((NIL == stopP) && (NIL != csome_list_var2)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$9, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$15);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$8, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$17 = NIL, rest_$17 = new_list; (NIL == stopP) && (NIL != rest_$17); rest_$17 = rest_$17.rest()) {
                                                                generating_fn = rest_$17.first();
                                                                _prev_bind_0_$10 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == stopP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == stopP) {
                                                                                csome_list_var3 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                while ((NIL == stopP) && (NIL != csome_list_var3)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$10, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$7, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$6, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$6, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$5, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str34$Node__a_does_not_pass_sbhl_type_t, property_pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$5, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$4, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$3, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL != more) {
            ans = append(nreverse(more), ans);
        }
        return ans;
    }

    public static SubLObject add_genls_properties(SubLObject ans, final SubLObject property, final SubLObject more_specifics) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject property_pred = cycl_utilities.formula_arg0(property);
        if ((NIL != formula_pattern_match.formula_matches_pattern(property, $list35)) && (NIL != member($$genls, ke_tools.transitive_via_arg_preds(property_pred, TWO_INTEGER, UNPROVIDED), UNPROVIDED, UNPROVIDED))) {
            SubLObject more = NIL;
            final SubLObject max = THREE_INTEGER;
            final SubLObject generality_estimate_cutoff = $int$150000;
            SubLObject stopP = NIL;
            final SubLObject property_coll = cycl_utilities.atomic_sentence_arg2(property, UNPROVIDED);
            if (NIL == stopP) {
                SubLObject node_var = property_coll;
                final SubLObject deck_type = ($BREADTH == $BREADTH) ? $QUEUE : $STACK;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(property_coll, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == stopP)) {
                                            final SubLObject genl = node_var;
                                            stopP = numG(cardinality_estimates.generality_estimate(genl), generality_estimate_cutoff);
                                            if ((NIL == stopP) && (!genl.eql(property_coll))) {
                                                final SubLObject more_general = replace_formula_arg(TWO_INTEGER, genl, property);
                                                more = cons(more_general, more);
                                                stopP = list_utilities.lengthGE(more, max, UNPROVIDED);
                                                note_more_specific_property(more_specifics, more_general, property);
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$23;
                                            SubLObject _prev_bind_1_$24;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$24;
                                            SubLObject iteration_state_$29;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$25;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$31;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$26;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == stopP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$23 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == stopP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        _prev_bind_0_$24 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == stopP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29)); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == stopP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == stopP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == stopP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$25, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$24, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$31 = NIL, rest_$31 = new_list; (NIL == stopP) && (NIL != rest_$31); rest_$31 = rest_$31.rest()) {
                                                                generating_fn = rest_$31.first();
                                                                _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == stopP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == stopP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == stopP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$26, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$24, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$23, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$25, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$23, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$22, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str34$Node__a_does_not_pass_sbhl_type_t, property_coll, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$21, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$20, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                }
            }
            if (NIL != more) {
                ans = append(nreverse(more), ans);
            }
        }
        return ans;
    }

    public static SubLObject add_less_constrained_existential_properties(SubLObject ans, final SubLObject property, final SubLObject mt, final SubLObject more_specifics) {
        assert NIL != el_existential_p(property) : "el_utilities.el_existential_p(property) " + "CommonSymbols.NIL != el_utilities.el_existential_p(property) " + property;
        SubLObject less_constrained_properties = NIL;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(property, UNPROVIDED);
        SubLObject var = NIL;
        SubLObject body = NIL;
        destructuring_bind_must_consp(current, datum, $list38);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list38);
        body = current.first();
        current = current.rest();
        if (NIL == current) {
            if (NIL != el_conjunction_p(body)) {
                SubLObject term_conjuncts = NIL;
                SubLObject other_conjuncts = NIL;
                SubLObject cdolist_list_var;
                final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(body, $IGNORE);
                SubLObject conjunct = NIL;
                conjunct = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != cycl_utilities.expression_find($TERM, conjunct, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        term_conjuncts = cons(conjunct, term_conjuncts);
                    } else {
                        other_conjuncts = cons(conjunct, other_conjuncts);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    conjunct = cdolist_list_var.first();
                } 
                if (NIL != other_conjuncts) {
                    SubLObject cdolist_list_var2 = list_utilities.powerset(other_conjuncts);
                    SubLObject sub_other_conjuncts = NIL;
                    sub_other_conjuncts = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (!sub_other_conjuncts.equal(other_conjuncts)) {
                            final SubLObject conjuncts_to_use = append(term_conjuncts, sub_other_conjuncts);
                            final SubLObject new_body = (NIL != list_utilities.singletonP(conjuncts_to_use)) ? conjuncts_to_use.first() : simplifier.conjoin(conjuncts_to_use, UNPROVIDED);
                            final SubLObject less_constrained_property = make_existential(var, new_body);
                            less_constrained_properties = cons(less_constrained_property, less_constrained_properties);
                            note_more_specific_property(more_specifics, less_constrained_property, property);
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        sub_other_conjuncts = cdolist_list_var2.first();
                    } 
                }
            }
        } else {
            cdestructuring_bind_error(datum, $list38);
        }
        final SubLObject reformulated = reformulate_property_for_paraphrase(property);
        if (!reformulated.equal(property)) {
            SubLObject cdolist_list_var3 = more_general_properties(reformulated, mt, more_specifics);
            SubLObject more = NIL;
            more = cdolist_list_var3.first();
            while (NIL != cdolist_list_var3) {
                final SubLObject item_var = more;
                if (NIL == member(item_var, less_constrained_properties, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    less_constrained_properties = cons(item_var, less_constrained_properties);
                }
                note_more_specific_property(more_specifics, more, property);
                cdolist_list_var3 = cdolist_list_var3.rest();
                more = cdolist_list_var3.first();
            } 
        }
        if (NIL != less_constrained_properties) {
            ans = append(less_constrained_properties, ans);
        }
        return ans;
    }

    public static SubLObject note_more_specific_property(final SubLObject more_specifics, final SubLObject more_general, final SubLObject more_specific) {
        dictionary_utilities.dictionary_push(more_specifics, more_general, more_specific);
        return more_specifics;
    }

    public static SubLObject instance_named_fn_nat_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_nat_p(v_object)) && cycl_utilities.nat_functor(v_object).eql($$InstanceNamedFn));
    }

    public static SubLObject number_comparison_clauses(final SubLObject property) {
        final SubLObject number_argnum = position_if(INTEGERP, property, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject count = cycl_utilities.formula_arg(property, number_argnum, UNPROVIDED);
        final SubLObject var = $sym6$_VALUE;
        if (NIL != subl_promotions.positive_integer_p(count)) {
            ans = list(make_existential(var, simplifier.conjoin(list(replace_formula_arg(number_argnum, var, property), list($$greaterThanOrEqualTo, var, count)), UNPROVIDED)));
        }
        return ans;
    }

    public static SubLObject subsuming_dates(final SubLObject date) {
        SubLObject bigger_dates = NIL;
        if (NIL != date_utilities.date_p(date)) {
            bigger_dates = remove(date, list_utilities.remove_if_not(DATE_P, list(date_utilities.century_of_date(date), date_utilities.decade_of_date(date), date_utilities.year_of_date(date), date_utilities.month_of_date(date), date_utilities.day_of_date(date)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return bigger_dates;
    }

    public static SubLObject bigger_places(final SubLObject place, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bigger_places = NIL;
        if (((NIL != narts_high.naut_p(place)) || (NIL != nart_handles.nart_p(place))) && cycl_utilities.nat_functor(place).eql($$CityNamedFn)) {
            final SubLObject location = cycl_utilities.nat_arg2(place, UNPROVIDED);
            bigger_places = cons(location, bigger_places(location, mt));
        } else
            if (NIL == indexed_term_p(place)) {
                bigger_places = NIL;
            }

        if (NIL != nart_handles.nart_p(narts_high.find_nart(list($$TerritoryFn, place)))) {
            bigger_places = append(bigger_places, bigger_places(narts_high.find_nart(list($$TerritoryFn, place)), mt));
        }
        if (NIL != isa.isa_in_any_mtP(place, $$City)) {
            final SubLObject country = ask_utilities.ask_variable($sym47$_COUNTRY, list($$countryOfCity, $sym47$_COUNTRY, place), mt, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
            if (NIL != country) {
                bigger_places = append(bigger_places, bigger_places(country, mt));
            }
        }
        if ((NIL != isa.isaP(place, $$GeographicalAgent, mt, UNPROVIDED)) && (NIL == isa.isaP(place, $$GeographicalRegion, mt, UNPROVIDED))) {
            final SubLObject territory = ask_utilities.ask_variable($sym51$_TERRITORY, listS($$territoryOf, place, $list53), mt, NIL, ONE_INTEGER, UNPROVIDED, UNPROVIDED).first();
            if (NIL != territory) {
                bigger_places = append(bigger_places, bigger_places(territory, mt));
            }
        } else {
            SubLObject all_answers = ask_utilities.ask_variable($sym54$_BIG, list($$geographicalSubRegions, $sym54$_BIG, place), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                all_answers = remove_if($sym57$PLACE_TOO_BIG_, all_answers, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            bigger_places = append(bigger_places, all_answers);
        }
        if (NIL == bigger_places) {
            Errors.warn($str58$Couldn_t_find_bigger_places_for__, place);
        }
        return delete_duplicates(bigger_places, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject place_too_bigP(final SubLObject place) {
        return subl_promotions.memberP(narts_high.nart_substitute(place), too_big_places(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_too_big_places() {
        final SubLObject cs = $too_big_places_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_too_big_places() {
        return memoization_state.caching_state_remove_function_results_with_args($too_big_places_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject too_big_places_internal() {
        SubLObject big_places = NIL;
        SubLObject cdolist_list_var = $list60;
        SubLObject place_type = NIL;
        place_type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$34 = isa.all_fort_instances(place_type, UNPROVIDED, UNPROVIDED);
            SubLObject place = NIL;
            place = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                big_places = cons(place, big_places);
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                place = cdolist_list_var_$34.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            place_type = cdolist_list_var.first();
        } 
        return big_places;
    }

    public static SubLObject too_big_places() {
        SubLObject caching_state = $too_big_places_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TOO_BIG_PLACES, $too_big_places_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(too_big_places_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject place_types(final SubLObject place) {
        if ((NIL == nart_handles.nart_p(place)) && (NIL == narts_high.naut_p(place))) {
            return NIL;
        }
        final SubLObject pcase_var = cycl_utilities.nat_functor(place);
        if (pcase_var.eql($$InstanceNamedFn)) {
            return list(cycl_utilities.nat_arg2(place, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject reformulate_property_for_paraphrase(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reformulated = NIL;
        thread.resetMultipleValues();
        SubLObject success = formula_pattern_match.formula_matches_pattern(property, $list62);
        SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
            final SubLObject trans_pred = list_utilities.alist_lookup_without_values(v_bindings, TRANS_PRED, UNPROVIDED, UNPROVIDED);
            final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses(bin_pred, TWO_INTEGER, UNPROVIDED);
                if (NIL != subl_promotions.memberP(trans_pred, valid_trans_preds, UNPROVIDED, UNPROVIDED)) {
                    reformulated = list(bin_pred, $TERM, value);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list65);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject trans_pred = list_utilities.alist_lookup_without_values(v_bindings, TRANS_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject valid_trans_preds = ke_tools.transitive_via_arg_inverses(bin_pred, TWO_INTEGER, UNPROVIDED);
                    if (NIL != subl_promotions.memberP(trans_pred, valid_trans_preds, UNPROVIDED, UNPROVIDED)) {
                        reformulated = list(bin_pred, $TERM, value);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list66);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list($$relationInstanceExistsCount, bin_pred, $TERM, collection, list($$IntervalMinFn, value));
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list69);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list($$relationInstanceExistsCount, bin_pred, $TERM, collection, list($$IntervalMaxFn, value));
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list71);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, TERN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list(tern_pred, $TERM, collection, list($$IntervalMaxFn, value));
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list73);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, TERN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list(tern_pred, $TERM, collection, list($$IntervalMaxFn, value));
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list74);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, TERN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list(tern_pred, $TERM, collection, list($$IntervalMinFn, value));
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list75);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject tern_pred = list_utilities.alist_lookup_without_values(v_bindings, TERN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list(tern_pred, $TERM, collection, list($$IntervalMinFn, value));
            }
        }
        if (NIL == reformulated) {
            thread.resetMultipleValues();
            success = formula_pattern_match.formula_matches_pattern(property, $list76);
            v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject value = list_utilities.alist_lookup_without_values(v_bindings, VALUE, UNPROVIDED, UNPROVIDED);
                final SubLObject collection = list_utilities.alist_lookup_without_values(v_bindings, COLLECTION, UNPROVIDED, UNPROVIDED);
                final SubLObject bin_pred = list_utilities.alist_lookup_without_values(v_bindings, BIN_PRED, UNPROVIDED, UNPROVIDED);
                reformulated = list($$relationInstanceExistsCount, bin_pred, $TERM, collection, list($$IntervalMaxFn, value));
            }
        }
        return NIL != reformulated ? reformulated : property;
    }

    public static SubLObject properties_to_sentences(final SubLObject v_properties, final SubLObject v_term) {
        SubLObject sentences = NIL;
        SubLObject cdolist_list_var = v_properties;
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            sentences = cons(property_to_sentence(property, v_term), sentences);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return nreverse(sentences);
    }

    public static SubLObject property_to_sentence(final SubLObject property, final SubLObject v_term) {
        return cycl_utilities.expression_subst(v_term, $TERM, property, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject property_to_set_or_collection(final SubLObject property) {
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(property, $sym77$_VAR);
        final SubLObject property_sentence = property_to_sentence(property, var);
        if (NIL != formula_pattern_match.formula_matches_pattern(property_sentence, listS($$isa, var, $list78))) {
            return cycl_utilities.formula_arg2(property_sentence, UNPROVIDED);
        }
        return make_binary_formula($$TheSetOf, var, property_sentence);
    }

    public static SubLObject sentences_to_properties(final SubLObject sentences, final SubLObject v_term) {
        SubLObject v_properties = NIL;
        SubLObject cdolist_list_var = sentences;
        SubLObject sentence = NIL;
        sentence = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_properties = cons(sentence_to_property(sentence, v_term), v_properties);
            cdolist_list_var = cdolist_list_var.rest();
            sentence = cdolist_list_var.first();
        } 
        return nreverse(v_properties);
    }

    public static SubLObject sentence_to_property(final SubLObject sentence, final SubLObject v_term) {
        return cycl_utilities.expression_subst($TERM, v_term, sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject property_extent(final SubLObject property, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject var = czer_utilities.unique_el_var_wrt_expression(property, $sym77$_VAR);
        final SubLObject sentence = property_to_sentence(property, var);
        return ask_utilities.query_variable(var, sentence, mt, query_properties);
    }

    public static SubLObject property_cardinality(final SubLObject property, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject v_set = property_to_set_or_collection(property);
        final SubLObject cardinality_var = czer_utilities.unique_el_var_wrt_expression(v_set, $sym80$_CARDINALITY);
        final SubLObject sentence = make_binary_formula($$extentCardinality, v_set, cardinality_var);
        final SubLObject q_properties = putf(query_properties, $RETURN, list($TEMPLATE, cardinality_var));
        final SubLObject answers = inference_kernel.new_cyc_query(sentence, mt, q_properties);
        return NIL != answers ? answers.first() : ZERO_INTEGER;
    }

    public static SubLObject term_has_propertyP(final SubLObject v_term, final SubLObject property, final SubLObject mt, SubLObject query_properties) {
        if (query_properties == UNPROVIDED) {
            query_properties = NIL;
        }
        final SubLObject property_sentence = property_to_sentence(property, v_term);
        final SubLObject query_result = inference_kernel.new_cyc_query(property_sentence, mt, query_properties);
        return cyc_kernel.closed_query_success_result_p(query_result);
    }

    public static SubLObject asserted_gaf_properties_of_term_denot(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = set.new_set(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$35 = NIL;
                            final SubLObject token_var_$36 = NIL;
                            while (NIL == done_var_$35) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$36);
                                final SubLObject valid_$37 = makeBoolean(!token_var_$36.eql(gaf));
                                if ((NIL != valid_$37) && (NIL == term_quoted_in_gafP(gaf, v_term, mt))) {
                                    final SubLObject property = sentence_to_property(assertions_high.gaf_formula(gaf), v_term);
                                    set.set_add(property, v_properties);
                                }
                                done_var_$35 = makeBoolean(NIL == valid_$37);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return v_properties;
    }

    public static SubLObject term_quoted_in_gafP(final SubLObject gaf, final SubLObject v_term, final SubLObject domain_mt) {
        final SubLObject pred = assertions_high.gaf_arg0(gaf);
        final SubLObject term_argnums = cycl_utilities.formula_arg_positions(gaf, v_term, UNPROVIDED);
        SubLObject quotedP = NIL;
        if (NIL == quotedP) {
            SubLObject csome_list_var = term_argnums;
            SubLObject term_argnum = NIL;
            term_argnum = csome_list_var.first();
            while ((NIL == quotedP) && (NIL != csome_list_var)) {
                if (NIL != kb_accessors.quoted_argumentP(pred, term_argnum)) {
                    quotedP = T;
                }
                csome_list_var = csome_list_var.rest();
                term_argnum = csome_list_var.first();
            } 
        }
        return quotedP;
    }

    public static SubLObject find_or_create_property_types_problem_store() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject reusedP = NIL;
        if (NIL != inference_datastructures_problem_store.valid_problem_store_p($property_types_problem_store$.getDynamicValue(thread))) {
            if (NIL != property_types_problem_store_size_okP()) {
                reusedP = T;
            } else {
                inference_datastructures_problem_store.destroy_problem_store($property_types_problem_store$.getDynamicValue(thread));
                $property_types_problem_store$.setDynamicValue(inference_datastructures_problem_store.new_problem_store(UNPROVIDED), thread);
            }
            return values($property_types_problem_store$.getDynamicValue(thread), reusedP);
        }
        return values(inference_datastructures_problem_store.new_problem_store(UNPROVIDED), reusedP);
    }

    public static SubLObject property_types_problem_store_size_okP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return numL(inference_datastructures_problem_store.problem_store_size($property_types_problem_store$.getDynamicValue(thread)), $int$100000);
    }

    public static SubLObject with_property_types_problem_store_reuse(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject reusedP = $sym87$REUSED_;
        return list(CMULTIPLE_VALUE_BIND, list($property_types_problem_store$, reusedP), $list90, list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), listS(PUNLESS, reusedP, $list94)));
    }

    public static SubLObject property_typeP(final SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $const95$TypicalityReferenceSetPropertyTyp);
    }

    public static SubLObject property_types(final SubLObject property, final SubLObject mt) {
        final SubLObject var = $sym96$_PROPERTY_TYPE;
        SubLObject types = NIL;
        SubLObject cdolist_list_var = property_basic_properties(property);
        SubLObject query_property = NIL;
        query_property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject query_sentence = property_type_query_sentence(query_property, var);
            final SubLObject v_properties = list(new SubLObject[]{ $RETURN, list($TEMPLATE, var), $MAX_TRANSFORMATION_DEPTH, THREE_INTEGER, $MAX_NUMBER, ONE_INTEGER, $MAX_TIME, $int$60, $PROBLEM_STORE, find_or_create_property_types_problem_store() });
            SubLObject cdolist_list_var_$39;
            final SubLObject this_types = cdolist_list_var_$39 = inference_kernel.new_cyc_query(query_sentence, mt, v_properties);
            SubLObject this_type = NIL;
            this_type = cdolist_list_var_$39.first();
            while (NIL != cdolist_list_var_$39) {
                final SubLObject item_var = this_type;
                if (NIL == member(item_var, types, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                    types = cons(item_var, types);
                }
                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                this_type = cdolist_list_var_$39.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            query_property = cdolist_list_var.first();
        } 
        return types;
    }

    public static SubLObject property_type_string(final SubLObject property_type) {
        final SubLObject strings = ask_utilities.ask_variable($sym102$_STRING, listS($$termStrings, property_type, $list104), $$EnglishMt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != strings) {
            return strings.first();
        }
        return pph_main.generate_phrase(property_type, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject property_type_query_sentence(final SubLObject property, final SubLObject var) {
        SubLObject query_sentence = list($const106$typicalityReferenceSetPropertyTyp, property, var);
        SubLObject cdolist_list_var;
        final SubLObject unbound_vars = cdolist_list_var = obsolete.formula_free_variables(property, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject unbound_var = NIL;
        unbound_var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            query_sentence = make_existential(unbound_var, query_sentence);
            cdolist_list_var = cdolist_list_var.rest();
            unbound_var = cdolist_list_var.first();
        } 
        return query_sentence;
    }

    public static SubLObject property_basic_properties(final SubLObject property) {
        if (NIL != unknown_property_p(property)) {
            return property_basic_properties(unmake_unknown_property(property));
        }
        if (NIL != el_existential_p(property)) {
            return property_basic_properties(cycl_utilities.formula_arg2(property, UNPROVIDED));
        }
        if (NIL != el_conjunction_p(property)) {
            SubLObject basic_properties = NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(property, $IGNORE);
            SubLObject conjunct = NIL;
            conjunct = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$40 = property_basic_properties(conjunct);
                SubLObject basic_property = NIL;
                basic_property = cdolist_list_var_$40.first();
                while (NIL != cdolist_list_var_$40) {
                    if (NIL != cycl_utilities.expression_find($TERM, basic_property, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        basic_properties = cons(basic_property, basic_properties);
                    }
                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                    basic_property = cdolist_list_var_$40.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                conjunct = cdolist_list_var.first();
            } 
            return basic_properties;
        }
        if (NIL != cycl_utilities.expression_find($TERM, property, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return list(property);
        }
        return NIL;
    }

    public static SubLObject property_type_p_old(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $property_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject property_types_old(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != unknown_property_p(property)) {
            return property_types_old(cycl_utilities.formula_arg1(property, UNPROVIDED));
        }
        if (NIL != el_existential_p(property)) {
            ans = existential_property_types(property);
        } else
            if (NIL != existential_rmp_p(cycl_utilities.formula_arg0(property))) {
                ans = rmp_existential_property_types(property);
            } else
                if (NIL != el_conjunction_p(property)) {
                    ans = conjunctive_property_types(property);
                } else
                    if (NIL != simple_binary_property_p(property)) {
                        ans = simple_binary_property_types(property);
                    } else
                        if (NIL != el_ternary_formula_p(property)) {
                            ans = ternary_property_types(property);
                        } else
                            if (NIL != formula_pattern_match.formula_matches_pattern(property, $list108)) {
                                ans = list($SUPER_EVENT);
                            } else
                                if (NIL != formula_pattern_match.formula_matches_pattern(property, $list110)) {
                                    ans = list($CONTACT);
                                } else
                                    if (NIL != cycl_utilities.expression_find_if(DATE_P, property, UNPROVIDED, UNPROVIDED)) {
                                        ans = list($DATE);
                                    }







        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != ans)) && (NIL == list_utilities.list_of_type_p(PROPERTY_TYPE_P_OLD, ans))) {
            Errors.error($str114$_S_is_not_a_list_of_property_type, ans);
        }
        return ans;
    }

    public static SubLObject existential_rmp_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, $existential_rmps$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject simple_binary_property_p(final SubLObject property) {
        return formula_pattern_match.formula_matches_pattern(property, $list116);
    }

    public static SubLObject clear_simple_binary_property_patterns() {
        final SubLObject cs = $simple_binary_property_patterns_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_simple_binary_property_patterns() {
        return memoization_state.caching_state_remove_function_results_with_args($simple_binary_property_patterns_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject simple_binary_property_patterns_internal() {
        SubLObject patterns = $other_simple_binary_property_patterns$.getGlobalValue();
        SubLObject cdolist_list_var = $simple_binary_property_type_preds$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject property_type = NIL;
            destructuring_bind_must_consp(current, datum, $list120);
            pred = current.first();
            current = property_type = current.rest();
            patterns = list_utilities.alist_enter(patterns, bq_cons(list($GENL_PRED, pred), $list122), property_type, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return patterns;
    }

    public static SubLObject simple_binary_property_patterns() {
        SubLObject caching_state = $simple_binary_property_patterns_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SIMPLE_BINARY_PROPERTY_PATTERNS, $simple_binary_property_patterns_caching_state$, NIL, EQL, ZERO_INTEGER, ONE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(simple_binary_property_patterns_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject simple_binary_property_types(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        assert NIL != simple_binary_property_p(property) : "properties.simple_binary_property_p(property) " + "CommonSymbols.NIL != properties.simple_binary_property_p(property) " + property;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$InferencePSC);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            SubLObject cdolist_list_var = simple_binary_property_patterns();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pattern = NIL;
                SubLObject property_type = NIL;
                destructuring_bind_must_consp(current, datum, $list126);
                pattern = current.first();
                current = property_type = current.rest();
                if (NIL != formula_pattern_match.formula_matches_pattern(property, pattern)) {
                    ans = cons(property_type, ans);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return delete_duplicates(ans, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ternary_property_types(final SubLObject property) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = $ternary_property_patterns$.getGlobalValue();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pattern = NIL;
            SubLObject property_type = NIL;
            destructuring_bind_must_consp(current, datum, $list126);
            pattern = current.first();
            current = property_type = current.rest();
            if (NIL != formula_pattern_match.formula_matches_pattern(property, pattern)) {
                ans = cons(property_type, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return ans;
    }

    public static SubLObject rmp_existential_property_types(final SubLObject property) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pattern = $list128;
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(property, pattern);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject type = list_utilities.alist_lookup_without_values(v_bindings, TYPE, UNPROVIDED, UNPROVIDED);
            final SubLObject v_term = list_utilities.alist_lookup_without_values(v_bindings, TERM, UNPROVIDED, UNPROVIDED);
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
            return property_types_old(list(pred, v_term, list($$SomeFn, type)));
        }
        return NIL;
    }

    public static SubLObject existential_property_types(final SubLObject property) {
        assert NIL != el_existential_p(property) : "el_utilities.el_existential_p(property) " + "CommonSymbols.NIL != el_utilities.el_existential_p(property) " + property;
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_args(property, UNPROVIDED);
        SubLObject var = NIL;
        SubLObject v_core = NIL;
        destructuring_bind_must_consp(current, datum, $list132);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list132);
        v_core = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject reformulated = cycl_utilities.expression_subst($list133, var, v_core, UNPROVIDED, UNPROVIDED);
            return property_types_old(reformulated);
        }
        cdestructuring_bind_error(datum, $list132);
        return NIL;
    }

    public static SubLObject conjunctive_property_types(final SubLObject property) {
        assert NIL != el_conjunction_p(property) : "el_utilities.el_conjunction_p(property) " + "CommonSymbols.NIL != el_utilities.el_conjunction_p(property) " + property;
        SubLObject types = NIL;
        SubLObject cdolist_list_var = cycl_utilities.formula_args(property, UNPROVIDED);
        SubLObject conjunct = NIL;
        conjunct = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != collection_defns.cyc_typicality_reference_set_propertyP(conjunct)) {
                types = append(property_types_old(conjunct), types);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        } 
        return types;
    }

    public static SubLObject possible_attack_typeP(final SubLObject arg2) {
        if (NIL != formula_pattern_match.formula_matches_pattern(arg2, $list135)) {
            return T;
        }
        if (NIL == term.el_fort_p(arg2)) {
            return NIL;
        }
        if (((((((((((((NIL != attempted_possible_attack_typeP(arg2)) || (NIL != isa.isaP(arg2, $$AttackType, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$AttackOnObject, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$HostileSocialAction, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$KillingByOrganism, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$CapturingSomething, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$IncurringDamage, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$ManMadeDisaster, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$ObstructionEvent, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$MilitaryEvent, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$ExposureToSubstance, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$ActsCommonlyConsideredCriminal, UNPROVIDED, UNPROVIDED))) || (NIL != genls.genlP(arg2, $$ShootingAProjectileWeapon, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject attempted_possible_attack_typeP(final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        if (NIL != collection_defns.cycl_non_atomic_termP(arg2)) {
            thread.resetMultipleValues();
            final SubLObject success = formula_pattern_match.formula_matches_pattern(narts_high.nart_el_formula(arg2), $list148);
            final SubLObject v_bindings = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success) {
                final SubLObject act_type = list_utilities.alist_lookup_without_values(v_bindings, ACT_TYPE, UNPROVIDED, UNPROVIDED);
                ans = possible_attack_typeP(act_type);
            }
        }
        return ans;
    }

    public static SubLObject bad_fan_out_property_p(final SubLObject property, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.formula_arg0(property);
        final SubLObject term_positions = cycl_utilities.arg_positions_bfs($TERM, property, UNPROVIDED);
        SubLObject badP = NIL;
        if (NIL == badP) {
            final SubLObject node_var = pred;
            final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$41 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = $$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$42 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str30$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str25$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$43 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$46 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == badP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$50 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject genl_pred = node_var_$50;
                                            final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$50)) {
                                                    final SubLObject fan_out_arg = kb_accessors.asserted_fan_out_arg(genl_pred, mt);
                                                    if (fan_out_arg.isInteger() && (NIL == subl_promotions.memberP(list(fan_out_arg), term_positions, symbol_function(EQUAL), UNPROVIDED))) {
                                                        badP = T;
                                                    }
                                                    if (NIL == badP) {
                                                        SubLObject csome_list_var = kb_mapping_utilities.pred_values_in_mt(genl_pred, $$functionalInArgs, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        SubLObject functional_arg = NIL;
                                                        functional_arg = csome_list_var.first();
                                                        while ((NIL == badP) && (NIL != csome_list_var)) {
                                                            if (NIL != subl_promotions.memberP(list(functional_arg), term_positions, symbol_function(EQUAL), UNPROVIDED)) {
                                                                badP = T;
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            functional_arg = csome_list_var.first();
                                                        } 
                                                    }
                                                }
                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject rest;
                                                SubLObject module_var;
                                                SubLObject _prev_bind_0_$46;
                                                SubLObject _prev_bind_1_$46;
                                                SubLObject node;
                                                SubLObject d_link;
                                                SubLObject mt_links;
                                                SubLObject iteration_state;
                                                SubLObject mt_$54;
                                                SubLObject tv_links;
                                                SubLObject _prev_bind_0_$47;
                                                SubLObject iteration_state_$56;
                                                SubLObject tv;
                                                SubLObject link_nodes;
                                                SubLObject _prev_bind_0_$48;
                                                SubLObject sol;
                                                SubLObject set_contents_var;
                                                SubLObject basis_object;
                                                SubLObject state;
                                                SubLObject node_vars_link_node;
                                                SubLObject csome_list_var2;
                                                SubLObject node_vars_link_node2;
                                                SubLObject new_list;
                                                SubLObject rest_$58;
                                                SubLObject generating_fn;
                                                SubLObject _prev_bind_0_$49;
                                                SubLObject sol2;
                                                SubLObject link_nodes2;
                                                SubLObject set_contents_var2;
                                                SubLObject basis_object2;
                                                SubLObject state2;
                                                SubLObject node_vars_link_node3;
                                                SubLObject csome_list_var3;
                                                SubLObject node_vars_link_node4;
                                                for (rest = NIL, rest = accessible_modules; (NIL == badP) && (NIL != rest); rest = rest.rest()) {
                                                    module_var = rest.first();
                                                    _prev_bind_0_$46 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        node = function_terms.naut_to_nart(node_var_$50);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == badP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        mt_$54 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_$54)) {
                                                                            _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt_$54, thread);
                                                                                for (iteration_state_$56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == badP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$56)); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next(iteration_state_$56)) {
                                                                                    thread.resetMultipleValues();
                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$56);
                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == badP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    if (NIL == badP) {
                                                                                                        csome_list_var2 = sol;
                                                                                                        node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                        while ((NIL == badP) && (NIL != csome_list_var2)) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                        } 
                                                                                                    }
                                                                                                } else {
                                                                                                    Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$48, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$56);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$47, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str33$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                for (rest_$58 = NIL, rest_$58 = new_list; (NIL == badP) && (NIL != rest_$58); rest_$58 = rest_$58.rest()) {
                                                                    generating_fn = rest_$58.first();
                                                                    _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == badP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                if (NIL == badP) {
                                                                                    csome_list_var3 = sol2;
                                                                                    node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                    while ((NIL == badP) && (NIL != csome_list_var3)) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                    } 
                                                                                }
                                                                            } else {
                                                                                Errors.error($str32$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$49, thread);
                                                                    }
                                                                }
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$46, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$46, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$45, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$47, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$45, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$44, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str34$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$46, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$44, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$43, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$43, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$42, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$41, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$50 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$50, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return badP;
    }

    public static SubLObject make_unknown_property(final SubLObject property) {
        return make_unary_formula($$unknownSentence, property);
    }

    public static SubLObject unmake_unknown_property(final SubLObject property) {
        return cycl_utilities.formula_arg1(property, UNPROVIDED);
    }

    public static SubLObject unknown_property_p(final SubLObject property) {
        return formula_pattern_match.formula_matches_pattern(property, $list153);
    }

    public static SubLObject declare_properties_file() {
        declareFunction(me, "genl_propertyP", "GENL-PROPERTY?", 3, 1, false);
        declareFunction(me, "more_general_properties", "MORE-GENERAL-PROPERTIES", 2, 1, false);
        declareFunction(me, "add_existential_more_general_properties", "ADD-EXISTENTIAL-MORE-GENERAL-PROPERTIES", 3, 0, false);
        declareFunction(me, "add_other_more_general_properties", "ADD-OTHER-MORE-GENERAL-PROPERTIES", 4, 0, false);
        declareFunction(me, "add_instance_named_fn_properties", "ADD-INSTANCE-NAMED-FN-PROPERTIES", 4, 0, false);
        declareFunction(me, "add_genl_preds_properties", "ADD-GENL-PREDS-PROPERTIES", 4, 0, false);
        declareFunction(me, "add_genls_properties", "ADD-GENLS-PROPERTIES", 3, 0, false);
        declareFunction(me, "add_less_constrained_existential_properties", "ADD-LESS-CONSTRAINED-EXISTENTIAL-PROPERTIES", 4, 0, false);
        declareFunction(me, "note_more_specific_property", "NOTE-MORE-SPECIFIC-PROPERTY", 3, 0, false);
        declareFunction(me, "instance_named_fn_nat_p", "INSTANCE-NAMED-FN-NAT-P", 1, 0, false);
        declareFunction(me, "number_comparison_clauses", "NUMBER-COMPARISON-CLAUSES", 1, 0, false);
        declareFunction(me, "subsuming_dates", "SUBSUMING-DATES", 1, 0, false);
        declareFunction(me, "bigger_places", "BIGGER-PLACES", 2, 0, false);
        declareFunction(me, "place_too_bigP", "PLACE-TOO-BIG?", 1, 0, false);
        declareFunction(me, "clear_too_big_places", "CLEAR-TOO-BIG-PLACES", 0, 0, false);
        declareFunction(me, "remove_too_big_places", "REMOVE-TOO-BIG-PLACES", 0, 0, false);
        declareFunction(me, "too_big_places_internal", "TOO-BIG-PLACES-INTERNAL", 0, 0, false);
        declareFunction(me, "too_big_places", "TOO-BIG-PLACES", 0, 0, false);
        declareFunction(me, "place_types", "PLACE-TYPES", 1, 0, false);
        declareFunction(me, "reformulate_property_for_paraphrase", "REFORMULATE-PROPERTY-FOR-PARAPHRASE", 1, 0, false);
        declareFunction(me, "properties_to_sentences", "PROPERTIES-TO-SENTENCES", 2, 0, false);
        declareFunction(me, "property_to_sentence", "PROPERTY-TO-SENTENCE", 2, 0, false);
        declareFunction(me, "property_to_set_or_collection", "PROPERTY-TO-SET-OR-COLLECTION", 1, 0, false);
        declareFunction(me, "sentences_to_properties", "SENTENCES-TO-PROPERTIES", 2, 0, false);
        declareFunction(me, "sentence_to_property", "SENTENCE-TO-PROPERTY", 2, 0, false);
        declareFunction(me, "property_extent", "PROPERTY-EXTENT", 2, 1, false);
        declareFunction(me, "property_cardinality", "PROPERTY-CARDINALITY", 2, 1, false);
        declareFunction(me, "term_has_propertyP", "TERM-HAS-PROPERTY?", 3, 1, false);
        declareFunction(me, "asserted_gaf_properties_of_term_denot", "ASSERTED-GAF-PROPERTIES-OF-TERM-DENOT", 2, 0, false);
        declareFunction(me, "term_quoted_in_gafP", "TERM-QUOTED-IN-GAF?", 3, 0, false);
        declareFunction(me, "find_or_create_property_types_problem_store", "FIND-OR-CREATE-PROPERTY-TYPES-PROBLEM-STORE", 0, 0, false);
        declareFunction(me, "property_types_problem_store_size_okP", "PROPERTY-TYPES-PROBLEM-STORE-SIZE-OK?", 0, 0, false);
        declareMacro(me, "with_property_types_problem_store_reuse", "WITH-PROPERTY-TYPES-PROBLEM-STORE-REUSE");
        declareFunction(me, "property_typeP", "PROPERTY-TYPE?", 1, 0, false);
        declareFunction(me, "property_types", "PROPERTY-TYPES", 2, 0, false);
        declareFunction(me, "property_type_string", "PROPERTY-TYPE-STRING", 1, 0, false);
        declareFunction(me, "property_type_query_sentence", "PROPERTY-TYPE-QUERY-SENTENCE", 2, 0, false);
        declareFunction(me, "property_basic_properties", "PROPERTY-BASIC-PROPERTIES", 1, 0, false);
        declareFunction(me, "property_type_p_old", "PROPERTY-TYPE-P-OLD", 1, 0, false);
        declareFunction(me, "property_types_old", "PROPERTY-TYPES-OLD", 1, 0, false);
        declareFunction(me, "existential_rmp_p", "EXISTENTIAL-RMP-P", 1, 0, false);
        declareFunction(me, "simple_binary_property_p", "SIMPLE-BINARY-PROPERTY-P", 1, 0, false);
        declareFunction(me, "clear_simple_binary_property_patterns", "CLEAR-SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false);
        declareFunction(me, "remove_simple_binary_property_patterns", "REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false);
        declareFunction(me, "simple_binary_property_patterns_internal", "SIMPLE-BINARY-PROPERTY-PATTERNS-INTERNAL", 0, 0, false);
        declareFunction(me, "simple_binary_property_patterns", "SIMPLE-BINARY-PROPERTY-PATTERNS", 0, 0, false);
        declareFunction(me, "simple_binary_property_types", "SIMPLE-BINARY-PROPERTY-TYPES", 1, 0, false);
        declareFunction(me, "ternary_property_types", "TERNARY-PROPERTY-TYPES", 1, 0, false);
        declareFunction(me, "rmp_existential_property_types", "RMP-EXISTENTIAL-PROPERTY-TYPES", 1, 0, false);
        declareFunction(me, "existential_property_types", "EXISTENTIAL-PROPERTY-TYPES", 1, 0, false);
        declareFunction(me, "conjunctive_property_types", "CONJUNCTIVE-PROPERTY-TYPES", 1, 0, false);
        declareFunction(me, "possible_attack_typeP", "POSSIBLE-ATTACK-TYPE?", 1, 0, false);
        declareFunction(me, "attempted_possible_attack_typeP", "ATTEMPTED-POSSIBLE-ATTACK-TYPE?", 1, 0, false);
        declareFunction(me, "bad_fan_out_property_p", "BAD-FAN-OUT-PROPERTY-P", 2, 0, false);
        declareFunction(me, "make_unknown_property", "MAKE-UNKNOWN-PROPERTY", 1, 0, false);
        declareFunction(me, "unmake_unknown_property", "UNMAKE-UNKNOWN-PROPERTY", 1, 0, false);
        declareFunction(me, "unknown_property_p", "UNKNOWN-PROPERTY-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_properties_file() {
        deflexical("*TOO-BIG-PLACES-CACHING-STATE*", NIL);
        defparameter("*PROPERTY-TYPES-PROBLEM-STORE*", NIL);
        deflexical("*PROPERTY-TYPES*", $list107);
        deflexical("*EXISTENTIAL-RMPS*", $list115);
        deflexical("*SIMPLE-BINARY-PROPERTY-TYPE-PREDS*", $list117);
        deflexical("*OTHER-SIMPLE-BINARY-PROPERTY-PATTERNS*", $list118);
        deflexical("*SIMPLE-BINARY-PROPERTY-PATTERNS-CACHING-STATE*", NIL);
        deflexical("*TERNARY-PROPERTY-PATTERNS*", $list127);
        return NIL;
    }

    public static SubLObject setup_properties_file() {
        memoization_state.note_globally_cached_function(TOO_BIG_PLACES);
        memoization_state.note_globally_cached_function(SIMPLE_BINARY_PROPERTY_PATTERNS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_properties_file();
    }

    @Override
    public void initializeVariables() {
        init_properties_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_properties_file();
    }

    static {



































































































































































    }
}

/**
 * Total time: 2571 ms
 */

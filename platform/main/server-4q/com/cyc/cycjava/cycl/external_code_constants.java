/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      EXTERNAL-CODE-CONSTANTS
 *  source file: /cyc/top/cycl/external-code-constants.lisp
 *  created:     2019/07/03 17:37:56
 */
public final class external_code_constants extends SubLTranslatedFile implements V02 {
    // // Constructor
    private external_code_constants() {
    }

    public static final SubLFile me = new external_code_constants();

    public static final String myName = "com.cyc.cycjava.cycl.external_code_constants";

    // // Definitions
    public static final SubLObject project_specific_constants_validP(SubLObject constant_list) {
        {
            SubLObject problems = NIL;
            SubLObject cdolist_list_var = constant_list;
            SubLObject constant = NIL;
            for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                if (NIL == constant_handles.valid_constant(constant, T)) {
                    Errors.warn($str_alt0$Constant__A_is_not_valid_, constant);
                    problems = T;
                }
            }
            return makeBoolean(NIL == problems);
        }
    }

    public static final SubLObject cpof_external_constants_validP() {
        return project_specific_constants_validP($cpof_external_constants$.getGlobalValue());
    }

    // deflexical
    private static final SubLSymbol $cpof_external_constants$ = makeSymbol("*CPOF-EXTERNAL-CONSTANTS*");

    public static final SubLObject bbn_external_constants_validP() {
        return project_specific_constants_validP($bbn_external_constants$.getGlobalValue());
    }

    // deflexical
    private static final SubLSymbol $bbn_external_constants$ = makeSymbol("*BBN-EXTERNAL-CONSTANTS*");

    public static final SubLObject mysentient_external_constants_validP() {
        return project_specific_constants_validP($mysentient_external_constants$.getGlobalValue());
    }

    // deflexical
    private static final SubLSymbol $mysentient_external_constants$ = makeSymbol("*MYSENTIENT-EXTERNAL-CONSTANTS*");

    public static final SubLObject declare_external_code_constants_file() {
        declareFunction("project_specific_constants_validP", "PROJECT-SPECIFIC-CONSTANTS-VALID?", 1, 0, false);
        declareFunction("cpof_external_constants_validP", "CPOF-EXTERNAL-CONSTANTS-VALID?", 0, 0, false);
        declareFunction("bbn_external_constants_validP", "BBN-EXTERNAL-CONSTANTS-VALID?", 0, 0, false);
        declareFunction("mysentient_external_constants_validP", "MYSENTIENT-EXTERNAL-CONSTANTS-VALID?", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_external_code_constants_file() {
        deflexical("*CPOF-EXTERNAL-CONSTANTS*", list(new SubLObject[]{ $$ATGMLauncher_Milan, $$AVLB_Leopard2, $$Agent_PartiallyTangible, $$AirDefenseWeapon, $$AirTransportationDevice, $$AmphibiousVehicle, $$AntiAircraftGunSP_Leopard2, $$AntiAircraftGunSP_Urutu, $$AntiAircraftGunSP_ZSU23_4, $$ArmoredCargoCarrier, $$ArmoredCargoCarrier_Leopard2, $$ArmoredCargoCarrier_Urutu, $$ArmoredCommandPostCarrier_M577A3, $$ArmoredPersonnelCarrier, $$ArmoredPersonnelCarrier_AAVP7A1, $$ArmoredPersonnelCarrier_BTR50, $$ArmoredPersonnelCarrier_BTR60, $$ArmoredPersonnelCarrier_BTR70, $$ArmoredPersonnelCarrier_BTR80, $const20$ArmoredPersonnelCarrier_EE11_Urut, $$ArmoredPersonnelCarrier_M113, $$ArmoredPersonnelCarrier_MTLB, $$ArmoredPersonnelCarrier_V150, $$ArmoredReconCarrier, $$ArmoredReconCarrier_BRDM2, $$ArmoredReconCarrier_BRM1, $$ArmoredReconCarrier_EE9, $$ArmoredReconCarrier_Fox, $$ArmoredReconCarrier_M551, $$ArmoredReconCarrier_Sensor_LAV, $$ArmoredReconCarrier_UAV_LAV, $$ArmoredReconCarrier_Urutu, $$ArmoredReconCarrier_VBC90, $$ArtilleryUnit_MilitarySpecialty, $$Attack_MilitaryOperation, $$BPVI_BackgroundMt, $$BPVI_Country_NorthBluegrass, $$BPVI_Country_SouthBluegrass, $$BPVI_HigherIntelligenceUnit_USA, $$BattleTank_AMX30, $$BattleTank_Leopard2, $$BattleTank_M60A3, $$BattleTank_Mk5, $$BattleTank_T54, $$BattleTank_T55, $$BattleTank_T62, $$BattleTank_T64, $$BattleTank_T72, $$BattleTank_T80, $$BattleTank_T90, $$BlockingTraffic, $$Bomblet_M77, $$BradleyFightingVehicle_M2, $$BradleyFightingVehicle_M3, $$BradleyLinebacker_M6, $$Brigade_MilitaryEchelon, $$BuildingMaterial, $const58$CPOF_ChangeOverTimeQueryMicrotheo, $$CPOF_CurrentStateQueryMt, $$CPOF_EquipmentClassificationType, $$CPOF_QueryMt, $$CPOF_SitRepMtFn, $$CPOF_SitRepObjectFn, $$CPOF_SitRepSourceFn, $$CPOF_SitRepSubjectFn, $$CPOF_SpotReportObjectFn, $$CPOF_SpotReportSourceFn, $$CPOF_SpotReportSubjectFn, $const69$CPOF_UnitSpecialtyClassificationT, $$Can, $$Civilian, $$ClusterMunition_Artillery, $$CombatEngineeringVehicle, $$CombatEngineeringVehicle_M728, $$Constructing, $$ConstructionArtifact, $$ContainedProductTypeFn, $$ConveyFn, $const79$CounterArtilleryUnit_MilitarySpec, $$Crate, $$Degree_UnitOfAngularMeasure, $$DestructionFn, $$DiggingAHole, $$DisengagingFromCombat, $$Division_MilitaryEchelon, $$EarthMovingEquipment_Military, $$East_Generally, $$Engagement_Military, $$FOG_M_Polyphem, $$FieldArtillery, $$FiveTonTruck_Refueler, $$FiveTonTruck_Standard, $$FixedWingAircraft, $$FixingAnEnemy, $$FlameThrowingTank_Leopard2, $$FoodOrDrink, $$GroupFn, $$HalfTrackVehicle, $$Hearing, $$Helicopter, $$Helicopter_AS332, $$Helicopter_AS565, $$Howitzer_105mmTowed, $$Howitzer_122mmSelfPropelled, $$Howitzer_122mmTowed, $$Howitzer_130mmTowed, $$Howitzer_152mmTowed, $$Howitzer_155mmSP_Standard, $$Howitzer_2A65, $$Howitzer_2S19, $$Howitzer_2S3, $$Howitzer_AUF1, $$Howitzer_D20, $$Howitzer_D30, $$Howitzer_M101, $$Howitzer_M102, $$Howitzer_M108, $$Howitzer_M109, $$Howitzer_M109A6, $$Howitzer_M119A1, $$Howitzer_M198, $$Howitzer_M46, $$HowitzerShell, $$Humvee, $$IFV_Leopard2, $$IndirectFireWeapon, $$InfantryFightingVehicle_AMX10P, $$InfantryFightingVehicle_BMD_1, $$InfantryFightingVehicle_BMD_2, $$InfantryFightingVehicle_BMD_3, $$InfantryFightingVehicle_BMP_1, $$InfantryFightingVehicle_BMP_2, $$InfantryFightingVehicle_BMP_3, $$LAV_105mmTankGun, $$LAV_120mmMortar, $$LAV_25, $$LAV_81mmMortar, $$LAV_Dragonfire, $$LAV_FOGM, $$LAV_III, $$LAV_L, $$LandTransportationWheel, $$Landing_Aircraft, $$LatLongFn, $$LayingMines, $$Leopard2_Dozer, $$Leopard2_Recovery, $$LightTank_AMX13, $$LightTank_M41, $$LightTank_PT76, $$LiquidFuel, $$Loading, $$M1A1AbramsTank, $$M1A2AbramsTank, $$MLRS_9A52_2, $$MLRS_9K51, $$MLRS_9P140, $$MLRS_ASTROS2, $$MLRS_ASTROS2_AV_LMU, $$MLRS_ASTROS2_AV_RMD, $$MLRS_ASTROS2_AV_UCF, $$MLRS_ASTROS2_AV_VCC, $$MilitaryEngagement_Defensive, $$MilitaryEquipment, $$MilitaryEvent, $$MilitaryPerson, $$MilitaryVehicle, $$MinutesDuration, $$Missile_MultipleRocketLauncher, $$ModernMilitaryUnit_Deployable, $$Mortar_2B11, $$Mortar_2B9, $$Mortar_L16, $$Mortar_M120, $$Mortar_M224, $$Mortar_M240, $$Mortar_M252, $$MortarShell_81mm, $$MortarVehicle_M106, $$MortarVehicle_M125, $$MortarVehicle_Urutu_120mm, $$MortarVehicle_Urutu_81mm, $$Movement_TranslationEvent, $$MultipleRocketLauncher, $$North_Generally, $$Northeast_Generally, $$Northwest_Generally, $$Observing, $$OccupyingAnObjective, $$Patrolling_Military, $$PracticingFn, $$PreparingPosition_MilitaryTask, $$ProjectileLauncher_Direct, $$ProjectileLauncher_Indirect, $$ProjectileShell_Gas, $$ProjectileShell_Smoke, $$ProjectileShellAssembly, $$QuotientFn, $$RadarTransmitting, $$RadioBroadcasting, $const201$ReconnaissanceUnit_MilitarySpecia, $$RotaryWingAircraft, $$RoundClosestFn, $const204$SatelliteReconUnit_MilitarySpecia, $$SearchAndClear, $$ShootingByLauncherTypeFn, $const207$SignalInterceptionUnit_MilitarySp, $$South_Generally, $$Southeast_Generally, $$Southwest_Generally, $$Spy, $$Squad_MilitaryEchelon, $$Stationary, $$TakeOff_Flight, $$Tank_Vehicle, $$TimesFn, $$TrackedVehicle, $$TransportViaFn, $$TransportationDevice_Unmanned, $$TransportingPeople, $$Truck_GAZ66, $$Truck_HEMTT, $$Truck_KrAZ_255B, $$Truck_M1070, $$Truck_M1074, $$Truck_M1078, $$Truck_M923, $$Truck_M939, $$Truck_UAZ469, $$Truck_Ural_375D, $$UnblockingTraffic, $$UnitOfRateFn, $$Unloading, $$UnmannedAerialVehicle_10, $$UnmannedAerialVehicle_100, $$UnmannedAerialVehicle_500, $const237$UnmannedAerialVehicle_Reconnaissa, $$UnmannedGroundVehicle_1, $$UnmannedGroundVehicle_2, $$UnmannedGroundVehicle_5, $$Urutu_EngineeringVehicle, $$Urutu_FOGM, $$West_Generally, $$WheeledTransportationDevice, $$WoodedArea, $$concentrationPotentialOfForce, $$concentrationPotentialOfSet, $$concentrationPotentialOfUnit, $$concurrentReportsForUnit, $$cpof_CloseUnits, $$cpof_ColocatedUnits, $$cpof_DeploysEquipmentJointly, $$cpof_ExclusiveToForceInBattle, $$cpof_HighestEchelonAssetInEvent, $$cpof_HighestEchelonLevelOfAssets, $const256$cpof_HighestEchelonLevelOfAssets_, $$cpof_ReportSource, $$cpof_ReportSourceType, $$cpof_ReportSubject, $$cpof_ReportUnit, $$cpof_SitRep, $$cpof_UnitCapabilityEstimate, $$cpof_UnitSizeEstimate, $$deviceHasArmament, $$diameterOfObject, $$equipmentOfUnit_Damaged, $$equipmentOfUnit_Destroyed, $$equipmentOfUnit_Operational, $$firingRangesIntersect_Artillery, $$groupCardinality, $$hasPhysicalPartCount, $$lineOfSight_ObjectToObject, $$lineOfSight_PointToPoint, $const274$locatedAtPoint_SurfaceGeographica, $$locationSearched, $$locationUpdateForUnit, $$objectActedOn, $$objectAttacked, $$objectRemoved, $$officialArmy, $$performedBy, $$possibleReconOnObject, $$projectileTypeInShooting, $const284$rangesIntersect_ReconnaissanceUni, $$rateOfFireOnTarget, $$reportUpdateForUnit, $$sovereignAllegianceOfOrg, $$targetOfShooting, $$transportees, $$unitCasualties_Killed, $$unitCasualties_Missing, $$unitCasualties_Wounded, $$velocityOfObject, $$weaponEffectiveRange_Max, $$weaponEffectiveRange_Min, $$withinRangeOfFire, $$withinRangeOfFire_Set }));
        deflexical("*BBN-EXTERNAL-CONSTANTS*", list(new SubLObject[]{ $$ContactInfoString, $$Date, $$FormalCOC, $$GeographicalRegion, $$GeographicalThing, $$GeopoliticalEntity, $$IntervalOnNumberLine, $$Language, $$MonetaryValue, $$Organization, $$Person, $$PhysicalQuantity, $$PhysiologicalConditionType, $$PositiveInteger, $const312$PotentialBiologicalThreat_BBNEnti, $const313$PotentialChemicalThreat_BBNEntity, $const314$PotentialExplosiveThreat_BBNEntit, $const315$PotentialNuclearThreat_BBNEntityT, $$Product, $$TangibleStuffCompositionType, $$Thing, $$TimeInterval, $$Weapon, $$affiliatedWith, $$basedInRegion, $$children, $$citizens, $$clients, $$controllingSuborganizations, $$equals, $$foundsOrganization, $$geographicalSubRegions, $$geopoliticalSubdivision, $$grandchildren, $$groupMembers, $$hasAgents, $$hasLeaders, $$hasLeadershipPosition, $$hasMembers, $$hasOwnershipIn, $$inTheVicinityOf_Geographical, $$mainRegionOfOperation, $$managesFacility, $$near, $$objectFoundInLocation, $$orgFacilities, $$owns, $$physicalDecompositions, $$physicalQuarters, $$relatives, $$residesInDwelling, $$residesInRegion, $$siblings, $$spouse, $$subordinateOrganizations }));
        deflexical("*MYSENTIENT-EXTERNAL-CONSTANTS*", list($$CyclistsMt, $$TheMySentientSystem, $$ist_Asserted, $$MediumAmountFn, $$Happiness, $$Unhappiness));
        return NIL;
    }

    public static final SubLObject setup_external_code_constants_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$Constant__A_is_not_valid_ = makeString("Constant ~A is not valid.");

    public static final SubLObject $$ATGMLauncher_Milan = constant_handles.reader_make_constant_shell(makeString("ATGMLauncher-Milan"));

    public static final SubLObject $$AVLB_Leopard2 = constant_handles.reader_make_constant_shell(makeString("AVLB-Leopard2"));

    public static final SubLObject $$Agent_PartiallyTangible = constant_handles.reader_make_constant_shell(makeString("Agent-PartiallyTangible"));

    public static final SubLObject $$AirDefenseWeapon = constant_handles.reader_make_constant_shell(makeString("AirDefenseWeapon"));

    public static final SubLObject $$AirTransportationDevice = constant_handles.reader_make_constant_shell(makeString("AirTransportationDevice"));

    public static final SubLObject $$AmphibiousVehicle = constant_handles.reader_make_constant_shell(makeString("AmphibiousVehicle"));

    public static final SubLObject $$AntiAircraftGunSP_Leopard2 = constant_handles.reader_make_constant_shell(makeString("AntiAircraftGunSP-Leopard2"));

    public static final SubLObject $$AntiAircraftGunSP_Urutu = constant_handles.reader_make_constant_shell(makeString("AntiAircraftGunSP-Urutu"));

    public static final SubLObject $$AntiAircraftGunSP_ZSU23_4 = constant_handles.reader_make_constant_shell(makeString("AntiAircraftGunSP-ZSU23-4"));

    public static final SubLObject $$ArmoredCargoCarrier = constant_handles.reader_make_constant_shell(makeString("ArmoredCargoCarrier"));

    public static final SubLObject $$ArmoredCargoCarrier_Leopard2 = constant_handles.reader_make_constant_shell(makeString("ArmoredCargoCarrier-Leopard2"));

    public static final SubLObject $$ArmoredCargoCarrier_Urutu = constant_handles.reader_make_constant_shell(makeString("ArmoredCargoCarrier-Urutu"));

    public static final SubLObject $$ArmoredCommandPostCarrier_M577A3 = constant_handles.reader_make_constant_shell(makeString("ArmoredCommandPostCarrier-M577A3"));

    public static final SubLObject $$ArmoredPersonnelCarrier = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier"));

    public static final SubLObject $$ArmoredPersonnelCarrier_AAVP7A1 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-AAVP7A1"));

    public static final SubLObject $$ArmoredPersonnelCarrier_BTR50 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-BTR50"));

    public static final SubLObject $$ArmoredPersonnelCarrier_BTR60 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-BTR60"));

    public static final SubLObject $$ArmoredPersonnelCarrier_BTR70 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-BTR70"));

    public static final SubLObject $$ArmoredPersonnelCarrier_BTR80 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-BTR80"));

    public static final SubLObject $const20$ArmoredPersonnelCarrier_EE11_Urut = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-EE11-Urutu"));

    public static final SubLObject $$ArmoredPersonnelCarrier_M113 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-M113"));

    public static final SubLObject $$ArmoredPersonnelCarrier_MTLB = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-MTLB"));

    public static final SubLObject $$ArmoredPersonnelCarrier_V150 = constant_handles.reader_make_constant_shell(makeString("ArmoredPersonnelCarrier-V150"));

    public static final SubLObject $$ArmoredReconCarrier = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier"));

    public static final SubLObject $$ArmoredReconCarrier_BRDM2 = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-BRDM2"));

    public static final SubLObject $$ArmoredReconCarrier_BRM1 = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-BRM1"));

    public static final SubLObject $$ArmoredReconCarrier_EE9 = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-EE9"));

    public static final SubLObject $$ArmoredReconCarrier_Fox = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-Fox"));

    public static final SubLObject $$ArmoredReconCarrier_M551 = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-M551"));

    public static final SubLObject $$ArmoredReconCarrier_Sensor_LAV = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-Sensor-LAV"));

    public static final SubLObject $$ArmoredReconCarrier_UAV_LAV = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-UAV-LAV"));

    public static final SubLObject $$ArmoredReconCarrier_Urutu = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-Urutu"));

    public static final SubLObject $$ArmoredReconCarrier_VBC90 = constant_handles.reader_make_constant_shell(makeString("ArmoredReconCarrier-VBC90"));

    public static final SubLObject $$ArtilleryUnit_MilitarySpecialty = constant_handles.reader_make_constant_shell(makeString("ArtilleryUnit-MilitarySpecialty"));

    public static final SubLObject $$Attack_MilitaryOperation = constant_handles.reader_make_constant_shell(makeString("Attack-MilitaryOperation"));

    public static final SubLObject $$BPVI_BackgroundMt = constant_handles.reader_make_constant_shell(makeString("BPVI-BackgroundMt"));

    public static final SubLObject $$BPVI_Country_NorthBluegrass = constant_handles.reader_make_constant_shell(makeString("BPVI-Country-NorthBluegrass"));

    public static final SubLObject $$BPVI_Country_SouthBluegrass = constant_handles.reader_make_constant_shell(makeString("BPVI-Country-SouthBluegrass"));

    public static final SubLObject $$BPVI_HigherIntelligenceUnit_USA = constant_handles.reader_make_constant_shell(makeString("BPVI-HigherIntelligenceUnit-USA"));

    public static final SubLObject $$BattleTank_AMX30 = constant_handles.reader_make_constant_shell(makeString("BattleTank-AMX30"));

    public static final SubLObject $$BattleTank_Leopard2 = constant_handles.reader_make_constant_shell(makeString("BattleTank-Leopard2"));

    public static final SubLObject $$BattleTank_M60A3 = constant_handles.reader_make_constant_shell(makeString("BattleTank-M60A3"));

    public static final SubLObject $$BattleTank_Mk5 = constant_handles.reader_make_constant_shell(makeString("BattleTank-Mk5"));

    public static final SubLObject $$BattleTank_T54 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T54"));

    public static final SubLObject $$BattleTank_T55 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T55"));

    public static final SubLObject $$BattleTank_T62 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T62"));

    public static final SubLObject $$BattleTank_T64 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T64"));

    public static final SubLObject $$BattleTank_T72 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T72"));

    public static final SubLObject $$BattleTank_T80 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T80"));

    public static final SubLObject $$BattleTank_T90 = constant_handles.reader_make_constant_shell(makeString("BattleTank-T90"));

    public static final SubLObject $$BlockingTraffic = constant_handles.reader_make_constant_shell(makeString("BlockingTraffic"));

    public static final SubLObject $$Bomblet_M77 = constant_handles.reader_make_constant_shell(makeString("Bomblet-M77"));

    public static final SubLObject $$BradleyFightingVehicle_M2 = constant_handles.reader_make_constant_shell(makeString("BradleyFightingVehicle-M2"));

    public static final SubLObject $$BradleyFightingVehicle_M3 = constant_handles.reader_make_constant_shell(makeString("BradleyFightingVehicle-M3"));

    public static final SubLObject $$BradleyLinebacker_M6 = constant_handles.reader_make_constant_shell(makeString("BradleyLinebacker-M6"));

    public static final SubLObject $$Brigade_MilitaryEchelon = constant_handles.reader_make_constant_shell(makeString("Brigade-MilitaryEchelon"));

    public static final SubLObject $$BuildingMaterial = constant_handles.reader_make_constant_shell(makeString("BuildingMaterial"));

    public static final SubLObject $const58$CPOF_ChangeOverTimeQueryMicrotheo = constant_handles.reader_make_constant_shell(makeString("CPOF-ChangeOverTimeQueryMicrotheory"));

    public static final SubLObject $$CPOF_CurrentStateQueryMt = constant_handles.reader_make_constant_shell(makeString("CPOF-CurrentStateQueryMt"));

    public static final SubLObject $$CPOF_EquipmentClassificationType = constant_handles.reader_make_constant_shell(makeString("CPOF-EquipmentClassificationType"));

    public static final SubLObject $$CPOF_QueryMt = constant_handles.reader_make_constant_shell(makeString("CPOF-QueryMt"));

    public static final SubLObject $$CPOF_SitRepMtFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SitRepMtFn"));

    public static final SubLObject $$CPOF_SitRepObjectFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SitRepObjectFn"));

    public static final SubLObject $$CPOF_SitRepSourceFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SitRepSourceFn"));

    public static final SubLObject $$CPOF_SitRepSubjectFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SitRepSubjectFn"));

    public static final SubLObject $$CPOF_SpotReportObjectFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SpotReportObjectFn"));

    public static final SubLObject $$CPOF_SpotReportSourceFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SpotReportSourceFn"));

    public static final SubLObject $$CPOF_SpotReportSubjectFn = constant_handles.reader_make_constant_shell(makeString("CPOF-SpotReportSubjectFn"));

    public static final SubLObject $const69$CPOF_UnitSpecialtyClassificationT = constant_handles.reader_make_constant_shell(makeString("CPOF-UnitSpecialtyClassificationType"));

    public static final SubLObject $$Can = constant_handles.reader_make_constant_shell(makeString("Can"));

    public static final SubLObject $$Civilian = constant_handles.reader_make_constant_shell(makeString("Civilian"));

    public static final SubLObject $$ClusterMunition_Artillery = constant_handles.reader_make_constant_shell(makeString("ClusterMunition-Artillery"));

    public static final SubLObject $$CombatEngineeringVehicle = constant_handles.reader_make_constant_shell(makeString("CombatEngineeringVehicle"));

    public static final SubLObject $$CombatEngineeringVehicle_M728 = constant_handles.reader_make_constant_shell(makeString("CombatEngineeringVehicle-M728"));

    public static final SubLObject $$Constructing = constant_handles.reader_make_constant_shell(makeString("Constructing"));

    public static final SubLObject $$ConstructionArtifact = constant_handles.reader_make_constant_shell(makeString("ConstructionArtifact"));

    public static final SubLObject $$ContainedProductTypeFn = constant_handles.reader_make_constant_shell(makeString("ContainedProductTypeFn"));

    public static final SubLObject $$ConveyFn = constant_handles.reader_make_constant_shell(makeString("ConveyFn"));

    public static final SubLObject $const79$CounterArtilleryUnit_MilitarySpec = constant_handles.reader_make_constant_shell(makeString("CounterArtilleryUnit-MilitarySpecialty"));

    public static final SubLObject $$Crate = constant_handles.reader_make_constant_shell(makeString("Crate"));

    public static final SubLObject $$Degree_UnitOfAngularMeasure = constant_handles.reader_make_constant_shell(makeString("Degree-UnitOfAngularMeasure"));

    public static final SubLObject $$DestructionFn = constant_handles.reader_make_constant_shell(makeString("DestructionFn"));

    public static final SubLObject $$DiggingAHole = constant_handles.reader_make_constant_shell(makeString("DiggingAHole"));

    public static final SubLObject $$DisengagingFromCombat = constant_handles.reader_make_constant_shell(makeString("DisengagingFromCombat"));

    public static final SubLObject $$Division_MilitaryEchelon = constant_handles.reader_make_constant_shell(makeString("Division-MilitaryEchelon"));

    public static final SubLObject $$EarthMovingEquipment_Military = constant_handles.reader_make_constant_shell(makeString("EarthMovingEquipment-Military"));

    public static final SubLObject $$East_Generally = constant_handles.reader_make_constant_shell(makeString("East-Generally"));

    public static final SubLObject $$Engagement_Military = constant_handles.reader_make_constant_shell(makeString("Engagement-Military"));

    public static final SubLObject $$FOG_M_Polyphem = constant_handles.reader_make_constant_shell(makeString("FOG-M-Polyphem"));

    public static final SubLObject $$FieldArtillery = constant_handles.reader_make_constant_shell(makeString("FieldArtillery"));

    public static final SubLObject $$FiveTonTruck_Refueler = constant_handles.reader_make_constant_shell(makeString("FiveTonTruck-Refueler"));

    public static final SubLObject $$FiveTonTruck_Standard = constant_handles.reader_make_constant_shell(makeString("FiveTonTruck-Standard"));

    public static final SubLObject $$FixedWingAircraft = constant_handles.reader_make_constant_shell(makeString("FixedWingAircraft"));

    public static final SubLObject $$FixingAnEnemy = constant_handles.reader_make_constant_shell(makeString("FixingAnEnemy"));

    public static final SubLObject $$FlameThrowingTank_Leopard2 = constant_handles.reader_make_constant_shell(makeString("FlameThrowingTank-Leopard2"));

    public static final SubLObject $$FoodOrDrink = constant_handles.reader_make_constant_shell(makeString("FoodOrDrink"));

    public static final SubLObject $$GroupFn = constant_handles.reader_make_constant_shell(makeString("GroupFn"));

    public static final SubLObject $$HalfTrackVehicle = constant_handles.reader_make_constant_shell(makeString("HalfTrackVehicle"));

    public static final SubLObject $$Hearing = constant_handles.reader_make_constant_shell(makeString("Hearing"));

    public static final SubLObject $$Helicopter = constant_handles.reader_make_constant_shell(makeString("Helicopter"));

    public static final SubLObject $$Helicopter_AS332 = constant_handles.reader_make_constant_shell(makeString("Helicopter-AS332"));

    public static final SubLObject $$Helicopter_AS565 = constant_handles.reader_make_constant_shell(makeString("Helicopter-AS565"));

    public static final SubLObject $$Howitzer_105mmTowed = constant_handles.reader_make_constant_shell(makeString("Howitzer-105mmTowed"));

    public static final SubLObject $$Howitzer_122mmSelfPropelled = constant_handles.reader_make_constant_shell(makeString("Howitzer-122mmSelfPropelled"));

    public static final SubLObject $$Howitzer_122mmTowed = constant_handles.reader_make_constant_shell(makeString("Howitzer-122mmTowed"));

    public static final SubLObject $$Howitzer_130mmTowed = constant_handles.reader_make_constant_shell(makeString("Howitzer-130mmTowed"));

    public static final SubLObject $$Howitzer_152mmTowed = constant_handles.reader_make_constant_shell(makeString("Howitzer-152mmTowed"));

    public static final SubLObject $$Howitzer_155mmSP_Standard = constant_handles.reader_make_constant_shell(makeString("Howitzer-155mmSP-Standard"));

    public static final SubLObject $$Howitzer_2A65 = constant_handles.reader_make_constant_shell(makeString("Howitzer-2A65"));

    public static final SubLObject $$Howitzer_2S19 = constant_handles.reader_make_constant_shell(makeString("Howitzer-2S19"));

    public static final SubLObject $$Howitzer_2S3 = constant_handles.reader_make_constant_shell(makeString("Howitzer-2S3"));

    public static final SubLObject $$Howitzer_AUF1 = constant_handles.reader_make_constant_shell(makeString("Howitzer-AUF1"));

    public static final SubLObject $$Howitzer_D20 = constant_handles.reader_make_constant_shell(makeString("Howitzer-D20"));

    public static final SubLObject $$Howitzer_D30 = constant_handles.reader_make_constant_shell(makeString("Howitzer-D30"));

    public static final SubLObject $$Howitzer_M101 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M101"));

    public static final SubLObject $$Howitzer_M102 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M102"));

    public static final SubLObject $$Howitzer_M108 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M108"));

    public static final SubLObject $$Howitzer_M109 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M109"));

    public static final SubLObject $$Howitzer_M109A6 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M109A6"));

    public static final SubLObject $$Howitzer_M119A1 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M119A1"));

    public static final SubLObject $$Howitzer_M198 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M198"));

    public static final SubLObject $$Howitzer_M46 = constant_handles.reader_make_constant_shell(makeString("Howitzer-M46"));

    public static final SubLObject $$HowitzerShell = constant_handles.reader_make_constant_shell(makeString("HowitzerShell"));

    public static final SubLObject $$Humvee = constant_handles.reader_make_constant_shell(makeString("Humvee"));

    public static final SubLObject $$IFV_Leopard2 = constant_handles.reader_make_constant_shell(makeString("IFV-Leopard2"));

    public static final SubLObject $$IndirectFireWeapon = constant_handles.reader_make_constant_shell(makeString("IndirectFireWeapon"));

    public static final SubLObject $$InfantryFightingVehicle_AMX10P = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-AMX10P"));

    public static final SubLObject $$InfantryFightingVehicle_BMD_1 = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-BMD-1"));

    public static final SubLObject $$InfantryFightingVehicle_BMD_2 = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-BMD-2"));

    public static final SubLObject $$InfantryFightingVehicle_BMD_3 = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-BMD-3"));

    public static final SubLObject $$InfantryFightingVehicle_BMP_1 = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-BMP-1"));

    public static final SubLObject $$InfantryFightingVehicle_BMP_2 = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-BMP-2"));

    public static final SubLObject $$InfantryFightingVehicle_BMP_3 = constant_handles.reader_make_constant_shell(makeString("InfantryFightingVehicle-BMP-3"));

    public static final SubLObject $$LAV_105mmTankGun = constant_handles.reader_make_constant_shell(makeString("LAV-105mmTankGun"));

    public static final SubLObject $$LAV_120mmMortar = constant_handles.reader_make_constant_shell(makeString("LAV-120mmMortar"));

    public static final SubLObject $$LAV_25 = constant_handles.reader_make_constant_shell(makeString("LAV-25"));

    public static final SubLObject $$LAV_81mmMortar = constant_handles.reader_make_constant_shell(makeString("LAV-81mmMortar"));

    public static final SubLObject $$LAV_Dragonfire = constant_handles.reader_make_constant_shell(makeString("LAV-Dragonfire"));

    public static final SubLObject $$LAV_FOGM = constant_handles.reader_make_constant_shell(makeString("LAV-FOGM"));

    public static final SubLObject $$LAV_III = constant_handles.reader_make_constant_shell(makeString("LAV-III"));

    public static final SubLObject $$LAV_L = constant_handles.reader_make_constant_shell(makeString("LAV-L"));

    public static final SubLObject $$LandTransportationWheel = constant_handles.reader_make_constant_shell(makeString("LandTransportationWheel"));

    public static final SubLObject $$Landing_Aircraft = constant_handles.reader_make_constant_shell(makeString("Landing-Aircraft"));

    public static final SubLObject $$LatLongFn = constant_handles.reader_make_constant_shell(makeString("LatLongFn"));

    public static final SubLObject $$LayingMines = constant_handles.reader_make_constant_shell(makeString("LayingMines"));

    public static final SubLObject $$Leopard2_Dozer = constant_handles.reader_make_constant_shell(makeString("Leopard2-Dozer"));

    public static final SubLObject $$Leopard2_Recovery = constant_handles.reader_make_constant_shell(makeString("Leopard2-Recovery"));

    public static final SubLObject $$LightTank_AMX13 = constant_handles.reader_make_constant_shell(makeString("LightTank-AMX13"));

    public static final SubLObject $$LightTank_M41 = constant_handles.reader_make_constant_shell(makeString("LightTank-M41"));

    public static final SubLObject $$LightTank_PT76 = constant_handles.reader_make_constant_shell(makeString("LightTank-PT76"));

    public static final SubLObject $$LiquidFuel = constant_handles.reader_make_constant_shell(makeString("LiquidFuel"));

    public static final SubLObject $$Loading = constant_handles.reader_make_constant_shell(makeString("Loading"));

    public static final SubLObject $$M1A1AbramsTank = constant_handles.reader_make_constant_shell(makeString("M1A1AbramsTank"));

    public static final SubLObject $$M1A2AbramsTank = constant_handles.reader_make_constant_shell(makeString("M1A2AbramsTank"));

    public static final SubLObject $$MLRS_9A52_2 = constant_handles.reader_make_constant_shell(makeString("MLRS-9A52-2"));

    public static final SubLObject $$MLRS_9K51 = constant_handles.reader_make_constant_shell(makeString("MLRS-9K51"));

    public static final SubLObject $$MLRS_9P140 = constant_handles.reader_make_constant_shell(makeString("MLRS-9P140"));

    public static final SubLObject $$MLRS_ASTROS2 = constant_handles.reader_make_constant_shell(makeString("MLRS-ASTROS2"));

    public static final SubLObject $$MLRS_ASTROS2_AV_LMU = constant_handles.reader_make_constant_shell(makeString("MLRS-ASTROS2-AV-LMU"));

    public static final SubLObject $$MLRS_ASTROS2_AV_RMD = constant_handles.reader_make_constant_shell(makeString("MLRS-ASTROS2-AV-RMD"));

    public static final SubLObject $$MLRS_ASTROS2_AV_UCF = constant_handles.reader_make_constant_shell(makeString("MLRS-ASTROS2-AV-UCF"));

    public static final SubLObject $$MLRS_ASTROS2_AV_VCC = constant_handles.reader_make_constant_shell(makeString("MLRS-ASTROS2-AV-VCC"));

    public static final SubLObject $$MilitaryEngagement_Defensive = constant_handles.reader_make_constant_shell(makeString("MilitaryEngagement-Defensive"));

    public static final SubLObject $$MilitaryEquipment = constant_handles.reader_make_constant_shell(makeString("MilitaryEquipment"));

    public static final SubLObject $$MilitaryEvent = constant_handles.reader_make_constant_shell(makeString("MilitaryEvent"));

    public static final SubLObject $$MilitaryPerson = constant_handles.reader_make_constant_shell(makeString("MilitaryPerson"));

    public static final SubLObject $$MilitaryVehicle = constant_handles.reader_make_constant_shell(makeString("MilitaryVehicle"));

    public static final SubLObject $$MinutesDuration = constant_handles.reader_make_constant_shell(makeString("MinutesDuration"));

    public static final SubLObject $$Missile_MultipleRocketLauncher = constant_handles.reader_make_constant_shell(makeString("Missile-MultipleRocketLauncher"));

    public static final SubLObject $$ModernMilitaryUnit_Deployable = constant_handles.reader_make_constant_shell(makeString("ModernMilitaryUnit-Deployable"));

    public static final SubLObject $$Mortar_2B11 = constant_handles.reader_make_constant_shell(makeString("Mortar-2B11"));

    public static final SubLObject $$Mortar_2B9 = constant_handles.reader_make_constant_shell(makeString("Mortar-2B9"));

    public static final SubLObject $$Mortar_L16 = constant_handles.reader_make_constant_shell(makeString("Mortar-L16"));

    public static final SubLObject $$Mortar_M120 = constant_handles.reader_make_constant_shell(makeString("Mortar-M120"));

    public static final SubLObject $$Mortar_M224 = constant_handles.reader_make_constant_shell(makeString("Mortar-M224"));

    public static final SubLObject $$Mortar_M240 = constant_handles.reader_make_constant_shell(makeString("Mortar-M240"));

    public static final SubLObject $$Mortar_M252 = constant_handles.reader_make_constant_shell(makeString("Mortar-M252"));

    public static final SubLObject $$MortarShell_81mm = constant_handles.reader_make_constant_shell(makeString("MortarShell-81mm"));

    public static final SubLObject $$MortarVehicle_M106 = constant_handles.reader_make_constant_shell(makeString("MortarVehicle-M106"));

    public static final SubLObject $$MortarVehicle_M125 = constant_handles.reader_make_constant_shell(makeString("MortarVehicle-M125"));

    public static final SubLObject $$MortarVehicle_Urutu_120mm = constant_handles.reader_make_constant_shell(makeString("MortarVehicle-Urutu-120mm"));

    public static final SubLObject $$MortarVehicle_Urutu_81mm = constant_handles.reader_make_constant_shell(makeString("MortarVehicle-Urutu-81mm"));

    public static final SubLObject $$Movement_TranslationEvent = constant_handles.reader_make_constant_shell(makeString("Movement-TranslationEvent"));

    public static final SubLObject $$MultipleRocketLauncher = constant_handles.reader_make_constant_shell(makeString("MultipleRocketLauncher"));

    public static final SubLObject $$North_Generally = constant_handles.reader_make_constant_shell(makeString("North-Generally"));

    public static final SubLObject $$Northeast_Generally = constant_handles.reader_make_constant_shell(makeString("Northeast-Generally"));

    public static final SubLObject $$Northwest_Generally = constant_handles.reader_make_constant_shell(makeString("Northwest-Generally"));

    public static final SubLObject $$Observing = constant_handles.reader_make_constant_shell(makeString("Observing"));

    public static final SubLObject $$OccupyingAnObjective = constant_handles.reader_make_constant_shell(makeString("OccupyingAnObjective"));

    public static final SubLObject $$Patrolling_Military = constant_handles.reader_make_constant_shell(makeString("Patrolling-Military"));

    public static final SubLObject $$PracticingFn = constant_handles.reader_make_constant_shell(makeString("PracticingFn"));

    public static final SubLObject $$PreparingPosition_MilitaryTask = constant_handles.reader_make_constant_shell(makeString("PreparingPosition-MilitaryTask"));

    public static final SubLObject $$ProjectileLauncher_Direct = constant_handles.reader_make_constant_shell(makeString("ProjectileLauncher-Direct"));

    public static final SubLObject $$ProjectileLauncher_Indirect = constant_handles.reader_make_constant_shell(makeString("ProjectileLauncher-Indirect"));

    public static final SubLObject $$ProjectileShell_Gas = constant_handles.reader_make_constant_shell(makeString("ProjectileShell-Gas"));

    public static final SubLObject $$ProjectileShell_Smoke = constant_handles.reader_make_constant_shell(makeString("ProjectileShell-Smoke"));

    public static final SubLObject $$ProjectileShellAssembly = constant_handles.reader_make_constant_shell(makeString("ProjectileShellAssembly"));

    public static final SubLObject $$QuotientFn = constant_handles.reader_make_constant_shell(makeString("QuotientFn"));

    public static final SubLObject $$RadarTransmitting = constant_handles.reader_make_constant_shell(makeString("RadarTransmitting"));

    public static final SubLObject $$RadioBroadcasting = constant_handles.reader_make_constant_shell(makeString("RadioBroadcasting"));

    public static final SubLObject $const201$ReconnaissanceUnit_MilitarySpecia = constant_handles.reader_make_constant_shell(makeString("ReconnaissanceUnit-MilitarySpecialty"));

    public static final SubLObject $$RotaryWingAircraft = constant_handles.reader_make_constant_shell(makeString("RotaryWingAircraft"));

    public static final SubLObject $$RoundClosestFn = constant_handles.reader_make_constant_shell(makeString("RoundClosestFn"));

    public static final SubLObject $const204$SatelliteReconUnit_MilitarySpecia = constant_handles.reader_make_constant_shell(makeString("SatelliteReconUnit-MilitarySpecialty"));

    public static final SubLObject $$SearchAndClear = constant_handles.reader_make_constant_shell(makeString("SearchAndClear"));

    public static final SubLObject $$ShootingByLauncherTypeFn = constant_handles.reader_make_constant_shell(makeString("ShootingByLauncherTypeFn"));

    public static final SubLObject $const207$SignalInterceptionUnit_MilitarySp = constant_handles.reader_make_constant_shell(makeString("SignalInterceptionUnit-MilitarySpecialty"));

    public static final SubLObject $$South_Generally = constant_handles.reader_make_constant_shell(makeString("South-Generally"));

    public static final SubLObject $$Southeast_Generally = constant_handles.reader_make_constant_shell(makeString("Southeast-Generally"));

    public static final SubLObject $$Southwest_Generally = constant_handles.reader_make_constant_shell(makeString("Southwest-Generally"));

    public static final SubLObject $$Spy = constant_handles.reader_make_constant_shell(makeString("Spy"));

    public static final SubLObject $$Squad_MilitaryEchelon = constant_handles.reader_make_constant_shell(makeString("Squad-MilitaryEchelon"));

    public static final SubLObject $$Stationary = constant_handles.reader_make_constant_shell(makeString("Stationary"));

    public static final SubLObject $$TakeOff_Flight = constant_handles.reader_make_constant_shell(makeString("TakeOff-Flight"));

    public static final SubLObject $$Tank_Vehicle = constant_handles.reader_make_constant_shell(makeString("Tank-Vehicle"));

    public static final SubLObject $$TimesFn = constant_handles.reader_make_constant_shell(makeString("TimesFn"));

    public static final SubLObject $$TrackedVehicle = constant_handles.reader_make_constant_shell(makeString("TrackedVehicle"));

    public static final SubLObject $$TransportViaFn = constant_handles.reader_make_constant_shell(makeString("TransportViaFn"));

    public static final SubLObject $$TransportationDevice_Unmanned = constant_handles.reader_make_constant_shell(makeString("TransportationDevice-Unmanned"));

    public static final SubLObject $$TransportingPeople = constant_handles.reader_make_constant_shell(makeString("TransportingPeople"));

    public static final SubLObject $$Truck_GAZ66 = constant_handles.reader_make_constant_shell(makeString("Truck-GAZ66"));

    public static final SubLObject $$Truck_HEMTT = constant_handles.reader_make_constant_shell(makeString("Truck-HEMTT"));

    public static final SubLObject $$Truck_KrAZ_255B = constant_handles.reader_make_constant_shell(makeString("Truck-KrAZ-255B"));

    public static final SubLObject $$Truck_M1070 = constant_handles.reader_make_constant_shell(makeString("Truck-M1070"));

    public static final SubLObject $$Truck_M1074 = constant_handles.reader_make_constant_shell(makeString("Truck-M1074"));

    public static final SubLObject $$Truck_M1078 = constant_handles.reader_make_constant_shell(makeString("Truck-M1078"));

    public static final SubLObject $$Truck_M923 = constant_handles.reader_make_constant_shell(makeString("Truck-M923"));

    public static final SubLObject $$Truck_M939 = constant_handles.reader_make_constant_shell(makeString("Truck-M939"));

    public static final SubLObject $$Truck_UAZ469 = constant_handles.reader_make_constant_shell(makeString("Truck-UAZ469"));

    public static final SubLObject $$Truck_Ural_375D = constant_handles.reader_make_constant_shell(makeString("Truck-Ural-375D"));

    public static final SubLObject $$UnblockingTraffic = constant_handles.reader_make_constant_shell(makeString("UnblockingTraffic"));

    public static final SubLObject $$UnitOfRateFn = constant_handles.reader_make_constant_shell(makeString("UnitOfRateFn"));

    public static final SubLObject $$Unloading = constant_handles.reader_make_constant_shell(makeString("Unloading"));

    public static final SubLObject $$UnmannedAerialVehicle_10 = constant_handles.reader_make_constant_shell(makeString("UnmannedAerialVehicle-10"));

    public static final SubLObject $$UnmannedAerialVehicle_100 = constant_handles.reader_make_constant_shell(makeString("UnmannedAerialVehicle-100"));

    public static final SubLObject $$UnmannedAerialVehicle_500 = constant_handles.reader_make_constant_shell(makeString("UnmannedAerialVehicle-500"));

    public static final SubLObject $const237$UnmannedAerialVehicle_Reconnaissa = constant_handles.reader_make_constant_shell(makeString("UnmannedAerialVehicle-Reconnaissance"));

    public static final SubLObject $$UnmannedGroundVehicle_1 = constant_handles.reader_make_constant_shell(makeString("UnmannedGroundVehicle-1"));

    public static final SubLObject $$UnmannedGroundVehicle_2 = constant_handles.reader_make_constant_shell(makeString("UnmannedGroundVehicle-2"));

    public static final SubLObject $$UnmannedGroundVehicle_5 = constant_handles.reader_make_constant_shell(makeString("UnmannedGroundVehicle-5"));

    public static final SubLObject $$Urutu_EngineeringVehicle = constant_handles.reader_make_constant_shell(makeString("Urutu-EngineeringVehicle"));

    public static final SubLObject $$Urutu_FOGM = constant_handles.reader_make_constant_shell(makeString("Urutu-FOGM"));

    public static final SubLObject $$West_Generally = constant_handles.reader_make_constant_shell(makeString("West-Generally"));

    public static final SubLObject $$WheeledTransportationDevice = constant_handles.reader_make_constant_shell(makeString("WheeledTransportationDevice"));

    public static final SubLObject $$WoodedArea = constant_handles.reader_make_constant_shell(makeString("WoodedArea"));

    public static final SubLObject $$concentrationPotentialOfForce = constant_handles.reader_make_constant_shell(makeString("concentrationPotentialOfForce"));

    public static final SubLObject $$concentrationPotentialOfSet = constant_handles.reader_make_constant_shell(makeString("concentrationPotentialOfSet"));

    public static final SubLObject $$concentrationPotentialOfUnit = constant_handles.reader_make_constant_shell(makeString("concentrationPotentialOfUnit"));

    public static final SubLObject $$concurrentReportsForUnit = constant_handles.reader_make_constant_shell(makeString("concurrentReportsForUnit"));

    public static final SubLObject $$cpof_CloseUnits = constant_handles.reader_make_constant_shell(makeString("cpof-CloseUnits"));

    public static final SubLObject $$cpof_ColocatedUnits = constant_handles.reader_make_constant_shell(makeString("cpof-ColocatedUnits"));

    public static final SubLObject $$cpof_DeploysEquipmentJointly = constant_handles.reader_make_constant_shell(makeString("cpof-DeploysEquipmentJointly"));

    public static final SubLObject $$cpof_ExclusiveToForceInBattle = constant_handles.reader_make_constant_shell(makeString("cpof-ExclusiveToForceInBattle"));

    public static final SubLObject $$cpof_HighestEchelonAssetInEvent = constant_handles.reader_make_constant_shell(makeString("cpof-HighestEchelonAssetInEvent"));

    public static final SubLObject $$cpof_HighestEchelonLevelOfAssets = constant_handles.reader_make_constant_shell(makeString("cpof-HighestEchelonLevelOfAssets"));

    public static final SubLObject $const256$cpof_HighestEchelonLevelOfAssets_ = constant_handles.reader_make_constant_shell(makeString("cpof-HighestEchelonLevelOfAssets-Set"));

    public static final SubLObject $$cpof_ReportSource = constant_handles.reader_make_constant_shell(makeString("cpof-ReportSource"));

    public static final SubLObject $$cpof_ReportSourceType = constant_handles.reader_make_constant_shell(makeString("cpof-ReportSourceType"));

    public static final SubLObject $$cpof_ReportSubject = constant_handles.reader_make_constant_shell(makeString("cpof-ReportSubject"));

    public static final SubLObject $$cpof_ReportUnit = constant_handles.reader_make_constant_shell(makeString("cpof-ReportUnit"));

    public static final SubLObject $$cpof_SitRep = constant_handles.reader_make_constant_shell(makeString("cpof-SitRep"));

    public static final SubLObject $$cpof_UnitCapabilityEstimate = constant_handles.reader_make_constant_shell(makeString("cpof-UnitCapabilityEstimate"));

    public static final SubLObject $$cpof_UnitSizeEstimate = constant_handles.reader_make_constant_shell(makeString("cpof-UnitSizeEstimate"));

    public static final SubLObject $$deviceHasArmament = constant_handles.reader_make_constant_shell(makeString("deviceHasArmament"));

    public static final SubLObject $$diameterOfObject = constant_handles.reader_make_constant_shell(makeString("diameterOfObject"));

    public static final SubLObject $$equipmentOfUnit_Damaged = constant_handles.reader_make_constant_shell(makeString("equipmentOfUnit-Damaged"));

    public static final SubLObject $$equipmentOfUnit_Destroyed = constant_handles.reader_make_constant_shell(makeString("equipmentOfUnit-Destroyed"));

    public static final SubLObject $$equipmentOfUnit_Operational = constant_handles.reader_make_constant_shell(makeString("equipmentOfUnit-Operational"));

    public static final SubLObject $$firingRangesIntersect_Artillery = constant_handles.reader_make_constant_shell(makeString("firingRangesIntersect-Artillery"));

    public static final SubLObject $$groupCardinality = constant_handles.reader_make_constant_shell(makeString("groupCardinality"));

    public static final SubLObject $$hasPhysicalPartCount = constant_handles.reader_make_constant_shell(makeString("hasPhysicalPartCount"));

    public static final SubLObject $$lineOfSight_ObjectToObject = constant_handles.reader_make_constant_shell(makeString("lineOfSight-ObjectToObject"));

    public static final SubLObject $$lineOfSight_PointToPoint = constant_handles.reader_make_constant_shell(makeString("lineOfSight-PointToPoint"));

    public static final SubLObject $const274$locatedAtPoint_SurfaceGeographica = constant_handles.reader_make_constant_shell(makeString("locatedAtPoint-SurfaceGeographical"));

    public static final SubLObject $$locationSearched = constant_handles.reader_make_constant_shell(makeString("locationSearched"));

    public static final SubLObject $$locationUpdateForUnit = constant_handles.reader_make_constant_shell(makeString("locationUpdateForUnit"));

    public static final SubLObject $$objectActedOn = constant_handles.reader_make_constant_shell(makeString("objectActedOn"));

    public static final SubLObject $$objectAttacked = constant_handles.reader_make_constant_shell(makeString("objectAttacked"));

    public static final SubLObject $$objectRemoved = constant_handles.reader_make_constant_shell(makeString("objectRemoved"));

    public static final SubLObject $$officialArmy = constant_handles.reader_make_constant_shell(makeString("officialArmy"));

    public static final SubLObject $$performedBy = constant_handles.reader_make_constant_shell(makeString("performedBy"));

    public static final SubLObject $$possibleReconOnObject = constant_handles.reader_make_constant_shell(makeString("possibleReconOnObject"));

    public static final SubLObject $$projectileTypeInShooting = constant_handles.reader_make_constant_shell(makeString("projectileTypeInShooting"));

    public static final SubLObject $const284$rangesIntersect_ReconnaissanceUni = constant_handles.reader_make_constant_shell(makeString("rangesIntersect-ReconnaissanceUnits"));

    public static final SubLObject $$rateOfFireOnTarget = constant_handles.reader_make_constant_shell(makeString("rateOfFireOnTarget"));

    public static final SubLObject $$reportUpdateForUnit = constant_handles.reader_make_constant_shell(makeString("reportUpdateForUnit"));

    public static final SubLObject $$sovereignAllegianceOfOrg = constant_handles.reader_make_constant_shell(makeString("sovereignAllegianceOfOrg"));

    public static final SubLObject $$targetOfShooting = constant_handles.reader_make_constant_shell(makeString("targetOfShooting"));

    public static final SubLObject $$transportees = constant_handles.reader_make_constant_shell(makeString("transportees"));

    public static final SubLObject $$unitCasualties_Killed = constant_handles.reader_make_constant_shell(makeString("unitCasualties-Killed"));

    public static final SubLObject $$unitCasualties_Missing = constant_handles.reader_make_constant_shell(makeString("unitCasualties-Missing"));

    public static final SubLObject $$unitCasualties_Wounded = constant_handles.reader_make_constant_shell(makeString("unitCasualties-Wounded"));

    public static final SubLObject $$velocityOfObject = constant_handles.reader_make_constant_shell(makeString("velocityOfObject"));

    public static final SubLObject $$weaponEffectiveRange_Max = constant_handles.reader_make_constant_shell(makeString("weaponEffectiveRange-Max"));

    public static final SubLObject $$weaponEffectiveRange_Min = constant_handles.reader_make_constant_shell(makeString("weaponEffectiveRange-Min"));

    public static final SubLObject $$withinRangeOfFire = constant_handles.reader_make_constant_shell(makeString("withinRangeOfFire"));

    public static final SubLObject $$withinRangeOfFire_Set = constant_handles.reader_make_constant_shell(makeString("withinRangeOfFire-Set"));

    public static final SubLObject $$ContactInfoString = constant_handles.reader_make_constant_shell(makeString("ContactInfoString"));

    public static final SubLObject $$Date = constant_handles.reader_make_constant_shell(makeString("Date"));

    public static final SubLObject $$FormalCOC = constant_handles.reader_make_constant_shell(makeString("FormalCOC"));

    public static final SubLObject $$GeographicalRegion = constant_handles.reader_make_constant_shell(makeString("GeographicalRegion"));

    public static final SubLObject $$GeographicalThing = constant_handles.reader_make_constant_shell(makeString("GeographicalThing"));

    public static final SubLObject $$GeopoliticalEntity = constant_handles.reader_make_constant_shell(makeString("GeopoliticalEntity"));

    public static final SubLObject $$IntervalOnNumberLine = constant_handles.reader_make_constant_shell(makeString("IntervalOnNumberLine"));

    public static final SubLObject $$Language = constant_handles.reader_make_constant_shell(makeString("Language"));

    public static final SubLObject $$MonetaryValue = constant_handles.reader_make_constant_shell(makeString("MonetaryValue"));

    public static final SubLObject $$Organization = constant_handles.reader_make_constant_shell(makeString("Organization"));

    public static final SubLObject $$Person = constant_handles.reader_make_constant_shell(makeString("Person"));

    public static final SubLObject $$PhysicalQuantity = constant_handles.reader_make_constant_shell(makeString("PhysicalQuantity"));

    public static final SubLObject $$PhysiologicalConditionType = constant_handles.reader_make_constant_shell(makeString("PhysiologicalConditionType"));

    public static final SubLObject $$PositiveInteger = constant_handles.reader_make_constant_shell(makeString("PositiveInteger"));

    public static final SubLObject $const312$PotentialBiologicalThreat_BBNEnti = constant_handles.reader_make_constant_shell(makeString("PotentialBiologicalThreat-BBNEntityType"));

    public static final SubLObject $const313$PotentialChemicalThreat_BBNEntity = constant_handles.reader_make_constant_shell(makeString("PotentialChemicalThreat-BBNEntityType"));

    public static final SubLObject $const314$PotentialExplosiveThreat_BBNEntit = constant_handles.reader_make_constant_shell(makeString("PotentialExplosiveThreat-BBNEntityType"));

    public static final SubLObject $const315$PotentialNuclearThreat_BBNEntityT = constant_handles.reader_make_constant_shell(makeString("PotentialNuclearThreat-BBNEntityType"));

    public static final SubLObject $$Product = constant_handles.reader_make_constant_shell(makeString("Product"));

    public static final SubLObject $$TangibleStuffCompositionType = constant_handles.reader_make_constant_shell(makeString("TangibleStuffCompositionType"));

    public static final SubLObject $$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));

    public static final SubLObject $$TimeInterval = constant_handles.reader_make_constant_shell(makeString("TimeInterval"));

    public static final SubLObject $$Weapon = constant_handles.reader_make_constant_shell(makeString("Weapon"));

    public static final SubLObject $$affiliatedWith = constant_handles.reader_make_constant_shell(makeString("affiliatedWith"));

    public static final SubLObject $$basedInRegion = constant_handles.reader_make_constant_shell(makeString("basedInRegion"));

    public static final SubLObject $$children = constant_handles.reader_make_constant_shell(makeString("children"));

    public static final SubLObject $$citizens = constant_handles.reader_make_constant_shell(makeString("citizens"));

    public static final SubLObject $$clients = constant_handles.reader_make_constant_shell(makeString("clients"));

    public static final SubLObject $$controllingSuborganizations = constant_handles.reader_make_constant_shell(makeString("controllingSuborganizations"));

    public static final SubLObject $$equals = constant_handles.reader_make_constant_shell(makeString("equals"));

    public static final SubLObject $$foundsOrganization = constant_handles.reader_make_constant_shell(makeString("foundsOrganization"));

    public static final SubLObject $$geographicalSubRegions = constant_handles.reader_make_constant_shell(makeString("geographicalSubRegions"));

    public static final SubLObject $$geopoliticalSubdivision = constant_handles.reader_make_constant_shell(makeString("geopoliticalSubdivision"));

    public static final SubLObject $$grandchildren = constant_handles.reader_make_constant_shell(makeString("grandchildren"));

    public static final SubLObject $$groupMembers = constant_handles.reader_make_constant_shell(makeString("groupMembers"));

    public static final SubLObject $$hasAgents = constant_handles.reader_make_constant_shell(makeString("hasAgents"));

    public static final SubLObject $$hasLeaders = constant_handles.reader_make_constant_shell(makeString("hasLeaders"));

    public static final SubLObject $$hasLeadershipPosition = constant_handles.reader_make_constant_shell(makeString("hasLeadershipPosition"));

    public static final SubLObject $$hasMembers = constant_handles.reader_make_constant_shell(makeString("hasMembers"));

    public static final SubLObject $$hasOwnershipIn = constant_handles.reader_make_constant_shell(makeString("hasOwnershipIn"));

    public static final SubLObject $$inTheVicinityOf_Geographical = constant_handles.reader_make_constant_shell(makeString("inTheVicinityOf-Geographical"));

    public static final SubLObject $$mainRegionOfOperation = constant_handles.reader_make_constant_shell(makeString("mainRegionOfOperation"));

    public static final SubLObject $$managesFacility = constant_handles.reader_make_constant_shell(makeString("managesFacility"));

    public static final SubLObject $$near = constant_handles.reader_make_constant_shell(makeString("near"));

    public static final SubLObject $$objectFoundInLocation = constant_handles.reader_make_constant_shell(makeString("objectFoundInLocation"));

    public static final SubLObject $$orgFacilities = constant_handles.reader_make_constant_shell(makeString("orgFacilities"));

    public static final SubLObject $$owns = constant_handles.reader_make_constant_shell(makeString("owns"));

    public static final SubLObject $$physicalDecompositions = constant_handles.reader_make_constant_shell(makeString("physicalDecompositions"));

    public static final SubLObject $$physicalQuarters = constant_handles.reader_make_constant_shell(makeString("physicalQuarters"));

    public static final SubLObject $$relatives = constant_handles.reader_make_constant_shell(makeString("relatives"));

    public static final SubLObject $$residesInDwelling = constant_handles.reader_make_constant_shell(makeString("residesInDwelling"));

    public static final SubLObject $$residesInRegion = constant_handles.reader_make_constant_shell(makeString("residesInRegion"));

    public static final SubLObject $$siblings = constant_handles.reader_make_constant_shell(makeString("siblings"));

    public static final SubLObject $$spouse = constant_handles.reader_make_constant_shell(makeString("spouse"));

    public static final SubLObject $$subordinateOrganizations = constant_handles.reader_make_constant_shell(makeString("subordinateOrganizations"));

    public static final SubLObject $$CyclistsMt = constant_handles.reader_make_constant_shell(makeString("CyclistsMt"));

    public static final SubLObject $$TheMySentientSystem = constant_handles.reader_make_constant_shell(makeString("TheMySentientSystem"));

    public static final SubLObject $$ist_Asserted = constant_handles.reader_make_constant_shell(makeString("ist-Asserted"));

    public static final SubLObject $$MediumAmountFn = constant_handles.reader_make_constant_shell(makeString("MediumAmountFn"));

    public static final SubLObject $$Happiness = constant_handles.reader_make_constant_shell(makeString("Happiness"));

    public static final SubLObject $$Unhappiness = constant_handles.reader_make_constant_shell(makeString("Unhappiness"));

    // // Initializers
    public void declareFunctions() {
        declare_external_code_constants_file();
    }

    public void initializeVariables() {
        init_external_code_constants_file();
    }

    public void runTopLevelForms() {
        setup_external_code_constants_file();
    }
}


package org.appdapter.subreg;

import org.appdapter.api.facade.FacadeSpec;
import scala.Option$;
import scala.Option;
import org.appdapter.api.facade.Maker;
import org.appdapter.api.facade.SubsystemRegistryFuncs;
import org.appdapter.api.facade.FacadeRegistry;
import org.appdapter.api.registry.VerySimpleRegistry;
import scala.reflect.ScalaSignature;
import org.appdapter.core.log.BasicDebugger;

@ScalaSignature(bytes = "mb!BI!aD*vENL8^3ntG\r\\3\r!AB:vEJ,wM\rI\r9eCB$XMqN]4MA\tAi9\t1\\8h\tyA!d_J,BA\t\r5m]5d\tWoZ4fe\"A1BCA#nsN+(m]=tlW-F!\t1BD55\tDC8-7b\tY$Qe$WMZ;yaa;sS:<'BA!A!A!)!D7z'V7/_:OC6,C#1%=S:LGOI\"!\n\tAQaEAUAQ%\nqcZ3u%\fX/:fI>3XM*fO&HO]=)CA1a#BA/!XmZ5tiJL(BA\r\t/[c1!CV3ssNKW7f%<n;ss\")1g\na+Ya-8di&|gn;y)\"7E9W\r$bG$WMU3hSN$(/oAhOs)!HLM\rZ3\nqJ$A$bG$WMU3hSN$(/}!\taPM&tGm:NC.,WK\\5rkt-\\3e\nTWm;EB!M#N\"AQ\"\r)A)b\nq\nV\t\r&\"aF$\n!C\"a(pi\"Lgn\t/)K!a\rsCN{a*ApE*E.>Yy)Q=\t)1\t\\1tg\")!+a+9qN6OC6,\"+>)!B7bW\bcW&q+\\WM3!\tAW'M&tGm:NC.,WK\\5rkt-\\3e\nTWm;XSRDG)4D_:XCA.^)\raf\f\tv#Q-CCQ!-A}2AF(]\f1\"du1N3PaRLwN\\1m+:L/^3OC6,Gm2kK$XC3j)\r)'\t/DBA4y^5p]B!)\t\r!\ra\t-=C\"*b)\"8\ty4j]|%/T1lK&sG/:oC24mY1eKVO>E$HCe)1/b\nJ+\tUl<\bxcfL!_7-3f'B,7\rCu)10b\nJR&\tulA=Ho<feJLG-(b[Daa A:fO&H/:FqR,'O\\1m\r\rZ3\r\rCA\f)!\t)!aucA\f\b%\r\tUskz\r!!\ra:qBA!\r'q(A#3EEC/!a!!)%aA#G\"1!H aAQ! @AUAq!!\t\t\t#\ngS:$W\t;fe:\fGNR1dC,WCBA_\t9(E\b\tK%QFW!$bG$W\rS1oI2,c\"091CA)bB; 1\tq]\fi#!\t9B}!A#\t\ru\fy1")
public abstract class SubsystemHandle extends BasicDebugger
{
    private final String mySubsysName;

    public String mySubsysName() {
        return this.mySubsysName;
    }

    public abstract VerySimpleRegistry getRequiredOverRegistry(final String p0);

    public FacadeRegistry getFacadeRegistry() {
        final VerySimpleRegistry vsr = this.getRequiredOverRegistry("findOrMakeSubsystemFacadeRegistry");
        return SubsystemRegistryFuncs.findOrMakeSubsystemFacadeRegistry(vsr, this.mySubsysName());
    }

    public <OT> OT findOrMakeUniqueNamedObject(final Class<OT> objClaz, final String objName, final Maker<OT> maker) {
        final FacadeRegistry ssfr = this.getFacadeRegistry();
        return (OT)ssfr.findOrMakeUniqueNamedObject((Class)objClaz, objName, (Maker)maker);
    }

    public <OT> OT findOrMakeUniqueNamedObjectWithDefCons(final Class<OT> objClaz, final String objName) {
        final FacadeRegistry ssfr = this.getFacadeRegistry();
        return (OT)ssfr.findOrMakeUniqueNamedObjectWithDefCons((Class)objClaz, objName);
    }

    public <OT> Option<OT> findOptionalUniqueNamedObject(final Class<OT> objClaz, final String objName) {
        final FacadeRegistry ssfr = this.getFacadeRegistry();
        try {
			return (Option<OT>)Option$.MODULE$.apply(ssfr.findOptionalUniqueNamedObject((Class)objClaz, objName));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }

    public <IFT, IFK> IFT findOrMakeInternalFacade(final FacadeSpec<IFT, IFK> fs, final String optOverrideName) {
        final FacadeRegistry ssfr = this.getFacadeRegistry();
        return (IFT)ssfr.findOrMakeInternalFacade((FacadeSpec)fs, optOverrideName);
    }

    public <EFT, EFK> void registerExternalFacade(final FacadeSpec<EFT, EFK> fs, final EFT facade, final String optOverrideName) {
        final FacadeRegistry ssfr = this.getFacadeRegistry();
        ssfr.registerExternalFacade((FacadeSpec)fs, (Object)facade, optOverrideName);
    }

    public <EFT, EFK> FacadeHandle<EFT> findExternalFacade(final FacadeSpec<EFT, EFK> fs, final String optOverrideName) {
        final FacadeRegistry ssfr = this.getFacadeRegistry();
        final Object facadeOrNull = ssfr.findExternalFacade((FacadeSpec)fs, optOverrideName);
        return (FacadeHandle<EFT>)new FacadeHandle(Option$.MODULE$.apply(facadeOrNull));
    }

    public SubsystemHandle(final String mySubsysName) {
        this.mySubsysName = mySubsysName;
    }
}

/*

	Total time: 23 ms

*/
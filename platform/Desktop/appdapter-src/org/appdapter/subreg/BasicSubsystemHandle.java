package org.appdapter.subreg;

import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxedUnit;
import org.appdapter.osgi.registry.RegistryServiceFuncs;
import org.appdapter.api.registry.VerySimpleRegistry;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "M3A!\t!\")Y:jGN+(m]=til*8eYT!a\rM,(M]3h\t)a!AbaB$\r;fe*\tq!ApeaA1D%QB'V7/_:uK6DM3mK\"IqBB%CGgV7/_:OC6,CA\t\tR#D!!B:dC2\fB\f&/3fM&$'RN\\4YBA\r1ipU;cgfh*Y7f!iA!b\nqC2sKE.>}$IE\t3%#3\t)1\t\\1tgBA%\n\t%1s%!AQFA`IEBI!K\nGJ,Gm7bu$AE\t3%YIaeJA\t!L\t]E\"AE\nA\"a(pi\"Lgn\t%IJ!aM\nsC6a'=S:LGOoaJCAyA1iB1;a\tYT\bECq\"JJ!AiC I!'5Lx+7m:|wO*fO&HO]=\"AQ$\rS!R#I,w-[:uefT!A.I\nb+:z'&l\\3SKL7:z!Q#A!B\tF7z/dGn8po:VmZ5tiJL\bCM%Q*AhKR4VM]=TS6H.*fO&HO]=CQaRAqcZ3u%\fX/:fI>3XM*fO&HO]=\"*Oa4v]$n8Dib")
public class BasicSubsystemHandle extends SubsystemHandle
{
    private final Class<?> credClaz;
    private VerySimpleRegistry myWellKnownRegistry;
    private volatile boolean bitmap$0;

    private VerySimpleRegistry myWellKnownRegistry$lzycompute() {
        synchronized (this) {
            if (!this.bitmap$0) {
                this.myWellKnownRegistry = RegistryServiceFuncs.getTheWellKnownRegistry((Class)this.credClaz());
                this.bitmap$0 = true;
            }
            final BoxedUnit unit = BoxedUnit.UNIT;
            return this.myWellKnownRegistry;
        }
    }

    public Class<?> credClaz() {
        return this.credClaz;
    }

    public VerySimpleRegistry myWellKnownRegistry() {
        return this.bitmap$0 ? this.myWellKnownRegistry : this.myWellKnownRegistry$lzycompute();
    }

    private VerySimpleRegistry getVerySimpleRegistry() {
        return this.myWellKnownRegistry();
    }

    public VerySimpleRegistry getRequiredOverRegistry(final String functionCtx) {
        final VerySimpleRegistry vsr = this.getVerySimpleRegistry();
        if (vsr == null) {
            final String msg = new StringBuilder().append((Object)"getRequiredOverRegistry(").append((Object)functionCtx).append((Object)") : Somehow got a null OverRegistry").toString();
            this.logError(msg);
            throw new  RuntimeException(msg);
        }
        return vsr;
    }

    public BasicSubsystemHandle(final String subsysName, final Class<?> credClaz) {
    	super(subsysName);
        this.credClaz = credClaz;

    }
}

/*

	Total time: 22 ms

*/
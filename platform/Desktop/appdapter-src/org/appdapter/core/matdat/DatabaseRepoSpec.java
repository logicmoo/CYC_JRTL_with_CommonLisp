package org.appdapter.core.matdat;

import org.appdapter.core.name.FreeIdent;
import scala.collection.mutable.StringBuilder;
import org.appdapter.core.store.Repo;
import org.appdapter.impl.store.DatabaseRepo;
import org.appdapter.core.name.Ident;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = ")3A!\tB);bEXMU3q_NXm\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1C\r!\tia\"D\ty!ASKB|7]3d!\tA!A!AC2p]Lw\rU1uQB1#\b)]i!-)1oY1mC&$F!J,G-4\niY\"AB*ue&twM+!AQBB%a$paRuN4SKNE\n I5\tE\"E!A.8h6bmL!!\n\rcm]:M_$WM\tO\t)AQQA-:He\b.#%bS\"-\"8b[L!!\f%#WM;\t=A\rqJg.;?)\t$g\r5\"B\t/\"B/q\"B/A\"B\t1D#B8smj\"6!B2QCRD\"6q!B8qic\"6!3je\r5Ve&&/4jq\")a(a%\tB-:He\bT8dC2t-\\3\tAI!5\f7.*fa>$A\t\"kQa;peT!a\t%l\\AR1uC\n\f7/*fa>")
public class DatabaseRepoSpec extends RepoSpec
{
    private final String configPath;
    private final ClassLoader optConfResCL;
    private final Ident dirGraphID;
    
    public DatabaseRepo makeRepo() {
        return FancyRepoLoader$.MODULE$.loadDatabaseRepo(this.configPath, this.optConfResCL, this.dirGraphID);
    }
    
    public DatabaseRepoSpec(final String configPath, final ClassLoader optConfResCL, final Ident dirGraphID) {
        this.configPath = configPath;
        this.optConfResCL = optConfResCL;
        this.dirGraphID = dirGraphID;
    }
    
    public DatabaseRepoSpec(final String cPath, final ClassLoader optCL, final String dirGraphUriPrefix, final String dirGraphLocalName) {
        this(cPath, optCL, (Ident)new FreeIdent(new StringBuilder().append((Object)dirGraphUriPrefix).append((Object)dirGraphLocalName).toString(), dirGraphLocalName));
    }
}

/*

	Total time: 9 ms
	
*/
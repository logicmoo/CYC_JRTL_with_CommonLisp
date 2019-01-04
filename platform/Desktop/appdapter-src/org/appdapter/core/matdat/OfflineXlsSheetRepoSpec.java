package org.appdapter.core.matdat;

import scala.collection.mutable.StringBuilder;
import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "4A!\t9rJ4mS:,\f\\:TQ,GOU3q_NXm\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sO1C\r!\tia\"D\ty!ASKB|7]3d\r>H):fGR|'/\t#\t)A%i1[3fi2{7-;j_:\"aE\rQ9R\"AY\tQa]2bYL!G\rAX\rZ3g\tQ2DTiJLgn1UA\"\bIAE]lWm9bG.Z3u!yA!A!3jeNCW-;\t!!Q\n\t\nABZ5mK6{G-7DN2a\t+!#BA')H/7\nAA[1wC&\n&H,]5\tAF.M!A.8h\tyCFADY8T8bI\b\"B\tAj]&$h\bF4iU2t!)\ra%!)Q\ra%!)q\ra%!9\rI\"B\tR!E4fiK'/Z2u_JLXj3fYR\t1\b=6\tQH?)Qn3fY*)Qe4'B\"DQWM\\1+a5qY*aiRQBTSG>lB&>iuZ3ma\"N!!xn;sS:<G#\n\b=!E!9rJ4mS:,\f\\:TQ,GOU3q_NXm\tE3q!#!kR'BAV+Va!8z%4\"BR\t9F#)\te!C5YB\\3tg&the\fG/:%I4-7uIQ*aEq[!\t=laA\f\"8dQ7.3\t,AC1o]>$\r^5p]&Amk:.Z2lK4M]5b],")
public class OfflineXlsSheetRepoSpec extends RepoSpecForDirectory
{
    private final String sheetLocation;
    private final String namespaceSheet;
    private final String dirSheet;
    private final List<ClassLoader> fileModelCLs;
    
    public static List<ClassLoader> $lessinit$greater$default$4() {
        return OfflineXlsSheetRepoSpec$.MODULE$.$lessinit$greater$default$4();
    }
    
    public Model getDirectoryModel() {
        return XLSXSheetRepoLoader$.MODULE$.readDirectoryModelFromXLSX(this.sheetLocation, this.namespaceSheet, this.dirSheet, (List)this.fileModelCLs);
    }
    
    public String toString() {
        return new StringBuilder().append((Object)"xlsx:/").append((Object)this.sheetLocation).append((Object)"/").append((Object)this.namespaceSheet).append((Object)"/").append((Object)this.dirSheet).toString();
    }
    
    public OfflineXlsSheetRepoSpec(final String sheetLocation, final String namespaceSheet, final String dirSheet, final List<ClassLoader> fileModelCLs) {
        this.sheetLocation = sheetLocation;
        this.namespaceSheet = namespaceSheet;
        this.dirSheet = dirSheet;
        this.fileModelCLs = fileModelCLs;
    }
}

/*

	Total time: 11 ms
	
*/
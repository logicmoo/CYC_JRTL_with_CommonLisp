package org.appdapter.core.matdat;

import java.util.List;
import com.hp.hpl.jena.rdf.model.Model;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "3A!\tiqi\\8h'\",W\r*fa>T!a\r5\fGZ1u\t)a!d_J,'BA\t%\t3baR,'OC\n\ry'oZ'\tA5\t!!\tqq*8j>\fG-:SKB|C\t\nL'/Z2u_JLXj3fYB1I))QCF[>$W\r/a\t1A3g\tI\"$kK:\f'BA\rA;y\t!9}\t1aY8n\t\tCCAN_,GC$A%=S:LGOK\"!\tE\n\b!A{wnZ*iK$(+9p!\ti!FB!1f+YAQM])\tq&AtGd-2]\t1I\\=SKDQa\tM\"!k)\"\tANe\fG\rR5sK$xN]=N_,GN:p[{wn%]U\tC9i(AtQ,GT8dCRLwN\tuur!!L\nqrA)sK,g-?\t11:j]T!\t#\"9\fW.Z:qC,7[3fiBQfQ\t:1!8u1E1C!!N]*iK$\b")
public class GoogSheetRepo extends OmniLoaderRepo
{
    public static Model readDirectoryModelFromGoog(final String sheetLocation, final int namespaceSheet, final int dirSheet) {
        return GoogSheetRepo$.MODULE$.readDirectoryModelFromGoog(sheetLocation, namespaceSheet, dirSheet);
    }
    
    public GoogSheetRepo(final Model directoryModel) {
        super(directoryModel, (List)null);
    }
}

/*

	Total time: 7 ms
	
*/
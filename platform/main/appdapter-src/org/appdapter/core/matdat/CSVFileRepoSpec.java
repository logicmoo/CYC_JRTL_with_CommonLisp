package org.appdapter.core.matdat;

import com.hp.hpl.jena.rdf.model.Model;
import java.util.List;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "4A!\ty1i,GS2,'+9p'B,7M\t1Q.;eCRT!!\t\r|'/!\t\"9qIH/:%\t1a:h\"5qQ\"\n=!*fa>/Z2G_J$N]3di>\t\t!!!N]*iK$\bCA\n\t!r#D1!B:dC2\fB\r&/3fM&!d'RN\\4a)C\n9\fW.Z:qC,7[3fi\"AqBB%%gS2,Wj3fYc5E\"M!jA\tG\nA!;jY*\tQ%kCZ\fBA#an;%bS\"-\"7b]L!!\f\rcm]:M_$WM_!\tMy%t \tE4\tAQ!AIAq!\b!C ]A\t\tYAI#,GR5sK$xN]=N_,GF9!\tId)D;\tYD(An_,GN>}!4}6f]T!!\"!HND\t1m\\7\nS$!B'pId\"B%\tR;p'RN\\4I9q#Q*A\bD'Z3\\3SKB|7]3d!\tiaJB\tA(9CR\tVCB]fVM_9#\t\"9aKTI\n9amKNN\\5uIX-;fe\"WMZ1vYR$#'FYU\tlK[!\tY-D]\tif,Av]DWmY6fI*q,FC:tw^1uS>tBA1]E)hn5fG.,GMV1sSt7-\bG:\n\"em!C.Z:tS:LGJ4sK$XMeK\fW;%gU\tQM!3")
public class CSVFileRepoSpec extends RepoSpecForDirectory
{
    private final String dirSheet;
    private final String namespaceSheet;
    private final List<ClassLoader> fileModelCLs;
    
    public static List<ClassLoader> $lessinit$greater$default$3() {
        return CSVFileRepoSpec$.MODULE$.$lessinit$greater$default$3();
    }
    
    public static String $lessinit$greater$default$2() {
        return CSVFileRepoSpec$.MODULE$.$lessinit$greater$default$2();
    }
    
    @Override
	public Model getDirectoryModel() {
        return CsvFileSheetLoader$.MODULE$.readDirectoryModelFromCsvFile(this.dirSheet, (List)this.fileModelCLs, this.namespaceSheet);
    }
    
    @Override
	public String toString() {
        return this.dirSheet;
    }
    
    public CSVFileRepoSpec(final String dirSheet, final String namespaceSheet, final List<ClassLoader> fileModelCLs) {
        this.dirSheet = dirSheet;
        this.namespaceSheet = namespaceSheet;
        this.fileModelCLs = fileModelCLs;
    }
}

/*

	Total time: 9 ms
	
*/
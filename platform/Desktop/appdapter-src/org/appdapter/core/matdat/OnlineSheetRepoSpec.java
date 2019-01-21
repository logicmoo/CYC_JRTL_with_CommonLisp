package org.appdapter.core.matdat;

import java.util.List;
import scala.runtime.BoxesRunTime;
import scala.collection.mutable.StringBuilder;
import com.hp.hpl.jena.rdf.model.Model;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "Y3A!\trJ7j].Z3u%xn9fG*1B[$H-;1B2peT!a\bZ1qi(\"A=xmaCABA\bQV\r]8Tagi:ESJ,7\r^8ss\"ABB%!#tQ,GoS3z!\tD/5\tQCC8-7b\tAR#Qe$WMZ5maa;sS:<'B\r!iA!A!q!8b[\b/Y2f'\",W\r(v[BAcHAU1!8u!A!A!qa3jeNCW-;Ok6D\nI!J\rM&dW-T8eK2Ej\tM-jS\"A!JB;uS2TAKU4--O\t!A*[:u!\tq'D0\t&mC:<B0-E.Y:t>\fG-:\tQAA\rqJg.;?)1tO;!\tiCg!CgaC#gaC%gQC5A\b7{yz\"B\t<\"B<q\"<q\"B!\t!E4fiK'/Z2u_JLXj3fYR\t1\tE#6\tQIG)Qn3fY**Se4'B&LQWM\\11ka5qY*ajTQBTUG>lB*FiuZ3m!\"V!!xn;sS:<G#\n")
public class OnlineSheetRepoSpec extends RepoSpecForDirectory
{
    private final String sheetKey;
    private final int namespaceSheetNum;
    private final int dirSheetNum;
    
    @Override
	public Model getDirectoryModel() {
        return GoogSheetRepoLoader$.MODULE$.readModelFromGoog(this.sheetKey, this.namespaceSheetNum, this.dirSheetNum);
    }
    
    @Override
	public String toString() {
        return new StringBuilder().append((Object)"goog:/").append((Object)this.sheetKey).append((Object)"/").append((Object)BoxesRunTime.boxToInteger(this.namespaceSheetNum)).append((Object)"/").append((Object)BoxesRunTime.boxToInteger(this.dirSheetNum)).toString();
    }
    
    public OnlineSheetRepoSpec(final String sheetKey, final int namespaceSheetNum, final int dirSheetNum, final List<ClassLoader> fileModelCLs) {
        this.sheetKey = sheetKey;
        this.namespaceSheetNum = namespaceSheetNum;
        this.dirSheetNum = dirSheetNum;
    }
    
    public OnlineSheetRepoSpec(final String sheetKey, final int namespaceSheetNum, final int dirSheetNum) {
        this(sheetKey, namespaceSheetNum, dirSheetNum, null);
    }
}

/*

	Total time: 9 ms
	
*/
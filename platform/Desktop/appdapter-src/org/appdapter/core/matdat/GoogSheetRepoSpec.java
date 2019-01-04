package org.appdapter.core.matdat;

import java.util.List;
import scala.runtime.BoxesRunTime;
import scala.collection.mutable.StringBuilder;
import com.hp.hpl.jena.rdf.model.Model;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "Y3A!\t\tri\\8h'\",W\r*fa>/Z2\r!AB7bi\fGO\r!1m:f\t9\"AbaB$\r;fe*\t\"ApeaAQBD%qB%xn9fG{'R5sK$xN]=\tE!!Q\nI\tb5fKR\\U-\t'eq!F\fUQAFg\fG.Y1U\ta:fI4BFO]5oO*$\t;\t)A=\tb.Y7fgB\f7-Z*iK$h*^7QyB\rIe\tE\t)A=YA-:TQ,GOT;n!!A!A!)4jYluZ3m2\bc,[5\tqE)S!Q^5mQ6bmL!L\t1K7\t]Eja\fa%\nA\\1oO&!g\f\f2\f7o'pC,'C5Q'=S:LGOm]BH\tAQ!EAIAQ!HAyAQAIAyAQJABQq\"BAN?!)ca%!)Qda=!)!ea=!)\tC!\tr-;ESJ,7\r^8ss6{G-7\r\"R)S!AR$5|G-7!Ka:eM*!jSUtMM79{A5qaA2p[&!+>$W\r)!\t%V\ti>FO]5oOR\t!")
public class GoogSheetRepoSpec extends RepoSpecForDirectory
{
    private final String sheetKey;
    private final int namespaceSheetNum;
    private final int dirSheetNum;
    
    public Model getDirectoryModel() {
        return GoogSheetRepoLoader$.MODULE$.readModelFromGoog(this.sheetKey, this.namespaceSheetNum, this.dirSheetNum);
    }
    
    public String toString() {
        return new StringBuilder().append((Object)"goog:/").append((Object)this.sheetKey).append((Object)"/").append((Object)BoxesRunTime.boxToInteger(this.namespaceSheetNum)).append((Object)"/").append((Object)BoxesRunTime.boxToInteger(this.dirSheetNum)).toString();
    }
    
    public GoogSheetRepoSpec(final String sheetKey, final int namespaceSheetNum, final int dirSheetNum, final List<ClassLoader> fileModelCLs) {
        this.sheetKey = sheetKey;
        this.namespaceSheetNum = namespaceSheetNum;
        this.dirSheetNum = dirSheetNum;
    }
    
    public GoogSheetRepoSpec(final String sheetKey, final int namespaceSheetNum, final int dirSheetNum) {
        this(sheetKey, namespaceSheetNum, dirSheetNum, null);
    }
}

/*

	Total time: 16 ms
	
*/
package org.appdapter.trigger.scafun;

import java.util.List;
import scala.collection.JavaConverters$;
import org.appdapter.api.trigger.Box;
import scala.collection.Seq;
import org.appdapter.api.trigger.BoxContext;
import scala.reflect.ScalaSignature;
import org.appdapter.trigger.bind.jena.FullBox;

@ScalaSignature(bytes = "Y2A!\t1!i=P]T!a\rMMZ;o\t)a!Aue&<w-:A!C1qa\f^3sIaA8sO1C\r!\ri!F)qEUtM\t!!-8e\tbBAGk2d'i=U1R\"\n]!A+sS<WM](oK\")C51A(8jiz\"a\t+AQ!\by\tqbZ3uB,gnS5e>DXm?52\t\t\tsE#K5\t1E%1AH]8pizJAJg\fG.YQ%\nq]1dW<WMC'\tYCFATKFT!K\t9bA\tC5\t$BA3\td!Aba&L!!N\t{pQ8oiDH")
public class BoxOne extends FullBox<TriggerOne>
{
    public Seq<BoxOne> getOpenKidBoxes(final BoxContext bc) {
        final List kidBoxJL = bc.getOpenChildBoxesNarrowed((Box)this, (Class)BoxOne.class, (Class)TriggerOne.class);
        final Seq kidBoxSeq = (Seq)JavaConverters$.MODULE$.asScalaBufferConverter(kidBoxJL).asScala();
        return (Seq<BoxOne>)kidBoxSeq;
    }
}

/*

	Total time: 21 ms
	
*/
package org.appdapter.subreg;

import scala.Predef;
import scala.Function0;
import scala.Option;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "a2A!\taa)Y2bIDM3mK*1BgV'/Z41!C1qa\f^3s9aA8sOQC'\t1\r5\tQBC8-7b\tRBB]fVM\t%)!C'q;Q2D\t1RBPaRLwN\t1eaB\t1DG)FAd\b\tuI!AH9{G[5oOBAIC51!8z!A!A!!B8qiBQ!\n\naP5oSRtDCA*!\rAaF!)!\na)!)1CY9n*fCLH#A1qBAun7fC:DQ!\rI\nbZ3uJ,En]3]\"19!4\tYAA,Go:Ok2dG#A")
public class FacadeHandle<FT>
{
    private final Option<FT> opt;

    public Option<FT> opt() {
        return this.opt;
    }

    public boolean isReady() {
        return this.opt().isDefined();
    }

//    public FT getOrElse(final FT f) {
//        return (FT)this.opt().getOrElse((Function0)new getOrElse$1(this, (Object)f));
//    }

    public Object getOrNull() {
        return this.opt().orNull((Predef.$less$colon$less)null);
    }

    public FacadeHandle(final Option<FT> opt) {
        this.opt = opt;
    }
}

/*

	Total time: 8 ms

*/
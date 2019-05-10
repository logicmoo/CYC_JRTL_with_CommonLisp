package org.appdapter.core.matdat;

import scala.Some;
import scala.None$;
import scala.runtime.BoxesRunTime;
import scala.collection.mutable.StringBuilder;
import scala.Option;
import org.appdapter.core.log.BasicDebugger;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\r3A!\taQ*;sSbvn^\"T-*1B[$H-;1B2peT!a\bZ1qi(\"A=xma!!5\taBC8-7b\t\tbBB]fVM\t'QiAA+\t\"T1ue&D(k\\<\t]!Q1Aa\t\"\\=S_^\f%O]3AQB\nmq!!B!seL\bCA!\tia$ 1K]3eKL!!\t\rM#(/8h\tyb%\t\t!%iPU8xJ\bC'q%=S:LGOQ%\"a\t])A\r\t-!!CY1A[3EE,!\f\t]Eja\fa\t1\\8h\ttFACCNL7\rR3ck<WMiBQDW\r2hA!)aC!o1r-;Q_NN7f>dW/8D_VtGF9!\ti(;\tJ;\tqAI9,GU8tg&G.Z\"pYVlgNV1mkFO]5oORa(\t}bB!y^5p]\")!iaq11m7JIb")
public class MatrixRowCSV implements MatrixRow
{
    private final String[] myRowArr;
    private final BasicDebugger theDbg;
    
    @Override
	public String dump() {
        return MatrixRow$class.dump((MatrixRow)this);
    }
    
    public String[] myRowArr() {
        return this.myRowArr;
    }
    
    public BasicDebugger theDbg() {
        return this.theDbg;
    }
    
    @Override
	public int getPossibleColumnCount() {
        return this.myRowArr().length;
    }
    
    @Override
	public Option<String> getPossibleColumnValueString(final int colIdx) {
        Object module$;
        if (colIdx < 0 || colIdx >= this.myRowArr().length) {
            this.theDbg().logWarning(new StringBuilder().append((Object)"Column index ").append((Object)BoxesRunTime.boxToInteger(colIdx)).append((Object)" is out of bounds for rowArray length ").append((Object)BoxesRunTime.boxToInteger(this.myRowArr().length)).toString());
            module$ = None$.MODULE$;
        }
        else {
            final String colVal = this.myRowArr()[colIdx];
            module$ = ((colVal == null || colVal.length() == 0) ? None$.MODULE$ : new Some((Object)colVal.trim()));
        }
        return (Option<String>)module$;
    }
    
    public MatrixRowCSV(final String[] myRowArr) {
        this.myRowArr = myRowArr;
        MatrixRow$class.$init$((MatrixRow)this);
        this.theDbg = new BasicDebugger();
    }
}

/*

	Total time: 14 ms
	
*/
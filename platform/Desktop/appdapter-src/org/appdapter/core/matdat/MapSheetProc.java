package org.appdapter.core.matdat;

import java.util.Map;
import scala.Option;
import scala.collection.mutable.StringBuilder;
import java.util.HashMap;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "=3A!\taQ*9TQ,G:pG*1B[$H-;1B2peT!a\bZ1qi(\"A=xmaCABA\b%.Z3u!J|7\rC\t\t!1q.Z1eKJvn^\"pk:$\bCA\n!\"\"AM\r\\1\n]!\"aA%oi&DD[fDU-3feJ{woQ8v]RDb%\tH\nWL8i7JIb,A\t=\t)A%Q1.Z=D_2LE\r\t!Q1Aq\tqA^\"pY&##\t\t!!18i7JIb\"\t)Aj]&$h\b'O!JCA\t21Y2131YA1A1\n1\"\\=SKN,H^'baV\tQ/gU*T\"AA\nB;uS2TAMU4-5_\t9*Y:i\bC:\tr'9)1K]3eKL!AO\rM#(/8h\tAD>I!L\r[fVm];mi6\t!\tQC\nxN2ECR\f'k\\<#CA\nC\tECV]&$\b\"B#?1aB2fY2vn\tK!5GO]5y%><\b\"&\tYAC4fi*g/Y'baV\tA\n/V*B(0\ri\r")
public class MapSheetProc extends SheetProc
{
    private final int keyColIdx;
    private final int vColIdx;
    private final HashMap<String, String> myResultMap;

    public int keyColIdx() {
        return this.keyColIdx;
    }

    public int vColIdx() {
        return this.vColIdx;
    }

    public HashMap<String, String> myResultMap() {
        return this.myResultMap;
    }

    public void absorbDataRow(final MatrixRow cellRow) {
        final Option key = cellRow.getPossibleColumnValueString(this.keyColIdx());
        final Option value = cellRow.getPossibleColumnValueString(this.vColIdx());
        if (key.isDefined() && value.isDefined()) {
            final boolean rowIsCommentedOut = ((String)key.get()).trim().startsWith("#");
            if (rowIsCommentedOut) {
                this.getLogger().debug(new StringBuilder().append((Object)"Row is commented out: ").append((Object)cellRow.dump()).toString());
            }
            else {
                final String k = (String)key.get();
                final String v = (String)value.get();
                this.myResultMap().put(k, v);
            }
        }
    }

    public Map<String, String> getJavaMap() {
        return this.myResultMap();
    }

    public MapSheetProc(final int headerRowCount, final int keyColIdx, final int vColIdx) {
    	super(headerRowCount);
        this.keyColIdx = keyColIdx;
        this.vColIdx = vColIdx;

        this.myResultMap = new HashMap<String, String>();
    }
}

/*

	Total time: 26 ms

*/
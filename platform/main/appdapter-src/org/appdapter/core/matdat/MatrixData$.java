package org.appdapter.core.matdat;

import au.com.bytecode.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Map;
import org.appdapter.core.log.BasicDebugger;
import org.appdapter.core.log.Debuggable;
//import org.appdapter.core.matdat.MatrixData..anonfun.readJavaMapFromSheet.1;
import org.appdapter.fileconv.FileStreamUtils;
import scala.Function1;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxedUnit;

public final class MatrixData$ extends BasicDebugger {
	public static MatrixData$ MODULE$;

	static {
		new MatrixData$();
	}

	public void processSheet(String url, Function1<MatrixRow, BoxedUnit> processor) throws IOException {
		Reader rawReader = FileStreamUtils.makeSheetURLDataReader(url);
		if (rawReader == null) {
			this.getLogger().error((new StringBuilder()).append("No sheet found: ").append(url).toString(),
					new FileNotFoundException(url));
		} else {
			Debuggable.putFrameVar("sheetURL", url);
			this.processSheetR(rawReader, processor);
		}

	}

	public void processSheetR(Reader rawReader, Function1<MatrixRow, BoxedUnit> processor) throws IOException {
		if (rawReader == null) {
			this.getLogger().error("NUll reader");
		} else {
			CSVReader csvr = new CSVReader(rawReader);
			boolean done = false;

			while (!done) {
				String[] rowArray = csvr.readNext();
				MatrixRowCSV matrixRow = new MatrixRowCSV(rowArray);
				Object var10001 = null;
				BoxedUnit var10000;
				if (rowArray != null) {
					try {
						processor.apply(matrixRow);
					} catch (Exception var8) {
						this.getLogger().error(Debuggable.toInfoStringArgV(new Object[] {
								(new StringBuilder()).append("processing a row problem ").append(var8).toString(), var8,
								processor, rowArray }));
						var10000 = BoxedUnit.UNIT;
					}
				} else {
					done = true;
					var10000 = BoxedUnit.UNIT;
				}
			}

			csvr.close();
			rawReader.close();
		}
	}

	public Map<String, String> readJavaMapFromSheet(String sheetURL, int headerCnt, int keyColIdx, int vlColIdx) {
      MapSheetProc mapProc = new MapSheetProc(headerCnt, keyColIdx, vlColIdx);
      Debuggable.putFrameVar("sheetURL", sheetURL);
      this.processSheet(sheetURL, new 1(mapProc));
      return mapProc.getJavaMap();
   }

	public int readJavaMapFromSheet$default$2() {
		return 1;
	}

	public int readJavaMapFromSheet$default$3() {
		return 0;
	}

	public int readJavaMapFromSheet$default$4() {
		return 1;
	}

	public Map<String, String> readJavaMapFromSheetR(Reader rawReader, int headerCnt, int keyColIdx, int vlColIdx) {
      MapSheetProc mapProc = new MapSheetProc(headerCnt, keyColIdx, vlColIdx);
      this.processSheetR(rawReader, new org.appdapter.core.matdat.MatrixData..anonfun.readJavaMapFromSheetR.1(mapProc));
      return mapProc.getJavaMap();
   }

	public int readJavaMapFromSheetR$default$2() {
		return 1;
	}

	public int readJavaMapFromSheetR$default$3() {
		return 0;
	}

	public int readJavaMapFromSheetR$default$4() {
		return 1;
	}

	private MatrixData$() {
		MODULE$ = this;
	}
}

/*
 * DECOMPILATION REPORT
 * 
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-
 * SNAPSHOT.jar Total time: 42 ms
 * 
 * Decompiled with FernFlower.
 */
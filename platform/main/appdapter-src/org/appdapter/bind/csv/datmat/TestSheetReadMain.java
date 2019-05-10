package org.appdapter.bind.csv.datmat;

import java.util.ArrayList;
import java.io.IOException;
import au.com.bytecode.opencsv.CSVReader;
import java.util.Iterator;
import java.io.Reader;
import org.appdapter.fileconv.FileStreamUtils;
import java.util.List;
import org.appdapter.core.log.BasicDebugger;

public class TestSheetReadMain
{
    static BasicDebugger theDbg;
    static String gdocPubUrlWithKey;
    static String tmpExtender;
    static List<String[]> theFailedRowList;
    
    public static void main(final String[] args) {
        final String fullUrlTxt = TestSheetReadMain.gdocPubUrlWithKey + TestSheetReadMain.tmpExtender;
        Reader shdr;
        try {
            shdr = FileStreamUtils.makeSheetURLDataReader(fullUrlTxt);
        }
        catch (Throwable t) {
            TestSheetReadMain.theDbg.logError("Cannot read[" + fullUrlTxt + "]", t);
            return;
        }
        TestSheetReadMain.theDbg.logInfo("Got sheet reader: " + shdr);
        final List<String[]> resultRows = readAllRows(shdr);
        for (final String[] cells : resultRows) {
            TestSheetReadMain.theDbg.logInfo("--------------------------------Row Break------------------------");
            for (final String c : cells) {
                TestSheetReadMain.theDbg.logInfo("Got cell: " + c);
            }
        }
    }
    
    public static List<String[]> readAllRows(final Reader matDataReader) {
        List<String[]> resultRows = TestSheetReadMain.theFailedRowList;
        CSVReader csvr = null;
        try {
            csvr = new CSVReader(matDataReader);
            resultRows = (List<String[]>)csvr.readAll();
        }
        catch (Throwable t) {
            TestSheetReadMain.theDbg.logError("Failed during CSV parse", t);
        }
        finally {
            if (csvr != null) {
                try {
                    csvr.close();
                }
                catch (IOException ex) {}
                csvr = null;
            }
        }
        return resultRows;
    }
    
    static {
        TestSheetReadMain.theDbg = new BasicDebugger();
        TestSheetReadMain.gdocPubUrlWithKey = "https://docs.google.com/spreadsheet/pub?key=0ArBjkBoH40tndDdsVEVHZXhVRHFETTB5MGhGcWFmeGc";
        TestSheetReadMain.tmpExtender = "&single=true&gid=7&range=A2%3AK999&output=csv";
        TestSheetReadMain.theFailedRowList = new ArrayList<String[]>();
    }
}

/*

	Total time: 34 ms
	
*/
package org.appdapter.fileconv;

import org.slf4j.LoggerFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.formula.FormulaParseException;
import org.apache.poi.ss.usermodel.Row;
import java.io.ByteArrayOutputStream;
import java.io.BufferedInputStream;
import java.io.StringReader;
import java.io.FileNotFoundException;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.util.FileManager;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import java.io.LineNumberReader;
import org.appdapter.core.log.Debuggable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.Reader;
import org.slf4j.Logger;

public abstract class FileStreamUtils
{
    private static Logger theLogger;
    public static boolean SheetURLDataReaderMayReturnNullOnError;
    
    public static Reader makeSheetURLDataReader(final String fullUrlTxt) throws IOException {
        try {
            return new InputStreamReader(new URL(fullUrlTxt).openStream());
        }
        catch (Throwable t) {
            FileStreamUtils.theLogger.error("Cannot read[" + fullUrlTxt + "]", t);
            if (FileStreamUtils.SheetURLDataReaderMayReturnNullOnError) {
                return null;
            }
            throw (IOException)Debuggable.reThrowable(t, (Class)IOException.class);
        }
    }
    
    public static boolean canLoadWorkbooks() {
        String loc = "GluePuma_HRKR50_TestFull_OnDisk.xlsx";
        URL url = FileStreamUtils.class.getResource(loc);
        if (url != null) {
            loc = url.toString();
        }
        try {
            url = new URL(loc);
            FileStreamUtils.theLogger.warn("canLoadWorkbook: " + loc + "=" + url);
            final Workbook workbook = getWorkbook(url.openStream(), "xlsx");
            Sheet sheet = null;
            for (int max = workbook.getNumberOfSheets() - 1, sheetNumber = 0; sheetNumber <= max; ++sheetNumber) {
                sheet = workbook.getSheetAt(sheetNumber);
                final String sn = sheet.getSheetName();
                FileStreamUtils.theLogger.warn("canLoadWorkbook: " + sn + "=" + loc);
                final Reader reader = sheetToReader(sheet);
                final LineNumberReader lnr = new LineNumberReader(reader);
                while (lnr.readLine() != null) {}
            }
        }
        catch (InvalidFormatException e) {
            FileStreamUtils.theLogger.error("canLoadWorkbook ", (Throwable)e);
        }
        catch (IOException e2) {
            FileStreamUtils.theLogger.error("canLoadWorkbook ", (Throwable)e2);
        }
        catch (Throwable e3) {
            FileStreamUtils.theLogger.error("canLoadWorkbook ", e3);
        }
        return false;
    }
    
    public static Workbook getWorkbook(final InputStream is, String extHint) throws IOException, InvalidFormatException {
        if (is == null) {
            throw new IOException("Not input stream for hint: " + extHint);
        }
        try {
            return WorkbookFactory.create(is);
        }
        catch (Exception e0) {
            if (extHint == null) {
                extHint = "xlsx";
            }
            else {
                extHint = extHint.toLowerCase();
            }
            try {
                if (extHint.endsWith("xlsx")) {
                    return (Workbook)new XSSFWorkbook(OPCPackage.open(is));
                }
                if (extHint.endsWith("xls")) {
                    return (Workbook)new HSSFWorkbook(is);
                }
                return (Workbook)new XSSFWorkbook(OPCPackage.open(is));
            }
            catch (Exception e2) {
                return (Workbook)new HSSFWorkbook(is);
            }
        }
    }
    
    public abstract InputStream openInputStream(final String p0, final List<ClassLoader> p1) throws IOException;
    
    public abstract InputStream openInputStreamOrNull(final String p0, final List<ClassLoader> p1);
    
    public Workbook getWorkbook(final String sheetLocation, final List<ClassLoader> fileModelCLs) throws InvalidFormatException, IOException {
        final InputStream stream = this.openInputStreamOrNull(sheetLocation, fileModelCLs);
        if (stream == null) {
            throw new IOException("Location not found: " + sheetLocation);
        }
        return getWorkbook(stream, getFileExt(sheetLocation));
    }
    
    public Reader getSheetReaderAt(final String sheetLocation, final String sheetName, final List<ClassLoader> fileModelCLs) {
        try {
            FileStreamUtils.theLogger.info("getSheetReaderAt: " + sheetLocation + "!" + sheetName);
            return this.getWorkbookSheetCsvReaderAt(sheetLocation, sheetName, fileModelCLs);
        }
        catch (InvalidFormatException e) {
            FileStreamUtils.theLogger.error("getWorkbookSheetCsvReaderAt ", (Throwable)e);
        }
        catch (IOException e2) {
            FileStreamUtils.theLogger.error("getWorkbookSheetCsvReaderAt ", (Throwable)e2);
        }
        return null;
    }
    
    public static Model getModelIfAvailable(final String sheetLocation, final FileManager fm) {
        try {
            return fm.loadModel(sheetLocation);
        }
        catch (Exception e) {
            return null;
        }
    }
    
    public static boolean isNullOrEmptyString(final CharSequence str) {
        return str == null || str.length() == 0;
    }
    
    public static String[] splitOfSubPath(final String str) {
        final String[] splt = str.split("#");
        if (splt.length == 2) {
            return splt;
        }
        return str.split("!");
    }
    
    public static String combineLocationAndSheet(final String sheetLocation, final String sheetName) {
        final boolean missingSheetLocation = isNullOrEmptyString(sheetLocation);
        final boolean missingSheetName = isNullOrEmptyString(sheetName);
        if (missingSheetLocation && missingSheetName) {
            return null;
        }
        if (missingSheetName) {
            return sheetLocation;
        }
        if (missingSheetLocation) {
            return sheetName;
        }
        final String combined = sheetLocation + "!" + sheetName;
        return combined;
    }
    
    public Reader getWorkbookSheetCsvReaderAt(final String sheetLocation, final String sheetName, final List<ClassLoader> fileModelCLs) throws InvalidFormatException, IOException {
        final boolean missingSheetLocation = isNullOrEmptyString(sheetLocation);
        final boolean missingSheetName = isNullOrEmptyString(sheetName);
        if (missingSheetLocation && missingSheetName) {
            return NotFound("NULL SheetReader Location");
        }
        final String combined = combineLocationAndSheet(sheetLocation, sheetName);
        Workbook workbook = this.getWorkbook(sheetLocation, fileModelCLs);
        if (workbook == null) {
            InputStream is = this.openInputStreamOrNull(sheetName, fileModelCLs);
            if (is == null) {
                is = this.openInputStreamOrNull(combined, fileModelCLs);
            }
            if (is == null) {
                return NotFound(combined);
            }
            final String ext = getFileExt(sheetName);
            if (ext != null && ext.endsWith("csv")) {
                return new InputStreamReader(is);
            }
            workbook = getWorkbook(is, ext);
            if (workbook == null) {
                return NotFound(sheetLocation + sheetName);
            }
            return sheetToReader(workbook.getSheetAt(0));
        }
        else {
            if (workbook == null) {
                return NotFound(sheetLocation + sheetName);
            }
            int sheetNumber = workbook.getSheetIndex(sheetName);
            Sheet sheet = null;
            if (sheetNumber >= 0) {
                sheet = workbook.getSheetAt(sheetNumber);
            }
            if (sheet != null) {
                return sheetToReader(sheet);
            }
            Sheet sheet2 = null;
            final int max = workbook.getNumberOfSheets() - 1;
            final String sheetNameS = matchableName(sheetName);
            for (sheetNumber = 0; sheetNumber <= max; ++sheetNumber) {
                sheet = workbook.getSheetAt(sheetNumber);
                final String sn = matchableName(sheet.getSheetName());
                if (sheetNameS.equals(sn)) {
                    return sheetToReader(sheet);
                }
                if (sheetNameS.startsWith(sn)) {
                    sheet2 = sheet;
                }
            }
            if (sheet2 != null) {
                return sheetToReader(sheet2);
            }
            return NotFound(sheetLocation + sheetName);
        }
    }
    
    public static String matchableName(final String sheetName) {
        if (sheetName == null) {
            return "";
        }
        return (sheetName + " ").replace(".csv ", "").replace(".xlsx ", "").replaceAll("-", "").replaceAll(" ", "").toLowerCase();
    }
    
    private static Reader NotFound(final String string) throws IOException {
        throw new FileNotFoundException(string);
    }
    
    public static String getFileExt(final String srcPath) {
        final int at = srcPath.lastIndexOf(46);
        if (at < 0) {
            return null;
        }
        return srcPath.substring(at + 1).toLowerCase();
    }
    
    public static Reader sheetToReader(final Sheet sheet) {
        final String str = sheetToString(sheet);
        final String sn = sheet.getSheetName();
        getLogger().debug("Reading Sheet " + sn + " " + str.length() + " bytes");
        saveFileString(sn, str);
        return new StringReader(str);
    }
    
    public static void saveFileString(final String sn) {
        try {
            final URL url = new URL(sn);
            final InputStream is = url.openStream();
            final BufferedInputStream bis = new BufferedInputStream(is);
            final ByteArrayOutputStream buf = new ByteArrayOutputStream();
            for (int result = bis.read(); result != -1; result = bis.read()) {
                final byte b = (byte)result;
                buf.write(b);
            }
            saveFileString(sn.replaceAll(":", "-").replaceAll("/", "-").replaceAll(".", "-").replaceAll("?", "-").replaceAll("=", "-").replaceAll("--", "-"), buf.toString());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private static void saveFileString(final String sn, final String str) {
    }
    
    protected static Logger getLogger() {
        return FileStreamUtils.theLogger;
    }
    
    public static String sheetToString(final Sheet sheet) {
        final StringBuffer sheetBuff = new StringBuffer();
        if (sheet.getPhysicalNumberOfRows() == 0) {
            throw new RuntimeException("No rows on sheet: " + sheet);
        }
        final int width = getSheetWidth(sheet);
        for (int maxInclusive = sheet.getLastRowNum(), i = sheet.getFirstRowNum(); i <= maxInclusive; ++i) {
            final Row row = sheet.getRow(i);
            if (row != null) {
                final int rwInclusve = row.getLastCellNum();
                final String str = getRowString(row, width);
                final StringBuffer strBuff = new StringBuffer(str);
                for (int pad = width - rwInclusve, j = 0; j < pad; ++j) {
                    strBuff.append(",");
                }
                sheetBuff.append(strBuff.toString().trim() + "\n");
            }
        }
        return sheetBuff.toString();
    }
    
    private static String getRowString(final Row row, final int width) {
        return getRowString(row, width, false);
    }
    
    private static String getRowDebugString(final Row row, final int width) {
        return getRowString(row, width, true);
    }
    
    private static String getRowString(final Row row, final int width, final boolean debugString) {
        int rwInclusve = row.getLastCellNum();
        if (rwInclusve > width) {
            rwInclusve = width;
        }
        final StringBuffer strBuff = new StringBuffer();
        if (debugString) {
            strBuff.append("##;; " + row.getSheet().getSheetName() + " rownum= " + row.getRowNum() + "\n\n");
        }
        for (int j = 0; j <= rwInclusve; ++j) {
            final Cell cell = row.getCell(j);
            if (j > 0) {
                strBuff.append(",");
            }
            if (cell != null) {
                String s = null;
                String c = null;
                String t = null;
                switch (cell.getCellType()) {
                    case 3: {
                        continue;
                    }
                    case 1: {
                        c = cell.getStringCellValue();
                        strBuff.append(escapeCSV(c));
                        continue;
                    }
                    case 0: {
                        t = "CELL_TYPE_NUMERIC";
                        c = ("" + cell.getNumericCellValue() + " ").replace(".0 ", "").trim();
                        break;
                    }
                    case 2: {
                        t = "CELL_TYPE_FORMULA";
                        try {
                            c = cell.getCellFormula();
                        }
                        catch (FormulaParseException e) {
                            if (Debuggable.isRelease()) {
                                FileStreamUtils.theLogger.warn("" + e);
                            }
                            else {
                                FileStreamUtils.theLogger.error("" + e, (Throwable)e);
                            }
                            cell.setCellType(1);
                            c = cell.getStringCellValue();
                        }
                        break;
                    }
                    case 4: {
                        t = "CELL_TYPE_BOOLEAN";
                        c = "" + cell.getBooleanCellValue();
                        break;
                    }
                    case 5: {
                        t = "CELL_TYPE_ERROR";
                        c = "" + cell.getErrorCellValue();
                        break;
                    }
                    default: {
                        t = "CELL_TYPE_" + cell.getCellType();
                        c = cell.getStringCellValue();
                        break;
                    }
                }
                cell.setCellType(1);
                s = cell.getStringCellValue();
                if (s != null && s.length() > 1) {
                    strBuff.append(escapeCSV(s));
                }
                else {
                    if ((s == null || s.length() < 1) && !debugString) {
                        final String msg = Debuggable.toInfoStringArgV(new Object[] { t + " really? " + c, "cell=" + cell, "cellAsString=" + s, "row.getClass= " + row.getClass(), "sheet=" + cell.getSheet().getSheetName(), "row=" + cell.getRow(), "rowstr = " + getRowDebugString(row, width) });
                        if (!Debuggable.isRelease()) {
                            Debuggable.doBreak(new Object[] { msg });
                        }
                    }
                    c = s;
                    strBuff.append(escapeCSV(c));
                }
            }
        }
        return strBuff.toString();
    }
    
    private static int getSheetWidth(final Sheet sheet) {
        final Row row = sheet.getRow(sheet.getFirstRowNum());
        int hadStuff = -1;
        for (int i = 0; i < row.getLastCellNum(); ++i) {
            final Cell c = row.getCell(i);
            if (c != null) {
                if (c.getCellType() == 1) {
                    hadStuff = i;
                }
            }
        }
        return hadStuff;
    }
    
    private static Object escapeCSV(final Object cellValue) {
        if (cellValue == null) {
            return "";
        }
        final String cellValueStr = cellValue.toString();
        return escapeEmbeddedCharacters(cellValueStr);
    }
    
    private static String escapeEmbeddedCharacters(String field) {
        if (field == null) {
            return "";
        }
        field = field.replace("\r\n", "\n").replace("\r", "\n").replace("\n", " ").trim();
        if (field.length() == 0) {
            return field;
        }
        if (field.contains("\"") || field.contains("\n") || field.contains(",")) {
            return "\"" + field.replaceAll("\"", "\"\"") + "\"";
        }
        return field;
    }
    
    static {
        FileStreamUtils.theLogger = LoggerFactory.getLogger((Class)FileStreamUtils.class);
        FileStreamUtils.SheetURLDataReaderMayReturnNullOnError = true;
    }
}

/*

	Total time: 103 ms
	
*/
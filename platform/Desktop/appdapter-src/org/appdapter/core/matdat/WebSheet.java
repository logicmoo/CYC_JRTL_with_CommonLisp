package org.appdapter.core.matdat;

import scala.Option;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = ")<Q!\t-\tbV3c'\",W\r\ta!\\1uI$(BAwN]3A!C1qa\f^3sIaA8sOCa!\by!C,fENCW-;5CA\t\"\"A\nM\r\\1\nU\"AB!osJ+g\rC$=S:LGO!9!$b\nYE4e_.Z3uX-*M+aCA#q\"BA!aM\\4\nAA[1wC&1E\b'RN\\4\t\rj!E9Gm\\2TQ,GOQ1tKVF\n\t\bO5\r\"=9Gm\\2QCJ\fWR8dL\bBBA%A$\thI>+:b[{7mS3zA!91&b\nYF4e_M]1n'&tw\r\\3TQ,G.IHO|7\rU1sC6N\\4mKNCW-;!ySB1Am\tc3pGB'/Y7TQ,GOT;n\tT)A9r\rZ8d!-\\*iK$h*^7!TB1Am\t!c3pGB'/Y7DK2d'+8hK\"1Q'Q\nq\t1c3pGB'/Y7DK2d'+8hKBqaNC1$AhI>+:b[>+H];u\r>X.;\t\rej!Y9Gm\\2QCJ\fWnT;uaV$hi:nCRbB%\taGO|7MR8s[$8i,\t\ruj!99Gm\\2G_Jl\r^\"T-BqaPC1$hI>g\t\\1h)J,X\rBIHO|7M7bORX/\t\rk!!C7q/^3ss&sG-[2bi>\bBB#A%A$A\brk08eS\fGo:!9UB1Am\ta]1sC6V\r]3sCR|'JIHa-\\*fa\r^8sA!91*b\nYa9beli]:jO:Da!T!a9beli]:jO:\"B(\tE7bWM]1n&tG-8h)\ra+%:\raU]lW\rU/:#V-J\ta:fI4BAY\t1&C[1+AwaV\"^Uim[3HI>7[3fiF+XM]=V%2#Ba0aK\")qla'1Am\\2LKfDQ!Y.A\t\fb5fKRtU/\t#\rL!\n%sGCg7q-paRM\\4f!\r\tnUSJaa9uS>t")
public final class WebSheet
{
    public static String makeGdocSheetQueryURL(final String docKey, final int sheetNum, final Option<String> optRange) {
        return WebSheet$.MODULE$.makeGdocSheetQueryURL(docKey, sheetNum, optRange);
    }
    
    public static String makeParamBinding(final String name, final String v) {
        return WebSheet$.MODULE$.makeParamBinding(name, v);
    }
    
    public static String paramAssign() {
        return WebSheet$.MODULE$.paramAssign();
    }
    
    public static String paramSeperator() {
        return WebSheet$.MODULE$.paramSeperator();
    }
    
    public static String queryIndicator() {
        return WebSheet$.MODULE$.queryIndicator();
    }
    
    public static String gdocFlagTrue() {
        return WebSheet$.MODULE$.gdocFlagTrue();
    }
    
    public static String gdocFormatCSV() {
        return WebSheet$.MODULE$.gdocFormatCSV();
    }
    
    public static String gdocParamOutputFormat() {
        return WebSheet$.MODULE$.gdocParamOutputFormat();
    }
    
    public static String gdocParamCellRange() {
        return WebSheet$.MODULE$.gdocParamCellRange();
    }
    
    public static String gdocParamSheetNum() {
        return WebSheet$.MODULE$.gdocParamSheetNum();
    }
    
    public static String gdocParamSingleSheet() {
        return WebSheet$.MODULE$.gdocParamSingleSheet();
    }
    
    public static String gdocParamDocKey() {
        return WebSheet$.MODULE$.gdocParamDocKey();
    }
    
    public static String gdocSheetBaseURL() {
        return WebSheet$.MODULE$.gdocSheetBaseURL();
    }
}

/*

	Total time: 10 ms
	
*/
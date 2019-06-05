package org.appdapter.core.matdat;

import scala.Option;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxedUnit;
import scala.runtime.BoxesRunTime;

public final class WebSheet$ {
   public static WebSheet$ MODULE$;
   private String gdocSheetBaseURL;
   private final String gdocParamDocKey;
   private final String gdocParamSingleSheet;
   private final String gdocParamSheetNum;
   private final String gdocParamCellRange;
   private final String gdocParamOutputFormat;
   private final String gdocFormatCSV;
   private final String gdocFlagTrue;
   private final String queryIndicator;
   private final String paramSeperator;
   private final String paramAssign;

   static {
      new WebSheet$();
   }

   public String gdocSheetBaseURL() {
      return this.gdocSheetBaseURL;
   }

   public String gdocParamDocKey() {
      return this.gdocParamDocKey;
   }

   public String gdocParamSingleSheet() {
      return this.gdocParamSingleSheet;
   }

   public String gdocParamSheetNum() {
      return this.gdocParamSheetNum;
   }

   public String gdocParamCellRange() {
      return this.gdocParamCellRange;
   }

   public String gdocParamOutputFormat() {
      return this.gdocParamOutputFormat;
   }

   public String gdocFormatCSV() {
      return this.gdocFormatCSV;
   }

   public String gdocFlagTrue() {
      return this.gdocFlagTrue;
   }

   public String queryIndicator() {
      return this.queryIndicator;
   }

   public String paramSeperator() {
      return this.paramSeperator;
   }

   public String paramAssign() {
      return this.paramAssign;
   }

   public String makeParamBinding(String name, String v) {
      return (new StringBuilder()).append(name).append(this.paramAssign()).append(v).toString();
   }

   public String makeGdocSheetQueryURL(String docKey, int sheetNum, Option<String> optRange) {
      StringBuilder builder = new StringBuilder(this.gdocSheetBaseURL());
      builder.append(this.queryIndicator());
      builder.append(this.makeParamBinding(this.gdocParamDocKey(), docKey));
      builder.append(this.paramSeperator());
      builder.append(this.makeParamBinding(this.gdocParamSheetNum(), BoxesRunTime.boxToInteger(sheetNum).toString()));
      if (optRange.isDefined()) {
         builder.append(this.paramSeperator());
         builder.append(this.makeParamBinding(this.gdocParamCellRange(), (String)optRange.get()));
      } else {
         BoxedUnit var10000 = BoxedUnit.UNIT;
      }

      builder.append(this.paramSeperator());
      builder.append(this.makeParamBinding(this.gdocParamOutputFormat(), this.gdocFormatCSV()));
      builder.append(this.paramSeperator());
      builder.append(this.makeParamBinding(this.gdocParamSingleSheet(), this.gdocFlagTrue()));
      return builder.toString();
   }

   private WebSheet$() {
      MODULE$ = this;
      this.gdocSheetBaseURL = "https://docs.google.com/spreadsheet/pub";
      this.gdocParamDocKey = "key";
      this.gdocParamSingleSheet = "single";
      this.gdocParamSheetNum = "gid";
      this.gdocParamCellRange = "range";
      this.gdocParamOutputFormat = "output";
      this.gdocFormatCSV = "csv";
      this.gdocFlagTrue = "true";
      this.queryIndicator = "?";
      this.paramSeperator = "&";
      this.paramAssign = "=";
   }
}

/*
	DECOMPILATION REPORT

	Decompiled from: G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\org.appdapter.bundle.core-1.1.6-SNAPSHOT.jar
	Total time: 34 ms
	
	Decompiled with FernFlower.
*/
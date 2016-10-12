/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCharacter;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLGuid;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLBigIntBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLDoubleFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLIntegerBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLLongBignum;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumber;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInOutTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.IsolatedClassLoader;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// External Imports
import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <P>
 * This JUnit test file will test the functionality of the read-eval
 * functionality used by SubLMain. Search for occurrences of @diff to see all
 * C/Allegro/CMUCL/Java differences.
 *
 * <P>
 * Copyright (c) 2004 - 2006 Cycorp, Inc. All rights reserved. <BR>
 * This software is the proprietary information of Cycorp, Inc.
 * <P>
 * Use is subject to license terms.
 *
 * @author pace
 * @date December 15, 2005, 3:22 PM
 * @version $Id: UnitTest.java 128954 2009-10-15 17:55:43Z tbrussea $
 */

public class UnitTest extends TestCase implements CommonSymbols {

	//// Constructors

	static private class CeilingTest extends DivisionTest {
		public CeilingTest(String number, String quotient, String remainder) {
			super(number, quotient, remainder);
		}

		public CeilingTest(String number, String divisor, String quotient, String remainder) {
			super(number, divisor, quotient, remainder);
		}

		public String getFunction() {
			return "ceiling";
		}
	}

	//// Public Area

	static private abstract class DivisionTest {

		private String number;

		private String divisor;

		private String quotient;

		private String remainder;

		public DivisionTest(String number, String quotient, String remainder) {
			this(number, "1", quotient, remainder);
		}

		public DivisionTest(String number, String divisor, String quotient, String remainder) {
			this.number = number;
			this.divisor = divisor;
			this.quotient = quotient;
			this.remainder = remainder;
		}

		public String getDivisor() {
			return this.divisor;
		}

		abstract public String getFunction();

		public String getNumber() {
			return this.number;
		}

		public String getQuotient() {
			return this.quotient;
		}

		public String getRemainder() {
			return this.remainder;
		}

		public void runTest() {
			UnitTest.testEvalEquals("(list " + this.getQuotient() + " " + this.getRemainder() + ")",
					"(multiple-value-list " + "(" + this.getFunction() + " " + this.getNumber() + " "
							+ this.getDivisor() + "))");
		}
	}

	static private class FloorTest extends DivisionTest {
		public FloorTest(String number, String quotient, String remainder) {
			super(number, quotient, remainder);
		}

		public FloorTest(String number, String divisor, String quotient, String remainder) {
			super(number, divisor, quotient, remainder);
		}

		public String getFunction() {
			return "floor";
		}
	}

	static private class RoundTest extends DivisionTest {
		public RoundTest(String number, String quotient, String remainder) {
			super(number, quotient, remainder);
		}

		public RoundTest(String number, String divisor, String quotient, String remainder) {
			super(number, divisor, quotient, remainder);
		}

		public String getFunction() {
			return "round";
		}
	}

	static public class SubLFile_Test implements SubLFile {
		static SubLFile me = new SubLFile_Test();
		static SubLSymbol $my_test_var$;

		static public SubLObject test_method(SubLObject param) {
			return param;
		}

		public void declareFunctions() {
			SubLFiles.declareFunction(SubLFile_Test.me, "test_method", "LATE-TEST-METHOD", 1, 0, false);
		}

		public void initializeVariables() {
			SubLFile_Test.$my_test_var$ = SubLFiles.defconstant(SubLFile_Test.me, "*MY-TEST-VAR*", CommonSymbols.T);
		}

		public void runTopLevelForms() {
		}
	}

	static private class TruncateTest extends DivisionTest {
		public TruncateTest(String number, String quotient, String remainder) {
			super(number, quotient, remainder);
		}

		public TruncateTest(String number, String divisor, String quotient, String remainder) {
			super(number, divisor, quotient, remainder);
		}

		public String getFunction() {
			return "truncate";
		}
	}

	private static SubLInteger twoTwelve = SubLObjectFactory.makeInteger(212);

	static public DivisionTest[] DIVISION_TEST_CASE_TABLE = { new RoundTest("0", "10", "0", "0"),
			new CeilingTest("0", "10", "0", "0"), new FloorTest("0", "10", "0", "0"),
			new TruncateTest("0", "10", "0", "0"), new FloorTest("1969", "4", "492", "1"),
			new FloorTest("-1969", "4", "-493", "3"),
			// from the hyperspec
			// http://localhost/HyperSpec/Body/fun_floorcm_f_undcm_fround.html#floor
			new FloorTest("2.6", "1", "2", "0.6000000000000001"),
			new CeilingTest("2.6", "1", "3", "-0.3999999999999999"),
			new RoundTest("2.6", "1", "3", "-0.3999999999999999"),
			new TruncateTest("2.6", "1", "2", "0.6000000000000001"), new FloorTest("2.5", "1", "2", "0.5"),
			new CeilingTest("2.5", "1", "3", "-0.5"), new RoundTest("2.5", "1", "2", "0.5"),
			new TruncateTest("2.5", "1", "2", "0.5"), new FloorTest("2.4", "1", "2", "0.3999999999999999"),
			new CeilingTest("2.4", "1", "3", "-0.6000000000000001"),
			new RoundTest("2.4", "1", "2", "0.3999999999999999"),
			new TruncateTest("2.4", "1", "2", "0.3999999999999999"), new FloorTest("0.7", "1", "0", "0.7"),
			new CeilingTest("0.7", "1", "1", "-0.30000000000000004"),
			new RoundTest("0.7", "1", "1", "-0.30000000000000004"), new TruncateTest("0.7", "1", "0", "0.7"),
			new FloorTest("0.3", "1", "0", "0.3"), new CeilingTest("0.3", "1", "1", "-0.7"),
			new RoundTest("0.3", "1", "0", "0.3"), new TruncateTest("0.3", "1", "0", "0.3"),
			new FloorTest("-0.3", "1", "-1", "0.7"), new CeilingTest("-0.3", "1", "0", "-0.3"),
			new RoundTest("-0.3", "1", "0", "-0.3"), new TruncateTest("-0.3", "1", "0", "-0.3"),
			new FloorTest("-0.7", "1", "-1", "0.30000000000000004"), new CeilingTest("-0.7", "1", "0", "-0.7"),
			new RoundTest("-0.7", "1", "-1", "0.30000000000000004"), new TruncateTest("-0.7", "1", "0", "-0.7"),
			new FloorTest("-2.4", "1", "-3", "0.6000000000000001"),
			new CeilingTest("-2.4", "1", "-2", "-0.3999999999999999"),
			new RoundTest("-2.4", "1", "-2", "-0.3999999999999999"),
			new TruncateTest("-2.4", "1", "-2", "-0.3999999999999999"), new FloorTest("-2.5", "1", "-3", "0.5"),
			new CeilingTest("-2.5", "1", "-2", "-0.5"), new RoundTest("-2.5", "1", "-2", "-0.5"),
			new TruncateTest("-2.5", "1", "-2", "-0.5"), new FloorTest("-2.6", "1", "-3", "0.3999999999999999"),
			new CeilingTest("-2.6", "1", "-2", "-0.6000000000000001"),
			new RoundTest("-2.6", "1", "-3", "0.3999999999999999"),
			new TruncateTest("-2.6", "1", "-2", "-0.6000000000000001"), };

	private static String[] EXAMPLE_NON_CORE_GUIDS = {
			// random GUIDs generated by UUID.java
			"ac2cdc17-7191-4757-9652-ba35913394cc", "092fe1d7-7c89-40cb-8918-f925d3d560f5",
			"2253cbb9-d217-4c52-b93a-494bfc346e0e", "9e252497-a613-4c12-ac51-045093fa7be8",
			"85d21f36-d943-42eb-b909-fb80bca8f6cc", "53194308-b6cc-4e93-b8ce-12b3b4b4b1aa",
			"7e614133-73c5-485e-bea2-4e08d26ab394", "fa4ab24c-2901-41ee-bdc7-c6610cc0f4d6",
			"dde7403f-0cb4-4db9-ab72-3499df86ced2", "c749d6e2-3e5b-4846-b428-a7e1f65f8a3f",
			"8929e75c-df35-495a-aad9-aea01638eace", "ec7cce42-9fd2-4598-b9f4-c3b21a7f9cb8",
			"58f429c0-1c9b-449a-8ab7-cc62cb634587", "2754d1da-3aec-4987-9927-454b06962be2",
			"371090f1-fc5e-45f0-aaa8-01e1fe5e3d80", "c69d8b08-faa6-4eac-8fdd-2b1ab0012255",
			"6d24b47c-b9b6-445d-9da8-911214b6132a", "e5b5ce22-69d9-434c-aec5-a5cb6477d96a",
			"37e9678b-00cb-4f3b-aa77-f8fd09cd6222", "07c91c9a-d894-44bb-8fca-e70960eaccfe",
			"21248340-0de5-4a17-88cc-f19e0f666996", "a1f20f2b-2d0f-4e7c-b65c-23083b6be83a",
			"6fe6162f-196a-4acc-a6a3-920425720e1f", "36eab934-a932-4cca-9c16-f13a63f99a00",
			"4320db29-0823-4159-b329-a5f58e6810a8", "7777de9c-92fe-48d3-adb5-f436da53f064",
			"8ec374d2-01f9-49ba-ab44-90f6ce010ec2", "2812e1b3-54db-4df6-b251-d06526deb8eb",
			"1af62fc9-894e-4971-aff4-4bca9fc56632", "0d464614-620c-4b79-b0c3-cbca8d45d60e",
			"7eef2de2-8135-472f-b669-15df6d4cb7c0", "367094f6-2487-423f-a888-a027ae1d8a4d",
			"f3e77863-3fcd-4670-9c3a-96ca01a07327", "9530d00c-318d-4234-95e9-8481379ad6be",
			"477f1308-4e90-4e74-adc0-c056c5e25782", "e5381873-d36c-4087-b6fe-d6d6addf9c93",
			"e92fe9a5-ccc7-4696-b9d2-ae4a7676d2e1", "35a98ed7-3745-4497-81ee-d0bf638a842e",
			"0277e434-330a-4de7-aa84-4e9f78e781ea", "b8d9b2e7-d812-447a-8c48-3086ac80967b",
			"ac4dcf46-3080-407a-9547-6617b7640847", "5ecb026e-ad01-4496-af4c-2f585b1cfa07",
			"0941d72f-826d-488f-acac-da7c38fc0dc7", "adc80310-3c89-422c-aa18-1d451da1d5b2",
			"333a887f-20d4-403c-bdde-a03b5a68577e", "93c75820-1c21-43c9-9087-07a8511c10be",
			"ef046bd7-662d-4374-baaf-450aa42206ed", "8c3af009-ceca-4d84-84bd-18218acb90da",
			"2348325c-a60f-4ed0-bd07-04439cb373a7", "62910136-a858-425b-b37a-1bb8764b133f",
			"f4f1d907-d7dc-4b2e-8efb-857c4bb121cb", "bc256674-5c36-45bb-a7da-898f2ee87db4",
			"0f393dee-d2ff-458c-b2b6-ede8d9ae52ce", "8413f308-0859-45d2-af74-b2089fc71e1c",
			"422dd7fa-1c5e-480f-a3b7-d60c981d5ea6", "b1522157-5b58-4a2b-8458-026a7969a1dd",
			"f7921203-431d-4ab3-9d78-b3e9026e9e66", "631979aa-7373-49b6-b126-d176bef0967d",
			"7f3f85b6-f4d8-490c-a497-5fcf6562a285", "788b6e89-3a72-4944-aac1-844605169fe8",
			"d30a1824-6a25-4a64-85b0-6e2dfca89e99", "9ec6bab5-8977-4e67-9933-ec276fa3b912",
			"99e0ba72-e90d-4825-a03a-b8bd2311895d", "5cbdf225-ebfa-412b-8611-c749af0b4c2e",
			"c2e3016c-1c7c-46b7-bffd-c7f8ed7624ec", "ae83ebf4-88dd-4d63-9b2f-1f2c31f9e635",
			"96d556b5-5470-4d98-9111-6614afd490b1", "b47afb99-4fe8-4d4c-b711-f35b49741339",
			"382d2200-d283-4370-b31e-d4df2d4d65ce", "d575a733-4b4d-4088-bad7-7bbffa1f2767",
			"bad5f87f-8b5e-40ae-8bc9-0958c87c8c7d", "ca7ed331-f6b2-43c4-afa9-d51e518ebec1",
			"7553befc-8e84-4446-9676-d8be4b0300b6", "5d0d4ab8-c533-4584-9dca-9264393d54e0",
			"4498803c-ea55-4444-bf36-02cb1adc6250", "8cc255cb-a8b8-4356-b019-64f892739578",
			"9097b724-2a51-41fd-974a-6c5223201980", "f0bb13c3-3ff7-444f-865e-18a2f5fda3e8",
			"bee2066d-25f0-4d3a-b707-307b1341e0ba", "26b7deaf-8e58-4f7e-9995-f1e32ab8c55f",
			"1ca87a3c-1967-40b3-927e-c557673243f3", "53972db3-006e-41ca-9572-6bdf76b4c7d6",
			"878ec520-ea9d-4797-bf9b-9a9fffa077f7", "baa29823-fd4f-43f1-9f8c-b5647fbc95a4",
			"876d5c30-7bac-4d7f-ae6f-77d0539790b0", "d5e6a812-dd37-4742-bfba-abdc2b75d19a",
			"172883ad-c2ed-4b62-8a89-a0995bb8048f", "04978a8d-e0a9-4eed-b50d-2e66ef9376fc",
			"5bb24907-9d64-4a8c-bed6-87b9618ea47e", "23eb58eb-7a0d-4d75-9045-0c9be4447d24",
			"9aa24f40-bd05-468f-a8a2-2e9828d91553", "908f1244-4bbf-4813-ab26-2dbe374c8d05",
			"84b3eae9-a269-4376-93de-4179d133db23", "4fc507b8-42f0-40e0-8919-0a3b8429eae6",
			"9f5e81a9-d16c-45b1-a595-4aa76a7ddc92", "2c4a5a2e-e936-45c8-8d04-78065a5128e3",
			"062b76cc-f4ad-4b27-8c77-d675dcb26aa2", "059e8eb2-d335-4d78-a877-d77e931f7eeb",
			"4d44b5bc-3448-4a38-9675-e2a3f452b4af", "0d839cc3-3461-4bb8-85d7-96e817400d58" };

	private static String[] SORTED_EXAMPLE_NON_CORE_GUIDS = {
			// same as EXAMPLE_NON_CORE_GUIDS, but in canonicalizer order
			"0277e434-330a-4de7-aa84-4e9f78e781ea", "04978a8d-e0a9-4eed-b50d-2e66ef9376fc",
			"059e8eb2-d335-4d78-a877-d77e931f7eeb", "062b76cc-f4ad-4b27-8c77-d675dcb26aa2",
			"07c91c9a-d894-44bb-8fca-e70960eaccfe", "092fe1d7-7c89-40cb-8918-f925d3d560f5",
			"0941d72f-826d-488f-acac-da7c38fc0dc7", "0d464614-620c-4b79-b0c3-cbca8d45d60e",
			"0d839cc3-3461-4bb8-85d7-96e817400d58", "0f393dee-d2ff-458c-b2b6-ede8d9ae52ce",
			"172883ad-c2ed-4b62-8a89-a0995bb8048f", "1af62fc9-894e-4971-aff4-4bca9fc56632",
			"1ca87a3c-1967-40b3-927e-c557673243f3", "21248340-0de5-4a17-88cc-f19e0f666996",
			"2253cbb9-d217-4c52-b93a-494bfc346e0e", "2348325c-a60f-4ed0-bd07-04439cb373a7",
			"23eb58eb-7a0d-4d75-9045-0c9be4447d24", "26b7deaf-8e58-4f7e-9995-f1e32ab8c55f",
			"2754d1da-3aec-4987-9927-454b06962be2", "2812e1b3-54db-4df6-b251-d06526deb8eb",
			"2c4a5a2e-e936-45c8-8d04-78065a5128e3", "333a887f-20d4-403c-bdde-a03b5a68577e",
			"35a98ed7-3745-4497-81ee-d0bf638a842e", "367094f6-2487-423f-a888-a027ae1d8a4d",
			"36eab934-a932-4cca-9c16-f13a63f99a00", "371090f1-fc5e-45f0-aaa8-01e1fe5e3d80",
			"37e9678b-00cb-4f3b-aa77-f8fd09cd6222", "382d2200-d283-4370-b31e-d4df2d4d65ce",
			"422dd7fa-1c5e-480f-a3b7-d60c981d5ea6", "4320db29-0823-4159-b329-a5f58e6810a8",
			"4498803c-ea55-4444-bf36-02cb1adc6250", "477f1308-4e90-4e74-adc0-c056c5e25782",
			"4d44b5bc-3448-4a38-9675-e2a3f452b4af", "4fc507b8-42f0-40e0-8919-0a3b8429eae6",
			"53194308-b6cc-4e93-b8ce-12b3b4b4b1aa", "53972db3-006e-41ca-9572-6bdf76b4c7d6",
			"58f429c0-1c9b-449a-8ab7-cc62cb634587", "5bb24907-9d64-4a8c-bed6-87b9618ea47e",
			"5cbdf225-ebfa-412b-8611-c749af0b4c2e", "5d0d4ab8-c533-4584-9dca-9264393d54e0",
			"5ecb026e-ad01-4496-af4c-2f585b1cfa07", "62910136-a858-425b-b37a-1bb8764b133f",
			"631979aa-7373-49b6-b126-d176bef0967d", "6d24b47c-b9b6-445d-9da8-911214b6132a",
			"6fe6162f-196a-4acc-a6a3-920425720e1f", "7553befc-8e84-4446-9676-d8be4b0300b6",
			"7777de9c-92fe-48d3-adb5-f436da53f064", "788b6e89-3a72-4944-aac1-844605169fe8",
			"7e614133-73c5-485e-bea2-4e08d26ab394", "7eef2de2-8135-472f-b669-15df6d4cb7c0",
			"7f3f85b6-f4d8-490c-a497-5fcf6562a285", "8413f308-0859-45d2-af74-b2089fc71e1c",
			"84b3eae9-a269-4376-93de-4179d133db23", "85d21f36-d943-42eb-b909-fb80bca8f6cc",
			"876d5c30-7bac-4d7f-ae6f-77d0539790b0", "878ec520-ea9d-4797-bf9b-9a9fffa077f7",
			"8929e75c-df35-495a-aad9-aea01638eace", "8c3af009-ceca-4d84-84bd-18218acb90da",
			"8cc255cb-a8b8-4356-b019-64f892739578", "8ec374d2-01f9-49ba-ab44-90f6ce010ec2",
			"908f1244-4bbf-4813-ab26-2dbe374c8d05", "9097b724-2a51-41fd-974a-6c5223201980",
			"93c75820-1c21-43c9-9087-07a8511c10be", "9530d00c-318d-4234-95e9-8481379ad6be",
			"96d556b5-5470-4d98-9111-6614afd490b1", "99e0ba72-e90d-4825-a03a-b8bd2311895d",
			"9aa24f40-bd05-468f-a8a2-2e9828d91553", "9e252497-a613-4c12-ac51-045093fa7be8",
			"9ec6bab5-8977-4e67-9933-ec276fa3b912", "9f5e81a9-d16c-45b1-a595-4aa76a7ddc92",
			"a1f20f2b-2d0f-4e7c-b65c-23083b6be83a", "ac2cdc17-7191-4757-9652-ba35913394cc",
			"ac4dcf46-3080-407a-9547-6617b7640847", "adc80310-3c89-422c-aa18-1d451da1d5b2",
			"ae83ebf4-88dd-4d63-9b2f-1f2c31f9e635", "b1522157-5b58-4a2b-8458-026a7969a1dd",
			"b47afb99-4fe8-4d4c-b711-f35b49741339", "b8d9b2e7-d812-447a-8c48-3086ac80967b",
			"baa29823-fd4f-43f1-9f8c-b5647fbc95a4", "bad5f87f-8b5e-40ae-8bc9-0958c87c8c7d",
			"bc256674-5c36-45bb-a7da-898f2ee87db4", "bee2066d-25f0-4d3a-b707-307b1341e0ba",
			"c2e3016c-1c7c-46b7-bffd-c7f8ed7624ec", "c69d8b08-faa6-4eac-8fdd-2b1ab0012255",
			"c749d6e2-3e5b-4846-b428-a7e1f65f8a3f", "ca7ed331-f6b2-43c4-afa9-d51e518ebec1",
			"d30a1824-6a25-4a64-85b0-6e2dfca89e99", "d575a733-4b4d-4088-bad7-7bbffa1f2767",
			"d5e6a812-dd37-4742-bfba-abdc2b75d19a", "dde7403f-0cb4-4db9-ab72-3499df86ced2",
			"e5381873-d36c-4087-b6fe-d6d6addf9c93", "e5b5ce22-69d9-434c-aec5-a5cb6477d96a",
			"e92fe9a5-ccc7-4696-b9d2-ae4a7676d2e1", "ec7cce42-9fd2-4598-b9f4-c3b21a7f9cb8",
			"ef046bd7-662d-4374-baaf-450aa42206ed", "f0bb13c3-3ff7-444f-865e-18a2f5fda3e8",
			"f3e77863-3fcd-4670-9c3a-96ca01a07327", "f4f1d907-d7dc-4b2e-8efb-857c4bb121cb",
			"f7921203-431d-4ab3-9d78-b3e9026e9e66", "fa4ab24c-2901-41ee-bdc7-c6610cc0f4d6" };

	private static String[] EXAMPLE_CORE_GUIDS = {
			// the GUIDs of all core constants from KB 085
			"c0fdc8ce-9c29-11b1-9dad-c379636f7270", "ce1e37f0-ec3f-11d6-8d83-0002b34c7c9f",
			"ce1e10e6-ec3f-11d6-8d83-0002b34c7c9f", "bdc9fb94-9c29-11b1-9dad-c379636f7270",
			"bf8bdc58-9c29-11b1-9dad-c379636f7270", "bd58c279-9c29-11b1-9dad-c379636f7270",
			"c04cad85-9c29-11b1-9dad-c379636f7270", "bf1eedc8-9c29-11b1-9dad-c379636f7270",
			"c0aa7393-9c29-11b1-9dad-c379636f7270", "bf4fcfa6-9c29-11b1-9dad-c379636f7270",
			"bd97e378-9c29-11b1-9dad-c379636f7270", "bfa4fe8c-9c29-11b1-9dad-c379636f7270",
			"be9af14f-9c29-11b1-9dad-c379636f7270", "bfedab5d-9c29-11b1-9dad-c379636f7270",
			"a8a40d91-0d87-11d9-9e57-0002b35bb117", "a8a40d90-0d87-11d9-9e57-0002b35bb117",
			"11c73ba2-3d83-11d9-9f59-0002b35bb117", "43806c82-6e4c-11d9-93ac-0007e916336c",
			"beb5aba2-9c29-11b1-9dad-c379636f7270", "bd5de44c-9c29-11b1-9dad-c379636f7270",
			"c00a42b9-9c29-11b1-9dad-c379636f7270", "24976690-8a1d-11d6-8000-00902794f506",
			"26ad75a0-8a1d-11d6-8000-00902794f506", "21894e1e-8a1d-11d6-8000-00902794f506",
			"2318a806-8a1d-11d6-8000-00902794f506", "c14862c2-9c29-11b1-9dad-c379636f7270",
			"bd6561fc-9c29-11b1-9dad-c379636f7270", "a8462735-532a-11d6-9228-0002b34c7c9f",
			"bd58c170-9c29-11b1-9dad-c379636f7270", "bd58c507-9c29-11b1-9dad-c379636f7270",
			"bd674278-9c29-11b1-9dad-c379636f7270", "bd588111-9c29-11b1-9dad-c379636f7270",
			"c0e7247c-9c29-11b1-9dad-c379636f7270", "bd588102-9c29-11b1-9dad-c379636f7270",
			"be75c8f9-9c29-11b1-9dad-c379636f7270", "beaed5bd-9c29-11b1-9dad-c379636f7270",
			"bd5880ef-9c29-11b1-9dad-c379636f7270", "bd5c0498-9c29-11b1-9dad-c379636f7270",
			"df8d60c3-eb94-11d6-82ee-0002b34c7c9f", "4777d758-108c-41d7-866a-9ddb21242ea5",
			"bfe9f22d-9c29-11b1-9dad-c379636f7270", "bd5880cc-9c29-11b1-9dad-c379636f7270",
			"bd58806a-9c29-11b1-9dad-c379636f7270", "c0a7cede-9c29-11b1-9dad-c379636f7270",
			"bd6449a2-9c29-11b1-9dad-c379636f7270", "dff47938-4da2-11d6-82c0-0002b34c7c9f",
			"dff47937-4da2-11d6-82c0-0002b34c7c9f", "bf192b1e-9c29-11b1-9dad-c379636f7270",
			"c0bf7a98-9c29-11b1-9dad-c379636f7270", "ee9f744c-8a1c-11d6-8000-00902794f506",
			"f3b2506c-8a1c-11d6-8000-00902794f506", "f0cee806-8a1c-11d6-8000-00902794f506",
			"bd58f7f9-9c29-11b1-9dad-c379636f7270", "aee9db98-0ea7-41d7-9387-bf0f0bd01e8b",
			"4cba0caa-e982-11d9-8000-0002b3a85b8f", "a774ee10-e984-11d9-8000-0002b3a85b8f",
			"0a0172da-e983-11d9-8000-0002b3a85b8f", "5c261c00-0ea7-41d7-826e-cba509274611",
			"66a0d466-0ea9-41d7-8f21-ca6c303de0d0", "79fe2070-108b-41d7-8a84-e7fe8ea1df91",
			"8f7d6628-8a1b-11d6-8000-00902794f506", "bed06ab6-9c29-11b1-9dad-c379636f7270",
			"bd5dbcd4-9c29-11b1-9dad-c379636f7270", "bd58e1fc-9c29-11b1-9dad-c379636f7270",
			"bfd86bf1-9c29-11b1-9dad-c379636f7270", "c130750e-9c29-11b1-9dad-c379636f7270",
			"be1d78c8-9c29-11b1-9dad-c379636f7270", "bdcc8689-9c29-11b1-9dad-c379636f7270",
			"bda21728-9c29-11b1-9dad-c379636f7270", "c04da45a-9c29-11b1-9dad-c379636f7270",
			"c03209e1-9c29-11b1-9dad-c379636f7270", "c017ff79-9c29-11b1-9dad-c379636f7270",
			"c0cc2458-9c29-11b1-9dad-c379636f7270", "be27a8ec-9c29-11b1-9dad-c379636f7270",
			"bf3491c4-9c29-11b1-9dad-c379636f7270", "beff1a9a-9c29-11b1-9dad-c379636f7270",
			"bd9733c2-9c29-11b1-9dad-c379636f7270", "8c1989b2-0571-41d8-9fda-a54456cecbe8",
			"be90c21d-9c29-11b1-9dad-c379636f7270", "bd601781-9c29-11b1-9dad-c379636f7270",
			"c091e184-9c29-11b1-9dad-c379636f7270", "bf364d35-9c29-11b1-9dad-c379636f7270",
			"c03ec3ba-9c29-11b1-9dad-c379636f7270", "6dd2e093-b027-11d9-93b3-0002b35bb117",
			"c0f63e9a-9c29-11b1-9dad-c379636f7270", "be2eb4e1-9c29-11b1-9dad-c379636f7270",
			"bd84623c-9c29-11b1-9dad-c379636f7270", "c0c6b0d2-9c29-11b1-9dad-c379636f7270",
			"bf1f951d-9c29-11b1-9dad-c379636f7270", "bdda1e3f-9c29-11b1-9dad-c379636f7270",
			"be2e0d29-9c29-11b1-9dad-c379636f7270", "bf26025d-9c29-11b1-9dad-c379636f7270",
			"c0d211d2-9c29-11b1-9dad-c379636f7270", "bfab7ef3-9c29-11b1-9dad-c379636f7270",
			"be0a552b-9c29-11b1-9dad-c379636f7270", "c010ce47-9c29-11b1-9dad-c379636f7270",
			"be00bf6e-9c29-11b1-9dad-c379636f7270", "c05a7c46-9c29-11b1-9dad-c379636f7270",
			"c129e5bc-9c29-11b1-9dad-c379636f7270", "bd63a0ce-9c29-11b1-9dad-c379636f7270",
			"be760011-9c29-11b1-9dad-c379636f7270", "beee8a4d-9c29-11b1-9dad-c379636f7270",
			"bddd55a1-9c29-11b1-9dad-c379636f7270", "be920bae-9c29-11b1-9dad-c379636f7270",
			"bddb0a48-9c29-11b1-9dad-c379636f7270", "bd5880a0-9c29-11b1-9dad-c379636f7270",
			"be7266e4-9c29-11b1-9dad-c379636f7270", "c1164108-9c29-11b1-9dad-c379636f7270",
			"bdb7f18f-9c29-11b1-9dad-c379636f7270", "c107fffb-9c29-11b1-9dad-c379636f7270",
			"6dd2e092-b027-11d9-93b3-0002b35bb117", "bf7800bf-9c29-11b1-9dad-c379636f7270",
			"7e37800e-0ea7-41d7-9bd5-8065cb1a6b10", "2f961964-0ea8-41d7-9ea1-c9afdcc1aa56",
			"8e72d91e-0ea7-41d7-8f52-84ac7fcfa385", "d9f441a0-1219-41d7-9457-ebe7ee11dc3f",
			"b2c8b1b4-108f-41d7-9034-dceb94f7996a", "d469217a-108d-41d7-8ce2-dad58b43f1c2",
			"122c8d92-1090-41d7-9e88-dccd46c00dee", "f0471674-1090-41d7-9d0f-ef2e9cd9fd4c",
			"25ac90f0-1091-41d7-8ad2-e217e51d47b0", "d30396de-108e-41d7-96f2-fb32dc881bce",
			"3869b626-108e-41d7-9774-efcd2852455a", "711dd8ca-108f-41d7-8ed2-b6714c417827",
			"a9b8812a-1090-41d7-896d-e7aa9f9b941f", "5afd82ae-108d-41d7-877a-efcc1a027076",
			"8a6b89b8-108e-41d7-8199-f8db46c58932", "523d56a0-1090-41d7-943c-b98ceb989643",
			"de649fb0-0ea8-41d7-8ccb-f7a3fcedcd63", "6cbc0e94-0ea7-41d7-8e09-eafe051a334c",
			"06085436-0ea8-41d7-8d78-c5027328b3c1", "9ea97dc4-0ea7-41d7-90cc-b17f20db96b6",
			"225afc46-0ea9-41d7-86ba-d6e6e606bcf4", "bf279d9c-0ea7-41d7-9fa4-d2954dda78a8",
			"d73532c0-8a1b-11d6-8000-00902794f506", "0dfc9bcc-108b-41d7-8ed7-edfd33b086ba",
			"6198deea-121a-41d7-93eb-f77e2835bef0", "e416edc1-758f-11d7-846c-0002b3a85c8d",
			"bd588068-9c29-11b1-9dad-c379636f7270", "0c5a7576-0f94-11d6-8000-0050dab92c2f",
			"c2444102-5943-11d6-8000-0002b364be7b", "c2a37e88-5943-11d6-8000-0002b364be7b",
			"bd58d679-9c29-11b1-9dad-c379636f7270", "bd58b8ba-9c29-11b1-9dad-c379636f7270",
			"bd8a163e-9c29-11b1-9dad-c379636f7270", "c10c3008-9c29-11b1-9dad-c379636f7270",
			"bf576a31-9c29-11b1-9dad-c379636f7270", "bd5880a6-9c29-11b1-9dad-c379636f7270",
			"c0ba0c32-9c29-11b1-9dad-c379636f7270", "c0ab9eda-9c29-11b1-9dad-c379636f7270",
			"bd5c5e99-9c29-11b1-9dad-c379636f7270", "be1f1654-9c29-11b1-9dad-c379636f7270",
			"0ccf9a20-d1a5-11d7-91aa-0002b3a8515d", "ff947d33-963a-11d7-866f-0002b34c7c9f",
			"c09a6e2f-9c29-11b1-9dad-c379636f7270", "ff947d34-963a-11d7-866f-0002b34c7c9f",
			"bda16220-9c29-11b1-9dad-c379636f7270", "fe9fcdd0-4370-11d6-8000-00a0c9da2002",
			"bd58829b-9c29-11b1-9dad-c379636f7270", "bf4ff31b-9c29-11b1-9dad-c379636f7270",
			"bfb0e3f0-9c29-11b1-9dad-c379636f7270", "bed22fb8-9c29-11b1-9dad-c379636f7270",
			"be7f041b-9c29-11b1-9dad-c379636f7270", "bec28bcc-9c29-11b1-9dad-c379636f7270",
			"c0e85daa-9c29-11b1-9dad-c379636f7270", "badbedd1-1ebc-11d8-8dde-0002b3988fc4",
			"bd58f080-9c29-11b1-9dad-c379636f7270", "c0b2bc13-9c29-11b1-9dad-c379636f7270",
			"059c0a82-39b0-11d9-8528-0007e9162f51", "059c0a80-39b0-11d9-8528-0007e9162f51",
			"059c0a85-39b0-11d9-8528-0007e9162f51", "bd5880d8-9c29-11b1-9dad-c379636f7270",
			"bd58c2f7-9c29-11b1-9dad-c379636f7270", "bff3237a-9c29-11b1-9dad-c379636f7270",
			"c10c450d-9c29-11b1-9dad-c379636f7270", "bd5880fe-9c29-11b1-9dad-c379636f7270",
			"bd589a1d-9c29-11b1-9dad-c379636f7270", "befd1881-9c29-11b1-9dad-c379636f7270",
			"c1237745-9c29-11b1-9dad-c379636f7270", "bd84dac3-9c29-11b1-9dad-c379636f7270",
			"c135fae1-9c29-11b1-9dad-c379636f7270", "bd681463-9c29-11b1-9dad-c379636f7270",
			"bd58e1a5-9c29-11b1-9dad-c379636f7270", "bd5c40b0-9c29-11b1-9dad-c379636f7270",
			"c0edda9d-9c29-11b1-9dad-c379636f7270", "cf645c7c-0ea7-41d7-8a80-ca222ce6bf52",
			"bd5ad700-9c29-11b1-9dad-c379636f7270", "1efb39f0-8a1d-11d6-8000-00902794f506",
			"4dde3f94-4621-41d8-9272-aca7bf883a76", "a77033a4-fc81-11da-99f8-0002b3988fc4",
			"bd5897dd-9c29-11b1-9dad-c379636f7270", "bd58a4f1-9c29-11b1-9dad-c379636f7270",
			"bfeb0c83-9c29-11b1-9dad-c379636f7270", "c052cf24-9c29-11b1-9dad-c379636f7270",
			"bd58da02-9c29-11b1-9dad-c379636f7270", "bd58915a-9c29-11b1-9dad-c379636f7270",
			"bd58d107-9c29-11b1-9dad-c379636f7270", "995b3198-033c-41d8-866d-f7bdd1826285",
			"913234d0-033c-41d8-8146-f33e6672d790", "85413266-033c-41d8-8a3c-853470ebf355",
			"7ee2de9c-033c-41d8-82f2-f5662a7ecac3", "bd589e12-9c29-11b1-9dad-c379636f7270",
			"c0a253f0-9c29-11b1-9dad-c379636f7270", "c0224da2-9c29-11b1-9dad-c379636f7270",
			"bd5880e0-9c29-11b1-9dad-c379636f7270", "c10ae4c2-9c29-11b1-9dad-c379636f7270",
			"bd590c98-9c29-11b1-9dad-c379636f7270", "bd654be7-9c29-11b1-9dad-c379636f7270",
			"bd58b833-9c29-11b1-9dad-c379636f7270", "bd58c1ad-9c29-11b1-9dad-c379636f7270",
			"bd58c1f0-9c29-11b1-9dad-c379636f7270", "c0937fa3-9c29-11b1-9dad-c379636f7270",
			"bd58d211-9c29-11b1-9dad-c379636f7270", "df8d87d0-eb94-11d6-82ee-0002b34c7c9f",
			"ce1e10e5-ec3f-11d6-8d83-0002b34c7c9f", "b90f05c2-7be6-41d9-95dd-badfd8a6ba18",
			"bed50053-9c29-11b1-9dad-c379636f7270", "bd58f042-9c29-11b1-9dad-c379636f7270",
			"bd58b9f9-9c29-11b1-9dad-c379636f7270", "bebd5604-9c29-11b1-9dad-c379636f7270",
			"c0604f82-9c29-11b1-9dad-c379636f7270", "bd58c2bd-9c29-11b1-9dad-c379636f7270",
			"bf1d7fe4-9c29-11b1-9dad-c379636f7270", "bd58c485-9c29-11b1-9dad-c379636f7270",
			"bd58c232-9c29-11b1-9dad-c379636f7270", "bf3a978c-9c29-11b1-9dad-c379636f7270",
			"bd5880d5-9c29-11b1-9dad-c379636f7270", "beab9388-9c29-11b1-9dad-c379636f7270",
			"bfbf40e9-9c29-11b1-9dad-c379636f7270", "bd58c4c6-9c29-11b1-9dad-c379636f7270",
			"f0bd8878-c427-11d6-8000-00a0c9c6d1c3", "bd58d6f3-9c29-11b1-9dad-c379636f7270",
			"bd58f8bc-9c29-11b1-9dad-c379636f7270", "bd58f87a-9c29-11b1-9dad-c379636f7270",
			"bd58ce5e-9c29-11b1-9dad-c379636f7270", "abb96eb5-e798-11d6-8ac9-0002b3a333c3",
			"47537942-331d-11d7-922f-0002b3a333c3", "47537943-331d-11d7-922f-0002b3a333c3",
			"46c5b240-c2a6-11d7-92d4-0002b3a333c3", "bde212ef-9c29-11b1-9dad-c379636f7270",
			"eff743dc-0ea7-41d7-8246-cecc2e49beb0", "df9f4728-0ea7-41d7-9612-a829907d2bf6",
			"bd58bf69-9c29-11b1-9dad-c379636f7270", "bf7a1c90-9c29-11b1-9dad-c379636f7270",
			"bd58c0a5-9c29-11b1-9dad-c379636f7270", "bd58c0ef-9c29-11b1-9dad-c379636f7270",
			"d32993c8-108b-41d7-943b-ee67ca30fba9", "beaad779-9c29-11b1-9dad-c379636f7270",
			"bf761f19-9c29-11b1-9dad-c379636f7270", "bd5892ab-9c29-11b1-9dad-c379636f7270",
			"bd58c3fb-9c29-11b1-9dad-c379636f7270", "bd5880ae-9c29-11b1-9dad-c379636f7270",
			"bd589ed9-9c29-11b1-9dad-c379636f7270", "bd5880d6-9c29-11b1-9dad-c379636f7270",
			"bd5880da-9c29-11b1-9dad-c379636f7270", "bd58c271-9c29-11b1-9dad-c379636f7270",
			"c0133726-9c29-11b1-9dad-c379636f7270", "afd79f32-7125-41d7-81b3-e79de9003a36",
			"bfc913a6-9c29-11b1-9dad-c379636f7270", "bd588100-9c29-11b1-9dad-c379636f7270",
			"be9be955-9c29-11b1-9dad-c379636f7270", "beb7f074-9c29-11b1-9dad-c379636f7270",
			"bfd0a274-9c29-11b1-9dad-c379636f7270", "bd5880ff-9c29-11b1-9dad-c379636f7270",
			"bde495da-9c29-11b1-9dad-c379636f7270", "80605b12-436e-11d6-8000-00a0c9da2002",
			"bd5880ab-9c29-11b1-9dad-c379636f7270", "bd588098-9c29-11b1-9dad-c379636f7270",
			"bd63d3ad-9c29-11b1-9dad-c379636f7270", "bf0f7037-9c29-11b1-9dad-c379636f7270",
			"c100289e-9c29-11b1-9dad-c379636f7270", "bf12c7c3-9c29-11b1-9dad-c379636f7270",
			"c0ad3020-9c29-11b1-9dad-c379636f7270", "be144cd1-9c29-11b1-9dad-c379636f7270",
			"bfe0bb3f-9c29-11b1-9dad-c379636f7270", "bd588002-9c29-11b1-9dad-c379636f7270",
			"bd5880cd-9c29-11b1-9dad-c379636f7270", "bd84df32-9c29-11b1-9dad-c379636f7270",
			"bfe7d31b-9c29-11b1-9dad-c379636f7270", "0e49646c-0f31-41d7-9fbe-ee5fdcf84034",
			"7087d921-0e2c-11d7-8f1a-0002b35bb117", "b8f9e0a4-27d5-11d7-9168-0002b34c7c9f",
			"290b90a8-033d-41d8-90bb-e6187b708fcc", "1a83bf1a-033d-41d8-93a5-af525946d6ea",
			"30a5f4a2-033d-41d8-8a13-caa49537da43", "bfaf1b18-9c29-11b1-9dad-c379636f7270",
			"bdc98c81-9c29-11b1-9dad-c379636f7270", "bf2a766d-9c29-11b1-9dad-c379636f7270",
			"bf77bef5-9c29-11b1-9dad-c379636f7270", "bd58d6b3-9c29-11b1-9dad-c379636f7270",
			"986a6742-4a78-11d7-9f84-00a0c9c6d17e", "bd5880a7-9c29-11b1-9dad-c379636f7270",
			"bd58825b-9c29-11b1-9dad-c379636f7270", "c0960de2-9c29-11b1-9dad-c379636f7270",
			"bf68c010-594e-11d6-8000-0002b364be7b", "bd58c131-9c29-11b1-9dad-c379636f7270",
			"be5d9e9f-9c29-11b1-9dad-c379636f7270", "bd58e5fd-9c29-11b1-9dad-c379636f7270",
			"bd589408-9c29-11b1-9dad-c379636f7270", "bd590951-9c29-11b1-9dad-c379636f7270",
			"bd5880e2-9c29-11b1-9dad-c379636f7270", "bd5880eb-9c29-11b1-9dad-c379636f7270",
			"be59c5cb-9c29-11b1-9dad-c379636f7270", "c1052107-9c29-11b1-9dad-c379636f7270",
			"c05813b7-9c29-11b1-9dad-c379636f7270", "c01d6e8d-9c29-11b1-9dad-c379636f7270",
			"bd58a571-9c29-11b1-9dad-c379636f7270", "bff27115-9c29-11b1-9dad-c379636f7270",
			"bee52c1c-9c29-11b1-9dad-c379636f7270", "68ea1372-2f6a-11d9-9ae0-0002b35bb117",
			"bd66e0a4-9c29-11b1-9dad-c379636f7270", "bf8b47b8-9c29-11b1-9dad-c379636f7270",
			"bd589695-9c29-11b1-9dad-c379636f7270", "dff47935-4da2-11d6-82c0-0002b34c7c9f",
			"189f0aec-a012-11d6-993c-0002b34c7c9f", "bddef55a-9c29-11b1-9dad-c379636f7270",
			"dff47936-4da2-11d6-82c0-0002b34c7c9f", "94f07021-8b0d-11d7-8701-0002b3a8515d",
			"bd59086c-9c29-11b1-9dad-c379636f7270", "bfa699e0-9c29-11b1-9dad-c379636f7270",
			"bd58803c-9c29-11b1-9dad-c379636f7270", "bd58a644-9c29-11b1-9dad-c379636f7270",
			"bd58d637-9c29-11b1-9dad-c379636f7270", "be01286a-9c29-11b1-9dad-c379636f7270",
			"bfac572e-9c29-11b1-9dad-c379636f7270", "bfeb3d17-9c29-11b1-9dad-c379636f7270",
			"bf8d1cd4-9c29-11b1-9dad-c379636f7270", "bdaa4b0e-9c29-11b1-9dad-c379636f7270",
			"c12bfd14-9c29-11b1-9dad-c379636f7270", "bd588101-9c29-11b1-9dad-c379636f7270",
			"c02b14f0-9c29-11b1-9dad-c379636f7270", "ac71e362-8918-11da-8000-0002b3620a69",
			"bd79c885-9c29-11b1-9dad-c379636f7270", "bdf8edae-9c29-11b1-9dad-c379636f7270",
			"bdcc9f7c-9c29-11b1-9dad-c379636f7270", "bd58e476-9c29-11b1-9dad-c379636f7270",
			"bd58d7f6-9c29-11b1-9dad-c379636f7270", "bd5880cf-9c29-11b1-9dad-c379636f7270",
			"bfcfa24f-9c29-11b1-9dad-c379636f7270", "bd5880f4-9c29-11b1-9dad-c379636f7270",
			"bd58e124-9c29-11b1-9dad-c379636f7270", "bd5880ac-9c29-11b1-9dad-c379636f7270",
			"67ac42e4-033d-41d8-88b4-c5af6346a3c4", "5faaf1f8-033d-41d8-9cc3-881c93115d39",
			"bd58c916-9c29-11b1-9dad-c379636f7270", "bd5880d9-9c29-11b1-9dad-c379636f7270",
			"bea64551-9c29-11b1-9dad-c379636f7270", "bd58e3ba-9c29-11b1-9dad-c379636f7270",
			"bd58e163-9c29-11b1-9dad-c379636f7270", "bd58af89-9c29-11b1-9dad-c379636f7270",
			"bd5e7a9e-9c29-11b1-9dad-c379636f7270", "bee5923d-9c29-11b1-9dad-c379636f7270",
			"e25a50a1-64dd-11d9-8e37-0002b35bb117", "bd5880aa-9c29-11b1-9dad-c379636f7270",
			"bdadcbf0-9c29-11b1-9dad-c379636f7270", "bd588471-9c29-11b1-9dad-c379636f7270",
			"dff4a042-4da2-11d6-82c0-0002b34c7c9f", "dff4a041-4da2-11d6-82c0-0002b34c7c9f",
			"bd58f8fe-9c29-11b1-9dad-c379636f7270", "bd992179-9c29-11b1-9dad-c379636f7270",
			"bd5d0b56-9c29-11b1-9dad-c379636f7270", "becf783a-9c29-11b1-9dad-c379636f7270",
			"bdb0bfbf-9c29-11b1-9dad-c379636f7270", "71304bd0-033d-41d8-815a-9f1758b267de",
			"83996144-033d-41d8-9e46-c8e929e84a03", "8b1299ae-033d-41d8-9eb8-c7fc9b1aa271",
			"6e398450-033d-41d8-8a81-b80d939dc7a9", "bae22f21-243d-11d8-9840-0002b3988fc4",
			"bd58e0e2-9c29-11b1-9dad-c379636f7270", "bd5880bd-9c29-11b1-9dad-c379636f7270",
			"0d6aa652-5866-11d6-8be9-00902794f506", "c10569cb-9c29-11b1-9dad-c379636f7270",
			"bf9a6157-9c29-11b1-9dad-c379636f7270", "bd757df1-9c29-11b1-9dad-c379636f7270",
			"bd58ba7a-9c29-11b1-9dad-c379636f7270", "bd58ba7e-9c29-11b1-9dad-c379636f7270",
			"bd5880f9-9c29-11b1-9dad-c379636f7270", "bd61886b-9c29-11b1-9dad-c379636f7270",
			"bd588b1d-9c29-11b1-9dad-c379636f7270", "bd588118-9c29-11b1-9dad-c379636f7270",
			"a8a40d93-0d87-11d9-9e57-0002b35bb117", "43806c83-6e4c-11d9-93ac-0007e916336c",
			"bd5a142d-9c29-11b1-9dad-c379636f7270", "bd58dcda-9c29-11b1-9dad-c379636f7270",
			"bd588117-9c29-11b1-9dad-c379636f7270", "a8a434a0-0d87-11d9-9e57-0002b35bb117",
			"43806c84-6e4c-11d9-93ac-0007e916336c", "bd5b6d60-9c29-11b1-9dad-c379636f7270",
			"bd58b8c3-9c29-11b1-9dad-c379636f7270", "bd588116-9c29-11b1-9dad-c379636f7270",
			"a8a434a1-0d87-11d9-9e57-0002b35bb117", "43806c85-6e4c-11d9-93ac-0007e916336c",
			"bd678812-9c29-11b1-9dad-c379636f7270", "bd67e911-9c29-11b1-9dad-c379636f7270",
			"bd588115-9c29-11b1-9dad-c379636f7270", "a8a434a2-0d87-11d9-9e57-0002b35bb117",
			"43806c86-6e4c-11d9-93ac-0007e916336c", "bd60a887-9c29-11b1-9dad-c379636f7270",
			"bd5d7783-9c29-11b1-9dad-c379636f7270", "bd588114-9c29-11b1-9dad-c379636f7270",
			"a8a434a3-0d87-11d9-9e57-0002b35bb117", "43806c87-6e4c-11d9-93ac-0007e916336c",
			"bff82c25-9c29-11b1-9dad-c379636f7270", "bf476137-9c29-11b1-9dad-c379636f7270",
			"bf6d1d3a-9c29-11b1-9dad-c379636f7270", "a8a45bb0-0d87-11d9-9e57-0002b35bb117",
			"43809390-6e4c-11d9-93ac-0007e916336c", "bdc438fd-9c29-11b1-9dad-c379636f7270",
			"c0054316-9c29-11b1-9dad-c379636f7270", "5dcd30b1-4493-11d9-93ca-0002b35bb117",
			"bee22d3d-9c29-11b1-9dad-c379636f7270", "a8a40d92-0d87-11d9-9e57-0002b35bb117",
			"b463b9fc-1717-41d9-81f5-946e75d138e6", "bd651c1b-9c29-11b1-9dad-c379636f7270",
			"bd58803d-9c29-11b1-9dad-c379636f7270", "5dcd30b0-4493-11d9-93ca-0002b35bb117",
			"bd5880ce-9c29-11b1-9dad-c379636f7270", "bd6a2d94-9c29-11b1-9dad-c379636f7270",
			"c128c4f1-9c29-11b1-9dad-c379636f7270", "bd95395a-9c29-11b1-9dad-c379636f7270",
			"beaa9284-9c29-11b1-9dad-c379636f7270", "be8f47a3-9c29-11b1-9dad-c379636f7270",
			"bd588106-9c29-11b1-9dad-c379636f7270", "aab60111-ab44-11d8-897d-0002b35bb117",
			"bcb003f3-aac9-11d8-85bd-0002b35bb117", "bfa4e9d2-9c29-11b1-9dad-c379636f7270",
			"1c0aeb26-d0ff-41d7-8df3-e0206d107204", "beaa3d29-9c29-11b1-9dad-c379636f7270",
			"df8d87d4-eb94-11d6-82ee-0002b34c7c9f", "df8d60c4-eb94-11d6-82ee-0002b34c7c9f",
			"ce1e10e1-ec3f-11d6-8d83-0002b34c7c9f", "bd59083a-9c29-11b1-9dad-c379636f7270",
			"be6735cd-9c29-11b1-9dad-c379636f7270", "6d2e2240-56ce-11d6-8227-0002b34c7c9f",
			"059c0a87-39b0-11d9-8528-0007e9162f51", "892d2402-429b-11d7-9f12-0002b3a8515d",
			"892d2401-429b-11d7-9f12-0002b3a8515d", "bd588109-9c29-11b1-9dad-c379636f7270",
			"bdf7cb82-9c29-11b1-9dad-c379636f7270", "bfe6fe22-9c29-11b1-9dad-c379636f7270",
			"661b7834-ab3d-11d7-956f-0007e90d9be3", "ced01936-acd6-41d7-80bd-aecc7431901b",
			"661b7831-ab3d-11d7-956f-0007e90d9be3", "661b7832-ab3d-11d7-956f-0007e90d9be3",
			"bda06d71-9c29-11b1-9dad-c379636f7270", "661b7833-ab3d-11d7-956f-0007e90d9be3",
			"bd8dbbc3-9c29-11b1-9dad-c379636f7270", "661b7835-ab3d-11d7-956f-0007e90d9be3",
			"bdb09014-9c29-11b1-9dad-c379636f7270", "bd58803e-9c29-11b1-9dad-c379636f7270",
			"be34dcb7-9c29-11b1-9dad-c379636f7270", "bce8a0b1-8ac9-11d6-864b-0002b364be7b",
			"bf8d3988-9c29-11b1-9dad-c379636f7270", "bd7183b0-9c29-11b1-9dad-c379636f7270",
			"bfa067af-9c29-11b1-9dad-c379636f7270", "be35d1f9-9c29-11b1-9dad-c379636f7270",
			"6bbde2e0-12aa-41d7-97e2-d2cd8dde2280", "aaaf2180-0ea9-41d7-8c78-f3d77408dd13",
			"c5b8bff0-0ea8-41d7-9330-a8d75dc13d41", "b043ad1a-0ea8-41d7-8807-e4d7aad88a01",
			"b01f3e4c-107b-41d7-89ac-d853a1ceea45", "9b44270a-1088-41d7-89d8-86187f50eac7",
			"6fe23318-0ea8-41d7-9648-9237f96c6632", "857cb040-0ea8-41d7-8639-c286b90192ba",
			"9af4b0d0-0ea8-41d7-88ee-e7da88c593cc", "012ec430-107a-41d7-8201-fd0c6a33c4ae",
			"93e9b082-0ea9-41d7-9217-e88c867d6e71", "7e0d7e6a-0ea9-41d7-9e9e-a5a533761768",
			"0cdaac86-0ea9-41d7-9528-b5928f6b2cd6", "f6f092d2-0ea8-41d7-8074-f74b3a1f4f8e",
			"5a1c2052-0ea8-41d7-8354-8a1ca8c753f7", "48564780-0ea8-41d7-8f74-e07cb4469992",
			"4fe874b8-0ea9-41d7-9a51-cb2aa8ac722d", "39f93138-0ea9-41d7-9207-fe9aa15a65d3",
			"1a2afc8e-0ea8-41d7-86ad-9f138e1b142c", "449c68f2-108a-41d7-85a4-d5be787da5b9",
			"cee981ca-121a-41d7-9820-d2140528f40e", "e416edc3-758f-11d7-846c-0002b3a85c8d",
			"e416edc2-758f-11d7-846c-0002b3a85c8d", "f7cf5a39-5224-11d6-9eb9-0002b34c7c9f",
			"c082ab98-9c29-11b1-9dad-c379636f7270", "c037affb-9c29-11b1-9dad-c379636f7270",
			"c07a7946-9c29-11b1-9dad-c379636f7270", "bde5ec9c-9c29-11b1-9dad-c379636f7270",
			"bd5880ed-9c29-11b1-9dad-c379636f7270", "bd60e145-9c29-11b1-9dad-c379636f7270",
			"bd5880ee-9c29-11b1-9dad-c379636f7270", "01031bea-4371-11d6-8000-00a0c9da2002",
			"bd63f343-9c29-11b1-9dad-c379636f7270", "bdfdf4b1-9c29-11b1-9dad-c379636f7270",
			"bd5880e3-9c29-11b1-9dad-c379636f7270", "c1299098-9c29-11b1-9dad-c379636f7270",
			"c073820f-9c29-11b1-9dad-c379636f7270", "c0659a2b-9c29-11b1-9dad-c379636f7270",
			"c10e5735-9c29-11b1-9dad-c379636f7270", "beab79ec-9c29-11b1-9dad-c379636f7270",
			"c05e110e-9c29-11b1-9dad-c379636f7270", "bd5880c9-9c29-11b1-9dad-c379636f7270",
			"bda887b6-9c29-11b1-9dad-c379636f7270", "c03afa6d-9c29-11b1-9dad-c379636f7270",
			"bf0a336e-9c29-11b1-9dad-c379636f7270", "2eb3d286-1976-41d9-98a2-cd8854d31725",
			"bd5880c1-9c29-11b1-9dad-c379636f7270", "834eac32-86a4-11d9-88d7-0002b35bb117",
			"fe7e4d83-d86f-11d9-8ba5-0002b3891c1f", "c000f476-9c29-11b1-9dad-c379636f7270",
			"175dad78-557d-41d7-9305-ede135042ebb", "bd65cd99-9c29-11b1-9dad-c379636f7270",
			"bd595e7e-9c29-11b1-9dad-c379636f7270", "bd58e0ec-9c29-11b1-9dad-c379636f7270",
			"be31edd4-9c29-11b1-9dad-c379636f7270", "6837f9f0-8c0e-11d9-9cdd-0002b35bb117",
			"c0d6eb7b-9c29-11b1-9dad-c379636f7270", "be2e94bb-9c29-11b1-9dad-c379636f7270",
			"be92128d-9c29-11b1-9dad-c379636f7270", "bd5892af-9c29-11b1-9dad-c379636f7270",
			"bd5880f7-9c29-11b1-9dad-c379636f7270", "a71e1700-063f-41d7-9841-873d1ddc865a",
			"74182065-dce5-11d9-9d50-0007e9162f51", "beed06de-9c29-11b1-9dad-c379636f7270",
			"c0f45a9c-9c29-11b1-9dad-c379636f7270", "bf84f09d-9c29-11b1-9dad-c379636f7270",
			"df8d87d2-eb94-11d6-82ee-0002b34c7c9f", "bd61ec34-9c29-11b1-9dad-c379636f7270",
			"bd5880e5-9c29-11b1-9dad-c379636f7270", "bd5b4951-9c29-11b1-9dad-c379636f7270",
			"bd58810e-9c29-11b1-9dad-c379636f7270", "33f8cc41-9281-11d9-9ad4-0002b35bb117",
			"a988bc62-6e2b-11d9-93ac-0002b35bb117", "bd5880b2-9c29-11b1-9dad-c379636f7270",
			"bd5880af-9c29-11b1-9dad-c379636f7270", "bd5bae9a-9c29-11b1-9dad-c379636f7270",
			"bf74bd9c-9c29-11b1-9dad-c379636f7270", "be81b28d-9c29-11b1-9dad-c379636f7270",
			"0548d243-4342-11d7-9851-0002b34c7c9f", "55b05522-f7e2-11da-99f7-0002b3988fc4",
			"bd588113-9c29-11b1-9dad-c379636f7270", "5f448121-4362-11d7-9b8e-0002b34c7c9f",
			"bd5880f8-9c29-11b1-9dad-c379636f7270", "bfce95e7-9c29-11b1-9dad-c379636f7270",
			"bff476e8-9c29-11b1-9dad-c379636f7270", "bda0e43c-9c29-11b1-9dad-c379636f7270",
			"bdfb7dd0-9c29-11b1-9dad-c379636f7270", "bdde7fe1-9c29-11b1-9dad-c379636f7270",
			"bd671c2d-9c29-11b1-9dad-c379636f7270", "bee6e76c-9c29-11b1-9dad-c379636f7270",
			"c135299e-9c29-11b1-9dad-c379636f7270", "bd5c548a-9c29-11b1-9dad-c379636f7270",
			"c0a383bd-9c29-11b1-9dad-c379636f7270", "c11c43c3-9c29-11b1-9dad-c379636f7270",
			"be4ef62a-9c29-11b1-9dad-c379636f7270", "bd682bdd-9c29-11b1-9dad-c379636f7270",
			"bea12384-9c29-11b1-9dad-c379636f7270", "bf8c47ad-9c29-11b1-9dad-c379636f7270",
			"bde38eeb-9c29-11b1-9dad-c379636f7270", "bf77aa73-9c29-11b1-9dad-c379636f7270",
			"bde87324-9c29-11b1-9dad-c379636f7270", "be1ac327-9c29-11b1-9dad-c379636f7270",
			"bd913dca-9c29-11b1-9dad-c379636f7270", "c0c3a8a2-9c29-11b1-9dad-c379636f7270",
			"bf54071c-9c29-11b1-9dad-c379636f7270", "c133531a-9c29-11b1-9dad-c379636f7270",
			"bd7d5373-9c29-11b1-9dad-c379636f7270", "bf1b7efc-9c29-11b1-9dad-c379636f7270",
			"bdca5506-9c29-11b1-9dad-c379636f7270", "c0d674bf-9c29-11b1-9dad-c379636f7270",
			"c13181fd-9c29-11b1-9dad-c379636f7270", "bdc36538-9c29-11b1-9dad-c379636f7270",
			"8681b273-6c71-11d7-8bb8-0002b3a331d6", "bdd9d485-9c29-11b1-9dad-c379636f7270",
			"8681b272-6c71-11d7-8bb8-0002b3a331d6", "bf5cb2c0-9c29-11b1-9dad-c379636f7270",
			"c0b4578f-9c29-11b1-9dad-c379636f7270", "c0739142-9c29-11b1-9dad-c379636f7270",
			"0548f950-4342-11d7-9851-0002b34c7c9f", "bd588104-9c29-11b1-9dad-c379636f7270",
			"bd5880d3-9c29-11b1-9dad-c379636f7270", "c0cd0537-9c29-11b1-9dad-c379636f7270",
			"90ea97a6-a536-11d8-938a-0002b3988fc4", "c0ff89be-9c29-11b1-9dad-c379636f7270",
			"bd5880b9-9c29-11b1-9dad-c379636f7270", "6837d2e2-8c0e-11d9-9cdd-0002b35bb117",
			"9e98b4f1-773c-11d7-9996-0002b34c7c9f", "bebece64-9c29-11b1-9dad-c379636f7270",
			"bd5880ba-9c29-11b1-9dad-c379636f7270", "bda09fc2-9c29-11b1-9dad-c379636f7270",
			"c12ea2ff-9c29-11b1-9dad-c379636f7270", "059be375-39b0-11d9-8528-0007e9162f51",
			"c10c4394-9c29-11b1-9dad-c379636f7270", "c0f93b23-9c29-11b1-9dad-c379636f7270",
			"c0714577-9c29-11b1-9dad-c379636f7270", "bd588107-9c29-11b1-9dad-c379636f7270",
			"bd58810b-9c29-11b1-9dad-c379636f7270", "bfda366c-9c29-11b1-9dad-c379636f7270",
			"be4425ef-9c29-11b1-9dad-c379636f7270", "c00d7a96-9c29-11b1-9dad-c379636f7270",
			"bd5b97f9-9c29-11b1-9dad-c379636f7270", "be1c3220-9c29-11b1-9dad-c379636f7270",
			"bee356be-9c29-11b1-9dad-c379636f7270", "c1416e20-9c29-11b1-9dad-c379636f7270",
			"be717e09-9c29-11b1-9dad-c379636f7270", "c0390e21-9c29-11b1-9dad-c379636f7270",
			"be9e0a7c-9c29-11b1-9dad-c379636f7270", "bd91b03d-9c29-11b1-9dad-c379636f7270",
			"bf05e63f-9c29-11b1-9dad-c379636f7270", "bf411eed-9c29-11b1-9dad-c379636f7270",
			"bd5c44e1-9c29-11b1-9dad-c379636f7270", "bf2b937c-9c29-11b1-9dad-c379636f7270",
			"bd610a5c-9c29-11b1-9dad-c379636f7270", "b92626d0-94a5-41d9-8fdf-cc8d0e1bd018",
			"bd5880fb-9c29-11b1-9dad-c379636f7270", "bf660e73-9c29-11b1-9dad-c379636f7270",
			"bf4dc2b8-9c29-11b1-9dad-c379636f7270", "68330840-5ed1-11d6-8000-0002b364be7b",
			"c1227621-9c29-11b1-9dad-c379636f7270", "bfe6fd41-9c29-11b1-9dad-c379636f7270",
			"bd589d90-9c29-11b1-9dad-c379636f7270", "bd6422c8-9c29-11b1-9dad-c379636f7270",
			"bfd54197-9c29-11b1-9dad-c379636f7270", "86c1dc8a-50aa-11d6-8000-00a0c9da2002",
			"bf68e241-9c29-11b1-9dad-c379636f7270", "bd5880fa-9c29-11b1-9dad-c379636f7270",
			"bf83203b-9c29-11b1-9dad-c379636f7270", "c0b541b6-9c29-11b1-9dad-c379636f7270",
			"bdb8721b-9c29-11b1-9dad-c379636f7270", "bf136680-9c29-11b1-9dad-c379636f7270",
			"34349377-cb63-11d6-878a-0002b34c7c9f", "6d2dfb33-56ce-11d6-8227-0002b34c7c9f",
			"becd79d2-9c29-11b1-9dad-c379636f7270", "c0b4950a-9c29-11b1-9dad-c379636f7270",
			"f0f39521-8447-11d9-9df2-0002b3a85b0b", "c033ac24-9c29-11b1-9dad-c379636f7270",
			"be18e693-9c29-11b1-9dad-c379636f7270", "c49488d4-a0de-41d7-8ede-9d605e6c951d",
			"c076ff6d-9c29-11b1-9dad-c379636f7270", "49802a10-2475-11d9-88f9-0002b35bb117",
			"49800303-2475-11d9-88f9-0002b35bb117", "49800302-2475-11d9-88f9-0002b35bb117",
			"055544a2-4371-11d6-8000-00a0c9da2002", "ab7bb61a-2d61-41d7-9bd7-c39bf23d2dba",
			"bfdb8eef-9c29-11b1-9dad-c379636f7270", "be0bbbb5-9c29-11b1-9dad-c379636f7270",
			"c0f012ac-9c29-11b1-9dad-c379636f7270", "c0279a99-9c29-11b1-9dad-c379636f7270",
			"c0a79513-9c29-11b1-9dad-c379636f7270", "c09f6ac3-9c29-11b1-9dad-c379636f7270",
			"bedc09ec-9c29-11b1-9dad-c379636f7270", "bf3429c5-9c29-11b1-9dad-c379636f7270",
			"be4dd7f1-9c29-11b1-9dad-c379636f7270", "c001e2b4-9c29-11b1-9dad-c379636f7270",
			"c086cb66-9c29-11b1-9dad-c379636f7270", "be659d62-9c29-11b1-9dad-c379636f7270",
			"c0bb3413-9c29-11b1-9dad-c379636f7270", "bdd3d5ea-9c29-11b1-9dad-c379636f7270",
			"bfefebaf-9c29-11b1-9dad-c379636f7270", "be4b53f2-9c29-11b1-9dad-c379636f7270",
			"bdb6e7e8-9c29-11b1-9dad-c379636f7270", "c0328561-9c29-11b1-9dad-c379636f7270",
			"be0d3c4c-9c29-11b1-9dad-c379636f7270", "bfad6be8-9c29-11b1-9dad-c379636f7270",
			"be667f85-9c29-11b1-9dad-c379636f7270", "bdcd7ea7-9c29-11b1-9dad-c379636f7270",
			"bdd50606-9c29-11b1-9dad-c379636f7270", "bef7ed88-9c29-11b1-9dad-c379636f7270",
			"b52c8232-8e5b-41d8-8abd-b16baad462a7", "bd58d6ab-9c29-11b1-9dad-c379636f7270",
			"bf64a755-9c29-11b1-9dad-c379636f7270", "bd5880f1-9c29-11b1-9dad-c379636f7270",
			"bebe2068-9c29-11b1-9dad-c379636f7270", "f5c35092-90c7-11d9-9489-0002b35bb117",
			"c13bc0c4-9c29-11b1-9dad-c379636f7270", "b9000472-c301-11d9-8d69-0002b3891c29",
			"b9000473-c301-11d9-8d69-0002b3891c29", "c11bb004-9c29-11b1-9dad-c379636f7270",
			"bd5db814-9c29-11b1-9dad-c379636f7270", "c03d1910-9c29-11b1-9dad-c379636f7270",
			"c0a63548-9c29-11b1-9dad-c379636f7270", "be83f745-9c29-11b1-9dad-c379636f7270",
			"bead825d-9c29-11b1-9dad-c379636f7270", "c8ac46a3-e7a2-11d6-8e5b-0002b34c7c9f",
			"c0fb9be2-9c29-11b1-9dad-c379636f7270", "c10b559a-9c29-11b1-9dad-c379636f7270",
			"d52a7d04-50ab-11d6-8000-00a0c9da2002", "c2eb72a1-13dd-11d8-9e44-0002b3988fc4",
			"c0f527fc-9c29-11b1-9dad-c379636f7270", "bd903ed3-9c29-11b1-9dad-c379636f7270",
			"c06337a2-9c29-11b1-9dad-c379636f7270", "c1164bb8-9c29-11b1-9dad-c379636f7270",
			"c0e2af4e-9c29-11b1-9dad-c379636f7270", "bece6da2-9c29-11b1-9dad-c379636f7270",
			"bdf02d74-9c29-11b1-9dad-c379636f7270", "51bacf6a-4621-41d8-903f-8618675219cb",
			"bd5880e4-9c29-11b1-9dad-c379636f7270", "c10af5e7-9c29-11b1-9dad-c379636f7270",
			"c10af932-9c29-11b1-9dad-c379636f7270", "c10ae7b8-9c29-11b1-9dad-c379636f7270",
			"bd5880f6-9c29-11b1-9dad-c379636f7270", "c12157ff-9c29-11b1-9dad-c379636f7270",
			"bfe2070f-9c29-11b1-9dad-c379636f7270", "c03b87b7-9c29-11b1-9dad-c379636f7270",
			"be3a8699-9c29-11b1-9dad-c379636f7270", "c09c8637-9c29-11b1-9dad-c379636f7270",
			"bd5900c1-9c29-11b1-9dad-c379636f7270", "be1e5136-9c29-11b1-9dad-c379636f7270",
			"bde7f9f2-9c29-11b1-9dad-c379636f7270" };

	private static String[] SORTED_EXAMPLE_CORE_GUIDS = { "0c5a7576-0f94-11d6-8000-0050dab92c2f",
			"80605b12-436e-11d6-8000-00a0c9da2002", "fe9fcdd0-4370-11d6-8000-00a0c9da2002",
			"01031bea-4371-11d6-8000-00a0c9da2002", "055544a2-4371-11d6-8000-00a0c9da2002",
			"86c1dc8a-50aa-11d6-8000-00a0c9da2002", "d52a7d04-50ab-11d6-8000-00a0c9da2002",
			"c2444102-5943-11d6-8000-0002b364be7b", "c2a37e88-5943-11d6-8000-0002b364be7b",
			"bf68c010-594e-11d6-8000-0002b364be7b", "68330840-5ed1-11d6-8000-0002b364be7b",
			"8f7d6628-8a1b-11d6-8000-00902794f506", "d73532c0-8a1b-11d6-8000-00902794f506",
			"ee9f744c-8a1c-11d6-8000-00902794f506", "f0cee806-8a1c-11d6-8000-00902794f506",
			"f3b2506c-8a1c-11d6-8000-00902794f506", "1efb39f0-8a1d-11d6-8000-00902794f506",
			"21894e1e-8a1d-11d6-8000-00902794f506", "2318a806-8a1d-11d6-8000-00902794f506",
			"24976690-8a1d-11d6-8000-00902794f506", "26ad75a0-8a1d-11d6-8000-00902794f506",
			"f0bd8878-c427-11d6-8000-00a0c9c6d1c3", "4cba0caa-e982-11d9-8000-0002b3a85b8f",
			"0a0172da-e983-11d9-8000-0002b3a85b8f", "a774ee10-e984-11d9-8000-0002b3a85b8f",
			"ac71e362-8918-11da-8000-0002b3620a69", "6d2dfb33-56ce-11d6-8227-0002b34c7c9f",
			"6d2e2240-56ce-11d6-8227-0002b34c7c9f", "dff47935-4da2-11d6-82c0-0002b34c7c9f",
			"dff47936-4da2-11d6-82c0-0002b34c7c9f", "dff47937-4da2-11d6-82c0-0002b34c7c9f",
			"dff47938-4da2-11d6-82c0-0002b34c7c9f", "dff4a041-4da2-11d6-82c0-0002b34c7c9f",
			"dff4a042-4da2-11d6-82c0-0002b34c7c9f", "df8d60c3-eb94-11d6-82ee-0002b34c7c9f",
			"df8d60c4-eb94-11d6-82ee-0002b34c7c9f", "df8d87d0-eb94-11d6-82ee-0002b34c7c9f",
			"df8d87d2-eb94-11d6-82ee-0002b34c7c9f", "df8d87d4-eb94-11d6-82ee-0002b34c7c9f",
			"e416edc1-758f-11d7-846c-0002b3a85c8d", "e416edc2-758f-11d7-846c-0002b3a85c8d",
			"e416edc3-758f-11d7-846c-0002b3a85c8d", "059be375-39b0-11d9-8528-0007e9162f51",
			"059c0a80-39b0-11d9-8528-0007e9162f51", "059c0a82-39b0-11d9-8528-0007e9162f51",
			"059c0a85-39b0-11d9-8528-0007e9162f51", "059c0a87-39b0-11d9-8528-0007e9162f51",
			"bcb003f3-aac9-11d8-85bd-0002b35bb117", "bce8a0b1-8ac9-11d6-864b-0002b364be7b",
			"ff947d33-963a-11d7-866f-0002b34c7c9f", "ff947d34-963a-11d7-866f-0002b34c7c9f",
			"94f07021-8b0d-11d7-8701-0002b3a8515d", "34349377-cb63-11d6-878a-0002b34c7c9f",
			"834eac32-86a4-11d9-88d7-0002b35bb117", "49800302-2475-11d9-88f9-0002b35bb117",
			"49800303-2475-11d9-88f9-0002b35bb117", "49802a10-2475-11d9-88f9-0002b35bb117",
			"aab60111-ab44-11d8-897d-0002b35bb117", "abb96eb5-e798-11d6-8ac9-0002b3a333c3",
			"fe7e4d83-d86f-11d9-8ba5-0002b3891c1f", "8681b272-6c71-11d7-8bb8-0002b3a331d6",
			"8681b273-6c71-11d7-8bb8-0002b3a331d6", "0d6aa652-5866-11d6-8be9-00902794f506",
			"b9000472-c301-11d9-8d69-0002b3891c29", "b9000473-c301-11d9-8d69-0002b3891c29",
			"ce1e10e1-ec3f-11d6-8d83-0002b34c7c9f", "ce1e10e5-ec3f-11d6-8d83-0002b34c7c9f",
			"ce1e10e6-ec3f-11d6-8d83-0002b34c7c9f", "ce1e37f0-ec3f-11d6-8d83-0002b34c7c9f",
			"badbedd1-1ebc-11d8-8dde-0002b3988fc4", "e25a50a1-64dd-11d9-8e37-0002b35bb117",
			"c8ac46a3-e7a2-11d6-8e5b-0002b34c7c9f", "7087d921-0e2c-11d7-8f1a-0002b35bb117",
			"b8f9e0a4-27d5-11d7-9168-0002b34c7c9f", "0ccf9a20-d1a5-11d7-91aa-0002b3a8515d",
			"a8462735-532a-11d6-9228-0002b34c7c9f", "47537942-331d-11d7-922f-0002b3a333c3",
			"47537943-331d-11d7-922f-0002b3a333c3", "46c5b240-c2a6-11d7-92d4-0002b3a333c3",
			"90ea97a6-a536-11d8-938a-0002b3988fc4", "a988bc62-6e2b-11d9-93ac-0002b35bb117",
			"43806c82-6e4c-11d9-93ac-0007e916336c", "43806c83-6e4c-11d9-93ac-0007e916336c",
			"43806c84-6e4c-11d9-93ac-0007e916336c", "43806c85-6e4c-11d9-93ac-0007e916336c",
			"43806c86-6e4c-11d9-93ac-0007e916336c", "43806c87-6e4c-11d9-93ac-0007e916336c",
			"43809390-6e4c-11d9-93ac-0007e916336c", "6dd2e092-b027-11d9-93b3-0002b35bb117",
			"6dd2e093-b027-11d9-93b3-0002b35bb117", "5dcd30b0-4493-11d9-93ca-0002b35bb117",
			"5dcd30b1-4493-11d9-93ca-0002b35bb117", "f5c35092-90c7-11d9-9489-0002b35bb117",
			"661b7831-ab3d-11d7-956f-0007e90d9be3", "661b7832-ab3d-11d7-956f-0007e90d9be3",
			"661b7833-ab3d-11d7-956f-0007e90d9be3", "661b7834-ab3d-11d7-956f-0007e90d9be3",
			"661b7835-ab3d-11d7-956f-0007e90d9be3", "bae22f21-243d-11d8-9840-0002b3988fc4",
			"0548d243-4342-11d7-9851-0002b34c7c9f", "0548f950-4342-11d7-9851-0002b34c7c9f",
			"189f0aec-a012-11d6-993c-0002b34c7c9f", "9e98b4f1-773c-11d7-9996-0002b34c7c9f",
			"55b05522-f7e2-11da-99f7-0002b3988fc4", "a77033a4-fc81-11da-99f8-0002b3988fc4",
			"33f8cc41-9281-11d9-9ad4-0002b35bb117", "68ea1372-2f6a-11d9-9ae0-0002b35bb117",
			"5f448121-4362-11d7-9b8e-0002b34c7c9f", "6837d2e2-8c0e-11d9-9cdd-0002b35bb117",
			"6837f9f0-8c0e-11d9-9cdd-0002b35bb117", "74182065-dce5-11d9-9d50-0007e9162f51",
			"bd588002-9c29-11b1-9dad-c379636f7270", "bd58803c-9c29-11b1-9dad-c379636f7270",
			"bd58803d-9c29-11b1-9dad-c379636f7270", "bd58803e-9c29-11b1-9dad-c379636f7270",
			"bd588068-9c29-11b1-9dad-c379636f7270", "bd58806a-9c29-11b1-9dad-c379636f7270",
			"bd588098-9c29-11b1-9dad-c379636f7270", "bd5880a0-9c29-11b1-9dad-c379636f7270",
			"bd5880a6-9c29-11b1-9dad-c379636f7270", "bd5880a7-9c29-11b1-9dad-c379636f7270",
			"bd5880aa-9c29-11b1-9dad-c379636f7270", "bd5880ab-9c29-11b1-9dad-c379636f7270",
			"bd5880ac-9c29-11b1-9dad-c379636f7270", "bd5880ae-9c29-11b1-9dad-c379636f7270",
			"bd5880af-9c29-11b1-9dad-c379636f7270", "bd5880b2-9c29-11b1-9dad-c379636f7270",
			"bd5880b9-9c29-11b1-9dad-c379636f7270", "bd5880ba-9c29-11b1-9dad-c379636f7270",
			"bd5880bd-9c29-11b1-9dad-c379636f7270", "bd5880c1-9c29-11b1-9dad-c379636f7270",
			"bd5880c9-9c29-11b1-9dad-c379636f7270", "bd5880cc-9c29-11b1-9dad-c379636f7270",
			"bd5880cd-9c29-11b1-9dad-c379636f7270", "bd5880ce-9c29-11b1-9dad-c379636f7270",
			"bd5880cf-9c29-11b1-9dad-c379636f7270", "bd5880d3-9c29-11b1-9dad-c379636f7270",
			"bd5880d5-9c29-11b1-9dad-c379636f7270", "bd5880d6-9c29-11b1-9dad-c379636f7270",
			"bd5880d8-9c29-11b1-9dad-c379636f7270", "bd5880d9-9c29-11b1-9dad-c379636f7270",
			"bd5880da-9c29-11b1-9dad-c379636f7270", "bd5880e0-9c29-11b1-9dad-c379636f7270",
			"bd5880e2-9c29-11b1-9dad-c379636f7270", "bd5880e3-9c29-11b1-9dad-c379636f7270",
			"bd5880e4-9c29-11b1-9dad-c379636f7270", "bd5880e5-9c29-11b1-9dad-c379636f7270",
			"bd5880eb-9c29-11b1-9dad-c379636f7270", "bd5880ed-9c29-11b1-9dad-c379636f7270",
			"bd5880ee-9c29-11b1-9dad-c379636f7270", "bd5880ef-9c29-11b1-9dad-c379636f7270",
			"bd5880f1-9c29-11b1-9dad-c379636f7270", "bd5880f4-9c29-11b1-9dad-c379636f7270",
			"bd5880f6-9c29-11b1-9dad-c379636f7270", "bd5880f7-9c29-11b1-9dad-c379636f7270",
			"bd5880f8-9c29-11b1-9dad-c379636f7270", "bd5880f9-9c29-11b1-9dad-c379636f7270",
			"bd5880fa-9c29-11b1-9dad-c379636f7270", "bd5880fb-9c29-11b1-9dad-c379636f7270",
			"bd5880fe-9c29-11b1-9dad-c379636f7270", "bd5880ff-9c29-11b1-9dad-c379636f7270",
			"bd588100-9c29-11b1-9dad-c379636f7270", "bd588101-9c29-11b1-9dad-c379636f7270",
			"bd588102-9c29-11b1-9dad-c379636f7270", "bd588104-9c29-11b1-9dad-c379636f7270",
			"bd588106-9c29-11b1-9dad-c379636f7270", "bd588107-9c29-11b1-9dad-c379636f7270",
			"bd588109-9c29-11b1-9dad-c379636f7270", "bd58810b-9c29-11b1-9dad-c379636f7270",
			"bd58810e-9c29-11b1-9dad-c379636f7270", "bd588111-9c29-11b1-9dad-c379636f7270",
			"bd588113-9c29-11b1-9dad-c379636f7270", "bd588114-9c29-11b1-9dad-c379636f7270",
			"bd588115-9c29-11b1-9dad-c379636f7270", "bd588116-9c29-11b1-9dad-c379636f7270",
			"bd588117-9c29-11b1-9dad-c379636f7270", "bd588118-9c29-11b1-9dad-c379636f7270",
			"bd58825b-9c29-11b1-9dad-c379636f7270", "bd58829b-9c29-11b1-9dad-c379636f7270",
			"bd588471-9c29-11b1-9dad-c379636f7270", "bd588b1d-9c29-11b1-9dad-c379636f7270",
			"bd58915a-9c29-11b1-9dad-c379636f7270", "bd5892ab-9c29-11b1-9dad-c379636f7270",
			"bd5892af-9c29-11b1-9dad-c379636f7270", "bd589408-9c29-11b1-9dad-c379636f7270",
			"bd589695-9c29-11b1-9dad-c379636f7270", "bd5897dd-9c29-11b1-9dad-c379636f7270",
			"bd589a1d-9c29-11b1-9dad-c379636f7270", "bd589d90-9c29-11b1-9dad-c379636f7270",
			"bd589e12-9c29-11b1-9dad-c379636f7270", "bd589ed9-9c29-11b1-9dad-c379636f7270",
			"bd58a4f1-9c29-11b1-9dad-c379636f7270", "bd58a571-9c29-11b1-9dad-c379636f7270",
			"bd58a644-9c29-11b1-9dad-c379636f7270", "bd58af89-9c29-11b1-9dad-c379636f7270",
			"bd58b833-9c29-11b1-9dad-c379636f7270", "bd58b8ba-9c29-11b1-9dad-c379636f7270",
			"bd58b8c3-9c29-11b1-9dad-c379636f7270", "bd58b9f9-9c29-11b1-9dad-c379636f7270",
			"bd58ba7a-9c29-11b1-9dad-c379636f7270", "bd58ba7e-9c29-11b1-9dad-c379636f7270",
			"bd58bf69-9c29-11b1-9dad-c379636f7270", "bd58c0a5-9c29-11b1-9dad-c379636f7270",
			"bd58c0ef-9c29-11b1-9dad-c379636f7270", "bd58c131-9c29-11b1-9dad-c379636f7270",
			"bd58c170-9c29-11b1-9dad-c379636f7270", "bd58c1ad-9c29-11b1-9dad-c379636f7270",
			"bd58c1f0-9c29-11b1-9dad-c379636f7270", "bd58c232-9c29-11b1-9dad-c379636f7270",
			"bd58c271-9c29-11b1-9dad-c379636f7270", "bd58c279-9c29-11b1-9dad-c379636f7270",
			"bd58c2bd-9c29-11b1-9dad-c379636f7270", "bd58c2f7-9c29-11b1-9dad-c379636f7270",
			"bd58c3fb-9c29-11b1-9dad-c379636f7270", "bd58c485-9c29-11b1-9dad-c379636f7270",
			"bd58c4c6-9c29-11b1-9dad-c379636f7270", "bd58c507-9c29-11b1-9dad-c379636f7270",
			"bd58c916-9c29-11b1-9dad-c379636f7270", "bd58ce5e-9c29-11b1-9dad-c379636f7270",
			"bd58d107-9c29-11b1-9dad-c379636f7270", "bd58d211-9c29-11b1-9dad-c379636f7270",
			"bd58d637-9c29-11b1-9dad-c379636f7270", "bd58d679-9c29-11b1-9dad-c379636f7270",
			"bd58d6ab-9c29-11b1-9dad-c379636f7270", "bd58d6b3-9c29-11b1-9dad-c379636f7270",
			"bd58d6f3-9c29-11b1-9dad-c379636f7270", "bd58d7f6-9c29-11b1-9dad-c379636f7270",
			"bd58da02-9c29-11b1-9dad-c379636f7270", "bd58dcda-9c29-11b1-9dad-c379636f7270",
			"bd58e0e2-9c29-11b1-9dad-c379636f7270", "bd58e0ec-9c29-11b1-9dad-c379636f7270",
			"bd58e124-9c29-11b1-9dad-c379636f7270", "bd58e163-9c29-11b1-9dad-c379636f7270",
			"bd58e1a5-9c29-11b1-9dad-c379636f7270", "bd58e1fc-9c29-11b1-9dad-c379636f7270",
			"bd58e3ba-9c29-11b1-9dad-c379636f7270", "bd58e476-9c29-11b1-9dad-c379636f7270",
			"bd58e5fd-9c29-11b1-9dad-c379636f7270", "bd58f042-9c29-11b1-9dad-c379636f7270",
			"bd58f080-9c29-11b1-9dad-c379636f7270", "bd58f7f9-9c29-11b1-9dad-c379636f7270",
			"bd58f87a-9c29-11b1-9dad-c379636f7270", "bd58f8bc-9c29-11b1-9dad-c379636f7270",
			"bd58f8fe-9c29-11b1-9dad-c379636f7270", "bd5900c1-9c29-11b1-9dad-c379636f7270",
			"bd59083a-9c29-11b1-9dad-c379636f7270", "bd59086c-9c29-11b1-9dad-c379636f7270",
			"bd590951-9c29-11b1-9dad-c379636f7270", "bd590c98-9c29-11b1-9dad-c379636f7270",
			"bd595e7e-9c29-11b1-9dad-c379636f7270", "bd5a142d-9c29-11b1-9dad-c379636f7270",
			"bd5ad700-9c29-11b1-9dad-c379636f7270", "bd5b4951-9c29-11b1-9dad-c379636f7270",
			"bd5b6d60-9c29-11b1-9dad-c379636f7270", "bd5b97f9-9c29-11b1-9dad-c379636f7270",
			"bd5bae9a-9c29-11b1-9dad-c379636f7270", "bd5c0498-9c29-11b1-9dad-c379636f7270",
			"bd5c40b0-9c29-11b1-9dad-c379636f7270", "bd5c44e1-9c29-11b1-9dad-c379636f7270",
			"bd5c548a-9c29-11b1-9dad-c379636f7270", "bd5c5e99-9c29-11b1-9dad-c379636f7270",
			"bd5d0b56-9c29-11b1-9dad-c379636f7270", "bd5d7783-9c29-11b1-9dad-c379636f7270",
			"bd5db814-9c29-11b1-9dad-c379636f7270", "bd5dbcd4-9c29-11b1-9dad-c379636f7270",
			"bd5de44c-9c29-11b1-9dad-c379636f7270", "bd5e7a9e-9c29-11b1-9dad-c379636f7270",
			"bd601781-9c29-11b1-9dad-c379636f7270", "bd60a887-9c29-11b1-9dad-c379636f7270",
			"bd60e145-9c29-11b1-9dad-c379636f7270", "bd610a5c-9c29-11b1-9dad-c379636f7270",
			"bd61886b-9c29-11b1-9dad-c379636f7270", "bd61ec34-9c29-11b1-9dad-c379636f7270",
			"bd63a0ce-9c29-11b1-9dad-c379636f7270", "bd63d3ad-9c29-11b1-9dad-c379636f7270",
			"bd63f343-9c29-11b1-9dad-c379636f7270", "bd6422c8-9c29-11b1-9dad-c379636f7270",
			"bd6449a2-9c29-11b1-9dad-c379636f7270", "bd651c1b-9c29-11b1-9dad-c379636f7270",
			"bd654be7-9c29-11b1-9dad-c379636f7270", "bd6561fc-9c29-11b1-9dad-c379636f7270",
			"bd65cd99-9c29-11b1-9dad-c379636f7270", "bd66e0a4-9c29-11b1-9dad-c379636f7270",
			"bd671c2d-9c29-11b1-9dad-c379636f7270", "bd674278-9c29-11b1-9dad-c379636f7270",
			"bd678812-9c29-11b1-9dad-c379636f7270", "bd67e911-9c29-11b1-9dad-c379636f7270",
			"bd681463-9c29-11b1-9dad-c379636f7270", "bd682bdd-9c29-11b1-9dad-c379636f7270",
			"bd6a2d94-9c29-11b1-9dad-c379636f7270", "bd7183b0-9c29-11b1-9dad-c379636f7270",
			"bd757df1-9c29-11b1-9dad-c379636f7270", "bd79c885-9c29-11b1-9dad-c379636f7270",
			"bd7d5373-9c29-11b1-9dad-c379636f7270", "bd84623c-9c29-11b1-9dad-c379636f7270",
			"bd84dac3-9c29-11b1-9dad-c379636f7270", "bd84df32-9c29-11b1-9dad-c379636f7270",
			"bd8a163e-9c29-11b1-9dad-c379636f7270", "bd8dbbc3-9c29-11b1-9dad-c379636f7270",
			"bd903ed3-9c29-11b1-9dad-c379636f7270", "bd913dca-9c29-11b1-9dad-c379636f7270",
			"bd91b03d-9c29-11b1-9dad-c379636f7270", "bd95395a-9c29-11b1-9dad-c379636f7270",
			"bd9733c2-9c29-11b1-9dad-c379636f7270", "bd97e378-9c29-11b1-9dad-c379636f7270",
			"bd992179-9c29-11b1-9dad-c379636f7270", "bda06d71-9c29-11b1-9dad-c379636f7270",
			"bda09fc2-9c29-11b1-9dad-c379636f7270", "bda0e43c-9c29-11b1-9dad-c379636f7270",
			"bda16220-9c29-11b1-9dad-c379636f7270", "bda21728-9c29-11b1-9dad-c379636f7270",
			"bda887b6-9c29-11b1-9dad-c379636f7270", "bdaa4b0e-9c29-11b1-9dad-c379636f7270",
			"bdadcbf0-9c29-11b1-9dad-c379636f7270", "bdb09014-9c29-11b1-9dad-c379636f7270",
			"bdb0bfbf-9c29-11b1-9dad-c379636f7270", "bdb6e7e8-9c29-11b1-9dad-c379636f7270",
			"bdb7f18f-9c29-11b1-9dad-c379636f7270", "bdb8721b-9c29-11b1-9dad-c379636f7270",
			"bdc36538-9c29-11b1-9dad-c379636f7270", "bdc438fd-9c29-11b1-9dad-c379636f7270",
			"bdc98c81-9c29-11b1-9dad-c379636f7270", "bdc9fb94-9c29-11b1-9dad-c379636f7270",
			"bdca5506-9c29-11b1-9dad-c379636f7270", "bdcc8689-9c29-11b1-9dad-c379636f7270",
			"bdcc9f7c-9c29-11b1-9dad-c379636f7270", "bdcd7ea7-9c29-11b1-9dad-c379636f7270",
			"bdd3d5ea-9c29-11b1-9dad-c379636f7270", "bdd50606-9c29-11b1-9dad-c379636f7270",
			"bdd9d485-9c29-11b1-9dad-c379636f7270", "bdda1e3f-9c29-11b1-9dad-c379636f7270",
			"bddb0a48-9c29-11b1-9dad-c379636f7270", "bddd55a1-9c29-11b1-9dad-c379636f7270",
			"bdde7fe1-9c29-11b1-9dad-c379636f7270", "bddef55a-9c29-11b1-9dad-c379636f7270",
			"bde212ef-9c29-11b1-9dad-c379636f7270", "bde38eeb-9c29-11b1-9dad-c379636f7270",
			"bde495da-9c29-11b1-9dad-c379636f7270", "bde5ec9c-9c29-11b1-9dad-c379636f7270",
			"bde7f9f2-9c29-11b1-9dad-c379636f7270", "bde87324-9c29-11b1-9dad-c379636f7270",
			"bdf02d74-9c29-11b1-9dad-c379636f7270", "bdf7cb82-9c29-11b1-9dad-c379636f7270",
			"bdf8edae-9c29-11b1-9dad-c379636f7270", "bdfb7dd0-9c29-11b1-9dad-c379636f7270",
			"bdfdf4b1-9c29-11b1-9dad-c379636f7270", "be00bf6e-9c29-11b1-9dad-c379636f7270",
			"be01286a-9c29-11b1-9dad-c379636f7270", "be0a552b-9c29-11b1-9dad-c379636f7270",
			"be0bbbb5-9c29-11b1-9dad-c379636f7270", "be0d3c4c-9c29-11b1-9dad-c379636f7270",
			"be144cd1-9c29-11b1-9dad-c379636f7270", "be18e693-9c29-11b1-9dad-c379636f7270",
			"be1ac327-9c29-11b1-9dad-c379636f7270", "be1c3220-9c29-11b1-9dad-c379636f7270",
			"be1d78c8-9c29-11b1-9dad-c379636f7270", "be1e5136-9c29-11b1-9dad-c379636f7270",
			"be1f1654-9c29-11b1-9dad-c379636f7270", "be27a8ec-9c29-11b1-9dad-c379636f7270",
			"be2e0d29-9c29-11b1-9dad-c379636f7270", "be2e94bb-9c29-11b1-9dad-c379636f7270",
			"be2eb4e1-9c29-11b1-9dad-c379636f7270", "be31edd4-9c29-11b1-9dad-c379636f7270",
			"be34dcb7-9c29-11b1-9dad-c379636f7270", "be35d1f9-9c29-11b1-9dad-c379636f7270",
			"be3a8699-9c29-11b1-9dad-c379636f7270", "be4425ef-9c29-11b1-9dad-c379636f7270",
			"be4b53f2-9c29-11b1-9dad-c379636f7270", "be4dd7f1-9c29-11b1-9dad-c379636f7270",
			"be4ef62a-9c29-11b1-9dad-c379636f7270", "be59c5cb-9c29-11b1-9dad-c379636f7270",
			"be5d9e9f-9c29-11b1-9dad-c379636f7270", "be659d62-9c29-11b1-9dad-c379636f7270",
			"be667f85-9c29-11b1-9dad-c379636f7270", "be6735cd-9c29-11b1-9dad-c379636f7270",
			"be717e09-9c29-11b1-9dad-c379636f7270", "be7266e4-9c29-11b1-9dad-c379636f7270",
			"be75c8f9-9c29-11b1-9dad-c379636f7270", "be760011-9c29-11b1-9dad-c379636f7270",
			"be7f041b-9c29-11b1-9dad-c379636f7270", "be81b28d-9c29-11b1-9dad-c379636f7270",
			"be83f745-9c29-11b1-9dad-c379636f7270", "be8f47a3-9c29-11b1-9dad-c379636f7270",
			"be90c21d-9c29-11b1-9dad-c379636f7270", "be920bae-9c29-11b1-9dad-c379636f7270",
			"be92128d-9c29-11b1-9dad-c379636f7270", "be9af14f-9c29-11b1-9dad-c379636f7270",
			"be9be955-9c29-11b1-9dad-c379636f7270", "be9e0a7c-9c29-11b1-9dad-c379636f7270",
			"bea12384-9c29-11b1-9dad-c379636f7270", "bea64551-9c29-11b1-9dad-c379636f7270",
			"beaa3d29-9c29-11b1-9dad-c379636f7270", "beaa9284-9c29-11b1-9dad-c379636f7270",
			"beaad779-9c29-11b1-9dad-c379636f7270", "beab79ec-9c29-11b1-9dad-c379636f7270",
			"beab9388-9c29-11b1-9dad-c379636f7270", "bead825d-9c29-11b1-9dad-c379636f7270",
			"beaed5bd-9c29-11b1-9dad-c379636f7270", "beb5aba2-9c29-11b1-9dad-c379636f7270",
			"beb7f074-9c29-11b1-9dad-c379636f7270", "bebd5604-9c29-11b1-9dad-c379636f7270",
			"bebe2068-9c29-11b1-9dad-c379636f7270", "bebece64-9c29-11b1-9dad-c379636f7270",
			"bec28bcc-9c29-11b1-9dad-c379636f7270", "becd79d2-9c29-11b1-9dad-c379636f7270",
			"bece6da2-9c29-11b1-9dad-c379636f7270", "becf783a-9c29-11b1-9dad-c379636f7270",
			"bed06ab6-9c29-11b1-9dad-c379636f7270", "bed22fb8-9c29-11b1-9dad-c379636f7270",
			"bed50053-9c29-11b1-9dad-c379636f7270", "bedc09ec-9c29-11b1-9dad-c379636f7270",
			"bee22d3d-9c29-11b1-9dad-c379636f7270", "bee356be-9c29-11b1-9dad-c379636f7270",
			"bee52c1c-9c29-11b1-9dad-c379636f7270", "bee5923d-9c29-11b1-9dad-c379636f7270",
			"bee6e76c-9c29-11b1-9dad-c379636f7270", "beed06de-9c29-11b1-9dad-c379636f7270",
			"beee8a4d-9c29-11b1-9dad-c379636f7270", "bef7ed88-9c29-11b1-9dad-c379636f7270",
			"befd1881-9c29-11b1-9dad-c379636f7270", "beff1a9a-9c29-11b1-9dad-c379636f7270",
			"bf05e63f-9c29-11b1-9dad-c379636f7270", "bf0a336e-9c29-11b1-9dad-c379636f7270",
			"bf0f7037-9c29-11b1-9dad-c379636f7270", "bf12c7c3-9c29-11b1-9dad-c379636f7270",
			"bf136680-9c29-11b1-9dad-c379636f7270", "bf192b1e-9c29-11b1-9dad-c379636f7270",
			"bf1b7efc-9c29-11b1-9dad-c379636f7270", "bf1d7fe4-9c29-11b1-9dad-c379636f7270",
			"bf1eedc8-9c29-11b1-9dad-c379636f7270", "bf1f951d-9c29-11b1-9dad-c379636f7270",
			"bf26025d-9c29-11b1-9dad-c379636f7270", "bf2a766d-9c29-11b1-9dad-c379636f7270",
			"bf2b937c-9c29-11b1-9dad-c379636f7270", "bf3429c5-9c29-11b1-9dad-c379636f7270",
			"bf3491c4-9c29-11b1-9dad-c379636f7270", "bf364d35-9c29-11b1-9dad-c379636f7270",
			"bf3a978c-9c29-11b1-9dad-c379636f7270", "bf411eed-9c29-11b1-9dad-c379636f7270",
			"bf476137-9c29-11b1-9dad-c379636f7270", "bf4dc2b8-9c29-11b1-9dad-c379636f7270",
			"bf4fcfa6-9c29-11b1-9dad-c379636f7270", "bf4ff31b-9c29-11b1-9dad-c379636f7270",
			"bf54071c-9c29-11b1-9dad-c379636f7270", "bf576a31-9c29-11b1-9dad-c379636f7270",
			"bf5cb2c0-9c29-11b1-9dad-c379636f7270", "bf64a755-9c29-11b1-9dad-c379636f7270",
			"bf660e73-9c29-11b1-9dad-c379636f7270", "bf68e241-9c29-11b1-9dad-c379636f7270",
			"bf6d1d3a-9c29-11b1-9dad-c379636f7270", "bf74bd9c-9c29-11b1-9dad-c379636f7270",
			"bf761f19-9c29-11b1-9dad-c379636f7270", "bf77aa73-9c29-11b1-9dad-c379636f7270",
			"bf77bef5-9c29-11b1-9dad-c379636f7270", "bf7800bf-9c29-11b1-9dad-c379636f7270",
			"bf7a1c90-9c29-11b1-9dad-c379636f7270", "bf83203b-9c29-11b1-9dad-c379636f7270",
			"bf84f09d-9c29-11b1-9dad-c379636f7270", "bf8b47b8-9c29-11b1-9dad-c379636f7270",
			"bf8bdc58-9c29-11b1-9dad-c379636f7270", "bf8c47ad-9c29-11b1-9dad-c379636f7270",
			"bf8d1cd4-9c29-11b1-9dad-c379636f7270", "bf8d3988-9c29-11b1-9dad-c379636f7270",
			"bf9a6157-9c29-11b1-9dad-c379636f7270", "bfa067af-9c29-11b1-9dad-c379636f7270",
			"bfa4e9d2-9c29-11b1-9dad-c379636f7270", "bfa4fe8c-9c29-11b1-9dad-c379636f7270",
			"bfa699e0-9c29-11b1-9dad-c379636f7270", "bfab7ef3-9c29-11b1-9dad-c379636f7270",
			"bfac572e-9c29-11b1-9dad-c379636f7270", "bfad6be8-9c29-11b1-9dad-c379636f7270",
			"bfaf1b18-9c29-11b1-9dad-c379636f7270", "bfb0e3f0-9c29-11b1-9dad-c379636f7270",
			"bfbf40e9-9c29-11b1-9dad-c379636f7270", "bfc913a6-9c29-11b1-9dad-c379636f7270",
			"bfce95e7-9c29-11b1-9dad-c379636f7270", "bfcfa24f-9c29-11b1-9dad-c379636f7270",
			"bfd0a274-9c29-11b1-9dad-c379636f7270", "bfd54197-9c29-11b1-9dad-c379636f7270",
			"bfd86bf1-9c29-11b1-9dad-c379636f7270", "bfda366c-9c29-11b1-9dad-c379636f7270",
			"bfdb8eef-9c29-11b1-9dad-c379636f7270", "bfe0bb3f-9c29-11b1-9dad-c379636f7270",
			"bfe2070f-9c29-11b1-9dad-c379636f7270", "bfe6fd41-9c29-11b1-9dad-c379636f7270",
			"bfe6fe22-9c29-11b1-9dad-c379636f7270", "bfe7d31b-9c29-11b1-9dad-c379636f7270",
			"bfe9f22d-9c29-11b1-9dad-c379636f7270", "bfeb0c83-9c29-11b1-9dad-c379636f7270",
			"bfeb3d17-9c29-11b1-9dad-c379636f7270", "bfedab5d-9c29-11b1-9dad-c379636f7270",
			"bfefebaf-9c29-11b1-9dad-c379636f7270", "bff27115-9c29-11b1-9dad-c379636f7270",
			"bff3237a-9c29-11b1-9dad-c379636f7270", "bff476e8-9c29-11b1-9dad-c379636f7270",
			"bff82c25-9c29-11b1-9dad-c379636f7270", "c000f476-9c29-11b1-9dad-c379636f7270",
			"c001e2b4-9c29-11b1-9dad-c379636f7270", "c0054316-9c29-11b1-9dad-c379636f7270",
			"c00a42b9-9c29-11b1-9dad-c379636f7270", "c00d7a96-9c29-11b1-9dad-c379636f7270",
			"c010ce47-9c29-11b1-9dad-c379636f7270", "c0133726-9c29-11b1-9dad-c379636f7270",
			"c017ff79-9c29-11b1-9dad-c379636f7270", "c01d6e8d-9c29-11b1-9dad-c379636f7270",
			"c0224da2-9c29-11b1-9dad-c379636f7270", "c0279a99-9c29-11b1-9dad-c379636f7270",
			"c02b14f0-9c29-11b1-9dad-c379636f7270", "c03209e1-9c29-11b1-9dad-c379636f7270",
			"c0328561-9c29-11b1-9dad-c379636f7270", "c033ac24-9c29-11b1-9dad-c379636f7270",
			"c037affb-9c29-11b1-9dad-c379636f7270", "c0390e21-9c29-11b1-9dad-c379636f7270",
			"c03afa6d-9c29-11b1-9dad-c379636f7270", "c03b87b7-9c29-11b1-9dad-c379636f7270",
			"c03d1910-9c29-11b1-9dad-c379636f7270", "c03ec3ba-9c29-11b1-9dad-c379636f7270",
			"c04cad85-9c29-11b1-9dad-c379636f7270", "c04da45a-9c29-11b1-9dad-c379636f7270",
			"c052cf24-9c29-11b1-9dad-c379636f7270", "c05813b7-9c29-11b1-9dad-c379636f7270",
			"c05a7c46-9c29-11b1-9dad-c379636f7270", "c05e110e-9c29-11b1-9dad-c379636f7270",
			"c0604f82-9c29-11b1-9dad-c379636f7270", "c06337a2-9c29-11b1-9dad-c379636f7270",
			"c0659a2b-9c29-11b1-9dad-c379636f7270", "c0714577-9c29-11b1-9dad-c379636f7270",
			"c073820f-9c29-11b1-9dad-c379636f7270", "c0739142-9c29-11b1-9dad-c379636f7270",
			"c076ff6d-9c29-11b1-9dad-c379636f7270", "c07a7946-9c29-11b1-9dad-c379636f7270",
			"c082ab98-9c29-11b1-9dad-c379636f7270", "c086cb66-9c29-11b1-9dad-c379636f7270",
			"c091e184-9c29-11b1-9dad-c379636f7270", "c0937fa3-9c29-11b1-9dad-c379636f7270",
			"c0960de2-9c29-11b1-9dad-c379636f7270", "c09a6e2f-9c29-11b1-9dad-c379636f7270",
			"c09c8637-9c29-11b1-9dad-c379636f7270", "c09f6ac3-9c29-11b1-9dad-c379636f7270",
			"c0a253f0-9c29-11b1-9dad-c379636f7270", "c0a383bd-9c29-11b1-9dad-c379636f7270",
			"c0a63548-9c29-11b1-9dad-c379636f7270", "c0a79513-9c29-11b1-9dad-c379636f7270",
			"c0a7cede-9c29-11b1-9dad-c379636f7270", "c0aa7393-9c29-11b1-9dad-c379636f7270",
			"c0ab9eda-9c29-11b1-9dad-c379636f7270", "c0ad3020-9c29-11b1-9dad-c379636f7270",
			"c0b2bc13-9c29-11b1-9dad-c379636f7270", "c0b4578f-9c29-11b1-9dad-c379636f7270",
			"c0b4950a-9c29-11b1-9dad-c379636f7270", "c0b541b6-9c29-11b1-9dad-c379636f7270",
			"c0ba0c32-9c29-11b1-9dad-c379636f7270", "c0bb3413-9c29-11b1-9dad-c379636f7270",
			"c0bf7a98-9c29-11b1-9dad-c379636f7270", "c0c3a8a2-9c29-11b1-9dad-c379636f7270",
			"c0c6b0d2-9c29-11b1-9dad-c379636f7270", "c0cc2458-9c29-11b1-9dad-c379636f7270",
			"c0cd0537-9c29-11b1-9dad-c379636f7270", "c0d211d2-9c29-11b1-9dad-c379636f7270",
			"c0d674bf-9c29-11b1-9dad-c379636f7270", "c0d6eb7b-9c29-11b1-9dad-c379636f7270",
			"c0e2af4e-9c29-11b1-9dad-c379636f7270", "c0e7247c-9c29-11b1-9dad-c379636f7270",
			"c0e85daa-9c29-11b1-9dad-c379636f7270", "c0edda9d-9c29-11b1-9dad-c379636f7270",
			"c0f012ac-9c29-11b1-9dad-c379636f7270", "c0f45a9c-9c29-11b1-9dad-c379636f7270",
			"c0f527fc-9c29-11b1-9dad-c379636f7270", "c0f63e9a-9c29-11b1-9dad-c379636f7270",
			"c0f93b23-9c29-11b1-9dad-c379636f7270", "c0fb9be2-9c29-11b1-9dad-c379636f7270",
			"c0fdc8ce-9c29-11b1-9dad-c379636f7270", "c0ff89be-9c29-11b1-9dad-c379636f7270",
			"c100289e-9c29-11b1-9dad-c379636f7270", "c1052107-9c29-11b1-9dad-c379636f7270",
			"c10569cb-9c29-11b1-9dad-c379636f7270", "c107fffb-9c29-11b1-9dad-c379636f7270",
			"c10ae4c2-9c29-11b1-9dad-c379636f7270", "c10ae7b8-9c29-11b1-9dad-c379636f7270",
			"c10af5e7-9c29-11b1-9dad-c379636f7270", "c10af932-9c29-11b1-9dad-c379636f7270",
			"c10b559a-9c29-11b1-9dad-c379636f7270", "c10c3008-9c29-11b1-9dad-c379636f7270",
			"c10c4394-9c29-11b1-9dad-c379636f7270", "c10c450d-9c29-11b1-9dad-c379636f7270",
			"c10e5735-9c29-11b1-9dad-c379636f7270", "c1164108-9c29-11b1-9dad-c379636f7270",
			"c1164bb8-9c29-11b1-9dad-c379636f7270", "c11bb004-9c29-11b1-9dad-c379636f7270",
			"c11c43c3-9c29-11b1-9dad-c379636f7270", "c12157ff-9c29-11b1-9dad-c379636f7270",
			"c1227621-9c29-11b1-9dad-c379636f7270", "c1237745-9c29-11b1-9dad-c379636f7270",
			"c128c4f1-9c29-11b1-9dad-c379636f7270", "c1299098-9c29-11b1-9dad-c379636f7270",
			"c129e5bc-9c29-11b1-9dad-c379636f7270", "c12bfd14-9c29-11b1-9dad-c379636f7270",
			"c12ea2ff-9c29-11b1-9dad-c379636f7270", "c130750e-9c29-11b1-9dad-c379636f7270",
			"c13181fd-9c29-11b1-9dad-c379636f7270", "c133531a-9c29-11b1-9dad-c379636f7270",
			"c135299e-9c29-11b1-9dad-c379636f7270", "c135fae1-9c29-11b1-9dad-c379636f7270",
			"c13bc0c4-9c29-11b1-9dad-c379636f7270", "c1416e20-9c29-11b1-9dad-c379636f7270",
			"c14862c2-9c29-11b1-9dad-c379636f7270", "f0f39521-8447-11d9-9df2-0002b3a85b0b",
			"c2eb72a1-13dd-11d8-9e44-0002b3988fc4", "a8a40d90-0d87-11d9-9e57-0002b35bb117",
			"a8a40d91-0d87-11d9-9e57-0002b35bb117", "a8a40d92-0d87-11d9-9e57-0002b35bb117",
			"a8a40d93-0d87-11d9-9e57-0002b35bb117", "a8a434a0-0d87-11d9-9e57-0002b35bb117",
			"a8a434a1-0d87-11d9-9e57-0002b35bb117", "a8a434a2-0d87-11d9-9e57-0002b35bb117",
			"a8a434a3-0d87-11d9-9e57-0002b35bb117", "a8a45bb0-0d87-11d9-9e57-0002b35bb117",
			"f7cf5a39-5224-11d6-9eb9-0002b34c7c9f", "892d2401-429b-11d7-9f12-0002b3a8515d",
			"892d2402-429b-11d7-9f12-0002b3a8515d", "11c73ba2-3d83-11d9-9f59-0002b35bb117",
			"986a6742-4a78-11d7-9f84-00a0c9c6d17e", "012ec430-107a-41d7-8201-fd0c6a33c4ae",
			"06085436-0ea8-41d7-8d78-c5027328b3c1", "0cdaac86-0ea9-41d7-9528-b5928f6b2cd6",
			"0dfc9bcc-108b-41d7-8ed7-edfd33b086ba", "0e49646c-0f31-41d7-9fbe-ee5fdcf84034",
			"122c8d92-1090-41d7-9e88-dccd46c00dee", "175dad78-557d-41d7-9305-ede135042ebb",
			"1a2afc8e-0ea8-41d7-86ad-9f138e1b142c", "1a83bf1a-033d-41d8-93a5-af525946d6ea",
			"1c0aeb26-d0ff-41d7-8df3-e0206d107204", "225afc46-0ea9-41d7-86ba-d6e6e606bcf4",
			"25ac90f0-1091-41d7-8ad2-e217e51d47b0", "290b90a8-033d-41d8-90bb-e6187b708fcc",
			"2eb3d286-1976-41d9-98a2-cd8854d31725", "2f961964-0ea8-41d7-9ea1-c9afdcc1aa56",
			"30a5f4a2-033d-41d8-8a13-caa49537da43", "3869b626-108e-41d7-9774-efcd2852455a",
			"39f93138-0ea9-41d7-9207-fe9aa15a65d3", "449c68f2-108a-41d7-85a4-d5be787da5b9",
			"4777d758-108c-41d7-866a-9ddb21242ea5", "48564780-0ea8-41d7-8f74-e07cb4469992",
			"4dde3f94-4621-41d8-9272-aca7bf883a76", "4fe874b8-0ea9-41d7-9a51-cb2aa8ac722d",
			"51bacf6a-4621-41d8-903f-8618675219cb", "523d56a0-1090-41d7-943c-b98ceb989643",
			"5a1c2052-0ea8-41d7-8354-8a1ca8c753f7", "5afd82ae-108d-41d7-877a-efcc1a027076",
			"5c261c00-0ea7-41d7-826e-cba509274611", "5faaf1f8-033d-41d8-9cc3-881c93115d39",
			"6198deea-121a-41d7-93eb-f77e2835bef0", "66a0d466-0ea9-41d7-8f21-ca6c303de0d0",
			"67ac42e4-033d-41d8-88b4-c5af6346a3c4", "6bbde2e0-12aa-41d7-97e2-d2cd8dde2280",
			"6cbc0e94-0ea7-41d7-8e09-eafe051a334c", "6e398450-033d-41d8-8a81-b80d939dc7a9",
			"6fe23318-0ea8-41d7-9648-9237f96c6632", "711dd8ca-108f-41d7-8ed2-b6714c417827",
			"71304bd0-033d-41d8-815a-9f1758b267de", "79fe2070-108b-41d7-8a84-e7fe8ea1df91",
			"7e0d7e6a-0ea9-41d7-9e9e-a5a533761768", "7e37800e-0ea7-41d7-9bd5-8065cb1a6b10",
			"7ee2de9c-033c-41d8-82f2-f5662a7ecac3", "83996144-033d-41d8-9e46-c8e929e84a03",
			"85413266-033c-41d8-8a3c-853470ebf355", "857cb040-0ea8-41d7-8639-c286b90192ba",
			"8a6b89b8-108e-41d7-8199-f8db46c58932", "8b1299ae-033d-41d8-9eb8-c7fc9b1aa271",
			"8c1989b2-0571-41d8-9fda-a54456cecbe8", "8e72d91e-0ea7-41d7-8f52-84ac7fcfa385",
			"913234d0-033c-41d8-8146-f33e6672d790", "93e9b082-0ea9-41d7-9217-e88c867d6e71",
			"995b3198-033c-41d8-866d-f7bdd1826285", "9af4b0d0-0ea8-41d7-88ee-e7da88c593cc",
			"9b44270a-1088-41d7-89d8-86187f50eac7", "9ea97dc4-0ea7-41d7-90cc-b17f20db96b6",
			"a71e1700-063f-41d7-9841-873d1ddc865a", "a9b8812a-1090-41d7-896d-e7aa9f9b941f",
			"aaaf2180-0ea9-41d7-8c78-f3d77408dd13", "ab7bb61a-2d61-41d7-9bd7-c39bf23d2dba",
			"aee9db98-0ea7-41d7-9387-bf0f0bd01e8b", "afd79f32-7125-41d7-81b3-e79de9003a36",
			"b01f3e4c-107b-41d7-89ac-d853a1ceea45", "b043ad1a-0ea8-41d7-8807-e4d7aad88a01",
			"b2c8b1b4-108f-41d7-9034-dceb94f7996a", "b463b9fc-1717-41d9-81f5-946e75d138e6",
			"b52c8232-8e5b-41d8-8abd-b16baad462a7", "b90f05c2-7be6-41d9-95dd-badfd8a6ba18",
			"b92626d0-94a5-41d9-8fdf-cc8d0e1bd018", "bf279d9c-0ea7-41d7-9fa4-d2954dda78a8",
			"c49488d4-a0de-41d7-8ede-9d605e6c951d", "c5b8bff0-0ea8-41d7-9330-a8d75dc13d41",
			"ced01936-acd6-41d7-80bd-aecc7431901b", "cee981ca-121a-41d7-9820-d2140528f40e",
			"cf645c7c-0ea7-41d7-8a80-ca222ce6bf52", "d30396de-108e-41d7-96f2-fb32dc881bce",
			"d32993c8-108b-41d7-943b-ee67ca30fba9", "d469217a-108d-41d7-8ce2-dad58b43f1c2",
			"d9f441a0-1219-41d7-9457-ebe7ee11dc3f", "de649fb0-0ea8-41d7-8ccb-f7a3fcedcd63",
			"df9f4728-0ea7-41d7-9612-a829907d2bf6", "eff743dc-0ea7-41d7-8246-cecc2e49beb0",
			"f0471674-1090-41d7-9d0f-ef2e9cd9fd4c", "f6f092d2-0ea8-41d7-8074-f74b3a1f4f8e" };

	private static String[] SORTED_EXAMPLE_GUIDS = { "0c5a7576-0f94-11d6-8000-0050dab92c2f",
			"80605b12-436e-11d6-8000-00a0c9da2002", "fe9fcdd0-4370-11d6-8000-00a0c9da2002",
			"01031bea-4371-11d6-8000-00a0c9da2002", "055544a2-4371-11d6-8000-00a0c9da2002",
			"86c1dc8a-50aa-11d6-8000-00a0c9da2002", "d52a7d04-50ab-11d6-8000-00a0c9da2002",
			"c2444102-5943-11d6-8000-0002b364be7b", "c2a37e88-5943-11d6-8000-0002b364be7b",
			"bf68c010-594e-11d6-8000-0002b364be7b", "68330840-5ed1-11d6-8000-0002b364be7b",
			"8f7d6628-8a1b-11d6-8000-00902794f506", "d73532c0-8a1b-11d6-8000-00902794f506",
			"ee9f744c-8a1c-11d6-8000-00902794f506", "f0cee806-8a1c-11d6-8000-00902794f506",
			"f3b2506c-8a1c-11d6-8000-00902794f506", "1efb39f0-8a1d-11d6-8000-00902794f506",
			"21894e1e-8a1d-11d6-8000-00902794f506", "2318a806-8a1d-11d6-8000-00902794f506",
			"24976690-8a1d-11d6-8000-00902794f506", "26ad75a0-8a1d-11d6-8000-00902794f506",
			"f0bd8878-c427-11d6-8000-00a0c9c6d1c3", "4cba0caa-e982-11d9-8000-0002b3a85b8f",
			"0a0172da-e983-11d9-8000-0002b3a85b8f", "a774ee10-e984-11d9-8000-0002b3a85b8f",
			"ac71e362-8918-11da-8000-0002b3620a69", "6d2dfb33-56ce-11d6-8227-0002b34c7c9f",
			"6d2e2240-56ce-11d6-8227-0002b34c7c9f", "dff47935-4da2-11d6-82c0-0002b34c7c9f",
			"dff47936-4da2-11d6-82c0-0002b34c7c9f", "dff47937-4da2-11d6-82c0-0002b34c7c9f",
			"dff47938-4da2-11d6-82c0-0002b34c7c9f", "dff4a041-4da2-11d6-82c0-0002b34c7c9f",
			"dff4a042-4da2-11d6-82c0-0002b34c7c9f", "df8d60c3-eb94-11d6-82ee-0002b34c7c9f",
			"df8d60c4-eb94-11d6-82ee-0002b34c7c9f", "df8d87d0-eb94-11d6-82ee-0002b34c7c9f",
			"df8d87d2-eb94-11d6-82ee-0002b34c7c9f", "df8d87d4-eb94-11d6-82ee-0002b34c7c9f",
			"e416edc1-758f-11d7-846c-0002b3a85c8d", "e416edc2-758f-11d7-846c-0002b3a85c8d",
			"e416edc3-758f-11d7-846c-0002b3a85c8d", "059be375-39b0-11d9-8528-0007e9162f51",
			"059c0a80-39b0-11d9-8528-0007e9162f51", "059c0a82-39b0-11d9-8528-0007e9162f51",
			"059c0a85-39b0-11d9-8528-0007e9162f51", "059c0a87-39b0-11d9-8528-0007e9162f51",
			"bcb003f3-aac9-11d8-85bd-0002b35bb117", "bce8a0b1-8ac9-11d6-864b-0002b364be7b",
			"ff947d33-963a-11d7-866f-0002b34c7c9f", "ff947d34-963a-11d7-866f-0002b34c7c9f",
			"94f07021-8b0d-11d7-8701-0002b3a8515d", "34349377-cb63-11d6-878a-0002b34c7c9f",
			"834eac32-86a4-11d9-88d7-0002b35bb117", "49800302-2475-11d9-88f9-0002b35bb117",
			"49800303-2475-11d9-88f9-0002b35bb117", "49802a10-2475-11d9-88f9-0002b35bb117",
			"aab60111-ab44-11d8-897d-0002b35bb117", "abb96eb5-e798-11d6-8ac9-0002b3a333c3",
			"fe7e4d83-d86f-11d9-8ba5-0002b3891c1f", "8681b272-6c71-11d7-8bb8-0002b3a331d6",
			"8681b273-6c71-11d7-8bb8-0002b3a331d6", "0d6aa652-5866-11d6-8be9-00902794f506",
			"b9000472-c301-11d9-8d69-0002b3891c29", "b9000473-c301-11d9-8d69-0002b3891c29",
			"ce1e10e1-ec3f-11d6-8d83-0002b34c7c9f", "ce1e10e5-ec3f-11d6-8d83-0002b34c7c9f",
			"ce1e10e6-ec3f-11d6-8d83-0002b34c7c9f", "ce1e37f0-ec3f-11d6-8d83-0002b34c7c9f",
			"badbedd1-1ebc-11d8-8dde-0002b3988fc4", "e25a50a1-64dd-11d9-8e37-0002b35bb117",
			"c8ac46a3-e7a2-11d6-8e5b-0002b34c7c9f", "7087d921-0e2c-11d7-8f1a-0002b35bb117",
			"b8f9e0a4-27d5-11d7-9168-0002b34c7c9f", "0ccf9a20-d1a5-11d7-91aa-0002b3a8515d",
			"a8462735-532a-11d6-9228-0002b34c7c9f", "47537942-331d-11d7-922f-0002b3a333c3",
			"47537943-331d-11d7-922f-0002b3a333c3", "46c5b240-c2a6-11d7-92d4-0002b3a333c3",
			"90ea97a6-a536-11d8-938a-0002b3988fc4", "a988bc62-6e2b-11d9-93ac-0002b35bb117",
			"43806c82-6e4c-11d9-93ac-0007e916336c", "43806c83-6e4c-11d9-93ac-0007e916336c",
			"43806c84-6e4c-11d9-93ac-0007e916336c", "43806c85-6e4c-11d9-93ac-0007e916336c",
			"43806c86-6e4c-11d9-93ac-0007e916336c", "43806c87-6e4c-11d9-93ac-0007e916336c",
			"43809390-6e4c-11d9-93ac-0007e916336c", "6dd2e092-b027-11d9-93b3-0002b35bb117",
			"6dd2e093-b027-11d9-93b3-0002b35bb117", "5dcd30b0-4493-11d9-93ca-0002b35bb117",
			"5dcd30b1-4493-11d9-93ca-0002b35bb117", "f5c35092-90c7-11d9-9489-0002b35bb117",
			"661b7831-ab3d-11d7-956f-0007e90d9be3", "661b7832-ab3d-11d7-956f-0007e90d9be3",
			"661b7833-ab3d-11d7-956f-0007e90d9be3", "661b7834-ab3d-11d7-956f-0007e90d9be3",
			"661b7835-ab3d-11d7-956f-0007e90d9be3", "bae22f21-243d-11d8-9840-0002b3988fc4",
			"0548d243-4342-11d7-9851-0002b34c7c9f", "0548f950-4342-11d7-9851-0002b34c7c9f",
			"189f0aec-a012-11d6-993c-0002b34c7c9f", "9e98b4f1-773c-11d7-9996-0002b34c7c9f",
			"55b05522-f7e2-11da-99f7-0002b3988fc4", "a77033a4-fc81-11da-99f8-0002b3988fc4",
			"33f8cc41-9281-11d9-9ad4-0002b35bb117", "68ea1372-2f6a-11d9-9ae0-0002b35bb117",
			"5f448121-4362-11d7-9b8e-0002b34c7c9f", "6837d2e2-8c0e-11d9-9cdd-0002b35bb117",
			"6837f9f0-8c0e-11d9-9cdd-0002b35bb117", "74182065-dce5-11d9-9d50-0007e9162f51",
			"bd588002-9c29-11b1-9dad-c379636f7270", "bd58803c-9c29-11b1-9dad-c379636f7270",
			"bd58803d-9c29-11b1-9dad-c379636f7270", "bd58803e-9c29-11b1-9dad-c379636f7270",
			"bd588068-9c29-11b1-9dad-c379636f7270", "bd58806a-9c29-11b1-9dad-c379636f7270",
			"bd588098-9c29-11b1-9dad-c379636f7270", "bd5880a0-9c29-11b1-9dad-c379636f7270",
			"bd5880a6-9c29-11b1-9dad-c379636f7270", "bd5880a7-9c29-11b1-9dad-c379636f7270",
			"bd5880aa-9c29-11b1-9dad-c379636f7270", "bd5880ab-9c29-11b1-9dad-c379636f7270",
			"bd5880ac-9c29-11b1-9dad-c379636f7270", "bd5880ae-9c29-11b1-9dad-c379636f7270",
			"bd5880af-9c29-11b1-9dad-c379636f7270", "bd5880b2-9c29-11b1-9dad-c379636f7270",
			"bd5880b9-9c29-11b1-9dad-c379636f7270", "bd5880ba-9c29-11b1-9dad-c379636f7270",
			"bd5880bd-9c29-11b1-9dad-c379636f7270", "bd5880c1-9c29-11b1-9dad-c379636f7270",
			"bd5880c9-9c29-11b1-9dad-c379636f7270", "bd5880cc-9c29-11b1-9dad-c379636f7270",
			"bd5880cd-9c29-11b1-9dad-c379636f7270", "bd5880ce-9c29-11b1-9dad-c379636f7270",
			"bd5880cf-9c29-11b1-9dad-c379636f7270", "bd5880d3-9c29-11b1-9dad-c379636f7270",
			"bd5880d5-9c29-11b1-9dad-c379636f7270", "bd5880d6-9c29-11b1-9dad-c379636f7270",
			"bd5880d8-9c29-11b1-9dad-c379636f7270", "bd5880d9-9c29-11b1-9dad-c379636f7270",
			"bd5880da-9c29-11b1-9dad-c379636f7270", "bd5880e0-9c29-11b1-9dad-c379636f7270",
			"bd5880e2-9c29-11b1-9dad-c379636f7270", "bd5880e3-9c29-11b1-9dad-c379636f7270",
			"bd5880e4-9c29-11b1-9dad-c379636f7270", "bd5880e5-9c29-11b1-9dad-c379636f7270",
			"bd5880eb-9c29-11b1-9dad-c379636f7270", "bd5880ed-9c29-11b1-9dad-c379636f7270",
			"bd5880ee-9c29-11b1-9dad-c379636f7270", "bd5880ef-9c29-11b1-9dad-c379636f7270",
			"bd5880f1-9c29-11b1-9dad-c379636f7270", "bd5880f4-9c29-11b1-9dad-c379636f7270",
			"bd5880f6-9c29-11b1-9dad-c379636f7270", "bd5880f7-9c29-11b1-9dad-c379636f7270",
			"bd5880f8-9c29-11b1-9dad-c379636f7270", "bd5880f9-9c29-11b1-9dad-c379636f7270",
			"bd5880fa-9c29-11b1-9dad-c379636f7270", "bd5880fb-9c29-11b1-9dad-c379636f7270",
			"bd5880fe-9c29-11b1-9dad-c379636f7270", "bd5880ff-9c29-11b1-9dad-c379636f7270",
			"bd588100-9c29-11b1-9dad-c379636f7270", "bd588101-9c29-11b1-9dad-c379636f7270",
			"bd588102-9c29-11b1-9dad-c379636f7270", "bd588104-9c29-11b1-9dad-c379636f7270",
			"bd588106-9c29-11b1-9dad-c379636f7270", "bd588107-9c29-11b1-9dad-c379636f7270",
			"bd588109-9c29-11b1-9dad-c379636f7270", "bd58810b-9c29-11b1-9dad-c379636f7270",
			"bd58810e-9c29-11b1-9dad-c379636f7270", "bd588111-9c29-11b1-9dad-c379636f7270",
			"bd588113-9c29-11b1-9dad-c379636f7270", "bd588114-9c29-11b1-9dad-c379636f7270",
			"bd588115-9c29-11b1-9dad-c379636f7270", "bd588116-9c29-11b1-9dad-c379636f7270",
			"bd588117-9c29-11b1-9dad-c379636f7270", "bd588118-9c29-11b1-9dad-c379636f7270",
			"bd58825b-9c29-11b1-9dad-c379636f7270", "bd58829b-9c29-11b1-9dad-c379636f7270",
			"bd588471-9c29-11b1-9dad-c379636f7270", "bd588b1d-9c29-11b1-9dad-c379636f7270",
			"bd58915a-9c29-11b1-9dad-c379636f7270", "bd5892ab-9c29-11b1-9dad-c379636f7270",
			"bd5892af-9c29-11b1-9dad-c379636f7270", "bd589408-9c29-11b1-9dad-c379636f7270",
			"bd589695-9c29-11b1-9dad-c379636f7270", "bd5897dd-9c29-11b1-9dad-c379636f7270",
			"bd589a1d-9c29-11b1-9dad-c379636f7270", "bd589d90-9c29-11b1-9dad-c379636f7270",
			"bd589e12-9c29-11b1-9dad-c379636f7270", "bd589ed9-9c29-11b1-9dad-c379636f7270",
			"bd58a4f1-9c29-11b1-9dad-c379636f7270", "bd58a571-9c29-11b1-9dad-c379636f7270",
			"bd58a644-9c29-11b1-9dad-c379636f7270", "bd58af89-9c29-11b1-9dad-c379636f7270",
			"bd58b833-9c29-11b1-9dad-c379636f7270", "bd58b8ba-9c29-11b1-9dad-c379636f7270",
			"bd58b8c3-9c29-11b1-9dad-c379636f7270", "bd58b9f9-9c29-11b1-9dad-c379636f7270",
			"bd58ba7a-9c29-11b1-9dad-c379636f7270", "bd58ba7e-9c29-11b1-9dad-c379636f7270",
			"bd58bf69-9c29-11b1-9dad-c379636f7270", "bd58c0a5-9c29-11b1-9dad-c379636f7270",
			"bd58c0ef-9c29-11b1-9dad-c379636f7270", "bd58c131-9c29-11b1-9dad-c379636f7270",
			"bd58c170-9c29-11b1-9dad-c379636f7270", "bd58c1ad-9c29-11b1-9dad-c379636f7270",
			"bd58c1f0-9c29-11b1-9dad-c379636f7270", "bd58c232-9c29-11b1-9dad-c379636f7270",
			"bd58c271-9c29-11b1-9dad-c379636f7270", "bd58c279-9c29-11b1-9dad-c379636f7270",
			"bd58c2bd-9c29-11b1-9dad-c379636f7270", "bd58c2f7-9c29-11b1-9dad-c379636f7270",
			"bd58c3fb-9c29-11b1-9dad-c379636f7270", "bd58c485-9c29-11b1-9dad-c379636f7270",
			"bd58c4c6-9c29-11b1-9dad-c379636f7270", "bd58c507-9c29-11b1-9dad-c379636f7270",
			"bd58c916-9c29-11b1-9dad-c379636f7270", "bd58ce5e-9c29-11b1-9dad-c379636f7270",
			"bd58d107-9c29-11b1-9dad-c379636f7270", "bd58d211-9c29-11b1-9dad-c379636f7270",
			"bd58d637-9c29-11b1-9dad-c379636f7270", "bd58d679-9c29-11b1-9dad-c379636f7270",
			"bd58d6ab-9c29-11b1-9dad-c379636f7270", "bd58d6b3-9c29-11b1-9dad-c379636f7270",
			"bd58d6f3-9c29-11b1-9dad-c379636f7270", "bd58d7f6-9c29-11b1-9dad-c379636f7270",
			"bd58da02-9c29-11b1-9dad-c379636f7270", "bd58dcda-9c29-11b1-9dad-c379636f7270",
			"bd58e0e2-9c29-11b1-9dad-c379636f7270", "bd58e0ec-9c29-11b1-9dad-c379636f7270",
			"bd58e124-9c29-11b1-9dad-c379636f7270", "bd58e163-9c29-11b1-9dad-c379636f7270",
			"bd58e1a5-9c29-11b1-9dad-c379636f7270", "bd58e1fc-9c29-11b1-9dad-c379636f7270",
			"bd58e3ba-9c29-11b1-9dad-c379636f7270", "bd58e476-9c29-11b1-9dad-c379636f7270",
			"bd58e5fd-9c29-11b1-9dad-c379636f7270", "bd58f042-9c29-11b1-9dad-c379636f7270",
			"bd58f080-9c29-11b1-9dad-c379636f7270", "bd58f7f9-9c29-11b1-9dad-c379636f7270",
			"bd58f87a-9c29-11b1-9dad-c379636f7270", "bd58f8bc-9c29-11b1-9dad-c379636f7270",
			"bd58f8fe-9c29-11b1-9dad-c379636f7270", "bd5900c1-9c29-11b1-9dad-c379636f7270",
			"bd59083a-9c29-11b1-9dad-c379636f7270", "bd59086c-9c29-11b1-9dad-c379636f7270",
			"bd590951-9c29-11b1-9dad-c379636f7270", "bd590c98-9c29-11b1-9dad-c379636f7270",
			"bd595e7e-9c29-11b1-9dad-c379636f7270", "bd5a142d-9c29-11b1-9dad-c379636f7270",
			"bd5ad700-9c29-11b1-9dad-c379636f7270", "bd5b4951-9c29-11b1-9dad-c379636f7270",
			"bd5b6d60-9c29-11b1-9dad-c379636f7270", "bd5b97f9-9c29-11b1-9dad-c379636f7270",
			"bd5bae9a-9c29-11b1-9dad-c379636f7270", "bd5c0498-9c29-11b1-9dad-c379636f7270",
			"bd5c40b0-9c29-11b1-9dad-c379636f7270", "bd5c44e1-9c29-11b1-9dad-c379636f7270",
			"bd5c548a-9c29-11b1-9dad-c379636f7270", "bd5c5e99-9c29-11b1-9dad-c379636f7270",
			"bd5d0b56-9c29-11b1-9dad-c379636f7270", "bd5d7783-9c29-11b1-9dad-c379636f7270",
			"bd5db814-9c29-11b1-9dad-c379636f7270", "bd5dbcd4-9c29-11b1-9dad-c379636f7270",
			"bd5de44c-9c29-11b1-9dad-c379636f7270", "bd5e7a9e-9c29-11b1-9dad-c379636f7270",
			"bd601781-9c29-11b1-9dad-c379636f7270", "bd60a887-9c29-11b1-9dad-c379636f7270",
			"bd60e145-9c29-11b1-9dad-c379636f7270", "bd610a5c-9c29-11b1-9dad-c379636f7270",
			"bd61886b-9c29-11b1-9dad-c379636f7270", "bd61ec34-9c29-11b1-9dad-c379636f7270",
			"bd63a0ce-9c29-11b1-9dad-c379636f7270", "bd63d3ad-9c29-11b1-9dad-c379636f7270",
			"bd63f343-9c29-11b1-9dad-c379636f7270", "bd6422c8-9c29-11b1-9dad-c379636f7270",
			"bd6449a2-9c29-11b1-9dad-c379636f7270", "bd651c1b-9c29-11b1-9dad-c379636f7270",
			"bd654be7-9c29-11b1-9dad-c379636f7270", "bd6561fc-9c29-11b1-9dad-c379636f7270",
			"bd65cd99-9c29-11b1-9dad-c379636f7270", "bd66e0a4-9c29-11b1-9dad-c379636f7270",
			"bd671c2d-9c29-11b1-9dad-c379636f7270", "bd674278-9c29-11b1-9dad-c379636f7270",
			"bd678812-9c29-11b1-9dad-c379636f7270", "bd67e911-9c29-11b1-9dad-c379636f7270",
			"bd681463-9c29-11b1-9dad-c379636f7270", "bd682bdd-9c29-11b1-9dad-c379636f7270",
			"bd6a2d94-9c29-11b1-9dad-c379636f7270", "bd7183b0-9c29-11b1-9dad-c379636f7270",
			"bd757df1-9c29-11b1-9dad-c379636f7270", "bd79c885-9c29-11b1-9dad-c379636f7270",
			"bd7d5373-9c29-11b1-9dad-c379636f7270", "bd84623c-9c29-11b1-9dad-c379636f7270",
			"bd84dac3-9c29-11b1-9dad-c379636f7270", "bd84df32-9c29-11b1-9dad-c379636f7270",
			"bd8a163e-9c29-11b1-9dad-c379636f7270", "bd8dbbc3-9c29-11b1-9dad-c379636f7270",
			"bd903ed3-9c29-11b1-9dad-c379636f7270", "bd913dca-9c29-11b1-9dad-c379636f7270",
			"bd91b03d-9c29-11b1-9dad-c379636f7270", "bd95395a-9c29-11b1-9dad-c379636f7270",
			"bd9733c2-9c29-11b1-9dad-c379636f7270", "bd97e378-9c29-11b1-9dad-c379636f7270",
			"bd992179-9c29-11b1-9dad-c379636f7270", "bda06d71-9c29-11b1-9dad-c379636f7270",
			"bda09fc2-9c29-11b1-9dad-c379636f7270", "bda0e43c-9c29-11b1-9dad-c379636f7270",
			"bda16220-9c29-11b1-9dad-c379636f7270", "bda21728-9c29-11b1-9dad-c379636f7270",
			"bda887b6-9c29-11b1-9dad-c379636f7270", "bdaa4b0e-9c29-11b1-9dad-c379636f7270",
			"bdadcbf0-9c29-11b1-9dad-c379636f7270", "bdb09014-9c29-11b1-9dad-c379636f7270",
			"bdb0bfbf-9c29-11b1-9dad-c379636f7270", "bdb6e7e8-9c29-11b1-9dad-c379636f7270",
			"bdb7f18f-9c29-11b1-9dad-c379636f7270", "bdb8721b-9c29-11b1-9dad-c379636f7270",
			"bdc36538-9c29-11b1-9dad-c379636f7270", "bdc438fd-9c29-11b1-9dad-c379636f7270",
			"bdc98c81-9c29-11b1-9dad-c379636f7270", "bdc9fb94-9c29-11b1-9dad-c379636f7270",
			"bdca5506-9c29-11b1-9dad-c379636f7270", "bdcc8689-9c29-11b1-9dad-c379636f7270",
			"bdcc9f7c-9c29-11b1-9dad-c379636f7270", "bdcd7ea7-9c29-11b1-9dad-c379636f7270",
			"bdd3d5ea-9c29-11b1-9dad-c379636f7270", "bdd50606-9c29-11b1-9dad-c379636f7270",
			"bdd9d485-9c29-11b1-9dad-c379636f7270", "bdda1e3f-9c29-11b1-9dad-c379636f7270",
			"bddb0a48-9c29-11b1-9dad-c379636f7270", "bddd55a1-9c29-11b1-9dad-c379636f7270",
			"bdde7fe1-9c29-11b1-9dad-c379636f7270", "bddef55a-9c29-11b1-9dad-c379636f7270",
			"bde212ef-9c29-11b1-9dad-c379636f7270", "bde38eeb-9c29-11b1-9dad-c379636f7270",
			"bde495da-9c29-11b1-9dad-c379636f7270", "bde5ec9c-9c29-11b1-9dad-c379636f7270",
			"bde7f9f2-9c29-11b1-9dad-c379636f7270", "bde87324-9c29-11b1-9dad-c379636f7270",
			"bdf02d74-9c29-11b1-9dad-c379636f7270", "bdf7cb82-9c29-11b1-9dad-c379636f7270",
			"bdf8edae-9c29-11b1-9dad-c379636f7270", "bdfb7dd0-9c29-11b1-9dad-c379636f7270",
			"bdfdf4b1-9c29-11b1-9dad-c379636f7270", "be00bf6e-9c29-11b1-9dad-c379636f7270",
			"be01286a-9c29-11b1-9dad-c379636f7270", "be0a552b-9c29-11b1-9dad-c379636f7270",
			"be0bbbb5-9c29-11b1-9dad-c379636f7270", "be0d3c4c-9c29-11b1-9dad-c379636f7270",
			"be144cd1-9c29-11b1-9dad-c379636f7270", "be18e693-9c29-11b1-9dad-c379636f7270",
			"be1ac327-9c29-11b1-9dad-c379636f7270", "be1c3220-9c29-11b1-9dad-c379636f7270",
			"be1d78c8-9c29-11b1-9dad-c379636f7270", "be1e5136-9c29-11b1-9dad-c379636f7270",
			"be1f1654-9c29-11b1-9dad-c379636f7270", "be27a8ec-9c29-11b1-9dad-c379636f7270",
			"be2e0d29-9c29-11b1-9dad-c379636f7270", "be2e94bb-9c29-11b1-9dad-c379636f7270",
			"be2eb4e1-9c29-11b1-9dad-c379636f7270", "be31edd4-9c29-11b1-9dad-c379636f7270",
			"be34dcb7-9c29-11b1-9dad-c379636f7270", "be35d1f9-9c29-11b1-9dad-c379636f7270",
			"be3a8699-9c29-11b1-9dad-c379636f7270", "be4425ef-9c29-11b1-9dad-c379636f7270",
			"be4b53f2-9c29-11b1-9dad-c379636f7270", "be4dd7f1-9c29-11b1-9dad-c379636f7270",
			"be4ef62a-9c29-11b1-9dad-c379636f7270", "be59c5cb-9c29-11b1-9dad-c379636f7270",
			"be5d9e9f-9c29-11b1-9dad-c379636f7270", "be659d62-9c29-11b1-9dad-c379636f7270",
			"be667f85-9c29-11b1-9dad-c379636f7270", "be6735cd-9c29-11b1-9dad-c379636f7270",
			"be717e09-9c29-11b1-9dad-c379636f7270", "be7266e4-9c29-11b1-9dad-c379636f7270",
			"be75c8f9-9c29-11b1-9dad-c379636f7270", "be760011-9c29-11b1-9dad-c379636f7270",
			"be7f041b-9c29-11b1-9dad-c379636f7270", "be81b28d-9c29-11b1-9dad-c379636f7270",
			"be83f745-9c29-11b1-9dad-c379636f7270", "be8f47a3-9c29-11b1-9dad-c379636f7270",
			"be90c21d-9c29-11b1-9dad-c379636f7270", "be920bae-9c29-11b1-9dad-c379636f7270",
			"be92128d-9c29-11b1-9dad-c379636f7270", "be9af14f-9c29-11b1-9dad-c379636f7270",
			"be9be955-9c29-11b1-9dad-c379636f7270", "be9e0a7c-9c29-11b1-9dad-c379636f7270",
			"bea12384-9c29-11b1-9dad-c379636f7270", "bea64551-9c29-11b1-9dad-c379636f7270",
			"beaa3d29-9c29-11b1-9dad-c379636f7270", "beaa9284-9c29-11b1-9dad-c379636f7270",
			"beaad779-9c29-11b1-9dad-c379636f7270", "beab79ec-9c29-11b1-9dad-c379636f7270",
			"beab9388-9c29-11b1-9dad-c379636f7270", "bead825d-9c29-11b1-9dad-c379636f7270",
			"beaed5bd-9c29-11b1-9dad-c379636f7270", "beb5aba2-9c29-11b1-9dad-c379636f7270",
			"beb7f074-9c29-11b1-9dad-c379636f7270", "bebd5604-9c29-11b1-9dad-c379636f7270",
			"bebe2068-9c29-11b1-9dad-c379636f7270", "bebece64-9c29-11b1-9dad-c379636f7270",
			"bec28bcc-9c29-11b1-9dad-c379636f7270", "becd79d2-9c29-11b1-9dad-c379636f7270",
			"bece6da2-9c29-11b1-9dad-c379636f7270", "becf783a-9c29-11b1-9dad-c379636f7270",
			"bed06ab6-9c29-11b1-9dad-c379636f7270", "bed22fb8-9c29-11b1-9dad-c379636f7270",
			"bed50053-9c29-11b1-9dad-c379636f7270", "bedc09ec-9c29-11b1-9dad-c379636f7270",
			"bee22d3d-9c29-11b1-9dad-c379636f7270", "bee356be-9c29-11b1-9dad-c379636f7270",
			"bee52c1c-9c29-11b1-9dad-c379636f7270", "bee5923d-9c29-11b1-9dad-c379636f7270",
			"bee6e76c-9c29-11b1-9dad-c379636f7270", "beed06de-9c29-11b1-9dad-c379636f7270",
			"beee8a4d-9c29-11b1-9dad-c379636f7270", "bef7ed88-9c29-11b1-9dad-c379636f7270",
			"befd1881-9c29-11b1-9dad-c379636f7270", "beff1a9a-9c29-11b1-9dad-c379636f7270",
			"bf05e63f-9c29-11b1-9dad-c379636f7270", "bf0a336e-9c29-11b1-9dad-c379636f7270",
			"bf0f7037-9c29-11b1-9dad-c379636f7270", "bf12c7c3-9c29-11b1-9dad-c379636f7270",
			"bf136680-9c29-11b1-9dad-c379636f7270", "bf192b1e-9c29-11b1-9dad-c379636f7270",
			"bf1b7efc-9c29-11b1-9dad-c379636f7270", "bf1d7fe4-9c29-11b1-9dad-c379636f7270",
			"bf1eedc8-9c29-11b1-9dad-c379636f7270", "bf1f951d-9c29-11b1-9dad-c379636f7270",
			"bf26025d-9c29-11b1-9dad-c379636f7270", "bf2a766d-9c29-11b1-9dad-c379636f7270",
			"bf2b937c-9c29-11b1-9dad-c379636f7270", "bf3429c5-9c29-11b1-9dad-c379636f7270",
			"bf3491c4-9c29-11b1-9dad-c379636f7270", "bf364d35-9c29-11b1-9dad-c379636f7270",
			"bf3a978c-9c29-11b1-9dad-c379636f7270", "bf411eed-9c29-11b1-9dad-c379636f7270",
			"bf476137-9c29-11b1-9dad-c379636f7270", "bf4dc2b8-9c29-11b1-9dad-c379636f7270",
			"bf4fcfa6-9c29-11b1-9dad-c379636f7270", "bf4ff31b-9c29-11b1-9dad-c379636f7270",
			"bf54071c-9c29-11b1-9dad-c379636f7270", "bf576a31-9c29-11b1-9dad-c379636f7270",
			"bf5cb2c0-9c29-11b1-9dad-c379636f7270", "bf64a755-9c29-11b1-9dad-c379636f7270",
			"bf660e73-9c29-11b1-9dad-c379636f7270", "bf68e241-9c29-11b1-9dad-c379636f7270",
			"bf6d1d3a-9c29-11b1-9dad-c379636f7270", "bf74bd9c-9c29-11b1-9dad-c379636f7270",
			"bf761f19-9c29-11b1-9dad-c379636f7270", "bf77aa73-9c29-11b1-9dad-c379636f7270",
			"bf77bef5-9c29-11b1-9dad-c379636f7270", "bf7800bf-9c29-11b1-9dad-c379636f7270",
			"bf7a1c90-9c29-11b1-9dad-c379636f7270", "bf83203b-9c29-11b1-9dad-c379636f7270",
			"bf84f09d-9c29-11b1-9dad-c379636f7270", "bf8b47b8-9c29-11b1-9dad-c379636f7270",
			"bf8bdc58-9c29-11b1-9dad-c379636f7270", "bf8c47ad-9c29-11b1-9dad-c379636f7270",
			"bf8d1cd4-9c29-11b1-9dad-c379636f7270", "bf8d3988-9c29-11b1-9dad-c379636f7270",
			"bf9a6157-9c29-11b1-9dad-c379636f7270", "bfa067af-9c29-11b1-9dad-c379636f7270",
			"bfa4e9d2-9c29-11b1-9dad-c379636f7270", "bfa4fe8c-9c29-11b1-9dad-c379636f7270",
			"bfa699e0-9c29-11b1-9dad-c379636f7270", "bfab7ef3-9c29-11b1-9dad-c379636f7270",
			"bfac572e-9c29-11b1-9dad-c379636f7270", "bfad6be8-9c29-11b1-9dad-c379636f7270",
			"bfaf1b18-9c29-11b1-9dad-c379636f7270", "bfb0e3f0-9c29-11b1-9dad-c379636f7270",
			"bfbf40e9-9c29-11b1-9dad-c379636f7270", "bfc913a6-9c29-11b1-9dad-c379636f7270",
			"bfce95e7-9c29-11b1-9dad-c379636f7270", "bfcfa24f-9c29-11b1-9dad-c379636f7270",
			"bfd0a274-9c29-11b1-9dad-c379636f7270", "bfd54197-9c29-11b1-9dad-c379636f7270",
			"bfd86bf1-9c29-11b1-9dad-c379636f7270", "bfda366c-9c29-11b1-9dad-c379636f7270",
			"bfdb8eef-9c29-11b1-9dad-c379636f7270", "bfe0bb3f-9c29-11b1-9dad-c379636f7270",
			"bfe2070f-9c29-11b1-9dad-c379636f7270", "bfe6fd41-9c29-11b1-9dad-c379636f7270",
			"bfe6fe22-9c29-11b1-9dad-c379636f7270", "bfe7d31b-9c29-11b1-9dad-c379636f7270",
			"bfe9f22d-9c29-11b1-9dad-c379636f7270", "bfeb0c83-9c29-11b1-9dad-c379636f7270",
			"bfeb3d17-9c29-11b1-9dad-c379636f7270", "bfedab5d-9c29-11b1-9dad-c379636f7270",
			"bfefebaf-9c29-11b1-9dad-c379636f7270", "bff27115-9c29-11b1-9dad-c379636f7270",
			"bff3237a-9c29-11b1-9dad-c379636f7270", "bff476e8-9c29-11b1-9dad-c379636f7270",
			"bff82c25-9c29-11b1-9dad-c379636f7270", "c000f476-9c29-11b1-9dad-c379636f7270",
			"c001e2b4-9c29-11b1-9dad-c379636f7270", "c0054316-9c29-11b1-9dad-c379636f7270",
			"c00a42b9-9c29-11b1-9dad-c379636f7270", "c00d7a96-9c29-11b1-9dad-c379636f7270",
			"c010ce47-9c29-11b1-9dad-c379636f7270", "c0133726-9c29-11b1-9dad-c379636f7270",
			"c017ff79-9c29-11b1-9dad-c379636f7270", "c01d6e8d-9c29-11b1-9dad-c379636f7270",
			"c0224da2-9c29-11b1-9dad-c379636f7270", "c0279a99-9c29-11b1-9dad-c379636f7270",
			"c02b14f0-9c29-11b1-9dad-c379636f7270", "c03209e1-9c29-11b1-9dad-c379636f7270",
			"c0328561-9c29-11b1-9dad-c379636f7270", "c033ac24-9c29-11b1-9dad-c379636f7270",
			"c037affb-9c29-11b1-9dad-c379636f7270", "c0390e21-9c29-11b1-9dad-c379636f7270",
			"c03afa6d-9c29-11b1-9dad-c379636f7270", "c03b87b7-9c29-11b1-9dad-c379636f7270",
			"c03d1910-9c29-11b1-9dad-c379636f7270", "c03ec3ba-9c29-11b1-9dad-c379636f7270",
			"c04cad85-9c29-11b1-9dad-c379636f7270", "c04da45a-9c29-11b1-9dad-c379636f7270",
			"c052cf24-9c29-11b1-9dad-c379636f7270", "c05813b7-9c29-11b1-9dad-c379636f7270",
			"c05a7c46-9c29-11b1-9dad-c379636f7270", "c05e110e-9c29-11b1-9dad-c379636f7270",
			"c0604f82-9c29-11b1-9dad-c379636f7270", "c06337a2-9c29-11b1-9dad-c379636f7270",
			"c0659a2b-9c29-11b1-9dad-c379636f7270", "c0714577-9c29-11b1-9dad-c379636f7270",
			"c073820f-9c29-11b1-9dad-c379636f7270", "c0739142-9c29-11b1-9dad-c379636f7270",
			"c076ff6d-9c29-11b1-9dad-c379636f7270", "c07a7946-9c29-11b1-9dad-c379636f7270",
			"c082ab98-9c29-11b1-9dad-c379636f7270", "c086cb66-9c29-11b1-9dad-c379636f7270",
			"c091e184-9c29-11b1-9dad-c379636f7270", "c0937fa3-9c29-11b1-9dad-c379636f7270",
			"c0960de2-9c29-11b1-9dad-c379636f7270", "c09a6e2f-9c29-11b1-9dad-c379636f7270",
			"c09c8637-9c29-11b1-9dad-c379636f7270", "c09f6ac3-9c29-11b1-9dad-c379636f7270",
			"c0a253f0-9c29-11b1-9dad-c379636f7270", "c0a383bd-9c29-11b1-9dad-c379636f7270",
			"c0a63548-9c29-11b1-9dad-c379636f7270", "c0a79513-9c29-11b1-9dad-c379636f7270",
			"c0a7cede-9c29-11b1-9dad-c379636f7270", "c0aa7393-9c29-11b1-9dad-c379636f7270",
			"c0ab9eda-9c29-11b1-9dad-c379636f7270", "c0ad3020-9c29-11b1-9dad-c379636f7270",
			"c0b2bc13-9c29-11b1-9dad-c379636f7270", "c0b4578f-9c29-11b1-9dad-c379636f7270",
			"c0b4950a-9c29-11b1-9dad-c379636f7270", "c0b541b6-9c29-11b1-9dad-c379636f7270",
			"c0ba0c32-9c29-11b1-9dad-c379636f7270", "c0bb3413-9c29-11b1-9dad-c379636f7270",
			"c0bf7a98-9c29-11b1-9dad-c379636f7270", "c0c3a8a2-9c29-11b1-9dad-c379636f7270",
			"c0c6b0d2-9c29-11b1-9dad-c379636f7270", "c0cc2458-9c29-11b1-9dad-c379636f7270",
			"c0cd0537-9c29-11b1-9dad-c379636f7270", "c0d211d2-9c29-11b1-9dad-c379636f7270",
			"c0d674bf-9c29-11b1-9dad-c379636f7270", "c0d6eb7b-9c29-11b1-9dad-c379636f7270",
			"c0e2af4e-9c29-11b1-9dad-c379636f7270", "c0e7247c-9c29-11b1-9dad-c379636f7270",
			"c0e85daa-9c29-11b1-9dad-c379636f7270", "c0edda9d-9c29-11b1-9dad-c379636f7270",
			"c0f012ac-9c29-11b1-9dad-c379636f7270", "c0f45a9c-9c29-11b1-9dad-c379636f7270",
			"c0f527fc-9c29-11b1-9dad-c379636f7270", "c0f63e9a-9c29-11b1-9dad-c379636f7270",
			"c0f93b23-9c29-11b1-9dad-c379636f7270", "c0fb9be2-9c29-11b1-9dad-c379636f7270",
			"c0fdc8ce-9c29-11b1-9dad-c379636f7270", "c0ff89be-9c29-11b1-9dad-c379636f7270",
			"c100289e-9c29-11b1-9dad-c379636f7270", "c1052107-9c29-11b1-9dad-c379636f7270",
			"c10569cb-9c29-11b1-9dad-c379636f7270", "c107fffb-9c29-11b1-9dad-c379636f7270",
			"c10ae4c2-9c29-11b1-9dad-c379636f7270", "c10ae7b8-9c29-11b1-9dad-c379636f7270",
			"c10af5e7-9c29-11b1-9dad-c379636f7270", "c10af932-9c29-11b1-9dad-c379636f7270",
			"c10b559a-9c29-11b1-9dad-c379636f7270", "c10c3008-9c29-11b1-9dad-c379636f7270",
			"c10c4394-9c29-11b1-9dad-c379636f7270", "c10c450d-9c29-11b1-9dad-c379636f7270",
			"c10e5735-9c29-11b1-9dad-c379636f7270", "c1164108-9c29-11b1-9dad-c379636f7270",
			"c1164bb8-9c29-11b1-9dad-c379636f7270", "c11bb004-9c29-11b1-9dad-c379636f7270",
			"c11c43c3-9c29-11b1-9dad-c379636f7270", "c12157ff-9c29-11b1-9dad-c379636f7270",
			"c1227621-9c29-11b1-9dad-c379636f7270", "c1237745-9c29-11b1-9dad-c379636f7270",
			"c128c4f1-9c29-11b1-9dad-c379636f7270", "c1299098-9c29-11b1-9dad-c379636f7270",
			"c129e5bc-9c29-11b1-9dad-c379636f7270", "c12bfd14-9c29-11b1-9dad-c379636f7270",
			"c12ea2ff-9c29-11b1-9dad-c379636f7270", "c130750e-9c29-11b1-9dad-c379636f7270",
			"c13181fd-9c29-11b1-9dad-c379636f7270", "c133531a-9c29-11b1-9dad-c379636f7270",
			"c135299e-9c29-11b1-9dad-c379636f7270", "c135fae1-9c29-11b1-9dad-c379636f7270",
			"c13bc0c4-9c29-11b1-9dad-c379636f7270", "c1416e20-9c29-11b1-9dad-c379636f7270",
			"c14862c2-9c29-11b1-9dad-c379636f7270", "f0f39521-8447-11d9-9df2-0002b3a85b0b",
			"c2eb72a1-13dd-11d8-9e44-0002b3988fc4", "a8a40d90-0d87-11d9-9e57-0002b35bb117",
			"a8a40d91-0d87-11d9-9e57-0002b35bb117", "a8a40d92-0d87-11d9-9e57-0002b35bb117",
			"a8a40d93-0d87-11d9-9e57-0002b35bb117", "a8a434a0-0d87-11d9-9e57-0002b35bb117",
			"a8a434a1-0d87-11d9-9e57-0002b35bb117", "a8a434a2-0d87-11d9-9e57-0002b35bb117",
			"a8a434a3-0d87-11d9-9e57-0002b35bb117", "a8a45bb0-0d87-11d9-9e57-0002b35bb117",
			"f7cf5a39-5224-11d6-9eb9-0002b34c7c9f", "892d2401-429b-11d7-9f12-0002b3a8515d",
			"892d2402-429b-11d7-9f12-0002b3a8515d", "11c73ba2-3d83-11d9-9f59-0002b35bb117",
			"986a6742-4a78-11d7-9f84-00a0c9c6d17e", "012ec430-107a-41d7-8201-fd0c6a33c4ae",
			"0277e434-330a-4de7-aa84-4e9f78e781ea", "04978a8d-e0a9-4eed-b50d-2e66ef9376fc",
			"059e8eb2-d335-4d78-a877-d77e931f7eeb", "06085436-0ea8-41d7-8d78-c5027328b3c1",
			"062b76cc-f4ad-4b27-8c77-d675dcb26aa2", "07c91c9a-d894-44bb-8fca-e70960eaccfe",
			"092fe1d7-7c89-40cb-8918-f925d3d560f5", "0941d72f-826d-488f-acac-da7c38fc0dc7",
			"0cdaac86-0ea9-41d7-9528-b5928f6b2cd6", "0d464614-620c-4b79-b0c3-cbca8d45d60e",
			"0d839cc3-3461-4bb8-85d7-96e817400d58", "0dfc9bcc-108b-41d7-8ed7-edfd33b086ba",
			"0e49646c-0f31-41d7-9fbe-ee5fdcf84034", "0f393dee-d2ff-458c-b2b6-ede8d9ae52ce",
			"122c8d92-1090-41d7-9e88-dccd46c00dee", "172883ad-c2ed-4b62-8a89-a0995bb8048f",
			"175dad78-557d-41d7-9305-ede135042ebb", "1a2afc8e-0ea8-41d7-86ad-9f138e1b142c",
			"1a83bf1a-033d-41d8-93a5-af525946d6ea", "1af62fc9-894e-4971-aff4-4bca9fc56632",
			"1c0aeb26-d0ff-41d7-8df3-e0206d107204", "1ca87a3c-1967-40b3-927e-c557673243f3",
			"21248340-0de5-4a17-88cc-f19e0f666996", "2253cbb9-d217-4c52-b93a-494bfc346e0e",
			"225afc46-0ea9-41d7-86ba-d6e6e606bcf4", "2348325c-a60f-4ed0-bd07-04439cb373a7",
			"23eb58eb-7a0d-4d75-9045-0c9be4447d24", "25ac90f0-1091-41d7-8ad2-e217e51d47b0",
			"26b7deaf-8e58-4f7e-9995-f1e32ab8c55f", "2754d1da-3aec-4987-9927-454b06962be2",
			"2812e1b3-54db-4df6-b251-d06526deb8eb", "290b90a8-033d-41d8-90bb-e6187b708fcc",
			"2c4a5a2e-e936-45c8-8d04-78065a5128e3", "2eb3d286-1976-41d9-98a2-cd8854d31725",
			"2f961964-0ea8-41d7-9ea1-c9afdcc1aa56", "30a5f4a2-033d-41d8-8a13-caa49537da43",
			"333a887f-20d4-403c-bdde-a03b5a68577e", "35a98ed7-3745-4497-81ee-d0bf638a842e",
			"367094f6-2487-423f-a888-a027ae1d8a4d", "36eab934-a932-4cca-9c16-f13a63f99a00",
			"371090f1-fc5e-45f0-aaa8-01e1fe5e3d80", "37e9678b-00cb-4f3b-aa77-f8fd09cd6222",
			"382d2200-d283-4370-b31e-d4df2d4d65ce", "3869b626-108e-41d7-9774-efcd2852455a",
			"39f93138-0ea9-41d7-9207-fe9aa15a65d3", "422dd7fa-1c5e-480f-a3b7-d60c981d5ea6",
			"4320db29-0823-4159-b329-a5f58e6810a8", "4498803c-ea55-4444-bf36-02cb1adc6250",
			"449c68f2-108a-41d7-85a4-d5be787da5b9", "4777d758-108c-41d7-866a-9ddb21242ea5",
			"477f1308-4e90-4e74-adc0-c056c5e25782", "48564780-0ea8-41d7-8f74-e07cb4469992",
			"4d44b5bc-3448-4a38-9675-e2a3f452b4af", "4dde3f94-4621-41d8-9272-aca7bf883a76",
			"4fc507b8-42f0-40e0-8919-0a3b8429eae6", "4fe874b8-0ea9-41d7-9a51-cb2aa8ac722d",
			"51bacf6a-4621-41d8-903f-8618675219cb", "523d56a0-1090-41d7-943c-b98ceb989643",
			"53194308-b6cc-4e93-b8ce-12b3b4b4b1aa", "53972db3-006e-41ca-9572-6bdf76b4c7d6",
			"58f429c0-1c9b-449a-8ab7-cc62cb634587", "5a1c2052-0ea8-41d7-8354-8a1ca8c753f7",
			"5afd82ae-108d-41d7-877a-efcc1a027076", "5bb24907-9d64-4a8c-bed6-87b9618ea47e",
			"5c261c00-0ea7-41d7-826e-cba509274611", "5cbdf225-ebfa-412b-8611-c749af0b4c2e",
			"5d0d4ab8-c533-4584-9dca-9264393d54e0", "5ecb026e-ad01-4496-af4c-2f585b1cfa07",
			"5faaf1f8-033d-41d8-9cc3-881c93115d39", "6198deea-121a-41d7-93eb-f77e2835bef0",
			"62910136-a858-425b-b37a-1bb8764b133f", "631979aa-7373-49b6-b126-d176bef0967d",
			"66a0d466-0ea9-41d7-8f21-ca6c303de0d0", "67ac42e4-033d-41d8-88b4-c5af6346a3c4",
			"6bbde2e0-12aa-41d7-97e2-d2cd8dde2280", "6cbc0e94-0ea7-41d7-8e09-eafe051a334c",
			"6d24b47c-b9b6-445d-9da8-911214b6132a", "6e398450-033d-41d8-8a81-b80d939dc7a9",
			"6fe23318-0ea8-41d7-9648-9237f96c6632", "6fe6162f-196a-4acc-a6a3-920425720e1f",
			"711dd8ca-108f-41d7-8ed2-b6714c417827", "71304bd0-033d-41d8-815a-9f1758b267de",
			"7553befc-8e84-4446-9676-d8be4b0300b6", "7777de9c-92fe-48d3-adb5-f436da53f064",
			"788b6e89-3a72-4944-aac1-844605169fe8", "79fe2070-108b-41d7-8a84-e7fe8ea1df91",
			"7e0d7e6a-0ea9-41d7-9e9e-a5a533761768", "7e37800e-0ea7-41d7-9bd5-8065cb1a6b10",
			"7e614133-73c5-485e-bea2-4e08d26ab394", "7ee2de9c-033c-41d8-82f2-f5662a7ecac3",
			"7eef2de2-8135-472f-b669-15df6d4cb7c0", "7f3f85b6-f4d8-490c-a497-5fcf6562a285",
			"83996144-033d-41d8-9e46-c8e929e84a03", "8413f308-0859-45d2-af74-b2089fc71e1c",
			"84b3eae9-a269-4376-93de-4179d133db23", "85413266-033c-41d8-8a3c-853470ebf355",
			"857cb040-0ea8-41d7-8639-c286b90192ba", "85d21f36-d943-42eb-b909-fb80bca8f6cc",
			"876d5c30-7bac-4d7f-ae6f-77d0539790b0", "878ec520-ea9d-4797-bf9b-9a9fffa077f7",
			"8929e75c-df35-495a-aad9-aea01638eace", "8a6b89b8-108e-41d7-8199-f8db46c58932",
			"8b1299ae-033d-41d8-9eb8-c7fc9b1aa271", "8c1989b2-0571-41d8-9fda-a54456cecbe8",
			"8c3af009-ceca-4d84-84bd-18218acb90da", "8cc255cb-a8b8-4356-b019-64f892739578",
			"8e72d91e-0ea7-41d7-8f52-84ac7fcfa385", "8ec374d2-01f9-49ba-ab44-90f6ce010ec2",
			"908f1244-4bbf-4813-ab26-2dbe374c8d05", "9097b724-2a51-41fd-974a-6c5223201980",
			"913234d0-033c-41d8-8146-f33e6672d790", "93c75820-1c21-43c9-9087-07a8511c10be",
			"93e9b082-0ea9-41d7-9217-e88c867d6e71", "9530d00c-318d-4234-95e9-8481379ad6be",
			"96d556b5-5470-4d98-9111-6614afd490b1", "995b3198-033c-41d8-866d-f7bdd1826285",
			"99e0ba72-e90d-4825-a03a-b8bd2311895d", "9aa24f40-bd05-468f-a8a2-2e9828d91553",
			"9af4b0d0-0ea8-41d7-88ee-e7da88c593cc", "9b44270a-1088-41d7-89d8-86187f50eac7",
			"9e252497-a613-4c12-ac51-045093fa7be8", "9ea97dc4-0ea7-41d7-90cc-b17f20db96b6",
			"9ec6bab5-8977-4e67-9933-ec276fa3b912", "9f5e81a9-d16c-45b1-a595-4aa76a7ddc92",
			"a1f20f2b-2d0f-4e7c-b65c-23083b6be83a", "a71e1700-063f-41d7-9841-873d1ddc865a",
			"a9b8812a-1090-41d7-896d-e7aa9f9b941f", "aaaf2180-0ea9-41d7-8c78-f3d77408dd13",
			"ab7bb61a-2d61-41d7-9bd7-c39bf23d2dba", "ac2cdc17-7191-4757-9652-ba35913394cc",
			"ac4dcf46-3080-407a-9547-6617b7640847", "adc80310-3c89-422c-aa18-1d451da1d5b2",
			"ae83ebf4-88dd-4d63-9b2f-1f2c31f9e635", "aee9db98-0ea7-41d7-9387-bf0f0bd01e8b",
			"afd79f32-7125-41d7-81b3-e79de9003a36", "b01f3e4c-107b-41d7-89ac-d853a1ceea45",
			"b043ad1a-0ea8-41d7-8807-e4d7aad88a01", "b1522157-5b58-4a2b-8458-026a7969a1dd",
			"b2c8b1b4-108f-41d7-9034-dceb94f7996a", "b463b9fc-1717-41d9-81f5-946e75d138e6",
			"b47afb99-4fe8-4d4c-b711-f35b49741339", "b52c8232-8e5b-41d8-8abd-b16baad462a7",
			"b8d9b2e7-d812-447a-8c48-3086ac80967b", "b90f05c2-7be6-41d9-95dd-badfd8a6ba18",
			"b92626d0-94a5-41d9-8fdf-cc8d0e1bd018", "baa29823-fd4f-43f1-9f8c-b5647fbc95a4",
			"bad5f87f-8b5e-40ae-8bc9-0958c87c8c7d", "bc256674-5c36-45bb-a7da-898f2ee87db4",
			"bee2066d-25f0-4d3a-b707-307b1341e0ba", "bf279d9c-0ea7-41d7-9fa4-d2954dda78a8",
			"c2e3016c-1c7c-46b7-bffd-c7f8ed7624ec", "c49488d4-a0de-41d7-8ede-9d605e6c951d",
			"c5b8bff0-0ea8-41d7-9330-a8d75dc13d41", "c69d8b08-faa6-4eac-8fdd-2b1ab0012255",
			"c749d6e2-3e5b-4846-b428-a7e1f65f8a3f", "ca7ed331-f6b2-43c4-afa9-d51e518ebec1",
			"ced01936-acd6-41d7-80bd-aecc7431901b", "cee981ca-121a-41d7-9820-d2140528f40e",
			"cf645c7c-0ea7-41d7-8a80-ca222ce6bf52", "d30396de-108e-41d7-96f2-fb32dc881bce",
			"d30a1824-6a25-4a64-85b0-6e2dfca89e99", "d32993c8-108b-41d7-943b-ee67ca30fba9",
			"d469217a-108d-41d7-8ce2-dad58b43f1c2", "d575a733-4b4d-4088-bad7-7bbffa1f2767",
			"d5e6a812-dd37-4742-bfba-abdc2b75d19a", "d9f441a0-1219-41d7-9457-ebe7ee11dc3f",
			"dde7403f-0cb4-4db9-ab72-3499df86ced2", "de649fb0-0ea8-41d7-8ccb-f7a3fcedcd63",
			"df9f4728-0ea7-41d7-9612-a829907d2bf6", "e5381873-d36c-4087-b6fe-d6d6addf9c93",
			"e5b5ce22-69d9-434c-aec5-a5cb6477d96a", "e92fe9a5-ccc7-4696-b9d2-ae4a7676d2e1",
			"ec7cce42-9fd2-4598-b9f4-c3b21a7f9cb8", "ef046bd7-662d-4374-baaf-450aa42206ed",
			"eff743dc-0ea7-41d7-8246-cecc2e49beb0", "f0471674-1090-41d7-9d0f-ef2e9cd9fd4c",
			"f0bb13c3-3ff7-444f-865e-18a2f5fda3e8", "f3e77863-3fcd-4670-9c3a-96ca01a07327",
			"f4f1d907-d7dc-4b2e-8efb-857c4bb121cb", "f6f092d2-0ea8-41d7-8074-f74b3a1f4f8e",
			"f7921203-431d-4ab3-9d78-b3e9026e9e66", "fa4ab24c-2901-41ee-bdc7-c6610cc0f4d6" };
	static {
		// UnitTest.$dtp_astruct$ = null;
		UnitTest.twoTwelve = SubLObjectFactory.makeInteger(212);
	}

	private static boolean SHOULD_PRINT_TESTS = true;

	private static boolean SHOULD_RUN_EXPENSIVE_TESTS = false;

	public static SubLObject astruct_print_function_trampoline(SubLObject object, SubLObject stream) {
		compatibility.default_struct_print_function(object, stream, CommonSymbols.ZERO_INTEGER);
		return CommonSymbols.NIL;
	}

	static private void checkDecodeUniversalTime(SubLNumber universalTime, SubLObject[] values, SubLObject timezone) {
		UnitTest.shouldPrintTests("Checking whether we can decode universal time " + universalTime + " ....");
		String[] vars = { "second", "minute", "hour", "day", "month", "year" };
		for (int i = 0; i < vars.length; i++)
			if (values[i] == null)
				UnitTest.shouldPrintTests("Skipping " + vars[i] + " in test ....");
			else
				UnitTest.testEvalEquals("T",
						"(cmultiple-value-bind (second minute hour day month year) " + "(decode-universal-time "
								+ universalTime + " "
								+ (timezone == CommonSymbols.UNPROVIDED ? "" : timezone.toString()) + ") " + "(= "
								+ vars[i] + " " + values[i] + "))");
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	// @todo refactor to share more code with readloop

	public static void initCompiledStructures() {
		if (true)
			throw new NoSuchFieldError(" initialize();");
		UnitTest.initSlotMethods();
		SubLObjectFactory.makeSymbol("MAKE-ASTRUCT");
		SubLObjectFactory.makeSymbol("ASTRUCT-P");
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest", "make_astruct", "MAKE-ASTRUCT",
				0, 1, false);
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnitTest", "astruct_p", "ASTRUCT-P", 1, 0,
				false);
	}

	private static void initPrintMethod() {
		Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), null, // UnitTest.$dtp_astruct$.getGlobalValue(),
				Symbols.symbol_function(SubLObjectFactory.makeSymbol("ASTRUCT-PRINT-FUNCTION-TRAMPOLINE")));
	}

	private static void initSlotMethods() {
		Structures.def_csetf(SubLObjectFactory.makeSymbol("ASTRUCT-B-SLOT"),
				SubLObjectFactory.makeSymbol("_CSETF-ASTRUCT-B-SLOT"));
		Structures.def_csetf(SubLObjectFactory.makeSymbol("ASTRUCT-C-SLOT"),
				SubLObjectFactory.makeSymbol("_CSETF-ASTRUCT-C-SLOT"));
	}

	public static void main(final String[] args) {
		System.out.println("Starting.");
		try {
			SubLProcess subLProcess = new SubLProcess("Initial Lisp Listener") {
				public void safeRun() {
					SubLMain.initializeSubL(args);
					SubLMain.initializeTranslatedSystems();
					SubLMain.setMainReader(null);
					// SubLFiles.initialize(Keyhashes.me);
					CommonSymbols.SSS.setDynamicValue(SubLObjectFactory.makeInteger(212));
					SubLMain.setIsInitialized();
					TestRunner.run(UnitTest.suite());
					System.exit(0);
				}
			};
			SubLThreadPool.getDefaultPool().execute(subLProcess);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SubLObject readAndEval(String str) {
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		SubLString strTyped = SubLObjectFactory.makeString(str);
		SubLObject form = reader.read_from_string(strTyped, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		return form.eval(env);
	}

	public static void shouldPrintTests(String msg) {
		if (UnitTest.SHOULD_PRINT_TESTS)
			System.out.println(msg);
	}

	/**
	 * Runs the unit tests
	 */
	public static Test suite() {
		TestSuite testSuite = new TestSuite();
		testSuite.addTest(new UnitTest("testCCatch"));
		testSuite.addTest(new UnitTest("testSelfEvaluation"));
		testSuite.addTest(new UnitTest("testNilEvaluation"));
		testSuite.addTest(new UnitTest("testSimpleFunctionEvaluation"));
		testSuite.addTest(new UnitTest("testErrorEvaluation"));
		testSuite.addTest(new UnitTest("testOptionalArgEvaluation"));
		testSuite.addTest(new UnitTest("testRestArgEvaluation"));
		testSuite.addTest(new UnitTest("testQuote"));
		testSuite.addTest(new UnitTest("testProgn"));
		testSuite.addTest(new UnitTest("testPif"));
		testSuite.addTest(new UnitTest("testPwhen"));
		testSuite.addTest(new UnitTest("testPunless"));
		testSuite.addTest(new UnitTest("testPcond"));
		testSuite.addTest(new UnitTest("testLexicalVariables"));
		testSuite.addTest(new UnitTest("testDynamicVariables"));
		testSuite.addTest(new UnitTest("testCsetq"));
		testSuite.addTest(new UnitTest("testClet"));
		testSuite.addTest(new UnitTest("testCunwindProtect"));
		testSuite.addTest(new UnitTest("testCcatch"));
		testSuite.addTest(new UnitTest("testCmultipleValueBind"));
		testSuite.addTest(new UnitTest("testFif"));
		testSuite.addTest(new UnitTest("testBasicEquality"));
		testSuite.addTest(new UnitTest("testSymbolEquality"));
		testSuite.addTest(new UnitTest("testKeywordEquality"));
		testSuite.addTest(new UnitTest("testCharacterEquality"));
		testSuite.addTest(new UnitTest("testStringEquality"));
		testSuite.addTest(new UnitTest("testFixnumEquality"));
		testSuite.addTest(new UnitTest("testNumberEquality"));
		testSuite.addTest(new UnitTest("testNumberComparison"));
		testSuite.addTest(new UnitTest("testListEquality"));
		testSuite.addTest(new UnitTest("testLambdaFunctions"));
		testSuite.addTest(new UnitTest("testNumberFormats"));
		testSuite.addTest(new UnitTest("testCharacterFormats"));
		testSuite.addTest(new UnitTest("testSymbolNames"));
		testSuite.addTest(new UnitTest("testStrings"));
		testSuite.addTest(new UnitTest("testTypePredicates"));
		testSuite.addTest(new UnitTest("testMember"));
		testSuite.addTest(new UnitTest("testCDoTimes"));
		testSuite.addTest(new UnitTest("testCDoList"));
		testSuite.addTest(new UnitTest("testCDoHash"));
		testSuite.addTest(new UnitTest("testCPushAndCPop"));
		testSuite.addTest(new UnitTest("testMapping"));
		testSuite.addTest(new UnitTest("testDefine"));
		testSuite.addTest(new UnitTest("testProcesses"));
		testSuite.addTest(new UnitTest("testCTime"));
		testSuite.addTest(new UnitTest("testSort"));
		testSuite.addTest(new UnitTest("testHashtables"));
		testSuite.addTest(new UnitTest("testKeyhashes"));
		testSuite.addTest(new UnitTest("testCharacterFunctions"));
		testSuite.addTest(new UnitTest("testStringFunctions"));
		testSuite.addTest(new UnitTest("testPackageFunctions"));
		testSuite.addTest(new UnitTest("testSymbolFunctions"));
		testSuite.addTest(new UnitTest("testSequenceFunctions"));
		testSuite.addTest(new UnitTest("testFileSysFunctions"));
		testSuite.addTest(new UnitTest("testGUIDs"));
		testSuite.addTest(new UnitTest("testStringStreams"));
		testSuite.addTest(new UnitTest("testMathFunctions"));
		testSuite.addTest(new UnitTest("testTimeMethods"));
		testSuite.addTest(new UnitTest("testFunctions"));
		testSuite.addTest(new UnitTest("testPolymorphic"));
		testSuite.addTest(new UnitTest("testSxhash"));
		testSuite.addTest(new UnitTest("testPrinterControlVars"));
		testSuite.addTest(new UnitTest("testAppend"));
		testSuite.addTest(new UnitTest("testWithErrorHandler"));
		testSuite.addTest(new UnitTest("testCycLSets"));
		testSuite.addTest(new UnitTest("testDefineCachedFunctions"));
		testSuite.addTest(new UnitTest("testFormat"));
		testSuite.addTest(new UnitTest("testCycLListComparison"));
		testSuite.addTest(new UnitTest("testQueues"));
		testSuite.addTest(new UnitTest("testMultipleValues"));
		testSuite.addTest(new UnitTest("testWithTimeout"));
		testSuite.addTest(new UnitTest("testDynamicBinding"));
		testSuite.addTest(new UnitTest("testCsetf"));
		testSuite.addTest(new UnitTest("testCDo"));
		testSuite.addTest(new UnitTest("testCProgv"));
		testSuite.addTest(new UnitTest("testCSome"));
		testSuite.addTest(new UnitTest("testNconc"));
		testSuite.addTest(new UnitTest("testCand"));
		testSuite.addTest(new UnitTest("testCnot"));
		testSuite.addTest(new UnitTest("testInterpretedStructures"));
		testSuite.addTest(new UnitTest("testKeywords"));
		testSuite.addTest(new UnitTest("testTerminalStreams"));
		testSuite.addTest(new UnitTest("testLoadExternalCode"));
		testSuite.addTest(new UnitTest("testReadloopErrorHandling"));
		testSuite.addTest(new UnitTest("testStreamFlushing"));
		testSuite.addTest(new UnitTest("testCompiledSymbolProperties"));
		testSuite.addTest(new UnitTest("testInterpretedSymbolProperties"));
		testSuite.addTest(new UnitTest("testResourcer"));
		testSuite.addTest(new UnitTest("testExternalProcessStreamClosing"));
		testSuite.addTest(new UnitTest("testCMerge"));
		testSuite.addTest(new UnitTest("testErrorsAndWarnsGoToRightStream"));
		testSuite.addTest(new UnitTest("testReadSequence"));
		// SERIOUS TESTING
		// testSuite.addTest(new UnitTest("testCyclops"));
		return testSuite;
	}

	public static void testAppend() {
		UnitTest.testEvalEquals("'(A B C D E F G)", "(append '(a b c) '(d e f) '() '(g))");
		UnitTest.testEvalEquals("'(A B C D E F G)", "(append '(a b c) nil nil '(d e f) '() '(g))");
		UnitTest.testEvalEquals("'(A B C D E F G)", "(append nil nil nil '(a b c) nil nil '(d e f) '() '(g))");
		UnitTest.testEvalEquals("'(A B C D E F G)",
				"(append nil nil nil '(a b c) nil nil '(d e f) '() '(g) nil nil nil)");
		UnitTest.testEvalEquals("'(A B C . D)", "(append '(a b c) 'd)");
		UnitTest.testEvalEquals("'(1 A . B)", "(append '(1 . 2) '(a . b))");
		UnitTest.testEvalEquals("'a", "(append nil 'a)");
		UnitTest.testEvalEquals("'(a)", "(append '(a . b) nil)");
		UnitTest.testEvalEquals("'(a)", "(append nil '(a) nil)");
		UnitTest.testEvalEquals("NIL", "(append)");
		UnitTest.testEvalEquals("'a", "(append 'a)");
		UnitTest.testEvalEquals("'(A B C D E F G)", "(append (cdr '(1 a b c)) (cdr '(1 d e f)) '() '(g))");
		UnitTest.testEvalEquals("'(A B C . D)", "(append (cdr '(1 a b c)) 'd)");
		UnitTest.testEvalEquals("nil", "(append nil nil nil)");
	}

	public static void testBasicEquality() {
		// T and NIL
		UnitTest.testEvalEquals("T", "(eq t t)");
		UnitTest.testEvalEquals("T", "(eql t t)");
		UnitTest.testEvalEquals("T", "(equal t t)");
		UnitTest.testEvalEquals("T", "(equalp t t)");
		UnitTest.testEvalEquals("NIL", "(eq t nil)");
		UnitTest.testEvalEquals("NIL", "(eql t nil)");
		UnitTest.testEvalEquals("NIL", "(equal t nil)");
		UnitTest.testEvalEquals("NIL", "(equalp t nil)");
		UnitTest.testEvalError("(eq)");
		UnitTest.testEvalError("(eql)");
		UnitTest.testEvalError("(equal)");
		UnitTest.testEvalError("(equalp)");
		UnitTest.testEvalError("(eq 1)");
		UnitTest.testEvalError("(eql 1)");
		UnitTest.testEvalError("(equal 1)");
		UnitTest.testEvalError("(equalp 1)");
		UnitTest.testEvalError("(eq . 1)");
		UnitTest.testEvalError("(eql . 1)");
		UnitTest.testEvalError("(equal . 1)");
		UnitTest.testEvalError("(equalp . 1)");
		UnitTest.testEvalError("(eq 1 . 2)");
		UnitTest.testEvalError("(eql 1 . 2)");
		UnitTest.testEvalError("(equal 1 . 2)");
		UnitTest.testEvalError("(equalp 1 . 2)");
		UnitTest.testEvalError("(eq 1 2 3)");
		UnitTest.testEvalError("(eql 1 2 3)");
		UnitTest.testEvalError("(equal 1 2 3)");
		UnitTest.testEvalError("(equalp 1 2 3)");
		UnitTest.testEvalError("(eq 1 2 . 3)");
		UnitTest.testEvalError("(eql 1 2 . 3)");
		UnitTest.testEvalError("(equal 1 2 . 3)");
		UnitTest.testEvalError("(equalp 1 2 . 3)");
	}

	public static void testCand() {
		UnitTest.testEvalEquals("T", "(cand)");
		UnitTest.testEvalEquals("T", "(cand 'xx 'yy)");
		UnitTest.testEvalEquals("T", "(cand T)");
		UnitTest.testEvalEquals("NIL", "(cand NIL T)");
		UnitTest.testEvalEquals("NIL", "(cand T NIL)");
		UnitTest.testEvalEquals("T", "(cand T T T)");
		UnitTest.testEvalEquals("NIL", "(cand NIL NIL NIL)");
		UnitTest.testEvalEquals("T", "(cand 1 2)");
		UnitTest.testEvalError("(cand 1 . 2)");
		UnitTest.testEvalError("(cand xasdrwsefrax yasdfsdfasdfry)");
	}

	public static void testCcatch() {
		UnitTest.testEvalEquals("0", "(csetq x 0)");
		UnitTest.testEvalEquals("0", "x");
		UnitTest.testEvalEquals("NIL", "(ccatch :foo x)");
		UnitTest.testEvalEquals("0", "x");
		UnitTest.testEvalEquals("2", "(ccatch :foo x (+ 1 1))");
		UnitTest.testEvalEquals("0", "x");
		UnitTest.testEvalEquals("3", "(ccatch :foo x (throw :foo 3))");
		UnitTest.testEvalEquals("3", "x");
		UnitTest.testEvalEquals("4", "(ccatch :foo x (ccatch :bar x (throw :foo 4)))");
		UnitTest.testEvalEquals("4", "x");
		UnitTest.testEvalEquals("5", "(clet ((y 0) x)(ccatch :foo x (cunwind-protect (throw :foo 4)(csetq y 5))) y)");
		UnitTest.testEvalError("(ccatch)");
		UnitTest.testEvalError("(ccatch 1)");
		UnitTest.testEvalError("(ccatch . 1)");
		UnitTest.testEvalError("(ccatch 1 . 2)");
		UnitTest.testEvalError("(ccatch 1 2 3)");
		UnitTest.testEvalError("(ccatch 1 2 . 3)");
	}

	public static void testCDo() {
		UnitTest.testEvalEquals("4",
				"(cdo ((temp-one 1 (cinc temp-one)) (temp-two 0 (cdec temp-two))) ((> (- temp-one temp-two) 5) temp-one))");
	}

	public static void testCDoHash() {
		UnitTest.testEvalEquals("T",
				"(progn (csetq *test-hashtable* (make-hash-table 5)) (hash-table-p *test-hashtable*))");
		UnitTest.testEvalEquals("'(0 0 0)",
				"(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
		UnitTest.testEvalEquals("10", "(sethash 1 *test-hashtable* 10)");
		UnitTest.testEvalEquals("'(1 1 10)",
				"(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
		UnitTest.testEvalEquals("20", "(sethash 2 *test-hashtable* 20)");
		UnitTest.testEvalEquals("'(2 3 30)",
				"(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
		UnitTest.testEvalEquals("30", "(sethash 3 *test-hashtable* 30)");
		UnitTest.testEvalEquals("'(3 6 60)",
				"(clet ((count 0)(keys 0)(vals 0)) (cdohash (key val *test-hashtable*) (cinc count) (cinc keys key) (cinc vals val)) (list count keys vals))");
		// @todo add more tests
	}

	public static void testCDoList() {
		UnitTest.testEvalEquals("5",
				"(clet ((result 0)) (cdolist (x '(a b c d e)) (csetq result (+ result 1))) result)");
		// @todo add more tests
	}

	public static void testCDoTimes() {
		UnitTest.testEvalEquals("200", "(clet ((x 0)) (cdotimes (y 100) (csetq x (+ x 2))) x)");
		UnitTest.testEvalEquals("4950", "(clet ((x 0)) (cdotimes (y 100) (csetq x (+ x y))) x)");
		// @todo add more tests
	}

	public static void testCharacterEquality() {
		UnitTest.testEvalEquals("T", "(eq #\\a #\\a)");
		UnitTest.testEvalEquals("T", "(eql #\\a #\\a)");
		UnitTest.testEvalEquals("T", "(equal #\\a #\\a)");
		UnitTest.testEvalEquals("T", "(equalp #\\a #\\a)");
		UnitTest.testEvalEquals("NIL", "(eq #\\a #\\b)");
		UnitTest.testEvalEquals("NIL", "(eql #\\a #\\b)");
		UnitTest.testEvalEquals("NIL", "(equal #\\a #\\b)");
		UnitTest.testEvalEquals("NIL", "(equalp #\\a #\\b)");
		UnitTest.testEvalEquals("NIL", "(eq #\\a #\\A)");
		UnitTest.testEvalEquals("NIL", "(eql #\\a #\\A)");
		UnitTest.testEvalEquals("NIL", "(equal #\\a #\\A)");
		UnitTest.testEvalEquals("T", "(equalp #\\a #\\A)");
	}

	public static void testCharacterFormats() {
		// testEvalError("");
		// testEvalEquals("", "");
		UnitTest.testEvalOfType("#\\Space", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\SPACE", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\sPaCe", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Newline", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\NEWLINE", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\NewLine", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Tab", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Backspace", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Linefeed", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Page", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Return", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Rubout", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Escape", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Esc", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\a", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\9", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\A", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\g", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Meta-Space", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\ControL-A", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\Control-Meta-Q", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\MEta-\\a", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\C-M-O", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\meta-space", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\meta-\\space", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\m-\\space", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\m-space", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\control-d", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\control-\\D", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\c-\\e", SubLCharacter.class);
		UnitTest.testEvalOfType("#\\c-E", SubLCharacter.class);
		UnitTest.testEvalEquals("#\\SPACE", "#\\space");
		/*
		 * These don't work in Allegro: testEvalEquals("#\\META-(",
		 * "#\\meta-("); testEvalEquals("#\\META-(", "#\\meta-\\(");
		 * testEvalEquals("#\\META-(", "#\\m-("); testEvalEquals("#\\META-(",
		 * "#\\m-\\(");
		 */
		UnitTest.testEvalNotEquals("#\\a", "#\\b");
		UnitTest.testEvalEquals("#\\a", "#\\a");
		UnitTest.testEvalNotEquals("#\\a", "#\\A");
		UnitTest.testEvalEquals("#\\meta-a", "#\\meta-a");
		UnitTest.testEvalNotEquals("#\\a", "#\\control-a");
		UnitTest.testEvalNotEquals("#\\a", "#\\meta-a");
		UnitTest.testEvalNotEquals("#\\meta-a", "#\\control-a");
		UnitTest.testEvalNotEquals("#\\meta-a", "#\\control-meta-a");
	}

	public static void testCharacterFunctions() {
		UnitTest.testEvalEquals("#\\1", "(digit-char 1)");
		UnitTest.testEvalEquals("#\\8", "(digit-char 8)");
		UnitTest.testEvalEquals("#\\A", "(digit-char 10)");
		UnitTest.testEvalEquals("#\\K", "(digit-char 20)");
		UnitTest.testEvalEquals("#\\Z", "(digit-char 35)");

		UnitTest.testEvalEquals("nil", "(digit-char-p #\\a)");
		UnitTest.testEvalEquals("nil", "(digit-char-p #\\9 8)");
		UnitTest.testEvalEquals(" 9", "(digit-char-p #\\9)");
		UnitTest.testEvalEquals("10", "(digit-char-p #\\a 11)");
		UnitTest.testEvalEquals("10", "(digit-char-p #\\a 16)");
		UnitTest.testEvalEquals("15", "(digit-char-p #\\F 16)");
		UnitTest.testEvalEquals("15", "(digit-char-p #\\f 16)");

		UnitTest.testEvalEquals("t", "(alphanumericp #\\a)");
		UnitTest.testEvalEquals("t", "(alphanumericp #\\A)");
		UnitTest.testEvalEquals("t", "(alphanumericp #\\1)");
		UnitTest.testEvalEquals("nil", "(alphanumericp #\\,)");
		UnitTest.testEvalEquals("nil", "(alphanumericp #\\Escape)");
		UnitTest.testEvalError("(alphanumericp 37)");

		UnitTest.testEvalEquals("t", "(alpha-char-p #\\a)");
		UnitTest.testEvalEquals("nil", "(alpha-char-p #\\9)");
		UnitTest.testEvalEquals("t", "(alpha-char-p #\\A)");
		UnitTest.testEvalEquals("NIL", "(alpha-char-p #\\,)");
		UnitTest.testEvalEquals("NIL", "(alpha-char-p #\\Space)");
		UnitTest.testEvalEquals("NIL", "(alpha-char-p #\\))");
		UnitTest.testEvalError("(alpha-char-p 'b)");
		UnitTest.testEvalError("(alpha-char-p 10)");

		UnitTest.testEvalEquals("t", "(upper-case-p #\\A)");
		UnitTest.testEvalEquals("nil", "(upper-case-p #\\a)");
		UnitTest.testEvalEquals("t", "(upper-case-p #\\S)");
		UnitTest.testEvalEquals("NIL", "(upper-case-p #\\,)");
		UnitTest.testEvalEquals("NIL", "(upper-case-p #\\Space)");
		UnitTest.testEvalEquals("NIL", "(upper-case-p #\\))");
		UnitTest.testEvalError("(upper-case-p 'b)");
		UnitTest.testEvalError("(upper-case-p 10)");

		UnitTest.testEvalEquals("nil", "(lower-case-p #\\A)");
		UnitTest.testEvalEquals("t", "(lower-case-p #\\a)");
		UnitTest.testEvalEquals("nil", "(lower-case-p #\\S)");
		UnitTest.testEvalEquals("NIL", "(lower-case-p #\\,)");
		UnitTest.testEvalEquals("NIL", "(lower-case-p #\\Space)");
		UnitTest.testEvalEquals("NIL", "(lower-case-p #\\))");
		UnitTest.testEvalError("(lower-case-p 'b)");
		UnitTest.testEvalError("(lower-case-p 10)");

		UnitTest.testEvalEquals("t", "(both-case-p #\\a)");
		UnitTest.testEvalEquals("nil", "(both-case-p #\\9)");
		UnitTest.testEvalEquals("t", "(both-case-p #\\A)");
		UnitTest.testEvalEquals("NIL", "(both-case-p #\\,)");
		UnitTest.testEvalEquals("NIL", "(both-case-p #\\Space)");
		UnitTest.testEvalEquals("NIL", "(both-case-p #\\))");
		UnitTest.testEvalError("(both-case-p 'b)");
		UnitTest.testEvalError("(both-case-p 10)");

		UnitTest.testEvalEquals("97", "(char-code #\\a)");
		UnitTest.testEvalEquals("57", "(char-code #\\9)");
		UnitTest.testEvalEquals("65", "(char-code #\\A)");
		UnitTest.testEvalEquals("44", "(char-code #\\,)");
		UnitTest.testEvalEquals("32", "(char-code #\\Space)");
		UnitTest.testEvalError("(char-code 'b)");
		UnitTest.testEvalError("(char-code 10)");

		UnitTest.testEvalEquals("#\\a", "(code-char 97)");
		UnitTest.testEvalEquals("#\\9", "(code-char 57)");
		UnitTest.testEvalEquals("#\\A", "(code-char 65)");
		UnitTest.testEvalEquals("#\\,", "(code-char 44)");
		UnitTest.testEvalEquals("#\\Space", "(code-char 32)");
		UnitTest.testEvalEquals("nil", "(code-char 256)");
		UnitTest.testEvalEquals("nil", "(code-char -1)");
		UnitTest.testEvalError("(code-char 'b)");
		UnitTest.testEvalError("(code-char #\\A)");

		Assert.assertEquals(Characters.name_character(SubLObjectFactory.makeString("Esc")),
				UnitTest.readAndEval("#\\esc"));
		Assert.assertNotNull(Characters.name_character(SubLObjectFactory.makeString("Esc")));

		UnitTest.testEvalEquals("#\\A", "(char-upcase #\\a)");
		UnitTest.testEvalEquals("#\\9", "(char-upcase #\\9)");
		UnitTest.testEvalEquals("#\\A", "(char-upcase #\\A)");
		UnitTest.testEvalEquals("#\\,", "(char-upcase #\\,)");
		UnitTest.testEvalEquals("#\\space", "(char-upcase #\\Space)");
		UnitTest.testEvalEquals("#\\)", "(char-upcase #\\))");
		UnitTest.testEvalEquals("#\\control-meta-a", "(char-upcase #\\c-m-a)");
		UnitTest.testEvalError("(char-upcase 'b)");
		UnitTest.testEvalError("(char-upcase 10)");

		UnitTest.testEvalEquals("#\\a", "(char-downcase #\\a)");
		UnitTest.testEvalEquals("#\\9", "(char-downcase #\\9)");
		UnitTest.testEvalEquals("#\\a", "(char-downcase #\\A)");
		UnitTest.testEvalEquals("#\\,", "(char-downcase #\\,)");
		UnitTest.testEvalEquals("#\\SPACE", "(char-downcase #\\Space)");
		UnitTest.testEvalEquals("#\\)", "(char-downcase #\\))");
		UnitTest.testEvalEquals("#\\control-meta-a", "(char-downcase #\\c-m-a)");
		UnitTest.testEvalError("(char-downcase 'b)");
		UnitTest.testEvalError("(char-downcase 10)");

		UnitTest.testEvalEquals("t", "(char-equal #\\a #\\a)");
		UnitTest.testEvalEquals("T", "(char-equal #\\a #\\A)");
		UnitTest.testEvalEquals("nil", "(char-equal #\\a #\\1)");
		UnitTest.testEvalEquals("nil", "(char-equal #\\a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char-equal #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char-equal 10 #\\a)");
		UnitTest.testEvalError("(char-equal #\\a 10)");
		UnitTest.testEvalError("(char-equal)");
		UnitTest.testEvalError("(char-equal #\\a)");

		UnitTest.testEvalEquals("nil", "(char-not-equal #\\a #\\a)");
		UnitTest.testEvalEquals("nil", "(char-not-equal #\\a #\\A)");
		UnitTest.testEvalEquals("t", "(char-not-equal #\\a #\\1)");
		UnitTest.testEvalEquals("t", "(char-not-equal #\\a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char-not-equal #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char-not-equal 10 #\\a)");
		UnitTest.testEvalError("(char-not-equal #\\a 10)");
		UnitTest.testEvalError("(char-not-equal)");
		UnitTest.testEvalError("(char-not-equal #\\a)");

		UnitTest.testEvalEquals("nil", "(equal (read-from-string \"#\\\\b\") (read-from-string \"#\\\\B\"))");
		/*
		 * SubLObject bigB = SubLObjectFactory.makeString("B"); SubLObject
		 * littleB = SubLObjectFactory.makeString("b"); SubLObject bigChar =
		 * name_character(bigB); SubLObject littleChar =
		 * name_character(littleB); System.out.println(bigChar + " " +
		 * littleChar);
		 */

		UnitTest.testEvalEquals("nil", "(char-greaterp #\\a #\\a)");
		UnitTest.testEvalEquals("nil", "(char-greaterp #\\A #\\a)");
		UnitTest.testEvalEquals("nil", "(char-greaterp #\\a #\\b)");
		UnitTest.testEvalEquals("nil", "(char-greaterp #\\A #\\b)");
		UnitTest.testEvalEquals("nil", "(char-greaterp #\\a #\\B)");
		UnitTest.testEvalEquals("t", "(char-greaterp #\\a #\\1)");
		UnitTest.testEvalEquals("t", "(char-greaterp #\\a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char-greaterp #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char-greaterp 10 #\\a)");
		UnitTest.testEvalError("(char-greaterp #\\a 10)");
		UnitTest.testEvalError("(char-greaterp)");
		UnitTest.testEvalError("(char-greaterp 10)");

		UnitTest.testEvalEquals("nil", "(char-lessp #\\a #\\a)");
		UnitTest.testEvalEquals("t", "(char-lessp #\\a #\\b)");
		UnitTest.testEvalEquals("t", "(char-lessp #\\A #\\b)");
		UnitTest.testEvalEquals("t", "(char-lessp #\\a #\\B)");
		UnitTest.testEvalEquals("nil", "(char-lessp #\\A #\\a)");
		UnitTest.testEvalEquals("nil", "(char-lessp #\\a #\\1)");
		UnitTest.testEvalEquals("nil", "(char-lessp #\\a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char-lessp #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char-lessp 10 #\\a)");
		UnitTest.testEvalError("(char-lessp #\\a 10)");
		UnitTest.testEvalError("(char-lessp)");
		UnitTest.testEvalError("(char-lessp 10)");

		UnitTest.testEvalEquals("t", "(char-not-greaterp #\\a #\\a)");
		UnitTest.testEvalEquals("t", "(char-not-greaterp #\\a #\\b)");
		UnitTest.testEvalEquals("t", "(char-not-greaterp #\\A #\\b)");
		UnitTest.testEvalEquals("t", "(char-not-greaterp #\\a #\\B)");
		UnitTest.testEvalEquals("t", "(char-not-greaterp #\\A #\\a)");
		UnitTest.testEvalEquals("nil", "(char-not-greaterp #\\a #\\1)");
		UnitTest.testEvalEquals("nil", "(char-not-greaterp #\\a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char-not-greaterp #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char-not-greaterp 10 #\\a)");
		UnitTest.testEvalError("(char-not-greaterp #\\a 10)");
		UnitTest.testEvalError("(char-not-greaterp)");
		UnitTest.testEvalError("(char-not-greaterp 10)");

		UnitTest.testEvalEquals("t", "(char-not-lessp #\\a #\\a)");
		UnitTest.testEvalEquals("nil", "(char-not-lessp #\\a #\\b)");
		UnitTest.testEvalEquals("nil", "(char-not-lessp #\\A #\\b)");
		UnitTest.testEvalEquals("nil", "(char-not-lessp #\\a #\\B)");
		UnitTest.testEvalEquals("t", "(char-not-lessp #\\A #\\a)");
		UnitTest.testEvalEquals("t", "(char-not-lessp #\\a #\\1)");
		UnitTest.testEvalEquals("t", "(char-not-lessp #\\a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char-not-lessp #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char-not-lessp 10 #\\a)");
		UnitTest.testEvalError("(char-not-lessp #\\a 10)");
		UnitTest.testEvalError("(char-not-lessp)");
		UnitTest.testEvalError("(char-not-lessp 10)");

		UnitTest.testEvalEquals("t", "(char= #\\a #\\a)");
		UnitTest.testEvalEquals("nil", "(char= #\\a #\\A)");
		UnitTest.testEvalEquals("nil", "(char= #\\a #\\1)");
		UnitTest.testEvalEquals("nil", "(char= #\\a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char= #\\meta-a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char= 10 #\\a)");
		UnitTest.testEvalEquals("nil", "(char= #\\a 10)");
		UnitTest.testEvalError("(char=)");
		UnitTest.testEvalError("(char= #\\a)");

		UnitTest.testEvalEquals("nil", "(char/= #\\a #\\a)");
		UnitTest.testEvalEquals("t", "(char/= #\\a #\\A)");
		UnitTest.testEvalEquals("t", "(char/= #\\a #\\1)");
		UnitTest.testEvalEquals("t", "(char/= #\\a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char/= #\\meta-a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char/= 10 #\\a)");
		UnitTest.testEvalEquals("t", "(char/= #\\a 10)");
		UnitTest.testEvalError("(char/=)");
		UnitTest.testEvalError("(char/= #\\a)");

		UnitTest.testEvalEquals("nil", "(char> #\\a #\\a)");
		UnitTest.testEvalEquals("nil", "(char> #\\A #\\a)");
		UnitTest.testEvalEquals("nil", "(char> #\\a #\\b)");
		UnitTest.testEvalEquals("nil", "(char> #\\A #\\b)");
		UnitTest.testEvalEquals("t", "(char> #\\a #\\B)");
		UnitTest.testEvalEquals("t", "(char> #\\a #\\1)");
		UnitTest.testEvalEquals("t", "(char> #\\a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char> #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char> 10 #\\a)");
		UnitTest.testEvalError("(char> #\\a 10)");
		UnitTest.testEvalError("(char>)");
		UnitTest.testEvalError("(char-greaterp 10)");

		UnitTest.testEvalEquals("nil", "(char< #\\a #\\a)");
		UnitTest.testEvalEquals("t", "(char< #\\a #\\b)");
		UnitTest.testEvalEquals("t", "(char< #\\A #\\b)");
		UnitTest.testEvalEquals("nil", "(char< #\\a #\\B)");
		UnitTest.testEvalEquals("t", "(char< #\\A #\\a)");
		UnitTest.testEvalEquals("nil", "(char< #\\a #\\1)");
		UnitTest.testEvalEquals("nil", "(char< #\\a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char< #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char< 10 #\\a)");
		UnitTest.testEvalError("(char< #\\a 10)");
		UnitTest.testEvalError("(char<)");
		UnitTest.testEvalError("(char< 10)");

		UnitTest.testEvalEquals("t", "(char<= #\\a #\\a)");
		UnitTest.testEvalEquals("t", "(char<= #\\a #\\b)");
		UnitTest.testEvalEquals("t", "(char<= #\\A #\\b)");
		UnitTest.testEvalEquals("nil", "(char<= #\\a #\\B)");
		UnitTest.testEvalEquals("t", "(char<= #\\A #\\a)");
		UnitTest.testEvalEquals("nil", "(char<= #\\a #\\1)");
		UnitTest.testEvalEquals("nil", "(char<= #\\a #\\control-a)");
		UnitTest.testEvalEquals("nil", "(char<= #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char<= 10 #\\a)");
		UnitTest.testEvalError("(char<= #\\a 10)");
		UnitTest.testEvalError("(char<=)");
		UnitTest.testEvalError("(char<= 10)");

		UnitTest.testEvalEquals("t", "(char>= #\\a #\\a)");
		UnitTest.testEvalEquals("nil", "(char>= #\\a #\\b)");
		UnitTest.testEvalEquals("nil", "(char>= #\\A #\\b)");
		UnitTest.testEvalEquals("t", "(char>= #\\a #\\B)");
		UnitTest.testEvalEquals("nil", "(char>= #\\A #\\a)");
		UnitTest.testEvalEquals("t", "(char>= #\\a #\\1)");
		UnitTest.testEvalEquals("t", "(char>= #\\a #\\control-a)");
		UnitTest.testEvalEquals("t", "(char>= #\\meta-a #\\control-a)");
		UnitTest.testEvalError("(char>= 10 #\\a)");
		UnitTest.testEvalError("(char>= #\\a 10)");
		UnitTest.testEvalError("(char>=)");
		UnitTest.testEvalError("(char>= 10)");
	}

	public static void testClet() {
		UnitTest.testEvalEquals("NIL", "(clet)"); // @diff C and Java yield NIL,
													// Allegro
		// and CMUCL error
		UnitTest.testEvalEquals("NIL", "(clet ())");
		UnitTest.testEvalEquals("212", "(clet () 212)");
		// clet local variables
		UnitTest.testEvalEquals("212", "(clet ((x 212)) x)");
		UnitTest.testEvalEquals("212", "(clet ((x 210)(y 2)) (+ x y))");
		UnitTest.testEvalEquals("212", "(clet ((x 210))(clet ((y 2)) (+ x y)))");
		UnitTest.testEvalEquals("212", "(clet ((x 0))(clet ((x 212)) x))");
		UnitTest.testEvalEquals("212", "(clet ((x 212))(clet ((x 0))) x)");
		// clet dynamic variables
		UnitTest.testEvalEquals("T", "(clet ((*** t)) ***)");
		UnitTest.testEvalEquals("212", "(clet ((*** 212)) ***)");
		UnitTest.testEvalEquals("212", "(clet ((*** 210)(y 2)) (+ *** y))");
		UnitTest.testEvalEquals("212", "(clet ((*** 210))(clet ((y 2)) (+ *** y)))");
		UnitTest.testEvalEquals("212", "(clet ((*** 0))(clet ((*** 212)) ***))");
		UnitTest.testEvalEquals("212", "(clet ((*** 212))(clet ((*** 0))) ***)");
		// clet + csetq
		UnitTest.testEvalEquals("212", "(csetq x 212)");
		UnitTest.testEvalEquals("212", "x");
		UnitTest.testEvalEquals("1", "(clet ((x 0)) (csetq x (+ x 1)) x)");
		UnitTest.testEvalEquals("212", "x");
		// ill-formed
		UnitTest.testEvalError("(clet 1)");
		UnitTest.testEvalError("(clet x)");
		UnitTest.testEvalError("(clet 1 . 2)");
		UnitTest.testEvalError("(clet x . 2)");
		UnitTest.testEvalError("(clet (x) . x)");
		UnitTest.testEvalError("(clet ((x . 2)) x)");
		UnitTest.testEvalError("(clet ((x 2) (y . 4)) x)");
	}

	public static void testCMerge() {
		UnitTest.testEvalEquals("'(1)", "(cmerge '(1) nil #'<)");
		UnitTest.testEvalEquals("'(1)", "(cmerge nil '(1) #'<)");
		UnitTest.testEvalEquals("'(1 2)", "(cmerge '(1 2) nil #'<)");
		UnitTest.testEvalEquals("'(1 2)", "(cmerge  nil '(1 2) #'<)");
		UnitTest.testEvalEquals("'(1 2)", "(cmerge  '(1) '(2) #'<)");
		UnitTest.testEvalEquals("'(1 2)", "(cmerge  '(2) '(1) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  nil '(1 2 3) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(1 2 3) nil  #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(1 2) '(3) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(1 3) '(2) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(2 3) '(1) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(1) '(2 3) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(2) '(1 3) #'<)");
		UnitTest.testEvalEquals("'(1 2 3)", "(cmerge  '(3) '(1 2) #'<)");
		UnitTest.testEvalEquals("'(1 2 3 4 5)", "(cmerge  '(2 4) '(1 3 5) #'<)");
		UnitTest.testEvalEquals("'(1 2 3 4 5)", "(cmerge  '(1 3 5) '(2 4)  #'<)");
		UnitTest.testEvalEquals("'(1 2 3 4 5 6)", "(cmerge  '(1 2 5 6) '(3 4)  #'<)");
		UnitTest.testEvalEquals("'(1 2 3 4 5 6)", "(cmerge  '(3 4) '(1 2 5 6)   #'<)");
		// @note following result is not strictly defined by Lisp in this
		// instance
		UnitTest.testEvalEquals("'(3 4 5 6 1 2)", "(cmerge  '(3 4) '(5 6 1 2)   #'<)");
	}

	public static void testCmultipleValueBind() {
		// multiple value return in general
		UnitTest.shouldPrintTests("Checking whether multiple value returns work properly ....");
		UnitTest.readAndEval("(define fetcher (x y z) (ret (values x y z)))");
		{
			Values.resetMultipleValues();
			UnitTest.testEvalEquals("1", "(fetcher 1 2 3)");
			SubLObject val1 = SubLProcess.nthMultipleValue(CommonSymbols.ONE_INTEGER);
			SubLObject val2 = SubLProcess.nthMultipleValue(CommonSymbols.TWO_INTEGER);
			Values.resetMultipleValues();
			UnitTest.testEvalEquals("2", val1.toString());
			UnitTest.testEvalEquals("3", val2.toString());
		}
		{
			Values.resetMultipleValues();
			SubLObject firstVal = UnitTest.testCmultipleValueBindHelper();
			SubLObject secondVal = SubLProcess.nthMultipleValue(CommonSymbols.ONE_INTEGER);
			SubLObject thirdVal = SubLProcess.nthMultipleValue(CommonSymbols.TWO_INTEGER);
			Assert.assertEquals(firstVal, CommonSymbols.NIL);
			Assert.assertEquals(secondVal, CommonSymbols.TWO_INTEGER);
			Assert.assertEquals(thirdVal, CommonSymbols.NIL);
		}
		// now test SubL forms
		UnitTest.testEvalEquals("NIL", "(cmultiple-value-bind () 1)");
		UnitTest.testEvalEquals("NIL", "(cmultiple-value-bind (x) 1)");
		UnitTest.testEvalEquals("1", "(cmultiple-value-bind (x) 1 x)");
		UnitTest.testEvalEquals("1", "(cmultiple-value-bind (x)(values 1) x)");
		UnitTest.testEvalEquals("NIL", "(cmultiple-value-bind (x y)(values 1) y)");
		UnitTest.testEvalEquals("1", "(cmultiple-value-bind (x y) (values 1 2) x)");
		UnitTest.testEvalEquals("2", "(cmultiple-value-bind (x y) (values 1 2) y)");
		UnitTest.testEvalEquals("2", "(cmultiple-value-bind (x y) (values 1 2 3) y)");
		UnitTest.testEvalEquals("2", "(clet ((x 2)) (cmultiple-value-bind (x) 1 x) x)");
		UnitTest.testEvalError("(cmultiple-value-bind)");
		UnitTest.testEvalError("(cmultiple-value-bind . 1)");
		UnitTest.testEvalError("(cmultiple-value-bind 1 2)");
		UnitTest.testEvalError("(cmultiple-value-bind nil . 2)");
		UnitTest.testEvalEquals("3", "(cmultiple-value-bind nil 2 3)"); // @diff
		// CMUCL/Allegro/Java
		// yield 3, but
		// C errors
		UnitTest.testEvalError("(cmultiple-value-bind nil 2 . 3)");

	}

	private static SubLObject testCmultipleValueBindHelper() {
		return Values.values(new SubLObject[] { CommonSymbols.NIL, CommonSymbols.TWO_INTEGER, CommonSymbols.NIL });
	}

	public static void testCnot() {
		UnitTest.testEvalEquals("T", "(cnot NIL)");
		UnitTest.testEvalEquals("NIL", "(cnot T)");
		UnitTest.testEvalEquals("NIL", "(cnot 212)");
		UnitTest.testEvalEquals("NIL", "(cnot '(1 2))");
		UnitTest.testEvalEquals("NIL", "(cnot (= 1 1))");
		UnitTest.testEvalEquals("T", "(cnot (= 1 2))");
		UnitTest.testEvalError("(cnot 1 . 2)");
	}

	public static void testCompiledSymbolProperties() {
		// defparameter *polymorphic-type-hierarchy*
		UnitTest.testEvalEquals(":DYNAMIC", "(get '*polymorphic-type-hierarchy* :binding-type)");
		UnitTest.testEvalEquals(":INITIALIZER", "(get '*polymorphic-type-hierarchy* :initialization-type)");
		// defvar *package*
		UnitTest.testEvalEquals(":DYNAMIC", "(get '*package* :binding-type)");
		UnitTest.testEvalEquals(":WORLD", "(get '*package* :initialization-type)");
		// deflexical *sublis-watermark*
		UnitTest.testEvalEquals(":LEXICAL", "(get '*sublis-watermark* :binding-type)");
		UnitTest.testEvalEquals(":INITIALIZER", "(get '*sublis-watermark* :initialization-type)");
		// defconstant *pi*
		UnitTest.testEvalEquals(":CONSTANT", "(get '*pi* :binding-type)");
		UnitTest.testEvalEquals(":INITIALIZER", "(get '*pi* :initialization-type)");
		// @todo when defglobal gets promoted to SubL, test it here as well
		// defglobal *???*
		// testEvalEquals(":LEXICAL", "(get '*???* :binding-type)");
		// testEvalEquals(":WORLD", "(get '*???* :initialization-type)");

	}

	public static void testCProgv() {
		UnitTest.testEvalEquals("5", "(csetq *x-234909320239341* 5)");
		UnitTest.testEvalEquals("9", "(csetq *x-234909320239342* 9)");
		UnitTest.testEvalEquals("2", "(cprogv '(*x-234909320239341* *x-234909320239342*) '(2 7) *x-234909320239341*)");
		UnitTest.testEvalEquals("5", "*x-234909320239341*");
		UnitTest.testEvalEquals("9", "*x-234909320239342*");
		UnitTest.testEvalEquals("7", "(cprogv '(*x-234909320239341* *x-234909320239342*) '(2 7) *x-234909320239342*)");
		UnitTest.testEvalEquals("5", "*x-234909320239341*");
		UnitTest.testEvalEquals("9", "*x-234909320239342*");
	}

	public static void testCPushAndCPop() {
		UnitTest.testEvalEquals("'(e d c b a)",
				"(clet ((result NIL)) (cdolist (x '(a b c d e)) (cpush x result)) result)");
		UnitTest.testEvalEquals("'(e d c b a)",
				"(clet ((result NIL)) (cdolist (x '(a b a c d e)) (cpushNew x result)) result)");
		UnitTest.testEvalEquals("'(e d c b a)",
				"(clet ((result NIL)) (cdolist (x '(a b c d e)) (cpushNew x result)) result)");
		UnitTest.testEvalEquals("'a", "(clet ((x '(a b c d e))) (cpop x))");
		UnitTest.testEvalEquals("'(b c d e)", "(clet ((x '(a b c d e))) (cpop x) x)");
		UnitTest.testEvalError("(cpop nil)");
		UnitTest.testEvalEquals("'(nil nil)", "(clet ((x nil)) (list (cpop x) x))");
		// @todo add more tests
	}

	public static void testCsetf() {
		UnitTest.testEvalEquals("3", "(csetf xyz 3)");
		UnitTest.testEvalEquals("3", "xyz");
		/*
		 * @todo -- these unit test depend on code outside of the SubL kernel
		 * but shouldn't testEvalEquals("\"isa\"", "(c-name #$isa)");
		 * testEvalEquals("\"BLAH\"", "(csetf (c-name #$isa) \"BLAH\")");
		 * // @dangerous 8-) testEvalEquals("\"BLAH\"", "(c-name #$isa)");
		 * testEvalEquals("\"isa\"", "(csetf (c-name #$isa) \"isa\")");
		 * testEvalEquals("\"isa\"", "(c-name #$isa)");
		 */
		UnitTest.testEvalEquals("'(a b c)", "(csetq *test-symbol-982383* '(a b c))");
		UnitTest.testEvalEquals("3", "(csetf (car *test-symbol-982383*) 3)");
		UnitTest.testEvalEquals("'(3 b c)", "*test-symbol-982383*");
		UnitTest.testEvalEquals("'(c b e)", "(csetf (cdr *test-symbol-982383*) '(c b e))");
		UnitTest.testEvalEquals("'(3 c b e)", "*test-symbol-982383*");
		UnitTest.testEvalEquals("4", "(csetf (symbol-value 'xyz) 4)");
		UnitTest.testEvalEquals("4", "xyz");
		UnitTest.testEvalEquals("'d", "(csetf (nth 2 *test-symbol-982383*) 'd)");
		UnitTest.testEvalEquals("'(3 c d e)", "*test-symbol-982383*");
		UnitTest.readAndEval("(deflexical *test-hash-table-090234* (make-hash-table 12))");
		UnitTest.readAndEval("(sethash 4 *test-hash-table-090234* 16)");
		UnitTest.testEvalEquals("16", "(gethash 4 *test-hash-table-090234*)");
		UnitTest.testEvalEquals("17", "(csetf (gethash 4 *test-hash-table-090234*) 17)");
		UnitTest.testEvalEquals("17", "(gethash 4 *test-hash-table-090234*)");
		UnitTest.testEvalEquals("16", "(csetf (gethash-without-values 4 *test-hash-table-090234*) 16)");
		UnitTest.testEvalEquals("16", "(gethash 4 *test-hash-table-090234*)");
		UnitTest.testEvalEquals("\"654321qwerty\"", "(csetq *test-string-093272* \"654321qwerty\")");
		UnitTest.testEvalEquals("#\\T", "(csetf (char *test-string-093272* 1) #\\T)");
		UnitTest.testEvalEquals("\"6T4321qwerty\"", "*test-string-093272*");
		UnitTest.testEvalEquals("#(1 2 3 4)", "(csetq *test-vector-093272* #(1 2 3 4))");
		UnitTest.testEvalEquals("#\\T", "(csetf (aref *test-vector-093272* 1) #\\T)");
		UnitTest.testEvalEquals("#(1 #\\T 3 4)", "*test-vector-093272*");
		UnitTest.testEvalEquals("nil", "(put '*test-symbol-093272* 'a nil)");
		UnitTest.testEvalEquals("'bar", "(csetf (get '*test-symbol-093272* 'a) 'bar)");
		UnitTest.testEvalEquals("'bar", "(get '*test-symbol-093272* 'a)");
		UnitTest.testEvalError("(csetf 1234 1234)");
		UnitTest.testEvalError("(csetf \"adf\" 1234)");
		UnitTest.testEvalError("(csetf NiL 1234)");
		UnitTest.testEvalError("(csetf t 1234)");
		UnitTest.testEvalError("(csetf x 1234 y)");
	}

	public static void testCsetq() {
		UnitTest.testEvalEquals("212", "(csetq x 212)");
		UnitTest.testEvalEquals("212", "x");
		UnitTest.testEvalEquals("212", "(csetq x 0 y 212)");
		UnitTest.testEvalEquals("0", "x");
		UnitTest.testEvalEquals("212", "y");
		UnitTest.testEvalEquals("212", "(csetq x 0 x 212)");
		UnitTest.testEvalEquals("212", "x");
		UnitTest.testEvalEquals("3", "(csetq x (+ 1 2))");
		UnitTest.testEvalEquals("42", "(csetq *** 42)");
		UnitTest.testEvalError("(csetq)");
		UnitTest.testEvalError("(csetq . 1)");
		UnitTest.testEvalError("(csetq 1)");
		UnitTest.testEvalError("(csetq x)");
		UnitTest.testEvalError("(csetq 1 . 2)");
		UnitTest.testEvalError("(csetq x . 2)");
		UnitTest.testEvalError("(csetq 1 2)");
		UnitTest.testEvalError("(csetq 1 2 . 3)");
		UnitTest.testEvalError("(csetq x 2 y)");
		UnitTest.testEvalError("(csetq x 2 y . 4)");
		UnitTest.testEvalError("(csetq x 2 y 4 z)");
		UnitTest.testEvalError("(csetq x 2 y 4 z . 6)");
	}

	public static void testCSome() {
		UnitTest.testEvalEquals("5",
				"(clet ((done? nil) (result 0)) (csome (x '(a b c d e) done?) (csetq result (+ result 1))) result)");
		UnitTest.testEvalEquals("3",
				"(clet ((done? nil) (result 0)) (csome (x '(a b c d e) done?) (csetq result (+ result 1)) (pwhen (> result 2) (csetq done? t))) result)");
		UnitTest.testEvalEquals("T", "(clet ((fail nil)) (csome (item '(1 2 3) fail) (csetq fail (eq item 2))) fail)");
		UnitTest.testEvalEquals("NIL",
				"(clet ((fail nil)) (csome (item '(1 2 3) fail) (csetq fail (eq item 4))) fail)");
	}

	public static void testCTime() {
		// testEvalNotEquals("0", "(clet (x) (ctime x (fibonacci 34)) x)");
		UnitTest.testEvalEquals("0", "(csetq *test-time-1* 0)");
		UnitTest.testEvalEquals("'TEST-FUNC1",
				"(define test-func1 (num) (clet ((x 0)) (cdotimes (y num) (csetq x (+ x 2))) (ret x)))");
		UnitTest.testEvalEquals("0", "*test-time-1*");
		UnitTest.testEvalEquals("4000", "(ctime *test-time-1* (TEST-FUNC1 2000))");
		UnitTest.testEvalNotEquals("0", "*test-time-1*");
		UnitTest.testEvalEquals("NIL", "(clet (x) (ctime x) (null x))");
		// @todo add more tests
	}

	public static void testCunwindProtect() {
		UnitTest.testEvalEquals("2", "(cunwind-protect (+ 1 1))");
		UnitTest.testEvalEquals("1", "(cunwind-protect 1 2 3)");
		UnitTest.testEvalEquals("0", "(csetq x 0)");
		UnitTest.testEvalEquals("0", "x");
		UnitTest.testEvalEquals("1", "(cunwind-protect (csetq x 1))");
		UnitTest.testEvalEquals("1", "x");
		UnitTest.testEvalEquals("NIL", "(cunwind-protect (progn)(csetq x 2))");
		UnitTest.testEvalEquals("2", "x");
		UnitTest.testEvalEquals("3", "(cunwind-protect (csetq x 3)(csetq x 4))");
		UnitTest.testEvalEquals("4", "x");
		UnitTest.testEvalError("(cunwind-protect (error \"error\")(csetq x 5))");
		UnitTest.testEvalEquals("5", "x");
		UnitTest.testEvalError("(cunwind-protect (progn (error \"foo\")(csetq x 6)))");
		UnitTest.testEvalEquals("5", "x");
		UnitTest.testEvalEquals("NIL", "(cunwind-protect)"); // @diff C and Java
																// yield
		// NIL, Allegro and CMUCL
		// error
		UnitTest.testEvalError("(cunwind-protect . 1)");
		UnitTest.testEvalError("(cunwind-protect 1 . 2)");
		// testEvalError("(cunwind-protect 1 2 . 3)");
	}

	public static void testCycLListComparison() {
		UnitTest.shouldPrintTests(
				"Testing whether CycL list comparisons work ... if CycL is not defined, these tests will error");
		/*
		 * not part of SubL kernel
		 * testEvalEquals("T","(FBOUNDP 'lists-of-binding-lists-equal?)");
		 */

		UnitTest.testEvalEquals("'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt)))",
				"(intersection " + "'(((?MT . :universal-vocabulary-mt)) ((?MT . :base-kb))) "
						+ "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt))) #'equal #'identity)");

		/*
		 * not part of SubL kernel testEvalEquals(
		 * "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt)))" ,
		 * "(fast-intersection " +
		 * "'(((?MT . :universal-vocabulary-mt)) ((?MT . :base-kb))) " +
		 * "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt))) #'equal)");
		 *
		 * testEvalEquals("T", "(lists-of-binding-lists-equal? " +
		 * "'(((?MT . :universal-vocabulary-mt)) ((?MT . :base-kb))) " +
		 * "'(((?MT . :base-kb)) ((?MT . :universal-vocabulary-mt))))");
		 */
	}

	public static void testCyclops() {
		// testEvalOfType("(core-kb-initialization 707)", SubLObject.class);
		// testEvalOfType("(find-or-create-constant \"AbsoluteValueFn\"
		// (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))",
		// SubLObject.class);
		// function_caching_macros.caching_mode_disable(UNPROVIDED);
		// misc_utilities.system_code_initializations();
		// testEvalOfType("(load \"/cyc/top/init/cyc-init.lisp\")",
		// SubLObject.class);
		// testEvalOfType("(load-core-kb
		// \"/cyc/top/units/latest/core-kb.lisp\")", SubLObject.class);
		UnitTest.testEvalOfType("(load-core-kb \"/scratch/core-kb.lisp\")", SubLObject.class);
		// misc_utilities.system_code_initializations();
		UnitTest.testEvalOfType("(benchmark-cyclops-compensating-for-paging)", SubLObject.class);
	}

	public static void testCycLSets() {
		/*
		 * these tests do not belong here...sets are not part of the SubL kernel
		 * shouldPrintTests(
		 * "Testing whether CycL sets work ... if CycL is not defined, the test will error!"
		 * ); String[] dataItems = EXAMPLE_NON_CORE_GUIDS;
		 * testEvalEquals("T","(FBOUNDP 'SET-MEMBER?)");
		 * readAndEval("(csetq *rck-set* (new-set #'eq))");
		 * testEvalEquals("T","(set-p *rck-set*)"); shouldPrintTests(
		 * "Testing whether we can prepare the population vector ...." );
		 * readAndEval("(csetq *rck-items* (make-vector " + dataItems.length +
		 * "))"); testEvalEquals("T","(vectorp *rck-items*)"); for (int i = 0; i
		 * < dataItems.length; i++) { readAndEval("(set-aref *rck-items* " + i +
		 * " \"" + dataItems[i] +"\")");
		 * testEvalEquals("T","(stringp (aref *rck-items* " + i + "))"); }
		 * shouldPrintTests(
		 * "Testing whether the CycL can find elements again as we expand the set ...."
		 * ); boolean testExhaustively = false; for (int limit = 0; limit <
		 * dataItems.length; limit++) {
		 * readAndEval("(set-add (aref *rck-items* " + limit + ") *rck-set*)");
		 * if (testExhaustively) { for (int i = 0; i <= limit; i++) {
		 * testEvalEquals( "T", "(set-member? (aref *rck-items* " + i +
		 * ") *rck-set*)"); } } else { testEvalEquals( "T",
		 * "(set-member? (aref *rck-items* " + limit + ") *rck-set*)"); } }
		 */
	}

	public static void testDefine() {
		// @todo add more tests
		UnitTest.testEvalError("(define foo ())");
		UnitTest.testEvalEquals("'FOO", "(define foo () (ret 212))");
		UnitTest.testEvalEquals("212", "(foo)");
		UnitTest.testEvalError("(foo 1)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x) (ret x))");
		UnitTest.testEvalEquals("1", "(foo 1)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x y) (ret (list x y)))");
		UnitTest.testEvalEquals("'(1 2)", "(foo 1 2)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x &optional y) (ret (list x y)))");
		UnitTest.testEvalEquals("'(1 NIL)", "(foo 1)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x &optional (y x)) (ret (list x y)))");
		UnitTest.testEvalEquals("'(1 1)", "(foo 1)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x &optional (y x p)) (ret (list x y p)))");
		UnitTest.testEvalEquals("'(1 1 nil)", "(foo 1)");
		UnitTest.testEvalEquals("'(1 2 t)", "(foo 1 2)");
		UnitTest.testEvalEquals("'(1 1 t)", "(foo 1 1)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x &optional y &rest args) (ret (list x y args)))");
		UnitTest.testEvalEquals("'(1 nil nil)", "(foo 1)");
		UnitTest.testEvalEquals("'(1 2 nil)", "(foo 1 2)");
		UnitTest.testEvalEquals("'(1 2 (3))", "(foo 1 2 3)");
		UnitTest.testEvalEquals("'FOO", "(define foo (x y) (ret (+ x y)))");
		UnitTest.testEvalEquals("2", "(foo 1 1)");
		UnitTest.testEvalEquals("10", "(foo (foo 1 2)(foo 3 4))");
		UnitTest.testEvalEquals("'FIB", "(define fib (n)" + "(pif (eql n 0)" + "(ret 1)" + "(pif (eql n 1)"
				+ "     (ret 1)" + "     (ret (+ (fib (- n 2))(fib (- n 1)))))))");
		UnitTest.testEvalEquals("1", "(fib 0)");
		UnitTest.testEvalEquals("1", "(fib 1)");
		UnitTest.testEvalEquals("2", "(fib 2)");
		UnitTest.testEvalEquals("3", "(fib 3)");
		UnitTest.testEvalEquals("5", "(fib 4)");
	}

	public static void testDefineCachedFunctions() {
		/*
		 * commented out since not part of the SubL kernel shouldPrintTests(
		 * "Testing whether DEFINE-CACHED-NEW works ... if CycL is not defined, the test will error!"
		 * ); testEvalEquals("T","(cnot (null (fboundp 'define-cached-new)))");
		 * readAndEval("(define-cached-new my-cached-function ( pos-int) "
		 * +" (:test 'eql :capacity 200) " +
		 * " (ret (make-list pos-int pos-int)))"); for (int i = 1; i < 10; i++)
		 * { SubLObject result = readAndEval("(make-list " + i + " " + i + ")");
		 * // cause it to be cached testEvalEqualsObj(result,
		 * "(my-cached-function " + i + ")"); // cause it to be looked up from
		 * the cache testEvalEqualsObj(result, "(my-cached-function " + i +
		 * ")"); }
		 */
	}

	public static void testDuplicateRemovalFunctions(boolean shouldTestFast) {
		int origVal = AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF;
		int origVal2 = AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF;
		try {
			if (shouldTestFast) {
				AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 0;
				AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = 0;
			}
			// remove-duplicates
			UnitTest.testEvalEquals("\"aoAb\"", "(remove-duplicates \"baobAb\")");
			UnitTest.testEvalEquals("\"oAb\"", "(remove-duplicates \"bAobAb\")");
			UnitTest.testEvalEquals("\"oAb\"", "(remove-duplicates \"baobAb\" #'EQUALP)");
			UnitTest.testEvalEquals("\"baoab\"", "(remove-duplicates \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
			UnitTest.testEvalEquals("\"baoab\"", "(remove-duplicates \"baoBab\" #'EQUALp #'IDENTITY 2 6)");
			UnitTest.testEvalEquals("\"baoab\"", "(remove-duplicates \"baobab\" #'EQL #'IDENTITY 2 6)");
			UnitTest.testEvalEquals("\"baobab\"", "(remove-duplicates \"baobab\" #'EQL #'IdENTITY 2 4)");
			UnitTest.testEvalEquals("\"oab\"", "(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo
			// verify
			// this
			UnitTest.testEvalEquals("\"oab\"", "(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo
			// verify
			// this
			UnitTest.testEvalEquals("\"baobab\"", "(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo
			// verify
			// this
			if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END) {
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\A)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\A #\\b))");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\B #\\a)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\B #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																											// verify
																											// this
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																											// verify
																											// this
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																											// verify
																											// this
			} else {
				UnitTest.testEvalEquals("'(#\\a #\\o #\\A #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\A #\\b))");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\B #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
				UnitTest.testEvalEquals("'(#\\o #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																											// verify
																											// this
				UnitTest.testEvalEquals("'(#\\o #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																											// verify
																											// this
				UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
						"(remove-duplicates '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																											// verify
																											// this
			}
			UnitTest.testEvalEquals("#(#\\a #\\o #\\A #\\b)", "(remove-duplicates #(#\\b #\\a #\\o #\\b #\\A #\\b))");
			UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
			UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
			UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
			UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
			UnitTest.testEvalEquals("#(#\\o #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																										// verify
																										// this
			UnitTest.testEvalEquals("#(#\\o #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																										// verify
																										// this
			UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
					"(remove-duplicates #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																										// verify
																										// this
			UnitTest.testEvalError("(remove-duplicates)"); // too few args
			UnitTest.testEvalError("(remove-duplicates 1)"); // too few args
			UnitTest.testEvalError("(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too
			// many
			// args
			UnitTest.testEvalError("(remove-duplicates #\\A #'EQUALP #'IDENTITY -1 NIL)"); // bad
			// arg
			// types
			UnitTest.testEvalError("(remove-duplicates \"baobab\" 3 #'IDENTITY -1 NIL)"); // bad
			// arg
			// types
			UnitTest.testEvalError("(remove-duplicates \"baobab\" #'EQUALP 'a -1 NIL)"); // bad
			// arg
			// types
			UnitTest.testEvalError("(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); // bad
			// arg
			// types
			UnitTest.testEvalError("(remove-duplicates \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); // bad
			// arg
			// types
			if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END) {
				UnitTest.testEvalEquals("'(1 2 3 4 5 9 7)", "(remove-duplicates '(1 2 1 3 4 2 4 4 5 5 5 "
						+ "5 5 5 5 9 7 4 3 3 2 3 2 3 4 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4))");
				UnitTest.testEvalEquals("'(c d b a)", "(remove-duplicates " + "'(c d b a a b c d))");
				UnitTest.testEvalEquals("'(a b c d e f g h i j k l m n o p q r s t u v w x y z)",
						"(remove-duplicates " + "'(a b c d e f g h i j k l m n o p q r s t u v w x y z "
								+ "a b c d e f g h i j k l m n o p q r s t u v w x y z "
								+ "a b c d e f g h i j k l m n o p q r s t u v w x y z))");
			} else {
				UnitTest.testEvalEquals("'(1 5 9 7 2 3 4)", "(remove-duplicates '(1 2 1 3 4 2 4 4 5 5 5 "
						+ "5 5 5 5 9 7 4 3 3 2 3 2 3 4 3 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4 4))");
				UnitTest.testEvalEquals("'(a b c d)", "(remove-duplicates " + "'(c d b a a b c d))");
				UnitTest.testEvalEquals("'(a b c d e f g h i j k l m n o p q r s t u v w x y z)",
						"(remove-duplicates " + "'(a b c d e f g h i j k l m n o p q r s t u v w x y z "
								+ "a b c d e f g h i j k l m n o p q r s t u v w x y z "
								+ "a b c d e f g h i j k l m n o p q r s t u v w x y z))");
			}
			UnitTest.testEvalEquals("\"abcd\"",
					"(remove-duplicates \"aaaaaaaaaaa" + "aaaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb"
							+ "bbbbbbbbbbbbcccccccccccccccccccccccccccccccccddddddddddddd"
							+ "ddddddddddddddddddabbdbcdd\")");
		} finally {
			AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = origVal;
			AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = origVal2;
		}
	}

	public static void testDynamicBinding() {
		UnitTest.testEvalEquals("NIL", "(boundp '*dummy-symbol-1234123938458394*)");
		UnitTest.testEvalError("*dummy-symbol-1234123938458394*");
		UnitTest.testEvalEquals("NIL",
				"(clet ((*dummy-symbol-1234123938458394* \"TEST\")) (boundp '*dummy-symbol-1234123938458394*))");
		UnitTest.testEvalEquals("T",
				"(clet ((*dummy-symbol-1234123938458394* \"TEST\")) (equalp  \"TEST\" *dummy-symbol-1234123938458394*))");
		UnitTest.testEvalError("*dummy-symbol-1234123938458394*");
		SubLFiles.defparameter("*DUMMY-SYMBOL-12341239384583945*", SubLNumberFactory.makeInteger(123));
		UnitTest.testEvalEquals("123", "*DUMMY-SYMBOL-12341239384583945*");
		SubLSymbol sym = SubLSymbolFactory.makeSymbol("*DUMMY-SYMBOL-12341239384583945*");
		Assert.assertEquals(null, sym.currentBinding(SubLProcess.currentSubLThread().bindingsList));
		sym.bind(SubLNil.NIL, SubLProcess.currentSubLThread().bindingsList);
		Assert.assertEquals(SubLNil.NIL, sym.currentBinding(SubLProcess.currentSubLThread().bindingsList));
		UnitTest.testEvalEquals("nil", "*DUMMY-SYMBOL-12341239384583945*");
		sym.rebind(null, SubLProcess.currentSubLThread().bindingsList);
		Assert.assertEquals(null, sym.currentBinding(SubLProcess.currentSubLThread().bindingsList));
		UnitTest.testEvalEquals("123", "*DUMMY-SYMBOL-12341239384583945*");
		// test that interpreted clet cleans up state after binding a dynamic
		// symbol
		SubLFiles.defparameter("*DUMMY-SYMBOL-783404097858*", SubLNumberFactory.makeInteger(212));
		UnitTest.testEvalEquals("T",
				"(clet ((*DUMMY-SYMBOL-783404097858* 424)) (equalp  424 *DUMMY-SYMBOL-783404097858*))");
		UnitTest.testEvalEquals("212", "*DUMMY-SYMBOL-783404097858*");
	}

	public static void testDynamicVariables() {
		// @todo add more once we have clet
		// commented this test out it started failing. not sure what it's
		// supposed to do --APB
		// testEvalEquals("212", "***");
	}

	public static void testErrorEvaluation() {
		UnitTest.testEvalError("(identity)");
		UnitTest.testEvalError("(identity 1 2)");
		UnitTest.testEvalError("(identity 1 . 2)");
	}

	public static void testEvalDoesNotError(String str) {
		UnitTest.shouldPrintTests("Testing that evaluating " + str + " does not generate an error...");

		boolean error = false;
		try {
			UnitTest.readAndEval(str);
			error = true;
		} catch (Exception e) {
		}
		Assert.assertEquals(error, true);
		// System.out.println("Success.");
	}

	public static void testEvalEquals(String str1, String str2) {
		SubLObject obj1 = UnitTest.readAndEval(str1);
		UnitTest.testEvalEqualsObj(obj1, str2);
	}

	/** Throws an error unless STR evaluates to OBJ. */
	public static void testEvalEqualsObj(Object obj, String str) {
		UnitTest.shouldPrintTests("Testing that " + str + " evaluates to " + obj + "...");
		SubLObject result = UnitTest.readAndEval(str);
		Assert.assertEquals(obj, result);
		// System.out.println("Success.");
	}

	// @todo add lots of tests for testEvalError
	// @todo it would be nice to add a parameter indicating the type of class
	// that should be thrown -APB
	public static void testEvalError(String str) {
		UnitTest.shouldPrintTests("Testing that evaluating " + str + " generates an error...");

		boolean error = false;
		try {
			UnitTest.readAndEval(str);
		} catch (Exception e) {
			error = true;
		}
		Assert.assertEquals(error, true);
		// System.out.println("Success.");
	}

	public static void testEvalNotEquals(String str1, String str2) {
		SubLObject obj1 = UnitTest.readAndEval(str1);
		UnitTest.testEvalNotEqualsObj(obj1, str2);
	}

	/** Throws an error unless STR does not evaluates to OBJ. */
	public static void testEvalNotEqualsObj(Object obj, String str) {
		UnitTest.shouldPrintTests("Testing that " + str + " does not evaluate to " + obj + "...");
		SubLObject result = UnitTest.readAndEval(str);
		Assert.assertNotSame(obj, result);
		// System.out.println("Success.");
	}

	public static void testEvalOfType(String str, Class evalType) {
		UnitTest.shouldPrintTests("Testing that " + str + " is of type " + evalType + "...");
		SubLObject obj = UnitTest.readAndEval(str);
		Assert.assertTrue(evalType.isInstance(obj));
	}

	private static void testEvalPathEquals(String path, String slisp) {
		if (File.separatorChar == '\\') {
			if (path.startsWith("\""))
				path = path.replace("/", "\\\\");
			else
				path = path.replace("/", "\\");
			if (path.startsWith("\\"))
				path = "C:" + path;
		}
		try {
			UnitTest.testEvalEquals(path, slisp);
		} catch (SubLException sle) {
			System.out.println("" + sle + " in test " + slisp + " => " + path);

		}
	}

	public static void testExternalProcessStreamClosing() {
		if (UnitTest.SHOULD_RUN_EXPENSIVE_TESTS) {
			String form = "(cdotimes (i 70000)\n" + "  (pwhen (zerop (mod i 20))\n" + "    (terpri))\n"
					+ "  (princ i) (princ \" \") (force-output t) (os-process-evaluation-output-strings \"echo\" (list \"\")))";
			UnitTest.testEvalDoesNotError(form);
		}
	}

	// @todo test function and symbol-function
	// @todo test equality of functions
	// @todo test equality of macros
	// @todo test equality of exceptions (?)
	// @todo test equality of non-integer numbers (BigInt, bignum, long, float,
	// double)

	// @todo test equality of structs

	/** copied-n-edited from testPif */
	public static void testFif() {
		UnitTest.testEvalEquals("1", "(fif t 1 2)");
		UnitTest.testEvalEquals("2", "(fif nil 1 2)");
		UnitTest.testEvalEquals("1", "(fif (identity t) 1 2)");
		UnitTest.testEvalEquals("2", "(fif (identity nil) 1 2)");
		UnitTest.testEvalEquals("2", "(fif t (progn 1 2) nil)");
		UnitTest.testEvalEquals("2", "(fif nil nil (progn 1 2))");
		UnitTest.testEvalEquals("NIL", "(fif)"); // @diff Allegro and CMUCL
													// error, C and
		// Java don't
		UnitTest.testEvalEquals("NIL", "(fif t)"); // @diff Allegro and CMUCL
													// error, C
		// and Java don't
		UnitTest.testEvalEquals("1", "(fif t 1)"); // @diff Allegro and CMUCL
													// error, C
		// and Java don't
		UnitTest.testEvalEquals("1", "(fif t 1 2 3)"); // @diff Allegro and
														// CMUCL error,
		// C and Java don't
		UnitTest.testEvalError("(fif . t)");
		UnitTest.testEvalError("(fif t . 1)");
		UnitTest.testEvalEquals("1", "(fif t 1 . 2)"); // @diff Allegro and
														// CMUCL error,
		// C and Java don't
		UnitTest.testEvalError("(fif nil 1 . 2)");
		UnitTest.testEvalEquals("1", "(fif t 1 2 . 3)"); // @diff Allegro and
															// CMUCL
		// error, C and Java don't
		UnitTest.testEvalEquals("2", "(fif nil 1 2 . 3)"); // @diff Allegro and
															// CMUCL
		// error, C and Java don't
	};

	public static void testFileSysFunctions() {
		long currentTimeTyped = System.currentTimeMillis();
		SubLObject currentTime = Time.unixTimeToUniversalTime(currentTimeTyped);

		// edge case tests
		UnitTest.testEvalEquals("\"\"", "(construct-filename NIL NIL NIL T)");
		/*
		 * @todo this returns inconsistent results under ALlegro and CRTL, so
		 * handle later testEvalEquals("\".text\"",
		 * "(construct-filename NIL NIL "text" T)");
		 */

		// non-destructive tests
		UnitTest.testEvalPathEquals("\"units/acip/\"", "(construct-filename '(\"units\" \"acip\") nil nil t)");
		UnitTest.testEvalPathEquals("\"/cyc/top/units/tiny/core-kb.lisp\"",
				"(construct-filename '(\"cyc\" \"top\" \"units\" \"tiny\") \"core-kb\" \"lisp\" nil)");
		UnitTest.testEvalPathEquals("\"cyc/top/units/tiny/core-kb.lisp\"",
				"(construct-filename '(\"cyc\" \"top\" \"units\" \"tiny\") \"core-kb\" \"lisp\" T)");
		UnitTest.testEvalPathEquals("'(\"/cyc/top/units/tiny/core-kb.lisp\")",
				"(directory \"/cyc/top/units/tiny/\" t)");
		UnitTest.testEvalPathEquals("'(\"core-kb.lisp\")", "(directory \"/cyc/top/units/tiny/\" NIL)");
		UnitTest.testEvalEquals("T", "(directory-p \"/cyc/top/units/\")");
		UnitTest.testEvalEquals("NIL", "(directory-p \"/cyc/top/units/tiny/core-kb.lisp\")");
		UnitTest.testEvalEquals("NIL", "(directory-p 212)");
		// testEvalEquals("T","(stringp (probe-file
		// \"/cyc/top/units/tiny/core-kb.lisp\"))"); //@todo Make a file then
		// test and delete for reliablity
		UnitTest.testEvalEquals("T",
				"(null (probe-file \"/cyc/top/units/tiny/donaudampfschifffahrtsgesellschaft.lisp\"))");

		// @hack file-write-author does not work under Java, so we test its
		// non-functioning
		// testEvalEquals("NIL","(file-author
		// \"/cyc/top/units/tiny/core-kb.lisp\")"); //@todo Make a file then
		// test and delete for reliablity

		// modification-based file system functions
		File tempDir = new File(System.getProperty("java.io.tmpdir"));
		Assert.assertTrue("No valid temporary directory for file read/write testing.", tempDir.exists());

		// build a scratch directory
		String subDirName = "fileSysTest" + "_" + currentTimeTyped + "_" + tempDir.hashCode();
		File newSubDir = new File(tempDir, subDirName);
		try {
			UnitTest.testEvalEquals("T", "(stringp (make-directory \"" + subDirName + "\" \"" + tempDir + "\"))");
			Assert.assertTrue("SubL MAKE-DIRECTORY failed to make directory " + newSubDir.getAbsolutePath(),
					newSubDir.isDirectory());
			UnitTest.testEvalEquals("T", "(directory-p \"" + newSubDir.getAbsolutePath() + "\")");
			UnitTest.testEvalEquals("NIL", "(directory \"" + newSubDir.getAbsolutePath() + "\")");

			// test modification time on directories
			UnitTest.testEvalEquals("T", "(numberp (file-write-date \"" + newSubDir.getAbsolutePath() + "\"))");
			UnitTest.testEvalEquals("T",
					"(<= " + currentTime.toString() + " (file-write-date \"" + newSubDir.getAbsolutePath() + "\"))");

			// the work-around
			SubLObject dirModTime = Filesys.file_write_date(SubLObjectFactory.makeString(newSubDir.getAbsolutePath()));
			BigInteger currentTimeTemp = new BigInteger(currentTime.toString());
			BigInteger dirModTimeTemp = new BigInteger(dirModTime.toString());
			Assert.assertTrue(
					"Directory modification time " + dirModTimeTemp + " is less than the test start time "
							+ currentTimeTemp + " ???",
					currentTimeTemp.min(dirModTimeTemp) == currentTimeTemp || currentTimeTemp.equals(dirModTimeTemp));

			// build a temporary file in the scratch directory
			File myFile = new File(newSubDir, "winnie-the-pooh.text");
			File yourFile = new File(newSubDir, "winnieDerPuh.text");
			try {
				{
					java.io.FileWriter writer = null;
					try {
						writer = new java.io.FileWriter(myFile);
						writer.write("Knudelnudel-rund ist der Teddybaer.");
					} catch (IOException ex) {
						Assert.fail("Cannot create testing file " + myFile.getAbsolutePath() + "; cause: "
								+ ex.getLocalizedMessage());
					} finally {
						if (writer != null)
							try {
								writer.close();
							} catch (Exception xcpt) {
							}
					}
				}
				Assert.assertTrue("Failed to create testing file " + myFile.getAbsolutePath(), myFile.exists());
				UnitTest.testEvalEquals("T", "(stringp (probe-file \"" + myFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("NIL", "(directory-p \"" + myFile.getAbsolutePath() + "\")");

				// test modification time on temporary file
				UnitTest.testEvalEquals("T", "(numberp (file-write-date \"" + myFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("T",
						"(<= " + currentTime.toString() + " (file-write-date \"" + myFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("T", "(<= " + " (file-write-date \"" + newSubDir.getAbsolutePath() + "\")"
						+ " (file-write-date \"" + myFile.getAbsolutePath() + "\"))");

				// the work-around
				SubLObject fileModTime = Filesys
						.file_write_date(SubLObjectFactory.makeString(myFile.getAbsolutePath()));
				BigInteger fileModTimeTemp = new BigInteger(fileModTime.toString());
				Assert.assertTrue(
						"File modification time " + fileModTimeTemp + " is less than the test start time "
								+ currentTimeTemp + " ???",
						currentTimeTemp.min(fileModTimeTemp) == currentTimeTemp
								|| currentTimeTemp.equals(fileModTimeTemp));
				Assert.assertTrue(
						"File modification time " + fileModTimeTemp + " is less than the directory modification time "
								+ dirModTimeTemp + "???",
						dirModTimeTemp.min(fileModTimeTemp) == dirModTimeTemp
								|| dirModTimeTemp.equals(fileModTimeTemp));

				// see if we can find the file in the directory
				UnitTest.testEvalEquals("T", "(cnot (null (member \"" + myFile.getAbsolutePath() + "\""
						+ " (directory \"" + newSubDir.getAbsolutePath() + "\" T) 'equalp)))");

				// rename the file twice
				// @note do something about testing the other return values
				UnitTest.testEvalEquals("T", "(stringp (rename-file \"" + myFile.getAbsolutePath() + "\" \""
						+ yourFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("NIL", "(stringp (probe-file \"" + myFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("T", "(stringp (probe-file \"" + yourFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("T", "(stringp (rename-file \"" + yourFile.getAbsolutePath() + "\" \""
						+ myFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("T", "(stringp (probe-file \"" + myFile.getAbsolutePath() + "\"))");
				UnitTest.testEvalEquals("NIL", "(stringp (probe-file \"" + yourFile.getAbsolutePath() + "\"))");

				// tear down the temporary file from the scratch directory
				UnitTest.testEvalEquals("T", "(delete-file \"" + myFile.getAbsolutePath() + "\")");
				Assert.assertTrue("Failed to remove testing file " + myFile.getAbsolutePath(), !myFile.exists());

			} finally {
				myFile.delete();
				yourFile.delete();
			}

			// tear down the scratch directory
			UnitTest.testEvalEquals("T", "(delete-directory \"" + newSubDir.getAbsolutePath() + "\")");
			UnitTest.testEvalEquals("NIL", "(directory-p \"" + newSubDir.getAbsolutePath() + "\")");
			Assert.assertTrue("SubL DELETE-DIRECTORY failed to remove directory " + newSubDir.getAbsolutePath(),
					!newSubDir.exists());
		} finally {
			// ensure that the cleanup happens, no matter what
			if (newSubDir.exists())
				newSubDir.delete();
		}

	}

	public static void testFixnumEquality() {
		UnitTest.testEvalEquals("T", "(eq 212 212)");
		UnitTest.testEvalEquals("T", "(eql 212 212)");
		UnitTest.testEvalEquals("T", "(equal 212 212)");
		UnitTest.testEvalEquals("T", "(equalp 212 212)");
		UnitTest.testEvalEquals("NIL", "(eq 0 1)");
		UnitTest.testEvalEquals("NIL", "(eql 0 1)");
		UnitTest.testEvalEquals("NIL", "(equal 0 1)");
		UnitTest.testEvalEquals("NIL", "(equalp 0 1)");
		int maxFixnum = SubLNumberFactory.MAX_FIXNUM;
		UnitTest.testEvalEquals("T", "(eq " + maxFixnum + " " + maxFixnum + ")");
		UnitTest.testEvalEquals("T", "(eql " + maxFixnum + " " + maxFixnum + ")");
		UnitTest.testEvalEquals("T", "(equal " + maxFixnum + " " + maxFixnum + ")");
		UnitTest.testEvalEquals("T", "(equalp " + maxFixnum + " " + maxFixnum + ")");
		long minBignum = maxFixnum + 1;
		UnitTest.testEvalEquals("NIL", "(eq " + minBignum + " " + minBignum + ")");
		UnitTest.testEvalEquals("T", "(eql " + minBignum + " " + minBignum + ")");
		UnitTest.testEvalEquals("T", "(equal " + minBignum + " " + minBignum + ")");
		UnitTest.testEvalEquals("T", "(equalp " + minBignum + " " + minBignum + ")");
	}

	public static void testFormat() {
		UnitTest.testEvalEquals("\"3.14159265\"", "(subseq (format nil \"~A\" *pi*) 0 10)");
		UnitTest.testEvalEquals("\"Standard Deviation : 1.345\"", "(format nil \"Standard Deviation : ~S\" 1.345)");
	}

	public static void testFunctions() {
		// FUNCALL
		UnitTest.testEvalEquals("6", "(funcall #'+ 1 2 3)");
		UnitTest.testEvalEquals("1", "(funcall 'car '(1 2 3))");
		UnitTest.testEvalEquals("4", "(funcall 'position 1 '(1 2 3 2 1) #'EQL #'IDENTITY 1)");
		UnitTest.testEvalError("(funcall 'null 'x 'y)");
		// APPLY
		UnitTest.testEvalEquals("'+", "(csetq f '+)");
		UnitTest.testEvalEquals("3", "(apply f '(1 2))");
		UnitTest.testEvalEquals("#'-", "(csetq f #'-)");
		UnitTest.testEvalEquals("-1", "(apply f '(1 2))");
		UnitTest.testEvalEquals("630", "(apply #'* 3 5 '(2 7 3))");
		UnitTest.testEvalEquals("'((+ 2 3) . 4)", "(apply 'cons '((+ 2 3) 4))");
		UnitTest.testEvalEquals("0", "(apply #'+ '())");
		UnitTest.readAndEval("(define my-copy-tree (tree) " + "             (ret (fif (atom tree) "
				+ "                        tree " + "                        (cons (my-copy-tree (first tree)) "
				+ "                           (my-copy-tree (rest tree))))))");
		UnitTest.testEvalEquals("'(1 (2 (3)))", "(apply #'my-copy-tree '((1 (2 (3)))))");
	}

	private static void testGuidOrderingWorks(String[] guidStringsInOrder) {
		SubLObject previousGuid = null;
		for (int index = 0; index < guidStringsInOrder.length; index++) {
			String current = guidStringsInOrder[index];
			SubLObject guid = Guids.string_to_guid(SubLObjectFactory.makeString(current));
			if (previousGuid != null)
				UnitTest.testTwoGuidsAreOrdered(previousGuid, guid);
			previousGuid = guid;
		}
	}

	private static void testGuidOrderingWorks(SubLGuid[] guidsInOrder) {
		SubLObject previousGuid = null;
		for (int index = 0; index < guidsInOrder.length; index++) {
			SubLObject guid = guidsInOrder[index];
			if (previousGuid != null)
				UnitTest.testTwoGuidsAreOrdered(previousGuid, guid);
			previousGuid = guid;
		}
	}

	public static void testGUIDs() {
		// make sure that we can construct all GUIDs
		if (UnitTest.SHOULD_PRINT_TESTS)
			System.out.println("Testing that GUID versions #1 (CRTL) and #4 (UUID.java) are readable ....");
		List<String> allGuidStrings = new ArrayList<String>(
				UnitTest.EXAMPLE_NON_CORE_GUIDS.length + UnitTest.EXAMPLE_CORE_GUIDS.length);
		List<SubLGuid> allGuids = new ArrayList<SubLGuid>(allGuidStrings.size());
		allGuidStrings.addAll(Arrays.asList(UnitTest.EXAMPLE_CORE_GUIDS));
		allGuidStrings.addAll(Arrays.asList(UnitTest.EXAMPLE_NON_CORE_GUIDS));
		Iterator iter = allGuidStrings.iterator();
		while (iter.hasNext()) {
			String current = (String) iter.next();
			SubLObject guid_string = SubLObjectFactory.makeString(current);
			SubLObject guid = Guids.string_to_guid(guid_string);
			SubLObject converted_string = Guids.guid_to_string(guid);
			Assert.assertEquals(converted_string, guid_string);
			allGuids.add(guid.toGuid());
		}
		Assert.assertTrue(
				"Hey, somewhere we lost testing GUIDs ... " + allGuids.size() + " GUIDs but we should have "
						+ UnitTest.SORTED_EXAMPLE_GUIDS.length,
				allGuids.size() == UnitTest.SORTED_EXAMPLE_GUIDS.length);

		// see that we can get the comparison methods right
		if (UnitTest.SHOULD_PRINT_TESTS)
			System.out.println("Testing that GUID ordering predicates work as expected for GUIDs of core constants.");
		UnitTest.testGuidOrderingWorks(UnitTest.SORTED_EXAMPLE_CORE_GUIDS);
		if (UnitTest.SHOULD_PRINT_TESTS)
			System.out.println(
					"Testing that GUID ordering predicates work as expected for GUIDs generated via random UUID.");
		UnitTest.testGuidOrderingWorks(UnitTest.SORTED_EXAMPLE_NON_CORE_GUIDS);

		// now do the sorting and the comparison
		Collections.sort(allGuids);
		SubLGuid[] sortedGuids = allGuids.toArray(new SubLGuid[allGuids.size()]);
		UnitTest.testGuidOrderingWorks(sortedGuids);
		Assert.assertTrue(
				"Odd, somewhere we lost testing GUIDs ... " + sortedGuids.length + " GUIDs but we should have "
						+ UnitTest.SORTED_EXAMPLE_GUIDS.length,
				sortedGuids.length == UnitTest.SORTED_EXAMPLE_GUIDS.length);

		if (UnitTest.SHOULD_PRINT_TESTS)
			System.out.println("Testing that SubLGuid.compareTo() orders the same as CRTL's canonicalizer.");
		for (int i = 0; i < sortedGuids.length; i++) {
			String guidString = UnitTest.SORTED_EXAMPLE_GUIDS[i];
			SubLGuid masterGuid = SubLObjectFactory.makeGuid(guidString);
			SubLGuid testGuid = sortedGuids[i];
			String msg = "Guids " + masterGuid + " and " + testGuid + " at position " + i + " are not the same.";
			Assert.assertEquals(msg, CommonSymbols.T, Guids.guidE(masterGuid, testGuid));
			Assert.assertEquals(msg, CommonSymbols.NIL, Guids.guidNE(masterGuid, testGuid));
		}
	}

	public static void testHashtableExerciser() {
		// readAndEval("(benchmark-hash-table-exerciser 1 0 1 10000)");
		UnitTest.readAndEval("(test-benchmark-hash-table-exerciser-process 10000 10)");
	}

	public static void testHashtables() {
		// eql hash tables
		UnitTest.readAndEval("(deflexical *test-hash-table* (make-hash-table 12))");
		UnitTest.readAndEval("(sethash 1 *test-hash-table* 2)");
		UnitTest.readAndEval("(sethash 2 *test-hash-table* 4)");
		UnitTest.testEvalEquals("4", "(gethash 2 *test-hash-table*)");
		UnitTest.testEvalEquals("2", "(gethash 1 *test-hash-table*)");
		UnitTest.testEvalEquals("2", "(gethash 3 *test-hash-table* 2)");
		UnitTest.testEvalEquals("NIL", "(gethash 3 *test-hash-table*)");
		UnitTest.readAndEval("(remhash 2 *test-hash-table*)");
		UnitTest.testEvalEquals("NIL", "(gethash 2 *test-hash-table*)");
		UnitTest.readAndEval("(sethash 2 *test-hash-table* 4)");
		UnitTest.testEvalEquals("2", "(hash-table-count *test-hash-table*)");
		UnitTest.readAndEval("(clrhash *test-hash-table*)");
		UnitTest.testEvalEquals("0", "(hash-table-count *test-hash-table*)");
		UnitTest.testEvalEquals("#'EQL", "(hash-table-test *test-hash-table*)");

		// equalp hash tables
		UnitTest.readAndEval("(deflexical *test-hash-table* (make-hash-table 12 'equalp))");
		UnitTest.readAndEval("(sethash \"root\" *test-hash-table* :all-lowercase)");
		UnitTest.readAndEval("(sethash \"ROOT\" *test-hash-table* :all-uppercase)");
		UnitTest.readAndEval("(sethash \"rOoT\" *test-hash-table* :mixedcase)");
		UnitTest.readAndEval("(sethash \"Root\" *test-hash-table* :capitalized-start)");
		UnitTest.testEvalEquals("1", "(hash-table-count *test-hash-table*))");

		/*
		 * Commented out because new-cache is not part of the SubL kernel
		 * shouldPrintTests(
		 * "Testing hashtables on CycL objects ... will error if CycL not loaded."
		 * ); readAndEval("(csetq *test-hash-table* (make-hash-table 12 'eq))");
		 * readAndEval("(csetq *test-cache-1* (new-cache 1))"); readAndEval(
		 * "(sethash *test-cache-1* *test-hash-table* *test-cache-1*)" );
		 * readAndEval("(csetq *test-cache-2* (new-cache 2))"); readAndEval(
		 * "(sethash *test-cache-2* *test-hash-table* *test-cache-2*)" );
		 * testEvalEquals( "T",
		 * "(eq *test-cache-1* (gethash *test-cache-1* *test-hash-table* :not-found))"
		 * );
		 */
	}

	public static void testInterpretedStructures() {
		UnitTest.testEvalEquals("T", "(progn (defstruct (foo) bar) (foo-p (make-foo)))");
	}

	public static void testInterpretedSymbolProperties() {
		// defParameter
		UnitTest.testEvalEquals("(list :DYNAMIC :INITIALIZER)", "(progn (defparameter *my-defparam*)"
				+ " (list (get '*my-defparam* :binding-type)" + "       (get '*my-defparam* :initialization-type)))");
		// defVar
		UnitTest.testEvalEquals("(list :DYNAMIC :WORLD)", "(progn (defvar *my-defvar*)"
				+ " (list (get '*my-defvar* :binding-type)" + "       (get '*my-defvar* :initialization-type)))");
		// defLexical
		UnitTest.testEvalEquals("(list :LEXICAL :INITIALIZER)",
				"(progn (deflexical *my-deflexical*)" + " (list (get '*my-deflexical* :binding-type)"
						+ "       (get '*my-deflexical* :initialization-type)))");
		// defConstant
		UnitTest.testEvalEquals("(list :CONSTANT :INITIALIZER)",
				"(progn (defconstant *my-defconstant*)" + " (list (get '*my-defconstant* :binding-type)"
						+ "       (get '*my-defconstant* :initialization-type)))");
		// @todo when defglobal gets promoted to SubL, test it here as well
		/*
		 * testEvalEquals("(list :LEXICAL :WORLD)",
		 * "(progn (defglobal *my-defglobal*)" +
		 * " (list (get '*my-defglobal* :binding-type)" +
		 * "       (get '*my-defglobal* :initialization-type)))");
		 */
	}

	public static void testKeyhashes() {
		/*
		 * commented out because keyhashes are not currently part of the SubL
		 * kernel readAndEval("(deflexical *test-keyhash* (new-keyhash 12))");
		 * readAndEval("(setkeyhash 2 *test-keyhash*)");
		 * readAndEval("(setkeyhash 4 *test-keyhash*)"); testEvalEquals("T",
		 * "(getkeyhash 2 *test-keyhash*)"); testEvalEquals("T",
		 * "(getkeyhash 4 *test-keyhash*)"); testEvalEquals("NIL",
		 * "(getkeyhash 3 *test-keyhash*)");
		 * readAndEval("(remkeyhash 2 *test-keyhash*)"); testEvalEquals("NIL",
		 * "(getkeyhash 2 *test-keyhash*)");
		 * readAndEval("(setkeyhash 2 *test-keyhash*)"); testEvalEquals("2",
		 * "(keyhash-count *test-keyhash*)");
		 * readAndEval("(clrkeyhash *test-keyhash*)"); testEvalEquals("0",
		 * "(keyhash-count *test-keyhash*)"); testEvalEquals("'EQL",
		 * "(keyhash-test *test-keyhash*)");
		 */
	}

	public static void testKeywordEquality() {
		UnitTest.testEvalEquals("T", "(eq keyword:foo :foo)");
		UnitTest.testEvalEquals("T", "(eql keyword:foo :foo)");
		UnitTest.testEvalEquals("T", "(equal keyword:foo :foo)");
		UnitTest.testEvalEquals("T", "(equalp keyword:foo :foo)");
		UnitTest.testEvalEquals("T", "(eq :foo keyword:foo)");
		UnitTest.testEvalEquals("T", "(eql :foo keyword:foo)");
		UnitTest.testEvalEquals("T", "(equal :foo keyword:foo)");
		UnitTest.testEvalEquals("T", "(equalp :foo keyword:foo)");
	}

	public static void testLambdaFunctions() {
		// testEvalError("");
		// testEvalEquals("", "");
		UnitTest.testEvalEquals("nil", "((lambda ()))");
		UnitTest.testEvalEquals("nil", "((lambda () (ret nil)))");
		UnitTest.testEvalEquals("nil", "((lambda () T))"); // this mirrors the
		// expectation of a
		// fallthrough (ret NIL)
		UnitTest.testEvalEquals("nil", "((lambda (x)) nil)");
		UnitTest.testEvalEquals("nil", "((lambda (x)) 212)");
		UnitTest.testEvalEquals("nil", "((lambda (x) (ret nil)) 212)");
		UnitTest.testEvalEquals("nil", "((lambda (x) (ret x)) nil)");
		UnitTest.testEvalEquals("212", "((lambda (x) (ret x)) 212)");
		UnitTest.testEvalEquals("#\\a", "((lambda (x) (ret x)) #\\a)");
		UnitTest.testEvalEquals("#\\B", "((lambda (x) (ret #\\B)) #\\a)");
		UnitTest.testEvalEquals("#\\C", "((lambda (x &optional (y #\\C)) (ret y)) #\\a)");
		UnitTest.testEvalEquals("(list #\\c #\\d #\\e)",
				"((lambda (x &optional (y #\\C) &rest z) (ret z)) #\\a #\\b #\\c #\\d #\\e)");
		UnitTest.testEvalEquals("6", "((LAMBDA (X) (ret (+ X X))) 3)");
		UnitTest.testEvalEquals("4", "((LAMBDA (X Y) (ret (+ X Y))) 1 3)");
		UnitTest.testEvalEquals("212", "((lambda () (ret 212)))");
		UnitTest.testEvalEquals("'(6 3)", "((lambda (&optional (a 2 b) (c (+ 1 2))) (ret (list a c))) 6)");
		UnitTest.testEvalEquals("t", "((lambda (&optional (a 2 b) (c 3 d) &rest x) (ret b)) 6)");
		UnitTest.testEvalEquals("nil", "((lambda (&optional (a 2 b) (c 3 d) &rest x) (ret d)) 6)");
		UnitTest.testEvalEquals("12",
				"((lambda (y z &optional (a 2 b) (c 3 d) &rest x) (ret (+ y z a c))) (+ 1 2) (identity 4) 2)");
		UnitTest.testEvalEquals("'(10 11 12)",
				"((lambda (y z &optional (a 2 b) (c 3 d) &rest x) (ret x)) (+ 1 2) (identity 4) 2 1 10 11 12)");
		UnitTest.testEvalEquals("'(6 t 3 nil nil)",
				"((lambda (&optional (a 2 b) (c 3 d) &rest x) (ret (list a b c d x))) 6)");
		UnitTest.testEvalEquals("'(6 t 3 t nil nil 4)",
				"((lambda (&optional (a 2 b) (c 3 d) e (f 4) &rest x) (ret (list a b c d x e f))) 6 3)");
		UnitTest.testEvalError("(())");
		UnitTest.testEvalError("((lambda))");
		UnitTest.testEvalError("((lambda ()) nil)");
		UnitTest.testEvalError("((lambda () 212) 3)");
		UnitTest.testEvalError("((lambda (x y) 212) 3)");
		UnitTest.testEvalError("((lambda (x y) 212) 3 4 5)");
	}

	public static void testLexicalVariables() {
		// @todo add more once we have csetq
		UnitTest.testEvalEquals("NIL", "*");
	}

	public static void testListEquality() {
		Assert.assertEquals(
				ConsesLow.list(CommonSymbols.ZERO_INTEGER, CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER),
				ConsesLow.list(CommonSymbols.ZERO_INTEGER, CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER)
						.makeCopy());
		UnitTest.testEvalEquals("NIL", "(eq '(1 2 3) '(1 2 3))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 2 3) '(1 2 3))");
		UnitTest.testEvalEquals("T", "(equal '(1 2 3) '(1 2 3))");
		UnitTest.testEvalEquals("T", "(equalp '(1 2 3) '(1 2 3))");
		UnitTest.testEvalEquals("NIL", "(eq '(1 2 3) '(3 2 1))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 2 3) '(3 2 1))");
		UnitTest.testEvalEquals("NIL", "(equal '(1 2 3) '(3 2 1))");
		UnitTest.testEvalEquals("NIL", "(equalp '(1 2 3) '(3 2 1))");
		UnitTest.testEvalEquals("NIL", "(eq '(1 . 2) '(1 . 2))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 . 2) '(1 . 2))");
		UnitTest.testEvalEquals("T", "(equal '(1 . 2) '(1 . 2))");
		UnitTest.testEvalEquals("T", "(equalp '(1 . 2) '(1 . 2))");
		UnitTest.testEvalEquals("NIL", "(eq '(1 . 2) '(1 . 3))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 . 2) '(1 . 3))");
		UnitTest.testEvalEquals("NIL", "(equal '(1 . 2) '(1 . 3))");
		UnitTest.testEvalEquals("NIL", "(equalp '(1 . 2) '(1 . 3))");
		UnitTest.testEvalEquals("NIL", "(eq '(1 . 2) '(3 . 2))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 . 2) '(3 . 2))");
		UnitTest.testEvalEquals("NIL", "(equal '(1 . 2) '(3 . 2))");
		UnitTest.testEvalEquals("NIL", "(equalp '(1 . 2) '(3 . 2))");
		UnitTest.testEvalEquals("NIL", "(eq '(1 . 2) '(1 2))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 . 2) '(1 2))");
		UnitTest.testEvalEquals("NIL", "(equal '(1 . 2) '(1 2))");
		UnitTest.testEvalEquals("NIL", "(equalp '(1 . 2) '(1 2))");
		UnitTest.testEvalEquals("NIL", "(eq '(1) '(1 . NIL))");
		UnitTest.testEvalEquals("NIL", "(eql '(1) '(1 . NIL))");
		UnitTest.testEvalEquals("T", "(equal '(1) '(1 . NIL))");
		UnitTest.testEvalEquals("T", "(equalp '(1) '(1 . NIL))");
		UnitTest.testEvalEquals("NIL", "(eq '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
		UnitTest.testEvalEquals("NIL", "(eql '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
		UnitTest.testEvalEquals("NIL", "(equal '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
		UnitTest.testEvalEquals("T", "(equalp '(1 2 (\"foo\")) '(1 2 (\"FOO\")))");
		UnitTest.testEvalEquals("NIL", "(equal (cdr '(1 2 3)) (cdr '(1 2 3 4)))");
		UnitTest.shouldPrintTests("Testing Java equals() method on lists ....");
		SubLList listOne = UnitTest.readAndEval("(cdr '(1 2 3))").toList();
		SubLList listTwo = UnitTest.readAndEval("(cdr '(1 2 3 4))").toList();
		Assert.assertEquals("equals() does the wrong thing on list prefixes!", false, listOne.equals(listTwo));
	}

	public static void testLists() {
		UnitTest.testEvalEquals("2", "(length-with-cutoff (list 1 2 3) 2)");
		UnitTest.testEvalEquals("3", "(length-with-cutoff (list 1 2 3) 3)");
		UnitTest.testEvalEquals("3", "(length-with-cutoff (list 1 2 3) 4)");
		UnitTest.testEvalEquals("0", "(length-with-cutoff NIL 4)");
	}

	public static void testMapping() {
		UnitTest.testEvalEquals("'((1 100) (2 200) (3 300) (4 400))",
				"(mapcar 'identity '((1 100) (2 200) (3 300) (4 400)))");
		UnitTest.testEvalEquals("'((a . 1) (b . 2) (c . 3))", "(mapcar 'cons '(a b c) '(1 2 3))");
		UnitTest.testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z))", "(mapcar 'list '(a b c) '(1 2 3) '(X Y Z))");
		UnitTest.testEvalEquals("nil", "(mapcar 'list 'NIL '(1 2 3) '(X Y Z))");
		UnitTest.testEvalEquals("nil", "(mapcar 'list '(a b c) '(1 2 3) 'nil)");
		UnitTest.testEvalEquals("'((a 1 X) (b 2 Y))", "(mapcar 'list '(a b c) '(1 2) '(X Y Z))");
		UnitTest.testEvalEquals("'((a 1 X) )", "(mapcar 'list '(a) '(1 2 3) '(X Y Z))");
		UnitTest.testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z))", "(mapcar 'list '(a b c) '(1 2 3) '(X Y Z Q))");
		UnitTest.testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z))", "(mapcar 'list '(a b c d) '(1 2 3) '(X Y Z Q))");
		UnitTest.testEvalEquals("'((a 1 X) (b 2 Y) (c 3 Z) (d 4 Q))",
				"(mapcar 'list '(a b c d) '(1 2 3 4) '(X Y Z Q))");
		UnitTest.testEvalEquals("'((a . 1) (b . 2))", "(mapc 'first '((a . 1) (b . 2)))");
		UnitTest.testEvalEquals("'(A B C)", "(mapc #'cons '(a b c) '(1 2 3))");
		UnitTest.testEvalEquals("'(A B C)", "(mapc #'list '(a b c) '(1 2 3) '(X Y Z))");
		UnitTest.testEvalError("(mapcar 'list '(a . b))");
		UnitTest.testEvalEquals("'(1 100 2 200 3 300 4 400)", "(mapcan 'identity '((1 100) (2 200) (3 300) (4 400)))");
	}

	public static void testMathFunctions() {

		UnitTest.testEvalEquals("" + (Integer.MAX_VALUE + 1L), "(abs " + Integer.MIN_VALUE + ")");
		UnitTest.testEvalEquals("" + SubLObjectFactory.makeInteger(Long.MAX_VALUE).inc(),
				"(abs " + Long.MIN_VALUE + ")");

		UnitTest.testEvalEquals("t", "(< 1 2)");
		UnitTest.testEvalEquals("nil", "(< 2 1)");
		UnitTest.testEvalEquals("nil", "(< 2 2)");
		UnitTest.testEvalEquals("t", "(< 1.0 2)");
		UnitTest.testEvalEquals("nil", "(< 2.0 1)");
		UnitTest.testEvalEquals("nil", "(< 2.0 2)");
		UnitTest.testEvalEquals("t", "(< 1 2.0)");
		UnitTest.testEvalEquals("nil", "(< 2 1.0)");
		UnitTest.testEvalEquals("nil", "(< 2 2.0)");

		UnitTest.testEvalEquals("nil", "(> 1 2)");
		UnitTest.testEvalEquals("t", "(> 2 1)");
		UnitTest.testEvalEquals("nil", "(> 2 2)");
		UnitTest.testEvalEquals("nil", "(> 1.0 2)");
		UnitTest.testEvalEquals("t", "(> 2.0 1)");
		UnitTest.testEvalEquals("nil", "(> 2.0 2)");
		UnitTest.testEvalEquals("nil", "(> 1 2.0)");
		UnitTest.testEvalEquals("t", "(> 2 1.0)");
		UnitTest.testEvalEquals("nil", "(> 2 2.0)");

		UnitTest.testEvalEquals("t", "(<= 1 2)");
		UnitTest.testEvalEquals("nil", "(<= 2 1)");
		UnitTest.testEvalEquals("t", "(<= 2 2)");
		UnitTest.testEvalEquals("t", "(<= 1.0 2)");
		UnitTest.testEvalEquals("nil", "(<= 2.0 1)");
		UnitTest.testEvalEquals("t", "(<= 2.0 2)");
		UnitTest.testEvalEquals("t", "(<= 1 2.0)");
		UnitTest.testEvalEquals("nil", "(<= 2 1.0)");
		UnitTest.testEvalEquals("t", "(<= 2 2.0)");

		UnitTest.testEvalEquals("nil", "(>= 1 2)");
		UnitTest.testEvalEquals("t", "(>= 2 1)");
		UnitTest.testEvalEquals("t", "(>= 2 2)");
		UnitTest.testEvalEquals("nil", "(>= 1.0 2)");
		UnitTest.testEvalEquals("t", "(>= 2.0 1)");
		UnitTest.testEvalEquals("t", "(>= 2.0 2)");
		UnitTest.testEvalEquals("nil", "(>= 1 2.0)");
		UnitTest.testEvalEquals("t", "(>= 2 1.0)");
		UnitTest.testEvalEquals("t", "(>= 2 2.0)");

		UnitTest.testEvalEquals("nil", "(= 1 2)");
		UnitTest.testEvalEquals("nil", "(= 2 1)");
		UnitTest.testEvalEquals("t", "(= 2 2)");
		UnitTest.testEvalEquals("nil", "(= 1.0 2)");
		UnitTest.testEvalEquals("nil", "(= 2.0 1)");
		UnitTest.testEvalEquals("t", "(= 2.0 2)");
		UnitTest.testEvalEquals("nil", "(= 1 2.0)");
		UnitTest.testEvalEquals("nil", "(= 2 1.0)");
		UnitTest.testEvalEquals("t", "(= 2 2.0)");

		UnitTest.testEvalEquals("-2", "(- 1 1 1 1)");
		UnitTest.testEvalEquals("*E*", "(exp 1)");
		UnitTest.testEvalEquals("1", "(expt 10 0)");
		UnitTest.testEvalEquals("2", "(sqrt 4)");
		UnitTest.testEvalEquals("2.0", "(sqrt 4.0)");
		UnitTest.testEvalEquals("3", "(truncate 628318530717958612881244160 200000000000000000000000000)");

		/*
		 * standard-deviation is not part of the SubL kernel
		 * testEvalEquals("0.0", "(standard-deviation '(1.0 1.0 1.0))");
		 * assertEquals(SubLObjectFactory.makeDouble(1.0),
		 * Values.nthMultipleValue(1));
		 */

		for (int i = 0; i < UnitTest.DIVISION_TEST_CASE_TABLE.length; i++) {
			DivisionTest test = UnitTest.DIVISION_TEST_CASE_TABLE[i];
			test.runTest();
		}

		UnitTest.testEvalError("(/)");
		UnitTest.testEvalEquals(".25", "(/ 4)");
		UnitTest.testEvalError("(/ 0)");
		UnitTest.testEvalError("(/ 10 0)");
		UnitTest.testEvalEquals("2", "(/ 6 3)"); // stay in integers where
													// possible
		UnitTest.testEvalEquals("1.5", "(/ 6 4)");

		UnitTest.testEvalEquals("1", "(mod 1969 4)");
		UnitTest.testEvalEquals("3", "(mod (- 1969) 4)");

		// when we have TO-STRING implemented
		// testEvalEquals( "\"" + Integer.toString(SubLNumberFactory.MIN_FIXNUM)
		// + "\"", "(to-string " +
		// Integer.toString(SubLNumberFactory.MIN_FIXNUM) + ")");
		// testEvalEquals( "\"" + Integer.toString(SubLNumberFactory.MAX_FIXNUM)
		// + "\"", "(to-string " +
		// Integer.toString(SubLNumberFactory.MAX_FIXNUM) + ")");

		UnitTest.testEvalEquals(Integer.toString(SubLNumberFactory.MIN_FIXNUM), "*most-negative-fixnum*");
		UnitTest.testEvalEquals(Integer.toString(SubLNumberFactory.MAX_FIXNUM), "*most-positive-fixnum*");
		UnitTest.testEvalEquals("T", "(fixnump *most-positive-fixnum*)");
		UnitTest.testEvalEquals("T", "(fixnump *most-negative-fixnum*)");
		UnitTest.testEvalEquals("NIL", "(fixnump (+ 1 *most-positive-fixnum*))");
		UnitTest.testEvalEquals("NIL", "(fixnump (- *most-negative-fixnum* 1))");

		UnitTest.testEvalEquals("32", "(ash 16 1)");
		UnitTest.testEvalEquals("-1", "(ash -123 -23)");
		UnitTest.testEvalEquals("16", "(ash 16 0)");
		UnitTest.testEvalEquals("8", "(ash 16 -1)");
		UnitTest.testEvalEquals("-79", "(ash -100000000000000000000000000000000 -100)");

		SubLNumber number = Sxhash.sxhash_rot(SubLNumberFactory.makeInteger(212), CommonSymbols.TWO_INTEGER).toNumber();
		UnitTest.testEvalEquals("848", number.toString());

		UnitTest.testEvalEquals("T", "(evenp 2)");
		UnitTest.testEvalEquals("T", "(evenp -2)");
		UnitTest.testEvalEquals("NIL", "(evenp 3)");
		UnitTest.testEvalEquals("NIL", "(evenp -3)");
		UnitTest.testEvalEquals("T", "(evenp 0)");
		UnitTest.testEvalEquals("T", "(evenp 123456789012345678902)");
		UnitTest.testEvalEquals("T", "(evenp -123456789012345678902)");
		UnitTest.testEvalEquals("NIL", "(evenp 123456789012345678903)");
		UnitTest.testEvalEquals("NIL", "(evenp -123456789012345678903)");
		UnitTest.testEvalEquals("T", "(evenp 123456789012345678900)");

		// from the numeric decomposition of *PI*
		UnitTest.testEvalEquals("'(3)",
				"(sl::fdl_generate 14033207267164160 45035996273704960 1000000000000000 1000000000000000 t)");
		UnitTest.testEvalEquals("'(9 3)",
				"(sl::fdl_generate 41935717373050880 45035996273704960 100000000000000 100000000000000 t)");
		UnitTest.testEvalEquals("'(7 9 3)",
				"(sl::fdl_generate 35718769128898560 45035996273704960 10000000000000 10000000000000 t)");
		UnitTest.testEvalEquals("'(9 7 9 3)",
				"(sl::fdl_generate 44104273559224320 45035996273704960 1000000000000 1000000000000 t)");
		UnitTest.testEvalEquals("'(8 9 7 9 3)",
				"(sl::fdl_generate 40439224374886400 45035996273704960 100000000000 100000000000 t)");
		UnitTest.testEvalEquals("'(5 8 9 7 9 3)",
				"(sl::fdl_generate 26561920574341120 45035996273704960 10000000000 10000000000 t)");
		UnitTest.testEvalEquals("'(3 5 8 9 7 9 3)",
				"(sl::fdl_generate 16166990939545600 45035996273704960 1000000000 1000000000 t)");
		UnitTest.testEvalEquals("'(5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 24134697230807040 45035996273704960 100000000 100000000 t)");
		UnitTest.testEvalEquals("'(6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 29435067487303680 45035996273704960 10000000 10000000 t)");
		UnitTest.testEvalEquals("'(2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 11950706003471360 45035996273704960 1000000 1000000 t)");
		UnitTest.testEvalEquals("'(9 2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 41727467246681600 45035996273704960 100000 100000 t)");
		UnitTest.testEvalEquals("'(5 9 2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 26690744861520640 45035996273704960 10000 10000 t)");
		UnitTest.testEvalEquals("'(1 5 9 2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 7172674113522560 45035996273704960 1000 1000 t)");
		UnitTest.testEvalEquals("'(4 1 5 9 2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 18731665920834240 45035996273704960 100 100 t)");
		UnitTest.testEvalEquals("'(1 4 1 5 9 2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 6376766219453920 45035996273704960 10 10 t)");
		UnitTest.testEvalEquals("'(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3)",
				"(sl::fdl_generate 14148475504056880 45035996273704960 1 1 t)");

		// another sub-expression from deconstructing PI
		UnitTest.testEvalEquals("18014398509481984", "(* (expt (float-radix *pi*) 53) 2)");

		// getting the actual floating list for PI
		UnitTest.testEvalEquals("'(3 1 4 1 5 9 2 6 5 3 5 8 9 7 9 3)", "(sl::flonum-digit-list *pi*)");

		// testing integer length
		// @section int and longs
		/**
		 * @note These tests were not done as a test case table, because it is
		 *       easier to set a break-point using this approach on the specific
		 *       test that is failing.
		 *
		 *       (in-package :cyc) (define
		 *       generate-integers-for-integer-length-test () (clet (integers)
		 *       (cdotimes (i 65) (pif (zerop i) (cpush 0 integers) (clet
		 *       ((index (- i 1)) (pow2 (expt 2 index)) (base (expt 2 (- index
		 *       1)))) (pif (< index 5) ;; add all of them (pwhen (fixnump base)
		 *       (cdotimes (offset base) (cpush (+ base offset) integers))) ;;
		 *       add some of them (cdotimes (counter index) (clet
		 *       ((random-offset (random base))) (cpush (+ base random-offset)
		 *       integers)) (cpush pow2 integers)))))) (ret
		 *       (delete-duplicates-sorted (sort integers #'<)))))
		 *
		 *       (define generate-integer-length-tests-from-integers (integers
		 *       &optional (stream T)) (cdolist (integer integers) (clet
		 *       ((length (integer-length integer))) (format stream "~&
		 *       testEvalEquals(\"~A\",\"(integer-length ~A)\");~%" length
		 *       integer))) (ret (boolean integers)))
		 */
		UnitTest.testEvalEquals("0", "(integer-length 0)");
		UnitTest.testEvalEquals("1", "(integer-length 1)");
		UnitTest.testEvalEquals("2", "(integer-length 2)");
		UnitTest.testEvalEquals("2", "(integer-length 3)");
		UnitTest.testEvalEquals("3", "(integer-length 4)");
		UnitTest.testEvalEquals("3", "(integer-length 5)");
		UnitTest.testEvalEquals("3", "(integer-length 6)");
		UnitTest.testEvalEquals("3", "(integer-length 7)");
		UnitTest.testEvalEquals("4", "(integer-length 8)");
		UnitTest.testEvalEquals("4", "(integer-length 9)");
		UnitTest.testEvalEquals("4", "(integer-length 10)");
		UnitTest.testEvalEquals("4", "(integer-length 11)");
		UnitTest.testEvalEquals("4", "(integer-length 12)");
		UnitTest.testEvalEquals("4", "(integer-length 13)");
		UnitTest.testEvalEquals("4", "(integer-length 14)");
		UnitTest.testEvalEquals("4", "(integer-length 15)");
		UnitTest.testEvalEquals("5", "(integer-length 16)");
		UnitTest.testEvalEquals("5", "(integer-length 17)");
		UnitTest.testEvalEquals("5", "(integer-length 26)");
		UnitTest.testEvalEquals("5", "(integer-length 28)");
		UnitTest.testEvalEquals("5", "(integer-length 31)");
		UnitTest.testEvalEquals("6", "(integer-length 32)");
		UnitTest.testEvalEquals("6", "(integer-length 34)");
		UnitTest.testEvalEquals("6", "(integer-length 35)");
		UnitTest.testEvalEquals("6", "(integer-length 37)");
		UnitTest.testEvalEquals("6", "(integer-length 56)");
		UnitTest.testEvalEquals("6", "(integer-length 57)");
		UnitTest.testEvalEquals("7", "(integer-length 64)");
		UnitTest.testEvalEquals("7", "(integer-length 66)");
		UnitTest.testEvalEquals("7", "(integer-length 73)");
		UnitTest.testEvalEquals("7", "(integer-length 77)");
		UnitTest.testEvalEquals("7", "(integer-length 103)");
		UnitTest.testEvalEquals("7", "(integer-length 116)");
		UnitTest.testEvalEquals("7", "(integer-length 118)");
		UnitTest.testEvalEquals("7", "(integer-length 125)");
		UnitTest.testEvalEquals("8", "(integer-length 128)");
		UnitTest.testEvalEquals("8", "(integer-length 141)");
		UnitTest.testEvalEquals("8", "(integer-length 190)");
		UnitTest.testEvalEquals("8", "(integer-length 193)");
		UnitTest.testEvalEquals("8", "(integer-length 197)");
		UnitTest.testEvalEquals("8", "(integer-length 211)");
		UnitTest.testEvalEquals("8", "(integer-length 221)");
		UnitTest.testEvalEquals("8", "(integer-length 234)");
		UnitTest.testEvalEquals("8", "(integer-length 249)");
		UnitTest.testEvalEquals("9", "(integer-length 256)");
		UnitTest.testEvalEquals("9", "(integer-length 280)");
		UnitTest.testEvalEquals("9", "(integer-length 291)");
		UnitTest.testEvalEquals("9", "(integer-length 339)");
		UnitTest.testEvalEquals("9", "(integer-length 353)");
		UnitTest.testEvalEquals("9", "(integer-length 392)");
		UnitTest.testEvalEquals("9", "(integer-length 394)");
		UnitTest.testEvalEquals("9", "(integer-length 395)");
		UnitTest.testEvalEquals("9", "(integer-length 480)");
		UnitTest.testEvalEquals("9", "(integer-length 493)");
		UnitTest.testEvalEquals("10", "(integer-length 512)");
		UnitTest.testEvalEquals("10", "(integer-length 520)");
		UnitTest.testEvalEquals("10", "(integer-length 542)");
		UnitTest.testEvalEquals("10", "(integer-length 585)");
		UnitTest.testEvalEquals("10", "(integer-length 597)");
		UnitTest.testEvalEquals("10", "(integer-length 639)");
		UnitTest.testEvalEquals("10", "(integer-length 722)");
		UnitTest.testEvalEquals("10", "(integer-length 767)");
		UnitTest.testEvalEquals("10", "(integer-length 807)");
		UnitTest.testEvalEquals("10", "(integer-length 828)");
		UnitTest.testEvalEquals("10", "(integer-length 857)");
		UnitTest.testEvalEquals("11", "(integer-length 1024)");
		UnitTest.testEvalEquals("11", "(integer-length 1178)");
		UnitTest.testEvalEquals("11", "(integer-length 1272)");
		UnitTest.testEvalEquals("11", "(integer-length 1310)");
		UnitTest.testEvalEquals("11", "(integer-length 1327)");
		UnitTest.testEvalEquals("11", "(integer-length 1502)");
		UnitTest.testEvalEquals("11", "(integer-length 1539)");
		UnitTest.testEvalEquals("11", "(integer-length 1619)");
		UnitTest.testEvalEquals("11", "(integer-length 1669)");
		UnitTest.testEvalEquals("11", "(integer-length 1680)");
		UnitTest.testEvalEquals("11", "(integer-length 1681)");
		UnitTest.testEvalEquals("11", "(integer-length 1822)");
		UnitTest.testEvalEquals("12", "(integer-length 2048)");
		UnitTest.testEvalEquals("12", "(integer-length 2079)");
		UnitTest.testEvalEquals("12", "(integer-length 2104)");
		UnitTest.testEvalEquals("12", "(integer-length 2342)");
		UnitTest.testEvalEquals("12", "(integer-length 2478)");
		UnitTest.testEvalEquals("12", "(integer-length 2800)");
		UnitTest.testEvalEquals("12", "(integer-length 2982)");
		UnitTest.testEvalEquals("12", "(integer-length 3168)");
		UnitTest.testEvalEquals("12", "(integer-length 3382)");
		UnitTest.testEvalEquals("12", "(integer-length 3475)");
		UnitTest.testEvalEquals("12", "(integer-length 3692)");
		UnitTest.testEvalEquals("12", "(integer-length 3766)");
		UnitTest.testEvalEquals("12", "(integer-length 4052)");
		UnitTest.testEvalEquals("13", "(integer-length 4096)");
		UnitTest.testEvalEquals("13", "(integer-length 4751)");
		UnitTest.testEvalEquals("13", "(integer-length 5085)");
		UnitTest.testEvalEquals("13", "(integer-length 5103)");
		UnitTest.testEvalEquals("13", "(integer-length 5396)");
		UnitTest.testEvalEquals("13", "(integer-length 5479)");
		UnitTest.testEvalEquals("13", "(integer-length 6215)");
		UnitTest.testEvalEquals("13", "(integer-length 6536)");
		UnitTest.testEvalEquals("13", "(integer-length 6737)");
		UnitTest.testEvalEquals("13", "(integer-length 6870)");
		UnitTest.testEvalEquals("13", "(integer-length 7201)");
		UnitTest.testEvalEquals("13", "(integer-length 7235)");
		UnitTest.testEvalEquals("13", "(integer-length 7876)");
		UnitTest.testEvalEquals("13", "(integer-length 7966)");
		UnitTest.testEvalEquals("14", "(integer-length 8192)");
		UnitTest.testEvalEquals("14", "(integer-length 8419)");
		UnitTest.testEvalEquals("14", "(integer-length 8471)");
		UnitTest.testEvalEquals("14", "(integer-length 8977)");
		UnitTest.testEvalEquals("14", "(integer-length 9599)");
		UnitTest.testEvalEquals("14", "(integer-length 10059)");
		UnitTest.testEvalEquals("14", "(integer-length 10403)");
		UnitTest.testEvalEquals("14", "(integer-length 10474)");
		UnitTest.testEvalEquals("14", "(integer-length 10606)");
		UnitTest.testEvalEquals("14", "(integer-length 12461)");
		UnitTest.testEvalEquals("14", "(integer-length 13016)");
		UnitTest.testEvalEquals("14", "(integer-length 13389)");
		UnitTest.testEvalEquals("14", "(integer-length 13545)");
		UnitTest.testEvalEquals("14", "(integer-length 15693)");
		UnitTest.testEvalEquals("14", "(integer-length 16189)");
		UnitTest.testEvalEquals("15", "(integer-length 16384)");
		UnitTest.testEvalEquals("15", "(integer-length 17897)");
		UnitTest.testEvalEquals("15", "(integer-length 18202)");
		UnitTest.testEvalEquals("15", "(integer-length 19388)");
		UnitTest.testEvalEquals("15", "(integer-length 20833)");
		UnitTest.testEvalEquals("15", "(integer-length 21169)");
		UnitTest.testEvalEquals("15", "(integer-length 22567)");
		UnitTest.testEvalEquals("15", "(integer-length 26405)");
		UnitTest.testEvalEquals("15", "(integer-length 28372)");
		UnitTest.testEvalEquals("15", "(integer-length 29594)");
		UnitTest.testEvalEquals("15", "(integer-length 29890)");
		UnitTest.testEvalEquals("15", "(integer-length 30152)");
		UnitTest.testEvalEquals("15", "(integer-length 30398)");
		UnitTest.testEvalEquals("15", "(integer-length 30787)");
		UnitTest.testEvalEquals("15", "(integer-length 31212)");
		UnitTest.testEvalEquals("15", "(integer-length 31580)");
		UnitTest.testEvalEquals("16", "(integer-length 32768)");
		UnitTest.testEvalEquals("16", "(integer-length 33240)");
		UnitTest.testEvalEquals("16", "(integer-length 35900)");
		UnitTest.testEvalEquals("16", "(integer-length 36070)");
		UnitTest.testEvalEquals("16", "(integer-length 40285)");
		UnitTest.testEvalEquals("16", "(integer-length 40914)");
		UnitTest.testEvalEquals("16", "(integer-length 41534)");
		UnitTest.testEvalEquals("16", "(integer-length 53087)");
		UnitTest.testEvalEquals("16", "(integer-length 54507)");
		UnitTest.testEvalEquals("16", "(integer-length 55160)");
		UnitTest.testEvalEquals("16", "(integer-length 56283)");
		UnitTest.testEvalEquals("16", "(integer-length 61058)");
		UnitTest.testEvalEquals("16", "(integer-length 61415)");
		UnitTest.testEvalEquals("16", "(integer-length 61988)");
		UnitTest.testEvalEquals("16", "(integer-length 62469)");
		UnitTest.testEvalEquals("16", "(integer-length 64803)");
		UnitTest.testEvalEquals("16", "(integer-length 65527)");
		UnitTest.testEvalEquals("17", "(integer-length 65536)");
		UnitTest.testEvalEquals("17", "(integer-length 65565)");
		UnitTest.testEvalEquals("17", "(integer-length 70725)");
		UnitTest.testEvalEquals("17", "(integer-length 76768)");
		UnitTest.testEvalEquals("17", "(integer-length 80425)");
		UnitTest.testEvalEquals("17", "(integer-length 83439)");
		UnitTest.testEvalEquals("17", "(integer-length 84806)");
		UnitTest.testEvalEquals("17", "(integer-length 88797)");
		UnitTest.testEvalEquals("17", "(integer-length 90216)");
		UnitTest.testEvalEquals("17", "(integer-length 99986)");
		UnitTest.testEvalEquals("17", "(integer-length 100861)");
		UnitTest.testEvalEquals("17", "(integer-length 105873)");
		UnitTest.testEvalEquals("17", "(integer-length 106925)");
		UnitTest.testEvalEquals("17", "(integer-length 107486)");
		UnitTest.testEvalEquals("17", "(integer-length 115679)");
		UnitTest.testEvalEquals("17", "(integer-length 116449)");
		UnitTest.testEvalEquals("17", "(integer-length 125539)");
		UnitTest.testEvalEquals("17", "(integer-length 127596)");
		UnitTest.testEvalEquals("18", "(integer-length 131072)");
		UnitTest.testEvalEquals("18", "(integer-length 143822)");
		UnitTest.testEvalEquals("18", "(integer-length 145423)");
		UnitTest.testEvalEquals("18", "(integer-length 155814)");
		UnitTest.testEvalEquals("18", "(integer-length 156684)");
		UnitTest.testEvalEquals("18", "(integer-length 160193)");
		UnitTest.testEvalEquals("18", "(integer-length 182098)");
		UnitTest.testEvalEquals("18", "(integer-length 186407)");
		UnitTest.testEvalEquals("18", "(integer-length 193511)");
		UnitTest.testEvalEquals("18", "(integer-length 200959)");
		UnitTest.testEvalEquals("18", "(integer-length 205441)");
		UnitTest.testEvalEquals("18", "(integer-length 216260)");
		UnitTest.testEvalEquals("18", "(integer-length 225333)");
		UnitTest.testEvalEquals("18", "(integer-length 229987)");
		UnitTest.testEvalEquals("18", "(integer-length 233296)");
		UnitTest.testEvalEquals("18", "(integer-length 234444)");
		UnitTest.testEvalEquals("18", "(integer-length 242790)");
		UnitTest.testEvalEquals("18", "(integer-length 252267)");
		UnitTest.testEvalEquals("18", "(integer-length 260973)");
		UnitTest.testEvalEquals("19", "(integer-length 262144)");
		UnitTest.testEvalEquals("19", "(integer-length 266923)");
		UnitTest.testEvalEquals("19", "(integer-length 272408)");
		UnitTest.testEvalEquals("19", "(integer-length 276956)");
		UnitTest.testEvalEquals("19", "(integer-length 301682)");
		UnitTest.testEvalEquals("19", "(integer-length 301765)");
		UnitTest.testEvalEquals("19", "(integer-length 302332)");
		UnitTest.testEvalEquals("19", "(integer-length 314820)");
		UnitTest.testEvalEquals("19", "(integer-length 348284)");
		UnitTest.testEvalEquals("19", "(integer-length 398157)");
		UnitTest.testEvalEquals("19", "(integer-length 405488)");
		UnitTest.testEvalEquals("19", "(integer-length 418161)");
		UnitTest.testEvalEquals("19", "(integer-length 427500)");
		UnitTest.testEvalEquals("19", "(integer-length 460859)");
		UnitTest.testEvalEquals("19", "(integer-length 473032)");
		UnitTest.testEvalEquals("19", "(integer-length 495310)");
		UnitTest.testEvalEquals("19", "(integer-length 510109)");
		UnitTest.testEvalEquals("19", "(integer-length 512529)");
		UnitTest.testEvalEquals("19", "(integer-length 519965)");
		UnitTest.testEvalEquals("19", "(integer-length 521458)");
		UnitTest.testEvalEquals("20", "(integer-length 524288)");
		UnitTest.testEvalEquals("20", "(integer-length 567908)");
		UnitTest.testEvalEquals("20", "(integer-length 572881)");
		UnitTest.testEvalEquals("20", "(integer-length 582363)");
		UnitTest.testEvalEquals("20", "(integer-length 585938)");
		UnitTest.testEvalEquals("20", "(integer-length 628871)");
		UnitTest.testEvalEquals("20", "(integer-length 656859)");
		UnitTest.testEvalEquals("20", "(integer-length 684775)");
		UnitTest.testEvalEquals("20", "(integer-length 692508)");
		UnitTest.testEvalEquals("20", "(integer-length 717681)");
		UnitTest.testEvalEquals("20", "(integer-length 757147)");
		UnitTest.testEvalEquals("20", "(integer-length 799931)");
		UnitTest.testEvalEquals("20", "(integer-length 812075)");
		UnitTest.testEvalEquals("20", "(integer-length 819850)");
		UnitTest.testEvalEquals("20", "(integer-length 843370)");
		UnitTest.testEvalEquals("20", "(integer-length 856566)");
		UnitTest.testEvalEquals("20", "(integer-length 930082)");
		UnitTest.testEvalEquals("20", "(integer-length 930526)");
		UnitTest.testEvalEquals("20", "(integer-length 1000882)");
		UnitTest.testEvalEquals("20", "(integer-length 1010442)");
		UnitTest.testEvalEquals("20", "(integer-length 1038131)");
		UnitTest.testEvalEquals("21", "(integer-length 1048576)");
		UnitTest.testEvalEquals("21", "(integer-length 1081980)");
		UnitTest.testEvalEquals("21", "(integer-length 1098746)");
		UnitTest.testEvalEquals("21", "(integer-length 1102456)");
		UnitTest.testEvalEquals("21", "(integer-length 1120478)");
		UnitTest.testEvalEquals("21", "(integer-length 1216435)");
		UnitTest.testEvalEquals("21", "(integer-length 1306741)");
		UnitTest.testEvalEquals("21", "(integer-length 1352575)");
		UnitTest.testEvalEquals("21", "(integer-length 1358120)");
		UnitTest.testEvalEquals("21", "(integer-length 1486774)");
		UnitTest.testEvalEquals("21", "(integer-length 1545448)");
		UnitTest.testEvalEquals("21", "(integer-length 1619764)");
		UnitTest.testEvalEquals("21", "(integer-length 1683067)");
		UnitTest.testEvalEquals("21", "(integer-length 1710682)");
		UnitTest.testEvalEquals("21", "(integer-length 1734290)");
		UnitTest.testEvalEquals("21", "(integer-length 1750429)");
		UnitTest.testEvalEquals("21", "(integer-length 1770037)");
		UnitTest.testEvalEquals("21", "(integer-length 1794950)");
		UnitTest.testEvalEquals("21", "(integer-length 1817181)");
		UnitTest.testEvalEquals("21", "(integer-length 1868568)");
		UnitTest.testEvalEquals("21", "(integer-length 1879600)");
		UnitTest.testEvalEquals("21", "(integer-length 1918243)");
		UnitTest.testEvalEquals("22", "(integer-length 2097152)");
		UnitTest.testEvalEquals("22", "(integer-length 2162010)");
		UnitTest.testEvalEquals("22", "(integer-length 2234232)");
		UnitTest.testEvalEquals("22", "(integer-length 2319777)");
		UnitTest.testEvalEquals("22", "(integer-length 2509529)");
		UnitTest.testEvalEquals("22", "(integer-length 2591916)");
		UnitTest.testEvalEquals("22", "(integer-length 2670422)");
		UnitTest.testEvalEquals("22", "(integer-length 2973056)");
		UnitTest.testEvalEquals("22", "(integer-length 3132778)");
		UnitTest.testEvalEquals("22", "(integer-length 3163947)");
		UnitTest.testEvalEquals("22", "(integer-length 3176879)");
		UnitTest.testEvalEquals("22", "(integer-length 3231887)");
		UnitTest.testEvalEquals("22", "(integer-length 3385232)");
		UnitTest.testEvalEquals("22", "(integer-length 3525182)");
		UnitTest.testEvalEquals("22", "(integer-length 3578488)");
		UnitTest.testEvalEquals("22", "(integer-length 3780021)");
		UnitTest.testEvalEquals("22", "(integer-length 3795104)");
		UnitTest.testEvalEquals("22", "(integer-length 3927826)");
		UnitTest.testEvalEquals("22", "(integer-length 4003934)");
		UnitTest.testEvalEquals("22", "(integer-length 4008894)");
		UnitTest.testEvalEquals("22", "(integer-length 4022574)");
		UnitTest.testEvalEquals("22", "(integer-length 4177893)");
		UnitTest.testEvalEquals("22", "(integer-length 4189465)");
		UnitTest.testEvalEquals("23", "(integer-length 4194304)");
		UnitTest.testEvalEquals("23", "(integer-length 4200515)");
		UnitTest.testEvalEquals("23", "(integer-length 4389360)");
		UnitTest.testEvalEquals("23", "(integer-length 4434763)");
		UnitTest.testEvalEquals("23", "(integer-length 4501360)");
		UnitTest.testEvalEquals("23", "(integer-length 4569256)");
		UnitTest.testEvalEquals("23", "(integer-length 4899405)");
		UnitTest.testEvalEquals("23", "(integer-length 4959698)");
		UnitTest.testEvalEquals("23", "(integer-length 5174254)");
		UnitTest.testEvalEquals("23", "(integer-length 5197738)");
		UnitTest.testEvalEquals("23", "(integer-length 5288987)");
		UnitTest.testEvalEquals("23", "(integer-length 5817637)");
		UnitTest.testEvalEquals("23", "(integer-length 6215149)");
		UnitTest.testEvalEquals("23", "(integer-length 6309629)");
		UnitTest.testEvalEquals("23", "(integer-length 6344057)");
		UnitTest.testEvalEquals("23", "(integer-length 6766152)");
		UnitTest.testEvalEquals("23", "(integer-length 6847162)");
		UnitTest.testEvalEquals("23", "(integer-length 6961582)");
		UnitTest.testEvalEquals("23", "(integer-length 7356153)");
		UnitTest.testEvalEquals("23", "(integer-length 7427263)");
		UnitTest.testEvalEquals("23", "(integer-length 7736539)");
		UnitTest.testEvalEquals("23", "(integer-length 7759647)");
		UnitTest.testEvalEquals("23", "(integer-length 7937744)");
		UnitTest.testEvalEquals("23", "(integer-length 8139461)");
		UnitTest.testEvalEquals("24", "(integer-length 8388608)");
		UnitTest.testEvalEquals("24", "(integer-length 8694684)");
		UnitTest.testEvalEquals("24", "(integer-length 9031784)");
		UnitTest.testEvalEquals("24", "(integer-length 9255256)");
		UnitTest.testEvalEquals("24", "(integer-length 9807789)");
		UnitTest.testEvalEquals("24", "(integer-length 9928789)");
		UnitTest.testEvalEquals("24", "(integer-length 10398437)");
		UnitTest.testEvalEquals("24", "(integer-length 10519597)");
		UnitTest.testEvalEquals("24", "(integer-length 10900936)");
		UnitTest.testEvalEquals("24", "(integer-length 12360904)");
		UnitTest.testEvalEquals("24", "(integer-length 12550710)");
		UnitTest.testEvalEquals("24", "(integer-length 12803689)");
		UnitTest.testEvalEquals("24", "(integer-length 13014224)");
		UnitTest.testEvalEquals("24", "(integer-length 13582701)");
		UnitTest.testEvalEquals("24", "(integer-length 13802279)");
		UnitTest.testEvalEquals("24", "(integer-length 14034018)");
		UnitTest.testEvalEquals("24", "(integer-length 14119437)");
		UnitTest.testEvalEquals("24", "(integer-length 14638357)");
		UnitTest.testEvalEquals("24", "(integer-length 14752840)");
		UnitTest.testEvalEquals("24", "(integer-length 14968482)");
		UnitTest.testEvalEquals("24", "(integer-length 15408036)");
		UnitTest.testEvalEquals("24", "(integer-length 15692164)");
		UnitTest.testEvalEquals("24", "(integer-length 15701094)");
		UnitTest.testEvalEquals("24", "(integer-length 15752586)");
		UnitTest.testEvalEquals("24", "(integer-length 15849254)");
		UnitTest.testEvalEquals("25", "(integer-length 16777216)");
		UnitTest.testEvalEquals("25", "(integer-length 18915908)");
		UnitTest.testEvalEquals("25", "(integer-length 20363453)");
		UnitTest.testEvalEquals("25", "(integer-length 20412437)");
		UnitTest.testEvalEquals("25", "(integer-length 22001905)");
		UnitTest.testEvalEquals("25", "(integer-length 22060597)");
		UnitTest.testEvalEquals("25", "(integer-length 23526364)");
		UnitTest.testEvalEquals("25", "(integer-length 23805184)");
		UnitTest.testEvalEquals("25", "(integer-length 24038485)");
		UnitTest.testEvalEquals("25", "(integer-length 24266224)");
		UnitTest.testEvalEquals("25", "(integer-length 24267706)");
		UnitTest.testEvalEquals("25", "(integer-length 25599337)");
		UnitTest.testEvalEquals("25", "(integer-length 26125767)");
		UnitTest.testEvalEquals("25", "(integer-length 26486460)");
		UnitTest.testEvalEquals("25", "(integer-length 26811063)");
		UnitTest.testEvalEquals("25", "(integer-length 28112604)");
		UnitTest.testEvalEquals("25", "(integer-length 28678599)");
		UnitTest.testEvalEquals("25", "(integer-length 28780438)");
		UnitTest.testEvalEquals("25", "(integer-length 29019999)");
		UnitTest.testEvalEquals("25", "(integer-length 30026745)");
		UnitTest.testEvalEquals("25", "(integer-length 30095375)");
		UnitTest.testEvalEquals("25", "(integer-length 30201780)");
		UnitTest.testEvalEquals("25", "(integer-length 30974947)");
		UnitTest.testEvalEquals("25", "(integer-length 31367096)");
		UnitTest.testEvalEquals("25", "(integer-length 33055506)");
		UnitTest.testEvalEquals("25", "(integer-length 33435743)");
		UnitTest.testEvalEquals("26", "(integer-length 33554432)");
		UnitTest.testEvalEquals("26", "(integer-length 33661557)");
		UnitTest.testEvalEquals("26", "(integer-length 34727657)");
		UnitTest.testEvalEquals("26", "(integer-length 34834399)");
		UnitTest.testEvalEquals("26", "(integer-length 36368302)");
		UnitTest.testEvalEquals("26", "(integer-length 37834587)");
		UnitTest.testEvalEquals("26", "(integer-length 37856545)");
		UnitTest.testEvalEquals("26", "(integer-length 37919351)");
		UnitTest.testEvalEquals("26", "(integer-length 38107597)");
		UnitTest.testEvalEquals("26", "(integer-length 42853153)");
		UnitTest.testEvalEquals("26", "(integer-length 45487000)");
		UnitTest.testEvalEquals("26", "(integer-length 48058075)");
		UnitTest.testEvalEquals("26", "(integer-length 48196130)");
		UnitTest.testEvalEquals("26", "(integer-length 48467085)");
		UnitTest.testEvalEquals("26", "(integer-length 48916539)");
		UnitTest.testEvalEquals("26", "(integer-length 49903305)");
		UnitTest.testEvalEquals("26", "(integer-length 50734029)");
		UnitTest.testEvalEquals("26", "(integer-length 52983146)");
		UnitTest.testEvalEquals("26", "(integer-length 53603602)");
		UnitTest.testEvalEquals("26", "(integer-length 56827426)");
		UnitTest.testEvalEquals("26", "(integer-length 57753474)");
		UnitTest.testEvalEquals("26", "(integer-length 59968006)");
		UnitTest.testEvalEquals("26", "(integer-length 60054921)");
		UnitTest.testEvalEquals("26", "(integer-length 60729212)");
		UnitTest.testEvalEquals("26", "(integer-length 61623500)");
		UnitTest.testEvalEquals("26", "(integer-length 64625051)");
		UnitTest.testEvalEquals("26", "(integer-length 65430226)");
		UnitTest.testEvalEquals("27", "(integer-length 67108864)");
		UnitTest.testEvalEquals("27", "(integer-length 72035650)");
		UnitTest.testEvalEquals("27", "(integer-length 72667435)");
		UnitTest.testEvalEquals("27", "(integer-length 73421065)");
		UnitTest.testEvalEquals("27", "(integer-length 73987090)");
		UnitTest.testEvalEquals("27", "(integer-length 76337257)");
		UnitTest.testEvalEquals("27", "(integer-length 76744992)");
		UnitTest.testEvalEquals("27", "(integer-length 87476825)");
		UnitTest.testEvalEquals("27", "(integer-length 90071108)");
		UnitTest.testEvalEquals("27", "(integer-length 93340679)");
		UnitTest.testEvalEquals("27", "(integer-length 93653291)");
		UnitTest.testEvalEquals("27", "(integer-length 99012053)");
		UnitTest.testEvalEquals("27", "(integer-length 99685627)");
		UnitTest.testEvalEquals("27", "(integer-length 101931784)");
		UnitTest.testEvalEquals("27", "(integer-length 102218872)");
		UnitTest.testEvalEquals("27", "(integer-length 104792701)");
		UnitTest.testEvalEquals("27", "(integer-length 109382088)");
		UnitTest.testEvalEquals("27", "(integer-length 113182458)");
		UnitTest.testEvalEquals("27", "(integer-length 117941538)");
		UnitTest.testEvalEquals("27", "(integer-length 118743251)");
		UnitTest.testEvalEquals("27", "(integer-length 120542580)");
		UnitTest.testEvalEquals("27", "(integer-length 122695727)");
		UnitTest.testEvalEquals("27", "(integer-length 126255076)");
		UnitTest.testEvalEquals("27", "(integer-length 126965608)");
		UnitTest.testEvalEquals("27", "(integer-length 130852546)");
		UnitTest.testEvalEquals("27", "(integer-length 132306843)");
		UnitTest.testEvalEquals("27", "(integer-length 132596839)");
		UnitTest.testEvalEquals("27", "(integer-length 134193241)");
		UnitTest.testEvalEquals("28", "(integer-length 134217728)");
		UnitTest.testEvalEquals("28", "(integer-length 141278311)");
		UnitTest.testEvalEquals("28", "(integer-length 146460732)");
		UnitTest.testEvalEquals("28", "(integer-length 146824877)");
		UnitTest.testEvalEquals("28", "(integer-length 147084631)");
		UnitTest.testEvalEquals("28", "(integer-length 166450365)");
		UnitTest.testEvalEquals("28", "(integer-length 178753369)");
		UnitTest.testEvalEquals("28", "(integer-length 179476319)");
		UnitTest.testEvalEquals("28", "(integer-length 183598435)");
		UnitTest.testEvalEquals("28", "(integer-length 188924143)");
		UnitTest.testEvalEquals("28", "(integer-length 191565653)");
		UnitTest.testEvalEquals("28", "(integer-length 195214527)");
		UnitTest.testEvalEquals("28", "(integer-length 195934331)");
		UnitTest.testEvalEquals("28", "(integer-length 199440096)");
		UnitTest.testEvalEquals("28", "(integer-length 206099280)");
		UnitTest.testEvalEquals("28", "(integer-length 206562657)");
		UnitTest.testEvalEquals("28", "(integer-length 207208308)");
		UnitTest.testEvalEquals("28", "(integer-length 215475601)");
		UnitTest.testEvalEquals("28", "(integer-length 222632717)");
		UnitTest.testEvalEquals("28", "(integer-length 222700861)");
		UnitTest.testEvalEquals("28", "(integer-length 226685705)");
		UnitTest.testEvalEquals("28", "(integer-length 231284983)");
		UnitTest.testEvalEquals("28", "(integer-length 234381691)");
		UnitTest.testEvalEquals("28", "(integer-length 235047441)");
		UnitTest.testEvalEquals("28", "(integer-length 238476344)");
		UnitTest.testEvalEquals("28", "(integer-length 238909012)");
		UnitTest.testEvalEquals("28", "(integer-length 240350796)");
		UnitTest.testEvalEquals("28", "(integer-length 246095532)");
		UnitTest.testEvalEquals("28", "(integer-length 250759842)");
		UnitTest.testEvalEquals("29", "(integer-length 268435456)");
		UnitTest.testEvalEquals("29", "(integer-length 268753025)");
		UnitTest.testEvalEquals("29", "(integer-length 277561245)");
		UnitTest.testEvalEquals("29", "(integer-length 279802444)");
		UnitTest.testEvalEquals("29", "(integer-length 287639493)");
		UnitTest.testEvalEquals("29", "(integer-length 287714912)");
		UnitTest.testEvalEquals("29", "(integer-length 290086732)");
		UnitTest.testEvalEquals("29", "(integer-length 292798888)");
		UnitTest.testEvalEquals("29", "(integer-length 293247591)");
		UnitTest.testEvalEquals("29", "(integer-length 301089565)");
		UnitTest.testEvalEquals("29", "(integer-length 301508094)");
		UnitTest.testEvalEquals("29", "(integer-length 301567700)");
		UnitTest.testEvalEquals("29", "(integer-length 328937171)");
		UnitTest.testEvalEquals("29", "(integer-length 329871122)");
		UnitTest.testEvalEquals("29", "(integer-length 338833967)");
		UnitTest.testEvalEquals("29", "(integer-length 341530412)");
		UnitTest.testEvalEquals("29", "(integer-length 346962792)");
		UnitTest.testEvalEquals("29", "(integer-length 347396109)");
		UnitTest.testEvalEquals("29", "(integer-length 348044052)");
		UnitTest.testEvalEquals("29", "(integer-length 348533524)");
		UnitTest.testEvalEquals("29", "(integer-length 366726457)");
		UnitTest.testEvalEquals("29", "(integer-length 368161891)");
		UnitTest.testEvalEquals("29", "(integer-length 378635898)");
		UnitTest.testEvalEquals("29", "(integer-length 382889056)");
		UnitTest.testEvalEquals("29", "(integer-length 385422514)");
		UnitTest.testEvalEquals("29", "(integer-length 385455403)");
		UnitTest.testEvalEquals("29", "(integer-length 385520807)");
		UnitTest.testEvalEquals("29", "(integer-length 386935667)");
		UnitTest.testEvalEquals("29", "(integer-length 394795222)");
		UnitTest.testEvalEquals("29", "(integer-length 395073592)");
		UnitTest.testEvalEquals("30", "(integer-length 536870912)");
		UnitTest.testEvalEquals("30", "(integer-length 538686056)");
		UnitTest.testEvalEquals("30", "(integer-length 544102226)");
		UnitTest.testEvalEquals("30", "(integer-length 549101363)");
		UnitTest.testEvalEquals("30", "(integer-length 552618002)");
		UnitTest.testEvalEquals("30", "(integer-length 553233741)");
		UnitTest.testEvalEquals("30", "(integer-length 557946281)");
		UnitTest.testEvalEquals("30", "(integer-length 562514981)");
		UnitTest.testEvalEquals("30", "(integer-length 569976736)");
		UnitTest.testEvalEquals("30", "(integer-length 572483621)");
		UnitTest.testEvalEquals("30", "(integer-length 583771104)");
		UnitTest.testEvalEquals("30", "(integer-length 586090860)");
		UnitTest.testEvalEquals("30", "(integer-length 586259959)");
		UnitTest.testEvalEquals("30", "(integer-length 587083169)");
		UnitTest.testEvalEquals("30", "(integer-length 590552653)");
		UnitTest.testEvalEquals("30", "(integer-length 594760233)");
		UnitTest.testEvalEquals("30", "(integer-length 605471559)");
		UnitTest.testEvalEquals("30", "(integer-length 609242791)");
		UnitTest.testEvalEquals("30", "(integer-length 612405129)");
		UnitTest.testEvalEquals("30", "(integer-length 612455785)");
		UnitTest.testEvalEquals("30", "(integer-length 629089020)");
		UnitTest.testEvalEquals("30", "(integer-length 636480741)");
		UnitTest.testEvalEquals("30", "(integer-length 640428931)");
		UnitTest.testEvalEquals("30", "(integer-length 643862240)");
		UnitTest.testEvalEquals("30", "(integer-length 648230172)");
		UnitTest.testEvalEquals("30", "(integer-length 653104080)");
		UnitTest.testEvalEquals("30", "(integer-length 655616265)");
		UnitTest.testEvalEquals("30", "(integer-length 656613821)");
		UnitTest.testEvalEquals("30", "(integer-length 661347163)");
		UnitTest.testEvalEquals("30", "(integer-length 666481211)");
		UnitTest.testEvalEquals("30", "(integer-length 667919622)");
		UnitTest.testEvalEquals("31", "(integer-length 1073741824)");
		UnitTest.testEvalEquals("31", "(integer-length 1076025196)");
		UnitTest.testEvalEquals("31", "(integer-length 1076259139)");
		UnitTest.testEvalEquals("31", "(integer-length 1083515811)");
		UnitTest.testEvalEquals("31", "(integer-length 1084889346)");
		UnitTest.testEvalEquals("31", "(integer-length 1086586109)");
		UnitTest.testEvalEquals("31", "(integer-length 1088522448)");
		UnitTest.testEvalEquals("31", "(integer-length 1088809304)");
		UnitTest.testEvalEquals("31", "(integer-length 1088837997)");
		UnitTest.testEvalEquals("31", "(integer-length 1109579767)");
		UnitTest.testEvalEquals("31", "(integer-length 1134574848)");
		UnitTest.testEvalEquals("31", "(integer-length 1135256728)");
		UnitTest.testEvalEquals("31", "(integer-length 1136521954)");
		UnitTest.testEvalEquals("31", "(integer-length 1137328771)");
		UnitTest.testEvalEquals("31", "(integer-length 1140406962)");
		UnitTest.testEvalEquals("31", "(integer-length 1140888785)");
		UnitTest.testEvalEquals("31", "(integer-length 1146999949)");
		UnitTest.testEvalEquals("31", "(integer-length 1148655444)");
		UnitTest.testEvalEquals("31", "(integer-length 1150211689)");
		UnitTest.testEvalEquals("31", "(integer-length 1155335279)");
		UnitTest.testEvalEquals("31", "(integer-length 1157821882)");
		UnitTest.testEvalEquals("31", "(integer-length 1159864667)");
		UnitTest.testEvalEquals("31", "(integer-length 1160644336)");
		UnitTest.testEvalEquals("31", "(integer-length 1165372825)");
		UnitTest.testEvalEquals("31", "(integer-length 1168634875)");
		UnitTest.testEvalEquals("31", "(integer-length 1169259335)");
		UnitTest.testEvalEquals("31", "(integer-length 1180354105)");
		UnitTest.testEvalEquals("31", "(integer-length 1180919698)");
		UnitTest.testEvalEquals("31", "(integer-length 1186182135)");
		UnitTest.testEvalEquals("31", "(integer-length 1189373486)");
		UnitTest.testEvalEquals("31", "(integer-length 1192860880)");
		UnitTest.testEvalEquals("31", "(integer-length 1206426595)");
		UnitTest.testEvalEquals("32", "(integer-length 2147483648)");
		UnitTest.testEvalEquals("32", "(integer-length 2150070447)");
		UnitTest.testEvalEquals("32", "(integer-length 2157308824)");
		UnitTest.testEvalEquals("32", "(integer-length 2159462793)");
		UnitTest.testEvalEquals("32", "(integer-length 2161549502)");
		UnitTest.testEvalEquals("32", "(integer-length 2165921606)");
		UnitTest.testEvalEquals("32", "(integer-length 2170600316)");
		UnitTest.testEvalEquals("32", "(integer-length 2170781866)");
		UnitTest.testEvalEquals("32", "(integer-length 2175365822)");
		UnitTest.testEvalEquals("32", "(integer-length 2176348082)");
		UnitTest.testEvalEquals("32", "(integer-length 2193672864)");
		UnitTest.testEvalEquals("32", "(integer-length 2194394091)");
		UnitTest.testEvalEquals("32", "(integer-length 2194988780)");
		UnitTest.testEvalEquals("32", "(integer-length 2198379723)");
		UnitTest.testEvalEquals("32", "(integer-length 2205600293)");
		UnitTest.testEvalEquals("32", "(integer-length 2206505724)");
		UnitTest.testEvalEquals("32", "(integer-length 2221210733)");
		UnitTest.testEvalEquals("32", "(integer-length 2223044031)");
		UnitTest.testEvalEquals("32", "(integer-length 2231132471)");
		UnitTest.testEvalEquals("32", "(integer-length 2231737417)");
		UnitTest.testEvalEquals("32", "(integer-length 2235744799)");
		UnitTest.testEvalEquals("32", "(integer-length 2237283055)");
		UnitTest.testEvalEquals("32", "(integer-length 2239548245)");
		UnitTest.testEvalEquals("32", "(integer-length 2242973086)");
		UnitTest.testEvalEquals("32", "(integer-length 2247684147)");
		UnitTest.testEvalEquals("32", "(integer-length 2252980602)");
		UnitTest.testEvalEquals("32", "(integer-length 2253400333)");
		UnitTest.testEvalEquals("32", "(integer-length 2255161820)");
		UnitTest.testEvalEquals("32", "(integer-length 2257198971)");
		UnitTest.testEvalEquals("32", "(integer-length 2264078832)");
		UnitTest.testEvalEquals("32", "(integer-length 2267393832)");
		UnitTest.testEvalEquals("32", "(integer-length 2273958829)");
		UnitTest.testEvalEquals("32", "(integer-length 2278666602)");
		UnitTest.testEvalEquals("33", "(integer-length 4294967296)");
		UnitTest.testEvalEquals("33", "(integer-length 4301469742)");
		UnitTest.testEvalEquals("33", "(integer-length 4307150854)");
		UnitTest.testEvalEquals("33", "(integer-length 4310602671)");
		UnitTest.testEvalEquals("33", "(integer-length 4310784935)");
		UnitTest.testEvalEquals("33", "(integer-length 4317226204)");
		UnitTest.testEvalEquals("33", "(integer-length 4317638686)");
		UnitTest.testEvalEquals("33", "(integer-length 4325973655)");
		UnitTest.testEvalEquals("33", "(integer-length 4332359569)");
		UnitTest.testEvalEquals("33", "(integer-length 4336197598)");
		UnitTest.testEvalEquals("33", "(integer-length 4354491078)");
		UnitTest.testEvalEquals("33", "(integer-length 4356130933)");
		UnitTest.testEvalEquals("33", "(integer-length 4358070209)");
		UnitTest.testEvalEquals("33", "(integer-length 4365324508)");
		UnitTest.testEvalEquals("33", "(integer-length 4374147973)");
		UnitTest.testEvalEquals("33", "(integer-length 4383413185)");
		UnitTest.testEvalEquals("33", "(integer-length 4391693017)");
		UnitTest.testEvalEquals("33", "(integer-length 4391725688)");
		UnitTest.testEvalEquals("33", "(integer-length 4392169161)");
		UnitTest.testEvalEquals("33", "(integer-length 4394361027)");
		UnitTest.testEvalEquals("33", "(integer-length 4395378561)");
		UnitTest.testEvalEquals("33", "(integer-length 4397439503)");
		UnitTest.testEvalEquals("33", "(integer-length 4397817673)");
		UnitTest.testEvalEquals("33", "(integer-length 4401434404)");
		UnitTest.testEvalEquals("33", "(integer-length 4404200845)");
		UnitTest.testEvalEquals("33", "(integer-length 4404406591)");
		UnitTest.testEvalEquals("33", "(integer-length 4405856450)");
		UnitTest.testEvalEquals("33", "(integer-length 4406923082)");
		UnitTest.testEvalEquals("33", "(integer-length 4407052642)");
		UnitTest.testEvalEquals("33", "(integer-length 4408312212)");
		UnitTest.testEvalEquals("33", "(integer-length 4414018973)");
		UnitTest.testEvalEquals("33", "(integer-length 4414297428)");
		UnitTest.testEvalEquals("33", "(integer-length 4424711094)");
		UnitTest.testEvalEquals("33", "(integer-length 4425108330)");
		UnitTest.testEvalEquals("34", "(integer-length 8589934592)");
		UnitTest.testEvalEquals("34", "(integer-length 8593384482)");
		UnitTest.testEvalEquals("34", "(integer-length 8595502259)");
		UnitTest.testEvalEquals("34", "(integer-length 8599044473)");
		UnitTest.testEvalEquals("34", "(integer-length 8602561891)");
		UnitTest.testEvalEquals("34", "(integer-length 8603328422)");
		UnitTest.testEvalEquals("34", "(integer-length 8610528091)");
		UnitTest.testEvalEquals("34", "(integer-length 8614776756)");
		UnitTest.testEvalEquals("34", "(integer-length 8618106247)");
		UnitTest.testEvalEquals("34", "(integer-length 8620047294)");
		UnitTest.testEvalEquals("34", "(integer-length 8622284607)");
		UnitTest.testEvalEquals("34", "(integer-length 8631950691)");
		UnitTest.testEvalEquals("34", "(integer-length 8636236149)");
		UnitTest.testEvalEquals("34", "(integer-length 8637014602)");
		UnitTest.testEvalEquals("34", "(integer-length 8647092781)");
		UnitTest.testEvalEquals("34", "(integer-length 8648821115)");
		UnitTest.testEvalEquals("34", "(integer-length 8648953451)");
		UnitTest.testEvalEquals("34", "(integer-length 8654936497)");
		UnitTest.testEvalEquals("34", "(integer-length 8657040893)");
		UnitTest.testEvalEquals("34", "(integer-length 8657439365)");
		UnitTest.testEvalEquals("34", "(integer-length 8659649107)");
		UnitTest.testEvalEquals("34", "(integer-length 8662150559)");
		UnitTest.testEvalEquals("34", "(integer-length 8666491914)");
		UnitTest.testEvalEquals("34", "(integer-length 8668470577)");
		UnitTest.testEvalEquals("34", "(integer-length 8680925030)");
		UnitTest.testEvalEquals("34", "(integer-length 8683290721)");
		UnitTest.testEvalEquals("34", "(integer-length 8694502363)");
		UnitTest.testEvalEquals("34", "(integer-length 8696923612)");
		UnitTest.testEvalEquals("34", "(integer-length 8701179359)");
		UnitTest.testEvalEquals("34", "(integer-length 8703548634)");
		UnitTest.testEvalEquals("34", "(integer-length 8709103211)");
		UnitTest.testEvalEquals("34", "(integer-length 8709232299)");
		UnitTest.testEvalEquals("34", "(integer-length 8714315313)");
		UnitTest.testEvalEquals("34", "(integer-length 8718825275)");
		UnitTest.testEvalEquals("34", "(integer-length 8721355176)");
		UnitTest.testEvalEquals("35", "(integer-length 17179869184)");
		UnitTest.testEvalEquals("35", "(integer-length 17180065829)");
		UnitTest.testEvalEquals("35", "(integer-length 17180336204)");
		UnitTest.testEvalEquals("35", "(integer-length 17186195924)");
		UnitTest.testEvalEquals("35", "(integer-length 17193203589)");
		UnitTest.testEvalEquals("35", "(integer-length 17196829560)");
		UnitTest.testEvalEquals("35", "(integer-length 17200138324)");
		UnitTest.testEvalEquals("35", "(integer-length 17200163014)");
		UnitTest.testEvalEquals("35", "(integer-length 17202085606)");
		UnitTest.testEvalEquals("35", "(integer-length 17203929455)");
		UnitTest.testEvalEquals("35", "(integer-length 17205568379)");
		UnitTest.testEvalEquals("35", "(integer-length 17207216892)");
		UnitTest.testEvalEquals("35", "(integer-length 17207366810)");
		UnitTest.testEvalEquals("35", "(integer-length 17208403008)");
		UnitTest.testEvalEquals("35", "(integer-length 17215734937)");
		UnitTest.testEvalEquals("35", "(integer-length 17216370153)");
		UnitTest.testEvalEquals("35", "(integer-length 17223494904)");
		UnitTest.testEvalEquals("35", "(integer-length 17231533452)");
		UnitTest.testEvalEquals("35", "(integer-length 17234398192)");
		UnitTest.testEvalEquals("35", "(integer-length 17237297962)");
		UnitTest.testEvalEquals("35", "(integer-length 17238221854)");
		UnitTest.testEvalEquals("35", "(integer-length 17244562739)");
		UnitTest.testEvalEquals("35", "(integer-length 17245718804)");
		UnitTest.testEvalEquals("35", "(integer-length 17246294004)");
		UnitTest.testEvalEquals("35", "(integer-length 17250258231)");
		UnitTest.testEvalEquals("35", "(integer-length 17256986695)");
		UnitTest.testEvalEquals("35", "(integer-length 17268446285)");
		UnitTest.testEvalEquals("35", "(integer-length 17279614268)");
		UnitTest.testEvalEquals("35", "(integer-length 17282321488)");
		UnitTest.testEvalEquals("35", "(integer-length 17292724255)");
		UnitTest.testEvalEquals("35", "(integer-length 17295641441)");
		UnitTest.testEvalEquals("35", "(integer-length 17297684816)");
		UnitTest.testEvalEquals("35", "(integer-length 17299441678)");
		UnitTest.testEvalEquals("35", "(integer-length 17299826158)");
		UnitTest.testEvalEquals("35", "(integer-length 17300804442)");
		UnitTest.testEvalEquals("35", "(integer-length 17307172944)");
		UnitTest.testEvalEquals("36", "(integer-length 34359738368)");
		UnitTest.testEvalEquals("36", "(integer-length 34361543378)");
		UnitTest.testEvalEquals("36", "(integer-length 34364820608)");
		UnitTest.testEvalEquals("36", "(integer-length 34367389767)");
		UnitTest.testEvalEquals("36", "(integer-length 34367528373)");
		UnitTest.testEvalEquals("36", "(integer-length 34377072970)");
		UnitTest.testEvalEquals("36", "(integer-length 34377533401)");
		UnitTest.testEvalEquals("36", "(integer-length 34386620880)");
		UnitTest.testEvalEquals("36", "(integer-length 34391805403)");
		UnitTest.testEvalEquals("36", "(integer-length 34391816099)");
		UnitTest.testEvalEquals("36", "(integer-length 34395495836)");
		UnitTest.testEvalEquals("36", "(integer-length 34396992624)");
		UnitTest.testEvalEquals("36", "(integer-length 34399296895)");
		UnitTest.testEvalEquals("36", "(integer-length 34405094339)");
		UnitTest.testEvalEquals("36", "(integer-length 34413437981)");
		UnitTest.testEvalEquals("36", "(integer-length 34414011013)");
		UnitTest.testEvalEquals("36", "(integer-length 34415157797)");
		UnitTest.testEvalEquals("36", "(integer-length 34419070683)");
		UnitTest.testEvalEquals("36", "(integer-length 34420886780)");
		UnitTest.testEvalEquals("36", "(integer-length 34426996342)");
		UnitTest.testEvalEquals("36", "(integer-length 34441313028)");
		UnitTest.testEvalEquals("36", "(integer-length 34441478623)");
		UnitTest.testEvalEquals("36", "(integer-length 34441607269)");
		UnitTest.testEvalEquals("36", "(integer-length 34444712858)");
		UnitTest.testEvalEquals("36", "(integer-length 34445489892)");
		UnitTest.testEvalEquals("36", "(integer-length 34449404171)");
		UnitTest.testEvalEquals("36", "(integer-length 34451715795)");
		UnitTest.testEvalEquals("36", "(integer-length 34456712032)");
		UnitTest.testEvalEquals("36", "(integer-length 34462128533)");
		UnitTest.testEvalEquals("36", "(integer-length 34465118570)");
		UnitTest.testEvalEquals("36", "(integer-length 34465862993)");
		UnitTest.testEvalEquals("36", "(integer-length 34467878184)");
		UnitTest.testEvalEquals("36", "(integer-length 34478518344)");
		UnitTest.testEvalEquals("36", "(integer-length 34481587563)");
		UnitTest.testEvalEquals("36", "(integer-length 34485011025)");
		UnitTest.testEvalEquals("36", "(integer-length 34485373365)");
		UnitTest.testEvalEquals("36", "(integer-length 34489581786)");
		UnitTest.testEvalEquals("37", "(integer-length 68719476736)");
		UnitTest.testEvalEquals("37", "(integer-length 68724762479)");
		UnitTest.testEvalEquals("37", "(integer-length 68727645632)");
		UnitTest.testEvalEquals("37", "(integer-length 68727854937)");
		UnitTest.testEvalEquals("37", "(integer-length 68729520251)");
		UnitTest.testEvalEquals("37", "(integer-length 68730074103)");
		UnitTest.testEvalEquals("37", "(integer-length 68740473718)");
		UnitTest.testEvalEquals("37", "(integer-length 68742477796)");
		UnitTest.testEvalEquals("37", "(integer-length 68743222711)");
		UnitTest.testEvalEquals("37", "(integer-length 68743545281)");
		UnitTest.testEvalEquals("37", "(integer-length 68744353211)");
		UnitTest.testEvalEquals("37", "(integer-length 68749793235)");
		UnitTest.testEvalEquals("37", "(integer-length 68751951843)");
		UnitTest.testEvalEquals("37", "(integer-length 68756646316)");
		UnitTest.testEvalEquals("37", "(integer-length 68757578672)");
		UnitTest.testEvalEquals("37", "(integer-length 68758902388)");
		UnitTest.testEvalEquals("37", "(integer-length 68762402845)");
		UnitTest.testEvalEquals("37", "(integer-length 68765884684)");
		UnitTest.testEvalEquals("37", "(integer-length 68766154477)");
		UnitTest.testEvalEquals("37", "(integer-length 68772476359)");
		UnitTest.testEvalEquals("37", "(integer-length 68773835064)");
		UnitTest.testEvalEquals("37", "(integer-length 68775325456)");
		UnitTest.testEvalEquals("37", "(integer-length 68782774008)");
		UnitTest.testEvalEquals("37", "(integer-length 68788379372)");
		UnitTest.testEvalEquals("37", "(integer-length 68794876799)");
		UnitTest.testEvalEquals("37", "(integer-length 68796245058)");
		UnitTest.testEvalEquals("37", "(integer-length 68802379666)");
		UnitTest.testEvalEquals("37", "(integer-length 68803588722)");
		UnitTest.testEvalEquals("37", "(integer-length 68810726720)");
		UnitTest.testEvalEquals("37", "(integer-length 68822832774)");
		UnitTest.testEvalEquals("37", "(integer-length 68830630525)");
		UnitTest.testEvalEquals("37", "(integer-length 68832043772)");
		UnitTest.testEvalEquals("37", "(integer-length 68832405372)");
		UnitTest.testEvalEquals("37", "(integer-length 68832935639)");
		UnitTest.testEvalEquals("37", "(integer-length 68836307894)");
		UnitTest.testEvalEquals("37", "(integer-length 68837755208)");
		UnitTest.testEvalEquals("37", "(integer-length 68840417254)");
		UnitTest.testEvalEquals("37", "(integer-length 68850760265)");
		UnitTest.testEvalEquals("38", "(integer-length 137438953472)");
		UnitTest.testEvalEquals("38", "(integer-length 137440185623)");
		UnitTest.testEvalEquals("38", "(integer-length 137445891111)");
		UnitTest.testEvalEquals("38", "(integer-length 137447126897)");
		UnitTest.testEvalEquals("38", "(integer-length 137447484143)");
		UnitTest.testEvalEquals("38", "(integer-length 137460049847)");
		UnitTest.testEvalEquals("38", "(integer-length 137460766652)");
		UnitTest.testEvalEquals("38", "(integer-length 137461829664)");
		UnitTest.testEvalEquals("38", "(integer-length 137463512312)");
		UnitTest.testEvalEquals("38", "(integer-length 137464147314)");
		UnitTest.testEvalEquals("38", "(integer-length 137464694072)");
		UnitTest.testEvalEquals("38", "(integer-length 137472293065)");
		UnitTest.testEvalEquals("38", "(integer-length 137472515569)");
		UnitTest.testEvalEquals("38", "(integer-length 137476008342)");
		UnitTest.testEvalEquals("38", "(integer-length 137478031435)");
		UnitTest.testEvalEquals("38", "(integer-length 137480149548)");
		UnitTest.testEvalEquals("38", "(integer-length 137492004395)");
		UnitTest.testEvalEquals("38", "(integer-length 137494223348)");
		UnitTest.testEvalEquals("38", "(integer-length 137504116632)");
		UnitTest.testEvalEquals("38", "(integer-length 137515097964)");
		UnitTest.testEvalEquals("38", "(integer-length 137515100127)");
		UnitTest.testEvalEquals("38", "(integer-length 137515767566)");
		UnitTest.testEvalEquals("38", "(integer-length 137520846713)");
		UnitTest.testEvalEquals("38", "(integer-length 137521416632)");
		UnitTest.testEvalEquals("38", "(integer-length 137523663866)");
		UnitTest.testEvalEquals("38", "(integer-length 137525673941)");
		UnitTest.testEvalEquals("38", "(integer-length 137526196948)");
		UnitTest.testEvalEquals("38", "(integer-length 137527054234)");
		UnitTest.testEvalEquals("38", "(integer-length 137529014309)");
		UnitTest.testEvalEquals("38", "(integer-length 137531449141)");
		UnitTest.testEvalEquals("38", "(integer-length 137532432809)");
		UnitTest.testEvalEquals("38", "(integer-length 137534079867)");
		UnitTest.testEvalEquals("38", "(integer-length 137540874994)");
		UnitTest.testEvalEquals("38", "(integer-length 137546470360)");
		UnitTest.testEvalEquals("38", "(integer-length 137547659691)");
		UnitTest.testEvalEquals("38", "(integer-length 137547690650)");
		UnitTest.testEvalEquals("38", "(integer-length 137556562369)");
		UnitTest.testEvalEquals("38", "(integer-length 137564881774)");
		UnitTest.testEvalEquals("38", "(integer-length 137567931235)");
		UnitTest.testEvalEquals("39", "(integer-length 274877906944)");
		UnitTest.testEvalEquals("39", "(integer-length 274882299443)");
		UnitTest.testEvalEquals("39", "(integer-length 274884324464)");
		UnitTest.testEvalEquals("39", "(integer-length 274884388081)");
		UnitTest.testEvalEquals("39", "(integer-length 274891449484)");
		UnitTest.testEvalEquals("39", "(integer-length 274892057988)");
		UnitTest.testEvalEquals("39", "(integer-length 274894458664)");
		UnitTest.testEvalEquals("39", "(integer-length 274895293805)");
		UnitTest.testEvalEquals("39", "(integer-length 274895877251)");
		UnitTest.testEvalEquals("39", "(integer-length 274896664812)");
		UnitTest.testEvalEquals("39", "(integer-length 274898220756)");
		UnitTest.testEvalEquals("39", "(integer-length 274905739833)");
		UnitTest.testEvalEquals("39", "(integer-length 274905870290)");
		UnitTest.testEvalEquals("39", "(integer-length 274908307177)");
		UnitTest.testEvalEquals("39", "(integer-length 274910835487)");
		UnitTest.testEvalEquals("39", "(integer-length 274912062853)");
		UnitTest.testEvalEquals("39", "(integer-length 274917967785)");
		UnitTest.testEvalEquals("39", "(integer-length 274921802517)");
		UnitTest.testEvalEquals("39", "(integer-length 274925343455)");
		UnitTest.testEvalEquals("39", "(integer-length 274926085830)");
		UnitTest.testEvalEquals("39", "(integer-length 274928186589)");
		UnitTest.testEvalEquals("39", "(integer-length 274929163623)");
		UnitTest.testEvalEquals("39", "(integer-length 274933752787)");
		UnitTest.testEvalEquals("39", "(integer-length 274940088780)");
		UnitTest.testEvalEquals("39", "(integer-length 274941247158)");
		UnitTest.testEvalEquals("39", "(integer-length 274944508473)");
		UnitTest.testEvalEquals("39", "(integer-length 274945108207)");
		UnitTest.testEvalEquals("39", "(integer-length 274949258490)");
		UnitTest.testEvalEquals("39", "(integer-length 274952189549)");
		UnitTest.testEvalEquals("39", "(integer-length 274952255991)");
		UnitTest.testEvalEquals("39", "(integer-length 274965379384)");
		UnitTest.testEvalEquals("39", "(integer-length 274967656521)");
		UnitTest.testEvalEquals("39", "(integer-length 274967769171)");
		UnitTest.testEvalEquals("39", "(integer-length 274974525497)");
		UnitTest.testEvalEquals("39", "(integer-length 274978214005)");
		UnitTest.testEvalEquals("39", "(integer-length 274985558920)");
		UnitTest.testEvalEquals("39", "(integer-length 274991644616)");
		UnitTest.testEvalEquals("39", "(integer-length 274992885629)");
		UnitTest.testEvalEquals("39", "(integer-length 275009406895)");
		UnitTest.testEvalEquals("39", "(integer-length 275010505515)");
		UnitTest.testEvalEquals("40", "(integer-length 549755813888)");
		UnitTest.testEvalEquals("40", "(integer-length 549764362889)");
		UnitTest.testEvalEquals("40", "(integer-length 549764879805)");
		UnitTest.testEvalEquals("40", "(integer-length 549768767961)");
		UnitTest.testEvalEquals("40", "(integer-length 549772076398)");
		UnitTest.testEvalEquals("40", "(integer-length 549772965179)");
		UnitTest.testEvalEquals("40", "(integer-length 549773314195)");
		UnitTest.testEvalEquals("40", "(integer-length 549773800342)");
		UnitTest.testEvalEquals("40", "(integer-length 549774229431)");
		UnitTest.testEvalEquals("40", "(integer-length 549776780429)");
		UnitTest.testEvalEquals("40", "(integer-length 549778027980)");
		UnitTest.testEvalEquals("40", "(integer-length 549780204405)");
		UnitTest.testEvalEquals("40", "(integer-length 549783195736)");
		UnitTest.testEvalEquals("40", "(integer-length 549784520125)");
		UnitTest.testEvalEquals("40", "(integer-length 549786468629)");
		UnitTest.testEvalEquals("40", "(integer-length 549787243794)");
		UnitTest.testEvalEquals("40", "(integer-length 549787547212)");
		UnitTest.testEvalEquals("40", "(integer-length 549794269960)");
		UnitTest.testEvalEquals("40", "(integer-length 549794821523)");
		UnitTest.testEvalEquals("40", "(integer-length 549798574468)");
		UnitTest.testEvalEquals("40", "(integer-length 549803090511)");
		UnitTest.testEvalEquals("40", "(integer-length 549810083171)");
		UnitTest.testEvalEquals("40", "(integer-length 549818122345)");
		UnitTest.testEvalEquals("40", "(integer-length 549818128759)");
		UnitTest.testEvalEquals("40", "(integer-length 549820006939)");
		UnitTest.testEvalEquals("40", "(integer-length 549821345446)");
		UnitTest.testEvalEquals("40", "(integer-length 549821377028)");
		UnitTest.testEvalEquals("40", "(integer-length 549825891534)");
		UnitTest.testEvalEquals("40", "(integer-length 549829632781)");
		UnitTest.testEvalEquals("40", "(integer-length 549838344849)");
		UnitTest.testEvalEquals("40", "(integer-length 549842055907)");
		UnitTest.testEvalEquals("40", "(integer-length 549843069065)");
		UnitTest.testEvalEquals("40", "(integer-length 549843378031)");
		UnitTest.testEvalEquals("40", "(integer-length 549844925304)");
		UnitTest.testEvalEquals("40", "(integer-length 549849304067)");
		UnitTest.testEvalEquals("40", "(integer-length 549855453414)");
		UnitTest.testEvalEquals("40", "(integer-length 549858208022)");
		UnitTest.testEvalEquals("40", "(integer-length 549872116284)");
		UnitTest.testEvalEquals("40", "(integer-length 549875944978)");
		UnitTest.testEvalEquals("40", "(integer-length 549884280482)");
		UnitTest.testEvalEquals("40", "(integer-length 549885137478)");
		UnitTest.testEvalEquals("41", "(integer-length 1099511627776)");
		UnitTest.testEvalEquals("41", "(integer-length 1099514040260)");
		UnitTest.testEvalEquals("41", "(integer-length 1099514866900)");
		UnitTest.testEvalEquals("41", "(integer-length 1099516238983)");
		UnitTest.testEvalEquals("41", "(integer-length 1099519270902)");
		UnitTest.testEvalEquals("41", "(integer-length 1099521296967)");
		UnitTest.testEvalEquals("41", "(integer-length 1099521818516)");
		UnitTest.testEvalEquals("41", "(integer-length 1099522908332)");
		UnitTest.testEvalEquals("41", "(integer-length 1099529264205)");
		UnitTest.testEvalEquals("41", "(integer-length 1099530178983)");
		UnitTest.testEvalEquals("41", "(integer-length 1099531791924)");
		UnitTest.testEvalEquals("41", "(integer-length 1099533699245)");
		UnitTest.testEvalEquals("41", "(integer-length 1099539057703)");
		UnitTest.testEvalEquals("41", "(integer-length 1099541710935)");
		UnitTest.testEvalEquals("41", "(integer-length 1099544508653)");
		UnitTest.testEvalEquals("41", "(integer-length 1099546036907)");
		UnitTest.testEvalEquals("41", "(integer-length 1099555169281)");
		UnitTest.testEvalEquals("41", "(integer-length 1099555827368)");
		UnitTest.testEvalEquals("41", "(integer-length 1099557943238)");
		UnitTest.testEvalEquals("41", "(integer-length 1099565633748)");
		UnitTest.testEvalEquals("41", "(integer-length 1099567229478)");
		UnitTest.testEvalEquals("41", "(integer-length 1099569818173)");
		UnitTest.testEvalEquals("41", "(integer-length 1099570647411)");
		UnitTest.testEvalEquals("41", "(integer-length 1099572044018)");
		UnitTest.testEvalEquals("41", "(integer-length 1099572823705)");
		UnitTest.testEvalEquals("41", "(integer-length 1099573652989)");
		UnitTest.testEvalEquals("41", "(integer-length 1099579698475)");
		UnitTest.testEvalEquals("41", "(integer-length 1099580339596)");
		UnitTest.testEvalEquals("41", "(integer-length 1099581362535)");
		UnitTest.testEvalEquals("41", "(integer-length 1099586323628)");
		UnitTest.testEvalEquals("41", "(integer-length 1099590633832)");
		UnitTest.testEvalEquals("41", "(integer-length 1099591575931)");
		UnitTest.testEvalEquals("41", "(integer-length 1099592348508)");
		UnitTest.testEvalEquals("41", "(integer-length 1099600002899)");
		UnitTest.testEvalEquals("41", "(integer-length 1099601915971)");
		UnitTest.testEvalEquals("41", "(integer-length 1099603781567)");
		UnitTest.testEvalEquals("41", "(integer-length 1099607453722)");
		UnitTest.testEvalEquals("41", "(integer-length 1099611581850)");
		UnitTest.testEvalEquals("41", "(integer-length 1099617537304)");
		UnitTest.testEvalEquals("41", "(integer-length 1099630034367)");
		UnitTest.testEvalEquals("41", "(integer-length 1099642188287)");
		UnitTest.testEvalEquals("41", "(integer-length 1099644480826)");
		UnitTest.testEvalEquals("42", "(integer-length 2199023255552)");
		UnitTest.testEvalEquals("42", "(integer-length 2199043305480)");
		UnitTest.testEvalEquals("42", "(integer-length 2199046257835)");
		UnitTest.testEvalEquals("42", "(integer-length 2199046442814)");
		UnitTest.testEvalEquals("42", "(integer-length 2199048853702)");
		UnitTest.testEvalEquals("42", "(integer-length 2199050404133)");
		UnitTest.testEvalEquals("42", "(integer-length 2199050423282)");
		UnitTest.testEvalEquals("42", "(integer-length 2199051728657)");
		UnitTest.testEvalEquals("42", "(integer-length 2199057582904)");
		UnitTest.testEvalEquals("42", "(integer-length 2199057752416)");
		UnitTest.testEvalEquals("42", "(integer-length 2199057872521)");
		UnitTest.testEvalEquals("42", "(integer-length 2199059839518)");
		UnitTest.testEvalEquals("42", "(integer-length 2199060435227)");
		UnitTest.testEvalEquals("42", "(integer-length 2199061976253)");
		UnitTest.testEvalEquals("42", "(integer-length 2199065609122)");
		UnitTest.testEvalEquals("42", "(integer-length 2199070732072)");
		UnitTest.testEvalEquals("42", "(integer-length 2199078607479)");
		UnitTest.testEvalEquals("42", "(integer-length 2199080076185)");
		UnitTest.testEvalEquals("42", "(integer-length 2199080548290)");
		UnitTest.testEvalEquals("42", "(integer-length 2199082743314)");
		UnitTest.testEvalEquals("42", "(integer-length 2199087346643)");
		UnitTest.testEvalEquals("42", "(integer-length 2199095497149)");
		UnitTest.testEvalEquals("42", "(integer-length 2199096051661)");
		UnitTest.testEvalEquals("42", "(integer-length 2199097839093)");
		UnitTest.testEvalEquals("42", "(integer-length 2199101190152)");
		UnitTest.testEvalEquals("42", "(integer-length 2199103221624)");
		UnitTest.testEvalEquals("42", "(integer-length 2199109936885)");
		UnitTest.testEvalEquals("42", "(integer-length 2199112061366)");
		UnitTest.testEvalEquals("42", "(integer-length 2199113571403)");
		UnitTest.testEvalEquals("42", "(integer-length 2199115612455)");
		UnitTest.testEvalEquals("42", "(integer-length 2199115642915)");
		UnitTest.testEvalEquals("42", "(integer-length 2199117733101)");
		UnitTest.testEvalEquals("42", "(integer-length 2199128172828)");
		UnitTest.testEvalEquals("42", "(integer-length 2199129956832)");
		UnitTest.testEvalEquals("42", "(integer-length 2199134112657)");
		UnitTest.testEvalEquals("42", "(integer-length 2199138327043)");
		UnitTest.testEvalEquals("42", "(integer-length 2199141201063)");
		UnitTest.testEvalEquals("42", "(integer-length 2199146161219)");
		UnitTest.testEvalEquals("42", "(integer-length 2199146912623)");
		UnitTest.testEvalEquals("42", "(integer-length 2199148996373)");
		UnitTest.testEvalEquals("42", "(integer-length 2199149865515)");
		UnitTest.testEvalEquals("42", "(integer-length 2199151008648)");
		UnitTest.testEvalEquals("42", "(integer-length 2199155483804)");
		UnitTest.testEvalEquals("43", "(integer-length 4398046511104)");
		UnitTest.testEvalEquals("43", "(integer-length 4398046610921)");
		UnitTest.testEvalEquals("43", "(integer-length 4398047857319)");
		UnitTest.testEvalEquals("43", "(integer-length 4398050887164)");
		UnitTest.testEvalEquals("43", "(integer-length 4398053206913)");
		UnitTest.testEvalEquals("43", "(integer-length 4398056956211)");
		UnitTest.testEvalEquals("43", "(integer-length 4398060353163)");
		UnitTest.testEvalEquals("43", "(integer-length 4398061994615)");
		UnitTest.testEvalEquals("43", "(integer-length 4398066982260)");
		UnitTest.testEvalEquals("43", "(integer-length 4398082034742)");
		UnitTest.testEvalEquals("43", "(integer-length 4398084279379)");
		UnitTest.testEvalEquals("43", "(integer-length 4398092386613)");
		UnitTest.testEvalEquals("43", "(integer-length 4398095861002)");
		UnitTest.testEvalEquals("43", "(integer-length 4398097512268)");
		UnitTest.testEvalEquals("43", "(integer-length 4398099078536)");
		UnitTest.testEvalEquals("43", "(integer-length 4398105499808)");
		UnitTest.testEvalEquals("43", "(integer-length 4398108581949)");
		UnitTest.testEvalEquals("43", "(integer-length 4398112493801)");
		UnitTest.testEvalEquals("43", "(integer-length 4398116037329)");
		UnitTest.testEvalEquals("43", "(integer-length 4398117510232)");
		UnitTest.testEvalEquals("43", "(integer-length 4398123562763)");
		UnitTest.testEvalEquals("43", "(integer-length 4398127378944)");
		UnitTest.testEvalEquals("43", "(integer-length 4398128708894)");
		UnitTest.testEvalEquals("43", "(integer-length 4398131015874)");
		UnitTest.testEvalEquals("43", "(integer-length 4398132915060)");
		UnitTest.testEvalEquals("43", "(integer-length 4398133257802)");
		UnitTest.testEvalEquals("43", "(integer-length 4398133444558)");
		UnitTest.testEvalEquals("43", "(integer-length 4398134625990)");
		UnitTest.testEvalEquals("43", "(integer-length 4398138623470)");
		UnitTest.testEvalEquals("43", "(integer-length 4398140778053)");
		UnitTest.testEvalEquals("43", "(integer-length 4398144580287)");
		UnitTest.testEvalEquals("43", "(integer-length 4398145338242)");
		UnitTest.testEvalEquals("43", "(integer-length 4398145833819)");
		UnitTest.testEvalEquals("43", "(integer-length 4398147678044)");
		UnitTest.testEvalEquals("43", "(integer-length 4398151751996)");
		UnitTest.testEvalEquals("43", "(integer-length 4398154115200)");
		UnitTest.testEvalEquals("43", "(integer-length 4398157854520)");
		UnitTest.testEvalEquals("43", "(integer-length 4398159648650)");
		UnitTest.testEvalEquals("43", "(integer-length 4398162317315)");
		UnitTest.testEvalEquals("43", "(integer-length 4398163644166)");
		UnitTest.testEvalEquals("43", "(integer-length 4398169554065)");
		UnitTest.testEvalEquals("43", "(integer-length 4398170140139)");
		UnitTest.testEvalEquals("43", "(integer-length 4398177985553)");
		UnitTest.testEvalEquals("43", "(integer-length 4398180001325)");
		UnitTest.testEvalEquals("44", "(integer-length 8796093022208)");
		UnitTest.testEvalEquals("44", "(integer-length 8796094530154)");
		UnitTest.testEvalEquals("44", "(integer-length 8796097902206)");
		UnitTest.testEvalEquals("44", "(integer-length 8796098091553)");
		UnitTest.testEvalEquals("44", "(integer-length 8796099332018)");
		UnitTest.testEvalEquals("44", "(integer-length 8796100108060)");
		UnitTest.testEvalEquals("44", "(integer-length 8796102146299)");
		UnitTest.testEvalEquals("44", "(integer-length 8796103885305)");
		UnitTest.testEvalEquals("44", "(integer-length 8796105560285)");
		UnitTest.testEvalEquals("44", "(integer-length 8796106386038)");
		UnitTest.testEvalEquals("44", "(integer-length 8796106706533)");
		UnitTest.testEvalEquals("44", "(integer-length 8796108557294)");
		UnitTest.testEvalEquals("44", "(integer-length 8796113720931)");
		UnitTest.testEvalEquals("44", "(integer-length 8796118267782)");
		UnitTest.testEvalEquals("44", "(integer-length 8796123271222)");
		UnitTest.testEvalEquals("44", "(integer-length 8796124876790)");
		UnitTest.testEvalEquals("44", "(integer-length 8796125572200)");
		UnitTest.testEvalEquals("44", "(integer-length 8796133332837)");
		UnitTest.testEvalEquals("44", "(integer-length 8796135424297)");
		UnitTest.testEvalEquals("44", "(integer-length 8796139804395)");
		UnitTest.testEvalEquals("44", "(integer-length 8796141382010)");
		UnitTest.testEvalEquals("44", "(integer-length 8796148348290)");
		UnitTest.testEvalEquals("44", "(integer-length 8796152707834)");
		UnitTest.testEvalEquals("44", "(integer-length 8796158674879)");
		UnitTest.testEvalEquals("44", "(integer-length 8796159729529)");
		UnitTest.testEvalEquals("44", "(integer-length 8796169159250)");
		UnitTest.testEvalEquals("44", "(integer-length 8796169794882)");
		UnitTest.testEvalEquals("44", "(integer-length 8796170239557)");
		UnitTest.testEvalEquals("44", "(integer-length 8796180851868)");
		UnitTest.testEvalEquals("44", "(integer-length 8796186710041)");
		UnitTest.testEvalEquals("44", "(integer-length 8796190889062)");
		UnitTest.testEvalEquals("44", "(integer-length 8796195080413)");
		UnitTest.testEvalEquals("44", "(integer-length 8796197099376)");
		UnitTest.testEvalEquals("44", "(integer-length 8796198401578)");
		UnitTest.testEvalEquals("44", "(integer-length 8796200841299)");
		UnitTest.testEvalEquals("44", "(integer-length 8796204284839)");
		UnitTest.testEvalEquals("44", "(integer-length 8796205430462)");
		UnitTest.testEvalEquals("44", "(integer-length 8796205808019)");
		UnitTest.testEvalEquals("44", "(integer-length 8796206021482)");
		UnitTest.testEvalEquals("44", "(integer-length 8796209172108)");
		UnitTest.testEvalEquals("44", "(integer-length 8796211256206)");
		UnitTest.testEvalEquals("44", "(integer-length 8796216796185)");
		UnitTest.testEvalEquals("44", "(integer-length 8796217967595)");
		UnitTest.testEvalEquals("44", "(integer-length 8796219979368)");
		UnitTest.testEvalEquals("44", "(integer-length 8796227118707)");
		UnitTest.testEvalEquals("45", "(integer-length 17592186044416)");
		UnitTest.testEvalEquals("45", "(integer-length 17592193446653)");
		UnitTest.testEvalEquals("45", "(integer-length 17592196491339)");
		UnitTest.testEvalEquals("45", "(integer-length 17592198224304)");
		UnitTest.testEvalEquals("45", "(integer-length 17592198410636)");
		UnitTest.testEvalEquals("45", "(integer-length 17592198866706)");
		UnitTest.testEvalEquals("45", "(integer-length 17592199981380)");
		UnitTest.testEvalEquals("45", "(integer-length 17592200623734)");
		UnitTest.testEvalEquals("45", "(integer-length 17592202747317)");
		UnitTest.testEvalEquals("45", "(integer-length 17592206124789)");
		UnitTest.testEvalEquals("45", "(integer-length 17592211968512)");
		UnitTest.testEvalEquals("45", "(integer-length 17592214691786)");
		UnitTest.testEvalEquals("45", "(integer-length 17592217113670)");
		UnitTest.testEvalEquals("45", "(integer-length 17592219253511)");
		UnitTest.testEvalEquals("45", "(integer-length 17592223395453)");
		UnitTest.testEvalEquals("45", "(integer-length 17592226449331)");
		UnitTest.testEvalEquals("45", "(integer-length 17592227594198)");
		UnitTest.testEvalEquals("45", "(integer-length 17592233697186)");
		UnitTest.testEvalEquals("45", "(integer-length 17592242603260)");
		UnitTest.testEvalEquals("45", "(integer-length 17592246621919)");
		UnitTest.testEvalEquals("45", "(integer-length 17592250027438)");
		UnitTest.testEvalEquals("45", "(integer-length 17592250184260)");
		UnitTest.testEvalEquals("45", "(integer-length 17592251955959)");
		UnitTest.testEvalEquals("45", "(integer-length 17592254489136)");
		UnitTest.testEvalEquals("45", "(integer-length 17592256724562)");
		UnitTest.testEvalEquals("45", "(integer-length 17592261021687)");
		UnitTest.testEvalEquals("45", "(integer-length 17592261166926)");
		UnitTest.testEvalEquals("45", "(integer-length 17592262451403)");
		UnitTest.testEvalEquals("45", "(integer-length 17592272509522)");
		UnitTest.testEvalEquals("45", "(integer-length 17592279736882)");
		UnitTest.testEvalEquals("45", "(integer-length 17592280335667)");
		UnitTest.testEvalEquals("45", "(integer-length 17592282449587)");
		UnitTest.testEvalEquals("45", "(integer-length 17592285714065)");
		UnitTest.testEvalEquals("45", "(integer-length 17592290660056)");
		UnitTest.testEvalEquals("45", "(integer-length 17592290687850)");
		UnitTest.testEvalEquals("45", "(integer-length 17592291475337)");
		UnitTest.testEvalEquals("45", "(integer-length 17592291509124)");
		UnitTest.testEvalEquals("45", "(integer-length 17592292692286)");
		UnitTest.testEvalEquals("45", "(integer-length 17592293562821)");
		UnitTest.testEvalEquals("45", "(integer-length 17592302740196)");
		UnitTest.testEvalEquals("45", "(integer-length 17592303106575)");
		UnitTest.testEvalEquals("45", "(integer-length 17592303413846)");
		UnitTest.testEvalEquals("45", "(integer-length 17592303992695)");
		UnitTest.testEvalEquals("45", "(integer-length 17592308860571)");
		UnitTest.testEvalEquals("45", "(integer-length 17592316372062)");
		UnitTest.testEvalEquals("45", "(integer-length 17592318916873)");
		UnitTest.testEvalEquals("46", "(integer-length 35184372088832)");
		UnitTest.testEvalEquals("46", "(integer-length 35184376720390)");
		UnitTest.testEvalEquals("46", "(integer-length 35184378806326)");
		UnitTest.testEvalEquals("46", "(integer-length 35184382321452)");
		UnitTest.testEvalEquals("46", "(integer-length 35184393453256)");
		UnitTest.testEvalEquals("46", "(integer-length 35184393832054)");
		UnitTest.testEvalEquals("46", "(integer-length 35184397847501)");
		UnitTest.testEvalEquals("46", "(integer-length 35184401343422)");
		UnitTest.testEvalEquals("46", "(integer-length 35184402866385)");
		UnitTest.testEvalEquals("46", "(integer-length 35184409235265)");
		UnitTest.testEvalEquals("46", "(integer-length 35184413780117)");
		UnitTest.testEvalEquals("46", "(integer-length 35184414518840)");
		UnitTest.testEvalEquals("46", "(integer-length 35184414799951)");
		UnitTest.testEvalEquals("46", "(integer-length 35184417716851)");
		UnitTest.testEvalEquals("46", "(integer-length 35184421376802)");
		UnitTest.testEvalEquals("46", "(integer-length 35184428776616)");
		UnitTest.testEvalEquals("46", "(integer-length 35184431874766)");
		UnitTest.testEvalEquals("46", "(integer-length 35184431923738)");
		UnitTest.testEvalEquals("46", "(integer-length 35184432651613)");
		UnitTest.testEvalEquals("46", "(integer-length 35184437600806)");
		UnitTest.testEvalEquals("46", "(integer-length 35184440039994)");
		UnitTest.testEvalEquals("46", "(integer-length 35184440744874)");
		UnitTest.testEvalEquals("46", "(integer-length 35184447601852)");
		UnitTest.testEvalEquals("46", "(integer-length 35184448028457)");
		UnitTest.testEvalEquals("46", "(integer-length 35184449769581)");
		UnitTest.testEvalEquals("46", "(integer-length 35184452132493)");
		UnitTest.testEvalEquals("46", "(integer-length 35184453702783)");
		UnitTest.testEvalEquals("46", "(integer-length 35184455886680)");
		UnitTest.testEvalEquals("46", "(integer-length 35184456337529)");
		UnitTest.testEvalEquals("46", "(integer-length 35184457046203)");
		UnitTest.testEvalEquals("46", "(integer-length 35184461530749)");
		UnitTest.testEvalEquals("46", "(integer-length 35184464087795)");
		UnitTest.testEvalEquals("46", "(integer-length 35184468096378)");
		UnitTest.testEvalEquals("46", "(integer-length 35184474812254)");
		UnitTest.testEvalEquals("46", "(integer-length 35184481516747)");
		UnitTest.testEvalEquals("46", "(integer-length 35184483124583)");
		UnitTest.testEvalEquals("46", "(integer-length 35184491072263)");
		UnitTest.testEvalEquals("46", "(integer-length 35184492409057)");
		UnitTest.testEvalEquals("46", "(integer-length 35184493412885)");
		UnitTest.testEvalEquals("46", "(integer-length 35184494828367)");
		UnitTest.testEvalEquals("46", "(integer-length 35184496036331)");
		UnitTest.testEvalEquals("46", "(integer-length 35184496398505)");
		UnitTest.testEvalEquals("46", "(integer-length 35184498763632)");
		UnitTest.testEvalEquals("46", "(integer-length 35184501896904)");
		UnitTest.testEvalEquals("46", "(integer-length 35184504395135)");
		UnitTest.testEvalEquals("46", "(integer-length 35184504662045)");
		UnitTest.testEvalEquals("46", "(integer-length 35184506173845)");
		UnitTest.testEvalEquals("47", "(integer-length 70368744177664)");
		UnitTest.testEvalEquals("47", "(integer-length 70368749345740)");
		UnitTest.testEvalEquals("47", "(integer-length 70368750918381)");
		UnitTest.testEvalEquals("47", "(integer-length 70368752409704)");
		UnitTest.testEvalEquals("47", "(integer-length 70368753747156)");
		UnitTest.testEvalEquals("47", "(integer-length 70368759954695)");
		UnitTest.testEvalEquals("47", "(integer-length 70368760399926)");
		UnitTest.testEvalEquals("47", "(integer-length 70368760767784)");
		UnitTest.testEvalEquals("47", "(integer-length 70368768378532)");
		UnitTest.testEvalEquals("47", "(integer-length 70368768839902)");
		UnitTest.testEvalEquals("47", "(integer-length 70368768875365)");
		UnitTest.testEvalEquals("47", "(integer-length 70368768879901)");
		UnitTest.testEvalEquals("47", "(integer-length 70368770604992)");
		UnitTest.testEvalEquals("47", "(integer-length 70368776151990)");
		UnitTest.testEvalEquals("47", "(integer-length 70368776177386)");
		UnitTest.testEvalEquals("47", "(integer-length 70368778400846)");
		UnitTest.testEvalEquals("47", "(integer-length 70368778520302)");
		UnitTest.testEvalEquals("47", "(integer-length 70368779493137)");
		UnitTest.testEvalEquals("47", "(integer-length 70368780228112)");
		UnitTest.testEvalEquals("47", "(integer-length 70368784157996)");
		UnitTest.testEvalEquals("47", "(integer-length 70368787693483)");
		UnitTest.testEvalEquals("47", "(integer-length 70368788565552)");
		UnitTest.testEvalEquals("47", "(integer-length 70368791835564)");
		UnitTest.testEvalEquals("47", "(integer-length 70368791867609)");
		UnitTest.testEvalEquals("47", "(integer-length 70368799549348)");
		UnitTest.testEvalEquals("47", "(integer-length 70368801692814)");
		UnitTest.testEvalEquals("47", "(integer-length 70368808857884)");
		UnitTest.testEvalEquals("47", "(integer-length 70368809094371)");
		UnitTest.testEvalEquals("47", "(integer-length 70368809472842)");
		UnitTest.testEvalEquals("47", "(integer-length 70368809731146)");
		UnitTest.testEvalEquals("47", "(integer-length 70368810012520)");
		UnitTest.testEvalEquals("47", "(integer-length 70368810742304)");
		UnitTest.testEvalEquals("47", "(integer-length 70368814040228)");
		UnitTest.testEvalEquals("47", "(integer-length 70368814800921)");
		UnitTest.testEvalEquals("47", "(integer-length 70368816334140)");
		UnitTest.testEvalEquals("47", "(integer-length 70368818246437)");
		UnitTest.testEvalEquals("47", "(integer-length 70368821365609)");
		UnitTest.testEvalEquals("47", "(integer-length 70368822973131)");
		UnitTest.testEvalEquals("47", "(integer-length 70368824913268)");
		UnitTest.testEvalEquals("47", "(integer-length 70368833633224)");
		UnitTest.testEvalEquals("47", "(integer-length 70368834385459)");
		UnitTest.testEvalEquals("47", "(integer-length 70368840706035)");
		UnitTest.testEvalEquals("47", "(integer-length 70368847148027)");
		UnitTest.testEvalEquals("47", "(integer-length 70368851756073)");
		UnitTest.testEvalEquals("47", "(integer-length 70368852742183)");
		UnitTest.testEvalEquals("47", "(integer-length 70368858295556)");
		UnitTest.testEvalEquals("47", "(integer-length 70368865654405)");
		UnitTest.testEvalEquals("47", "(integer-length 70368878251189)");
		UnitTest.testEvalEquals("48", "(integer-length 140737488355328)");
		UnitTest.testEvalEquals("48", "(integer-length 140737489536094)");
		UnitTest.testEvalEquals("48", "(integer-length 140737496482469)");
		UnitTest.testEvalEquals("48", "(integer-length 140737499060107)");
		UnitTest.testEvalEquals("48", "(integer-length 140737508788329)");
		UnitTest.testEvalEquals("48", "(integer-length 140737508847001)");
		UnitTest.testEvalEquals("48", "(integer-length 140737515086964)");
		UnitTest.testEvalEquals("48", "(integer-length 140737517093156)");
		UnitTest.testEvalEquals("48", "(integer-length 140737518216662)");
		UnitTest.testEvalEquals("48", "(integer-length 140737524311489)");
		UnitTest.testEvalEquals("48", "(integer-length 140737526220154)");
		UnitTest.testEvalEquals("48", "(integer-length 140737528827832)");
		UnitTest.testEvalEquals("48", "(integer-length 140737529205967)");
		UnitTest.testEvalEquals("48", "(integer-length 140737532554642)");
		UnitTest.testEvalEquals("48", "(integer-length 140737533556794)");
		UnitTest.testEvalEquals("48", "(integer-length 140737538419155)");
		UnitTest.testEvalEquals("48", "(integer-length 140737539486588)");
		UnitTest.testEvalEquals("48", "(integer-length 140737541934790)");
		UnitTest.testEvalEquals("48", "(integer-length 140737543304171)");
		UnitTest.testEvalEquals("48", "(integer-length 140737544812615)");
		UnitTest.testEvalEquals("48", "(integer-length 140737546290400)");
		UnitTest.testEvalEquals("48", "(integer-length 140737546364783)");
		UnitTest.testEvalEquals("48", "(integer-length 140737548766256)");
		UnitTest.testEvalEquals("48", "(integer-length 140737554051727)");
		UnitTest.testEvalEquals("48", "(integer-length 140737557211581)");
		UnitTest.testEvalEquals("48", "(integer-length 140737558944815)");
		UnitTest.testEvalEquals("48", "(integer-length 140737560973873)");
		UnitTest.testEvalEquals("48", "(integer-length 140737562461443)");
		UnitTest.testEvalEquals("48", "(integer-length 140737564406002)");
		UnitTest.testEvalEquals("48", "(integer-length 140737564701725)");
		UnitTest.testEvalEquals("48", "(integer-length 140737568968957)");
		UnitTest.testEvalEquals("48", "(integer-length 140737571739846)");
		UnitTest.testEvalEquals("48", "(integer-length 140737574999654)");
		UnitTest.testEvalEquals("48", "(integer-length 140737577345662)");
		UnitTest.testEvalEquals("48", "(integer-length 140737577486927)");
		UnitTest.testEvalEquals("48", "(integer-length 140737579017312)");
		UnitTest.testEvalEquals("48", "(integer-length 140737579916353)");
		UnitTest.testEvalEquals("48", "(integer-length 140737584792861)");
		UnitTest.testEvalEquals("48", "(integer-length 140737586854636)");
		UnitTest.testEvalEquals("48", "(integer-length 140737586996078)");
		UnitTest.testEvalEquals("48", "(integer-length 140737588948399)");
		UnitTest.testEvalEquals("48", "(integer-length 140737589540299)");
		UnitTest.testEvalEquals("48", "(integer-length 140737593235351)");
		UnitTest.testEvalEquals("48", "(integer-length 140737593330141)");
		UnitTest.testEvalEquals("48", "(integer-length 140737593990284)");
		UnitTest.testEvalEquals("48", "(integer-length 140737608159770)");
		UnitTest.testEvalEquals("48", "(integer-length 140737609021592)");
		UnitTest.testEvalEquals("48", "(integer-length 140737613658235)");
		UnitTest.testEvalEquals("48", "(integer-length 140737618116360)");
		UnitTest.testEvalEquals("49", "(integer-length 281474976710656)");
		UnitTest.testEvalEquals("49", "(integer-length 281474987348281)");
		UnitTest.testEvalEquals("49", "(integer-length 281474989736764)");
		UnitTest.testEvalEquals("49", "(integer-length 281474990859260)");
		UnitTest.testEvalEquals("49", "(integer-length 281475002816233)");
		UnitTest.testEvalEquals("49", "(integer-length 281475003358095)");
		UnitTest.testEvalEquals("49", "(integer-length 281475003513742)");
		UnitTest.testEvalEquals("49", "(integer-length 281475004289779)");
		UnitTest.testEvalEquals("49", "(integer-length 281475013015286)");
		UnitTest.testEvalEquals("49", "(integer-length 281475015848265)");
		UnitTest.testEvalEquals("49", "(integer-length 281475016794427)");
		UnitTest.testEvalEquals("49", "(integer-length 281475020121282)");
		UnitTest.testEvalEquals("49", "(integer-length 281475021039408)");
		UnitTest.testEvalEquals("49", "(integer-length 281475022716594)");
		UnitTest.testEvalEquals("49", "(integer-length 281475023250607)");
		UnitTest.testEvalEquals("49", "(integer-length 281475025150078)");
		UnitTest.testEvalEquals("49", "(integer-length 281475027523188)");
		UnitTest.testEvalEquals("49", "(integer-length 281475027909569)");
		UnitTest.testEvalEquals("49", "(integer-length 281475031120948)");
		UnitTest.testEvalEquals("49", "(integer-length 281475031314877)");
		UnitTest.testEvalEquals("49", "(integer-length 281475031517886)");
		UnitTest.testEvalEquals("49", "(integer-length 281475034665141)");
		UnitTest.testEvalEquals("49", "(integer-length 281475035322249)");
		UnitTest.testEvalEquals("49", "(integer-length 281475036691017)");
		UnitTest.testEvalEquals("49", "(integer-length 281475040089166)");
		UnitTest.testEvalEquals("49", "(integer-length 281475045787819)");
		UnitTest.testEvalEquals("49", "(integer-length 281475051419914)");
		UnitTest.testEvalEquals("49", "(integer-length 281475052079807)");
		UnitTest.testEvalEquals("49", "(integer-length 281475059070664)");
		UnitTest.testEvalEquals("49", "(integer-length 281475060870892)");
		UnitTest.testEvalEquals("49", "(integer-length 281475061773573)");
		UnitTest.testEvalEquals("49", "(integer-length 281475073392977)");
		UnitTest.testEvalEquals("49", "(integer-length 281475075949415)");
		UnitTest.testEvalEquals("49", "(integer-length 281475077508297)");
		UnitTest.testEvalEquals("49", "(integer-length 281475077786063)");
		UnitTest.testEvalEquals("49", "(integer-length 281475079030337)");
		UnitTest.testEvalEquals("49", "(integer-length 281475080810412)");
		UnitTest.testEvalEquals("49", "(integer-length 281475081095169)");
		UnitTest.testEvalEquals("49", "(integer-length 281475081430208)");
		UnitTest.testEvalEquals("49", "(integer-length 281475085413332)");
		UnitTest.testEvalEquals("49", "(integer-length 281475090929045)");
		UnitTest.testEvalEquals("49", "(integer-length 281475097290956)");
		UnitTest.testEvalEquals("49", "(integer-length 281475098681061)");
		UnitTest.testEvalEquals("49", "(integer-length 281475100926516)");
		UnitTest.testEvalEquals("49", "(integer-length 281475102152160)");
		UnitTest.testEvalEquals("49", "(integer-length 281475102731567)");
		UnitTest.testEvalEquals("49", "(integer-length 281475102872253)");
		UnitTest.testEvalEquals("49", "(integer-length 281475105129791)");
		UnitTest.testEvalEquals("49", "(integer-length 281475107243359)");
		UnitTest.testEvalEquals("49", "(integer-length 281475109989044)");
		UnitTest.testEvalEquals("50", "(integer-length 562949953421312)");
		UnitTest.testEvalEquals("50", "(integer-length 562949959776721)");
		UnitTest.testEvalEquals("50", "(integer-length 562949960793096)");
		UnitTest.testEvalEquals("50", "(integer-length 562949962596691)");
		UnitTest.testEvalEquals("50", "(integer-length 562949964226611)");
		UnitTest.testEvalEquals("50", "(integer-length 562949966351939)");
		UnitTest.testEvalEquals("50", "(integer-length 562949966385169)");
		UnitTest.testEvalEquals("50", "(integer-length 562949981149397)");
		UnitTest.testEvalEquals("50", "(integer-length 562949983562842)");
		UnitTest.testEvalEquals("50", "(integer-length 562949983709399)");
		UnitTest.testEvalEquals("50", "(integer-length 562949984795377)");
		UnitTest.testEvalEquals("50", "(integer-length 562949986185276)");
		UnitTest.testEvalEquals("50", "(integer-length 562949986796865)");
		UnitTest.testEvalEquals("50", "(integer-length 562949987508674)");
		UnitTest.testEvalEquals("50", "(integer-length 562949990214701)");
		UnitTest.testEvalEquals("50", "(integer-length 562949990847765)");
		UnitTest.testEvalEquals("50", "(integer-length 562949990989815)");
		UnitTest.testEvalEquals("50", "(integer-length 562949992794506)");
		UnitTest.testEvalEquals("50", "(integer-length 562950000680771)");
		UnitTest.testEvalEquals("50", "(integer-length 562950002176944)");
		UnitTest.testEvalEquals("50", "(integer-length 562950007100241)");
		UnitTest.testEvalEquals("50", "(integer-length 562950010930633)");
		UnitTest.testEvalEquals("50", "(integer-length 562950012477049)");
		UnitTest.testEvalEquals("50", "(integer-length 562950020577460)");
		UnitTest.testEvalEquals("50", "(integer-length 562950022940229)");
		UnitTest.testEvalEquals("50", "(integer-length 562950023829945)");
		UnitTest.testEvalEquals("50", "(integer-length 562950025370452)");
		UnitTest.testEvalEquals("50", "(integer-length 562950028722768)");
		UnitTest.testEvalEquals("50", "(integer-length 562950030190066)");
		UnitTest.testEvalEquals("50", "(integer-length 562950030383870)");
		UnitTest.testEvalEquals("50", "(integer-length 562950033463910)");
		UnitTest.testEvalEquals("50", "(integer-length 562950039264974)");
		UnitTest.testEvalEquals("50", "(integer-length 562950040642360)");
		UnitTest.testEvalEquals("50", "(integer-length 562950042472591)");
		UnitTest.testEvalEquals("50", "(integer-length 562950042669535)");
		UnitTest.testEvalEquals("50", "(integer-length 562950044908930)");
		UnitTest.testEvalEquals("50", "(integer-length 562950051182692)");
		UnitTest.testEvalEquals("50", "(integer-length 562950052776444)");
		UnitTest.testEvalEquals("50", "(integer-length 562950054419367)");
		UnitTest.testEvalEquals("50", "(integer-length 562950055690852)");
		UnitTest.testEvalEquals("50", "(integer-length 562950058780681)");
		UnitTest.testEvalEquals("50", "(integer-length 562950062754730)");
		UnitTest.testEvalEquals("50", "(integer-length 562950063689494)");
		UnitTest.testEvalEquals("50", "(integer-length 562950064298651)");
		UnitTest.testEvalEquals("50", "(integer-length 562950066689208)");
		UnitTest.testEvalEquals("50", "(integer-length 562950069287328)");
		UnitTest.testEvalEquals("50", "(integer-length 562950076319924)");
		UnitTest.testEvalEquals("50", "(integer-length 562950076767505)");
		UnitTest.testEvalEquals("50", "(integer-length 562950085487292)");
		UnitTest.testEvalEquals("50", "(integer-length 562950085917772)");
		UnitTest.testEvalEquals("50", "(integer-length 562950087631334)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899906842624)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899909780287)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899912140657)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899916180486)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899916856464)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899918118968)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899920587057)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899922273067)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899922515815)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899934594064)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899935596137)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899940044362)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899941251492)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899941901346)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899942505008)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899943576166)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899943594098)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899952155297)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899952312227)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899952835022)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899967140596)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899968442046)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899974403670)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899977838018)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899979513753)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899982168851)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899985082977)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899985316925)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899988367099)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899989922311)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899990868925)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899991121917)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899994478352)");
		UnitTest.testEvalEquals("51", "(integer-length 1125899996668655)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900006960529)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900010000619)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900011176594)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900011654508)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900012385392)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900013275578)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900016357486)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900019239573)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900020376588)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900020450464)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900022077381)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900022912288)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900024468618)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900026007388)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900026480006)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900027517862)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900030427513)");
		UnitTest.testEvalEquals("51", "(integer-length 1125900038059223)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799813685248)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799814578024)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799817291596)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799818320528)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799823604251)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799824619291)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799828632650)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799829058729)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799830434430)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799830585205)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799835791990)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799838089948)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799840085183)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799841372075)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799844109134)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799851126573)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799859488679)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799867096136)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799867324039)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799868553231)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799873588137)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799877232885)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799880236756)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799882631669)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799884334374)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799884396997)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799889205834)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799890753721)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799892786180)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799894973894)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799896687684)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799898108512)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799903157551)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799904747386)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799904841873)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799906385310)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799908955501)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799912942667)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799912983183)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799917479298)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799917805038)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799921174533)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799922361615)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799924578943)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799929810345)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799930251391)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799930468613)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799930753882)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799932323074)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799938427816)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799939223377)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799941422834)");
		UnitTest.testEvalEquals("52", "(integer-length 2251799946752988)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599627370496)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599627379917)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599628908880)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599631675948)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599636455644)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599639084431)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599639156406)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599642454469)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599642506602)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599643756873)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599644825162)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599646420873)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599652593645)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599654859423)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599656637653)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599659933069)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599664764634)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599667762402)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599669816513)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599670190230)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599671469806)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599672965429)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599673419175)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599673969502)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599675432030)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599682403906)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599682895225)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599684576607)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599686905617)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599688211553)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599691574856)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599694587207)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599697304118)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599699384039)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599700602632)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599702019322)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599704770396)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599709055902)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599714320329)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599715357131)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599717411474)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599717753275)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599718923924)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599721969437)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599725991014)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599726333005)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599726599597)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599738328738)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599738377220)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599739070919)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599741411006)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599752985499)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599753957574)");
		UnitTest.testEvalEquals("53", "(integer-length 4503599761231827)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199254740992)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199257116625)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199257439075)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199258940410)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199259204837)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199262115575)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199262339990)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199265278208)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199266428358)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199268884425)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199269844937)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199270247515)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199283263630)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199296241918)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199296578378)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199298172648)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199300783770)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199305241079)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199305857646)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199306915188)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199307480599)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199307902521)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199308182427)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199313064832)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199316072415)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199318130236)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199318422989)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199320024387)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199325803373)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199327940166)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199328851431)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199330101558)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199330527628)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199332007168)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199332020374)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199335843053)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199338381245)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199338491049)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199341935446)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199342591361)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199343671845)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199351204143)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199354612680)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199355675633)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199359899637)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199361155608)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199367861380)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199369988240)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199372240382)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199373750763)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199374394873)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199378372576)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199380394731)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199380540362)");
		UnitTest.testEvalEquals("54", "(integer-length 9007199383880089)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398509481984)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398511549422)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398515778667)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398517568528)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398519733563)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398520219865)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398522959979)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398526150565)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398527583822)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398531410736)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398534516278)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398535280960)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398536456237)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398536596323)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398539068741)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398539624627)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398540903534)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398545388322)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398560062109)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398562442503)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398565734931)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398568137103)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398568802500)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398570442047)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398570994949)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398571388622)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398573542333)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398576556239)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398578413382)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398579847339)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398580140343)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398585675889)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398586362978)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398586608484)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398588575833)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398588920317)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398589541341)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398594136914)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398597097267)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398599461412)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398600436344)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398603702641)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398606225378)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398607511432)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398607747064)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398609501439)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398610861798)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398611454439)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398619910919)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398621957543)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398622143224)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398626040766)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398628733333)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398629413061)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398632818521)");
		UnitTest.testEvalEquals("55", "(integer-length 18014398636662460)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797018963968)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797021802147)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797029148054)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797029223380)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797030057669)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797030804963)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797032967936)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797037183691)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797037277042)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797040192590)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797041255815)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797042084834)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797043150378)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797044611666)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797046232958)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797046512551)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797047221701)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797047570704)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797048136373)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797048606588)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797053742869)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797054028587)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797054031775)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797055116596)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797058352247)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797059178877)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797061531265)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797061868193)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797062924842)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797064858374)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797070748239)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797071016901)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797071965446)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797077519412)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797079554621)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797084023364)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797087395656)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797087726281)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797089867628)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797098275068)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797102386782)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797104171273)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797106730465)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797115844591)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797118201159)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797118876063)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797124740967)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797128781512)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797130170266)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797132922083)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797135647166)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797137230780)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797143470742)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797145870279)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797149952396)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797150588189)");
		UnitTest.testEvalEquals("56", "(integer-length 36028797152573102)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594037927936)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594038374916)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594041407458)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594047337406)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594048489163)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594053213657)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594054129050)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594054550789)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594055622368)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594055710118)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594055951765)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594058289484)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594060627895)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594060895499)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594066163398)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594071090811)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594072038995)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594072537604)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594074146420)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594074586241)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594075075535)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594075149650)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594076235861)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594078563282)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594078774759)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594084315547)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594084817835)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594090169884)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594093232784)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594095756064)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594097220285)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594097612735)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594107227174)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594107316888)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594110322117)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594110940575)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594113189950)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594117510774)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594127130801)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594131490192)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594132814746)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594133787180)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594134428708)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594135402264)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594136501700)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594142580173)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594144183627)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594146367606)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594155871175)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594156043328)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594156160978)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594156616949)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594157143684)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594157736667)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594158641110)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594158689397)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594168114138)");
		UnitTest.testEvalEquals("57", "(integer-length 72057594168580824)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188075855872)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188076079114)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188076215922)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188076599720)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188078086115)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188078138107)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188080231051)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188080301453)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188080957783)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188081633013)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188085083177)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188085693178)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188088599902)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188089589673)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188092779251)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188095462772)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188096977130)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188098626896)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188099400284)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188105117688)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188105204672)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188105458085)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188105550390)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188108647219)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188112982838)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188118714142)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188118771119)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188122398012)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188122837432)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188124460414)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188124980688)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188126786840)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188130242825)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188130949603)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188134058744)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188146330649)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188146489686)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188150716517)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188153208505)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188153291210)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188156078339)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188160675199)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188163429113)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188163552272)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188167221558)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188168177794)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188168933992)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188169067245)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188180353111)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188181756137)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188183557606)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188184036363)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188184419947)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188186638629)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188190077333)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188195727744)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188200633095)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188203553509)");
		UnitTest.testEvalEquals("58", "(integer-length 144115188205834329)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376151711744)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376152740142)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376154323661)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376158030566)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376159071667)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376159676706)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376160712243)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376162998051)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376167883404)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376169957196)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376172553054)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376173172482)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376176392694)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376177226150)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376177784222)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376178006741)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376178493279)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376179842476)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376180498803)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376182632968)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376183467343)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376184156369)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376187363562)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376190464101)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376194478330)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376195100025)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376198171824)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376198396014)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376200538770)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376200546217)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376206765337)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376209175062)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376210674057)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376212671340)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376215143310)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376215741276)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376216922983)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376222397400)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376225188331)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376227641029)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376228302467)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376228470029)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376230955254)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376232257073)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376235868991)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376243472223)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376245078335)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376245622607)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376249748585)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376260921741)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376261849528)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376267329788)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376267958636)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376271544216)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376275688655)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376276974540)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376277106715)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376277646938)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376279035537)");
		UnitTest.testEvalEquals("59", "(integer-length 288230376282254147)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752303423488)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752304064529)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752305165158)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752306712212)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752308428612)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752309054268)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752309854536)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752314231660)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752317736694)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752317786201)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752319191576)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752323641404)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752327165131)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752330033535)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752330345865)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752332572952)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752333633397)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752338805548)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752342764051)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752342970693)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752345780168)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752347048707)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752348076696)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752351683960)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752352323719)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752356413722)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752358743054)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752360332137)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752363634934)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752365526442)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752365575492)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752366573508)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752368873790)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752373982914)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752376600432)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752377728055)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752378311631)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752378742222)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752379606967)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752381893287)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752392863429)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752398375995)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752398881084)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752399393972)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752404213275)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752410937120)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752414483627)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752414575905)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752415314167)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752416299892)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752418027378)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752425930382)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752427983685)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752429710273)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752430319386)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752431474372)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752432266628)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752433079112)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752435367245)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752435796343)");
		UnitTest.testEvalEquals("60", "(integer-length 576460752436001280)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504606846976)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504607231569)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504608709253)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504608806939)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504612314884)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504612976437)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504614365329)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504614931016)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504619947332)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504623962720)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504624221982)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504625146739)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504630127297)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504631049087)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504633119273)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504639516796)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504641609469)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504642252237)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504645824239)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504652087278)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504652152979)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504653114497)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504654606232)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504655968703)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504656719130)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504656900689)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504658109495)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504659323824)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504669078603)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504670919724)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504671657451)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504674258470)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504675073906)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504675902441)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504676783413)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504679780447)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504683892080)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504686394317)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504689583452)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504692367086)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504692450121)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504693190721)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504694987387)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504695210621)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504695825935)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504699587849)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504700900018)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504702411915)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504702516708)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504702825638)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504704914066)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504708998543)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504709696354)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504720483881)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504722442766)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504726608695)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504733881588)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504735790613)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504735812844)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504735840999)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504737743730)");
		UnitTest.testEvalEquals("61", "(integer-length 1152921504738004431)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009213693952)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009214719632)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009216188736)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009220228163)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009220871770)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009222027137)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009222248441)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009228281381)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009230282691)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009231075096)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009233983527)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009234511790)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009234847622)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009235035227)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009238588036)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009239700877)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009242092216)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009246810703)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009247408910)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009248929423)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009252445848)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009257159088)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009259719710)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009260800905)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009267614903)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009267667725)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009269619237)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009272168773)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009273769229)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009276091594)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009276878982)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009279295457)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009280667407)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009281383640)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009286178712)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009289326546)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009295312053)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009297820162)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009299657190)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009300781082)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009302040227)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009302915748)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009305388788)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009316301394)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009316895203)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009320001363)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009321198339)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009323753140)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009325284475)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009326875302)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009328042847)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009329251677)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009331083863)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009333216851)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009335656900)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009338350889)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009338885875)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009339341089)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009339605863)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009339842059)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009340712063)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009343267908)");
		UnitTest.testEvalEquals("62", "(integer-length 2305843009343493442)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018427387904)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018433316091)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018436624377)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018437058651)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018438018500)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018440809429)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018441286508)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018444702272)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018449914050)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018456504221)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018459299180)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018461994244)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018462162923)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018465781592)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018466903055)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018468001725)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018469093882)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018469719556)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018470014286)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018470583221)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018470738924)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018471984765)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018475419438)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018477416087)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018479136111)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018479523608)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018480411513)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018481948917)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018482563831)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018484431363)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018484439614)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018486850123)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018488439817)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018490447689)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018490704436)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018498777079)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018499000697)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018500291374)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018501197822)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018505300983)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018506390790)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018509420933)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018511895868)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018513038329)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018515185148)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018516942537)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018519392838)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018522939944)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018528528657)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018530498015)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018532192718)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018533018896)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018534682107)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018536155093)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018537164652)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018543180448)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018543695857)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018543724959)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018544604441)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018546973640)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018549552109)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018551660182)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018555234368)");
		UnitTest.testEvalEquals("63", "(integer-length 4611686018556550597)");
		UnitTest.testEvalEquals("64", "(integer-length 9223372036854775808)");
		// @section bignum tests
		UnitTest.testEvalEquals("101", "(integer-length 1267650600228229401496703205376)");
		UnitTest.testEvalEquals("201",
				"(integer-length 1606938044258990275541962092341162602522202993782792835301376)");
		UnitTest.testEvalEquals("301",
				"(integer-length 2037035976334486086268445688409378161051468393665936250636140449354381299763336706183397376)");
		UnitTest.testEvalEquals("294",
				"(integer-length (ash 123094239040239402394023234234234029384092385409238098920394234223098427410849039842304 8))");

		// assembling (and soon: disassembling fixnums)
		UnitTest.testEvalEquals("0", "(assemble-fixnums-to-integer 1)");
		UnitTest.testEvalEquals("745", "(assemble-fixnums-to-integer 1 233 2)");
		UnitTest.testEvalEquals("1041691", "(assemble-fixnums-to-integer 1 27 229 15)");
		UnitTest.testEvalEquals("667711287", "(assemble-fixnums-to-integer 1 55 119 204 39)");
		UnitTest.testEvalEquals("549871383108", "(assemble-fixnums-to-integer 1 68 114 227 6 128)");
		UnitTest.testEvalEquals("562950002151949", "(assemble-fixnums-to-integer 1 13 146 231 2 0 0 2)");
		UnitTest.testEvalEquals("576460752338529960", "(assemble-fixnums-to-integer 1 168 174 23 2 0 0 0 8)");
		UnitTest.testEvalEquals("590295810358761588164", "(assemble-fixnums-to-integer 1 196 133 85 3 0 0 0 0 32)");
		UnitTest.testEvalEquals("-745", "(assemble-fixnums-to-integer -1 233 2)");
		UnitTest.testEvalEquals("-1041691", "(assemble-fixnums-to-integer -1 27 229 15)");
		UnitTest.testEvalEquals("-667711287", "(assemble-fixnums-to-integer -1 55 119 204 39)");
		UnitTest.testEvalEquals("-549871383108", "(assemble-fixnums-to-integer -1 68 114 227 6 128)");
		UnitTest.testEvalEquals("-562950002151949", "(assemble-fixnums-to-integer -1 13 146 231 2 0 0 2)");
		UnitTest.testEvalEquals("-576460752338529960", "(assemble-fixnums-to-integer -1 168 174 23 2 0 0 0 8)");
		UnitTest.testEvalEquals("-590295810358761588164", "(assemble-fixnums-to-integer -1 196 133 85 3 0 0 0 0 32)");

	}

	public static void testMember() {
		UnitTest.testEvalEquals("NIL", "(member 1 '(a b c))");
		UnitTest.testEvalEquals("'(b c)", "(member 'b '(a b c))");
		UnitTest.testEvalEquals("NIL", "(member \"b\" '(\"A\" \"B\" \"C\"))");
		UnitTest.testEvalEquals("'(\"B\" \"C\")", "(member \"b\" '(\"A\" \"B\" \"C\") #'equalp)");
		UnitTest.testEvalEquals("'(\"B\" \"C\")", "(member \"b\" '(\"A\" \"B\" \"C\") #'equalp #'identity)");
		UnitTest.testEvalEquals("NIL",
				"(cnot (null (member :subl-quote-fn '((1 . :after-adding) (0 . after-adding)) 'eql 'cdr)))");
		// @todo add more tests
	}

	public static void testMultipleValues() {
		Values.resetMultipleValues();
		Values.values(CommonSymbols.ONE_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER,
				CommonSymbols.FOUR_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER,
				CommonSymbols.FOUR_INTEGER, CommonSymbols.FIVE_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER,
				CommonSymbols.FOUR_INTEGER, CommonSymbols.FIVE_INTEGER, CommonSymbols.SIX_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		Assert.assertEquals(CommonSymbols.SIX_INTEGER, Values.sixthMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER,
				CommonSymbols.FOUR_INTEGER, CommonSymbols.FIVE_INTEGER, CommonSymbols.SIX_INTEGER,
				CommonSymbols.SEVEN_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		Assert.assertEquals(CommonSymbols.SIX_INTEGER, Values.sixthMultipleValue());
		Assert.assertEquals(CommonSymbols.SEVEN_INTEGER, Values.seventhMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7)");
		Values.values(CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER,
				CommonSymbols.FOUR_INTEGER, CommonSymbols.FIVE_INTEGER, CommonSymbols.SIX_INTEGER,
				CommonSymbols.SEVEN_INTEGER, CommonSymbols.EIGHT_INTEGER);
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		Assert.assertEquals(CommonSymbols.SIX_INTEGER, Values.sixthMultipleValue());
		Assert.assertEquals(CommonSymbols.SEVEN_INTEGER, Values.seventhMultipleValue());
		Assert.assertEquals(CommonSymbols.EIGHT_INTEGER, Values.eighthMultipleValue());
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8)");
		Values.values(
				new SubLObject[] { CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER, CommonSymbols.THREE_INTEGER,
						CommonSymbols.FOUR_INTEGER, CommonSymbols.FIVE_INTEGER, CommonSymbols.SIX_INTEGER,
						CommonSymbols.SEVEN_INTEGER, CommonSymbols.EIGHT_INTEGER, CommonSymbols.NINE_INTEGER });
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		Assert.assertEquals(CommonSymbols.SIX_INTEGER, Values.sixthMultipleValue());
		Assert.assertEquals(CommonSymbols.SEVEN_INTEGER, Values.seventhMultipleValue());
		Assert.assertEquals(CommonSymbols.EIGHT_INTEGER, Values.eighthMultipleValue());
		Assert.assertEquals(CommonSymbols.NINE_INTEGER, Values.nthMultipleValue(8));
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9)");
		Values.values(new SubLObject[] { CommonSymbols.ONE_INTEGER, CommonSymbols.TWO_INTEGER,
				CommonSymbols.THREE_INTEGER, CommonSymbols.FOUR_INTEGER, CommonSymbols.FIVE_INTEGER,
				CommonSymbols.SIX_INTEGER, CommonSymbols.SEVEN_INTEGER, CommonSymbols.EIGHT_INTEGER,
				CommonSymbols.NINE_INTEGER, CommonSymbols.ZERO_INTEGER });
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		Assert.assertEquals(CommonSymbols.SIX_INTEGER, Values.sixthMultipleValue());
		Assert.assertEquals(CommonSymbols.SEVEN_INTEGER, Values.seventhMultipleValue());
		Assert.assertEquals(CommonSymbols.EIGHT_INTEGER, Values.eighthMultipleValue());
		Assert.assertEquals(CommonSymbols.NINE_INTEGER, Values.nthMultipleValue(8));
		Assert.assertEquals(CommonSymbols.ZERO_INTEGER, Values.nthMultipleValue(9));
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
		UnitTest.testEvalEquals("1", "(values 1 2 3 4 5 6 7 8 9 0)");
		Assert.assertEquals(CommonSymbols.ONE_INTEGER, Values.firstMultipleValue());
		Assert.assertEquals(CommonSymbols.TWO_INTEGER, Values.secondMultipleValue());
		Assert.assertEquals(CommonSymbols.THREE_INTEGER, Values.thirdMultipleValue());
		Assert.assertEquals(CommonSymbols.FOUR_INTEGER, Values.fourthMultipleValue());
		Assert.assertEquals(CommonSymbols.FIVE_INTEGER, Values.fifthMultipleValue());
		Assert.assertEquals(CommonSymbols.SIX_INTEGER, Values.sixthMultipleValue());
		Assert.assertEquals(CommonSymbols.SEVEN_INTEGER, Values.seventhMultipleValue());
		Assert.assertEquals(CommonSymbols.EIGHT_INTEGER, Values.eighthMultipleValue());
		Assert.assertEquals(CommonSymbols.NINE_INTEGER, Values.nthMultipleValue(8));
		Assert.assertEquals(CommonSymbols.ZERO_INTEGER, Values.nthMultipleValue(9));
		UnitTest.testEvalEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
		UnitTest.testEvalNotEqualsObj(Values.getMultipleValues(), "'(1 2 3 4 5 6 7 8 9 0)");
		Values.resetMultipleValues();
	}

	public static void testNconc() {
		UnitTest.testEvalEquals("nil", "(nconc)");
		UnitTest.testEvalEquals("1", "(nconc 1)");
		UnitTest.testEvalEquals("'(a b)", "(nconc '(a) '(b))");
		UnitTest.testEvalEquals("'(a b c)", "(nconc '(a) '(b) '(c))");
		UnitTest.testEvalEquals("'(a b d)", "(nconc '(a) '(b . c) '(d))");
		UnitTest.testEvalEquals("'(a)", "(nconc '(a . b) nil)");
		UnitTest.testEvalEquals("'(a . b)", "(nconc '(a) 'b)");
		UnitTest.testEvalEquals("t", "(nconc nil t)");
		UnitTest.testEvalEquals("'(a . b)", "(nconc '(a) nil 'b)");
		UnitTest.testEvalEquals("t", "(nconc nil nil t)");
		UnitTest.testEvalEquals("nil", "(nconc nil nil nil)");
		UnitTest.testEvalEquals("1", "(nconc nil nil 1)");
		UnitTest.testEvalError("(nconc 1 nil)");
	}

	public static void testNilEvaluation() {
		UnitTest.testEvalEqualsObj(CommonSymbols.NIL, "NIL");
	}

	public static void testNumberComparison() {
		UnitTest.testEvalEquals("T", "(> 2 1)");
		UnitTest.testEvalEquals("NIL", "(> 1 2)");
		UnitTest.testEvalEquals("T", "(>= 2 1)");
		UnitTest.testEvalEquals("NIL", "(>= 1 2)");
		UnitTest.testEvalEquals("NIL", "(< 2 1)");
		UnitTest.testEvalEquals("T", "(< 1 2)");
		UnitTest.testEvalEquals("NIL", "(<= 2 1)");
		UnitTest.testEvalEquals("T", "(<= 1 2)");
		UnitTest.testEvalEquals("T", "(< 50000000000000 50000000000001)");
		UnitTest.testEvalEquals("NIL", "(> 50000000000000 50000000000001)");
		UnitTest.testEvalEquals("NIL", "(> 413696 17976931348623157)");
		UnitTest.testEvalEquals("NIL", "(> 413696 179769313486231570000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 1797693134862315700000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 17976931348623157000000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 179769313486231570000000)"); // this
																				// is
		// the
		// first
		// one
		// that
		// used
		// to
		// fail
		UnitTest.testEvalEquals("NIL", "(> 413696 1797693134862315700000000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 17976931348623157000000000000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 179769313486231570000000000000000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 179769313486231570000000000000000000000)");
		UnitTest.testEvalEquals("NIL", "(> 413696 17976931348623157000000000000000000000000000000000000000000000000)");
		UnitTest.testEvalEquals("NIL",
				"(> 413696 1797693134862315700000000000000000000000000000000000000000000000000000000000000000000000000000000000)");
		UnitTest.testEvalEquals("NIL",
				"(> 413696 17976931348623157000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000)");
		UnitTest.testEvalEquals("NIL",
				"(> 413696 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000)");
		// @todo do more <, >, <=, >= etc for various sizes of numbers
	}

	public static void testNumberEquality() {
		UnitTest.testEvalEquals("NIL", "(equal 0 0.0)");
		UnitTest.testEvalEquals("T", "(= 0 0.0)");
		UnitTest.testEvalEquals("T", "(equalp 0 0.0)");
	}

	public static void testNumberFormats() {
		// testEvalError("");
		// testEvalEquals("", "");
		UnitTest.testEvalOfType("0", SubLFixnum.class);
		UnitTest.testEvalOfType("-0", SubLFixnum.class);
		UnitTest.testEvalOfType("+6", SubLFixnum.class);
		UnitTest.testEvalOfType("28", SubLFixnum.class);
		UnitTest.testEvalOfType("1024.", SubLFixnum.class);
		UnitTest.testEvalOfType("15511210043330985984000000", SubLBigIntBignum.class);
		UnitTest.testEvalOfType("212", SubLFixnum.class);
		UnitTest.testEvalOfType("-212", SubLFixnum.class);
		UnitTest.testEvalOfType("212.", SubLFixnum.class);
		UnitTest.testEvalOfType("-212.", SubLFixnum.class);
		UnitTest.testEvalOfType("" + Integer.MAX_VALUE / 20, SubLIntegerBignum.class);
		UnitTest.testEvalOfType("" + Long.MAX_VALUE / 20, SubLLongBignum.class);
		UnitTest.testEvalOfType("9999999999999999999999999999999999999999999999999999", SubLBigIntBignum.class);
		UnitTest.testEvalOfType("#22R01H", SubLFixnum.class);
		UnitTest.testEvalOfType("#3r012", SubLFixnum.class);
		UnitTest.testEvalOfType("#3r012", SubLFixnum.class);
		UnitTest.testEvalEquals("212", "212.");
		UnitTest.testEvalEquals("+212", "212.");
		UnitTest.testEvalEquals("+212.", "212");
		UnitTest.testEvalEquals("+212", "212");
		UnitTest.testEvalEquals("212", "#2r11010100");
		UnitTest.testEvalEquals("212", "#b11010100");
		UnitTest.testEvalEquals("212", "#b+11010100");
		UnitTest.testEvalEquals("-212", "#b-11010100");
		UnitTest.testEvalEquals("212", "#o324");
		UnitTest.testEvalEquals("212", "#xD4");
		UnitTest.testEvalEquals("212", "#16r+D4");
		UnitTest.testEvalEquals("-192", "#O-300");
		UnitTest.testEvalEquals("-192", "#3r-21010");
		UnitTest.testEvalEquals("-192", "#25R-7H");
		UnitTest.testEvalEquals("181202413", "#xACCEDED");
		UnitTest.testEvalOfType("0E0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("+0E+0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("-0E-0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("+0E-0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("-0E+0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("+0E0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0E+0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("-0E0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("-0E-0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("-.0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("+.0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType(".0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0s0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0S0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0f0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0F0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0d0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0D0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0l0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0L0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0e0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("0.0E0", SubLDoubleFloat.class);
		UnitTest.testEvalEquals("1.0", "1.0s0");
		UnitTest.testEvalEquals("1.0", "1.0S0");
		UnitTest.testEvalEquals("1.0", "1.0f0");
		UnitTest.testEvalEquals("1.0", "1.0F0");
		UnitTest.testEvalEquals("1.0", "1.0d0");
		UnitTest.testEvalEquals("1.0", "1.0D0");
		UnitTest.testEvalEquals("1.0", "1.0l0");
		UnitTest.testEvalEquals("1.0", "1.0L0");
		UnitTest.testEvalEquals("1.0", "1.0e0");
		UnitTest.testEvalEquals("1.0", "1.0E0");
		UnitTest.testEvalOfType("3.141592653589793284d0", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("6.02e+21", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("602E+21", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("3.101029995f-1", SubLDoubleFloat.class);
		UnitTest.testEvalOfType("-0.000000001s9", SubLDoubleFloat.class);
		UnitTest.testEvalEquals("4136.96", "(read-from-string \" 4136.96\")");
		UnitTest.testEvalEquals("'(100 3)", "(multiple-value-list (parse-integer \"100\"))");
		UnitTest.testEvalError("(multiple-value-list (parse-integer \"100t\"))");
		UnitTest.testEvalEquals("'(10 2)", "(multiple-value-list (parse-integer \"100t\" 0 2))");
		UnitTest.testEvalEquals("'(255 3)", "(multiple-value-list (parse-integer \"0ff\" 0 3 16))");
		UnitTest.testEvalEquals("'(32 3)", "(multiple-value-list (parse-integer \"32\n\"))");
		UnitTest.testEvalEquals("'(100 3)", "(multiple-value-list (parse-integer \"100t\" 0 4 10 t))");
	}

	public static void testOneNonSelfEvaluation(String str) {
		UnitTest.shouldPrintTests("Testing that " + str + " is not self-evaluating...");
		SubLString strTyped = SubLObjectFactory.makeString(str);
		SubLObject form = reader.read_from_string(strTyped, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		Object result = form.eval(env);
		Assert.assertFalse(form.equals(result));
		System.out.println("Success.");
	}

	/** Throws an error if STR, after parsing, does not evaluate to itself. */
	public static void testOneSelfEvaluation(String str) {
		UnitTest.shouldPrintTests("Testing that " + str + " is self-evaluating...");
		SubLString strTyped = SubLObjectFactory.makeString(str);
		SubLObject form = reader.read_from_string(strTyped, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED,
				CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		SubLEnvironment env = SubLEnvironment.currentEnvironment();
		Object result = form.eval(env);
		Assert.assertEquals(form, result);
		// System.out.println("Success.");
	}

	public static void testOptionalArgEvaluation() {
		// @hack thing of a better function to use -- process
		// id's are very nebulous thing in JRTL and likely to change -APB
		UnitTest.testEvalEquals("0", "(get-process-id 212)");
		UnitTest.testEvalEquals("0", "(get-process-id)");
		UnitTest.testEvalError("(get-process-id 1 2)");
		UnitTest.testEvalError("(get-process-id . 1)");
		UnitTest.testEvalError("(get-process-id 1 . 2)");
	}

	public static void testPackageFunctions() {
		UnitTest.testEvalOfType("(csetq *new-package* (make-package \"blah\" nil nil))", SubLPackage.class);
		UnitTest.testEvalError("(make-package \"cyc\" nil nil)"); // duplicate
		UnitTest.testEvalError("(make-package \"cYc\" nil nil)"); // duplicate

		UnitTest.testEvalEquals("\"BLAH\"", "(package-name *new-package*)");
		UnitTest.testEvalError("(package-name NIL)");
		UnitTest.testEvalError("(package-name 11)");

		UnitTest.testEvalEquals("NIL", "(package-use-list *new-package*)");
		UnitTest.testEvalEquals("(list (find-package \"SUBLISP\"))", "(package-use-list (find-package \"CYC\"))");
		UnitTest.testEvalEquals("NIL", "(package-use-list (find-package \"SUBLISP\"))");
		UnitTest.testEvalEquals("NIL", "(package-use-list (find-package \"KEYWORD\"))");
		UnitTest.testEvalError("(package-use-list NIL)");
		UnitTest.testEvalError("(package-use-list)");
		UnitTest.testEvalError("(package-use-list 123)");

		UnitTest.testEvalEquals("NIL", "(package-used-by-list *new-package*)");
		UnitTest.testEvalEquals("(list (find-package \"CYC\"))", "(package-used-by-list (find-package \"SUBLISP\"))");
		UnitTest.testEvalEquals("NIL", "(package-used-by-list (find-package \"CYC\"))");
		UnitTest.testEvalEquals("NIL", "(package-used-by-list (find-package \"KEYWORD\"))");
		UnitTest.testEvalError("(package-used-by-list NIL)");
		UnitTest.testEvalError("(package-used-by-list)");
		UnitTest.testEvalError("(package-used-by-list (find-package \"KEYWORD\") nil)");

		UnitTest.testEvalEquals("NIL", "(package-nicknames *new-package*)");
		UnitTest.testEvalEquals("(list \"SL\")", "(package-nicknames (find-package \"SUBLISP\"))");
		UnitTest.testEvalEquals("NIL", "(package-nicknames (find-package \"CYC\"))");
		UnitTest.testEvalEquals("NIL", "(package-nicknames (find-package \"KEYWORD\"))");
		UnitTest.testEvalError("(package-nicknames NIL)");
		UnitTest.testEvalError("(package-nicknames)");
		UnitTest.testEvalError("(package-nicknames (find-package \"KEYWORD\") nil)");

		UnitTest.testEvalEquals("NIL", "(package-locked-p *new-package*)");
		UnitTest.testEvalEquals("T", "(package-locked-p (find-package \"SUBLISP\"))");
		UnitTest.testEvalEquals("NIL", "(package-locked-p (find-package \"CYC\"))");
		UnitTest.testEvalEquals("NIL", "(package-locked-p (find-package \"KEYWORD\"))");
		UnitTest.testEvalError("(package-locked-p NIL)");
		UnitTest.testEvalError("(package-locked-p)");
		UnitTest.testEvalError("(package-nicknames (find-package \"KEYWORD\") nil)");

		// @todo test package-lock -- this probably shouldn't be exposed
		// publicly
		// @todo test package_shadowing_symbols when it is implemented

		UnitTest.testEvalEquals("*new-package*", "(find-package \"BLAH\")");
		UnitTest.testEvalEquals("nil", "(find-package \"blah\")");
		UnitTest.testEvalEquals("nil", "(find-package \"bLAh\")");
		UnitTest.testEvalEquals("*new-package*", "(find-package 'bLAh)");

		UnitTest.testEvalOfType("(csetq *tmp-package-list* (list-all-packages))", SubLList.class);
		UnitTest.testEvalEquals("t", "(>= (position (find-package \"SUBLISP\") *tmp-package-list*) 0)");
		UnitTest.testEvalEquals("t", "(>= (position (find-package \"CYC\") *tmp-package-list*) 0)");
		UnitTest.testEvalEquals("t", "(>= (position (find-package \"KEYWORD\") *tmp-package-list*) 0)");
		UnitTest.testEvalEquals("t", "(>= (position (find-package \"BLAH\") *tmp-package-list*) 0)");
		UnitTest.testEvalEquals("nil", "(position (find-package \"ASFDSF\") *tmp-package-list*)");

		UnitTest.testEvalEquals("'SL::ASDFSDFVDSW", "(intern 'ASDFSDFVDSW \"SUBLISP\")");
		UnitTest.testEvalEquals(":INTERNAL", "(second (multiple-value-list (intern 'ASDFSDFVDSW \"SUBLISP\")))");
		UnitTest.testEvalEquals(":EXTERNAL", "(second (multiple-value-list (intern 'CONS :SL)))");
		UnitTest.testEvalEquals(":INHERITED", "(second (multiple-value-list (intern 'CONS :CYC)))");
		UnitTest.testEvalError("'SL:POPOPOPOP");

		UnitTest.testEvalEquals("(find-package \"SUBLISP\")", "(symbol-package 'ASDFSDFVDSW)");

		UnitTest.testEvalEquals("(find-package \"CYC\")", "*PACKAGE*");
		UnitTest.testEvalOfType("(in-package \"BLAH\")", SubLPackage.class);
		UnitTest.testEvalEquals("(sl:find-package \"BLAH\")", "sl:*PACKAGE*");
		UnitTest.testEvalOfType("(sl:in-package \"CYC\")", SubLPackage.class);
		UnitTest.testEvalEquals("(find-package \"CYC\")", "*PACKAGE*");
		UnitTest.testEvalError("(in-package \"SDF\")");

		// @todo add tests for unintern, make-keyword

		UnitTest.testEvalEquals("'*PACKAGE*", "(find-symbol \"*PACKAGE*\" (find-package \"SL\"))");
		UnitTest.testEvalEquals("'*PACKAGE*", "(find-symbol \"*PACKAGE*\" (find-package \"CYC\"))");
		UnitTest.testEvalEquals("NIL", "(find-symbol \"*PACKAGe*\" (find-package \"SL\"))");

		// @todo test the second return value of find-symbol

		// @todo add test for import, export, unexport, apropos, print-package
		UnitTest.testEvalEquals(":INTERNAL", "(second (multiple-value-list (find-symbol \"ASDFSDFVDSW\" :SL)))");
		UnitTest.testEvalEquals(":EXTERNAL", "(second (multiple-value-list (find-symbol \"CONS\" :SL)))");
		UnitTest.testEvalEquals(":INHERITED", "(second (multiple-value-list (find-symbol \"CONS\" :CYC)))");
	}

	public static void testPcond() {
		UnitTest.testEvalEquals("NIL", "(pcond)");
		UnitTest.testEvalEquals("NIL", "(pcond ())");
		UnitTest.testEvalEquals("NIL", "(pcond nil)");
		UnitTest.testEvalEquals("212", "(pcond (t 212))");
		UnitTest.testEvalEquals("212", "(pcond ((identity t) 212))");
		UnitTest.testEvalEquals("212", "(pcond (nil nil) (t 212))");
		UnitTest.testEvalEquals("212", "(pcond (nil nil) ((identity t) 212))");
		UnitTest.testEvalEquals("212", "(pcond (nil nil) (212))");
		UnitTest.testEvalEquals("NIL", "(pcond (nil 212) (212 nil))");
		UnitTest.testEvalEquals("212",
				"(pcond (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (nil nil) (t 212))");
		UnitTest.testEvalEquals("NIL", "(pcond (nil 212) (212 4 3 2 1 nil))");
		UnitTest.testEvalEquals("NIL", "(pcond (nil 212) (212 4 3 2 1 nil) (t t))");
		UnitTest.testEvalEquals("NIL", "(pcond nil (nil 212))");
		UnitTest.testEvalEquals("212", "(pcond nil (t 212))");
		UnitTest.testEvalError("(pcond 1)");
		UnitTest.testEvalError("(pcond . 1)");
		UnitTest.testEvalEquals("NIL", "(pcond nil)"); // @diff Allegro and Java
														// yield
		// NIL, C and CMUCL error
		UnitTest.testEvalError("(pcond nil . 1)");
		UnitTest.testEvalError("(pcond (nil nil) 1)");
		UnitTest.testEvalError("(pcond (nil nil) . 1)");
	}

	public static void testPif() {
		UnitTest.testEvalEquals("1", "(pif t 1 2)");
		UnitTest.testEvalEquals("2", "(pif nil 1 2)");
		UnitTest.testEvalEquals("1", "(pif (identity t) 1 2)");
		UnitTest.testEvalEquals("2", "(pif (identity nil) 1 2)");
		UnitTest.testEvalEquals("2", "(pif t (progn 1 2) nil)");
		UnitTest.testEvalEquals("2", "(pif nil nil (progn 1 2))");
		UnitTest.testEvalEquals("NIL", "(pif)"); // @diff Allegro and CMUCL
													// error, C and
		// Java don't
		UnitTest.testEvalEquals("NIL", "(pif t)"); // @diff Allegro and CMUCL
													// error, C
		// and Java don't
		UnitTest.testEvalEquals("1", "(pif t 1)"); // @diff Allegro and CMUCL
													// error, C
		// and Java don't
		UnitTest.testEvalEquals("1", "(pif t 1 2 3)"); // @diff Allegro and
														// CMUCL error,
		// C and Java don't
		UnitTest.testEvalError("(pif . t)");
		UnitTest.testEvalError("(pif t . 1)");
		UnitTest.testEvalEquals("1", "(pif t 1 . 2)"); // @diff Allegro and
														// CMUCL error,
		// C and Java don't
		UnitTest.testEvalError("(pif nil 1 . 2)");
		UnitTest.testEvalEquals("1", "(pif t 1 2 . 3)"); // @diff Allegro and
															// CMUCL
		// error, C and Java don't
		UnitTest.testEvalEquals("2", "(pif nil 1 2 . 3)"); // @diff Allegro and
															// CMUCL
		// error, C and Java don't
	}

	public static void testPolymorphic() {
		/*
		 * commented out since the cfasl and dictionaries are not part of SubL
		 * kernel
		 * shouldPrintTests("Testing polymorphic function infrastructure ....");
		 * // this requires CycL to be present to suceeed
		 * readAndEval("(cfasl-encode-externalized 212)");
		 *
		 * // printer tests // requires CycL to be defined shouldPrintTests(
		 * "Whether structures toString() method uses print ...." ); SubLObject
		 * dictionary = readAndEval("(new-dictionary)"); String dictAsString =
		 * dictionary.toString();
		 * Assert.assertEquals("The toString() method returned " + dictAsString
		 * + " but not something reasonable", true,
		 * dictAsString.indexOf("DICTIONARY") != -1);
		 */
	}

	public static void testPrinterControlVars() {
		SubLObject origPrintLenth = SubLObjectFactory.makeSublispSymbol("*PRINT-LENGTH*").getValue();
		SubLObject origPrintDepth = SubLObjectFactory.makeSublispSymbol("*PRINT-LEVEL*").getValue();
		try {
			SubLObjectFactory.makeSublispSymbol("*PRINT-LENGTH*").setValue(CommonSymbols.EIGHT_INTEGER);
			SubLObjectFactory.makeSublispSymbol("*PRINT-LEVEL*").setValue(CommonSymbols.EIGHT_INTEGER);
			UnitTest.shouldPrintTests("Testing the printer control vars on lists ....");
			SubLObject list = UnitTest.readAndEval("'(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)");
			String representation = list.toString();
			Assert.assertEquals("There are no elipses in the terribly long list.", true,
					representation.indexOf("...") != -1);
			UnitTest.shouldPrintTests("Truncating via *PRINT-LENGTH* results in " + representation);
			list = UnitTest.readAndEval("'(1 (2 (3 (4 (5 (6 (7 (8 (9 (10 (11 (12 0 1 2 3))))))))))))");
			representation = list.toString();
			Assert.assertEquals("There are no omission-marks in the terribly deep list.", true,
					representation.indexOf("#") != -1);
			UnitTest.shouldPrintTests("Truncating via *PRINT-LEVEL* results in " + representation);
			// vectors
			UnitTest.shouldPrintTests("Testing the printer control vars on vectors ....");
			SubLObject vector = UnitTest.readAndEval("'#(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)");
			representation = vector.toString();
			Assert.assertEquals("There are no elipses in the terribly long vector.", true,
					representation.indexOf("...") != -1);
			UnitTest.shouldPrintTests("Truncating via *PRINT-LENGTH* results in " + representation);
			vector = UnitTest.readAndEval("'#(1 #(2 #(3 #(4 #(5 #(6 #(7 #(8 #(9 #(10 #(11 #(12 0 1 2 3))))))))))))");
			representation = vector.toString();
			Assert.assertEquals("There are no omission-marks in the terribly deep vector.", true,
					representation.indexOf(" # ") != -1);
			UnitTest.shouldPrintTests("Truncating via *PRINT-LEVEL* results in " + representation);
		} finally {
			SubLObjectFactory.makeSublispSymbol("*PRINT-LENGTH*").setValue(origPrintLenth);
			SubLObjectFactory.makeSublispSymbol("*PRINT-LEVEL*").setValue(origPrintDepth);
		}
	}

	public static void testProcesses() {
		/*
		 * (deflexical *test-val-203944* 1) (define inc-val () (csetq
		 * *test-val-203944* (+ *test-val-203944* 1)) (ret *test-val-203944*))
		 * test-val-203944* == 1 (make-process "test-process" 'inc-val) wait 2
		 * seconds test-val-203944* == 2
		 */
		try {
			UnitTest.readAndEval("(deflexical *test-val-203944* 1)");
			UnitTest.readAndEval(
					"(define inc-val () (csetq *test-val-203944* (+ *test-val-203944* 1)) (ret *test-val-203944*))");
			UnitTest.testEvalEquals("1", "*test-val-203944*");
			UnitTest.readAndEval("(make-process \"test-process\" 'inc-val)");
			Thread.currentThread();
			Thread.sleep(2000); // @hack this is arbitrary!!!
			UnitTest.testEvalEquals("2", "*test-val-203944*");
			UnitTest.readAndEval("(make-process \"test-process\" 'inc-val)");
			Thread.currentThread();
			Thread.sleep(2000); // @hack this is arbitrary!!!
			UnitTest.testEvalEquals("3", "*test-val-203944*");
		} catch (InterruptedException ie) {
			Thread.currentThread().interrupt();
		}
		// @todo add more tests
	}

	public static void testProgn() {
		UnitTest.testEvalEquals("NIL", "(progn)");
		UnitTest.testEvalEquals("212", "(progn 212)");
		UnitTest.testEvalEquals("212", "(progn 1 2 3 212)");
		UnitTest.testEvalEquals("212", "(progn 1 2 3 (identity (progn 4 (identity 212))))");
		UnitTest.testEvalError("(progn . 212)");
	}

	public static void testPunless() {
		UnitTest.testEvalEquals("NIL", "(punless t)");
		UnitTest.testEvalEquals("NIL", "(punless nil)");
		UnitTest.testEvalEquals("NIL", "(punless t 212)");
		UnitTest.testEvalEquals("NIL", "(punless (identity 212) 212)");
		UnitTest.testEvalEquals("212", "(punless nil 212)");
		UnitTest.testEvalEquals("212", "(punless (identity nil) 212)");
		UnitTest.testEvalEquals("212", "(punless nil 1 2 3 212)");
		UnitTest.testEvalEquals("212", "(punless nil 1 2 3 (progn 212))");
		UnitTest.testEvalEquals("NIL", "(punless)"); // @diff C and Java yield
														// NIL,
		// Allegro and CMUCL error
		UnitTest.testEvalError("(punless . 1)");
		UnitTest.testEvalEquals("nil", "(punless 1 . 2)"); // @diff
															// C/Allegro/Java
															// yield
		// NIL, CMUCL errors
		UnitTest.testEvalEquals("NIL", "(punless 1 2 . 3)"); // @diff
																// C/Allegro/Java
		// yield NIL, CMUCL errors
		// testEvalError("(punless nil 2 . 3)");
	}

	public static void testPwhen() {
		UnitTest.testEvalEquals("NIL", "(pwhen t)");
		UnitTest.testEvalEquals("NIL", "(pwhen nil)");
		UnitTest.testEvalEquals("NIL", "(pwhen nil 212)");
		UnitTest.testEvalEquals("NIL", "(pwhen (identity nil) 212)");
		UnitTest.testEvalEquals("212", "(pwhen t 212)");
		UnitTest.testEvalEquals("212", "(pwhen 42 212)");
		UnitTest.testEvalEquals("212", "(pwhen 42 1 2 3 212)");
		UnitTest.testEvalEquals("212", "(pwhen 42 1 2 3 (progn 212))");
		UnitTest.testEvalEquals("NIL", "(pwhen)"); // @diff C and Java yield
													// NIL, Allegro
		// and CMUCL error
		UnitTest.testEvalError("(pwhen . 1)");
		UnitTest.testEvalError("(pwhen 1 . 2)"); // @diff C/Allegro/Java yield
													// NIL, CMUCL
		// errors
		UnitTest.testEvalEquals("NIL", "(pwhen NIL 2 . 3)"); // @diff
																// C/Allegro/Java
		// yield NIL, CMUCL errors
		// testEvalError("(pwhen 1 2 . 3)");
	}

	public static void testQueues() {
		/*
		 * Removing these test -- queues are not part of the SubL kernel
		 * testEvalOfType("(csetq q (create-queue))", SubLStruct.class);
		 * testEvalEquals("0", "(queue-size q)"); testEvalEquals("0",
		 * "(length (queue-elements q))"); testEvalOfType("(enqueue 1 q)",
		 * SubLStruct.class); testEvalEquals("1", "(queue-size q)");
		 * testEvalEquals("1", "(length (queue-elements q))");
		 * testEvalOfType("(enqueue 2 q)", SubLStruct.class);
		 * testEvalEquals("2", "(queue-size q)"); testEvalEquals("2",
		 * "(length (queue-elements q))"); testEvalOfType("(enqueue 3 q)",
		 * SubLStruct.class); testEvalEquals("3", "(queue-size q)");
		 * testEvalEquals("3", "(length (queue-elements q))");
		 * testEvalOfType("(enqueue 3 q)", SubLStruct.class);
		 * testEvalEquals("4", "(queue-size q)"); testEvalEquals("4",
		 * "(length (queue-elements q))"); testEvalOfType("(enqueue 4 q)",
		 * SubLStruct.class); testEvalEquals("5", "(queue-size q)");
		 * testEvalEquals("5", "(length (queue-elements q))");
		 * testEvalOfType("(enqueue 3 q)", SubLStruct.class);
		 * testEvalEquals("6", "(queue-size q)"); testEvalEquals("6",
		 * "(length (queue-elements q))"); testEvalEquals("1", "(dequeue q)");
		 * testEvalEquals("5", "(queue-size q)"); testEvalEquals("5",
		 * "(length (queue-elements q))"); testEvalOfType("(remqueue 3 q)",
		 * SubLStruct.class); testEvalEquals("2", "(queue-size q)");
		 * testEvalEquals("2", "(length (queue-elements q))");
		 * testEvalEquals("2", "(dequeue q)"); testEvalEquals("1",
		 * "(queue-size q)"); testEvalEquals("1",
		 * "(length (queue-elements q))"); testEvalEquals("4", "(dequeue q)");
		 * testEvalEquals("0", "(queue-size q)"); testEvalEquals("0",
		 * "(length (queue-elements q))");
		 */
	}

	public static void testQuote() {
		UnitTest.testEvalEquals("NIL", "(quote NIL)");
		UnitTest.testEvalEquals("212", "(quote 212)");
		UnitTest.testEvalEquals("\"Foo\"", "(quote \"Foo\")");
		UnitTest.testEvalEquals("(quote (1 2 3))", "(identity (quote (1 2 3)))");
		UnitTest.testEvalEquals("NIL", "'NIL");
		UnitTest.testEvalEquals("212", "'212");
		UnitTest.testEvalEquals("\"Foo\"", "'\"Foo\"");
		UnitTest.testEvalEquals("(quote (1 2 3))", "(identity '(1 2 3))");
		UnitTest.testEvalEquals("NIL", "(quote)"); // @diff C/Allegro/Java yield
													// NIL but
		// CMUCL errors
		UnitTest.testEvalEquals("1", "(quote 1 2)"); // @diff C/Allegro/Java
														// yield 1 but
		// CMUCL errors
		UnitTest.testEvalEquals("1", "(quote 1 . 2)"); // @diff C/Allegro/Java
														// yield 1
		// but CMUCL errors
	}

	public static void testReadloopErrorHandling() {
		// @todo test restarts with errors, cerrors and break
		/*
		 * (clet ((result 0)) (with-simple-restart (:outer "outer target")
		 * (with-simple-restart (:inner "inner target") (aref (vector 1 2 3) 10)
		 * ;; java internal error (csetq result (+ result 1))) (csetq result (+
		 * result 10))) (csetq result (+ result 100)) result) (clet ((result 0))
		 * (with-simple-restart (:outer "outer target") (with-simple-restart
		 * (:inner "inner target") (/ 0) ;; subl exception (aref (vector 1 2 3)
		 * 10) (csetq result (+ result 1))) (csetq result (+ result 10))) (csetq
		 * result (+ result 100)) result) (clet ((result 0))
		 * (with-simple-restart (:outer "outer target") (with-simple-restart
		 * (:inner "inner target") (break "blah") (csetq result (+ result 1)))
		 * (csetq result (+ result 10))) (csetq result (+ result 100)) result)
		 * (clet ((result 0)) (with-simple-restart (:outer "outer target")
		 * (with-simple-restart (:inner "inner target") (cerror "blah") (csetq
		 * result (+ result 1))) (csetq result (+ result 10))) (csetq result (+
		 * result 100)) result)
		 */
		// @todo test ignore breaks
		// @todo test break on error
	}

	public static void testReadSequence() {
		// String Buffer - Text Stream
		UnitTest.testEvalEquals("'(6 \"++exam++++\")",
				"(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
		UnitTest.testEvalEquals("'(9 \"++example+\")",
				"(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
		UnitTest.testEvalEquals("'(5 \"++exa\")",
				"(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
		UnitTest.testEvalEquals("'(6 \"++exam++++\")",
				"(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
		// Vector Buffer - Text Stream
		UnitTest.testEvalEquals("'(6 #(#\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
				"(clet ((string (make-vector 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
		UnitTest.testEvalEquals("'(9 #( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\p #\\l #\\e #\\+))",
				"(clet ((string (make-vector 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
		UnitTest.testEvalEquals("'(5 #( #\\+ #\\+ #\\e #\\x #\\a))",
				"(clet ((string (make-vector 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
		UnitTest.testEvalEquals("'(6 #( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
				"(clet ((string (make-vector 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
		// List Buffer - Text Stream
		UnitTest.testEvalEquals("'(6 ( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
				"(clet ((string (make-list 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))");
		UnitTest.testEvalEquals("'(9 ( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\p #\\l #\\e #\\+))",
				"(clet ((string (make-list 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
		UnitTest.testEvalEquals("'(5 ( #\\+ #\\+ #\\e #\\x #\\a))",
				"(clet ((string (make-list 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))");
		UnitTest.testEvalEquals("'(6 ( #\\+ #\\+ #\\e #\\x #\\a #\\m #\\+ #\\+ #\\+ #\\+))",
				"(clet ((string (make-list 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))");
		/*
		 * // String Buffer - Binary Stream
		 * testEvalEquals("'(6 \"++exam++++\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))"
		 * ); testEvalEquals("'(9 \"++example+\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))"
		 * ); testEvalEquals("'(5 \"++exa\")",
		 * "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))"
		 * ); testEvalEquals("'(6 \"++exam++++\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))"
		 * ); // Vector Buffer - Binary Stream
		 * testEvalEquals("'(6 \"++exam++++\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))"
		 * ); testEvalEquals("'(9 \"++example+\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))"
		 * ); testEvalEquals("'(5 \"++exa\")",
		 * "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))"
		 * ); testEvalEquals("'(6 \"++exam++++\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))"
		 * ); // List Buffer - Binary Stream
		 * testEvalEquals("'(6 \"++exam++++\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 6) string))"
		 * ); testEvalEquals("'(9 \"++example+\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))"
		 * ); testEvalEquals("'(5 \"++exa\")",
		 * "(clet ((string (make-string 5 #\\+))) (list (read-sequence string (make-string-input-stream \"example\") 2 nil) string))"
		 * ); testEvalEquals("'(6 \"++exam++++\")",
		 * "(clet ((string (make-string 10 #\\+))) (list (read-sequence string (make-string-input-stream \"exam\") 2 nil) string))"
		 * );
		 */
	}

	public static void testRestArgEvaluation() {
		UnitTest.testEvalEquals("212", "(+ 1 211)");
		UnitTest.testEvalEquals("212", "(identity (+ (identity 1) (identity 211)))");
		UnitTest.testEvalEquals("212",
				"(+ 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1)");
		UnitTest.testEvalError("(+ 1 . 2)");
	}

	public static void testSelfEvaluation() {
		// stub
		System.out.println();
		try {
			UnitTest.testOneSelfEvaluation("NIL");
			UnitTest.testOneSelfEvaluation("T");
			UnitTest.testOneSelfEvaluation("KEYWORD:FOO");
			UnitTest.testOneSelfEvaluation(":FOO");
			UnitTest.testOneSelfEvaluation("212");
			UnitTest.testOneSelfEvaluation("#\\a");
			UnitTest.testOneSelfEvaluation("\"foo\"");
			UnitTest.testOneSelfEvaluation("99999999999999999999999999999999999999999999999");
			UnitTest.testOneSelfEvaluation("3.14159265357989");

			UnitTest.testOneNonSelfEvaluation("(identity 212)");
			UnitTest.testOneNonSelfEvaluation("(progn)");

		} catch (AssertionFailedError afe) {
			// afe.printStackTrace(System.out);
			throw afe;
		}
	}

	public static void testSequenceFunctions() {
		// testEvalEquals("\"\"", "\"\"");
		// testEvalEquals("", "");

		// @todo make sure that lists that get modified to have 0 items return
		// NIL

		// length
		UnitTest.testEvalEquals("3", "(length \"abc\")");
		UnitTest.testEvalEquals("4", "(length '(a b c d))");
		UnitTest.testEvalEquals("5", "(length #(a b '(c d) e f))");
		UnitTest.testEvalEquals("0", "(length nil)");
		UnitTest.testEvalError("(length 4.32)");
		UnitTest.testEvalError("(length -32)");
		UnitTest.testEvalError("(length 'a)");
		UnitTest.testEvalError("(length)");
		UnitTest.testEvalError("(length '(a b c) '(a b c))");
		// elt
		UnitTest.testEvalEquals("#\\a", "(elt \"abc\" 0)");
		UnitTest.testEvalEquals("#\\b", "(elt \"abc\" 1)");
		UnitTest.testEvalEquals("#\\c", "(elt \"abc\" 2)");
		UnitTest.testEvalEquals("'d", "(elt '(a b c d) 3)");
		UnitTest.testEvalEquals("'(c d)", "(elt #(a b (c d) e f) 2)"); // @todo
																		// verify
		// this one
		// testEvalError("(elt nil 0)");
		UnitTest.testEvalError("(elt 4.32 0)");
		UnitTest.testEvalError("(elt -32 2)");
		UnitTest.testEvalError("(elt 'a 3)");
		UnitTest.testEvalError("(elt)");
		UnitTest.testEvalError("(elt \"abc\" -1)");
		UnitTest.testEvalError("(elt \"abc\" 3)");
		UnitTest.testEvalError("(elt '(a b c) 2 2)");
		// position
		UnitTest.testEvalEquals("1", "(position #\\a \"baobab\")");
		UnitTest.testEvalEquals("4", "(position #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("4", "(position #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(position #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(posItion #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("1", "(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(position #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("4", "(position #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("4", "(position #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(position #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("1", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(posItion #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(position #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("4", "(position #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("4", "(position #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(position #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("1", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(posItion #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalError("(posItion)"); // too few args
		UnitTest.testEvalError("(posItion 1)"); // too few args
		UnitTest.testEvalError("(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(posItion #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// position if
		UnitTest.testEvalEquals("4", "(position-if #'upper-case-p \"baobAb\")");
		UnitTest.testEvalEquals("2", "(position-if #'upper-case-p \"baobab\" #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("4", "(position-if #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(position-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(posItion-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("1", "(posItion-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(posItion-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(posItion-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(position-if #'upper-case-p '(#\\b #\\A 0 #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("2", "(position-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("4", "(position-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(position-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("1", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL",
				"(posItion-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(position-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("2", "(position-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("4", "(position-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(position-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("1", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("1", "(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL",
				"(posItion-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalError("(posItion-if)"); // too few args
		UnitTest.testEvalError("(posItion-if #'upper-case-p)"); // too few args
		UnitTest.testEvalError("(posItion-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(posItion-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion-if #'upper-case-p \"baobab\" 'a -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(posItion-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// remove
		UnitTest.testEvalEquals("\"bAobAb\"", "(remove #\\a \"bAobAb\")");
		UnitTest.testEvalEquals("\"bobb\"", "(remove #\\A \"bAobAb\")");
		UnitTest.testEvalEquals("\"bobb\"", "(remove #\\A \"baobab\" #'EQUALP)");
		UnitTest.testEvalEquals("\"baobb\"", "(remove #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("\"baobb\"", "(remove #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"baobab\"", "(remove #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"baobab\"", "(remove #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("\"bobb\"", "(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"bobb\"", "(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"baobab\"", "(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("'(#\\b #\\o #\\b #\\b)", "(remove #\\a '(#\\b #\\a #\\o #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\b)",
				"(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\b)",
				"(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\b)",
				"(remove #\\a '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(remove #\\a '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("'(#\\b #\\o #\\b #\\b)",
				"(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																								// verify
																								// this
		UnitTest.testEvalEquals("'(#\\b #\\o #\\b #\\b)",
				"(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																								// verify
																								// this
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(remove #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																								// verify
																								// this
		UnitTest.testEvalEquals("#(#\\b #\\o #\\b #\\b)", "(remove #\\a #(#\\b #\\a #\\o #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#(#\\b #\\o #\\b #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																								// verify
																								// this
		UnitTest.testEvalEquals("#(#\\b #\\o #\\b #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																								// verify
																								// this
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(remove #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																								// verify
																								// this
		UnitTest.testEvalError("(remove)"); // too few args
		UnitTest.testEvalError("(remove 1)"); // too few args
		UnitTest.testEvalError("(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(remove #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(remove #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(remove #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); // bad
																				// arg
		// types
		UnitTest.testEvalError("(remove #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(remove #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// remove-if
		UnitTest.testEvalEquals("\"baobb\"", "(remove-if #'upper-case-p \"baobAb\")");
		UnitTest.testEvalEquals("\"bA\"", "(remove-if #'upper-case-p \"bAobAb\" #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("\"bAobb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"baobab\"", "(remove-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"bAobAb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("\"bobb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"bobb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"bAobAb\"", "(remove-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("'(#\\b #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("'(#\\b #\\A)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b  #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("'(#\\b #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("'(#\\b #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(remove-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("#(#\\b #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("#(#\\b #\\A)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#(#\\b #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("#(#\\b #\\o #\\b #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(remove-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalError("(remove-if)"); // too few args
		UnitTest.testEvalError("(remove-if #'upper-case-p)"); // too few args
		UnitTest.testEvalError("(remove-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(remove-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(remove-if #'upper-case-p \"baobab\" 'a -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(remove-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(remove-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// remove-duplicates
		UnitTest.testDuplicateRemovalFunctions(false);
		UnitTest.testDuplicateRemovalFunctions(true);
		// find
		UnitTest.testEvalEquals("#\\a", "(find #\\a \"baobab\")");
		UnitTest.testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(find #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(find #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\a", "(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\a", "(find #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\a", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(find #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\a", "(find #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\a", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(find #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalError("(find)"); // too few args
		UnitTest.testEvalError("(find 1)"); // too few args
		UnitTest.testEvalError("(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(find #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); // bad
																				// arg
		// types
		UnitTest.testEvalError("(find #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); // bad
																				// arg
		// types
		UnitTest.testEvalError("(find #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); // bad
																				// arg
		// types
		UnitTest.testEvalError("(find #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(find #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// find-if
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p \"baobAb\")");
		UnitTest.testEvalEquals("#\\o", "(find-if #'upper-case-p \"baobab\" #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#\\B", "(find-if #'upper-case-p \"bAobaB\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(find-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(find-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(find-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A 0 #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("#\\o", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(find-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("#\\o", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("Nil", "(find-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("NiL", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("#\\A", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("NIL", "(find-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalError("(find-if)"); // too few args
		UnitTest.testEvalError("(find-if #'upper-case-p)"); // too few args
		UnitTest.testEvalError("(find-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(find-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(find-if #'upper-case-p \"baobab\" 'a -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(find-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(find-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// fill
		UnitTest.testEvalEquals("\"zzzzzz\"", "(fill \"BAoBAB\" #\\z)");
		UnitTest.testEvalEquals("'(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z)");
		UnitTest.testEvalEquals("#(#\\z #\\z #\\z #\\z #\\z #\\z)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z)");
		UnitTest.testEvalEquals("\"BAozzz\"", "(fill \"BAoBAB\" #\\z 3 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\z #\\z #\\z)", "(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z 3 6)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\z #\\z #\\z)", "(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z 3 6)");
		UnitTest.testEvalEquals("\"zzzzzz\"", "(fill \"BAoBAB\" #\\z -1 16)");
		UnitTest.testEvalEquals("'(#\\z #\\z #\\z #\\z #\\z #\\z)",
				"(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z -1 16)");
		UnitTest.testEvalEquals("#(#\\z #\\z #\\z #\\z #\\z #\\z)",
				"(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z -1 16)");
		UnitTest.testEvalEquals("\"zzzzzz\"", "(fill \"BAoBAB\" #\\z -1 NIL)");
		UnitTest.testEvalEquals("'(#\\z #\\z #\\z #\\z #\\z #\\z)",
				"(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z -1 NIL)");
		UnitTest.testEvalEquals("#(#\\z #\\z #\\z #\\z #\\z #\\z)",
				"(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z -1 NIL)");
		UnitTest.testEvalEquals("\"BAoBAB\"", "(fill \"BAoBAB\" #\\z -1 -1)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)",
				"(fill '(#\\b #\\A #\\o #\\b #\\a #\\b) #\\z -1 -1)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(fill #(#\\b #\\A #\\o #\\b #\\A #\\b) #\\z -1 -1)");
		UnitTest.testEvalError("(fill)"); // too few args
		UnitTest.testEvalError("(fill \"baobab\")"); // too few args
		UnitTest.testEvalError("(fill \"baobab\" NIL -1 NIL #\\A)"); // too many
																		// args
		UnitTest.testEvalError("(fill #\\A -1)"); // bad arg types
		UnitTest.testEvalError("(fill \"baobab\" -1 NIL)"); // bad arg types
		UnitTest.testEvalError("(fill #\"baoBab\" -1 'b)"); // bad arg types
		UnitTest.testEvalError("(fill #\"baoBab\" 'a)"); // bad arg types
		// test destructivity of sustitute and substitute-if
		UnitTest.testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)",
				"(csetq *test-substitute-list-2190384* '(0 9 1 3 2 4 0 0 1 6 5 7 8 0))");
		UnitTest.testEvalEquals("'(1 9 1 3 2 4 1 1 1 6 5 7 8 1)", "(substitute 1 0 *test-substitute-list-2190384*)");
		UnitTest.testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)", "*test-substitute-list-2190384*");
		UnitTest.testEvalEquals("'(#\\a 9 1 3 #\\a #\\a #\\a #\\a 1 #\\a 5 7 #\\a #\\a)",
				"(substitute-if #\\a #'evenp *test-substitute-list-2190384*)");
		UnitTest.testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)", "*test-substitute-list-2190384*");
		UnitTest.testEvalEquals("'(1 9 1 3 2 4 1 1 1 6 5 7 8 1)", "(nsubstitute 1 0 *test-substitute-list-2190384*)");
		UnitTest.testEvalEquals("'(1 9 1 3 2 4 1 1 1 6 5 7 8 1)", "*test-substitute-list-2190384*");
		UnitTest.testEvalEquals("'(0 9 1 3 2 4 0 0 1 6 5 7 8 0)",
				"(csetq *test-substitute-list-2190384* '(0 9 1 3 2 4 0 0 1 6 5 7 8 0))");
		UnitTest.testEvalEquals("'(#\\a 9 1 3 #\\a #\\a #\\a #\\a 1 #\\a 5 7 #\\a #\\a)",
				"(nsubstitute-if #\\a #'evenp *test-substitute-list-2190384*)");
		UnitTest.testEvalEquals("'(#\\a 9 1 3 #\\a #\\a #\\a #\\a 1 #\\a 5 7 #\\a #\\a)",
				"*test-substitute-list-2190384*");
		// substitute
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobAb\")");
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQ #'IDENTITY 0 NIL 2)");
		UnitTest.testEvalEquals("\"bAobab\"", "(substitute #\\A #\\a \"baobab\" #'EQ #'IDENTITY 0 NIL 1)");
		UnitTest.testEvalEquals("\"baobab\"", "(substitute #\\A #\\a \"baobab\" #'EQ #'IDENTITY 0 NIL 0)");
		UnitTest.testEvalEquals("\"baobab\"", "(substitute #\\a #\\A \"baobAb\" #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("\"baobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"baobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"baobab\"", "(substitute #\\A #\\a \"baobab\" #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"baobab\"", "(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("'(#\\b #\\a 0 #\\b #\\a #\\b)",
				"(substitute #\\a #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\U #\\b)",
				"(substitute #\\U #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\a 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\a 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\a 0 #\\b #\\a #\\b)",
				"(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("'(#\\b #\\A 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("'(#\\b #\\A 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("'(#\\b #\\a 0 #\\b #\\a #\\b)",
				"(substitute #\\A #\\a '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("#(#\\b #\\A 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\A #\\b)",
				"(substitute #\\A #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a 0 #\\b #\\a #\\b)",
				"(substitute #\\A #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\a 0 #\\b #\\a #\\b)",
				"(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#(#\\b #\\A 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("#(#\\b #\\A 0 #\\b #\\A #\\b)",
				"(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalEquals("#(#\\b #\\a 0 #\\b #\\a #\\b)",
				"(substitute #\\A #\\a #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
																									// verify
																									// this
		UnitTest.testEvalError("(substitute)"); // too few args
		UnitTest.testEvalError("(substitute #\\A)"); // too few args
		UnitTest.testEvalError("(substitute #\\A #\\a)"); // too few args
		UnitTest.testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(substitute #\\A #\\a #\\A #'EQUALP #'IDENTITY -1 NIL NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute #\\A #\\a \"baobab\" 3 #'IDENTITY -1 NIL NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP 'a -1 NIL NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY 'a NIL NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute #\\A #\\a \"baobab\" #'EQUALP #'IDENTITY -1 'b NIL)"); // bad
		// arg
		// types
		// substitute-if
		UnitTest.testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"baobAb\")");
		UnitTest.testEvalEquals("\"bAaaaa\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("\"bAobaa\"", "(substitute-if #\\a #'upper-case-p \"bAobaB\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"bAobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"baobab\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500 2)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"baobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500 1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 500 0)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("\"bAobAb\"", "(substitute-if #\\a #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\a #\\a #\\a #\\a)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
																											// verify
																											// this
		UnitTest.testEvalEquals("'(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
																											// verify
																											// this
		UnitTest.testEvalEquals("'(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(substitute-if #\\a #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
																											// verify
																											// this
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\a #\\a #\\a #\\a)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
																											// verify
																											// this
		UnitTest.testEvalEquals("#(#\\b #\\a #\\o #\\b #\\a #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
																											// verify
																											// this
		UnitTest.testEvalEquals("#(#\\b #\\A #\\o #\\b #\\A #\\b)",
				"(substitute-if #\\a #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
																											// verify
																											// this
		UnitTest.testEvalError("(substitute-if)"); // too few args
		UnitTest.testEvalError("(substitute-if #\\a)"); // too few args
		UnitTest.testEvalError("(substitute-if #\\a #'upper-case-p)"); // too
																		// few
																		// args
		UnitTest.testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(substitute-if #\\a #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\" 'a -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(substitute-if #\\a #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// count
		UnitTest.testEvalEquals("2", "(count #\\a \"baobab\")");
		UnitTest.testEvalEquals("1", "(count #\\A \"baobab\" #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("1", "(count #\\A \"baobab\" #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count #\\A \"baobab\" #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count #\\A \"baobab\" #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("2", "(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("0", "(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count #\\a '(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("1", "(count #\\A '(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("1", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("2", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("0", "(count #\\A '(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count #\\a #(#\\b #\\a 0 #\\b #\\a #\\b))");
		UnitTest.testEvalEquals("1", "(count #\\A #(#\\b #\\a #\\o #\\b #\\a #\\b) #'EQ #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("1", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALp #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQL #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("2", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("0", "(count #\\A #(#\\b #\\a 0 #\\b #\\a #\\b) #'EQUALP #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalError("(count)"); // too few args
		UnitTest.testEvalError("(count 1)"); // too few args
		UnitTest.testEvalError("(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(count #\\A #\\A #'EQUALP #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(count #\\A \"baobab\" 3 #'IDENTITY -1 NIL)"); // bad
																				// arg
		// types
		UnitTest.testEvalError("(count #\\A \"baobab\" #'EQUALP 'a -1 NIL)"); // bad
																				// arg
		// types
		UnitTest.testEvalError("(count #\\A \"baobab\" #'EQUALP #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(count #\\A \"baobab\" #'EQUALP #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// count-if
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p \"baoBAb\")");
		UnitTest.testEvalEquals("4", "(count-if #'upper-case-p \"bAobAb\" #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("1", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p \"baobab\" #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p \"bAobAb\" #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p \"bAobAb\" #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("4", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("1", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\a #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p '(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b))");
		UnitTest.testEvalEquals("4", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'CHAR-UPCASE 2 6)");
		UnitTest.testEvalEquals("1", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p #(#\\b #\\a #\\o #\\b #\\a #\\b) #'IDENTITY 2 6)");
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IdENTITY 2 4)");
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 NIL)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("2", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 500)"); // @todo
		// verify
		// this
		UnitTest.testEvalEquals("0", "(count-if #'upper-case-p #(#\\b #\\A #\\o #\\b #\\A #\\b) #'IDENTITY -1 -1)"); // @todo
		// verify
		// this
		UnitTest.testEvalError("(count-if)"); // too few args
		UnitTest.testEvalError("(count-if #'upper-case-p)"); // too few args
		UnitTest.testEvalError("(count-if #'upper-case-p \"baobab\"  #'IDENTITY -1 NIL #\\A)"); // too
		// many
		// args
		UnitTest.testEvalError("(count-if #'upper-case-p #\\A  #'IDENTITY -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(count-if #'upper-case-p \"baobab\" 'a -1 NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(count-if #'upper-case-p \"baobab\" #'IDENTITY 'a NIL)"); // bad
		// arg
		// types
		UnitTest.testEvalError("(count-if #'upper-case-p \"baobab\" #'IDENTITY -1 'b)"); // bad
		// arg
		// types
		// search @todo add more unit tests
		UnitTest.testEvalEquals("0", "(search #() #(a b c))");
		UnitTest.testEvalEquals("0", "(search \"\" \"foobar\")");
		UnitTest.testEvalEquals("7", "(search \"dog\" \"it's a dog's life\")");
		UnitTest.testEvalEquals("NIL", "(search \"doggy\" \"it's a dog's life\")");
		UnitTest.testEvalEquals("1", "(search '(\"1980s\") '(\"mid\" \"1980s\") #'equal)");
		// mismatch @todo add more unit tests
		UnitTest.testEvalEquals("4", "(mismatch \"abcd\" \"ABCDE\" #'char-equal)");
		UnitTest.testEvalEquals("4", "(mismatch \"abcdaa\" \"ABCDEa\" #'char-equal)");
		UnitTest.testEvalEquals("NIL", "(mismatch \"abcdaa\" \"abcdaa\" #'char-equal)");
		UnitTest.testEvalEquals("2",
				"(MISMATCH '(\"big\" \"bilbonic\" \"in\" \"the\" \"garden\") '(\"Big\" \"bilbonic\") #'EQUALP)");
		// reduce @todo add more unit tests
		UnitTest.testEvalEquals("31", " (creduce '+ '(10 21))");
		UnitTest.testEvalEquals("nil", " (creduce #'+ '())");
		UnitTest.testEvalEquals("3", " (creduce #'+ '(3))");
		UnitTest.testEvalEquals("'(((1 2) 3) 4)", " (creduce #'list '(1 2 3 4))");
		UnitTest.testEvalEquals("'(I N I T 1 2)", " (creduce #'append '((1) (2)) 0 NIL '(i n i t))");
		// concatenate @todo add more unit tests
		UnitTest.testEvalEquals("\"all together now\"", "(cconcatenate \"all\" \" \" \"together\" \" \" \"now\")");
		UnitTest.testEvalEquals("'(D E F #\\A #\\B #\\C 1 2 3)", "(cconcatenate '(d e f) \"ABC\" #(1 2 3))");
		UnitTest.testEvalEquals("NIL", "(cconcatenate NIL)");
		UnitTest.testEvalEquals("'(a b c)", "(cconcatenate NIL #(a b c))");
		UnitTest.testEvalEquals("'(a b c d e)", "(cconcatenate NIL #(a b c) NIL '(d e))");
		UnitTest.testEvalError("(cconcatenate \"ABC\" #(1 2 3))");
		// reverse @todo add more unit tests
		UnitTest.testEvalEquals("\"cba\"", "(reverse \"abc\")");
		UnitTest.testEvalEquals("'(c b a)", "(reverse '(a b c))");
		UnitTest.testEvalEquals("#(c b a)", "(reverse #(a b c))");
		UnitTest.testEvalEquals("nil", "(reverse nil)");
		// subsequence @todo add more unit tests
		UnitTest.testEvalEquals("\"bc\"", "(subseq \"abcde\" 1 3)");
		UnitTest.testEvalEquals("'(b c)", "(subseq '(a b c d e) 1 3)");
		UnitTest.testEvalEquals("#(b c)", "(subseq #(a b c d e) 1 3)");
		UnitTest.testEvalEquals("nil", "(subseq nil 1 2)");
	}

	public static void testSimpleFunctionEvaluation() {
		UnitTest.testEvalEquals("NIL", "(identity nil)");
		UnitTest.testEvalEquals("NIL", "(IDENTITY nil)");
		UnitTest.testEvalEquals("NIL", "(iDeNtIty nil)");
		UnitTest.testEvalEquals("212", "212");
		UnitTest.testEvalEquals("212", "(identity 212)");
		UnitTest.testEvalEquals("212",
				"(identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity (identity 212)))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))))");
		UnitTest.testEvalEquals(":foo", "(identity :foo)");
	}

	public static void testSort() {
		UnitTest.testEvalEquals("'(1 2 3 4 5)", "(sort '(5 2 4 3 1) '<)");
		UnitTest.testEvalEquals("'(5 4 3 2 1)", "(sort '(5 2 4 3 1) '>)");
		UnitTest.testEvalEquals("'(0 -1 1 -1 1 2 -2 3 -5 -8)", "(stable-sort '(-1 3 1 -5 2 0 -8 -1 -2 1) '< 'abs)");
		UnitTest.testEvalEquals("#(1 2 3 4 5)", "(sort #(5 2 4 3 1) '<)");
		UnitTest.testEvalEquals("#(5 4 3 2 1)", "(sort #(5 2 4 3 1) '>)");
		UnitTest.testEvalEquals("#(0 -1 1 -1 1 2 -2 3 -5 -8)", "(stable-sort #(-1 3 1 -5 2 0 -8 -1 -2 1) '< 'abs)");
		UnitTest.testEvalEquals("\"aaaabbcdf\"", "(sort \"acabaadfb\" 'CHAR<)");
	}

	public static void testStringEquality() {
		UnitTest.testEvalEquals("NIL", "(eq \"foo\" \"foo\")");
		UnitTest.testEvalEquals("NIL", "(eql \"foo\" \"foo\")");
		UnitTest.testEvalEquals("T", "(equal \"foo\" \"foo\")");
		UnitTest.testEvalEquals("T", "(equalp \"foo\" \"foo\")");
		UnitTest.testEvalEquals("NIL", "(eq \"foo\" \"FOO\")");
		UnitTest.testEvalEquals("NIL", "(eql \"foo\" \"FOO\")");
		UnitTest.testEvalEquals("NIL", "(equal \"foo\" \"FOO\")");
		UnitTest.testEvalEquals("T", "(equalp \"foo\" \"FOO\")");
	}

	public static void testStringFunctions() {
		// @todo add tests involving dotted lists

		UnitTest.testEvalEquals("\"aaa\"", "(make-string 3 #\\a)");
		UnitTest.testEvalError("(make-string 3 NIL)");
		UnitTest.testEvalError("(make-string NIL #\\a)");

		UnitTest.testEvalEquals("\"a\"", "(string #\\a)");

		UnitTest.testEvalEquals("#\\e", "(char \"hello\" 1)");
		UnitTest.testEvalError("(char \"hello\" -1)");
		UnitTest.testEvalError("(char \"hello\" 100)");
		UnitTest.testEvalError("(char NIL 1)");

		UnitTest.testEvalEquals("\"hellp\"", "(set-char \"hello\" 4 #\\p)");
		UnitTest.testEvalError("(set-char \"hello\" 4 NIL)");
		UnitTest.testEvalError("(set-char \"hello\" -1 #\\p)");
		UnitTest.testEvalError("(set-char \"hello\" 100 #\\p)");
		UnitTest.testEvalError("(set-char NIL 4 #\\p)");

		//// Case sensitive comparisons
		UnitTest.testEvalEquals("T", "(string= \"abc\" \"abc\")");
		UnitTest.testEvalEquals("nil", "(string= \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string= \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("nil", "(string= \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string= \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string= \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("T", "(string= \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("NIL", "(string= \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("nil", "(string/= \"abc\" \"abc\")");
		UnitTest.testEvalEquals("t", "(string/= \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("t", "(string/= \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("t", "(string/= \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("t", "(string/= \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("t", "(string/= \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("nil", "(string/= \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("t", "(string/= \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("nil", "(string< \"abc\" \"abc\")");
		UnitTest.testEvalEquals("nil", "(string< \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("2", "(string< \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("1", "(string< \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("1", "(string< \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("4", "(string< \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("nil", "(string< \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("NIL", "(string< \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("nil", "(string> \"abc\" \"abc\")");
		UnitTest.testEvalEquals("2", "(string> \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string> \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("nil", "(string> \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string> \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string> \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("nil", "(string> \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("2", "(string> \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("3", "(string>= \"abc\" \"abc\")");
		UnitTest.testEvalEquals("2", "(string>= \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string>= \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("nil", "(string>= \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string>= \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string>= \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("4", "(string>= \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("2", "(string>= \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("3", "(string<= \"abc\" \"abc\")");
		UnitTest.testEvalEquals("nil", "(string<= \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("2", "(string<= \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("1", "(string<= \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("1", "(string<= \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("4", "(string<= \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("4", "(string<= \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("NIL", "(string<= \"hello\" \"shell\" 2 4 2 4)");

		//// Case insensitive comparisons
		UnitTest.testEvalEquals("T", "(string-equal \"abc\" \"abc\")");
		UnitTest.testEvalEquals("nil", "(string-equal \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-equal \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("nil", "(string-equal \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("t", "(string-equal \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-equal \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("T", "(string-equal \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("NIL", "(string-equal \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("nil", "(string-not-equal \"abc\" \"abc\")");
		UnitTest.testEvalEquals("t", "(string-not-equal \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("t", "(string-not-equal \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("t", "(string-not-equal \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-not-equal \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("t", "(string-not-equal \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("nil", "(string-not-equal \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("t", "(string-not-equal \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("nil", "(string-lessp \"abc\" \"abc\")");
		UnitTest.testEvalEquals("nil", "(string-lessp \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("2", "(string-lessp \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("nil", "(string-lessp \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-lessp \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("4", "(string-lessp \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("NIL", "(string-lessp \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("NIL", "(string-lessp \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("nil", "(string-greaterp \"abc\" \"abc\")");
		UnitTest.testEvalEquals("2", "(string-greaterp \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-greaterp \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("2", "(string-greaterp \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-greaterp \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-greaterp \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("nil", "(string-greaterp \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("2", "(string-greaterp \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("3", "(string-not-greaterp \"abc\" \"abc\")");
		UnitTest.testEvalEquals("nil", "(string-not-greaterp \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("2", "(string-not-greaterp \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("nil", "(string-not-greaterp \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("4", "(string-not-greaterp \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("4", "(string-not-greaterp \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("4", "(string-not-greaterp \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("NIL", "(string-not-greaterp \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("3", "(string-not-lessp \"abc\" \"abc\")");
		UnitTest.testEvalEquals("2", "(string-not-lessp \"aadd\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-not-lessp \"aacc\" \"aadd\")");
		UnitTest.testEvalEquals("2", "(string-not-lessp \"aAdD\" \"aacc\")");
		UnitTest.testEvalEquals("4", "(string-not-lessp \"aAcC\" \"aacc\")");
		UnitTest.testEvalEquals("nil", "(string-not-lessp \"aAcC\" \"aAcCa\")");
		UnitTest.testEvalEquals("4", "(string-not-lessp \"hello\" \"shell\" 0 4 1 5)");
		UnitTest.testEvalEquals("2", "(string-not-lessp \"hello\" \"shell\" 2 4 2 4)");

		UnitTest.testEvalEquals("\"ABC\"", "(string-upcase \"abc\")");
		UnitTest.testEvalEquals("t", "(clet ((str \"ABc\")) (cnot (eq str (string-upcase str))))");

		UnitTest.testEvalEquals("\"abc\"", "(STRING-DOWNCASE \"ABc\")");
		UnitTest.testEvalEquals("t", "(clet ((str \"ABc\")) (cnot (eq str (STRING-DOWNCASE str))))");

		UnitTest.testEvalEquals("\"Abc\"", "(STRING-CAPITALIZE \"abc\")");
		UnitTest.testEvalEquals("t", "(clet ((str \"ABc\")) (cnot (eq str (STRING-CAPITALIZE str))))");

		UnitTest.testEvalEquals("\"ABC\"", "(NSTRING-UPCASE \"abc\")");
		UnitTest.testEvalEquals("t", "(clet ((str \"ABc\")) (eq str (NSTRING-UPCASE str)))");

		UnitTest.testEvalEquals("\"abc\"", "(NSTRING-DOWNCASE \"ABc\")");
		UnitTest.testEvalEquals("t", "(clet ((str \"ABc\")) (eq str (NSTRING-DOWNCASE str)))");

		UnitTest.testEvalEquals("\"Abc\"", "(NSTRING-CAPITALIZE \"abc\")");
		UnitTest.testEvalEquals("t", "(clet ((str \"ABc\")) (eq str (NSTRING-CAPITALIZE str)))");

		UnitTest.testEvalEquals("\"abc\"", "(STRING-TRIM #(#\\Space) \"  abc  \")");

		UnitTest.testEvalEquals("\"abc  \"", "(STRING-LEFT-TRIM #(#\\Space) \"  abc  \")");

		UnitTest.testEvalEquals("\"  abc\"", "(STRING-RIGHT-TRIM #(#\\Space) \"  abc  \")");
	}

	public static void testStrings() {
		UnitTest.testEvalOfType("\"Foo\"", SubLString.class);
		UnitTest.testEvalOfType("\"\"", SubLString.class);
		UnitTest.testEvalOfType("\"\\\"APL\\\\360?\\\" he cried.\"", SubLString.class);
		UnitTest.testEvalOfType("\"|x| = |-x|\"", SubLString.class);
		UnitTest.testEvalOfType("\"ab\"", SubLString.class);
		UnitTest.testEvalOfType("\"\\a\\b\"", SubLString.class);
		UnitTest.testEvalEquals("\"ab\"", "\"\\a\\b\"");
		UnitTest.testEvalEquals("\"\\\\\"", "\"\\\\\"");
	}

	public static void testStringStreams() {
		UnitTest.testEvalOfType("(csetq *test-string-output-stream1* (make-string-output-stream))", SubLStream.class);
		UnitTest.readAndEval("(write-string \"Testing...\" *test-string-output-stream1*)");
		UnitTest.readAndEval("(write-char #\\1 *test-string-output-stream1*)");
		UnitTest.testEvalEquals("\"Testing...1\"", "(get-output-stream-string *test-string-output-stream1*)");
		UnitTest.readAndEval("(write-string \"    Testing...\" *test-string-output-stream1* 4 11)");
		UnitTest.testEvalEquals("\"Testing\"", "(get-output-stream-string *test-string-output-stream1*)");

	}

	/**
	 * Runs the unit tests
	 */
	/*
	 * public static Test suite() { TestSuite testSuite = new TestSuite();
	 * testSuite.addTest(new UnitTest("testHashtableExerciser")); return
	 * testSuite; }
	 */

	public static void testSxhash() {
		// sxhash of lists
		UnitTest.testEvalOfType("(sxhash '(a b c))", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp '(a b c) '(a b c))");
		UnitTest.testEvalEquals("NIL", "(equalp '(a b c) '(a b d))");
		UnitTest.testEvalEquals("(sxhash '(a b c))", "(sxhash '(a b c))");
		UnitTest.testEvalNotEquals("(sxhash '(a b c))", "(sxhash '(a b d))"); // should
		// have
		// a
		// high
		// prob
		// of
		// not
		// being
		// equal
		// sxhash of vectors
		UnitTest.testEvalOfType("(sxhash #(a b c))", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp #(a b c) #(a b c))");
		UnitTest.testEvalEquals("NIL", "(equalp #(a b c) #(a b d))");
		UnitTest.testEvalEquals("(sxhash #(a b c))", "(sxhash #(a b c))");
		UnitTest.testEvalNotEquals("(sxhash #(a b c))", "(sxhash #(a b d))"); // should
		// have
		// a
		// high
		// prob
		// of
		// not
		// being
		// equal
		// sxhash of strings
		UnitTest.testEvalOfType("(sxhash \"blah\")", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp \"blah\" \"blah\")");
		UnitTest.testEvalEquals("NIL", "(equalp \"blah\" \"blat\")");
		UnitTest.testEvalEquals("(sxhash \"blah\")", "(sxhash \"blah\")");
		UnitTest.testEvalEquals("(sxhash \"blah\")", "(sxhash \"BLAH\")");
		UnitTest.testEvalNotEquals("(sxhash \"blah\")", "(sxhash \"blaa\")"); // should
		// have
		// a
		// high
		// prob
		// of
		// not
		// being
		// equal
		// sxhash of symbols
		UnitTest.testEvalOfType("(sxhash 'a)", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp 'a 'a)");
		UnitTest.testEvalEquals("NIL", "(equalp 'a 'b)");
		UnitTest.testEvalEquals("(sxhash 'a)", "(sxhash 'a)");
		UnitTest.testEvalNotEquals("(sxhash 'a)", "(sxhash 'b)"); // should have
																	// a high
		// prob of not being
		// equal
		// sxhash of fixnum
		UnitTest.testEvalOfType("(sxhash 1)", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp 1 1)");
		UnitTest.testEvalEquals("NIL", "(equalp 1 2)");
		UnitTest.testEvalEquals("(sxhash 1)", "(sxhash 1)");
		UnitTest.testEvalNotEquals("(sxhash 1)", "(sxhash 2)"); // should have a
																// high
		// prob of not being
		// equal
		// sxhash of floating point
		UnitTest.testEvalOfType("(sxhash 1.0)", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp 1.0 1.0)");
		UnitTest.testEvalEquals("NIL", "(equalp 1.0 2.0)");
		UnitTest.testEvalEquals("(sxhash 1.0)", "(sxhash 1.0)");
		UnitTest.testEvalNotEquals("(sxhash 1.0)", "(sxhash 2.0)"); // should
																	// have a
																	// high
		// prob of not being
		// equal
		// sxhash of character
		UnitTest.testEvalOfType("(sxhash #\\a)", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp #\\a #\\a)");
		UnitTest.testEvalEquals("NIL", "(equalp #\\a #\\b)");
		UnitTest.testEvalEquals("(sxhash #\\a)", "(sxhash #\\a)");
		UnitTest.testEvalNotEquals("(sxhash #\\a)", "(sxhash #\\b)"); // should
																		// have
																		// a
		// high prob of
		// not being
		// equal
		// sxhash of bignum-integer
		UnitTest.testEvalOfType("(sxhash 1000000000)", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp 1000000000 1000000000)");
		UnitTest.testEvalEquals("NIL", "(equalp 1000000000 1000000001)");
		UnitTest.testEvalEquals("(sxhash 1000000000)", "(sxhash 1000000000)");
		UnitTest.testEvalNotEquals("(sxhash 1000000000)", "(sxhash 1000000001)"); // should
		// have
		// a
		// high
		// prob
		// of
		// not
		// being
		// equal
		// sxhash of bignum-long
		long val = Long.MAX_VALUE / 20;
		long val2 = Long.MAX_VALUE / 20 + 1;
		UnitTest.testEvalOfType("" + val, SubLLongBignum.class);
		UnitTest.testEvalOfType("(sxhash " + val + ")", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(equalp " + val + " " + val + ")");
		UnitTest.testEvalEquals("NIL", "(equalp " + val + " " + val2 + ")");
		UnitTest.testEvalEquals("(sxhash " + val + ")", "(sxhash " + val + ")");
		UnitTest.testEvalNotEquals("(sxhash " + val + ")", "(sxhash " + val2 + ")"); // should
		// have
		// a
		// high
		// prob
		// of
		// not
		// being
		// equal
		// sxhash of bignum-BigInteger
		UnitTest.testEvalOfType("(sxhash 9999999999999999999999999999999999999999999999999999)", SubLFixnum.class);
		UnitTest.testEvalEquals("T",
				"(equalp 9999999999999999999999999999999999999999999999999999 9999999999999999999999999999999999999999999999999999)");
		UnitTest.testEvalEquals("NIL",
				"(equalp 9999999999999999999999999999999999999999999999999999 9999999999999999999999999999999999999999999999999998)");
		UnitTest.testEvalEquals("(sxhash 9999999999999999999999999999999999999999999999999999)",
				"(sxhash 9999999999999999999999999999999999999999999999999999)");
		UnitTest.testEvalNotEquals("(sxhash 9999999999999999999999999999999999999999999999999999)",
				"(sxhash 9999999999999999999999999999999999999999999999999998)"); // should
																					// have
																					// a
																					// high
																					// prob
																					// of
																					// not
																					// being
																					// equal
		// sxhash of guid
		UnitTest.testEvalOfType("(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))", SubLFixnum.class);
		UnitTest.testEvalEquals("T",
				"(equalp (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\") (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))");
		UnitTest.testEvalEquals("NIL",
				"(equalp (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\") (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7271\"))");
		UnitTest.testEvalEquals("(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))",
				"(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))");
		UnitTest.testEvalNotEquals("(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7270\"))",
				"(sxhash (string-to-guid \"c0fdc8ce-9c29-11b1-9dad-c379636f7271\"))"); // should
																						// have
																						// a
																						// high
																						// prob
																						// of
																						// not
																						// being
																						// equal
		// sxhash of structure -- missing implemenation for CDO
		// readAndEval("(defstruct (hundred-acre-woods) poohbear piglet
		// eeyore)");
		// testEvalEquals("0", "(sxhash (make-hundred-acre-woods))");
		UnitTest.shouldPrintTests("Testing SXHASH on CycL objects ... will error if CycL not loaded.");
		/**
		 * @todo these tests inappropriately test code outside of the SubL
		 *       kernel testEvalEquals("T","(fboundp 'cache-p)");
		 *       testEvalEquals("0", "(sxhash (new-cache 1))");
		 */
		// sxhash of locks
		UnitTest.testEvalOfType("(sxhash 'a)", SubLFixnum.class);
		UnitTest.testEvalEquals("T", "(clet ((a (make-lock \"a\"))) (equalp a a))");
		UnitTest.testEvalEquals("NIL", "(clet ((a (make-lock \"a1\")) (b (make-lock \"b1\"))) (equalp a b))");
		UnitTest.testEvalEquals("T", "(clet ((a (make-lock \"a2\"))) (equalp (sxhash a) (sxhash a)))");
		UnitTest.testEvalEquals("NIL",
				"(clet ((a (make-lock \"a3\")) (b (make-lock \"b3\"))) (equalp (sxhash a) (sxhash b)))");
	}

	//// Protected Area

	//// Private Area

	public static void testSymbolEquality() {
		UnitTest.testEvalEquals("T", "(eq (quote foo) (quote foo))");
		UnitTest.testEvalEquals("T", "(eql (quote foo) (quote foo))");
		UnitTest.testEvalEquals("T", "(equal (quote foo) (quote foo))");
		UnitTest.testEvalEquals("T", "(equalp (quote foo) (quote foo))");
		UnitTest.testEvalEquals("NIL", "(eq (quote foo) (quote bar))");
		UnitTest.testEvalEquals("NIL", "(eql (quote foo) (quote bar))");
		UnitTest.testEvalEquals("NIL", "(equal (quote foo) (quote bar))");
		UnitTest.testEvalEquals("NIL", "(equalp (quote foo) (quote bar))");
		/*
		 * testEvalEquals("NIL", "(eq (quote cyc:bar) (quote sl:bar))");
		 * testEvalEquals("NIL", "(eql (quote sl:bar) (quote cyc:bar))");
		 * testEvalEquals("NIL", "(equal (quote sublisp:bar) (quote CYC:bar))");
		 * testEvalEquals("NIL",
		 * "(equalp (quote SubLisp:bar) (quote cyc:bar))"); testEvalEquals("t",
		 * "(eq (quote cyc::bar) (quote cyc:bar))"); testEvalEquals("t",
		 * "(eql (quote sl:bar) (quote sl:bar))"); testEvalEquals("t",
		 * "(equal (quote cyc:bar) (quote CYC:bar))"); testEvalEquals("t",
		 * "(equalp (quote SubLisp:bar) (quote SL:bar))"); testEvalEquals("T",
		 * "(eq (quote foo) (quote Cyc:foo))"); testEvalEquals("T",
		 * "(eq (quote sl::foo) (quote SUBLISP:foo))"); testEvalEquals("T",
		 * "(eql (quote foo) (quote Cyc:foo))"); testEvalEquals("T",
		 * "(equal (quote foo) (quote cyc:foo))"); testEvalEquals("T",
		 * "(equalp (quote foo) (quote cyc:foo))"); testEvalEquals("T",
		 * "(eq (quote foo) (quote cyc:foo))"); testEvalEquals("T",
		 * "(eql (quote foo) (quote cyc:foo))"); testEvalEquals("T",
		 * "(equal (quote foo) (quote cyc:foo))"); testEvalEquals("T",
		 * "(equalp (quote foo) (quote CYC:foo))");
		 * testEvalError("(eq (quote foo1:bar) (quote foo2:bar))");
		 * testEvalError("(eql (quote foo1:bar) (quote foo2:bar))");
		 * testEvalError("(equal (quote foo1:bar) (quote foo2:bar))");
		 * testEvalError("(equalp (quote foo1:bar) (quote foo2:bar))");
		 */
	}

	public static void testSymbolFunctions() {
		// make-symbol
		UnitTest.testEvalEquals("\"HALEAKALA\"", "(string (make-symbol \"HALEAKALA\"))");
		UnitTest.testEvalNotEquals("'#:HALEAKALA", "(make-symbol \"HALEAKALA\")");
		UnitTest.testEvalEquals("\"#:HALEAKALA\"", "(string (make-symbol \"#:HALEAKALA\"))");
		UnitTest.testEvalEquals("NIL", "(symbol-package (make-symbol \"asdflaskf\"))");
		// make-keyword
		UnitTest.testEvalEquals("\"HALEAKALA\"", "(string (make-keyword \"HALEAKALA\"))");
		UnitTest.testEvalEquals(":HALEAKALA", "(make-keyword \"HALEAKALA\")");
		// symbol-name
		UnitTest.testEvalEquals("\"NIL\"", "(symbol-name nil)");
		UnitTest.testEvalEquals("\"BLAH\"", "(symbol-name :BLAH)");
		UnitTest.testEvalEquals("\"QqQ\"", "(symbol-name '|QqQ|)");
		// symbol-package
		UnitTest.testEvalEquals("(find-package \"SUBLISP\")", "(symbol-package nil)");
		UnitTest.testEvalEquals("(find-package \"CYC\")", "(symbol-package 'cyc::blah)");
		UnitTest.testEvalEquals("(find-package \"KEYWORD\")", "(symbol-package :blah)");
		UnitTest.testEvalEquals("nil", "(symbol-package (make-symbol \"HALEAKALA\"))");
		// symbol-value
		UnitTest.testEvalEquals("3", "(csetq *asd12312* 3)");
		UnitTest.testEvalEquals("3", "(symbol-value '*asd12312*)");
		UnitTest.testEvalError("(symbol-value (make-symbol \"HALEAKALA\"))");
		// symbol-function
		UnitTest.testEvalEquals("#'clet", "(symbol-function 'clet)");
		UnitTest.testEvalEquals("#'symbol-function", "(symbol-function 'symbol-function)");
		UnitTest.testEvalError("(symbol-function (make-symbol \"HALEAKALA\"))");
		// boundp
		UnitTest.testEvalEquals("t", "(boundp '*asd12312*)");
		UnitTest.testEvalEquals("t", "(boundp '*PACKAGE*)");
		UnitTest.testEvalEquals("t", "(boundp 'nil)");
		UnitTest.testEvalEquals("nil", "(boundp 'asdfalkajsdflkasfl)");
		UnitTest.testEvalEquals("nil", "(boundp (make-symbol \"HALEAKALA\"))");
		UnitTest.shouldPrintTests("Testing that newly created symbols are unbound ....");
		SubLSymbol sym = SubLObjectFactory.makeSublispSymbol("*MY-PERSONAL-SYMBOL*");
		Assert.assertEquals("We are not getting unbound back for a newly-created SYMBOL", sym.boundp(), false);
		UnitTest.testEvalEquals("nil", "(boundp '*my-personal-symbol*)");
		// testEvalEquals("T","(symbol-value (deflexical *my-personal-symbol*
		// (fif (boundp '*my-personal-symbol*) NIL T)))");

		// fboundp
		UnitTest.testEvalEquals("t", "(fboundp 'clet)");
		UnitTest.testEvalEquals("t", "(fboundp 'fboundp)");
		UnitTest.testEvalError("(fboundp #'fboundp)");
		UnitTest.testEvalEquals("nil", "(fboundp 'nil)");
		UnitTest.testEvalEquals("nil", "(fboundp 'asdfalkajsdflkasfl)");
		UnitTest.testEvalEquals("nil", "(fboundp (make-symbol \"HALEAKALA\"))");
		// set
		UnitTest.testEvalError("(set 'nil 3)");
		UnitTest.testEvalError("(set 't 3)");
		UnitTest.testEvalError("(set :BLAH 3)");
		UnitTest.testEvalEquals("3", "(set '*asd12312* 3)");
		UnitTest.testEvalEquals("3", "(symbol-value '*asd12312*)");
		// fmakunbound @todo add test
		// makunbound @todo add test
		// gensym
		UnitTest.testEvalOfType("(gensym)", SubLSymbol.class);
		UnitTest.testEvalEquals("nil", "(symbol-package (gensym))");
		UnitTest.testEvalNotEquals("(gensym)", "(gensym)");
		UnitTest.testEvalOfType("(gensym \"Foo-\")", SubLSymbol.class);
		UnitTest.testEvalOfType("(gensym 34)", SubLSymbol.class);
		// gentemp
		UnitTest.testEvalOfType("(gentemp)", SubLSymbol.class);
		UnitTest.testEvalEquals("(find-package 'cyc)", "(symbol-package (gentemp))");
		UnitTest.testEvalNotEquals("(gentemp)", "(gentemp)");
		UnitTest.testEvalOfType("(gentemp \"Foo-\")", SubLSymbol.class);
		// put
		UnitTest.testEvalEquals("t", "(put 'a 'bar t)");
		UnitTest.testEvalEquals("3", "(put 'a 'baz 3)");
		UnitTest.testEvalEquals("\"huh?\"", "(put 'a 'hunoz \"huh?\")");
		// get
		UnitTest.testEvalEquals("t", "(get 'a 'bar)");
		UnitTest.testEvalEquals("3", "(get 'a 'baz)");
		UnitTest.testEvalEquals("\"huh?\"", "(get 'a 'hunoz)");
		UnitTest.testEvalEquals("\"doh?\"", "(get 'a 'hunozz \"doh?\")");
		UnitTest.testEvalEquals("nil", "(get 'a 'hunozz)");
		// remprop
		UnitTest.testEvalEquals("t", "(remprop 'a 'bar)");
		UnitTest.testEvalEquals("nil", "(remprop 'a 'barr)");
		UnitTest.testEvalEquals("nil", "(get 'a 'bar)");
		// symbol_plist
		UnitTest.testEvalEquals("'(BAZ 3 HUNOZ \"huh?\")", "(symbol-plist 'a)");
		UnitTest.testEvalEquals("'()", "(symbol-plist 'b)");
	}

	public static void testSymbolNames() {
		UnitTest.testEvalOfType("'|3|", SubLSymbol.class);
		UnitTest.testEvalOfType("'\\3", SubLSymbol.class);
		UnitTest.testEvalOfType("'|Ab|", SubLSymbol.class);
		UnitTest.testEvalOfType("'\\(", SubLSymbol.class);
		UnitTest.testEvalOfType("'\\+1", SubLSymbol.class);
		UnitTest.testEvalOfType("'+\\1", SubLSymbol.class);
		UnitTest.testEvalOfType("'\\frobboz", SubLSymbol.class);
		UnitTest.testEvalOfType("'2.14159\\s0", SubLSymbol.class);
		UnitTest.testEvalOfType("'2.14159\\S0", SubLSymbol.class);
		UnitTest.testEvalOfType("'APL\\360", SubLSymbol.class);
		UnitTest.testEvalOfType("'apl\\360", SubLSymbol.class);
		UnitTest.testEvalOfType("'\\(b^2\\)\\ -\\ 4*a*c", SubLSymbol.class);
		UnitTest.testEvalOfType("'\\(\\b^2\\)\\ -\\ 4*\\a*\\c", SubLSymbol.class);
		UnitTest.testEvalOfType("'|\"|", SubLSymbol.class);
		UnitTest.testEvalOfType("'|(b^2) - 4*a*c|", SubLSymbol.class);
		UnitTest.testEvalOfType("'|frobboz|", SubLSymbol.class);
		UnitTest.testEvalOfType("'|APL\\360|", SubLSymbol.class);
		UnitTest.testEvalOfType("'|APL\\\\360|", SubLSymbol.class);
		UnitTest.testEvalOfType("'|\\|\\||", SubLSymbol.class);
		UnitTest.testEvalOfType("'|(B*2) - 4*A*C|", SubLSymbol.class);
		UnitTest.testEvalOfType("'|(b*2) - 4*a*c|", SubLSymbol.class);
		UnitTest.testEvalEquals("'|Ab|", "'a\\b");
		UnitTest.testEvalEquals("'|AB|", "'ab");
		UnitTest.testEvalEquals("'AB", "'ab");
		UnitTest.testEvalEquals("'|B C|", "'b\\ c");
		UnitTest.testEvalEquals("'|3|", "'\\3");
		UnitTest.testEvalEquals("'|\\3|", "'\\3");
		UnitTest.testEvalEquals("':INTERNAL",
				"(second (multiple-value-list (intern \"ALKJDFSDF2345245234545\" (find-package \"SUBLISP\")) (find-package \"SUBLISP\"))))");
		UnitTest.testEvalEquals("':INTERNAL", "(second (multiple-value-list (find-symbol (symbol-name "
				+ "(intern \"ALKJDFSDF2345245234587\" (find-package \"SUBLISP\"))) (find-package \"SUBLISP\"))))");
	}

	public static void testTimeMethods() {
		{
			// basic time testing
			UnitTest.testEvalEquals("T", "(numberp (get-universal-time))");
		}
		// time of the landing of the moon: July 20, 1969 4:17:42 p.m EDT
		// (decode-universal-time (encode-universal-time 42 17 16 20 7 1969 5)
		// 5)
		{
			UnitTest.shouldPrintTests("Checking whether we can encode the time of the moon landing ....");
			// universal time en- and decoding
			SubLObject second = SubLObjectFactory.makeInteger(42);
			SubLObject minute = SubLObjectFactory.makeInteger(17);
			SubLObject hour = SubLObjectFactory.makeInteger(16);
			SubLObject day = SubLObjectFactory.makeInteger(20);
			SubLObject month = SubLObjectFactory.makeInteger(7);
			SubLObject year = SubLObjectFactory.makeInteger(1969);
			SubLObject timezone = SubLObjectFactory.makeInteger(5);
			SubLNumber universalTime = SubLObjectFactory.makeInteger(2194809462L);
			UnitTest.testEvalEquals(universalTime.toString(), "(encode-universal-time " + second + " " + minute + " "
					+ hour + " " + day + " " + month + " " + year + " " + timezone + ")");

			SubLObject[] values = { second, minute, hour, day, month, year };
			UnitTest.checkDecodeUniversalTime(universalTime, values, timezone);
		}
		// testing the accuracy of the universal time
		{
			SubLNumber currentUniversalTime = UnitTest.readAndEval("(get-universal-time)").toNumber();
			Calendar calendar = Calendar.getInstance();
			SubLObject[] values = { null, // we dont want to be second accurate
					SubLObjectFactory.makeInteger(calendar.get(Calendar.MINUTE)),
					SubLObjectFactory.makeInteger(calendar.get(Calendar.HOUR_OF_DAY)),
					SubLObjectFactory.makeInteger(calendar.get(Calendar.DAY_OF_MONTH)),
					SubLObjectFactory.makeInteger(calendar.get(Calendar.MONTH) + 1), // months
																						// are
																						// zero-based
																						// ???
					SubLObjectFactory.makeInteger(calendar.get(Calendar.YEAR)) };
			SubLObject timezone = CommonSymbols.UNPROVIDED;
			UnitTest.checkDecodeUniversalTime(currentUniversalTime, values, timezone);
		}
	}

	private static void testTwoGuidsAreOrdered(SubLObject guid1, SubLObject guid2) {
		String msg = "Guids " + guid1 + " and " + guid2 + " do not compare properly.";
		Assert.assertEquals(msg, CommonSymbols.T, Guids.guidL(guid1, guid2));
		Assert.assertEquals(msg, CommonSymbols.T, Guids.guidLE(guid1, guid2));
		Assert.assertEquals(msg, CommonSymbols.NIL, Guids.guidE(guid1, guid2));
		Assert.assertEquals(msg, CommonSymbols.T, Guids.guidNE(guid1, guid2));
		Assert.assertEquals(msg, CommonSymbols.NIL, Guids.guidG(guid1, guid2));
		Assert.assertEquals(msg, CommonSymbols.NIL, Guids.guidGE(guid1, guid2));
	}

	public static void testTypePredicates() {
		// testEvalEquals("", "");
		// testEvalNotEquals("", "");
		UnitTest.testEvalEquals("T", "(BOOLEANP ())");
		UnitTest.testEvalEquals("T", "(BOOLEANP ())");
		UnitTest.testEvalEquals("T", "(BOOLEANP ())");
		UnitTest.testEvalEquals("NIL", "(BOOLEANP 'foo)");
		UnitTest.testEvalEquals("NIL", "(BOOLEANP 4)");
		UnitTest.testEvalError("(BOOLEANP)");
		UnitTest.testEvalError("(BOOLEANP 4 4)");
		UnitTest.testEvalEquals("T", "(NULL ())");
		UnitTest.testEvalEquals("T", "(nuLL NIL)");
		UnitTest.testEvalEquals("NIL", "(null T)");
		UnitTest.testEvalEquals("NIL", "(NULL '(A B C))");
		UnitTest.testEvalEquals("NIL", "(NULL #\\a)");
		UnitTest.testEvalEquals("NIL", "(NULL #33ROOMBA)");
		UnitTest.testEvalEquals("NIL", "(NULL \"\")");
		UnitTest.testEvalEquals("T", "(SYMBOLP NIL)");
		UnitTest.testEvalEquals("T", "(SYMBOLP ())");
		UnitTest.testEvalEquals("T", "(SYMBOLP T)");
		UnitTest.testEvalEquals("T", "(SYMBOLP 'RUFFFF!!!!!!)");
		UnitTest.testEvalEquals("T", "(SYMBOLP 'a\\ b)");
		UnitTest.testEvalEquals("T", "(SYMBOLP ())");
		UnitTest.testEvalEquals("NIL", "(SYMBOLP '(A B C))");
		UnitTest.testEvalEquals("NIL", "(SYMBOLP #\\a)");
		UnitTest.testEvalEquals("NIL", "(SYMBOLP #33ROOMBA)");
		UnitTest.testEvalEquals("NIL", "(SYMBOLP \"bah humbug\")");
		UnitTest.testEvalEquals("NIL", "(SYMBOLP 212)");
		UnitTest.testEvalEquals("T", "(ATOM \"howdy partner\")");
		UnitTest.testEvalEquals("T", "(ATOM NIL)");
		UnitTest.testEvalEquals("NIL", "(ATOM '(A B C))");
		UnitTest.testEvalEquals("T", "(CONSP '(A B C))");
		UnitTest.testEvalEquals("NIL", "(CONSP ())");
		UnitTest.testEvalEquals("NIL", "(CONSP NIL)");
		UnitTest.testEvalEquals("NIL", "(CONSP 212)");
		UnitTest.testEvalEquals("NIL", "(CONSP \"DARTH VADER\")");
		UnitTest.testEvalEquals("T", "(listp '(A B C))");
		UnitTest.testEvalEquals("T", "(listp ())");
		UnitTest.testEvalEquals("T", "(liStp NIL)");
		UnitTest.testEvalEquals("NIL", "(listp 212)");
		UnitTest.testEvalEquals("NIL", "(LISTP \"DARTH VADER\")");
		UnitTest.testEvalEquals("T", "(sequencep '(A B C))");
		UnitTest.testEvalEquals("T", "(sequencep ())");
		UnitTest.testEvalEquals("T", "(sequencep NIL)");
		UnitTest.testEvalEquals("NIL", "(sequencep 212)");
		// @todo add tests for sequencep on strings and vectors -APB
		// testEvalEquals("T", "(SEQUENCEP \"DARTH VADER\")");
		// testEvalEquals("T", "(SEQUENCEP \"DARTH VADER\")");
		UnitTest.testEvalEquals("T", "(numberp 10)");
		UnitTest.testEvalEquals("T", "(numberp 9999999999999999999999999999999999999999999)");
		UnitTest.testEvalEquals("T", "(numberp 1.0)");
		UnitTest.testEvalEquals("T", "(numbeRp 4.0e99)");
		UnitTest.testEvalEquals("T", "(numberp #33ROOMBA)");
		UnitTest.testEvalEquals("NIL", "(numberp 'a)");
		UnitTest.testEvalEquals("NIL", "(numberp #\\a)");
		UnitTest.testEvalEquals("NIL", "(numberp \"a\")");
		UnitTest.testEvalEquals("T", "(fixnump 1)");
		UnitTest.testEvalEquals("T", "(fixnump 0)");
		UnitTest.testEvalEquals("T", "(fixnump -1)");
		UnitTest.testEvalEquals("T", "(fixnumP 1024)");
		UnitTest.testEvalEquals("T", "(fixnump -1024)");
		UnitTest.testEvalEquals("NIL", "(fixnump #\\a)");
		UnitTest.testEvalEquals("NIL", "(fixnump \"a\")");
		UnitTest.testEvalEquals("NIL", "(fixnump '(A B C))");
		UnitTest.testEvalEquals("T", "(fixnump " + SubLNumberFactory.MIN_FIXNUM + ")");
		UnitTest.testEvalEquals("T", "(fixnump " + SubLNumberFactory.MAX_FIXNUM + ")");
		UnitTest.testEvalEquals("T", "(bignump " + (SubLNumberFactory.MAX_FIXNUM + 1) + ")");
		UnitTest.testEvalEquals("T", "(bignump " + (SubLNumberFactory.MIN_FIXNUM - 1) + ")");
		UnitTest.testEvalEquals("T", "(bIgnump 3000000000000000)");
		UnitTest.testEvalEquals("T", "(bignump 3000000000000000000000000000000000000000000000000000)");
		UnitTest.testEvalEquals("NIL", "(bignump #\\a)");
		UnitTest.testEvalEquals("NIL", "(bignump \"a\")");
		UnitTest.testEvalEquals("NIL", "(bignump '(A B C))");
		UnitTest.testEvalEquals("NIL", "(short-bignum-p 'a)");
		UnitTest.testEvalEquals("NIL", "(short-bignum-p #\\a)");
		UnitTest.testEvalEquals("NIL", "(short-bignum-p \"a\")");
		UnitTest.testEvalEquals("NIL", "(short-bigNum-p '(A B C))");
		UnitTest.testEvalEquals("NIL", "(short-bignum-p 0)");
		UnitTest.testEvalEquals("t", "(short-bignum-p " + Integer.MAX_VALUE / 10 + ")");
		UnitTest.testEvalEquals("NIL", "(medium-bignum-p 'a)");
		UnitTest.testEvalEquals("NIL", "(medium-bignum-p #\\a)");
		UnitTest.testEvalEquals("NIL", "(mediUm-bignum-p \"a\")");
		UnitTest.testEvalEquals("NIL", "(medium-bignum-p '(A B C))");
		UnitTest.testEvalEquals("NIL", "(medium-bignum-p 1.2)");
		UnitTest.testEvalEquals("t", "(medium-bignum-p " + Long.MAX_VALUE / 10 + ")");
		UnitTest.testEvalEquals("NIL", "(long-bignum-p 'a)");
		UnitTest.testEvalEquals("NIL", "(long-bignum-p #\\a)");
		UnitTest.testEvalEquals("NIL", "(long-bignum-p \"a\")");
		UnitTest.testEvalEquals("NIL", "(long-bignuM-p '(A B C))");
		UnitTest.testEvalEquals("NIL", "(long-bignum-p 2e3)");
		UnitTest.testEvalEquals("T", "(long-bignum-p 999999999999999999999999999999999999999999999999)");
		UnitTest.testEvalEquals("T", "(integerp -1000)");
		UnitTest.testEvalEquals("T", "(integerp 999999999999999999999999999999999999999)");
		UnitTest.testEvalEquals("NIL", "(integeRp 'a)");
		UnitTest.testEvalEquals("NIL", "(integerp #\\a)");
		UnitTest.testEvalEquals("NIL", "(integerp 'a)");
		UnitTest.testEvalEquals("NIL", "(integerp '(10000))");
		UnitTest.testEvalEquals("NIL", "(integerp '10\\000)");
		UnitTest.testEvalEquals("T", "(Floatp 10000.00)");
		UnitTest.testEvalEquals("T", "(floatp 1e3)");
		UnitTest.testEvalEquals("T", "(floatp -100.234)");
		UnitTest.testEvalEquals("NIL", "(floatp 'a)");
		UnitTest.testEvalEquals("NIL", "(floatp '(10000.8432))");
		UnitTest.testEvalEquals("T", "(characterp #\\a)");
		UnitTest.testEvalEquals("T", "(charaCterp #\\C-M-\\a)");
		UnitTest.testEvalEquals("NIL", "(characterp \"\")");
		UnitTest.testEvalEquals("NIL", "(characterp 'a)");
		UnitTest.testEvalEquals("NIL", "(characterp 234.234)");
		UnitTest.testEvalEquals("T", "(striNgp \"\")");
		UnitTest.testEvalEquals("T", "(stringp \"\\\\\")");
		UnitTest.testEvalEquals("NIL", "(stringp 'a)");
		UnitTest.testEvalEquals("NIL", "(stringp #\\a)");
		UnitTest.testEvalEquals("NIL", "(stringp nil)");
		// @todo get the following to work.... -APB
		// testEvalEquals("NIL", "(vectorp 'a)");
		// testEvalEquals("NIL", "(vectorp 'a)");
		// testEvalEquals("NIL", "(vectorp 'a)");
		// testEvalEquals("NIL", "(vectorp 'a)");
		// testEvalEquals("NIL", "(vectorp 'a)");
		// testEvalEquals("NIL", "(functionp 'a)");
		// testEvalEquals("NIL", "(functionp 'a)");
		// testEvalEquals("NIL", "(functionp 'a)");
		// testEvalEquals("NIL", "(functionp 'a)");
		// testEvalEquals("NIL", "(functionp 'a)");
		// testEvalEquals("NIL", "(function-spec-p 'b)");
		// testEvalEquals("NIL", "(function-spec-p 'b)");
		// testEvalEquals("NIL", "(function-spec-p 'b)");
		// testEvalEquals("NIL", "(function-spec-p 'b)");
		// testEvalEquals("NIL", "(function-spec-p 'b)");
		// testEvalEquals("NIL", "(function-spec-p 'b)");
		UnitTest.testEvalError("(NULL 'a 'b)");
		UnitTest.testEvalError("(nuLL NIL . 3)"); // @diff allegro returns T;
													// JRTL, CMUCL
		// and CRTL error
		UnitTest.testEvalError("(SYMBOLP 'a 'b)");
		UnitTest.testEvalError("(SYMBOLP 'a . 'b)"); // @diff allegro returns T;
														// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(ATOM 'a 'b)");
		UnitTest.testEvalError("(ATOM 'a . 'b)"); // @diff allegro returns T;
													// JRTL, CMUCL
		// and CRTL error
		UnitTest.testEvalError("(CONSP 'a 'b)");
		UnitTest.testEvalError("(CONSP 'a . 'b)"); // @diff allegro returns T;
													// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(listp 'a 'b)");
		UnitTest.testEvalError("(listp 'a . 'b)"); // @diff allegro returns T;
													// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(numberp 'a 'b)");
		UnitTest.testEvalError("(numberp 'a . 'b)"); // @diff allegro returns T;
														// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(fixnump 'a 'b)");
		UnitTest.testEvalError("(fixnump 'a . 'b)"); // @diff allegro returns T;
														// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(bignump 'a 'b)");
		UnitTest.testEvalError("(bignump 'a . 'b)"); // @diff allegro returns T;
														// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(short-bignum-p 'a 'b)");
		UnitTest.testEvalError("(short-bignum-p 'a . 'b)"); // @diff allegro
															// returns T;
		// JRTL, CMUCL and CRTL
		// error
		UnitTest.testEvalError("(medium-bignum-p 'a 'b)");
		UnitTest.testEvalError("(medium-bignum-p 'a . 'b)"); // @diff allegro
																// returns T;
		// JRTL, CMUCL and CRTL
		// error
		UnitTest.testEvalError("(long-bignum-p 'a 'b)");
		UnitTest.testEvalError("(long-bignum-p 'a . 'b)"); // @diff allegro
															// returns T;
		// JRTL, CMUCL and CRTL
		// error
		UnitTest.testEvalError("(integerp 'a . 'b)");
		UnitTest.testEvalError("(integerp 'a . 'b)"); // @diff allegro returns
														// T; JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(floatp 'a 'b)");
		UnitTest.testEvalError("(floatp 'a . 'b)"); // @diff allegro returns T;
													// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(characterp 'a 'b)");
		UnitTest.testEvalError("(characterp 'a . 'b)"); // @diff allegro returns
														// T; JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(stringp 'a 'b)");
		UnitTest.testEvalError("(stringp 'a . 'b)"); // @diff allegro returns T;
														// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(vectorp 'a 'b)");
		UnitTest.testEvalError("(vectorp 'a . 'b)"); // @diff allegro returns T;
														// JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(functionp 'a 'b)");
		UnitTest.testEvalError("(functionp 'a . 'b)"); // @diff allegro returns
														// T; JRTL,
		// CMUCL and CRTL error
		UnitTest.testEvalError("(function-spec-p 'a 'b)");
		UnitTest.testEvalError("(function-spec-p 'a . 'b)"); // @diff allegro
																// returns T;
		// JRTL, CMUCL and CRTL
		// error
	}

	public static void testWithErrorHandler() {
		/*
		 * commented out, not part of the SubL kernel
		 * testEvalError("(error \"foo : ~S\" 212)"); testEvalEquals("NIL",
		 * "(ignore-errors (error \"foo : ~S\" 212))");
		 * testEvalEquals("\"foo : 212\"",
		 * "(clet (m) (catch-error-message (m) (error \"foo : ~S\" 212)) m)");
		 */
	}

	public static void testWithTimeout() {
		/**
		 * @todo fix this unit test -- "time" is not part of the SubL kernel
		 *       testEvalEquals("1", "(round (time (clet (x) (with-timeout (1 x)
		 *       (sleep 2)))))");
		 */
	}

	/** Creates a new instance of UnitTest. */
	public UnitTest(String name) {
		super(name);
	}

	public void testErrorsAndWarnsGoToRightStream() {
		String command1 = "(clet ((test-stream (make-string-output-stream))\n"
				+ "       (*error-output* test-stream))\n" + "  (warn \"12345654321\")\n"
				+ "  (cnot (null (search \"12345654321\" (get-output-stream-string test-stream)))))";
		UnitTest.testEvalEquals("T", command1);
		// note: the following isnt guaranteed to work in the JRTL becuase the
		// error output might
		// not be sent to stream until outside the current binding
		/*
		 * String command2 =
		 * "(clet ((test-stream (make-string-output-stream))\n" +
		 * "       (*error-output* test-stream))\n" +
		 * "  (error \"12345654321\")\n" +
		 * "  (cnot (null (search \"12345654321\" (get-output-stream-string test-stream)))))"
		 * ; testEvalEquals("T", command2);
		 */
		String command3 = "(clet ((test-stream (make-string-output-stream))\n"
				+ "       (*error-output* test-stream))\n" + "  (break \"12345654321\")\n"
				+ "  (cnot (null (search \"12345654321\" (get-output-stream-string test-stream)))))";
		UnitTest.testEvalEquals("T", command3);
	}

	public void testKeywords() {
		UnitTest.testEvalEquals("':ASFSDFLKD", ":ASFSDFLKD");
		// @todo fix reader.parse-symbol-or-consing-dot bug to get following
		// test to work
		// testEvalEquals("':ASFSDFLKD1", "'::ASFSDFLKD1");
		UnitTest.testEvalEquals("':ASFSDFLKD2", "KEYWORD::ASFSDFLKD2");
		UnitTest.testEvalEquals("':ASFSDFLKD3", "KEYWORD::ASFSDFLKD3");
		UnitTest.testEvalEquals("NIL", "(find-symbol \":BLAH23423423\")");
		UnitTest.testEvalEquals("NIL", "(second (multiple-value-list (find-symbol \":BLAH23423423\")))");
		UnitTest.testEvalEquals("':ASFSDFLKD2", "(find-symbol \"ASFSDFLKD2\" *keyword-package*)");
		UnitTest.testEvalEquals("':EXTERNAL",
				"(second (multiple-value-list (find-symbol \"ASFSDFLKD2\" *keyword-package*)))");
		UnitTest.testEvalError("(csetq :KW1 :KW1)");
		UnitTest.testEvalError("(clet ((:KW1 :KW1)) NIL)");
		UnitTest.testEvalEquals(":KW1", ":KW1");
		UnitTest.testEvalEquals(":KW1", "':KW1");
		UnitTest.testEvalEquals(":KW1", "(symbol-value :KW1)");
		UnitTest.testEvalEquals("T", "(keywordp :KW1)");
		UnitTest.testEvalEquals("T", "(constantp :KW1)");
		UnitTest.testEvalEquals("NIL", "(fboundp :KW1)");
		UnitTest.testEvalEquals("T", "(boundp :KW1)");
		UnitTest.testEvalError("(symbol-function :KW1)");
		UnitTest.testEvalEquals("(find-package \"KEYWORD\")", "(symbol-package :KW1)");
		UnitTest.testEvalEquals("\"KEYWORD3\"", "(symbol-name :KEYWORD3)");
		UnitTest.testEvalEquals("\"KEYWORD3\"", "(symbol-name ':KEYWORD3)");
		UnitTest.testEvalEquals("\"foo\"", "(symbol-name  (make-keyword \"foo\"))");
		UnitTest.testEvalEquals(":|foo|", "(make-keyword \"foo\")");
		UnitTest.testEvalEquals(":|:foo|", "(make-keyword \":foo\")");
		UnitTest.testEvalEquals(":|:|", "(make-keyword \":\")");
		UnitTest.testEvalEquals("':|:|", "(read-from-string (write-to-string ':|:|))");
	}

	//// Internal Rep

	public void testLoadExternalCode() {
		if (!IsolatedClassLoader.ALLOW_DYNAMIC_LOADING_OF_CODE)
			return;
		UnitTest.testEvalError("*MY-TEST-VAR*");
		UnitTest.readAndEval("(initialize-subl-interface-file \"" + SubLFile_Test.class.getName() + "\" )");
		UnitTest.testEvalEquals("123", "(LATE-TEST-METHOD 123)");
		UnitTest.testEvalError("(initialize-subl-interface-file \"java.lang.String\")");
		UnitTest.testEvalEquals("T", "*MY-TEST-VAR*");
		File jfile = new File("ext/");
		if (jfile.isDirectory() && jfile.exists())
			if (IsolatedClassLoader.ALLOW_LOADING_OF_DIRS_FROM_INTERPRETER)
				UnitTest.testEvalEquals("T",
						"(load-external-code \"" + jfile.getAbsolutePath().replace("\\", "\\\\") + "\")");
			else
				UnitTest.testEvalError(
						"(load-external-code \"" + jfile.getAbsolutePath().replace("\\", "\\\\") + "\")");
		// classpath test
		jfile = new File("httpd/htdocs/java/ql/lib/cyc-framework.jar");
		if (jfile.isFile() && jfile.exists())
			UnitTest.testEvalEquals("T", "(load-external-code  \"" + jfile.toString() + "\")");
		// @todo URL test: testEvalError("T","(load-external-code
		// \"http://somewhere-non404.com/some.jar\")");
		// classfile test
		jfile = new File("build/overlay/com/cyc/tool/subl/jrtl/nativeCode/subLisp/JLinker.class");
		if (false && jfile.isFile() && jfile.exists()) { // delayed for now it
															// works basically
															// but need to make
															// a more portable
															// unit test
			UnitTest.testEvalEquals("T", "(load-external-code  \"" + jfile.toString() + "\")");
			UnitTest.testEvalEquals("T",
					"(INITIALIZE-SUBL-INTERFACE-FILE \"com.cyc.tool.subl.jrtl.nativeCode.subLisp.JLinker\")");
		}
	}

	public void testResourcer() {
		Resourcer resourcer = Resourcer.getInstance();
		for (int i = 0, size = Resourcer.ObjectArrayObjectPool.MAX_ARRAY_SIZE + 2; i < size; i++) {
			Object[] arr = null;
			try {
				arr = resourcer.acquireObjectArray(i);
				Assert.assertEquals(arr.length, i);
			} finally {
				resourcer.releaseObjectArray(arr);
			}
		}
		for (int i = 0, size = Resourcer.SubLObjectArrayObjectPool.MAX_ARRAY_SIZE + 2; i < size; i++) {
			SubLObject[] arr = null;
			try {
				arr = resourcer.acquireSubLObjectArray(i);
				Assert.assertEquals(arr.length, i);
			} finally {
				resourcer.releaseSubLObjectArray(arr);
			}
		}
	}

	public void testStreamFlushing() {
		// @todo see if SocketStreams need the same sort of testing
		try {
			File file = File.createTempFile("unit", "test");
			try {
				SubLInOutTextStream ioStream = SubLObjectFactory.makeInOutTextStream(file.getCanonicalPath(),
						CommonSymbols.OVERWRITE_KEYWORD, CommonSymbols.CREATE_KEYWORD);
				long startTime = System.nanoTime();
				int iterations = 1000;
				int outterIterations = 10;
				for (int j = 0; j < outterIterations; j++) {
					for (int i = 0; i < iterations; i++) {
						ioStream.seek(0);
						ioStream.write('a');
						ioStream.seek(1);
						ioStream.write('b');
						ioStream.seek(2);
						ioStream.write('c');
						ioStream.seek(3);
						ioStream.write('d');
						ioStream.seek(0);
						ioStream.write('d');
						ioStream.seek(1);
						ioStream.write('c');
						ioStream.seek(2);
						ioStream.write('b');
						ioStream.seek(3);
						ioStream.write('a');
					}
					ioStream.flush();
					ioStream.flush();
					ioStream.flush();
					ioStream.flush();
					for (int i = 0; i < iterations; i++) {
						ioStream.seek(1000000);
						ioStream.seek(0);
						ioStream.read();
						ioStream.seek(3);
						int theChar = ioStream.read();
						Assert.assertEquals('a', (char) theChar);
						ioStream.seek(2);
						theChar = ioStream.read();
						Assert.assertEquals('b', (char) theChar);
						ioStream.seek(1);
						theChar = ioStream.read();
						Assert.assertEquals('c', (char) theChar);
						ioStream.seek(0);
						theChar = ioStream.read();
						Assert.assertEquals('d', (char) theChar);
					}
					ioStream.flush();
				}
				long endTime = System.nanoTime();
				System.out.println("Got flush time: " + (endTime - startTime) / 1000000000.0 + "secs.");
				Assert.assertEquals(outterIterations * 1, (int) ioStream.getFlushCount());
			} finally {
				file.delete();
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	//// Main

	public void testTerminalStreams() {
		UnitTest.testEvalEquals("T", "(output-stream-p *TERMINAL-IO*)");
		UnitTest.testEvalEquals("T", "(input-stream-p *TERMINAL-IO*)");
		UnitTest.testEvalEquals("T", "(output-stream-p *STANDARD-OUTPUT*)");
		UnitTest.testEvalEquals("T", "(input-stream-p *STANDARD-OUTPUT*)");
	}

}

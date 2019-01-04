package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class research_cyc_init extends SubLTranslatedFile
{
	public static final SubLFile me;
	public static final String myName = "com.cyc.cycjava.cycl.research_cyc_init";
	public static final String myFingerPrint = "f08c09ffc03432cb2a6abab2c06945a2fb894de12aabc21b774e94f2fd7298ba";
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 907L)
	private static SubLSymbol $research_cyc_initialization_methods$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1145L)
	public static SubLSymbol $master_license_key$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1552L)
	private static SubLSymbol $research_cyc_license_key_invalid_string$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1659L)
	private static SubLSymbol $research_cyc_license_key_expired_string$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 4397L)
	private static SubLSymbol $stashed_kb_object_lookup_vars$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7034L)
	private static SubLSymbol $stashed_kb_object_content_vars$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9346L)
	private static SubLSymbol $stashed_kb_indexing_vars$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11320L)
	private static SubLSymbol $stashed_inference_vars$;
	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14292L)
	private static SubLSymbol $stashed_other_vars$;
	private static final SubLSymbol $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_;
	private static final SubLObject $list1;
	private static final SubLSymbol $sym2$_MASTER_LICENSE_KEY_;
	private static final SubLString $str3$ResearchCyc_License_Key_has_not_b;
	private static final SubLString $str4$ResearchCyc_License_Key_invalid_;
	private static final SubLString $str5$Your_current_Cyc_license_is_no_lo;
	private static final SubLSymbol $sym6$STRINGP;
	private static final SubLInteger $int7$24;
	private static final SubLString $str8$0000_0000_0000_0000_0000;
	private static final SubLList $list9;
	private static final SubLInteger $int10$256;
	private static final SubLList $list11;
	private static final SubLList $list12;
	private static final SubLInteger $int13$20000000;
	private static final SubLInteger $int14$65536;
	private static final SubLInteger $int15$4096;
	private static final SubLSymbol $sym16$UNIVERSAL_DATE_P;
	private static final SubLSymbol $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_;
	private static final SubLSymbol $kw18$UNINITIALIZED;
	private static final SubLSymbol $sym19$_CONSTANT_FROM_GUID_;
	private static final SubLSymbol $sym20$_CONSTANT_FROM_SUID_;
	private static final SubLSymbol $sym21$_NART_FROM_ID_;
	private static final SubLSymbol $sym22$_ASSERTION_FROM_ID_;
	private static final SubLSymbol $sym23$_DEDUCTION_FROM_ID_;
	private static final SubLList $list24;
	private static final SubLSymbol $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_;
	private static final SubLSymbol $sym26$_CONSTANT_GUID_TABLE_;
	private static final SubLSymbol $sym27$_NART_HL_FORMULA_TABLE_;
	private static final SubLSymbol $sym28$_ASSERTION_CONTENT_MANAGER_;
	private static final SubLList $list29;
	private static final SubLSymbol $sym30$_STASHED_KB_INDEXING_VARS_;
	private static final SubLSymbol $sym31$_CONSTANT_INDEX_MANAGER_;
	private static final SubLSymbol $sym32$_NART_INDEX_MANAGER_;
	private static final SubLList $list33;
	private static final SubLSymbol $sym34$_STASHED_INFERENCE_VARS_;
	private static final SubLSymbol $sym35$_SBHL_MODULES_;
	private static final SubLSymbol $sym36$_ISA_CACHE_;
	private static final SubLSymbol $sym37$_ALL_MTS_ISA_CACHE_;
	private static final SubLSymbol $sym38$_GENLS_CACHE_;
	private static final SubLSymbol $sym39$_ALL_MTS_GENLS_CACHE_;
	private static final SubLSymbol $sym40$_GENL_PREDICATE_CACHE_;
	private static final SubLSymbol $sym41$_GENL_INVERSE_CACHE_;
	private static final SubLSymbol $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_;
	private static final SubLSymbol $sym43$_ALL_MTS_GENL_INVERSE_CACHE_;
	private static final SubLSymbol $sym44$_SBHL_MODULE_KEY_TEST_;
	private static final SubLList $list45;
	private static final SubLSymbol $sym46$_STASHED_OTHER_VARS_;
	private static final SubLSymbol $sym47$_SUBL_EVAL_METHOD_;
	private static final SubLSymbol $sym48$_HTML_HANDLER_PROPERTY_;

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1023L)
	public static SubLObject research_cyc_initialization_funcall(final SubLObject n)
	{
		return Functions.funcall(ConsesLow.nth(n, $research_cyc_initialization_methods$.getGlobalValue()));
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1191L)
	public static SubLObject get_master_license_key()
	{
		SubLObject license_key = (SubLObject) NIL;
		license_key = $master_license_key$.getGlobalValue();
		return license_key;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1432L)
	public static SubLObject research_cyc_license_key_error()
	{
		return Errors.error((SubLObject) $str3$ResearchCyc_License_Key_has_not_b);
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 1839L)
	public static SubLObject research_cyc_install_license_key(final SubLObject license_key)
	{
		final SubLThread thread = SubLProcess.currentSubLThread();
		assert NIL != Types.stringp(license_key) : license_key;
		if (NIL != list_utilities.lengthE(license_key, (SubLObject) $int7$24, (SubLObject) UNPROVIDED))
		{
			thread.resetMultipleValues();
			final SubLObject key_integers = interpret_license_key(license_key);
			final SubLObject expiration_date = thread.secondMultipleValue();
			thread.resetMultipleValues();
			if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expiration_date.numGE(numeric_date_utilities.today()))
			{
				if (false)
					Errors.error($research_cyc_license_key_expired_string$.getGlobalValue());
			}
			SubLObject cdolist_list_var = key_integers;
			SubLObject n = (SubLObject) NIL;
			n = cdolist_list_var.first();
			while (NIL != cdolist_list_var)
			{
				research_cyc_initialization_funcall(n);
				cdolist_list_var = cdolist_list_var.rest();
				n = cdolist_list_var.first();
			}
			return (SubLObject) T;
		}
		if (NIL != list_utilities.lengthE(license_key, (SubLObject) NINETEEN_INTEGER, (SubLObject) UNPROVIDED))
		{
			Errors.error($research_cyc_license_key_expired_string$.getGlobalValue());
		} else
		{
			Errors.error($research_cyc_license_key_invalid_string$.getGlobalValue());
		}
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 2402L)
	public static SubLObject research_cyc_pre_initializations()
	{
		SubLObject license_key = get_master_license_key();
		if (NIL == license_key)
		{
			license_key = (SubLObject) $str8$0000_0000_0000_0000_0000;
		}
		research_cyc_install_license_key(license_key);
		return (SubLObject) T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 2682L)
	public static SubLObject perform_research_cyc_build_finalizations()
	{
		stash_kb_object_lookup_vars();
		stash_kb_object_content_vars();
		stash_kb_indexing_vars();
		stash_inference_vars();
		stash_other_vars();
		return (SubLObject) T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 2894L)
	public static SubLObject perform_research_cyc_load_finalizations()
	{
		perform_research_cyc_build_finalizations();
		return (SubLObject) T;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 3055L)
	public static SubLObject interpret_license_key(final SubLObject key)
	{
		final SubLObject strings = string_utilities.split_string(key, (SubLObject) $list9);
		SubLObject key_integers = (SubLObject) NIL;
		SubLObject raw_nybbles = (SubLObject) NIL;
		SubLObject expiration_date = (SubLObject) NIL;
		SubLObject cdolist_list_var = strings;
		SubLObject string = (SubLObject) NIL;
		string = cdolist_list_var.first();
		while (NIL != cdolist_list_var)
		{
			final SubLObject nybble = string_utilities.hex_char_value(Strings.sublisp_char(string, (SubLObject) ZERO_INTEGER));
			final SubLObject integer = Numbers.add(Numbers.multiply(string_utilities.hex_char_value(Strings.sublisp_char(string, (SubLObject) ONE_INTEGER)), (SubLObject) $int10$256), Numbers.multiply(string_utilities.hex_char_value(Strings.sublisp_char(string, (SubLObject) TWO_INTEGER)), (SubLObject) SIXTEEN_INTEGER),
					Numbers.multiply(string_utilities.hex_char_value(Strings.sublisp_char(string, (SubLObject) THREE_INTEGER)), (SubLObject) ONE_INTEGER));
			key_integers = (SubLObject) ConsesLow.cons(integer, key_integers);
			raw_nybbles = (SubLObject) ConsesLow.cons(nybble, raw_nybbles);
			cdolist_list_var = cdolist_list_var.rest();
			string = cdolist_list_var.first();
		}
		key_integers = Sequences.nreverse(key_integers);
		raw_nybbles = Sequences.nreverse(raw_nybbles);
		expiration_date = interpret_license_expiration_date_nybbles(raw_nybbles);
		return Values.values(key_integers, expiration_date);
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 3787L)
	public static SubLObject interpret_license_expiration_date_nybbles(final SubLObject raw_nybbles)
	{
		SubLObject nybbles = (SubLObject) NIL;
		SubLObject raw_nybble = (SubLObject) NIL;
		SubLObject raw_nybble_$1 = (SubLObject) NIL;
		SubLObject expiration_mask = (SubLObject) NIL;
		SubLObject expiration_mask_$2 = (SubLObject) NIL;
		raw_nybble = raw_nybbles;
		raw_nybble_$1 = raw_nybble.first();
		expiration_mask = (SubLObject) $list11;
		expiration_mask_$2 = expiration_mask.first();
		while (NIL != expiration_mask || NIL != raw_nybble)
		{
			nybbles = (SubLObject) ConsesLow.cons(Numbers.logxor(raw_nybble_$1, expiration_mask_$2), nybbles);
			raw_nybble = raw_nybble.rest();
			raw_nybble_$1 = raw_nybble.first();
			expiration_mask = expiration_mask.rest();
			expiration_mask_$2 = expiration_mask.first();
		}
		nybbles = Sequences.nreverse(nybbles);
		SubLObject current;
		final SubLObject datum = current = nybbles;
		SubLObject nybble4 = (SubLObject) NIL;
		SubLObject nybble5 = (SubLObject) NIL;
		SubLObject nybble6 = (SubLObject) NIL;
		SubLObject nybble7 = (SubLObject) NIL;
		SubLObject nybble8 = (SubLObject) NIL;
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list12);
		nybble4 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list12);
		nybble5 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list12);
		nybble6 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list12);
		nybble7 = current.first();
		current = current.rest();
		cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list12);
		nybble8 = current.first();
		current = current.rest();
		if (NIL != current)
		{
			cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) $list12);
			return (SubLObject) NIL;
		}
		final SubLObject date = Numbers.add(new SubLObject[]{$int13$20000000, Numbers.multiply(nybble4, (SubLObject) $int14$65536), Numbers.multiply(nybble5, (SubLObject) $int15$4096), Numbers.multiply(nybble6, (SubLObject) $int10$256), Numbers.multiply(nybble7, (SubLObject) SIXTEEN_INTEGER), Numbers.multiply(nybble8, (SubLObject) ONE_INTEGER)});
		assert NIL != numeric_date_utilities.universal_date_p(date) : date;
		return date;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 4671L)
	public static SubLObject stash_kb_object_lookup_vars()
	{
		$stashed_kb_object_lookup_vars$.setGlobalValue((SubLObject) ConsesLow.list(Symbols.symbol_value((SubLObject) $sym19$_CONSTANT_FROM_GUID_), Symbols.symbol_value((SubLObject) $sym20$_CONSTANT_FROM_SUID_), Symbols.symbol_value((SubLObject) $sym21$_NART_FROM_ID_), Symbols.symbol_value((SubLObject) $sym22$_ASSERTION_FROM_ID_), Symbols.symbol_value((SubLObject) $sym23$_DEDUCTION_FROM_ID_)));
		Symbols.set((SubLObject) $sym19$_CONSTANT_FROM_GUID_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym20$_CONSTANT_FROM_SUID_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym21$_NART_FROM_ID_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym22$_ASSERTION_FROM_ID_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym23$_DEDUCTION_FROM_ID_, (SubLObject) NIL);
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5183L)
	public static SubLObject unstash_kb_object_lookup_vars()
	{
		if ($stashed_kb_object_lookup_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE($stashed_kb_object_lookup_vars$.getGlobalValue(), (SubLObject) FIVE_INTEGER, (SubLObject) UNPROVIDED))
		{
			SubLObject current;
			final SubLObject datum = current = $stashed_kb_object_lookup_vars$.getGlobalValue();
			SubLObject one = (SubLObject) NIL;
			SubLObject two = (SubLObject) NIL;
			SubLObject three = (SubLObject) NIL;
			SubLObject four = (SubLObject) NIL;
			SubLObject five = (SubLObject) NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list24);
			one = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list24);
			two = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list24);
			three = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list24);
			four = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list24);
			five = current.first();
			current = current.rest();
			if (NIL == current)
			{
				Symbols.set((SubLObject) $sym19$_CONSTANT_FROM_GUID_, one);
				Symbols.set((SubLObject) $sym20$_CONSTANT_FROM_SUID_, two);
				Symbols.set((SubLObject) $sym21$_NART_FROM_ID_, three);
				Symbols.set((SubLObject) $sym22$_ASSERTION_FROM_ID_, four);
				Symbols.set((SubLObject) $sym23$_DEDUCTION_FROM_ID_, five);
			} else
			{
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) $list24);
			}
		}
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5668L)
	public static SubLObject unstash_kb_object_lookup_vars_1()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5760L)
	public static SubLObject unstash_kb_object_lookup_vars_2()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5851L)
	public static SubLObject unstash_kb_object_lookup_vars_3()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 5942L)
	public static SubLObject unstash_kb_object_lookup_vars_4()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6033L)
	public static SubLObject unstash_kb_object_lookup_vars_5()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6124L)
	public static SubLObject unstash_kb_object_lookup_vars_6()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6215L)
	public static SubLObject unstash_kb_object_lookup_vars_7()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6306L)
	public static SubLObject unstash_kb_object_lookup_vars_8()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6397L)
	public static SubLObject unstash_kb_object_lookup_vars_9()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6488L)
	public static SubLObject unstash_kb_object_lookup_vars_10()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6579L)
	public static SubLObject unstash_kb_object_lookup_vars_11()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6670L)
	public static SubLObject unstash_kb_object_lookup_vars_12()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6761L)
	public static SubLObject unstash_kb_object_lookup_vars_13()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6852L)
	public static SubLObject unstash_kb_object_lookup_vars_14()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 6943L)
	public static SubLObject unstash_kb_object_lookup_vars_15()
	{
		return unstash_kb_object_lookup_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7125L)
	public static SubLObject stash_kb_object_content_vars()
	{
		$stashed_kb_object_content_vars$.setGlobalValue((SubLObject) ConsesLow.list(Symbols.symbol_value((SubLObject) $sym26$_CONSTANT_GUID_TABLE_), Symbols.symbol_value((SubLObject) $sym27$_NART_HL_FORMULA_TABLE_), Symbols.symbol_value((SubLObject) $sym28$_ASSERTION_CONTENT_MANAGER_)));
		Symbols.set((SubLObject) $sym26$_CONSTANT_GUID_TABLE_, (SubLObject) $kw18$UNINITIALIZED);
		Symbols.set((SubLObject) $sym27$_NART_HL_FORMULA_TABLE_, (SubLObject) $kw18$UNINITIALIZED);
		Symbols.set((SubLObject) $sym28$_ASSERTION_CONTENT_MANAGER_, (SubLObject) $kw18$UNINITIALIZED);
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7522L)
	public static SubLObject unstash_kb_object_content_vars()
	{
		if (NIL != Symbols.symbol_value((SubLObject) $sym19$_CONSTANT_FROM_GUID_) && $stashed_kb_object_content_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE($stashed_kb_object_content_vars$.getGlobalValue(), (SubLObject) THREE_INTEGER, (SubLObject) UNPROVIDED))
		{
			SubLObject current;
			final SubLObject datum = current = $stashed_kb_object_content_vars$.getGlobalValue();
			SubLObject one = (SubLObject) NIL;
			SubLObject two = (SubLObject) NIL;
			SubLObject three = (SubLObject) NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list29);
			one = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list29);
			two = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list29);
			three = current.first();
			current = current.rest();
			if (NIL == current)
			{
				Symbols.set((SubLObject) $sym26$_CONSTANT_GUID_TABLE_, one);
				Symbols.set((SubLObject) $sym27$_NART_HL_FORMULA_TABLE_, two);
				Symbols.set((SubLObject) $sym28$_ASSERTION_CONTENT_MANAGER_, three);
			} else
			{
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) $list29);
			}
		}
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 7950L)
	public static SubLObject unstash_kb_object_content_vars_1()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8044L)
	public static SubLObject unstash_kb_object_content_vars_2()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8137L)
	public static SubLObject unstash_kb_object_content_vars_3()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8230L)
	public static SubLObject unstash_kb_object_content_vars_4()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8323L)
	public static SubLObject unstash_kb_object_content_vars_5()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8416L)
	public static SubLObject unstash_kb_object_content_vars_6()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8509L)
	public static SubLObject unstash_kb_object_content_vars_7()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8602L)
	public static SubLObject unstash_kb_object_content_vars_8()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8695L)
	public static SubLObject unstash_kb_object_content_vars_9()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8788L)
	public static SubLObject unstash_kb_object_content_vars_10()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8881L)
	public static SubLObject unstash_kb_object_content_vars_11()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 8974L)
	public static SubLObject unstash_kb_object_content_vars_12()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9067L)
	public static SubLObject unstash_kb_object_content_vars_13()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9160L)
	public static SubLObject unstash_kb_object_content_vars_14()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9253L)
	public static SubLObject unstash_kb_object_content_vars_15()
	{
		return unstash_kb_object_content_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9425L)
	public static SubLObject stash_kb_indexing_vars()
	{
		$stashed_kb_indexing_vars$.setGlobalValue((SubLObject) ConsesLow.list(Symbols.symbol_value((SubLObject) $sym31$_CONSTANT_INDEX_MANAGER_), Symbols.symbol_value((SubLObject) $sym32$_NART_INDEX_MANAGER_)));
		Symbols.set((SubLObject) $sym31$_CONSTANT_INDEX_MANAGER_, (SubLObject) $kw18$UNINITIALIZED);
		Symbols.set((SubLObject) $sym32$_NART_INDEX_MANAGER_, (SubLObject) $kw18$UNINITIALIZED);
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 9709L)
	public static SubLObject unstash_kb_indexing_vars()
	{
		if (NIL != Symbols.symbol_value((SubLObject) $sym19$_CONSTANT_FROM_GUID_) && NIL != Symbols.symbol_value((SubLObject) $sym26$_CONSTANT_GUID_TABLE_) && $stashed_kb_indexing_vars$.getGlobalValue().isList() && NIL != list_utilities.lengthE($stashed_kb_indexing_vars$.getGlobalValue(), (SubLObject) TWO_INTEGER, (SubLObject) UNPROVIDED))
		{
			SubLObject current;
			final SubLObject datum = current = $stashed_kb_indexing_vars$.getGlobalValue();
			SubLObject one = (SubLObject) NIL;
			SubLObject two = (SubLObject) NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list33);
			one = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list33);
			two = current.first();
			current = current.rest();
			if (NIL == current)
			{
				Symbols.set((SubLObject) $sym31$_CONSTANT_INDEX_MANAGER_, one);
				Symbols.set((SubLObject) $sym32$_NART_INDEX_MANAGER_, two);
			} else
			{
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) $list33);
			}
		}
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10104L)
	public static SubLObject unstash_kb_indexing_vars_1()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10186L)
	public static SubLObject unstash_kb_indexing_vars_2()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10267L)
	public static SubLObject unstash_kb_indexing_vars_3()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10348L)
	public static SubLObject unstash_kb_indexing_vars_4()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10429L)
	public static SubLObject unstash_kb_indexing_vars_5()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10510L)
	public static SubLObject unstash_kb_indexing_vars_6()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10591L)
	public static SubLObject unstash_kb_indexing_vars_7()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10672L)
	public static SubLObject unstash_kb_indexing_vars_8()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10753L)
	public static SubLObject unstash_kb_indexing_vars_9()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10834L)
	public static SubLObject unstash_kb_indexing_vars_10()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10915L)
	public static SubLObject unstash_kb_indexing_vars_11()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 10996L)
	public static SubLObject unstash_kb_indexing_vars_12()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11077L)
	public static SubLObject unstash_kb_indexing_vars_13()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11158L)
	public static SubLObject unstash_kb_indexing_vars_14()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11239L)
	public static SubLObject unstash_kb_indexing_vars_15()
	{
		return unstash_kb_indexing_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 11395L)
	public static SubLObject stash_inference_vars()
	{
		$stashed_inference_vars$.setGlobalValue((SubLObject) ConsesLow.list(new SubLObject[]{Symbols.symbol_value((SubLObject) $sym35$_SBHL_MODULES_), Symbols.symbol_value((SubLObject) $sym36$_ISA_CACHE_), Symbols.symbol_value((SubLObject) $sym37$_ALL_MTS_ISA_CACHE_), Symbols.symbol_value((SubLObject) $sym38$_GENLS_CACHE_), Symbols.symbol_value((SubLObject) $sym39$_ALL_MTS_GENLS_CACHE_),
				Symbols.symbol_value((SubLObject) $sym40$_GENL_PREDICATE_CACHE_), Symbols.symbol_value((SubLObject) $sym41$_GENL_INVERSE_CACHE_), Symbols.symbol_value((SubLObject) $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_), Symbols.symbol_value((SubLObject) $sym43$_ALL_MTS_GENL_INVERSE_CACHE_)}));
		Symbols.set((SubLObject) $sym35$_SBHL_MODULES_, dictionary.new_dictionary(Symbols.symbol_value((SubLObject) $sym44$_SBHL_MODULE_KEY_TEST_), (SubLObject) UNPROVIDED));
		Symbols.set((SubLObject) $sym36$_ISA_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym37$_ALL_MTS_ISA_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym38$_GENLS_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym39$_ALL_MTS_GENLS_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym40$_GENL_PREDICATE_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym41$_GENL_INVERSE_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym43$_ALL_MTS_GENL_INVERSE_CACHE_, (SubLObject) NIL);
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 12306L)
	public static SubLObject unstash_inference_vars()
	{
		if (NIL != Symbols.symbol_value((SubLObject) $sym19$_CONSTANT_FROM_GUID_) && NIL != Symbols.symbol_value((SubLObject) $sym26$_CONSTANT_GUID_TABLE_) && NIL != Symbols.symbol_value((SubLObject) $sym31$_CONSTANT_INDEX_MANAGER_) && $stashed_inference_vars$.getGlobalValue().isList()
				&& NIL != list_utilities.lengthE($stashed_inference_vars$.getGlobalValue(), (SubLObject) NINE_INTEGER, (SubLObject) UNPROVIDED))
		{
			SubLObject current;
			final SubLObject datum = current = $stashed_inference_vars$.getGlobalValue();
			SubLObject one = (SubLObject) NIL;
			SubLObject two = (SubLObject) NIL;
			SubLObject three = (SubLObject) NIL;
			SubLObject four = (SubLObject) NIL;
			SubLObject five = (SubLObject) NIL;
			SubLObject six = (SubLObject) NIL;
			SubLObject seven = (SubLObject) NIL;
			SubLObject eight = (SubLObject) NIL;
			SubLObject nine = (SubLObject) NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			one = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			two = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			three = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			four = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			five = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			six = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			seven = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			eight = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list45);
			nine = current.first();
			current = current.rest();
			if (NIL == current)
			{
				Symbols.set((SubLObject) $sym35$_SBHL_MODULES_, one);
				Symbols.set((SubLObject) $sym36$_ISA_CACHE_, two);
				Symbols.set((SubLObject) $sym37$_ALL_MTS_ISA_CACHE_, three);
				Symbols.set((SubLObject) $sym38$_GENLS_CACHE_, four);
				Symbols.set((SubLObject) $sym39$_ALL_MTS_GENLS_CACHE_, five);
				Symbols.set((SubLObject) $sym40$_GENL_PREDICATE_CACHE_, six);
				Symbols.set((SubLObject) $sym41$_GENL_INVERSE_CACHE_, seven);
				Symbols.set((SubLObject) $sym42$_ALL_MTS_GENL_PREDICATE_CACHE_, eight);
				Symbols.set((SubLObject) $sym43$_ALL_MTS_GENL_INVERSE_CACHE_, nine);
			} else
			{
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) $list45);
			}
		}
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13136L)
	public static SubLObject unstash_inference_vars_1()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13214L)
	public static SubLObject unstash_inference_vars_2()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13291L)
	public static SubLObject unstash_inference_vars_3()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13368L)
	public static SubLObject unstash_inference_vars_4()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13445L)
	public static SubLObject unstash_inference_vars_5()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13522L)
	public static SubLObject unstash_inference_vars_6()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13599L)
	public static SubLObject unstash_inference_vars_7()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13676L)
	public static SubLObject unstash_inference_vars_8()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13753L)
	public static SubLObject unstash_inference_vars_9()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13830L)
	public static SubLObject unstash_inference_vars_10()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13907L)
	public static SubLObject unstash_inference_vars_11()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 13984L)
	public static SubLObject unstash_inference_vars_12()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14061L)
	public static SubLObject unstash_inference_vars_13()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14138L)
	public static SubLObject unstash_inference_vars_14()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14215L)
	public static SubLObject unstash_inference_vars_15()
	{
		return unstash_inference_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14359L)
	public static SubLObject stash_other_vars()
	{
		$stashed_other_vars$.setGlobalValue((SubLObject) ConsesLow.list(Symbols.symbol_value((SubLObject) $sym47$_SUBL_EVAL_METHOD_), Symbols.symbol_value((SubLObject) $sym48$_HTML_HANDLER_PROPERTY_)));
		Symbols.set((SubLObject) $sym47$_SUBL_EVAL_METHOD_, (SubLObject) NIL);
		Symbols.set((SubLObject) $sym48$_HTML_HANDLER_PROPERTY_, (SubLObject) NIL);
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 14604L)
	public static SubLObject unstash_other_vars()
	{
		if (NIL != Symbols.symbol_value((SubLObject) $sym19$_CONSTANT_FROM_GUID_) && NIL != Symbols.symbol_value((SubLObject) $sym26$_CONSTANT_GUID_TABLE_) && NIL != Symbols.symbol_value((SubLObject) $sym31$_CONSTANT_INDEX_MANAGER_) && NIL != Symbols.symbol_value((SubLObject) $sym35$_SBHL_MODULES_) && $stashed_other_vars$.getGlobalValue().isList()
				&& NIL != list_utilities.lengthE($stashed_other_vars$.getGlobalValue(), (SubLObject) TWO_INTEGER, (SubLObject) UNPROVIDED))
		{
			SubLObject current;
			final SubLObject datum = current = $stashed_other_vars$.getGlobalValue();
			SubLObject one = (SubLObject) NIL;
			SubLObject two = (SubLObject) NIL;
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list33);
			one = current.first();
			current = current.rest();
			cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject) $list33);
			two = current.first();
			current = current.rest();
			if (NIL == current)
			{
				Symbols.set((SubLObject) $sym47$_SUBL_EVAL_METHOD_, one);
				Symbols.set((SubLObject) $sym48$_HTML_HANDLER_PROPERTY_, two);
			} else
			{
				cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject) $list33);
			}
		}
		return (SubLObject) NIL;
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15061L)
	public static SubLObject unstash_other_vars_1()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15131L)
	public static SubLObject unstash_other_vars_2()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15200L)
	public static SubLObject unstash_other_vars_3()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15269L)
	public static SubLObject unstash_other_vars_4()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15338L)
	public static SubLObject unstash_other_vars_5()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15407L)
	public static SubLObject unstash_other_vars_6()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15476L)
	public static SubLObject unstash_other_vars_7()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15545L)
	public static SubLObject unstash_other_vars_8()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15614L)
	public static SubLObject unstash_other_vars_9()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15683L)
	public static SubLObject unstash_other_vars_10()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15752L)
	public static SubLObject unstash_other_vars_11()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15821L)
	public static SubLObject unstash_other_vars_12()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15890L)
	public static SubLObject unstash_other_vars_13()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 15959L)
	public static SubLObject unstash_other_vars_14()
	{
		return unstash_other_vars();
	}

	@SubLTranslatedFile.SubL(source = "cycl/research-cyc-init.lisp", position = 16028L)
	public static SubLObject unstash_other_vars_15()
	{
		return unstash_other_vars();
	}

	public static SubLObject declare_research_cyc_init_file()
	{
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "research_cyc_initialization_funcall", "RESEARCH-CYC-INITIALIZATION-FUNCALL", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "get_master_license_key", "GET-MASTER-LICENSE-KEY", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "research_cyc_license_key_error", "RESEARCH-CYC-LICENSE-KEY-ERROR", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "research_cyc_install_license_key", "RESEARCH-CYC-INSTALL-LICENSE-KEY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "research_cyc_pre_initializations", "RESEARCH-CYC-PRE-INITIALIZATIONS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "perform_research_cyc_build_finalizations", "PERFORM-RESEARCH-CYC-BUILD-FINALIZATIONS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "perform_research_cyc_load_finalizations", "PERFORM-RESEARCH-CYC-LOAD-FINALIZATIONS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "interpret_license_key", "INTERPRET-LICENSE-KEY", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "interpret_license_expiration_date_nybbles", "INTERPRET-LICENSE-EXPIRATION-DATE-NYBBLES", 1, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "stash_kb_object_lookup_vars", "STASH-KB-OBJECT-LOOKUP-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars", "UNSTASH-KB-OBJECT-LOOKUP-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_1", "UNSTASH-KB-OBJECT-LOOKUP-VARS-1", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_2", "UNSTASH-KB-OBJECT-LOOKUP-VARS-2", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_3", "UNSTASH-KB-OBJECT-LOOKUP-VARS-3", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_4", "UNSTASH-KB-OBJECT-LOOKUP-VARS-4", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_5", "UNSTASH-KB-OBJECT-LOOKUP-VARS-5", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_6", "UNSTASH-KB-OBJECT-LOOKUP-VARS-6", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_7", "UNSTASH-KB-OBJECT-LOOKUP-VARS-7", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_8", "UNSTASH-KB-OBJECT-LOOKUP-VARS-8", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_9", "UNSTASH-KB-OBJECT-LOOKUP-VARS-9", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_10", "UNSTASH-KB-OBJECT-LOOKUP-VARS-10", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_11", "UNSTASH-KB-OBJECT-LOOKUP-VARS-11", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_12", "UNSTASH-KB-OBJECT-LOOKUP-VARS-12", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_13", "UNSTASH-KB-OBJECT-LOOKUP-VARS-13", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_14", "UNSTASH-KB-OBJECT-LOOKUP-VARS-14", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_lookup_vars_15", "UNSTASH-KB-OBJECT-LOOKUP-VARS-15", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "stash_kb_object_content_vars", "STASH-KB-OBJECT-CONTENT-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars", "UNSTASH-KB-OBJECT-CONTENT-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_1", "UNSTASH-KB-OBJECT-CONTENT-VARS-1", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_2", "UNSTASH-KB-OBJECT-CONTENT-VARS-2", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_3", "UNSTASH-KB-OBJECT-CONTENT-VARS-3", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_4", "UNSTASH-KB-OBJECT-CONTENT-VARS-4", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_5", "UNSTASH-KB-OBJECT-CONTENT-VARS-5", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_6", "UNSTASH-KB-OBJECT-CONTENT-VARS-6", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_7", "UNSTASH-KB-OBJECT-CONTENT-VARS-7", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_8", "UNSTASH-KB-OBJECT-CONTENT-VARS-8", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_9", "UNSTASH-KB-OBJECT-CONTENT-VARS-9", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_10", "UNSTASH-KB-OBJECT-CONTENT-VARS-10", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_11", "UNSTASH-KB-OBJECT-CONTENT-VARS-11", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_12", "UNSTASH-KB-OBJECT-CONTENT-VARS-12", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_13", "UNSTASH-KB-OBJECT-CONTENT-VARS-13", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_14", "UNSTASH-KB-OBJECT-CONTENT-VARS-14", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_object_content_vars_15", "UNSTASH-KB-OBJECT-CONTENT-VARS-15", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "stash_kb_indexing_vars", "STASH-KB-INDEXING-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars", "UNSTASH-KB-INDEXING-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_1", "UNSTASH-KB-INDEXING-VARS-1", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_2", "UNSTASH-KB-INDEXING-VARS-2", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_3", "UNSTASH-KB-INDEXING-VARS-3", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_4", "UNSTASH-KB-INDEXING-VARS-4", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_5", "UNSTASH-KB-INDEXING-VARS-5", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_6", "UNSTASH-KB-INDEXING-VARS-6", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_7", "UNSTASH-KB-INDEXING-VARS-7", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_8", "UNSTASH-KB-INDEXING-VARS-8", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_9", "UNSTASH-KB-INDEXING-VARS-9", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_10", "UNSTASH-KB-INDEXING-VARS-10", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_11", "UNSTASH-KB-INDEXING-VARS-11", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_12", "UNSTASH-KB-INDEXING-VARS-12", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_13", "UNSTASH-KB-INDEXING-VARS-13", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_14", "UNSTASH-KB-INDEXING-VARS-14", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_kb_indexing_vars_15", "UNSTASH-KB-INDEXING-VARS-15", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "stash_inference_vars", "STASH-INFERENCE-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars", "UNSTASH-INFERENCE-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_1", "UNSTASH-INFERENCE-VARS-1", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_2", "UNSTASH-INFERENCE-VARS-2", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_3", "UNSTASH-INFERENCE-VARS-3", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_4", "UNSTASH-INFERENCE-VARS-4", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_5", "UNSTASH-INFERENCE-VARS-5", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_6", "UNSTASH-INFERENCE-VARS-6", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_7", "UNSTASH-INFERENCE-VARS-7", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_8", "UNSTASH-INFERENCE-VARS-8", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_9", "UNSTASH-INFERENCE-VARS-9", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_10", "UNSTASH-INFERENCE-VARS-10", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_11", "UNSTASH-INFERENCE-VARS-11", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_12", "UNSTASH-INFERENCE-VARS-12", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_13", "UNSTASH-INFERENCE-VARS-13", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_14", "UNSTASH-INFERENCE-VARS-14", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_inference_vars_15", "UNSTASH-INFERENCE-VARS-15", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "stash_other_vars", "STASH-OTHER-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars", "UNSTASH-OTHER-VARS", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_1", "UNSTASH-OTHER-VARS-1", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_2", "UNSTASH-OTHER-VARS-2", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_3", "UNSTASH-OTHER-VARS-3", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_4", "UNSTASH-OTHER-VARS-4", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_5", "UNSTASH-OTHER-VARS-5", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_6", "UNSTASH-OTHER-VARS-6", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_7", "UNSTASH-OTHER-VARS-7", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_8", "UNSTASH-OTHER-VARS-8", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_9", "UNSTASH-OTHER-VARS-9", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_10", "UNSTASH-OTHER-VARS-10", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_11", "UNSTASH-OTHER-VARS-11", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_12", "UNSTASH-OTHER-VARS-12", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_13", "UNSTASH-OTHER-VARS-13", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_14", "UNSTASH-OTHER-VARS-14", 0, 0, false);
		SubLFiles.declareFunction("com.cyc.cycjava.cycl.research_cyc_init", "unstash_other_vars_15", "UNSTASH-OTHER-VARS-15", 0, 0, false);
		return (SubLObject) NIL;
	}

	public static SubLObject init_research_cyc_init_file()
	{
		$research_cyc_initialization_methods$ = SubLFiles.deflexical("*RESEARCH-CYC-INITIALIZATION-METHODS*", (NIL != Symbols.boundp((SubLObject) $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_)) ? $research_cyc_initialization_methods$.getGlobalValue() : $list1);
		$master_license_key$ = SubLFiles.deflexical("*MASTER-LICENSE-KEY*", (SubLObject) ((NIL != Symbols.boundp((SubLObject) $sym2$_MASTER_LICENSE_KEY_)) ? $master_license_key$.getGlobalValue() : NIL));
		$research_cyc_license_key_invalid_string$ = SubLFiles.deflexical("*RESEARCH-CYC-LICENSE-KEY-INVALID-STRING*", (SubLObject) $str4$ResearchCyc_License_Key_invalid_);
		$research_cyc_license_key_expired_string$ = SubLFiles.deflexical("*RESEARCH-CYC-LICENSE-KEY-EXPIRED-STRING*", (SubLObject) $str5$Your_current_Cyc_license_is_no_lo);
		$stashed_kb_object_lookup_vars$ = SubLFiles.deflexical("*STASHED-KB-OBJECT-LOOKUP-VARS*", (SubLObject) ((NIL != Symbols.boundp((SubLObject) $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_)) ? $stashed_kb_object_lookup_vars$.getGlobalValue() : $kw18$UNINITIALIZED));
		$stashed_kb_object_content_vars$ = SubLFiles.deflexical("*STASHED-KB-OBJECT-CONTENT-VARS*", (SubLObject) ((NIL != Symbols.boundp((SubLObject) $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_)) ? $stashed_kb_object_content_vars$.getGlobalValue() : $kw18$UNINITIALIZED));
		$stashed_kb_indexing_vars$ = SubLFiles.deflexical("*STASHED-KB-INDEXING-VARS*", (SubLObject) ((NIL != Symbols.boundp((SubLObject) $sym30$_STASHED_KB_INDEXING_VARS_)) ? $stashed_kb_indexing_vars$.getGlobalValue() : $kw18$UNINITIALIZED));
		$stashed_inference_vars$ = SubLFiles.deflexical("*STASHED-INFERENCE-VARS*", (SubLObject) ((NIL != Symbols.boundp((SubLObject) $sym34$_STASHED_INFERENCE_VARS_)) ? $stashed_inference_vars$.getGlobalValue() : $kw18$UNINITIALIZED));
		$stashed_other_vars$ = SubLFiles.deflexical("*STASHED-OTHER-VARS*", (SubLObject) ((NIL != Symbols.boundp((SubLObject) $sym46$_STASHED_OTHER_VARS_)) ? $stashed_other_vars$.getGlobalValue() : $kw18$UNINITIALIZED));
		return (SubLObject) NIL;
	}

	public static SubLObject setup_research_cyc_init_file()
	{
		subl_macro_promotions.declare_defglobal((SubLObject) $sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_);
		subl_macro_promotions.declare_defglobal((SubLObject) $sym2$_MASTER_LICENSE_KEY_);
		subl_macro_promotions.declare_defglobal((SubLObject) $sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_);
		subl_macro_promotions.declare_defglobal((SubLObject) $sym25$_STASHED_KB_OBJECT_CONTENT_VARS_);
		subl_macro_promotions.declare_defglobal((SubLObject) $sym30$_STASHED_KB_INDEXING_VARS_);
		subl_macro_promotions.declare_defglobal((SubLObject) $sym34$_STASHED_INFERENCE_VARS_);
		subl_macro_promotions.declare_defglobal((SubLObject) $sym46$_STASHED_OTHER_VARS_);
		return (SubLObject) NIL;
	}

	private static SubLObject _constant_1_initializer()
	{
		return (SubLObject) ConsesLow.list(new SubLObject[]{SubLObjectFactory.makeSymbol("RESEARCH-CYC-LICENSE-KEY-ERROR"), SubLObjectFactory.makeSymbol("NL-TRIE-NAME-STRING-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-CLARIFYING-COLLECTION?"), SubLObjectFactory.makeSymbol("CLEAR-GET-DEFAULT-DOCUMENT-INGESTER-ANNOTATION-LEXICON"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-11"),
				SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER"), SubLObjectFactory.makeSymbol("HTML-INSIDE-BODY-P"), SubLObjectFactory.makeSymbol("CLEAR-PPH-PHRASE-ID-DEMERITS"), SubLObjectFactory.makeSymbol("CB-NAT-HISTORY-ITEMS"), SubLObjectFactory.makeSymbol("LOAD-NAMESPACE-TRANSCRIPTS"), SubLObjectFactory.makeSymbol("PARSING-TIMEOUT-TIME-REMAINING"),
				SubLObjectFactory.makeSymbol("KBP-NODE-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-GET-CODE-FOR-LANGUAGE"), SubLObjectFactory.makeSymbol("SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("ALL-CYC-TESTS-ARE-VALID"), SubLObjectFactory.makeSymbol("SKSI-BATCH-TRANSLATE-COERCE-TYPES?"),
				SubLObjectFactory.makeSymbol("BESTPARENTHETICALPHRASEFN"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-4"), SubLObjectFactory.makeSymbol("ENSURE-RKF-EVENT-DISPATCHER-RUNNING"), SubLObjectFactory.makeSymbol("CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL"), SubLObjectFactory.makeSymbol("POSSIBLY-CONVERT-NART-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS"),
				SubLObjectFactory.makeSymbol("CLEAR-ALL-SPECS-SET"), SubLObjectFactory.makeSymbol("PLURALPARAPHRASEFN"), SubLObjectFactory.makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE"), SubLObjectFactory.makeSymbol("HAS-KB-STORAGE-CLIENT?"), SubLObjectFactory.makeSymbol("ALL-CORE-CONSTANTS"), SubLObjectFactory.makeSymbol("PPH-NEW-EMPTY-MAP"), SubLObjectFactory.makeSymbol("GET-SQS-VERSION"),
				SubLObjectFactory.makeSymbol("NEW-PROBLEM-STRATEGIC-PROPERTIES"), SubLObjectFactory.makeSymbol("REMOVE-SENTENTIAL-OPERATORS"), SubLObjectFactory.makeSymbol("ALL-QUERY-DYNAMIC-PROPERTIES"), SubLObjectFactory.makeSymbol("CB-SERVER-SHOW-TRANSMIT-QUEUE?"), SubLObjectFactory.makeSymbol("CLEAR-GEN-TEMPLATE-VERBOSITY"), SubLObjectFactory.makeSymbol("HALT-JAVA-API-LEASE-MONITOR"),
				SubLObjectFactory.makeSymbol("SORT-TRANSCRIPT-RENAMES"), SubLObjectFactory.makeSymbol("META-REMOVAL-MODULE-LIST"), SubLObjectFactory.makeSymbol("SC-PARSING-MT"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-UNIT-TEST-NAMES"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-CURRENT-HOST-NAME"), SubLObjectFactory.makeSymbol("DUPLICATE-KB-HL-SUPPORTS"),
				SubLObjectFactory.makeSymbol("GET-ARC-LEXICON-SLURPER"), SubLObjectFactory.makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL"), SubLObjectFactory.makeSymbol("COMPUTE-CORE-RAW-CONSTANTS"), SubLObjectFactory.makeSymbol("IS-SQS-AVAILABLE?"), SubLObjectFactory.makeSymbol("OUTPUT-GENERATE-TEXT-BAD-RESULTS"), SubLObjectFactory.makeSymbol("INITIALIZE-NON-FORT-ISA-TABLES"),
				SubLObjectFactory.makeSymbol("OPTIMIZE-SBHL-STORE"), SubLObjectFactory.makeSymbol("CLEAR-RELATION-MOST-RESTRICTED-ARG"), SubLObjectFactory.makeSymbol("CLEAR-L2R-SUPERTEXT-INDEXICAL"), SubLObjectFactory.makeSymbol("EXPLICITIFCOLLECTION-NLPHRASEFN"), SubLObjectFactory.makeSymbol("CLEAR-BUILD-FACT-SHEET-DEFAULT-DOMAIN-MT"), SubLObjectFactory.makeSymbol("CLEAR-RELEVANT-TEMPLATE-MTS"),
				SubLObjectFactory.makeSymbol("AUXILIARY-QUEUE-PEEK"), SubLObjectFactory.makeSymbol("CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("CLEAR-NEW-KB-STATE"), SubLObjectFactory.makeSymbol("PPH-REGRESSION-TRACKING-RESET-SKIPS"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-DIRECTION"), SubLObjectFactory.makeSymbol("CLEAR-EXTERNAL-IDENTIFICATION-FOR-CHOICE"),
				SubLObjectFactory.makeSymbol("INITIALIZE-SKSI-DATA-STRUCTURES"), SubLObjectFactory.makeSymbol("SPEECH-PARTS-INITIALIZED?"), SubLObjectFactory.makeSymbol("OPERATOR-FORMULAS-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("CLEAR-ANSWER-QUESTION"), SubLObjectFactory.makeSymbol("CLEAR-PS-PARSE-VBAR-INT-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-PSP-HEAD-KEY-FOR-CATEGORY"),
				SubLObjectFactory.makeSymbol("CYC-SYSTEM-DOC-NAMING-CONVENTIONS"), SubLObjectFactory.makeSymbol("SBHL-NEW-SPACE-SOURCE"), SubLObjectFactory.makeSymbol("MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT"), SubLObjectFactory.makeSymbol("GT-SEARCH-INDEX-ARG"), SubLObjectFactory.makeSymbol("GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM"), SubLObjectFactory.makeSymbol("CLEAR-RELATION-ARGS-SORTED-BY-RESTRICTION"),
				SubLObjectFactory.makeSymbol("STASH-KB-INDEXING-VARS"), SubLObjectFactory.makeSymbol("POSSIBLY-CULL-LOADED-RDF-GRAPHS"), SubLObjectFactory.makeSymbol("SOFTWARE-TYPE"), SubLObjectFactory.makeSymbol("SBHL-BACKWARD-SEARCH-P"), SubLObjectFactory.makeSymbol("KB-MODIFICATIONS-EVENT-DISPATCHER-RUNNING?"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-FILENAME-SECTION"),
				SubLObjectFactory.makeSymbol("PARTITION-COMMON-SYMBOLS"), SubLObjectFactory.makeSymbol("START-SCHEDULED-QUERY-PROCESSING-INTERNAL"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-12"), SubLObjectFactory.makeSymbol("NEW-RANDOM-BASIS-FOR-SKOLEM-NAME"), SubLObjectFactory.makeSymbol("QC-ACT-NEW-STATE"), SubLObjectFactory.makeSymbol("COMPLEX-INDEX-KEYS-DEFINED-P"),
				SubLObjectFactory.makeSymbol("CLEAR-XML-NAME"), SubLObjectFactory.makeSymbol("INITIALIZE-NON-THELOGICALFIELDVALUEFN-LFI-FORT-CACHE"), SubLObjectFactory.makeSymbol("RC-NEW-RHS"), SubLObjectFactory.makeSymbol("UNINITIALIZED"), SubLObjectFactory.makeSymbol("COMPUTE-RESEARCH-CYC-INITIALIZATION-METHODS"), SubLObjectFactory.makeSymbol("SAVE-RECENT-EXPERIENCE-INTERNAL"),
				SubLObjectFactory.makeSymbol("MAKE-EMPTY-UI-REQUEST"), SubLObjectFactory.makeSymbol("GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-DOCUMENT-ANNOTATION-TERM-ID"), SubLObjectFactory.makeSymbol("PENNTAG-PHRASE-CATEGORIES"),
				SubLObjectFactory.makeSymbol("CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT"), SubLObjectFactory.makeSymbol("CATEGORIZE-KCT-INVALIDITY-REASONS"), SubLObjectFactory.makeSymbol("CLEAR-MEANING-SENTENCE-MTS"), SubLObjectFactory.makeSymbol("CB-SERVER-SHOW-TRANSMIT-QUEUE?"), SubLObjectFactory.makeSymbol("GET-SBHL-OPPOSITE-LINK-DIRECTION"),
				SubLObjectFactory.makeSymbol("ALL-FORWARD-RULES"), SubLObjectFactory.makeSymbol("KCT-ANY-THINKING-RUNNING?"), SubLObjectFactory.makeSymbol("CLEAR-CONSTANT-TABLES"), SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("POSSIBLY-CONVERT-CONSTANT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS"),
				SubLObjectFactory.makeSymbol("SBHL-JUSTIFICATION-ASSEMBLED-P"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-GET-RAW-VAR"), SubLObjectFactory.makeSymbol("INITIALIZE-SPEECH-PART-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-KNOWN-NEGATED-BINDINGS-FOR-SENTENCE"), SubLObjectFactory.makeSymbol("CLEAR-RESULT"), SubLObjectFactory.makeSymbol("UNLINKEDSUBPARAPHRASEFN"),
				SubLObjectFactory.makeSymbol("LAST-QUERY-SET-RUN"), SubLObjectFactory.makeSymbol("CB-SERVER-SHOW-LOCAL-QUEUE?"), SubLObjectFactory.makeSymbol("CLEAR-PSP-DEVISABLE-VERB-FRAMES"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-SHOW-PRAGMATICS"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-RAW-CONSTANTS"), SubLObjectFactory.makeSymbol("WIDE-ASSERTION-HL-STORE-CACHE?"),
				SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-FULLY-PROPAGATING-RULE?"), SubLObjectFactory.makeSymbol("INITIALIZE-DISJOINT-WITH-MODULE"), SubLObjectFactory.makeSymbol("HAS-NEW-CONSTANTS?"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-14"), SubLObjectFactory.makeSymbol("HAS-NEW-NARTS?"), SubLObjectFactory.makeSymbol("CREATE-SAMPLE-INVALID-CLAUSE-STRUC"),
				SubLObjectFactory.makeSymbol("WNI-SYNSET-INDIVIDUALS"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSET-VERB-FRAMES-HELPER"), SubLObjectFactory.makeSymbol("DISABLE-AGENDA-DAILY-GC"), SubLObjectFactory.makeSymbol("RBP-UNTRACE-ALL-RULES"), SubLObjectFactory.makeSymbol("NEW-CFASL-COUNT-STREAM"), SubLObjectFactory.makeSymbol("XML-CDATA-SUFFIX"),
				SubLObjectFactory.makeSymbol("FIND-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("GET-AVAILABLE-SEARCH-ENGINES"), SubLObjectFactory.makeSymbol("CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE"), SubLObjectFactory.makeSymbol("MEDIUM-TOMBSTONING-MODE?"), SubLObjectFactory.makeSymbol("CONSTANT-READER-MACRO-CHAR"),
				SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-SUBPROTOCOL"), SubLObjectFactory.makeSymbol("NEW-MWP-PREFIX-MATCHER"), SubLObjectFactory.makeSymbol("LOCAL-QUEUE-PEEK"), SubLObjectFactory.makeSymbol("NEW-MUTED-NART-INDEX-ITERATOR"), SubLObjectFactory.makeSymbol("GET-TERM-LEXICON"), SubLObjectFactory.makeSymbol("CLEAR-KEYWORD-FOR-PRED"), SubLObjectFactory.makeSymbol("GET-SANITY-CHECKER"),
				SubLObjectFactory.makeSymbol("CONFIGURE-APP-COLORS"), SubLObjectFactory.makeSymbol("CLEAR-GET-OBJECT-BY-HL-ID-STRING"), SubLObjectFactory.makeSymbol("NOTE-NEW-PROBLEM-CREATED"), SubLObjectFactory.makeSymbol("CLEAR-PPH-VAR-TYPING-PREDICATES"), SubLObjectFactory.makeSymbol("UNINDEXED-HLMT-SYNTAX-CONSTANTS"), SubLObjectFactory.makeSymbol("ALL-FORWARD-GAFS"),
				SubLObjectFactory.makeSymbol("CB-DELETE-ALL-PROOF-CHECKER-RULES"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-RULES"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-BOOKKEEPING-GAFS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("SHOW-KB-FEATURES"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-PHYSICALLOCATION"),
				SubLObjectFactory.makeSymbol("FUNCTION-RULE-TOP-LEVEL-KEY"), SubLObjectFactory.makeSymbol("PARTITION-INVALID-MISSING-TERMS-COUNT"), SubLObjectFactory.makeSymbol("WITHIN-NEGATION?"), SubLObjectFactory.makeSymbol("ADDITIONAL-KIF-DEFINITIONS"), SubLObjectFactory.makeSymbol("PPH-NEW-IDENTITY-MAP"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE"),
				SubLObjectFactory.makeSymbol("CLEAR-WEB-CONCEPTUALLY-RELATED"), SubLObjectFactory.makeSymbol("DECLARE-NL-TRIE-NOT-KNOWN-STALE"), SubLObjectFactory.makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("*RAL-SUB-EVENTS-FROM-SUB-EVENT-TYPES-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("ENSURE-INFERENCE-EVENT-DISPATCHER-RUNNING"),
				SubLObjectFactory.makeSymbol("PSP-SEMX-CLEAR-HANDLERS"), SubLObjectFactory.makeSymbol("ASSERTION-INDEXING-STORE"), SubLObjectFactory.makeSymbol("CONFLICT-HANDLER"), SubLObjectFactory.makeSymbol("OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?"), SubLObjectFactory.makeSymbol("AGENDA-PROCESS"), SubLObjectFactory.makeSymbol("REMOVE-CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS"),
				SubLObjectFactory.makeSymbol("ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("CB-C-BOOKKEEPING-HEADER"), SubLObjectFactory.makeSymbol("COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?"), SubLObjectFactory.makeSymbol("BROADER-TERM-PREDS"), SubLObjectFactory.makeSymbol("REFORMULATOR-FULLY-INITIALIZED?"), SubLObjectFactory.makeSymbol("RKF-EXAMPLE-INSTANCES-BACKCHAIN-LEVEL"),
				SubLObjectFactory.makeSymbol("EMPTY-THOUGHT"), SubLObjectFactory.makeSymbol("SET-TO-RECEIVING-EVERYTHING"), SubLObjectFactory.makeSymbol("CLEAR-ALL-EXISTING-INDEXING"), SubLObjectFactory.makeSymbol("KEYHASH-EMPTY-KEY"), SubLObjectFactory.makeSymbol("MWP-RULE-SPEC-TABLE-INIT"), SubLObjectFactory.makeSymbol("REMOVE-L2R-DOCUMENT-INDEXICAL"),
				SubLObjectFactory.makeSymbol("INSERT-KB-NOT-CURRENT-MESSAGE"), SubLObjectFactory.makeSymbol("ENSURE-GUARDIAN-RUNNING"), SubLObjectFactory.makeSymbol("LEXICON-INITIALIZED-P"), SubLObjectFactory.makeSymbol("SBHL-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PERFORM-INDEXING-PRE-DUMP-CLEANUP"), SubLObjectFactory.makeSymbol("BREAK-ON-FAILURE?"),
				SubLObjectFactory.makeSymbol("CLEAR-PARTITION-LOADER-STATE"), SubLObjectFactory.makeSymbol("CB-USE-MTS-FILTER"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-INTEGERS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("WITHIN-NEGATION?"), SubLObjectFactory.makeSymbol("CLEAR-AGENDA-PROCESS"), SubLObjectFactory.makeSymbol("RL-TACTICIAN-NEURAL-NET"),
				SubLObjectFactory.makeSymbol("INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE"), SubLObjectFactory.makeSymbol("INITIALIZE-PENNTAG-FORTS"), SubLObjectFactory.makeSymbol("ALL-OS-PROCESSES"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING"), SubLObjectFactory.makeSymbol("REFORMULATOR-RULE-PREDICATES"),
				SubLObjectFactory.makeSymbol("CONSOLE-TASK-PROCESSORS-INITIALIZED-P"), SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-COL-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("NOT-GENL-INVERSE-MODE-P"), SubLObjectFactory.makeSymbol("NEW-WNI-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("UNLEXIFIED-TERM-DISCOVERY-LOGGING-REQUESTED?"),
				SubLObjectFactory.makeSymbol("TVA-CACHE-SPEC-PREDS-TOTAL-TIME"), SubLObjectFactory.makeSymbol("CLEAR-RDFS-EXPANDED-NAME"), SubLObjectFactory.makeSymbol("FORCE-CHARNIAK-PARSER-AVAILABLE?"), SubLObjectFactory.makeSymbol("OWL-EXPORTER2-ID-MAP"), SubLObjectFactory.makeSymbol("EMPTY-THOUGHT"), SubLObjectFactory.makeSymbol("HALT-JAVA-API-LEASE-MONITOR"),
				SubLObjectFactory.makeSymbol("CONSTANT-NAMES-IN-CODE-BUT-NOT-KB"), SubLObjectFactory.makeSymbol("CLEAR-GET-CONCEPT-TAGS-FROM-STRING"), SubLObjectFactory.makeSymbol("ALL-TCP-SERVERS"), SubLObjectFactory.makeSymbol("IDENTIFY-KBS-DEDUCTIONS"), SubLObjectFactory.makeSymbol("CB-C-BOOKKEEPING-HEADER"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-12"),
				SubLObjectFactory.makeSymbol("SYSTEM-CODE-API-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("RESET-OLD-QUOTED-DEFNS-REJECT?-METERS"), SubLObjectFactory.makeSymbol("ALL-CLONED-BLN-TERMS"), SubLObjectFactory.makeSymbol("CLEAR-GET-LANGUAGE-FOR-CODE"), SubLObjectFactory.makeSymbol("SBHL-JUSTIFICATION-ASSEMBLED"), SubLObjectFactory.makeSymbol("FORWARD-MODULES"),
				SubLObjectFactory.makeSymbol("DECLARE-GEN-TEMPLATE-STORE-STALENESS-UNACCEPTABLE"), SubLObjectFactory.makeSymbol("CLEAR-XML-TOKENS-FROM-FILE"), SubLObjectFactory.makeSymbol("REBUILD-SBHL-MODULES"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-STATISTICS-COUNT"), SubLObjectFactory.makeSymbol("HL-TRANSCRIPT-QUEUE-SIZE"),
				SubLObjectFactory.makeSymbol("SPECIFIC-PREFERENCE-MODULE-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-WNI-UNRANKED-SYNSETS-FOR-ENGLISH-WORD-STRING"), SubLObjectFactory.makeSymbol("WFF-CHECK-VARS?"), SubLObjectFactory.makeSymbol("REFORMULATOR-RULE-SPEC-PREDS"), SubLObjectFactory.makeSymbol("GET-FILE-BACKED-NART-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("RESET-RKF-IRRELEVANT-FORT-CACHE"),
				SubLObjectFactory.makeSymbol("BYTE-ORDER-MARK"), SubLObjectFactory.makeSymbol("RUN-BASELINE-TESTS"), SubLObjectFactory.makeSymbol("MAKE-HTML-CYC-LOGIN-SESSION"), SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS"), SubLObjectFactory.makeSymbol("HOURLY-FACT-SHEET-STATS"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-PARENT-MARKING"),
				SubLObjectFactory.makeSymbol("OTHER-TOP-LEVEL-KEY"), SubLObjectFactory.makeSymbol("PPH-REGRESSION-TRACKING-PRINT-SKIPS"), SubLObjectFactory.makeSymbol("INITIALIZE-REFORMULATOR-RULES-TO-USE"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-LEXICAL-CACHES"), SubLObjectFactory.makeSymbol("PPH-UNKNOWN-CYCL"), SubLObjectFactory.makeSymbol("CLEAR-PSP-RULES"),
				SubLObjectFactory.makeSymbol("WITHIN-QUERY-TENSE-CZER-MODE?"), SubLObjectFactory.makeSymbol("NEW-NULL-ACCUMULATOR"), SubLObjectFactory.makeSymbol("INCREMENT-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("USER-ACTIONS-EMPTY?"), SubLObjectFactory.makeSymbol("CURRENT-GUARDIAN-PROCESS"), SubLObjectFactory.makeSymbol("CLEAR-DECOMPOSE-CONCEPT-FILTER-SPEC"),
				SubLObjectFactory.makeSymbol("DESTROY-DUPLICATE-KB-HL-SUPPORTS"), SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-CANDIDATE-GENL-PREDS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-9"), SubLObjectFactory.makeSymbol("NART-INDEX-USAGE-COUNTS-ENABLED-P"), SubLObjectFactory.makeSymbol("CB-RTV-FORT-GENERATION-FN"),
				SubLObjectFactory.makeSymbol("ARETE-DISABLE-GLOBAL-LOGGING"), SubLObjectFactory.makeSymbol("CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX"), SubLObjectFactory.makeSymbol("CLEAR-GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION"), SubLObjectFactory.makeSymbol("FACT-SHEET-MIN-PARAGRAPH-LENGTH"), SubLObjectFactory.makeSymbol("COUNT-NEW-CONSTANTS"), SubLObjectFactory.makeSymbol("BLAST-KE-STATE"),
				SubLObjectFactory.makeSymbol("GET-ILP-EXPORT-INPUT-MODES-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("CHECK-ASSERTIBLE-LITERAL?"), SubLObjectFactory.makeSymbol("COMPUTE-CORE-NARTS"), SubLObjectFactory.makeSymbol("CLEAR-AGENDA-PROCESS"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-SPARQL-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("POSSIBLY-SAVE-RECENT-EXPERIENCE"),
				SubLObjectFactory.makeSymbol("CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE"), SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-MATCHING-POS-CACHED"), SubLObjectFactory.makeSymbol("REBUILD-COMPUTABLE-CONTENT-DUMPABLE-LOW"), SubLObjectFactory.makeSymbol("CACHED-TVA-VALUE-COUNT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-6"),
				SubLObjectFactory.makeSymbol("MACHINE-INSTANCE"), SubLObjectFactory.makeSymbol("CB-CLEAR-ASSERTION-HISTORY"), SubLObjectFactory.makeSymbol("SKSI-IGNORE-ERRORS"), SubLObjectFactory.makeSymbol("CLEAR-INDIVIDUAL?-CACHED"), SubLObjectFactory.makeSymbol("FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS"), SubLObjectFactory.makeSymbol("CB-EVENT-DISPATCHER-RUNNING?"),
				SubLObjectFactory.makeSymbol("SCOOP-TRACE-DISPLAY-TRACE-STACK"), SubLObjectFactory.makeSymbol("CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER"), SubLObjectFactory.makeSymbol("ENFORCE-EVALUATABLE-SATISFIABILITY?"), SubLObjectFactory.makeSymbol("CLEAR-GET-COOCCURRING-CONDITIONS"), SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2"),
				SubLObjectFactory.makeSymbol("SYSTEM-CODE-INFERENCE-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-CREATOR"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-NAMESPACE"), SubLObjectFactory.makeSymbol("CLEAR-RBP-WFF-CONSTRAINTS-PRIM-INT-CACHED"),
				SubLObjectFactory.makeSymbol("ALL-PROBLEM-STORE-PROPERTIES"), SubLObjectFactory.makeSymbol("CLEAR-SET-QUERY-VARIABLE"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSETS-CAUSING-HELPER"), SubLObjectFactory.makeSymbol("NEW-FORMULA-TEMPLATE-EDITING-STATE"), SubLObjectFactory.makeSymbol("LOCAL-QUEUE-SIZE"), SubLObjectFactory.makeSymbol("RANDOM-BINARY-PREDICATE"),
				SubLObjectFactory.makeSymbol("ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS-INTERNAL"), SubLObjectFactory.makeSymbol("LOCAL-TRANSCRIPT-VERSION"), SubLObjectFactory.makeSymbol("GET-ALL-PARSING-FILTERS"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-BEING-SAVED"), SubLObjectFactory.makeSymbol("CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS"),
				SubLObjectFactory.makeSymbol("GET-REMOTE-OPERATIONS-KB-CHECK-POINT"), SubLObjectFactory.makeSymbol("RESET-CACHE-SUF-DEFN-METERS"), SubLObjectFactory.makeSymbol("FINALIZE-SENTENCIFIER"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN"), SubLObjectFactory.makeSymbol("REMOVE-L2R-DOCUMENT-SENTENCE-FINDER-KBQ"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-KNOWN-STALE-P"),
				SubLObjectFactory.makeSymbol("MISSING-KB-HL-SUPPORT-ID-SET"), SubLObjectFactory.makeSymbol("PPH-KAPPA-JUSTIFICATION-TEMPLATE"), SubLObjectFactory.makeSymbol("RESET-NAT-ISA-LINKS"), SubLObjectFactory.makeSymbol("PHRASECYCLFN"), SubLObjectFactory.makeSymbol("SBHL-TRUE-SEARCH-P"), SubLObjectFactory.makeSymbol("INITIALIZE-REMOTE-HL-STORE-CONNECTIONS"),
				SubLObjectFactory.makeSymbol("OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS"), SubLObjectFactory.makeSymbol("CLEAR-PSP-RULES-CACHES"), SubLObjectFactory.makeSymbol("REMOVE-FORBIDDEN-KB-COVERING-COLLECTIONS-SET"), SubLObjectFactory.makeSymbol("CREATE-REMOTE-HL-STORE-CONNECTION"), SubLObjectFactory.makeSymbol("CYC-TEST-WRITE-IMAGE-DIRECTORY"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-7"), SubLObjectFactory.makeSymbol("GET-SBHL-GOAL-SPACE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-15"), SubLObjectFactory.makeSymbol("GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-15"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-VAR"),
				SubLObjectFactory.makeSymbol("ESTIMATED-CONSTANTS-PER-NART"), SubLObjectFactory.makeSymbol("EXCEPTION-RULE-TOP-LEVEL-KEY"), SubLObjectFactory.makeSymbol("NL-GENERATION-FORT-CACHE-DATA-GENERATED?"), SubLObjectFactory.makeSymbol("DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("CLEAR-PARTITION-SCOPE"),
				SubLObjectFactory.makeSymbol("PPH-NL-GENERATION-CACHE-JUSTIFICATION"), SubLObjectFactory.makeSymbol("NL-TRIE-STALENESS-ACCEPTABLE?"), SubLObjectFactory.makeSymbol("CLEAN-INVALID-BOOKKEEPING-INFO"), SubLObjectFactory.makeSymbol("MASTER-TRANSCRIPT-CATCH-UP"), SubLObjectFactory.makeSymbol("CLEAR-DOCUMENT-SEARCH-PANEL-ENABLED-FOR-TASK"),
				SubLObjectFactory.makeSymbol("CURRENTLY-EXECUTING-TACTIC"), SubLObjectFactory.makeSymbol("PERFORM-ONE-AGENDA-ACTION"), SubLObjectFactory.makeSymbol("CLEAR-PRECISE-KEYWORD-FOR-PRED"), SubLObjectFactory.makeSymbol("SAVING-OPERATIONS?"), SubLObjectFactory.makeSymbol("EMPTY-THOUGHT"), SubLObjectFactory.makeSymbol("FORWARD-PROBLEM-STORE-PROPERTIES"),
				SubLObjectFactory.makeSymbol("CLEAR-PSP-VALID-CATEGORY?"), SubLObjectFactory.makeSymbol("INC-TOTAL-AUXILIARY-OPERATIONS-RUN"), SubLObjectFactory.makeSymbol("METER-ASSERTION-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("RKF-TEXT-PROCESSOR-RESET-CACHES"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("CLEAR-EVALUATABLE-RELATION-TESTS"), SubLObjectFactory.makeSymbol("CYC-CGI-RELATIVE-URL"), SubLObjectFactory.makeSymbol("CLEAR-TOP-MT-PERCENT-COUNT"), SubLObjectFactory.makeSymbol("PSP-ENVIRONMENTAL-STATE"), SubLObjectFactory.makeSymbol("CLEAR-MAL-ACTUAL-ARITY-CACHED?"), SubLObjectFactory.makeSymbol("KB-OBJECT-COUNT-LIST"),
				SubLObjectFactory.makeSymbol("CB-CURRENT-PARTITION-SAVE"), SubLObjectFactory.makeSymbol("INFERENCE-MONITOR-TREE-SCRIPT"), SubLObjectFactory.makeSymbol("TYPECLARIFYINGPHRASEFN"), SubLObjectFactory.makeSymbol("NART-HL-FORMULA-TABLE-INITIALIZED?"), SubLObjectFactory.makeSymbol("CLEAR-MONAD-MT-NAUT-CACHE"), SubLObjectFactory.makeSymbol("*SUB-EVENT-TYPES-FROM-RAL-SUB-EVENTS-RULE*-INITIALIZER"),
				SubLObjectFactory.makeSymbol("DHTML-LEXICAL-SCRIPTS"), SubLObjectFactory.makeSymbol("CYC-HITEK-FEATURE"), SubLObjectFactory.makeSymbol("CLEAR-RL-MODULE-STORE"), SubLObjectFactory.makeSymbol("COMPUTE-MISSING-OLD-NART-REMOTE-IDS"), SubLObjectFactory.makeSymbol("CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY"), SubLObjectFactory.makeSymbol("MAKE-STATIC-SEARCH-STRUC"),
				SubLObjectFactory.makeSymbol("GET-QL-INDEX-SUPPORT-VERBOSE"), SubLObjectFactory.makeSymbol("CATEGORIZE-KCT-INVALIDITY-REASONS"), SubLObjectFactory.makeSymbol("TEMPLATES-USE-ISA/GENLS?"), SubLObjectFactory.makeSymbol("GET-SBHL-UNDIRECTED-DIRECTION"), SubLObjectFactory.makeSymbol("CLEAR-COMPLEX-WORD-STRING-IS-SPEECH-PART?"),
				SubLObjectFactory.makeSymbol("CB-COMPUTE-PARTITION-LOAD-PUBLIC-DIRECTORY"), SubLObjectFactory.makeSymbol("COUNT-NEW-KB-OBJECTS"), SubLObjectFactory.makeSymbol("CLEAR-COMMANDER-QUEUES"), SubLObjectFactory.makeSymbol("CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED"), SubLObjectFactory.makeSymbol("SKSI-VIOLATIONS"), SubLObjectFactory.makeSymbol("HTML-FLUSH"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS"), SubLObjectFactory.makeSymbol("SBHL-CONTINUE-SEARCH-PATH"), SubLObjectFactory.makeSymbol("BLN2-ACCESS-PATH"), SubLObjectFactory.makeSymbol("CLEAR-PPH-POSSESSIVE-PREDS"), SubLObjectFactory.makeSymbol("MAKE-STATIC-SEARCH-NODE"), SubLObjectFactory.makeSymbol("PPH-KAPPA-JUSTIFICATION-TEMPLATE-INTERNAL"),
				SubLObjectFactory.makeSymbol("GT-LINK-SUPPORT"), SubLObjectFactory.makeSymbol("TVA-RETURN-ONE-ANSWER?"), SubLObjectFactory.makeSymbol("CLEAR-REDUCE-MT-UNION-HLMT-INT"), SubLObjectFactory.makeSymbol("CB-KE-REVIEW-RESULT-PAGE"), SubLObjectFactory.makeSymbol("MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT"), SubLObjectFactory.makeSymbol("JAVA-LINK-DEBUG-MODE?"),
				SubLObjectFactory.makeSymbol("ENFORCE-ONLY-DEFINITIONAL-GAFS-IN-VOCAB-MT?"), SubLObjectFactory.makeSymbol("CLEAR-FOL-NART-STRING"), SubLObjectFactory.makeSymbol("CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED-INT"), SubLObjectFactory.makeSymbol("UPDATE-API-PROTOCOL"), SubLObjectFactory.makeSymbol("PPH-IDENTITY-TEMPLATE"), SubLObjectFactory.makeSymbol("NO-ARG-TYPES-AT-PARAMETER-STATE?"),
				SubLObjectFactory.makeSymbol("CB-MOST-RECENT-CONSTANT"), SubLObjectFactory.makeSymbol("FTS-ADDITIONAL-EXCLUDED-TERMS"), SubLObjectFactory.makeSymbol("CYC-BOOKKEEPING-INFO"), SubLObjectFactory.makeSymbol("GET-LISP-IMPLEMENTATION-TYPE"), SubLObjectFactory.makeSymbol("PSP-NP-GAP-SEMX"), SubLObjectFactory.makeSymbol("HL-MODIFY-LOCAL?"), SubLObjectFactory.makeSymbol("NEW-PRODUCT-ACCUMULATOR"),
				SubLObjectFactory.makeSymbol("CLEAR-EBMT-CYCLS-FOR-PHRASE"), SubLObjectFactory.makeSymbol("FORWARD-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("INITIALIZE-INCOMPATIBLE-MT-MODULE"), SubLObjectFactory.makeSymbol("CLEAR-PSP-RULES-CACHES"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS"), SubLObjectFactory.makeSymbol("NEW-CONSTANTS-ITERATOR"),
				SubLObjectFactory.makeSymbol("ENSURE-SWAPPABLE-TVA-CACHE-LOCK"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-15"), SubLObjectFactory.makeSymbol("SBHL-MODULES-INITIALIZED?"), SubLObjectFactory.makeSymbol("DONT-MAINTAIN-DEDUCTION-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("BLN1-ACCESS-PATH"), SubLObjectFactory.makeSymbol("BUILDER-FORWARD-INFERENCE-METRICS-LOG"),
				SubLObjectFactory.makeSymbol("PERFORM-CYC-TESTING-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET"), SubLObjectFactory.makeSymbol("RANDOM-VARIABLE"), SubLObjectFactory.makeSymbol("TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES"), SubLObjectFactory.makeSymbol("INC-LOCAL-TRANSCRIPT-VERSION"),
				SubLObjectFactory.makeSymbol("DISABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE"), SubLObjectFactory.makeSymbol("INHIBIT-CYCLIC-COMMUTATIVE-IN-ARGS?"), SubLObjectFactory.makeSymbol("CLEAR-BIOLOGY-PRACTICE-RULES"), SubLObjectFactory.makeSymbol("CLEAR-REMOVAL-MODULE-TESTS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?"),
				SubLObjectFactory.makeSymbol("WORKING-INFERENCE-TESTS"), SubLObjectFactory.makeSymbol("RBP-TRACE"), SubLObjectFactory.makeSymbol("ARGUMENT-TYPE-HIERARCHY"), SubLObjectFactory.makeSymbol("INITIALIZE-NEGATION-PREDS-MODULE"), SubLObjectFactory.makeSymbol("CB-SPECIFIC-HL-STORAGE-MODULE-PREDICATES"), SubLObjectFactory.makeSymbol("MOST-RECENT-FAILING-CYC-TEST-RUNS"),
				SubLObjectFactory.makeSymbol("RESET-LAST-MONITORED-INFERENCE"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-MODE"), SubLObjectFactory.makeSymbol("RC-NEXT-ID"), SubLObjectFactory.makeSymbol("CLEANUP-FROM-BROWSING-NEW-FORWARD-INFERENCE"), SubLObjectFactory.makeSymbol("DISABLE-ASSERTIVE-WFF-FORWARD-RULES"), SubLObjectFactory.makeSymbol("CLEAR-EXPORTABLE-DEDUCTION-SUPPORTED-OBJECT?"),
				SubLObjectFactory.makeSymbol("RBP-TRACED-RULES"), SubLObjectFactory.makeSymbol("NEW-ASSERTIONS-WITH-META-ASSERTIONS-ITERATOR"), SubLObjectFactory.makeSymbol("SPORTING-GOODS-ACCESS-PATH"), SubLObjectFactory.makeSymbol("SHOW-CRIPPLED-HAYSTACK-STATISTICS"), SubLObjectFactory.makeSymbol("NEW-FORMULA-TEMPLATE-EDITING-STATE"), SubLObjectFactory.makeSymbol("CLEAR-XSD-NAME"),
				SubLObjectFactory.makeSymbol("NEW-NULL-ACCUMULATOR"), SubLObjectFactory.makeSymbol("START-AGENT-RECEIVED-MESSAGE-HANDLER"), SubLObjectFactory.makeSymbol("NEW-CONSTANT-CHECKPOINT"), SubLObjectFactory.makeSymbol("CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-HTML"), SubLObjectFactory.makeSymbol("SKOLEMS-WITH-MISMATCHED-UNREIFIED-SK-TERMS"),
				SubLObjectFactory.makeSymbol("REGISTER-ALL-QUERY-LIBRARY-PARSERS"), SubLObjectFactory.makeSymbol("GATHER-SKSI-KNOWLEDGE-SOURCES-AND-DESCRIPTIONS"), SubLObjectFactory.makeSymbol("CB-NOTIFY-USERS-DRAW-HEADER"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-1"), SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-RULE"), SubLObjectFactory.makeSymbol("FI-GET-WARNING"),
				SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ"), SubLObjectFactory.makeSymbol("INITIALIZE-CAE-QUERY-TRANSLATION"), SubLObjectFactory.makeSymbol("STRUCTURAL-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE"),
				SubLObjectFactory.makeSymbol("MULTI-WORD-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-PRIN1-SYMBOL-TO-STRING"), SubLObjectFactory.makeSymbol("PPH-DISCOURSE-CONTEXT-INITIALIZED?"), SubLObjectFactory.makeSymbol("DEFINITENBARPPFN"), SubLObjectFactory.makeSymbol("EXPERIMENTAL-IMAGE"), SubLObjectFactory.makeSymbol("QC-NEXT-ID"),
				SubLObjectFactory.makeSymbol("FIND-POSSIBLE-SCHEDULED-QUERY-DAEMON-IMAGES"), SubLObjectFactory.makeSymbol("CLEAR-CLAUSE-STRUC-TABLE"), SubLObjectFactory.makeSymbol("CLEAR-RKF-UNAMBIGUOUS-NON-POSSESSIVE-PRONOUN-STRING?"), SubLObjectFactory.makeSymbol("BESTNLPHRASEOFSTRINGFN"), SubLObjectFactory.makeSymbol("CLEAR-PREDICATE-GRAPH"), SubLObjectFactory.makeSymbol("CYC-THESAURUS-FEATURE"),
				SubLObjectFactory.makeSymbol("FI-GET-ERROR"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-SUPPORTED-PREDICATE-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-PPH-PHRASE-ID-DEMERITS"), SubLObjectFactory.makeSymbol("OWL-TAG-ATTRIBUTES"), SubLObjectFactory.makeSymbol("RESTART-ALL-TCP-SERVERS"), SubLObjectFactory.makeSymbol("RKF-ADDRESSEE"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-8"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-4"), SubLObjectFactory.makeSymbol("GET-KB-HL-SUPPORT"), SubLObjectFactory.makeSymbol("NO-OP"), SubLObjectFactory.makeSymbol("CNC-POPCORN-MINIMUM"), SubLObjectFactory.makeSymbol("TRANSCRIPT-DIRECTORY"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("CTEST-ALL-KB-TEST-METRIC-CONSTANTS"), SubLObjectFactory.makeSymbol("TACTIC-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("GET-GHL-LINK-PRED"), SubLObjectFactory.makeSymbol("INDEXICAL-QUERY-MT"), SubLObjectFactory.makeSymbol("CLEAR-GET-DEFAULT-CAE-GUIDANCE-MT"),
				SubLObjectFactory.makeSymbol("GET-LUCENE-HOST"), SubLObjectFactory.makeSymbol("SCHEDULED-QUERY-QUEUE"), SubLObjectFactory.makeSymbol("ARGUMENT-TYPE-HIERARCHY"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-EL-VAR-FOR-HL-VAR-CACHED"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-TRANSMIT-QUEUE"), SubLObjectFactory.makeSymbol("CLEAR-GENL-PREDICATE-GRAPH"),
				SubLObjectFactory.makeSymbol("COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("GATHER-INFERENCE-ANSWER-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("GET-HL-STORE-CACHES-SHARED-SYMBOLS"), SubLObjectFactory.makeSymbol("PRE-NUM-NOT-WFF"),
				SubLObjectFactory.makeSymbol("NL-TRIE-STALE?"), SubLObjectFactory.makeSymbol("INITIALIZE-NAME-TITLES"), SubLObjectFactory.makeSymbol("VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE"), SubLObjectFactory.makeSymbol("CLEAR-GET-FOLLOWUP-CATEGORIES-FOR-TYPE"), SubLObjectFactory.makeSymbol("OWL-OPENCYC-UNVERSIONED-BASE-URI"), SubLObjectFactory.makeSymbol("RANDOM-0-1"),
				SubLObjectFactory.makeSymbol("CLEAR-ALL-SBHL-TIME-DATA"), SubLObjectFactory.makeSymbol("CLEAR-PRECISE-KEYWORD-FOR-PRED"), SubLObjectFactory.makeSymbol("CURRENT-NART-INDEX-SWAP-TIME"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-15"), SubLObjectFactory.makeSymbol("OLD-DEDUCTION-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-GENL-MT"),
				SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-1"), SubLObjectFactory.makeSymbol("ENABLE-QL-IR-SEARCH"), SubLObjectFactory.makeSymbol("CACHE-PSP-FRAME-INFO"), SubLObjectFactory.makeSymbol("NBARHEADEDBYNOUNFORMFN"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-6"), SubLObjectFactory.makeSymbol("INITIALIZE-CONSTANT-INDEX-HL-STORE-CACHE"),
				SubLObjectFactory.makeSymbol("HTML-UPDATE-CB-TOOLBAR-SCRIPT"), SubLObjectFactory.makeSymbol("INFERENCE-MONITOR-HEAD-SCRIPT"), SubLObjectFactory.makeSymbol("CREATE-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-MESSAGE-MAILBOX-LISTENER"), SubLObjectFactory.makeSymbol("OE-PATCH-MESSAGES-ENABLED-AND-EMAIL-VALID?"), SubLObjectFactory.makeSymbol("CLEAR-FIRST-ORDER-COLLECTION?"),
				SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-ALL-RULES-ALLOWED?"), SubLObjectFactory.makeSymbol("RESET-TP-VALID-QUANTITY-P"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-CACHES"), SubLObjectFactory.makeSymbol("RKF-ALL-CONCEPT-HARVESTER-METHODS"), SubLObjectFactory.makeSymbol("CLEAR-ALL-SBHL-TIME-DATA"),
				SubLObjectFactory.makeSymbol("REPEATFORSUBSEQUENTARGSFN"), SubLObjectFactory.makeSymbol("GET-SBHL-ISA?-GOAL"), SubLObjectFactory.makeSymbol("TVA-RETURN-ONE-ANSWER?"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?"), SubLObjectFactory.makeSymbol("ALL-CORE-UNION-CONSTANTS"),
				SubLObjectFactory.makeSymbol("SAVE-RECENT-EXPERIENCE-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK"), SubLObjectFactory.makeSymbol("NOTE-AT-VIOLATION?"), SubLObjectFactory.makeSymbol("FINALIZE-LINKAGE"), SubLObjectFactory.makeSymbol("INITIALIZE-CB-RTV-COLLECTIONS"), SubLObjectFactory.makeSymbol("THINKING-TASK"),
				SubLObjectFactory.makeSymbol("FACT-SHEET-DEFAULT-LANGUAGE-MT-INTERNAL"), SubLObjectFactory.makeSymbol("QUERY-SUGGESTOR-RUN-TRIAL-TEST"), SubLObjectFactory.makeSymbol("PPH-PHRASE-DEFAULT-VERB-PRED"), SubLObjectFactory.makeSymbol("HTML-META-DONT-CACHE"), SubLObjectFactory.makeSymbol("GET-SBHL-COMBINE-FN"), SubLObjectFactory.makeSymbol("INITIALIZE-NUMBER-VALUES"),
				SubLObjectFactory.makeSymbol("PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT"), SubLObjectFactory.makeSymbol("CLEAR-PPH-APPLY-TEMPLATE"), SubLObjectFactory.makeSymbol("CB-SUBL-DOC-METHOD-INDEX-GUTS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-5"), SubLObjectFactory.makeSymbol("L2R-SUPERTEXT-INDEXICAL"), SubLObjectFactory.makeSymbol("LTAI"),
				SubLObjectFactory.makeSymbol("INDEXICAL-THE-CYC-PROCESS-OWNER"), SubLObjectFactory.makeSymbol("GLOBAL-FORWARD-INFERENCE-TO-DO?"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-DEFINITIONAL-PREDICATES"), SubLObjectFactory.makeSymbol("SBHL-FALSE-SEARCH-P"), SubLObjectFactory.makeSymbol("CZER-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("BIOLOGY-PRACTICE-RULES-INTERNAL"),
				SubLObjectFactory.makeSymbol("ARETE-TERMS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO"), SubLObjectFactory.makeSymbol("ENSURE-CYCLIST-OK"), SubLObjectFactory.makeSymbol("NEW-LEXIFICATION-ID"), SubLObjectFactory.makeSymbol("BUILDER-LOG-DIRECTORY"),
				SubLObjectFactory.makeSymbol("CLEAR-FORWARD-PROPAGATE-ONE-SUPPORT-WRT-RULE-AND-GENERATE-ASSERTIBLES-CACHED"), SubLObjectFactory.makeSymbol("INITIALIZE-NEGATION-PREDS-MODULE"), SubLObjectFactory.makeSymbol("GET-SKSI-SMT-MODE"), SubLObjectFactory.makeSymbol("CYCLIFY-STRING-INITIALIZE-CYCLIFY-STATUS"), SubLObjectFactory.makeSymbol("FIND-ASSERTION-WITH-KB-HL-SUPPORT-DEDUCTION-DEPENDENT"),
				SubLObjectFactory.makeSymbol("DHTML-DOM-WRAPPER-POSTAMBLE"), SubLObjectFactory.makeSymbol("CLEAR-SKOS-EXPANDED-NAME"), SubLObjectFactory.makeSymbol("FACT-SHEET-PPH-DEMERIT-CUTOFF"), SubLObjectFactory.makeSymbol("CURRENT-TS-FILE"), SubLObjectFactory.makeSymbol("AUXILIARY-QUEUE-PEEK"), SubLObjectFactory.makeSymbol("WNI-MARK-EXISTING-MAPPED-TERMS"),
				SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-PREDS-OF-POS"), SubLObjectFactory.makeSymbol("ENSURE-CB-EVENT-DISPATCHER-RUNNING"), SubLObjectFactory.makeSymbol("RKF-SD-IGNORE-CLEAR"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-CITYWITHCOUNTRYABBREVIATION"), SubLObjectFactory.makeSymbol("RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS"),
				SubLObjectFactory.makeSymbol("MAKE-CONSTANT-EXTERNAL-ID"), SubLObjectFactory.makeSymbol("CLEAR-UNIT-OF-MONEY-P"), SubLObjectFactory.makeSymbol("ENABLE-STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY"), SubLObjectFactory.makeSymbol("INITIALIZE-CONSTANT-NAMES-IN-CODE"), SubLObjectFactory.makeSymbol("INITIALIZE-NAME-TITLES"), SubLObjectFactory.makeSymbol("ALL-KB-MODAL-OPERATORS"),
				SubLObjectFactory.makeSymbol("SCHEDULED-QUERY-TEST-QUERY"), SubLObjectFactory.makeSymbol("NART-HL-FORMULAS-UNBUILT?"), SubLObjectFactory.makeSymbol("NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P"), SubLObjectFactory.makeSymbol("CLEAR-REFORMULATOR-CACHES"), SubLObjectFactory.makeSymbol("ENSURE-PPH-INITIALIZED"), SubLObjectFactory.makeSymbol("FUNCTIONS-FOR-FCP-SWEEP"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-SYNTACTIC-DOCUMENT-STATS"), SubLObjectFactory.makeSymbol("CLEAR-GEN-TEMPLATE-QUERY-SENTENCE-INDEX"), SubLObjectFactory.makeSymbol("MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING?"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-CODE-SUPPORT"), SubLObjectFactory.makeSymbol("PPH-PP-CATEGORY"),
				SubLObjectFactory.makeSymbol("SWAP-OUT-ALL-PRISTINE-DEDUCTIONS"), SubLObjectFactory.makeSymbol("ARETE-NARTS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-TERMS"), SubLObjectFactory.makeSymbol("WNI-SYNSET-INDIVIDUALS"), SubLObjectFactory.makeSymbol("CORE-KB-FINALIZATION"), SubLObjectFactory.makeSymbol("GRACEFUL-QUIT"),
				SubLObjectFactory.makeSymbol("CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS"), SubLObjectFactory.makeSymbol("ST-SIMILARITY-NAT-HISTORY-ITEMS"), SubLObjectFactory.makeSymbol("EVALUATABLE-RELATIONS-WITH-EVALUATABLE-RELATION-TESTS"), SubLObjectFactory.makeSymbol("ENSURE-SPEECH-PARTS-INITIALIZED"), SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-OPTIONAL-SECTION-END-COMMENT"),
				SubLObjectFactory.makeSymbol("CFASL-READ"), SubLObjectFactory.makeSymbol("CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID"), SubLObjectFactory.makeSymbol("NUMERIC-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("CLEAR-CODE-MAPPING-SKS-CACHE"), SubLObjectFactory.makeSymbol("DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES"),
				SubLObjectFactory.makeSymbol("PSP-NP-EDGES"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-CYC-PROCESS-OWNER-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-ALL-SBHL-NON-TIME-DATA"), SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("MAKE-LATITUDE-VIA-LOCATION-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("CB-SAVE-AS-QUERY-SUBMIT-SECTION"), SubLObjectFactory.makeSymbol("BYTE-ORDER-MARK"), SubLObjectFactory.makeSymbol("CLEAR-TEMPLATE-MTS"), SubLObjectFactory.makeSymbol("REGISTER-DEFAULT-QL-PARSERS"), SubLObjectFactory.makeSymbol("CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE"), SubLObjectFactory.makeSymbol("GET-SCHEUER-QS"), SubLObjectFactory.makeSymbol("INITIALIZE-RBP-NAME-CACHE"), SubLObjectFactory.makeSymbol("INITIALIZE-RBP-TERM-KEYWORD-MAP"), SubLObjectFactory.makeSymbol("CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS"), SubLObjectFactory.makeSymbol("MEDIUM-TOMBSTONING-MODE?"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS"), SubLObjectFactory.makeSymbol("REMOVE-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("GET-KBS-PREREMOVED-ASSERTIONS"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL"),
				SubLObjectFactory.makeSymbol("INITIALIZE-RTP-KB-FEATURE"), SubLObjectFactory.makeSymbol("CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("RBP-NEW-RULE-BANK"), SubLObjectFactory.makeSymbol("CLEAR-BIOLOGY-PRACTICE-RULES"), SubLObjectFactory.makeSymbol("CONSTRAINED-PARSING-CLEAR-ACTIONS"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-15"),
				SubLObjectFactory.makeSymbol("CB-SYSTEM-HEALTH-POSSIBLE-CHECKUPS"), SubLObjectFactory.makeSymbol("ADDITIONAL-NAT-FUNCTION-SUPPORTS"), SubLObjectFactory.makeSymbol("L2R-DOCUMENT-INDEXICAL"), SubLObjectFactory.makeSymbol("INC-TOTAL-LOCAL-OPERATIONS-TRANSMITTED"), SubLObjectFactory.makeSymbol("SBHL-PRIMARY-WHAT-MTS-SPACES"), SubLObjectFactory.makeSymbol("CYCLIFY-TEST"),
				SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-SUCCESS"), SubLObjectFactory.makeSymbol("DERIVED-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-PPH-NC-RULE-LIST"), SubLObjectFactory.makeSymbol("REMOVE-OWL-PREDICATE-TYPES-FOR-EXPORT"), SubLObjectFactory.makeSymbol("GET-TENSE-CZER-MODE"), SubLObjectFactory.makeSymbol("NEW-WHOLLY-UNSPECIFIED-MT-ERROR"),
				SubLObjectFactory.makeSymbol("GET-ALL-QUERY-LIBRARY-MTS"), SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("HL-ACCESS-LOCAL?"), SubLObjectFactory.makeSymbol("FREE-ALL-KB-HL-SUPPORT"), SubLObjectFactory.makeSymbol("UPDATE-GOOGLE-API-METHOD-INVOCATION-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSET-SPEECH-PART-OFFSET-HELPER"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-PUBLIC-FACT-SHEET-STRING-URL-MAPPINGS"), SubLObjectFactory.makeSymbol("LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-13"), SubLObjectFactory.makeSymbol("GET-RED-EXTERNAL-ELEMENT"), SubLObjectFactory.makeSymbol("CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM"),
				SubLObjectFactory.makeSymbol("PPH-VAR-TYPING-PREDICATES"), SubLObjectFactory.makeSymbol("MAKE-TVA-DEFAULT-STRATEGY"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-SYSTEM"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-PREDICATES-CONSIDERED-WITH-NO-SUCCESS"), SubLObjectFactory.makeSymbol("TURN-KR-SUGAR-ON"), SubLObjectFactory.makeSymbol("CATEGORIZE-KCT-INVALIDITY-REASONS"),
				SubLObjectFactory.makeSymbol("SCHEDULED-QUERY-TEST-QUERY"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-ALL-INSTANCES"), SubLObjectFactory.makeSymbol("EVAL-IN-API-CLEAR-TRACE-LOG"), SubLObjectFactory.makeSymbol("CLEAR-PLAUSIBILITY-CACHES"), SubLObjectFactory.makeSymbol("INCLUDE-FRACTIONS-IN-EXTENDED-NUMBERS?"),
				SubLObjectFactory.makeSymbol("FIND-OR-CREATE-SBHL-MODULE-NAUT-LINK-NODE-SEARCH-STATE-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("BOGUS-CONSTANTS-MENTIONED-IN-CODE"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-CANDIDATE-GENL-PREDS-IN-MT"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-PHYSICALLOCATION"), SubLObjectFactory.makeSymbol("CB-HELP-KEYWORDS"),
				SubLObjectFactory.makeSymbol("RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO"), SubLObjectFactory.makeSymbol("CLEAR-ALL-EXISTING-INDEXING"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-SELF-EXPANDING-RULE-ASSERTION?"), SubLObjectFactory.makeSymbol("CYC-ANNOTATION-BASE-URI"), SubLObjectFactory.makeSymbol("GET-ILP-EXPORT-OUTPUT-MODES-QUERY-PROPERTIES"),
				SubLObjectFactory.makeSymbol("PPH-SPEAKER-KNOWN-P"), SubLObjectFactory.makeSymbol("CLEAR-MAKE-OPTIONAL-WORD-LIST"), SubLObjectFactory.makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("TYPECLARIFYINGPHRASEFN"), SubLObjectFactory.makeSymbol("CLEAR-ALL-SPECS-SET"), SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS"),
				SubLObjectFactory.makeSymbol("CB-PARAPHRASE-MT"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-15"), SubLObjectFactory.makeSymbol("CLEAR-APPLICABLE-INTER-ARG-TYPE-PRED-COLLECTIONS-DICTIONARY"), SubLObjectFactory.makeSymbol("WORD-STRINGS-FN"), SubLObjectFactory.makeSymbol("MT-DIMENSION-TYPES"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL"),
				SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-9"), SubLObjectFactory.makeSymbol("POLITENESS-OF-WS-PRED"), SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-DESTROYER"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-DEREGISTER-ALL-PARSERS"), SubLObjectFactory.makeSymbol("DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("SKSI-BREAK-ON-ERRORS"),
				SubLObjectFactory.makeSymbol("PPH-DEFAULT-VAR-TYPE"), SubLObjectFactory.makeSymbol("PROPERTY-TYPES-PROBLEM-STORE-SIZE-OK?"), SubLObjectFactory.makeSymbol("CONTENT-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-EXPORTABLE-DEDUCTION-SUPPORT?"), SubLObjectFactory.makeSymbol("REFORMULATOR-RULES-TO-USE"), SubLObjectFactory.makeSymbol("UNASSOCIATED-REFORMULATOR-RULES"),
				SubLObjectFactory.makeSymbol("CONSTRUCT-EMPTY-KEY-ENTRY"), SubLObjectFactory.makeSymbol("SPEC-PREDS-AND-INVERSES-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("RESET-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-REGISTRATION"), SubLObjectFactory.makeSymbol("CLEAR-MACHINE-IS-MYSELF-VIA-CYC-API"), SubLObjectFactory.makeSymbol("SBHL-FINISHED-WITH-GOAL"),
				SubLObjectFactory.makeSymbol("SKSI-LANGUAGE-SPOKEN-LANGUAGES"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-EVENT-CLASSES"), SubLObjectFactory.makeSymbol("RANDOM-PATH-CHAR"), SubLObjectFactory.makeSymbol("UNIVERSAL-REMOVAL-MODULE-COUNT"), SubLObjectFactory.makeSymbol("ALL-JSON-HANDLER-SYMBOLS"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-DONT-MAINTAIN-USAGES-COUNTS"),
				SubLObjectFactory.makeSymbol("KB-LOADED"), SubLObjectFactory.makeSymbol("IGNORING-SDC?"), SubLObjectFactory.makeSymbol("CITIES-TO-COUNTRIES"), SubLObjectFactory.makeSymbol("MAYBE-INITIALIZE-PPH-GENERATION-PREDS"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-CITYWITHSTATEORPROVINCENAME"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL"),
				SubLObjectFactory.makeSymbol("CLEAR-PS-PARSE-PREDICATIVE-ADJP-INT-CACHED"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-NP-QUATYPE"), SubLObjectFactory.makeSymbol("TAXONOMY-TERM-RELATIONS-DICT"), SubLObjectFactory.makeSymbol("CLEAR-FIND-STEM-MEMOIZED"), SubLObjectFactory.makeSymbol("CHECK-GEN-TEMPLATE-STORE-INITIALIZATION"), SubLObjectFactory.makeSymbol("ACCUMULATED-XML-TOKENS"),
				SubLObjectFactory.makeSymbol("HTML-SET-ALL-RADIO-BUTTONS-SCRIPT"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P"), SubLObjectFactory.makeSymbol("ASSERTION-CONS-SHARING-DICTIONARY"), SubLObjectFactory.makeSymbol("NAVIGATOR-CATEGORIES-FOR-DISPLAY"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-15"),
				SubLObjectFactory.makeSymbol("AES-DO-ORTHOGRAPHIC-CHANGE-FNS"), SubLObjectFactory.makeSymbol("CLEAR-MT-RELEVANCE-CACHE"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-DB"), SubLObjectFactory.makeSymbol("PRINT-WFF-REFORMULATOR-RULES"), SubLObjectFactory.makeSymbol("DISABLE-SKSI-SMT-MODE"), SubLObjectFactory.makeSymbol("VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE"),
				SubLObjectFactory.makeSymbol("INTERRUPT-GENERIC-SEARCH"), SubLObjectFactory.makeSymbol("METER-CONSTANT-INDEX-SWAP-TIME"), SubLObjectFactory.makeSymbol("TEST-PARSE-A-SENTENCE-COMPLETELY"), SubLObjectFactory.makeSymbol("PSP-GET-ANSWERS"), SubLObjectFactory.makeSymbol("CT-CR-INITIALIZE-IRRELEVANT-TERM-TABLE"), SubLObjectFactory.makeSymbol("REMOVAL-COMPLETENESS-MINIMIZATION-ALLOWED?"),
				SubLObjectFactory.makeSymbol("SBHL-JUSTIFICATION-SEARCH-P"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-5"), SubLObjectFactory.makeSymbol("NEW-NEW-UNREPRESENTED-TERMS-ITERATOR"), SubLObjectFactory.makeSymbol("USE-DEFAULT-LINKAGE-CREATION-RULES?"), SubLObjectFactory.makeSymbol("REMOVE-TOO-BIG-PLACES"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-GUTS"),
				SubLObjectFactory.makeSymbol("ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?"), SubLObjectFactory.makeSymbol("CURRENT-XREF-SYSTEM"), SubLObjectFactory.makeSymbol("ALL-PREDS-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("MAKE-TVA-SIMPLE-STRATEGY"), SubLObjectFactory.makeSymbol("UIMMA-NEW-ID"), SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-FUNCTION-METERS"),
				SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR"), SubLObjectFactory.makeSymbol("REBUILD-RULE-SET"), SubLObjectFactory.makeSymbol("SBHL-VERIFY-NAUT-MT-RELEVANCE-P"), SubLObjectFactory.makeSymbol("POLITENESS-OF-WS-PRED"), SubLObjectFactory.makeSymbol("CURRENTLY-EXECUTING-HL-MODULE"), SubLObjectFactory.makeSymbol("HL-STORE-CACHES-DIRECTORY"),
				SubLObjectFactory.makeSymbol("CATCH-UP-TO-CURRENT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-8"), SubLObjectFactory.makeSymbol("RELATION-INSTANCE-EXISTS-SKSI-COST"), SubLObjectFactory.makeSymbol("ENGLISH-GENERATION-FORT-CACHE-MOST-RECENT-AVAILABLE?"), SubLObjectFactory.makeSymbol("CACHED-DEDUCTION-COUNT"), SubLObjectFactory.makeSymbol("CB-DESTROY-ALL-INFERENCES-BUT-LAST-N"),
				SubLObjectFactory.makeSymbol("PPH-LEXIFICATION-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-HL-MODULE-EXPAND-COUNTS"), SubLObjectFactory.makeSymbol("CURRENT-ASSERTION-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?"), SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-ASSERTIONS"), SubLObjectFactory.makeSymbol("OWL-TERM-NAMES"),
				SubLObjectFactory.makeSymbol("POSSIBLY-CONVERT-CONSTANT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-QUERY-COSTS"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-RULE-SELECT-VIA-ALLOWED-RULES?"), SubLObjectFactory.makeSymbol("HTML-SELECT-MULTIPLE"), SubLObjectFactory.makeSymbol("INFERENCE-RELEVANT-MT"),
				SubLObjectFactory.makeSymbol("RED-GET-OBJECT"), SubLObjectFactory.makeSymbol("PPH-ABORT"), SubLObjectFactory.makeSymbol("PPH-PHRASE-ID-INDEX-NEW-OBJECTS-COUNT"), SubLObjectFactory.makeSymbol("GET-PUBLIC-FACT-SHEET-PROPERTIES"), SubLObjectFactory.makeSymbol("MAKE-MULTIBINDING"), SubLObjectFactory.makeSymbol("ID-INDEX-TOMBSTONE"), SubLObjectFactory.makeSymbol("AGENDA-RUNNING"),
				SubLObjectFactory.makeSymbol("EXPANSION-JUSTIFICATION"), SubLObjectFactory.makeSymbol("CLEAR-PRIN1-SYMBOL-TO-STRING"), SubLObjectFactory.makeSymbol("WORKING-INFERENCE-TESTS"), SubLObjectFactory.makeSymbol("CLEAR-REPORT-GENERATION-TEMPLATE-ROOT-COLLECTION-FOR-TASK"), SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FORTS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE"), SubLObjectFactory.makeSymbol("GET-TEMP-DIRECTORY"), SubLObjectFactory.makeSymbol("NOTE-FACT-SHEET-QUERY-TIMEOUT-IN-HOURLY-STATS"), SubLObjectFactory.makeSymbol("CLEAR-EXPORTABLE-DEDUCTION-SUPPORTED-OBJECT?"),
				SubLObjectFactory.makeSymbol("CLEAR-GKE-ISAS-FILTERED-TERM"), SubLObjectFactory.makeSymbol("CLEAR-SPECIFIED-NODES-IN-FILTER"), SubLObjectFactory.makeSymbol("RBP-WFF-RESET-METRICS"), SubLObjectFactory.makeSymbol("NEW-MUTED-ASSERTION-CONTENT-ITERATOR"), SubLObjectFactory.makeSymbol("GENL-INVERSE-MODE-P"), SubLObjectFactory.makeSymbol("WFF-ONLY-NEEDS-SYNTACTIC-CHECKS?"),
				SubLObjectFactory.makeSymbol("KBS-RAW-CONSTANTS"), SubLObjectFactory.makeSymbol("GRACEFUL-QUIT"), SubLObjectFactory.makeSymbol("LOAD-ALL-CRIPPLED-HAYSTACKS-INT"), SubLObjectFactory.makeSymbol("CLEAR-NUM-LIST-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-PPH-ARG-IN-RELN-PREDS"), SubLObjectFactory.makeSymbol("NEXT-RDF-BLANK-NODE-ID"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-POS-ARG-OF-PRED-INT"), SubLObjectFactory.makeSymbol("START-CB-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("WFF-VIOLATIONS"), SubLObjectFactory.makeSymbol("ALL-KB-FUNCTIONS"), SubLObjectFactory.makeSymbol("REMOVE-COLLECTION-CREATION-TEMPLATE"), SubLObjectFactory.makeSymbol("COMPUTE-HL-STORE-CACHES-DIRECTORY"),
				SubLObjectFactory.makeSymbol("DISABLE-QL-IR-SEARCH"), SubLObjectFactory.makeSymbol("NEW-HL-STORAGE-MODULE-INFO"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-DEDUCTIONS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("WITHIN-NEGATED-DISJUNCTION?"), SubLObjectFactory.makeSymbol("CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT"), SubLObjectFactory.makeSymbol("RTP-VBAR-TEMPLATES"),
				SubLObjectFactory.makeSymbol("TMS-ANY-ASSERTION-BEING-REMOVED?"), SubLObjectFactory.makeSymbol("FACT-SHEET-QUERY-SOFT-TIMEOUT-TIME-REACHED?"), SubLObjectFactory.makeSymbol("HANDLE-LAST-HTML-MESSAGE"), SubLObjectFactory.makeSymbol("DHTML-CREATION-SCRIPTS"), SubLObjectFactory.makeSymbol("CLEAR-PSP-FRAME-HAS-TYPE?"), SubLObjectFactory.makeSymbol("XREF-GLOBAL-SCOPE"),
				SubLObjectFactory.makeSymbol("ENABLE-TRANSFORMATION-RULE-STATISTICS-UPDATE"), SubLObjectFactory.makeSymbol("TEST-THAT-ALL-ASSERTIONS-ARE-FINDABLE"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-9"), SubLObjectFactory.makeSymbol("INITIALIZE-KCT"), SubLObjectFactory.makeSymbol("CB-INFERENCE-HELP-DIRECTORY"), SubLObjectFactory.makeSymbol("ROBUST-NART-LOOKUP?"),
				SubLObjectFactory.makeSymbol("CLEAR-KB-PATHS"), SubLObjectFactory.makeSymbol("VALID-METHOD-LISTENER-TYPES"), SubLObjectFactory.makeSymbol("FORGET-USELESS-NARTS-WRT-OPENCYC"), SubLObjectFactory.makeSymbol("WNI-UNASSERTING-REDUNDANT-GENLS"), SubLObjectFactory.makeSymbol("UNREPRESENTED-TERM-INDEX-MAINTAIN-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("KBS-CLEANUP"),
				SubLObjectFactory.makeSymbol("INITIALIZE-NEGATION-MT-MODULE"), SubLObjectFactory.makeSymbol("BOGUSLY-LEXIFIED-TERMS"), SubLObjectFactory.makeSymbol("RESET-TERM-CLASSIFICATION-TREE"), SubLObjectFactory.makeSymbol("INITIALIZE-LINKAGE"), SubLObjectFactory.makeSymbol("TEST-THAT-ALL-ASSERTIONS-ARE-FINDABLE"), SubLObjectFactory.makeSymbol("INITIALIZE-GAF-AFTER-ADDINGS-HASH"),
				SubLObjectFactory.makeSymbol("CLEAR-PREDS-OF-POS-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-ALL-INSTANCES"), SubLObjectFactory.makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-RAW-CONSTANTS"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-NP-QUATYPE"),
				SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-IMAGE-URL-ROOT"), SubLObjectFactory.makeSymbol("SBHL-JUSTIFICATION-SEARCH-P"), SubLObjectFactory.makeSymbol("RECEIVING?"), SubLObjectFactory.makeSymbol("THESAURUS-KB-LOADED-P"), SubLObjectFactory.makeSymbol("CREATE-NART-DUMP-ID-TABLE"), SubLObjectFactory.makeSymbol("PPH-BROADEN-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("GRAPHL-SEARCH-SIZE"),
				SubLObjectFactory.makeSymbol("SIMPLIFY-REDUNDANCIES?"), SubLObjectFactory.makeSymbol("CLEAR-RKF-NUMBER-STRING?"), SubLObjectFactory.makeSymbol("NO-ARG-FORMAT-AT-PARAMETER-STATE?"), SubLObjectFactory.makeSymbol("CB-OPTIONS-HISTORY-AND-BROWSER-TOOL"), SubLObjectFactory.makeSymbol("START-BLUE-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-WARN-OF-EXTRA-SENTENCE"),
				SubLObjectFactory.makeSymbol("RKF-TEXT-PROCESSOR-RESET-CACHES"), SubLObjectFactory.makeSymbol("MACHINE-BOGOMIPS"), SubLObjectFactory.makeSymbol("INVALID-EVALUATION"), SubLObjectFactory.makeSymbol("ALL-CORE-FORTS"), SubLObjectFactory.makeSymbol("L2R-IMAGE-ELAPSED-CPU-TIME"), SubLObjectFactory.makeSymbol("REMOVE-TVA-CACHE-MAX-INSTANCES-TO-CACHE"),
				SubLObjectFactory.makeSymbol("CYC-REVISION-STRING"), SubLObjectFactory.makeSymbol("DEREGISTER-EBMT"), SubLObjectFactory.makeSymbol("CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES"), SubLObjectFactory.makeSymbol("SKOLEM-TABLE-CONTAINS-OLD-FORMAT-SKOLEMS?"), SubLObjectFactory.makeSymbol("RULE-SUGGESTION-PREDICATE"), SubLObjectFactory.makeSymbol("EXPERIMENTAL-IMAGE"),
				SubLObjectFactory.makeSymbol("GKE-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-4"), SubLObjectFactory.makeSymbol("LOAD-TRANSCRIPT-EXPRS"), SubLObjectFactory.makeSymbol("RESTART-API-TASK-PROCESSORS"), SubLObjectFactory.makeSymbol("INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE"), SubLObjectFactory.makeSymbol("CLEAR-CAE-DEFAULT-PARSING-MT"),
				SubLObjectFactory.makeSymbol("GATHERING-EXPANSION-JUSTIFICATIONS?"), SubLObjectFactory.makeSymbol("ENABLE-QL-IR-SEARCH"), SubLObjectFactory.makeSymbol("CLEAR-FOAF-EXPANDED-NAME"), SubLObjectFactory.makeSymbol("GET-ALL-FORMULA-TEMPLATE-TOPICS"), SubLObjectFactory.makeSymbol("INITIALIZE-NEWEST-CONSTANT-TABLE"), SubLObjectFactory.makeSymbol("IS-SKSI-SMT-MODE-ENABLED?"),
				SubLObjectFactory.makeSymbol("GET-SBHL-MARKING-GENERATION"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-ISA-CONTEXT"), SubLObjectFactory.makeSymbol("CB-COMPUTE-PARTITION-LOAD-PERSONAL-DIRECTORY"), SubLObjectFactory.makeSymbol("CONTRACTION-HTS-VALID?"), SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-CACHES"), SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-FUNCTION-METERS"),
				SubLObjectFactory.makeSymbol("CLEAR-DENOTATUM-ARG-OF-PRED-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT"), SubLObjectFactory.makeSymbol("CURRENT-SKS-REGISTRATION-STATE"), SubLObjectFactory.makeSymbol("CLEAR-L2R-SENTENCE-STRING-NUMBER-INDEXICAL"), SubLObjectFactory.makeSymbol("UNINDEXED-SYNTAX-CONSTANT-INDEX-CLEANUP"),
				SubLObjectFactory.makeSymbol("FORTS-BEING-REMOVED"), SubLObjectFactory.makeSymbol("RTP-KB-LOADED-P"), SubLObjectFactory.makeSymbol("BESTLISTPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED"), SubLObjectFactory.makeSymbol("INITIALIZE-CARDINALITIES"), SubLObjectFactory.makeSymbol("FORGET-INVALID-DEDUCTIONS"), SubLObjectFactory.makeSymbol("INCREMENT-UNIFICATION-ATTEMPT-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("HAS-NEXT-ARC-LEXICON-ENTRY"), SubLObjectFactory.makeSymbol("LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE"), SubLObjectFactory.makeSymbol("NEW-DEFN-STACK"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-SMT-COMPILE-PARAM-DEFINITIONS"), SubLObjectFactory.makeSymbol("ENSURE-LINK-SERVER-RUNNING"), SubLObjectFactory.makeSymbol("XML-ITEM-SEPARATOR"),
				SubLObjectFactory.makeSymbol("CORE-KB-LOADED?"), SubLObjectFactory.makeSymbol("LEXICON-INITIALIZED-P"), SubLObjectFactory.makeSymbol("SDBC-DB2-PORT"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-AUX-QUEUE"), SubLObjectFactory.makeSymbol("INITIALIZE-TERM-STRINGS-PREDS"), SubLObjectFactory.makeSymbol("GET-NEW-CYCL-QUERY-PARAMETER-SET"),
				SubLObjectFactory.makeSymbol("CLEAR-DB-OUTPUT-SPECS"), SubLObjectFactory.makeSymbol("LISTED-MTS-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("SAVE-LOCAL-EXPERIENCE"), SubLObjectFactory.makeSymbol("CREATE-SAMPLE-INVALID-KB-HL-SUPPORT"), SubLObjectFactory.makeSymbol("STOP-GENERIC-EVENT-DISPATCHER-PROCESS"), SubLObjectFactory.makeSymbol("GT-LINK-PRED"),
				SubLObjectFactory.makeSymbol("CLEAR-L2R-DOCUMENT-SENTENCE-FINDER-KBQ"), SubLObjectFactory.makeSymbol("RUN-AUXILIARY-OP?"), SubLObjectFactory.makeSymbol("ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("TVA-ITERATES-SKSI-PREDICATE-EXTENT?"), SubLObjectFactory.makeSymbol("GET-WS-INDEX-PORT"), SubLObjectFactory.makeSymbol("TENSEDPHRASEFN"),
				SubLObjectFactory.makeSymbol("COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE"), SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-TERMS"), SubLObjectFactory.makeSymbol("NEW-INDEXED-ITEMS"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"), SubLObjectFactory.makeSymbol("CLEAR-KEY-GAF-ARG-INDEX-CACHED"), SubLObjectFactory.makeSymbol("IS-SQS-AVAILABLE?"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT"), SubLObjectFactory.makeSymbol("CONSTANTS-MENTIONED-IN-CODE"), SubLObjectFactory.makeSymbol("HTML-FLUSH"), SubLObjectFactory.makeSymbol("DEFAULT-PREFERENCE-FILE"), SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-LICENSED-BY-POS"), SubLObjectFactory.makeSymbol("CLEAR-NL-REFORMULATE-INT-CACHED"),
				SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-TERM-HEADER-STRING"), SubLObjectFactory.makeSymbol("DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN"), SubLObjectFactory.makeSymbol("CLEAR-GET-PUBLIC-FACT-SHEET-STRING-URL-MAPPINGS"), SubLObjectFactory.makeSymbol("CLEAR-DISAMBIGUATION-MODEL"), SubLObjectFactory.makeSymbol("GET-NUMERIC-DATE-PATTERNS"),
				SubLObjectFactory.makeSymbol("GET-UNREPRESENTED-TERM-NEW-SPACE-SUID-KEYS"), SubLObjectFactory.makeSymbol("XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION"), SubLObjectFactory.makeSymbol("CLEAR-BOOKKEEPING-BINARY-GAF-STORE"), SubLObjectFactory.makeSymbol("FACT-SHEET-LOG-STREAM"), SubLObjectFactory.makeSymbol("PPH-DISCOURSE-CONTEXT-COPY"),
				SubLObjectFactory.makeSymbol("GET-KBS-INHERITED-STORES"), SubLObjectFactory.makeSymbol("CLEAR-ALL-PHRASES-FILTER-FROM-TERM-PHRASES-CONSTRAINT"), SubLObjectFactory.makeSymbol("REMOVE-BAD-TERM-OF-UNIT-ASSERTIONS"), SubLObjectFactory.makeSymbol("NL-TRIE-REVISIONS-STALE?"), SubLObjectFactory.makeSymbol("BRANCH-TAG"), SubLObjectFactory.makeSymbol("CLEAN-SBHL-MODULES"),
				SubLObjectFactory.makeSymbol("GOOD-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CONSTRAINED-PARSING-GET-ACTIONS"), SubLObjectFactory.makeSymbol("DISPLAY-API-TASK-PROCESSORS"), SubLObjectFactory.makeSymbol("PSP-NP-GAP-SEMX"), SubLObjectFactory.makeSymbol("CLEAR-GET-POS-ARG-OF-PRED-INT"), SubLObjectFactory.makeSymbol("AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?"),
				SubLObjectFactory.makeSymbol("SKSI-HL-STORAGE-MODULES-COUNT"), SubLObjectFactory.makeSymbol("HALT-SCHEDULED-QUERY-PROCESSING"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-9"), SubLObjectFactory.makeSymbol("MUST-USE-STATIC-MEMORY-FOR-NL-TRIE"), SubLObjectFactory.makeSymbol("ST-SIMILARITY-ENTRANCE-INTERNAL"),
				SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-PERCENT-MIN-CODE-SUPPORT"), SubLObjectFactory.makeSymbol("LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("SPECIFIC-REMOVAL-MODULE-COUNT"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-TRIGGERED-TMS-RULES"), SubLObjectFactory.makeSymbol("FIND-CONTROL-CHARS-IN-NAMES"),
				SubLObjectFactory.makeSymbol("INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE"), SubLObjectFactory.makeSymbol("COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?"), SubLObjectFactory.makeSymbol("ALL-KB-HL-SUPPORTS"), SubLObjectFactory.makeSymbol("ASSERTION-CONTENT-COMPLETELY-CACHED?"), SubLObjectFactory.makeSymbol("CLEAR-SUF-QUOTED-FUNCTIONS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-7"),
				SubLObjectFactory.makeSymbol("CURRENT-XREF-MODULE"), SubLObjectFactory.makeSymbol("OWL-EXPORT-DEFAULT-NAMESPACE"), SubLObjectFactory.makeSymbol("CLEAR-TAXONOMY-SUPPRESSED-FACETS"), SubLObjectFactory.makeSymbol("CLEAR-PSP-SUB-CATEGORIES"), SubLObjectFactory.makeSymbol("CLEAR-RDFS-NAME"), SubLObjectFactory.makeSymbol("INITIALIZE-LEXICON-KB-FEATURE"),
				SubLObjectFactory.makeSymbol("CLEAR-AT-ARGN-INT-CACHED"), SubLObjectFactory.makeSymbol("EXECUTED-TACTIC-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("ENSURE-FILE-BACKED-CACHE-DIRECTORY"), SubLObjectFactory.makeSymbol("GET-MASTER-LICENSE-KEY"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-3"), SubLObjectFactory.makeSymbol("CR-PATHS-STATUS"),
				SubLObjectFactory.makeSymbol("REMOVE-CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS"), SubLObjectFactory.makeSymbol("CB-OPTIONS-TABLE-OF-CONTENTS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-13"), SubLObjectFactory.makeSymbol("DHTML-CREATION-SCRIPTS"), SubLObjectFactory.makeSymbol("CLEAR-DATE-GENLS"), SubLObjectFactory.makeSymbol("WIDE-DEDUCTION-HL-STORE-CACHE?"),
				SubLObjectFactory.makeSymbol("ENABLE-SKSI-SMT-MODE"), SubLObjectFactory.makeSymbol("CLEAR-SUMMARY-PRED-SORT-ORDER-FOR-FOCAL-TERM"), SubLObjectFactory.makeSymbol("POSSIBLY-CONVERT-REFORMULATOR-RULES-TABLE-FROM-IDS-TO-ASSERTIONS"), SubLObjectFactory.makeSymbol("AT-CHECK-DEFINING-MTS-P"), SubLObjectFactory.makeSymbol("DETECT-CYC-PRODUCT"),
				SubLObjectFactory.makeSymbol("REFORMULATOR-IRRELEVANT-FORTS"), SubLObjectFactory.makeSymbol("DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("GET-NL-REFORMULATOR-TIME"), SubLObjectFactory.makeSymbol("MACHINE-BOGOMIPS"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-TRIGGERED-TMS-RULES"), SubLObjectFactory.makeSymbol("RED-STRUCT-CREATE"),
				SubLObjectFactory.makeSymbol("LOAD-TRANSCRIPT-EXPRS"), SubLObjectFactory.makeSymbol("WITHIN-NEGATED-DISJUNCTION?"), SubLObjectFactory.makeSymbol("CACHED-NART-INDEX-COUNT"), SubLObjectFactory.makeSymbol("KCT-ANY-THINKING-RUNNING?"), SubLObjectFactory.makeSymbol("CLEAR-TVA-CACHE-MAX-INSTANCES-TO-CACHE"), SubLObjectFactory.makeSymbol("PARTITION-CREATE-INVALID-CONSTANT"),
				SubLObjectFactory.makeSymbol("RESEARCHCYC-KILL-EXPENSIVE-TRUE-RULE-TEMPLATES"), SubLObjectFactory.makeSymbol("INC-TOTAL-AUXILIARY-OPERATIONS-RUN"), SubLObjectFactory.makeSymbol("MULTI-WORD-PREDS"), SubLObjectFactory.makeSymbol("FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS"), SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("CNC-POPCORN-WINDOW"),
				SubLObjectFactory.makeSymbol("PPH-ENSURE-DISCOURSE-PARTICIPANT-RMS"), SubLObjectFactory.makeSymbol("BG-TASK-PROCESSORS-INITIALIZED-P"), SubLObjectFactory.makeSymbol("INITIALIZE-QUESTION"), SubLObjectFactory.makeSymbol("NEW-LOCAL-HL-TRANSCRIPT"), SubLObjectFactory.makeSymbol("CLEAR-GEN-TEMPLATE-STORE"), SubLObjectFactory.makeSymbol("INITIALIZE-COLLECTION-LOCAL-INSTANCE-CARDINALITIES"),
				SubLObjectFactory.makeSymbol("REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE"), SubLObjectFactory.makeSymbol("CLEAR-MEANING-SENTENCE-PREDS"), SubLObjectFactory.makeSymbol("CONSTANT-INDICES-COMPLETELY-CACHED?"), SubLObjectFactory.makeSymbol("HL-PROTOTYPE-COLLECTIONS"), SubLObjectFactory.makeSymbol("NEW-RANDOM-THOUGHT-GENERATOR"),
				SubLObjectFactory.makeSymbol("CURRENT-GOOGLE-API-METHOD-INVOCATION-COUNT"), SubLObjectFactory.makeSymbol("BUILD-FACT-SHEET-DEFAULT-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("SKSI-PROFILING-ON?"), SubLObjectFactory.makeSymbol("NEW-CONCEPTUALLY-RELATED-ANSWER-TABLE"), SubLObjectFactory.makeSymbol("INCREMENT-UNIFICATION-SUCCESS-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS"), SubLObjectFactory.makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT"), SubLObjectFactory.makeSymbol("NL-REFORMULATE-DAEMON"), SubLObjectFactory.makeSymbol("CNC-POPCORN-WINDOW"), SubLObjectFactory.makeSymbol("NEW-PSP-ANSWER-ACCUMULATOR"), SubLObjectFactory.makeSymbol("SAVING-OPERATIONS?"),
				SubLObjectFactory.makeSymbol("MAKE-RELATION-EXISTS-INSTANCE-SUPPORT"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-ALL-RULES-ALLOWED?"), SubLObjectFactory.makeSymbol("LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE"), SubLObjectFactory.makeSymbol("CLEAR-TIMING-INFO"), SubLObjectFactory.makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER"),
				SubLObjectFactory.makeSymbol("CLEAR-COLLECTION-VIA-WEB-SEARCH?"), SubLObjectFactory.makeSymbol("NEW-SBHL-CACHE"), SubLObjectFactory.makeSymbol("FORWARD-PROBLEM-STORE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-ALL-PPH-VAR-TYPING-PREDICATES"), SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-BACKEND-FUNCTION-ARGLIST-TABLE"),
				SubLObjectFactory.makeSymbol("INITIALIZE-RKF-DEPRECATED-RULES"), SubLObjectFactory.makeSymbol("NEW-UNREPRESENTED-TERM-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX"), SubLObjectFactory.makeSymbol("HL-PROTOTYPE-COLLECTIONS"), SubLObjectFactory.makeSymbol("KILL-NAKED-PROTOTYPICALS"),
				SubLObjectFactory.makeSymbol("CLEAR-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE"), SubLObjectFactory.makeSymbol("CLEAR-SPEC-PRED-FORT-CACHE"), SubLObjectFactory.makeSymbol("CB-ALL-GENERIC-PREFERENCE-MODULES"), SubLObjectFactory.makeSymbol("DEFAULT-LUCENE-CONFIRMED-TERMS-BOOST"), SubLObjectFactory.makeSymbol("PPH-TOP-LEVEL-CYCL"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-15"),
				SubLObjectFactory.makeSymbol("AT-MAPPING-FINISHED"), SubLObjectFactory.makeSymbol("SKSI-REGISTERED-KNOWLEDGE-SOURCES"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-10"), SubLObjectFactory.makeSymbol("ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED"), SubLObjectFactory.makeSymbol("NON-WFF-COUNT"), SubLObjectFactory.makeSymbol("OPTIMIZE-ASSERTION-TABLE"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-3"), SubLObjectFactory.makeSymbol("RESET-KBS-RAW-CONSTANT-TABLES"), SubLObjectFactory.makeSymbol("CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE"), SubLObjectFactory.makeSymbol("PREVIOUS-OWL-EXPORT-VERSION-DATES"), SubLObjectFactory.makeSymbol("NOUN-COMPOUND-CONSTRAINT-STRING-SPECS"), SubLObjectFactory.makeSymbol("MAX-SKOLEM-ARITY"),
				SubLObjectFactory.makeSymbol("CLEAR-ALLOW-ARBITRARY-ASSERTION-DELETION"), SubLObjectFactory.makeSymbol("CACHED-TVA-VALUE-COUNT"), SubLObjectFactory.makeSymbol("HAS-NEW-UNREPRESENTED-TERMS?"), SubLObjectFactory.makeSymbol("EBMT-KEEPALIVE-FILENAME"), SubLObjectFactory.makeSymbol("CTEST-ALL-KB-TEST-METRIC-CONSTANTS"),
				SubLObjectFactory.makeSymbol("PPH-GENERIC-SPEECH-PART-PREDS-WITH-TENSE-AND-ASPECT-INTERNAL"), SubLObjectFactory.makeSymbol("SIMPLIFY-CONTRADICTIONS?"), SubLObjectFactory.makeSymbol("ALL-PROBLEM-STORE-PROPERTIES"), SubLObjectFactory.makeSymbol("INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES"), SubLObjectFactory.makeSymbol("INITIALIZE-NAME-TITLES"),
				SubLObjectFactory.makeSymbol("CLEAR-PREDICATE-GRAPH"), SubLObjectFactory.makeSymbol("DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK"), SubLObjectFactory.makeSymbol("CLEAR-GET-SALIENT-EXEMPLARS"), SubLObjectFactory.makeSymbol("CLEAR-CAE-QUERY-SEARCH-TERM-CLASSIFICATION-TREE"), SubLObjectFactory.makeSymbol("QC-NEW-QUERY"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("GET-NUMERIC-DATE-PATTERNS"), SubLObjectFactory.makeSymbol("CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("CB-OPTIONS-GENERAL"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-15"),
				SubLObjectFactory.makeSymbol("CLEAR-WF-COL-TEMPLATE-COMBO?"), SubLObjectFactory.makeSymbol("STRATEGY-LAST-UNINTERESTINGNESS-EXPLANATION"), SubLObjectFactory.makeSymbol("CLEAR-MWP-BASE-PRED-OF-POS"), SubLObjectFactory.makeSymbol("SBHL-TEMPORAL-INCREMENT"), SubLObjectFactory.makeSymbol("SCOPE-KB-DIFF-DEDUCTIONS"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-NOTE-REVISIONS"),
				SubLObjectFactory.makeSymbol("REPORT-TIME-TESTING-INFO"), SubLObjectFactory.makeSymbol("FIX-RECONSIDER-TMS"), SubLObjectFactory.makeSymbol("CLEAR-CONCEPT-FILTER-SPECIFICATION-P"), SubLObjectFactory.makeSymbol("MAYBE-INITIALIZE-FET-SOURCES"), SubLObjectFactory.makeSymbol("REMOVE-TOO-BIG-PLACES"), SubLObjectFactory.makeSymbol("INITIALIZE-KB-VARIABLES"),
				SubLObjectFactory.makeSymbol("CREATE-SAMPLE-INVALID-NART"), SubLObjectFactory.makeSymbol("ALL-LILLIPUT-QUERY-METRICS"), SubLObjectFactory.makeSymbol("INITIALIZE-UNREPRESENTED-TERM-INDEX-HL-STORE-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-TABLE-STYLE"), SubLObjectFactory.makeSymbol("VALID-TRUTHS"),
				SubLObjectFactory.makeSymbol("INITIALIZE-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE"), SubLObjectFactory.makeSymbol("REMOVE-PPH-KAPPA-JUSTIFICATION-TEMPLATE"), SubLObjectFactory.makeSymbol("OPENCYC-KBS-POSSIBLY-PREPARE-BROADER-TERM-QUEUE"), SubLObjectFactory.makeSymbol("REMOVAL-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("NEW-CONSTANTS-ITERATOR"),
				SubLObjectFactory.makeSymbol("CLEAR-WF-COL-TEMPLATE-COMBO?"), SubLObjectFactory.makeSymbol("CLEAR-HL-MODULE-EXPAND-COUNTS"), SubLObjectFactory.makeSymbol("OPENCYC-KBS-NEW-KBS-FORT-ITERATOR"), SubLObjectFactory.makeSymbol("ARETE-NARTS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("RKF-TEXT-PROCESSOR-RESET-CACHES"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-DIRECTION"),
				SubLObjectFactory.makeSymbol("UNIT-OF-MEASURE-FST"), SubLObjectFactory.makeSymbol("INITIALIZE-RTP-KB-FEATURE"), SubLObjectFactory.makeSymbol("BIO-FILTER-COLL"), SubLObjectFactory.makeSymbol("CLEAR-LINK-EXECUTE-CACHED"), SubLObjectFactory.makeSymbol("PPH-MAXIMIZE-LINKS?"), SubLObjectFactory.makeSymbol("UNSET-PLANNER-KB-LOADED"),
				SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS"), SubLObjectFactory.makeSymbol("GENL-MTS-OF-LISTED-MTS-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("GET-ALL-QUERY-LIBRARIES"), SubLObjectFactory.makeSymbol("XREF-METHOD-SCOPE"), SubLObjectFactory.makeSymbol("CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE"),
				SubLObjectFactory.makeSymbol("CYC-DATE-FEATURE"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-MODULE-TYPE"), SubLObjectFactory.makeSymbol("NEW-CFASL-COUNT-STREAM"), SubLObjectFactory.makeSymbol("CB-ALL-INFERENCE-PARAMETERS"), SubLObjectFactory.makeSymbol("PAD-TABLE-INITIALIZED?"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED"),
				SubLObjectFactory.makeSymbol("ASSIGN-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK-AND-WAIT-FOR-RESULT"), SubLObjectFactory.makeSymbol("INFERENCE-EXPAND-SENSE"), SubLObjectFactory.makeSymbol("CLEAR-MEANING-SENTENCE-PRED-STORE"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT"), SubLObjectFactory.makeSymbol("PLOT-IMAGE-EXTENSION"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-8"), SubLObjectFactory.makeSymbol("LOAD-NAMESPACE-TRANSCRIPTS"), SubLObjectFactory.makeSymbol("INITIALIZE-SENTENCIFIER"), SubLObjectFactory.makeSymbol("HERALD-NEW-DISCOURSE-CONTEXT"), SubLObjectFactory.makeSymbol("PSP-RULE-FORT-WEIGHTS"), SubLObjectFactory.makeSymbol("CLEAR-PREDICATE-REQUIRES-BACKCHAIN?"),
				SubLObjectFactory.makeSymbol("GRACEFUL-QUIT"), SubLObjectFactory.makeSymbol("PSP-CHART-MAX-SPAN"), SubLObjectFactory.makeSymbol("SET-SBHL-BOOLEAN-GOAL-CONDITIONS"), SubLObjectFactory.makeSymbol("SEND-STORED-OPERATIONS"), SubLObjectFactory.makeSymbol("OWL-EXPORT-DEFAULT-NAMESPACE"), SubLObjectFactory.makeSymbol("NL-TRIE-VALIDATE-ALL-ENTRIES"),
				SubLObjectFactory.makeSymbol("UNARY-QUANTITY-FST"), SubLObjectFactory.makeSymbol("SKSI-DATABASE-FUSION-DEBUG?"), SubLObjectFactory.makeSymbol("CURRENT-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-BROKER"), SubLObjectFactory.makeSymbol("LINKS-TO-ALL-INFERENCES"), SubLObjectFactory.makeSymbol("CB-AGENDA-ERROR-MODE-DISPLAY"),
				SubLObjectFactory.makeSymbol("INITIALIZE-DEFAULT-OPEN-CYC-NL-GENERATION-PROPERTIES"), SubLObjectFactory.makeSymbol("INITIALIZE-OWL-SPAN-ID-COUNTER"), SubLObjectFactory.makeSymbol("SPURIOUS-AGENDA-PROCESSES"), SubLObjectFactory.makeSymbol("CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY"), SubLObjectFactory.makeSymbol("AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT"),
				SubLObjectFactory.makeSymbol("RANDOM-MT"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-SUPPORTED-BROWSING-CACHES"), SubLObjectFactory.makeSymbol("GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-FULLY-CONNECTED-GRAPH-LINKS"), SubLObjectFactory.makeSymbol("STOP-ALL-FACT-SHEET-SCREENSAVERS"),
				SubLObjectFactory.makeSymbol("GATHER-FET-STATS"), SubLObjectFactory.makeSymbol("ASSERTING-TREES?"), SubLObjectFactory.makeSymbol("INSERT-STORED-OPTIONS"), SubLObjectFactory.makeSymbol("DISCARDED-TACTIC-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PSP-AGENT"), SubLObjectFactory.makeSymbol("CB-OPTIONS-GENERAL"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-2"),
				SubLObjectFactory.makeSymbol("CLEAR-ALEXANDRIA-CACHES"), SubLObjectFactory.makeSymbol("RUN-ONE-REMOTE-OP"), SubLObjectFactory.makeSymbol("CLEAR-PSP-CYCL-FAILS-CONSTRAINT?"), SubLObjectFactory.makeSymbol("REMOVAL-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("XML-SCHEMA-CLASS-URIS"), SubLObjectFactory.makeSymbol("CFASL-QUIT"), SubLObjectFactory.makeSymbol("RESET-WFF-STATE"),
				SubLObjectFactory.makeSymbol("MAX-SUPPORTED-FORMULA-ARITY"), SubLObjectFactory.makeSymbol("UNSET-PARAPHRASE-KB-LOADED"), SubLObjectFactory.makeSymbol("FSUT-PRIORITIZER-MIN-NICE-LEVEL"), SubLObjectFactory.makeSymbol("OWL-IMPORTER-V2-VERSION-NUMBER"), SubLObjectFactory.makeSymbol("SERVLET-CONTAINER-PORT"), SubLObjectFactory.makeSymbol("CLEAR-META-RELATION-SOMEWHERE?"),
				SubLObjectFactory.makeSymbol("CONSTANT-INDEX-ENABLE-MEMORY-MAPPING"), SubLObjectFactory.makeSymbol("IS-INSIDE-KB-STORE-TRANSACTION?"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-15"), SubLObjectFactory.makeSymbol("SKSI-LANGUAGE-SPOKEN-LANGUAGES-GUTS"), SubLObjectFactory.makeSymbol("GET-NULL-FILE-STREAM-PATH"), SubLObjectFactory.makeSymbol("CB-AGENDA-LOCAL-QUEUE-DISPLAY"),
				SubLObjectFactory.makeSymbol("RKF-UTTRDR-MAYBE-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES"), SubLObjectFactory.makeSymbol("MEANING-SENTENCE-PRED-STORE-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-INDETERMINATE-TERMS-ALLOWED"), SubLObjectFactory.makeSymbol("DEQUEUE-SCHEDULED-QUERY"), SubLObjectFactory.makeSymbol("LEXIFICATION-REVIEWER"),
				SubLObjectFactory.makeSymbol("SWAP-OUT-ALL-PRISTINE-ASSERTIONS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-CANDIDATE-GENL-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-FOAF-NAME"), SubLObjectFactory.makeSymbol("USE-DEVELOPMENT-DISAMBIGUATED-INDEXES"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-LEXICAL-ARG-TYPES"), SubLObjectFactory.makeSymbol("CLEAR-PSP-CATEGORY-FROM-FRAME"),
				SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-HELP"), SubLObjectFactory.makeSymbol("CLEAR-DATA-PARSER-ALL-GENLS"), SubLObjectFactory.makeSymbol("RANDOM-GAF"), SubLObjectFactory.makeSymbol("CURRENT-SKSI-BATCH-TEMPLATE"), SubLObjectFactory.makeSymbol("INITIALIZE-SKSI-BATCH-TEMPLATES"), SubLObjectFactory.makeSymbol("DEREGISTER-TEMPLATE-PARSER"),
				SubLObjectFactory.makeSymbol("INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-INSTANCES-AMONG"), SubLObjectFactory.makeSymbol("POSTMODIFIER_EDFORMFN"), SubLObjectFactory.makeSymbol("ARETE-ASSERTIONS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED"),
				SubLObjectFactory.makeSymbol("BESTLISTPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED"), SubLObjectFactory.makeSymbol("CLEAR-CONSTANT-GUID-TABLE"), SubLObjectFactory.makeSymbol("HTML-UPDATE-CB-STATUS-SCRIPT"), SubLObjectFactory.makeSymbol("GATHER-LOAD-PARTITION-KB-HL-SUPPORTS"), SubLObjectFactory.makeSymbol("RKF-SD-CLEAR"),
				SubLObjectFactory.makeSymbol("INITIALIZE-NEGATION-INVERSE-MODULE"), SubLObjectFactory.makeSymbol("KBS-STATE-VALID?"), SubLObjectFactory.makeSymbol("GET-RED-KEY-FOR-DEFAULT-JAVA-RE-VM"), SubLObjectFactory.makeSymbol("PROOF-VIEW-DEFAULT-COLOR"), SubLObjectFactory.makeSymbol("GET-NUMERIC-DATE-PATTERNS"), SubLObjectFactory.makeSymbol("CLEAR-ARG-COLLECTIONS"),
				SubLObjectFactory.makeSymbol("SET-WORDNET-KB-LOADED"), SubLObjectFactory.makeSymbol("COMPUTE-CACHED-QUOTED-ISAS-FROM-ALL-MTS-CACHE"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-MODULE-TYPE"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE"), SubLObjectFactory.makeSymbol("CLEAR-BAR-LEVEL-CACHED"),
				SubLObjectFactory.makeSymbol("GATHER-INCREMENTAL-OPERATION-STATS"), SubLObjectFactory.makeSymbol("RESET-NEW-QUOTED-DEFNS-REJECT?-METERS"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-VALUES-FOR-PRED"), SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR"), SubLObjectFactory.makeSymbol("ARETE-NARTS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("SCHEDULED-QUERY-QUEUE"),
				SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-BEHAVIOR"), SubLObjectFactory.makeSymbol("CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT"), SubLObjectFactory.makeSymbol("NL-TAG-CYCL-PLACEHOLDER"), SubLObjectFactory.makeSymbol("IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?"), SubLObjectFactory.makeSymbol("MAYBE-INITIALIZE-NL-TRIE-SUBWORD-CACHE"),
				SubLObjectFactory.makeSymbol("REPORT-TIME-TESTING-INFO"), SubLObjectFactory.makeSymbol("CB-MTS-FILTER-USE-GENLMT"), SubLObjectFactory.makeSymbol("ROBUST-NART-LOOKUP?"), SubLObjectFactory.makeSymbol("WITHIN-AGENDA"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-7"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-PRED-ARGS-GENLS-ACCESSED-IN-SPACES?"),
				SubLObjectFactory.makeSymbol("FI-ASK-STATUS-INT"), SubLObjectFactory.makeSymbol("USGS-ACCESS-PATH"), SubLObjectFactory.makeSymbol("OWL-EXPORT-VERSION-INFO"), SubLObjectFactory.makeSymbol("NEW-DENSE-NART-ID-INDEX"), SubLObjectFactory.makeSymbol("CB-SUBL-DOC-HEADER"), SubLObjectFactory.makeSymbol("ESTIMATED-ASSERTIONS-PER-HL-SUPPORT"),
				SubLObjectFactory.makeSymbol("GET-INTERNAL-REAL-TIME-MS"), SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN"), SubLObjectFactory.makeSymbol("ALL-SKOLEM-RULES"), SubLObjectFactory.makeSymbol("CB-MOST-RECENT-ASSERTION"), SubLObjectFactory.makeSymbol("FORGET-INVALID-BOOKKEEPING-ASSERTIONS"), SubLObjectFactory.makeSymbol("QL-IR-SEARCH-ALLOWED?"),
				SubLObjectFactory.makeSymbol("CB-MYCREATIONPURPOSE-FILTER"), SubLObjectFactory.makeSymbol("CLEAN-ASSERTION-ASSERT-INFO"), SubLObjectFactory.makeSymbol("CLEAR-FIND-STEM-MEMOIZED"), SubLObjectFactory.makeSymbol("START-GUARDIAN"), SubLObjectFactory.makeSymbol("PPH-CURRENT-ARG0-SPECIFIED-P"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-CODE-SUPPORT"),
				SubLObjectFactory.makeSymbol("USE-TOPIC-DEFINING-MT-WHEN-PASSED-EVERYTHING-PSC?"), SubLObjectFactory.makeSymbol("FIND-ASSERTION-WITH-KB-HL-SUPPORT-DEDUCTION-DEPENDENT"), SubLObjectFactory.makeSymbol("CB-ASSERTION-HISTORY-ITEMS"), SubLObjectFactory.makeSymbol("CLEAR-OWL-PREDICATE-TYPES-FOR-EXPORT"), SubLObjectFactory.makeSymbol("CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES"),
				SubLObjectFactory.makeSymbol("TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING"), SubLObjectFactory.makeSymbol("MAKE-KB-HL-SUPPORT-ID"), SubLObjectFactory.makeSymbol("SORT-SUF-QUOTED-DEFN-CACHE"), SubLObjectFactory.makeSymbol("CURRENT-PARITER-WIDTH"), SubLObjectFactory.makeSymbol("AT-SEARCHING-GENL-INVERSES?"), SubLObjectFactory.makeSymbol("INITIALIZE-GAF-AFTER-ADDINGS-HASH"),
				SubLObjectFactory.makeSymbol("OWL-PROPERTY-ELEMENT-NAMES"), SubLObjectFactory.makeSymbol("GET-UNQUALIFIED-MACHINE-NAME"), SubLObjectFactory.makeSymbol("INIT-KE-STATE"), SubLObjectFactory.makeSymbol("RKF-AR-SELECT-PROCESSING-METHOD"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-NARTS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-REGISTERED?"), SubLObjectFactory.makeSymbol("COPYRIGHT-NOTICE"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-FORTS-ITERATOR"), SubLObjectFactory.makeSymbol("CREATE-SAMPLE-INVALID-NART"),
				SubLObjectFactory.makeSymbol("GENERATE-ABBREVIATION-REGULAR-EXPRESSIONS"), SubLObjectFactory.makeSymbol("ID-INDEX-EMPTY-LIST"), SubLObjectFactory.makeSymbol("REMOVE-CACHED-LOAD-ALL-HAYSTACKS"), SubLObjectFactory.makeSymbol("INITIALIZE-NEWEST-CONSTANT-TABLE"), SubLObjectFactory.makeSymbol("CLEAR-FSUT-PRIORITIZER-SLEEP-INTERVAL-FROM-NICE-LEVEL"),
				SubLObjectFactory.makeSymbol("USE-NON-TRUE-ASSERTION-TV-CACHE?"), SubLObjectFactory.makeSymbol("CLEAR-GENL-PRED-NAUT-CACHE"), SubLObjectFactory.makeSymbol("SHOW-JAVA-API-SERVICE-LEASES"), SubLObjectFactory.makeSymbol("CYC-SYSTEM-DOC-FILE"), SubLObjectFactory.makeSymbol("PREPARE-KB-MINI-DUMP"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-VALUES-FOR-PRED"),
				SubLObjectFactory.makeSymbol("CLEAR-SKSI-REGISTERED-KNOWLEDGE-SOURCES"), SubLObjectFactory.makeSymbol("THE-CYCLIST"), SubLObjectFactory.makeSymbol("GET-REMOTE-OPERATIONS-KB-CHECK-POINT"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-VALUES-FOR-PRED"), SubLObjectFactory.makeSymbol("SET-TO-NOT-RECEIVING"), SubLObjectFactory.makeSymbol("NEW-HL-STORAGE-MODULE-INFO"),
				SubLObjectFactory.makeSymbol("INITIALIZE-PPH-SUBCOL-FNS"), SubLObjectFactory.makeSymbol("CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?"), SubLObjectFactory.makeSymbol("COMPILE-LEGACY-COMMUNICATION-MODE-INFORMATION"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-MODULES"), SubLObjectFactory.makeSymbol("CB-CURE-PORT"), SubLObjectFactory.makeSymbol("CREATE-CLASS"),
				SubLObjectFactory.makeSymbol("IDENTIFY-KBS-DEDUCTIONS"), SubLObjectFactory.makeSymbol("BIOLOGY-PRACTICE-RULES-INTERNAL"), SubLObjectFactory.makeSymbol("TITLES-CONVENTIONALLY-QUOTED"), SubLObjectFactory.makeSymbol("MAKE-ISOMORPHIC-SENTENCES-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("CLEAR-QUA-CACHES"), SubLObjectFactory.makeSymbol("PRINT-FAILING-TESTS"),
				SubLObjectFactory.makeSymbol("INITIALIZE-KB-VARIABLES"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-NL-PREDS-FOR-TYPE-LIST"), SubLObjectFactory.makeSymbol("CLEAR-ALL-RECENT-TRANSFORMATION-RULE-STATISTICS"), SubLObjectFactory.makeSymbol("LEXICON-KB-LOADED-P"), SubLObjectFactory.makeSymbol("LOCAL-ASKED-QUERIES-TRANSCRIPT"), SubLObjectFactory.makeSymbol("PSP-ALLOWED-GAP-CATEGORY"),
				SubLObjectFactory.makeSymbol("CLEAR-WU-ARG-OF-PRED-CACHED-INT"), SubLObjectFactory.makeSymbol("GET-RED-KEY-FOR-DEFAULT-JAVA-LIB"), SubLObjectFactory.makeSymbol("PPH-CURRENT-ADDRESSEE"), SubLObjectFactory.makeSymbol("SHOW-OWL-EXPORT-USAGES"), SubLObjectFactory.makeSymbol("ALL-PROBLEM-STORE-DYNAMIC-PROPERTIES"), SubLObjectFactory.makeSymbol("REFORMULATOR-KB-LOADED-P"),
				SubLObjectFactory.makeSymbol("INITIALIZE-EVAL-IN-API-ENV"), SubLObjectFactory.makeSymbol("CLEAR-CONSTANT-TABLES"), SubLObjectFactory.makeSymbol("RANDOM-GAF"), SubLObjectFactory.makeSymbol("HTFILE-MINIMAL-SPACE-REQUIRED"), SubLObjectFactory.makeSymbol("API-PORT"), SubLObjectFactory.makeSymbol("USING-SWAPPABLE-TVA-CACHES?"), SubLObjectFactory.makeSymbol("WITHIN-QUERY?"),
				SubLObjectFactory.makeSymbol("REMOVE-SCOPED-PARTITION"), SubLObjectFactory.makeSymbol("CLEAR-MT-RELEVANCE-CACHE"), SubLObjectFactory.makeSymbol("ARETE-NARTS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-MT-GRAPH"), SubLObjectFactory.makeSymbol("GET-PARSE-TREE-UTILITIES-PARSER"), SubLObjectFactory.makeSymbol("CB-CURE-PORT"), SubLObjectFactory.makeSymbol("SALIENT-DESCRIPTOR-FET-FN"),
				SubLObjectFactory.makeSymbol("CYC-INITIALIZATION"), SubLObjectFactory.makeSymbol("CLEAR-QUA-GENERATE-PHRASE"), SubLObjectFactory.makeSymbol("CREATE-NEW-FORMULA-TEMPLATE-WITH-QUERY"), SubLObjectFactory.makeSymbol("PSP-SEMX-CLEAR-HANDLERS"), SubLObjectFactory.makeSymbol("CLEAR-CLOSED-LEXICAL-CLASS-STRINGS"), SubLObjectFactory.makeSymbol("L2R-LINKAGE-CREATION-RULES"),
				SubLObjectFactory.makeSymbol("CURRENT-OWL-IMPORTER"), SubLObjectFactory.makeSymbol("AGENDA-STATE"), SubLObjectFactory.makeSymbol("FORGET-OLD-CREATION-SECOND-DATE"), SubLObjectFactory.makeSymbol("SYSTEM-CODE-API-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("ALL-FORTS"), SubLObjectFactory.makeSymbol("CLEAR-FULLY-CONNECTED-GRAPH-LINKS"),
				SubLObjectFactory.makeSymbol("CLEAR-KB-HL-SUPPORT-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("CFASL-SET-MODE-INTERNALIZED"), SubLObjectFactory.makeSymbol("ASSERTIVE-WFF-RULES-CACHED-INTERNAL"), SubLObjectFactory.makeSymbol("EXECUTED-TACTIC-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("INITIALIZE-KBS-DEFINITIONAL-RULE-TABLE"),
				SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-COMPUTE-ANSWER-JUSTIFICATIONS"), SubLObjectFactory.makeSymbol("GATHER-ILP-EXPORT-TYPE-AND-INSTANCE-INFORMATION?"), SubLObjectFactory.makeSymbol("SET-TO-NO-RECORD"), SubLObjectFactory.makeSymbol("INITIALIZE-AGENDA"), SubLObjectFactory.makeSymbol("ANY-TIME-IS-RELEVANT?"), SubLObjectFactory.makeSymbol("CLEAR-STRATEGY-TYPE-STORE"),
				SubLObjectFactory.makeSymbol("NPP-INIT-EXCLUDED-NAME-PREDS"), SubLObjectFactory.makeSymbol("RESET-OLD-DEFNS-REJECT?-METERS"), SubLObjectFactory.makeSymbol("GET-AVAILABLE-SEARCH-ENGINES"), SubLObjectFactory.makeSymbol("RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO"), SubLObjectFactory.makeSymbol("NL-GENERATION-CACHE-MEMORY-MAPPED?"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-CACHES"),
				SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("ENABLE-SKSI-SMT-MODE"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P"), SubLObjectFactory.makeSymbol("CLEAR-WNI-TERM-HAS-VERB-SEMTRANS-HELPER?"),
				SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-SENTENCE-GROUP-SUMMARY"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-2"), SubLObjectFactory.makeSymbol("HALT-CONSOLE-TASK-PROCESSORS"), SubLObjectFactory.makeSymbol("CLEAR-POS-TO-SEMTRANS-PRED-CACHED"), SubLObjectFactory.makeSymbol("COMMANDER-DEBUG-LEVEL"), SubLObjectFactory.makeSymbol("BUILD-CYC-TO-SUPERTAG-MAP"),
				SubLObjectFactory.makeSymbol("RBP-TERM-KEYWORD-MAP"), SubLObjectFactory.makeSymbol("IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?"), SubLObjectFactory.makeSymbol("HTML-GOOGLE-PIE-CHART-SCRIPT"), SubLObjectFactory.makeSymbol("PSP-NP-EDGES"), SubLObjectFactory.makeSymbol("INDEXICAL-YESTERDAY"), SubLObjectFactory.makeSymbol("DECLARE-GEN-TEMPLATE-STORE-KNOWN-STALE"),
				SubLObjectFactory.makeSymbol("SKSI-SUSPEND-COST-RECORDING-FOR-CURRENT-ITERATOR"), SubLObjectFactory.makeSymbol("NEW-CONSTANT-CHECKPOINT"), SubLObjectFactory.makeSymbol("INITIALIZE-NEWEST-CONSTANT-TABLE"), SubLObjectFactory.makeSymbol("CZER-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-METRICS-INFERENCE-INDEX"),
				SubLObjectFactory.makeSymbol("ANY-SKSI-MEANING-SENTENCE-MT-RELEVANT?"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-SEARCH-CACHES"), SubLObjectFactory.makeSymbol("CB-SERVER-SHOW-LOCAL-QUEUE?"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-ADD-UNMARKED-NODE-TEST"), SubLObjectFactory.makeSymbol("WITHIN-HL-EVAL?"), SubLObjectFactory.makeSymbol("CLEAR-FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT"),
				SubLObjectFactory.makeSymbol("PPH-INITIALIZED?"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-SHOW-MT"), SubLObjectFactory.makeSymbol("CLEAR-DOCUMENT-ANNOTATION-TERM-FROM-ID"), SubLObjectFactory.makeSymbol("PPH-PARAMETER-DECLARATIONS"), SubLObjectFactory.makeSymbol("INITIALIZE-PARAPHRASE-CYCL"), SubLObjectFactory.makeSymbol("NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF"),
				SubLObjectFactory.makeSymbol("SKSI-SUSPEND-COST-RECORDING-FOR-CURRENT-ITERATOR"), SubLObjectFactory.makeSymbol("ALL-RFS"), SubLObjectFactory.makeSymbol("REMOVE-FACT-SHEET-DEFAULT-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("INITIALIZE-SKSI-BATCH-TEMPLATES"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-SYNTACTIC-PREDICATES"), SubLObjectFactory.makeSymbol("NEW-UIMA"),
				SubLObjectFactory.makeSymbol("INITIALIZE-DERIVED-PREDS"), SubLObjectFactory.makeSymbol("REMOVE-SIMPLE-SKSI-TERMS"), SubLObjectFactory.makeSymbol("REGISTER-TEMPLATE-PARSER"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-SUBWORD-CACHES"), SubLObjectFactory.makeSymbol("CLEAR-CAE-FACT-EDITOR-FOCAL-TYPES"), SubLObjectFactory.makeSymbol("ALL-XML-HANDLER-SYMBOLS"),
				SubLObjectFactory.makeSymbol("PPH-PROVEN-SENTENCE-FROM-INFERENCE-ANSWER"), SubLObjectFactory.makeSymbol("ALL-PROBLEM-STORE-STATIC-PROPERTIES"), SubLObjectFactory.makeSymbol("GLOBAL-CACHE-VARIABLES"), SubLObjectFactory.makeSymbol("CYC-MAINT-FEATURE"), SubLObjectFactory.makeSymbol("DEDUCTION-CONTENT-COMPLETELY-CACHED?"), SubLObjectFactory.makeSymbol("GET-TERNARY-QUANT-FNS"),
				SubLObjectFactory.makeSymbol("CLEAR-TAXONOMY-SUPPRESSED-FACETS"), SubLObjectFactory.makeSymbol("CURRENT-PROCESS-IS-AGENDA"), SubLObjectFactory.makeSymbol("UNSET-TIME-KB-LOADED"), SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-BINARY-PROPERTY-PATTERNS"), SubLObjectFactory.makeSymbol("CLEAR-LEXICAL-MT-FOR-LANGUAGE"), SubLObjectFactory.makeSymbol("CLEAR-RUN-COLUMN-QUERY"),
				SubLObjectFactory.makeSymbol("CLEAR-RKF-MIN-ARG-N-ISA"), SubLObjectFactory.makeSymbol("CLEAR-GET-ILP-EXPORT-INPUT-MODES-FOR-ARG-POSITION"), SubLObjectFactory.makeSymbol("INFERENCE-UNIT-TEST-CLEANUP"), SubLObjectFactory.makeSymbol("REGISTER-ALL-QUERY-LIBRARY-PARSERS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-14"), SubLObjectFactory.makeSymbol("EBMT-CLEAR-CACHES"),
				SubLObjectFactory.makeSymbol("NEW-DENSE-NART-ID-INDEX"), SubLObjectFactory.makeSymbol("KILL-ALL-CB-PROOF-VIEW-THREADS"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-PARENT-MARKING"), SubLObjectFactory.makeSymbol("XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION"), SubLObjectFactory.makeSymbol("NEW-OWL-DEFINITION-ACCUMULATOR"), SubLObjectFactory.makeSymbol("REGISTER-DEFAULT-QL-PARSERS"),
				SubLObjectFactory.makeSymbol("CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR"), SubLObjectFactory.makeSymbol("L2R-PICK-DOCUMENT-TO-READ"), SubLObjectFactory.makeSymbol("WIDE-UNREPRESENTED-TERM-COMPLEX-INDEX-HL-STORE-CACHE?"), SubLObjectFactory.makeSymbol("START-KB-MODIFICATIONS-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("SHOW-FUNCTION-CACHING-RESULTS"),
				SubLObjectFactory.makeSymbol("CLEAR-RTV-PANEL-ENABLED-FOR-TASK"), SubLObjectFactory.makeSymbol("SBHL-MAPPING-FINISHED"), SubLObjectFactory.makeSymbol("CYC-PRODUCT"), SubLObjectFactory.makeSymbol("POST-PERCENT-NOT-WFF"), SubLObjectFactory.makeSymbol("MAKE-STATIC-SEARCH-NODE"), SubLObjectFactory.makeSymbol("MT-RELEVANCE-UNSPECIFIED?"),
				SubLObjectFactory.makeSymbol("PPH-REGEX-BEHAVES-AS-EXPECTED?"), SubLObjectFactory.makeSymbol("CLEAR-SOURCE-INFORMATION-ENABLED-FOR-TASK"), SubLObjectFactory.makeSymbol("CZER-CREATE-NARTS?"), SubLObjectFactory.makeSymbol("DEFN-COLLECTION"), SubLObjectFactory.makeSymbol("CLEAR-CORE-STATE"), SubLObjectFactory.makeSymbol("BRANCH-TAG"),
				SubLObjectFactory.makeSymbol("WNI-MAPPED-TERMS-AND-POS-OFFSETS"), SubLObjectFactory.makeSymbol("CLEAR-PPH-AGR-PREDS-FROM-CATEGORY-CACHED"), SubLObjectFactory.makeSymbol("STOP-ALL-FACT-SHEET-SCREENSAVERS"), SubLObjectFactory.makeSymbol("ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS"), SubLObjectFactory.makeSymbol("LINKAGE-CREATION-RULES"),
				SubLObjectFactory.makeSymbol("CURRENT-MT-RELEVANCE-MT-LIST"), SubLObjectFactory.makeSymbol("SKSI-VIOLATIONS"), SubLObjectFactory.makeSymbol("SET-BASIC-NC-RULE-COUNT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-15"), SubLObjectFactory.makeSymbol("CB-OPTIONS-GENERAL"), SubLObjectFactory.makeSymbol("CLEAR-CAE-DEFAULT-NL-DOMAIN-MT"),
				SubLObjectFactory.makeSymbol("CLEAR-QUERY-SEARCH-TABLE-PREDS"), SubLObjectFactory.makeSymbol("COMPUTE-MACHINE-BOGOMIPS"), SubLObjectFactory.makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("BASIC-LILLIPUT-QUERY-METRICS"), SubLObjectFactory.makeSymbol("REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL"),
				SubLObjectFactory.makeSymbol("SCOPE-KBS-SPLICING-ASSERTIONS"), SubLObjectFactory.makeSymbol("GET-ALL-SBHL-MODULE-CACHE-STRATEGY-METRICS"), SubLObjectFactory.makeSymbol("RESEARCH-CYC-PRE-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK"), SubLObjectFactory.makeSymbol("DONT-METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME"),
				SubLObjectFactory.makeSymbol("SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?"), SubLObjectFactory.makeSymbol("NEW-WHOLLY-UNSPECIFIED-MT-ERROR"), SubLObjectFactory.makeSymbol("CB-ACTIVE-PROCESSES-FOR-DISPLAY"), SubLObjectFactory.makeSymbol("GATHER-LOAD-PARTITION-MISSING-CONSTANTS"), SubLObjectFactory.makeSymbol("COMPUTE-PRED-STRENG-RESULT"),
				SubLObjectFactory.makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS"), SubLObjectFactory.makeSymbol("CODE-PRODUCT"), SubLObjectFactory.makeSymbol("NEW-HAPPINESS-INDEX"), SubLObjectFactory.makeSymbol("CLEAR-FAST-HAS-EVENT-CLASS-ANY-TRANSITIVE-LISTENERS?"), SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P"), SubLObjectFactory.makeSymbol("EMPTY-MB"),
				SubLObjectFactory.makeSymbol("KILL-TEST-CONSTANTS-CREATED"), SubLObjectFactory.makeSymbol("SHOW-API-TP-MSGS"), SubLObjectFactory.makeSymbol("CLEAR-FIND-OR-CREATE-OWL-ONTOLOGY-FOR-URI"), SubLObjectFactory.makeSymbol("KB-TINY-OR-FULL"), SubLObjectFactory.makeSymbol("UNSET-FRACTION-KB-LOADED"), SubLObjectFactory.makeSymbol("NEW-NL-TRIE-COMPLETION-INDEX"),
				SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-ASSERTIONS"), SubLObjectFactory.makeSymbol("TRANSLATION-COPYRIGHT-STRING"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-RECEIVED-STATISTICS-COUNT"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-RULES-ITERATOR"), SubLObjectFactory.makeSymbol("BESTPPFN"), SubLObjectFactory.makeSymbol("RKF-SC-NEW-LIMITATIONS"),
				SubLObjectFactory.makeSymbol("VERBOSE-PRINT-PPH-PHRASES?"), SubLObjectFactory.makeSymbol("OWL-OPENCYC-UNVERSIONED-BASE-URI"), SubLObjectFactory.makeSymbol("INITIALIZE-TERM-STRINGS-PREDS"), SubLObjectFactory.makeSymbol("INFERENCE-SPEC-PREDS-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("CLEAR-XSD-NAME"), SubLObjectFactory.makeSymbol("CLEAR-MAKE-NL-TAG-TEMPLATE"),
				SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-SENTENCES"), SubLObjectFactory.makeSymbol("CLEAR-KB-STORE-ENTITY-MANAGER"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE"), SubLObjectFactory.makeSymbol("UNSET-DATE-KB-LOADED"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-EVENT-CLASSES"), SubLObjectFactory.makeSymbol("NOT-INSTANCES-AMONG"),
				SubLObjectFactory.makeSymbol("SET-HB-ALTERNATE-PREDICATE"), SubLObjectFactory.makeSymbol("METER-ASSERTION-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("KB-CONTENT-COPYRIGHT-NOTICE"), SubLObjectFactory.makeSymbol("PSP-NEW-CONSTRAINTS"), SubLObjectFactory.makeSymbol("KB-PRODUCT"), SubLObjectFactory.makeSymbol("LOCAL-QUEUE-SIZE"), SubLObjectFactory.makeSymbol("KB-TINY-OR-FULL"),
				SubLObjectFactory.makeSymbol("GET-SBHL-PREDICATES-INTERNAL"), SubLObjectFactory.makeSymbol("GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE"), SubLObjectFactory.makeSymbol("GET-TRIE-ANCESTOR-TRACKING-VECTOR"), SubLObjectFactory.makeSymbol("CLEAR-FUNCTION-CACHING-RESULTS"), SubLObjectFactory.makeSymbol("CLEAR-ASKED-QUERY-QUEUE"), SubLObjectFactory.makeSymbol("CB-KCT-TOGGLE-ROWCOLOR"),
				SubLObjectFactory.makeSymbol("INITIALIZE-GAF-AFTER-REMOVINGS-HASH"), SubLObjectFactory.makeSymbol("DECLARE-NL-TRIE-STALENESS-UNACCEPTABLE"), SubLObjectFactory.makeSymbol("REMOVE-FACT-SHEET-IMAGE-FILE-ROOT-URL"), SubLObjectFactory.makeSymbol("PPH-TOP-LEVEL-PROOF-P"), SubLObjectFactory.makeSymbol("CB-SYSTEM-HEALTH-SHOW-STATISTICS"),
				SubLObjectFactory.makeSymbol("ESTIMATED-ASSERTIONS-PER-CLAUSE-STRUC"), SubLObjectFactory.makeSymbol("PRINT-WFF-REFORMULATOR-RULES"), SubLObjectFactory.makeSymbol("HL-MODIFY-ANYWHERE?"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-6"), SubLObjectFactory.makeSymbol("SEND-STORED-OPERATIONS"), SubLObjectFactory.makeSymbol("CLEAR-RELATION-GENERALITY-ESTIMATE-CACHED"),
				SubLObjectFactory.makeSymbol("SET-TO-TRANSMIT-ONLY"), SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS"), SubLObjectFactory.makeSymbol("INCREMENT-SUCCESSFUL-FORWARD-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP"), SubLObjectFactory.makeSymbol("MAX-SUSPENDED-METHOD-DEPTH"),
				SubLObjectFactory.makeSymbol("VERIFY-DO-FORTS-MACRO-ITERATION-EQUIVALENCE"), SubLObjectFactory.makeSymbol("*GENL-INVERSE-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("INITIALIZE-OPEN-CYC-INFERENCE-API-VARS"), SubLObjectFactory.makeSymbol("ALLOW-FACT-SHEET-SCREENSAVERS"), SubLObjectFactory.makeSymbol("KB-RULE-SET"), SubLObjectFactory.makeSymbol("SET-QUANT-KB-LOADED"),
				SubLObjectFactory.makeSymbol("CB-CLEAR-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS"), SubLObjectFactory.makeSymbol("CLEAR-GET-PRED-LIST-ORDER-FOR-TYPE"), SubLObjectFactory.makeSymbol("PROBLEM-REUSES-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("GET-GURUQA-WIZARD"), SubLObjectFactory.makeSymbol("RESET-TP-VALID-QUANTITY-P"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-MODES"),
				SubLObjectFactory.makeSymbol("CB-SUBL-DOC-MODULE-INDEX-STATIC-FILENAME"), SubLObjectFactory.makeSymbol("NEW-FORT-ID-INDEX-NARTS"), SubLObjectFactory.makeSymbol("CURRENT-GUARDIAN-PROCESS"), SubLObjectFactory.makeSymbol("COMPUTE-BOGUS-CONSTANT-NAMES-IN-CODE"), SubLObjectFactory.makeSymbol("CLEAR-PS-PARSE-VBAR-INT-CACHED"), SubLObjectFactory.makeSymbol("SME-LEXWIZ-USE-BLACKBOARD?"),
				SubLObjectFactory.makeSymbol("CLEAR-KB-HL-SUPPORT-CONTENT-TABLE"), SubLObjectFactory.makeSymbol("NEW-NO-OP-HIERARCHICAL-VISITOR"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-PHYSICALLOCATION"), SubLObjectFactory.makeSymbol("NL-TAG-CYCL-PLACEHOLDER"), SubLObjectFactory.makeSymbol("MAINTAIN-ASSERTION-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("NEW-ASSERTIONS-ITERATOR"),
				SubLObjectFactory.makeSymbol("CLEAR-PPH-ENHANCED-DOMAIN-MT"), SubLObjectFactory.makeSymbol("SKSI-HL-STORAGE-MODULES-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-RKF-NUMBER-STRING?"), SubLObjectFactory.makeSymbol("CLEAR-CB-HTML-FOR-CYCLIST-IN-NL"), SubLObjectFactory.makeSymbol("PRE-PERCENT-NOT-WFF"), SubLObjectFactory.makeSymbol("GET-NUMERIC-DATE-PATTERNS"),
				SubLObjectFactory.makeSymbol("ACQUAINT-BLAIR-DEMO"), SubLObjectFactory.makeSymbol("MWP-RULE-SPEC-TABLE-INIT"), SubLObjectFactory.makeSymbol("STASH-KB-OBJECT-CONTENT-VARS"), SubLObjectFactory.makeSymbol("CLEAR-REMOTE-HL-STORE-CONNECTION-POOL"), SubLObjectFactory.makeSymbol("FTS-INIT-VIA-RULES"), SubLObjectFactory.makeSymbol("CLEAN-SBHL-MODULES"),
				SubLObjectFactory.makeSymbol("SBHL-CACHE-SUCCESS-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CURRENT-MT-RELEVANCE-TEST"), SubLObjectFactory.makeSymbol("CAE-FRAGMENT-REFINEMENTS"), SubLObjectFactory.makeSymbol("RKF-ASSERTION-ATTRIBUTION-MT"), SubLObjectFactory.makeSymbol("ISA-ARGS-TO-QUERIES"), SubLObjectFactory.makeSymbol("COMMIT-KB-STORE-TRANSACTION"),
				SubLObjectFactory.makeSymbol("DISPATCH-EVENTS-FOR-GENERIC-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("ACQUAINT-CLINTON-DEMO"), SubLObjectFactory.makeSymbol("FORGET-OLD-CREATION-SECONDS"), SubLObjectFactory.makeSymbol("GET-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("RKF-SD-CLEAR"), SubLObjectFactory.makeSymbol("GET-KBS-POST-IDENTIFY-FORTS-FNS"),
				SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-NAME-STRING-PREDS"), SubLObjectFactory.makeSymbol("CURRENT-PARITER-WIDTH"), SubLObjectFactory.makeSymbol("REGISTER-USGS-SKS"), SubLObjectFactory.makeSymbol("*GROUP-TYPE-MEMBER-TYPE-FROM-RAI-GROUP-MEMBER-TYPE-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("NEW-FACT-SHEET-QUERY-DAEMON"),
				SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-CITYWITHSTATEORPROVINCEABBREVIATION"), SubLObjectFactory.makeSymbol("SOME-EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?"), SubLObjectFactory.makeSymbol("PAD-TABLE-INITIALIZED?"), SubLObjectFactory.makeSymbol("CYCL-QUERY-NAMESPACE"), SubLObjectFactory.makeSymbol("PERSPECTIVE-ACTIONS"), SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-GAF"),
				SubLObjectFactory.makeSymbol("CLEAR-CORBA-CACHES"), SubLObjectFactory.makeSymbol("PPH-DEFAULT-GRAMMATICAL-GENDER"), SubLObjectFactory.makeSymbol("REMOTE-QUEUE-DEQUEUE"), SubLObjectFactory.makeSymbol("RTP-KB-LOADED-P"), SubLObjectFactory.makeSymbol("CURRENT-SYSTEM-TRANSLATION-SYSTEM"), SubLObjectFactory.makeSymbol("GET-INTERNAL-RUN-TIME"),
				SubLObjectFactory.makeSymbol("CLEAR-SOME-MAX-FLOOR-MTS?-CACHED"), SubLObjectFactory.makeSymbol("DUMPER-NUM-TOP-LEVEL-INDEX"), SubLObjectFactory.makeSymbol("INITIALIZE-CAE-QUERY-TRANSLATION"), SubLObjectFactory.makeSymbol("FINALIZE-KB-TABLES"), SubLObjectFactory.makeSymbol("NEXT-CLAUSE-STRUC-ID"), SubLObjectFactory.makeSymbol("RECONSTRUCT-AUXILIARY-INDICES"),
				SubLObjectFactory.makeSymbol("CLEAR-AT-VAR-TYPE-DNFS-INT-CACHED"), SubLObjectFactory.makeSymbol("REMOVE-KE-INTERACTION-FOLDERS"), SubLObjectFactory.makeSymbol("ENABLE-FULL-SENTENCE-CAE-INTERPRETATION"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON"), SubLObjectFactory.makeSymbol("REMOVAL-MODULES"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-STRINGS-OF-TYPE-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSETS-CAUSED-BY-HELPER"), SubLObjectFactory.makeSymbol("INITIALIZE-TERM-STRINGS-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER"), SubLObjectFactory.makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"), SubLObjectFactory.makeSymbol("PPH-CURRENT-PRECISION"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-COERCED-CYCLS-FOR-TERM"), SubLObjectFactory.makeSymbol("OCLOCKFN"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-LOG"), SubLObjectFactory.makeSymbol("CLEAR-PPH-ARG-POSITION-LOOKUP"), SubLObjectFactory.makeSymbol("CYCML-INDENT"), SubLObjectFactory.makeSymbol("PPH-KAPPA-JUSTIFICATION-TEMPLATE-INTERNAL"),
				SubLObjectFactory.makeSymbol("CLEAR-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION"), SubLObjectFactory.makeSymbol("PPH-TRACKING-VAR-TYPES-P"), SubLObjectFactory.makeSymbol("*COORIGINATING-INTERVAL-OF-LESSER-DURATION-IS-SUBSUMED-SUPPORT*-INITIALIZER"), SubLObjectFactory.makeSymbol("SUCCESSFUL-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("NL-TAG-CYCL-PLACEHOLDER"),
				SubLObjectFactory.makeSymbol("KBS-DEDUCTION-COUNT"), SubLObjectFactory.makeSymbol("GET-INDEXING-PRE-DUMP-CLEANUP-DEFS"), SubLObjectFactory.makeSymbol("DHTML-CREATION-SCRIPTS"), SubLObjectFactory.makeSymbol("USE-DEVELOPMENT-INDEXES"), SubLObjectFactory.makeSymbol("NEW-SEMTRANS-LEXICON"), SubLObjectFactory.makeSymbol("NEW-BLUE-GRAPH"), SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-SETUP"),
				SubLObjectFactory.makeSymbol("INIT-TEMPORAL-BOUNDS-INTERSECT"), SubLObjectFactory.makeSymbol("DISABLE-SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE"), SubLObjectFactory.makeSymbol("MAKE-PPH-INFO-VECTOR"), SubLObjectFactory.makeSymbol("CHECK-SBHL-MODULES-STORE-FOR-LEGACY-FORMAT"), SubLObjectFactory.makeSymbol("CREATE-NART-DUMP-ID-TABLE"), SubLObjectFactory.makeSymbol("SOME-FORT-BEING-REMOVED?"),
				SubLObjectFactory.makeSymbol("CLEAR-RKF-ASSERTION-ATTRIBUTION-MT"), SubLObjectFactory.makeSymbol("CLEAR-CANON-CACHES"), SubLObjectFactory.makeSymbol("TOMORROW"), SubLObjectFactory.makeSymbol("NON-FORT-ISA-TABLE"), SubLObjectFactory.makeSymbol("USE-FACT-SHEET-IMAGE-FILE-ROOT-URL?"), SubLObjectFactory.makeSymbol("PREVIOUS-QUERY-INFERENCE"),
				SubLObjectFactory.makeSymbol("CLEAR-AT-ARGN-INT-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS"), SubLObjectFactory.makeSymbol("NEW-RDF-GRAPH"), SubLObjectFactory.makeSymbol("CLEAR-NL-MAX-FLOOR-PREDS"), SubLObjectFactory.makeSymbol("GET-KBS-INHERITED-STORES"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-14"), SubLObjectFactory.makeSymbol("JSON-NEWLINE"),
				SubLObjectFactory.makeSymbol("OWL-TAG-ATTRIBUTES-INTERNAL"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-ADD-NODE-TEST"), SubLObjectFactory.makeSymbol("CLEAR-FUNCTION-CACHING-RESULTS"), SubLObjectFactory.makeSymbol("CLEAR-RKF-VERB-STRING?"), SubLObjectFactory.makeSymbol("CB-CLEAR-KCT-TEST-BEING-SAVED"), SubLObjectFactory.makeSymbol("PPH-CLOSE-TAG-GREP-REGEX"),
				SubLObjectFactory.makeSymbol("CURRENT-CONTROLLING-INFERENCE-MAX-TIME-REACHED?"), SubLObjectFactory.makeSymbol("INTER-ARG-FORMAT-CACHE-INITIALIZED?"), SubLObjectFactory.makeSymbol("CLEAR-AUTOCOMPLETE-ISA-CACHE"), SubLObjectFactory.makeSymbol("GENL-ARGS-TO-QUERIES"), SubLObjectFactory.makeSymbol("PLURALPARAPHRASEFN-PP"),
				SubLObjectFactory.makeSymbol("INITIALIZE-REFORMULATOR-RULE-PREDICATES"), SubLObjectFactory.makeSymbol("KB-DUMP-COMMON-SYMBOLS"), SubLObjectFactory.makeSymbol("PPH-PHRASE-ID-INDEX-NEW-OBJECTS-COUNT"), SubLObjectFactory.makeSymbol("HL-PROTOTYPES-ENABLED?"), SubLObjectFactory.makeSymbol("REBUILD-NON-TRUE-ASSERTION-TV-CACHE"), SubLObjectFactory.makeSymbol("GENERIC-PREFERENCE-MODULES"),
				SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-BLIST"), SubLObjectFactory.makeSymbol("GET-ENTITY-GRAPH-REGISTRY"), SubLObjectFactory.makeSymbol("CLEAR-GEN-TEMPLATE-VERBOSITY"), SubLObjectFactory.makeSymbol("OLD-UNREPRESENTED-TERM-COUNT"), SubLObjectFactory.makeSymbol("KBS-DEFINITIONAL-CONSTANT-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-LEXIFICATION-CACHES"),
				SubLObjectFactory.makeSymbol("FACT-SHEET-QUERY-SOFT-TIMEOUT-TIME-REACHED?"), SubLObjectFactory.makeSymbol("CB-MISSING-ICON"), SubLObjectFactory.makeSymbol("METER-NART-INDEX-SWAP-TIME"), SubLObjectFactory.makeSymbol("INCREMENT-DISCARDED-TACTIC-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("MWP-RULE-CONSTRAINT-TABLE-INIT"), SubLObjectFactory.makeSymbol("SME-LEXWIZ-USE-BLACKBOARD?"),
				SubLObjectFactory.makeSymbol("CLEAR-PPH-APPLY-TEMPLATE"), SubLObjectFactory.makeSymbol("CLEAR-NL-REFORMULATE-INT-CACHED"), SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-CONTENT-INDEX-MEMORY-MAPPED?"), SubLObjectFactory.makeSymbol("UN-NOTE-ALL-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCES"), SubLObjectFactory.makeSymbol("HLT-TRACE-ENABLED?"),
				SubLObjectFactory.makeSymbol("GET-SBHL-GATHER-SPACE"), SubLObjectFactory.makeSymbol("SKSI-BATCH-TRANSLATE-COERCE-TYPES?"), SubLObjectFactory.makeSymbol("CB-USE-MYCREATOR-FILTER"), SubLObjectFactory.makeSymbol("UNDEFINE-ALL-TEST-CASE-TABLES"), SubLObjectFactory.makeSymbol("ASSERT-MISSING-QUOTED-ISA-INSTANTIATED-CONSTANT-ASSERTIONS"),
				SubLObjectFactory.makeSymbol("SBHL-APPLY-UNWIND-FUNCTION-P"), SubLObjectFactory.makeSymbol("CLEAR-TIME-MT-CACHE"), SubLObjectFactory.makeSymbol("CB-TOE-QUERY"), SubLObjectFactory.makeSymbol("INITIALIZE-COLLECTION-LOCAL-SPEC-CARDINALITIES"), SubLObjectFactory.makeSymbol("SBHL-VERIFY-NAUT-MT-RELEVANCE-P"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-ADDITIONAL-REDUNDANT-DEFINITIONAL-INFO"),
				SubLObjectFactory.makeSymbol("MAX-SKOLEM-ARITY"), SubLObjectFactory.makeSymbol("RBP-WFF-DOMAIN-MT"), SubLObjectFactory.makeSymbol("OWL-EXPORT-DEFAULT-NAMESPACE"), SubLObjectFactory.makeSymbol("REMOVE-SKSI-SCHEMA-TRANSLATION-LIFTING-RULE"), SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-POS-OF-PRED"), SubLObjectFactory.makeSymbol("NEW-CB-PARTITION-SAVE"),
				SubLObjectFactory.makeSymbol("WITHIN-ASK?"), SubLObjectFactory.makeSymbol("BESTSETPARAPHRASEWITHSEPARATORANDCOEFFICIENTSFN-CONSTRAINED"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-11"), SubLObjectFactory.makeSymbol("REMOVAL-MODULES-WITH-REMOVAL-MODULE-COST-TESTS"), SubLObjectFactory.makeSymbol("*NULL-PARAM-SUBSUMES-RULE*-INITIALIZER"),
				SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-SENTENCE-GROUP-SUMMARY"), SubLObjectFactory.makeSymbol("BASIC-LILLIPUT-QUERY-METRICS"), SubLObjectFactory.makeSymbol("CB-SUBL-DOC-HEADER"), SubLObjectFactory.makeSymbol("NON-WFF-COUNT"), SubLObjectFactory.makeSymbol("QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL"), SubLObjectFactory.makeSymbol("ENUMERATE-ALL-TEMPLATE-CATEGORIES"),
				SubLObjectFactory.makeSymbol("ENABLE-SPEC-PREDS-OF-IST-INDEXING"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-CONJUNCTIVE-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("FI-ASK-STATUS"), SubLObjectFactory.makeSymbol("INITIALIZE-INTENSIONALLY-INCOMPATIBLE-MT-MODULE"), SubLObjectFactory.makeSymbol("SBHL-GOAL-SEARCH-P"), SubLObjectFactory.makeSymbol("EFFECTIVE-SERVLET-CONTAINER-PORT"),
				SubLObjectFactory.makeSymbol("CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-USAGE-COUNTS-ENABLED?"), SubLObjectFactory.makeSymbol("RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS"), SubLObjectFactory.makeSymbol("CLEAR-INFERENCE-MONITOR-FOCAL-OBJECT-PARAPHRASE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-1"),
				SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM"), SubLObjectFactory.makeSymbol("ALL-CURRENTLY-FORWARD-PROPAGATING-SUPPORTS"), SubLObjectFactory.makeSymbol("MINIMAL-HAPPINESS"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-CLOUD-DISPLAY-NL"), SubLObjectFactory.makeSymbol("NLDISJUNCTIONFN"), SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("CB-FORM-CONS-INTER-ARG-SPACE"), SubLObjectFactory.makeSymbol("PPH-NBAR-CATEGORY"), SubLObjectFactory.makeSymbol("PERFORM-CYC-TESTING-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-HL-SUPPORTS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("NEW-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-WU-ARG-OF-PRED-CACHED-INT"),
				SubLObjectFactory.makeSymbol("READ-OPERATIONS-FROM-SERVER"), SubLObjectFactory.makeSymbol("PROCESS-QL-INDEX-QUEUE-ENTRIES"), SubLObjectFactory.makeSymbol("WNI-REFRESH-CONCEPT-MATCH-HTML-CACHE"), SubLObjectFactory.makeSymbol("SBHL-REACHED-CUTOFF-P"), SubLObjectFactory.makeSymbol("NEGATIVE-INFINITY"), SubLObjectFactory.makeSymbol("INITIALIZE-NON-FORT-ISA-TABLES"),
				SubLObjectFactory.makeSymbol("ENFORCE-EVALUATABLE-SATISFIABILITY?"), SubLObjectFactory.makeSymbol("PROBLEM-STORE-ID-INDEX"), SubLObjectFactory.makeSymbol("STOP-BLUE-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("NEW-BOOKKEEPING-INTERMEDIATE-INDEX"), SubLObjectFactory.makeSymbol("ADD-KBS-ADDITIONAL-REDUNDANT-ASSERTED-ARGUMENTS"),
				SubLObjectFactory.makeSymbol("ASSERTIONS-WITH-MORE-THAN-ONE-BELIEF"), SubLObjectFactory.makeSymbol("KB-STORAGE-LOGGING-P"), SubLObjectFactory.makeSymbol("RUN-AUXILIARY-OP?"), SubLObjectFactory.makeSymbol("INTERRUPT-PROCESS-WITH-ARGS-INTERNAL"), SubLObjectFactory.makeSymbol("FACT-SHEET-IMAGE-FILE-ROOT-URL"), SubLObjectFactory.makeSymbol("USE-DEVELOPMENT-DISAMBIGUATED-INDEXES"),
				SubLObjectFactory.makeSymbol("HALT-NEWS-TROLLER-DAEMON"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-PUBLIC-SECTION"), SubLObjectFactory.makeSymbol("MORE-SPECIFIC-ASSERTED-ASSERTION-ASENT-MT"), SubLObjectFactory.makeSymbol("NL-REFORMULATE-DAEMON"), SubLObjectFactory.makeSymbol("SC-ACT-NEW-STATE"), SubLObjectFactory.makeSymbol("CLEAR-GET-AFFECTED-PARTS"),
				SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS"), SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-MATCHING-POS-CACHED"), SubLObjectFactory.makeSymbol("SKSI-WARN-ON-ERRORS"), SubLObjectFactory.makeSymbol("KBS-IMAGE-CLEANUP"), SubLObjectFactory.makeSymbol("HL-ACCESS-REMOTE?"), SubLObjectFactory.makeSymbol("ALL-BACKWARD-RULES"),
				SubLObjectFactory.makeSymbol("CLEAR-CACHED-UNION-ALL-SPECS-COUNT"), SubLObjectFactory.makeSymbol("OLD-NART-COUNT"), SubLObjectFactory.makeSymbol("HL-STORE-ERROR-HANDLING-MODE"), SubLObjectFactory.makeSymbol("SCOPE-KBS-SPLICING-ASSERTIONS"), SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("RKF-SC-NEW-LIMITATIONS"),
				SubLObjectFactory.makeSymbol("KEYWORD-VARIABLE-PREFIX-CHAR"), SubLObjectFactory.makeSymbol("INITIALIZE-PLANNER-THREAD"), SubLObjectFactory.makeSymbol("INITIALIZE-AGENT-MANAGER-CONNECTION"), SubLObjectFactory.makeSymbol("TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("ACTIVE-LEXICON-FILTERS"), SubLObjectFactory.makeSymbol("NL-REF-RESET-METRICS"),
				SubLObjectFactory.makeSymbol("CLEAR-PPH-INDEXICAL-DATES"), SubLObjectFactory.makeSymbol("ALL-NEW-NARTS"), SubLObjectFactory.makeSymbol("DO-FORWARD-MODULES-LIST"), SubLObjectFactory.makeSymbol("CB-TD-SEARCH-GUTS"), SubLObjectFactory.makeSymbol("RESET-WFF-VIOLATIONS"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-VAR"),
				SubLObjectFactory.makeSymbol("DECLARE-NL-TRIE-STALENESS-UNACCEPTABLE"), SubLObjectFactory.makeSymbol("NEW-DEDUCTION-CHECKPOINT"), SubLObjectFactory.makeSymbol("INITIALIZE-SPEECH-PART-PREDS"), SubLObjectFactory.makeSymbol("CYC-STANDARD-LISP-SOURCE-DIRECTORY"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-2"), SubLObjectFactory.makeSymbol("INDEXICAL-HYPOTHESIS-MT"),
				SubLObjectFactory.makeSymbol("SERVLET-CONTAINER-PORT"), SubLObjectFactory.makeSymbol("STOP-ALL-FACT-SHEET-SCREENSAVERS"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-ARE-NLTAGS-ALLOWED?"), SubLObjectFactory.makeSymbol("LISP-IMPLEMENTATION-TYPE"), SubLObjectFactory.makeSymbol("ARETE-LAST-NART-TOUCHED"), SubLObjectFactory.makeSymbol("CURRENTLY-EXECUTING-TACTICS"),
				SubLObjectFactory.makeSymbol("RECLASSIFY-HL-STORAGE-MODULES"), SubLObjectFactory.makeSymbol("GET-ALL-SDS"), SubLObjectFactory.makeSymbol("GET-SQS-VERSION"), SubLObjectFactory.makeSymbol("UNSET-QUANT-KB-LOADED"), SubLObjectFactory.makeSymbol("KB-TINY-OR-FULL"), SubLObjectFactory.makeSymbol("ENGLISH-QUANTITY-PARSER"), SubLObjectFactory.makeSymbol("CLEAR-HIGHER-ORDER-COLLECTION?-CACHED"),
				SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-MODULE-COUNT"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-KEY"), SubLObjectFactory.makeSymbol("CB-CLEAR-EL-FORMULAS-CACHE"), SubLObjectFactory.makeSymbol("GENERATE-QUIRK-GUI-EMPTY-ANSWER"), SubLObjectFactory.makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS"), SubLObjectFactory.makeSymbol("NO-WFF-SEMANTICS-OR-ARITY?"),
				SubLObjectFactory.makeSymbol("GET-NEW-PPH-PHRASE-COUNT"), SubLObjectFactory.makeSymbol("TEST-RDF-GRAPH"), SubLObjectFactory.makeSymbol("DEFN-COLLECTION"), SubLObjectFactory.makeSymbol("RED-GET-OBJECT-BARE"), SubLObjectFactory.makeSymbol("CLEAR-PREDICATIVE-ADJP-TEMPLATE-CATEGORY?"), SubLObjectFactory.makeSymbol("RDF-XML-LITERAL-URI"),
				SubLObjectFactory.makeSymbol("INITIALIZE-NEW-CYCL-QUERY-PARAMETER-SET"), SubLObjectFactory.makeSymbol("DEDUCTION-MANAGER-MAINTAIN-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("CANDIDATE-ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-COMPACT-HL-EXTERNAL-ID-STRING"), SubLObjectFactory.makeSymbol("MAYBE-INITIALIZE-PPH-GENERATION-PREDS"),
				SubLObjectFactory.makeSymbol("CYC-TEST-FILE-COUNT"), SubLObjectFactory.makeSymbol("COUNT-NEW-DEDUCTIONS"), SubLObjectFactory.makeSymbol("INITIALIZE-NART-INDEX-HL-STORE-CACHE"), SubLObjectFactory.makeSymbol("OLD-UNREPRESENTED-TERM-COUNT"), SubLObjectFactory.makeSymbol("WIDE-UNREPRESENTED-TERM-COMPLEX-INDEX-HL-STORE-CACHE?"), SubLObjectFactory.makeSymbol("BLUE-FILTER-FNS"),
				SubLObjectFactory.makeSymbol("INITIALIZE-KCT"), SubLObjectFactory.makeSymbol("REBUILD-LEXICON-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-NEGATION-PREDICATE-GRAPH"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-NEW-TERMS-ALLOWED"), SubLObjectFactory.makeSymbol("GET-KB-HEALTH-STATISTIC-COMPONENTS"), SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE-POINTER"),
				SubLObjectFactory.makeSymbol("CHECK-SBHL-CACHES?"), SubLObjectFactory.makeSymbol("GATHER-RELEVANT-MEANING-SENTENCE-QUERY-FORM-MT-MODULE-LIST-TUPLES-FROM-SKSI-SUPPORTED-PREDICATE-CACHE"), SubLObjectFactory.makeSymbol("PERFORM-INDEXING-PRE-DUMP-CLEANUP"), SubLObjectFactory.makeSymbol("PREVIOUS-OWL-EXPORT-VERSION-DATES"), SubLObjectFactory.makeSymbol("GET-KB-HEALTH-STATISTIC-COMPONENTS"),
				SubLObjectFactory.makeSymbol("CLEAR-NART-HL-FORMULA-SWAP-TIME"), SubLObjectFactory.makeSymbol("NOTE-SBHL-CACHES-INITIALIZED"), SubLObjectFactory.makeSymbol("CURRENT-KB-MODIFICATION-EVENT-MAILBOX-SUITE"), SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULE-COUNT"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-PROXY-PORT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-12"),
				SubLObjectFactory.makeSymbol("AGGRESSIVE-FAST-FHT-OPTIMIZATION-MODE?"), SubLObjectFactory.makeSymbol("FORMULA-TEMPLATE-NAMESPACE"), SubLObjectFactory.makeSymbol("HTML-COPYRIGHT-TEXT"), SubLObjectFactory.makeSymbol("CLEAR-CONCEPTS-TO-ADD-FOR-CONCEPT"), SubLObjectFactory.makeSymbol("RKF-TEXT-PROCESSOR-RESET-CACHES"), SubLObjectFactory.makeSymbol("RKF-SD-MAKE-PROBLEM-STORE"),
				SubLObjectFactory.makeSymbol("CB-SHOW-SYSTEM-SETTINGS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-12"), SubLObjectFactory.makeSymbol("STUB-TARGET-ACCESS-PATH"), SubLObjectFactory.makeSymbol("GET-FILE-BACKED-DEDUCTION-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("CB-AVAILABLE-TOOLS"), SubLObjectFactory.makeSymbol("INDEXICAL-HYPOTHESIS-MT"),
				SubLObjectFactory.makeSymbol("ESTIMATED-CONSTANTS-PER-NART"), SubLObjectFactory.makeSymbol("START-SCHEDULED-QUERY-PROCESSING-INTERNAL"), SubLObjectFactory.makeSymbol("CREATE-KQML-READ-TABLE"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-12"), SubLObjectFactory.makeSymbol("XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION"),
				SubLObjectFactory.makeSymbol("INTERRUPT-PROCESS-WITH-ARGS-INTERNAL"), SubLObjectFactory.makeSymbol("FSUT-PRIORITIZER-DEFAULT-NEW-DAYS"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-STRINGS-ITERATOR"), SubLObjectFactory.makeSymbol("READ-TRANSCRIPT-POSITION"), SubLObjectFactory.makeSymbol("CLEAR-CONCEPT-FILTER-CACHES"),
				SubLObjectFactory.makeSymbol("INCREMENT-SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-GET-ALL-SUBEVENTS"), SubLObjectFactory.makeSymbol("CR-NON-PERSON"), SubLObjectFactory.makeSymbol("INCREMENT-TACTIC-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("COMPUTE-SPARQL-ORACLE-QUERY-TIMEOUT"), SubLObjectFactory.makeSymbol("RESTART-ALL-TCP-SERVERS"),
				SubLObjectFactory.makeSymbol("PSP-ALLOWED-GAP-CATEGORY"), SubLObjectFactory.makeSymbol("BASIC-AJAX-SCRIPTS"), SubLObjectFactory.makeSymbol("GET-SBHL-WHAT-MTS-MARKING-SPACE"), SubLObjectFactory.makeSymbol("MISSING-KNOWLEDGE-DISCOVERY-EVENT-BROKER"), SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER"), SubLObjectFactory.makeSymbol("DONT-METER-CONSTANT-INDEX-SWAP-TIME"),
				SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-STORAGE-MODULE"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-OTHER-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-DENOTATIONS-OF-CONSTANT"), SubLObjectFactory.makeSymbol("CLEAR-REMOTE-OPERATIONS-KB-CHECK-POINT"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-BIG-INTEGERS-ITERATOR"),
				SubLObjectFactory.makeSymbol("UNMARK-FORTS-WITHOUT-ASSERTIONS"), SubLObjectFactory.makeSymbol("CLEAR-GET-COOCCURRING-CONDITIONS"), SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("ABORT-CURRENT-CONTROLLING-INFERENCE"), SubLObjectFactory.makeSymbol("NON-FORT-INSTANCE-TABLE"),
				SubLObjectFactory.makeSymbol("INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES"), SubLObjectFactory.makeSymbol("STOP-KB-MODIFICATIONS-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("CLEAR-REDUCE-MT-UNION-HLMT-INT"), SubLObjectFactory.makeSymbol("LAUNCH-SCHEDULED-QUERY-DAEMON"), SubLObjectFactory.makeSymbol("MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT"),
				SubLObjectFactory.makeSymbol("WNI-TOPMOST-UNMAPPED-VERBS-FOR-MATCHING"), SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-CONSTANTS-CATEGORIZED-2"), SubLObjectFactory.makeSymbol("RESET-JAVA-API-KERNEL"), SubLObjectFactory.makeSymbol("KBP-NODE-COUNT"), SubLObjectFactory.makeSymbol("PPH-REGEX-AVAILABLE?"), SubLObjectFactory.makeSymbol("INFERENCE-CURRENT-SENSE"),
				SubLObjectFactory.makeSymbol("DONT-METER-ASSERTION-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("NEXT-RUNSTATE-ID"), SubLObjectFactory.makeSymbol("CLEAR-RELATION-MOST-RESTRICTED-ARG"), SubLObjectFactory.makeSymbol("INITIALIZE-SPEECH-PART-CACHES"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-PORT"), SubLObjectFactory.makeSymbol("GET-JAVA-RED-ROOT-KEY"),
				SubLObjectFactory.makeSymbol("INDEXICAL-FACT-SHEET-TOPIC"), SubLObjectFactory.makeSymbol("BESTDETNBARFN-DEFINITE"), SubLObjectFactory.makeSymbol("ALWAYS-ACTIVE-CB-FORM-CONS-METHODS"), SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("NO-WFF-SEMANTICS-OR-ARITY?"), SubLObjectFactory.makeSymbol("PSP-GAP-ALLOWED?"),
				SubLObjectFactory.makeSymbol("HTML-EOS-OPEN-TAGS"), SubLObjectFactory.makeSymbol("CLEAR-REMOTE-HL-STORE-CONNECTION-POOL"), SubLObjectFactory.makeSymbol("CLEAR-DATE-GENLS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-10"), SubLObjectFactory.makeSymbol("CB-SPECIFIC-REMOVAL-MODULE-PREDICATES"),
				SubLObjectFactory.makeSymbol("TEAR-DOWN-SBHL-GRAPHS-FOR-SBHL-CACHE-TUNING-DATA-GATHERING"), SubLObjectFactory.makeSymbol("TOTAL-MASTER-TRANSCRIPT-OPERATIONS-PROCESSED"), SubLObjectFactory.makeSymbol("CLEAR-POS-ARG-OF-PRED-CACHED"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-13"), SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE"),
				SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-PRENOMINALMODIFIER"), SubLObjectFactory.makeSymbol("NOTE-RBP-RB-INITIALIZED"), SubLObjectFactory.makeSymbol("REMOVE-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("SPEC-INVERSES-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("CLEAR-PPH-DISCOURSE-CONTEXT"),
				SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT"), SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-CONSTANTS-CATEGORIZED"), SubLObjectFactory.makeSymbol("CLEAR-PSP-BINDINGS-FROM-FRAME-INT"), SubLObjectFactory.makeSymbol("CLEAR-STORED-OPERATIONS"), SubLObjectFactory.makeSymbol("CLEAR-QAGA-LINK-RESULT"), SubLObjectFactory.makeSymbol("CB-MYREVIEWER-FILTER"),
				SubLObjectFactory.makeSymbol("RANDOM-PREDICATE"), SubLObjectFactory.makeSymbol("AGENDA-ERROR-MODE"), SubLObjectFactory.makeSymbol("HLMTS-SUPPORTED?"), SubLObjectFactory.makeSymbol("GATHERING-EXPANSION-JUSTIFICATIONS?"), SubLObjectFactory.makeSymbol("STASH-KB-OBJECT-CONTENT-VARS"), SubLObjectFactory.makeSymbol("INDEXICAL-TOMORROW"),
				SubLObjectFactory.makeSymbol("KEYWORD-VARIABLE-PREFIX-CHAR"), SubLObjectFactory.makeSymbol("MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES"), SubLObjectFactory.makeSymbol("HANDLING-PPH-METHOD-FAILURES-TOP-LEVEL-P"), SubLObjectFactory.makeSymbol("WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?"), SubLObjectFactory.makeSymbol("PPH-PHRASE-DEFAULT-VERB-PRED"),
				SubLObjectFactory.makeSymbol("PLANNER-KB-LOADED-P"), SubLObjectFactory.makeSymbol("MAKE-EMPTY-SET-SUPPORT"), SubLObjectFactory.makeSymbol("PSP-CHART-MAX-SPAN"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("SET-CYC-SECURE-KB-LOADED"), SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-CLOSED-CLASS-POS-PREDS"),
				SubLObjectFactory.makeSymbol("FINALIZE-HAYSTACK-CORPUS"), SubLObjectFactory.makeSymbol("STASH-KB-INDEXING-VARS"), SubLObjectFactory.makeSymbol("RKF-SD-FIND-OR-MAKE-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("CLEAR-PPH-VAR-TYPING-PREDICATES"), SubLObjectFactory.makeSymbol("CYC-HPSG-FEATURE"), SubLObjectFactory.makeSymbol("MAPPING-ANSWER-FOUND?"),
				SubLObjectFactory.makeSymbol("SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR?"), SubLObjectFactory.makeSymbol("DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE"), SubLObjectFactory.makeSymbol("CACHED-NART-INDEX-COUNT"), SubLObjectFactory.makeSymbol("TVA-VAR-ARGNUMS"), SubLObjectFactory.makeSymbol("NEW-RKF-SD-RULE-INFO-SCORE"), SubLObjectFactory.makeSymbol("CLEAR-INTERPRETATION-RULES"),
				SubLObjectFactory.makeSymbol("WRITING-TRANSCRIPTS?"), SubLObjectFactory.makeSymbol("CB-ALL-GENERIC-PREFERENCE-MODULES"), SubLObjectFactory.makeSymbol("PARSING-TIMEOUT-CURRENT-TIME"), SubLObjectFactory.makeSymbol("TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-MATCHING-POS-CACHED"),
				SubLObjectFactory.makeSymbol("ENSURE-REFORMULATOR-INITIALIZED"), SubLObjectFactory.makeSymbol("PROCESS-QL-INDEX-QUEUE-ENTRIES"), SubLObjectFactory.makeSymbol("CLEAR-GET-TREATMENTS-FOR-CONDITION"), SubLObjectFactory.makeSymbol("STOP-ALL-FSUT-PRIORITIZERS"), SubLObjectFactory.makeSymbol("FIND-ASSERTION-WITH-KB-HL-SUPPORT-DEDUCTION-DEPENDENT"),
				SubLObjectFactory.makeSymbol("POPULATE-SCHEDULED-QUERY-QUEUE"), SubLObjectFactory.makeSymbol("ALWAYS-ACTIVE-CB-FORM-CONS-METHODS"), SubLObjectFactory.makeSymbol("CLEAR-PREDICATE-GRAPH"), SubLObjectFactory.makeSymbol("REBUILD-RULE-AFTER-ADDING-CACHES"), SubLObjectFactory.makeSymbol("REMOVE-SCOPED-PARTITION"), SubLObjectFactory.makeSymbol("CLEAR-RTP-VBAR-TEMPLATE-CATEGORY?"),
				SubLObjectFactory.makeSymbol("GET-ENGLISH-GENERATION-FORT-CACHE"), SubLObjectFactory.makeSymbol("LAUNCH-LONG-INFERENCE-WARNER"), SubLObjectFactory.makeSymbol("CONTENT-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PPH-TRACKING-VAR-TYPES-P"), SubLObjectFactory.makeSymbol("NEXT-UNREPRESENTED-TERM-SUID"), SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT"),
				SubLObjectFactory.makeSymbol("LOCAL-OPERATIONS-ANYWHERE"), SubLObjectFactory.makeSymbol("FACT-SHEET-PARAPHRASE-SOFT-TIMEOUT-TIME-REACHED?"), SubLObjectFactory.makeSymbol("SPECIFIC-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("CLEAR-WFF-CONSTRAINT-DEPENDENT-CACHES-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-GET-ILP-EXPORT-OUTPUT-MODES-FOR-ARG-POSITION"),
				SubLObjectFactory.makeSymbol("REBUILD-KB-INDEXING"), SubLObjectFactory.makeSymbol("L2R-SUPERTEXT-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSET-TERM-HELPER"), SubLObjectFactory.makeSymbol("COMPUTE-CORE-FORTS"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-CURRENT-SYSTEM-NUMBER"), SubLObjectFactory.makeSymbol("KBS-DEFINITION-VALID?"),
				SubLObjectFactory.makeSymbol("TRANSLATION-COPYRIGHT-STRING"), SubLObjectFactory.makeSymbol("CLEAR-CURRENT-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("DEPRECATE-OLD-SOURCE-CITATION-FORMAT?"), SubLObjectFactory.makeSymbol("RKF-GENERATE-EXAMPLES?"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-9"), SubLObjectFactory.makeSymbol("LIST-ALL-PACKAGES"),
				SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-14"), SubLObjectFactory.makeSymbol("CALL-FORWARD-INFERENCE-BROWSING-CALLBACK?"), SubLObjectFactory.makeSymbol("REINDEX-ALL-ASSERTIONS"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PROBLEM-STORE-POINTER"), SubLObjectFactory.makeSymbol("CYC-QA-FEATURE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-12"),
				SubLObjectFactory.makeSymbol("ALL-CORE-CONSTANTS"), SubLObjectFactory.makeSymbol("CLEAR-MWP-BASE-POSES-FOR-REIFIED-AFFIX"), SubLObjectFactory.makeSymbol("QC-NEW-QUERY"), SubLObjectFactory.makeSymbol("CREATE-ASSERTION-DUMP-ID-TABLE"), SubLObjectFactory.makeSymbol("NEW-TACTICLESS-STRATEGY"), SubLObjectFactory.makeSymbol("SKSI-BATCH-TRANSLATE-COERCE-TYPES?"),
				SubLObjectFactory.makeSymbol("CLEAR-WORD-GRAPH-LINKS"), SubLObjectFactory.makeSymbol("NEW-CACHE-METRICS"), SubLObjectFactory.makeSymbol("FORGET-INVALID-DEDUCTIONS"), SubLObjectFactory.makeSymbol("COUNT-NEW-DEDUCTIONS"), SubLObjectFactory.makeSymbol("FORWARD-MODULES"), SubLObjectFactory.makeSymbol("ENSURE-LINK-SERVER-RUNNING"),
				SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-MTS-CONSIDERED-WITH-NO-SUCCESS"), SubLObjectFactory.makeSymbol("CB-SHOW-MISSING-BINDING-VALUE-HORIZONTAL"), SubLObjectFactory.makeSymbol("DESTROY-ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("CLEAN-KB-INDEXING"), SubLObjectFactory.makeSymbol("PSP-AGENT"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM-QUERY"),
				SubLObjectFactory.makeSymbol("CLEAR-SKOS-NAME"), SubLObjectFactory.makeSymbol("CLEAR-NER-CLUSTERS"), SubLObjectFactory.makeSymbol("CLEAR-MONAD-MT-NAUT-CACHE"), SubLObjectFactory.makeSymbol("DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN"), SubLObjectFactory.makeSymbol("MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"),
				SubLObjectFactory.makeSymbol("STITCH-TOGETHER-NL-GENERATION-CACHE-TIME-PLOTS"), SubLObjectFactory.makeSymbol("SBHL-CACHE-TUNING-DATA-GATHERING-EPILOGUE"), SubLObjectFactory.makeSymbol("NEW-BOOKKEEPING-INTERMEDIATE-INDEX"), SubLObjectFactory.makeSymbol("NART-COUNT"), SubLObjectFactory.makeSymbol("QC-NEW-QUERY"), SubLObjectFactory.makeSymbol("LOCAL-HL-TRANSCRIPT-VERSION"),
				SubLObjectFactory.makeSymbol("GET-SANITY-CHECKER"), SubLObjectFactory.makeSymbol("BIO-FILTER-COLL"), SubLObjectFactory.makeSymbol("WIDE-CONSTANT-COMPLEX-INDEX-HL-STORE-CACHE?"), SubLObjectFactory.makeSymbol("SBHL-SEARCH-TRUE-TV"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("THROW-UNEVALUATABLE"),
				SubLObjectFactory.makeSymbol("ACTIVE-GUARDIAN-REQUESTS"), SubLObjectFactory.makeSymbol("INDEXICAL-FACT-SHEET-TABLE-TYPE"), SubLObjectFactory.makeSymbol("CLEAR-FORT-PASSES-CACHED-THCL-TESTS?"), SubLObjectFactory.makeSymbol("RC-ACT-NEW-STATE"), SubLObjectFactory.makeSymbol("MERGE-FORT-ASSERTION-MAP-VALID?"), SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"),
				SubLObjectFactory.makeSymbol("METER-NART-HL-FORMULA-SWAP-TIME"), SubLObjectFactory.makeSymbol("UNSET-LEXICON-KB-LOADED"), SubLObjectFactory.makeSymbol("CLEAR-TEMPLATE-RULES-MASTER-INDEX"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-CURRENT-HOST-NAME"), SubLObjectFactory.makeSymbol("LEVIATHAN-ALLOWED-RULES"), SubLObjectFactory.makeSymbol("GET-SBHL-GOAL-NODES"),
				SubLObjectFactory.makeSymbol("HTTP-STATE-KEY-FOR-REQUEST"), SubLObjectFactory.makeSymbol("REMOVE-INVALID-PPH-PHRASES"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-MEMORY-MAPPED?"), SubLObjectFactory.makeSymbol("FORT-REFORMULATOR-RULE-TABLE"), SubLObjectFactory.makeSymbol("CLEAR-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE-STORE"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-11"),
				SubLObjectFactory.makeSymbol("AT-SOME-ARG-ISA-REQUIRED?"), SubLObjectFactory.makeSymbol("CLEAR-MAL-ACTUAL-ARITY-CACHED?"), SubLObjectFactory.makeSymbol("HTML-COMPLETE-SCRIPT"), SubLObjectFactory.makeSymbol("XML-TERPRI"), SubLObjectFactory.makeSymbol("CURRENT-PARITER-WIDTH"), SubLObjectFactory.makeSymbol("WITHIN-CONJUNCTION?"), SubLObjectFactory.makeSymbol("INFERENCE-CURRENT-SENSE"),
				SubLObjectFactory.makeSymbol("SYNCHRONIZE-CONSTANTS-WITH-HL-STORE"), SubLObjectFactory.makeSymbol("NEW-UIMA"), SubLObjectFactory.makeSymbol("CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES"), SubLObjectFactory.makeSymbol("INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE"), SubLObjectFactory.makeSymbol("SF-NEXT-ID"), SubLObjectFactory.makeSymbol("*TEMPORALLY-SUBSUMES-TYPETYPE-REFLEXIVE-RULE*-INITIALIZER"),
				SubLObjectFactory.makeSymbol("CLEAR-FULLY-CONNECTED-GRAPH-LINKS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-9"), SubLObjectFactory.makeSymbol("DONT-METER-UNREPRESENTED-TERM-INDEX-SWAP-TIME"), SubLObjectFactory.makeSymbol("UNSET-FRACTION-KB-LOADED"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-13"),
				SubLObjectFactory.makeSymbol("TERRORIST-ATTACK-LEXIFICATION-KBQ"), SubLObjectFactory.makeSymbol("ALEPH-EXPORT-MODE-INFORMATION?"), SubLObjectFactory.makeSymbol("NEW-FORMULA-TEMPLATE-EDITING-STATE"), SubLObjectFactory.makeSymbol("MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("LEVIATHAN-KB-CONTENT-ALLOWED-RULES"), SubLObjectFactory.makeSymbol("YESTERDAY"),
				SubLObjectFactory.makeSymbol("STASH-KB-OBJECT-CONTENT-VARS"), SubLObjectFactory.makeSymbol("CYC-QA-FEATURE"), SubLObjectFactory.makeSymbol("NEW-CONSTANT-COUNT"), SubLObjectFactory.makeSymbol("PPH-UNKNOWN-ARG-POSITION"), SubLObjectFactory.makeSymbol("MAKE-RELATION-INSTANCE-EXISTS-SUPPORT"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-METRICS-TIME-INDEX"),
				SubLObjectFactory.makeSymbol("GET-SBHL-GOAL-TABLE"), SubLObjectFactory.makeSymbol("REMOTE-QUEUE-SIZE"), SubLObjectFactory.makeSymbol("GET-TEMP-DIRECTORY"), SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-RULE"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-NAME-STRING-PREDS"), SubLObjectFactory.makeSymbol("PROCESS-COUNT"),
				SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD"), SubLObjectFactory.makeSymbol("SBHL-CONTINUE-SEARCH-PATH"), SubLObjectFactory.makeSymbol("INITIALIZE-PPH-SUBJECT-ROLE-PREDS"), SubLObjectFactory.makeSymbol("KBS-KILL-UNRUNNABLE-KB-QUERIES"), SubLObjectFactory.makeSymbol("CLEAR-NART-HL-FORMULA-TABLE"),
				SubLObjectFactory.makeSymbol("TEST-EMIT-CYCML-ASSERTIONS"), SubLObjectFactory.makeSymbol("CLEAR-CORE-MT-DEFINITIONAL-INFO"), SubLObjectFactory.makeSymbol("CLEAR-PSP-REWRITE"), SubLObjectFactory.makeSymbol("GET-SBHL-COMPOSE-FN"), SubLObjectFactory.makeSymbol("EPHEMERAL-TERM-COUNT"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-COUNTYWITHSTATEORPROVINCEABBREVIATION"),
				SubLObjectFactory.makeSymbol("EXPANSION-JUSTIFICATION"), SubLObjectFactory.makeSymbol("PPH-SEARCH-LIMIT"), SubLObjectFactory.makeSymbol("SBHL-PRIMARY-WHAT-MTS-SPACES"), SubLObjectFactory.makeSymbol("SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE"), SubLObjectFactory.makeSymbol("RESET-OLD-DEFNS-ADMIT?-METERS"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN?"),
				SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-TRANSITIVITY-CHECK"), SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-DESTROYER"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-DYNAMIC-PROPERTIES"), SubLObjectFactory.makeSymbol("CB-AVAILABLE-TOOLS"), SubLObjectFactory.makeSymbol("ARETE-LAST-CONSTANT-TOUCHED"), SubLObjectFactory.makeSymbol("L2R-SUPERTEXT-INDEXICAL"),
				SubLObjectFactory.makeSymbol("MAX-GEN-TEMPLATE-PHRASE-ID-INTERNAL"), SubLObjectFactory.makeSymbol("HTML-QUIT"), SubLObjectFactory.makeSymbol("TVA-RETURN-ONE-ANSWER?"), SubLObjectFactory.makeSymbol("GET-SBHL-MODULE-PROPERTIES"), SubLObjectFactory.makeSymbol("CLEAR-ALL-TRANSFORMATION-RULE-STATISTICS"), SubLObjectFactory.makeSymbol("CLEAR-GET-TREATED-CONDITION"),
				SubLObjectFactory.makeSymbol("FIND-ALL-AURA-CONCEPTS"), SubLObjectFactory.makeSymbol("CLEAR-MWP-BASE-PRED-OF-POS"), SubLObjectFactory.makeSymbol("LEVIATHAN-HAYSTACK-ALL-ALLOWED-RULES"), SubLObjectFactory.makeSymbol("SBHL-GOAL-SEARCH-P"), SubLObjectFactory.makeSymbol("ENSURE-SPEECH-PARTS-INITIALIZED"), SubLObjectFactory.makeSymbol("COLLECTION-INTERSECTION-GENLS-RULE-SUPPORT"),
				SubLObjectFactory.makeSymbol("ENSURE-REFORMULATOR-INITIALIZED"), SubLObjectFactory.makeSymbol("RC-NEW-RHS"), SubLObjectFactory.makeSymbol("SBHL-CURRENT-TEMPORAL-NODE-NOT-YET-CONSIDERED-P"), SubLObjectFactory.makeSymbol("API-OUTPUT-PROTOCOL"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-PP"), SubLObjectFactory.makeSymbol("CYCLIFY-TEST"),
				SubLObjectFactory.makeSymbol("BESTVERBFORMFORSUBJECTFN"), SubLObjectFactory.makeSymbol("GC-EPHEMERAL"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-8"), SubLObjectFactory.makeSymbol("SET-WORDNET-KB-LOADED"), SubLObjectFactory.makeSymbol("NO-CYC-TESTS-DEFINED?"), SubLObjectFactory.makeSymbol("CLEAR-ISA-DEPENDENT-CACHES-INTERNAL"),
				SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-STALE-PAGE-SUBMITTED"), SubLObjectFactory.makeSymbol("CLEAR-RULE-AFTER-ADDINGS"), SubLObjectFactory.makeSymbol("TMS-CAN-KILL-FORTS-FOR-ME?"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-FACT-STATUS-INT"), SubLObjectFactory.makeSymbol("ALL-CORE-UNION-CONSTANTS"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED"), SubLObjectFactory.makeSymbol("XML-TEMPLATE-TOPIC-ASSERTIONS-CURRENT-REVISION"), SubLObjectFactory.makeSymbol("SET-DEFAULT-HB-ICON"), SubLObjectFactory.makeSymbol("KBS-CLEAR-EXTENT"), SubLObjectFactory.makeSymbol("CLEAR-FORWARD-INFERENCE-METRICS"), SubLObjectFactory.makeSymbol("WITHIN-QUERY?"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("UNINITIALIZED"), SubLObjectFactory.makeSymbol("RESTART-CONSOLE-TASK-PROCESSORS"), SubLObjectFactory.makeSymbol("GET-BUG-AVOIDANCE-PRINCIPLES"), SubLObjectFactory.makeSymbol("STOP-FACT-SHEET-UPDATES-AFTER-CURRENT-TERM"), SubLObjectFactory.makeSymbol("ANY-RECENT-ASKED-QUERIES?"),
				SubLObjectFactory.makeSymbol("CLEAR-PPH-PHRASE-ID-DEMERITS"), SubLObjectFactory.makeSymbol("ADDITIONAL-NAT-FUNCTION-SUPPORTS"), SubLObjectFactory.makeSymbol("PROVIDE-WFF-SUGGESTIONS?"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-SYSTEMS"), SubLObjectFactory.makeSymbol("FACT-SHEET-BASE-URL-PLACEHOLDER"), SubLObjectFactory.makeSymbol("AMP-DEMO"),
				SubLObjectFactory.makeSymbol("KBQ-DEFAULT-DEFINING-MT"), SubLObjectFactory.makeSymbol("SERIALIZE-SHARED-STRUCTURE-INDEX"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-INITIALIZER-METHODS"), SubLObjectFactory.makeSymbol("INITIALIZE-MIN-ARITIES"), SubLObjectFactory.makeSymbol("RKF-IRRELEVANT-CACHE-SUPPORTS-THCL?"), SubLObjectFactory.makeSymbol("MOST-RECENT-FAILING-CYC-TESTS"),
				SubLObjectFactory.makeSymbol("BOGUSLY-LEXIFIED-TERMS"), SubLObjectFactory.makeSymbol("NEW-GUID"), SubLObjectFactory.makeSymbol("KB-INDEXING-DECLARATION-STORE"), SubLObjectFactory.makeSymbol("INITIALIZE-C-BACKEND-FUNCTION-BOOLEAN-HASH"), SubLObjectFactory.makeSymbol("AUTO-INCREMENT-KB"), SubLObjectFactory.makeSymbol("RUN-SCHEDULED-QUERIES"),
				SubLObjectFactory.makeSymbol("CLEAR-STRATEGIC-USELESSNESS-BASED-ON-PROOF-DEPTH-MATH-MEMOIZED"), SubLObjectFactory.makeSymbol("ALL-PREDS-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-PRESENT-P"), SubLObjectFactory.makeSymbol("DEFN-COLLECTION"), SubLObjectFactory.makeSymbol("REMOVE-LEADERS-TO-GROUPS"), SubLObjectFactory.makeSymbol("MAKE-STATIC-CLAUSE-STRUC"),
				SubLObjectFactory.makeSymbol("INITIALIZE-ALL-ARG-TYPE-PREDICATE-CACHES"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE"), SubLObjectFactory.makeSymbol("INITIALIZE-LEXICON-LOOKUP-MT"), SubLObjectFactory.makeSymbol("ASSUME-FREE-VARS-ARE-EXISTENTIALLY-BOUND?"), SubLObjectFactory.makeSymbol("BESTPARENTHETICALPHRASEFN"),
				SubLObjectFactory.makeSymbol("INITIALIZE-COLLECTION-LOCAL-QUOTED-INSTANCE-CARDINALITIES"), SubLObjectFactory.makeSymbol("CLEAR-PSP-PHRASE-TYPES"), SubLObjectFactory.makeSymbol("MAKE-MULTIBINDING"), SubLObjectFactory.makeSymbol("CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS"),
				SubLObjectFactory.makeSymbol("HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT"), SubLObjectFactory.makeSymbol("CLEAR-WNI-DERIVED-FORMS-HELPER"), SubLObjectFactory.makeSymbol("NEW-CONSTANT-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-MAX-PRODUCTIVITY"), SubLObjectFactory.makeSymbol("GET-SBHL-LINK-MT"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-SUBPROTOCOL"),
				SubLObjectFactory.makeSymbol("CYC-ANNOTATION-BASE-URI"), SubLObjectFactory.makeSymbol("ROLL-LOCAL-TRANSCRIPT"), SubLObjectFactory.makeSymbol("CURRENT-COMPLEX-INDEX-TERM"), SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-REUSE-HISTORICAL-RATIO"), SubLObjectFactory.makeSymbol("SCOPE-KBS-SPLICING-ASSERTIONS"), SubLObjectFactory.makeSymbol("SXSW-ALL-BANDS-REQUEST"),
				SubLObjectFactory.makeSymbol("MACHINE-BOGOMIPS"), SubLObjectFactory.makeSymbol("NOTE-MWP-NEEDS-REINITIALIZATION"), SubLObjectFactory.makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED"), SubLObjectFactory.makeSymbol("COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT-INTERNAL"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE"),
				SubLObjectFactory.makeSymbol("CB-USE-ASSERTION-END-DATE-FILTER"), SubLObjectFactory.makeSymbol("CLEAR-GENLS-GRAPH"), SubLObjectFactory.makeSymbol("CNC-POPCORN-MINIMUM"), SubLObjectFactory.makeSymbol("PPH-GENERIC-POS-PREDS"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-NUMBER-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("SYSTEM-CODE-LISP-INITIALIZATIONS"),
				SubLObjectFactory.makeSymbol("VALID-SBHL-P"), SubLObjectFactory.makeSymbol("CREATE-CLAUSE-STRUC-DUMP-ID-TABLE"), SubLObjectFactory.makeSymbol("NEXT-SCHEDULED-QUERY"), SubLObjectFactory.makeSymbol("RUN-SCHEDULED-QUERIES-ON-THIS-IMAGE?"), SubLObjectFactory.makeSymbol("PROCESS-TMS-KB-HL-SUPPORT-QUEUE"), SubLObjectFactory.makeSymbol("NEXT-LEXICON-ENTRY"),
				SubLObjectFactory.makeSymbol("READ-TRANSCRIPT"), SubLObjectFactory.makeSymbol("STASH-INFERENCE-VARS"), SubLObjectFactory.makeSymbol("CLEAR-QUA-ALL-PHRASES-FOR-TERM"), SubLObjectFactory.makeSymbol("FIX-BAD-NARTS"), SubLObjectFactory.makeSymbol("INITIALIZE-REFORMULATOR"), SubLObjectFactory.makeSymbol("TENSEDPHRASEFN-DEFAULTPAST"), SubLObjectFactory.makeSymbol("PROCESS-LOCAL-OPERATIONS?"),
				SubLObjectFactory.makeSymbol("HTML-DISPLAY-NODE-RENDERING-COLORMAP"), SubLObjectFactory.makeSymbol("CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED"), SubLObjectFactory.makeSymbol("NEXT-SCHEDULED-QUERY"), SubLObjectFactory.makeSymbol("WITHIN-ABNORMALITY-CHECKING?"), SubLObjectFactory.makeSymbol("NL-REFORMULATE-DAEMON-RUN"), SubLObjectFactory.makeSymbol("INIT-STARTS-DURING"),
				SubLObjectFactory.makeSymbol("END-TASK-PROCESSOR-LOGGING-TO-FILE"), SubLObjectFactory.makeSymbol("INVALID-EVALUATION"), SubLObjectFactory.makeSymbol("REBUILD-PPH-PHRASES"), SubLObjectFactory.makeSymbol("CLEAR-PPH-JAVALIST-SORT-XYZ-PARAPHRASES"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-ROOT-FOLDER"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-5"),
				SubLObjectFactory.makeSymbol("VALID-HASH-TEST-SYMBOLS"), SubLObjectFactory.makeSymbol("CLEAR-MAX-PREDS-OF-POS"), SubLObjectFactory.makeSymbol("SETUP-VARIABLE-TABLE"), SubLObjectFactory.makeSymbol("INITIALIZE-ASSERTION-HL-STORE-CACHE"), SubLObjectFactory.makeSymbol("THIS-YEAR"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-REVISIONS-STALE?-INTERNAL"),
				SubLObjectFactory.makeSymbol("CLEAR-QUERY-SEARCH-TABLE-PREDS"), SubLObjectFactory.makeSymbol("GENL-MTS-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("LOADED-RDF-GRAPHS"), SubLObjectFactory.makeSymbol("TVA-COMPUTE-JUSTIFICATIONS?"), SubLObjectFactory.makeSymbol("DEFAULT-LINKAGE-CREATION-RULES"), SubLObjectFactory.makeSymbol("FINALIZE-CAE-QUERY-TRANSLATION"),
				SubLObjectFactory.makeSymbol("REMOVAL-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("SET-PARAPHRASE-KB-LOADED"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-COMPUTE-PACKAGE-PREFIX"), SubLObjectFactory.makeSymbol("PSP-AGENT"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-FULL-SPANS-ONLY?"), SubLObjectFactory.makeSymbol("INITIALIZE-NAME-TITLES"),
				SubLObjectFactory.makeSymbol("INIT-TEMPORALLY-STARTED-BY"), SubLObjectFactory.makeSymbol("GET-NART"), SubLObjectFactory.makeSymbol("LEVIATHAN-KB-CONTENT-ALLOWED-RULES"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-13"), SubLObjectFactory.makeSymbol("CLEAR-CAE-QUERY-SEARCH-FILTER-STRING"), SubLObjectFactory.makeSymbol("GET-WS-INDEX-PORT"),
				SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING&POS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-MAX-FLOOR-MTS-OF-NAT"), SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-META-DAEMON-RUN"), SubLObjectFactory.makeSymbol("GENERIC-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("ARETE-DISABLE-GLOBAL-LOGGING"),
				SubLObjectFactory.makeSymbol("SBHL-VERIFY-NAUT-MT-RELEVANCE-P"), SubLObjectFactory.makeSymbol("VALID-CFASL-RELOC-SIDE-STREAM-P"), SubLObjectFactory.makeSymbol("INITIALIZE-KB-CONTENT-LEVIATHAN-QUERIES"), SubLObjectFactory.makeSymbol("KBS-SKOLEMS"), SubLObjectFactory.makeSymbol("MODERNIZE-SKOLEM-AXIOM-TABLE"), SubLObjectFactory.makeSymbol("NEW-INVALID-DEDUCTION-ITERATOR"),
				SubLObjectFactory.makeSymbol("PREPARE-PROOF-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("REMOVE-ASSERTIVE-WFF-RULES-CACHED"), SubLObjectFactory.makeSymbol("GET-ALL-MT-VECTORS"), SubLObjectFactory.makeSymbol("REMOVE-GET-SBHL-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-GENERATION-CACHES"),
				SubLObjectFactory.makeSymbol("CURRENT-QUERY-ALLOWS-NEW-TERMS?"), SubLObjectFactory.makeSymbol("GET-TASK-PROCESSOR-VERBOSITY"), SubLObjectFactory.makeSymbol("GET-KBS-PRERUN-FNS"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-TYPE-PROMPT"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-CONTEXT"), SubLObjectFactory.makeSymbol("COMPILE-DEFAULT-XSD-ATTRIBUTE-LIST"),
				SubLObjectFactory.makeSymbol("BLAST-KE-STATE"), SubLObjectFactory.makeSymbol("CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-PPH-INDEXICAL-DATES"), SubLObjectFactory.makeSymbol("INIT-ENDS-AFTER-ENDING-OF"), SubLObjectFactory.makeSymbol("CB-TOTAL-SPECIFIC-REMOVAL-MODULE-COUNT"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-GUTS"),
				SubLObjectFactory.makeSymbol("CYC-SECURE-KB-LOADED-P"), SubLObjectFactory.makeSymbol("INITIALIZE-C-BACKEND-FUNCTION-NAME-TABLE"), SubLObjectFactory.makeSymbol("CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES"), SubLObjectFactory.makeSymbol("INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-OTHER-PREDICATES"),
				SubLObjectFactory.makeSymbol("PPH-DETP-NART-CACHED-INTERNAL"), SubLObjectFactory.makeSymbol("ILP-TERM-EXPORT-NEGATIVE-EXAMPLES?"), SubLObjectFactory.makeSymbol("PERFORM-KB-CLEANUPS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-8"), SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("LEXICON-INITIALIZED-P"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-RESULTS-FROM-SKSI-WEB-PAGE-SUBL-METHOD-CACHED"), SubLObjectFactory.makeSymbol("INITIALIZE-HALO-LEVIATHAN-QUERIES"), SubLObjectFactory.makeSymbol("GET-RED-APPLICATION-ELEMENTS"), SubLObjectFactory.makeSymbol("NCP-INITIALIZE-METRICS"), SubLObjectFactory.makeSymbol("GENERIC-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("COLLECTION-CREATION-TEMPLATE"),
				SubLObjectFactory.makeSymbol("COUNTRIES-TO-REGIONS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("GET-FILE-BACKED-NART-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-SHOW-PRAGMATICS"), SubLObjectFactory.makeSymbol("CLEAR-HTML-PROBLEM-LAYOUT-VISUALIZATION-FOR-MONITOR-TABLE-STYLE"),
				SubLObjectFactory.makeSymbol("CLEAR-ICON-RELATIVE-PATH-FOR-SOURCE"), SubLObjectFactory.makeSymbol("START-BLUE-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("SAVE-LOCAL-OPERATIONS"), SubLObjectFactory.makeSymbol("GET-KB-UNREPRESENTED-TERM-OLD-SPACE-SIZE"), SubLObjectFactory.makeSymbol("RED-STRUCT-CREATE"), SubLObjectFactory.makeSymbol("CLEAR-SOAP-EXPANDED-NAME"),
				SubLObjectFactory.makeSymbol("REMOVE-FACT-SHEET-IMAGE-FILE-ROOT-URL"), SubLObjectFactory.makeSymbol("CLEAR-QUOTED-FORMULA-ARG-INT?"), SubLObjectFactory.makeSymbol("RL-MODULE-STORE"), SubLObjectFactory.makeSymbol("ARGHASH-TYPES"), SubLObjectFactory.makeSymbol("CLEAR-GUESS-THE-CYCLIST-FROM-USER-NAME"), SubLObjectFactory.makeSymbol("SBHL-SUSPEND-NEW-SPACES?"),
				SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE-ID"), SubLObjectFactory.makeSymbol("CLEAR-KEY-GAF-ARG-INDEX-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-RKF-PREPOSITION-STRING?"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-5"), SubLObjectFactory.makeSymbol("RECEIVING?"), SubLObjectFactory.makeSymbol("RELATION-ALL-COLLECTION-COST-ESTIMATE"),
				SubLObjectFactory.makeSymbol("SIMPLIFY-TRANSITIVE-REDUNDANCIES?"), SubLObjectFactory.makeSymbol("RANDOM-VARIABLE"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-GET-RESULT-SET-FROM-SQL-SOURCE"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-LENGTH-SANE?"), SubLObjectFactory.makeSymbol("WITH-TIMEOUT-MAKE-TAG"), SubLObjectFactory.makeSymbol("CYC-TEST-WRITE-IMAGE-DIRECTORY"),
				SubLObjectFactory.makeSymbol("PARTITION-FORTS"), SubLObjectFactory.makeSymbol("PROCESS-BLOCK"), SubLObjectFactory.makeSymbol("L2R-SUPERTEXT-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("ILP-TERM-EXPORT-SYNTHETIC-NEGATIVE-EXAMPLES?"), SubLObjectFactory.makeSymbol("SM-NEW-MERGE-INFO"), SubLObjectFactory.makeSymbol("DEFAULT-PREFERENCE-FILE-EXISTS?"),
				SubLObjectFactory.makeSymbol("NART-HL-FORMULA-COMPLETELY-CACHED?"), SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-GET-STARTING-ENTRY-SPECIFICATION"), SubLObjectFactory.makeSymbol("OWL-MERGE-MT"), SubLObjectFactory.makeSymbol("GOOGLE-STATUS"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-FULL-SPANS-ONLY?"), SubLObjectFactory.makeSymbol("TEMP-DIRECTORY"),
				SubLObjectFactory.makeSymbol("DERIVED-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-COMPACT-HL-EXTERNAL-ID-STRINGS-WITH-EXPORTED-OWL-OPENCYC-CONTENT"), SubLObjectFactory.makeSymbol("LOAD-REMOTE-OPERATIONS"), SubLObjectFactory.makeSymbol("PREPARE-KB-MINI-DUMP"), SubLObjectFactory.makeSymbol("CYCL-PATCH-NUMBER"), SubLObjectFactory.makeSymbol("CONDITIONALPHRASEFN"),
				SubLObjectFactory.makeSymbol("HTML-INPUT-CHECKED"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-PROXY-SERVER"), SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-CONTENT-INDEX-MEMORY-MAPPED?"), SubLObjectFactory.makeSymbol("CB-ALL-FORWARD-MODULES"), SubLObjectFactory.makeSymbol("CB-KCT-STATUS-TABLE-HEADER"), SubLObjectFactory.makeSymbol("RKF-ADDRESSEE"),
				SubLObjectFactory.makeSymbol("CB-JAVA-APPLET-TUNNEL-CREATE-LOGIN"), SubLObjectFactory.makeSymbol("REMOVE-FACT-SHEET-DEFAULT-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-12"), SubLObjectFactory.makeSymbol("WITHIN-QUERY?"), SubLObjectFactory.makeSymbol("CLEAR-INDIVIDUAL?-CACHED"), SubLObjectFactory.makeSymbol("NON-WFF-COUNT"),
				SubLObjectFactory.makeSymbol("CLEAR-FOAF-NAME"), SubLObjectFactory.makeSymbol("RESTART-ALL-TCP-SERVERS"), SubLObjectFactory.makeSymbol("CLEAR-BAD-FOR-TAGGING?"), SubLObjectFactory.makeSymbol("FET-EMPTY-SOURCE-DICTIONARY"), SubLObjectFactory.makeSymbol("GRAMMAR-PERMISSIVE-WRT-VARIABLES?"), SubLObjectFactory.makeSymbol("REMOVE-NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS"),
				SubLObjectFactory.makeSymbol("GET-SBHL-JUST-BEHAVIOR"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-WARN-OF-EXTRA-MT"), SubLObjectFactory.makeSymbol("BYTE-ORDER-MARK"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-5"), SubLObjectFactory.makeSymbol("SKSI-BREAK-ON-ERRORS"), SubLObjectFactory.makeSymbol("REBUILD-ASSERTION-INDEXING-FOR-RECONNECT"),
				SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-MT-BROWSING-REGISTERED?"), SubLObjectFactory.makeSymbol("BESTSYMBOLPHRASEFN"), SubLObjectFactory.makeSymbol("COUNT-NEW-ASSERTIONS"), SubLObjectFactory.makeSymbol("CLEAR-NAMED-ENTITY?"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-PROXY-SERVER"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS"),
				SubLObjectFactory.makeSymbol("CLEAR-ANY-DISJOINT-WITH-ANY?-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-DET-DENOT-IS-SCALAR-INTERVAL?-CACHED"), SubLObjectFactory.makeSymbol("INITIALIZE-KB-FEATURES"), SubLObjectFactory.makeSymbol("INITIALIZE-KBS-DEFINITIONAL-RULE-TABLE"), SubLObjectFactory.makeSymbol("CURRENT-SYSTEM-TRANSLATION"), SubLObjectFactory.makeSymbol("RESET-ARC-LEXICON-SLURPER"),
				SubLObjectFactory.makeSymbol("CT-CR-SETUP"), SubLObjectFactory.makeSymbol("LEXICON-KB-LOADED-P"), SubLObjectFactory.makeSymbol("MAKE-EMPTY-UI-REQUEST"), SubLObjectFactory.makeSymbol("CLEAR-NART-TABLE"), SubLObjectFactory.makeSymbol("NEW-RKF-SD-RULE-INFO-SCORE"), SubLObjectFactory.makeSymbol("RESET-COHERENCE-VIOLATIONS"), SubLObjectFactory.makeSymbol("CLEAR-TERMS-FOR-PUBLIC-FACT-SHEETS"),
				SubLObjectFactory.makeSymbol("CB-KB-QUERY-SHOW-SENTENCE"), SubLObjectFactory.makeSymbol("SBHL-TEMPORALITY-DATE-SUCCESSION"), SubLObjectFactory.makeSymbol("CLEAR-PREDS-OF-STRING&WORD"), SubLObjectFactory.makeSymbol("CLEAR-SXHASH-EXTERNAL-CONSTANT"), SubLObjectFactory.makeSymbol("TASK-PROCESSOR-HANDLER"), SubLObjectFactory.makeSymbol("WITHIN-ABNORMALITY-CHECKING?"),
				SubLObjectFactory.makeSymbol("UNDEFINE-ALL-CYC-TESTS"), SubLObjectFactory.makeSymbol("NEW-SBHL-CACHE"), SubLObjectFactory.makeSymbol("DOLLAR-SIGN-PLUS-NUMBER-FST"), SubLObjectFactory.makeSymbol("CLOSED-QUERY-SUCCESS-TOKEN"), SubLObjectFactory.makeSymbol("SKSI-COST-RECORDING-SUSPENDED-FOR-CURRENT-ITERATOR-INITIAL-STATE"), SubLObjectFactory.makeSymbol("INITIALIZE-FILE-VECTOR-BACKED-MAP"),
				SubLObjectFactory.makeSymbol("CLEAR-VIRTUAL-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("ANY-TIME-IS-RELEVANT?"), SubLObjectFactory.makeSymbol("NEW-PPH-DISCOURSE-CONTEXT"), SubLObjectFactory.makeSymbol("HTML-COPYRIGHT-NOTICE"), SubLObjectFactory.makeSymbol("BASIC-AJAX-SCRIPTS"), SubLObjectFactory.makeSymbol("CREATE-NART-DUMP-ID-TABLE"),
				SubLObjectFactory.makeSymbol("CLEAR-BYTE-ORDER-MARK"), SubLObjectFactory.makeSymbol("API-QUIT"), SubLObjectFactory.makeSymbol("CLEAR-PROPRIETARY-TERM?"), SubLObjectFactory.makeSymbol("NEW-CONSTANTS-ITERATOR"), SubLObjectFactory.makeSymbol("RESET-NAT-ISA-LINKS"), SubLObjectFactory.makeSymbol("PPH-CURRENT-PRECISION"), SubLObjectFactory.makeSymbol("GENL-RULES-ENABLED?"),
				SubLObjectFactory.makeSymbol("API-INPUT-PROTOCOL"), SubLObjectFactory.makeSymbol("INDEXICAL-THE-PURPOSE"), SubLObjectFactory.makeSymbol("RESET-ALL-FILE-BACKED-CACHES"), SubLObjectFactory.makeSymbol("GET-DEDUCTION"), SubLObjectFactory.makeSymbol("ARETE-ENABLE-GLOBAL-LOGGING"), SubLObjectFactory.makeSymbol("CLEAR-EXTERNAL-SOURCE-ACCESS-PATH-CACHE"),
				SubLObjectFactory.makeSymbol("RESET-JAVA-API-KERNEL"), SubLObjectFactory.makeSymbol("NEW-KBS-PRETTY-STRING-FORT-ITERATOR"), SubLObjectFactory.makeSymbol("NEXT-KCT-THINKING-ID"), SubLObjectFactory.makeSymbol("CLEAR-PPH-STRING-FROM-UTF8-STRING"), SubLObjectFactory.makeSymbol("CLEAR-LEXICONS-TO-LANGUAGES"), SubLObjectFactory.makeSymbol("CYCLIFY-TEST"),
				SubLObjectFactory.makeSymbol("LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-8"), SubLObjectFactory.makeSymbol("CLEAR-TASK-ALLOWS-UNKNOWN-SENTENCE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS"), SubLObjectFactory.makeSymbol("CLEAR-RDF-GRAPH-INDEX-SUB-INDEXES"),
				SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("INITIALIZE-OCTANT-LOCATIONS"), SubLObjectFactory.makeSymbol("PERFORMING-FORWARD-INFERENCE?"), SubLObjectFactory.makeSymbol("CB-FAST?"), SubLObjectFactory.makeSymbol("LOCAL-QUEUE-DEQUEUE"), SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-COUNT"),
				SubLObjectFactory.makeSymbol("REFORMULATOR-VARIABLES-INITIALIZED?"), SubLObjectFactory.makeSymbol("CLEAR-MAX-GEN-TEMPLATE-PHRASE-ID"), SubLObjectFactory.makeSymbol("GRAMMAR-PERMISSIVE-WRT-VARIABLES?"), SubLObjectFactory.makeSymbol("USE-RULE-SET?"), SubLObjectFactory.makeSymbol("CLEAR-RKF-PREPOSITION-STRING?"),
				SubLObjectFactory.makeSymbol("PERFORM-LIMITATION-MOTIVATED-POST-IDENTIFY-CLEANUPS"), SubLObjectFactory.makeSymbol("CONFIGURE-APP-COLORS"), SubLObjectFactory.makeSymbol("SHOW-HISTORICAL-INFORMATION"), SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS-SIMPLE"), SubLObjectFactory.makeSymbol("CLEAR-GENL-INVERSE-GRAPH"), SubLObjectFactory.makeSymbol("CLEAR-AT-ARGN-INT-CACHED"),
				SubLObjectFactory.makeSymbol("DEFAULT-RELATION-TAGGING-DOMAIN-MT"), SubLObjectFactory.makeSymbol("CLEAR-PSP-SEMANTIC-CONSTRAINT-TYPES"), SubLObjectFactory.makeSymbol("DEDUCTION-USAGE-COUNTS-ENABLED-P"), SubLObjectFactory.makeSymbol("CB-C-GAF-ARG-USE-BINARY?"), SubLObjectFactory.makeSymbol("INITIALIZE-CB-RTV-PREDICATES"), SubLObjectFactory.makeSymbol("KCT-ALL-THINKINGS"),
				SubLObjectFactory.makeSymbol("CANDIDATE-ASSERTION-FI-FORMULA"), SubLObjectFactory.makeSymbol("PROOF-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PPH-IDENTITY-TEMPLATE"), SubLObjectFactory.makeSymbol("CLEAR-PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-DONT-MAINTAIN-USAGES-COUNTS"), SubLObjectFactory.makeSymbol("CURRENT-PROCESS"),
				SubLObjectFactory.makeSymbol("NEW-UNSPECIFIED-PPH-PRONOUN-AGR"), SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-API-LEASE-MONITOR"), SubLObjectFactory.makeSymbol("STOP-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("GET-NL-TRIE"), SubLObjectFactory.makeSymbol("RED-ORDERED-VAR-LIST"), SubLObjectFactory.makeSymbol("GHL-USES-SPEC-PREDS-P"),
				SubLObjectFactory.makeSymbol("EXTERNAL-NON-WFF-STORE-FILENAME"), SubLObjectFactory.makeSymbol("ASKED-QUERY-COMMON-SYMBOLS-SIMPLE"), SubLObjectFactory.makeSymbol("GET-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES"), SubLObjectFactory.makeSymbol("RELEVANT-DIRECTIONS"), SubLObjectFactory.makeSymbol("REINITIALIZE-LINKAGE"), SubLObjectFactory.makeSymbol("NEW-FORT-ID-INDEX"),
				SubLObjectFactory.makeSymbol("QUATERNARY-FET-EVALUATION-PRED"), SubLObjectFactory.makeSymbol("REBUILD-COMPUTABLE-BUT-NOT-DUMPABLE-YET"), SubLObjectFactory.makeSymbol("INITIALIZE-TVA-CACHES"), SubLObjectFactory.makeSymbol("SHOW-TRANSCRIPT-INFORMATION"), SubLObjectFactory.makeSymbol("IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?"),
				SubLObjectFactory.makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("MAKE-ASSERTION-ID"), SubLObjectFactory.makeSymbol("FLUSH-KB-STORE-TRANSACTION"), SubLObjectFactory.makeSymbol("CLEAR-PPH-GENL-CATEGORY?"), SubLObjectFactory.makeSymbol("ILP-TERM-EXPORT-NEGATIVE-EXAMPLES?"), SubLObjectFactory.makeSymbol("GET-SCG-PARSER-CALLBACK-PORT"),
				SubLObjectFactory.makeSymbol("CLEAR-STRATEGY-TYPE-STORE"), SubLObjectFactory.makeSymbol("GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE"), SubLObjectFactory.makeSymbol("CLEAR-IMPLAUSIBLE-ADMITTED-ARGUMENT?"), SubLObjectFactory.makeSymbol("GET-TRIE-ANCESTOR-TRACKING-VECTOR"), SubLObjectFactory.makeSymbol("PPH-DEFAULT-VAR-TYPE"), SubLObjectFactory.makeSymbol("REMOVE-PPH-INDEXICAL-DATES"),
				SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-GENL-MTS"), SubLObjectFactory.makeSymbol("CB-OPTIONS-SUBMIT-BAR"), SubLObjectFactory.makeSymbol("OWL-EXPORT-DEFAULT-NAMESPACE"), SubLObjectFactory.makeSymbol("PPH-LEXIFICATION-PREDS-INTERNAL"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-CONSTRAINED"), SubLObjectFactory.makeSymbol("LATEST-INFERENCE"),
				SubLObjectFactory.makeSymbol("NEW-GUID"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-SUBWORD-CACHES"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-EVENT-PROPERTIES"), SubLObjectFactory.makeSymbol("KILL-NAKED-PROTOTYPICALS"), SubLObjectFactory.makeSymbol("LOCAL-TRANSCRIPT"), SubLObjectFactory.makeSymbol("CB-MYCREATIONPURPOSE-FILTER"),
				SubLObjectFactory.makeSymbol("CLEAR-RUN-CNC-QUERY"), SubLObjectFactory.makeSymbol("ALL-QUERY-STATIC-PROPERTIES"), SubLObjectFactory.makeSymbol("STRATEGY-POSSIBLY-UN-NOTE-UNINTERESTINGNESS-EXPLANATION"), SubLObjectFactory.makeSymbol("GET-RED-VALUE-FOR-DEFAULT-JAVA-RE-LIB"), SubLObjectFactory.makeSymbol("RUN-ONE-LOCAL-OP-IN-AGENDA"), SubLObjectFactory.makeSymbol("GET-TAGGER"),
				SubLObjectFactory.makeSymbol("REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-MTS-SBHL-CACHES"), SubLObjectFactory.makeSymbol("GET-ALL-SDS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-10"), SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL"), SubLObjectFactory.makeSymbol("REMOVE-CACHED-LOAD-ALL-HAYSTACKS"),
				SubLObjectFactory.makeSymbol("NEW-SBHL-NULL-ITERATOR"), SubLObjectFactory.makeSymbol("MISSING-ASSERTION-ID-SET"), SubLObjectFactory.makeSymbol("CLEAR-CLAUSE-STRUC-TABLE"), SubLObjectFactory.makeSymbol("PPH-QUANTIFIER-KEYWORDS"), SubLObjectFactory.makeSymbol("LOAD-COMPUTABLE-KB-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR"),
				SubLObjectFactory.makeSymbol("RESET-OLD-DEFNS-ADMIT?-METERS"), SubLObjectFactory.makeSymbol("VALID-DIRECTIONS"), SubLObjectFactory.makeSymbol("INIT-SPPS-TO-NL-NUMBERS"), SubLObjectFactory.makeSymbol("CLEAR-IS-ABBREVIATION-PREDICATE"), SubLObjectFactory.makeSymbol("CYC-CGI-URL-INT"), SubLObjectFactory.makeSymbol("RTP-VBAR-TEMPLATES-CACHED"),
				SubLObjectFactory.makeSymbol("PPH-NEW-PARAMETER-SNAPSHOT"), SubLObjectFactory.makeSymbol("NEW-KB-HL-SUPPORT-CONTENT"), SubLObjectFactory.makeSymbol("CLEAR-CHARNIAK-PARSE"), SubLObjectFactory.makeSymbol("GET-TRIE-ANCESTOR-TRACKING-VECTOR"), SubLObjectFactory.makeSymbol("DEEPAK-QUERIES-TIMING-TEST"), SubLObjectFactory.makeSymbol("MAKE-CYC-ANNOTATION-ENTITY-MAP"),
				SubLObjectFactory.makeSymbol("STASH-KB-INDEXING-VARS"), SubLObjectFactory.makeSymbol("FTS-INIT-VIA-RMP-GAFS"), SubLObjectFactory.makeSymbol("MAYBE-INITIALIZE-PPH-GENERATION-PREDS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-5"), SubLObjectFactory.makeSymbol("CB-MYCREATIONPURPOSE-FILTER"), SubLObjectFactory.makeSymbol("WNI-NO-SYNSETS-FOR-MATCHING"),
				SubLObjectFactory.makeSymbol("LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY"), SubLObjectFactory.makeSymbol("KBS-STATE-VALID?"), SubLObjectFactory.makeSymbol("POSSIBLY-CLEAR-DUMPABLE-KB-STATE-HASHES"), SubLObjectFactory.makeSymbol("NON-TRIE-SUBWORD-PREDS"), SubLObjectFactory.makeSymbol("INITIALIZE-CAE-QUERY-TRANSLATION"), SubLObjectFactory.makeSymbol("DESTROY-DUPLICATE-KB-HL-SUPPORTS"),
				SubLObjectFactory.makeSymbol("WITHIN-GENERIC-PREFERENCE-ANALYSIS?"), SubLObjectFactory.makeSymbol("ENSURE-EVENT-HIERARCHY"), SubLObjectFactory.makeSymbol("NGA-ACCESS-PATH"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-CREATOR"), SubLObjectFactory.makeSymbol("CLEAR-LOCAL-QUEUE"), SubLObjectFactory.makeSymbol("CLEAR-OWL11-NAME"), SubLObjectFactory.makeSymbol("SET-QUANT-KB-LOADED"),
				SubLObjectFactory.makeSymbol("SKSI-SMT-GET-UNITS-OF-MEASUREMENT"), SubLObjectFactory.makeSymbol("CLEAR-SUBSTITUTABLE-ARG-CONSTRAINT-FOR-RELN"), SubLObjectFactory.makeSymbol("CLEAR-TERM-GOOD-WRT-CLASSIFICATION-TREE?"), SubLObjectFactory.makeSymbol("DESTROY-ALL-INFERENCES"), SubLObjectFactory.makeSymbol("IS-PROOF-SPEC-STORE-AVAILABLE?"),
				SubLObjectFactory.makeSymbol("RESET-RKF-IRRELEVANT-FORT-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-GET-DATUM-VAR"), SubLObjectFactory.makeSymbol("CLEAR-USER-PREFERENCES"), SubLObjectFactory.makeSymbol("CLEAR-VARIABLE-ORDER-COLLECTION?"), SubLObjectFactory.makeSymbol("SBHL-JUSTIFICATION-ASSEMBLED-P"), SubLObjectFactory.makeSymbol("INITIALIZE-ACCESS-PATH-MAP"),
				SubLObjectFactory.makeSymbol("ABORT-AND-RESTART-AGENDA"), SubLObjectFactory.makeSymbol("RBP-VOCABULARY-MTS"), SubLObjectFactory.makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-REQUIREMENTS-FOR-PRED"), SubLObjectFactory.makeSymbol("CLEAR-CLOSED-LEXICAL-CLASSES"), SubLObjectFactory.makeSymbol("HERALD-START"), SubLObjectFactory.makeSymbol("CLEAR-RDF-GRAPH-GET-BLANK-NODE-CACHED"),
				SubLObjectFactory.makeSymbol("ALL-SYSTEM-PARAMETERS"), SubLObjectFactory.makeSymbol("ALL-FORTS"), SubLObjectFactory.makeSymbol("DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("RBP-RULE-COUNT"), SubLObjectFactory.makeSymbol("GLOBAL-FORWARD-INFERENCE-TO-DO?"), SubLObjectFactory.makeSymbol("SBHL-CACHE-TUNING-EXPERIMENT-PROLOGUE"),
				SubLObjectFactory.makeSymbol("HANDLING-PPH-METHOD-FAILURES-P"), SubLObjectFactory.makeSymbol("MISSING-OLD-DEDUCTION-IDS"), SubLObjectFactory.makeSymbol("ACRONYM-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE"), SubLObjectFactory.makeSymbol("FORMAT-NIL-PERCENT"), SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-CREATE-ONTOLOGY"),
				SubLObjectFactory.makeSymbol("NOTE-GEN-TEMPLATE-STORE-INITIALIZED"), SubLObjectFactory.makeSymbol("CLEAR-PLACE-TIGHTENING-LEXICON"), SubLObjectFactory.makeSymbol("CLEAR-ASSERTION-TABLE"), SubLObjectFactory.makeSymbol("SYSTEM-CODE-LISP-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-REUSES-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("DONT-MAINTAIN-NART-INDEX-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("REFORMULATOR-KB-LOADED-P"), SubLObjectFactory.makeSymbol("NL-FORT-GENERATION-TASK-SUCCESS-CODE"), SubLObjectFactory.makeSymbol("KCT-INITIALIZE"), SubLObjectFactory.makeSymbol("INITIALIZE-POS-TAGS"), SubLObjectFactory.makeSymbol("ALL-KBS-DEFINITIONAL-PREDICATES"),
				SubLObjectFactory.makeSymbol("CLEAR-DERIVED-PREDS"), SubLObjectFactory.makeSymbol("INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-12"), SubLObjectFactory.makeSymbol("KE-CHECK-FORMS-TO-EVAL"), SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-TERMS"), SubLObjectFactory.makeSymbol("INTERRUPT-INITIAL-PROCESS"),
				SubLObjectFactory.makeSymbol("CLEAR-GENL-PREDICATE-GRAPH"), SubLObjectFactory.makeSymbol("WFF-CONSTRAINT-MT"), SubLObjectFactory.makeSymbol("INITIALIZE-RKF-KB-FEATURE"), SubLObjectFactory.makeSymbol("COMPLETE-KNOWLEDGE-SOURCES"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("WORD-STRINGS-FN"),
				SubLObjectFactory.makeSymbol("REFORMULATOR-RULE-SPEC-PREDS"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-FUNCTION-CALL-REST-ARITY-STATS"), SubLObjectFactory.makeSymbol("CLEAR-WNI-VERB-FRAMES-FOR-WORD"), SubLObjectFactory.makeSymbol("GET-ALL-SBHL-MODULE-LINK-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS"),
				SubLObjectFactory.makeSymbol("PPH-CURRENT-ARG0-SPECIFIED-P"), SubLObjectFactory.makeSymbol("RESET-NEC-DEFN-REJECTS?-METERS"), SubLObjectFactory.makeSymbol("CHECK-GEN-TEMPLATE-STORE-INITIALIZATION"), SubLObjectFactory.makeSymbol("CLEAR-INTER-CONSTRAINTS-FROM-RULE"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-LEXICAL-CACHES"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-6"),
				SubLObjectFactory.makeSymbol("RTP-VBAR-TEMPLATES-CACHED-INTERNAL"), SubLObjectFactory.makeSymbol("CYC-NL-FEATURE"), SubLObjectFactory.makeSymbol("CLEAR-PREFERRED-REWRITE-TERM"), SubLObjectFactory.makeSymbol("BIO-FILTER-COLL"), SubLObjectFactory.makeSymbol("SYSTEM-CODE-HL-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("UNIFICATION-SUCCESS-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-OBJECT-FROM-ID"), SubLObjectFactory.makeSymbol("TERM-CLASSIFICATION-TREE-MT"), SubLObjectFactory.makeSymbol("ASSERTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS"), SubLObjectFactory.makeSymbol("ASSERTIONS-WITH-META-ASSERTIONS-COUNT"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-2"), SubLObjectFactory.makeSymbol("RDF-PARSER-TEST-FILES"),
				SubLObjectFactory.makeSymbol("ALL-KB-MODAL-OPERATORS-INTERNAL"), SubLObjectFactory.makeSymbol("MUST-USE-STATIC-MEMORY-FOR-NL-TRIE"), SubLObjectFactory.makeSymbol("GET-SEMTRANS-LEXICON"), SubLObjectFactory.makeSymbol("DO-INITIALIZE-GEN-TEMPLATE-STORE"), SubLObjectFactory.makeSymbol("PHRASE-SPECIFICATION-TIP"), SubLObjectFactory.makeSymbol("CLEAR-PPH-ENHANCED-DOMAIN-MT"),
				SubLObjectFactory.makeSymbol("ALEPH-INDUCTION-FILESET-NAME"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-MAX-TIME"), SubLObjectFactory.makeSymbol("STOP-ALL-HL-TRANSCRIPT-TRACES-TO-FILES"), SubLObjectFactory.makeSymbol("MAKE-STATIC-SEARCH-STRUC"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-PHRASE-COPY-STACK"),
				SubLObjectFactory.makeSymbol("CLEAR-TAXONOMY-SUPPRESSED-FACETS"), SubLObjectFactory.makeSymbol("FI-GET-WARNING-INT"), SubLObjectFactory.makeSymbol("GET-NEW-CFASL-INPUT-GUID-STRING-RESOURCE"), SubLObjectFactory.makeSymbol("NEW-SEMTRANS-LEXICON"), SubLObjectFactory.makeSymbol("CURRENT-AR-CONCEPT-GROUNDING-MAP"), SubLObjectFactory.makeSymbol("INIT-SME-LEXWIZ"),
				SubLObjectFactory.makeSymbol("LIST-DEF-RED-VARIABLES"), SubLObjectFactory.makeSymbol("NON-TRUE-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("DEDUCTION-MANAGER-ENABLE-MEMORY-MAPPING"), SubLObjectFactory.makeSymbol("PPH-GENERATE-ALTERNATIVE-PHRASES?"), SubLObjectFactory.makeSymbol("FI-GET-ERROR-STRING-INT"),
				SubLObjectFactory.makeSymbol("CLEAR-SOME-INTER-ARG-FORMAT-ASSERTION-SOMEWHERE-CACHE"), SubLObjectFactory.makeSymbol("POS-EVIDENCE-TABLES-INITIALIZED?"), SubLObjectFactory.makeSymbol("CLEAR-FORBIDDEN-KB-COVERING-COLLECTIONS-SET"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-NUMBER-INDEXICAL"), SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER"),
				SubLObjectFactory.makeSymbol("TEMPLATE-MTS"), SubLObjectFactory.makeSymbol("TEST-AES-DO-ORTHOGRAPHIC-CHANGES"), SubLObjectFactory.makeSymbol("LOCAL-TRANSCRIPT-HISTORY"), SubLObjectFactory.makeSymbol("INITIALIZE-KBS-FORT-TABLE"), SubLObjectFactory.makeSymbol("CB-PRECISION-SUGGESTOR-INITIAL-INFERENCE-STATE"), SubLObjectFactory.makeSymbol("UNIFICATION-SUCCESS-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("CLEAR-PHRASE-NAUT-ARG"), SubLObjectFactory.makeSymbol("XML-CDATA-SUFFIX"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-CITYWITHCOUNTRYABBREVIATION"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-12"), SubLObjectFactory.makeSymbol("SCHEDULED-QUERY-TEST-QUERY"), SubLObjectFactory.makeSymbol("CB-KB-QUERY-SHOW-PRAGMATICS"),
				SubLObjectFactory.makeSymbol("CORE-KB-FINISH-DEFINITIONS"), SubLObjectFactory.makeSymbol("REBUILD-LEXICON-CACHE"), SubLObjectFactory.makeSymbol("REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS"), SubLObjectFactory.makeSymbol("EVERYTHING-PSC-DWIMMED-AWAY?"), SubLObjectFactory.makeSymbol("ALL-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("PUBLIC-FACT-SHEET-AD-HTML"),
				SubLObjectFactory.makeSymbol("CURRENTLY-EXECUTING-TACTICS"), SubLObjectFactory.makeSymbol("INITIALIZE-RULE-AFTER-ADDINGS-HASH"), SubLObjectFactory.makeSymbol("BESTLISTPARAPHRASEWITHSEPARATORFN-CONSTRAINED"), SubLObjectFactory.makeSymbol("CLEAR-RKF-SALIENT-GENERALIZATIONS"), SubLObjectFactory.makeSymbol("FI-ASK-STATUS"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-ROOT-DIR-NAMES"),
				SubLObjectFactory.makeSymbol("ENSURE-MISSING-KNOWLEDGE-DISCOVERY-EVENT-DISPATCHER-RUNNING"), SubLObjectFactory.makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"), SubLObjectFactory.makeSymbol("PPH-INFO-VECTOR-SLOTS"), SubLObjectFactory.makeSymbol("MODAL-STRINGS-INTERNAL"), SubLObjectFactory.makeSymbol("DEFAULT-NL-GENERATION-FORT-CACHE-PARAPHRASE-MT"),
				SubLObjectFactory.makeSymbol("GENERATE-XSD-EPILOGUE"), SubLObjectFactory.makeSymbol("REINDEX-ALL-KB-HL-SUPPORTS"), SubLObjectFactory.makeSymbol("CLEAR-MDW-GRAPH"), SubLObjectFactory.makeSymbol("RESET-RTP-COMPLETELY"), SubLObjectFactory.makeSymbol("NON-WFF-ASSERTION-IDS"), SubLObjectFactory.makeSymbol("UNSET-LEXICON-KB-LOADED"),
				SubLObjectFactory.makeSymbol("PPH-SUMMARY-MAX-SENTENCES-FOR-SAME-PRED"), SubLObjectFactory.makeSymbol("DEREGISTER-ALL-SKSI-REMOVAL-MODULES"), SubLObjectFactory.makeSymbol("UNSET-NL-KB-LOADED"), SubLObjectFactory.makeSymbol("WIDE-DEDUCTION-HL-STORE-CACHE?"), SubLObjectFactory.makeSymbol("TOP-LEVEL-NL-PREDS"), SubLObjectFactory.makeSymbol("CLEAR-FOLLOWUP-QUERY-MT-FOR-USER&TASK"),
				SubLObjectFactory.makeSymbol("SCOPE-PARTITION-ALL-ASSERTIONS-IN-HLMT-NAUT"), SubLObjectFactory.makeSymbol("NEW-HTFILE-HEADER"), SubLObjectFactory.makeSymbol("GATHER-LOAD-PARTITION-MISSING-NARTS"), SubLObjectFactory.makeSymbol("SOMEWHERE-CACHE-UNBUILT?"), SubLObjectFactory.makeSymbol("GET-DEFAULT-SEARCH-ENGINE"), SubLObjectFactory.makeSymbol("RULE-SUGGESTION-MT"),
				SubLObjectFactory.makeSymbol("GET-RESOURCED-PPH-ENVIRONMENT-STACK"), SubLObjectFactory.makeSymbol("CLEAR-PREDS-OF-POS-CACHED"), SubLObjectFactory.makeSymbol("CHMOD-SAFE-TO-USE?"), SubLObjectFactory.makeSymbol("GET-KBS-INHERITED-STORES"), SubLObjectFactory.makeSymbol("PPH-STRING-FREQUENCIES-AVAILABLE?"), SubLObjectFactory.makeSymbol("HB-DISPLAY-SUPERIORS"),
				SubLObjectFactory.makeSymbol("GET-ALL-FORMULA-TEMPLATE-DEFINITION-TUPLES"), SubLObjectFactory.makeSymbol("CLEAR-HL-PROTOTYPE-STATISTICS"), SubLObjectFactory.makeSymbol("RKF-EVENT-DISPATCHER-RUNNING?"), SubLObjectFactory.makeSymbol("SET-TO-RECEIVING-EVERYTHING"), SubLObjectFactory.makeSymbol("INDEXICAL-FACT-SHEET-SENTENCE"), SubLObjectFactory.makeSymbol("OWL-EXPORTER-V2-VERSION-NUMBER"),
				SubLObjectFactory.makeSymbol("RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS"), SubLObjectFactory.makeSymbol("MOST-RECENT-FAILING-CYC-TEST-RUNS"), SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE-ID"), SubLObjectFactory.makeSymbol("SAVE-HL-TRANSCRIPT-OPS-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-FIND-STEM-MEMOIZED"), SubLObjectFactory.makeSymbol("GET-SBHL-CONSIDER-NODE-FN"),
				SubLObjectFactory.makeSymbol("CYC-DOCUMENTATION-TOC"), SubLObjectFactory.makeSymbol("INITIALIZE-LEXICON-FROM-KB"), SubLObjectFactory.makeSymbol("ALL-GENERIC-TEST-CASES"), SubLObjectFactory.makeSymbol("DO-POST-IDENTIFY-KBS-ASSERTIONS-FNS"), SubLObjectFactory.makeSymbol("RECONNECT-ENGLISH-GENERATION-FORT-CACHE"), SubLObjectFactory.makeSymbol("MAPPING-ANSWER-FOUND?"),
				SubLObjectFactory.makeSymbol("CURRENT-XREF-SYSTEM-MODULES"), SubLObjectFactory.makeSymbol("CSQL-SUPPORTS"), SubLObjectFactory.makeSymbol("SET-RED-SYMBOLS"), SubLObjectFactory.makeSymbol("DEFAULT-ABDUCTION-INFERENCE-PARAMETERS"), SubLObjectFactory.makeSymbol("HTML-POPUP-SCRIPT"), SubLObjectFactory.makeSymbol("COMPUTE-MISSING-OLD-NART-REMOTE-IDS"),
				SubLObjectFactory.makeSymbol("SF-NEW-STATE"), SubLObjectFactory.makeSymbol("CLEAR-CAE-DEFAULT-NL-DOMAIN-MT"), SubLObjectFactory.makeSymbol("GRSOS-REPEATED-ARGS?"), SubLObjectFactory.makeSymbol("CLEAR-GET-CODE-FOR-LANGUAGE"), SubLObjectFactory.makeSymbol("LOADED-RDF-GRAPH-COUNT"), SubLObjectFactory.makeSymbol("STRATEGIC-HEURISTIC-INDEX"),
				SubLObjectFactory.makeSymbol("INTERRUPT-GENERIC-SEARCH"), SubLObjectFactory.makeSymbol("CLEAR-GET-UPWARDS-CLOSURE-JUSTIFICATIONS-CACHED"), SubLObjectFactory.makeSymbol("INIT-TEMPORAL-BOUNDS-SUBSUME"), SubLObjectFactory.makeSymbol("GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME"), SubLObjectFactory.makeSymbol("REMOVE-BAD-TERM-OF-UNIT-ASSERTIONS"),
				SubLObjectFactory.makeSymbol("MULTI-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CACHED-DEDUCTION-COUNT"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-PORT"), SubLObjectFactory.makeSymbol("CURRENTLY-EXECUTING-HL-STORAGE-MODULE"), SubLObjectFactory.makeSymbol("GET-ALL-FORMULA-TEMPLATE-TOPICS"),
				SubLObjectFactory.makeSymbol("SKSI-DEFAULT-ERROR-HANDLING-MODE"), SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE-ID"), SubLObjectFactory.makeSymbol("INVALID-CONSTANT-NAMES"), SubLObjectFactory.makeSymbol("INIT-COTEMPORAL"), SubLObjectFactory.makeSymbol("CB-ALL-GENERIC-HL-STORAGE-MODULES"), SubLObjectFactory.makeSymbol("HL-STORAGE-MODULES"),
				SubLObjectFactory.makeSymbol("RECALCULATE-SKSI-REWRITE-INFO"), SubLObjectFactory.makeSymbol("CLEAR-STRINGLIST-ARGS-OF-PRED-CACHED"), SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-GAF"), SubLObjectFactory.makeSymbol("DENOTATION-COUNT"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-SYSTEM"), SubLObjectFactory.makeSymbol("CLEAR-GENL-INVERSE-GRAPH"),
				SubLObjectFactory.makeSymbol("SEMANTIC-INDEX-INITIALIZED?"), SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-OWL-EXPORT-STATE"), SubLObjectFactory.makeSymbol("COUNT-NEW-DEDUCTIONS"), SubLObjectFactory.makeSymbol("KBS-NART-COUNT"), SubLObjectFactory.makeSymbol("ALL-FACT-SHEET-UPDATE-TERM-PRIORITIZERS"), SubLObjectFactory.makeSymbol("CYC-SECURE-KB-LOADED-P"),
				SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-TEMPLATE-FORWARD-RULES"), SubLObjectFactory.makeSymbol("LOCAL-QUEUE-PEEK"), SubLObjectFactory.makeSymbol("CAUGHT-UP-ON-MASTER-TRANSCRIPT"), SubLObjectFactory.makeSymbol("CLEAR-ASSERTION-CONTENT-TABLE"), SubLObjectFactory.makeSymbol("SBHL-SEARCH-HAS-MULTIPLE-GOALS-P"), SubLObjectFactory.makeSymbol("REMEMBERING-PPH-AMBIGUOUS-STRINGS?"),
				SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSET-TERM-HELPER"), SubLObjectFactory.makeSymbol("SORT-SUF-QUOTED-DEFN-CACHE"), SubLObjectFactory.makeSymbol("INITIALIZE-REFORMULATOR-VARIABLES"), SubLObjectFactory.makeSymbol("IS-NEW-CYCL-QUERY-PARAMETER-SET-INITIALIZED?"), SubLObjectFactory.makeSymbol("NEW-FORWARD-INFERENCE-ENVIRONMENT"),
				SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS"), SubLObjectFactory.makeSymbol("GET-SBHL-MAP-FUNCTION"), SubLObjectFactory.makeSymbol("CLEAR-SCG-LEXICAL-MT"), SubLObjectFactory.makeSymbol("CYC-MAINT-FEATURE"), SubLObjectFactory.makeSymbol("GET-ALL-DEFAULT-WFF-CHECKING-MTS"), SubLObjectFactory.makeSymbol("CLEAR-SUF-QUOTED-DEFNS"),
				SubLObjectFactory.makeSymbol("GNDB-ACCESS-PATH"), SubLObjectFactory.makeSymbol("CSS-KEYWORDS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS"), SubLObjectFactory.makeSymbol("SKSI-CLOSE-RESOURCED-CONNECTIONS"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-TYPE"), SubLObjectFactory.makeSymbol("TEST-IPC-ENQUEUE-DRAIN"),
				SubLObjectFactory.makeSymbol("JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P"), SubLObjectFactory.makeSymbol("CLEAR-SCHEDULED-QUERY-QUEUE"), SubLObjectFactory.makeSymbol("PERFORM-RESEARCH-CYC-LOAD-FINALIZATIONS"), SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-QUOTED-DEFN-METERS"), SubLObjectFactory.makeSymbol("REMOVE-PPH-LEXIFICATION-PREDS"),
				SubLObjectFactory.makeSymbol("CURRENT-SKS-REGISTRATION-STATE"), SubLObjectFactory.makeSymbol("REBUILD-SBHL-MODULES"), SubLObjectFactory.makeSymbol("GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING-P"), SubLObjectFactory.makeSymbol("REMOVE-ALL-KB-MODAL-OPERATORS"), SubLObjectFactory.makeSymbol("GET-WS-INDEX-PORT"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-NOTE-REVISIONS"),
				SubLObjectFactory.makeSymbol("KB-LOADED"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-SUPPORTED-GAF-ARGUMENT-CACHE"), SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-DEFN-FN-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("GET-ENTITY-GRAPH-REGISTRY"), SubLObjectFactory.makeSymbol("ALL-NARTS-INDEXED"), SubLObjectFactory.makeSymbol("CLEAR-HL-STORAGE-MODULE-INDEXES"),
				SubLObjectFactory.makeSymbol("INCREMENT-SBHL-CACHE-ATTEMPT-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PREVIOUS-DUMP-KB-STATE-CHECKPOINT"), SubLObjectFactory.makeSymbol("OWL-PREDICATE-TYPES-FOR-EXPORT"), SubLObjectFactory.makeSymbol("AVERAGE-HISTORICAL-INFERENCE-RELEVANT-PROBLEM-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-FSUT-PRIORITIZER-SLEEP-INTERVAL-FROM-NICE-LEVEL"),
				SubLObjectFactory.makeSymbol("STOP-ALL-FSUT-PRIORITIZERS"), SubLObjectFactory.makeSymbol("CLEAR-GET-CODE-FOR-LANGUAGE"), SubLObjectFactory.makeSymbol("CB-ALL-SPECIFIC-PREFERENCE-MODULE-PREDICATES"), SubLObjectFactory.makeSymbol("PPH-VBAR-CATEGORY"), SubLObjectFactory.makeSymbol("START-KB-MODIFICATIONS-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("HAS-NEW-DEDUCTIONS?"),
				SubLObjectFactory.makeSymbol("CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE"), SubLObjectFactory.makeSymbol("CLEAR-REQUIRED-BOUND-ARGS-FOR-PREDS"), SubLObjectFactory.makeSymbol("GUARDIAN-HANDLER"), SubLObjectFactory.makeSymbol("CLEAR-GET-EXAMPLE-INSTANCES-AS-RENDERINGS"), SubLObjectFactory.makeSymbol("CLEAR-PSP-FRAME-TYPE-INSTANCES"),
				SubLObjectFactory.makeSymbol("GET-DERIVED-NC-RULE-COUNT"), SubLObjectFactory.makeSymbol("DOCUMENTSENTENCEFN"), SubLObjectFactory.makeSymbol("OWL-IMPORTER-V1-VERSION-NUMBER"), SubLObjectFactory.makeSymbol("METER-KB-HL-SUPPORT-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("GET-SBHL-LINK-TV"), SubLObjectFactory.makeSymbol("UNSET-WORDNET-IMPORT-KB-LOADED"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-OBJECT-BY-HL-ID-STRING"), SubLObjectFactory.makeSymbol("ENSURE-BLUE-EVENT-DISPATCHER-RUNNING"), SubLObjectFactory.makeSymbol("NL-TRIE-STALE?"), SubLObjectFactory.makeSymbol("CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS"), SubLObjectFactory.makeSymbol("GET-CORBA-REMOVAL-PREDICATES"), SubLObjectFactory.makeSymbol("ALL-INFERENCE-META-PROPERTIES"),
				SubLObjectFactory.makeSymbol("SKSI-CORBA-MODULES-COUNT"), SubLObjectFactory.makeSymbol("TVA-VAR-ARGNUMS"), SubLObjectFactory.makeSymbol("HL-MODIFY-REMOTE?"), SubLObjectFactory.makeSymbol("SHOW-OWL-IMPORT-USAGES"), SubLObjectFactory.makeSymbol("CLEAR-RTP-TEMPLATE-CATEGORY?"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-SBHL-MODULE-DIRECTION-LINK-SEARCH-STATE-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("CLEAR-SPEC-PRED-NAUT-CACHE"), SubLObjectFactory.makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE"), SubLObjectFactory.makeSymbol("META-REMOVAL-COMPLETE-POS-REQUIRED"), SubLObjectFactory.makeSymbol("CLEAR-EXPORTABLE-MT?"), SubLObjectFactory.makeSymbol("RL-MODULE-STORE"), SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"),
				SubLObjectFactory.makeSymbol("WFF-FORMULA"), SubLObjectFactory.makeSymbol("CB-FORM-CONS-METHODS-ACTIVE"), SubLObjectFactory.makeSymbol("SET-BASIC-NC-RULE-COUNT"), SubLObjectFactory.makeSymbol("LOG-FACT-SHEET-HOURLY-REPORT"), SubLObjectFactory.makeSymbol("SKSI-KB-LOADED-P"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-LEXIFICATIONS-FOR-TERM"),
				SubLObjectFactory.makeSymbol("INFERENCE-CURRENT-HL-MODULE"), SubLObjectFactory.makeSymbol("RESET-CACHE-SUF-FUNCTION-METERS"), SubLObjectFactory.makeSymbol("GET-SBHL-WHAT-MTS-BEHAVIOR"), SubLObjectFactory.makeSymbol("GRSOS-REPEATED-ARGS?"), SubLObjectFactory.makeSymbol("MODERNIZE-SKOLEM-AXIOM-TABLE"), SubLObjectFactory.makeSymbol("CYC-PPH-FEATURE"),
				SubLObjectFactory.makeSymbol("PROOF-VIEW-NAMESPACE"), SubLObjectFactory.makeSymbol("MWP-RULE-SPEC-TABLE-INIT"), SubLObjectFactory.makeSymbol("CLEAR-TYPES-FOR-PUBLIC-FACT-SHEETS"), SubLObjectFactory.makeSymbol("CLEAR-FORTS-WITH-EXPORTED-OWL-OPENCYC-CONTENT"), SubLObjectFactory.makeSymbol("PPH-CURRENT-CYCL"), SubLObjectFactory.makeSymbol("ALL-RELEVANT-SKSI-CONTENT-MTS"),
				SubLObjectFactory.makeSymbol("PROBLEM-STORE-COUNT"), SubLObjectFactory.makeSymbol("NEW-RKF-SD-PROMPT"), SubLObjectFactory.makeSymbol("BUILD-EVAL-FORM-LIST"), SubLObjectFactory.makeSymbol("PARTITION-CREATE-INVALID-CONSTANT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-11"), SubLObjectFactory.makeSymbol("REFORMULATOR-RELEVANT-PREDICATES"),
				SubLObjectFactory.makeSymbol("DHTML-WITH-TOGGLE-VISIBILITY-SUPPORT"), SubLObjectFactory.makeSymbol("OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-AUX-QUEUE"), SubLObjectFactory.makeSymbol("LONG-SITE-NAME"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-MODULE-LOGICAL-SCHEMAS-CACHE"), SubLObjectFactory.makeSymbol("ASSERTIVE-WFF-RULES-CACHED-INTERNAL"),
				SubLObjectFactory.makeSymbol("CYC-VERSIONED-WORLD-NAME"), SubLObjectFactory.makeSymbol("CLEAR-TERM-PASSES-ARG-RESTRICTIONS"), SubLObjectFactory.makeSymbol("HL-ACCESS-LOCAL?"), SubLObjectFactory.makeSymbol("CLEAR-VIEWPOINT-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-HTML-GLYPH-CODE-FOR-DENOT"), SubLObjectFactory.makeSymbol("CLOSE-OLD-AREAS"),
				SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSET-TERM-HELPER"), SubLObjectFactory.makeSymbol("DISABLE-RULE-HISTORICAL-CONNECTEDNESS"), SubLObjectFactory.makeSymbol("GET-TAGGER"), SubLObjectFactory.makeSymbol("CB-EMPTY-INDEX-FRAME"), SubLObjectFactory.makeSymbol("INITIALIZE-MULTI-WORD-PREDS"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-TRIGGERED-TMS-RULES"),
				SubLObjectFactory.makeSymbol("SF-NEXT-ID"), SubLObjectFactory.makeSymbol("CURRENTLY-CONSIDERED-TACTIC"), SubLObjectFactory.makeSymbol("TEST-PARSE-A-QUESTION-COMPLETELY"), SubLObjectFactory.makeSymbol("INITIALIZE-RULE-AFTER-REMOVINGS-HASH"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("BESTBINDINGSPHRASEFN"),
				SubLObjectFactory.makeSymbol("CLEAR-RELATION-ARGS-SORTED-BY-RESTRICTION"), SubLObjectFactory.makeSymbol("SKSI-IGNORE-ERRORS"), SubLObjectFactory.makeSymbol("IMPORT-SAMPLE-ONTOLOGIES"), SubLObjectFactory.makeSymbol("RESEARCH-CYC-LICENSE-KEY-ERROR"), SubLObjectFactory.makeSymbol("START-RECORDING-SBHL-CACHE-TUNING-DATA"), SubLObjectFactory.makeSymbol("RBP-NEW-RULE-BANK"),
				SubLObjectFactory.makeSymbol("CLEAR-PLACE-TIGHTENING-LEXICON"), SubLObjectFactory.makeSymbol("NEW-MUTED-UNREPRESENTED-TERM-INDEX-ITERATOR"), SubLObjectFactory.makeSymbol("INITIALIZE-NUMBER-VALUES"), SubLObjectFactory.makeSymbol("COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?"), SubLObjectFactory.makeSymbol("L2R-PICK-DOCUMENT-TO-READ"), SubLObjectFactory.makeSymbol("FACT-SHEET-LOG-STREAM"),
				SubLObjectFactory.makeSymbol("GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON"), SubLObjectFactory.makeSymbol("ST-HTML-LEGEND"), SubLObjectFactory.makeSymbol("KB-LOADED-STRING"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON"), SubLObjectFactory.makeSymbol("RUN-ONE-LOCAL-OP-IN-AGENDA"), SubLObjectFactory.makeSymbol("HALT-API-TASK-PROCESSORS"),
				SubLObjectFactory.makeSymbol("*RAI-GROUP-MEMBER-TYPE-FROM-GROUP-TYPE-MEMBER-TYPE-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("CB-CURRENT-RELEVANT-TERMS"), SubLObjectFactory.makeSymbol("MAINTAIN-CONSTANT-INDEX-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("INITIALIZE-LEXICON"), SubLObjectFactory.makeSymbol("CLEAR-HL-VAR-FOR-DEFAULT-EL-VAR"),
				SubLObjectFactory.makeSymbol("CLAUSE-STRUC-TABLE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-7"), SubLObjectFactory.makeSymbol("PENNTAG-PHRASE-CATEGORIES"), SubLObjectFactory.makeSymbol("SBHL-CACHING-INIT"), SubLObjectFactory.makeSymbol("DO-INITIALIZE-GEN-TEMPLATE-STORE"), SubLObjectFactory.makeSymbol("CLEAR-RESOLVE-RDF/XML-URI-INTERNAL"),
				SubLObjectFactory.makeSymbol("UNASSOCIATED-REFORMULATOR-RULES"), SubLObjectFactory.makeSymbol("RUN-LOCAL-OP?"), SubLObjectFactory.makeSymbol("CLEAR-SINGULARIZE-WORD"), SubLObjectFactory.makeSymbol("LINKAGE-CREATION-RULES"), SubLObjectFactory.makeSymbol("RESET-LEXICON-SLURPER"), SubLObjectFactory.makeSymbol("CLEAR-MDW-GRAPH"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-7"),
				SubLObjectFactory.makeSymbol("MINI-FACT-SHEET-TERM-TYPES"), SubLObjectFactory.makeSymbol("CB-COMPUTE-PARTITION-LOAD-PUBLIC-DIRECTORY"), SubLObjectFactory.makeSymbol("KE-CYCLIFY-FORMS"), SubLObjectFactory.makeSymbol("WITHIN-QUERY-TENSE-CZER-MODE?"), SubLObjectFactory.makeSymbol("MAKE-TVA-SIMPLE-STRATEGY"), SubLObjectFactory.makeSymbol("GET-ALL-SKSS"),
				SubLObjectFactory.makeSymbol("HALT-BG-TASK-PROCESSORS"), SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR-GUEST-WARN"), SubLObjectFactory.makeSymbol("NL-TRIE-ROTATION-INDEX-INITIALIZATION-PRACTICAL-P"), SubLObjectFactory.makeSymbol("TVA-PRECOMPUTES-SKSI-CLOSURES?"), SubLObjectFactory.makeSymbol("LISP-IMPLEMENTATION-TYPE"), SubLObjectFactory.makeSymbol("CLEAR-MONAD-MT-FORT-CACHE"),
				SubLObjectFactory.makeSymbol("SF-NEXT-ID"), SubLObjectFactory.makeSymbol("CLEAR-PPH-DNF-CLAUSAL-FORM-CACHED"), SubLObjectFactory.makeSymbol("INITIALIZE-SCOOP-DEFINITIONS"), SubLObjectFactory.makeSymbol("CB-MYCREATOR-FILTER"), SubLObjectFactory.makeSymbol("PPH-ALLOW-CONTRACTIONS?"), SubLObjectFactory.makeSymbol("UNEXPANDED-FORMULA"),
				SubLObjectFactory.makeSymbol("FILE-VECTOR-BACKED-MAP-EXERCISER-PROCESS"), SubLObjectFactory.makeSymbol("ALL-OS-PROCESSES"), SubLObjectFactory.makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"), SubLObjectFactory.makeSymbol("GET-SBHL-GOAL-TABLE"), SubLObjectFactory.makeSymbol("SCOPE-KBS-SPLICING-ASSERTIONS"), SubLObjectFactory.makeSymbol("COMPUTE-CORE-CONSTANTS"),
				SubLObjectFactory.makeSymbol("MAPPING-ANSWER-FOUND?"), SubLObjectFactory.makeSymbol("GET-GKE-QUANTIFIERS"), SubLObjectFactory.makeSymbol("SEND-SUBMITTED-TRANSCRIPT-LOADING-NOTICES?"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("LIST-ALL-PACKAGES"), SubLObjectFactory.makeSymbol("EMPTY-THOUGHT"),
				SubLObjectFactory.makeSymbol("OUTPUT-GENERATE-TEXT-BAD-RESULTS"), SubLObjectFactory.makeSymbol("SEMANTIC-VIOLATIONS"), SubLObjectFactory.makeSymbol("CB-CREATE-SIMILAR-GUEST-WARN"), SubLObjectFactory.makeSymbol("CLEAR-DERIVED-PREDS"), SubLObjectFactory.makeSymbol("REGISTER-CYCLIFY-PARSER"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-4"),
				SubLObjectFactory.makeSymbol("MODAL-STRINGS-INTERNAL"), SubLObjectFactory.makeSymbol("GET-SBHL-CONSIDER-NODE-FN"), SubLObjectFactory.makeSymbol("DISABLE-ASSERTIVE-WFF"), SubLObjectFactory.makeSymbol("WORRY-TRANSMIT-OPERATIONS"), SubLObjectFactory.makeSymbol("MT-OF-CURRENTLY-EXECUTING-TACTIC"), SubLObjectFactory.makeSymbol("CLEAR-NEW-KB-STATE"),
				SubLObjectFactory.makeSymbol("KB-DUMP-DEFAULT-COMMON-SYMBOLS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-3"), SubLObjectFactory.makeSymbol("RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS"), SubLObjectFactory.makeSymbol("GET-RTV-INFERENCE-NODE-CONSTRAINTS"), SubLObjectFactory.makeSymbol("CLEAR-MWP-BASE-PRED-OF-POS"), SubLObjectFactory.makeSymbol("CITIES-TO-COUNTRIES"),
				SubLObjectFactory.makeSymbol("KBP-RESULT-PATHS"), SubLObjectFactory.makeSymbol("NEW-NEW-NARTS-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-DISJUNCTION-FREE-EL-VARS-POLICY"), SubLObjectFactory.makeSymbol("REMOVE-INVALID-CONSTANTS-FROM-COMPLETIONS"), SubLObjectFactory.makeSymbol("CLEAR-RDF-STANDARD-PREFIX-FOR-NAMESPACE"),
				SubLObjectFactory.makeSymbol("ASSERTING-TREES?"), SubLObjectFactory.makeSymbol("CB-SYSTEM-HEALTH-POSSIBLE-CHECKUPS"), SubLObjectFactory.makeSymbol("LOAD-ALL-CRIPPLED-HAYSTACKS-INT"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-CURRENT-METHOD-NEEDS-LOGGING-P"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FORMULAS-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("INVALID-CONSTANT-NAMES"), SubLObjectFactory.makeSymbol("CLEAR-FIND-STEM-MEMOIZED"), SubLObjectFactory.makeSymbol("CB-CLEAR-KCT-TEST-BEING-SAVED"), SubLObjectFactory.makeSymbol("NEW-LEX-PRED-SET"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-7"), SubLObjectFactory.makeSymbol("CLEAR-CB-SUGGEST-GAFS-FOR-TERMS"),
				SubLObjectFactory.makeSymbol("GET-CYC-TO-PENN-MAP"), SubLObjectFactory.makeSymbol("SCOPE-KBS-ASSERTIONS"), SubLObjectFactory.makeSymbol("CLEAR-SPLIT-LINK-WORD"), SubLObjectFactory.makeSymbol("RESET-NAT-ISA-LINKS"), SubLObjectFactory.makeSymbol("CB-FORM-CONS-INTER-ARG-SPACE"), SubLObjectFactory.makeSymbol("CLEAR-INTER-CONSTRAINTS-FROM-RULE"),
				SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-12"), SubLObjectFactory.makeSymbol("SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS"), SubLObjectFactory.makeSymbol("ACTIVE-GUARDIAN-REQUESTS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-4"), SubLObjectFactory.makeSymbol("NON-WFF-ASSERTION-IDS"), SubLObjectFactory.makeSymbol("SBHL-SEARCH-TRUE-TV"),
				SubLObjectFactory.makeSymbol("RKF-SC-NEW-LIMITATIONS"), SubLObjectFactory.makeSymbol("REMOVE-THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE"), SubLObjectFactory.makeSymbol("CURRENT-XREF-MODULE"), SubLObjectFactory.makeSymbol("PLOT-IMAGE-FORMAT-AND-EXTENSION"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-DB"), SubLObjectFactory.makeSymbol("INIT-STARTS-DURING"),
				SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-NUMBER-INDEXICAL"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-12"), SubLObjectFactory.makeSymbol("SET-KCT-KB-LOADED"), SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TAG-FNS"), SubLObjectFactory.makeSymbol("PROCESS-LOCAL-OPERATIONS?"),
				SubLObjectFactory.makeSymbol("ENABLE-HLMTS"), SubLObjectFactory.makeSymbol("REMOVE-SCOPED-PARTITION"), SubLObjectFactory.makeSymbol("TWODIGITYEARPARAPHRASEFN"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-CONSTANTS-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-STORED-OPERATIONS"), SubLObjectFactory.makeSymbol("HB-DEBUG"),
				SubLObjectFactory.makeSymbol("INCREMENT-SBHL-MARKING-GENERATION"), SubLObjectFactory.makeSymbol("GET-SANITY-CHECKER"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-USER"), SubLObjectFactory.makeSymbol("CLEAR-QUESTION-TOPICS-INFORMATION-FOR-PREDICATE"), SubLObjectFactory.makeSymbol("INITIALIZE-ISA-MODULE"), SubLObjectFactory.makeSymbol("PROOF-VIEW-CLOSED-QUERY-SUCCESS-VALUE"),
				SubLObjectFactory.makeSymbol("SBHL-CACHE-SUCCESS-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-PSP-NP-GAP-SEMX"), SubLObjectFactory.makeSymbol("CLEAR-PPH-NL-GENERATION-PRED?"), SubLObjectFactory.makeSymbol("DISABLE-ASSERTIVE-WFF-FORWARD-RULES"), SubLObjectFactory.makeSymbol("CLEAR-IMPLIED-ARGN-TYPE-RESTRICTIONS-FOR-PRED"),
				SubLObjectFactory.makeSymbol("CB-CLEAR-KCT-TEST-BEING-SAVED"), SubLObjectFactory.makeSymbol("INITIALIZE-LEXICON-LOOKUP-MT"), SubLObjectFactory.makeSymbol("GET-ALL-TSBS"), SubLObjectFactory.makeSymbol("NEW-PPH-PHRASE-COUNT"), SubLObjectFactory.makeSymbol("INITIALIZE-RBP-TERM-KEYWORD-MAP"), SubLObjectFactory.makeSymbol("SCHEDULED-QUERY-QUEUE"),
				SubLObjectFactory.makeSymbol("SCOPE-KBS-SPLICING-ASSERTIONS"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT"), SubLObjectFactory.makeSymbol("NEW-CFASL-COUNT-STREAM"), SubLObjectFactory.makeSymbol("CLEAR-RTV-PANEL-ENABLED-FOR-TASK"), SubLObjectFactory.makeSymbol("PARTITION-CREATE-INVALID-CONSTANT"),
				SubLObjectFactory.makeSymbol("INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES"), SubLObjectFactory.makeSymbol("FACT-SHEET-QUERY-SOFT-TIMEOUT-TIME-REACHED?"), SubLObjectFactory.makeSymbol("OWL-PROPERTY-ELEMENT-NAMES-INTERNAL"), SubLObjectFactory.makeSymbol("REMOVE-ASSERTIVE-WFF-RULES-CACHED"), SubLObjectFactory.makeSymbol("GET-ALL-FORMULA-TEMPLATE-SUBTOPICS"),
				SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN"), SubLObjectFactory.makeSymbol("CLEAN-INVALID-BOOKKEEPING-INFO"), SubLObjectFactory.makeSymbol("AGENDA-ERROR-MODES"), SubLObjectFactory.makeSymbol("REBUILD-SOMEWHERE-CACHE"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-INTERNAL"), SubLObjectFactory.makeSymbol("HERALD-START"),
				SubLObjectFactory.makeSymbol("GET-ALL-MT-VECTORS"), SubLObjectFactory.makeSymbol("MAPPING-FINISHED"), SubLObjectFactory.makeSymbol("INITIALIZE-REFORMULATOR-RULE-SPEC-PREDS"), SubLObjectFactory.makeSymbol("PPH-NBAR-CATEGORY"), SubLObjectFactory.makeSymbol("BROAD-MT-INDEX-CLEANUP"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("TKB-KBS-SAVE-TERMS-WITHOUT-ISAS"), SubLObjectFactory.makeSymbol("POSSIBLY-NOTE-TRANSCRIPT-OPERATIONS-PROCESSED"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS"), SubLObjectFactory.makeSymbol("RUN-ONE-AUXILIARY-OP-IN-AGENDA"), SubLObjectFactory.makeSymbol("PPH-NON-EXPLANATORY-PROOFS"), SubLObjectFactory.makeSymbol("NEW-OWL-IMPORTER"),
				SubLObjectFactory.makeSymbol("SIGNAL-INFERENCE-CONTROL-PROCESS-ABORT"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-7"), SubLObjectFactory.makeSymbol("CB-GLOB-RESET"), SubLObjectFactory.makeSymbol("PSP-ALLOWED-GAP-CATEGORY"), SubLObjectFactory.makeSymbol("CFASL-INVALID-KB-HL-SUPPORT"), SubLObjectFactory.makeSymbol("DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK"),
				SubLObjectFactory.makeSymbol("CURRENT-FORWARD-INFERENCE-FULLY-PROPAGATING-RULE?"), SubLObjectFactory.makeSymbol("TMS-ANY-ASSERTION-BEING-REMOVED?"), SubLObjectFactory.makeSymbol("DO-AGENDA-DAILY-GC"), SubLObjectFactory.makeSymbol("GC-FULL"), SubLObjectFactory.makeSymbol("CLEAR-PHRASE-NAUT-ARG"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-DISTANCE"),
				SubLObjectFactory.makeSymbol("INIT-BIRTH-DATE"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-LOCAL-QUEUE"), SubLObjectFactory.makeSymbol("TEMPLATE-MTS"), SubLObjectFactory.makeSymbol("RESET-SBHL-MODULES"), SubLObjectFactory.makeSymbol("HISTORICAL-PROBLEM-CREATION-TIMES"), SubLObjectFactory.makeSymbol("CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED"),
				SubLObjectFactory.makeSymbol("INITIALIZE-TIME-KB-FEATURE"), SubLObjectFactory.makeSymbol("PROBABLY-MOST-RECENT-ASSERTION"), SubLObjectFactory.makeSymbol("PPH-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-SENTENCES"), SubLObjectFactory.makeSymbol("INDEXICAL-NOW"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-UPDATE-PROCEDURE"),
				SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-DUMPABLE-KB-STATE-HASHES"), SubLObjectFactory.makeSymbol("UIMMA-DEFAULT-DOMAIN-MT"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-DEFAULT-QUERY-MT"), SubLObjectFactory.makeSymbol("CLEAR-OWL-EXPORT-STATE"), SubLObjectFactory.makeSymbol("CURRENT-COMPLEX-INDEX-KEYS"), SubLObjectFactory.makeSymbol("SOURCE-SCHEMA-OBJECT-FN-UNDEFINED-RULE"),
				SubLObjectFactory.makeSymbol("API-PORT"), SubLObjectFactory.makeSymbol("FORGET-REDUNDANT-ASSERTIVE-WFF-DEDUCTIONS"), SubLObjectFactory.makeSymbol("SHOW-PROOF-VIEW-TOC"), SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN"), SubLObjectFactory.makeSymbol("CLEAR-QUA-EXPANSION-CYCLS"), SubLObjectFactory.makeSymbol("CLASSES-BEFORE-LISTENERS-BY-DEFAULT-P"),
				SubLObjectFactory.makeSymbol("CLEAR-SUGGESTED-FREE-POSITION-FOR-PRED?"), SubLObjectFactory.makeSymbol("SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-INTERNAL"), SubLObjectFactory.makeSymbol("FORMAT-NIL-PERCENT"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-POSSIBLY-RELEVANT-GENERALIZATION?"), SubLObjectFactory.makeSymbol("GET-PSP-LEXICON"),
				SubLObjectFactory.makeSymbol("SBHL-VERIFY-NAUT-MT-RELEVANCE-P"), SubLObjectFactory.makeSymbol("INITIALIZE-FILE-VECTOR-BACKED-MAP"), SubLObjectFactory.makeSymbol("ASSUME-NL-TRIE-VALID?"), SubLObjectFactory.makeSymbol("CLEAR-CAE-QUERY-SEARCH-TABLES"), SubLObjectFactory.makeSymbol("CLEAR-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE-SENTENCES"), SubLObjectFactory.makeSymbol("CLEAR-LOCAL-QUEUE"),
				SubLObjectFactory.makeSymbol("NOTING-PROGRESS-POSTAMBLE"), SubLObjectFactory.makeSymbol("KBS-BROADER-TERM-CANDIDATE-FORTS"), SubLObjectFactory.makeSymbol("CLEAR-INDIVIDUAL?-CACHED"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-12"), SubLObjectFactory.makeSymbol("PARTITION-CREATE-INVALID-CONSTANT"), SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-10"), SubLObjectFactory.makeSymbol("INITIALIZE-EVAL-IN-API-ENV"), SubLObjectFactory.makeSymbol("GET-LATEST-NL-GENERATION-CACHE-FILE-PATH"), SubLObjectFactory.makeSymbol("NEW-DENSE-DEDUCTION-ID-INDEX"), SubLObjectFactory.makeSymbol("REBUILD-REFORMULATOR-RULES"), SubLObjectFactory.makeSymbol("ASKED-QUERY-COMMON-SYMBOLS"),
				SubLObjectFactory.makeSymbol("NEW-MESSAGE-MAILBOX-SUITE"), SubLObjectFactory.makeSymbol("PSP-NP-EDGES"), SubLObjectFactory.makeSymbol("CLEAR-REMOVE-TVA-CACHE-VALUE-CACHED"), SubLObjectFactory.makeSymbol("HTML-SET-ALL-RADIO-BUTTONS-SCRIPT"), SubLObjectFactory.makeSymbol("API-INPUT-PROTOCOL"), SubLObjectFactory.makeSymbol("SUBCOL-UNWIND-ALLOCATE-EXISTENTIAL-VARIABLE"),
				SubLObjectFactory.makeSymbol("NEW-LOCAL-TRANSCRIPT"), SubLObjectFactory.makeSymbol("INITIALIZE-DISJOINT-WITH-MODULE"), SubLObjectFactory.makeSymbol("GET-KBS-NAME"), SubLObjectFactory.makeSymbol("INCREMENT-PROOF-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PERFECT-ASPECT-PRED"), SubLObjectFactory.makeSymbol("EL-VARIABLE-HYPHEN-CHAR"), SubLObjectFactory.makeSymbol("SET-KCT-KB-LOADED"),
				SubLObjectFactory.makeSymbol("CLEAR-UNREPRESENTED-TERM-FHT"), SubLObjectFactory.makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-KB-HL-SUPPORTS-ITERATOR"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-5"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSETS-FOR-ENGLISH-WORD-STRING"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-COLLECTION-INSTANCES"), SubLObjectFactory.makeSymbol("NAT-FUNCTION-HL-SUPPORT"), SubLObjectFactory.makeSymbol("TEST-SET-CONTENTS"), SubLObjectFactory.makeSymbol("BATHYMETRIC-HEADER-ACCESS-PATH"), SubLObjectFactory.makeSymbol("GENERATION-FUNCTION-ALIST"), SubLObjectFactory.makeSymbol("HL-ACCESS-REMOTE?"),
				SubLObjectFactory.makeSymbol("GNDB-ACCESS-PATH"), SubLObjectFactory.makeSymbol("VIRTUAL-ASSERTION-COUNT"), SubLObjectFactory.makeSymbol("OPENCYC-KBS-FORTS-CONTRIBUTE-PRETTY-STRINGS"), SubLObjectFactory.makeSymbol("CLEAR-FORT-PASSES-CACHED-THCL-TESTS?"), SubLObjectFactory.makeSymbol("REMOVAL-MODULES-EXTERNAL"), SubLObjectFactory.makeSymbol("CZER-CREATE-NARTS?"),
				SubLObjectFactory.makeSymbol("DHTML-DOM-ATTRIBUTE-POSTAMBLE"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("CLEAR-INTENSIONALLY-INCOMPATIBLE-MT-GRAPH"), SubLObjectFactory.makeSymbol("HTFILE-MINIMAL-SPACE-REQUIRED-FOR-OBJECT"), SubLObjectFactory.makeSymbol("CLEAR-GET-REFORMULATION-SPECIFICATION-FROM-KB"),
				SubLObjectFactory.makeSymbol("NEW-THEORY-CHECKPOINT"), SubLObjectFactory.makeSymbol("RDF/XML-OLD-TERM-URIS"), SubLObjectFactory.makeSymbol("SERIALIZABLE-UNITS-OF-MEASURE-MATHML-INTERNAL"), SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-REGISTERED?"), SubLObjectFactory.makeSymbol("IS-FTEMPLATE-LOADING-SUPPORTING-ASK-BROWSABLE?"),
				SubLObjectFactory.makeSymbol("ALL-SYSTEM-PARAMETER-DEFINITIONS"), SubLObjectFactory.makeSymbol("NEW-DENSE-CONSTANT-ID-INDEX"), SubLObjectFactory.makeSymbol("NEW-MWP-PARSE"), SubLObjectFactory.makeSymbol("RESET-NECESSARY-DEFNS-REJECT?-METERS"), SubLObjectFactory.makeSymbol("CLEAR-NEGATION-PREDICATE-GRAPH"), SubLObjectFactory.makeSymbol("INITIALIZE-GEN-TEMPLATE-QUERY-SENTENCE-INDEX"),
				SubLObjectFactory.makeSymbol("KILL-DUPLICATE-NARTS"), SubLObjectFactory.makeSymbol("INITIALIZE-SKSI-KB-FEATURE"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-UNREPRESENTED-TERMS-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-RBP-OK-NAME-CACHED?"), SubLObjectFactory.makeSymbol("REMOVAL-ASSERTED-ARG1-BINARY-PREDS-COUNT-MIN-CODE-SUPPORT"),
				SubLObjectFactory.makeSymbol("CLEAR-FUNCTIONAL-PREDICATE-IN-ARG?"), SubLObjectFactory.makeSymbol("GET-SBHL-WHAT-MTS-MAP-FUNCTION"), SubLObjectFactory.makeSymbol("UPDATE-AGENDA-DAILY-GC-TIME"), SubLObjectFactory.makeSymbol("VALID-DIRECTIONS"), SubLObjectFactory.makeSymbol("GET-RED-VALUE-FOR-DEFAULT-JAVA-LIB"), SubLObjectFactory.makeSymbol("NEW-FHT-SUID-ITEM"),
				SubLObjectFactory.makeSymbol("RBP-UNTRACE-ALL-RULES"), SubLObjectFactory.makeSymbol("REALLY-RECOMPUTING-SKOLEM-DEFN?"), SubLObjectFactory.makeSymbol("DESTROY-ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("NEW-PPH-PHRASE-COUNT"), SubLObjectFactory.makeSymbol("BESTNLPHRASEOFSTRINGFN"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-TYPE-PROMPT"),
				SubLObjectFactory.makeSymbol("GET-SIMPLE-QUERY-DEFAULT-NL-MT"), SubLObjectFactory.makeSymbol("WNI-CLEAR-FUNCTION-CACHES"), SubLObjectFactory.makeSymbol("NART-REFORMULATOR-RULE-TABLE"), SubLObjectFactory.makeSymbol("CLEAR-FOLLOWUP-QUERY-MT-FOR-USER"), SubLObjectFactory.makeSymbol("CLEAR-STANFORD-PARSE"), SubLObjectFactory.makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE"),
				SubLObjectFactory.makeSymbol("ATTEMPT-TEMPORARY-PATCH-P"), SubLObjectFactory.makeSymbol("NL-TRIE-MULTI-WORD-ABBREVIATION-PREDS-INTERNAL"), SubLObjectFactory.makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS"), SubLObjectFactory.makeSymbol("CB-GLOB-RESET"), SubLObjectFactory.makeSymbol("AGENDA-SAVE-ASKED-QUERIES?"), SubLObjectFactory.makeSymbol("FSUT-PRIORITIZER-MIN-NICE-LEVEL"),
				SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-DEPENDENT-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("ENABLE-FULL-SENTENCE-CAE-INTERPRETATION"), SubLObjectFactory.makeSymbol("CFASL-INVALID-KB-HL-SUPPORT"), SubLObjectFactory.makeSymbol("PPH-NEW-PARAMETER-SNAPSHOT"), SubLObjectFactory.makeSymbol("WNI-MARK-EXISTING-MAPPED-TERMS"),
				SubLObjectFactory.makeSymbol("SKSI-WARN-ON-REGISTRATION-ERRORS?"), SubLObjectFactory.makeSymbol("INITIALIZE-NL-TRIE-OTHER-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-ALL-SBHL-TIME-DATA"), SubLObjectFactory.makeSymbol("NEW-GLOB-ID-STATE"), SubLObjectFactory.makeSymbol("OPTIMIZE-ASSERTION-TABLE"), SubLObjectFactory.makeSymbol("USER-ACTIONS-EMPTY?"),
				SubLObjectFactory.makeSymbol("INCREMENT-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("INIT-SME-LEXIFICATION-WIZARD"), SubLObjectFactory.makeSymbol("CLEAR-NART-HL-FORMULA-TABLE"), SubLObjectFactory.makeSymbol("RESET-SME-LEXIFICATION-PARAMETERS"), SubLObjectFactory.makeSymbol("FINALIZE-FORWARD-INFERENCE-METRICS-INFERENCE-INDEX"),
				SubLObjectFactory.makeSymbol("WNI-DELETE-ALL-CONCEPT-MATCH-HTML"), SubLObjectFactory.makeSymbol("RUN-AUXILIARY-OP?"), SubLObjectFactory.makeSymbol("NEW-FACT-SHEET-QUERY-DAEMON"), SubLObjectFactory.makeSymbol("NEW-FORWARD-INFERENCE-ENVIRONMENT"), SubLObjectFactory.makeSymbol("CLEAR-PAST-TENSE-FORM?"), SubLObjectFactory.makeSymbol("STORING-CYCLIFIER-WFF-RESULTS?"),
				SubLObjectFactory.makeSymbol("PPH-IRRELEVANCE-CHECK-MT"), SubLObjectFactory.makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS"), SubLObjectFactory.makeSymbol("MAKE-CONSTANT-EXTERNAL-ID"), SubLObjectFactory.makeSymbol("CLEAR-KB-STORE-ENTITY-MANAGER"), SubLObjectFactory.makeSymbol("REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS"), SubLObjectFactory.makeSymbol("PPH-REGISTERED-VARS"),
				SubLObjectFactory.makeSymbol("ASSERTION-MANAGER-MAINTAIN-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("CYC-REVISION-NUMBERS"), SubLObjectFactory.makeSymbol("FIX-QUERIES-THAT-PROBABLY-OUGHT-TO-BE-CONDITIONAL"), SubLObjectFactory.makeSymbol("GET-SBHL-CONSIDER-NODE-FN"), SubLObjectFactory.makeSymbol("SORT-TRANSCRIPT-RENAMES"), SubLObjectFactory.makeSymbol("CLEAR-DEFN-CYC-EVALUATE"),
				SubLObjectFactory.makeSymbol("CB-SERVER-SHOW-TRANSMIT-QUEUE?"), SubLObjectFactory.makeSymbol("MAYBE-INITIALIZE-CB-RTV-COLLECTIONS"), SubLObjectFactory.makeSymbol("USE-HEZBOLLAH-INDEXES"), SubLObjectFactory.makeSymbol("CLEAR-FUNCTION-CACHING-RESULTS"), SubLObjectFactory.makeSymbol("DISABLE-QUIRK"), SubLObjectFactory.makeSymbol("FACT-SHEET-DEFAULT-DOMAIN-MT"),
				SubLObjectFactory.makeSymbol("BACKWARD-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("NEW-WNI-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("CLEAR-PS-PARSE-VBAR-INT-CACHED"), SubLObjectFactory.makeSymbol("NL-REFORMULATE-DAEMON-RUN"), SubLObjectFactory.makeSymbol("CLEAR-QL-COLLECTION-BACKCHAIN-ENCOURAGED?"), SubLObjectFactory.makeSymbol("START-DAEMON-AND-STOP-RECEIVING"),
				SubLObjectFactory.makeSymbol("TRANSLATOR-OUTPUT-ENABLED-P"), SubLObjectFactory.makeSymbol("TEMPLATE-TOPIC-PROBLEM-STORE-HAS-BROWSABLE-INFERENCE?"), SubLObjectFactory.makeSymbol("INVALID-CONSTANT-NAMES"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-5"), SubLObjectFactory.makeSymbol("CYCL-QUERY-NAMESPACE"),
				SubLObjectFactory.makeSymbol("RELATION-INSTANCE-ALL-COLLECTION-COST-ESTIMATE"), SubLObjectFactory.makeSymbol("NEW-NEW-CONSTANTS-ITERATOR"), SubLObjectFactory.makeSymbol("ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING"), SubLObjectFactory.makeSymbol("CURRENTLY-ACTIVE-PROBLEM-STORE-CREATION-TIME"), SubLObjectFactory.makeSymbol("NLCONJUNCTIONFN"),
				SubLObjectFactory.makeSymbol("GET-QL-INDEX-UPDATE-PROCESS"), SubLObjectFactory.makeSymbol("STRATEGIC-HEURISTIC-RULE-HISTORICAL-UTILITY-ENABLED?"), SubLObjectFactory.makeSymbol("GET-CURRENT-TASK-PROCESSOR-INFO"), SubLObjectFactory.makeSymbol("DETERMINE-SBHL-MARK-BETWEEN-CONSIDER-FN"), SubLObjectFactory.makeSymbol("WITHIN-QUERY-TENSE-CZER-MODE?"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-15"), SubLObjectFactory.makeSymbol("NEXT-NART-ID"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-DISPLAYED-PROOF-STACK"), SubLObjectFactory.makeSymbol("PPH-TIMEOUT"), SubLObjectFactory.makeSymbol("CLEAR-OWL-NAME"), SubLObjectFactory.makeSymbol("POSSIBLY-ROLL-TO-ALLOW-TRANSMITTING"),
				SubLObjectFactory.makeSymbol("CREATE-SAMPLE-INVALID-NART"), SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-BACKEND-GLOBAL-TABLES"), SubLObjectFactory.makeSymbol("ALREADY-WITHIN-FI-OPERATION?"), SubLObjectFactory.makeSymbol("MAKE-NEW-RDF-GRAPH"), SubLObjectFactory.makeSymbol("CB-SPECIFY-INPUT"), SubLObjectFactory.makeSymbol("FORWARD-PROBLEM-STORE-PROPERTIES"),
				SubLObjectFactory.makeSymbol("NEW-ROOT-TACTICIAN-HEURISTICS"), SubLObjectFactory.makeSymbol("GATHER-FET-STATS"), SubLObjectFactory.makeSymbol("CLEAR-OWL-IMPORTER-CACHES"), SubLObjectFactory.makeSymbol("SKSI-VIOLATIONS"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-INTEGERS-ITERATOR"), SubLObjectFactory.makeSymbol("QUERY-SEARCH-TABLE-PREDS"),
				SubLObjectFactory.makeSymbol("MTS-CLEAR-TESTS"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-HEADER"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-MTS-CACHE-FOR-GENL-PREDS-AND-INVERSE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-12"), SubLObjectFactory.makeSymbol("INCREMENT-SBHL-GRAPH-SUCCESS-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-USER"),
				SubLObjectFactory.makeSymbol("MAINTAIN-UNREPRESENTED-TERM-INDEX-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("*TIME-POINT-SUBSUMED-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("MISSING-OLD-CONSTANT-INTERNAL-IDS"), SubLObjectFactory.makeSymbol("FINISH-TRIE-ANCESTOR-TRACKING"), SubLObjectFactory.makeSymbol("KBQ-CFASL-COMMON-SYMBOLS"),
				SubLObjectFactory.makeSymbol("MAKE-QUOTED-DEFN-FN-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("CURRENT-KB-HAS-PRETTY-STRINGS-ASSERTED?"), SubLObjectFactory.makeSymbol("FORTS-BEING-REMOVED"), SubLObjectFactory.makeSymbol("MAX-PRED-STRENGS"), SubLObjectFactory.makeSymbol("REMOVE-SCOPED-PARTITION"), SubLObjectFactory.makeSymbol("ASSERTIONS-WITH-MORE-THAN-ONE-BELIEF"),
				SubLObjectFactory.makeSymbol("GET-KB-OBJECT-MANAGERS"), SubLObjectFactory.makeSymbol("CB-SHOP-ENABLE-PLAN-CHECKING"), SubLObjectFactory.makeSymbol("CREATE-NEW-CYCL-QUERY-SPECIFICATION"), SubLObjectFactory.makeSymbol("EL-VARIABLE-PREFIX-STRING"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-FLOATS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-INDEX-ARG"),
				SubLObjectFactory.makeSymbol("CURRENT-SBHL-MARKING-SPACE-RESOURCE"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-8"), SubLObjectFactory.makeSymbol("INITIALIZE-AGENDA"), SubLObjectFactory.makeSymbol("AVAILABLE-DATABASES"), SubLObjectFactory.makeSymbol("ENSURE-GENERIC-EVENT-DISPATCHER-PROCESS-RUNNING"), SubLObjectFactory.makeSymbol("NEW-MUTED-NART-INDEX-ITERATOR"),
				SubLObjectFactory.makeSymbol("CLEAN-AND-REBUILD-ALL-DAMAGED-MODULES"), SubLObjectFactory.makeSymbol("NEW-ALEXANDRIA-ALL-VARIABLES-ITERATOR"), SubLObjectFactory.makeSymbol("UNSET-DATE-KB-LOADED"), SubLObjectFactory.makeSymbol("CLEAR-NL-TRIE-PREDS-OF-POS"), SubLObjectFactory.makeSymbol("WITHIN-SKSI-DATABASE-FUSION?"),
				SubLObjectFactory.makeSymbol("AVERAGE-FORWARD-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-2"), SubLObjectFactory.makeSymbol("CFASL-OUTPUT-RELOC-FOOTER"), SubLObjectFactory.makeSymbol("CB-KE-REVIEW-CREATORS"), SubLObjectFactory.makeSymbol("NEW-PROBLEM-STORE-POINTER"), SubLObjectFactory.makeSymbol("COUNT-NEW-KB-OBJECTS"),
				SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-ID"), SubLObjectFactory.makeSymbol("VECTOR-OF-POS-TAGS"), SubLObjectFactory.makeSymbol("CB-PROOF-CHECKER-RULES"), SubLObjectFactory.makeSymbol("RESET-COHERENCE-VIOLATIONS"), SubLObjectFactory.makeSymbol("SBHL-MODULE-PREMARKS-GATHER-NODES-P"), SubLObjectFactory.makeSymbol("INFERENCE-SPEC-PREDS-ARE-RELEVANT?"),
				SubLObjectFactory.makeSymbol("INITIALIZATION-FOR-PARTIAL-LIST-RESULTS"), SubLObjectFactory.makeSymbol("SHOW-OWL-EXPORT-USAGES"), SubLObjectFactory.makeSymbol("INSERT-TRANSMIT-OPTIONS"), SubLObjectFactory.makeSymbol("WITHIN-DISJUNCTION?"), SubLObjectFactory.makeSymbol("CLEAR-ALL-KB-REFORMULATOR-MODES"), SubLObjectFactory.makeSymbol("RESIZE-ALL-KB-OBJECT-MANAGER-LRU-CACHES"),
				SubLObjectFactory.makeSymbol("CLEAR-WNI-ALL-HYPERNYMS-HELPER"), SubLObjectFactory.makeSymbol("CURRENT-PARSING-CONSTRAINT-RANKINGS"), SubLObjectFactory.makeSymbol("HL-PROTOTYPE-COLLECTIONS"), SubLObjectFactory.makeSymbol("MISSING-CONSTANT-ID-SET"), SubLObjectFactory.makeSymbol("YESTERDAY"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-RULES-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("MAX-PRED-STRENGS"), SubLObjectFactory.makeSymbol("NO-ARG-FORMAT-AT-PARAMETER-STATE?"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-CONTENT-VARS-7"), SubLObjectFactory.makeSymbol("UNDECLARE-REMOTE-HL-STORE-IMAGE"), SubLObjectFactory.makeSymbol("INIT-OVERLAPS-START"), SubLObjectFactory.makeSymbol("RC-NEW-LHS"),
				SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-MEMOIZATION-STATE"), SubLObjectFactory.makeSymbol("INITIALIZE-GENLS-MODULE"), SubLObjectFactory.makeSymbol("DO-FORWARD-MODULES-LIST"), SubLObjectFactory.makeSymbol("INITIALIZE-LOCAL-CARDINALITIES"), SubLObjectFactory.makeSymbol("MODAL-WORDS"), SubLObjectFactory.makeSymbol("CLEAR-EXPAND-RDF-XML-URI-NAMESPACE-PREFIX"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-PUBLIC-FACT-SHEET-STRING-URL-MAPPINGS"), SubLObjectFactory.makeSymbol("TODAY-ABBREVIATION-STRING"), SubLObjectFactory.makeSymbol("META-SPLIT-CRITERIA"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-1"), SubLObjectFactory.makeSymbol("CLEAR-RDF-FIND-BASE-URI"), SubLObjectFactory.makeSymbol("WFF-PROPERTIES"),
				SubLObjectFactory.makeSymbol("SPECIFIC-PREFERENCE-MODULE-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-ALL-KB-MODAL-OPERATORS"), SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-QUOTED-DEFN-METERS"), SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-TERMS"), SubLObjectFactory.makeSymbol("RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO"),
				SubLObjectFactory.makeSymbol("CLEAR-SKSI-CONTENT-MTS-WITH-REGISTERED-MODULE"), SubLObjectFactory.makeSymbol("L2R-DOCUMENT-SENTENCE-FINDER-KBQ-INTERNAL"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULE-STATISTICS-RECEIVED-FILENAME-LOAD-HISTORY"), SubLObjectFactory.makeSymbol("CACHE-ALL-SYMBOL-SXHASH-EXTERNAL-CODES"), SubLObjectFactory.makeSymbol("LOAD-REMOTE-OPERATIONS"),
				SubLObjectFactory.makeSymbol("GET-SBHL-COMBINE-FN"), SubLObjectFactory.makeSymbol("CLEAR-STORED-OPERATIONS"), SubLObjectFactory.makeSymbol("SBHL-TEMPORAL-INCREMENT"), SubLObjectFactory.makeSymbol("NEXT-TRANSCRIPT-DIRECTORY"), SubLObjectFactory.makeSymbol("WNI-MAPPED-TERMS"), SubLObjectFactory.makeSymbol("NEW-CONCEPTUALLY-RELATED-ANSWER-TABLE"),
				SubLObjectFactory.makeSymbol("REGISTER-EBMT"), SubLObjectFactory.makeSymbol("INITIALIZE-HALO-LEVIATHAN-QUERIES"), SubLObjectFactory.makeSymbol("SET-TO-TRANSMIT-ONLY"), SubLObjectFactory.makeSymbol("FIX-FORTS-WITH-GENLS-BUT-NOT-COLLECTIONS"), SubLObjectFactory.makeSymbol("ALL-LEXICON-STRING-PREDICATES"), SubLObjectFactory.makeSymbol("CLEAR-TAXONOMY-GENERATE-NON-SINGULAR-PHRASE"),
				SubLObjectFactory.makeSymbol("TVA-PRECOMPUTES-SKSI-CLOSURES?"), SubLObjectFactory.makeSymbol("SKSI-SUPPORTED-BROWSING-REGISTERED?"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-UPDATE-PROCEDURE"), SubLObjectFactory.makeSymbol("BESTNLPHRASEOFSTRINGFN"), SubLObjectFactory.makeSymbol("CYC-REVISION-NUMBERS"), SubLObjectFactory.makeSymbol("SKSI-AUTOMATIC-COST-ESTIMATE-UPDATE-ENABLED?"),
				SubLObjectFactory.makeSymbol("ENSURE-KB-MODIFICATIONS-EVENT-DISPATCHER-RUNNING"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-MAINTAIN-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?"), SubLObjectFactory.makeSymbol("SOME-SKSI-REMOVAL-MODULE-REGISTERED?"), SubLObjectFactory.makeSymbol("HTML-META-NO-ROBOTS"),
				SubLObjectFactory.makeSymbol("REMOVAL-MODULES-CONJUNCTIVE"), SubLObjectFactory.makeSymbol("CLEAR-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN"), SubLObjectFactory.makeSymbol("CYCLIFIER-CATCH-ERRORS?"), SubLObjectFactory.makeSymbol("INITIALIZE-HTTP-RESTRICTED-FUNCTIONS"), SubLObjectFactory.makeSymbol("NL-GENERATION-FORT-CACHE-DATA-GENERATED?"),
				SubLObjectFactory.makeSymbol("ALL-NAKED-IN-PROGRESS-TERMS"), SubLObjectFactory.makeSymbol("REBUILD-RULE-CONNECTIVITY-GRAPH"), SubLObjectFactory.makeSymbol("MAKE-ISOMORPHIC-SENTENCES-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("DONT-RECORD-OPERATIONS-LOCALLY"), SubLObjectFactory.makeSymbol("VERIFY-CYC-BUILD"), SubLObjectFactory.makeSymbol("CONSOLE-TASK-PROCESSORS-INITIALIZED-P"),
				SubLObjectFactory.makeSymbol("ARETE-ENABLE-GLOBAL-LOGGING"), SubLObjectFactory.makeSymbol("FOAF-NAMESPACE"), SubLObjectFactory.makeSymbol("VERBS-NEED-SF"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-MIDDLE-UPPER-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("REMOVE-PPH-POSSESSIVE-PREDS"), SubLObjectFactory.makeSymbol("UIA-CAN-TREAT-COMMENTS-AS-MUMBLING?"),
				SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-ISA-SUBCOL-UNWIND-TEMPLATE-MAP"), SubLObjectFactory.makeSymbol("INIT-BIRTH-DATE"), SubLObjectFactory.makeSymbol("GET-RED-KEY-FOR-DEFAULT-JAVA-VM"), SubLObjectFactory.makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT"),
				SubLObjectFactory.makeSymbol("GET-SBHL-LINK-MT"), SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-DEFN-METERS"), SubLObjectFactory.makeSymbol("CLEAR-TRANSFORMATION-MODULE-TESTS"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-NUMBER-INDEXICAL"), SubLObjectFactory.makeSymbol("GET-GKE-QUANTIFIER-RANGES"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-DEREGISTER-ALL-PARSERS"),
				SubLObjectFactory.makeSymbol("MAPPING-FUNCALL-INT"), SubLObjectFactory.makeSymbol("CYC-RESEARCHCYC-FEATURE"), SubLObjectFactory.makeSymbol("SKSI-MODULES-BY-SKS-GET-SKSES"), SubLObjectFactory.makeSymbol("GNUPLOT-AVAILABLE?"), SubLObjectFactory.makeSymbol("CLEAR-CMLS-DECODING-TABLE"), SubLObjectFactory.makeSymbol("NOTE-OWL-IMPORT-SECTION-DONE"),
				SubLObjectFactory.makeSymbol("REMOVAL-MODULES-EXTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-PS-GET-CYCLS-AND-CONSTRAINTS-FOR-PHRASE-CACHED"), SubLObjectFactory.makeSymbol("SBHL-WHAT-MTS-GOAL-FINAL-MT-PATHS"), SubLObjectFactory.makeSymbol("INVALID-FAST-FHT-OPTIMIZATION-MODE"), SubLObjectFactory.makeSymbol("SBHL-PRIMARY-WHAT-MTS-SPACES"),
				SubLObjectFactory.makeSymbol("COUNTRIES-TO-REGIONS"), SubLObjectFactory.makeSymbol("NEW-HAPPINESS-INDEX"), SubLObjectFactory.makeSymbol("CLEAR-KB-TEXT-COMPACT-HL-EXTERNAL-ID-STRING-CACHED"), SubLObjectFactory.makeSymbol("NEW-ACCESS-PATH"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-2"), SubLObjectFactory.makeSymbol("INCREMENT-PROBLEM-STORE-HISTORICAL-COUNT"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-3"), SubLObjectFactory.makeSymbol("ENSURE-TEMPLATE-RULES-MASTER-INDEX"), SubLObjectFactory.makeSymbol("EL-VARIABLE-PREFIX-CHAR"), SubLObjectFactory.makeSymbol("CLEAR-QUERY-LIBRARY-QUERY-SEARCH-FACT-SHEET-LINKS-ENABLED?"), SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-CONTENT-COMPLETELY-CACHED?"),
				SubLObjectFactory.makeSymbol("CLEAR-CAE-DEFAULT-PARSING-MT"), SubLObjectFactory.makeSymbol("GET-RED-EXTERNAL-ELEMENT"), SubLObjectFactory.makeSymbol("MAKE-KB-HL-SUPPORT-ID"), SubLObjectFactory.makeSymbol("TOTAL-SIZE-OF-ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("MAKE-DEFN-FN-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("TRANSLATOR-CURRENT-METHOD"),
				SubLObjectFactory.makeSymbol("ARGUMENT-TYPE-HIERARCHY"), SubLObjectFactory.makeSymbol("NON-WFF-ERROR"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-BLIST"), SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-INSTANTIATED-HAYSTACKS-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-TRANSFORMATION-RULE-STATISTICS-FILENAME-LOAD-HISTORY"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-9"), SubLObjectFactory.makeSymbol("KBS-DEDUCTION-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-ALL-ARG-TYPE-PREDICATE-CACHES"), SubLObjectFactory.makeSymbol("KBS-KILL-UNRUNNABLE-KB-QUERIES"), SubLObjectFactory.makeSymbol("GET-SQS-LIST-QUEUES-COMMAND"), SubLObjectFactory.makeSymbol("DONT-METER-NART-HL-FORMULA-SWAP-TIME"),
				SubLObjectFactory.makeSymbol("FORBIDDEN-KB-COVERING-COLLECTIONS-SET"), SubLObjectFactory.makeSymbol("GET-GKE-QUANTIFIER-RANGES"), SubLObjectFactory.makeSymbol("TRANSFORMATION-MODULES-WITH-TRANSFORMATION-MODULE-TESTS"), SubLObjectFactory.makeSymbol("GET-NEXT-PROOF-VIEW-ID"), SubLObjectFactory.makeSymbol("CLEAR-QUA-EXPANSION-CYCLS"), SubLObjectFactory.makeSymbol("GET-GKE-QUANTIFIERS"),
				SubLObjectFactory.makeSymbol("INERT-RULES"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-MEMORY-MAPPED?"), SubLObjectFactory.makeSymbol("SBHL-GRAPH-ATTEMPT-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("GET-DEFAULT-SENTENCE-STRING-LEXICON"), SubLObjectFactory.makeSymbol("DO-NARTS-TABLE"), SubLObjectFactory.makeSymbol("MOST-RECENT-PROBLEM-STORE-SUID"),
				SubLObjectFactory.makeSymbol("GET-SKSI-SMT-MODE"), SubLObjectFactory.makeSymbol("RC-ACT-NEW-STATE"), SubLObjectFactory.makeSymbol("INITIALIZE-ASSERTION-HL-STORE-CACHE"), SubLObjectFactory.makeSymbol("ENSURE-DELAYED-PROCESSOR-META-DAEMON-RUNNING"), SubLObjectFactory.makeSymbol("NEW-ASSERTION-CHECKPOINT"), SubLObjectFactory.makeSymbol("COMPUTE-ASSERTION-ONTOLOGY-LAYER-STATISTICS"),
				SubLObjectFactory.makeSymbol("PARTITION-CREATE-INVALID-NART"), SubLObjectFactory.makeSymbol("INFERENCE-CURRENT-SENSE"), SubLObjectFactory.makeSymbol("OWL-EXPORT-DEFAULT-NAMESPACE"), SubLObjectFactory.makeSymbol("GENERIC-HL-STORAGE-MODULES"), SubLObjectFactory.makeSymbol("NEW-KB-CHECKPOINT"), SubLObjectFactory.makeSymbol("CB-USE-ASSERTION-END-DATE-FILTER"),
				SubLObjectFactory.makeSymbol("NEW-HAPPINESS-INDEX"), SubLObjectFactory.makeSymbol("SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR"), SubLObjectFactory.makeSymbol("ARG-N-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("FACT-SHEET-BASE-URL-PLACEHOLDER"), SubLObjectFactory.makeSymbol("SBHL-ENCOUNTERED-DIFFICULT-NAUT-MT-GENERATOR"), SubLObjectFactory.makeSymbol("MAKE-NEW-RDF-GRAPH"),
				SubLObjectFactory.makeSymbol("NOTE-SHOULD-PROPAGATE-REWRITE-OF-CNF"), SubLObjectFactory.makeSymbol("GET-SBHL-GOAL-NODE"), SubLObjectFactory.makeSymbol("SC-STORAGE-MT"), SubLObjectFactory.makeSymbol("OWL-PROPERTY-ELEMENT-NAMES-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-LEXICAL-VARS"), SubLObjectFactory.makeSymbol("DEREGISTER-CYCLIFY-PARSER"),
				SubLObjectFactory.makeSymbol("CLEAR-ALL-API-WIDGETS-CACHES"), SubLObjectFactory.makeSymbol("NEW-PPH-API-PARAM-ITERATOR"), SubLObjectFactory.makeSymbol("BACKWARD-PROBLEM-STORE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CLEAR-WEB-CONCEPTUALLY-RELATED"), SubLObjectFactory.makeSymbol("REMOVE-COUNTRIES-TO-REGIONS"),
				SubLObjectFactory.makeSymbol("PREDICATES-WITH-SPECIFIC-HL-STORAGE-MODULES"), SubLObjectFactory.makeSymbol("ENTITY-MENTIONS-PROOF-POSSIBLE?-INTERNAL"), SubLObjectFactory.makeSymbol("MULTI-SKOLEM-SKOLEMS"), SubLObjectFactory.makeSymbol("JAVA-BACKEND-COMPUTE-PACKAGE-PREFIX"), SubLObjectFactory.makeSymbol("CYCL-UPTIME"), SubLObjectFactory.makeSymbol("REBUILD-COMPUTABLE-BUT-NOT-DUMPABLE-YET"),
				SubLObjectFactory.makeSymbol("CLEAR-CODE-MAPPING-SKS-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-SCALAR-FUNCTION?"), SubLObjectFactory.makeSymbol("CB-SHOW-RECENT-CONSTANTS-CATEGORIZED"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-RAW-CONSTANTS"), SubLObjectFactory.makeSymbol("CITIES-TO-COUNTRIES"), SubLObjectFactory.makeSymbol("CLEAR-CONSTANT-COMPLETION-TABLE"),
				SubLObjectFactory.makeSymbol("COMPILE-KB-HEALTH-STATISTICS"), SubLObjectFactory.makeSymbol("HTML-PROBLEM-LAYOUT-VISUALIZATION-PAGE-CSS"), SubLObjectFactory.makeSymbol("CLEAR-ALL-API-WIDGETS-CACHES"), SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-DOCUMENT-ANNOTATION-LEARNING-LEXICON"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-SUPPORTED-BROWSING-CACHES"),
				SubLObjectFactory.makeSymbol("WITHIN-UNASSERT?"), SubLObjectFactory.makeSymbol("GET-ILP-EXPORT-OUTPUT-MODES-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("CLEAR-VARIABLE-ORDER-COLLECTION?"), SubLObjectFactory.makeSymbol("PARTITION-SCOPE"), SubLObjectFactory.makeSymbol("FACT-SHEET-DEFAULT-DOMAIN-MT-INTERNAL"), SubLObjectFactory.makeSymbol("CURRENT-MT-RELEVANCE-MT-CONTEXT"),
				SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-META-DAEMON-RUN"), SubLObjectFactory.makeSymbol("GENL-ARGS-TO-QUERIES"), SubLObjectFactory.makeSymbol("PROCESS-BLOCK"), SubLObjectFactory.makeSymbol("CLEAR-MODAL-WORDS"), SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-BACKEND-FUNCTION-TABLES"), SubLObjectFactory.makeSymbol("INSERT-KB-NOT-CURRENT-MESSAGE"),
				SubLObjectFactory.makeSymbol("IS-JAVA-BACKEND-LOGGING-ACTIVE?"), SubLObjectFactory.makeSymbol("RULES-THAT-TOTALLY-SUCK"), SubLObjectFactory.makeSymbol("RESET-NEW-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS"), SubLObjectFactory.makeSymbol("LOCAL-HL-TRANSCRIPT-VERSION"), SubLObjectFactory.makeSymbol("REMOVAL-ASK-ANSWER-COUNT"), SubLObjectFactory.makeSymbol("MWP-RULE-CONSTRAINT-TABLE-INIT"),
				SubLObjectFactory.makeSymbol("GET-SBHL-PREDICATES-INT"), SubLObjectFactory.makeSymbol("CLEAR-RBP-WFF-TYPE-LEVEL-ARG-NUMS-FOR-FN"), SubLObjectFactory.makeSymbol("CLEAR-LATE-ASSERTIONS"), SubLObjectFactory.makeSymbol("GET-SUBCOLLECTION-PATTERNS-FROM-KB"), SubLObjectFactory.makeSymbol("MAKE-NEW-SBHL-GRAPH"), SubLObjectFactory.makeSymbol("GET-KB-UNREPRESENTED-TERM-RAW-NEW-SPACE-SIZE"),
				SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-CRIPPLED-HAYSTACKS-INTERNAL"), SubLObjectFactory.makeSymbol("ENABLE-HLMTS"), SubLObjectFactory.makeSymbol("LOCAL-TRANSCRIPT-VERSION"), SubLObjectFactory.makeSymbol("DECLARE-GEN-TEMPLATE-STORE-NOT-KNOWN-STALE"), SubLObjectFactory.makeSymbol("L2R-SENTENCE-STRING-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("INITIALIZE-GENLS-MODULE"),
				SubLObjectFactory.makeSymbol("MAKE-DEFAULT-CONCEPT-TAGGER-LEXICON"), SubLObjectFactory.makeSymbol("WITHIN-SKSI-SQL-CONNECTION-RESOURCING?"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-CORBA-MODULES"), SubLObjectFactory.makeSymbol("GET-FILE-BACKED-KB-HL-SUPPORT-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("SBHL-SUSPEND-NEW-SPACES?"),
				SubLObjectFactory.makeSymbol("FACT-SHEET-PPH-DEMERIT-CUTOFF"), SubLObjectFactory.makeSymbol("CYC-KBI-FEATURE"), SubLObjectFactory.makeSymbol("XREF-REFERENCE-SCOPE"), SubLObjectFactory.makeSymbol("RESET-NAT-ISA-LINKS"), SubLObjectFactory.makeSymbol("ALLOW-DOCUMENT-TAGGER-RESTRICTED-WEB-SERVICE"), SubLObjectFactory.makeSymbol("CLEAR-FRAME-ARG-OF-PRED-CACHED-INT"),
				SubLObjectFactory.makeSymbol("WITHIN-ASSERTIVE-WFF-FORWARD-INFERENCE?"), SubLObjectFactory.makeSymbol("DETECT-CYC-PRODUCT"), SubLObjectFactory.makeSymbol("ABBREVIATION-PREDICATES"), SubLObjectFactory.makeSymbol("SET-CYC-SECURE-KB-LOADED"), SubLObjectFactory.makeSymbol("INCREMENT-DEPENDENT-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("META-SPLIT-CRITERIA"),
				SubLObjectFactory.makeSymbol("AGENDA-LOGS-ERRORS?"), SubLObjectFactory.makeSymbol("UNSET-KCT-KB-LOADED"), SubLObjectFactory.makeSymbol("CLEAR-PSP-CATEGORY-FROM-FRAME"), SubLObjectFactory.makeSymbol("DOLLAR-SIGN-PLUS-NUMBER-FST"), SubLObjectFactory.makeSymbol("CLEAR-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION"), SubLObjectFactory.makeSymbol("CYCL-FOR-SUBL-RULE-SUPPORT"),
				SubLObjectFactory.makeSymbol("SF-NEXT-ID"), SubLObjectFactory.makeSymbol("RESIZE-ALL-KB-OBJECT-MANAGER-LRU-CACHES"), SubLObjectFactory.makeSymbol("CB-OPTIONS-HISTORY-AND-BROWSER-TOOL"), SubLObjectFactory.makeSymbol("REMOVE-L2R-SENTENCE-STRING-NUMBER-INDEXICAL"), SubLObjectFactory.makeSymbol("DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE"),
				SubLObjectFactory.makeSymbol("REMOVE-SCOPED-PARTITION"), SubLObjectFactory.makeSymbol("CLEAR-MAKE-FET-GLOSS-FOR-ARG2-OF-BINARY-PRED"), SubLObjectFactory.makeSymbol("PSP-AGENT"), SubLObjectFactory.makeSymbol("JAVA-LINK-DEBUG-MODE?"), SubLObjectFactory.makeSymbol("CLEAR-PSP-SYNTACTIC-CONSTRAINT-TYPES"), SubLObjectFactory.makeSymbol("CLEAR-PPH-VAR-TYPES"),
				SubLObjectFactory.makeSymbol("SCOOP-FETCH-NEXT-OUTGOING-MESSAGE-PACKET"), SubLObjectFactory.makeSymbol("COMPILE-KB-HEALTH-STATISTICS"), SubLObjectFactory.makeSymbol("FORTS-TYPED-SIBLING-DISJOINT-COLLECTION"), SubLObjectFactory.makeSymbol("PPH-LINK-UNLINKED-PHRASES-TO-MATRIX-ARG0?"), SubLObjectFactory.makeSymbol("FACT-SHEET-PARAPHRASE-SOFT-TIMEOUT-TIME-REACHED?"),
				SubLObjectFactory.makeSymbol("SOFTWARE-VERSION"), SubLObjectFactory.makeSymbol("INITIALIZE-JAVA-BACKEND-GLOBAL-TABLES"), SubLObjectFactory.makeSymbol("ABORT-AGENDA"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-PERSONAL-SECTION"), SubLObjectFactory.makeSymbol("RDF-PARSER-TEST-FILES"), SubLObjectFactory.makeSymbol("DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE"),
				SubLObjectFactory.makeSymbol("PPH-BREAK-ON-ERROR?"), SubLObjectFactory.makeSymbol("MT-DIMENSION-TYPES"), SubLObjectFactory.makeSymbol("CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("DELETED-ASSERTION-ID-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-RL-MODULE-STORE-IF-CORRUPT"), SubLObjectFactory.makeSymbol("INITIALIZE-ARITIES"),
				SubLObjectFactory.makeSymbol("CLEAR-DEFAULT-MEDICAL-TAGGING-LEXICON"), SubLObjectFactory.makeSymbol("MAYBE-EVAL-FORMS"), SubLObjectFactory.makeSymbol("NEW-MWP-PARSE-SET"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-4"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-NP"), SubLObjectFactory.makeSymbol("GET-BTREE"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-GKE-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("REGISTER-ALL-SKSI-CORBA-MODULES"), SubLObjectFactory.makeSymbol("CLEAR-PRED-ARGS-CONSTRAINTS-ACCESSED-IN-SPACES?"), SubLObjectFactory.makeSymbol("SCOPE-KB-DIFF-DEDUCTIONS"), SubLObjectFactory.makeSymbol("PPH-PHRASE-ID-INDEX"), SubLObjectFactory.makeSymbol("ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED"),
				SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-14"), SubLObjectFactory.makeSymbol("SKSI-MODULES-ALLOWED-IN-CURRENT-INFERENCE?"), SubLObjectFactory.makeSymbol("CLEAR-ASSERTION-CONTENT-TABLE"), SubLObjectFactory.makeSymbol("WNI-LIST-GLOSSES-FOR-EVENT-SYNSETS"), SubLObjectFactory.makeSymbol("TVA-VAR-ARGNUMS"), SubLObjectFactory.makeSymbol("PLURALPARAPHRASEFN"),
				SubLObjectFactory.makeSymbol("GET-HTTP-LOGGING-SEQUENCE-GENERATOR"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-LEXICAL-ACCESS-FUNCTIONS"), SubLObjectFactory.makeSymbol("CYC-MEMORY-HOGS-DATA"), SubLObjectFactory.makeSymbol("CLEAR-EMPLOYEE-EMPLOYERS-AND-MTS"), SubLObjectFactory.makeSymbol("GET-FILE-BACKED-ASSERTION-ID-THRESHOLD"),
				SubLObjectFactory.makeSymbol("GET-KBS-PREREMOVED-ASSERTIONS"), SubLObjectFactory.makeSymbol("TKB-KBS-SAVE-TERMS-WITHOUT-ISAS"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-DEFN"), SubLObjectFactory.makeSymbol("INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CB-CLEAR-CURRENT-FORMULA-TEMPLATE-EDITING-PROBLEMS"),
				SubLObjectFactory.makeSymbol("PREPARE-PROOF-QUERY-PROPERTIES"), SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-PROXY-SERVER"), SubLObjectFactory.makeSymbol("CLEAR-REMOTE-HL-STORE-CONNECTION-POOL"), SubLObjectFactory.makeSymbol("PHRASEFORMFN"), SubLObjectFactory.makeSymbol("NEXT-UNREPRESENTED-TERM-SUID"), SubLObjectFactory.makeSymbol("CLEAR-CONSTANT-INDEX-SWAP-TIME"),
				SubLObjectFactory.makeSymbol("CLEAR-CACHED-LEXICAL-ARG-TYPES"), SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-FACT-STATUS-INT"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-13"), SubLObjectFactory.makeSymbol("CLEAR-NER-CLUSTERS"), SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-ASSERTIONS-ITERATOR-STATE"),
				SubLObjectFactory.makeSymbol("BUILD-FACT-SHEET-DEFAULT-LANGUAGE-MT-INTERNAL"), SubLObjectFactory.makeSymbol("LEVIATHAN-HAYSTACK-ALLOWED-RULES"), SubLObjectFactory.makeSymbol("BESTNLSTRINGFORSENTENCEFN"), SubLObjectFactory.makeSymbol("GET-NIMD-TASK-STRING-DENOTATION-MAPPER-LEXICON"), SubLObjectFactory.makeSymbol("TMS-ANY-ASSERTION-BEING-REMOVED?"),
				SubLObjectFactory.makeSymbol("CLEAR-RKF-IRRELEVANT-PRECISION-SUGGESTION-FORTS-FROM-FORT"), SubLObjectFactory.makeSymbol("CYC-TASK-SCHEDULER-KB-LOADED-P"), SubLObjectFactory.makeSymbol("SBHL-TEMPORALITY-SEARCH-CHECKS-NODES-IN-TARGET-SPACE-P"), SubLObjectFactory.makeSymbol("LILLIPUT-FULLY-INSTANTIATE-RANDOM-QUERY"), SubLObjectFactory.makeSymbol("ASSERTED-ARGUMENT-TOKENS"),
				SubLObjectFactory.makeSymbol("WITHIN-AGENDA"), SubLObjectFactory.makeSymbol("QUERY-STATIC-PROPERTIES-FROM-LEGACY-ASK-PARAMETERS"), SubLObjectFactory.makeSymbol("REMOVE-SIMPLE-BINARY-PROPERTY-PATTERNS"), SubLObjectFactory.makeSymbol("ALL-ARG-CONSTRAINT-PREDS"), SubLObjectFactory.makeSymbol("GC-EPHEMERAL"), SubLObjectFactory.makeSymbol("CLEAR-OBJECT-TO-STRING"),
				SubLObjectFactory.makeSymbol("INITIAL-PROCESS"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-CONTEXT"), SubLObjectFactory.makeSymbol("FACT-SHEET-DATA-PATH"), SubLObjectFactory.makeSymbol("CYC-VERSIONED-WORLD-NAME"), SubLObjectFactory.makeSymbol("PREVIOUS-QUERY-INFERENCE"), SubLObjectFactory.makeSymbol("REBUILD-RULE-SET"),
				SubLObjectFactory.makeSymbol("PREVIOUS-OWL-EXPORT-VERSION-DATES"), SubLObjectFactory.makeSymbol("INITIALIZE-ACQUAINT-HIGHLY-RELEVANT-RANKINGS"), SubLObjectFactory.makeSymbol("INITIALIZE-AT-CACHE"), SubLObjectFactory.makeSymbol("RESET-API-WIDGET-SESSIONS-RESOURCES"), SubLObjectFactory.makeSymbol("PPH-GENERIC-POS-PREDS"), SubLObjectFactory.makeSymbol("SBHL-FALSE-SEARCH-P"),
				SubLObjectFactory.makeSymbol("SUCCESSFUL-BACKWARD-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("KBS-FORT-STATE-VALID?"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-UPDATE-PROCEDURE"), SubLObjectFactory.makeSymbol("INITIALIZE-KB-STATE-HASHES"), SubLObjectFactory.makeSymbol("MISSING-OLD-DEDUCTION-IDS"), SubLObjectFactory.makeSymbol("INTERRUPT-GENERIC-SEARCH"),
				SubLObjectFactory.makeSymbol("CB-HELP-KEYWORDS"), SubLObjectFactory.makeSymbol("CLEAR-RL-MODULE-STORE"), SubLObjectFactory.makeSymbol("SKSI-REFORMULATE-RECURSION-LIMIT-EXCEEDED?"), SubLObjectFactory.makeSymbol("KCT-KB-LOADED-P"), SubLObjectFactory.makeSymbol("CB-PARTITION-LOAD-FILENAME-SECTION"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-NOTE-REVISIONS"),
				SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-ALL-INSTANCES-IF-TKB-FORT"), SubLObjectFactory.makeSymbol("GET-INTERNAL-RUN-TIME"), SubLObjectFactory.makeSymbol("HL-TRANSCRIPT-QUEUE-SIZE"), SubLObjectFactory.makeSymbol("*RAL-SUB-SITUATIONS-FROM-SUB-SITUATION-TYPES-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("GET-SBHL-MAP-FUNCTION"),
				SubLObjectFactory.makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER"), SubLObjectFactory.makeSymbol("SBHL-OBJECT-TYPE-CHECKING-P"), SubLObjectFactory.makeSymbol("CLEAR-MATCH-RECURSIVE-TEMPLATE-ITEM"), SubLObjectFactory.makeSymbol("FACT-SHEET-HOURLY-REPORTING-ON?"), SubLObjectFactory.makeSymbol("SYNCHRONIZE-CONSTANTS-WITH-LOCAL-HL-STORE"), SubLObjectFactory.makeSymbol("SET-RTP-KB-LOADED"),
				SubLObjectFactory.makeSymbol("NEW-CACHE-ACCESS-PATH"), SubLObjectFactory.makeSymbol("GET-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR"), SubLObjectFactory.makeSymbol("SHOW-HAYSTACK-STATISTICS"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-3"), SubLObjectFactory.makeSymbol("CLEAR-VBAR-TEMPLATE-CATEGORY?"), SubLObjectFactory.makeSymbol("CLEAR-SKSI-GET-DATUM-VAR"),
				SubLObjectFactory.makeSymbol("CLEAR-ALL-HTML-STATE"), SubLObjectFactory.makeSymbol("UIMMA-DEFAULT-DOMAIN-MT"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-NARTS"), SubLObjectFactory.makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS"), SubLObjectFactory.makeSymbol("CB-TD-SEARCH-GUTS"), SubLObjectFactory.makeSymbol("CLEAR-COMPUTE-TPTP-QUERY-INDEX-NUMBER"),
				SubLObjectFactory.makeSymbol("PREDICATES-WITH-PARSE-TREE-SUPPORT-IN-SOME-MT-INTERNAL"), SubLObjectFactory.makeSymbol("REBUILD-ARITY-CACHE"), SubLObjectFactory.makeSymbol("CLEAR-ALL-RECEIVED-TRANSFORMATION-RULE-STATISTICS"), SubLObjectFactory.makeSymbol("LOCAL-EXPERIENCE-TRANSCRIPT"), SubLObjectFactory.makeSymbol("CITIES-TO-COUNTRIES"),
				SubLObjectFactory.makeSymbol("TEST-PESSIMIZE-ID-INDEX"), SubLObjectFactory.makeSymbol("PRE-PERCENT-NOT-WFF"), SubLObjectFactory.makeSymbol("RESET-API-WIDGET-SESSIONS-RESOURCES"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-8"), SubLObjectFactory.makeSymbol("CLEAR-MAKE-SBHL-GRAPH-LINK-GENLS"), SubLObjectFactory.makeSymbol("CB-OPTIONS-TERM-DISPLAY"),
				SubLObjectFactory.makeSymbol("NEW-FORT-ID-INDEX-CONSTANTS"), SubLObjectFactory.makeSymbol("DO-PRERUN-KBS-FNS"), SubLObjectFactory.makeSymbol("CB-DELETE-ALL-PROOF-CHECKER-RULES"), SubLObjectFactory.makeSymbol("RECLASSIFY-SOMEWHERE-CACHED-PREDS"), SubLObjectFactory.makeSymbol("KBS-IMAGE-CLEANUP"), SubLObjectFactory.makeSymbol("NEW-TVA-CACHE-ENTRY"),
				SubLObjectFactory.makeSymbol("DEDUCTION-MANAGER-MEMORY-MAPPED?"), SubLObjectFactory.makeSymbol("GATHER-ALL-LIFTING-RULES"), SubLObjectFactory.makeSymbol("FORGET-USELESS-NARTS-WRT-OPENCYC-UNTIL-QUIESCENCE"), SubLObjectFactory.makeSymbol("USE-RULE-SET?"), SubLObjectFactory.makeSymbol("DIAGNOSE-ALL-SKOLEMS"), SubLObjectFactory.makeSymbol("REPORT-CFASL-INVALID-OBJECTS?"),
				SubLObjectFactory.makeSymbol("UNBOUND-RULE-INDEX"), SubLObjectFactory.makeSymbol("GET-ALL-FORMULA-TEMPLATE-DEFINITION-MTS"), SubLObjectFactory.makeSymbol("L2R-GARBAGE-COLLECTION-QUERY-SPECS"), SubLObjectFactory.makeSymbol("GET-PARSING-FAITHFULNESS-FILTER-TYPES"), SubLObjectFactory.makeSymbol("GET-RTP-KB-PARSE-NODE"), SubLObjectFactory.makeSymbol("NLCONJUNCTIONFN"),
				SubLObjectFactory.makeSymbol("HTML-OPTION-SELECTED"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-SBHL-ITERATOR-SHELL"), SubLObjectFactory.makeSymbol("SBHL-SECONDARY-WHAT-MTS-SPACES"), SubLObjectFactory.makeSymbol("CB-MISSING-ICON"), SubLObjectFactory.makeSymbol("SBHL-CONTINUE-SEARCH-PATH"), SubLObjectFactory.makeSymbol("ALL-CORE-UNION-CONSTANTS"),
				SubLObjectFactory.makeSymbol("INDEXICAL-HYPOTHESIS-MT"), SubLObjectFactory.makeSymbol("GET-FILE-BACKED-NART-INTERNAL-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("KB-HL-SUPPORT-USAGE-COUNTS-ENABLED-P"), SubLObjectFactory.makeSymbol("CONFIGURE-APP-COLORS"), SubLObjectFactory.makeSymbol("INITIALIZE-PENNTAG-PHRASE-CATEGORIES"), SubLObjectFactory.makeSymbol("INITIALIZE-NEGATION-MT-MODULE"),
				SubLObjectFactory.makeSymbol("SEND-LOCAL-TRANSCRIPT"), SubLObjectFactory.makeSymbol("SWAP-OUT-ALL-PRISTINE-KB-OBJECTS"), SubLObjectFactory.makeSymbol("REBUILD-NON-TRUE-ASSERTION-TV-CACHE"), SubLObjectFactory.makeSymbol("REMOVE-LEADERS-TO-GROUPS"), SubLObjectFactory.makeSymbol("INCREMENT-FORWARD-INFERENCE-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("CORE-KB-FINALIZATION"),
				SubLObjectFactory.makeSymbol("COMPUTE-ASSERTION-ONTOLOGY-LAYER-STATISTICS"), SubLObjectFactory.makeSymbol("DONT-MAINTAIN-ASSERTION-USAGE-COUNTS"), SubLObjectFactory.makeSymbol("PERFORM-FORWARD-INFERENCE"), SubLObjectFactory.makeSymbol("CLEAR-RELATION-MOST-RESTRICTED-ARG"), SubLObjectFactory.makeSymbol("DEREGISTER-ALL-SKSI-SPARQL-REMOVAL-MODULES"),
				SubLObjectFactory.makeSymbol("CLEAR-TERM-CLASSIFICATION-TREE-INFO"), SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-DEFAULT-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("ALLOWED-RULES-UTILITIES"), SubLObjectFactory.makeSymbol("GET-DEFAULT-DOCUMENT-ANNOTATION-RULE-DISAMBIGUATOR"), SubLObjectFactory.makeSymbol("ENSURE-EVENT-BROKER"), SubLObjectFactory.makeSymbol("START-GUARDIAN"),
				SubLObjectFactory.makeSymbol("CLEAR-GET-POSSIBLE-RENDERERS-FOR-FOLLOWUP-INT"), SubLObjectFactory.makeSymbol("GET-SBHL-FALSE-TV"), SubLObjectFactory.makeSymbol("SKSI-LANGUAGE-SPOKEN-LANGUAGES-GUTS"), SubLObjectFactory.makeSymbol("CB-SHOW-NL-TRIE-GET-STARTING-ENTRY-SPECIFICATION"), SubLObjectFactory.makeSymbol("RETURN-STRING"), SubLObjectFactory.makeSymbol("CB-ALL-REWRITE-MODULES"),
				SubLObjectFactory.makeSymbol("PPH-TIMEOUT"), SubLObjectFactory.makeSymbol("INSTANTIATE-SBHL-MARKING-SPACE"), SubLObjectFactory.makeSymbol("INIT-TEMPORALLY-COORIGINATING"), SubLObjectFactory.makeSymbol("ALL-EXTERNAL-SYMBOLS"), SubLObjectFactory.makeSymbol("CLEAR-PARSE-AS-TYPE?"), SubLObjectFactory.makeSymbol("DEPRECATE-OLD-SOURCE-CITATION-FORMAT?"),
				SubLObjectFactory.makeSymbol("SKSI-CORBA-MODULES-COUNT"), SubLObjectFactory.makeSymbol("ENSURE-TEMPLATE-RULES-MASTER-INDEX"), SubLObjectFactory.makeSymbol("SKSI-NEXT-ID"), SubLObjectFactory.makeSymbol("CLEAR-DEFNS"), SubLObjectFactory.makeSymbol("SKSI-UNTRACE"), SubLObjectFactory.makeSymbol("CLEAR-ALL-MATH-EXPRESSION-DENOTING-FUNCTIONS"),
				SubLObjectFactory.makeSymbol("RECONSTRUCT-UNBOUND-RULE-INDICES"), SubLObjectFactory.makeSymbol("ENSURE-CYC-TO-PENN-MAP"), SubLObjectFactory.makeSymbol("DEFN-COLLECTION"), SubLObjectFactory.makeSymbol("CLEAR-GET-VARIABLES-OF-TYPE-IN-FORMULA"), SubLObjectFactory.makeSymbol("PPH-KAPPA-JUSTIFICATION-TEMPLATE"), SubLObjectFactory.makeSymbol("GET-LUCENE-PORT"),
				SubLObjectFactory.makeSymbol("NEW-TACTICLESS-STRATEGY"), SubLObjectFactory.makeSymbol("CLEAR-NL-GENERATION-CACHE-EXCEPTIONS"), SubLObjectFactory.makeSymbol("CB-CURRENT-PARTITION-SAVE"), SubLObjectFactory.makeSymbol("UIA-CANNOT-TREAT-COMMENTS-AS-MUMBLING"), SubLObjectFactory.makeSymbol("THE-HL-PROTOTYPE-KE-IRRELEVANT-RULE-INTERNAL"),
				SubLObjectFactory.makeSymbol("NEW-CONCEPTUALLY-RELATED-MAPPING-TABLE"), SubLObjectFactory.makeSymbol("ALL-EXTERNAL-SYMBOLS"), SubLObjectFactory.makeSymbol("INFERENCE-COUNT"), SubLObjectFactory.makeSymbol("METER-CONSTANT-INDEX-SWAP-TIME"), SubLObjectFactory.makeSymbol("AUTO-FLUSH-LOGS?"), SubLObjectFactory.makeSymbol("CANDIDATE-ASSERTION-EL-FORMULA"),
				SubLObjectFactory.makeSymbol("CB-MOST-RECENT-SENTENCE"), SubLObjectFactory.makeSymbol("CYCLIST-IS-GUEST"), SubLObjectFactory.makeSymbol("CLEAR-EXPAND-WORD-ITEMS-IN-LIST-INT"), SubLObjectFactory.makeSymbol("PPH-IRRELEVANCE-CHECK-MT"), SubLObjectFactory.makeSymbol("INITIALIZE-TVA-CACHES"), SubLObjectFactory.makeSymbol("ALL-KB-HL-SUPPORTS"), SubLObjectFactory.makeSymbol("GET-KB-HL-SUPPORT"),
				SubLObjectFactory.makeSymbol("CLEAR-NOTIFY-VISUALIZING-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("GATHER-DEFAULT-REFORMULATOR-MODE-PRECEDENCE-FROM-KB"), SubLObjectFactory.makeSymbol("GET-DEFAULT-SENTENCE-STRING-PARSER"), SubLObjectFactory.makeSymbol("UNSTASH-KB-OBJECT-LOOKUP-VARS-7"), SubLObjectFactory.makeSymbol("PPH-PHRASE-FNS-INITIALIZED?"),
				SubLObjectFactory.makeSymbol("CLEANLY-INITIALIZE-SBHL-TIME-MODULES"), SubLObjectFactory.makeSymbol("NEW-SBHL-SUB-CACHE"), SubLObjectFactory.makeSymbol("INITIALIZE-FILE-VECTOR-BACKED-MAP"), SubLObjectFactory.makeSymbol("GET-ALL-EXTERNAL-KB-MODIFICATION-EVENT-FILTER-LISTENER-IDS"), SubLObjectFactory.makeSymbol("INITIALIZE-ISA-ARG2-NAUT-TABLE"),
				SubLObjectFactory.makeSymbol("PPH-JUSTIFICATION-HTML-FUNCTION-AND-TARGET"), SubLObjectFactory.makeSymbol("TODAY-ABBREVIATION-STRING"), SubLObjectFactory.makeSymbol("INITIALIZE-OPEN-CYC-INFERENCE-API-VARS"), SubLObjectFactory.makeSymbol("GEN-TEMPLATE-STORE-INITIALIZED?"), SubLObjectFactory.makeSymbol("PERFORM-FORWARD-INFERENCE-NOW"),
				SubLObjectFactory.makeSymbol("FORTS-TYPED-SIBLING-DISJOINT-COLLECTION"), SubLObjectFactory.makeSymbol("CONSTANT-INDEX-USAGE-COUNTS-ENABLED?"), SubLObjectFactory.makeSymbol("CANONICAL-CYC-WORKING-DIRECTORY"), SubLObjectFactory.makeSymbol("NEW-WNI-PROBLEM-STORE"), SubLObjectFactory.makeSymbol("EXTERNAL-PROCESSES-SUPPORTED?"),
				SubLObjectFactory.makeSymbol("POSSIBLY-MAKE-QUOTED-DEFN-COL-HISTORY-TABLE"), SubLObjectFactory.makeSymbol("NEW-UNREPRESENTED-TERM-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("CLEAR-WNI-SYNSET-COLLECTION?"), SubLObjectFactory.makeSymbol("GET-JAVA-RED-ROOT-KEY"), SubLObjectFactory.makeSymbol("CLEAR-NL-TAGS"), SubLObjectFactory.makeSymbol("REFORMULATOR-RULES-TO-IGNORE"),
				SubLObjectFactory.makeSymbol("CYCL-QUERY-SPECIFICATION-NEW"), SubLObjectFactory.makeSymbol("GET-GKE-QUANTIFIERS"), SubLObjectFactory.makeSymbol("INITIALIZE-ALL-MTS-CACHE-FOR-GENLS"), SubLObjectFactory.makeSymbol("DEFINITENOUNPPFN"), SubLObjectFactory.makeSymbol("ROLL-LOCAL-HL-TRANSCRIPT"), SubLObjectFactory.makeSymbol("COMPUTE-KBS-BROADER-TERM-GAFS"),
				SubLObjectFactory.makeSymbol("MAYBE-USE-ENGLISH-TEXT"), SubLObjectFactory.makeSymbol("LEXICON-LOOKUP-MT-INFO"), SubLObjectFactory.makeSymbol("NON-TRIE-SUBWORD-PREDS-INTERNAL"), SubLObjectFactory.makeSymbol("RKF-SD-KNOWN-PROBLEM-STORE-PROPERTIES"), SubLObjectFactory.makeSymbol("WITHIN-SKSI-GLOBAL-RESOURCING?"), SubLObjectFactory.makeSymbol("NEW-DENSE-DEDUCTION-ID-INDEX"),
				SubLObjectFactory.makeSymbol("WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET"), SubLObjectFactory.makeSymbol("RKF-UTTRDR-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES"), SubLObjectFactory.makeSymbol("GET-SOFTWARE-TYPE-AS-RED-KEY-NAME"), SubLObjectFactory.makeSymbol("NEGATIVE-INFINITY"), SubLObjectFactory.makeSymbol("GET-UNQUALIFIED-MACHINE-NAME"),
				SubLObjectFactory.makeSymbol("FIND-SBHL-ITERATOR-SHELL"), SubLObjectFactory.makeSymbol("CURRENT-QUERY-ALLOWS-NEW-TERMS?"), SubLObjectFactory.makeSymbol("HAS-NEW-DEDUCTIONS?"), SubLObjectFactory.makeSymbol("NEW-ILP-EXPORT-NEGATIVE-EXAMPLE-COLLECTOR"), SubLObjectFactory.makeSymbol("FACT-SHEET-DEFAULT-DOMAIN-MT-INTERNAL"), SubLObjectFactory.makeSymbol("CLEAR-LINK-EXECUTE-INT"),
				SubLObjectFactory.makeSymbol("PPH-PHRASE-DEFAULT-VERB-PRED"), SubLObjectFactory.makeSymbol("PREPARE-KB-MINI-DUMP"), SubLObjectFactory.makeSymbol("NEW-CONSTANT-CHECKPOINT"), SubLObjectFactory.makeSymbol("SAVE-LOCAL-ASKED-QUERIES"), SubLObjectFactory.makeSymbol("GET-ACTIVE-EXTERNAL-KB-MODIFICATION-EVENT-FILTERS"),
				SubLObjectFactory.makeSymbol("SKSI-CONTENT-MTS-WITH-REGISTERED-REMOVAL-MODULE"), SubLObjectFactory.makeSymbol("SINGLE-LITERAL-PROBLEM-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("GRAMMAR-PERMITS-LIST-AS-TERMINAL?"), SubLObjectFactory.makeSymbol("GT-LINK-PRED"), SubLObjectFactory.makeSymbol("AGENT-RECEIVED-MESSSAGE-HANDLER"),
				SubLObjectFactory.makeSymbol("WNI-NUMBER-OF-NEW-CONCEPTS-IMPORTED-FROM-WORDNET"), SubLObjectFactory.makeSymbol("CONSTRUCT-UNREPRESENTED-TERMS-FHT-BASED-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-LOWER-MIDDLE-ONTOLOGY-BOUNDARY-GENERALITY-ESTIMATE"), SubLObjectFactory.makeSymbol("CURRENT-PARITER-INDEX"), SubLObjectFactory.makeSymbol("RBP-CHECK-INITIALIZATIONS"),
				SubLObjectFactory.makeSymbol("SET-TO-DEAD-RECEIVE"), SubLObjectFactory.makeSymbol("TEST-PESSIMIZE-ID-INDEX"), SubLObjectFactory.makeSymbol("NEW-SUM-ACCUMULATOR"), SubLObjectFactory.makeSymbol("CHECK-AND-POLL"), SubLObjectFactory.makeSymbol("WHITESPACE-CHARS"), SubLObjectFactory.makeSymbol("UNSTASH-OTHER-VARS-10"), SubLObjectFactory.makeSymbol("GET-ALL-URI-PATTERNS"),
				SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-12"), SubLObjectFactory.makeSymbol("ASSERTIVE-WFF-RULES"), SubLObjectFactory.makeSymbol("LOAD-SYSTEM-PARAMETERS"), SubLObjectFactory.makeSymbol("INITIALIZE-WEAK-SUCCESSOR-PRECEDENCE-MODULE"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-PPH-ISA-CONTEXT"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-SUBL-EXPRESSIONS-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("CB-SERVER-STATUS-HELP"), SubLObjectFactory.makeSymbol("CB-SUBL-DOC-DISCLAIMER"), SubLObjectFactory.makeSymbol("CLEAR-TERM-CLASSIFICATION-TREE-INFO"), SubLObjectFactory.makeSymbol("RESET-RKF-IRRELEVANT-FORT-CACHE"), SubLObjectFactory.makeSymbol("INIT-TEMPORALLY-COTERMINAL"),
				SubLObjectFactory.makeSymbol("USE-TRANSCRIPT-SERVER"), SubLObjectFactory.makeSymbol("RBP-UNTRACE"), SubLObjectFactory.makeSymbol("WNI-MAPPED-TERMS"), SubLObjectFactory.makeSymbol("CLEAR-LILLIPUT-CACHES"), SubLObjectFactory.makeSymbol("CLEANUP-BROKEN-JAVA-API-SOCKETS"), SubLObjectFactory.makeSymbol("FORGET-SYNTACTICALLY-INVALID-NEW-KB-HL-SUPPORTS"),
				SubLObjectFactory.makeSymbol("CLEAR-SIMPLE-SKSI-ASSERTIONS-FOR-SKS"), SubLObjectFactory.makeSymbol("TEST-CATEGORIZED-TIMING"), SubLObjectFactory.makeSymbol("COLLECTION-INTERSECTION-SPECS-RULE-SUPPORT"), SubLObjectFactory.makeSymbol("DESTROY-ALL-PROBLEM-STORES"), SubLObjectFactory.makeSymbol("CLEAR-ADD-TVA-CACHE-KEY-CACHED"),
				SubLObjectFactory.makeSymbol("TRANSLATOR-POSSIBLY-OUTPUT-SYSTEM-LEVEL-FILES"), SubLObjectFactory.makeSymbol("GATHER-ALL-TOP-LEVEL-REGISTERED-KNOWLEDGE-SOURCES"), SubLObjectFactory.makeSymbol("MAPPING-FUNCALL-INT"), SubLObjectFactory.makeSymbol("STOP-CB-EVENT-DISPATCHER"), SubLObjectFactory.makeSymbol("CYCL-UPTIME"), SubLObjectFactory.makeSymbol("NL-TRIE-KNOWN-STALE-P"),
				SubLObjectFactory.makeSymbol("COMPUTE-CACHED-PREDICATES-FROM-ALL-MTS-CACHE"), SubLObjectFactory.makeSymbol("PROBABLY-MOST-RECENT-ASSERTION"), SubLObjectFactory.makeSymbol("DEFAULT-REPORT-PROPERTIES"), SubLObjectFactory.makeSymbol("ARETE-NARTS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("PLOT-IMAGE-FORMAT-AND-EXTENSION"),
				SubLObjectFactory.makeSymbol("CONJUNCTIVE-REMOVAL-SUPPRESS-SPLIT-JUSTIFICATION?"), SubLObjectFactory.makeSymbol("REMOVE-RBP-RB-ALL-RULES-SORTED"), SubLObjectFactory.makeSymbol("CHECK-WFF-ARITY?"), SubLObjectFactory.makeSymbol("TRANSCRIPT-DIRECTORY"), SubLObjectFactory.makeSymbol("SOME-EXTERNAL-REMOVAL-MODULES?"), SubLObjectFactory.makeSymbol("WITHIN-DISJUNCTION?"),
				SubLObjectFactory.makeSymbol("*RAE-DEFINING-TEMPORALLY-SUBSUMES-TYPETYPE-RULE*-INITIALIZER"), SubLObjectFactory.makeSymbol("GET-SBHL-TERMINATING-MARKING-SPACE"), SubLObjectFactory.makeSymbol("FORCE-STANFORD-PARSER-AVAILABLE?"), SubLObjectFactory.makeSymbol("GENERIC-REMOVAL-MODULE-COUNT"), SubLObjectFactory.makeSymbol("TRANSFORMATION-RULES-WITH-RECENT-STATISTICS-COUNT"),
				SubLObjectFactory.makeSymbol("PPH-EMPTY-CYCL"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-11"), SubLObjectFactory.makeSymbol("CLEAR-UNBOUND-RULE-INDEX"), SubLObjectFactory.makeSymbol("CLEAR-RULE-AFTER-REMOVINGS"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-DISTANCE"), SubLObjectFactory.makeSymbol("CLEAR-ICON-RELATIVE-PATH-FOR-SOURCE"),
				SubLObjectFactory.makeSymbol("CURRENT-GENERATION-LEVEL"), SubLObjectFactory.makeSymbol("SBHL-CLOSURE-SEARCH-P"), SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-DEFAULT-LANGUAGE-MT"), SubLObjectFactory.makeSymbol("RESET-UNCACHE-SUF-DEFN-METERS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-6"), SubLObjectFactory.makeSymbol("MAKE-DISTANCE-BETWEEN-GREAT-CIRCLE-RULE-SUPPORT"),
				SubLObjectFactory.makeSymbol("ALL-ARG-CONSTRAINT-PREDS"), SubLObjectFactory.makeSymbol("NEW-RULE-ITERATOR"), SubLObjectFactory.makeSymbol("CLEAR-DIFFERENTIATING-GENLS"), SubLObjectFactory.makeSymbol("TRANSFORMATION-LINK-HISTORICAL-COUNT"), SubLObjectFactory.makeSymbol("PPH-CURRENT-ARG0-POSITION"), SubLObjectFactory.makeSymbol("GET-QL-INDEX-PORT"),
				SubLObjectFactory.makeSymbol("RESET-RTP-COMPLETELY"), SubLObjectFactory.makeSymbol("CLEAR-AT-ARGN-INT-CACHED"), SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-HISTORICAL-FUDGE-FACTORS"), SubLObjectFactory.makeSymbol("CLEAR-EVALUATABLE-EXPORT-CACHES"), SubLObjectFactory.makeSymbol("INITIAL-FORWARD-INFERENCE-METRIC-TIME"), SubLObjectFactory.makeSymbol("INTERRUPT-PROCESS-WITH-ARGS-INTERNAL"),
				SubLObjectFactory.makeSymbol("CREATE-ALEXANDRIA-ALL-VARIABLES-ITERATOR-STATE"), SubLObjectFactory.makeSymbol("ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED"), SubLObjectFactory.makeSymbol("INITIALIZE-GAF-AFTER-ADDINGS-HASH"), SubLObjectFactory.makeSymbol("LAST-WFF-CHECKED-ASSERTION-ID"), SubLObjectFactory.makeSymbol("ENGLISH-GENERATION-FORT-CACHE-MOST-RECENT-AVAILABLE?"),
				SubLObjectFactory.makeSymbol("GET-ALL-LSBS"), SubLObjectFactory.makeSymbol("NEW-COUNT-ACCUMULATOR"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-SELF-LOOPING-RULE-ASSERTION?"), SubLObjectFactory.makeSymbol("PPH-IDENTITY-MAP"), SubLObjectFactory.makeSymbol("GHL-BACKWARD-DIRECTION"), SubLObjectFactory.makeSymbol("GET-KBS-PRERUN-FNS"), SubLObjectFactory.makeSymbol("NEW-ASSERTIONS-ITERATOR"),
				SubLObjectFactory.makeSymbol("NCP-INITIALIZE-METRICS"), SubLObjectFactory.makeSymbol("SKOS-CORE-NAMESPACE"), SubLObjectFactory.makeSymbol("UNSTASH-KB-INDEXING-VARS-10"), SubLObjectFactory.makeSymbol("NL-KB-LOADED-P"), SubLObjectFactory.makeSymbol("MAX-GEN-TEMPLATE-PHRASE-ID"), SubLObjectFactory.makeSymbol("GET-ALL-PARSING-PRINCIPLES"),
				SubLObjectFactory.makeSymbol("CLEAR-WNI-ALL-HYPONYMS-HELPER"), SubLObjectFactory.makeSymbol("CB-NOTE-NO-FOCAL-INFERENCE"), SubLObjectFactory.makeSymbol("SHOW-INSTANTIATED-HAYSTACK-STATISTICS"), SubLObjectFactory.makeSymbol("GET-RED-VALUE-FOR-DEFAULT-JAVA-HOME"), SubLObjectFactory.makeSymbol("REGEX-VERSION"), SubLObjectFactory.makeSymbol("RESET-TERM-CLASSIFICATION-TREE"),
				SubLObjectFactory.makeSymbol("NEW-HTML-STATE"), SubLObjectFactory.makeSymbol("CLEAR-STRICTLY-WFF-IN-ALL-SPEC-MTS?"), SubLObjectFactory.makeSymbol("NPP-INIT-EXCLUDED-NAME-PREDS"), SubLObjectFactory.makeSymbol("COMPUTE-SPARQL-ORACLE-QUERY-TIMEOUT"), SubLObjectFactory.makeSymbol("POPULATE-SCHEDULED-QUERY-QUEUE"), SubLObjectFactory.makeSymbol("FIND-OR-CREATE-TEMPLATE-TOPIC-PROBLEM-STORE"),
				SubLObjectFactory.makeSymbol("OPTIMIZE-SBHL-STORE"), SubLObjectFactory.makeSymbol("DONT-METER-ASSERTION-CONTENT-SWAP-TIME"), SubLObjectFactory.makeSymbol("ST-HTML-LEGEND"), SubLObjectFactory.makeSymbol("CLEAR-DENOTATUM-ARG-OF-PRED-CACHED-INT"), SubLObjectFactory.makeSymbol("REMOTE-QUEUE-SIZE"), SubLObjectFactory.makeSymbol("CLEAR-TEMPLATE-RULES-MASTER-INDEX"),
				SubLObjectFactory.makeSymbol("CLEAR-STRING-TO-INTERVAL-CACHED"), SubLObjectFactory.makeSymbol("ASSUME-NL-TRIE-VALID?"), SubLObjectFactory.makeSymbol("WNI-REVIEW-FACT-SLOTS-INTERNAL"), SubLObjectFactory.makeSymbol("PSP-AGENT"), SubLObjectFactory.makeSymbol("BACKCHAINING-ON-IST-ENABLED?"), SubLObjectFactory.makeSymbol("INDEXICAL-SECONDS-SINCE-1970"),
				SubLObjectFactory.makeSymbol("NEW-CB-QUERY-SPECIAL-VARIABLE-STATE"), SubLObjectFactory.makeSymbol("RECOMPUTING-SKOLEM-DEFN-INFO-DEFN"), SubLObjectFactory.makeSymbol("STRATEGIST-WANTS-RECURSIVE-QUERIES-IN-CURRENTLY-ACTIVE-PROBLEM-STORE?"), SubLObjectFactory.makeSymbol("CLEAR-PSP-KEYWORDS-FOR-FRAME"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-ALL-NEGATION-INVERSES"),
				SubLObjectFactory.makeSymbol("INITIALIZE-NEGATION-MT-MODULE"), SubLObjectFactory.makeSymbol("CURRENT-COMPLEX-INDEX-KEYS"), SubLObjectFactory.makeSymbol("CLEAR-CACHED-CNF-CLAUSAL-FORM"), SubLObjectFactory.makeSymbol("SBHL-SUSPEND-NEW-SPACES?"), SubLObjectFactory.makeSymbol("HTML-BR"), SubLObjectFactory.makeSymbol("NEW-FHT-SUID-ITEM"), SubLObjectFactory.makeSymbol("INVALID-HYPHEN-SEQUENCE"),
				SubLObjectFactory.makeSymbol("CLEAR-JAVA-BACKEND-CLET-BIND-LOCAL-VARIABLE"), SubLObjectFactory.makeSymbol("CB-PROOF-VIEW-DESTROYER"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-ALL-RULES-ALLOWED?"), SubLObjectFactory.makeSymbol("RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS"), SubLObjectFactory.makeSymbol("PERFORM-INDEXING-PRE-DUMP-CLEANUP"),
				SubLObjectFactory.makeSymbol("LINK-REGEX-PATTERNS-INITIALIZED?"), SubLObjectFactory.makeSymbol("CURRENT-MT-RELEVANCE-MT"), SubLObjectFactory.makeSymbol("NPP-INIT-EXCLUDED-NAME-PREDS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-4"), SubLObjectFactory.makeSymbol("HISTORICAL-PROBLEM-CREATION-TIMES"), SubLObjectFactory.makeSymbol("WNI-PROBLEM-STORE-PROPERTIES"),
				SubLObjectFactory.makeSymbol("CLEAR-TERM-LEARNER-TYPES-FOR-FRAGMENT"), SubLObjectFactory.makeSymbol("ASSERTION-CONS-SHARING-DICTIONARY"), SubLObjectFactory.makeSymbol("GET-ALL-TRANSCRIPTS-IMAGE"), SubLObjectFactory.makeSymbol("INFERENCE-GENL-INVERSES-ARE-RELEVANT?"), SubLObjectFactory.makeSymbol("L2R-SUPERTEXT-INDEXICAL-INTERNAL"), SubLObjectFactory.makeSymbol("PPH-QUANTIFIER-KEYWORDS"),
				SubLObjectFactory.makeSymbol("ENSURE-POS-TEMPLATE-MAPPINGS-INITIALIZED"), SubLObjectFactory.makeSymbol("SCOPE-KB-DIFF-ASSERTIONS"), SubLObjectFactory.makeSymbol("DO-CONSTANTS-TABLE"), SubLObjectFactory.makeSymbol("XREF-GLOBAL-SCOPE"), SubLObjectFactory.makeSymbol("NOTE-AT-CACHE-INITIALIZED"), SubLObjectFactory.makeSymbol("CTEST-ALL-KB-TEST-METRIC-CONSTANTS"),
				SubLObjectFactory.makeSymbol("AT-CONSIDERING-ATOMIC-SENTENCE-P"), SubLObjectFactory.makeSymbol("ALLOW-FACT-SHEET-SCREENSAVERS"), SubLObjectFactory.makeSymbol("OWL-IMPORTER-ID-INDEX"), SubLObjectFactory.makeSymbol("NEW-DEDUCTION-ID-THRESHOLD"), SubLObjectFactory.makeSymbol("CURRENT-TS-FILE"), SubLObjectFactory.makeSymbol("CLEAR-NODES-SUPPRESSED-FROM-FILTER"),
				SubLObjectFactory.makeSymbol("COMPUTE-AVERAGE-NUMBER-OF-FORTS-MENTIONED-IN-REFORMULATOR-RULES"), SubLObjectFactory.makeSymbol("GET-SBHL-WHAT-MTS-SWEEP-DISJOINS-MODULE"), SubLObjectFactory.makeSymbol("INITIALIZE-CB-RTV-PREDICATES"), SubLObjectFactory.makeSymbol("INITIALIZE-SEMANTIC-ETL-INFRASTRUCTURE"), SubLObjectFactory.makeSymbol("CLEAR-MDW-GRAPH"),
				SubLObjectFactory.makeSymbol("CURRENT-OWL-IMPORTER"), SubLObjectFactory.makeSymbol("NOUN-COMPOUND-CONSTRAINT-STRING-SPECS"), SubLObjectFactory.makeSymbol("ENSURE-SWAPPABLE-TVA-CACHE-LOCK"), SubLObjectFactory.makeSymbol("PPH-GENERATE-MORPHOLOGICAL-ALTERNATIVES?"), SubLObjectFactory.makeSymbol("INITIALIZE-CONSTANT-NAMES-IN-CODE"),
				SubLObjectFactory.makeSymbol("GET-SBHL-LINK-DIRECTION-AS-LIST"), SubLObjectFactory.makeSymbol("AVERAGE-PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT"), SubLObjectFactory.makeSymbol("KILL-UNUSED-INSTANTIATED-CONSTANTS"), SubLObjectFactory.makeSymbol("CLEAR-FACT-SHEET-LABEL-FOR-CATEGORY"), SubLObjectFactory.makeSymbol("CURRENT-XREF-SYSTEM"),
				SubLObjectFactory.makeSymbol("GET-SBHL-FORWARD-DIRECTED-DIRECTION"), SubLObjectFactory.makeSymbol("TERMPARAPHRASEFN-COUNTYWITHSTATEORPROVINCENAME"), SubLObjectFactory.makeSymbol("GET-ALL-URI-PATTERNS"), SubLObjectFactory.makeSymbol("HALT-JAVA-API-LEASE-MONITOR"), SubLObjectFactory.makeSymbol("CLEAR-PQDS-DEPTH"), SubLObjectFactory.makeSymbol("FORWARD-INFERENCE-METRICS-TIME-INDEX"),
				SubLObjectFactory.makeSymbol("GET-SBHL-SEARCH-BEHAVIOR"), SubLObjectFactory.makeSymbol("DISABLE-AGENDA-DAILY-GC"), SubLObjectFactory.makeSymbol("MAKE-RELATION-INSTANCE-EXISTS-SUPPORT"), SubLObjectFactory.makeSymbol("INITIALIZE-HTTP-RESTRICTED-FUNCTIONS"), SubLObjectFactory.makeSymbol("SBHL-NEW-SPACE-SOURCE"), SubLObjectFactory.makeSymbol("REMOVE-L2R-SENTENCE-LEVEL-PEG-CREATION-TEMPLATE"),
				SubLObjectFactory.makeSymbol("MAX-GEN-TEMPLATE-PHRASE-ID"), SubLObjectFactory.makeSymbol("GET-CURRENT-COOKIES-FOR-REQUEST"), SubLObjectFactory.makeSymbol("SET-DONT-CHECK-WFF-SEMANTICS"), SubLObjectFactory.makeSymbol("UNSTASH-INFERENCE-VARS-6"), SubLObjectFactory.makeSymbol("INITIALIZE-CORE-FORT-TABLE"), SubLObjectFactory.makeSymbol("MACHINE-VERSION"),
				SubLObjectFactory.makeSymbol("NL-TRIE-REVISIONS-STALE?-INTERNAL"), SubLObjectFactory.makeSymbol("REDO-SYSTEM-CODE-INITIALIZATIONS"), SubLObjectFactory.makeSymbol("ARETE-CONSTANTS-TOUCHED-COUNT"), SubLObjectFactory.makeSymbol("WITHIN-FACT-SHEET-PARAPHRASE?"), SubLObjectFactory.makeSymbol("CYC-RETRIEVAL-FEATURE"), SubLObjectFactory.makeSymbol("SBHL-TEMPORALITY-DATE-SUCCESSION"),
				SubLObjectFactory.makeSymbol("CB-ALL-PARTITION-METHODS"), SubLObjectFactory.makeSymbol("CSS-KEYWORDS"), SubLObjectFactory.makeSymbol("INITIALIZE-LEXICON-KB-FEATURE"), SubLObjectFactory.makeSymbol("CLEAR-PSP-RULES"), SubLObjectFactory.makeSymbol("ONLY-SPECIFIED-MT-IS-RELEVANT?"), SubLObjectFactory.makeSymbol("CACHED-LOAD-ALL-HAYSTACKS-INTERNAL"),
				SubLObjectFactory.makeSymbol("WNI-ACCESS-PATH-SERVER"), SubLObjectFactory.makeSymbol("CLEAR-CAE-QUERY-SEARCH-FILTER-STRING"), SubLObjectFactory.makeSymbol("DECLARE-NL-TRIE-NOT-KNOWN-STALE"), SubLObjectFactory.makeSymbol("CB-MYCREATIONPURPOSE-FILTER"), SubLObjectFactory.makeSymbol("CLEAR-NORMALIZE-CURE-USER"), SubLObjectFactory.makeSymbol("GET-ALL-PARSING-FILTERS"),
				SubLObjectFactory.makeSymbol("CLEAR-SPP-MORE-BASIC?-CACHED"), SubLObjectFactory.makeSymbol("CLEAR-GET-ISA-RESTRICTIONS-FROM-SENTENCE")});
	}

	public void declareFunctions()
	{
		declare_research_cyc_init_file();
	}

	public void initializeVariables()
	{
		init_research_cyc_init_file();
	}

	public void runTopLevelForms()
	{
		setup_research_cyc_init_file();
	}

	static
	{
		me = (SubLFile) new research_cyc_init();
		$research_cyc_initialization_methods$ = null;
		$master_license_key$ = null;
		$research_cyc_license_key_invalid_string$ = null;
		$research_cyc_license_key_expired_string$ = null;
		$stashed_kb_object_lookup_vars$ = null;
		$stashed_kb_object_content_vars$ = null;
		$stashed_kb_indexing_vars$ = null;
		$stashed_inference_vars$ = null;
		$stashed_other_vars$ = null;
		$sym0$_RESEARCH_CYC_INITIALIZATION_METHODS_ = SubLObjectFactory.makeSymbol("*RESEARCH-CYC-INITIALIZATION-METHODS*");
		$list1 = _constant_1_initializer();
		$sym2$_MASTER_LICENSE_KEY_ = SubLObjectFactory.makeSymbol("*MASTER-LICENSE-KEY*");
		$str3$ResearchCyc_License_Key_has_not_b = SubLObjectFactory.makeString("ResearchCyc License Key has not been provided.");
		$str4$ResearchCyc_License_Key_invalid_ = SubLObjectFactory.makeString("ResearchCyc License Key invalid.");
		$str5$Your_current_Cyc_license_is_no_lo = SubLObjectFactory.makeString("Your current Cyc license is no longer valid.\nTo renew your license, please contact us at license@cyc.com.");
		$sym6$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
		$int7$24 = SubLObjectFactory.makeInteger(24);
		$str8$0000_0000_0000_0000_0000 = SubLObjectFactory.makeString("0000-0000-0000-0000-0000");
		$list9 = ConsesLow.list((SubLObject) Characters.CHAR_hyphen);
		$int10$256 = SubLObjectFactory.makeInteger(256);
		$list11 = ConsesLow.list((SubLObject) TWELVE_INTEGER, (SubLObject) TEN_INTEGER, (SubLObject) SIX_INTEGER, (SubLObject) FIVE_INTEGER, (SubLObject) THREE_INTEGER);
		$list12 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("NYBBLE4"), (SubLObject) SubLObjectFactory.makeSymbol("NYBBLE3"), (SubLObject) SubLObjectFactory.makeSymbol("NYBBLE2"), (SubLObject) SubLObjectFactory.makeSymbol("NYBBLE1"), (SubLObject) SubLObjectFactory.makeSymbol("NYBBLE0"));
		$int13$20000000 = SubLObjectFactory.makeInteger(20000000);
		$int14$65536 = SubLObjectFactory.makeInteger(65536);
		$int15$4096 = SubLObjectFactory.makeInteger(4096);
		$sym16$UNIVERSAL_DATE_P = SubLObjectFactory.makeSymbol("UNIVERSAL-DATE-P");
		$sym17$_STASHED_KB_OBJECT_LOOKUP_VARS_ = SubLObjectFactory.makeSymbol("*STASHED-KB-OBJECT-LOOKUP-VARS*");
		$kw18$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
		$sym19$_CONSTANT_FROM_GUID_ = SubLObjectFactory.makeSymbol("*CONSTANT-FROM-GUID*");
		$sym20$_CONSTANT_FROM_SUID_ = SubLObjectFactory.makeSymbol("*CONSTANT-FROM-SUID*");
		$sym21$_NART_FROM_ID_ = SubLObjectFactory.makeSymbol("*NART-FROM-ID*");
		$sym22$_ASSERTION_FROM_ID_ = SubLObjectFactory.makeSymbol("*ASSERTION-FROM-ID*");
		$sym23$_DEDUCTION_FROM_ID_ = SubLObjectFactory.makeSymbol("*DEDUCTION-FROM-ID*");
		$list24 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("ONE"), (SubLObject) SubLObjectFactory.makeSymbol("TWO"), (SubLObject) SubLObjectFactory.makeSymbol("THREE"), (SubLObject) SubLObjectFactory.makeSymbol("FOUR"), (SubLObject) SubLObjectFactory.makeSymbol("FIVE"));
		$sym25$_STASHED_KB_OBJECT_CONTENT_VARS_ = SubLObjectFactory.makeSymbol("*STASHED-KB-OBJECT-CONTENT-VARS*");
		$sym26$_CONSTANT_GUID_TABLE_ = SubLObjectFactory.makeSymbol("*CONSTANT-GUID-TABLE*");
		$sym27$_NART_HL_FORMULA_TABLE_ = SubLObjectFactory.makeSymbol("*NART-HL-FORMULA-TABLE*");
		$sym28$_ASSERTION_CONTENT_MANAGER_ = SubLObjectFactory.makeSymbol("*ASSERTION-CONTENT-MANAGER*");
		$list29 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("ONE"), (SubLObject) SubLObjectFactory.makeSymbol("TWO"), (SubLObject) SubLObjectFactory.makeSymbol("THREE"));
		$sym30$_STASHED_KB_INDEXING_VARS_ = SubLObjectFactory.makeSymbol("*STASHED-KB-INDEXING-VARS*");
		$sym31$_CONSTANT_INDEX_MANAGER_ = SubLObjectFactory.makeSymbol("*CONSTANT-INDEX-MANAGER*");
		$sym32$_NART_INDEX_MANAGER_ = SubLObjectFactory.makeSymbol("*NART-INDEX-MANAGER*");
		$list33 = ConsesLow.list((SubLObject) SubLObjectFactory.makeSymbol("ONE"), (SubLObject) SubLObjectFactory.makeSymbol("TWO"));
		$sym34$_STASHED_INFERENCE_VARS_ = SubLObjectFactory.makeSymbol("*STASHED-INFERENCE-VARS*");
		$sym35$_SBHL_MODULES_ = SubLObjectFactory.makeSymbol("*SBHL-MODULES*");
		$sym36$_ISA_CACHE_ = SubLObjectFactory.makeSymbol("*ISA-CACHE*");
		$sym37$_ALL_MTS_ISA_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-ISA-CACHE*");
		$sym38$_GENLS_CACHE_ = SubLObjectFactory.makeSymbol("*GENLS-CACHE*");
		$sym39$_ALL_MTS_GENLS_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-GENLS-CACHE*");
		$sym40$_GENL_PREDICATE_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-PREDICATE-CACHE*");
		$sym41$_GENL_INVERSE_CACHE_ = SubLObjectFactory.makeSymbol("*GENL-INVERSE-CACHE*");
		$sym42$_ALL_MTS_GENL_PREDICATE_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-GENL-PREDICATE-CACHE*");
		$sym43$_ALL_MTS_GENL_INVERSE_CACHE_ = SubLObjectFactory.makeSymbol("*ALL-MTS-GENL-INVERSE-CACHE*");
		$sym44$_SBHL_MODULE_KEY_TEST_ = SubLObjectFactory.makeSymbol("*SBHL-MODULE-KEY-TEST*");
		$list45 = ConsesLow.list(new SubLObject[]{SubLObjectFactory.makeSymbol("ONE"), SubLObjectFactory.makeSymbol("TWO"), SubLObjectFactory.makeSymbol("THREE"), SubLObjectFactory.makeSymbol("FOUR"), SubLObjectFactory.makeSymbol("FIVE"), SubLObjectFactory.makeSymbol("SIX"), SubLObjectFactory.makeSymbol("SEVEN"), SubLObjectFactory.makeSymbol("EIGHT"), SubLObjectFactory.makeSymbol("NINE")});
		$sym46$_STASHED_OTHER_VARS_ = SubLObjectFactory.makeSymbol("*STASHED-OTHER-VARS*");
		$sym47$_SUBL_EVAL_METHOD_ = SubLObjectFactory.makeSymbol("*SUBL-EVAL-METHOD*");
		$sym48$_HTML_HANDLER_PROPERTY_ = SubLObjectFactory.makeSymbol("*HTML-HANDLER-PROPERTY*");
	}
}

/*
 * 
 * Total time: 3489 ms
 * 
 */
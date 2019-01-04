//
// For LarKC
//
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class character_names extends SubLTranslatedFile {
	@SubL(source = "sublisp/character-names.lisp", position = 888L)
	public static SubLObject character_names(SubLObject v_char) {
		SubLThread thread = SubLProcess.currentSubLThread();
		return ConsesLow.append(
				Hashtables.gethash(v_char, character_names.$character_names_table$.getDynamicValue(thread),
						CommonSymbols.UNPROVIDED),
				ConsesLow.list(Strings.make_string(CommonSymbols.ONE_INTEGER, v_char)));
	}

	public static SubLObject declare_character_names_file() {
		SubLFiles.declareFunction("com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names", "character_names",
				"CHARACTER-NAMES", 1, 0, false);
		return SubLNil.NIL;
	}

	public static SubLObject init_character_names_file() {
		character_names.$character_names_table$ = SubLFiles.defvar("*CHARACTER-NAMES-TABLE*",
				Hashtables.make_hash_table(character_names.$int0$256, Symbols.symbol_function(CommonSymbols.EQL),
						CommonSymbols.UNPROVIDED));
		character_names.$name_character_table$ = SubLFiles.defvar("*NAME-CHARACTER-TABLE*", Hashtables.make_hash_table(
				character_names.$int0$256, Symbols.symbol_function(CommonSymbols.EQUALP), CommonSymbols.UNPROVIDED));
		return SubLNil.NIL;
	}

	public static SubLObject setup_character_names_file() {
		Hashtables.sethash(Characters.code_char(CommonSymbols.ZERO_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str1$Null, character_names.$str2$NUL));
		Hashtables.sethash(Characters.code_char(CommonSymbols.ONE_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str3$Control_a, character_names.$str4$c_a));
		Hashtables.sethash(Characters.code_char(CommonSymbols.TWO_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str5$Control_b, character_names.$str6$c_b));
		Hashtables.sethash(Characters.code_char(CommonSymbols.THREE_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str7$Control_c, character_names.$str8$c_c));
		Hashtables.sethash(Characters.code_char(CommonSymbols.FOUR_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str9$Control_d, character_names.$str10$c_d));
		Hashtables.sethash(Characters.code_char(CommonSymbols.FIVE_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str11$Control_e, character_names.$str12$c_e));
		Hashtables.sethash(Characters.code_char(CommonSymbols.SIX_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str13$Control_f, character_names.$str14$c_f));
		Hashtables.sethash(Characters.code_char(CommonSymbols.SEVEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str15$Bell, character_names.$str16$BEL));
		Hashtables.sethash(Characters.code_char(CommonSymbols.EIGHT_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str17$Backspace, character_names.$str18$BS));
		Hashtables.sethash(Characters.code_char(CommonSymbols.NINE_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str19$Tab, character_names.$str20$HT));
		Hashtables.sethash(Characters.code_char(CommonSymbols.TEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str21$Newline, character_names.$str22$Linefeed));
		Hashtables.sethash(Characters.code_char(CommonSymbols.ELEVEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str23$Vertical_Tab, character_names.$str24$VT));
		Hashtables.sethash(Characters.code_char(CommonSymbols.TWELVE_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str25$Page, character_names.$str26$FF));
		Hashtables.sethash(Characters.code_char(CommonSymbols.THIRTEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str27$Return, character_names.$str28$CR));
		Hashtables.sethash(Characters.code_char(CommonSymbols.FOURTEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str29$Control_n, character_names.$str30$c_n));
		Hashtables.sethash(Characters.code_char(CommonSymbols.FIFTEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str31$Control_o, character_names.$str32$c_o));
		Hashtables.sethash(Characters.code_char(CommonSymbols.SIXTEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str33$Control_p, character_names.$str34$c_p));
		Hashtables.sethash(Characters.code_char(CommonSymbols.SEVENTEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str35$Control_q, character_names.$str36$c_q));
		Hashtables.sethash(Characters.code_char(CommonSymbols.EIGHTEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str37$Control_r, character_names.$str38$c_r));
		Hashtables.sethash(Characters.code_char(CommonSymbols.NINETEEN_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str39$Control_s, character_names.$str40$c_s));
		Hashtables.sethash(Characters.code_char(CommonSymbols.TWENTY_INTEGER),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str41$Control_t, character_names.$str42$c_t));
		Hashtables.sethash(Characters.code_char(character_names.$int43$21),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str44$Control_u, character_names.$str45$c_u));
		Hashtables.sethash(Characters.code_char(character_names.$int46$22),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str47$Control_v, character_names.$str48$c_v));
		Hashtables.sethash(Characters.code_char(character_names.$int49$23),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str50$Control_w, character_names.$str51$c_w));
		Hashtables.sethash(Characters.code_char(character_names.$int52$24),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str53$Control_x, character_names.$str54$c_x));
		Hashtables.sethash(Characters.code_char(character_names.$int55$25),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str56$Control_y, character_names.$str57$c_y));
		Hashtables.sethash(Characters.code_char(character_names.$int58$26),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str59$Control_z, character_names.$str60$c_z));
		Hashtables.sethash(Characters.code_char(character_names.$int61$27),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str62$Escape, character_names.$str63$ESC));
		Hashtables.sethash(Characters.code_char(character_names.$int64$28),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str65$Control__, character_names.$str66$c__));
		Hashtables.sethash(Characters.code_char(character_names.$int67$29),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str68$Control__, character_names.$str69$c__));
		Hashtables.sethash(Characters.code_char(character_names.$int70$30),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str71$Control__, character_names.$str72$c__));
		Hashtables.sethash(Characters.code_char(character_names.$int73$31),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str74$Control__, character_names.$str75$c__));
		Hashtables.sethash(Characters.code_char(character_names.$int76$32),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str77$Space, character_names.$str78$SP));
		Hashtables.sethash(Characters.code_char(character_names.$int79$127),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str80$Rubout, character_names.$str81$DEL));
		Hashtables.sethash(Characters.code_char(character_names.$int82$128),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str83$Meta_Null, character_names.$str84$m_Null));
		Hashtables.sethash(Characters.code_char(character_names.$int85$129),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str86$Control_Meta_a, character_names.$str87$c_m_a));
		Hashtables.sethash(Characters.code_char(character_names.$int88$130),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str89$Control_Meta_b, character_names.$str90$c_m_b));
		Hashtables.sethash(Characters.code_char(character_names.$int91$131),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str92$Control_Meta_c, character_names.$str93$c_m_c));
		Hashtables.sethash(Characters.code_char(character_names.$int94$132),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str95$Control_Meta_d, character_names.$str96$c_m_d));
		Hashtables.sethash(Characters.code_char(character_names.$int97$133),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str98$Control_Meta_e, character_names.$str99$c_m_e));
		Hashtables.sethash(Characters.code_char(character_names.$int100$134),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str101$Control_Meta_f, character_names.$str102$c_m_f));
		Hashtables.sethash(Characters.code_char(character_names.$int103$135),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str104$Meta_Bell, character_names.$str105$m_Bell));
		Hashtables.sethash(Characters.code_char(character_names.$int106$136),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str107$Meta_Backspace, character_names.$str108$m_Backspace));
		Hashtables.sethash(Characters.code_char(character_names.$int109$137),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str110$Meta_Tab, character_names.$str111$m_Tab));
		Hashtables.sethash(Characters.code_char(character_names.$int112$138),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str113$Meta_Newline, character_names.$str114$m_Newline));
		Hashtables.sethash(Characters.code_char(character_names.$int115$139),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str116$Meta_Vertical_Tab, character_names.$str117$m_Vertical_Tab));
		Hashtables.sethash(Characters.code_char(character_names.$int118$140),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str119$Meta_Page, character_names.$str120$m_Page));
		Hashtables.sethash(Characters.code_char(character_names.$int121$141),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str122$Meta_Return, character_names.$str123$m_Return));
		Hashtables.sethash(Characters.code_char(character_names.$int124$142),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str125$Control_Meta_n, character_names.$str126$c_m_n));
		Hashtables.sethash(Characters.code_char(character_names.$int127$143),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str128$Control_Meta_o, character_names.$str129$c_m_o));
		Hashtables.sethash(Characters.code_char(character_names.$int130$144),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str131$Control_Meta_p, character_names.$str132$c_m_p));
		Hashtables.sethash(Characters.code_char(character_names.$int133$145),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str134$Control_Meta_q, character_names.$str135$c_m_q));
		Hashtables.sethash(Characters.code_char(character_names.$int136$146),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str137$Control_Meta_r, character_names.$str138$c_m_r));
		Hashtables.sethash(Characters.code_char(character_names.$int139$147),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str140$Control_Meta_s, character_names.$str141$c_m_s));
		Hashtables.sethash(Characters.code_char(character_names.$int142$148),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str143$Control_Meta_t, character_names.$str144$c_m_t));
		Hashtables.sethash(Characters.code_char(character_names.$int145$149),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str146$Control_Meta_u, character_names.$str147$c_m_u));
		Hashtables.sethash(Characters.code_char(character_names.$int148$150),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str149$Control_Meta_v, character_names.$str150$c_m_v));
		Hashtables.sethash(Characters.code_char(character_names.$int151$151),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str152$Control_Meta_w, character_names.$str153$c_m_w));
		Hashtables.sethash(Characters.code_char(character_names.$int154$152),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str155$Control_Meta_x, character_names.$str156$c_m_x));
		Hashtables.sethash(Characters.code_char(character_names.$int157$153),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str158$Control_Meta_y, character_names.$str159$c_m_y));
		Hashtables.sethash(Characters.code_char(character_names.$int160$154),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str161$Control_Meta_z, character_names.$str162$c_m_z));
		Hashtables.sethash(Characters.code_char(character_names.$int163$155),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str164$Meta_Escape, character_names.$str165$m_Escape));
		Hashtables.sethash(Characters.code_char(character_names.$int166$156),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str167$Control_Meta__, character_names.$str168$c_m__));
		Hashtables.sethash(Characters.code_char(character_names.$int169$157),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str170$Control_Meta__, character_names.$str171$c_m__));
		Hashtables.sethash(Characters.code_char(character_names.$int172$158),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str173$Control_Meta__, character_names.$str174$c_m__));
		Hashtables.sethash(Characters.code_char(character_names.$int175$159),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str176$Control_Meta__, character_names.$str177$c_m__));
		Hashtables.sethash(Characters.code_char(character_names.$int178$160),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str179$Meta_Space, character_names.$str180$m_Space));
		Hashtables.sethash(Characters.code_char(character_names.$int181$161),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str182$Meta__, character_names.$str183$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int184$162),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str185$Meta__, character_names.$str186$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int187$163),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str188$Meta__, character_names.$str189$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int190$164),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str191$Meta__, character_names.$str192$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int193$165),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str194$Meta__, character_names.$str195$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int196$166),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str197$Meta__, character_names.$str198$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int199$167),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str200$Meta__, character_names.$str201$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int202$168),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str203$Meta__, character_names.$str204$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int205$169),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str206$Meta__, character_names.$str207$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int208$170),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str209$Meta__, character_names.$str210$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int211$171),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str212$Meta__, character_names.$str213$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int214$172),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str215$Meta__, character_names.$str216$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int217$173),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str218$Meta__, character_names.$str219$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int220$174),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str221$Meta__, character_names.$str222$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int223$175),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str224$Meta__, character_names.$str225$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int226$176),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str227$Meta_0, character_names.$str228$m_0));
		Hashtables.sethash(Characters.code_char(character_names.$int229$177),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str230$Meta_1, character_names.$str231$m_1));
		Hashtables.sethash(Characters.code_char(character_names.$int232$178),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str233$Meta_2, character_names.$str234$m_2));
		Hashtables.sethash(Characters.code_char(character_names.$int235$179),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str236$Meta_3, character_names.$str237$m_3));
		Hashtables.sethash(Characters.code_char(character_names.$int238$180),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str239$Meta_4, character_names.$str240$m_4));
		Hashtables.sethash(Characters.code_char(character_names.$int241$181),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str242$Meta_5, character_names.$str243$m_5));
		Hashtables.sethash(Characters.code_char(character_names.$int244$182),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str245$Meta_6, character_names.$str246$m_6));
		Hashtables.sethash(Characters.code_char(character_names.$int247$183),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str248$Meta_7, character_names.$str249$m_7));
		Hashtables.sethash(Characters.code_char(character_names.$int250$184),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str251$Meta_8, character_names.$str252$m_8));
		Hashtables.sethash(Characters.code_char(character_names.$int253$185),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str254$Meta_9, character_names.$str255$m_9));
		Hashtables.sethash(Characters.code_char(character_names.$int256$186),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str257$Meta__, character_names.$str258$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int259$187),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str260$Meta__, character_names.$str261$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int262$188),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str263$Meta__, character_names.$str264$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int265$189),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str266$Meta__, character_names.$str267$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int268$190),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str269$Meta__, character_names.$str270$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int271$191),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str272$Meta__, character_names.$str273$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int274$192),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str275$Meta__, character_names.$str276$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int277$193),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str278$Meta_A, character_names.$str279$m_A));
		Hashtables.sethash(Characters.code_char(character_names.$int280$194),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str281$Meta_B, character_names.$str282$m_B));
		Hashtables.sethash(Characters.code_char(character_names.$int283$195),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str284$Meta_C, character_names.$str285$m_C));
		Hashtables.sethash(Characters.code_char(character_names.$int286$196),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str287$Meta_D, character_names.$str288$m_D));
		Hashtables.sethash(Characters.code_char(character_names.$int289$197),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str290$Meta_E, character_names.$str291$m_E));
		Hashtables.sethash(Characters.code_char(character_names.$int292$198),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str293$Meta_F, character_names.$str294$m_F));
		Hashtables.sethash(Characters.code_char(character_names.$int295$199),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str296$Meta_G, character_names.$str297$m_G));
		Hashtables.sethash(Characters.code_char(character_names.$int298$200),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str299$Meta_H, character_names.$str300$m_H));
		Hashtables.sethash(Characters.code_char(character_names.$int301$201),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str302$Meta_I, character_names.$str303$m_I));
		Hashtables.sethash(Characters.code_char(character_names.$int304$202),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str305$Meta_J, character_names.$str306$m_J));
		Hashtables.sethash(Characters.code_char(character_names.$int307$203),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str308$Meta_K, character_names.$str309$m_K));
		Hashtables.sethash(Characters.code_char(character_names.$int310$204),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str311$Meta_L, character_names.$str312$m_L));
		Hashtables.sethash(Characters.code_char(character_names.$int313$205),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str314$Meta_M, character_names.$str315$m_M));
		Hashtables.sethash(Characters.code_char(character_names.$int316$206),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str317$Meta_N, character_names.$str318$m_N));
		Hashtables.sethash(Characters.code_char(character_names.$int319$207),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str320$Meta_O, character_names.$str321$m_O));
		Hashtables.sethash(Characters.code_char(character_names.$int322$208),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str323$Meta_P, character_names.$str324$m_P));
		Hashtables.sethash(Characters.code_char(character_names.$int325$209),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str326$Meta_Q, character_names.$str327$m_Q));
		Hashtables.sethash(Characters.code_char(character_names.$int328$210),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str329$Meta_R, character_names.$str330$m_R));
		Hashtables.sethash(Characters.code_char(character_names.$int331$211),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str332$Meta_S, character_names.$str333$m_S));
		Hashtables.sethash(Characters.code_char(character_names.$int334$212),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str335$Meta_T, character_names.$str336$m_T));
		Hashtables.sethash(Characters.code_char(character_names.$int337$213),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str338$Meta_U, character_names.$str339$m_U));
		Hashtables.sethash(Characters.code_char(character_names.$int340$214),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str341$Meta_V, character_names.$str342$m_V));
		Hashtables.sethash(Characters.code_char(character_names.$int343$215),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str344$Meta_W, character_names.$str345$m_W));
		Hashtables.sethash(Characters.code_char(character_names.$int346$216),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str347$Meta_X, character_names.$str348$m_X));
		Hashtables.sethash(Characters.code_char(character_names.$int349$217),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str350$Meta_Y, character_names.$str351$m_Y));
		Hashtables.sethash(Characters.code_char(character_names.$int352$218),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str353$Meta_Z, character_names.$str354$m_Z));
		Hashtables.sethash(Characters.code_char(character_names.$int355$219),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str356$Meta__, character_names.$str357$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int358$220),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str359$Meta__, character_names.$str360$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int361$221),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str362$Meta__, character_names.$str363$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int364$222),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str365$Meta__, character_names.$str366$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int367$223),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str368$Meta__, character_names.$str369$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int370$224),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str371$Meta__, character_names.$str372$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int373$225),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str374$Meta_a, character_names.$str375$m_a));
		Hashtables.sethash(Characters.code_char(character_names.$int376$226),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str377$Meta_b, character_names.$str378$m_b));
		Hashtables.sethash(Characters.code_char(character_names.$int379$227),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str380$Meta_c, character_names.$str381$m_c));
		Hashtables.sethash(Characters.code_char(character_names.$int382$228),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str383$Meta_d, character_names.$str384$m_d));
		Hashtables.sethash(Characters.code_char(character_names.$int385$229),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str386$Meta_e, character_names.$str387$m_e));
		Hashtables.sethash(Characters.code_char(character_names.$int388$230),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str389$Meta_f, character_names.$str390$m_f));
		Hashtables.sethash(Characters.code_char(character_names.$int391$231),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str392$Meta_g, character_names.$str393$m_g));
		Hashtables.sethash(Characters.code_char(character_names.$int394$232),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str395$Meta_h, character_names.$str396$m_h));
		Hashtables.sethash(Characters.code_char(character_names.$int397$233),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str398$Meta_i, character_names.$str399$m_i));
		Hashtables.sethash(Characters.code_char(character_names.$int400$234),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str401$Meta_j, character_names.$str402$m_j));
		Hashtables.sethash(Characters.code_char(character_names.$int403$235),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str404$Meta_k, character_names.$str405$m_k));
		Hashtables.sethash(Characters.code_char(character_names.$int406$236),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str407$Meta_l, character_names.$str408$m_l));
		Hashtables.sethash(Characters.code_char(character_names.$int409$237),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str410$Meta_m, character_names.$str411$m_m));
		Hashtables.sethash(Characters.code_char(character_names.$int412$238),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str413$Meta_n, character_names.$str414$m_n));
		Hashtables.sethash(Characters.code_char(character_names.$int415$239),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str416$Meta_o, character_names.$str417$m_o));
		Hashtables.sethash(Characters.code_char(character_names.$int418$240),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str419$Meta_p, character_names.$str420$m_p));
		Hashtables.sethash(Characters.code_char(character_names.$int421$241),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str422$Meta_q, character_names.$str423$m_q));
		Hashtables.sethash(Characters.code_char(character_names.$int424$242),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str425$Meta_r, character_names.$str426$m_r));
		Hashtables.sethash(Characters.code_char(character_names.$int427$243),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str428$Meta_s, character_names.$str429$m_s));
		Hashtables.sethash(Characters.code_char(character_names.$int430$244),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str431$Meta_t, character_names.$str432$m_t));
		Hashtables.sethash(Characters.code_char(character_names.$int433$245),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str434$Meta_u, character_names.$str435$m_u));
		Hashtables.sethash(Characters.code_char(character_names.$int436$246),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str437$Meta_v, character_names.$str438$m_v));
		Hashtables.sethash(Characters.code_char(character_names.$int439$247),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str440$Meta_w, character_names.$str441$m_w));
		Hashtables.sethash(Characters.code_char(character_names.$int442$248),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str443$Meta_x, character_names.$str444$m_x));
		Hashtables.sethash(Characters.code_char(character_names.$int445$249),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str446$Meta_y, character_names.$str447$m_y));
		Hashtables.sethash(Characters.code_char(character_names.$int448$250),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str449$Meta_z, character_names.$str450$m_z));
		Hashtables.sethash(Characters.code_char(character_names.$int451$251),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str452$Meta__, character_names.$str453$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int454$252),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str455$Meta__, character_names.$str456$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int457$253),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str458$Meta__, character_names.$str459$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int460$254),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str461$Meta__, character_names.$str462$m__));
		Hashtables.sethash(Characters.code_char(character_names.$int463$255),
				character_names.$character_names_table$.getDynamicValue(),
				ConsesLow.list(character_names.$str464$Meta_Rubout, character_names.$str465$m_Rubout));
		SubLObject cdohash_table = character_names.$character_names_table$.getDynamicValue();
		SubLObject character = SubLNil.NIL;
		SubLObject names = SubLNil.NIL;
		Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
		try {
			while (Hashtables.iteratorHasNext(cdohash_iterator)) {
				Map.Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
				character = Hashtables.getEntryKey(cdohash_entry);
				SubLObject cdolist_list_var;
				names = cdolist_list_var = Hashtables.getEntryValue(cdohash_entry);
				SubLObject name = SubLNil.NIL;
				name = cdolist_list_var.first();
				while (SubLNil.NIL != cdolist_list_var) {
					Hashtables.sethash(name, character_names.$name_character_table$.getDynamicValue(), character);
					cdolist_list_var = cdolist_list_var.rest();
					name = cdolist_list_var.first();
				}
			}
		} finally {
			Hashtables.releaseEntrySetIterator(cdohash_iterator);
		}
		return SubLNil.NIL;
	}

	public static SubLFile me;
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names";
	@SubL(source = "sublisp/character-names.lisp", position = 427L)
	private static SubLSymbol $character_names_table$;
	@SubL(source = "sublisp/character-names.lisp", position = 1478L)
	private static SubLSymbol $name_character_table$;
	private static SubLInteger $int0$256;
	private static SubLString $str1$Null;
	private static SubLString $str2$NUL;
	private static SubLString $str3$Control_a;
	private static SubLString $str4$c_a;
	private static SubLString $str5$Control_b;
	private static SubLString $str6$c_b;
	private static SubLString $str7$Control_c;
	private static SubLString $str8$c_c;
	private static SubLString $str9$Control_d;
	private static SubLString $str10$c_d;
	private static SubLString $str11$Control_e;
	private static SubLString $str12$c_e;
	private static SubLString $str13$Control_f;
	private static SubLString $str14$c_f;
	private static SubLString $str15$Bell;
	private static SubLString $str16$BEL;
	private static SubLString $str17$Backspace;
	private static SubLString $str18$BS;
	private static SubLString $str19$Tab;
	private static SubLString $str20$HT;
	private static SubLString $str21$Newline;
	private static SubLString $str22$Linefeed;
	private static SubLString $str23$Vertical_Tab;
	private static SubLString $str24$VT;
	private static SubLString $str25$Page;
	private static SubLString $str26$FF;
	private static SubLString $str27$Return;
	private static SubLString $str28$CR;
	private static SubLString $str29$Control_n;
	private static SubLString $str30$c_n;
	private static SubLString $str31$Control_o;
	private static SubLString $str32$c_o;
	private static SubLString $str33$Control_p;
	private static SubLString $str34$c_p;
	private static SubLString $str35$Control_q;
	private static SubLString $str36$c_q;
	private static SubLString $str37$Control_r;
	private static SubLString $str38$c_r;
	private static SubLString $str39$Control_s;
	private static SubLString $str40$c_s;
	private static SubLString $str41$Control_t;
	private static SubLString $str42$c_t;
	private static SubLInteger $int43$21;
	private static SubLString $str44$Control_u;
	private static SubLString $str45$c_u;
	private static SubLInteger $int46$22;
	private static SubLString $str47$Control_v;
	private static SubLString $str48$c_v;
	private static SubLInteger $int49$23;
	private static SubLString $str50$Control_w;
	private static SubLString $str51$c_w;
	private static SubLInteger $int52$24;
	private static SubLString $str53$Control_x;
	private static SubLString $str54$c_x;
	private static SubLInteger $int55$25;
	private static SubLString $str56$Control_y;
	private static SubLString $str57$c_y;
	private static SubLInteger $int58$26;
	private static SubLString $str59$Control_z;
	private static SubLString $str60$c_z;
	private static SubLInteger $int61$27;
	private static SubLString $str62$Escape;
	private static SubLString $str63$ESC;
	private static SubLInteger $int64$28;
	private static SubLString $str65$Control__;
	private static SubLString $str66$c__;
	private static SubLInteger $int67$29;
	private static SubLString $str68$Control__;
	private static SubLString $str69$c__;
	private static SubLInteger $int70$30;
	private static SubLString $str71$Control__;
	private static SubLString $str72$c__;
	private static SubLInteger $int73$31;
	private static SubLString $str74$Control__;
	private static SubLString $str75$c__;
	private static SubLInteger $int76$32;
	private static SubLString $str77$Space;
	private static SubLString $str78$SP;
	private static SubLInteger $int79$127;
	private static SubLString $str80$Rubout;
	private static SubLString $str81$DEL;
	private static SubLInteger $int82$128;
	private static SubLString $str83$Meta_Null;
	private static SubLString $str84$m_Null;
	private static SubLInteger $int85$129;
	private static SubLString $str86$Control_Meta_a;
	private static SubLString $str87$c_m_a;
	private static SubLInteger $int88$130;
	private static SubLString $str89$Control_Meta_b;
	private static SubLString $str90$c_m_b;
	private static SubLInteger $int91$131;
	private static SubLString $str92$Control_Meta_c;
	private static SubLString $str93$c_m_c;
	private static SubLInteger $int94$132;
	private static SubLString $str95$Control_Meta_d;
	private static SubLString $str96$c_m_d;
	private static SubLInteger $int97$133;
	private static SubLString $str98$Control_Meta_e;
	private static SubLString $str99$c_m_e;
	private static SubLInteger $int100$134;
	private static SubLString $str101$Control_Meta_f;
	private static SubLString $str102$c_m_f;
	private static SubLInteger $int103$135;
	private static SubLString $str104$Meta_Bell;
	private static SubLString $str105$m_Bell;
	private static SubLInteger $int106$136;
	private static SubLString $str107$Meta_Backspace;
	private static SubLString $str108$m_Backspace;
	private static SubLInteger $int109$137;
	private static SubLString $str110$Meta_Tab;
	private static SubLString $str111$m_Tab;
	private static SubLInteger $int112$138;
	private static SubLString $str113$Meta_Newline;
	private static SubLString $str114$m_Newline;
	private static SubLInteger $int115$139;
	private static SubLString $str116$Meta_Vertical_Tab;
	private static SubLString $str117$m_Vertical_Tab;
	private static SubLInteger $int118$140;
	private static SubLString $str119$Meta_Page;
	private static SubLString $str120$m_Page;
	private static SubLInteger $int121$141;
	private static SubLString $str122$Meta_Return;
	private static SubLString $str123$m_Return;
	private static SubLInteger $int124$142;
	private static SubLString $str125$Control_Meta_n;
	private static SubLString $str126$c_m_n;
	private static SubLInteger $int127$143;
	private static SubLString $str128$Control_Meta_o;
	private static SubLString $str129$c_m_o;
	private static SubLInteger $int130$144;
	private static SubLString $str131$Control_Meta_p;
	private static SubLString $str132$c_m_p;
	private static SubLInteger $int133$145;
	private static SubLString $str134$Control_Meta_q;
	private static SubLString $str135$c_m_q;
	private static SubLInteger $int136$146;
	private static SubLString $str137$Control_Meta_r;
	private static SubLString $str138$c_m_r;
	private static SubLInteger $int139$147;
	private static SubLString $str140$Control_Meta_s;
	private static SubLString $str141$c_m_s;
	private static SubLInteger $int142$148;
	private static SubLString $str143$Control_Meta_t;
	private static SubLString $str144$c_m_t;
	private static SubLInteger $int145$149;
	private static SubLString $str146$Control_Meta_u;
	private static SubLString $str147$c_m_u;
	private static SubLInteger $int148$150;
	private static SubLString $str149$Control_Meta_v;
	private static SubLString $str150$c_m_v;
	private static SubLInteger $int151$151;
	private static SubLString $str152$Control_Meta_w;
	private static SubLString $str153$c_m_w;
	private static SubLInteger $int154$152;
	private static SubLString $str155$Control_Meta_x;
	private static SubLString $str156$c_m_x;
	private static SubLInteger $int157$153;
	private static SubLString $str158$Control_Meta_y;
	private static SubLString $str159$c_m_y;
	private static SubLInteger $int160$154;
	private static SubLString $str161$Control_Meta_z;
	private static SubLString $str162$c_m_z;
	private static SubLInteger $int163$155;
	private static SubLString $str164$Meta_Escape;
	private static SubLString $str165$m_Escape;
	private static SubLInteger $int166$156;
	private static SubLString $str167$Control_Meta__;
	private static SubLString $str168$c_m__;
	private static SubLInteger $int169$157;
	private static SubLString $str170$Control_Meta__;
	private static SubLString $str171$c_m__;
	private static SubLInteger $int172$158;
	private static SubLString $str173$Control_Meta__;
	private static SubLString $str174$c_m__;
	private static SubLInteger $int175$159;
	private static SubLString $str176$Control_Meta__;
	private static SubLString $str177$c_m__;
	private static SubLInteger $int178$160;
	private static SubLString $str179$Meta_Space;
	private static SubLString $str180$m_Space;
	private static SubLInteger $int181$161;
	private static SubLString $str182$Meta__;
	private static SubLString $str183$m__;
	private static SubLInteger $int184$162;
	private static SubLString $str185$Meta__;
	private static SubLString $str186$m__;
	private static SubLInteger $int187$163;
	private static SubLString $str188$Meta__;
	private static SubLString $str189$m__;
	private static SubLInteger $int190$164;
	private static SubLString $str191$Meta__;
	private static SubLString $str192$m__;
	private static SubLInteger $int193$165;
	private static SubLString $str194$Meta__;
	private static SubLString $str195$m__;
	private static SubLInteger $int196$166;
	private static SubLString $str197$Meta__;
	private static SubLString $str198$m__;
	private static SubLInteger $int199$167;
	private static SubLString $str200$Meta__;
	private static SubLString $str201$m__;
	private static SubLInteger $int202$168;
	private static SubLString $str203$Meta__;
	private static SubLString $str204$m__;
	private static SubLInteger $int205$169;
	private static SubLString $str206$Meta__;
	private static SubLString $str207$m__;
	private static SubLInteger $int208$170;
	private static SubLString $str209$Meta__;
	private static SubLString $str210$m__;
	private static SubLInteger $int211$171;
	private static SubLString $str212$Meta__;
	private static SubLString $str213$m__;
	private static SubLInteger $int214$172;
	private static SubLString $str215$Meta__;
	private static SubLString $str216$m__;
	private static SubLInteger $int217$173;
	private static SubLString $str218$Meta__;
	private static SubLString $str219$m__;
	private static SubLInteger $int220$174;
	private static SubLString $str221$Meta__;
	private static SubLString $str222$m__;
	private static SubLInteger $int223$175;
	private static SubLString $str224$Meta__;
	private static SubLString $str225$m__;
	private static SubLInteger $int226$176;
	private static SubLString $str227$Meta_0;
	private static SubLString $str228$m_0;
	private static SubLInteger $int229$177;
	private static SubLString $str230$Meta_1;
	private static SubLString $str231$m_1;
	private static SubLInteger $int232$178;
	private static SubLString $str233$Meta_2;
	private static SubLString $str234$m_2;
	private static SubLInteger $int235$179;
	private static SubLString $str236$Meta_3;
	private static SubLString $str237$m_3;
	private static SubLInteger $int238$180;
	private static SubLString $str239$Meta_4;
	private static SubLString $str240$m_4;
	private static SubLInteger $int241$181;
	private static SubLString $str242$Meta_5;
	private static SubLString $str243$m_5;
	private static SubLInteger $int244$182;
	private static SubLString $str245$Meta_6;
	private static SubLString $str246$m_6;
	private static SubLInteger $int247$183;
	private static SubLString $str248$Meta_7;
	private static SubLString $str249$m_7;
	private static SubLInteger $int250$184;
	private static SubLString $str251$Meta_8;
	private static SubLString $str252$m_8;
	private static SubLInteger $int253$185;
	private static SubLString $str254$Meta_9;
	private static SubLString $str255$m_9;
	private static SubLInteger $int256$186;
	private static SubLString $str257$Meta__;
	private static SubLString $str258$m__;
	private static SubLInteger $int259$187;
	private static SubLString $str260$Meta__;
	private static SubLString $str261$m__;
	private static SubLInteger $int262$188;
	private static SubLString $str263$Meta__;
	private static SubLString $str264$m__;
	private static SubLInteger $int265$189;
	private static SubLString $str266$Meta__;
	private static SubLString $str267$m__;
	private static SubLInteger $int268$190;
	private static SubLString $str269$Meta__;
	private static SubLString $str270$m__;
	private static SubLInteger $int271$191;
	private static SubLString $str272$Meta__;
	private static SubLString $str273$m__;
	private static SubLInteger $int274$192;
	private static SubLString $str275$Meta__;
	private static SubLString $str276$m__;
	private static SubLInteger $int277$193;
	private static SubLString $str278$Meta_A;
	private static SubLString $str279$m_A;
	private static SubLInteger $int280$194;
	private static SubLString $str281$Meta_B;
	private static SubLString $str282$m_B;
	private static SubLInteger $int283$195;
	private static SubLString $str284$Meta_C;
	private static SubLString $str285$m_C;
	private static SubLInteger $int286$196;
	private static SubLString $str287$Meta_D;
	private static SubLString $str288$m_D;
	private static SubLInteger $int289$197;
	private static SubLString $str290$Meta_E;
	private static SubLString $str291$m_E;
	private static SubLInteger $int292$198;
	private static SubLString $str293$Meta_F;
	private static SubLString $str294$m_F;
	private static SubLInteger $int295$199;
	private static SubLString $str296$Meta_G;
	private static SubLString $str297$m_G;
	private static SubLInteger $int298$200;
	private static SubLString $str299$Meta_H;
	private static SubLString $str300$m_H;
	private static SubLInteger $int301$201;
	private static SubLString $str302$Meta_I;
	private static SubLString $str303$m_I;
	private static SubLInteger $int304$202;
	private static SubLString $str305$Meta_J;
	private static SubLString $str306$m_J;
	private static SubLInteger $int307$203;
	private static SubLString $str308$Meta_K;
	private static SubLString $str309$m_K;
	private static SubLInteger $int310$204;
	private static SubLString $str311$Meta_L;
	private static SubLString $str312$m_L;
	private static SubLInteger $int313$205;
	private static SubLString $str314$Meta_M;
	private static SubLString $str315$m_M;
	private static SubLInteger $int316$206;
	private static SubLString $str317$Meta_N;
	private static SubLString $str318$m_N;
	private static SubLInteger $int319$207;
	private static SubLString $str320$Meta_O;
	private static SubLString $str321$m_O;
	private static SubLInteger $int322$208;
	private static SubLString $str323$Meta_P;
	private static SubLString $str324$m_P;
	private static SubLInteger $int325$209;
	private static SubLString $str326$Meta_Q;
	private static SubLString $str327$m_Q;
	private static SubLInteger $int328$210;
	private static SubLString $str329$Meta_R;
	private static SubLString $str330$m_R;
	private static SubLInteger $int331$211;
	private static SubLString $str332$Meta_S;
	private static SubLString $str333$m_S;
	private static SubLInteger $int334$212;
	private static SubLString $str335$Meta_T;
	private static SubLString $str336$m_T;
	private static SubLInteger $int337$213;
	private static SubLString $str338$Meta_U;
	private static SubLString $str339$m_U;
	private static SubLInteger $int340$214;
	private static SubLString $str341$Meta_V;
	private static SubLString $str342$m_V;
	private static SubLInteger $int343$215;
	private static SubLString $str344$Meta_W;
	private static SubLString $str345$m_W;
	private static SubLInteger $int346$216;
	private static SubLString $str347$Meta_X;
	private static SubLString $str348$m_X;
	private static SubLInteger $int349$217;
	private static SubLString $str350$Meta_Y;
	private static SubLString $str351$m_Y;
	private static SubLInteger $int352$218;
	private static SubLString $str353$Meta_Z;
	private static SubLString $str354$m_Z;
	private static SubLInteger $int355$219;
	private static SubLString $str356$Meta__;
	private static SubLString $str357$m__;
	private static SubLInteger $int358$220;
	private static SubLString $str359$Meta__;
	private static SubLString $str360$m__;
	private static SubLInteger $int361$221;
	private static SubLString $str362$Meta__;
	private static SubLString $str363$m__;
	private static SubLInteger $int364$222;
	private static SubLString $str365$Meta__;
	private static SubLString $str366$m__;
	private static SubLInteger $int367$223;
	private static SubLString $str368$Meta__;
	private static SubLString $str369$m__;
	private static SubLInteger $int370$224;
	private static SubLString $str371$Meta__;
	private static SubLString $str372$m__;
	private static SubLInteger $int373$225;
	private static SubLString $str374$Meta_a;
	private static SubLString $str375$m_a;
	private static SubLInteger $int376$226;
	private static SubLString $str377$Meta_b;
	private static SubLString $str378$m_b;
	private static SubLInteger $int379$227;
	private static SubLString $str380$Meta_c;
	private static SubLString $str381$m_c;
	private static SubLInteger $int382$228;
	private static SubLString $str383$Meta_d;
	private static SubLString $str384$m_d;
	private static SubLInteger $int385$229;
	private static SubLString $str386$Meta_e;
	private static SubLString $str387$m_e;
	private static SubLInteger $int388$230;
	private static SubLString $str389$Meta_f;
	private static SubLString $str390$m_f;
	private static SubLInteger $int391$231;
	private static SubLString $str392$Meta_g;
	private static SubLString $str393$m_g;
	private static SubLInteger $int394$232;
	private static SubLString $str395$Meta_h;
	private static SubLString $str396$m_h;
	private static SubLInteger $int397$233;
	private static SubLString $str398$Meta_i;
	private static SubLString $str399$m_i;
	private static SubLInteger $int400$234;
	private static SubLString $str401$Meta_j;
	private static SubLString $str402$m_j;
	private static SubLInteger $int403$235;
	private static SubLString $str404$Meta_k;
	private static SubLString $str405$m_k;
	private static SubLInteger $int406$236;
	private static SubLString $str407$Meta_l;
	private static SubLString $str408$m_l;
	private static SubLInteger $int409$237;
	private static SubLString $str410$Meta_m;
	private static SubLString $str411$m_m;
	private static SubLInteger $int412$238;
	private static SubLString $str413$Meta_n;
	private static SubLString $str414$m_n;
	private static SubLInteger $int415$239;
	private static SubLString $str416$Meta_o;
	private static SubLString $str417$m_o;
	private static SubLInteger $int418$240;
	private static SubLString $str419$Meta_p;
	private static SubLString $str420$m_p;
	private static SubLInteger $int421$241;
	private static SubLString $str422$Meta_q;
	private static SubLString $str423$m_q;
	private static SubLInteger $int424$242;
	private static SubLString $str425$Meta_r;
	private static SubLString $str426$m_r;
	private static SubLInteger $int427$243;
	private static SubLString $str428$Meta_s;
	private static SubLString $str429$m_s;
	private static SubLInteger $int430$244;
	private static SubLString $str431$Meta_t;
	private static SubLString $str432$m_t;
	private static SubLInteger $int433$245;
	private static SubLString $str434$Meta_u;
	private static SubLString $str435$m_u;
	private static SubLInteger $int436$246;
	private static SubLString $str437$Meta_v;
	private static SubLString $str438$m_v;
	private static SubLInteger $int439$247;
	private static SubLString $str440$Meta_w;
	private static SubLString $str441$m_w;
	private static SubLInteger $int442$248;
	private static SubLString $str443$Meta_x;
	private static SubLString $str444$m_x;
	private static SubLInteger $int445$249;
	private static SubLString $str446$Meta_y;
	private static SubLString $str447$m_y;
	private static SubLInteger $int448$250;
	private static SubLString $str449$Meta_z;
	private static SubLString $str450$m_z;
	private static SubLInteger $int451$251;
	private static SubLString $str452$Meta__;
	private static SubLString $str453$m__;
	private static SubLInteger $int454$252;
	private static SubLString $str455$Meta__;
	private static SubLString $str456$m__;
	private static SubLInteger $int457$253;
	private static SubLString $str458$Meta__;
	private static SubLString $str459$m__;
	private static SubLInteger $int460$254;
	private static SubLString $str461$Meta__;
	private static SubLString $str462$m__;
	private static SubLInteger $int463$255;
	private static SubLString $str464$Meta_Rubout;
	private static SubLString $str465$m_Rubout;
	static {
		me = new character_names();
		character_names.$character_names_table$ = null;
		character_names.$name_character_table$ = null;
		$int0$256 = SubLObjectFactory.makeInteger(256);
		$str1$Null = SubLObjectFactory.makeString("Null");
		$str2$NUL = SubLObjectFactory.makeString("NUL");
		$str3$Control_a = SubLObjectFactory.makeString("Control-a");
		$str4$c_a = SubLObjectFactory.makeString("c-a");
		$str5$Control_b = SubLObjectFactory.makeString("Control-b");
		$str6$c_b = SubLObjectFactory.makeString("c-b");
		$str7$Control_c = SubLObjectFactory.makeString("Control-c");
		$str8$c_c = SubLObjectFactory.makeString("c-c");
		$str9$Control_d = SubLObjectFactory.makeString("Control-d");
		$str10$c_d = SubLObjectFactory.makeString("c-d");
		$str11$Control_e = SubLObjectFactory.makeString("Control-e");
		$str12$c_e = SubLObjectFactory.makeString("c-e");
		$str13$Control_f = SubLObjectFactory.makeString("Control-f");
		$str14$c_f = SubLObjectFactory.makeString("c-f");
		$str15$Bell = SubLObjectFactory.makeString("Bell");
		$str16$BEL = SubLObjectFactory.makeString("BEL");
		$str17$Backspace = SubLObjectFactory.makeString("Backspace");
		$str18$BS = SubLObjectFactory.makeString("BS");
		$str19$Tab = SubLObjectFactory.makeString("Tab");
		$str20$HT = SubLObjectFactory.makeString("HT");
		$str21$Newline = SubLObjectFactory.makeString("Newline");
		$str22$Linefeed = SubLObjectFactory.makeString("Linefeed");
		$str23$Vertical_Tab = SubLObjectFactory.makeString("Vertical-Tab");
		$str24$VT = SubLObjectFactory.makeString("VT");
		$str25$Page = SubLObjectFactory.makeString("Page");
		$str26$FF = SubLObjectFactory.makeString("FF");
		$str27$Return = SubLObjectFactory.makeString("Return");
		$str28$CR = SubLObjectFactory.makeString("CR");
		$str29$Control_n = SubLObjectFactory.makeString("Control-n");
		$str30$c_n = SubLObjectFactory.makeString("c-n");
		$str31$Control_o = SubLObjectFactory.makeString("Control-o");
		$str32$c_o = SubLObjectFactory.makeString("c-o");
		$str33$Control_p = SubLObjectFactory.makeString("Control-p");
		$str34$c_p = SubLObjectFactory.makeString("c-p");
		$str35$Control_q = SubLObjectFactory.makeString("Control-q");
		$str36$c_q = SubLObjectFactory.makeString("c-q");
		$str37$Control_r = SubLObjectFactory.makeString("Control-r");
		$str38$c_r = SubLObjectFactory.makeString("c-r");
		$str39$Control_s = SubLObjectFactory.makeString("Control-s");
		$str40$c_s = SubLObjectFactory.makeString("c-s");
		$str41$Control_t = SubLObjectFactory.makeString("Control-t");
		$str42$c_t = SubLObjectFactory.makeString("c-t");
		$int43$21 = SubLObjectFactory.makeInteger(21);
		$str44$Control_u = SubLObjectFactory.makeString("Control-u");
		$str45$c_u = SubLObjectFactory.makeString("c-u");
		$int46$22 = SubLObjectFactory.makeInteger(22);
		$str47$Control_v = SubLObjectFactory.makeString("Control-v");
		$str48$c_v = SubLObjectFactory.makeString("c-v");
		$int49$23 = SubLObjectFactory.makeInteger(23);
		$str50$Control_w = SubLObjectFactory.makeString("Control-w");
		$str51$c_w = SubLObjectFactory.makeString("c-w");
		$int52$24 = SubLObjectFactory.makeInteger(24);
		$str53$Control_x = SubLObjectFactory.makeString("Control-x");
		$str54$c_x = SubLObjectFactory.makeString("c-x");
		$int55$25 = SubLObjectFactory.makeInteger(25);
		$str56$Control_y = SubLObjectFactory.makeString("Control-y");
		$str57$c_y = SubLObjectFactory.makeString("c-y");
		$int58$26 = SubLObjectFactory.makeInteger(26);
		$str59$Control_z = SubLObjectFactory.makeString("Control-z");
		$str60$c_z = SubLObjectFactory.makeString("c-z");
		$int61$27 = SubLObjectFactory.makeInteger(27);
		$str62$Escape = SubLObjectFactory.makeString("Escape");
		$str63$ESC = SubLObjectFactory.makeString("ESC");
		$int64$28 = SubLObjectFactory.makeInteger(28);
		$str65$Control__ = SubLObjectFactory.makeString("Control-\\");
		$str66$c__ = SubLObjectFactory.makeString("c-\\");
		$int67$29 = SubLObjectFactory.makeInteger(29);
		$str68$Control__ = SubLObjectFactory.makeString("Control-]");
		$str69$c__ = SubLObjectFactory.makeString("c-]");
		$int70$30 = SubLObjectFactory.makeInteger(30);
		$str71$Control__ = SubLObjectFactory.makeString("Control-^");
		$str72$c__ = SubLObjectFactory.makeString("c-^");
		$int73$31 = SubLObjectFactory.makeInteger(31);
		$str74$Control__ = SubLObjectFactory.makeString("Control-_");
		$str75$c__ = SubLObjectFactory.makeString("c-_");
		$int76$32 = SubLObjectFactory.makeInteger(32);
		$str77$Space = SubLObjectFactory.makeString("Space");
		$str78$SP = SubLObjectFactory.makeString("SP");
		$int79$127 = SubLObjectFactory.makeInteger(127);
		$str80$Rubout = SubLObjectFactory.makeString("Rubout");
		$str81$DEL = SubLObjectFactory.makeString("DEL");
		$int82$128 = SubLObjectFactory.makeInteger(128);
		$str83$Meta_Null = SubLObjectFactory.makeString("Meta-Null");
		$str84$m_Null = SubLObjectFactory.makeString("m-Null");
		$int85$129 = SubLObjectFactory.makeInteger(129);
		$str86$Control_Meta_a = SubLObjectFactory.makeString("Control-Meta-a");
		$str87$c_m_a = SubLObjectFactory.makeString("c-m-a");
		$int88$130 = SubLObjectFactory.makeInteger(130);
		$str89$Control_Meta_b = SubLObjectFactory.makeString("Control-Meta-b");
		$str90$c_m_b = SubLObjectFactory.makeString("c-m-b");
		$int91$131 = SubLObjectFactory.makeInteger(131);
		$str92$Control_Meta_c = SubLObjectFactory.makeString("Control-Meta-c");
		$str93$c_m_c = SubLObjectFactory.makeString("c-m-c");
		$int94$132 = SubLObjectFactory.makeInteger(132);
		$str95$Control_Meta_d = SubLObjectFactory.makeString("Control-Meta-d");
		$str96$c_m_d = SubLObjectFactory.makeString("c-m-d");
		$int97$133 = SubLObjectFactory.makeInteger(133);
		$str98$Control_Meta_e = SubLObjectFactory.makeString("Control-Meta-e");
		$str99$c_m_e = SubLObjectFactory.makeString("c-m-e");
		$int100$134 = SubLObjectFactory.makeInteger(134);
		$str101$Control_Meta_f = SubLObjectFactory.makeString("Control-Meta-f");
		$str102$c_m_f = SubLObjectFactory.makeString("c-m-f");
		$int103$135 = SubLObjectFactory.makeInteger(135);
		$str104$Meta_Bell = SubLObjectFactory.makeString("Meta-Bell");
		$str105$m_Bell = SubLObjectFactory.makeString("m-Bell");
		$int106$136 = SubLObjectFactory.makeInteger(136);
		$str107$Meta_Backspace = SubLObjectFactory.makeString("Meta-Backspace");
		$str108$m_Backspace = SubLObjectFactory.makeString("m-Backspace");
		$int109$137 = SubLObjectFactory.makeInteger(137);
		$str110$Meta_Tab = SubLObjectFactory.makeString("Meta-Tab");
		$str111$m_Tab = SubLObjectFactory.makeString("m-Tab");
		$int112$138 = SubLObjectFactory.makeInteger(138);
		$str113$Meta_Newline = SubLObjectFactory.makeString("Meta-Newline");
		$str114$m_Newline = SubLObjectFactory.makeString("m-Newline");
		$int115$139 = SubLObjectFactory.makeInteger(139);
		$str116$Meta_Vertical_Tab = SubLObjectFactory.makeString("Meta-Vertical-Tab");
		$str117$m_Vertical_Tab = SubLObjectFactory.makeString("m-Vertical-Tab");
		$int118$140 = SubLObjectFactory.makeInteger(140);
		$str119$Meta_Page = SubLObjectFactory.makeString("Meta-Page");
		$str120$m_Page = SubLObjectFactory.makeString("m-Page");
		$int121$141 = SubLObjectFactory.makeInteger(141);
		$str122$Meta_Return = SubLObjectFactory.makeString("Meta-Return");
		$str123$m_Return = SubLObjectFactory.makeString("m-Return");
		$int124$142 = SubLObjectFactory.makeInteger(142);
		$str125$Control_Meta_n = SubLObjectFactory.makeString("Control-Meta-n");
		$str126$c_m_n = SubLObjectFactory.makeString("c-m-n");
		$int127$143 = SubLObjectFactory.makeInteger(143);
		$str128$Control_Meta_o = SubLObjectFactory.makeString("Control-Meta-o");
		$str129$c_m_o = SubLObjectFactory.makeString("c-m-o");
		$int130$144 = SubLObjectFactory.makeInteger(144);
		$str131$Control_Meta_p = SubLObjectFactory.makeString("Control-Meta-p");
		$str132$c_m_p = SubLObjectFactory.makeString("c-m-p");
		$int133$145 = SubLObjectFactory.makeInteger(145);
		$str134$Control_Meta_q = SubLObjectFactory.makeString("Control-Meta-q");
		$str135$c_m_q = SubLObjectFactory.makeString("c-m-q");
		$int136$146 = SubLObjectFactory.makeInteger(146);
		$str137$Control_Meta_r = SubLObjectFactory.makeString("Control-Meta-r");
		$str138$c_m_r = SubLObjectFactory.makeString("c-m-r");
		$int139$147 = SubLObjectFactory.makeInteger(147);
		$str140$Control_Meta_s = SubLObjectFactory.makeString("Control-Meta-s");
		$str141$c_m_s = SubLObjectFactory.makeString("c-m-s");
		$int142$148 = SubLObjectFactory.makeInteger(148);
		$str143$Control_Meta_t = SubLObjectFactory.makeString("Control-Meta-t");
		$str144$c_m_t = SubLObjectFactory.makeString("c-m-t");
		$int145$149 = SubLObjectFactory.makeInteger(149);
		$str146$Control_Meta_u = SubLObjectFactory.makeString("Control-Meta-u");
		$str147$c_m_u = SubLObjectFactory.makeString("c-m-u");
		$int148$150 = SubLObjectFactory.makeInteger(150);
		$str149$Control_Meta_v = SubLObjectFactory.makeString("Control-Meta-v");
		$str150$c_m_v = SubLObjectFactory.makeString("c-m-v");
		$int151$151 = SubLObjectFactory.makeInteger(151);
		$str152$Control_Meta_w = SubLObjectFactory.makeString("Control-Meta-w");
		$str153$c_m_w = SubLObjectFactory.makeString("c-m-w");
		$int154$152 = SubLObjectFactory.makeInteger(152);
		$str155$Control_Meta_x = SubLObjectFactory.makeString("Control-Meta-x");
		$str156$c_m_x = SubLObjectFactory.makeString("c-m-x");
		$int157$153 = SubLObjectFactory.makeInteger(153);
		$str158$Control_Meta_y = SubLObjectFactory.makeString("Control-Meta-y");
		$str159$c_m_y = SubLObjectFactory.makeString("c-m-y");
		$int160$154 = SubLObjectFactory.makeInteger(154);
		$str161$Control_Meta_z = SubLObjectFactory.makeString("Control-Meta-z");
		$str162$c_m_z = SubLObjectFactory.makeString("c-m-z");
		$int163$155 = SubLObjectFactory.makeInteger(155);
		$str164$Meta_Escape = SubLObjectFactory.makeString("Meta-Escape");
		$str165$m_Escape = SubLObjectFactory.makeString("m-Escape");
		$int166$156 = SubLObjectFactory.makeInteger(156);
		$str167$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-\\");
		$str168$c_m__ = SubLObjectFactory.makeString("c-m-\\");
		$int169$157 = SubLObjectFactory.makeInteger(157);
		$str170$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-]");
		$str171$c_m__ = SubLObjectFactory.makeString("c-m-]");
		$int172$158 = SubLObjectFactory.makeInteger(158);
		$str173$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-^");
		$str174$c_m__ = SubLObjectFactory.makeString("c-m-^");
		$int175$159 = SubLObjectFactory.makeInteger(159);
		$str176$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-_");
		$str177$c_m__ = SubLObjectFactory.makeString("c-m-_");
		$int178$160 = SubLObjectFactory.makeInteger(160);
		$str179$Meta_Space = SubLObjectFactory.makeString("Meta-Space");
		$str180$m_Space = SubLObjectFactory.makeString("m-Space");
		$int181$161 = SubLObjectFactory.makeInteger(161);
		$str182$Meta__ = SubLObjectFactory.makeString("Meta-!");
		$str183$m__ = SubLObjectFactory.makeString("m-!");
		$int184$162 = SubLObjectFactory.makeInteger(162);
		$str185$Meta__ = SubLObjectFactory.makeString("Meta-\"");
		$str186$m__ = SubLObjectFactory.makeString("m-\"");
		$int187$163 = SubLObjectFactory.makeInteger(163);
		$str188$Meta__ = SubLObjectFactory.makeString("Meta-#");
		$str189$m__ = SubLObjectFactory.makeString("m-#");
		$int190$164 = SubLObjectFactory.makeInteger(164);
		$str191$Meta__ = SubLObjectFactory.makeString("Meta-$");
		$str192$m__ = SubLObjectFactory.makeString("m-$");
		$int193$165 = SubLObjectFactory.makeInteger(165);
		$str194$Meta__ = SubLObjectFactory.makeString("Meta-%");
		$str195$m__ = SubLObjectFactory.makeString("m-%");
		$int196$166 = SubLObjectFactory.makeInteger(166);
		$str197$Meta__ = SubLObjectFactory.makeString("Meta-&");
		$str198$m__ = SubLObjectFactory.makeString("m-&");
		$int199$167 = SubLObjectFactory.makeInteger(167);
		$str200$Meta__ = SubLObjectFactory.makeString("Meta-'");
		$str201$m__ = SubLObjectFactory.makeString("m-'");
		$int202$168 = SubLObjectFactory.makeInteger(168);
		$str203$Meta__ = SubLObjectFactory.makeString("Meta-(");
		$str204$m__ = SubLObjectFactory.makeString("m-(");
		$int205$169 = SubLObjectFactory.makeInteger(169);
		$str206$Meta__ = SubLObjectFactory.makeString("Meta-)");
		$str207$m__ = SubLObjectFactory.makeString("m-)");
		$int208$170 = SubLObjectFactory.makeInteger(170);
		$str209$Meta__ = SubLObjectFactory.makeString("Meta-*");
		$str210$m__ = SubLObjectFactory.makeString("m-*");
		$int211$171 = SubLObjectFactory.makeInteger(171);
		$str212$Meta__ = SubLObjectFactory.makeString("Meta-+");
		$str213$m__ = SubLObjectFactory.makeString("m-+");
		$int214$172 = SubLObjectFactory.makeInteger(172);
		$str215$Meta__ = SubLObjectFactory.makeString("Meta-,");
		$str216$m__ = SubLObjectFactory.makeString("m-,");
		$int217$173 = SubLObjectFactory.makeInteger(173);
		$str218$Meta__ = SubLObjectFactory.makeString("Meta--");
		$str219$m__ = SubLObjectFactory.makeString("m--");
		$int220$174 = SubLObjectFactory.makeInteger(174);
		$str221$Meta__ = SubLObjectFactory.makeString("Meta-.");
		$str222$m__ = SubLObjectFactory.makeString("m-.");
		$int223$175 = SubLObjectFactory.makeInteger(175);
		$str224$Meta__ = SubLObjectFactory.makeString("Meta-/");
		$str225$m__ = SubLObjectFactory.makeString("m-/");
		$int226$176 = SubLObjectFactory.makeInteger(176);
		$str227$Meta_0 = SubLObjectFactory.makeString("Meta-0");
		$str228$m_0 = SubLObjectFactory.makeString("m-0");
		$int229$177 = SubLObjectFactory.makeInteger(177);
		$str230$Meta_1 = SubLObjectFactory.makeString("Meta-1");
		$str231$m_1 = SubLObjectFactory.makeString("m-1");
		$int232$178 = SubLObjectFactory.makeInteger(178);
		$str233$Meta_2 = SubLObjectFactory.makeString("Meta-2");
		$str234$m_2 = SubLObjectFactory.makeString("m-2");
		$int235$179 = SubLObjectFactory.makeInteger(179);
		$str236$Meta_3 = SubLObjectFactory.makeString("Meta-3");
		$str237$m_3 = SubLObjectFactory.makeString("m-3");
		$int238$180 = SubLObjectFactory.makeInteger(180);
		$str239$Meta_4 = SubLObjectFactory.makeString("Meta-4");
		$str240$m_4 = SubLObjectFactory.makeString("m-4");
		$int241$181 = SubLObjectFactory.makeInteger(181);
		$str242$Meta_5 = SubLObjectFactory.makeString("Meta-5");
		$str243$m_5 = SubLObjectFactory.makeString("m-5");
		$int244$182 = SubLObjectFactory.makeInteger(182);
		$str245$Meta_6 = SubLObjectFactory.makeString("Meta-6");
		$str246$m_6 = SubLObjectFactory.makeString("m-6");
		$int247$183 = SubLObjectFactory.makeInteger(183);
		$str248$Meta_7 = SubLObjectFactory.makeString("Meta-7");
		$str249$m_7 = SubLObjectFactory.makeString("m-7");
		$int250$184 = SubLObjectFactory.makeInteger(184);
		$str251$Meta_8 = SubLObjectFactory.makeString("Meta-8");
		$str252$m_8 = SubLObjectFactory.makeString("m-8");
		$int253$185 = SubLObjectFactory.makeInteger(185);
		$str254$Meta_9 = SubLObjectFactory.makeString("Meta-9");
		$str255$m_9 = SubLObjectFactory.makeString("m-9");
		$int256$186 = SubLObjectFactory.makeInteger(186);
		$str257$Meta__ = SubLObjectFactory.makeString("Meta-:");
		$str258$m__ = SubLObjectFactory.makeString("m-:");
		$int259$187 = SubLObjectFactory.makeInteger(187);
		$str260$Meta__ = SubLObjectFactory.makeString("Meta-;");
		$str261$m__ = SubLObjectFactory.makeString("m-;");
		$int262$188 = SubLObjectFactory.makeInteger(188);
		$str263$Meta__ = SubLObjectFactory.makeString("Meta-<");
		$str264$m__ = SubLObjectFactory.makeString("m-<");
		$int265$189 = SubLObjectFactory.makeInteger(189);
		$str266$Meta__ = SubLObjectFactory.makeString("Meta-=");
		$str267$m__ = SubLObjectFactory.makeString("m-=");
		$int268$190 = SubLObjectFactory.makeInteger(190);
		$str269$Meta__ = SubLObjectFactory.makeString("Meta->");
		$str270$m__ = SubLObjectFactory.makeString("m->");
		$int271$191 = SubLObjectFactory.makeInteger(191);
		$str272$Meta__ = SubLObjectFactory.makeString("Meta-?");
		$str273$m__ = SubLObjectFactory.makeString("m-?");
		$int274$192 = SubLObjectFactory.makeInteger(192);
		$str275$Meta__ = SubLObjectFactory.makeString("Meta-@");
		$str276$m__ = SubLObjectFactory.makeString("m-@");
		$int277$193 = SubLObjectFactory.makeInteger(193);
		$str278$Meta_A = SubLObjectFactory.makeString("Meta-A");
		$str279$m_A = SubLObjectFactory.makeString("m-A");
		$int280$194 = SubLObjectFactory.makeInteger(194);
		$str281$Meta_B = SubLObjectFactory.makeString("Meta-B");
		$str282$m_B = SubLObjectFactory.makeString("m-B");
		$int283$195 = SubLObjectFactory.makeInteger(195);
		$str284$Meta_C = SubLObjectFactory.makeString("Meta-C");
		$str285$m_C = SubLObjectFactory.makeString("m-C");
		$int286$196 = SubLObjectFactory.makeInteger(196);
		$str287$Meta_D = SubLObjectFactory.makeString("Meta-D");
		$str288$m_D = SubLObjectFactory.makeString("m-D");
		$int289$197 = SubLObjectFactory.makeInteger(197);
		$str290$Meta_E = SubLObjectFactory.makeString("Meta-E");
		$str291$m_E = SubLObjectFactory.makeString("m-E");
		$int292$198 = SubLObjectFactory.makeInteger(198);
		$str293$Meta_F = SubLObjectFactory.makeString("Meta-F");
		$str294$m_F = SubLObjectFactory.makeString("m-F");
		$int295$199 = SubLObjectFactory.makeInteger(199);
		$str296$Meta_G = SubLObjectFactory.makeString("Meta-G");
		$str297$m_G = SubLObjectFactory.makeString("m-G");
		$int298$200 = SubLObjectFactory.makeInteger(200);
		$str299$Meta_H = SubLObjectFactory.makeString("Meta-H");
		$str300$m_H = SubLObjectFactory.makeString("m-H");
		$int301$201 = SubLObjectFactory.makeInteger(201);
		$str302$Meta_I = SubLObjectFactory.makeString("Meta-I");
		$str303$m_I = SubLObjectFactory.makeString("m-I");
		$int304$202 = SubLObjectFactory.makeInteger(202);
		$str305$Meta_J = SubLObjectFactory.makeString("Meta-J");
		$str306$m_J = SubLObjectFactory.makeString("m-J");
		$int307$203 = SubLObjectFactory.makeInteger(203);
		$str308$Meta_K = SubLObjectFactory.makeString("Meta-K");
		$str309$m_K = SubLObjectFactory.makeString("m-K");
		$int310$204 = SubLObjectFactory.makeInteger(204);
		$str311$Meta_L = SubLObjectFactory.makeString("Meta-L");
		$str312$m_L = SubLObjectFactory.makeString("m-L");
		$int313$205 = SubLObjectFactory.makeInteger(205);
		$str314$Meta_M = SubLObjectFactory.makeString("Meta-M");
		$str315$m_M = SubLObjectFactory.makeString("m-M");
		$int316$206 = SubLObjectFactory.makeInteger(206);
		$str317$Meta_N = SubLObjectFactory.makeString("Meta-N");
		$str318$m_N = SubLObjectFactory.makeString("m-N");
		$int319$207 = SubLObjectFactory.makeInteger(207);
		$str320$Meta_O = SubLObjectFactory.makeString("Meta-O");
		$str321$m_O = SubLObjectFactory.makeString("m-O");
		$int322$208 = SubLObjectFactory.makeInteger(208);
		$str323$Meta_P = SubLObjectFactory.makeString("Meta-P");
		$str324$m_P = SubLObjectFactory.makeString("m-P");
		$int325$209 = SubLObjectFactory.makeInteger(209);
		$str326$Meta_Q = SubLObjectFactory.makeString("Meta-Q");
		$str327$m_Q = SubLObjectFactory.makeString("m-Q");
		$int328$210 = SubLObjectFactory.makeInteger(210);
		$str329$Meta_R = SubLObjectFactory.makeString("Meta-R");
		$str330$m_R = SubLObjectFactory.makeString("m-R");
		$int331$211 = SubLObjectFactory.makeInteger(211);
		$str332$Meta_S = SubLObjectFactory.makeString("Meta-S");
		$str333$m_S = SubLObjectFactory.makeString("m-S");
		$int334$212 = SubLObjectFactory.makeInteger(212);
		$str335$Meta_T = SubLObjectFactory.makeString("Meta-T");
		$str336$m_T = SubLObjectFactory.makeString("m-T");
		$int337$213 = SubLObjectFactory.makeInteger(213);
		$str338$Meta_U = SubLObjectFactory.makeString("Meta-U");
		$str339$m_U = SubLObjectFactory.makeString("m-U");
		$int340$214 = SubLObjectFactory.makeInteger(214);
		$str341$Meta_V = SubLObjectFactory.makeString("Meta-V");
		$str342$m_V = SubLObjectFactory.makeString("m-V");
		$int343$215 = SubLObjectFactory.makeInteger(215);
		$str344$Meta_W = SubLObjectFactory.makeString("Meta-W");
		$str345$m_W = SubLObjectFactory.makeString("m-W");
		$int346$216 = SubLObjectFactory.makeInteger(216);
		$str347$Meta_X = SubLObjectFactory.makeString("Meta-X");
		$str348$m_X = SubLObjectFactory.makeString("m-X");
		$int349$217 = SubLObjectFactory.makeInteger(217);
		$str350$Meta_Y = SubLObjectFactory.makeString("Meta-Y");
		$str351$m_Y = SubLObjectFactory.makeString("m-Y");
		$int352$218 = SubLObjectFactory.makeInteger(218);
		$str353$Meta_Z = SubLObjectFactory.makeString("Meta-Z");
		$str354$m_Z = SubLObjectFactory.makeString("m-Z");
		$int355$219 = SubLObjectFactory.makeInteger(219);
		$str356$Meta__ = SubLObjectFactory.makeString("Meta-[");
		$str357$m__ = SubLObjectFactory.makeString("m-[");
		$int358$220 = SubLObjectFactory.makeInteger(220);
		$str359$Meta__ = SubLObjectFactory.makeString("Meta-\\");
		$str360$m__ = SubLObjectFactory.makeString("m-\\");
		$int361$221 = SubLObjectFactory.makeInteger(221);
		$str362$Meta__ = SubLObjectFactory.makeString("Meta-]");
		$str363$m__ = SubLObjectFactory.makeString("m-]");
		$int364$222 = SubLObjectFactory.makeInteger(222);
		$str365$Meta__ = SubLObjectFactory.makeString("Meta-^");
		$str366$m__ = SubLObjectFactory.makeString("m-^");
		$int367$223 = SubLObjectFactory.makeInteger(223);
		$str368$Meta__ = SubLObjectFactory.makeString("Meta-_");
		$str369$m__ = SubLObjectFactory.makeString("m-_");
		$int370$224 = SubLObjectFactory.makeInteger(224);
		$str371$Meta__ = SubLObjectFactory.makeString("Meta-`");
		$str372$m__ = SubLObjectFactory.makeString("m-`");
		$int373$225 = SubLObjectFactory.makeInteger(225);
		$str374$Meta_a = SubLObjectFactory.makeString("Meta-a");
		$str375$m_a = SubLObjectFactory.makeString("m-a");
		$int376$226 = SubLObjectFactory.makeInteger(226);
		$str377$Meta_b = SubLObjectFactory.makeString("Meta-b");
		$str378$m_b = SubLObjectFactory.makeString("m-b");
		$int379$227 = SubLObjectFactory.makeInteger(227);
		$str380$Meta_c = SubLObjectFactory.makeString("Meta-c");
		$str381$m_c = SubLObjectFactory.makeString("m-c");
		$int382$228 = SubLObjectFactory.makeInteger(228);
		$str383$Meta_d = SubLObjectFactory.makeString("Meta-d");
		$str384$m_d = SubLObjectFactory.makeString("m-d");
		$int385$229 = SubLObjectFactory.makeInteger(229);
		$str386$Meta_e = SubLObjectFactory.makeString("Meta-e");
		$str387$m_e = SubLObjectFactory.makeString("m-e");
		$int388$230 = SubLObjectFactory.makeInteger(230);
		$str389$Meta_f = SubLObjectFactory.makeString("Meta-f");
		$str390$m_f = SubLObjectFactory.makeString("m-f");
		$int391$231 = SubLObjectFactory.makeInteger(231);
		$str392$Meta_g = SubLObjectFactory.makeString("Meta-g");
		$str393$m_g = SubLObjectFactory.makeString("m-g");
		$int394$232 = SubLObjectFactory.makeInteger(232);
		$str395$Meta_h = SubLObjectFactory.makeString("Meta-h");
		$str396$m_h = SubLObjectFactory.makeString("m-h");
		$int397$233 = SubLObjectFactory.makeInteger(233);
		$str398$Meta_i = SubLObjectFactory.makeString("Meta-i");
		$str399$m_i = SubLObjectFactory.makeString("m-i");
		$int400$234 = SubLObjectFactory.makeInteger(234);
		$str401$Meta_j = SubLObjectFactory.makeString("Meta-j");
		$str402$m_j = SubLObjectFactory.makeString("m-j");
		$int403$235 = SubLObjectFactory.makeInteger(235);
		$str404$Meta_k = SubLObjectFactory.makeString("Meta-k");
		$str405$m_k = SubLObjectFactory.makeString("m-k");
		$int406$236 = SubLObjectFactory.makeInteger(236);
		$str407$Meta_l = SubLObjectFactory.makeString("Meta-l");
		$str408$m_l = SubLObjectFactory.makeString("m-l");
		$int409$237 = SubLObjectFactory.makeInteger(237);
		$str410$Meta_m = SubLObjectFactory.makeString("Meta-m");
		$str411$m_m = SubLObjectFactory.makeString("m-m");
		$int412$238 = SubLObjectFactory.makeInteger(238);
		$str413$Meta_n = SubLObjectFactory.makeString("Meta-n");
		$str414$m_n = SubLObjectFactory.makeString("m-n");
		$int415$239 = SubLObjectFactory.makeInteger(239);
		$str416$Meta_o = SubLObjectFactory.makeString("Meta-o");
		$str417$m_o = SubLObjectFactory.makeString("m-o");
		$int418$240 = SubLObjectFactory.makeInteger(240);
		$str419$Meta_p = SubLObjectFactory.makeString("Meta-p");
		$str420$m_p = SubLObjectFactory.makeString("m-p");
		$int421$241 = SubLObjectFactory.makeInteger(241);
		$str422$Meta_q = SubLObjectFactory.makeString("Meta-q");
		$str423$m_q = SubLObjectFactory.makeString("m-q");
		$int424$242 = SubLObjectFactory.makeInteger(242);
		$str425$Meta_r = SubLObjectFactory.makeString("Meta-r");
		$str426$m_r = SubLObjectFactory.makeString("m-r");
		$int427$243 = SubLObjectFactory.makeInteger(243);
		$str428$Meta_s = SubLObjectFactory.makeString("Meta-s");
		$str429$m_s = SubLObjectFactory.makeString("m-s");
		$int430$244 = SubLObjectFactory.makeInteger(244);
		$str431$Meta_t = SubLObjectFactory.makeString("Meta-t");
		$str432$m_t = SubLObjectFactory.makeString("m-t");
		$int433$245 = SubLObjectFactory.makeInteger(245);
		$str434$Meta_u = SubLObjectFactory.makeString("Meta-u");
		$str435$m_u = SubLObjectFactory.makeString("m-u");
		$int436$246 = SubLObjectFactory.makeInteger(246);
		$str437$Meta_v = SubLObjectFactory.makeString("Meta-v");
		$str438$m_v = SubLObjectFactory.makeString("m-v");
		$int439$247 = SubLObjectFactory.makeInteger(247);
		$str440$Meta_w = SubLObjectFactory.makeString("Meta-w");
		$str441$m_w = SubLObjectFactory.makeString("m-w");
		$int442$248 = SubLObjectFactory.makeInteger(248);
		$str443$Meta_x = SubLObjectFactory.makeString("Meta-x");
		$str444$m_x = SubLObjectFactory.makeString("m-x");
		$int445$249 = SubLObjectFactory.makeInteger(249);
		$str446$Meta_y = SubLObjectFactory.makeString("Meta-y");
		$str447$m_y = SubLObjectFactory.makeString("m-y");
		$int448$250 = SubLObjectFactory.makeInteger(250);
		$str449$Meta_z = SubLObjectFactory.makeString("Meta-z");
		$str450$m_z = SubLObjectFactory.makeString("m-z");
		$int451$251 = SubLObjectFactory.makeInteger(251);
		$str452$Meta__ = SubLObjectFactory.makeString("Meta-{");
		$str453$m__ = SubLObjectFactory.makeString("m-{");
		$int454$252 = SubLObjectFactory.makeInteger(252);
		$str455$Meta__ = SubLObjectFactory.makeString("Meta-|");
		$str456$m__ = SubLObjectFactory.makeString("m-|");
		$int457$253 = SubLObjectFactory.makeInteger(253);
		$str458$Meta__ = SubLObjectFactory.makeString("Meta-}");
		$str459$m__ = SubLObjectFactory.makeString("m-}");
		$int460$254 = SubLObjectFactory.makeInteger(254);
		$str461$Meta__ = SubLObjectFactory.makeString("Meta-~");
		$str462$m__ = SubLObjectFactory.makeString("m-~");
		$int463$255 = SubLObjectFactory.makeInteger(255);
		$str464$Meta_Rubout = SubLObjectFactory.makeString("Meta-Rubout");
		$str465$m_Rubout = SubLObjectFactory.makeString("m-Rubout");
	}

	@Override
	public void declareFunctions() {
		declare_character_names_file();
	}

	@Override
	public void initializeVariables() {
		init_character_names_file();
	}

	@Override
	public void runTopLevelForms() {
		setup_character_names_file();
	}
}

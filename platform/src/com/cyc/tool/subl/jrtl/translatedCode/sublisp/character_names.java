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

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import java.util.Iterator;
import java.util.Map.Entry;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class character_names extends SubLTranslatedFile {

	//// Constructor

	public static SubLFile me = new character_names();

	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names";
	@SubL(source = "sublisp/character-names.lisp", position = 427)
	private static SubLSymbol $character_names_table$ = null;

	//// Definitions

	@SubL(source = "sublisp/character-names.lisp", position = 1478)
	private static SubLSymbol $name_character_table$ = null;

	public static SubLInteger $int0$256 = SubLObjectFactory.makeInteger(256);

	public static SubLString $str1$Null = SubLObjectFactory.makeString("Null");

	public static SubLString $str2$NUL = SubLObjectFactory.makeString("NUL");

	public static SubLString $str3$Control_a = SubLObjectFactory.makeString("Control-a");

	public static SubLString $str4$c_a = SubLObjectFactory.makeString("c-a");

	//// Internal Constants

	public static SubLString $str5$Control_b = SubLObjectFactory.makeString("Control-b");
	public static SubLString $str6$c_b = SubLObjectFactory.makeString("c-b");
	public static SubLString $str7$Control_c = SubLObjectFactory.makeString("Control-c");
	public static SubLString $str8$c_c = SubLObjectFactory.makeString("c-c");
	public static SubLString $str9$Control_d = SubLObjectFactory.makeString("Control-d");
	public static SubLString $str10$c_d = SubLObjectFactory.makeString("c-d");
	public static SubLString $str11$Control_e = SubLObjectFactory.makeString("Control-e");
	public static SubLString $str12$c_e = SubLObjectFactory.makeString("c-e");
	public static SubLString $str13$Control_f = SubLObjectFactory.makeString("Control-f");
	public static SubLString $str14$c_f = SubLObjectFactory.makeString("c-f");
	public static SubLString $str15$Bell = SubLObjectFactory.makeString("Bell");
	public static SubLString $str16$BEL = SubLObjectFactory.makeString("BEL");
	public static SubLString $str17$Backspace = SubLObjectFactory.makeString("Backspace");
	public static SubLString $str18$BS = SubLObjectFactory.makeString("BS");
	public static SubLString $str19$Tab = SubLObjectFactory.makeString("Tab");
	public static SubLString $str20$HT = SubLObjectFactory.makeString("HT");
	public static SubLString $str21$Newline = SubLObjectFactory.makeString("Newline");
	public static SubLString $str22$Linefeed = SubLObjectFactory.makeString("Linefeed");
	public static SubLString $str23$Vertical_Tab = SubLObjectFactory.makeString("Vertical-Tab");
	public static SubLString $str24$VT = SubLObjectFactory.makeString("VT");
	public static SubLString $str25$Page = SubLObjectFactory.makeString("Page");
	public static SubLString $str26$FF = SubLObjectFactory.makeString("FF");
	public static SubLString $str27$Return = SubLObjectFactory.makeString("Return");
	public static SubLString $str28$CR = SubLObjectFactory.makeString("CR");
	public static SubLString $str29$Control_n = SubLObjectFactory.makeString("Control-n");
	public static SubLString $str30$c_n = SubLObjectFactory.makeString("c-n");
	public static SubLString $str31$Control_o = SubLObjectFactory.makeString("Control-o");
	public static SubLString $str32$c_o = SubLObjectFactory.makeString("c-o");
	public static SubLString $str33$Control_p = SubLObjectFactory.makeString("Control-p");
	public static SubLString $str34$c_p = SubLObjectFactory.makeString("c-p");
	public static SubLString $str35$Control_q = SubLObjectFactory.makeString("Control-q");
	public static SubLString $str36$c_q = SubLObjectFactory.makeString("c-q");
	public static SubLString $str37$Control_r = SubLObjectFactory.makeString("Control-r");
	public static SubLString $str38$c_r = SubLObjectFactory.makeString("c-r");
	public static SubLString $str39$Control_s = SubLObjectFactory.makeString("Control-s");
	public static SubLString $str40$c_s = SubLObjectFactory.makeString("c-s");
	public static SubLString $str41$Control_t = SubLObjectFactory.makeString("Control-t");
	public static SubLString $str42$c_t = SubLObjectFactory.makeString("c-t");
	public static SubLInteger $int43$21 = SubLObjectFactory.makeInteger(21);
	public static SubLString $str44$Control_u = SubLObjectFactory.makeString("Control-u");
	public static SubLString $str45$c_u = SubLObjectFactory.makeString("c-u");
	public static SubLInteger $int46$22 = SubLObjectFactory.makeInteger(22);
	public static SubLString $str47$Control_v = SubLObjectFactory.makeString("Control-v");
	public static SubLString $str48$c_v = SubLObjectFactory.makeString("c-v");
	public static SubLInteger $int49$23 = SubLObjectFactory.makeInteger(23);
	public static SubLString $str50$Control_w = SubLObjectFactory.makeString("Control-w");
	public static SubLString $str51$c_w = SubLObjectFactory.makeString("c-w");
	public static SubLInteger $int52$24 = SubLObjectFactory.makeInteger(24);
	public static SubLString $str53$Control_x = SubLObjectFactory.makeString("Control-x");
	public static SubLString $str54$c_x = SubLObjectFactory.makeString("c-x");
	public static SubLInteger $int55$25 = SubLObjectFactory.makeInteger(25);
	public static SubLString $str56$Control_y = SubLObjectFactory.makeString("Control-y");
	public static SubLString $str57$c_y = SubLObjectFactory.makeString("c-y");
	public static SubLInteger $int58$26 = SubLObjectFactory.makeInteger(26);
	public static SubLString $str59$Control_z = SubLObjectFactory.makeString("Control-z");
	public static SubLString $str60$c_z = SubLObjectFactory.makeString("c-z");
	public static SubLInteger $int61$27 = SubLObjectFactory.makeInteger(27);
	public static SubLString $str62$Escape = SubLObjectFactory.makeString("Escape");
	public static SubLString $str63$ESC = SubLObjectFactory.makeString("ESC");
	public static SubLInteger $int64$28 = SubLObjectFactory.makeInteger(28);
	public static SubLString $str65$Control__ = SubLObjectFactory.makeString("Control-\\");
	public static SubLString $str66$c__ = SubLObjectFactory.makeString("c-\\");
	public static SubLInteger $int67$29 = SubLObjectFactory.makeInteger(29);
	public static SubLString $str68$Control__ = SubLObjectFactory.makeString("Control-]");
	public static SubLString $str69$c__ = SubLObjectFactory.makeString("c-]");
	public static SubLInteger $int70$30 = SubLObjectFactory.makeInteger(30);
	public static SubLString $str71$Control__ = SubLObjectFactory.makeString("Control-^");
	public static SubLString $str72$c__ = SubLObjectFactory.makeString("c-^");
	public static SubLInteger $int73$31 = SubLObjectFactory.makeInteger(31);
	public static SubLString $str74$Control__ = SubLObjectFactory.makeString("Control-_");
	public static SubLString $str75$c__ = SubLObjectFactory.makeString("c-_");
	public static SubLInteger $int76$32 = SubLObjectFactory.makeInteger(32);
	public static SubLString $str77$Space = SubLObjectFactory.makeString("Space");
	public static SubLString $str78$SP = SubLObjectFactory.makeString("SP");
	public static SubLInteger $int79$127 = SubLObjectFactory.makeInteger(127);
	public static SubLString $str80$Rubout = SubLObjectFactory.makeString("Rubout");
	public static SubLString $str81$DEL = SubLObjectFactory.makeString("DEL");
	public static SubLInteger $int82$128 = SubLObjectFactory.makeInteger(128);
	public static SubLString $str83$Meta_Null = SubLObjectFactory.makeString("Meta-Null");
	public static SubLString $str84$m_Null = SubLObjectFactory.makeString("m-Null");
	public static SubLInteger $int85$129 = SubLObjectFactory.makeInteger(129);
	public static SubLString $str86$Control_Meta_a = SubLObjectFactory.makeString("Control-Meta-a");
	public static SubLString $str87$c_m_a = SubLObjectFactory.makeString("c-m-a");
	public static SubLInteger $int88$130 = SubLObjectFactory.makeInteger(130);
	public static SubLString $str89$Control_Meta_b = SubLObjectFactory.makeString("Control-Meta-b");
	public static SubLString $str90$c_m_b = SubLObjectFactory.makeString("c-m-b");
	public static SubLInteger $int91$131 = SubLObjectFactory.makeInteger(131);
	public static SubLString $str92$Control_Meta_c = SubLObjectFactory.makeString("Control-Meta-c");
	public static SubLString $str93$c_m_c = SubLObjectFactory.makeString("c-m-c");
	public static SubLInteger $int94$132 = SubLObjectFactory.makeInteger(132);
	public static SubLString $str95$Control_Meta_d = SubLObjectFactory.makeString("Control-Meta-d");
	public static SubLString $str96$c_m_d = SubLObjectFactory.makeString("c-m-d");
	public static SubLInteger $int97$133 = SubLObjectFactory.makeInteger(133);
	public static SubLString $str98$Control_Meta_e = SubLObjectFactory.makeString("Control-Meta-e");
	public static SubLString $str99$c_m_e = SubLObjectFactory.makeString("c-m-e");
	public static SubLInteger $int100$134 = SubLObjectFactory.makeInteger(134);
	public static SubLString $str101$Control_Meta_f = SubLObjectFactory.makeString("Control-Meta-f");
	public static SubLString $str102$c_m_f = SubLObjectFactory.makeString("c-m-f");
	public static SubLInteger $int103$135 = SubLObjectFactory.makeInteger(135);
	public static SubLString $str104$Meta_Bell = SubLObjectFactory.makeString("Meta-Bell");
	public static SubLString $str105$m_Bell = SubLObjectFactory.makeString("m-Bell");
	public static SubLInteger $int106$136 = SubLObjectFactory.makeInteger(136);
	public static SubLString $str107$Meta_Backspace = SubLObjectFactory.makeString("Meta-Backspace");
	public static SubLString $str108$m_Backspace = SubLObjectFactory.makeString("m-Backspace");
	public static SubLInteger $int109$137 = SubLObjectFactory.makeInteger(137);
	public static SubLString $str110$Meta_Tab = SubLObjectFactory.makeString("Meta-Tab");
	public static SubLString $str111$m_Tab = SubLObjectFactory.makeString("m-Tab");
	public static SubLInteger $int112$138 = SubLObjectFactory.makeInteger(138);
	public static SubLString $str113$Meta_Newline = SubLObjectFactory.makeString("Meta-Newline");
	public static SubLString $str114$m_Newline = SubLObjectFactory.makeString("m-Newline");
	public static SubLInteger $int115$139 = SubLObjectFactory.makeInteger(139);
	public static SubLString $str116$Meta_Vertical_Tab = SubLObjectFactory.makeString("Meta-Vertical-Tab");
	public static SubLString $str117$m_Vertical_Tab = SubLObjectFactory.makeString("m-Vertical-Tab");
	public static SubLInteger $int118$140 = SubLObjectFactory.makeInteger(140);
	public static SubLString $str119$Meta_Page = SubLObjectFactory.makeString("Meta-Page");
	public static SubLString $str120$m_Page = SubLObjectFactory.makeString("m-Page");
	public static SubLInteger $int121$141 = SubLObjectFactory.makeInteger(141);
	public static SubLString $str122$Meta_Return = SubLObjectFactory.makeString("Meta-Return");
	public static SubLString $str123$m_Return = SubLObjectFactory.makeString("m-Return");
	public static SubLInteger $int124$142 = SubLObjectFactory.makeInteger(142);
	public static SubLString $str125$Control_Meta_n = SubLObjectFactory.makeString("Control-Meta-n");
	public static SubLString $str126$c_m_n = SubLObjectFactory.makeString("c-m-n");
	public static SubLInteger $int127$143 = SubLObjectFactory.makeInteger(143);
	public static SubLString $str128$Control_Meta_o = SubLObjectFactory.makeString("Control-Meta-o");
	public static SubLString $str129$c_m_o = SubLObjectFactory.makeString("c-m-o");
	public static SubLInteger $int130$144 = SubLObjectFactory.makeInteger(144);
	public static SubLString $str131$Control_Meta_p = SubLObjectFactory.makeString("Control-Meta-p");
	public static SubLString $str132$c_m_p = SubLObjectFactory.makeString("c-m-p");
	public static SubLInteger $int133$145 = SubLObjectFactory.makeInteger(145);
	public static SubLString $str134$Control_Meta_q = SubLObjectFactory.makeString("Control-Meta-q");
	public static SubLString $str135$c_m_q = SubLObjectFactory.makeString("c-m-q");
	public static SubLInteger $int136$146 = SubLObjectFactory.makeInteger(146);
	public static SubLString $str137$Control_Meta_r = SubLObjectFactory.makeString("Control-Meta-r");
	public static SubLString $str138$c_m_r = SubLObjectFactory.makeString("c-m-r");
	public static SubLInteger $int139$147 = SubLObjectFactory.makeInteger(147);
	public static SubLString $str140$Control_Meta_s = SubLObjectFactory.makeString("Control-Meta-s");
	public static SubLString $str141$c_m_s = SubLObjectFactory.makeString("c-m-s");
	public static SubLInteger $int142$148 = SubLObjectFactory.makeInteger(148);
	public static SubLString $str143$Control_Meta_t = SubLObjectFactory.makeString("Control-Meta-t");
	public static SubLString $str144$c_m_t = SubLObjectFactory.makeString("c-m-t");
	public static SubLInteger $int145$149 = SubLObjectFactory.makeInteger(149);
	public static SubLString $str146$Control_Meta_u = SubLObjectFactory.makeString("Control-Meta-u");
	public static SubLString $str147$c_m_u = SubLObjectFactory.makeString("c-m-u");
	public static SubLInteger $int148$150 = SubLObjectFactory.makeInteger(150);
	public static SubLString $str149$Control_Meta_v = SubLObjectFactory.makeString("Control-Meta-v");
	public static SubLString $str150$c_m_v = SubLObjectFactory.makeString("c-m-v");
	public static SubLInteger $int151$151 = SubLObjectFactory.makeInteger(151);
	public static SubLString $str152$Control_Meta_w = SubLObjectFactory.makeString("Control-Meta-w");
	public static SubLString $str153$c_m_w = SubLObjectFactory.makeString("c-m-w");
	public static SubLInteger $int154$152 = SubLObjectFactory.makeInteger(152);
	public static SubLString $str155$Control_Meta_x = SubLObjectFactory.makeString("Control-Meta-x");
	public static SubLString $str156$c_m_x = SubLObjectFactory.makeString("c-m-x");
	public static SubLInteger $int157$153 = SubLObjectFactory.makeInteger(153);
	public static SubLString $str158$Control_Meta_y = SubLObjectFactory.makeString("Control-Meta-y");
	public static SubLString $str159$c_m_y = SubLObjectFactory.makeString("c-m-y");
	public static SubLInteger $int160$154 = SubLObjectFactory.makeInteger(154);
	public static SubLString $str161$Control_Meta_z = SubLObjectFactory.makeString("Control-Meta-z");
	public static SubLString $str162$c_m_z = SubLObjectFactory.makeString("c-m-z");
	public static SubLInteger $int163$155 = SubLObjectFactory.makeInteger(155);
	public static SubLString $str164$Meta_Escape = SubLObjectFactory.makeString("Meta-Escape");
	public static SubLString $str165$m_Escape = SubLObjectFactory.makeString("m-Escape");
	public static SubLInteger $int166$156 = SubLObjectFactory.makeInteger(156);
	public static SubLString $str167$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-\\");
	public static SubLString $str168$c_m__ = SubLObjectFactory.makeString("c-m-\\");
	public static SubLInteger $int169$157 = SubLObjectFactory.makeInteger(157);
	public static SubLString $str170$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-]");
	public static SubLString $str171$c_m__ = SubLObjectFactory.makeString("c-m-]");
	public static SubLInteger $int172$158 = SubLObjectFactory.makeInteger(158);
	public static SubLString $str173$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-^");
	public static SubLString $str174$c_m__ = SubLObjectFactory.makeString("c-m-^");
	public static SubLInteger $int175$159 = SubLObjectFactory.makeInteger(159);
	public static SubLString $str176$Control_Meta__ = SubLObjectFactory.makeString("Control-Meta-_");
	public static SubLString $str177$c_m__ = SubLObjectFactory.makeString("c-m-_");
	public static SubLInteger $int178$160 = SubLObjectFactory.makeInteger(160);
	public static SubLString $str179$Meta_Space = SubLObjectFactory.makeString("Meta-Space");
	public static SubLString $str180$m_Space = SubLObjectFactory.makeString("m-Space");
	public static SubLInteger $int181$161 = SubLObjectFactory.makeInteger(161);
	public static SubLString $str182$Meta__ = SubLObjectFactory.makeString("Meta-!");
	public static SubLString $str183$m__ = SubLObjectFactory.makeString("m-!");
	public static SubLInteger $int184$162 = SubLObjectFactory.makeInteger(162);
	public static SubLString $str185$Meta__ = SubLObjectFactory.makeString("Meta-\"");
	public static SubLString $str186$m__ = SubLObjectFactory.makeString("m-\"");
	public static SubLInteger $int187$163 = SubLObjectFactory.makeInteger(163);
	public static SubLString $str188$Meta__ = SubLObjectFactory.makeString("Meta-#");
	public static SubLString $str189$m__ = SubLObjectFactory.makeString("m-#");
	public static SubLInteger $int190$164 = SubLObjectFactory.makeInteger(164);
	public static SubLString $str191$Meta__ = SubLObjectFactory.makeString("Meta-$");
	public static SubLString $str192$m__ = SubLObjectFactory.makeString("m-$");
	public static SubLInteger $int193$165 = SubLObjectFactory.makeInteger(165);
	public static SubLString $str194$Meta__ = SubLObjectFactory.makeString("Meta-%");
	public static SubLString $str195$m__ = SubLObjectFactory.makeString("m-%");
	public static SubLInteger $int196$166 = SubLObjectFactory.makeInteger(166);
	public static SubLString $str197$Meta__ = SubLObjectFactory.makeString("Meta-&");
	public static SubLString $str198$m__ = SubLObjectFactory.makeString("m-&");
	public static SubLInteger $int199$167 = SubLObjectFactory.makeInteger(167);
	public static SubLString $str200$Meta__ = SubLObjectFactory.makeString("Meta-'");
	public static SubLString $str201$m__ = SubLObjectFactory.makeString("m-'");
	public static SubLInteger $int202$168 = SubLObjectFactory.makeInteger(168);
	public static SubLString $str203$Meta__ = SubLObjectFactory.makeString("Meta-(");
	public static SubLString $str204$m__ = SubLObjectFactory.makeString("m-(");
	public static SubLInteger $int205$169 = SubLObjectFactory.makeInteger(169);
	public static SubLString $str206$Meta__ = SubLObjectFactory.makeString("Meta-)");
	public static SubLString $str207$m__ = SubLObjectFactory.makeString("m-)");
	public static SubLInteger $int208$170 = SubLObjectFactory.makeInteger(170);
	public static SubLString $str209$Meta__ = SubLObjectFactory.makeString("Meta-*");
	public static SubLString $str210$m__ = SubLObjectFactory.makeString("m-*");
	public static SubLInteger $int211$171 = SubLObjectFactory.makeInteger(171);
	public static SubLString $str212$Meta__ = SubLObjectFactory.makeString("Meta-+");
	public static SubLString $str213$m__ = SubLObjectFactory.makeString("m-+");
	public static SubLInteger $int214$172 = SubLObjectFactory.makeInteger(172);
	public static SubLString $str215$Meta__ = SubLObjectFactory.makeString("Meta-,");
	public static SubLString $str216$m__ = SubLObjectFactory.makeString("m-,");
	public static SubLInteger $int217$173 = SubLObjectFactory.makeInteger(173);
	public static SubLString $str218$Meta__ = SubLObjectFactory.makeString("Meta--");
	public static SubLString $str219$m__ = SubLObjectFactory.makeString("m--");
	public static SubLInteger $int220$174 = SubLObjectFactory.makeInteger(174);
	public static SubLString $str221$Meta__ = SubLObjectFactory.makeString("Meta-.");
	public static SubLString $str222$m__ = SubLObjectFactory.makeString("m-.");
	public static SubLInteger $int223$175 = SubLObjectFactory.makeInteger(175);
	public static SubLString $str224$Meta__ = SubLObjectFactory.makeString("Meta-/");
	public static SubLString $str225$m__ = SubLObjectFactory.makeString("m-/");
	public static SubLInteger $int226$176 = SubLObjectFactory.makeInteger(176);
	public static SubLString $str227$Meta_0 = SubLObjectFactory.makeString("Meta-0");
	public static SubLString $str228$m_0 = SubLObjectFactory.makeString("m-0");
	public static SubLInteger $int229$177 = SubLObjectFactory.makeInteger(177);
	public static SubLString $str230$Meta_1 = SubLObjectFactory.makeString("Meta-1");
	public static SubLString $str231$m_1 = SubLObjectFactory.makeString("m-1");
	public static SubLInteger $int232$178 = SubLObjectFactory.makeInteger(178);
	public static SubLString $str233$Meta_2 = SubLObjectFactory.makeString("Meta-2");
	public static SubLString $str234$m_2 = SubLObjectFactory.makeString("m-2");
	public static SubLInteger $int235$179 = SubLObjectFactory.makeInteger(179);
	public static SubLString $str236$Meta_3 = SubLObjectFactory.makeString("Meta-3");
	public static SubLString $str237$m_3 = SubLObjectFactory.makeString("m-3");
	public static SubLInteger $int238$180 = SubLObjectFactory.makeInteger(180);
	public static SubLString $str239$Meta_4 = SubLObjectFactory.makeString("Meta-4");
	public static SubLString $str240$m_4 = SubLObjectFactory.makeString("m-4");
	public static SubLInteger $int241$181 = SubLObjectFactory.makeInteger(181);
	public static SubLString $str242$Meta_5 = SubLObjectFactory.makeString("Meta-5");
	public static SubLString $str243$m_5 = SubLObjectFactory.makeString("m-5");
	public static SubLInteger $int244$182 = SubLObjectFactory.makeInteger(182);
	public static SubLString $str245$Meta_6 = SubLObjectFactory.makeString("Meta-6");
	public static SubLString $str246$m_6 = SubLObjectFactory.makeString("m-6");
	public static SubLInteger $int247$183 = SubLObjectFactory.makeInteger(183);
	public static SubLString $str248$Meta_7 = SubLObjectFactory.makeString("Meta-7");
	public static SubLString $str249$m_7 = SubLObjectFactory.makeString("m-7");
	public static SubLInteger $int250$184 = SubLObjectFactory.makeInteger(184);
	public static SubLString $str251$Meta_8 = SubLObjectFactory.makeString("Meta-8");
	public static SubLString $str252$m_8 = SubLObjectFactory.makeString("m-8");
	public static SubLInteger $int253$185 = SubLObjectFactory.makeInteger(185);
	public static SubLString $str254$Meta_9 = SubLObjectFactory.makeString("Meta-9");
	public static SubLString $str255$m_9 = SubLObjectFactory.makeString("m-9");
	public static SubLInteger $int256$186 = SubLObjectFactory.makeInteger(186);
	public static SubLString $str257$Meta__ = SubLObjectFactory.makeString("Meta-:");
	public static SubLString $str258$m__ = SubLObjectFactory.makeString("m-:");
	public static SubLInteger $int259$187 = SubLObjectFactory.makeInteger(187);
	public static SubLString $str260$Meta__ = SubLObjectFactory.makeString("Meta-;");
	public static SubLString $str261$m__ = SubLObjectFactory.makeString("m-;");
	public static SubLInteger $int262$188 = SubLObjectFactory.makeInteger(188);
	public static SubLString $str263$Meta__ = SubLObjectFactory.makeString("Meta-<");
	public static SubLString $str264$m__ = SubLObjectFactory.makeString("m-<");
	public static SubLInteger $int265$189 = SubLObjectFactory.makeInteger(189);
	public static SubLString $str266$Meta__ = SubLObjectFactory.makeString("Meta-=");
	public static SubLString $str267$m__ = SubLObjectFactory.makeString("m-=");
	public static SubLInteger $int268$190 = SubLObjectFactory.makeInteger(190);
	public static SubLString $str269$Meta__ = SubLObjectFactory.makeString("Meta->");
	public static SubLString $str270$m__ = SubLObjectFactory.makeString("m->");
	public static SubLInteger $int271$191 = SubLObjectFactory.makeInteger(191);
	public static SubLString $str272$Meta__ = SubLObjectFactory.makeString("Meta-?");
	public static SubLString $str273$m__ = SubLObjectFactory.makeString("m-?");
	public static SubLInteger $int274$192 = SubLObjectFactory.makeInteger(192);
	public static SubLString $str275$Meta__ = SubLObjectFactory.makeString("Meta-@");
	public static SubLString $str276$m__ = SubLObjectFactory.makeString("m-@");
	public static SubLInteger $int277$193 = SubLObjectFactory.makeInteger(193);
	public static SubLString $str278$Meta_A = SubLObjectFactory.makeString("Meta-A");
	public static SubLString $str279$m_A = SubLObjectFactory.makeString("m-A");
	public static SubLInteger $int280$194 = SubLObjectFactory.makeInteger(194);
	public static SubLString $str281$Meta_B = SubLObjectFactory.makeString("Meta-B");
	public static SubLString $str282$m_B = SubLObjectFactory.makeString("m-B");
	public static SubLInteger $int283$195 = SubLObjectFactory.makeInteger(195);
	public static SubLString $str284$Meta_C = SubLObjectFactory.makeString("Meta-C");
	public static SubLString $str285$m_C = SubLObjectFactory.makeString("m-C");
	public static SubLInteger $int286$196 = SubLObjectFactory.makeInteger(196);
	public static SubLString $str287$Meta_D = SubLObjectFactory.makeString("Meta-D");
	public static SubLString $str288$m_D = SubLObjectFactory.makeString("m-D");
	public static SubLInteger $int289$197 = SubLObjectFactory.makeInteger(197);
	public static SubLString $str290$Meta_E = SubLObjectFactory.makeString("Meta-E");
	public static SubLString $str291$m_E = SubLObjectFactory.makeString("m-E");
	public static SubLInteger $int292$198 = SubLObjectFactory.makeInteger(198);
	public static SubLString $str293$Meta_F = SubLObjectFactory.makeString("Meta-F");
	public static SubLString $str294$m_F = SubLObjectFactory.makeString("m-F");
	public static SubLInteger $int295$199 = SubLObjectFactory.makeInteger(199);
	public static SubLString $str296$Meta_G = SubLObjectFactory.makeString("Meta-G");
	public static SubLString $str297$m_G = SubLObjectFactory.makeString("m-G");
	public static SubLInteger $int298$200 = SubLObjectFactory.makeInteger(200);
	public static SubLString $str299$Meta_H = SubLObjectFactory.makeString("Meta-H");
	public static SubLString $str300$m_H = SubLObjectFactory.makeString("m-H");
	public static SubLInteger $int301$201 = SubLObjectFactory.makeInteger(201);
	public static SubLString $str302$Meta_I = SubLObjectFactory.makeString("Meta-I");
	public static SubLString $str303$m_I = SubLObjectFactory.makeString("m-I");
	public static SubLInteger $int304$202 = SubLObjectFactory.makeInteger(202);
	public static SubLString $str305$Meta_J = SubLObjectFactory.makeString("Meta-J");
	public static SubLString $str306$m_J = SubLObjectFactory.makeString("m-J");
	public static SubLInteger $int307$203 = SubLObjectFactory.makeInteger(203);
	public static SubLString $str308$Meta_K = SubLObjectFactory.makeString("Meta-K");
	public static SubLString $str309$m_K = SubLObjectFactory.makeString("m-K");
	public static SubLInteger $int310$204 = SubLObjectFactory.makeInteger(204);
	public static SubLString $str311$Meta_L = SubLObjectFactory.makeString("Meta-L");
	public static SubLString $str312$m_L = SubLObjectFactory.makeString("m-L");
	public static SubLInteger $int313$205 = SubLObjectFactory.makeInteger(205);
	public static SubLString $str314$Meta_M = SubLObjectFactory.makeString("Meta-M");
	public static SubLString $str315$m_M = SubLObjectFactory.makeString("m-M");
	public static SubLInteger $int316$206 = SubLObjectFactory.makeInteger(206);
	public static SubLString $str317$Meta_N = SubLObjectFactory.makeString("Meta-N");
	public static SubLString $str318$m_N = SubLObjectFactory.makeString("m-N");
	public static SubLInteger $int319$207 = SubLObjectFactory.makeInteger(207);
	public static SubLString $str320$Meta_O = SubLObjectFactory.makeString("Meta-O");
	public static SubLString $str321$m_O = SubLObjectFactory.makeString("m-O");
	public static SubLInteger $int322$208 = SubLObjectFactory.makeInteger(208);
	public static SubLString $str323$Meta_P = SubLObjectFactory.makeString("Meta-P");
	public static SubLString $str324$m_P = SubLObjectFactory.makeString("m-P");
	public static SubLInteger $int325$209 = SubLObjectFactory.makeInteger(209);
	public static SubLString $str326$Meta_Q = SubLObjectFactory.makeString("Meta-Q");
	public static SubLString $str327$m_Q = SubLObjectFactory.makeString("m-Q");
	public static SubLInteger $int328$210 = SubLObjectFactory.makeInteger(210);
	public static SubLString $str329$Meta_R = SubLObjectFactory.makeString("Meta-R");
	public static SubLString $str330$m_R = SubLObjectFactory.makeString("m-R");
	public static SubLInteger $int331$211 = SubLObjectFactory.makeInteger(211);
	public static SubLString $str332$Meta_S = SubLObjectFactory.makeString("Meta-S");
	public static SubLString $str333$m_S = SubLObjectFactory.makeString("m-S");
	public static SubLInteger $int334$212 = SubLObjectFactory.makeInteger(212);
	public static SubLString $str335$Meta_T = SubLObjectFactory.makeString("Meta-T");
	public static SubLString $str336$m_T = SubLObjectFactory.makeString("m-T");
	public static SubLInteger $int337$213 = SubLObjectFactory.makeInteger(213);
	public static SubLString $str338$Meta_U = SubLObjectFactory.makeString("Meta-U");
	public static SubLString $str339$m_U = SubLObjectFactory.makeString("m-U");
	public static SubLInteger $int340$214 = SubLObjectFactory.makeInteger(214);
	public static SubLString $str341$Meta_V = SubLObjectFactory.makeString("Meta-V");
	public static SubLString $str342$m_V = SubLObjectFactory.makeString("m-V");
	public static SubLInteger $int343$215 = SubLObjectFactory.makeInteger(215);
	public static SubLString $str344$Meta_W = SubLObjectFactory.makeString("Meta-W");
	public static SubLString $str345$m_W = SubLObjectFactory.makeString("m-W");
	public static SubLInteger $int346$216 = SubLObjectFactory.makeInteger(216);
	public static SubLString $str347$Meta_X = SubLObjectFactory.makeString("Meta-X");
	public static SubLString $str348$m_X = SubLObjectFactory.makeString("m-X");
	public static SubLInteger $int349$217 = SubLObjectFactory.makeInteger(217);
	public static SubLString $str350$Meta_Y = SubLObjectFactory.makeString("Meta-Y");
	public static SubLString $str351$m_Y = SubLObjectFactory.makeString("m-Y");
	public static SubLInteger $int352$218 = SubLObjectFactory.makeInteger(218);
	public static SubLString $str353$Meta_Z = SubLObjectFactory.makeString("Meta-Z");
	public static SubLString $str354$m_Z = SubLObjectFactory.makeString("m-Z");
	public static SubLInteger $int355$219 = SubLObjectFactory.makeInteger(219);
	public static SubLString $str356$Meta__ = SubLObjectFactory.makeString("Meta-[");
	public static SubLString $str357$m__ = SubLObjectFactory.makeString("m-[");
	public static SubLInteger $int358$220 = SubLObjectFactory.makeInteger(220);
	public static SubLString $str359$Meta__ = SubLObjectFactory.makeString("Meta-\\");
	public static SubLString $str360$m__ = SubLObjectFactory.makeString("m-\\");
	public static SubLInteger $int361$221 = SubLObjectFactory.makeInteger(221);
	public static SubLString $str362$Meta__ = SubLObjectFactory.makeString("Meta-]");
	public static SubLString $str363$m__ = SubLObjectFactory.makeString("m-]");
	public static SubLInteger $int364$222 = SubLObjectFactory.makeInteger(222);
	public static SubLString $str365$Meta__ = SubLObjectFactory.makeString("Meta-^");
	public static SubLString $str366$m__ = SubLObjectFactory.makeString("m-^");
	public static SubLInteger $int367$223 = SubLObjectFactory.makeInteger(223);
	public static SubLString $str368$Meta__ = SubLObjectFactory.makeString("Meta-_");
	public static SubLString $str369$m__ = SubLObjectFactory.makeString("m-_");
	public static SubLInteger $int370$224 = SubLObjectFactory.makeInteger(224);
	public static SubLString $str371$Meta__ = SubLObjectFactory.makeString("Meta-`");
	public static SubLString $str372$m__ = SubLObjectFactory.makeString("m-`");
	public static SubLInteger $int373$225 = SubLObjectFactory.makeInteger(225);
	public static SubLString $str374$Meta_a = SubLObjectFactory.makeString("Meta-a");
	public static SubLString $str375$m_a = SubLObjectFactory.makeString("m-a");
	public static SubLInteger $int376$226 = SubLObjectFactory.makeInteger(226);
	public static SubLString $str377$Meta_b = SubLObjectFactory.makeString("Meta-b");
	public static SubLString $str378$m_b = SubLObjectFactory.makeString("m-b");
	public static SubLInteger $int379$227 = SubLObjectFactory.makeInteger(227);
	public static SubLString $str380$Meta_c = SubLObjectFactory.makeString("Meta-c");
	public static SubLString $str381$m_c = SubLObjectFactory.makeString("m-c");
	public static SubLInteger $int382$228 = SubLObjectFactory.makeInteger(228);
	public static SubLString $str383$Meta_d = SubLObjectFactory.makeString("Meta-d");
	public static SubLString $str384$m_d = SubLObjectFactory.makeString("m-d");
	public static SubLInteger $int385$229 = SubLObjectFactory.makeInteger(229);
	public static SubLString $str386$Meta_e = SubLObjectFactory.makeString("Meta-e");
	public static SubLString $str387$m_e = SubLObjectFactory.makeString("m-e");
	public static SubLInteger $int388$230 = SubLObjectFactory.makeInteger(230);
	public static SubLString $str389$Meta_f = SubLObjectFactory.makeString("Meta-f");
	public static SubLString $str390$m_f = SubLObjectFactory.makeString("m-f");
	public static SubLInteger $int391$231 = SubLObjectFactory.makeInteger(231);
	public static SubLString $str392$Meta_g = SubLObjectFactory.makeString("Meta-g");
	public static SubLString $str393$m_g = SubLObjectFactory.makeString("m-g");
	public static SubLInteger $int394$232 = SubLObjectFactory.makeInteger(232);
	public static SubLString $str395$Meta_h = SubLObjectFactory.makeString("Meta-h");
	public static SubLString $str396$m_h = SubLObjectFactory.makeString("m-h");
	public static SubLInteger $int397$233 = SubLObjectFactory.makeInteger(233);
	public static SubLString $str398$Meta_i = SubLObjectFactory.makeString("Meta-i");
	public static SubLString $str399$m_i = SubLObjectFactory.makeString("m-i");
	public static SubLInteger $int400$234 = SubLObjectFactory.makeInteger(234);
	public static SubLString $str401$Meta_j = SubLObjectFactory.makeString("Meta-j");
	public static SubLString $str402$m_j = SubLObjectFactory.makeString("m-j");
	public static SubLInteger $int403$235 = SubLObjectFactory.makeInteger(235);
	public static SubLString $str404$Meta_k = SubLObjectFactory.makeString("Meta-k");
	public static SubLString $str405$m_k = SubLObjectFactory.makeString("m-k");
	public static SubLInteger $int406$236 = SubLObjectFactory.makeInteger(236);
	public static SubLString $str407$Meta_l = SubLObjectFactory.makeString("Meta-l");
	public static SubLString $str408$m_l = SubLObjectFactory.makeString("m-l");
	public static SubLInteger $int409$237 = SubLObjectFactory.makeInteger(237);
	public static SubLString $str410$Meta_m = SubLObjectFactory.makeString("Meta-m");
	public static SubLString $str411$m_m = SubLObjectFactory.makeString("m-m");
	public static SubLInteger $int412$238 = SubLObjectFactory.makeInteger(238);
	public static SubLString $str413$Meta_n = SubLObjectFactory.makeString("Meta-n");
	public static SubLString $str414$m_n = SubLObjectFactory.makeString("m-n");
	public static SubLInteger $int415$239 = SubLObjectFactory.makeInteger(239);
	public static SubLString $str416$Meta_o = SubLObjectFactory.makeString("Meta-o");
	public static SubLString $str417$m_o = SubLObjectFactory.makeString("m-o");
	public static SubLInteger $int418$240 = SubLObjectFactory.makeInteger(240);
	public static SubLString $str419$Meta_p = SubLObjectFactory.makeString("Meta-p");
	public static SubLString $str420$m_p = SubLObjectFactory.makeString("m-p");
	public static SubLInteger $int421$241 = SubLObjectFactory.makeInteger(241);
	public static SubLString $str422$Meta_q = SubLObjectFactory.makeString("Meta-q");
	public static SubLString $str423$m_q = SubLObjectFactory.makeString("m-q");
	public static SubLInteger $int424$242 = SubLObjectFactory.makeInteger(242);
	public static SubLString $str425$Meta_r = SubLObjectFactory.makeString("Meta-r");
	public static SubLString $str426$m_r = SubLObjectFactory.makeString("m-r");
	public static SubLInteger $int427$243 = SubLObjectFactory.makeInteger(243);
	public static SubLString $str428$Meta_s = SubLObjectFactory.makeString("Meta-s");
	public static SubLString $str429$m_s = SubLObjectFactory.makeString("m-s");
	public static SubLInteger $int430$244 = SubLObjectFactory.makeInteger(244);
	public static SubLString $str431$Meta_t = SubLObjectFactory.makeString("Meta-t");
	public static SubLString $str432$m_t = SubLObjectFactory.makeString("m-t");
	public static SubLInteger $int433$245 = SubLObjectFactory.makeInteger(245);
	public static SubLString $str434$Meta_u = SubLObjectFactory.makeString("Meta-u");
	public static SubLString $str435$m_u = SubLObjectFactory.makeString("m-u");
	public static SubLInteger $int436$246 = SubLObjectFactory.makeInteger(246);
	public static SubLString $str437$Meta_v = SubLObjectFactory.makeString("Meta-v");
	public static SubLString $str438$m_v = SubLObjectFactory.makeString("m-v");
	public static SubLInteger $int439$247 = SubLObjectFactory.makeInteger(247);
	public static SubLString $str440$Meta_w = SubLObjectFactory.makeString("Meta-w");
	public static SubLString $str441$m_w = SubLObjectFactory.makeString("m-w");
	public static SubLInteger $int442$248 = SubLObjectFactory.makeInteger(248);
	public static SubLString $str443$Meta_x = SubLObjectFactory.makeString("Meta-x");
	public static SubLString $str444$m_x = SubLObjectFactory.makeString("m-x");
	public static SubLInteger $int445$249 = SubLObjectFactory.makeInteger(249);
	public static SubLString $str446$Meta_y = SubLObjectFactory.makeString("Meta-y");
	public static SubLString $str447$m_y = SubLObjectFactory.makeString("m-y");
	public static SubLInteger $int448$250 = SubLObjectFactory.makeInteger(250);
	public static SubLString $str449$Meta_z = SubLObjectFactory.makeString("Meta-z");
	public static SubLString $str450$m_z = SubLObjectFactory.makeString("m-z");
	public static SubLInteger $int451$251 = SubLObjectFactory.makeInteger(251);
	public static SubLString $str452$Meta__ = SubLObjectFactory.makeString("Meta-{");
	public static SubLString $str453$m__ = SubLObjectFactory.makeString("m-{");
	public static SubLInteger $int454$252 = SubLObjectFactory.makeInteger(252);
	public static SubLString $str455$Meta__ = SubLObjectFactory.makeString("Meta-|");
	public static SubLString $str456$m__ = SubLObjectFactory.makeString("m-|");
	public static SubLInteger $int457$253 = SubLObjectFactory.makeInteger(253);
	public static SubLString $str458$Meta__ = SubLObjectFactory.makeString("Meta-}");
	public static SubLString $str459$m__ = SubLObjectFactory.makeString("m-}");
	public static SubLInteger $int460$254 = SubLObjectFactory.makeInteger(254);
	public static SubLString $str461$Meta__ = SubLObjectFactory.makeString("Meta-~");
	public static SubLString $str462$m__ = SubLObjectFactory.makeString("m-~");
	public static SubLInteger $int463$255 = SubLObjectFactory.makeInteger(255);
	public static SubLString $str464$Meta_Rubout = SubLObjectFactory.makeString("Meta-Rubout");
	public static SubLString $str465$m_Rubout = SubLObjectFactory.makeString("m-Rubout");

	@SubL(source = "sublisp/character-names.lisp", position = 888)
	public static SubLObject character_names(SubLObject v_char) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			return ConsesLow.append(
					Hashtables.gethash(v_char, character_names.$character_names_table$.getDynamicValue(thread),
							CommonSymbols.UNPROVIDED),
					ConsesLow.list(Strings.make_string(CommonSymbols.ONE_INTEGER, v_char)));
		}
	}

	public static SubLObject declare_character_names_file() {
		SubLFiles.declareFunction(character_names.myName, "character_names", "CHARACTER-NAMES", 1, 0, false);
		return CommonSymbols.NIL;
	}

	public static SubLObject init_character_names_file() {
		character_names.$character_names_table$ = SubLFiles.defvar("*CHARACTER-NAMES-TABLE*",
				Hashtables.make_hash_table(character_names.$int0$256, Symbols.symbol_function(CommonSymbols.EQL),
						CommonSymbols.UNPROVIDED));
		character_names.$name_character_table$ = SubLFiles.defvar("*NAME-CHARACTER-TABLE*", Hashtables.make_hash_table(
				character_names.$int0$256, Symbols.symbol_function(CommonSymbols.EQUALP), CommonSymbols.UNPROVIDED));
		return CommonSymbols.NIL;
	}

	public static SubLObject setup_character_names_file() {
		// CVS_ID("Id: character-names.lisp 126640 2008-12-04 13:39:36Z builder
		// ");
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
		{
			SubLObject cdohash_table = character_names.$character_names_table$.getDynamicValue();
			SubLObject character = CommonSymbols.NIL;
			SubLObject names = CommonSymbols.NIL;
			{
				Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
				try {
					while (Hashtables.iteratorHasNext(cdohash_iterator)) {
						Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
						character = Hashtables.getEntryKey(cdohash_entry);
						names = Hashtables.getEntryValue(cdohash_entry);
						{
							SubLObject cdolist_list_var = names;
							SubLObject name = CommonSymbols.NIL;
							for (name = cdolist_list_var
									.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
											.rest(), name = cdolist_list_var.first())
								Hashtables.sethash(name, character_names.$name_character_table$.getDynamicValue(),
										character);
						}
					}
				} finally {
					Hashtables.releaseEntrySetIterator(cdohash_iterator);
				}
			}
		}
		return CommonSymbols.NIL;
	}

	private character_names() {
	}

	//// Initializers

	public void declareFunctions() {
		character_names.declare_character_names_file();
	}

	public void initializeVariables() {
		character_names.init_character_names_file();
	}

	public void runTopLevelForms() {
		character_names.setup_character_names_file();
	}

}

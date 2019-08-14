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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map.Entry;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public  final class character_names extends SubLTranslatedFile {

  //// Constructor

  private character_names() {}
  public static final SubLFile me = new character_names();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.character_names";

  //// Definitions

  @SubL(source = "sublisp/character-names.lisp", position = 427) 
  private static SubLSymbol $character_names_table$ = null;

  @SubL(source = "sublisp/character-names.lisp", position = 888) 
  public static final SubLObject character_names(SubLObject v_char) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return ConsesLow.append(Hashtables.gethash(v_char, $character_names_table$.getDynamicValue(thread), UNPROVIDED), list(Strings.make_string(ONE_INTEGER, v_char)));
    }
  }

  @SubL(source = "sublisp/character-names.lisp", position = 1478) 
  private static SubLSymbol $name_character_table$ = null;

  public static final SubLObject declare_character_names_file() {
    declareFunction("character_names", "CHARACTER-NAMES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_character_names_file() {
    $character_names_table$ = defvar("*CHARACTER-NAMES-TABLE*", Hashtables.make_hash_table($int0$256, Symbols.symbol_function(EQL), UNPROVIDED));
    $name_character_table$ = defvar("*NAME-CHARACTER-TABLE*", Hashtables.make_hash_table($int0$256, Symbols.symbol_function(EQUALP), UNPROVIDED));
    return NIL;
  }

  public static final SubLObject setup_character_names_file() {
        Hashtables.sethash(Characters.code_char(ZERO_INTEGER), $character_names_table$.getDynamicValue(), list($str1$Null, $str2$NUL));
    Hashtables.sethash(Characters.code_char(ONE_INTEGER), $character_names_table$.getDynamicValue(), list($str3$Control_a, $str4$c_a));
    Hashtables.sethash(Characters.code_char(TWO_INTEGER), $character_names_table$.getDynamicValue(), list($str5$Control_b, $str6$c_b));
    Hashtables.sethash(Characters.code_char(THREE_INTEGER), $character_names_table$.getDynamicValue(), list($str7$Control_c, $str8$c_c));
    Hashtables.sethash(Characters.code_char(FOUR_INTEGER), $character_names_table$.getDynamicValue(), list($str9$Control_d, $str10$c_d));
    Hashtables.sethash(Characters.code_char(FIVE_INTEGER), $character_names_table$.getDynamicValue(), list($str11$Control_e, $str12$c_e));
    Hashtables.sethash(Characters.code_char(SIX_INTEGER), $character_names_table$.getDynamicValue(), list($str13$Control_f, $str14$c_f));
    Hashtables.sethash(Characters.code_char(SEVEN_INTEGER), $character_names_table$.getDynamicValue(), list($str15$Bell, $str16$BEL));
    Hashtables.sethash(Characters.code_char(EIGHT_INTEGER), $character_names_table$.getDynamicValue(), list($str17$Backspace, $str18$BS));
    Hashtables.sethash(Characters.code_char(NINE_INTEGER), $character_names_table$.getDynamicValue(), list($str19$Tab, $str20$HT));
    Hashtables.sethash(Characters.code_char(TEN_INTEGER), $character_names_table$.getDynamicValue(), list($str21$Newline, $str22$Linefeed));
    Hashtables.sethash(Characters.code_char(ELEVEN_INTEGER), $character_names_table$.getDynamicValue(), list($str23$Vertical_Tab, $str24$VT));
    Hashtables.sethash(Characters.code_char(TWELVE_INTEGER), $character_names_table$.getDynamicValue(), list($str25$Page, $str26$FF));
    Hashtables.sethash(Characters.code_char(THIRTEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str27$Return, $str28$CR));
    Hashtables.sethash(Characters.code_char(FOURTEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str29$Control_n, $str30$c_n));
    Hashtables.sethash(Characters.code_char(FIFTEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str31$Control_o, $str32$c_o));
    Hashtables.sethash(Characters.code_char(SIXTEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str33$Control_p, $str34$c_p));
    Hashtables.sethash(Characters.code_char(SEVENTEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str35$Control_q, $str36$c_q));
    Hashtables.sethash(Characters.code_char(EIGHTEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str37$Control_r, $str38$c_r));
    Hashtables.sethash(Characters.code_char(NINETEEN_INTEGER), $character_names_table$.getDynamicValue(), list($str39$Control_s, $str40$c_s));
    Hashtables.sethash(Characters.code_char(TWENTY_INTEGER), $character_names_table$.getDynamicValue(), list($str41$Control_t, $str42$c_t));
    Hashtables.sethash(Characters.code_char($int43$21), $character_names_table$.getDynamicValue(), list($str44$Control_u, $str45$c_u));
    Hashtables.sethash(Characters.code_char($int46$22), $character_names_table$.getDynamicValue(), list($str47$Control_v, $str48$c_v));
    Hashtables.sethash(Characters.code_char($int49$23), $character_names_table$.getDynamicValue(), list($str50$Control_w, $str51$c_w));
    Hashtables.sethash(Characters.code_char($int52$24), $character_names_table$.getDynamicValue(), list($str53$Control_x, $str54$c_x));
    Hashtables.sethash(Characters.code_char($int55$25), $character_names_table$.getDynamicValue(), list($str56$Control_y, $str57$c_y));
    Hashtables.sethash(Characters.code_char($int58$26), $character_names_table$.getDynamicValue(), list($str59$Control_z, $str60$c_z));
    Hashtables.sethash(Characters.code_char($int61$27), $character_names_table$.getDynamicValue(), list($str62$Escape, $str63$ESC));
    Hashtables.sethash(Characters.code_char($int64$28), $character_names_table$.getDynamicValue(), list($str65$Control__, $str66$c__));
    Hashtables.sethash(Characters.code_char($int67$29), $character_names_table$.getDynamicValue(), list($str68$Control__, $str69$c__));
    Hashtables.sethash(Characters.code_char($int70$30), $character_names_table$.getDynamicValue(), list($str71$Control__, $str72$c__));
    Hashtables.sethash(Characters.code_char($int73$31), $character_names_table$.getDynamicValue(), list($str74$Control__, $str75$c__));
    Hashtables.sethash(Characters.code_char($int76$32), $character_names_table$.getDynamicValue(), list($str77$Space, $str78$SP));
    Hashtables.sethash(Characters.code_char($int79$127), $character_names_table$.getDynamicValue(), list($str80$Rubout, $str81$DEL));
    Hashtables.sethash(Characters.code_char($int82$128), $character_names_table$.getDynamicValue(), list($str83$Meta_Null, $str84$m_Null));
    Hashtables.sethash(Characters.code_char($int85$129), $character_names_table$.getDynamicValue(), list($str86$Control_Meta_a, $str87$c_m_a));
    Hashtables.sethash(Characters.code_char($int88$130), $character_names_table$.getDynamicValue(), list($str89$Control_Meta_b, $str90$c_m_b));
    Hashtables.sethash(Characters.code_char($int91$131), $character_names_table$.getDynamicValue(), list($str92$Control_Meta_c, $str93$c_m_c));
    Hashtables.sethash(Characters.code_char($int94$132), $character_names_table$.getDynamicValue(), list($str95$Control_Meta_d, $str96$c_m_d));
    Hashtables.sethash(Characters.code_char($int97$133), $character_names_table$.getDynamicValue(), list($str98$Control_Meta_e, $str99$c_m_e));
    Hashtables.sethash(Characters.code_char($int100$134), $character_names_table$.getDynamicValue(), list($str101$Control_Meta_f, $str102$c_m_f));
    Hashtables.sethash(Characters.code_char($int103$135), $character_names_table$.getDynamicValue(), list($str104$Meta_Bell, $str105$m_Bell));
    Hashtables.sethash(Characters.code_char($int106$136), $character_names_table$.getDynamicValue(), list($str107$Meta_Backspace, $str108$m_Backspace));
    Hashtables.sethash(Characters.code_char($int109$137), $character_names_table$.getDynamicValue(), list($str110$Meta_Tab, $str111$m_Tab));
    Hashtables.sethash(Characters.code_char($int112$138), $character_names_table$.getDynamicValue(), list($str113$Meta_Newline, $str114$m_Newline));
    Hashtables.sethash(Characters.code_char($int115$139), $character_names_table$.getDynamicValue(), list($str116$Meta_Vertical_Tab, $str117$m_Vertical_Tab));
    Hashtables.sethash(Characters.code_char($int118$140), $character_names_table$.getDynamicValue(), list($str119$Meta_Page, $str120$m_Page));
    Hashtables.sethash(Characters.code_char($int121$141), $character_names_table$.getDynamicValue(), list($str122$Meta_Return, $str123$m_Return));
    Hashtables.sethash(Characters.code_char($int124$142), $character_names_table$.getDynamicValue(), list($str125$Control_Meta_n, $str126$c_m_n));
    Hashtables.sethash(Characters.code_char($int127$143), $character_names_table$.getDynamicValue(), list($str128$Control_Meta_o, $str129$c_m_o));
    Hashtables.sethash(Characters.code_char($int130$144), $character_names_table$.getDynamicValue(), list($str131$Control_Meta_p, $str132$c_m_p));
    Hashtables.sethash(Characters.code_char($int133$145), $character_names_table$.getDynamicValue(), list($str134$Control_Meta_q, $str135$c_m_q));
    Hashtables.sethash(Characters.code_char($int136$146), $character_names_table$.getDynamicValue(), list($str137$Control_Meta_r, $str138$c_m_r));
    Hashtables.sethash(Characters.code_char($int139$147), $character_names_table$.getDynamicValue(), list($str140$Control_Meta_s, $str141$c_m_s));
    Hashtables.sethash(Characters.code_char($int142$148), $character_names_table$.getDynamicValue(), list($str143$Control_Meta_t, $str144$c_m_t));
    Hashtables.sethash(Characters.code_char($int145$149), $character_names_table$.getDynamicValue(), list($str146$Control_Meta_u, $str147$c_m_u));
    Hashtables.sethash(Characters.code_char($int148$150), $character_names_table$.getDynamicValue(), list($str149$Control_Meta_v, $str150$c_m_v));
    Hashtables.sethash(Characters.code_char($int151$151), $character_names_table$.getDynamicValue(), list($str152$Control_Meta_w, $str153$c_m_w));
    Hashtables.sethash(Characters.code_char($int154$152), $character_names_table$.getDynamicValue(), list($str155$Control_Meta_x, $str156$c_m_x));
    Hashtables.sethash(Characters.code_char($int157$153), $character_names_table$.getDynamicValue(), list($str158$Control_Meta_y, $str159$c_m_y));
    Hashtables.sethash(Characters.code_char($int160$154), $character_names_table$.getDynamicValue(), list($str161$Control_Meta_z, $str162$c_m_z));
    Hashtables.sethash(Characters.code_char($int163$155), $character_names_table$.getDynamicValue(), list($str164$Meta_Escape, $str165$m_Escape));
    Hashtables.sethash(Characters.code_char($int166$156), $character_names_table$.getDynamicValue(), list($str167$Control_Meta__, $str168$c_m__));
    Hashtables.sethash(Characters.code_char($int169$157), $character_names_table$.getDynamicValue(), list($str170$Control_Meta__, $str171$c_m__));
    Hashtables.sethash(Characters.code_char($int172$158), $character_names_table$.getDynamicValue(), list($str173$Control_Meta__, $str174$c_m__));
    Hashtables.sethash(Characters.code_char($int175$159), $character_names_table$.getDynamicValue(), list($str176$Control_Meta__, $str177$c_m__));
    Hashtables.sethash(Characters.code_char($int178$160), $character_names_table$.getDynamicValue(), list($str179$Meta_Space, $str180$m_Space));
    Hashtables.sethash(Characters.code_char($int181$161), $character_names_table$.getDynamicValue(), list($str182$Meta__, $str183$m__));
    Hashtables.sethash(Characters.code_char($int184$162), $character_names_table$.getDynamicValue(), list($str185$Meta__, $str186$m__));
    Hashtables.sethash(Characters.code_char($int187$163), $character_names_table$.getDynamicValue(), list($str188$Meta__, $str189$m__));
    Hashtables.sethash(Characters.code_char($int190$164), $character_names_table$.getDynamicValue(), list($str191$Meta__, $str192$m__));
    Hashtables.sethash(Characters.code_char($int193$165), $character_names_table$.getDynamicValue(), list($str194$Meta__, $str195$m__));
    Hashtables.sethash(Characters.code_char($int196$166), $character_names_table$.getDynamicValue(), list($str197$Meta__, $str198$m__));
    Hashtables.sethash(Characters.code_char($int199$167), $character_names_table$.getDynamicValue(), list($str200$Meta__, $str201$m__));
    Hashtables.sethash(Characters.code_char($int202$168), $character_names_table$.getDynamicValue(), list($str203$Meta__, $str204$m__));
    Hashtables.sethash(Characters.code_char($int205$169), $character_names_table$.getDynamicValue(), list($str206$Meta__, $str207$m__));
    Hashtables.sethash(Characters.code_char($int208$170), $character_names_table$.getDynamicValue(), list($str209$Meta__, $str210$m__));
    Hashtables.sethash(Characters.code_char($int211$171), $character_names_table$.getDynamicValue(), list($str212$Meta__, $str213$m__));
    Hashtables.sethash(Characters.code_char($int214$172), $character_names_table$.getDynamicValue(), list($str215$Meta__, $str216$m__));
    Hashtables.sethash(Characters.code_char($int217$173), $character_names_table$.getDynamicValue(), list($str218$Meta__, $str219$m__));
    Hashtables.sethash(Characters.code_char($int220$174), $character_names_table$.getDynamicValue(), list($str221$Meta__, $str222$m__));
    Hashtables.sethash(Characters.code_char($int223$175), $character_names_table$.getDynamicValue(), list($str224$Meta__, $str225$m__));
    Hashtables.sethash(Characters.code_char($int226$176), $character_names_table$.getDynamicValue(), list($str227$Meta_0, $str228$m_0));
    Hashtables.sethash(Characters.code_char($int229$177), $character_names_table$.getDynamicValue(), list($str230$Meta_1, $str231$m_1));
    Hashtables.sethash(Characters.code_char($int232$178), $character_names_table$.getDynamicValue(), list($str233$Meta_2, $str234$m_2));
    Hashtables.sethash(Characters.code_char($int235$179), $character_names_table$.getDynamicValue(), list($str236$Meta_3, $str237$m_3));
    Hashtables.sethash(Characters.code_char($int238$180), $character_names_table$.getDynamicValue(), list($str239$Meta_4, $str240$m_4));
    Hashtables.sethash(Characters.code_char($int241$181), $character_names_table$.getDynamicValue(), list($str242$Meta_5, $str243$m_5));
    Hashtables.sethash(Characters.code_char($int244$182), $character_names_table$.getDynamicValue(), list($str245$Meta_6, $str246$m_6));
    Hashtables.sethash(Characters.code_char($int247$183), $character_names_table$.getDynamicValue(), list($str248$Meta_7, $str249$m_7));
    Hashtables.sethash(Characters.code_char($int250$184), $character_names_table$.getDynamicValue(), list($str251$Meta_8, $str252$m_8));
    Hashtables.sethash(Characters.code_char($int253$185), $character_names_table$.getDynamicValue(), list($str254$Meta_9, $str255$m_9));
    Hashtables.sethash(Characters.code_char($int256$186), $character_names_table$.getDynamicValue(), list($str257$Meta__, $str258$m__));
    Hashtables.sethash(Characters.code_char($int259$187), $character_names_table$.getDynamicValue(), list($str260$Meta__, $str261$m__));
    Hashtables.sethash(Characters.code_char($int262$188), $character_names_table$.getDynamicValue(), list($str263$Meta__, $str264$m__));
    Hashtables.sethash(Characters.code_char($int265$189), $character_names_table$.getDynamicValue(), list($str266$Meta__, $str267$m__));
    Hashtables.sethash(Characters.code_char($int268$190), $character_names_table$.getDynamicValue(), list($str269$Meta__, $str270$m__));
    Hashtables.sethash(Characters.code_char($int271$191), $character_names_table$.getDynamicValue(), list($str272$Meta__, $str273$m__));
    Hashtables.sethash(Characters.code_char($int274$192), $character_names_table$.getDynamicValue(), list($str275$Meta__, $str276$m__));
    Hashtables.sethash(Characters.code_char($int277$193), $character_names_table$.getDynamicValue(), list($str278$Meta_A, $str279$m_A));
    Hashtables.sethash(Characters.code_char($int280$194), $character_names_table$.getDynamicValue(), list($str281$Meta_B, $str282$m_B));
    Hashtables.sethash(Characters.code_char($int283$195), $character_names_table$.getDynamicValue(), list($str284$Meta_C, $str285$m_C));
    Hashtables.sethash(Characters.code_char($int286$196), $character_names_table$.getDynamicValue(), list($str287$Meta_D, $str288$m_D));
    Hashtables.sethash(Characters.code_char($int289$197), $character_names_table$.getDynamicValue(), list($str290$Meta_E, $str291$m_E));
    Hashtables.sethash(Characters.code_char($int292$198), $character_names_table$.getDynamicValue(), list($str293$Meta_F, $str294$m_F));
    Hashtables.sethash(Characters.code_char($int295$199), $character_names_table$.getDynamicValue(), list($str296$Meta_G, $str297$m_G));
    Hashtables.sethash(Characters.code_char($int298$200), $character_names_table$.getDynamicValue(), list($str299$Meta_H, $str300$m_H));
    Hashtables.sethash(Characters.code_char($int301$201), $character_names_table$.getDynamicValue(), list($str302$Meta_I, $str303$m_I));
    Hashtables.sethash(Characters.code_char($int304$202), $character_names_table$.getDynamicValue(), list($str305$Meta_J, $str306$m_J));
    Hashtables.sethash(Characters.code_char($int307$203), $character_names_table$.getDynamicValue(), list($str308$Meta_K, $str309$m_K));
    Hashtables.sethash(Characters.code_char($int310$204), $character_names_table$.getDynamicValue(), list($str311$Meta_L, $str312$m_L));
    Hashtables.sethash(Characters.code_char($int313$205), $character_names_table$.getDynamicValue(), list($str314$Meta_M, $str315$m_M));
    Hashtables.sethash(Characters.code_char($int316$206), $character_names_table$.getDynamicValue(), list($str317$Meta_N, $str318$m_N));
    Hashtables.sethash(Characters.code_char($int319$207), $character_names_table$.getDynamicValue(), list($str320$Meta_O, $str321$m_O));
    Hashtables.sethash(Characters.code_char($int322$208), $character_names_table$.getDynamicValue(), list($str323$Meta_P, $str324$m_P));
    Hashtables.sethash(Characters.code_char($int325$209), $character_names_table$.getDynamicValue(), list($str326$Meta_Q, $str327$m_Q));
    Hashtables.sethash(Characters.code_char($int328$210), $character_names_table$.getDynamicValue(), list($str329$Meta_R, $str330$m_R));
    Hashtables.sethash(Characters.code_char($int331$211), $character_names_table$.getDynamicValue(), list($str332$Meta_S, $str333$m_S));
    Hashtables.sethash(Characters.code_char($int334$212), $character_names_table$.getDynamicValue(), list($str335$Meta_T, $str336$m_T));
    Hashtables.sethash(Characters.code_char($int337$213), $character_names_table$.getDynamicValue(), list($str338$Meta_U, $str339$m_U));
    Hashtables.sethash(Characters.code_char($int340$214), $character_names_table$.getDynamicValue(), list($str341$Meta_V, $str342$m_V));
    Hashtables.sethash(Characters.code_char($int343$215), $character_names_table$.getDynamicValue(), list($str344$Meta_W, $str345$m_W));
    Hashtables.sethash(Characters.code_char($int346$216), $character_names_table$.getDynamicValue(), list($str347$Meta_X, $str348$m_X));
    Hashtables.sethash(Characters.code_char($int349$217), $character_names_table$.getDynamicValue(), list($str350$Meta_Y, $str351$m_Y));
    Hashtables.sethash(Characters.code_char($int352$218), $character_names_table$.getDynamicValue(), list($str353$Meta_Z, $str354$m_Z));
    Hashtables.sethash(Characters.code_char($int355$219), $character_names_table$.getDynamicValue(), list($str356$Meta__, $str357$m__));
    Hashtables.sethash(Characters.code_char($int358$220), $character_names_table$.getDynamicValue(), list($str359$Meta__, $str360$m__));
    Hashtables.sethash(Characters.code_char($int361$221), $character_names_table$.getDynamicValue(), list($str362$Meta__, $str363$m__));
    Hashtables.sethash(Characters.code_char($int364$222), $character_names_table$.getDynamicValue(), list($str365$Meta__, $str366$m__));
    Hashtables.sethash(Characters.code_char($int367$223), $character_names_table$.getDynamicValue(), list($str368$Meta__, $str369$m__));
    Hashtables.sethash(Characters.code_char($int370$224), $character_names_table$.getDynamicValue(), list($str371$Meta__, $str372$m__));
    Hashtables.sethash(Characters.code_char($int373$225), $character_names_table$.getDynamicValue(), list($str374$Meta_a, $str375$m_a));
    Hashtables.sethash(Characters.code_char($int376$226), $character_names_table$.getDynamicValue(), list($str377$Meta_b, $str378$m_b));
    Hashtables.sethash(Characters.code_char($int379$227), $character_names_table$.getDynamicValue(), list($str380$Meta_c, $str381$m_c));
    Hashtables.sethash(Characters.code_char($int382$228), $character_names_table$.getDynamicValue(), list($str383$Meta_d, $str384$m_d));
    Hashtables.sethash(Characters.code_char($int385$229), $character_names_table$.getDynamicValue(), list($str386$Meta_e, $str387$m_e));
    Hashtables.sethash(Characters.code_char($int388$230), $character_names_table$.getDynamicValue(), list($str389$Meta_f, $str390$m_f));
    Hashtables.sethash(Characters.code_char($int391$231), $character_names_table$.getDynamicValue(), list($str392$Meta_g, $str393$m_g));
    Hashtables.sethash(Characters.code_char($int394$232), $character_names_table$.getDynamicValue(), list($str395$Meta_h, $str396$m_h));
    Hashtables.sethash(Characters.code_char($int397$233), $character_names_table$.getDynamicValue(), list($str398$Meta_i, $str399$m_i));
    Hashtables.sethash(Characters.code_char($int400$234), $character_names_table$.getDynamicValue(), list($str401$Meta_j, $str402$m_j));
    Hashtables.sethash(Characters.code_char($int403$235), $character_names_table$.getDynamicValue(), list($str404$Meta_k, $str405$m_k));
    Hashtables.sethash(Characters.code_char($int406$236), $character_names_table$.getDynamicValue(), list($str407$Meta_l, $str408$m_l));
    Hashtables.sethash(Characters.code_char($int409$237), $character_names_table$.getDynamicValue(), list($str410$Meta_m, $str411$m_m));
    Hashtables.sethash(Characters.code_char($int412$238), $character_names_table$.getDynamicValue(), list($str413$Meta_n, $str414$m_n));
    Hashtables.sethash(Characters.code_char($int415$239), $character_names_table$.getDynamicValue(), list($str416$Meta_o, $str417$m_o));
    Hashtables.sethash(Characters.code_char($int418$240), $character_names_table$.getDynamicValue(), list($str419$Meta_p, $str420$m_p));
    Hashtables.sethash(Characters.code_char($int421$241), $character_names_table$.getDynamicValue(), list($str422$Meta_q, $str423$m_q));
    Hashtables.sethash(Characters.code_char($int424$242), $character_names_table$.getDynamicValue(), list($str425$Meta_r, $str426$m_r));
    Hashtables.sethash(Characters.code_char($int427$243), $character_names_table$.getDynamicValue(), list($str428$Meta_s, $str429$m_s));
    Hashtables.sethash(Characters.code_char($int430$244), $character_names_table$.getDynamicValue(), list($str431$Meta_t, $str432$m_t));
    Hashtables.sethash(Characters.code_char($int433$245), $character_names_table$.getDynamicValue(), list($str434$Meta_u, $str435$m_u));
    Hashtables.sethash(Characters.code_char($int436$246), $character_names_table$.getDynamicValue(), list($str437$Meta_v, $str438$m_v));
    Hashtables.sethash(Characters.code_char($int439$247), $character_names_table$.getDynamicValue(), list($str440$Meta_w, $str441$m_w));
    Hashtables.sethash(Characters.code_char($int442$248), $character_names_table$.getDynamicValue(), list($str443$Meta_x, $str444$m_x));
    Hashtables.sethash(Characters.code_char($int445$249), $character_names_table$.getDynamicValue(), list($str446$Meta_y, $str447$m_y));
    Hashtables.sethash(Characters.code_char($int448$250), $character_names_table$.getDynamicValue(), list($str449$Meta_z, $str450$m_z));
    Hashtables.sethash(Characters.code_char($int451$251), $character_names_table$.getDynamicValue(), list($str452$Meta__, $str453$m__));
    Hashtables.sethash(Characters.code_char($int454$252), $character_names_table$.getDynamicValue(), list($str455$Meta__, $str456$m__));
    Hashtables.sethash(Characters.code_char($int457$253), $character_names_table$.getDynamicValue(), list($str458$Meta__, $str459$m__));
    Hashtables.sethash(Characters.code_char($int460$254), $character_names_table$.getDynamicValue(), list($str461$Meta__, $str462$m__));
    Hashtables.sethash(Characters.code_char($int463$255), $character_names_table$.getDynamicValue(), list($str464$Meta_Rubout, $str465$m_Rubout));
    {
      SubLObject cdohash_table = $character_names_table$.getDynamicValue();
      SubLObject character = NIL;
      SubLObject names = NIL;
      {
        final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
        try {
          while (Hashtables.iteratorHasNext(cdohash_iterator)) {
            final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
            character = Hashtables.getEntryKey(cdohash_entry);
            names = Hashtables.getEntryValue(cdohash_entry);
            {
              SubLObject cdolist_list_var = names;
              SubLObject name = NIL;
              for (name = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), name = cdolist_list_var.first()) {
                Hashtables.sethash(name, $name_character_table$.getDynamicValue(), character);
              }
            }
          }
        } finally {
          Hashtables.releaseEntrySetIterator(cdohash_iterator);
        }
      }
    }
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$256 = makeInteger(256);
  public static final SubLString $str1$Null = makeString("Null");
  public static final SubLString $str2$NUL = makeString("NUL");
  public static final SubLString $str3$Control_a = makeString("Control-a");
  public static final SubLString $str4$c_a = makeString("c-a");
  public static final SubLString $str5$Control_b = makeString("Control-b");
  public static final SubLString $str6$c_b = makeString("c-b");
  public static final SubLString $str7$Control_c = makeString("Control-c");
  public static final SubLString $str8$c_c = makeString("c-c");
  public static final SubLString $str9$Control_d = makeString("Control-d");
  public static final SubLString $str10$c_d = makeString("c-d");
  public static final SubLString $str11$Control_e = makeString("Control-e");
  public static final SubLString $str12$c_e = makeString("c-e");
  public static final SubLString $str13$Control_f = makeString("Control-f");
  public static final SubLString $str14$c_f = makeString("c-f");
  public static final SubLString $str15$Bell = makeString("Bell");
  public static final SubLString $str16$BEL = makeString("BEL");
  public static final SubLString $str17$Backspace = makeString("Backspace");
  public static final SubLString $str18$BS = makeString("BS");
  public static final SubLString $str19$Tab = makeString("Tab");
  public static final SubLString $str20$HT = makeString("HT");
  public static final SubLString $str21$Newline = makeString("Newline");
  public static final SubLString $str22$Linefeed = makeString("Linefeed");
  public static final SubLString $str23$Vertical_Tab = makeString("Vertical-Tab");
  public static final SubLString $str24$VT = makeString("VT");
  public static final SubLString $str25$Page = makeString("Page");
  public static final SubLString $str26$FF = makeString("FF");
  public static final SubLString $str27$Return = makeString("Return");
  public static final SubLString $str28$CR = makeString("CR");
  public static final SubLString $str29$Control_n = makeString("Control-n");
  public static final SubLString $str30$c_n = makeString("c-n");
  public static final SubLString $str31$Control_o = makeString("Control-o");
  public static final SubLString $str32$c_o = makeString("c-o");
  public static final SubLString $str33$Control_p = makeString("Control-p");
  public static final SubLString $str34$c_p = makeString("c-p");
  public static final SubLString $str35$Control_q = makeString("Control-q");
  public static final SubLString $str36$c_q = makeString("c-q");
  public static final SubLString $str37$Control_r = makeString("Control-r");
  public static final SubLString $str38$c_r = makeString("c-r");
  public static final SubLString $str39$Control_s = makeString("Control-s");
  public static final SubLString $str40$c_s = makeString("c-s");
  public static final SubLString $str41$Control_t = makeString("Control-t");
  public static final SubLString $str42$c_t = makeString("c-t");
  public static final SubLInteger $int43$21 = makeInteger(21);
  public static final SubLString $str44$Control_u = makeString("Control-u");
  public static final SubLString $str45$c_u = makeString("c-u");
  public static final SubLInteger $int46$22 = makeInteger(22);
  public static final SubLString $str47$Control_v = makeString("Control-v");
  public static final SubLString $str48$c_v = makeString("c-v");
  public static final SubLInteger $int49$23 = makeInteger(23);
  public static final SubLString $str50$Control_w = makeString("Control-w");
  public static final SubLString $str51$c_w = makeString("c-w");
  public static final SubLInteger $int52$24 = makeInteger(24);
  public static final SubLString $str53$Control_x = makeString("Control-x");
  public static final SubLString $str54$c_x = makeString("c-x");
  public static final SubLInteger $int55$25 = makeInteger(25);
  public static final SubLString $str56$Control_y = makeString("Control-y");
  public static final SubLString $str57$c_y = makeString("c-y");
  public static final SubLInteger $int58$26 = makeInteger(26);
  public static final SubLString $str59$Control_z = makeString("Control-z");
  public static final SubLString $str60$c_z = makeString("c-z");
  public static final SubLInteger $int61$27 = makeInteger(27);
  public static final SubLString $str62$Escape = makeString("Escape");
  public static final SubLString $str63$ESC = makeString("ESC");
  public static final SubLInteger $int64$28 = makeInteger(28);
  public static final SubLString $str65$Control__ = makeString("Control-\\");
  public static final SubLString $str66$c__ = makeString("c-\\");
  public static final SubLInteger $int67$29 = makeInteger(29);
  public static final SubLString $str68$Control__ = makeString("Control-]");
  public static final SubLString $str69$c__ = makeString("c-]");
  public static final SubLInteger $int70$30 = makeInteger(30);
  public static final SubLString $str71$Control__ = makeString("Control-^");
  public static final SubLString $str72$c__ = makeString("c-^");
  public static final SubLInteger $int73$31 = makeInteger(31);
  public static final SubLString $str74$Control__ = makeString("Control-_");
  public static final SubLString $str75$c__ = makeString("c-_");
  public static final SubLInteger $int76$32 = makeInteger(32);
  public static final SubLString $str77$Space = makeString("Space");
  public static final SubLString $str78$SP = makeString("SP");
  public static final SubLInteger $int79$127 = makeInteger(127);
  public static final SubLString $str80$Rubout = makeString("Rubout");
  public static final SubLString $str81$DEL = makeString("DEL");
  public static final SubLInteger $int82$128 = makeInteger(128);
  public static final SubLString $str83$Meta_Null = makeString("Meta-Null");
  public static final SubLString $str84$m_Null = makeString("m-Null");
  public static final SubLInteger $int85$129 = makeInteger(129);
  public static final SubLString $str86$Control_Meta_a = makeString("Control-Meta-a");
  public static final SubLString $str87$c_m_a = makeString("c-m-a");
  public static final SubLInteger $int88$130 = makeInteger(130);
  public static final SubLString $str89$Control_Meta_b = makeString("Control-Meta-b");
  public static final SubLString $str90$c_m_b = makeString("c-m-b");
  public static final SubLInteger $int91$131 = makeInteger(131);
  public static final SubLString $str92$Control_Meta_c = makeString("Control-Meta-c");
  public static final SubLString $str93$c_m_c = makeString("c-m-c");
  public static final SubLInteger $int94$132 = makeInteger(132);
  public static final SubLString $str95$Control_Meta_d = makeString("Control-Meta-d");
  public static final SubLString $str96$c_m_d = makeString("c-m-d");
  public static final SubLInteger $int97$133 = makeInteger(133);
  public static final SubLString $str98$Control_Meta_e = makeString("Control-Meta-e");
  public static final SubLString $str99$c_m_e = makeString("c-m-e");
  public static final SubLInteger $int100$134 = makeInteger(134);
  public static final SubLString $str101$Control_Meta_f = makeString("Control-Meta-f");
  public static final SubLString $str102$c_m_f = makeString("c-m-f");
  public static final SubLInteger $int103$135 = makeInteger(135);
  public static final SubLString $str104$Meta_Bell = makeString("Meta-Bell");
  public static final SubLString $str105$m_Bell = makeString("m-Bell");
  public static final SubLInteger $int106$136 = makeInteger(136);
  public static final SubLString $str107$Meta_Backspace = makeString("Meta-Backspace");
  public static final SubLString $str108$m_Backspace = makeString("m-Backspace");
  public static final SubLInteger $int109$137 = makeInteger(137);
  public static final SubLString $str110$Meta_Tab = makeString("Meta-Tab");
  public static final SubLString $str111$m_Tab = makeString("m-Tab");
  public static final SubLInteger $int112$138 = makeInteger(138);
  public static final SubLString $str113$Meta_Newline = makeString("Meta-Newline");
  public static final SubLString $str114$m_Newline = makeString("m-Newline");
  public static final SubLInteger $int115$139 = makeInteger(139);
  public static final SubLString $str116$Meta_Vertical_Tab = makeString("Meta-Vertical-Tab");
  public static final SubLString $str117$m_Vertical_Tab = makeString("m-Vertical-Tab");
  public static final SubLInteger $int118$140 = makeInteger(140);
  public static final SubLString $str119$Meta_Page = makeString("Meta-Page");
  public static final SubLString $str120$m_Page = makeString("m-Page");
  public static final SubLInteger $int121$141 = makeInteger(141);
  public static final SubLString $str122$Meta_Return = makeString("Meta-Return");
  public static final SubLString $str123$m_Return = makeString("m-Return");
  public static final SubLInteger $int124$142 = makeInteger(142);
  public static final SubLString $str125$Control_Meta_n = makeString("Control-Meta-n");
  public static final SubLString $str126$c_m_n = makeString("c-m-n");
  public static final SubLInteger $int127$143 = makeInteger(143);
  public static final SubLString $str128$Control_Meta_o = makeString("Control-Meta-o");
  public static final SubLString $str129$c_m_o = makeString("c-m-o");
  public static final SubLInteger $int130$144 = makeInteger(144);
  public static final SubLString $str131$Control_Meta_p = makeString("Control-Meta-p");
  public static final SubLString $str132$c_m_p = makeString("c-m-p");
  public static final SubLInteger $int133$145 = makeInteger(145);
  public static final SubLString $str134$Control_Meta_q = makeString("Control-Meta-q");
  public static final SubLString $str135$c_m_q = makeString("c-m-q");
  public static final SubLInteger $int136$146 = makeInteger(146);
  public static final SubLString $str137$Control_Meta_r = makeString("Control-Meta-r");
  public static final SubLString $str138$c_m_r = makeString("c-m-r");
  public static final SubLInteger $int139$147 = makeInteger(147);
  public static final SubLString $str140$Control_Meta_s = makeString("Control-Meta-s");
  public static final SubLString $str141$c_m_s = makeString("c-m-s");
  public static final SubLInteger $int142$148 = makeInteger(148);
  public static final SubLString $str143$Control_Meta_t = makeString("Control-Meta-t");
  public static final SubLString $str144$c_m_t = makeString("c-m-t");
  public static final SubLInteger $int145$149 = makeInteger(149);
  public static final SubLString $str146$Control_Meta_u = makeString("Control-Meta-u");
  public static final SubLString $str147$c_m_u = makeString("c-m-u");
  public static final SubLInteger $int148$150 = makeInteger(150);
  public static final SubLString $str149$Control_Meta_v = makeString("Control-Meta-v");
  public static final SubLString $str150$c_m_v = makeString("c-m-v");
  public static final SubLInteger $int151$151 = makeInteger(151);
  public static final SubLString $str152$Control_Meta_w = makeString("Control-Meta-w");
  public static final SubLString $str153$c_m_w = makeString("c-m-w");
  public static final SubLInteger $int154$152 = makeInteger(152);
  public static final SubLString $str155$Control_Meta_x = makeString("Control-Meta-x");
  public static final SubLString $str156$c_m_x = makeString("c-m-x");
  public static final SubLInteger $int157$153 = makeInteger(153);
  public static final SubLString $str158$Control_Meta_y = makeString("Control-Meta-y");
  public static final SubLString $str159$c_m_y = makeString("c-m-y");
  public static final SubLInteger $int160$154 = makeInteger(154);
  public static final SubLString $str161$Control_Meta_z = makeString("Control-Meta-z");
  public static final SubLString $str162$c_m_z = makeString("c-m-z");
  public static final SubLInteger $int163$155 = makeInteger(155);
  public static final SubLString $str164$Meta_Escape = makeString("Meta-Escape");
  public static final SubLString $str165$m_Escape = makeString("m-Escape");
  public static final SubLInteger $int166$156 = makeInteger(156);
  public static final SubLString $str167$Control_Meta__ = makeString("Control-Meta-\\");
  public static final SubLString $str168$c_m__ = makeString("c-m-\\");
  public static final SubLInteger $int169$157 = makeInteger(157);
  public static final SubLString $str170$Control_Meta__ = makeString("Control-Meta-]");
  public static final SubLString $str171$c_m__ = makeString("c-m-]");
  public static final SubLInteger $int172$158 = makeInteger(158);
  public static final SubLString $str173$Control_Meta__ = makeString("Control-Meta-^");
  public static final SubLString $str174$c_m__ = makeString("c-m-^");
  public static final SubLInteger $int175$159 = makeInteger(159);
  public static final SubLString $str176$Control_Meta__ = makeString("Control-Meta-_");
  public static final SubLString $str177$c_m__ = makeString("c-m-_");
  public static final SubLInteger $int178$160 = makeInteger(160);
  public static final SubLString $str179$Meta_Space = makeString("Meta-Space");
  public static final SubLString $str180$m_Space = makeString("m-Space");
  public static final SubLInteger $int181$161 = makeInteger(161);
  public static final SubLString $str182$Meta__ = makeString("Meta-!");
  public static final SubLString $str183$m__ = makeString("m-!");
  public static final SubLInteger $int184$162 = makeInteger(162);
  public static final SubLString $str185$Meta__ = makeString("Meta-\"");
  public static final SubLString $str186$m__ = makeString("m-\"");
  public static final SubLInteger $int187$163 = makeInteger(163);
  public static final SubLString $str188$Meta__ = makeString("Meta-#");
  public static final SubLString $str189$m__ = makeString("m-#");
  public static final SubLInteger $int190$164 = makeInteger(164);
  public static final SubLString $str191$Meta__ = makeString("Meta-$");
  public static final SubLString $str192$m__ = makeString("m-$");
  public static final SubLInteger $int193$165 = makeInteger(165);
  public static final SubLString $str194$Meta__ = makeString("Meta-%");
  public static final SubLString $str195$m__ = makeString("m-%");
  public static final SubLInteger $int196$166 = makeInteger(166);
  public static final SubLString $str197$Meta__ = makeString("Meta-&");
  public static final SubLString $str198$m__ = makeString("m-&");
  public static final SubLInteger $int199$167 = makeInteger(167);
  public static final SubLString $str200$Meta__ = makeString("Meta-'");
  public static final SubLString $str201$m__ = makeString("m-'");
  public static final SubLInteger $int202$168 = makeInteger(168);
  public static final SubLString $str203$Meta__ = makeString("Meta-(");
  public static final SubLString $str204$m__ = makeString("m-(");
  public static final SubLInteger $int205$169 = makeInteger(169);
  public static final SubLString $str206$Meta__ = makeString("Meta-)");
  public static final SubLString $str207$m__ = makeString("m-)");
  public static final SubLInteger $int208$170 = makeInteger(170);
  public static final SubLString $str209$Meta__ = makeString("Meta-*");
  public static final SubLString $str210$m__ = makeString("m-*");
  public static final SubLInteger $int211$171 = makeInteger(171);
  public static final SubLString $str212$Meta__ = makeString("Meta-+");
  public static final SubLString $str213$m__ = makeString("m-+");
  public static final SubLInteger $int214$172 = makeInteger(172);
  public static final SubLString $str215$Meta__ = makeString("Meta-,");
  public static final SubLString $str216$m__ = makeString("m-,");
  public static final SubLInteger $int217$173 = makeInteger(173);
  public static final SubLString $str218$Meta__ = makeString("Meta--");
  public static final SubLString $str219$m__ = makeString("m--");
  public static final SubLInteger $int220$174 = makeInteger(174);
  public static final SubLString $str221$Meta__ = makeString("Meta-.");
  public static final SubLString $str222$m__ = makeString("m-.");
  public static final SubLInteger $int223$175 = makeInteger(175);
  public static final SubLString $str224$Meta__ = makeString("Meta-/");
  public static final SubLString $str225$m__ = makeString("m-/");
  public static final SubLInteger $int226$176 = makeInteger(176);
  public static final SubLString $str227$Meta_0 = makeString("Meta-0");
  public static final SubLString $str228$m_0 = makeString("m-0");
  public static final SubLInteger $int229$177 = makeInteger(177);
  public static final SubLString $str230$Meta_1 = makeString("Meta-1");
  public static final SubLString $str231$m_1 = makeString("m-1");
  public static final SubLInteger $int232$178 = makeInteger(178);
  public static final SubLString $str233$Meta_2 = makeString("Meta-2");
  public static final SubLString $str234$m_2 = makeString("m-2");
  public static final SubLInteger $int235$179 = makeInteger(179);
  public static final SubLString $str236$Meta_3 = makeString("Meta-3");
  public static final SubLString $str237$m_3 = makeString("m-3");
  public static final SubLInteger $int238$180 = makeInteger(180);
  public static final SubLString $str239$Meta_4 = makeString("Meta-4");
  public static final SubLString $str240$m_4 = makeString("m-4");
  public static final SubLInteger $int241$181 = makeInteger(181);
  public static final SubLString $str242$Meta_5 = makeString("Meta-5");
  public static final SubLString $str243$m_5 = makeString("m-5");
  public static final SubLInteger $int244$182 = makeInteger(182);
  public static final SubLString $str245$Meta_6 = makeString("Meta-6");
  public static final SubLString $str246$m_6 = makeString("m-6");
  public static final SubLInteger $int247$183 = makeInteger(183);
  public static final SubLString $str248$Meta_7 = makeString("Meta-7");
  public static final SubLString $str249$m_7 = makeString("m-7");
  public static final SubLInteger $int250$184 = makeInteger(184);
  public static final SubLString $str251$Meta_8 = makeString("Meta-8");
  public static final SubLString $str252$m_8 = makeString("m-8");
  public static final SubLInteger $int253$185 = makeInteger(185);
  public static final SubLString $str254$Meta_9 = makeString("Meta-9");
  public static final SubLString $str255$m_9 = makeString("m-9");
  public static final SubLInteger $int256$186 = makeInteger(186);
  public static final SubLString $str257$Meta__ = makeString("Meta-:");
  public static final SubLString $str258$m__ = makeString("m-:");
  public static final SubLInteger $int259$187 = makeInteger(187);
  public static final SubLString $str260$Meta__ = makeString("Meta-;");
  public static final SubLString $str261$m__ = makeString("m-;");
  public static final SubLInteger $int262$188 = makeInteger(188);
  public static final SubLString $str263$Meta__ = makeString("Meta-<");
  public static final SubLString $str264$m__ = makeString("m-<");
  public static final SubLInteger $int265$189 = makeInteger(189);
  public static final SubLString $str266$Meta__ = makeString("Meta-=");
  public static final SubLString $str267$m__ = makeString("m-=");
  public static final SubLInteger $int268$190 = makeInteger(190);
  public static final SubLString $str269$Meta__ = makeString("Meta->");
  public static final SubLString $str270$m__ = makeString("m->");
  public static final SubLInteger $int271$191 = makeInteger(191);
  public static final SubLString $str272$Meta__ = makeString("Meta-?");
  public static final SubLString $str273$m__ = makeString("m-?");
  public static final SubLInteger $int274$192 = makeInteger(192);
  public static final SubLString $str275$Meta__ = makeString("Meta-@");
  public static final SubLString $str276$m__ = makeString("m-@");
  public static final SubLInteger $int277$193 = makeInteger(193);
  public static final SubLString $str278$Meta_A = makeString("Meta-A");
  public static final SubLString $str279$m_A = makeString("m-A");
  public static final SubLInteger $int280$194 = makeInteger(194);
  public static final SubLString $str281$Meta_B = makeString("Meta-B");
  public static final SubLString $str282$m_B = makeString("m-B");
  public static final SubLInteger $int283$195 = makeInteger(195);
  public static final SubLString $str284$Meta_C = makeString("Meta-C");
  public static final SubLString $str285$m_C = makeString("m-C");
  public static final SubLInteger $int286$196 = makeInteger(196);
  public static final SubLString $str287$Meta_D = makeString("Meta-D");
  public static final SubLString $str288$m_D = makeString("m-D");
  public static final SubLInteger $int289$197 = makeInteger(197);
  public static final SubLString $str290$Meta_E = makeString("Meta-E");
  public static final SubLString $str291$m_E = makeString("m-E");
  public static final SubLInteger $int292$198 = makeInteger(198);
  public static final SubLString $str293$Meta_F = makeString("Meta-F");
  public static final SubLString $str294$m_F = makeString("m-F");
  public static final SubLInteger $int295$199 = makeInteger(199);
  public static final SubLString $str296$Meta_G = makeString("Meta-G");
  public static final SubLString $str297$m_G = makeString("m-G");
  public static final SubLInteger $int298$200 = makeInteger(200);
  public static final SubLString $str299$Meta_H = makeString("Meta-H");
  public static final SubLString $str300$m_H = makeString("m-H");
  public static final SubLInteger $int301$201 = makeInteger(201);
  public static final SubLString $str302$Meta_I = makeString("Meta-I");
  public static final SubLString $str303$m_I = makeString("m-I");
  public static final SubLInteger $int304$202 = makeInteger(202);
  public static final SubLString $str305$Meta_J = makeString("Meta-J");
  public static final SubLString $str306$m_J = makeString("m-J");
  public static final SubLInteger $int307$203 = makeInteger(203);
  public static final SubLString $str308$Meta_K = makeString("Meta-K");
  public static final SubLString $str309$m_K = makeString("m-K");
  public static final SubLInteger $int310$204 = makeInteger(204);
  public static final SubLString $str311$Meta_L = makeString("Meta-L");
  public static final SubLString $str312$m_L = makeString("m-L");
  public static final SubLInteger $int313$205 = makeInteger(205);
  public static final SubLString $str314$Meta_M = makeString("Meta-M");
  public static final SubLString $str315$m_M = makeString("m-M");
  public static final SubLInteger $int316$206 = makeInteger(206);
  public static final SubLString $str317$Meta_N = makeString("Meta-N");
  public static final SubLString $str318$m_N = makeString("m-N");
  public static final SubLInteger $int319$207 = makeInteger(207);
  public static final SubLString $str320$Meta_O = makeString("Meta-O");
  public static final SubLString $str321$m_O = makeString("m-O");
  public static final SubLInteger $int322$208 = makeInteger(208);
  public static final SubLString $str323$Meta_P = makeString("Meta-P");
  public static final SubLString $str324$m_P = makeString("m-P");
  public static final SubLInteger $int325$209 = makeInteger(209);
  public static final SubLString $str326$Meta_Q = makeString("Meta-Q");
  public static final SubLString $str327$m_Q = makeString("m-Q");
  public static final SubLInteger $int328$210 = makeInteger(210);
  public static final SubLString $str329$Meta_R = makeString("Meta-R");
  public static final SubLString $str330$m_R = makeString("m-R");
  public static final SubLInteger $int331$211 = makeInteger(211);
  public static final SubLString $str332$Meta_S = makeString("Meta-S");
  public static final SubLString $str333$m_S = makeString("m-S");
  public static final SubLInteger $int334$212 = makeInteger(212);
  public static final SubLString $str335$Meta_T = makeString("Meta-T");
  public static final SubLString $str336$m_T = makeString("m-T");
  public static final SubLInteger $int337$213 = makeInteger(213);
  public static final SubLString $str338$Meta_U = makeString("Meta-U");
  public static final SubLString $str339$m_U = makeString("m-U");
  public static final SubLInteger $int340$214 = makeInteger(214);
  public static final SubLString $str341$Meta_V = makeString("Meta-V");
  public static final SubLString $str342$m_V = makeString("m-V");
  public static final SubLInteger $int343$215 = makeInteger(215);
  public static final SubLString $str344$Meta_W = makeString("Meta-W");
  public static final SubLString $str345$m_W = makeString("m-W");
  public static final SubLInteger $int346$216 = makeInteger(216);
  public static final SubLString $str347$Meta_X = makeString("Meta-X");
  public static final SubLString $str348$m_X = makeString("m-X");
  public static final SubLInteger $int349$217 = makeInteger(217);
  public static final SubLString $str350$Meta_Y = makeString("Meta-Y");
  public static final SubLString $str351$m_Y = makeString("m-Y");
  public static final SubLInteger $int352$218 = makeInteger(218);
  public static final SubLString $str353$Meta_Z = makeString("Meta-Z");
  public static final SubLString $str354$m_Z = makeString("m-Z");
  public static final SubLInteger $int355$219 = makeInteger(219);
  public static final SubLString $str356$Meta__ = makeString("Meta-[");
  public static final SubLString $str357$m__ = makeString("m-[");
  public static final SubLInteger $int358$220 = makeInteger(220);
  public static final SubLString $str359$Meta__ = makeString("Meta-\\");
  public static final SubLString $str360$m__ = makeString("m-\\");
  public static final SubLInteger $int361$221 = makeInteger(221);
  public static final SubLString $str362$Meta__ = makeString("Meta-]");
  public static final SubLString $str363$m__ = makeString("m-]");
  public static final SubLInteger $int364$222 = makeInteger(222);
  public static final SubLString $str365$Meta__ = makeString("Meta-^");
  public static final SubLString $str366$m__ = makeString("m-^");
  public static final SubLInteger $int367$223 = makeInteger(223);
  public static final SubLString $str368$Meta__ = makeString("Meta-_");
  public static final SubLString $str369$m__ = makeString("m-_");
  public static final SubLInteger $int370$224 = makeInteger(224);
  public static final SubLString $str371$Meta__ = makeString("Meta-`");
  public static final SubLString $str372$m__ = makeString("m-`");
  public static final SubLInteger $int373$225 = makeInteger(225);
  public static final SubLString $str374$Meta_a = makeString("Meta-a");
  public static final SubLString $str375$m_a = makeString("m-a");
  public static final SubLInteger $int376$226 = makeInteger(226);
  public static final SubLString $str377$Meta_b = makeString("Meta-b");
  public static final SubLString $str378$m_b = makeString("m-b");
  public static final SubLInteger $int379$227 = makeInteger(227);
  public static final SubLString $str380$Meta_c = makeString("Meta-c");
  public static final SubLString $str381$m_c = makeString("m-c");
  public static final SubLInteger $int382$228 = makeInteger(228);
  public static final SubLString $str383$Meta_d = makeString("Meta-d");
  public static final SubLString $str384$m_d = makeString("m-d");
  public static final SubLInteger $int385$229 = makeInteger(229);
  public static final SubLString $str386$Meta_e = makeString("Meta-e");
  public static final SubLString $str387$m_e = makeString("m-e");
  public static final SubLInteger $int388$230 = makeInteger(230);
  public static final SubLString $str389$Meta_f = makeString("Meta-f");
  public static final SubLString $str390$m_f = makeString("m-f");
  public static final SubLInteger $int391$231 = makeInteger(231);
  public static final SubLString $str392$Meta_g = makeString("Meta-g");
  public static final SubLString $str393$m_g = makeString("m-g");
  public static final SubLInteger $int394$232 = makeInteger(232);
  public static final SubLString $str395$Meta_h = makeString("Meta-h");
  public static final SubLString $str396$m_h = makeString("m-h");
  public static final SubLInteger $int397$233 = makeInteger(233);
  public static final SubLString $str398$Meta_i = makeString("Meta-i");
  public static final SubLString $str399$m_i = makeString("m-i");
  public static final SubLInteger $int400$234 = makeInteger(234);
  public static final SubLString $str401$Meta_j = makeString("Meta-j");
  public static final SubLString $str402$m_j = makeString("m-j");
  public static final SubLInteger $int403$235 = makeInteger(235);
  public static final SubLString $str404$Meta_k = makeString("Meta-k");
  public static final SubLString $str405$m_k = makeString("m-k");
  public static final SubLInteger $int406$236 = makeInteger(236);
  public static final SubLString $str407$Meta_l = makeString("Meta-l");
  public static final SubLString $str408$m_l = makeString("m-l");
  public static final SubLInteger $int409$237 = makeInteger(237);
  public static final SubLString $str410$Meta_m = makeString("Meta-m");
  public static final SubLString $str411$m_m = makeString("m-m");
  public static final SubLInteger $int412$238 = makeInteger(238);
  public static final SubLString $str413$Meta_n = makeString("Meta-n");
  public static final SubLString $str414$m_n = makeString("m-n");
  public static final SubLInteger $int415$239 = makeInteger(239);
  public static final SubLString $str416$Meta_o = makeString("Meta-o");
  public static final SubLString $str417$m_o = makeString("m-o");
  public static final SubLInteger $int418$240 = makeInteger(240);
  public static final SubLString $str419$Meta_p = makeString("Meta-p");
  public static final SubLString $str420$m_p = makeString("m-p");
  public static final SubLInteger $int421$241 = makeInteger(241);
  public static final SubLString $str422$Meta_q = makeString("Meta-q");
  public static final SubLString $str423$m_q = makeString("m-q");
  public static final SubLInteger $int424$242 = makeInteger(242);
  public static final SubLString $str425$Meta_r = makeString("Meta-r");
  public static final SubLString $str426$m_r = makeString("m-r");
  public static final SubLInteger $int427$243 = makeInteger(243);
  public static final SubLString $str428$Meta_s = makeString("Meta-s");
  public static final SubLString $str429$m_s = makeString("m-s");
  public static final SubLInteger $int430$244 = makeInteger(244);
  public static final SubLString $str431$Meta_t = makeString("Meta-t");
  public static final SubLString $str432$m_t = makeString("m-t");
  public static final SubLInteger $int433$245 = makeInteger(245);
  public static final SubLString $str434$Meta_u = makeString("Meta-u");
  public static final SubLString $str435$m_u = makeString("m-u");
  public static final SubLInteger $int436$246 = makeInteger(246);
  public static final SubLString $str437$Meta_v = makeString("Meta-v");
  public static final SubLString $str438$m_v = makeString("m-v");
  public static final SubLInteger $int439$247 = makeInteger(247);
  public static final SubLString $str440$Meta_w = makeString("Meta-w");
  public static final SubLString $str441$m_w = makeString("m-w");
  public static final SubLInteger $int442$248 = makeInteger(248);
  public static final SubLString $str443$Meta_x = makeString("Meta-x");
  public static final SubLString $str444$m_x = makeString("m-x");
  public static final SubLInteger $int445$249 = makeInteger(249);
  public static final SubLString $str446$Meta_y = makeString("Meta-y");
  public static final SubLString $str447$m_y = makeString("m-y");
  public static final SubLInteger $int448$250 = makeInteger(250);
  public static final SubLString $str449$Meta_z = makeString("Meta-z");
  public static final SubLString $str450$m_z = makeString("m-z");
  public static final SubLInteger $int451$251 = makeInteger(251);
  public static final SubLString $str452$Meta__ = makeString("Meta-{");
  public static final SubLString $str453$m__ = makeString("m-{");
  public static final SubLInteger $int454$252 = makeInteger(252);
  public static final SubLString $str455$Meta__ = makeString("Meta-|");
  public static final SubLString $str456$m__ = makeString("m-|");
  public static final SubLInteger $int457$253 = makeInteger(253);
  public static final SubLString $str458$Meta__ = makeString("Meta-}");
  public static final SubLString $str459$m__ = makeString("m-}");
  public static final SubLInteger $int460$254 = makeInteger(254);
  public static final SubLString $str461$Meta__ = makeString("Meta-~");
  public static final SubLString $str462$m__ = makeString("m-~");
  public static final SubLInteger $int463$255 = makeInteger(255);
  public static final SubLString $str464$Meta_Rubout = makeString("Meta-Rubout");
  public static final SubLString $str465$m_Rubout = makeString("m-Rubout");

  //// Initializers

  public void declareFunctions() {
    declare_character_names_file();
  }

  public void initializeVariables() {
    init_character_names_file();
  }

  public void runTopLevelForms() {
    setup_character_names_file();
  }

}

package com.cyc.cycjava.cycl.inference;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class inference_pad_data extends SubLTranslatedFile {
    public static SubLFile me;
    public static String myFingerPrint = "edb308e68fb63d1c59a2f2a741ccc13aa721e89a8a5ab1e042b24d91ee28e197";
    @SubL(source = "cycl/inference/inference-pad-data.lisp", position = 800L)
    public static SubLSymbol $non_tkb_final_bogomips$;
    @SubL(source = "cycl/inference/inference-pad-data.lisp", position = 900L)
    public static SubLSymbol $non_tkb_final_times_to_first_answer$;
    private static SubLSymbol $sym0$_NON_TKB_FINAL_BOGOMIPS_;
    private static SubLFloat $float$4154_98;
    private static SubLSymbol $sym2$_NON_TKB_FINAL_TIMES_TO_FIRST_ANSWER_;
    private static SubLObject $list3;

    public static SubLObject declare_inference_pad_data_file() {
        return NIL;
    }

    public static SubLObject init_inference_pad_data_file() {
        $non_tkb_final_bogomips$ = deflexical("*NON-TKB-FINAL-BOGOMIPS*", (maybeDefault($sym0$_NON_TKB_FINAL_BOGOMIPS_, $non_tkb_final_bogomips$, $float$4154_98)));
        $non_tkb_final_times_to_first_answer$ = deflexical("*NON-TKB-FINAL-TIMES-TO-FIRST-ANSWER*", maybeDefault($sym2$_NON_TKB_FINAL_TIMES_TO_FIRST_ANSWER_, $non_tkb_final_times_to_first_answer$, $list3));
        return NIL;
    }

    public static SubLObject setup_inference_pad_data_file() {
        subl_macro_promotions.declare_defglobal($sym0$_NON_TKB_FINAL_BOGOMIPS_);
        subl_macro_promotions.declare_defglobal($sym2$_NON_TKB_FINAL_TIMES_TO_FIRST_ANSWER_);
        return NIL;
    }

    private static SubLObject _constant_3_initializer() {
        return list(new SubLObject[] { makeDouble(0.001253), makeDouble(0.001271), makeDouble(0.001362), makeDouble(0.001382), makeDouble(0.001429), makeDouble(0.001499), makeDouble(0.001568), makeDouble(0.001584), makeDouble(0.001746), makeDouble(0.001807), makeDouble(0.001811),
                makeDouble(0.001855), makeDouble(0.001873), makeDouble(0.001888), makeDouble(0.001895), makeDouble(0.002067), makeDouble(0.002071), makeDouble(0.002081), makeDouble(0.002113), makeDouble(0.002174), makeDouble(0.002221), makeDouble(0.002236), makeDouble(0.002268),
                makeDouble(0.002305), makeDouble(0.002349), makeDouble(0.002386), makeDouble(0.002485), makeDouble(0.002521), makeDouble(0.002534), makeDouble(0.002591), makeDouble(0.002591), makeDouble(0.002596), makeDouble(0.00261), makeDouble(0.002711), makeDouble(0.002733), makeDouble(0.002775),
                makeDouble(0.002822), makeDouble(0.002843), makeDouble(0.002876), makeDouble(0.0028770000000000002), makeDouble(0.00288), makeDouble(0.002899), makeDouble(0.002975), makeDouble(0.002984), makeDouble(0.003187), makeDouble(0.00319), makeDouble(0.003237), makeDouble(0.003247),
                makeDouble(0.003272), makeDouble(0.003286), makeDouble(0.003318), makeDouble(0.003346), makeDouble(0.003351), makeDouble(0.003371), makeDouble(0.003386), makeDouble(0.003475), makeDouble(0.003529), makeDouble(0.003552), makeDouble(0.003557), makeDouble(0.003578),
                makeDouble(0.003611), makeDouble(0.00365), makeDouble(0.003722), makeDouble(0.003723), makeDouble(0.003768), makeDouble(0.003799), makeDouble(0.003803), makeDouble(0.003845), makeDouble(0.003856), makeDouble(0.003876), makeDouble(0.00392), makeDouble(0.004066), makeDouble(0.004085),
                makeDouble(0.004092), makeDouble(0.004103), makeDouble(0.004116), makeDouble(0.004125), makeDouble(0.004128), makeDouble(0.004134), makeDouble(0.004183), makeDouble(0.004185), makeDouble(0.004189), makeDouble(0.004197), makeDouble(0.004199), makeDouble(0.004236),
                makeDouble(0.004261), makeDouble(0.004266), makeDouble(0.004307), makeDouble(0.004333), makeDouble(0.004341), makeDouble(0.00438), makeDouble(0.004399), makeDouble(0.004427), makeDouble(0.004435), makeDouble(0.004451), makeDouble(0.004504), makeDouble(0.004505), makeDouble(0.004513),
                makeDouble(0.004606), makeDouble(0.004653), makeDouble(0.004674), makeDouble(0.004708), makeDouble(0.00471), makeDouble(0.004764), makeDouble(0.004809), makeDouble(0.004839), makeDouble(0.004865), makeDouble(0.004916), makeDouble(0.004962), makeDouble(0.004974), makeDouble(0.004985),
                makeDouble(0.00499), makeDouble(0.005046), makeDouble(0.005169), makeDouble(0.005178), makeDouble(0.005185), makeDouble(0.005194), makeDouble(0.005211), makeDouble(0.005253), makeDouble(0.005259), makeDouble(0.00526), makeDouble(0.005347), makeDouble(0.005505), makeDouble(0.005602),
                makeDouble(0.005688), makeDouble(0.005735), makeDouble(0.00578), makeDouble(0.005966), makeDouble(0.005988), makeDouble(0.006201), makeDouble(0.006328), makeDouble(0.006377), makeDouble(0.006392), makeDouble(0.006431), makeDouble(0.006695), makeDouble(0.00671), makeDouble(0.006792),
                makeDouble(0.007069), makeDouble(0.007156), makeDouble(0.007377), makeDouble(0.00751), makeDouble(0.007534), makeDouble(0.007556), makeDouble(0.007576), makeDouble(0.007641), makeDouble(0.007661), makeDouble(0.007661), makeDouble(0.00769), makeDouble(0.0077), makeDouble(0.007705),
                makeDouble(0.007732), makeDouble(0.007799), makeDouble(0.00783), makeDouble(0.007848), makeDouble(0.007852), makeDouble(0.007869), makeDouble(0.007877), makeDouble(0.007935), makeDouble(0.007981), makeDouble(0.008093), makeDouble(0.008277), makeDouble(0.008389), makeDouble(0.008483),
                makeDouble(0.008645), makeDouble(0.008662), makeDouble(0.008673), makeDouble(0.008894), makeDouble(0.008923), makeDouble(0.008939), makeDouble(0.008956), makeDouble(0.008987), makeDouble(0.00902), makeDouble(0.009084), makeDouble(0.009186), makeDouble(0.009311), makeDouble(0.009434),
                makeDouble(0.009763), makeDouble(0.009796), makeDouble(0.009805), makeDouble(0.00982), makeDouble(0.009897), makeDouble(0.009993), makeDouble(0.010266), makeDouble(0.010292), makeDouble(0.010318), makeDouble(0.010472), makeDouble(0.010507), makeDouble(0.010648), makeDouble(0.010691),
                makeDouble(0.010742), makeDouble(0.010788), makeDouble(0.0108), makeDouble(0.010813), makeDouble(0.010843), makeDouble(0.011096), makeDouble(0.011107), makeDouble(0.011273), makeDouble(0.011285), makeDouble(0.01142), makeDouble(0.011426), makeDouble(0.011456), makeDouble(0.011481),
                makeDouble(0.011558), makeDouble(0.011611), makeDouble(0.011665), makeDouble(0.011691), makeDouble(0.011713), makeDouble(0.012101), makeDouble(0.012126), makeDouble(0.012154), makeDouble(0.012407), makeDouble(0.012493), makeDouble(0.012508), makeDouble(0.012521),
                makeDouble(0.012595), makeDouble(0.012636), makeDouble(0.012655), makeDouble(0.012828), makeDouble(0.01283), makeDouble(0.012844), makeDouble(0.012886), makeDouble(0.012925), makeDouble(0.012945), makeDouble(0.013266), makeDouble(0.013396), makeDouble(0.013455), makeDouble(0.013469),
                makeDouble(0.013606), makeDouble(0.013635), makeDouble(0.01368), makeDouble(0.013708), makeDouble(0.013722), makeDouble(0.013776), makeDouble(0.013793), makeDouble(0.013827), makeDouble(0.013849), makeDouble(0.013971), makeDouble(0.014025), makeDouble(0.014056), makeDouble(0.014197),
                makeDouble(0.014533), makeDouble(0.014533), makeDouble(0.014561), makeDouble(0.014689), makeDouble(0.014702), makeDouble(0.014792), makeDouble(0.014996), makeDouble(0.015031), makeDouble(0.015032), makeDouble(0.015431), makeDouble(0.015463), makeDouble(0.015621),
                makeDouble(0.015706), makeDouble(0.015867), makeDouble(0.016), makeDouble(0.016018), makeDouble(0.016027), makeDouble(0.01618), makeDouble(0.016217), makeDouble(0.016312), makeDouble(0.016363), makeDouble(0.016378), makeDouble(0.016576), makeDouble(0.016616), makeDouble(0.016975),
                makeDouble(0.016992), makeDouble(0.016993), makeDouble(0.017117), makeDouble(0.017239), makeDouble(0.017277), makeDouble(0.017318), makeDouble(0.017355), makeDouble(0.017523), makeDouble(0.017531), makeDouble(0.017676), makeDouble(0.017756), makeDouble(0.017765),
                makeDouble(0.017783), makeDouble(0.017806), makeDouble(0.01809), makeDouble(0.018169), makeDouble(0.018176), makeDouble(0.018295), makeDouble(0.018305), makeDouble(0.018332), makeDouble(0.01839), makeDouble(0.018474), makeDouble(0.018492), makeDouble(0.018601), makeDouble(0.018656),
                makeDouble(0.019033), makeDouble(0.019055), makeDouble(0.019131), makeDouble(0.019146), makeDouble(0.019201), makeDouble(0.019384), makeDouble(0.019386), makeDouble(0.019449), makeDouble(0.019464), makeDouble(0.019506), makeDouble(0.019532), makeDouble(0.019541),
                makeDouble(0.019565), makeDouble(0.019799), makeDouble(0.019846), makeDouble(0.019904), makeDouble(0.020011), makeDouble(0.020127), makeDouble(0.020139), makeDouble(0.02036), makeDouble(0.020853), makeDouble(0.021084), makeDouble(0.021232), makeDouble(0.021334), makeDouble(0.021815),
                makeDouble(0.021973), makeDouble(0.022026), makeDouble(0.022479), makeDouble(0.022629), makeDouble(0.022685), makeDouble(0.02274), makeDouble(0.022855), makeDouble(0.022981), makeDouble(0.023019), makeDouble(0.023144), makeDouble(0.023267), makeDouble(0.023309), makeDouble(0.02336),
                makeDouble(0.023397), makeDouble(0.02365), makeDouble(0.023852), makeDouble(0.024104), makeDouble(0.024155), makeDouble(0.024345), makeDouble(0.024407), makeDouble(0.024452), makeDouble(0.024571), makeDouble(0.024754), makeDouble(0.025176), makeDouble(0.025198), makeDouble(0.025215),
                makeDouble(0.025444), makeDouble(0.02583), makeDouble(0.025896), makeDouble(0.025984), makeDouble(0.02617), makeDouble(0.026424), makeDouble(0.026745), makeDouble(0.026809), makeDouble(0.026931), makeDouble(0.026966), makeDouble(0.027086), makeDouble(0.027347), makeDouble(0.028017),
                makeDouble(0.028046), makeDouble(0.028107), makeDouble(0.028458), makeDouble(0.028476), makeDouble(0.028574), makeDouble(0.028724), makeDouble(0.028746), makeDouble(0.028984), makeDouble(0.029157), makeDouble(0.029319), makeDouble(0.029414), makeDouble(0.029572),
                makeDouble(0.029598), makeDouble(0.030053), makeDouble(0.030304), makeDouble(0.030936), makeDouble(0.030954), makeDouble(0.031142), makeDouble(0.031507), makeDouble(0.031588), makeDouble(0.031723), makeDouble(0.032361), makeDouble(0.032505), makeDouble(0.032774), makeDouble(0.03283),
                makeDouble(0.033192), makeDouble(0.033356), makeDouble(0.033602), makeDouble(0.033634), makeDouble(0.03368), makeDouble(0.033776), makeDouble(0.033866), makeDouble(0.033935), makeDouble(0.03408), makeDouble(0.034164), makeDouble(0.034326), makeDouble(0.034624), makeDouble(0.034808),
                makeDouble(0.035522), makeDouble(0.035839), makeDouble(0.036604), makeDouble(0.036932), makeDouble(0.036946), makeDouble(0.036982), makeDouble(0.036984), makeDouble(0.037221), makeDouble(0.03724), makeDouble(0.037391), makeDouble(0.037973), makeDouble(0.038906), makeDouble(0.038947),
                makeDouble(0.038991), makeDouble(0.039062), makeDouble(0.039116), makeDouble(0.039206), makeDouble(0.039484), makeDouble(0.039576), makeDouble(0.039582), makeDouble(0.03993), makeDouble(0.040082), makeDouble(0.040223), makeDouble(0.04035), makeDouble(0.040473), makeDouble(0.040758),
                makeDouble(0.040867), makeDouble(0.041908), makeDouble(0.04262), makeDouble(0.042783), makeDouble(0.043121), makeDouble(0.04362), makeDouble(0.043752), makeDouble(0.043912), makeDouble(0.044209), makeDouble(0.044899), makeDouble(0.044981), makeDouble(0.045007), makeDouble(0.045436),
                makeDouble(0.045735), makeDouble(0.046172), makeDouble(0.046229), makeDouble(0.04683), makeDouble(0.047066), makeDouble(0.047491), makeDouble(0.048171), makeDouble(0.048333), makeDouble(0.048691), makeDouble(0.048749), makeDouble(0.048831), makeDouble(0.048904), makeDouble(0.048917),
                makeDouble(0.049), makeDouble(0.049169), makeDouble(0.049172), makeDouble(0.050861), makeDouble(0.052224), makeDouble(0.052497), makeDouble(0.052665), makeDouble(0.052892), makeDouble(0.053276), makeDouble(0.053776), makeDouble(0.053801), makeDouble(0.054636), makeDouble(0.055239),
                makeDouble(0.05526), makeDouble(0.055403), makeDouble(0.05604), makeDouble(0.056276), makeDouble(0.056426), makeDouble(0.057111), makeDouble(0.057538), makeDouble(0.057657), makeDouble(0.058604), makeDouble(0.058968), makeDouble(0.059091), makeDouble(0.059703), makeDouble(0.059793),
                makeDouble(0.061171), makeDouble(0.061548), makeDouble(0.062145), makeDouble(0.062392), makeDouble(0.062592), makeDouble(0.062649), makeDouble(0.063287), makeDouble(0.063881), makeDouble(0.063899), makeDouble(0.064062), makeDouble(0.064561), makeDouble(0.064983),
                makeDouble(0.065328), makeDouble(0.065425), makeDouble(0.065825), makeDouble(0.065886), makeDouble(0.06697), makeDouble(0.067746), makeDouble(0.067789), makeDouble(0.068537), makeDouble(0.068691), makeDouble(0.069125), makeDouble(0.069175), makeDouble(0.069307), makeDouble(0.069726),
                makeDouble(0.070482), makeDouble(0.072083), makeDouble(0.072281), makeDouble(0.072463), makeDouble(0.072788), makeDouble(0.072789), makeDouble(0.072884), makeDouble(0.073436), makeDouble(0.074024), makeDouble(0.074873), makeDouble(0.075044), makeDouble(0.075453),
                makeDouble(0.075767), makeDouble(0.076406), makeDouble(0.07643), makeDouble(0.076512), makeDouble(0.076625), makeDouble(0.07704), makeDouble(0.077407), makeDouble(0.077962), makeDouble(0.078798), makeDouble(0.078905), makeDouble(0.078948), makeDouble(0.079287), makeDouble(0.079472),
                makeDouble(0.081104), makeDouble(0.08114), makeDouble(0.081278), makeDouble(0.081639), makeDouble(0.083355), makeDouble(0.08478), makeDouble(0.085081), makeDouble(0.085111), makeDouble(0.085183), makeDouble(0.085269), makeDouble(0.086795), makeDouble(0.086951), makeDouble(0.087247),
                makeDouble(0.088209), makeDouble(0.089181), makeDouble(0.090099), makeDouble(0.090393), makeDouble(0.090639), makeDouble(0.090866), makeDouble(0.091006), makeDouble(0.091112), makeDouble(0.091144), makeDouble(0.092651), makeDouble(0.092666), makeDouble(0.09281), makeDouble(0.093031),
                makeDouble(0.093168), makeDouble(0.093365), makeDouble(0.094139), makeDouble(0.094649), makeDouble(0.095733), makeDouble(0.096948), makeDouble(0.097295), makeDouble(0.097346), makeDouble(0.097547), makeDouble(0.098735), makeDouble(0.098862), makeDouble(0.099313),
                makeDouble(0.099896), makeDouble(0.100574), makeDouble(0.100796), makeDouble(0.101025), makeDouble(0.101262), makeDouble(0.10226), makeDouble(0.102513), makeDouble(0.102578), makeDouble(0.102617), makeDouble(0.104298), makeDouble(0.10439), makeDouble(0.10497), makeDouble(0.105104),
                makeDouble(0.105825), makeDouble(0.106427), makeDouble(0.106619), makeDouble(0.108642), makeDouble(0.109356), makeDouble(0.109365), makeDouble(0.110273), makeDouble(0.113306), makeDouble(0.113398), makeDouble(0.113607), makeDouble(0.11388), makeDouble(0.113954), makeDouble(0.114904),
                makeDouble(0.115989), makeDouble(0.116234), makeDouble(0.116742), makeDouble(0.119536), makeDouble(0.120123), makeDouble(0.120241), makeDouble(0.12064), makeDouble(0.12079), makeDouble(0.120851), makeDouble(0.124271), makeDouble(0.12549), makeDouble(0.125958), makeDouble(0.126098),
                makeDouble(0.127961), makeDouble(0.128096), makeDouble(0.128836), makeDouble(0.12907), makeDouble(0.129422), makeDouble(0.129524), makeDouble(0.131011), makeDouble(0.132548), makeDouble(0.132835), makeDouble(0.132844), makeDouble(0.133222), makeDouble(0.134004), makeDouble(0.138735),
                makeDouble(0.138862), makeDouble(0.139465), makeDouble(0.140441), makeDouble(0.140955), makeDouble(0.141997), makeDouble(0.142762), makeDouble(0.144033), makeDouble(0.144669), makeDouble(0.146012), makeDouble(0.146545), makeDouble(0.146685), makeDouble(0.147115),
                makeDouble(0.148379), makeDouble(0.148777), makeDouble(0.149134), makeDouble(0.1498), makeDouble(0.151917), makeDouble(0.152136), makeDouble(0.152279), makeDouble(0.152888), makeDouble(0.153174), makeDouble(0.154661), makeDouble(0.156727), makeDouble(0.157677), makeDouble(0.157825),
                makeDouble(0.157828), makeDouble(0.158871), makeDouble(0.159016), makeDouble(0.160208), makeDouble(0.160674), makeDouble(0.160885), makeDouble(0.16366), makeDouble(0.16623), makeDouble(0.166988), makeDouble(0.167399), makeDouble(0.1681), makeDouble(0.168864), makeDouble(0.170252),
                makeDouble(0.170581), makeDouble(0.171296), makeDouble(0.172459), makeDouble(0.173155), makeDouble(0.173283), makeDouble(0.173369), makeDouble(0.17351), makeDouble(0.173544), makeDouble(0.17775), makeDouble(0.178104), makeDouble(0.178543), makeDouble(0.179855), makeDouble(0.180201),
                makeDouble(0.183133), makeDouble(0.18334), makeDouble(0.185197), makeDouble(0.186963), makeDouble(0.188124), makeDouble(0.18865), makeDouble(0.188754), makeDouble(0.190002), makeDouble(0.190344), makeDouble(0.192152), makeDouble(0.192732), makeDouble(0.195114), makeDouble(0.195417),
                makeDouble(0.19633), makeDouble(0.198001), makeDouble(0.198306), makeDouble(0.198629), makeDouble(0.199012), makeDouble(0.199194), makeDouble(0.201481), makeDouble(0.202854), makeDouble(0.204136), makeDouble(0.204275), makeDouble(0.204996), makeDouble(0.20541), makeDouble(0.205929),
                makeDouble(0.206143), makeDouble(0.206829), makeDouble(0.208259), makeDouble(0.21062), makeDouble(0.211692), makeDouble(0.211896), makeDouble(0.212181), makeDouble(0.212468), makeDouble(0.215832), makeDouble(0.215971), makeDouble(0.216328), makeDouble(0.219282), makeDouble(0.219348),
                makeDouble(0.220283), makeDouble(0.220662), makeDouble(0.221872), makeDouble(0.221874), makeDouble(0.222715), makeDouble(0.222741), makeDouble(0.223129), makeDouble(0.223129), makeDouble(0.224958), makeDouble(0.227102), makeDouble(0.228307), makeDouble(0.229353),
                makeDouble(0.231029), makeDouble(0.232558), makeDouble(0.235366), makeDouble(0.2358), makeDouble(0.238445), makeDouble(0.23933), makeDouble(0.239357), makeDouble(0.24154), makeDouble(0.243474), makeDouble(0.244904), makeDouble(0.246606), makeDouble(0.247449), makeDouble(0.248101),
                makeDouble(0.249635), makeDouble(0.249685), makeDouble(0.250431), makeDouble(0.250874), makeDouble(0.253004), makeDouble(0.253313), makeDouble(0.253486), makeDouble(0.254076), makeDouble(0.256724), makeDouble(0.257254), makeDouble(0.260284), makeDouble(0.261659),
                makeDouble(0.264556), makeDouble(0.267363), makeDouble(0.26821), makeDouble(0.269314), makeDouble(0.2695), makeDouble(0.270001), makeDouble(0.278103), makeDouble(0.278405), makeDouble(0.280468), makeDouble(0.280719), makeDouble(0.282193), makeDouble(0.283705), makeDouble(0.283705),
                makeDouble(0.285083), makeDouble(0.28549), makeDouble(0.28861), makeDouble(0.289271), makeDouble(0.292748), makeDouble(0.296171), makeDouble(0.298273), makeDouble(0.300097), makeDouble(0.302535), makeDouble(0.303438), makeDouble(0.30437), makeDouble(0.304412), makeDouble(0.304909),
                makeDouble(0.30685), makeDouble(0.308114), makeDouble(0.309499), makeDouble(0.31011), makeDouble(0.31166), makeDouble(0.312734), makeDouble(0.313393), makeDouble(0.313436), makeDouble(0.316165), makeDouble(0.321512), makeDouble(0.322105), makeDouble(0.325804), makeDouble(0.32623),
                makeDouble(0.326466), makeDouble(0.329456), makeDouble(0.334751), makeDouble(0.337251), makeDouble(0.340311), makeDouble(0.341117), makeDouble(0.342206), makeDouble(0.3441), makeDouble(0.344434), makeDouble(0.345682), makeDouble(0.351094), makeDouble(0.353345), makeDouble(0.356042),
                makeDouble(0.359336), makeDouble(0.362106), makeDouble(0.362556), makeDouble(0.3666), makeDouble(0.367816), makeDouble(0.370272), makeDouble(0.371013), makeDouble(0.371513), makeDouble(0.372527), makeDouble(0.374096), makeDouble(0.374584), makeDouble(0.374837), makeDouble(0.37535),
                makeDouble(0.376534), makeDouble(0.377437), makeDouble(0.378759), makeDouble(0.379296), makeDouble(0.379681), makeDouble(0.3842), makeDouble(0.388329), makeDouble(0.388453), makeDouble(0.389214), makeDouble(0.391923), makeDouble(0.392315), makeDouble(0.395069), makeDouble(0.395116),
                makeDouble(0.399055), makeDouble(0.39976), makeDouble(0.400379), makeDouble(0.40465), makeDouble(0.405519), makeDouble(0.406212), makeDouble(0.407712), makeDouble(0.410976), makeDouble(0.412315), makeDouble(0.414377), makeDouble(0.414657), makeDouble(0.430773), makeDouble(0.432798),
                makeDouble(0.432867), makeDouble(0.437282), makeDouble(0.44484), makeDouble(0.445016), makeDouble(0.456827), makeDouble(0.459546), makeDouble(0.460303), makeDouble(0.460525), makeDouble(0.475907), makeDouble(0.477307), makeDouble(0.479969), makeDouble(0.48737), makeDouble(0.494207),
                makeDouble(0.49506), makeDouble(0.49613), makeDouble(0.497467), makeDouble(0.50551), makeDouble(0.506462), makeDouble(0.506919), makeDouble(0.519746), makeDouble(0.524009), makeDouble(0.524509), makeDouble(0.531776), makeDouble(0.538312), makeDouble(0.540532), makeDouble(0.543793),
                makeDouble(0.546165), makeDouble(0.549341), makeDouble(0.560812), makeDouble(0.561658), makeDouble(0.566083), makeDouble(0.574537), makeDouble(0.577418), makeDouble(0.577491), makeDouble(0.579816), makeDouble(0.592327), makeDouble(0.596374), makeDouble(0.597488),
                makeDouble(0.600169), makeDouble(0.602352), makeDouble(0.611165), makeDouble(0.614), makeDouble(0.616982), makeDouble(0.627761), makeDouble(0.63443), makeDouble(0.637636), makeDouble(0.648466), makeDouble(0.649069), makeDouble(0.651301), makeDouble(0.651506), makeDouble(0.656602),
                makeDouble(0.662662), makeDouble(0.665876), makeDouble(0.670614), makeDouble(0.674753), makeDouble(0.681727), makeDouble(0.683921), makeDouble(0.685115), makeDouble(0.6869), makeDouble(0.701745), makeDouble(0.704798), makeDouble(0.704799), makeDouble(0.706058), makeDouble(0.707587),
                makeDouble(0.71912), makeDouble(0.723119), makeDouble(0.724434), makeDouble(0.736299), makeDouble(0.739691), makeDouble(0.757797), makeDouble(0.761272), makeDouble(0.770181), makeDouble(0.777919), makeDouble(0.801818), makeDouble(0.801849), makeDouble(0.801967), makeDouble(0.811329),
                makeDouble(0.814516), makeDouble(0.823941), makeDouble(0.831464), makeDouble(0.83881), makeDouble(0.856735), makeDouble(0.866958), makeDouble(0.884979), makeDouble(0.892456), makeDouble(0.898731), makeDouble(0.904491), makeDouble(0.915554), makeDouble(0.926316), makeDouble(0.932673),
                makeDouble(0.938018), makeDouble(0.958451), makeDouble(0.99501), makeDouble(0.995141), makeDouble(0.995918), makeDouble(1.017673), makeDouble(1.046358), makeDouble(1.048207), makeDouble(1.068659), makeDouble(1.076451), makeDouble(1.152786), makeDouble(1.183104), makeDouble(1.19463),
                makeDouble(1.199645), makeDouble(1.240456), makeDouble(1.244124), makeDouble(1.252815), makeDouble(1.261306), makeDouble(1.262906), makeDouble(1.281272), makeDouble(1.292945), makeDouble(1.319186), makeDouble(1.358602), makeDouble(1.366061), makeDouble(1.395313),
                makeDouble(1.410447), makeDouble(1.418221), makeDouble(1.418492), makeDouble(1.430937), makeDouble(1.43365), makeDouble(1.472025), makeDouble(1.475239), makeDouble(1.484856), makeDouble(1.505241), makeDouble(1.52443), makeDouble(1.534334), makeDouble(1.549398), makeDouble(1.551318),
                makeDouble(1.581277), makeDouble(1.582809), makeDouble(1.591665), makeDouble(1.592098), makeDouble(1.612764), makeDouble(1.638449), makeDouble(1.656537), makeDouble(1.66209), makeDouble(1.662134), makeDouble(1.674129), makeDouble(1.686604), makeDouble(1.717165), makeDouble(1.736409),
                makeDouble(1.740566), makeDouble(1.741807), makeDouble(1.770332), makeDouble(1.802069), makeDouble(1.805915), makeDouble(1.840081), makeDouble(1.865819), makeDouble(1.869015), makeDouble(1.872642), makeDouble(1.882651), makeDouble(1.885509), makeDouble(1.886012),
                makeDouble(1.909147), makeDouble(1.91954), makeDouble(1.932786), makeDouble(1.93402), makeDouble(1.962458), makeDouble(1.986768), makeDouble(1.992682), makeDouble(2.005802), makeDouble(2.030199), makeDouble(2.050329), makeDouble(2.078929), makeDouble(2.086408), makeDouble(2.098323),
                makeDouble(2.113591), makeDouble(2.115447), makeDouble(2.184767), makeDouble(2.193379), makeDouble(2.214683), makeDouble(2.243564), makeDouble(2.245944), makeDouble(2.252965), makeDouble(2.300288), makeDouble(2.359126), makeDouble(2.374502), makeDouble(2.384798),
                makeDouble(2.408986), makeDouble(2.435532), makeDouble(2.486498), makeDouble(2.515804), makeDouble(2.530822), makeDouble(2.546189), makeDouble(2.550937), makeDouble(2.551864), makeDouble(2.576868), makeDouble(2.6072), makeDouble(2.623705), makeDouble(2.6243), makeDouble(2.628408),
                makeDouble(2.649363), makeDouble(2.697248), makeDouble(2.73937), makeDouble(2.755825), makeDouble(2.782365), makeDouble(2.846056), makeDouble(2.90652), makeDouble(2.97149), makeDouble(2.973858), makeDouble(3.015944), makeDouble(3.029829), makeDouble(3.039108), makeDouble(3.078922),
                makeDouble(3.096307), makeDouble(3.146206), makeDouble(3.290194), makeDouble(3.297601), makeDouble(3.390755), makeDouble(3.554836), makeDouble(3.568247), makeDouble(3.607552), makeDouble(3.630217), makeDouble(3.630238), makeDouble(3.662482), makeDouble(3.701821),
                makeDouble(3.714429), makeDouble(3.969771), makeDouble(4.066063), makeDouble(4.12829), makeDouble(4.177313), makeDouble(4.299397), makeDouble(4.464404), makeDouble(4.469866), makeDouble(4.577348), makeDouble(4.581241), makeDouble(4.653243), makeDouble(4.658221), makeDouble(4.660248),
                makeDouble(4.666153), makeDouble(4.698445), makeDouble(4.701281), makeDouble(4.706387), makeDouble(4.709175), makeDouble(4.954635), makeDouble(5.02181), makeDouble(5.035694), makeDouble(5.079948), makeDouble(5.105123), makeDouble(5.165453), makeDouble(5.411432), makeDouble(5.562745),
                makeDouble(5.637306), makeDouble(5.741018), makeDouble(5.801075), makeDouble(5.844348), makeDouble(5.887182), makeDouble(5.988883), makeDouble(6.213321), makeDouble(6.27453), makeDouble(6.37269), makeDouble(6.4358), makeDouble(6.554637), makeDouble(6.572418), makeDouble(6.721388),
                makeDouble(6.991455), makeDouble(7.055765), makeDouble(7.234047), makeDouble(7.249135), makeDouble(7.538868), makeDouble(7.674709), makeDouble(7.724114), makeDouble(7.794346), makeDouble(7.837689), makeDouble(8.067334), makeDouble(8.108047), makeDouble(8.148057),
                makeDouble(8.194967), makeDouble(8.499748), makeDouble(9.590609), makeDouble(9.766831), makeDouble(9.958357), makeDouble(10.017567), makeDouble(10.463923), makeDouble(10.653814), makeDouble(10.781989), makeDouble(11.599709), makeDouble(11.779958), makeDouble(12.029558),
                makeDouble(12.696511), makeDouble(12.890138), makeDouble(13.701445), makeDouble(13.721473), makeDouble(13.747041), makeDouble(14.110866), makeDouble(14.82907), makeDouble(16.7527), makeDouble(18.836656), makeDouble(19.211343), makeDouble(19.22893), makeDouble(19.506583),
                makeDouble(20.150076), makeDouble(20.202295), makeDouble(21.072089), makeDouble(23.02171), makeDouble(23.563902), makeDouble(23.675959), makeDouble(23.776246), makeDouble(25.12341), makeDouble(25.269802), makeDouble(27.608266), makeDouble(28.795035), makeDouble(28.964394),
                makeDouble(29.037582), makeDouble(31.125591), makeDouble(31.964823), makeDouble(31.983031), makeDouble(32.35554), makeDouble(34.6747), makeDouble(40.122383), makeDouble(42.322705), makeDouble(76.812387), makeDouble(81.955282), makeDouble(86.509207), makeDouble(94.826582),
                makeDouble(102.879515), makeDouble(104.460918), makeDouble(104.806436), makeDouble(106.822821), makeDouble(106.993683), makeDouble(149.756047), makeDouble(210.258082), makeDouble(224.892459), makeDouble(228.877728), makeDouble(346.691613) });
    }

    @Override
    public void declareFunctions() {
        declare_inference_pad_data_file();
    }

    @Override
    public void initializeVariables() {
        init_inference_pad_data_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_inference_pad_data_file();
    }

    static {
        me = new inference_pad_data();
        $non_tkb_final_bogomips$ = null;
        $non_tkb_final_times_to_first_answer$ = null;
        $sym0$_NON_TKB_FINAL_BOGOMIPS_ = makeSymbol("*NON-TKB-FINAL-BOGOMIPS*");
        $float$4154_98 = makeDouble(4154.98);
        $sym2$_NON_TKB_FINAL_TIMES_TO_FIRST_ANSWER_ = makeSymbol("*NON-TKB-FINAL-TIMES-TO-FIRST-ANSWER*");
        $list3 = _constant_3_initializer();
    }
}
/*
 *
 * Total time: 861 ms
 *
 */
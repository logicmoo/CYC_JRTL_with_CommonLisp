package org.appdapter.core.matdat;

import scala.collection.mutable.StringBuilder;
import org.appdapter.core.name.Ident;
import org.appdapter.impl.store.FancyRepo;
import java.util.List;
import java.util.Set;
import org.appdapter.help.repo.RepoClient;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "u!BY*fa>E.[3oiR+7^3s\tA!nCR$\r\tAaY8sK*qC\nCBH-9uKJT!C_J<7\t5iA\tA\ta%xn7jK:$H+Z:uKJ\"!\tE!R\"\nM\tQa]2bYL!!\n\rsPU3g9R\"aN\\5u}Q\t1C\tIQA'Q+5V0SB{ul%FR{6*R-qy!H=a':CU.u1i:$G\tZ:WZC%\f5W%\"3U\t+Ck5;nR2X\r6,wiA5Q)Q+5V0SB{ul%FR{6*R-!SB1A\r\n$M)~s)T#T!UiX*I#vLT+N+!s\"A%AaaJ!!!#GR{f*Q'F'B5)R0T+Ek(VBq!KC!&\rE\r2#v\fR%S#vJU-`'\"+U\tV0O+6+aK\bYu\t/iaK\tcEk#J%Ek*Z?NCU)+`VkC1\tIQA33E\nV0T\t\n{&+)P?{eJR%H?BESeA1Oi)QGNYtwMC8QM^1\ne\"$AB*ue&tw\r<iAM\tcEkX*E~V\tU(`>se)S$`!#\n\t\b{5\r\"?\"e\t+`'uLU#Q~uJ$J~E*Q*T?2{\tR#S+yCAA\t\tEGADY8T8bI\bBB\"A%q(E\r2#vl#C?J+kT0D:3jR0D6k'P+%\t\b6\r\"25an5ugF+XM]=R\"1q)Q\nI\na\\5hQR+^3ssFsCJ\tIA1Lw\r;tJ\f[)OYU)AeqA.[4iiN<%/9i#:\"B'\tqD7bW$e\r;P'JF#A(1BA)Mye\\5oKNCW-;SKB|7]3dV\"Ui-8UCCA\tW\t9&CV]&$\b\"B-SQB1sON2!E.^\ta&CABeJ\f_C:cXAJ\ta:fI4BAc\t'CeQ-\bnC.,'+9p2LWM;\ttP\tO2lS*\fAA]3q_*1NBQd/nQ\nQ!+9p2LWM;\t=9\bCA9w(BA:uHo:f\t)h!j[BdBA<s%1M\\2z%xCzGQ,\nrkV1sO$h+:OC6,\"B>diD9vKJL8[3fiFseB?y!bQ8n[tGMU3d'\ta\bq)!C\tQaY7e+\"!!\tQBQ1!aq-\\3\n\t=,g'a(!Q\nAB2nI&#q)!C\tQAY8yC!\"a}BAw_%EA!Qq?%\t!a\rQnZ%E)\t BB%QA\biJLw-#!)\t9 BCF\tiJLwMR)DV\tQ\fC.q\t)A;IAO]5h\rFe\n\t/q$\t!!\rMqGAw\tiE6ql!\t\ty1!AqCA\t) =AA\t9#a\fAuCq!!}\t\n%u_N#(/8h)ibBA$JcV,'/_\"p[6\fgZ:\t-q\t\n&a\r=#bAA)m!Q^5m\t)&a\t1K7\b3\n)1g\t8\rC^5!\t!a)8/Z7cY.8oK2/Z2t)\t\t'!\r51MA4\t)'aM+GE4SJ1!a5y%M[3di\"9LA.1CA9\tIA4XM;Rk0(\tUT)AeiQM^3oiF+XM]=RB\"!%\t!M\rKZ,g^$sCBDK\b{j!35)g/8uJ\f[)OA!9Q\rE9vKJLJ2pq3XM;t)\r)Q\b3\ny\b1g")
public final class RepoClientTester
{
    public static void queryInboxEvents(final RepoClient rc) {
        RepoClientTester$.MODULE$.queryInboxEvents(rc);
    }
    
    public static String eventGraphQN() {
        return RepoClientTester$.MODULE$.eventGraphQN();
    }
    
    public static String eventQueryQN() {
        return RepoClientTester$.MODULE$.eventQueryQN();
    }
    
    public static Set<Object> assembleChannelSpecs(final RepoClient rc) {
        return RepoClientTester$.MODULE$.assembleChannelSpecs(rc);
    }
    
    public static List<CommandRec> queryCommands(final RepoClient rc) {
        return RepoClientTester$.MODULE$.queryCommands(rc);
    }
    
    public static RepoClient makeRepoClient(final FancyRepo fr, final String queryTargetVarName, final String querySheetQN) {
        return RepoClientTester$.MODULE$.makeRepoClient(fr, queryTargetVarName, querySheetQN);
    }
    
    public static void main(final String[] args) {
        RepoClientTester$.MODULE$.main(args);
    }
    
    public static OnlineSheetRepoSpec makeDfltOSRS() {
        return RepoClientTester$.MODULE$.makeDfltOSRS();
    }
    
    public static String lightsGraphQN() {
        return RepoClientTester$.MODULE$.lightsGraphQN();
    }
    
    public static String lightsQueryQN() {
        return RepoClientTester$.MODULE$.lightsQueryQN();
    }
    
    public static ClassLoader DFLT_SDB_REPO_CONFIG_CLASS_LOADER() {
        return RepoClientTester$.MODULE$.DFLT_SDB_REPO_CONFIG_CLASS_LOADER();
    }
    
    public static String DFLT_SDB_REPO_CONFIG_PATH() {
        return RepoClientTester$.MODULE$.DFLT_SDB_REPO_CONFIG_PATH();
    }
    
    public static int DFLT_DIRECTORY_SHEET_NUM() {
        return RepoClientTester$.MODULE$.DFLT_DIRECTORY_SHEET_NUM();
    }
    
    public static int DFLT_NAMESPACE_SHEET_NUM() {
        return RepoClientTester$.MODULE$.DFLT_NAMESPACE_SHEET_NUM();
    }
    
    public static String TEST_REPO_SHEET_KEY() {
        return RepoClientTester$.MODULE$.TEST_REPO_SHEET_KEY();
    }
    
    public static class CommandRec
    {
        private final Ident cmdID;
        private final Ident boxID;
        private final Ident trigID;
        private final String trigFQCN;
        
        public Ident cmdID() {
            return this.cmdID;
        }
        
        public Ident boxID() {
            return this.boxID;
        }
        
        public Ident trigID() {
            return this.trigID;
        }
        
        public String trigFQCN() {
            return this.trigFQCN;
        }
        
        @Override
        public String toString() {
            return new StringBuilder().append((Object)"[cmdID=").append((Object)this.cmdID()).append((Object)", boxID=").append((Object)this.boxID()).append((Object)", trigID=").append((Object)this.trigID()).append((Object)", trigFQCN=").append((Object)this.trigFQCN()).append((Object)"]").toString();
        }
        
        public CommandRec(final Ident cmdID, final Ident boxID, final Ident trigID, final String trigFQCN) {
            this.cmdID = cmdID;
            this.boxID = boxID;
            this.trigID = trigID;
            this.trigFQCN = trigFQCN;
        }
    }
}

/*

	Total time: 18 ms
	
*/
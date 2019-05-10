package org.appdapter.help.repo;

import java.util.Set;
import org.appdapter.core.store.InitialBinding;
import org.appdapter.core.name.Ident;
import org.appdapter.core.store.Repo;
import scala.reflect.ScalaSignature;
import org.appdapter.core.store.ModelClient;

@ScalaSignature(bytes = "baB!\r\na%xn7jK:$(BAX\r]815fYBT!a\bZ1qi(\"A=xmaA%5\taB!!A.8h\t6bmL!a\b\r='.Z2u!\t)\"$D\t9$Ati>XM\r!1m:f\tYbCAN_,Gn7jK:$\b\"B\rqaB4fiJ+o\\?Ae\t\b+J!A\t\f\tI+o\\IQbV5uQK'/Z2u_JL(B9A\")q\tX/:z:$N]3di{'/7m'>dW^5p]N$B!K6oA!fK%AF\r'>dW^5p]2K7]\raLcV,'/_'pId\nZ3oiBgMc)!G]lW-5c\t)\nZ3oi\")aG\na_Q/^3ss&#WM;\ta2AELe.;CS:$N\\4UQBA9Ie.;jC2N3j]DQa\nu\"B! K\")q\bay/^3ss6{G-7RlW\rB:!)R*\tA)AtGd-G1K]3eKL!S%\rM#(/8h\t15\tCLy)rk0(b[DQAeBQa\n9#2!K(QYU\n1AAT\n1:9A\"S)I3,\t-!\tU!M|G.Z*QJFj,O9101x\\3WCJLE-8u9A\"Z)I#l/\t-C!\tUC!\tuC!M|G.,beFs\"B\ryFcAaC\")1Ja\")!Ma_B/:hKR<%/9i,gO1\tS<\"4daB9vKJLKQ\rQix-;He\b.(\ta6%ZG.\\8\tL!\t\tLA\t9L!=$\b.:T!T0W\")/a_iq5feZ'/3f]RDQa\nI$R!K:ukZDQAZ9ACQ[9ACQA\\9ACQa^9A!b;iKJ4\r\\)OI\bA\"{5\nX/:z:$N]3di{'/7m'>dW^5p]N<5TiJLgn\"j]LgnSmdhCLq\tC~q)At_2,g+:OC6,\"B@yAC:pY4M,bY\"91AE7bWLe.;jC2N3j],!\baAAm\t7o]3nE2,'k\\8ugx.(b[$Wj3fYR!QBA\r!\ty!!\r\t\t\tBCA\tA!;jY&!qCA\t\rV\r\b7\t91099'/9ilW-3f]RDq!!\r\tybBA;\rQOJ\f[)OC6,")
public interface RepoClient extends ModelClient
{
    Repo.WithDirectory getRepo();
    
    SolutionList queryIndirectForAllSolutions(final Ident p0, final Ident p1, final InitialBinding p2);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final String p1, final InitialBinding p2);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final InitialBinding p1);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final String p1, final Ident p2);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final String p1, final String p2);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final Ident p1);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final String p1);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final Ident p1, final String p2, final Ident p3);
    
    SolutionList queryIndirectForAllSolutions(final String p0, final String p1, final String p2, final String p3);
    
    SolutionList queryIndirectForAllSolutionsWithStringBinding(final String p0, final String p1, final String p2);
    
    InitialBinding makeInitialBinding();
    
    Set<Object> assembleRootsFromNamedModel(final Ident p0);
    
    Set<Object> assembleRootsFromNamedModel(final String p0);
}

/*

	Total time: 7 ms
	
*/
package org.appdapter.help.repo;

import scala.collection.mutable.StringBuilder;
import com.hp.hpl.jena.rdf.model.Resource;
import org.appdapter.core.name.FreeIdent;
import org.appdapter.core.name.Ident;
import scala.Predef$;
import com.hp.hpl.jena.rdf.model.Literal;
import com.hp.hpl.jena.query.QuerySolution;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "e4A!\tA1k7vi&|gN\t!!/9p\t)a!iK2(BA\t%\t3baR,'OC\n\ry'oZ'\tA!5\taBC8-7b\t\tbBB]fVM\t')!C)9Q._)T_2tW#AY\tS\"A\faI!B9vKJL(BQWM\\1qia5qY*adHQBTIG>lB5\tV/:z'>dW^5p]\"AABB%Q#nsFv8!1\"(aN\\5u}QF\tSiA'\r!Y!\tFO$+^3ssN{G.;j_:DQA\f=\nab5fG.Vm];miZ'1gAQ\"Me9qAQ8pY\fgC5[Q'Aw]lW\r7s9QbNq9\ta:fI4B<FO]5oO*H{!\tAPO$H*;fed'+Z:vYR4M\"Q#S!AQ\"5|G-7Ka:eM&a)\b&$XM]1m!D\b16I\"KI9W\r^*ue&twMU3tk2$h+:UZ\"I)\"B'\tq!E4ficw.;SKN,H,beRqJ\tAK!!\bcw.;\tQbA\tQAA+%,GR8vE2,'+Z:vYR4M-f\"!D,\nas!A#pk\ndW\rC5'QC\\A,A\nhKRLe^3hKJVm];miZ'^KBalY?*-YYtwMCcQM^1\n|&aB%oi<WMii\r!O!\t[O$(i\\8mKt'+Z:vYR4Ma%DQ4AUBQa1\fcZ3u,g*fgVdGOV1s)\tiWog6\tqNqc!a.Y7f\th!d_J,B;pIE-8u!$169\b\"y!!xn;sS:<G#A")
public class Solution
{
    private final QuerySolution myQSoln;
    
    private QuerySolution myQSoln() {
        return this.myQSoln;
    }
    
    public QuerySolution getQuerySolution() {
        return this.myQSoln();
    }
    
    public boolean checkResultVar(final String vname) {
        return this.getQuerySolution().contains(vname);
    }
    
    public Literal getLiteralResultVar(final String vname) {
        return this.getQuerySolution().getLiteral(vname);
    }
    
    public String getStringResultVar(final String vname) {
        return this.getLiteralResultVar(vname).getString();
    }
    
    public float getFloatResultVar(final String vname) {
        return this.getLiteralResultVar(vname).getFloat();
    }
    
    public double getDoubleResultVar(final String vname) {
        return this.getLiteralResultVar(vname).getDouble();
    }
    
    public Integer getIntegerResultVar(final String vname) {
        return Predef$.MODULE$.int2Integer(this.getLiteralResultVar(vname).getInt());
    }
    
    public boolean getBooleanResultVar(final String vname) {
        return this.getLiteralResultVar(vname).getBoolean();
    }
    
    public Ident getIdentResultVar(final String vname) {
        final Resource res = this.getQuerySolution().getResource(vname);
        return (Ident)new FreeIdent(res.getURI(), res.getLocalName());
    }
    
    @Override
    public String toString() {
        return new StringBuilder().append((Object)"Solution[qSoln=").append((Object)this.myQSoln()).append((Object)"]").toString();
    }
    
    public Solution(final QuerySolution myQSoln) {
        this.myQSoln = myQSoln;
    }
}

/*

	Total time: 13 ms
	
*/
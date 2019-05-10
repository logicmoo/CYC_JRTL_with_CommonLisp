package SxxMachine.pterm;

import SxxMachine.Prolog;
import SxxMachine.Term;

class FrozenData {
    private Term goals = Prolog.True;
    private Term attrs = Prolog.Nil;

    public FrozenData() {
    }

    public Term getGoals() {
        return this.goals;
    }

    public Term setGoals(Term goals) {
        return this.goals = goals;
    }

    public Term getAttrs() {
        return this.attrs;
    }

    public void setAttrs(Term attrs) {
        this.attrs = attrs;
    }
}
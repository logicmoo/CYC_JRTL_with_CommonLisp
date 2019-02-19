append([],L,L) .
append([X|L1],L2,[X|L3]) :- append(L1,L2,L3) .

legacy_functor(P,'.',A):- functor(P,'[|]',A),!.
legacy_functor(P,F,A):- functor(P,F,A),!.

comp(File) :-   see(File) , file_name_extension(BName,_,File),    	
		InProg = [] ,
		readprogram(BName,InProg,Prog) ,!,
                seen, % close(File) ,
		makename(['tcomp_',BName],Dir),
		make_directory_path(Dir),!,
		gencode(Dir,Prog),!.

gencode(_,[]) .
gencode(Package,[Pred|Preds]) :- gencodeforpred(Package,Pred) , gencode(Package,Preds) .

local_side_efs(_, (:- Call)):- call(Call),!.
local_side_efs(_, H):- H \= (_:-_),!,local_side_efs(_, (H:-true)).
local_side_efs(_, (H:-_)):- ( predicate_property(H,static) ; predicate_property(H,built_in) ),!.
local_side_efs(_, (Call)):- call(assertz(Call)),!.
local_side_efs(_, _Clause).
readprogram(BName,In,Out) :-
		read(Clause) ,local_side_efs(BName,Clause) ,
		(Clause = end_of_file -> In = Out
		;
		 binarize(Clause,BinCl) ,
			addclausetoprogram(BinCl,In,NewIn) ,
			readprogram(BName,NewIn,Out)
		) .

% binarize((Head ::- Body),Cl) :- ! , Cl = (Head :- Body) .
binarize((Head :- Body),(BinHead :- BinBody)) :- ! ,
			addcont(Head,Continuation,BinHead) ,
			makebinbody(Body,Continuation,BinBody) .
binarize(Head,(BinHead :- call(Continuation))) :-
			addcont(Head,Continuation,BinHead) .

makebinbody((G,B),C,NewBody) :- ! ,
			makebinbody(B,C,NewB) ,
			addcont(G,NewB,NewBody) .
makebinbody(SpecialGoal,C,NewBody) :-
			specialgoal(SpecialGoal,G) , !,
			addcont(G,C,NewBody) .
makebinbody('!',C,NewBody) :- ! ,
			NewBody = cut(1,C) .
makebinbody(G,C,NewBody) :- ! ,
			addcont(G,C,NewBody) .

addclausetoprogram(Cl,[],ProgOut) :- ! , ProgOut = [[Cl]] .
addclausetoprogram(Cl,[Pred|Rest],Out) :-
			samepred(Cl,Pred) , ! ,
			Out = [[Cl|Pred]|Rest] .
addclausetoprogram(Cl,[Pred|Rest],[Pred|NewRest]) :-
			addclausetoprogram(Cl,Rest,NewRest) .


samepred((H1 :- _),[(H2 :- _)|_]) :- legacy_functor(H1,N,A) , legacy_functor(H2,N,A) .





addcont('!',C,FB) :- ! , FB = cut(1,C) .
addcont(S,C,NG) :- specialgoal(S,NS) , ! , addcont(NS,C,NG) .
addcont(F,C,FB) :- F =.. [N|A] , append(A,[C],NA) , FB =.. [N|NA] .


makename(EOL,Out) :- EOL == [], ! , Out = '' .
makename(Atom,Out) :- atomic(Atom) , ! , Out = Atom .
makename([AC|Rest],OutC) :-
		makename(Rest,OC),
		name(OC,OL) ,
		name(AC,AL) ,
		append(AL,OL,OutL) ,
		name(OutC,OutL) .

writel([]) .
writel([X|R]) :- wr(X) , writel(R) .

wr(wr(nl)) :- ! , nl .
wr(Atom) :- atomic(Atom) , ! , write(Atom) .
wr(VAR) :- legacy_functor(VAR,'$VAR',2) , ! , write(VAR) .
wr(Goal) :- call(Goal) .

wrargs(N,T) :- wrargs(N,T,_) .

wrargs(N,_,_) :- N = 0 , ! .
wrargs(N,T,Komma) :- 
		(var(Komma) -> Komma = yes ; write(',') ) ,
		writel([T,a,N]) ,
		M is N - 1 , 
		wrargs(M,T,Komma) .

% Pred is a list of clauses for a specific predicate
% it is binarized and also in reverse order

gencodeforpred(Package,Pred) :-
			Pred = [(H :- _)|_] ,
			legacy_functor(H,N,A) , AA is A - 1,
			makename([pred_,N,'_',AA],ClassName) ,
			makename([Package,'/',ClassName,'.java'],FileName) ,
			setof(F,Pred^continuationof(Pred,F),Conts) ,
			setof(F,Pred^stringof(Pred,F),AllStrings) ,
			mysetof(F,Pred^intof(Pred,F),AllInts) ,
			Strings = ['cut'|AllStrings] ,
			tell(FileName) ,
			prelude(Pred) ,
			writel(['class /* Pred */',
				ClassName,
				' extends Code',
				wr(nl),
				'{ ',
				wr(nl),
				declforeachclause(Pred,1,ClassName),
				declforeachcontinuation(Conts,N,A),
				declforeachstring(Strings,0),
				declforeachint(AllInts),
				'static Code entry_code = new ',ClassName,'();',
				wr(nl),
				'void Init(PrologMachine mach)',
				wr(nl),
				'{ ',
				initforeachcontinuation(Conts,N,A) ,
				'}',
				wr(nl),
				'int Arity() { return ',
				AA,
				' ; }',
				wr(nl),
				'Code Exec(PrologMachine mach)',
				wr(nl),
				'{ Term aregs[] = {',
				aregarray(AA) ,
				'} ;',
				wr(nl),
				'mach.CreateChoicePoint(aregs) ;',
				wr(nl),
				'return cl1.Exec(mach) ;',
				wr(nl),
				'}',
				wr(nl),
				'}',
				wr(nl) , wr(nl)
				]) ,
			genpredcode(Pred,last,ClassName,_,Strings) ,
			%close(FileName) .
			told.

mysetof(X,Y,Z) :- setof(X,Y,Z) , ! .
mysetof(_,_,[]) .

genpredcode([],_,_,0,_) .
genpredcode([Clause|Rest],Last,ClassName,M,Strings) :-
			genpredcode(Rest,notlast,ClassName,N,Strings) ,
			M is N + 1 ,
			genclausecode(Clause,Last,ClassName,M,Strings) .

genclausecode(Clause,Last,ClassName,N,Strings) :-
		Clause = (Head :- Body) ,
		legacy_functor(Head,Name,Arity) ,
		Amin2 is Arity - 2, Amin1 is Arity - 1,
		arg(Arity,Head,'$cont'(Arity)) ,
		writel(['/* helper */class ',ClassName,'__',N,' extends ',ClassName,wr(nl),
			'{',wr(nl),
			'Code Exec(PrologMachine mach)',wr(nl),
			'{ ',
			(Last = last -> write('mach.RemoveChoice() ;')
				;
				M is N + 1 ,
				writel(['mach.FillAlternative(cl',
					M,') ;'
					])
			) ,
			wr(nl),
			'Term local_aregs[] = mach.Areg ;', wr(nl),
			'Term continuation = local_aregs[',Amin1,'] ;', wr(nl) ,
			decl_deref_args(Amin2),
			mynumbervars(Clause,1,NumbVars),
			(NumbVars > 1 -> declvars(NumbVars) ; true) ,
			gets(Head,Strings) ,
			puts(Body,Strings) ,
			'mach.CUTB = mach.CurrentChoice ;',wr(nl),
			nullifyaregs(Clause) ,
			'return ',
			bodycont(Clause,Name,Arity) ,
			' ;',
			wr(nl),
			'}',wr(nl),
			'}',wr(nl), wr(nl)
			]) .

nullifyaregs((H :- B)) :-
		legacy_functor(H,_,HA) , legacy_functor(B,_,BA) , Diff is HA - BA ,
		Diff > 0 ,
		nullify(Diff,HA) .
nullifyaregs(_) .

nullify(0,_) :- ! , write('null ;') , nl , fail .
nullify(N,K) :-	L is K - 1 ,
		writel(['local_aregs[',L,'] = ']) ,
		M is N - 1 ,
		nullify(M,L) .

mynumbervars(Var,I,O) :- var(Var) , ! , Var = '$VAR'(I,_) , O is I + 1 .
mynumbervars('$VAR'(_,_), I,O) :- ! , I = O .
mynumbervars(A,I,O) :- atomic(A) , ! , I = O .
mynumbervars(Term,I,O) :- Term =.. [_|Args] , mynumbervarslist(Args,I,O) .

mynumbervarslist([],I,I) .
mynumbervarslist([T|R],I,O) :- mynumbervars(T,I,II) , mynumbervarslist(R,II,O) .


gets(Head,Strings) :- Head =.. [_|Args] , gets(Args,0,Strings) .

gets([_],_,_) :- ! . % this is the continuation !
gets([Arg|Args],N,Strings) :-
		M is N + 1 , getforarg(Arg,N,Strings) , gets(Args,M,Strings) .

getforarg(Arg,N,Strings) :-
		writel(['if (!( (areg',N,').Unify(',constructterm(Arg,Strings),
			'))) return UpperPrologMachine.Fail0 ;',wr(nl)]) .


puts(cut(_,C),Strings) :- ! ,
		writel(['mach.DoCut(mach.CUTB)  ;',wr(nl)]) ,
		putforarg(C,0,Strings) .
puts(Body,Strings) :- Body =.. [_|Args] , puts(Args,0,Strings) .

puts([],_,_) .
puts([Arg|Args],N,Strings) :-
		M is N + 1 , putforarg(Arg,N,Strings) , puts(Args,M,Strings) .

putforarg(Arg,N,Strings) :-
	writel(['local_aregs[',N,'] = ',constructterm(Arg,Strings),' ;',wr(nl)]) .

declvars(1) :- ! .
declvars(N) :- M is N - 1 ,
		writel(['Term var',M,' = Term.Var(mach) ;',wr(nl)]) ,
		declvars(M) .



% variables are replaced with '$VAR'(integer,_)
% continuation is replaced by '$cont'(arity)

constructterm('$cont'(_),_) :- ! ,
		 writel(['continuation']) .
constructterm('$VAR'(N,T),_) :- ! ,
		(var(T) -> writel(['var',N]) , T = 1
		;
		 writel(['var',N,'.Deref()'])
		) .
constructterm(cut(_,C),Strings) :- ! ,
		getnameindex(Strings,'cut',0,I),
		writel(['Term.Compound(string',I,', new HeapChoice(mach.CUTB),',
			constructterm(C,Strings),
			')'
			]) .

constructterm(IntegerTerm,_) :- integer(IntegerTerm) , ! , posneg(IntegerTerm) .
constructterm(Atom,Strings) :- atom(Atom) , ! ,
			getnameindex(Strings,Atom,0,I),
			writel(['Const.Intern(string',I,')']) .
constructterm(Term,Strings) :-
			legacy_functor(Term,Name,_) ,
			Term =.. [_|Args],
			getnameindex(Strings,Name,0,I) ,
			writel(['Term.Compound(string',I,',',
				newargs(Args,1,Strings),
				')'
				]) .

newargs([],_,_) .
newargs([A|Args],N,Strings) :-
		(N > 1 -> write(',') ; true) ,
		M is N + 1 ,
		constructterm(A,Strings) ,
		newargs(Args,M,Strings).
			



bodycont((_ :- B),Name,Arity) :- legacy_functor(B,Name,Arity) , ! ,
			writel([entry_code]) .
bodycont((_ :- B),_,_) :- legacy_functor(B,call,1) , ! ,
			writel(['UpperPrologMachine.Call1']) .
bodycont((_ :- B),_,_) :- legacy_functor(B,call,2) , ! ,
			writel(['UpperPrologMachine.Call2']) .
bodycont((_ :- B),_,_) :- legacy_functor(B,cut,2) , ! ,
			writel(['UpperPrologMachine.Call1']) .
bodycont((_ :- B),_,_) :- legacy_functor(B,Name,Arity) ,
			writel([Name,Arity,'cont']) .

decl_deref_args(-1) :- ! .
decl_deref_args(N) :- writel(['Term areg',N,
				' = local_aregs[',N,'].Deref() ;',wr(nl)]) ,
			M is N - 1 , 
			decl_deref_args(M) .


initforeachcontinuation([],_,_) .
initforeachcontinuation([N/A|R],N,A) :- !,	% this is entry code !
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([call/1|R],N,A) :- !,	% Call1
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([call/2|R],N,A) :- !,	% Call2
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([cut/2|R],N,A) :- !,	% Cut2
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([N/A|R],Name,Arity) :-
		B is A - 1 ,
		writel([N,A,'cont = pred_',N,'_',B,'.entry_code ;',wr(nl)]) ,
		initforeachcontinuation(R,Name,Arity) .
initforeachcontinuation([N/A|R],Name,Arity) :-
		B is A - 1 ,
		writel([N,A,'cont = mach.LoadPred("',N,'",',B,') ;',wr(nl)]),
		initforeachcontinuation(R,Name,Arity) .

aregarray(N) :- aregarray(0,N) .

aregarray(N,Max) :- N > Max , ! .
aregarray(N,Max) :-
		(N > 0 -> write(',') ; true) ,
		M is N + 1 ,
		writel(['mach.Areg[',N,']']) ,
		aregarray(M,Max) . 

declforeachclause([],_,_) .
declforeachclause([_|R],N,ClassName) :-
			writel(['static Code cl',
				N,
				' = new ',
				ClassName,'__',N,
				'() ;',
				wr(nl)
				]) ,
			M is N + 1 ,
			declforeachclause(R,M,ClassName) .


declforeachcontinuation([],_,_) .
declforeachcontinuation([N/A|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([call/1|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([call/2|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([N/A|R],Name,Arity) :-
		writel([	'static Code ',
			N,
			A,
			'cont ;',
			wr(nl)
		    ]) ,
		declforeachcontinuation(R,Name,Arity) .

declforeachstring([],_) .
declforeachstring([N|R],M) :- MM is M + 1 ,
			writel(['static String string',M,
				' = Const.IStr("',N,'") ;',wr(nl)]) ,
				declforeachstring(R,MM) .

declforeachint([]) .
declforeachint([N|R]) :- writel(['static Int ',posneg(N),
				' = Term.Number(',N,') ;',wr(nl)]) ,
				declforeachint(R) .

posneg(N) :- N < 0 , ! , M is 0 - N , writel(['negint',M]) .
posneg(N) :- writel(['posint',N]) .


getnameindex([N|_],N,In,In) :- ! .
getnameindex([_|R],N,In,Out) :- I is In + 1 , getnameindex(R,N,I,Out) ,!.
getnameindex(_,_,In,In).

continuationof([(_ :- B)|_],N/A) :- legacy_functor(B,N,A).
continuationof([_|R],F) :- continuationof(R,F) .

stringof([Cl|_],F) :- strings1(Cl,F) .
stringof([_|R],F) :- stringof(R,F) .

strings1(X,_) :- var(X) , ! , fail .
strings1((A,_),F) :- strings1(A,F) .
strings1((_,B),F) :- ! , strings1(B,F) .
strings1((A :- _),F) :- strings1(A,F) .
strings1((_ :- B),F) :- ! , strings1(B,F) .
strings1(T,F) :- legacy_functor(T,N,_) , F = N .
strings1(T,F) :- T =.. [_|Args] , stringsl(Args,F) .

strings(X,_) :- var(X) , ! , fail .
strings(A,F) :- atom(A) , ! , F = A .
strings(A,_) :- atomic(A) , ! , fail .
strings(T,F) :- legacy_functor(T,N,_) , F = N .
strings(T,F) :- T =.. [_|Args] , stringsl(Args,F) .

stringsl([T|_],F) :- strings(T,F) .
stringsl([_|R],F) :- stringsl(R,F) .

intof([Cl|_],F) :- ints(Cl,F) .
intof([_|R],F) :- intof(R,F) .

ints(X,_) :- var(X) , ! , fail .
ints(A,F) :- integer(A) , ! , F = A .
ints(A,_) :- atomic(A) , ! , fail .
ints(T,F) :- T =.. [_|Args] , intof(Args,F) .





% the following are also in someprolog at the moment

specialgoal(X < Y , smallerthan(X,Y)) :- ! .
specialgoal(X =< Y , smallerorequal(X,Y)) :- ! .
specialgoal(X > Y , smallerthan(Y,X)) :- ! .
specialgoal(X >= Y , smallerorequal(Y,X)) :- ! .
specialgoal(X =:= Y , arithequal(Y,X)) :- ! .
specialgoal(X = Y , unify(Y,X)) :- ! .
specialgoal((X;Y) , or(X,Y)) :- ! .
specialgoal(X @< Y , termsmallerthan(X,Y)) :- ! .
specialgoal(X @> Y , termgreaterthan(X,Y)) :- ! .
specialgoal(X @=< Y , termsmallerequal(X,Y)) :- ! .
specialgoal(X @>= Y , termgreaterequal(X,Y)) :- ! .
specialgoal(X == Y , termequal(X,Y)) :- ! .
specialgoal(\+(X) , not(X)) :- ! .

w_cl([Pred]):- !, format('~N~p.~n',[Pred]).
w_cl([Prev|Pred]):- !,w_cl(Pred),w_cl(Prev).
w_cl(Pred):-w_cl([Pred]).

prelude(Pred):- prelude,write('\n/*\n'),w_cl(Pred),write('\n*/\n').
prelude :- write('// Generated code file - by dmiles') , nl , fail .
prelude :- write('// Copyright August 16, 1996,2018 LOGICMOO, KUL and CUM') , nl , fail .
prelude :- write('// Authors: Douglas R. Miles, Bart Demoen and Paul Tarau') , nl , nl , fail .
prelude .

% main :- comp('board') , fail .
% main :- comp('test') , fail .
% main :- comp('read.pl') , fail .
% main :- comp('someprolog') , fail .
% main :- comp('chat') , fail .
% main :- comp('boyer') , fail .

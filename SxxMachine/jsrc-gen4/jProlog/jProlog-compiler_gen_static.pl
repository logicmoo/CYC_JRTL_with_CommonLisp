append([],L,L) .
append([X|L1],L2,[X|L3]) :- append(L1,L2,L3) .

legacy_functor(P,'.',A):- functor(P,'[|]',A),!.
legacy_functor(P,F,A):- functor(P,F,A),!.


comp(FileSpec):- comp_to(FileSpec,'../jsrc/bootlib').
    
comp_to(FileSpec,Where) :- \+ exists_file(FileSpec),!,
  forall((absolute_file_name(FileSpec,File,
    [expand(true),file_type(prolog),solutions(all)]),
     exists_file(File)),
    (comp_to(File,Where))).
comp_to(File,Dir0) :-  
    must_det_l((
              makename([Dir0,'/','SxxMachine'],Dir),!,
               exists_file(File),
               file_base_name(File,Base),
               file_name_extension(Stem,_,Base),
               makename([Dir,'/',Stem,'.java'],FileName),!,
               wdmsg(comp_to(File,Dir,FileName)),
               make_directory_path(Dir),!,
               nb_setval(stem,Stem),                
		InProg = [] ,		
                see(File) ,  
		readprogram(Stem,InProg,Prog) ,!,
                seen, % close(File) ,
		tell(FileName),
		gencode_sss(Dir,Stem,Prog),!,
		told)),!.
     


call_local_side_efs(public(_)) :-!.
call_local_side_efs(package(V)) :- nb_setval(package,V).
call_local_side_efs(if(_)) :-!.
call_local_side_efs(determinate(_)) :-!.
call_local_side_efs(comp(_)) :-!.
call_local_side_efs(comp_to(_,_)) :-!.
call_local_side_efs(Call):- ignore(call(Call)).

local_side_efs(_, (:- if(_))):- repeat,read(Until),Until==(:-endif),!.
local_side_efs(_, (:- Call)):- call_local_side_efs(Call),!.
local_side_efs(_, H):- H \= (_:-_),!,local_side_efs(_, (H:-true)).
%local_side_efs(_, (H:-_)):- ( predicate_property(H,static) ; predicate_property(H,built_in) ),!.
%local_side_efs(_, (Call)):- call(assertz(Call)),!.
local_side_efs(_, _Clause).


readprogram(Stem,In,Out) :-
		read(Clause) ,local_side_efs(Stem,Clause) ,
		(Clause = end_of_file -> In = Out
		;
		 binarize(Clause,BinCl) ,
			addclausetoprogram(BinCl,In,NewIn) ,
			readprogram(Stem,NewIn,Out)
		) .

% binarize((Head ::- Body),Cl) :- ! , Cl = (Head :- Body) .

binarize((:-(C)), Out) :- nb_current(stem,Stem),atom_concat('on_load_',Stem,Pred), ! , 
   binarize((Pred :- write(C)), Out).
binarize((:-(C)), Out) :- nb_current(stem,Stem),atom_concat('on_load_',Stem,Pred), ! , 
   binarize((Pred :- C), Out).
binarize((Head :- Body),(BinHead :- BinBody)) :- ! ,
			addcont(Head,Continuation,BinHead) ,
			makebinbody(Body,Continuation,BinBody) .
binarize(Head,(BinHead :- call(Continuation))) :-
			addcont(Head,Continuation,BinHead) .

makebinbody(G,C,NewBody):-var(G),!,makebinbody(call(G),C,NewBody).

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

wr(getval(Var)) :- must((nb_current(Var,Value), write(Value))).
wr(wr(nl)) :- ! , nl .
wr(Atom) :- atomic(Atom) , ! , write(Atom) .
wr(VAR) :-  legacy_functor(VAR,'$VAR',2) , ! , write(VAR) .
wr(Goal) :- must(call(Goal)),! .

wrargs(N,T) :- wrargs(N,T,_) .

wrargs(N,_,_) :- N = 0 , ! .
wrargs(N,T,Komma) :- 
		(var(Komma) -> Komma = yes ; write(',') ) ,
		writel([T,a,N]) ,
		M is N - 1 , 
		wrargs(M,T,Komma) .

% Pred is a list of clauses for a specific predicate
% it is binarized and also in reverse order


gencode_sss(Dir,Stem,Preds):-
 must_det_l((    
  mysetof(F,Preds^stringof(Preds,F),AllStrings) ,
  mysetof(F,Preds^intof(Preds,F),AllInts) ,  
  Strings = ['cut'|AllStrings] ,
  
  writel([
'package SxxMachine;

import SxxMachine.exceptions.*;
 
import SxxMachine.*;
import SxxMachine.Builtins.*;
import SxxMachine.Metaterm.*; 
import SxxMachine.sxx_meta.pred_or_2;
import SxxMachine.sxx_meta.*;
import SxxMachine.sxx_system.*;
import SxxMachine.sxx_read.*;
import SxxMachine.sxx_library.*;

public class ',Stem,' /*extends CodeFile*/ {
']),
			
  declforeachstring(Strings,0),
  declforeachint(AllInts),
  declforeachpred(Preds),

  gencode_sss(Strings,Dir,Stem,Preds),!,
  writel(['}\n\n\n']))).
  
gencode_sss(_,_,_,[]) .
gencode_sss(Strings,Dir,Stem,[Pred|Preds]) :- 
  gencodeforpred(Strings,Dir,Stem,Pred) , 
  gencode_sss(Strings,Dir,Stem,Preds) .

gencodeforpred(Strings,Dir,Stem,Pred) :-  Pred = [(H :- _)|_] , 
   legacy_functor(H,PN,A) , AA is A - 1,
   make_classname(PN,AA,N,ClassName),
   nb_setval(classname,ClassName), 
   gencodeforpred(Strings,Dir,Stem,Pred,H,N,A,AA,ClassName).


   % (isSort(X),isSort(Y))-> (all Q hasSort(Q,X)


symbol_to_name(Atom,Out):- symbol_to_name1(Atom,Out),!.
symbol_to_name(Name,Name).

/*
symbol_to_name1((':-'),'system_neck').
symbol_to_name1(('=..'),'system_univ').
symbol_to_name1(('=@='),'system_variant').
symbol_to_name1(('\\+'),'system_not').
symbol_to_name1(('\\='),'system_notequals').
symbol_to_name1(('='),'system_equals').
symbol_to_name1(('=='),'strict_eq').
symbol_to_name1(('\\=='),'strict_noteq').
symbol_to_name1(('-->'),'dcg_arrow').
symbol_to_name1(('->'),'if_then_arrow').
symbol_to_name1(('*->'),'with_each_arrow').
symbol_to_name1((','),'system_comma').
symbol_to_name1(('^'),'system_carrot').
symbol_to_name1(('|'),'system_bar').
symbol_to_name1((':'),'system_colon').





*/

symbol_to_name1((';'),'or'):-!.
symbol_to_name1((':'),'module_colon'):-!.
symbol_to_name1(S,O):- functor(P,S,2),specialgoal(P,PP),functor(PP,O,_),!.
symbol_to_name1(S,O):- functor(P,S,1),specialgoal(P,PP),functor(PP,O,_),!.
symbol_to_name1(A,B):- symbol_to_name2(A,B),!.

symbol_to_name2('',''):-!.

symbol_to_name2(Atom,Out):- name(Atom,[36, 48, 48, A,B|Rest]),name(Mid1,[36, 48, 48, A,B]),!,
   name(NAtom,Rest),symbol_to_name2(NAtom,Mid2),atom_concat(Mid1,Mid2,Out).

symbol_to_name2(Atom,Out):- name(Atom,[C|Rest]), \+ code_type(C,alnum), C\==95,!,
   format(atom(Mid1),'$~|~`0t~16R~4+', [C]), 
   name(NAtom,Rest),symbol_to_name2(NAtom,Mid2),atom_concat(Mid1,Mid2,Out).

symbol_to_name2(Atom,Out):- name(Atom,[C|Rest]),name(Mid1,[C]),name(NAtom,Rest),
  symbol_to_name2(NAtom,Mid2),atom_concat(Mid1,Mid2,Out).
   

make_classname(Sym,AA,NN,ClassName):- symbol_to_name(Sym,N)-> (Sym\==N,!,make_classname(N,AA,NN,ClassName)).
make_classname(N,AA,N,ClassName):- makename([pred_,N,'_',AA],ClassName),!.

gencodeforpred(Strings,_Dir,_PINF,Pred,_H,_N,_A,AA,ClassName):- 
   must_det_l((   
        %mysetof(F,Pred^continuationof(Pred,F),Conts) ,	
	writel(['public static class ',ClassName,' extends Code {\n']),
        prelude(Pred) ,
       % declforeachcontinuation(Conts,N,A),
        %declforeachclause(Pred,1,ClassName),        
	% writel(['static {', initforeachcontinuation(Conts,N,A),'}',wr(nl)]),           
        writel([        			wr(nl),
        'public Operation exec(Engine mach) {return exec_static(mach); }',wr(nl),
      'public static Operation exec_static(Engine mach){ ',wr(nl),
      '/* Term aregs[] = {',aregarray(AA) ,'} ;*/',wr(nl),
      'Term aregs[] = mach.RegPull(',AA,');',wr(nl),
      'mach.CreateChoicePoint(aregs) ;',wr(nl),
      'return (Operation)exec_',ClassName,'__1(mach); }',wr(nl)]) ,!,
        genpredcode(Strings,Pred,last,ClassName,_,Strings),
        writel(['}\n\n\n']))).
			
                        

cont_ref(N):- must_det(writel([getval(classname),'::exec_',getval(classname),'__',N])).

mysetof(X,Y,Z) :- setof(X,Y,Z) , ! .
mysetof(_,_,[]) .

genpredcode(_PreDecl,[],_,_,0,_) .
genpredcode(Strings,[Clause|Rest],Last,ClassName,M,Strings) :-
			genpredcode(Strings,Rest,notlast,ClassName,N,Strings) ,
			M is N + 1 ,
			genclausecode(Strings,Clause,Last,ClassName,M,Strings) .

genclausecode(_PreDecl,Clause,Last,ClassName,N,Strings) :-
		Clause = (Head :- Body) ,!,
     must_det_l((				
		legacy_functor(Head,Name0,Arity) ,
                symbol_to_name(Name0,Name),
		Amin2 is Arity - 2, Amin1 is Arity - 1,
		arg(Arity,Head,'$cont'(Arity)) ,
		writel([
			
                     'public static Operation exec_',ClassName,'__',N,'(Engine mach){ ',
			(Last = last -> write('mach.RemoveChoice() ;')
				;
				(M is N + 1 , writel(['mach.FillAlternative(',cont_ref(M),') ;']))
			) 
                        ,wr(nl),
			'Term local_aregs[] = mach.Areg ;', wr(nl),
			'Term continuation = local_aregs[',Amin1,'] ;', wr(nl) ,
			decl_deref_args(Amin2),
			mynumbervars(Clause,1,NumbVars),
			(NumbVars > 1 -> declvars(NumbVars) ; true) ,
			gets(Head,Strings) ,
			puts(Body,Strings) ,
			'mach.CUTB = mach.CurrentChoice ;',wr(nl),
			nullifyaregs(Clause) ,
			'return ',bodycont(Strings,Clause,Name,Arity),' ;}',
			 wr(nl)]))).


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
			'))) return Engine.Fail0 ;',wr(nl)]) .


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
		writel(['Var var',M,' = V(mach) ;',wr(nl)]) ,
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
		must_det_l(( %getnameindex(Strings,'cut',0,I),
	               writel(['F(CutProc.NAME, new HeapChoice(mach.CUTB),',
			constructterm(C,Strings),
			')']))) .

constructterm(Int,_) :- integer(Int) , ! , writel([getval(stem),'.']), posneg(Int) .
constructterm(Atom,Strings) :- string(Atom) , !,writeConst(Atom,Strings).
constructterm(Int,_) :- float(Int) , ! , writel(['Const.Float(',Int,')']),!.

constructterm(Atom,Strings) :- []==(Atom) , !,writeConst(Atom,Strings).
constructterm(Atom,Strings) :- atom(Atom) , !,writeConst(Atom,Strings).
constructterm(Term,Strings) :- compound(Term),!,
			must_det_l((
                        legacy_functor(Term,Name,_) , Term =.. [_|Args],			
			writel(['F(',writeConst(Name,Strings),',',newargs(Args,1,Strings),')']))) .

writeConst([],_Strings) :- writel(['Const.Nil']),!.
writeConst(Name,Strings):-   getnameindex(Strings,Name,0,I),!, writel([getval(stem),'.s',I]),!.
writeConst(Name,_Strings) :- must_det_l((atom_string(Name,S), writel(['Const.Intern(',format('~q',[S]),')']))),!.


newargs([],_,_) .
newargs([A|Args],N,Strings) :-
               must_det_l((
		(N > 1 -> write(',') ; true) ,
		M is N + 1 ,
		constructterm(A,Strings) ,
		newargs(Args,M,Strings))).
			



bodycont(_String,(_ :- B),Name,Arity) :- fail, legacy_functor(B,Name,Arity) , ! ,writel(['entry_code']) .
bodycont(_String,(_ :- B),_,_) :- legacy_functor(B,call,1) , ! ,
			writel(['Engine.Call1']) .
bodycont(_String,(_ :- B),_,_) :- legacy_functor(B,call,2) , ! ,
			writel(['Engine.Call2']) .
bodycont(_String,(_ :- B),_,_) :- legacy_functor(B,cut,2) , ! ,
			writel(['Engine.Call1']) .
bodycont(_String,(_ :- B),_,_) :- legacy_functor(B,cut,2) , ! ,
			writel(['Engine.Cut2']) .

bodycont(String,(_ :- B),_,_) :- fail, legacy_functor(B,Name,Arity) ,getnameindex(String,Name,0,I),!, 
                        MArity is Arity-1, writel(['(Operation) ',getval(stem),'.s',I,'.FindProc(',MArity,')']) .

bodycont(_String,(_ :- B),_,_) :- legacy_functor(B,Name0,Arity) , MArity is Arity-1, symbol_to_name(Name0,Name),
			writel(['(Operation)pred_',Name,'_',MArity,'::exec_static']) .

bodycont(_String,(_ :- B),_,_) :- legacy_functor(B,Name0,Arity) , symbol_to_name(Name0,Name),
			writel([Name,Arity,'cont']) .

decl_deref_args(-1) :- ! .
decl_deref_args(N) :- writel(['Term areg',N,
				' = local_aregs[',N,'].Deref() ;',wr(nl)]) ,
			M is N - 1 , 
			decl_deref_args(M) .

use_entry_code(_F,_A):- fail.
use_static_call(_F,_A).
use_load_pred(_F,_A).

initforeachcontinuation([],_,_) .
initforeachcontinuation([N/A|R],N,A) :- !,	% this is entry code !
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([call/1|R],N,A) :- !,	% Call1
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([call/2|R],N,A) :- !,	% Call2
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([cut/2|R],N,A) :- !,	% Cut2
		initforeachcontinuation(R,N,A) .
initforeachcontinuation([N/A|R],Name,Arity) :- B is A - 1 ,symbol_to_name(N,SN),
	       writel([N,A,'cont = pred_',N,'_',B,'::exec_pred_',SN,'__',B,';',wr(nl)]) ,
		initforeachcontinuation(R,Name,Arity) .
initforeachcontinuation([N/A|R],Name,Arity) :- use_load_pred(N,B),!,
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
			writel(['static Operation cl',
				N,' = ', ClassName,'::exec_',ClassName,'__',N,';',wr(nl)]) ,
			M is N + 1 ,
			declforeachclause(R,M,ClassName) .


declforeachcontinuation([],_,_) .
declforeachcontinuation([N/A|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([call/1|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([call/2|R],N,A) :- ! , declforeachcontinuation(R,N,A) .
declforeachcontinuation([N/A|R],Name,Arity) :-
		writel([	'static Operation ',
			N,
			A,
			'cont ;',
			wr(nl)
		    ]) ,
		declforeachcontinuation(R,Name,Arity) .

declforeachstring([],_) .
declforeachstring([N|R],M) :- MM is M + 1 , atom_string(N,S),
			writel(['final static Const s',M,
				' = Const.Intern(',format('~q',[S]),') ;',wr(nl)]) ,
				declforeachstring(R,MM) .

constructnum(Int) :- integer(Int) ,AInt is abs(Int), X is 2^30, AInt>X, ! , writel(['Const.BigInt("',Int,'")']).
constructnum(Int) :- integer(Int) ,!, writel(['Const.Number(',Int,'L)']).
constructnum(Int) :- float(Int) ,writel(['Const.BigDec("',Int,'")']).

declforeachint([]) .
declforeachint([N|R]) :- writel(['final static Int ',posneg(N),
				' = ',constructnum(N),' ;',wr(nl)]) ,
				declforeachint(R) .

posneg(N) :- N < 0 , ! , M is 0 - N , writel(['negint',M]) .
posneg(N) :- writel(['posint',N]) .

declforeachpred([]) .
declforeachpred([P|R]):- !, declforeachpred1(P),declforeachpred(R).

declforeachpred1([(P:-_)|_]) :- functor(P,F,A),!,symbol_to_name(F,Name),  AA is A - 1,
                   writel(['final static Operation reg_',Name,'_',AA,' = PredTable.Register("',F,'",',AA,', new pred_',Name,'_',AA,'());',wr(nl)]),!.
	           
declforeachpred1(_).

getnameindex([N|_],N,In,In) :- ! .
getnameindex([_|R],N,In,Out) :- I is In + 1 , getnameindex(R,N,I,Out) ,!.
%getnameindex(_,_,In,In).


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


predof([Cl|_],F) :- preds(Cl,F) .
predof([_|R],F) :- predof(R,F) .

preds(X,_) :- var(X) , ! , fail .
preds(P,F/A) :- functor(P,F,A),!.




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

prelude(Pred):- write('\n/*\n\n'),w_cl(Pred),write('\n\n*/\n').
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

:- comp_to(sxx_system,'../jsrc/bootlib').
:- comp_to(sxx_read,'../jsrc/bootlib').
:- comp_to(sxx_library,'../jsrc/bootlib').
:- comp_to(sxx_meta,'../jsrc/bootlib').
%:- comp_to(sxx_compiler_gen_static,'../jsrc/compiler').
%:- comp_to(sxx_builtins_cafe,'../jsrc/library').
:- comp_to('tests/*','../jsrc/testing').
:- comp_to('bench/*','../jsrc/benches').


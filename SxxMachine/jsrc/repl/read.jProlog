% read/1: from screen - no error recovery - only simple syntax

vread(Term,Vars) :-
		nexttoken(Tok) ,
		readall(Tok,Tokens) ,
		maketerm(Tokens,Term) ,
		! ,
		collectvars(Tokens,[],Vars)
		.

read(Term) :-	nexttoken(Tok) ,
		readall(Tok,Tokens) ,
		maketerm(Tokens,Term) ,
		!
		.

collectvars([],In,In) :- ! .
collectvars([var(Var,Name,Occ)|R],In,Out) :-
			noteq(Name,'_') ,
			notvmember(Name,In) , ! ,
			collectvars(R,[Var = Name|In],Out) .
collectvars([_|R],In,Out) :-
			collectvars(R,In,Out) .

notvmember(_,[]) :- ! .
notvmember(Name,[_ = Name|_]) :- ! , fail .
notvmember(Name,[_|R]) :- notvmember(Name,R) .

readall(end_of_file,Tail) :- ! , halt .
readall(end_of_clause,Tail) :- ! ,
		Tail = [] .
readall(Token,[Token|Tail]) :-
		nexttoken(NewToken) ,
		readall(NewToken,Tail) .


infix(1200,xfx,(:-)) .
infix(1000,xfy,',') .
infix(1100,xfy,(;)) .
infix(1050,xfy, -> ) .
infix(700,xfx,=) .
infix(700,xfx,is) .
infix(700,xfx,=..) .
infix(700,xfx,==) .
infix(700,xfx,@<) .
infix(700,xfx,@>) .
infix(700,xfx,@=<) .
infix(700,xfx,@>=) .
infix(700,xfx,=:=) .
infix(700,xfx,<) .
infix(700,xfx,=<) .
infix(700,xfx,>) .
infix(700,xfx,>=) .
infix(550,xfy,:) .
infix(500,yfx,+) .
infix(500,yfx,-) .
infix(500,yfx,#) .
infix(400,yfx,*) .
infix(400,yfx,/) .
infix(400,yfx,//) .
infix(400,yfx,<<) .
infix(400,yfx,>>) .
infix(300,xfx,mod) .
infix(200,xfy,^) .

prefix(1200,fx,(:-)) .
prefix(1200,fx,(?-)) .
prefix(500,fx,+) .
prefix(500,fx,-) .


% maketerm(In,Term)
% consists of tokens already

maketerm([var(Var,Name,Occ)],Out,_) :- Out = Var , !  .

maketerm([int(Term)],Out,_) :- ! , Out = Term .

maketerm([const(Term)],Out,_) :- ! , Out = Term .

maketerm([const(Name),const('(')|Argswithcomma],Out,_) :-
			getargs(Argswithcomma,Args) ,
			univ(Out,Name,Args) .

maketerm(In,Term,Prec) :-
		ap(In1,[const(Op)|In2],In) ,
		infix(P,Type,Op) ,
		P =< Prec ,
		newprec(Type,P,P1,P2) ,
		maketerm(In1,T1,P1) ,
		maketerm(In2,T2,P2) ,
		univ(Term,Op,[T1,T2]) .
maketerm([const(Op)|In],Term,Prec) :-
		prefix(P,Type,Op) ,
		P =< Prec ,
		newprec(Type,P,P1) ,
		maketerm(In,T1,P1) ,
		univ(Term,Op,[T1]) .
maketerm([const('[')|L],[El|Tail],_) :-
		ap(ElList,[const(',')|Rest],L) ,
		maketerm(ElList,El,900) ,
		maketerm([const('[')|Rest],Tail,900) .
maketerm([const('[')|L],[El|Tail],_) :-
		ap(ElList,[const('|')|Rest],L) ,
		ap(TailL,[const(']')],Rest),
		maketerm(ElList,El,900) ,
		maketerm(TailL,Tail,900) .

maketerm([const('(')|L],Term,_) :-
		ap(L1,[const(')')],L) , !,
		maketerm(L1,Term) .
maketerm([const('[')|R],[T2],_) :-
		ap(L,[const(']')],R) ,
		maketerm(L,T2,900) .
maketerm([const('['),const(']')],[],_) .

newprec(xfx,P,P1,P2) :- ! , P1 is P - 1 , P2 is P - 1 .
newprec(xfy,P,P1,P2) :- ! , P1 is P - 1 , P2 = P .
newprec(yfx,P,P1,P2) :- ! , P2 is P - 1 , P1 = P .

newprec(fx,P,P1) :- ! , P1 is P - 1 .
newprec(fy,P,P) .

getargs(In,Out) :- ap(I,[const(')')],In) , maketerm(I,T,900) , Out = [T] .
getargs(In,Out) :- ap(I,[const(',')|RI],In) , maketerm(I,T,900) , Out = [T|RT] ,
		getargs(RI,RT) .

maketerm(X,Y) :- maketerm(X,Y,1200) .

ap([],L,L) .
ap([X|L1],L2,[X|L3]) :- ap(L1,L2,L3) .

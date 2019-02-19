toplevel :- top , fail .
toplevel :- toplevel .

top :- write('?- ') ,
		vread(Goal,Vars) ,
		exec(Goal) ,
		writevars(Vars) , write('Yes') , nl ,
		notmore , ! ,
		fail .

top :- top .

notmore :- get0(X) , noteq(X,10) , ! , untilend(X) , fail .
notmore .

noteq(X,X) :- ! , fail .
noteq(_,_) .

untilend(10) :- ! .
untilend(_) :- get0(X) , untilend(X) .

writevars([]) .
writevars([Var = Name|R]) :- write(Name) , write(' = ') , write(Var) , nl , fail .
writevars([_|R]) :- writevars(R) .


nrev([],[]) :- ! .
nrev([A|B],O) :- nrev(B,C) , append(C,[A],O) .

append([],L,L) .
append([A|L1],L2,[A|L3]) :- append(L1,L2,L3) .

max(A,B,B) :- smallerthan(A,B) .
max(A,B,A) :- smallerthan(B,A) .
max(A,A,A) .


sort([],[]) :- ! .
sort([X|R],Out) :-
		split(X,R,S,G) ,
		sort(S,SS),
		sort(G,GS) ,
		append(SS,[X|GS],Out) .

split(X,[],[],[]) :- ! .
split(X,[A|R],[A|S],G) :- smallerthan(A,X) , !,  split(X,R,S,G) .
split(X,[A|R],S,[A|G]) :- split(X,R,S,G) .

time(Goal) :- cputime(T1) , exec(Goal) , cputime(T2) ,
		T is T2 - T1 ,
		write(T) , nl .


exec(G) :- var(G) , ! , fail .
exec((G,B)) :- ! , exec(G), exec(B) .
exec((If->Then)) :- ! , execdisj((If->Then),true) .
exec((B1;B2)) :- ! , execdisj(B1,B2) .
exec(G) :- specialgoal(G,G1) , ! , exec(G1) .
exec(G) :- call(G) .

execdisj((If->Then),Else) :- exec(If) , ! , exec(Then) .
execdisj((If->Then),Else) :- ! , exec(Else) .
execdisj(B1,B2) :- exec(B1) .
execdisj(B1,B2) :- exec(B2) .


loop(0) :- ! .
loop(N) :- M is N - 1 , loop(M) .

or(X,_) :- exec(X) .
or(_,Y) :- exec(Y) .

findall(X,Goal,L) :-
		initfindall(Handle) ,
		findall2(X,Goal,L,Handle) .
findall2(X,Goal,L,Handle) :-
		exec(Goal) ,
		addfindall(X,Handle) ,
		fail .
findall2(X,Goal,L,Handle) :- retrievefindall(L,Handle) .

copy_term(T1,T2) :- findall(X,X=T1,[T2]) .

var(X) :- type_of(X,var) .

atomic(X) :- type_of(X,A) , atomic2(A) .
atomic2(atom) :- ! .
atomic2(integer) .

atom(X) :- type_of(X,atom) .

integer(X) :- type_of(X,integer) .


assumeduring(G,F) :-
		assume(F-Tag) ,
		exec(G) ,
		Tag = 1 .

assumed(F) :- allassumed(L) ,
		m1(F,L) .

m1(X,[X-Tag|_]) :- var(Tag) .
m1(X,[_|R]) :- m1(X,R) .

statistics(runtime,[T,_]) :- cputime(T) .


% the following are also needed in the compiler at the moment

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

termsmallerthan(X,Y) :- compare('<',X,Y) .
termgreaterthan(X,Y) :- compare('>',X,Y) .

termsmallerequal(X,Y) :- compare(C,X,Y) , smeq(C) .
smeq('<') :- ! .
smeq('=') .

termgreaterequal(X,Y) :- compare(C,X,Y) , smgr(C) .
smgr('>') :- ! .
smgr('=') .

termequal(X,Y) :- compare('=',X,Y) .


not(G) :- exec(G) , ! , fail .
not(_) .


freeze(X,G) :- var(X) , ! , freeze_internal(X,G) .
freeze(X,G) :- exec(G) .

execpendinggoals([]) :- execcontinuation .
execpendinggoals([G|R]) :- exec(G) , execpendinggoals(R) .

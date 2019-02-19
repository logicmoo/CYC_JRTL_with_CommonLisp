% library

% returns the name of the Prolog dialect 
% in BinProlog is_prolog(Which) returns Which=binprolog

is_prolog(kernel_prolog).

unify(X,X).

% Kernel Prolog operations

% answer_source(X,G,E): builtin
% getfl(E,A): builtin

first_solution(X,G,Answer):- 
  answer_source(X,G,Solver),
  getfl(Solver,R),
  stop(Solver),
  eq(Answer,R).

findall(X,G,Xs):- 
  answer_source(X,G,Solver),
  source_list(Solver,Xs).

once(G):-first_solution(G,G,the(G)).

not(G):-first_solution(_,G,no).

% '\+'(G):-first_solution(_,G,no). % bug this is read in as +

neq(X,Y):-first_solution(_,eq(X,Y),no). % usually \= is some prologs

copy_term(X,CX):-first_solution(X,true,the(CX)).

% if Cond suceeds executes Then otherwise Else
if(Cond,Then,Else):-
  first_solution(successful(Cond,Then),Cond,R),
  select_then_else(R,Cond,Then,Else).

select_then_else(the(successful(Cond,Then)),Cond,Then,_):-Then.
select_then_else(no,_,_,Else):-Else.

% executes Then for each case then Cond succeeds
% executes Else if Cond never suceeds
if_any(Cond,Then,Else):-
  answer_source(Cond,Cond,Engine),
  getfl(Engine,Answer),
  select_then_or_else(Answer,Engine,Cond,Then,Else).

select_then_or_else(no,_,_,_,Else):-Else.
select_then_or_else(the(BoundCond),Engine,Cond,Then,_):-
  backtrack_over_then(BoundCond,Engine,Cond,Then).

backtrack_over_then(Cond,_,Cond,Then):-Then.
backtrack_over_then(_,Engine,Cond,Then):-
  getfl(Engine,the(NewBoundCond)),
  backtrack_over_then(NewBoundCond,Engine,Cond,Then).
  
forall(When,Then):- not(and(When,not(Then))).


% fluent operations (mostly on Sources)

element_of(I,X):-getfl(I,the(A)),select_from(I,A,X).

select_from(_,A,A).
select_from(I,_,X):-element_of(I,X).

% works with From =< To as well as with To =< From
counter(From,To,Counter):-
  compute('-',To,From,Dif),
  compute('?',To,From,Sign),
  compute('*',Dif,Sign,N),
  compute('+',N,1,Steps),
  integer_source(Steps,1,From,Sign,Counter).

%for(I,I,_).
%for(I,Min,Max):-compute('?',Min,Max,-1),compute('+',1,Min,NewMin),for(I,NewMin,Max).

for(I,From,To):-
  counter(From,To,Counter),
  element_of(Counter,I).

ints(From,To,Ns):-
  counter(From,To,Counter),
  source_list(Counter,Ns).

ints(Max,Ns):-ints(1,Max,Ns).

compose_sources(First,Second,Prod):-  source_list(First,LL1),  source_list(Second,LL2),
  answer_source(pair(X,Y),     and(
       element_of(LL1,X),       element_of(LL2,Y)
     ),  Prod).

append_sources(S1,S2,R):-append_sources([S1,S2],R).
append_sources(Ss,R):-
   answer_source(X,
     and(
        member(S,Ss),        source_list(S,LL),
        element_of(LL,X)     ),
   R).

% see also merge_sources/2, a builtin
      
reverse_source(I,R):-
  source_list(I,Rs),
  answer_source(X,rmember(X,Rs),R).
 
rmember(X,[_|Xs]):-rmember(X,Xs).
rmember(X,[X|_]).


% meta-circular interpreter

solve(G):-
  once(reduce(G,NewG)),
  NewG.

% reflective reducer
% the simplest such beast is: reduce(X,X).

reduce(G,G):-is_builtin(G).
reduce(','(A,B),','(solve(A),solve(B))).
reduce(G,','(clause(G,Gs),solve(Gs))).

% explanatory interpreter

why(G):-
  solve_path(G,Xs,[]),
  forall(member(X,Xs),println(X)).

solve_path(G,P1,P2):-
  once(reduce_path(G,NewG,P1,P2)),
  NewG.

% reduces while keeping the path of the clauses used

reduce_path(G,G,P,P):-is_builtin(G).
reduce_path(','(A,B),','(solve_path(A,P1,P2),solve_path(B,P2,P3)),P1,P3).
reduce_path(G,','(clause(G,Gs),solve_path(Gs,P1,P2)),[':-'(G,Gs)|P1],P2).


% Fluent based meta interpreters
% direct meta-interpreter
metacall(Goal):-
  answer_source(Goal,Goal,E),
  element_of(E,Goal).

% clause unfolder based meta-interpreter
unfold_solve(Goal):-
  unfold(':-'(Goal,Goal),':-'(Goal,true)).

unfold(Clause,Clause).
unfold(Clause,Answer):-
  unfolder_source(Clause,Unfolder),
  element_of(Unfolder,NewClause),
  unfold(NewClause,Answer).

% basics

repeat.
repeat:-repeat.

eq(X,X).

'='(X,X).

and(X,Y):-X,Y.
and(X,Y,Z):-X,Y,Z.
and(X,Y,Z,U):-X,Y,Z,U.
and(X,Y,Z,U,V):-X,Y,Z,U,V.
and(X,Y,Z,U,V,W):-X,Y,Z,U,V,W.

or(X,_):-X.
or(_,X):-X.

';'(X,_):-X.
';'(_,X):-X.

call(X):-X.
call(F,X):-term_append(F,args(X),G),G.
call(F,X,Y):-term_append(F,args(X,Y),G),G.
call(F,X,Y,Z):-term_append(F,args(X,Y,Z),G),G.
call(F,X,Y,Z,U):-term_append(F,args(X,Y,Z,U),G),G.
call(F,X,Y,Z,U,V):-term_append(F,args(X,Y,Z,U,V),G),G.
call(F,X,Y,Z,U,V,W):-term_append(F,args(X,Y,Z,U,V,W),G),G.

term_append(T,X,TX):-
  '=..'(T,Ts),
  '=..'(X,[_|Xs]),
  once(append(Ts,Xs,TsXs)),
  '=..'(TX,TsXs).

map(F,Xs,Ys):-map0(Xs,F,Ys).

map0([],_,[]).
map0([X|Xs],F,[Y|Ys]):-
   call(F,X,Y),
   map0(Xs,F,Ys).
 
foldl(F,Z,Xs,R):-foldl0(Xs,F,Z,R).
  
foldl0([],_,R,R).
foldl0([X|Xs],F,R1,R3):-call(F,R1,X,R2),foldl0(Xs,F,R2,R3).

foldr(F,Z,Xs,R):-foldr0(Xs,F,Z,R).
  
foldr0([],_,Z,Z).
foldr0([X|Xs],F,Z,R2):-foldr0(Xs,F,Z,R1),call(F,X,R1,R2).

sum(Xs,R):-foldl('+',0,Xs,R).

prod(Xs,R):-foldl('*',1,Xs,R).


% INTERACTION

trace:-set_trace(3).
notrace:-set_trace(1).
noundefs:-set_trace(0).
undefs:-set_trace(1).

interactive(yes):-set_max_answers(0).
interactive(no):-set_max_answers(-1).
interactive(Max):-integer(Max),greater(Max,0),set_max_answers(Max).

assertion(Cond,Mes):-
  first_solution(yes,Cond,R),
  show_stacks(R,Mes).

show_stacks(the(_),_).
show_stacks(no,Mes):-trace,stack_dump(Mes),notrace.


% TYPES

var(X):-get_arity(X,-1).
nonvar(X):-not(var(X)).
integer(X):-get_arity(X,-2).
float(X):-get_arity(X,-3).
numeric(X):-if(integer(X),true,float(X)).
number(X):-numeric(X). % alias
atom(X):-get_arity(X,0).
atomic(X):-if(atom(X),true,numeric(X)).
compound(X):-get_arity(X,R),compute('?',R,0,1).
java_object(X):-get_arity(X,-4).

type_of(Object,Type):-
  get_arity(Object,N),
  once(decode_type(N,Type)).

decode_type(0,const).
decode_type(-1,var).
decode_type(-2,integer).
decode_type(-3,float).
decode_type(-4,java_object).
decode_type(X,compound):-compute('?',X,0,1).

sleep(Sec):-compute('*',1000,Sec,Msec),sleep_ms(Msec).

/**
    syntax errors caught in Parser.java
    generate calls to syntax_error/2
	  the same for io_error/2

    !! tricky bootsrapping bug is avoided by generating
    an error message only when it is not _this_ clause - a sufficient
    condition is to have its first arg nonvar, i.e. a meaningful
    error message type. Otherwise, when read in, this clause was
    producing an error and the system was never able to read it in,
    and therefore, never able to handle errors by defining
    error/3 in Prolog
    !!
*/
error(Type,Term,Line):-
  println(error(Type)),
  println(line(Line)),
  println(culprit(Term)),fail.

errmes(Mes,Culprit):-error(Mes,Culprit,0).

/**
  Dynamic database operations: the clause area is
  now the same as the Linda blackboard. If "there"
  is set, the operations can be made to act remotely
  as it is the case with in/1 out/1 etc.
*/
clause(H,B):-
  eq(C,':-'(H,B)),
  all(C,Cs),
  member(C,Cs).

add_clause(H,B):-assert1(':-'(H,B)).

assert(C):-
  if(eq(':-'(_,_),C),
    assert1(C),
    assert1(':-'(C,true))
  ).

retract1(H):-cin(':-'(H,_)).

retract(H):-clause(H,_),retract1(H).

retractall(H):-forall(clause(H,_),retract1(H)).

abolish(F,N):-functor(H,F,N),retractall(H).

all(X,G,Xs):-all(G,Gs),findall(X,member(G,Gs),Xs).

assert1(X):-get_default_db(Db),db_add(Db,X).
cin(X):-cin(X,the(X)).cin(X,R):-get_default_db(Db),db_remove(Db,X,R).
all(X,Xs):-get_default_db(Db),db_collect(Db,X,Xs).
rd(X):-rd(X,the(X)).
rd(X,R):-cin(X,R),do_rd(R).
do_rd(no).
do_rd(the(X)):-assert1(X).
cout(X):-cout(X,_).
cout(X,R):-cin(X,W),do_cout(W,X,R).
do_cout(no,X,no):-assert1(X).
do_cout(the(X0),_,the(X0)).
set_prop(F,X):-functor(T,F,1),cin(T,_),arg(1,T,X),assert1(T).

get_prop(F,X):-functor(T,F,1),all(T,Xs),get_prop_from(Xs,X).

get_prop_from([],no).
get_prop_from([FX],the(X)):-arg(1,FX,X).

listing:-
  db_to_string(S),
  println(S).
  
listing(Pred):-
  pred_to_string(Pred,S),
  println(S).


% INPUT/OUTPUT

end_of_file:- halt.

read_codes(Cs):-readln(L),atom_codes(L,Cs).
readln(L):-
  get_stdin(I),
  file_char_reader(I,CI),
  getfl(CI,L).
% reads a term
read(Term):-read(Term,_,_).

%reads a term with vars and their names
read(Term,Vars,VarNames):-
  read(Clause,Vars,_,VarNames),
  clause_to_term(Clause,Term).

% reds a term with a lot of information
read(Body, Vars, NamedBody, NamedVars):-
  get_stdin(Reader),
  fread(Reader,Body, Vars, NamedBody, NamedVars).
  
fread(Reader,Term):-
  fread(Reader,Clause,_,_,_),
  clause_to_term(Clause,Term).
  
fread(Reader,Term,Vars,VarNames):-
  fread(Reader,Clause,Vars,_,VarNames),
  clause_to_term(Clause,Term).
  
fread(Reader,Body, Vars, NamedBody, NamedVars):-
  getfl(Reader,the(clause(Body,Vars,NamedBody,NamedVars))).


clause_to_term(Clause,Term):-
  if(arg(2,Clause,true),arg(1,Clause,Term),eq(Term,Clause)).

% basic consult operations
consult_source(S):-
  forall(
    element_of(S,clause(C,_,_,_)),
    assert(C)
  ).

un_consult_source(S):-
  forall(
    element_of(S,clause(':-'(H,_),_,_,_)),
    and(functor(H,F,N),abolish(F,N))
  ).
  
reconsult_source(S):-
  split_source(S,S1,S2),
  un_consult_source(S1),
  consult_source(S2).
  
% consulting from strings
consult_string(X):-
  string_clause_reader(X,S),
  consult_source(S).

reconsult_string(X):-
  string_clause_reader(X,S),
  reconsult_source(S).

/*
% consulting from files or URLs - provided as fast builtins
consult_file(X):-
  file_clause_reader(X,S),
  reconsult_source(S).
  
reconsult_file(X):-
  file_clause_reader(X,S),
  reconsult_source(S).
*/

% old operations - roughly the same operations, but in Java  
co:-reconsult_again.

[F|Fs]:-co([F|Fs]).

co(Fs):-if(eq(Fs,[_|_]),co2(Fs),co1(Fs)).

co2([]).
co2([F|Fs]):-once(co1(F)),co2(Fs).

co1(user):-get_stdin(F),reconsult_source(F).
co1(F):-
  add_suffix(F,'.pro',File),
  println(begin(File)),
  reconsult(File),
  println(end(File)).

print_clause(C):-get_stdout(O),fprint_clause(O,C).
println(T):-get_stdout(O),fprintln(O,T).
write(T):-get_stdout(O),fwrite(O,T).
nl:-get_stdout(O),fnl(O).
put_codes(Codes):-get_stdout(O),fput_codes(O,Codes).

fprint_clause(O,T):-fwrite(O,T),fput_codes(O,".\n").
fprintln(O,T):-fwrite(O,T),fnl(O).
fwrite(O,T):-putfl(O,T).
fnl(O):-fput_codes(O,"\n").
fput_codes(O,Codes):-putfl(O,'$string'(Codes)).

discharge(Source):-get_stdout(O),discharge(Source,O).

add_suffix(F,Suf,FSuf):-namecat(F,Suf,FSuf).

namecat(A,B,C,ABC):-
  namecat(A,B,AB),
  namecat(AB,C,ABC).

namecat(F,Suf,FSuf):-
  name_to_chars(F,Cs),
  name_to_chars(Suf,Xs),
  once(append(Cs,Xs,Ds)),
  chars_to_name(0,Ds,FSuf).


% LIST PROCESSING

append([],Ys,Ys).
append([X|Xs],Ys,[X|Zs]):-append(Xs,Ys,Zs).

select(X,[X|S],S).
select(X,[Y|S1],[Y|S2]):- %nonvar(S1),
  select(X,S1,S2).

member(X,[X|_]).
member(X,[_|Xs]):-member(X,Xs).

nth_member(X,Xs,N):-member_i(X,Xs,1,N).

member_i(X,[X|_],N,N).
member_i(X,[_|Xs],N1,N3):-
  compute('+',N1,1,N2),
  member_i(X,Xs,N2,N3).

reverse(Xs,Ys):-rev(Xs,[],Ys).

rev([],Ys,Ys).
rev([X|Xs],Ys,Zs):-rev(Xs,[X|Ys],Zs).

% computes the length of a list
length(Xs,N):-once(length(Xs,0,N)).

length([],N,N).
length([_|Xs],N1,N3):-
   compute('+',1,N1,N2),
   length(Xs,N2,N3).

% ARITHMETICS
compare(OrderRel,X,Y):-
  compute('?',X,Y,IntRel),
  compare_convert(IntRel,OrderRel).

compare_convert(-1,'<').
compare_convert(0,'=').
compare_convert(1,'>').

'+'(X,Y,Z):-compute('+',X,Y,Z).
'-'(X,Y,Z):-compute('-',X,Y,Z).
'*'(X,Y,Z):-compute('*',X,Y,Z).
'/'(X,Y,Z):-compute('/',X,Y,Z).

pow(A,X,R):-compute('pow',A,X,R).

log(A,X,R):-compute('log',A,X,R).

sqrt(X,R):-pow(X,0.5,R).

random(X):-compute('r',1,0,X).

min(X,Y,R):-
  compute('?',X,Y,IntRel),
  if(eq(IntRel,1),eq(R,Y),eq(R,X)).

max(X,Y,R):-
  compute('?',X,Y,IntRel),
  if(eq(IntRel,-1),eq(R,Y),eq(R,X)).

less(X,Y):-compute('?',X,Y,-1).

greater(X,Y):-compute('?',X,Y,1).

lesseq(X,Y):-
  compute('?',X,Y,R),
  less(R,1).

greatereq(X,Y):-
  compute('?',X,Y,R),
  greater(R,-1).

'<'(X,Y):-less(X,Y).
'>'(X,Y):-greater(X,Y).
'=<'(X,Y):-lesseq(X,Y).
'>='(X,Y):-greatereq(X,Y).

% Function evaluator, handling also Prolog style is/2

is(X,E):-once(expr(E,R)),eq(R,X).

expr(E,E):-atomic(E).
expr(E,R):-get_arity(E,2),arg(0,E,Op),
	arg(1,E,E1),arg(2,E,E2),
	expr(E1,X1),
	expr(E2,X2),
  call(Op,X1,X2,R).
expr(E,R):-get_arity(E,1),arg(0,E,Op),
	arg(1,E,E1),
	expr(E1,X1),
  call(Op,X1,R).


% DATA CONVERSION

functor(T,F,N):-if(var(T),new_fun(F,N,T),get_fun(T,F,N)).

get_fun(T,F,N):-
  if(atomic(T),
     eq(x(F,N),x(T,0)),
     and(arg(0,T,F),get_arity(T,N))
  ).

list_to_fun(FXs,T):-list_source(FXs,I),source_term(I,T).

fun_to_list(T,FXs):-term_source(T,I),source_list(I,FXs).

'=..'(T,FXs):-univ(T,FXs).

univ(T,FXs):-if(var(T),list_to_fun(FXs,T),fun_to_list(T,FXs)).

argn(I,T,X):-
  if(nonvar(I),
     arg(I,T,X),
     and(get_arity(T,N),and(for(I,1,N),arg(I,T,X)))
  ).

name(N,Cs):-number_codes(N,Cs).

number_codes(N,Cs):-if(nonvar(N),name_to_chars(N,Cs),chars_to_name(1,Cs,N)).

atom_codes(N,Cs):-if(nonvar(N),name_to_chars(N,Cs),chars_to_name(0,Cs,N)).
numbervars(T):-numbervars(T,T).variant_of(A,B):-numbervars(A,X),numbervars(B,Y),eq(X,Y).

time(G,T):-
  ctime(T1),
  if(G,true,true), 
  ctime(T2),
  compute('-',T2,T1,T).
  
time(G):-
  time(G,T),
  println(goal(G)),
  println(time(T)),
  nl. 
  
 :- ['jsrc/kernelprolog/tests/test'].
  
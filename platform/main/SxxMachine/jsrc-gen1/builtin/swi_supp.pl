
:- module('SxxMachine',[]).
:- op(1150,  fx, (package)).
package(_).
:- package 'SxxMachine'.

:- dynamic('$predicate_property'/4).

:- dynamic('$current_typein_module'/1).
:- dynamic('$current_source_module'/1).
:- dynamic('$current_context_module'/1).

% :- [test].
forall(A,B) :- \+ (call(A), \+ call(B)).

format(S,A,B) :- writeq(S,fmt(A,B)).

:- public(reorder/3).
reorder(IF, First, Second):- 
  call(IF) -> (call(First),call(Second)) ; (call(Second),call(First)). 


:- public setup_call_cleanup/3.
setup_call_cleanup(Setup, Goal, Cleanup) :-
    setup_call_catcher_cleanup(Setup, Goal, _Catcher, Cleanup).

:- public each_call_cleanup/3.
each_call_cleanup(Setup, Goal, Cleanup) :-
	throw_missing(each_call_cleanup(Setup, Goal, _Catcher, Cleanup)).   

:- public setup_call_catcher_cleanup/4.
setup_call_catcher_cleanup(Setup, Goal, Catcher, Cleanup):-
	throw_missing(setup_call_catcher_cleanup(Setup, Goal, Catcher, Cleanup)).
    
    
:- public recorda/2.
:- public recordz/2.
:- public recorded/2.
                               
recorda(Key,Term):- recorda(Key, Term, _).
recordz(Key,Term):- recordz(Key, Term, _).
recorded(Key,Term):- recorded(Key, Term, _).

:- public throw_missing/2.
throw_missing(G):- throw(throw_missing(G)).

instance(Reference, Term):- throw_missing(instance(Reference, Term)).

:- public flag/3.
flag(Key, Old, New):- throw_missing(flag(Key, Old, New)).

:- public source_location/2.
source_location(X,Y):- throw_missing(source_location(X,Y)).

:- public set_predicate_property/2.
set_predicate_property(_:M:P,Prop):- !, nonvar(M), set_predicate_property(M:P,Prop).
set_predicate_property(_:[],_):-!.
set_predicate_property(M:F/A,Prop):- !, set_predicate_property(M,F,A,Prop).
set_predicate_property(M:[X|Y],Prop):- !,
  set_predicate_property(M:X,Prop),
  set_predicate_property(M:Y,Prop).
set_predicate_property(M:(X,Y),Prop):- !,
  set_predicate_property(M:X,Prop),
  set_predicate_property(M:Y,Prop).
set_predicate_property(M:P,meta_predicate):- !, functor(P,F,A), set_predicate_property(M,F,A,meta_predicate(P)).
set_predicate_property(M:P,Prop):- functor(P,F,A), set_predicate_property(M,F,A,Prop).
set_predicate_property(MFA,Prop):-
   strip_module(MFA,M,FA),MFA==FA,!,
   set_predicate_property(M:FA,Prop).
  
:- public ccall/1.  
ccall(G):- clause(:('SxxMachine',G),true).
  
:- public assertz_if_new/1.  
assertz_if_new(G):- ( ccall(G)-> true ; (:('SxxMachine',assertz(G))) ).

:- public((set_predicate_property)/4).
set_predicate_property(M,F,A,Prop):- ccall('$predicate_property'(Prop,M,F,A)),!.
set_predicate_property(M,F,A,Prop):- 
   assertz_if_new('$predicate_property'(defined,M,F,A)),
   assertz_if_new('$predicate_property'(Prop,M,F,A)).
	
:- public((multifile)/1).
multifile(PIs):- set_predicate_property(PIs,multifile).
:- public((discontiguous)/1).
discontiguous(PIs):- set_predicate_property(PIs,discontiguous).
:- public((module_transparent)/1).
module_transparent(PIs):- set_predicate_property(PIs,transparent).
:- public((meta_predicate)/1).
meta_predicate(PIs):- set_predicate_property(PIs,meta_predicate).

%:- public dynamic/1.
%dynamic(PIs):- set_predicate_property(PIs,dynamic).



:- public(ignore/1).
ignore(G):- call(G) -> true; true.

:- public(variant/2).
variant(X,Y):- '$term_variant'(X,Y).

:- public(typein_module/1).
typein_module(User) :- '$current_typein_module'(UserO) -> User=UserO ; User='SxxMachine'.
:- public(source_module/1).
source_module(User) :- '$current_source_module'(UserO) -> User=UserO ; User='SxxMachine'.
:- public((context_module)/1).
context_module(UserO) :- ('$current_context_module'(User);typein_module(User))->User=UserO.

:- public((current_predicate)/1).
current_predicate(Head):- strip_module(Head,M,F/A),current_predicate_m_f_a(M,F,A).

current_predicate_m_f_a(M,F,A):- ccall('$predicate_property'(defined,M,F,A)).
/*
current_predicate_m_f_a(M,F,A):- 
 reorder(    
   (var(F) ; var(A)), 
   predicate_property(':'(M,P),defined), 
   functor(P,F,A) ).
*/

:- public((current_predicate)/2).
current_predicate(Name, Head):- 
  predicate_property(Head,_),
  strip_module(Head,M,P),
  functor(P,F,_),
  strip_module(Name,M,F).

:- public((predicate_property)/2).
predicate_property(MPred,Prop):- strip_module(MPred,M,Pred), 
  reorder(var(Pred), ccall('$predicate_property'(Prop,M,F,A)),functor(Pred,F,A)).   

  

strip_module(T,M,T):- var(T),!,context_module(M).
strip_module(M:Cl,M,Cl):- !.
strip_module(T,M,T):-context_module(M).

%member(X,[1,2,3]) *-> write(X) ; write(0).

:- op(1150,xfy,('*->')).
:- public(( *-> )/2).
((IF *-> THEN ; ELSE)) :- 
  (Succeed1 = sols(0), 
   (((call(IF),nb_setarg(1,Succeed1,some)),call(THEN));
     (Succeed1 = sols(0),call(ELSE)))).

/*
(IF *-> THEN; ELSE) :-
  '$get_current_B'(Cut),
   Succeed1 = sols(0), P = user, Mode = interpret, Depth = 0,
  ((( '$meta_call'(IF, P, Cut, Depth, Mode),nb_setarg(1,Succeed1,some)),
      '$meta_call'(THEN, P, Cut, Depth, Mode) ) ; 
      (Succeed1 = sols(0),'$meta_call'(ELSE, P, Cut, Depth, Mode))).
*/

:- public(maplist/2).
maplist(P,[H|T]) :- !,call(P,H),maplist(P,T).
maplist(_,_).
:- public(maplist/3).
maplist(P,[H1|T1],[H2|T2]) :- !,call(P,H1,H2),maplist(P,T1,T2).
maplist(_,_,_).
:- public(maplist/4).
maplist(P,[H1|T1],[H2|T2],[H3|T3]) :- !,call(P,H1,H2,H3),maplist(P,T1,T2,T3).
maplist(_,_,_,_).

:- public(call/2).
call(P,A) :- P=..[F|ARGS],append(ARGS,[A],ARGSA),G=..[F|ARGSA],call(G).
:- public(call/3).
call(P,A,B) :- P=..[F|ARGS],append(ARGS,[A,B],ARGSA),G=..[F|ARGSA],call(G).
:- public(call/4).
call(P,A,B,C) :- P=..[F|ARGS],append(ARGS,[A,B,C],ARGSA),G=..[F|ARGSA],call(G).



%:- requires('$skip_list'/3).
is_cons(C):-compound(C),C=[_|_].


%:- requires(is_list/1).
is_list(C):- \+ compound(C),!, C==[].
is_list([_|C]):- is_list(C).

%!  member(?Elem, ?List)
%
%   True if Elem is a  member   of  List.  The SWI-Prolog definition
%   differs from the classical one.  Our definition avoids unpacking
%   each list element twice and  provides   determinism  on the last
%   element.  E.g. this is deterministic:
%
%       ==
%           member(X, [One]).
%       ==
%
%   @author Gertjan van Noord

member(El, [H|T]) :-
    member_(T, El, H).

member_(_, El, El).
member_([H|T], El, _) :-
    member_(T, El, H).

%!  append(?List1, ?List2, ?List1AndList2)
%
%   List1AndList2 is the concatenation of List1 and List2

append([], L, L).
append([H|T], L, [H|R]) :-
    append(T, L, R).

%!  append(+ListOfLists, ?List)
%
%   Concatenate a list of lists.  Is  true   if  ListOfLists  is a list of
%   lists, and List is the concatenation of these lists.
%
%   @param  ListOfLists must be a list of _possibly_ partial lists
/*
append(ListOfLists, List) :-
    %must_be(list, ListOfLists),
    append_(ListOfLists, List).

append_([], []).
append_([L|Ls], As) :-
    append(L, Ws, As),
    append_(Ls, Ws).
*/
%!  flatten(+NestedList, -FlatList) is det.
%
%   Is true if FlatList is a  non-nested version of NestedList. Note
%   that empty lists are removed. In   standard Prolog, this implies
%   that the atom '[]' is removed  too.   In  SWI7, `[]` is distinct
%   from '[]'.
%
%   Ending up needing flatten/2 often   indicates, like append/3 for
%   appending two lists, a bad design. Efficient code that generates
%   lists from generated small  lists   must  use  difference lists,
%   often possible through grammar rules for optimal readability.
%
%   @see append/2

flatten(List, FlatList) :-
    flatten(List, [], FlatList0),
    !,
    FlatList = FlatList0.

flatten(Var, Tl, [Var|Tl]) :-
    var(Var),
    !.
flatten([], Tl, Tl) :- !.
flatten([Hd|Tl], Tail, List) :-
    !,
    flatten(Hd, FlatHeadTail, List),
    flatten(Tl, Tail, FlatHeadTail).
flatten(NonList, Tl, [NonList|Tl]).


printAll(G):- call(G),writeq(G),nl,fail.
printAll(_).


random(X):- X is random(0).

go(1):- freeze(X,integer(X)),X=1.
go(2):- freeze(X,integer(X)), X \= 1.0.
go(3):- not(not(freeze(X,integer(X)))), X = 1.0.
go(4):- \+ \+ freeze(X,integer(X)), X = 1.0.

go(11):- freeze(X,integer(X)),freeze(X2,integer(X2)),copy_term(X+X2,Y+Y2),printAll(frozen(Y2,O)).

go(12):- freeze(X,integer(X)),printAll(frozen(X,O)).

go(13):- freeze(X,integer(X)),copy_term(X,Y),printAll(frozen(Y,O)).

go(14):- freeze(X,integer(X)),copy_term_nat(X,Y),printAll(frozen(Y,O)).
go(15):- freeze(X,integer(X)),copy_term_att(X,Y),printAll(frozen(Y,O)).

go(16):- freeze(X,integer(X)),copy_term_att(X,Y),frozen(Y,O),frozen(X,XX).
go(17):- freeze(X,integer(X)),copy_term_nat(X,Y),frozen(Y,O),frozen(X,XX).

go(18):- random(X),write(X),nl,fail.

go(19):- peek_pending(X).

go(20):- freeze(X,integer(X)),freeze(X2,integer(X2)),copy_term(X+X2,Y,Z).

go(21):- freeze(X,integer(X)),freeze(X2,integer(X2)),copy_term(X+X2,Y,Z).


%:- listing(go/1).


%lists:member(X,L):- user:member(X,L).

%:-  listing(lists:_).

initpp:- set_predicate_property(is_cons(_), builtin).

'$current_typein_module'('SxxMachine').
'$current_context_module'('SxxMachine').

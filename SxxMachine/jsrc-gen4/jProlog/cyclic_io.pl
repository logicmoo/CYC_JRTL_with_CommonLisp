%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Builtin Predicates of Prolog Cafe
%
% Mutsunori Banbara (banbara@kobe-u.ac.jp)
% Naoyuki Tamura (tamura@kobe-u.ac.jp)
% Kobe University
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
:- op(1150,  fx, (package)).
package(_).
:- package 'SxxMachine'.

%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
% Control constructs
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
canonical_term(Term, Canonical, Print) :-
 Term =.. InList,
 decompose_cyclic_term(Term, InList, OutList, OpenEnd, [Term],
 PrintList-Cycle_mark, 0),
 Canonical =.. OutList,
 Canonical = OpenEnd,
 Print =.. PrintList,
 Cycle_mark = cycle_at_depth(0).

decompose_cyclic_term(_CyclicTerm, [], [], _OpenEnd, _Stack, []-_, _).
decompose_cyclic_term(CyclicTerm, [Term|Tail], [Term|NewTail], OpenEnd, Stack, [Term|NewPrintTail]-Cycle_mark, DepthCount) :-
 acyclic_term(Term), !,
 decompose_cyclic_term(CyclicTerm, Tail, NewTail, OpenEnd, Stack,NewPrintTail-Cycle_mark, DepthCount).
 decompose_cyclic_term(CyclicTerm, [Term|Tail], [OpenEnd|NewTail], OpenEnd,Stack, [Cycle_mark|NewPrintTail]-Cycle_mark, DepthCount) :-
 CyclicTerm == Term, !, 
 decompose_cyclic_term(CyclicTerm, Tail, NewTail, OpenEnd, Stack, NewPrintTail-Cycle_mark, DepthCount).

decompose_cyclic_term(CyclicTerm, [Term|Tail], [Canonical|NewTail],OpenEnd, Stack, [Print|NewPrintTail]-Cycle_mark, DepthCount) :-
 \+ instack(Term, Stack), !,
 Term =.. InList,
 NewDepthCount is DepthCount + 1,
 decompose_cyclic_term(Term, InList, OutList, OpenEnd2, [Term|Stack], PrintList-Cycle_mark_2, NewDepthCount),
 Canonical =.. OutList, 
 Print =.. PrintList,
 (( Canonical = OpenEnd2, 
   Canonical == Term,
   Cycle_mark_2 = cycle_at_depth(NewDepthCount),
    !); 
   (OpenEnd2 = OpenEnd, Cycle_mark_2 = Cycle_mark)
  ),
 decompose_cyclic_term(CyclicTerm, Tail, NewTail, OpenEnd, Stack,NewPrintTail-Cycle_mark, DepthCount).

decompose_cyclic_term(CyclicTerm, [_Term|Tail], [OpenEnd|NewTail], OpenEnd, Stack, [Cycle_mark|NewPrintTail]-Cycle_mark, DepthCount) :-
 decompose_cyclic_term(CyclicTerm, Tail, NewTail, OpenEnd, Stack,NewPrintTail-Cycle_mark, DepthCount).

instack(E, [H|_T]) :- E == H, !.
instack(E, [_H|T]) :- instack(E, T).


/*

?- _A = [a|_A], canonical_term(_A, _A, Print).
_A = [a|_A],
Print = [a|cycle_at_depth(0)] .

?- _A = [a|_B], _B = [b|_B], canonical_term(_A, _, Print).
Print = [a,b|cycle_at_depth(1)]

?- _A = [a|_B], _B = [b|_B], _F = f(foo, _A, _B, _F), canonical_term(_F, _, Print).

Print = f(foo, [a,b|cycle_at_depth(2)], [b|cycle_at_depth(1)],
cycle_at_depth(0))

*/



%!  term_factorized(+Term, -Skeleton, -Substiution)
%
%   Is true when Skeleton is  Term   where  all subterms that appear
%   multiple times are replaced by a  variable and Substitution is a
%   list of Var=Value that provides the subterm at the location Var.
%   I.e., After unifying all substitutions  in Substiutions, Term ==
%   Skeleton. Term may be cyclic. For example:
%
%     ==
%     ?- X = a(X), term_factorized(b(X,X), Y, S).
%     Y = b(_G255, _G255),
%     S = [_G255=a(_G255)].
%     ==

term_factorized(Term, Skeleton, Substitutions) :-
    rb_new(Map0),
    add_map(Term, Map0, Map),
    rb_visit(Map, Counts),
    common_terms(Counts, Common),
    (   Common == []
    ->  Skeleton = Term,
        Substitutions = []
    ;   ord_list_to_rbtree(Common, SubstAssoc),
        insert_vars(Term, Skeleton, SubstAssoc),
        mk_subst(Common, Substitutions, SubstAssoc)
    ).

add_map(Term, Map0, Map) :-
    (   primitive(Term)
    ->  Map = Map0
    ;   rb_update(Map0, Term, Old, New, Map)
    ->  New is Old+1
    ;   rb_insert(Map0, Term, 1, Map1),
        assoc_arg_map(1, Term, Map1, Map)
    ).

assoc_arg_map(I, Term, Map0, Map) :-
    arg(I, Term, Arg),
    !,
    add_map(Arg, Map0, Map1),
    I2 is I + 1,
    assoc_arg_map(I2, Term, Map1, Map).
assoc_arg_map(_, _, Map, Map).

primitive(Term) :-
    var(Term),
    !.
primitive(Term) :-
    atomic(Term),
    !.
primitive('$VAR'(_)).

common_terms([], []).
common_terms([H-Count|T], List) :-
    !,
    (   Count == 1
    ->  common_terms(T, List)
    ;   List = [H-_NewVar|Tail],
        common_terms(T, Tail)
    ).

insert_vars(T0, T, _) :-
    primitive(T0),
    !,
    T = T0.
insert_vars(T0, T, Subst) :-
    rb_lookup(T0, S, Subst),
    !,
    T = S.
insert_vars(T0, T, Subst) :-
    functor(T0, Name, Arity),
    functor(T,  Name, Arity),
    insert_arg_vars(1, T0, T, Subst).

insert_arg_vars(I, T0, T, Subst) :-
    arg(I, T0, A0),
    !,
    arg(I, T,  A),
    insert_vars(A0, A, Subst),
    I2 is I + 1,
    insert_arg_vars(I2, T0, T, Subst).
insert_arg_vars(_, _, _, _).

mk_subst([], [], _).
mk_subst([Val0-Var|T0], [Var=Val|T], Subst) :-
    functor(Val0, Name, Arity),
    functor(Val,  Name, Arity),
    insert_arg_vars(1, Val0, Val, Subst),
    mk_subst(T0, T, Subst).


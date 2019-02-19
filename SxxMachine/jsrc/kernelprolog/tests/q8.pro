% Variant of a program by T. Fruhwrith
/*
  go: 87.586s jre + jvc -g
*/

bm:-queens(11,_Qs),fail.
bm:-write(all(queens(11))),nl.

go:-go(_X),write(x),fail.
go.

go(Qs):-queens(8,Qs).

queens(N,Ps):-
  gen_places(N,Ps),
  gen_queens(N,Qs),
  place_queens(Qs,Ps,_,_).

% at each step inc Us and dec Ds
place_queens([],_,_,_).
place_queens([I|Is],Cs,Us,[_|Ds]):-
  place_queens(Is,Cs,[_|Us],Ds),
  place_queen(I,Cs,Us,Ds).

place_queen(I,[I|_],[I|_],[I|_]).
place_queen(I,[_|Cs],[_|Us],[_|Ds]):-
  place_queen(I,Cs,Us,Ds).

gen_places(Max,Ps):-
  findall(_,for(_,1,Max),Ps).

gen_queens(Max,Qs):-
  findall(Q,for(Q,1,Max),Qs).



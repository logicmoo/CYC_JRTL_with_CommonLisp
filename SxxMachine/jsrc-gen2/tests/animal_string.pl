
:- set_prolog_flag(double_quotes,string).

animal_string(goat).
animal_string("elephant").
animal_string(X) :-
	write("please type one more animal name: "),
	read(X).

	
:- set_prolog_flag(double_quotes,chars).
	
	
animal_chars(goat).
animal_chars("elephant").
animal_chars(X) :-
	write("please type one more animal name: "),
	read(X).	
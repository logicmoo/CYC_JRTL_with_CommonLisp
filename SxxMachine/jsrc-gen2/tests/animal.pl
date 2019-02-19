

animal(goat).
animal(elephant).
animal(X) :-
	write('please type one more animal name: '), flush_output,
	read(X).

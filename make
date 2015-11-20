xyz: main.o palindrome.o
	gcc -o xyz main.o palindrome.o
	
palindrome.o: palindrome.c
	gcc -c palindrome.c
main.o: main.c
	gcc -c main.c
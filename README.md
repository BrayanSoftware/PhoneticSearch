# PhoneticSearch
Phonetic Search: Challenge From A Recruiter and My Solutions. 

The Task

Phonetic Search

Your program must read a list of surnames from standard input (i.e. the console or terminal —

see http://en.wikipedia.org/wiki/Standard_streams), one per line. The command-line arguments to your 

program will be one or more surnames. For each of those surnames you must print out all of the names in the 

input list that match those on the command-line. If the command-line arguments were "Smith" and "Jones", 

and each matched three names in the input data, then you should print out (with the appropriate punctuation 

as shown):

Smith: Smidt, Smith, Smyth

Jones: Johns, Jonas, Jones

The matching algorithm is as follows:

1. All non-alphabetic characters are ignored

2. Word case is not significant

3. After the first letter, any of the following letters are discarded: A, E, I, H, O, U, W, Y.

4. The following sets of letters are considered equivalent

 A, E, I, O, U

 C, G, J, K, Q, S, X, Y, Z

 B, F, P, V, W

 D, T

 M, N

 All others have no equivalent

5. Any consecutive occurrences of equivalent letters (after discarding letters in step 3) are considered as 

a single occurrence

The rules should be applied in that order. So, given a file "surnames.txt" that contains the following data:

Smith

Smyth

Smythe

Smid

Schmidt

Smithers

Jonas

Johns

Johnson

Macdonald

Nest O'Malett

Ericsson

Erikson

Saunas

Van Damme

Running your program from the command-line like this:

MyProgram Jones Winton < surnames.txt

Should print out:

Jones: Jonas, Johns, Saunas

Winton: Van Damme

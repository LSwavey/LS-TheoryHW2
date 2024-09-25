# LS-TheoryHW2
NWMSU - School of CSIS
Theory & Impl. of Prog. Lang. (CSIS 44-525)
Fall 2024
Hw#2 Due Date Wed. Sept. 25, 11:59PM
Submit a soft copy of your program with the specification how to run it. Name your program
RegExpNonOverlap.py and RegExpPassword.java. Comment your programs. Zip both
Ex#1 and Ex#2 and submit it as a single document.
Ex#1: 10 pts Python Regular Expressions
After spending a substantial amount of time on regular expressions and their use in many
CS applications and courses (i.e., web services, compilers, programming languages and
operating systems), you will be writing a short program in Python to implement the
concept of regular expressions.
Several languages offer constructs to handle regular expressions and their respective op-
erations, beyond the operations that we have covered in class such as “*”, “.”, and “+”.
For example, regular expressions are used in Python, Java, Java Script, C# PHP, Swift,
and Ruby. Different languages have various operations or quantifiers. In this exercise,
you will be using Python to express some regular expressions operations. There are many
sites on this topic that you can refer to. For example, some regular expression operations
(i.e., quantifiers) in Python that you will be using in the assignments are:
Table 1: Some of regular expression quantifiers in Python
Quantifiers Meaning with examples
∗ zero or more, ’a’
+ 1 or more, ’a’
[ab] either ’a’ or ’b’
a[ab]∗ ’a’ followed by zero or more ’a’ or ’b’
a[ab]+ ’a’ followed by one or more ’a’ or ’b’
? 0 or 1, ab? ’a’ followed by zero ‘b’ or one ’b’
{m} a{6} will match exactly 6 ’a’
{m, n} match from m to n, a{3, 5} will match from 3 to 5 ’a’
{4} exactly 4 times
{, 3} at most 3 times
{5, } minimum 5 times
ab{3}? ’a’ followed by three ’b’
Task: No-overlapping Patterns:
Write a python function named T estRegExp(...) that receives any of the above regular
expressions and a string. T estRegExp(...) checks whether the string could be found in
the regular expression. You may need to import re and you may use re.finditer() which
returns all non-overlapping matches of patterns. There are other similar functions to
re.finditer() such as re.findall().
Assume that the regular expression is r = ab and the string is s = abaaaabbbaabba. Then
you want to check whether or not the non-overlapping pattern ab can be found in s. The
invocation of the function T estRegExp(...) should look something like T estRegExp(s, r).
There is no need to consider overlapping. A sample of input/output is:
For example:
s = abaaaabbbaabba
r = ab
TestRegExp(s, r)) returns
1. "ab" is found at index 0
2. "ab" is found at index 5
3. "ab" is found at index 10
Here is another run:
s = abaaaaabbbaabbaa and r = ab+
TestRegExp (s, r)
abaaaaabbbaabbaa
1. ab is found at index 0
2. abbb is found at index 6
3. abb is found at index 11
Ex#2: 10 pts Java Regular Expressions
In this exercise, you will be using Java to express some regular expressions operations.
There are many sites on this topic that you can refer to. For example, there are several
regular expression operations (i.e., quantifiers) in Java that you will be using in the assign-
ment. In addition, you need to include some predefined classes, java.util.regex.Matcher
and java.util.regex.Pattern. Here is a good tutorial to refer to:
https : //www.tutorialspoint.com/java/javaregularexpressions.htm
Write a Java program to check the validity of password. A password is considered valid
if all the following constraints are satisfied:
• It contains at exactly 8 characters.
• It starts with an Upper case alphabet and followed by any upper case, lower case or
digits.
• It ends with one special character: !@#$%&
• It does not contain any white space.
A sample of input/output
--> Enter the password:
CSIS525%
Correct password
Another input/output
--> Enter the password:
CSIS525F!
Incorrect password:
--> Enter again your password:
CSIDF#
Incorrect password:
--> Enter again your password:
4578AA$
Incorrect password:
--> Enter again your password:
Fellah24@
Correct password
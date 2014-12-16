## Welcome to the ReversePolishNotationCalculator wiki!

**Reverse Polish notation (RPN)** is a mathematical notation in which every operator follows all of its operands, in contrast to Polish notation, which puts the operator in the prefix position. It is also known as ** postfix notation** and is parenthesis-free as long as operator arities are fixed.

> Exercise: Basic Reverse Polish Notation (RPN) Calculator in Scala

The RPN notation is also known as postfix expression. The capabilities of the Calculator are as follows:
1. Supports operations for sum, difference, division, multiplication.
2. Supports floating point operations.
3. Use '^' for exponent operator. values entered as "X Y ^" are calculated as X to the power of Y.
4. Use '%' for the percent operation. values entered as "X %" are calculated as X/100.
5. Use ‘!’ for Factorial (unary operation).

In this exercise, I have created 3 possible ways of solve this problem.
* Using Map as operational methods + Scala mutable stack + switch-case pattern matching.
* Using Scala mutable stack and switch-case pattern matching.
* Using list cons operation + switch-case pattern matching.

In order to resolve exercise, I have also use some scala's cool feature called unary(pre-fix method) method, implicit conversion and trait. You can also find Scala test for all 3 implementations.

Sample Input and Output:
 
1. Input: 1 2 3 + -
   Output: -4
 
2. Input: 6 2 * 3 /
   Output: 4
 
3. Input: 2 3 ^ 4 5 + +
   Output: 17
 
4. Input: 50 % 2 *
   Output: 1
 
5. Input: 3 ! 4 5 * +
   Output: 26
 
6. Input: 12 3 / !
   Output: 24
 
7. Input: 5 1 2 + 4 * + 3 -
   Output: 14

Please feel free to share your feedback.

Thanks   
 

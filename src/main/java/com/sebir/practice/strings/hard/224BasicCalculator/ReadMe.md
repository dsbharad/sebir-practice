# 224. Basic Calculator 

URL: https://leetcode.com/problems/basic-calculator/description/?envType=problem-list-v2&envId=string

_<u>Problem statement</u>_: Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().

**Example 1:**

Input: s = "1 + 1"
Output: 2

**Example 2:**

Input: s = " 2-1 + 2 "
Output: 3

**Example 3:**

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23

 
**Constraints:**

	1.  1 <= s.length <= 3 * 105
	2.  s consists of digits, '+', '-', '(', ')', and ' '.
	3.  s represents a valid expression.
	4.  '+' is not used as a unary operation (i.e., "+1" and "+(2 + 3)" is invalid).
	5.  '-' could be used as a unary operation (i.e., "-1" and "-(2 + 3)" is valid).
	6.  There will be no two consecutive operators in the input.
	7.  Every number and running calculation will fit in a signed 32-bit integer.
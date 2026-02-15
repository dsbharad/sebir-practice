# 726. Number of Atoms

URL: https://leetcode.com/problems/number-of-atoms/description/?envType=problem-list-v2&envId=string

_<u>Problem statement</u>_: Given a string formula representing a chemical formula, return the count of each atom.

The atomic element always starts with an uppercase character, then zero or more lowercase letters, representing the name.

One or more digits representing that element's count may follow if the count is greater than 1. If the count is 1, no digits will follow.

For example, "H2O" and "H2O2" are possible, but "H1O2" is impossible.

Two formulas are concatenated together to produce another formula.

For example, "H<sub>2</sub>O<sub>2</sub>He<sub>3</sub>Mg<sub>4</sub>" is also a formula.

A formula placed in parentheses, and a count (optionally added) is also a formula.

For example, "(H<sub>2</sub >O<sub>2</sub>)" and "(H<sub>2</sub>O<sub>2</sub>)<sub>3</sub>" are formulas.

Return the count of all elements as a string in the following form: the first name (in sorted order), followed by its count (if that count is more than 1), followed by the second name (in sorted order), followed by its count (if that count is more than 1), and so on.

The test cases are generated so that all the values in the output fit in a 32-bit integer.

 
**Example 1:**

Input: formula = "H<sub>2</sub >O"
Output: "H2O"
Explanation: The count of elements are {'H': 2, 'O': 1}.

**Example 2:**

* Input: formula = "Mg(OH)<sub>2</sub>"
* Output: "H2OMgO2"
* Explanation: The count of elements are {'H': 2, 'Mg': 1, 'O': 2}.

**Example 3:**

Input: formula = "K4(ON(SO3)2)2"
Output: "K4N2O14S4"
Explanation: The count of elements are {'K': 4, 'N': 2, 'O': 14, 'S': 4}.

 
Constraints:

	1 <= formula.length <= 1000
	formula consists of English letters, digits, '(', and ')'.
	formula is always valid.
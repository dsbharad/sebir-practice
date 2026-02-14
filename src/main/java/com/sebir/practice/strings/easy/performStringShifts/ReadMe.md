# 1427. Perform String Shifts

You are given a string s containing lowercase English letters, and a matrix shift, where shift[i] = [direction, amount]:
    1. direction can be 0 (for left shift) or 1 (for right shift). 
    2. amount is the amount by which string s is to be shifted.
    3. A left shift by 1 means remove the first character of s and append it to the end.
    4. Similarly, a right shift by 1 means remove the last character of s and add it to the beginning.

_<u>Problem statement</u>_: Return the final string after all operations.

**Example 1:**

    Input: s = "abc", shift = [[0,1],[1,2]]
    Output: "cab"
    Explanation: 
        [0,1] means shift to left by 1. "abc" -> "bca"
        [1,2] means shift to right by 2. "bca" -> "cab"

**Example 2:**

    Input: s = "abcdefg", shift = [[1,1],[1,1],[0,2],[1,3]]
    Output: "efgabcd"
    Explanation: 
        [1,1] means shift to right by 1. "abcdefg" -> "gabcdef"
        [1,1] means shift to right by 1. "gabcdef" -> "fgabcde"
        [0,2] means shift to left by 2. "fgabcde" -> "abcdefg"
        [1,3] means shift to right by 3. "abcdefg" -> "efgabcd"

**Constraints:**

    1. 1 <= s.length <= 100
    2. s only contains lower case English letters.
    3. 1 <= shift.length <= 100
    4. shift[i].length == 2
    5. 0 <= shift[i][0] <= 1
    6. 0 <= shift[i][1] <= 100
# 943. Find the Shortest Superstring

URL: https://leetcode.com/problems/find-the-shortest-superstring/description/?envType=problem-list-v2&envId=string

_<u>Problem statement</u>_: Given an array of strings words, return the smallest string that contains each string in words as a substring. If there are multiple valid strings of the smallest length, return any of them.

You may assume that no string in words is a substring of another string in words.

 
**Example 1:**

    Input: words = ["alex","loves","leetcode"]
    Output: "alexlovesleetcode"
    Explanation: 
        All permutations of "alex","loves","leetcode" would also be accepted.

**Example 2:**

    Input: words = ["catg","ctaagt","gcta","ttca","atgcatc"]
    Output: "gctaagttcatgcatc"

 
**Constraints:**

	1.  1 <= words.length <= 12
	2.  1 <= words[i].length <= 20
	3.  words[i] consists of lowercase English letters.
	4.  All the strings of words are unique.
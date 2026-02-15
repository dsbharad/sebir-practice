# 140. Word Break II
URL: https://leetcode.com/problems/word-break-ii/description/?envType=problem-list-v2&envId=string

_<u>Problem statement</u>_: Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 
**Example 1:**

Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]

**Example 2:**

Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.

**Example 3:**

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []

 
**Constraints:**

	1.= s.length <= 20
	2.  1 <= s.length <= 20
	3.  1 <= wordDict.length <= 1000
	4.  1 <= wordDict[i].length <= 10
	5.  s and wordDict[i] consist of only lowercase English letters.
	6.  All the strings of wordDict are unique.
	7.  Input is generated in a way that the length of the answer doesn't exceed 105.
# 10.Regular Expression Matching
 > Given an input string (s) and a pattern (p), implement regular expression matching with support for '.' and '*'. 

> '.' Matches any single character.
 '*' Matches zero or more of the preceding element.
 
 应该采用递归的思想做解 
 
 .的判别就是首字母是否相同 或者一个为字母 一个为.
 
 然后判断 是否是*的模式
 不是的话 直接递归查询
 是的话，判断首字母是否相同 相同的话字符串弹出一个字符 继续匹配
 不相同舍弃模式的两个字符
 
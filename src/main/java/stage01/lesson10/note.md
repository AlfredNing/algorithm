# 暴力递归
暴力递归就是尝试
1. 把问题转行为规模缩小了的同类问题的子问题
2. 有明确的不需要进行递归的条件（base case）
3. 有当得到了子问题的结果之后的决策过程
4. 不记录每一个子问题的解 == 暴力
## Dijkstra算法 Dijkstra
1. Dijkstra算法必须指定一个源点
2. 生成一个源点到各个点的最小距离表，一开始只有一条记录，即源点到自己的最小距离为0，
源点到其他所有点的最小记录都为正无穷大
3. 从距离表中拿出没拿过记录里的最小纪录，通过这个点发出的边，更新源点到各个点的最小距离表，不断重复这一步
4. 源点到所有的点记录如果没拿过一遍，过程停止，最小距离表得到了
**前提没有负数的边**
---
1. 汉诺塔问题 也被称为河内塔问题 Hanoi
最优步数是 2^n - 1
2. 给你一个栈，逆序一个栈 ReverseStackUsingRecursive
不能申请额外的数据结构
只能使用递归函数
3. 打印一个字符串的全部子序列  stage01.lesson10.PrintAllSubsequence.subs
注意子序列≠子串 
4. 打印一个字符串的全部子序列，要求不出现重复的字面值的子序列  stage01.lesson10.PrintAllSubsequence.subsNoRepeat
5. 打印一个字符串的全部排列 stage01.lesson10.PrintAllPermutations.permutaions
6. 打印一个字符串的全部排列，要求不能出现重复的排列 stage01.lesson10.PrintAllPermutations.permutaions2
7. **从左到右的尝试模型1** ConvertToLetterString
规定1和A对应、2和B对应、3和C对应...
那么一个数字字符串比如"111"就可以转化为：
“AAA”,"KA","AK"
给定一个只有数字字符组成的字符串str,返回有多少种转化结果
隐含题意：0是没法转的
8. 从左往右尝试模型2 Knapsack
给定两个长度都为N的数组weights和Values,
weight[i] 和values[i] 分别代表i号的物品的重量和价值
给定一个正数bag,表示一个载重bag的袋子，
你装的物品不能超过这个重量，返回你能装下的最多的价值的多少

class 19 4-13 01:31:02 

## 蓄水池问题

---
## 题目
1. 斐波那契数列，O(n) 级别优化成 O(logn)  FibonacciProblem 状态不转移
推广
设F(n) = C1F(n-1) + C2F(n-2) + CkF(n-k) 满足, 一定有log(n)的解法 最后的k 就称为它为几阶问题
F(n)F(n-1)F(n - k + 1) = Fk...F1  * 一个K阶矩阵的n-k次方
2. 给定一个数N,想象只有0和1两种字符，组成所有长度为N的字符串，如果某个字符串，任何0字符左边有1，则认为达标
请返回达标的数量
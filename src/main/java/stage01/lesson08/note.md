## 二叉树递归实践 -续
1. 给定一棵二叉树的头结点head, 返回这棵二叉树是不是满二叉树 IsFull
满二叉树的特点：高度L,节点数为N 满足 2^L - 1 = N
2. 给定一棵二叉树的头结点head,返回这棵二叉树的最大的二叉搜索子树的头结点  MaxSubBSTHead 
3. 给定一棵二叉树的头结点head,返回这棵二叉树是不是完全二叉树   IsCST
4. 给定一棵二叉树的头结点head,和另外节点两个节点a和b,返回a和b的最低公共祖先LowAncestor
#＃　贪心算法
１.　最自然智慧的算法呢
２.　用一种局部最功利的标准，总是做出在当前看来是最好的选择
３.　**难点在于证明局部最功利的标准可以得到全局最优解**
４.　**对于贪心的算法的学习主要以增加阅历和经验为主**
---
1. 给定一个字符串数组strs,必须把所有的字符串拼接起来，返回所有可能的拼接结果中，字典序最小的结果  LowestLexicography

### 贪心算法的求解的标准过程
1. 分析业务
2. 根据业务逻辑找到不同的的谈心策略
3. 对于能举出例的策略直接跳过，不能举出反例的策略证明其有效性
**要求数学能力很高且不具有同意的技巧性**
### 贪心算法的解题套路
1. 实现一个不依靠谈心策略的解法x,可以用最暴力的常识
2. 脑补出贪心策略A,贪心策略B/C...
3. 用解法ABC...和对数器，实验得知哪个贪新策略准确
4. 不要去纠结谈心策略的证明
贪心题目：
1. 一些项目要占用一个会议室宣讲，会议室不能同时容纳两个项目的演讲。
给你每一个项目开始的时间和结束的时间。你来安排宣讲的日程。
要求会议室进行的宣讲的场次最多。返回最多的宣讲场次。 BestArrange
2. 给定一个字符串，只由'X' 和‘.’两种字符构成，‘X’表示墙，不能放灯，也不需要点亮
‘.’表示居民点，可以放灯需要点亮，如果灯放在i位置，可以让i、i-1、i+1位置被点亮
返回如果点亮str中所有需要点亮的位置，至少需要几盏灯。 Light
3. 一块金条分成两半，需要花费和金额长度一样的铜板，输入一个数组，返回切割的最小代价。 LessMoneySplitGold
4. 输入正数数组cost:代表i号项目的花费
profits[i]表示i号项目扣除花费之后的利润
k表示最多只能做k个项目
M表示初始资金。
返回最后获得的最大钱数  IPO
------------------------------------- ---------
## 并查集合
1. 有若干样本a,b,c,d 类型是T
2. 在并查集中一开始可以认为任何每个一个样本都在单独的集合里面
3. 用户可以申请在任何时候调用如下两个方法
- boolean isSameSet(T x,T y):查询样本x,y是否在同一个集合里面
- void union(T x, T y) :把x、y样本所在样本集合合并成一个大集合
4. isSameSet() 和 union() 方法的代价越低越好   UnionFindSet
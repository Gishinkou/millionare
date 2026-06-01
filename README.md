# mybatis Hot 100 - Java 框架

每道题一个文件,带 `main` + 内置 case,直接在 IDEA 里右键 Run 即可看结果。

## 目录结构

```
src/main/java/hot100/
├── common/        # ListNode, TreeNode, Assert(简易断言工具)
├── array/         # 普通数组、矩阵
├── hashtable/     # 哈希
├── twopointers/   # 双指针
├── slidingwindow/ # 滑动窗口
├── substring/     # 子串
├── linkedlist/    # 链表
├── tree/          # 二叉树
├── graph/         # 图
├── backtrack/     # 回溯
├── binarysearch/  # 二分
├── stack/         # 栈
├── heap/          # 堆
├── greedy/        # 贪心
├── dp/            # 一维 DP
├── multidim/      # 多维 DP
└── tech/          # 技巧
```

文件命名:`P{题号}_{驼峰题名}.java`,例 `P1_TwoSum.java`。

## 用法

1. IDEA 打开 `mybatis-hot100` 目录(自动识别为 Maven 项目,JDK 17)。
2. 打开任意 `Pxxx_*.java`,在方法体里把 `// TODO` 替换为你的实现。
3. 右键文件 → Run 'Pxxx_xxx.main()',控制台会打印每条 case 的 PASS/FAIL。

## Assert 工具

`hot100.common.Assert` 提供:
- `Assert.eq(actual, expected)` - 自动对 `int[]` / `int[][]` / `Object[]` 做深比较
- `Assert.eq(name, actual, expected)` - 带 case 名
- `Assert.summary()` - 打印总数

## 特殊题(类设计型)

以下题目以内部 class 形式呈现,在 `main` 中直接 new 并调用:

- 146 LRU Cache
- 155 MinStack
- 208 Trie
- 295 MedianFinder
# millionare

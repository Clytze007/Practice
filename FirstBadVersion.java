package medium;

import utils.SVNRepo;

public class FirstBadVersion {
    /**
     * 代码库的版本号是从 1 到 n 的整数。某一天，有人提交了错误版本的代码，因此造成自身及之后版本的代码在单元测试中均出错。
     * 请找出第一个错误的版本号。你可以通过 isBadVersion 的接口来判断版本号 version 是否在单元测试中出错，
     * 具体接口详情和调用方法请见代码的注释部分。
     * 
     * @param n: total version numbers.
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
    	if (n <= 0) return 0;
    	int left = 1, right = n;
    	while (left + 1 < right) {
    		int mid = left + (right - left) / 2;
    		if (SVNRepo.isBadVersion(mid)) {
    			right = mid;
    		} else {
    			left = mid;
    		}
    	}
    	if (SVNRepo.isBadVersion(left)) return left;
    	if (SVNRepo.isBadVersion(right)) return right;
    	
    	return 0;
    }
}

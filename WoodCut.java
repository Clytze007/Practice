package medium;

/**
 * 
 * 有一些原木，现在想把这些木头切割成一些长度相同的小段木头，需要得到的小段的数目至少为 k。
 * 当然，我们希望得到的小段越长越好，你需要计算能够得到的小段木头的最大长度。
 * 
 *  注意事项
 *  木头长度的单位是厘米。原木的长度都是正整数，我们要求切割得到的小段木头的长度也要求是整数。
 *  无法切出要求至少 k 段的,则返回 0 即可。
 * @author yazhang
 *
 */
public class WoodCut {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public int woodCut(int[] L, int k) {
    	if (L.length <= 0) return 0;
    	//find the max length wood from L as the limit
    	int max = 0;
    	for (int maxIndex = 0; maxIndex < L.length; maxIndex++) {
    		max = Math.max(max, L[maxIndex]);
    	}
    	int left = 1, right = max;
    	while (left + 1 < right) {
    		int mid = left + (right - left) / 2;
    		int total = getTotal(L, mid);
    		if (total >= k) {
    			left = mid;
    		} else {
    			right = mid;
    		}
    	}
    	if (getTotal(L, right) >= k) return right;
    	if (getTotal(L, left) >= k) return left;
    	return 0;
    }

	private int getTotal(int[] L, int pLength) {
		int total = 0;
		for (int i = 0; i < L.length; i++){
			total += L[i] / pLength;
		}
		return total;
	}
}

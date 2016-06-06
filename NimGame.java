package easy;

public class NimGame {

    public boolean canWinNim(int n) {
    	
        return (n % 4 != 0);
    }
    
    public boolean canWinNim1(int n) {
    	if (n < 4) return true;
    	return !canWinNim1(n - 1) || !canWinNim1(n - 2) || !canWinNim1(n - 3);
    }
}

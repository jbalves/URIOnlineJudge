import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1310 {

	public static void main (String[] args) throws IOException {
		
	InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
		
        int days;
		int perDayCost;
		int profit =0;
		
		days = Integer.parseInt(in.readLine());
		perDayCost = Integer.parseInt(in.readLine());
		
		int[] array = new int[days];
		for (int i = 0; i < days; i++) {
			array[i] = Integer.parseInt(in.readLine());
		}
	    
		for (int subArraySize = 1; subArraySize <= days; ++subArraySize) {
			
			for (int startIndex = 0; startIndex < days; ++startIndex) {
				if (startIndex+subArraySize > days)
					break;
				int max = 0;
				for (int i = startIndex; i < (startIndex+subArraySize); i++)
					max+=array[i]-perDayCost;
				
				if (max>profit)
					profit = max;
			}
			
		}
		
		System.out.printf("%d\n",profit);
	}
}

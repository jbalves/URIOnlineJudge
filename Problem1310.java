import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1310 {    
    public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        
        int days=6, perDayCost=20;
        int[] array={18, 35, 6, 80, 15, 21};

        //days = Integer.parseInt(in.readLine());
        //array = new int[days];
        //perDayCost = Integer.parseInt(in.readLine());

        //for (int i=0; i<days; i++) {
        //	array[i]=Integer.parseInt(in.readLine());
        //}
        
        findMaxProfit(array, perDayCost, days);
    }

    public static void findMaxProfit (int[] array, int perDayCost, int days) {
        int aux, profit=0;

        for (int i=0; i<days; i++) {
            aux = array[i]-perDayCost;

            for (int j=i+1; j<days ; j++ ) {
                aux = array[j]-j*perDayCost;
                if (aux>profit){
                    profit=aux;
                }   
            }
        }
                
        System.out.printf("Profit = %d\n", profit);
    }
    
}

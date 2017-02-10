//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem1310v02 {
    
    public static void main(String[] args) throws IOException {
        
        //InputStreamReader ir = new InputStreamReader(System.in);
        //BufferedReader in = new BufferedReader(ir);
        Scanner scan = new Scanner (System.in);

        int n, perDayCost, revenueEachDay, profit, tmax;
        //while (in != null) {
        //while ((n = Integer.parseInt(in.readLine())) != null) {
        //while ((n = Integer.parseInt(in.readLine())) != -1) {
        //while (in.hasNextInt()) {
        while (scan.hasNextInt()) {
            //n = Integer.parseInt(in.readLine());
            n = scan.nextInt();
            int a[] = new int[n]; 
            //perDayCost = Integer.parseInt(in.readLine());
            perDayCost = scan.nextInt();
            profit = 0;
            tmax = 0;

            for (int i=0; i < n; i++) {
                //revenueEachDay = Integer.parseInt(in.readLine());
                revenueEachDay = scan.nextInt();
                a[i] = revenueEachDay - perDayCost;
            }

            for (int i=0; i < n; i++) {
                tmax += a[i];
                if(tmax < 0) {
                    tmax = 0;
                }

                if(profit < tmax) {
                    profit = tmax;
                }
            }
            System.out.printf("%d\n", profit);
        }

    }
    
}
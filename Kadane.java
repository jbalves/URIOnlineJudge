public class Kadane {

    public static void main(String[] args) {
        int[] intArr={18, 35, 6, 80, 15, 21};
        int days=6;
        //int[] intArr={3, -1, -1, -1, -1, -1, 2, 0, 0, 0 };
        //int[] intArr = {-1, 3, -5, 4, 6, -1, 2, -7, 13, -3};
        //int[] intArr={-6,-2,-3,-4,-1,-5,-5};
        
        findMaxSubArray(intArr,2,5);
    }

    public static void findMaxSubArray(int[] inputArray, int begin, int end){

        int maxStartIndex=0;
        int maxEndIndex=0;
        int maxProfit = Integer.MIN_VALUE;
        int perDaycost =20; 

        int cumulativeSum= 0;
        int maxStartIndexUntilNow=0;

        for (int i = begin ; begin < end ; begin++) {
        //for (int currentIndex = 0; currentIndex < inputArray.length; currentIndex++) {

            int eachArrayItem = inputArray[i];
            //int eachArrayItem = inputArray[currentIndex];

            cumulativeSum+=eachArrayItem-perDaycost;

            if(cumulativeSum>maxProfit){
                maxProfit = cumulativeSum;
                maxStartIndex=maxStartIndexUntilNow;
                maxEndIndex = i;
                //maxEndIndex = currentIndex;
            }
            else if (cumulativeSum<0){
                maxStartIndexUntilNow=i+1;
                //maxStartIndexUntilNow=currentIndex+1;
                cumulativeSum=0;
            }
        }

        System.out.println("Max profit         : "+maxProfit);
        System.out.println("Max start index : "+maxStartIndex);
        System.out.println("Max end index   : "+maxEndIndex);
    }

}
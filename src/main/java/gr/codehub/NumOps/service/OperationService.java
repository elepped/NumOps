package gr.codehub.NumOps.service;

public class OperationService {

    public int getMax(int num1, int num2) {
        return
                Math.max(num1, num2);
    }

    public int getMin(int num1, int num2) {
        return
                Math.min(num1, num2);
    }


    public int getSum(int num1, int num2) {
        return
                Math.addExact(num1, num2);

    }

    public int getProduct(int num1, int num2) {
        return
                Math.multiplyExact(num1, num2);
    }


    public String getOperations(int num1, int num2) {
        return
                "The Maximum of the two numbers equals : " + getMax(num1, num2) + "<br>" +
                        "The Minimum of the two numbers equals : " + getMin(num1, num2) + "<br>" +
                        "The Sum of the two numbers equals : " + getSum(num1, num2) + "<br>" +
                        "The Product of the two numbers equals : " + getProduct(num1, num2) + "<br>";
    }


}


//FOR LIST:
// list == null || list.size() == 0
        /*IntSummaryStatistics stat = Arrays
                .stream(tab)
                .summaryStatistics();
        int min = stat.getMin();
        int max = stat.getMax();
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);*/

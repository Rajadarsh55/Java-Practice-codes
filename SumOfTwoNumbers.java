public class SumOfTwoNumbers {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        Sum sum = new Sum() {
            @Override
            public int findSum(int a, int b) {
                return a + b;
            }
        };

        int result = sum.findSum(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);
    }
}

interface Sum {
    int findSum(int a, int b);
}

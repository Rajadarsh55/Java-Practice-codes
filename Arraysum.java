//sum of an array using generic data type
class PrintSum<T> {
    private T[] array;

   PrintSum(T[] array) {
        this.array = array;
    }

    double sum() {
        double total = 0.0;
        for (T element : array) {
            total += element.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};

        PrintSum<Integer> intSum = new Printsum<>(intArray);
        System.out.println("Sum of integers: " + intSum.sum());

        Printsum<Double> doubleSum = new Printsum<>(doubleArray);
        System.out.println("Sum of doubles: " + doubleSum.sum());
    }
}

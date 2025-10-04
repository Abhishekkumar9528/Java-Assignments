class VarargsSum {
    static int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Sum: " + sum(1, 2, 3, 4, 5));
        System.out.println("Sum: " + sum(10, 20));
    }
}

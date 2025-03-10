public class Main {
    public static void main(String[] args) {

        printProduct(1, "smartphone", 5, 12153.41);
        printProduct(2, "laptop", 7, 10486.85);
    }
    public static void printProduct(int productNo, String product, int days, double sales){
        System.out.printf("Product No %d: %s,%n", productNo, product); //%d (Integer placeholder)
        System.out.printf("Total sales for %d days is EUR %.2f,%n", days, sales); //%s (String placeholder)
        System.out.printf("Sales by day is EUR %.2f.%n%n", sales / days);// %n (New line); %.2f --> Formats a floating-point number to 2 decimal places; \t --> Adds a tab space.


    }
}



//Product No 1: smartphone,
//total sales for 5 days is EUR 12153,41,
//sales by day is EUR 2430,68.
//Product No 2: laptop,
//total sales for 7 days is EUR 10486,85,
//sales by day is EUR 1498,12.
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;

public class App {
    public static void main(String[] args) throws Exception {
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        Date now = new Date();
        
        System.out.println(now);

        Point point1 = new Point(1, 2);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        String message = "Hello word" + "!!";

        int[] numbers = {1, 2, 3, 4, 5 };

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        // System.out.println(Arrays.sort(numbers));

        int[][] numbers2 = { { 1, 2, 3}, { 4, 5, 6} };

        String result = NumberFormat.getPercentInstance().format(0.647);

        System.out.println(result);

        Scanner scannerAge = new Scanner(System.in);
        
        System.out.print("Age: ");
        byte personAge = scannerAge.nextByte();

        Scanner scannerName = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scannerName.nextLine().trim();
        System.out.println("You are " + name);


    }
}

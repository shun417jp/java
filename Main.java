import java.text.DecimalFormat;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = Double.parseDouble(sc.nextLine());
        double weight = Double.parseDouble(sc.nextLine());

        double bmi = weight/(height*height);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(bmi));

    }


}

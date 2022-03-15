import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) throws IllegalArgumentException, Exception {
        try {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input radius: ");
        double radius = input.nextDouble();
            if (radius <= 0) {
                input.close();
                throw new IllegalArgumentException();
            } 
                
            if (radius * radius * Math.PI > 1000) {
                input.close();
                throw new Exception();
            }
            
            CircleWithException myCircle = new CircleWithException(radius);
            System.out.print("Area of cirle :" + String.format("%.2f", myCircle.getArea()));
            input.close();

        } catch (IllegalArgumentException e) {
            System.out.println("Radius is not valid, please try again.");

        } catch (Exception e) {
            System.out.println("Area will be more than 1000");
        } 
    }

}

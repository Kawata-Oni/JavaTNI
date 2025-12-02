import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for X coordinate: ");
        int x_coordinate = scanner.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        int y_coordinate = scanner.nextInt();

        if (x_coordinate > 0 && y_coordinate > 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the First quadrant");
        else if (x_coordinate < 0 && y_coordinate > 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the Second quadrant");
        else if (x_coordinate < 0 && y_coordinate < 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the Third quadrant");
        else if (x_coordinate > 0 && y_coordinate < 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the Fourth quadrant");
        else if (x_coordinate == 0 && y_coordinate != 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the y-axis");
        else if (x_coordinate != 0 && y_coordinate == 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the x-axis");
        else if (x_coordinate == 0 && y_coordinate == 0)
            System.out.print("The coordinate point (" + x_coordinate + "," +
                    y_coordinate + ") lies in the Origin");

    }
}
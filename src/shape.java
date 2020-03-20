import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        int selection;
        do {
            Scanner scn = new Scanner(System.in);
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");
            System.out.println("Input your selection : ");
            selection = scn.nextInt();

            switch (selection) {
                case 1: {
                    System.out.println("Input rectangle width  : ");
                    int recWidth = scn.nextInt();
                    System.out.println("Input rectangle height : ");
                    int recHeight = scn.nextInt();
                    for (int i = 1; i <= recHeight; i++) {
                        for (int j = 1; j <= recWidth; j++) {
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;
                }
                case 2: {
                    System.out.println("Input rectangle side  : ");
                    int triangleSide = scn.nextInt();
                    for (int i = 1; i <= triangleSide; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        } System.out.print("\n");
                    }
                    System.out.print("\n");
                       int triangleSide2=triangleSide   ;
                    for (int i = 1,j; i <= triangleSide; i++) {
                        for (j = triangleSide2; j >= 1;j--) {
                            System.out.print("*");
                        } System.out.print("\n");
                        triangleSide2--;
                    }
                    System.out.print("\n");

                    break;
                }
                case 3: {
                    System.out.println("Input isosceles rectangle height  : ");
                    int isoTriHeight = scn.nextInt();
                    int blankWidth=isoTriHeight-1;
                    int isoRecWidth=1;
                    for (int i = 1; i <= isoTriHeight; i++) {
                        for (int j = 1; j<= blankWidth; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k<= isoRecWidth; k++) {
                            System.out.print("*");
                        }
                        blankWidth--;
                        isoRecWidth+=2;
                        System.out.print("\n");
                    }
                    System.out.print("\n");
                    break;
                }
            }

        } while (selection != 4);
    }
}

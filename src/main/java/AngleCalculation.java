import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AngleCalculation {
        public static void main(String[] args) {
            File file = new File(System.getProperty("user.dir") + "/src/main/input/data.txt");
            Scanner input = null;
            try {
                input = new Scanner(file);
                while (input.hasNextLine()) {
                    String[] array = input.nextLine().split(" ");
                    calcDegree(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        private static void calcDegree(int hours, int minutes) {
            float hoursInDegree = hours * 30 + (30 * minutes) / 60f;
            float minutesInDegree = minutes * 6;
            float degree = Math.abs(hoursInDegree - minutesInDegree);
            float result = degree <= 180 ? degree : 360 - degree;
            System.out.println("Time: " + hours + " : " + minutes + ", degree: " + result);
        }

}

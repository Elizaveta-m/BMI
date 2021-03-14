public class BmiService {
    public static double calculate(int weight, double height) {
        return weight / (height * height);
    }
}
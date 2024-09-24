public class BmiService {
    public int calculate(float height, int weight) {
        return (int) (weight / (height * height));
    }
}

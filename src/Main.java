public class Main {
    public static void main(String[] args) {

        float height = 1.87F;
        int weight = 98;
        BmiService service = new BmiService();
        int bmi;
        bmi = service.calculate(height, weight);

        System.out.println(bmi);
    }
}

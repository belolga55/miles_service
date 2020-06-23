public class Main {
    public static void main(String[] args) {
        MilesService service = new MilesService();
        long miles = service.calculate(3513025 );
        System.out.println(miles);

        long miles1 = service.calculate(4127150 );
        System.out.println(miles1);
    }
}

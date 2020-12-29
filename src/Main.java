public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 22_000_55;
        int miles = service.calculate(cost);
        System.out.println(miles);
    }
}
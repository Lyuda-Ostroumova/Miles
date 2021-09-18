public class Main {

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 65_000;
        int miles = service.calculate(ticketPrice);
        System.out.println(miles);
        

    }
}

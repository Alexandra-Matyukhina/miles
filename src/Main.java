public class Main {
    public static void main(String[] args) {

        double cost = 17899.79; // стоимость билета в рублях
        int mile = 1; // бонус в милях
        int mileBonus = 20; // бонус за каждые 20 рублей

        double totalMiles = (int) ((cost / mileBonus) * mile); // всего милей от стоимости билета
        System.out.println("Total miles: " + totalMiles);

    }
}
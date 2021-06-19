public class BonusMilesService {
    public int calculate(int price) {
        int oneMileInRub = 20;
        int miles = price / oneMileInRub;
        System.out.println(miles);
        return miles;
    }
}




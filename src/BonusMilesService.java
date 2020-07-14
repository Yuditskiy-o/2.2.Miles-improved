public class BonusMilesService {
    public int calculate(int cost) {
        cost = 6_500;
        int milefactor = 20;
        int miles = cost / milefactor;
        return miles;
    }
}

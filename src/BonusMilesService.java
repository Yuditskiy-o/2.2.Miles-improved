public class BonusMilesService {
    public int calculate(int cost) {
        int milefactor = 20;
        int miles = cost / milefactor;
        return miles;
    }
}

public class BonusMilesService {
    public int calculate (int cost){
        int coefficient = 20_00;
        int miles = cost / coefficient;
        return miles;
    }
}

public class BonusMilesService {
    public int calculate(int cost){
      int miles;
        miles = cost / 20;
        return miles;
    }
}
    // метод calculate, который:
    //    Принимает на вход один параметр: cost типа int
    //    Возвращает рассчитанное количество миль (тип - int)

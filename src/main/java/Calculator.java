public class Calculator {
    int pay(int boardingCost, int costPerKm, int distance) {
        int taxiCost = boardingCost + costPerKm * distance;
        if (taxiCost > 1000) {
            double discount = taxiCost * 0.05;
            if (discount > 100) {
                discount = 100;
            }
            taxiCost = taxiCost - (int) discount;
        }
        return taxiCost;
    }
}

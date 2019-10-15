public class Calculator {
    int costLimit = 1000;
    int discountLimit = 100;
    double discountRate = 0.05;

    int calculateCost(int boardingCost, int costPerKm, int distance) {
        int taxiCost = boardingCost + costPerKm * distance;
        if (taxiCost > costLimit) {
            double discount = taxiCost * discountRate;
            if (discount > discountLimit) {
                discount = discountLimit;
            }
            taxiCost = taxiCost - (int) discount;
        }
        return taxiCost;
    }
}

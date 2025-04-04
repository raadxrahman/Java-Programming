//extract from paragraph

public class Task12 {

    public static void main(String[] args) {
        String paragraph = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk. If I buy the laptop and 1 piece mouse, what will be my total cost after giving 15% discount?";


        String[] numbers = paragraph.split("\\D+");
        int laptopPrice = Integer.parseInt(numbers[2]);
//        System.out.println("L " +laptopPrice);
        int mousePrice = Integer.parseInt(numbers[3]);
//        System.out.println("M " +mousePrice);
        int mouseQuantity = Integer.parseInt(numbers[4]);
//        System.out.println("M " +mouseQuantity);
        double discountPercentage = Integer.parseInt(numbers[5]);
//        System.out.println("D " +discountPercentage);
//        for (String number : numbers) {
//            System.out.println(number);
//        }


        // Calculate total cost
        int totalCost = laptopPrice + (mousePrice * mouseQuantity);
//        System.out.println("totalcost " + totalCost);

        // Calculate discount
        double discount = (discountPercentage/100) * totalCost;
//        System.out.println(discount);

        // Calculate final price
        double finalPrice = totalCost - discount;

        System.out.println("Total cost after 15% discount: " + finalPrice);
    }
}
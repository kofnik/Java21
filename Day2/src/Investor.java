/*
public class Investor {
    public static void main(String[] args) {
        int startingCapital = 14000;
        System.out.println("The starting capital is: " + startingCapital);

        double firstYear = startingCapital * 1.4;
        System.out.println("After the first year the capital is: " + firstYear);

        double secondYear = firstYear - 1500;
        System.out.println("After the second year the capital is: " + secondYear);

        double thirdYear = secondYear * 1.12;
        System.out.println("After the third year the capital is: " + thirdYear);
    }
}
*/
class Investor {
    public static void main(String[] arguments) {
        float total = 14000;
        System.out.println("Original investment: $" + total);
        // Inceases by 40 percent the first year
        total = total + (total * .4F);
        System.out.println("After one year: $" + total);
        // Loses $1,500 the second year
        total = total - 1500F;
        System.out.println("After two years: $" + total);
        // Increases by 12 percent the third year
        total = total + (total * .12F);
        System.out.println("After three years: $" + total);
    }
}
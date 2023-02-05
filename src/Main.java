public class Main {
    public static void main(String[] args) {
        int price = 5000;
        int bonus = 20;

        int bonus_miles = price / bonus;

        System.out.println("Количество начисленных миль за билет: " + bonus_miles);
    }
}

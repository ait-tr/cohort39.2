package homework5;

public class Task3 {
    /*
Напишите программу, которая вычисляет, сколько лишних калорий будет,
если вместо пиццы диаметром 24 см вы купите пиццу диаметром 28 см.
каждый квадратный сантиметр пиццы содержит 40 калорий.

     */
    public static void main(String[] args) {
        PizzaCalories pizzaCalories = new PizzaCalories();

        double caloriesPizza24 = pizzaCalories.caloriesInPizza(24, 40);
        double caloriesPizza28 = pizzaCalories.caloriesInPizza(28,40);

        System.out.println();

        System.out.println("В пицце 28 см больше калорий, чем в пицце 24 см на: " + (caloriesPizza28 - caloriesPizza24) );


        double caloriesPizza32 = pizzaCalories.caloriesInPizza(32, 40);
        double caloriesPizza33 = pizzaCalories.caloriesInPizza(33,40);

        System.out.println("В пицце 33 см больше калорий, чем в пицце 32 см на: " + (caloriesPizza33 - caloriesPizza32) );


        double caloriesPizza100 = pizzaCalories.caloriesInPizza(100, 40);
        double caloriesPizza101 = pizzaCalories.caloriesInPizza(101,40);

        System.out.println("В пицце 101 см больше калорий, чем в пицце 100 см на: " + (caloriesPizza101 - caloriesPizza100) );

    }



}

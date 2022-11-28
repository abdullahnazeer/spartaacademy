package DecoratorPatternLesson;

public class ThreeCheesePizzaWrongWay extends PizzaWrongWay {

    @Override
    public String prepare() {
        String cheese = "adding three cheeses to pizza";
        return super.prepare() + " " + cheese;
    }

    @Override
    public double getPizza() {
        double cheesePrice = 4.00;
        return super.getPizza() + cheesePrice;
    }
}

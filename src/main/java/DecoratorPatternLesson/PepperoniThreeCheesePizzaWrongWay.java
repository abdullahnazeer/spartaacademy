package DecoratorPatternLesson;

public class PepperoniThreeCheesePizzaWrongWay extends ThreeCheesePizzaWrongWay {

    @Override
    public String prepare() {
        String pepperoni = "adding pepperoni";
        return super.prepare() + " " + pepperoni;
    }

    @Override
    public double getPizza() {
        double pepperoniPrice = 3.00;
        return super.getPizza() + pepperoniPrice;
    }
}

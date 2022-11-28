package DecoratorPatternLesson;

public class PepperoniDecorator extends PizzaToppingDecorator {

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String pepperoniTopping = "adding pepperoni";
        return super.prepare() + " " + pepperoniTopping;
    }

    @Override
    public double getPrice() {
        double pepperoniPrice = 3.00;
        return super.getPrice() + pepperoniPrice;
    }
}

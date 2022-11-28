package DecoratorPatternLesson;

public class SweetcornDecorator extends PizzaToppingDecorator {

    public SweetcornDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String sweetcorn = "adding sweetcorn";
        return super.prepare() + " " + sweetcorn;
    }

    @Override
    public double getPrice() {
        double sweetcornPrice = 1.00;
        return super.getPrice() + sweetcornPrice;
    }
}

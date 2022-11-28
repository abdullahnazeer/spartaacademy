package DecoratorPatternLesson;

public class MushroomDecorator extends PizzaToppingDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String prepare() {
        String mushroom = "adding mushroom";
        return super.prepare() + " " + mushroom;
    }

    @Override
    public double getPrice() {
        double mushroomPrice = 1.00;
        return super.getPrice() + mushroomPrice;
    }
}

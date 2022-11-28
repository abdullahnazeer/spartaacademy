package DecoratorPatternLesson;

public class PlainPizza implements Pizza {


    @Override
    public String prepare() {
        return "Preparing signature thin dough";
    }

    @Override
    public double getPrice() {
        return 3.50;
    }
}

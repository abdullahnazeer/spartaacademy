package DecoratorPatternLesson;

public abstract class PizzaWrongWay {

    // describe the pizza you have made

    public String prepare() {
        return "Preparing signature thin dough";
    }

    // gets the price
    public double getPizza() {
        // base price of a pizza
        return 4.00;
    }

}

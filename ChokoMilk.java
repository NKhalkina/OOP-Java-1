public class ChokoMilk extends Product {
    public ChokoMilk(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Шоколадное молоко: ")
                .append(super.toString());
        return res.toString();
    }
}
    


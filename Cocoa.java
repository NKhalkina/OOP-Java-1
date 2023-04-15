public class Cocoa extends Product{
    public Cocoa(String name, double price, int value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Какао: ")
                .append(super.toString());
        return res.toString();
    }
}

    
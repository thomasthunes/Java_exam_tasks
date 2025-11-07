package post3;
import java.io.*;

public class Product implements Serializable {
    static int quantity = 23;
    String name;
    transient double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.ser"));
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.ser"))) {
            Product p = new Product("Cookie", 12.3);
            oos.writeObject(p);
            Product.quantity++;


            p = (Product) ois.readObject();
            System.out.println(p);
        }
    }
}

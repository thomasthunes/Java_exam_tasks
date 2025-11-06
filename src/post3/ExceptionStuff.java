package post3;

public class ExceptionStuff {

    public static void main(String[] args) throws ProductOutOfStockException {

        try {
            throw new ProductException("fail.");
        } catch (Exception e) {
            throw new ProductOutOfStockException("fail2.");
        }

    }
}

class ProductException extends Exception {
    ProductException(String s) {
        super(s);
    }
}
class ProductOutOfStockException extends ProductException {
    ProductOutOfStockException(String s) {
        super(s);
    }
}

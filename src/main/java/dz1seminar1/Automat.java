package dz1seminar1;

public interface Automat {
    Product getProduct(String name) throws IllegalStateException;
}
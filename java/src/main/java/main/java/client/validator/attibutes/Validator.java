package main.java.client.validator.attibutes;

public interface Validator<T> {
    String validate(T value);
}

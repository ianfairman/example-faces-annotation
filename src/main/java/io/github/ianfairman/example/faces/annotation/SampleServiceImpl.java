package io.github.ianfairman.example.faces.annotation;

public class SampleServiceImpl implements SampleService {

    @Override
    public String calculate(String input) {
        return input + input;
    }
}

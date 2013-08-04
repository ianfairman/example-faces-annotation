package io.github.ianfairman.example.faces.annotation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SampleModel {

    private String input = "plus";

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    private String output = "plusplus";

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}

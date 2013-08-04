package io.github.ianfairman.example.faces.annotation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class SampleController {

    @ManagedProperty(value = "#{sampleModel}")
    private SampleModel model;
    
    public void setModel(SampleModel model) {
        this.model = model;
    }
    
    @ManagedProperty(value = "#{sampleService}")
    private SampleService service;
    
    public void setService(SampleService service) {
        this.service = service;
    }
    
    public String doStuff() {
        model.setOutput(service.calculate(model.getInput()));
        return null;
    }
}

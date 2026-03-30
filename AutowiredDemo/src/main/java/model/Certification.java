package model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private String course = "Spring Framework";

    @Override
    public String toString() {
        return "Certification: " + course;
    }
}

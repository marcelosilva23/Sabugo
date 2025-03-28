package io.codeforall.kernelfc;

import javax.persistence.Embeddable;

@Embeddable
public class Customer {

    private String name;
    private String email;

    public String getFirst_name() {
        return name;
    }

    public void setFirst_name(String first_name) {
        this.name = first_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

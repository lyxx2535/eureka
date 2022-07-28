package io.grissom.userservice.domain;

public class Greeting {
    private final String msg;

    public Greeting(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}

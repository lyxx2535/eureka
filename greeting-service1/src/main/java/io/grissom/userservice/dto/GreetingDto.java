package io.grissom.userservice.dto;

public class GreetingDto {
    private String msg;

    public GreetingDto(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg() {
        this.msg = msg;
    }
}

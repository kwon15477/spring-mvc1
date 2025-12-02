package hello.servlet.web.frontcontroller.V4.controller;

import hello.servlet.web.frontcontroller.V4.COntrollerV4;

import java.util.Map;

public class MemberFormControllerV4 implements COntrollerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> model) {
        return "new-form";
    }
}
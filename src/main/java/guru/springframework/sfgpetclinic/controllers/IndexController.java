package guru.springframework.sfgpetclinic.controllers;

public class IndexController {

    public String index() {

        return "index";
    }

    public String oopsHandler() {
        //return "notimplemented";
        throw new ValueNotFoundException();
    }
}

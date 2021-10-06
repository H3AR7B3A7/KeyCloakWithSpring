package be.steven.d.dog.firstkeycloakclient.controller;

import be.steven.d.dog.firstkeycloakclient.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeAPIController {

    @GetMapping("/data")
    public @ResponseBody Model getSomeObject() {
        return new Model(1, "some object");
    }
}
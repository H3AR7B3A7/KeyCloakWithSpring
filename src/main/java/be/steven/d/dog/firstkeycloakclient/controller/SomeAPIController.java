package be.steven.d.dog.firstkeycloakclient.controller;

import be.steven.d.dog.firstkeycloakclient.model.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SomeAPIController {

    @GetMapping("/map")
    public @ResponseBody Model getSomeObject() {
        return new Model(1, "map");
    }

    @GetMapping("/tools")
    public @ResponseBody
    List<Model> getTools() {
        return List.of(new Model(1, "pickaxe"), new Model(2, "shovel"), new Model(3, "torch"));
    }
    
    @GetMapping("/swords")
    public @ResponseBody
    List<Model> getSwords() {
        return List.of(new Model(1, "1H sword"), new Model(2, "2H sword"));
    }
}
package ru.ag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.ag.Model.Person;
import ru.ag.Repository.PersonRepository;

import java.util.Map;

@Controller
public class WebController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/")
    public String home(Map<String, Object> model){
        Iterable<Person> people = personRepository.findAll();
        model.put("people", people);

        return "home";
    }

    @PostMapping("/")
    public String add(@RequestParam String surname, @RequestParam String name, @RequestParam String photoAddress, @RequestParam Integer debt, Map<String, Object> model) {
        Person person = new Person(surname, name, photoAddress, debt);
        personRepository.save(person);

        Iterable<Person> people = personRepository.findAll();
        model.put("people", people);

        return "home";
    }
}

package ru.kdv.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.kdv.entity.Person;

import javax.annotation.PostConstruct;
import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping
public class AppRestController {
    private List<Person> persons;

    @GetMapping("/test")
    public String simpleReturn() {
        return "Hi1";
    }

    @PostConstruct
    public void loadData(){
        persons = asList(new Person("Aaaa", "BBBb"),
                new Person("Vaaa", "BBDZFSBb"),
                new Person("Baaa", "DDFBBBb"));
    }

    @GetMapping("/persons")
    public List<Person> getPersons() {
        return persons;
    }
    @GetMapping("/person/{personId}")
    public Person gerPerson(@PathVariable int personId){
        return persons.get(personId);
    }
}

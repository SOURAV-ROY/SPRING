package ece.cse482.lecture11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class Person {
    String name;
    double age;
    String address;
    int id = 1;

    @Bean
    public Person getPerson() {
        Person p = new Person();
        p.name = "person-"+id;
        id++;
        p.age = 21;
        p.address = "dhaka";
        return p;
    }

    @RequestScope
    @Bean
    public Person getRequestScopePerson() {
        Person p = new Person();
        p.name = "resuest-scope-person-"+id;
        id++;
        p.age = 21;
        p.address = "uttara";
        return p;
    }

    @SessionScope
    @Bean
    public Person getSessionScopePerson() {
        Person p = new Person();
        p.name = "ression-scope-person-"+id;
        id++;
        p.age = 21;
        p.address = "nsu";
        return p;
    }


    public String toString() {
        return name+"   -:- "+age+" "+address;
    }
}

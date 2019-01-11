package ece.cse482.lecture11;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    ApplicationContext ac;

    @RequestMapping("/singleton")
    public String person() {
        Person p = (Person)ac.getBean("getPerson");
        return p.toString();
    }

    @RequestMapping("/reqscope")
    public String requestScope() {
        Person p = (Person)ac.getBean("getRequestScopePerson");
        return p.toString();
    }

    @RequestMapping("/sessionscope")
    public String sessionScope() {
        Person p = (Person)ac.getBean("getSessionScopePerson");
        return p.toString();
    }
}


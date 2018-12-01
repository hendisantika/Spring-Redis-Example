package com.hendisantika.springredisexample.service;

import com.hendisantika.springredisexample.model.Person;
import com.hendisantika.springredisexample.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-redis-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-02
 * Time: 06:11
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public String addPerson(Person person) {
        repository.addPerson(person);
        return "" + person.getId();
    }

    public Person getPersonById(int id) {
        return repository.getPerson(id);
    }

    public List<Person> getPersons() {
        return repository.getAllPersons().values().stream().collect(Collectors.toList());
    }

    public String updatePerson(Person person) {
        repository.updatePerson(person);
        return "user with id : " + person.getId() + " updated successfully";
    }

    public long totalCount() {
        return repository.getNumberOfPersons();
    }

    public String deletePerson(int id) {
        repository.deletePerson(id);
        return "person deleted with id : " + id;
    }
}

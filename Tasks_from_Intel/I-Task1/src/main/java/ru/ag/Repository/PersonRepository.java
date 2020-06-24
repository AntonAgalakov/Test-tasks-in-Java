package ru.ag.Repository;

import org.springframework.data.repository.CrudRepository;
import ru.ag.Model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {
}

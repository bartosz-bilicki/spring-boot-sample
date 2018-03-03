package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.stream.Collectors;

/*
  @Rest(Controller), @Repository and @Service from 'Domain-Driven Design'.
  Repository returns entities.
  Service uses repository
  Controller uses services.
 */
@Service
public class PersonService {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    //thread-safe, no mutable state. just immutable, injected collaborators

    //collaborator (another service)
    private final PersonDatabase personDatabase;

    /*
        collaborator injected not created!
     */
    public PersonService(PersonDatabase personDatabase) {
        this.personDatabase=personDatabase;
        LOG.info("I am your business logic");
    }

    public List<Person> smartPersons() {
        return personDatabase.findAll()
                .stream()
                .filter(Person::isSmart)
                .collect(Collectors.toList());
    }
}

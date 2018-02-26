package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    //colaborator (another service)
    private final PersonDatabase personDatabase;

    /*
        colaborator injected not created!
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

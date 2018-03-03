package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.List;

/*
In production it would be real database.
 */
@Repository
public class PersonDatabase {
    private static final Logger LOG= LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    private final List<Person> personList;

    public PersonDatabase() {
        this(Arrays.asList(
                Person.builder().name("person1").build(),
                Person.builder().name("person2").build()
        ));
    }

    public PersonDatabase(List<Person> personList) {
        this.personList=personList;
        LOG.info("I am your database");
    }

    public List<Person> findAll() {
        return personList;
    }
}

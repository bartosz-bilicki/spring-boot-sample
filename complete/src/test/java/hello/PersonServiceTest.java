package hello;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonServiceTest {

    @Test
    public void shouldFindNothingInEmptyDatabase() {
        //given empty database
        PersonDatabase personDatabase = new PersonDatabase();
        PersonService sut = new PersonService(personDatabase);

        //when
        List<Person> people = sut.smartPersons();

        //then
        assertThat(people).isEmpty();
    }

    @Test
    public void shouldFindOneSmartPerson() {
        //given one-smart-person database
        Person smartPerson = Person.builder().name("person1").smart(false).build();
        PersonDatabase personDatabase = new PersonDatabase(
                Arrays.asList(
                        smartPerson
                ));
        PersonService sut = new PersonService(personDatabase);

        //when
        List<Person> people = sut.smartPersons();

        //then
        assertThat(people).containsExactly(smartPerson);
        //assertion below is BAD for multiple reasons
        //Assert.assertTrue(people.contains(smartPerson));
    }

}
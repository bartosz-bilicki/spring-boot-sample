package hello;

import lombok.Builder;
import lombok.Data;

/*
    Entity.
    Uses lombok to eliminate boilerplante code.

 */
@Data
@Builder
public class Person {
    private String name;
    private boolean smart;

}

package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utils.Logger;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static final String personsName = "Michele";
    private static final int personsAge = 33;
    private static final String testNameToCompare = "Michele";

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person(personsName, personsAge);
    }

    @Test
    void testGetName() {
        assertEquals(testNameToCompare, person.getName());
    }

    @Test
    void testUpdateAge() {
        assertEquals(33, person.getAge());
        person.updateAge(34);
        assertEquals(34, person.getAge());
    }
}
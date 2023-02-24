package model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static final String personName = "Michele";
    private static final String testNameToCompare = "Michele";
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person(personName, 33);
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
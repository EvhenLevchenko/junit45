package com.mycompany.app.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Junit5AssertionsTest {


    @Test
    void testAssertEquals() {
        assertEquals("ABC", "ABC");
        assertEquals(20, 20, "optional message");
        assertEquals(2 + 2, 4);
    }

    @Test
    void testAssertNull() {
        String nullString = null;
        String notNullString = "str";

        assertNull(nullString);
        assertNotNull(notNullString);
    }

    @Test
    void testAssertFalse() {
        assertFalse("FirstName".length() == 10);
        assertFalse(10 > 20, "assertion message");
    }

    @Test
    void testAssertTrue() {
        assertTrue("FirstName".startsWith("F"));
        Exception exception =
             new IllegalArgumentException("Illegal Argument Exception occured");

        assertEquals("Illegal Argument Exception occured", exception.getMessage());
    }

    @Test
    void testAssertAll() {
        String str1 = "abc";
        String str2 = "pqr";
        String str3 = "xyz";
        assertAll("numbers",
                () -> {
                    assertEquals(str1, "abc");
                    assertEquals(str1, "abc");
                },
                () -> assertEquals(str2, "pqr"),
                () -> assertEquals(str3, "xyz"));

    }
}

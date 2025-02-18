package com.mycompany.app.junit.digitaloceansources.assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionsExample {

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,-1})
    void test(int i) {
        assumeTrue(i>=0);
        assumeTrue(i >= 0, "Wrong Input, Only positive ints please");
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test_assumeFalse() {
        assumeFalse("root".equals(System.getenv("USER")));
        // code that I don't want to run as root user
    }

    @Test
    void test_assumingThat() {
        assumingThat("f".equals("f"), () -> {
            System.out.println("USER is pankaj, continue further");
        });
    }

}

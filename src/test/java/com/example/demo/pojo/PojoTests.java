package com.example.demo.pojo;

import com.example.demo.Pojo;
import com.example.demo.Pojo2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.pojo.tester.api.assertion.Method;

import static org.junit.jupiter.api.Assertions.assertNull;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsForAll;

public class PojoTests {


    @Test
    public void Should_Pass_All_Pojo_Tests() {
        // given
        final Class[] classesUnderTest = {Pojo.class, Pojo2.class};

        // when
        final Throwable result = Assertions.catchThrowable(() -> assertPojoMethodsForAll(classesUnderTest).testing(Method.GETTER, Method.SETTER, Method.TO_STRING)
                .testing(Method.EQUALS)
                .testing(Method.HASH_CODE)
                .testing(Method.CONSTRUCTOR).areWellImplemented());

        // then
        assertNull(result);

    }
}

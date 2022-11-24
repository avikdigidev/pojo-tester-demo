package com.example.demo.pojo;

import com.example.demo.Pojo;
import com.example.demo.Pojo2;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsForAll;

public class PojoTests {


    @Test
    public void Should_Pass_All_Pojo_Tests() {
        // given
        final Class[] classesUnderTest = {Pojo.class, Pojo2.class};

        // when
        final Throwable result = Assertions.catchThrowable(() ->assertPojoMethodsForAll(classesUnderTest).areWellImplemented());

        // then
        assertNull(result);

    }
}

package com.example.wataru.hoge;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by wataru on 2015/08/20.
 */
public class PiyoTest {

    @org.junit.Test
    public void testGetHelloString() throws Exception {

        Piyo sut = new Piyo();
        String expected = "FugaWorld!!";
        String actual = sut.getString();

        assertThat(actual, is(expected));

    }
}
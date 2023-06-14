package io.codelex.javaadvancedtest.exercise3;

import org.junit.Assert;
import org.junit.Test;

public class JoinerTest {

    @Test
    public void testJoin() {
        Joiner<Integer> joiner = new Joiner<>("-");
        String joinResult = joiner.join(1, 2, 3);

        String expectedMessage = "1-2-3";

        Assert.assertEquals(expectedMessage, joinResult);
    }

}

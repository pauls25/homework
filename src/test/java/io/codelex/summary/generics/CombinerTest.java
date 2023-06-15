package io.codelex.summary.generics;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static io.codelex.oop.summary.generics.Combiner.combineTwoItems;

public class CombinerTest {
    @Test
    public void testCombineTwoItems() {
        Assert.assertEquals(combineTwoItems("first Item", 2), "First item: first Item; Second item: 2");
        Assert.assertEquals(combineTwoItems(2.0, new BigDecimal("2")), "First item: 2.0; Second item: 2");
    }
}

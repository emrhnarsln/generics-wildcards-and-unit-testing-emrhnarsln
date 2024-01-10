package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

@Test(timeout = 10)
        public void testInfiniteLoopWithInfiniteInput() {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            fail();
        }
  
}

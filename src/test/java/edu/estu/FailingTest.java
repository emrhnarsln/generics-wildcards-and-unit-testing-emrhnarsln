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

@Test(timeout = 1000)
        public void testInfiniteLoopWithInfiniteInput() {
            try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            fail("Expected infinite loop, but the method completed successfully");
                } 
            catch (Exception e) {
                }
        }
}

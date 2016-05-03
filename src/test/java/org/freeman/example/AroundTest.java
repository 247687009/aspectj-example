package org.freeman.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Around Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 3, 2016</pre>
 */
public class AroundTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: find(int num)
     */
    @Test
    public void testFind() throws Exception {
        Around around = new Around();
        String s = around.find(1);
        System.out.println(s);
        String s1 = around.find(1);
        System.out.println(s1);
    }


} 

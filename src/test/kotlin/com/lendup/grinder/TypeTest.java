package com.lendup.grinder;

/**
 * Created by pjawahar on 6/13/16.
 */

import com.lendup.grinder.TypeGuesser;
import junit.framework.TestCase;

public class TypeTest extends TestCase{
    public void testGetType() {
        assertEquals("INT", TypeGuesser.getType("1234"));
    }
}

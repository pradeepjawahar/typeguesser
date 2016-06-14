package com.lendup.grinder

import junit.framework.TestCase

class TypeGuesserTest(name: String?) : TestCase(name) {

    fun testIsInteger() {
        // Valid Integer
        assertTrue(TypeGuesser.isInteger("1234"))
        assertTrue(TypeGuesser.isInteger("-453235"))

        // Random String
        assertFalse(TypeGuesser.isInteger("sfgsdfgsd"))

        // Long
        assertFalse(TypeGuesser.isInteger("2147483648"))

        // Double
        assertFalse(TypeGuesser.isInteger("123.45"))
        assertFalse(TypeGuesser.isInteger("2.0"))

    }

    fun testisLong() {

        // Valid Integer
        assertTrue(TypeGuesser.isLong("1234"))
        assertTrue(TypeGuesser.isLong("-453235"))

        // Random String
        assertFalse(TypeGuesser.isLong("sfgsdfgsd"))

        // Long
        assertTrue(TypeGuesser.isLong("2147483648"))

        // Double
        assertFalse(TypeGuesser.isLong("123.45"))
        assertFalse(TypeGuesser.isLong("2.0"))

    }

    fun testIsBoolean() {

        // Valid booleans
        assertTrue(TypeGuesser.isBoolean("false"))
        assertTrue(TypeGuesser.isBoolean("False"))
        assertTrue(TypeGuesser.isBoolean("true"))
        assertTrue(TypeGuesser.isBoolean("TRUE"))

        // Invalid Boolean(0,1)
        assertFalse(TypeGuesser.isBoolean("0"))
        assertFalse(TypeGuesser.isBoolean("1"))
    }

    fun testIsDouble() {
        // valid double
        assertTrue(TypeGuesser.isDouble("1456.77"))
        // valid double
        assertTrue(TypeGuesser.isDouble("9.18E+09"))
    }

    fun testGetType() {
        assertEquals("INT", TypeGuesser.getType("1234"))
        assertEquals("BIGINT", TypeGuesser.getType("3147483648"))
        assertEquals("FLOAT", TypeGuesser.getType("1456.77"))
        assertEquals("VARCHAR", TypeGuesser.getType("AT&amp;T WIRELESS"))
        assertEquals("BOOLEAN", TypeGuesser.getType("True"))

    }

}
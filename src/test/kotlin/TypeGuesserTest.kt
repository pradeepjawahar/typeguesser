import junit.framework.TestCase

/**
 * Created by pjawahar on 6/9/16.
 */

class TypeGuesserTest: TestCase() {

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
}
package com.lendup.grinder

object TypeGuesser {

    /**
     * Checks if a string is a valid integer

     * @param number The string to check
     * *
     * @return True if the string is a valid integer else false.
     */
    @JvmStatic
    fun isInteger(number: String): Boolean {
        var result = false
        try {
            number.toInt()
            result = true
        } catch (e: NumberFormatException) {
        }

        return result
    }

    /**
     * Checks if a string is a valid long

     * @param number The string to check
     * *
     * @return True if the string is a valid long else false.
     */
    @JvmStatic
    fun isLong(number: String): Boolean {
        var result = false
        try {
            number.toLong()
            result = true
        } catch (e: NumberFormatException) {
        }

        return result
    }

    /**
     * Checks if a string is a valid Double

     * @param number The string to check.
     * *
     * @return True if the string is a valid double else false.
     */
    @JvmStatic
    fun isDouble(number: String): Boolean {
        var result = false
        if (number != null) {
            try {
                number.toDouble()
                result = true
            } catch (e: NumberFormatException) {
            }

        }
        return result
    }

    /**
     * Checks if a string is a valid boolean

     * @param number The string to check
     * *
     * @return True if the string is equals to either true or false . Else false.
     */
    @JvmStatic
    fun isBoolean(number: String): Boolean {
        var result = false
        if (number != null && (number.equals("true", ignoreCase = true) || number.equals("false", ignoreCase = true))) {
            result = true
        }
        return result
    }

    /**
     *  A function to return
     */
    @JvmStatic
    fun getType(value: String): String? {

        // All the features can be nullable
        if (value == null) {
            return null
        }

        if (isBoolean(value)) {
            return "BOOLEAN"
        } else if (isInteger(value)) {
            return "INT"
        } else if (isLong(value)) {
            return "BIGINT"
        } else if (isDouble(value)) {
            return "FLOAT"
        }
        // Default 256 bytes
        return "VARCHAR"
    }

}


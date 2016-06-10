object TypeGuesser {

    /**
     * Checks if a string is a valid integer

     * @param number The string to check
     * *
     * @return True if the string is a valid integer else false.
     */
    fun isInteger(number: String): Boolean {
        var result = false
        try {
            Integer.parseInt(number)
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
    fun isLong(number: String): Boolean {
        var result = false
        try {
            java.lang.Long.parseLong(number)
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
    fun isDouble(number: String?): Boolean {
        var result = false
        if (number != null) {
            try {
                java.lang.Double.parseDouble(number)
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
    fun isBoolean(number: String?): Boolean {
        var result = false
        if (number != null && (number.equals("true", ignoreCase = true) || number.equals("false", ignoreCase = true))) {
            result = true
        }
        return result
    }
}

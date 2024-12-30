package com.huyxoann.fitmaster

object RegistrationUnit {

    private val existUsers = listOf("huy", "huyxoann", "huyxoann123")
    /*
    * the input is not valid if...
    * 1. username is empty
    * 2. password is empty
    * 3. password is less than 6 characters
    * 4. password is more than 20 characters
    * 5. password does not match confirmPassword
    * */

    fun registerUser(username: String, password: String, confirmPassword: String):Boolean{
        return true;
    }
}
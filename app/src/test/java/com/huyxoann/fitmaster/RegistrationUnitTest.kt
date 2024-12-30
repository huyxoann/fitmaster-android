package com.huyxoann.fitmaster

import com.google.common.truth.Truth.*
import org.junit.Test

class RegistrationUnitTest{
    @Test
    fun `empty username returns false`(){
        val result = RegistrationUnit.registerUser(
            "",
            "123456",
            "123456",)
        assertThat(result).isFalse()
    }
}
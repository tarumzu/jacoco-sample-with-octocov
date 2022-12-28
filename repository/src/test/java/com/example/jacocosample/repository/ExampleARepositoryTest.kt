package com.example.jacocosample.repository

import org.junit.Assert
import org.junit.Test

class ExampleARepositoryTest {

    @Test
    fun get_isCorrect() {
        Assert.assertEquals("test", ExampleARepository().get())
        Assert.assertEquals("test", ExampleARepository().get2())
    }
}

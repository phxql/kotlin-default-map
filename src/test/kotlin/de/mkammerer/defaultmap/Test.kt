package de.mkammerer.defaultmap

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertThat
import org.junit.Test

class Tests {
    val map = mapOf(1 to "one", 2 to "two").defaultsTo("???")

    @Test
    fun testDefault() {
        assertThat(map[0], equalTo("???"))
        assertThat(map[3], equalTo("???"))
    }

    @Test fun testEntries() {
        assertThat(map[1], equalTo("one"))
        assertThat(map[2], equalTo("two"))
    }
}

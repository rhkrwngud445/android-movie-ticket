package com.example.domain

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TicketBundleTest {
    @Test
    fun `티켓 가격의 총 합을 구한다`() {
        val actual = TicketBundle(
            listOf(
                Ticket(),
                Ticket(),
                Ticket()
            )
        ).calculateTotalPrice(
            "2023-04-10",
            "13:00"
        )
        assertEquals(actual, 35100)
    }
}

package com.panfutov.loan.amortization

import io.micronaut.runtime.Micronaut.run
import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info

@OpenAPIDefinition(
    info = Info(
            title = "Loan Amortization Calculator",
            version = "1.0.9"
    )
)
object Api {
}
fun main(args: Array<String>) {
	run(*args)
}


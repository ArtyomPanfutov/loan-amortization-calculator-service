package com.panfutov.loan.amortization

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/loanAmortizationCalculatorService")
class LoanAmortizationCalculatorServiceController {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        return "Example Response"
    }
}
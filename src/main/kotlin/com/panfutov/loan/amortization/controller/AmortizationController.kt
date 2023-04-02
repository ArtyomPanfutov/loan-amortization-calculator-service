package com.panfutov.loan.amortization.controller

import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import paqua.loan.amortization.api.impl.LoanAmortizationCalculatorFactory
import paqua.loan.amortization.dto.Loan
import paqua.loan.amortization.dto.LoanAmortization

@Controller("/loan")
class AmortizationController {

    private val calculator = LoanAmortizationCalculatorFactory.create();

    @Post(uri="/amortization", produces = [APPLICATION_JSON], consumes = [APPLICATION_JSON])
    fun calculateAmortization(@Body loan: Loan): LoanAmortization {
        return calculator.calculate(loan);
    }

}
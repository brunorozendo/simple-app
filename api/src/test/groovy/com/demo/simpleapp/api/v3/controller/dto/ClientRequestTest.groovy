package com.demo.simpleapp.api.v3.controller.dto

import spock.lang.Shared
import spock.lang.Specification

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

class ClientRequestTest extends Specification {

    @Shared
    Validator validator;

    def setupSpec() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory()
        validator = factory.getValidator()
    }


    def "should not allow an transactionId empty"() {
        given: "Setup environment"
        // this.setupSpec()

        when: "an 'transactionId' is empty"
        def request = new ClientRequest()
        Set<ConstraintViolation<ClientRequest>> violations = validator.validate(request);

        then: "should return an validation: 'must not be null' "
        !violations.isEmpty()
        violations.size() == 1
        "must not be null" == violations.toList().get(0).getMessage()
    }

    def "should not allow an transactionId bigger then 32 characters"() {
        given: "Setup environment"
        // this.setupSpec()

        when: "an 'transactionId' is bigger then 32 characters"
        def request = new ClientRequest()
        request.setTransactionId(UUID.randomUUID().toString())
        Set<ConstraintViolation<ClientRequest>> violations = validator.validate(request);

        then: "should return an validation: 'size must be between 1 and 32' "
        !violations.isEmpty()
        violations.size() == 1
        "size must be between 1 and 32" == violations.toList().get(0).getMessage()
    }
}

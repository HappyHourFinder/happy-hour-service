import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "save happy hour"
    request {
        method POST()
        url("/happyhours")
        body(
                begin: '10:00',
                end: '12:00',
                barUuid: '1'
        )
        headers {
            contentType(applicationJson())
        }
    }
    response {
        status 201
        headers {
            contentType(applicationJson())
        }
        body(
                uuid: anyNonBlankString(),
                begin: '10:00',
                end: '12:00',
                barUuid: '1'
        )
    }
}
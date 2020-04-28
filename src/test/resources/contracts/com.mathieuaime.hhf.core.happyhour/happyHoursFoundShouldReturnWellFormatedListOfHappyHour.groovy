import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "happy hours when bar found"
    request {
        method GET()
        url("/happyhours?barUuid=1")
    }
    response {
        status 200
        headers {
            contentType(applicationJson())
        }
        body("""[{"uuid":"hh-1","begin":"10:00:00","end":"11:00:00", "barUuid":"1"}]""")
    }
}
import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "happy hour not found"
    request {
        method GET()
        url("/happyhours/hh-2?barUuid=1")
    }
    response {
        status 404
    }
}
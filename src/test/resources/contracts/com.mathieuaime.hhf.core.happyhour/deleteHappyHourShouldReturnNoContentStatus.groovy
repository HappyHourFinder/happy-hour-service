import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "delete happy hour"
    request {
        method DELETE()
        url("/happyhours/hh-1")
    }
    response {
        status 204
    }
}
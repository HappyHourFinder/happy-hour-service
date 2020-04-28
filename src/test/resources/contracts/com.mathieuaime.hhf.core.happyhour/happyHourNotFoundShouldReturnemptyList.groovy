import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "happy hours when bar not found"
    request {
        method GET()
        url("/happyhours?barUuid=0")
    }
    response {
        status 200
        body("""[]""")
    }
}
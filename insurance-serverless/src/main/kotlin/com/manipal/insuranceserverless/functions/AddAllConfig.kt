package com.manipal.insuranceserverless.functions

import com.manipal.insuranceserverless.service.Service
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import java.util.function.Function

class AddAllConfig: Function<String, ResponseEntity<String?>> {
    @Autowired
    var service: Service = Service()
    override fun apply(message: String): ResponseEntity<String?> {
        return service.addAllConfigs(message)
    }
}
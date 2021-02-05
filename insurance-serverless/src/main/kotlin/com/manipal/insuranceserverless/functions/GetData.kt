package com.manipal.insuranceserverless.functions

import com.manipal.insuranceserverless.service.Service
import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import java.util.function.Function

class GetData: Function<String, List<Document>?> {
    @Autowired
    var service: Service = Service()
    override fun apply(message: String): List<Document>? {
        return service.apiRequests(message)
    }
}
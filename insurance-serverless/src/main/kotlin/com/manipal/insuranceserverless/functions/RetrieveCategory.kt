package com.manipal.insuranceserverless.functions

import com.manipal.insuranceserverless.service.Service
import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import java.util.function.Supplier

class RetrieveCategory : Supplier<List<Document>?> {

    @Autowired
    var service: Service = Service()
    override fun get(): List<Document>? {
        return service.findUniqueCategory()
    }
}
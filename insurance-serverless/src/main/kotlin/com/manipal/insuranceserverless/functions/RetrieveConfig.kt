package com.manipal.insuranceserverless.functions

import com.manipal.insuranceserverless.service.Service
import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import java.util.function.Function;

class RetrieveConfig : Function<String, List<Document>?> {
    @Autowired
    var service: Service = Service()
    override fun apply(message: String): List<Document>? {
        print(message)
        val messages = message.split(",".toRegex(), 2).toTypedArray()
        return service.findFormConfig(messages[0], messages[1])
    }
}
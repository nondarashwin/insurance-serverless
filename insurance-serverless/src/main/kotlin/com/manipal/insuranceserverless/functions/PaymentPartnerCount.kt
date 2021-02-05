package com.manipal.insuranceserverless.functions

import com.manipal.insuranceserverless.service.Service
import org.bson.Document
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import java.util.*
import java.util.function.Supplier


class PaymentPartnerCount : Supplier<MutableList<Document>> {

    @Autowired
    var service: Service = Service()
    override fun get(): MutableList<Document> {
        return service.partnerPaymentCount()
    }

}


package net.cryptodoc.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Document
data class AccountSignature (

    @Id
    val id: ObjectId = ObjectId.get(),
    @Indexed
    val userId: String,
    val createdDate: LocalDateTime = LocalDateTime.now(),
    val signature: String
)
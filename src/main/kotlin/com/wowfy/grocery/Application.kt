package com.wowfy.grocery

import com.wowfy.grocery.adapter.out.persistence.Hello
import io.micronaut.runtime.ApplicationConfiguration
import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
    info = Info(
            title = "product",
            version = "0.1"
    )
)
object Api {
}
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.wowfy.grocery")
		.start()
}


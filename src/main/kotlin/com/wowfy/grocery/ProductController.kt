package com.wowfy.grocery

import com.wowfy.grocery.adapter.out.persistence.Hello
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/product")
class ProductController(val hello: Hello) {

    @Get(uri="/", produces=["text/plain"])
    fun index(): String {
        hello.index()
        return "Example Response"
    }
}
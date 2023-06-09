package com.dojinyou.inflearn.w3.config

import com.dojinyou.inflearn.memory.MemoryController
import com.dojinyou.inflearn.memory.MemoryFinder
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnProperty(name = ["memory"], havingValue = "on")
class MemoryConfig {

//    @Bean
//    fun memoryController(): MemoryController {
//        return MemoryController(memoryFinder())
//    }
//
//    @Bean
//    fun memoryFinder(): MemoryFinder {
//        return MemoryFinder()
//    }
}

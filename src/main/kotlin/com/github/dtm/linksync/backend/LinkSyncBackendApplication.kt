package com.github.dtm.linksync.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LinkSyncBackendApplication

fun main(args: Array<String>) {
	runApplication<LinkSyncBackendApplication>(*args)
}

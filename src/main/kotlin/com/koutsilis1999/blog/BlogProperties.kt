package com.koutsilis1999.blog

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("blog")
class BlogProperties(var title: String, val banner: Banner) {
    data class Banner(val title: String? = null, val content: String)
}
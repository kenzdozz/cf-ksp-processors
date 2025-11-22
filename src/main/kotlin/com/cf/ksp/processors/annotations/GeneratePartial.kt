package com.cf.ksp.processors.annotations

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class GeneratePartial(val include: Array<String> = [])

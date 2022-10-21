package io.hydok.cleanarchitecture.di




/*
val networkModule = module {

    single { Cache(androidApplication().cacheDir, 10L * 1024 * 1024) }
    single { GsonBuilder().setLenient().create() }

    single {
        OkHttpClient.Builder()
            .cache(get())
            .connectTimeout(60, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .addInterceptor {
                val request: Request = it.request().newBuilder()
                    .addHeader("Authorization", GlobalApplication.INSTANCE.authToken)
                    .addHeader("Host", "good.co.kr")
                    .addHeader("Content-Type", "application/json")
                    .build()
                return@addInterceptor it.proceed(request)
            }.build()
    }

    single {
        Retrofit.Builder()
            .baseUrl(ConstantsURL.getMainURL())
            .addConverterFactory(GsonConverterFactory.create(get()))
            .client(get())
            .build()
    }

    single { get<Retrofit>().create(ApiService::class.java) }
}*/

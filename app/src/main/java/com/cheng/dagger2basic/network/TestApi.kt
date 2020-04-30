package com.cheng.dagger2basic.network

import com.cheng.dagger2basic.models.Post
import com.cheng.dagger2basic.utilities.CONTENT_TYPE_JSON
import com.cheng.dagger2basic.utilities.POSTS
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface TestApi {

    @Headers(CONTENT_TYPE_JSON)
    @GET(POSTS)
    suspend fun getPosts(): Response<List<Post>>
}
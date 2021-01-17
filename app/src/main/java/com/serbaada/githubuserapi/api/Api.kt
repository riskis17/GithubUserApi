package com.serbaada.githubuserapi.api

import com.serbaada.githubuserapi.data.model.DetailUserResponse
import com.serbaada.githubuserapi.data.model.User
import com.serbaada.githubuserapi.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token af8ee11eb889f62d448117e1ffa6dc6e198eaf8a")
    fun getSearchUsers(
            @Query("q") query: String

            ):Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token af8ee11eb889f62d448117e1ffa6dc6e198eaf8a")

    fun getUserDetail(
            @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token af8ee11eb889f62d448117e1ffa6dc6e198eaf8a")
    fun getFollowers(
            @Path("username") username: String
    ):Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token af8ee11eb889f62d448117e1ffa6dc6e198eaf8a")
    fun getFollowing(
            @Path("username") username: String
    ):Call<ArrayList<User>>



}
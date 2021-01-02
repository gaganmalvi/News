package org.cartelproject.news;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
public interface APIInterface {
    @GET("top-headlines")
    Call<ResponseModel> getLatestNews(@Query("sources") String source,@Query("c4a2c77ed03c44b290390a99150de06f") String apiKey);
}
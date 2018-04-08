package com.mvvm.http;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by chiclaim on 2016/02/26
 */
public interface SearchApi {

    @GET("/search")
    Observable<List<String>> search(@Query("key") String key);
}

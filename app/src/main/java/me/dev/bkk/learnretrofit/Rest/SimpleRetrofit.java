package me.dev.bkk.learnretrofit.Rest;

import me.dev.bkk.learnretrofit.model.Shot;
import retrofit.http.GET;

/**
 * Created by BKK on 7/8/2558.
 */
public interface SimpleRetrofit {
    @GET("/shots/21603")
    Shot getShot();
}

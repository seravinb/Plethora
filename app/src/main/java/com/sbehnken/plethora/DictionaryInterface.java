package com.sbehnken.plethora;

import com.sbehnken.plethora.model.DictionaryResponse;
import com.sbehnken.plethora.model.LexicalEntry;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;

public interface DictionaryInterface {

    @GET("inflections/en/{word}")

    Call<DictionaryResponse> getResponse(@Header("app_id") String app_id, @Header("app_key") String app_key, @Path("word") String word);

}

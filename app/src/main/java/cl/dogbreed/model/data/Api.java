package cl.dogbreed.model.data;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    @GET("api/breeds/list/all")
    Call<RazaLista> listaRaza();
    @GET("api/breed/{breed}/images")
    Call<RazaImagen> listaImagen(@Path("breed")String breed);


}

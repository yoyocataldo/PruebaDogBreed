package cl.dogbreed.model.data;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cl.dogbreed.domain.presenter.IPresenterModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BreedModel implements InterfazModel {
IPresenterModel iPresenterModel;

    public BreedModel(IPresenterModel iPresenterModel) {
        this.iPresenterModel = iPresenterModel;
    }

    @Override
    public void loadBreeds() {
     Api servicios = RetrofitClient.getRetrofitInstance().create(Api.class);


    Call<RazaLista> listCall = servicios.listaRaza();
    List<String> list = new ArrayList<>();
    listCall.enqueue(new Callback<RazaLista>() {
        @Override
        public void onResponse(Call<RazaLista> call, Response<RazaLista> response) {
            RazaLista breedList = response.body();
    Map<String, List<String>> map = breedList.getMessage();
    for (String key : map.keySet()) {
        if (map.get(key).isEmpty()) {
            list.add(key);

    } else {
        for (String subBreed : map.get(key)) { list.add(key + " " + subBreed);
    }
    }
    }
    iPresenterModel.notificar(list);
    } @Override public void onFailure(Call<RazaLista> call, Throwable t) {

             }
         });
    }
        @Override
    public void loadImages(String raza, String subRaza) {

    }
}


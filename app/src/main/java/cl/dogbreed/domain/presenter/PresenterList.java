package cl.dogbreed.domain.presenter;

import java.util.List;

import cl.dogbreed.model.data.InterfazModel;

public class PresenterList implements IpresenterList, IPresenterModel{
    InterfazModel interfazModel;
    IPresenterViewList iPresenterViewList;

    public PresenterList(IPresenterViewList iPresenterViewList) {
        this.iPresenterViewList = iPresenterViewList;
    }

    public void setInterfazModel(InterfazModel interfazModel) {
        this.interfazModel = interfazModel;
    }

    @Override
    public void notificar(List<String> list) {
        iPresenterViewList.showDogs(list);
    }

    @Override
    public void loadBreeds() {
        interfazModel.loadBreeds();

    }
}

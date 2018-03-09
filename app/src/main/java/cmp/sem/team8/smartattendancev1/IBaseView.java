package cmp.sem.team8.smartattendancev1;

/**
 * Created by AmmarRabie on 08/03/2018.
 */

public interface IBaseView<T extends IBasePresenter> {

    void setPresenter(T presenter);

}
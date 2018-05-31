package nyc.c4q.powershopper.viewmodels;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MediatorLiveData;
import android.arch.lifecycle.Transformations;
import android.support.annotation.NonNull;

import java.util.List;

import nyc.c4q.powershopper.db.entity.PromotedCategoriesEntity;
import nyc.c4q.powershopper.db.repositories.PromotedCategoriesRepository;

public class PromotedCategoriesViewModel extends AndroidViewModel {

    private PromotedCategoriesRepository promotedCategoriesRepository;

    private final MediatorLiveData<List<PromotedCategoriesEntity>> observablePromotionCategories;

    public PromotedCategoriesViewModel(@NonNull Application application) {
        super(application);
        observablePromotionCategories = new MediatorLiveData<>();
        observablePromotionCategories.setValue(null);

        LiveData<List<PromotedCategoriesEntity>> promotedCategories = promotedCategoriesRepository.getCategories();

        observablePromotionCategories.addSource(promotedCategories, observablePromotionCategories::setValue);
    }

    public LiveData<List<PromotedCategoriesEntity>> getPromotedCategories() {
        return observablePromotionCategories;
    }
}

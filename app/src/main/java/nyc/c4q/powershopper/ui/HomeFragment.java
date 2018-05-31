package nyc.c4q.powershopper.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.powershopper.R;
import nyc.c4q.powershopper.adapters.PromotedCategoriesAdapter;
import nyc.c4q.powershopper.viewmodels.PromotedCategoriesViewModel;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    private PromotedCategoriesViewModel viewModel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, container, false);
        Context context = view.getContext();


        viewModel =
                ViewModelProviders.of(this).get(PromotedCategoriesViewModel.class);

        PromotedCategoriesAdapter adapter = new PromotedCategoriesAdapter();
        subscribeUi(adapter);
        return view;
    }


    private void subscribeUi(PromotedCategoriesAdapter adapter) {

        viewModel.getPromotedCategories().observe(this,Observer{

        })
    }

}

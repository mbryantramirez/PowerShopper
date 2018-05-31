package nyc.c4q.powershopper.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.powershopper.db.entity.PromotedCategoriesEntity;
import nyc.c4q.powershopper.models.PromotedData;

public class PromotedCategoriesAdapter extends RecyclerView.Adapter<PromotedCategoriesAdapter.ViewHolder> {


    public List<PromotedCategoriesEntity> values;
    private PromotedData[] promotedData;

    public PromotedCategoriesAdapter() {
    }


    public void setValues(List<PromotedCategoriesEntity> values) {
        this.values = values;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setPromotedCategoriesList(List<PromotedCategoriesEntity> myPromotedCategories) {

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}

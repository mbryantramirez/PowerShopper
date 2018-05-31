package nyc.c4q.powershopper.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.powershopper.models.PromotedData;

public class PromotedCategoriesAdapter extends RecyclerView.Adapter<PromotedCategoriesAdapter.ViewHolder> {

    private PromotedData[] promotedData;

    public PromotedCategoriesAdapter() {
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


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}

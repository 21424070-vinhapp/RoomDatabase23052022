package com.example.roomdatabase23052022.classes.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.roomdatabase23052022.R;
import com.example.roomdatabase23052022.data.model.entities.WorkEntity;
import com.example.roomdatabase23052022.databinding.ItemWorksBinding;

import java.util.ArrayList;
import java.util.List;

public class WorkAdapter extends RecyclerView.Adapter<WorkAdapter.WorkViewHolder> {

    private List<WorkEntity> lstWork;
    private LayoutInflater layoutInflater;

    public WorkAdapter()
    {
        lstWork=new ArrayList<>();
    }

    public void updateList(List<WorkEntity> workEntities)
    {
        if(lstWork !=null && lstWork.size()>0)
        {
            lstWork.clear();
        }
        lstWork.addAll(workEntities);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public WorkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if(layoutInflater==null)
        {
            layoutInflater=LayoutInflater.from(parent.getContext());
        }
        ItemWorksBinding itemWorksBinding= DataBindingUtil.inflate(layoutInflater, R.layout.item_works,parent,false);

        return new WorkViewHolder(itemWorksBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull WorkViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return (lstWork!=null && lstWork.size()>0) ? lstWork.size() : 0;
    }

    class WorkViewHolder extends RecyclerView.ViewHolder{

        public WorkViewHolder(@NonNull ItemWorksBinding itemView) {
            super(itemView.getRoot());
        }
    }
}

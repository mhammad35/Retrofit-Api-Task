package com.example.apitask;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

       private List<ModelClass> data;

    public RecyclerAdapter(List<ModelClass> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_layout_items,
                parent,false);
        return new ViewHolder(view);
    }

       @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            holder.textViewa.setText( " " + data.get(position).getPostId());
            holder.textViewb.setText( " " + data.get(position).getId());
            holder.textViewc.setText( " " + data.get(position).getName());
            holder.textViewd.setText( " " + data.get(position).getEmail());
            holder.textViewe.setText( " " + data.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewa,textViewb,textViewc,textViewd,textViewe;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewa = itemView.findViewById(R.id.textView1);
            textViewb = itemView.findViewById(R.id.textView2);
            textViewc = itemView.findViewById(R.id.textView3);
            textViewd = itemView.findViewById(R.id.textView4);
            textViewe = itemView.findViewById(R.id.textView5);
        }
    }
}

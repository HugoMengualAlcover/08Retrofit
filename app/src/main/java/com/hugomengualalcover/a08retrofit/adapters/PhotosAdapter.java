package com.hugomengualalcover.a08retrofit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hugomengualalcover.a08retrofit.R;
import com.hugomengualalcover.a08retrofit.modelos.Photo;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PhotosAdapter extends RecyclerView.Adapter<PhotosAdapter.PhotoVH> {

    private List<Photo> objects;
    private Context context;
    private int resource;

    public PhotosAdapter(List<Photo> objects, Context context, int resource) {
        this.objects = objects;
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public PhotoVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PhotoVH(LayoutInflater.from(context).inflate(resource, null));
    }

    @Override
    public void onBindViewHolder(@NonNull PhotoVH holder, int position) {
        Photo p = objects.get(position);
        holder.lblTitulo.setText(p.getTitle());
        Picasso.get()
                .load(p.getThumbnailUrl())//URL IMAGEN
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_foreground)
                .into(holder.imgPhoto); //IMAGE VIEW DONDE MOSTRAR IMAGEN
    }

    @Override
    public int getItemCount() {
        return objects.size();
    }


    public class PhotoVH extends RecyclerView.ViewHolder {

        ImageView imgPhoto;
        TextView lblTitulo;

        public PhotoVH(@NonNull View itemView) {
            super(itemView);

            imgPhoto = itemView.findViewById(R.id.imagePhoto);
            lblTitulo = itemView.findViewById(R.id.lblTituloPhoto);
        }
    }
}

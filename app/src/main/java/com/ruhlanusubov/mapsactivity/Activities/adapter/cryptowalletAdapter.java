package com.ruhlanusubov.mapsactivity.Activities.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.majorik.sparklinelibrary.SparkLineLayout;
import com.ruhlanusubov.mapsactivity.Activities.Domain.cryptowallet;
import com.ruhlanusubov.mapsactivity.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class cryptowalletAdapter extends RecyclerView.Adapter<cryptowalletAdapter.ViewHolder> {


    ArrayList<cryptowallet> cryptowallets;
    DecimalFormat formatter;
    public cryptowalletAdapter(ArrayList<cryptowallet> cryptowallets) {
        this.cryptowallets = cryptowallets;
        formatter=new DecimalFormat("###,###,###,###");
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_wallet,parent,false);

        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.cryptoNametxt.setText(cryptowallets.get(position).getCryptoName());
        holder.cryptoPricetxt.setText("$"+formatter.format(cryptowallets.get(position).getCryptoPrice()));
        holder.changePercenttxt.setText(cryptowallets.get(position).getChangePercent()+"%");
        holder.propertySizeTxt.setText(cryptowallets.get(position).getPropertySize()+cryptowallets.get(position).getCryptosymbol());
        holder.propertyAmountTxt.setText("$"+formatter.format(cryptowallets.get(position).getPropertyAmount()));
        holder.lineChart.setData(cryptowallets.get(position).getLineData());

        if(cryptowallets.get(position).getChangePercent()>0){
            holder.changePercenttxt.setTextColor(Color.parseColor("#12c737"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#12c737"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#fc0000"));
        }else if(cryptowallets.get(position).getChangePercent()<0){
            holder.changePercenttxt.setTextColor(Color.parseColor("#fc0000"));
        }else {
            holder.changePercenttxt.setTextColor(Color.parseColor("#ffffff"));
            holder.lineChart.setSparkLineColor(Color.parseColor("#ffffff"));
        }


        int drawableResourceId=holder.itemView.getContext().getResources().getIdentifier(cryptowallets.get(position).getCryptoName(),"drawable",
                holder.itemView.getContext().getPackageName());

        Glide.with(holder.itemView.getContext()).load(drawableResourceId).into(holder.logoCrypto);
    }

    @Override
    public int getItemCount() {
        return cryptowallets.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView cryptoNametxt,cryptoPricetxt,changePercenttxt,propertySizeTxt,propertyAmountTxt;
        ImageView logoCrypto;
        SparkLineLayout lineChart;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cryptoNametxt=itemView.findViewById(R.id.cryptoName);
            cryptoPricetxt=itemView.findViewById(R.id.Cryptoprice);
            changePercenttxt=itemView.findViewById(R.id.changePercenttext);
            propertySizeTxt=itemView.findViewById(R.id.propertySizetxt);
            propertyAmountTxt=itemView.findViewById(R.id.propertyAmounttxt);
            logoCrypto=itemView.findViewById(R.id.logoImg);
            lineChart=itemView.findViewById(R.id.sparkLineLayout);
        }
    }
}


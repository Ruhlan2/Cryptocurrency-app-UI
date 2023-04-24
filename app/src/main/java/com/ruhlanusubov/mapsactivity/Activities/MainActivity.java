package com.ruhlanusubov.mapsactivity.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ruhlanusubov.mapsactivity.Activities.Domain.cryptowallet;
import com.ruhlanusubov.mapsactivity.Activities.adapter.cryptowalletAdapter;
import com.ruhlanusubov.mapsactivity.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView.Adapter adapter;
    private  RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

recyclerViewWallet();
    }

    private void recyclerViewWallet() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView=findViewById(R.id.view);
        recyclerView.setLayoutManager(linearLayoutManager);

        ArrayList<cryptowallet> cryptowallets=new ArrayList<>();
        ArrayList<Integer> lineData=new ArrayList<>();
        lineData.add(1000);
        lineData.add(1100);
        lineData.add(1200);
        lineData.add(1100);


        ArrayList<Integer> lineData2=new ArrayList<>();
        lineData2.add(2100);
        lineData2.add(2000);
        lineData2.add(1900);
        lineData2.add(2000);

        ArrayList<Integer> lineData3=new ArrayList<>();
        lineData3.add(900);
        lineData3.add(1100);
        lineData3.add(1200);
        lineData3.add(1150);
        cryptowallets.add(new cryptowallet("bitcoin","BTX",1234.12,2.13,lineData,1234.12,0.12343));
        cryptowallets.add(new cryptowallet("etherium","ETH",2134.21,-1.13,lineData2,6545.65,0.01245));
        cryptowallets.add(new cryptowallet("trox","ROX",6543.21,0.73,lineData3,31234.12,0.02154));


        adapter=new cryptowalletAdapter(cryptowallets);
        recyclerView.setAdapter(adapter);
    }


}
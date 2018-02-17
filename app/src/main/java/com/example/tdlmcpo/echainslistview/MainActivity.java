package com.example.tdlmcpo.echainslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<bqb> bqbList = new ArrayList<>();
    private void initbqb(){
        bqb bqb_1=new bqb("膜蛤",R.drawable.moha);
        bqb bqb_2=new bqb("沮丧",R.drawable.jush);
        bqb bqb_3=new bqb("兴奋",R.drawable.xyff);
        bqb bqb_4=new bqb("害怕",R.drawable.bixn);
        bqb bqb_5=new bqb("打人",R.drawable.darf);
        bqb bqb_6=new bqb("变态",R.drawable.bmtl);
        bqb bqb_7=new bqb("智障",R.drawable.vivh);
        bqb bqb_8=new bqb("念诗",R.drawable.nmui);
        bqb bqb_9=new bqb("绝望",R.drawable.jtwh);
        bqb bqb_10=new bqb("登场",R.drawable.dgih);
        bqb bqb_11=new bqb("女装",R.drawable.nvvd);
        bqb bqb_12=new bqb("抽筋",R.drawable.ibjn);
        bqb bqb_13=new bqb("滑稽",R.drawable.hwji);
        bqb bqb_14=new bqb("笑死",R.drawable.xcsi);
        bqb bqb_15=new bqb("复活",R.drawable.fuho);
        bqb bqb_16=new bqb("开溜",R.drawable.kllq);
        bqb bqb_17=new bqb("复活",R.drawable.fuho);
        bqbList.add(bqb_1);
        bqbList.add(bqb_2);
        bqbList.add(bqb_3);
        bqbList.add(bqb_4);
        bqbList.add(bqb_5);
        bqbList.add(bqb_6);
        bqbList.add(bqb_7);
        bqbList.add(bqb_8);
        bqbList.add(bqb_9);
        bqbList.add(bqb_10);
        bqbList.add(bqb_11);
        bqbList.add(bqb_12);
        bqbList.add(bqb_13);
        bqbList.add(bqb_14);
        bqbList.add(bqb_15);
        bqbList.add(bqb_16);
        bqbList.add(bqb_17);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initbqb();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        bqbAdapter adapter = new bqbAdapter(bqbList);
        recyclerView.setAdapter(adapter);
    }
}

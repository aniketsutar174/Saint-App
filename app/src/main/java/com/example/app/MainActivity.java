package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv= findViewById(R.id.recview);
        rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter= new myAdapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);


    }
    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder = new ArrayList<>();

        Model ob1= new Model();
        ob1.setHeader("संत ज्ञानेश्वर");
        ob1.setDesc("माझा जन्म कुठे व्हावा,कोणत्या जाती धर्मात व्हावा,आई वडील कसे असावेत,हे माझ्या हाती नव्हते");
        ob1.setImgname(R.drawable.god1);
        holder.add(ob1);

        Model ob2= new Model();
        ob2.setHeader("स्वामी विवेकानंद");
        ob2.setDesc("समजदार व्यक्तीसोबत काही मिनीटे केलेली चर्चा ही हजारो पुस्तके वाचण्यासमान आहे");
        ob2.setImgname(R.drawable.god3);
        holder.add(ob2);

        Model ob3= new Model();
        ob3.setHeader("संत तुकाराम");
        ob3.setDesc("आधि मन घेई हाती, तोचि गणराज गणपती");
        ob3.setImgname(R.drawable.god2);
        holder.add(ob3);

        Model ob4= new Model();
        ob4.setHeader("चाणक्य");
        ob4.setDesc("तुमचे मानसिक समाधानच तुमच्या शत्रूंना पराभूत करेल");
        ob4.setImgname(R.drawable.god4);
        holder.add(ob4);

        Model ob5= new Model();
        ob5.setHeader("संत रामदास स्वामी");
        ob5.setDesc("मना वासना दुष्ट कामा नये रे, मना सर्वथा पापबुद्धी नको रे");
        ob5.setImgname(R.drawable.god6);
        holder.add(ob5);

        Model ob6= new Model();
        ob6.setHeader("श्री स्वामी समर्थ");
        ob6.setDesc("भिऊ नकोस मी तुझ्या पाठीशी आहे");
        ob6.setImgname(R.drawable.god5);
        holder.add(ob6);

        Model ob7= new Model();
        ob7.setHeader("गुरूनानक");
        ob7.setDesc("देवाच्या दरबारात माणसाच्या सर्व कर्मांचा जमा-खर्च असतो");
        ob7.setImgname(R.drawable.god7);
        holder.add(ob7);

        Model ob8= new Model();
        ob8.setHeader("रामकृष्ण परमहंस");
        ob8.setDesc("तुमच्या कर्मावर जर तुमची भक्ती असेल तरच तुमचं कर्म सार्थकी लागू शकतं");
        ob8.setImgname(R.drawable.god8);
        holder.add(ob8);

        return holder;
    }
}
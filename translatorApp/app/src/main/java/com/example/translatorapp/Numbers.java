package com.example.translatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    WordModal wordModal;
    ArrayList<WordModal> familyMembers;

    ListView familyview;
    customAdapter customadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        wordModal = new WordModal();
        familyMembers = new ArrayList();
        family();
        customadapter = new customAdapter(getApplicationContext(), familyMembers);
        familyview = findViewById(R.id.familyview);
        familyview.setAdapter(customadapter);

    }

    public void family()
    {
        familyMembers.add(new WordModal("Father", "Fafa", R.drawable.papa));
        familyMembers.add(new WordModal("Mother","Mokoro", R.drawable.mama));
        familyMembers.add(new WordModal("Child","Mwana", R.drawable.child));

        familyMembers.add(new WordModal("Grand Mother","Cucu", R.drawable.grandmama));
        familyMembers.add(new WordModal("Grand Father","Guka", R.drawable.grandpapa));
        familyMembers.add(new WordModal("Siblings","ndugu", R.drawable.siblings));

    }
}
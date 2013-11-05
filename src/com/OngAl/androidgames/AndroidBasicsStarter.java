package com.OngAl.androidgames;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;


public class AndroidBasicsStarter extends ListActivity {
	String tests[] = {"LifeCycleTest", "SingleTouchTest", "MultiTouchTest",
			"KeyTest", "AccelerometerTest", "AssetsTest",
			"ExternalStarageTest", "SoudPoolTest", "MediaPlayerTest",
			"FullScreenTest", "RenderViewTest", "ShapeTest", "BitmapTest",
			"FontTest", "SurfaceViewTest", "HelloWorld"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_android_basics_starter);
        setContentView(R.layout.activity_android_basics_starter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
    	// TODO Auto-generated method stub
    	super.onListItemClick(l, v, position, id);
    	String testName = tests[position];
    	
    	try{
    		Class clazz = Class.forName("com.OngAl.androidgames." + testName);
    		Intent intent = new Intent(this, clazz);
    		startActivity(intent);
    	} catch(ClassNotFoundException e){
    		e.printStackTrace();
    	}
    	
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.android_basics_starter, menu);
        return true;
    }
    
}

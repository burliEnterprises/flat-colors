package com.journaldev.expandablelistview;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.DragEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import static android.R.attr.dial;
import static android.R.attr.start;
import static android.R.attr.x;
import static android.R.attr.y;
import static com.journaldev.expandablelistview.R.id.MainActivity;
import static com.journaldev.expandablelistview.R.id.imageView;

public class MainActivity extends AppCompatActivity {

    List<String> expandableListTitle;
    ImageView iv_menu;
    GridView gridView;
    TreeMap<String, List<String>> expandableListDetail;
    ViewPager viewPager;
    View Main;
    Bitmap bitmap;
    Dialog dialog_color;

    public static int flingdistanz = 300;
    public static int start = 0;            // bei touchdown wird x wert gesetzt, bei up neu geholt, differenz dann ausgewertet, ob dialog oder nicht
    public static int ende = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv_menu = (ImageView) findViewById(imageView);
        Main = (View) findViewById(R.id.MainActivity);

        //expandableListDetail = ExpandableListDataPump.getData();        // nimmt daten, die in der liste stehen von Klasse ExpandableLisTDataPump
        //expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());     // holt titel aus der hashmap

        viewPager = (ViewPager) findViewById(R.id.colorgroup);
        viewPager.setAdapter(new CustomPagerAdapter(this));
        viewPager.setBackgroundColor(Color.BLACK);

        iv_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("FLAT COLORS")
                        .setMessage("More features coming soon!")
                        .setIcon(R.mipmap.ic_launcher)
                        .show();
            }
        });




        View.OnTouchListener handleTouch = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                int x = (int) event.getX();
                int y = (int) event.getY();
                //Log.d("x", String.valueOf(x));
                //Log.d("y", String.valueOf(y));

                Main.setDrawingCacheEnabled(true);
                Main.destroyDrawingCache();
                Main.buildDrawingCache();
                bitmap = Main.getDrawingCache();
                //Log.d("w", String.valueOf(bitmap.getWidth()));
                //Log.d("h", String.valueOf(bitmap.getHeight()));
                int pixel = bitmap.getPixel(x, y);
                int r = Color.red(pixel);
                int b = Color.blue(pixel);
                int g = Color.green(pixel);
                final String hexColor = String.format( "#%02x%02x%02x", r, g, b );
                //Log.d("r", String.valueOf(r));
                //Log.d("b", String.valueOf(b));
                //Log.d("g", String.valueOf(g));
                //Log.d("rgb", hexColor);

                switch (event.getAction()) {

                    case MotionEvent.ACTION_DOWN:
                       // Log.d("DOWN", "down");
                        start = (int) event.getX();
                        start = Math.abs(start);
                        break;
                    case MotionEvent.ACTION_MOVE:
                        //Log.d("MOVE", "move");
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        //Log.d("UPcancel", "upcancel");
                        Log.d("start", String.valueOf(start));
                        ende = (int) event.getX();
                        ende = Math.abs(ende);
                        Log.d("ende", String.valueOf(ende));
                        if ( Math.abs(ende - start) < flingdistanz) {        // prüft, ob distanz fling erreicht hat, dann kein dialog

                            dialog_color = new Dialog(MainActivity.this);
                            dialog_color.setContentView(R.layout.dialog_color);
                            RelativeLayout l = (RelativeLayout) dialog_color.findViewById(R.id.ll_color_dialog);
                            l.setBackgroundColor(Color.parseColor(hexColor));
                            TextView t1 = (TextView) dialog_color.findViewById(R.id.hex_dialog);
                            t1.setText(hexColor);
                            TextView t2 = (TextView) dialog_color.findViewById(R.id.rgb_dialog);
                            t2.setText("R: " + String.valueOf(r) + " | " + "G: " + String.valueOf(g) + " | " + "B: " + String.valueOf(b));
                            l.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                                    ClipData clip = ClipData.newPlainText("Color", hexColor);
                                    clipboard.setPrimaryClip(clip);
                                    TextView t1_2 = (TextView) dialog_color.findViewById(R.id.copy_dialog);
                                    t1_2.setText("✓");
                                }
                            });
                            dialog_color.setTitle("");
                            dialog_color.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                            //dialog_color.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation; //definiert in styles.xml, geschrieben im resource ordner anim -> new resource directory -> anim -> new anim resource ...
                            dialog_color.show();
                        }

                        break;
                }
                return false;
            }
        };
        viewPager.setOnTouchListener(handleTouch);

    }




}











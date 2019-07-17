package com.example.yanki.puzzle;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.View.DragShadowBuilder;
import android.view.View.OnDragListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private static final String IMAGE_TAG_1 = "Part1";
    private static final String IMAGE_TAG_2 = "Part2";
    private static final String IMAGE_TAG_3 = "Part3";
    private static final String IMAGE_TAG_4 = "Part4";
    private static final String IMAGE_TAG_5 = "Part5";
    private static final String IMAGE_TAG_6 = "Part6";
    private static final String IMAGE_TAG_7 = "Part7";
    private static final String IMAGE_TAG_8 = "Part8";
    private static final String IMAGE_TAG_9 = "Part9";

   public static String ClickedView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img11 = (ImageView)findViewById(R.id.img11);
        ImageView img12 = (ImageView)findViewById(R.id.img12);
        ImageView img13 = (ImageView)findViewById(R.id.img13);
        ImageView img21 = (ImageView)findViewById(R.id.img21);
        ImageView img22 = (ImageView)findViewById(R.id.img22);
        ImageView img23 = (ImageView)findViewById(R.id.img23);
        ImageView img31 = (ImageView)findViewById(R.id.img31);
        ImageView img32 = (ImageView)findViewById(R.id.img32);
        ImageView img33 = (ImageView)findViewById(R.id.img33);
        ImageView part11 = (ImageView)findViewById(R.id.part11);
        ImageView part12 = (ImageView)findViewById(R.id.part12);
        ImageView part13 = (ImageView)findViewById(R.id.part13);
        ImageView part21 = (ImageView)findViewById(R.id.part21);
        ImageView part22 = (ImageView)findViewById(R.id.part22);
        ImageView part23 = (ImageView)findViewById(R.id.part23);
        ImageView part31 = (ImageView)findViewById(R.id.part31);
        ImageView part32 = (ImageView)findViewById(R.id.part32);
        ImageView part33 = (ImageView)findViewById(R.id.part33);

        part11.setTag(IMAGE_TAG_1);
        part12.setTag(IMAGE_TAG_2);
        part13.setTag(IMAGE_TAG_3);
        part21.setTag(IMAGE_TAG_4);
        part22.setTag(IMAGE_TAG_5);
        part23.setTag(IMAGE_TAG_6);
        part31.setTag(IMAGE_TAG_7);
        part32.setTag(IMAGE_TAG_8);
        part33.setTag(IMAGE_TAG_9);

        part11.setOnLongClickListener(new MyClickListener());
        part12.setOnLongClickListener(new MyClickListener());
        part13.setOnLongClickListener(new MyClickListener());
        part21.setOnLongClickListener(new MyClickListener());
        part22.setOnLongClickListener(new MyClickListener());
        part23.setOnLongClickListener(new MyClickListener());
        part31.setOnLongClickListener(new MyClickListener());
        part32.setOnLongClickListener(new MyClickListener());
        part33.setOnLongClickListener(new MyClickListener());

        img11.setOnDragListener(new MyDragListener());
        img12.setOnDragListener(new MyDragListener());
        img13.setOnDragListener(new MyDragListener());
        img21.setOnDragListener(new MyDragListener());
        img22.setOnDragListener(new MyDragListener());
        img23.setOnDragListener(new MyDragListener());
        img31.setOnDragListener(new MyDragListener());
        img32.setOnDragListener(new MyDragListener());
        img33.setOnDragListener(new MyDragListener());


    }

    private final class MyClickListener implements View.OnLongClickListener {
        @Override
        public boolean onLongClick(View view) {

            ClipData.Item item = new ClipData.Item((CharSequence)view.getTag());

            String[] mimeTypes = { ClipDescription.MIMETYPE_TEXT_PLAIN };
            ClipData data = new ClipData(view.getTag().toString(), mimeTypes, item);
            DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);

            view.startDrag( data, shadowBuilder, view, 0);
            view.setVisibility(View.INVISIBLE);
            ClickedView = view.getTag().toString();
            return true;
        }
    }

    class MyDragListener implements OnDragListener {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()) {

                case DragEvent.ACTION_DRAG_STARTED:
                    break;

                case DragEvent.ACTION_DRAG_ENTERED:
                    break;

                case DragEvent.ACTION_DRAG_EXITED:
                    break;

                case DragEvent.ACTION_DROP:
                    if((v == findViewById(R.id.img11)) && (ClickedView.equals(IMAGE_TAG_1))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                       v.setBackground(getResources().getDrawable(R.drawable.r1c1));
                    }
                    else if((v == findViewById(R.id.img12)) && (ClickedView.equals(IMAGE_TAG_2))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r1c2));
                    }

                   else if((v == findViewById(R.id.img13)) && (ClickedView.equals(IMAGE_TAG_3))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r1c3));
                    }

                  else if((v == findViewById(R.id.img21)) && (ClickedView.equals(IMAGE_TAG_4))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r2c1));
                    }

                   else if((v == findViewById(R.id.img22)) && (ClickedView.equals(IMAGE_TAG_5))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r2c2));
                    }

                    else if((v == findViewById(R.id.img23)) && (ClickedView.equals(IMAGE_TAG_6))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r2c3));
                    }

                    else if((v == findViewById(R.id.img31)) && (ClickedView.equals(IMAGE_TAG_7))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r3c1));
                    }

                    else if((v == findViewById(R.id.img32)) && (ClickedView.equals(IMAGE_TAG_8))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r3c2));
                    }

                    else if((v == findViewById(R.id.img33)) && (ClickedView.equals(IMAGE_TAG_9))) {
                        View view = (View) event.getLocalState();
                        ViewGroup viewgroup = (ViewGroup) view.getParent();
                        viewgroup.removeView(view);

                        v.setBackground(getResources().getDrawable(R.drawable.r3c3));
                    }

                    else {
                        View view = (View) event.getLocalState();
                        view.setVisibility(View.VISIBLE);
                        Context context = getApplicationContext();
                        Toast.makeText(context, "False Piece",
                                Toast.LENGTH_LONG).show();
                        break;
                    }
                    break;

                case DragEvent.ACTION_DRAG_ENDED:

                default:
                    break;


            }

return true;
        }

    }
}

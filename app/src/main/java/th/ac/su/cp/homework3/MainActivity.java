package th.ac.su.cp.homework3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import th.ac.su.cp.homework3.model.itemCartoon;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // สร้าง Adapter object
        MyAdapter adapter = new MyAdapter();
        // สร้าง Layout manager
        LinearLayoutManager lm = new LinearLayoutManager(MainActivity.this);

        // เข้าถึง RecyclerView ใน layout
        RecyclerView rv = findViewById(R.id.cartoon_list_recycler_view);
        rv.setLayoutManager(lm); // กำหนด layout manager ให้กับ RecyclerView
        rv.setAdapter(adapter); // กำหนด Adapter ให้กับ RecyclerView
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

        itemCartoon[] items = {
                new itemCartoon(R.drawable.coco,"coco","วันอลวน วิญญาณอลเวง"),
                new itemCartoon(R.drawable.gravity_falls,"Gravity Falls","แกร์วิตี้ฟอล"),
                new itemCartoon(R.drawable.inside_out,"Inside Out","มหัศจรรย์อารมณ์อลเวง"),
                new itemCartoon(R.drawable.kim_possible,"Kim Possible","คิม พอสสิเบิล"),
                new itemCartoon(R.drawable.mickey_mouse,"Mickey Mouse","มิกกี้ เมาส์"),
                new itemCartoon(R.drawable.monster_university,"Monster University","มหาลัย มอนส์เตอร์"),
                new itemCartoon(R.drawable.onward,"Onward","คู่ซ่าล่ามนต์มหัศจรรย์"),
                new itemCartoon(R.drawable.phineas_and_ferb,"Phineas And Ferb","ฟีเนียสกับเฟิร์บ"),
                new itemCartoon(R.drawable.the_emperors_new_groove, "The Emperors New Groove","จักรพรรดิกลายพันธุ์ อัศจรรย์พันธุ์ต๊อง"),
                new itemCartoon(R.drawable.toy_story,"Toy Story","ทอย สตอรี่"),
                new itemCartoon(R.drawable.zootopia,"Zootopia","นครสัตว์มหาสนุก")
        };
        // WordItem item2;

        public MyAdapter(){
            /*item = new WordItem(R.drawable.cat,"CAT");
            item2 = new WordItem(R.drawable.dog,"DOG");*/

        }
        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.tiem_cartoon, parent, false);
            MyViewHolder vh = new MyViewHolder(v);
            return vh;

        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            holder.imageView.setImageResource(items[position].imageResId);
            holder.wordTextView.setText(items[position].word);
            holder.wordTextView2.setText(items[position].word2);


        }


        public int getItemCount(){
            // return 10;
            return items.length;
        }

        class MyViewHolder extends RecyclerView.ViewHolder {
            ImageView imageView;
            TextView wordTextView;
            TextView wordTextView2;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.imageView);
                wordTextView = itemView.findViewById(R.id.textE);
                wordTextView2 = itemView.findViewById(R.id.textT);
            }
        }
    }
}


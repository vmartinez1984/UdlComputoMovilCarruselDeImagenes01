package tk.vmartinez84.carruseldeimagenes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1=(ImageView)findViewById(R.id.ivVisor);


        ImageView imageView2=(ImageView)findViewById(R.id.ivCar2);
        ImageView imageView3=(ImageView)findViewById(R.id.ivCar3);
        ImageView imageView4=(ImageView)findViewById(R.id.ivCar4);
        ImageView imageView5=(ImageView)findViewById(R.id.ivCar5);

        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.ivCar2:
                imageView1.setImageResource(R.drawable.car2);
                break;
            case R.id.ivCar3:
                imageView1.setImageResource(R.drawable.car3);
                break;
            case R.id.ivCar4:
                imageView1.setImageResource(R.drawable.car4);
                break;
            case R.id.ivCar5:
                imageView1.setImageResource(R.drawable.car5);
                break;
            default:
                break;
        }
    }

}
package slvrstv.slvrstv.pricecomparison;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

import static slvrstv.slvrstv.pricecomparison.R.color.*;
import static slvrstv.slvrstv.pricecomparison.R.color.green;

public class MainActivity extends AppCompatActivity {

    private long backPressedTime;
    private Toast backToast;

    Button knopka, clear, add1, del1, add2, del2;
    EditText editText1, editText2, editText3, editText4, editText5, editText6, editText7, editText8;
    TextView textView1, textView2, textView3, textView4;
    Spinner spinner1, spinner2;
    LinearLayout LL1, LL2, LL3, LL4, LL5, LL6, LL7, LL8;
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        knopka = (Button) findViewById(R.id.knopka);
        clear = (Button) findViewById(R.id.clear);
        del1 = (Button) findViewById(R.id.del1);
        add1 = (Button) findViewById(R.id.add1);
        del2 = (Button) findViewById(R.id.del2);
        add2 = (Button) findViewById(R.id.add2);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText1.setHint("цена");
        editText1.setHintTextColor(getResources().getColor(grey));
        editText2 = (EditText) findViewById(R.id.editText2);
        editText2.setHint("кол-во");
        editText2.setHintTextColor(getResources().getColor(grey));
        editText3 = (EditText) findViewById(R.id.editText3);
        editText3.setHint("цена");
        editText3.setHintTextColor(getResources().getColor(grey));
        editText4 = (EditText) findViewById(R.id.editText4);
        editText4.setHint("кол-во");
        editText4.setHintTextColor(getResources().getColor(grey));
        editText5 = (EditText) findViewById(R.id.editText5);
        editText5.setHint("цена");
        editText5.setHintTextColor(getResources().getColor(grey));
        editText6 = (EditText) findViewById(R.id.editText6);
        editText6.setHint("кол-во");
        editText6.setHintTextColor(getResources().getColor(grey));
        editText7 = (EditText) findViewById(R.id.editText7);
        editText7.setHint("цена");
        editText7.setHintTextColor(getResources().getColor(grey));
        editText8 = (EditText) findViewById(R.id.editText8);
        editText8.setHint("кол-во");
        editText8.setHintTextColor(getResources().getColor(grey));
        textView1 = (TextView) findViewById(R.id.textView1);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        LL1 = (LinearLayout) findViewById(R.id.LL1);
        LL2 = (LinearLayout) findViewById(R.id.LL2);
        LL3 = (LinearLayout) findViewById(R.id.LL3);
        LL4 = (LinearLayout) findViewById(R.id.LL4);
        LL5 = (LinearLayout) findViewById(R.id.LL5);
        LL6 = (LinearLayout) findViewById(R.id.LL6);
        LL7 = (LinearLayout) findViewById(R.id.LL7);
        LL8 = (LinearLayout) findViewById(R.id.LL8);

        LL6.setVisibility(View.GONE);
        editText5.setVisibility(View.GONE);
        editText6.setVisibility(View.GONE);
        textView3.setVisibility(View.GONE);
        LL4.setVisibility(View.GONE);
        add2.setVisibility(View.GONE);
        del1.setVisibility(View.GONE);

        LL7.setVisibility(View.GONE);
        editText7.setVisibility(View.GONE);
        editText8.setVisibility(View.GONE);
        textView4.setVisibility(View.GONE);
        LL8.setVisibility(View.GONE);
        del2.setVisibility(View.GONE);

        add1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LL6.setVisibility(View.VISIBLE);
                editText5.setVisibility(View.VISIBLE);
                editText6.setVisibility(View.VISIBLE);
                textView3.setVisibility(View.VISIBLE);
                LL4.setVisibility(View.VISIBLE);
                add2.setVisibility(View.VISIBLE);
                del1.setVisibility(View.VISIBLE);
            }
        });

        del1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LL6.setVisibility(View.GONE);
                editText5.setVisibility(View.GONE);
                editText6.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                LL4.setVisibility(View.GONE);
                add2.setVisibility(View.GONE);
                del1.setVisibility(View.GONE);
            }
        });

        add2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LL7.setVisibility(View.VISIBLE);
                editText7.setVisibility(View.VISIBLE);
                editText8.setVisibility(View.VISIBLE);
                textView4.setVisibility(View.VISIBLE);
                LL8.setVisibility(View.VISIBLE);
                del2.setVisibility(View.VISIBLE);
            }
        });

        del2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LL7.setVisibility(View.GONE);
                editText7.setVisibility(View.GONE);
                editText8.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                LL8.setVisibility(View.GONE);
                del2.setVisibility(View.GONE);
            }
        });

        knopka.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double a, b, c, e, f, g, i, j, k, m, n, o;

                String K1 = editText1.getText().toString(); //считывание текстовых значений
                String K2 = editText2.getText().toString(); //считывание текстовых значений
                String K3 = editText3.getText().toString(); //считывание текстовых значений
                String K4 = editText4.getText().toString(); //считывание текстовых значений
                String K5 = editText5.getText().toString();
                String K6 = editText6.getText().toString();
                String K7 = editText7.getText().toString();
                String K8 = editText8.getText().toString();

                if (K1.matches("")) {
                    a = 0;
                    b = 0;
                } else {
                    a = Double.parseDouble(K1); //текст в числа
                    b = Double.parseDouble(K2); //текст в числа
                }

                if (K2.matches("")) {
                    a = 0;
                    b = 0;
                } else {
                    a = Double.parseDouble(K1); //текст в числа
                    b = Double.parseDouble(K2); //текст в числа
                }

                if (K3.matches("")) {
                    e = 0;
                    f = 0;
                } else {
                    e = Double.parseDouble(K3); //текст в числа
                    f = Double.parseDouble(K4); //текст в числа
                }

                if (K4.matches("")) {
                    e = 0;
                    f = 0;
                } else {
                    e = Double.parseDouble(K3); //текст в числа
                    f = Double.parseDouble(K4); //текст в числа
                }

                if (K5.matches("")) {
                    i = 0;
                    j = 0;
                } else {
                    i = Double.parseDouble(K5);
                    j = Double.parseDouble(K6);
                }

                if (K6.matches("")) {
                    i = 0;
                    j = 0;
                } else {
                    i = Double.parseDouble(K5);
                    j = Double.parseDouble(K6);
                }

                if (K7.matches("")) {
                    m = 0;
                    n = 0;
                } else {
                    m = Double.parseDouble(K7);
                    n = Double.parseDouble(K8);
                }

                if (K8.matches("")) {
                    m = 0;
                    n = 0;
                } else {
                    m = Double.parseDouble(K7);
                    n = Double.parseDouble(K8);
                }

                c = a / b;
                g = e / f;
                k = i / j;
                o = m / n;

                double d = Math.round(c * 100.0) / 100.0; //округление до сотых
                double h = Math.round(g * 100.0) / 100.0;
                double l = Math.round(k * 100.0) / 100.0;
                double p = Math.round(o * 100.0) / 100.0;
                String S1 = Double.toString(d); //число в текст
                String S2 = Double.toString(h);
                String S3 = Double.toString(l);
                String S4 = Double.toString(p);
                textView1.setText(S1);
                textView2.setText(S2);
                if (l == 0 & textView3.getVisibility() == View.GONE) {
                    textView3.setText("цена за единицу");
                    textView3.setTextColor(getResources().getColor(white));
                } else if (textView3.getVisibility() == View.VISIBLE); {
                    textView3.setText(S3);
                }

                if (p == 0 & textView4.getVisibility() == View.GONE) {
                    textView4.setText("PRICE FOR ONE");
                    textView4.setTextColor(getResources().getColor(white));
                } else if (textView4.getVisibility() == View.VISIBLE); {
                    textView4.setText(S4);
                }

               if (d == h & d == l & l == p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                    textView1.setTextColor(getResources().getColor(green));
                    textView2.setTextColor(getResources().getColor(green));
                    textView3.setTextColor(getResources().getColor(green));
                    textView4.setTextColor(getResources().getColor(green));
                } else if (d == h & h == l & l < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (d == h & h == p & p < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                    textView1.setTextColor(getResources().getColor(green));
                    textView2.setTextColor(getResources().getColor(green));
                    textView3.setTextColor(getResources().getColor(red));
                    textView4.setTextColor(getResources().getColor(green));
               } else if (d == h & d < l & d < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (d == l & d == p & d < h & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (d == l & d < h & d < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (d == p & d < h & d < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (d < h & d < l & d < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (h == l & l == p & h < d & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (h == l & h < d & h < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (h == p & h < d & h < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (h < d & h < l & h < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (l == p & l < d & l < h & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (l < d & l < h & l < p & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (p < d & p < h & p < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (d == h & h == l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (d == h & h < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (d == l & d < h & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (d < h & d < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (h == l & h < d & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (h < d & h < l & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(red));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (l < d & l < h & textView3.getVisibility() == View.VISIBLE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(green));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (d == h & h < p & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (d == p & p < h & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (d < h & d < p & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (h == p & h < d & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (h < d & h < p & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(red));
               } else if (p < d & p < h & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (d == h & h == p & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.VISIBLE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(green));
               } else if (d < h & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(green));
                   textView2.setTextColor(getResources().getColor(red));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(white));
               } else if (d > h & textView3.getVisibility() == View.GONE & textView4.getVisibility() == View.GONE) {
                   textView1.setTextColor(getResources().getColor(red));
                   textView2.setTextColor(getResources().getColor(green));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(white));
               } else {
                   textView1.setTextColor(getResources().getColor(white));
                   textView2.setTextColor(getResources().getColor(white));
                   textView3.setTextColor(getResources().getColor(white));
                   textView4.setTextColor(getResources().getColor(white));
               }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.getText().clear();
                editText2.getText().clear();
                editText3.getText().clear();
                editText4.getText().clear();
                editText5.getText().clear();
                editText6.getText().clear();
                editText7.getText().clear();
                editText8.getText().clear();
                textView1.setText("цена за единицу");
                textView2.setText("цена за единицу");
                textView3.setText("цена за единицу");
                textView4.setText("цена за единицу");
                textView1.setTextColor(getResources().getColor(white));
                textView2.setTextColor(getResources().getColor(white));
                textView3.setTextColor(getResources().getColor(white));
                textView4.setTextColor(getResources().getColor(white));

            }
        });

        }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        }
        else {
            backToast = Toast.makeText(getBaseContext(), "press again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
}
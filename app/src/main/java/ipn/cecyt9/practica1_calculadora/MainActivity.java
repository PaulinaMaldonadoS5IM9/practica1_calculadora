package ipn.cecyt9.practica1_calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numberX, numberY, result;
    String operator;

        public void onClickButtonOne(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "1");
        }
        public void onClickButtonTwo(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "2");
        }
        public void onClickButtonThree(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "3");
        }
        public void onClickButtonFour(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "4");
        }
        public void onClickButtonFive(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "5");
        }
        public void onClickButtonSix(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "6");
        }
        public void onClickButtonSeven(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "7");
        }
        public void onClickButtonEight(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "8");
        }
        public void onClickButtonNine(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "9");
        }
        public void onClickButtonZero(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + "0");
        }
        public void onClickButtonPun(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText(value + ".");
        }
        public void onClickOperatorCaptureNumberX(View myView) {
            TextView tv = (TextView) findViewById(R.id.textView);
            numberX = Double.parseDouble(tv.getText().toString());
            tv.setText("");
        }
        public void onClickButtonClear(View miView){
            TextView tv = findViewById(R.id.textView);
            String value = tv.getText().toString();
            tv.setText("");
        }
        public void onClickButtonDelete(View miView){
            TextView tv = findViewById(R.id.textView);
            if(!tv.getText().toString().equals("")){
                tv.setText(tv.getText().subSequence(0,tv.getText().length()-1));
            }
        }
        public void onClickSum(View myView) {
            operator = "+";
            onClickOperatorCaptureNumberX(myView);
        }
        public void onClickRes(View myView) {
            operator = "-";
            onClickOperatorCaptureNumberX(myView);
        }
        public void onClickMul(View myView) {
            operator = "x";
            onClickOperatorCaptureNumberX(myView);
        }
        public void onClickDiv(View myView) {
            operator = "/";
            onClickOperatorCaptureNumberX(myView);
        }
        public void onClickPot(View myView) {
            operator = "^";
            onClickOperatorCaptureNumberX(myView);
        }
        public void onClickButtonSen(View myView) {
            TextView tv = (TextView) findViewById(R.id.textView);
            try {
                numberX = Double.parseDouble(tv.getText().toString());
                double rd = Math.toRadians(numberX);
                result = Math.sin(rd);
                tv.setText(String.valueOf(result));
            } catch(NullPointerException e) {
                Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
            }
            tv.setText(result.toString());
        }
        public void onClickButtonCos(View myView) {
            TextView tv = (TextView) findViewById(R.id.textView);

            try {
                numberX = Double.parseDouble(tv.getText().toString());
                double rd = Math.toRadians(numberX);
                result = Math.cos(rd);
                tv.setText(String.valueOf(result));
            } catch(NullPointerException e) {
                Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
            }
            tv.setText(result.toString());
        }
        public void onClickButtonTan(View myView) {
            TextView tv = (TextView) findViewById(R.id.textView);
            try {
                numberX = Double.parseDouble(tv.getText().toString());
                double rd = Math.toRadians(numberX);
                result = Math.tan(rd);
                tv.setText(String.valueOf(result));
            } catch(NullPointerException e) {
                Toast.makeText(this,"Incorrect Number", Toast.LENGTH_SHORT).show();
            }
            tv.setText(result.toString());
        }

        public void onClickEqual(View myView) {
            TextView tv = (TextView) findViewById(R.id.textView);
            numberY = Double.parseDouble(tv.getText().toString());
            try {
                if(operator.equals("+")) {
                    result = numberX + numberY;
                } else if(operator.equals("-")) {
                    result = numberX - numberY;
                } else if(operator.equals("x")) {
                    result = numberX * numberY;
                } else if(operator.equals("/")) {
                    result = numberX / numberY;
                } else if(operator.equals("^")) {
                    result = Math.pow(numberX, numberY);
                }
                tv.setText(result.toString());
            } catch(NullPointerException e) {
                Toast.makeText( this, "Incorrect Number", Toast.LENGTH_SHORT).show();
            }
        }
}
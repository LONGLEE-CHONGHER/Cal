package longlee.ch.calculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    String operator = null;
    int operand1, operand2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clear(View view) {
        ((TextView)findViewById(R.id.textView)).setText("");
        operand1 = 0;
        operand2 = 0;
        result = 0;
        operator = null;
    }

    public void equal(View view) {
        if (operator == null)
            return;
        TextView txtV = (TextView)findViewById(R.id.textView);
        if(txtV.getText().toString().equals(""))
            return;
        operand2 = Integer.parseInt(txtV.getText().toString());
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = operand1 / operand2;
                break;
            default:
                break;
        }
        txtV.setText("");
        txtV.setText(new Integer(result).toString());
    }

    public void plus(View view) {
        Button btnPlus = (Button)findViewById(R.id.btnPlus);
        TextView txtV = (TextView)findViewById(R.id.textView);
        if(txtV.getText().toString().equals(""))
            return;
        operand1 = Integer.parseInt(txtV.getText().toString());
        operator = btnPlus.getText().toString();
        txtV.setText("");
    }

    public void minus(View view) {
        Button btnMinus = (Button)findViewById(R.id.btnMinus);
        TextView txtV = (TextView)findViewById(R.id.textView);
        if(txtV.getText().toString().equals(""))
            return;
        operand1 = Integer.parseInt(txtV.getText().toString());
        operator = btnMinus.getText().toString();
        txtV.setText("");
    }

    public void multiply(View view) {
        Button btnMultiply = (Button)findViewById(R.id.btnMultiply);
        TextView txtV = (TextView)findViewById(R.id.textView);
        if(txtV.getText().toString().equals(""))
            return;
        operand1 = Integer.parseInt(txtV.getText().toString());
        operator = btnMultiply.getText().toString();
        txtV.setText("");
    }

    public void divide(View view) {
        Button btnDivide = (Button)findViewById(R.id.btnDivide);
        TextView txtV = (TextView)findViewById(R.id.textView);
        if(txtV.getText().toString().equals(""))
            return;
        operand1 = Integer.parseInt(txtV.getText().toString());
        operator = btnDivide.getText().toString();
        txtV.setText("");
    }

    public void enterOne(View view) {
        final Button btnOne = (Button)findViewById(R.id.btnOne);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnOne.getText());
    }

    public void enterTwo(View view) {
        final Button btnTwo = (Button)findViewById(R.id.btnTwo);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnTwo.getText());
    }

    public void enterThree(View view) {
        final Button btnThree = (Button)findViewById(R.id.btnThree);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnThree.getText());
    }

    public void enterFour(View view) {
        final Button btnFour = (Button)findViewById(R.id.btnFour);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnFour.getText());
    }

    public void enterFive(View view) {
        final Button btnFive = (Button)findViewById(R.id.btnFive);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnFive.getText());
    }

    public void enterSix(View view) {
        final Button btnSix = (Button)findViewById(R.id.btnSix);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnSix.getText());
    }

    public void enterSeven(View view) {
        final Button btnSeven = (Button)findViewById(R.id.btnSeven);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnSeven.getText());
    }

    public void enterEight(View view) {
        final Button btnEight = (Button)findViewById(R.id.btnEight);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnEight.getText());
    }

    public void enterNine(View view) {
        final Button btnNine = (Button)findViewById(R.id.btnNine);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnNine.getText());
    }

    public void enterZero(View view) {
        final Button btnZero = (Button)findViewById(R.id.btnZero);
        TextView txtV = (TextView)findViewById(R.id.textView);
        txtV.append(btnZero.getText());
    }


}
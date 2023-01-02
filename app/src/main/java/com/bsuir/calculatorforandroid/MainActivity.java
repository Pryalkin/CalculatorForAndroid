package com.bsuir.calculatorforandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bsuir.calculatorforandroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean flag = false;
    private boolean flag2 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.output.setText("");
                binding.input.setText("");
            }
        });

        binding.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (!sbInput.toString().equals("")){
                    String newInput = sbInput.substring(0, sbInput.length()-1);
                    binding.input.setText(newInput);
                }
            }
        });

        binding.equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (!sbInput.toString().equals("")){
                    if (checkType(sbInput)){
                        double input = Double.parseDouble(sbInput.toString());
                        calculationMethod(input, '=');
                    } else {
                        int input = Integer.parseInt(sbInput.toString());
                        calculationMethod(input, '=');
                    }
                }
            }
        });

        binding.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("1");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("2");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("3");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("4");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("5");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("6");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("7");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("8");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("9");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder(binding.input.getText().toString());
                if (flag){
                    sb = new StringBuilder();
                    flag = false;
                }
                sb.append("0");
                binding.input.setText(sb);
                flag2 = true;
            }
        });

        binding.dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (!sbInput.toString().equals("")) {
                    if (checkType(sbInput)) {
                        Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    sbInput.append(".");
                    binding.input.setText(sbInput);
                    flag2 = true;
                }
            }
        });

        binding.divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (flag2){
                    binding.output.setText(sbInput.toString() + " ÷ ");
                } else {
                    if (!sbInput.toString().equals("")) {
                        if (checkType(sbInput)) {
                            double input = Double.parseDouble(sbInput.toString());
                            calculationMethod(input, '÷');
                        } else {
                            int input = Integer.parseInt(sbInput.toString());
                            calculationMethod(input, '÷');
                        }
                    }
                }

//                getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT;

            }
        });

        binding.multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (flag2){
                    binding.output.setText(sbInput.toString() + " x ");
                } else {
                    if (!sbInput.toString().equals("")) {
                        if (checkType(sbInput)) {
                            double input = Double.parseDouble(sbInput.toString());
                            calculationMethod(input, 'x');
                        } else {
                            int input = Integer.parseInt(sbInput.toString());
                            calculationMethod(input, 'x');
                        }
                    }
                }
            }
        });

        binding.plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (flag2){
                    binding.output.setText(sbInput.toString() + " + ");
                } else {
                    if (!sbInput.toString().equals("")) {
                        if (checkType(sbInput)) {
                            double input = Double.parseDouble(sbInput.toString());
                            calculationMethod(input, '+');
                        } else {
                            int input = Integer.parseInt(sbInput.toString());
                            calculationMethod(input, '+');
                        }
                    }
                }
            }
        });

        binding.minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sbInput = new StringBuilder(binding.input.getText().toString());
                if (flag2){
                    binding.output.setText(sbInput.toString() + " - ");
                } else {
                    if (!sbInput.toString().equals("")) {
                        if (checkType(sbInput)) {
                            double input = Double.parseDouble(sbInput.toString());
                            calculationMethod(input, '-');
                        } else {
                            int input = Integer.parseInt(sbInput.toString());
                            calculationMethod(input, '-');
                        }
                    }
                }
            }
        });
    }

    private void calculationMethod(double input, char symbol) {
        StringBuilder sbOutput = new StringBuilder(binding.output.getText().toString());
        if (sbOutput.toString().equals("")){
            binding.output.setText(input + " " + symbol + " ");
            binding.input.setText(String.valueOf(input));
            flag = true;
        } else {
            char c = sbOutput.charAt(sbOutput.length()-2);
            if (checkType(sbOutput)){
                double output = methodForDouble(sbOutput.toString());
                calculationMethod2(input, output, c, symbol);
            } else {
                int output = methodForInt(sbOutput.toString());
                calculationMethod2(input, output, c, symbol);
            }
        }
    }

    private void calculationMethod(int input, char symbol) {
        StringBuilder sbOutput = new StringBuilder(binding.output.getText().toString());
        if (sbOutput.toString().equals("")){
            binding.output.setText(input + " " + symbol + " ");
            binding.input.setText(String.valueOf(input));
            flag = true;
        } else {
            char c = sbOutput.charAt(sbOutput.length()-2);
            if (checkType(sbOutput)){
                double output = methodForDouble(sbOutput.toString());
                calculationMethod2(input, output, c, symbol);
            } else {
                int output = methodForInt(sbOutput.toString());
                calculationMethod2(input, output, c, symbol);
            }
        }
    }

    private void calculationMethod2(int input, double output, char c, char symbol) {
        switch (c){
            case '+':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output + input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output + input));
                flag = true;
                break;
            case '-':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output - input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output - input));
                flag = true;
                break;
            case 'x':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output * input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output * input));
                flag = true;
                break;
            case '÷':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output / input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output / input));
                flag = true;
                break;
            case '=':
                binding.output.setText(binding.input.getText().toString() + " " + symbol + " ");
                break;
            default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void calculationMethod2(int input, int output, char c, char symbol) {
        switch (c){
            case '+':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output + input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output + input));
                flag = true;
                break;
            case '-':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output - input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output - input));
                flag = true;
                break;
            case 'x':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output * input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output * input));
                flag = true;
                break;
            case '÷':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output / input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output / input));
                flag = true;
                break;
            case '=':
                binding.output.setText(binding.input.getText().toString() + " " + symbol + " ");
                break;
            default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void calculationMethod2(double input, double output, char c, char symbol) {
        switch (c){
            case '+':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output + input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output + input));
                flag = true;
                break;
            case '-':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output - input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output - input));
                flag = true;
                break;
            case 'x':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output * input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output * input));
                flag = true;
                break;
            case '÷':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output / input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output / input));
                flag = true;
                break;
            case '=':
                binding.output.setText(binding.input.getText().toString() + " " + symbol + " ");
                break;
            default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private void calculationMethod2(double input, int output, char c, char symbol) {
        switch (c){
            case '+':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output + input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output + input));
                flag = true;
                break;
            case '-':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output - input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output - input));
                flag = true;
                break;
            case 'x':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output * input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output * input));
                flag = true;
                break;
            case '÷':
                if (symbol == '=') binding.output.setText(output + " " + c + " " + input + " " + symbol + " ");
                else binding.output.setText((output / input) + " " + symbol + " ");
                binding.input.setText(String.valueOf(output / input));
                flag = true;
                break;
            case '=':
                binding.output.setText(binding.input.getText().toString() + " " + symbol + " ");
                break;
            default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
        }
    }

    private double methodForDouble(String line) {
        char[] arr = new char[line.length()];
        line.getChars(0, line.length(), arr, 0);
        StringBuilder sb = new StringBuilder();
        for (char c: arr) {
            switch (c){
                case '0':
                    sb.append("0");
                    break;
                case '1':
                    sb.append("1");
                    break;
                case '2':
                    sb.append("2");
                    break;
                case '3':
                    sb.append("3");
                    break;
                case '4':
                    sb.append("4");
                    break;
                case '5':
                    sb.append("5");
                    break;
                case '6':
                    sb.append("6");
                    break;
                case '7':
                    sb.append("7");
                    break;
                case '8':
                    sb.append("8");
                    break;
                case '9':
                    sb.append("9");
                    break;
                case '.':
                    sb.append(".");
                    break;
                case ' ':
                    return Double.parseDouble(sb.toString());
                default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
        return 0.0;
    }

    private int methodForInt(String line) {
        char[] arr = new char[line.length()];
        line.getChars(0, line.length(), arr, 0);
        StringBuilder sb = new StringBuilder();
        for (char c: arr) {
            switch (c){
                case '0':
                    sb.append("0");
                    break;
                case '1':
                    sb.append("1");
                    break;
                case '2':
                    sb.append("2");
                    break;
                case '3':
                    sb.append("3");
                    break;
                case '4':
                    sb.append("4");
                    break;
                case '5':
                    sb.append("5");
                    break;
                case '6':
                    sb.append("6");
                    break;
                case '7':
                    sb.append("7");
                    break;
                case '8':
                    sb.append("8");
                    break;
                case '9':
                    sb.append("9");
                    break;
                case ' ':
                    return Integer.parseInt(sb.toString());
                default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
        return 0;
    }

    private boolean checkType(StringBuilder sb) {
        char[] arr = new char[sb.length()];
        sb.getChars(0, sb.length(), arr, 0);
        for (char c: arr) {
            if (c == '.') {
                return true;
            }
        }
        return false;
    }

    private double methodForOrientationPortrait(String line) {
        char[] arr = new char[line.length()];
        line.getChars(0, line.length(), arr, 0);
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: arr) {
            switch (c){
                case '0':
                    stringBuilder.append("0");
                    break;
                case '1':
                    stringBuilder.append("1");
                    break;
                case '2':
                    stringBuilder.append("2");
                    break;
                case '3':
                    stringBuilder.append("3");
                    break;
                case '4':
                    stringBuilder.append("4");
                    break;
                case '5':
                    stringBuilder.append("5");
                    break;
                case '6':
                    stringBuilder.append("6");
                    break;
                case '7':
                    stringBuilder.append("7");
                    break;
                case '8':
                    stringBuilder.append("8");
                    break;
                case '9':
                    stringBuilder.append("9");
                    break;
                case ' ':
                    return Double.parseDouble(stringBuilder.toString());
                default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
        return 0;
    }

    private void method(StringBuilder sb) {
        char[] arr = new char[sb.length()];
        sb.getChars(0, sb.length(), arr, 0);
        double value1 = 0.0;
        double value2 = 0.0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c: arr) {
            switch (sb.charAt(sb.length()-1)){
                case '0':
                    stringBuilder.append("0");
                    break;
                case '1':
                    stringBuilder.append("1");
                    break;
                case '2':
                    stringBuilder.append("2");
                    break;
                case '3':
                    stringBuilder.append("3");
                    break;
                case '4':
                    stringBuilder.append("4");
                    break;
                case '5':
                    stringBuilder.append("5");
                    break;
                case '6':
                    stringBuilder.append("6");
                    break;
                case '7':
                    stringBuilder.append("7");
                    break;
                case '8':
                    stringBuilder.append("8");
                    break;
                case '9':
                    stringBuilder.append("9");
                    break;
                case ' ':
                    break;
                case '+':
                    value2 = Double.parseDouble(stringBuilder.toString());
                    value1 += value2;
                    break;
                case '-':
                    value2 = Double.parseDouble(stringBuilder.toString());
                    value1 -= value2;
                    break;
                case 'x':
                    value2 = Double.parseDouble(stringBuilder.toString());
                    value1 *= value2;
                    break;
                case '÷':
                    value2 = Double.parseDouble(stringBuilder.toString());
                    value1 /= value2;
                    break;
                default: Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
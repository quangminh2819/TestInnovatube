package com.example.minhpq.testinnovatube;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText numberArr;
    private Button buttonSummit;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context context = getApplicationContext();
        numberArr = (EditText)findViewById(R.id.numberArray);
        buttonSummit = (Button)findViewById(R.id.button);
        result = (TextView)findViewById(R.id.textResult);
        final Solution solution = new Solution();
        buttonSummit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(numberArr.getText().toString().equals("")){
                    Toast.makeText(context, "You must enter your array!", Toast.LENGTH_SHORT).show();
                } else {
                    String arr = numberArr.getText().toString();
                    String[] arr2 = arr.trim().split("");
                    int[] A = new int[arr2.length];
                    for(int i=1; i<arr2.length; i++){
                        A[i] = Integer.parseInt(arr2[i]);
                    }
                    result.setText("You miss number " + String.valueOf(solution.solution(A)) + " in your array");
                }
            }
        });
    }
//     private static int result1;
//        public static int solution(int[] A){
//            Arrays.sort(A);
//            for(int i=0; i<A.length+1; i++){
//                if((A[i] + 1) != A[i+1]){
//                    result1 = A[i] + 1;
//                    break;
//                }
//            }
//            return result1;
//        };
}

package sdeak.purdue.edu.lifecouter;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class GameView3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_view3);

        String lifeTotal = getIntent().getStringExtra("LIFE_TOTAL").isEmpty() ? "0" : getIntent().getStringExtra("LIFE_TOTAL");
        TextView p1 = findViewById(R.id.p1);
        p1.setText(lifeTotal);
        TextView p2 = findViewById(R.id.p2);
        p2.setText(lifeTotal);
        TextView p3 = findViewById(R.id.p3);
        p3.setText(lifeTotal);

        final int holdValue = getIntent().getStringExtra("HOLD_VALUE").isEmpty() ? 5 : Integer.parseInt(getIntent().getStringExtra("HOLD_VALUE"));

        String awake = getIntent().getStringExtra("AWAKE");
        if(awake.equals("True"))
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        int p1Color = Integer.parseInt(getIntent().getStringExtra("P1_COLOR"));
        TextView p1Border = findViewById(R.id.p1Border);

        switch(p1Color) {
            case 0:
                p1Border.setBackgroundResource(R.drawable.border_red);
                break;

            case 1:
                p1Border.setBackgroundResource(R.drawable.border_blue);
                break;

            case 2:
                p1Border.setBackgroundResource(R.drawable.border_purple);
                break;

            case 3:
                p1Border.setBackgroundResource(R.drawable.border_green);
                break;
        }

        int p2Color = Integer.parseInt(getIntent().getStringExtra("P2_COLOR"));
        TextView p2Border = findViewById(R.id.p2Border);

        switch(p2Color) {
            case 0:
                p2Border.setBackgroundResource(R.drawable.border_red);
                break;

            case 1:
                p2Border.setBackgroundResource(R.drawable.border_blue);
                break;

            case 2:
                p2Border.setBackgroundResource(R.drawable.border_purple);
                break;

            case 3:
                p2Border.setBackgroundResource(R.drawable.border_green);
                break;
        }

        int p3Color = Integer.parseInt(getIntent().getStringExtra("P3_COLOR"));
        TextView p3Border = findViewById(R.id.p3Border);

        switch(p3Color) {
            case 0:
                p3Border.setBackgroundResource(R.drawable.border_red);
                break;

            case 1:
                p3Border.setBackgroundResource(R.drawable.border_blue);
                break;

            case 2:
                p3Border.setBackgroundResource(R.drawable.border_purple);
                break;

            case 3:
                p3Border.setBackgroundResource(R.drawable.border_green);
                break;
        }

        Button p1Add = findViewById(R.id.p1Add);
        p1Add.setOnTouchListener(new View.OnTouchListener() {
            Handler handle = new Handler();
            Runnable runner = new Runnable() {
                @Override
                public void run() {
                    TextView p1 = findViewById(R.id.p1);
                    int val = Integer.parseInt(p1.getText().toString());
                    int result = val + holdValue;
                    p1.setText(result + "");
                    handle.postDelayed(runner, 500);
                }
            };

            private void handler(boolean jump) {
                if (jump)
                    handle.postDelayed(runner, 500);
                else
                    handle.removeCallbacks(runner);
            }

            long dTime = 0;
            long uTime = 0;
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                switch(e.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dTime = e.getEventTime();
                        handler(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        uTime = e.getEventTime();
                        if(uTime - dTime < 500) {
                            TextView p1 = findViewById(R.id.p1);
                            int val = Integer.parseInt(p1.getText().toString());
                            int result = val + 1;
                            p1.setText(result + "");
                        }
                        handler(false);
                        break;
                }
                return true;
            }
        });

        Button p2Add = findViewById(R.id.p2Add);
        p2Add.setOnTouchListener(new View.OnTouchListener() {
            Handler handle = new Handler();
            Runnable runner = new Runnable() {
                @Override
                public void run() {
                    TextView p2 = findViewById(R.id.p2);
                    int val = Integer.parseInt(p2.getText().toString());
                    int result = val + holdValue;
                    p2.setText(result + "");
                    handle.postDelayed(runner, 500);
                }
            };

            private void handler(boolean jump) {
                if (jump)
                    handle.postDelayed(runner, 500);
                else
                    handle.removeCallbacks(runner);
            }

            long dTime = 0;
            long uTime = 0;
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                switch(e.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dTime = e.getEventTime();
                        handler(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        uTime = e.getEventTime();
                        if(uTime - dTime < 500) {
                            TextView p2 = findViewById(R.id.p2);
                            int val = Integer.parseInt(p2.getText().toString());
                            int result = val + 1;
                            p2.setText(result + "");
                        }
                        handler(false);
                        break;
                }
                return true;
            }
        });

        Button p3Add = findViewById(R.id.p3Add);
        p3Add.setOnTouchListener(new View.OnTouchListener() {
            Handler handle = new Handler();
            Runnable runner = new Runnable() {
                @Override
                public void run() {
                    TextView p3 = findViewById(R.id.p3);
                    int val = Integer.parseInt(p3.getText().toString());
                    int result = val + holdValue;
                    p3.setText(result + "");
                    handle.postDelayed(runner, 500);
                }
            };

            private void handler(boolean jump) {
                if (jump)
                    handle.postDelayed(runner, 500);
                else
                    handle.removeCallbacks(runner);
            }

            long dTime = 0;
            long uTime = 0;
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                switch(e.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dTime = e.getEventTime();
                        handler(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        uTime = e.getEventTime();
                        if(uTime - dTime < 500) {
                            TextView p3 = findViewById(R.id.p3);
                            int val = Integer.parseInt(p3.getText().toString());
                            int result = val + 1;
                            p3.setText(result + "");
                        }
                        handler(false);
                        break;
                }
                return true;
            }
        });

        Button p1Sub = findViewById(R.id.p1Sub);
        p1Sub.setOnTouchListener(new View.OnTouchListener() {
            Handler handle = new Handler();
            Runnable runner = new Runnable() {
                @Override
                public void run() {
                    TextView p1 = findViewById(R.id.p1);
                    int val = Integer.parseInt(p1.getText().toString());
                    int result = val - holdValue;
                    p1.setText(result + "");
                    handle.postDelayed(runner, 500);
                }
            };

            private void handler(boolean jump) {
                if (jump)
                    handle.postDelayed(runner, 500);
                else
                    handle.removeCallbacks(runner);
            }

            long dTime = 0;
            long uTime = 0;
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                switch(e.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dTime = e.getEventTime();
                        handler(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        uTime = e.getEventTime();
                        if(uTime - dTime < 500) {
                            TextView p1 = findViewById(R.id.p1);
                            int val = Integer.parseInt(p1.getText().toString());
                            int result = val - 1;
                            p1.setText(result + "");
                        }
                        handler(false);
                        break;
                }
                return true;
            }
        });

        Button p2Sub = findViewById(R.id.p2Sub);
        p2Sub.setOnTouchListener(new View.OnTouchListener() {
            Handler handle = new Handler();
            Runnable runner = new Runnable() {
                @Override
                public void run() {
                    TextView p2 = findViewById(R.id.p2);
                    int val = Integer.parseInt(p2.getText().toString());
                    int result = val - holdValue;
                    p2.setText(result + "");
                    handle.postDelayed(runner, 500);
                }
            };

            private void handler(boolean jump) {
                if (jump)
                    handle.postDelayed(runner, 500);
                else
                    handle.removeCallbacks(runner);
            }

            long dTime = 0;
            long uTime = 0;
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                switch(e.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dTime = e.getEventTime();
                        handler(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        uTime = e.getEventTime();
                        if(uTime - dTime < 500) {
                            TextView p2 = findViewById(R.id.p2);
                            int val = Integer.parseInt(p2.getText().toString());
                            int result = val - 1;
                            p2.setText(result + "");
                        }
                        handler(false);
                        break;
                }
                return true;
            }
        });

        Button p3Sub = findViewById(R.id.p3Sub);
        p3Sub.setOnTouchListener(new View.OnTouchListener() {
            Handler handle = new Handler();
            Runnable runner = new Runnable() {
                @Override
                public void run() {
                    TextView p3 = findViewById(R.id.p3);
                    int val = Integer.parseInt(p3.getText().toString());
                    int result = val - holdValue;
                    p3.setText(result + "");
                    handle.postDelayed(runner, 500);
                }
            };

            private void handler(boolean jump) {
                if (jump)
                    handle.postDelayed(runner, 500);
                else
                    handle.removeCallbacks(runner);
            }

            long dTime = 0;
            long uTime = 0;
            @Override
            public boolean onTouch(View v, MotionEvent e) {
                switch(e.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        dTime = e.getEventTime();
                        handler(true);
                        break;

                    case MotionEvent.ACTION_UP:
                        uTime = e.getEventTime();
                        if(uTime - dTime < 500) {
                            TextView p3 = findViewById(R.id.p3);
                            int val = Integer.parseInt(p3.getText().toString());
                            int result = val - 1;
                            p3.setText(result + "");
                        }
                        handler(false);
                        break;
                }
                return true;
            }
        });
    }
}
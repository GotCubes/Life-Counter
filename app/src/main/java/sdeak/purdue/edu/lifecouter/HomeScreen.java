package sdeak.purdue.edu.lifecouter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        ImageButton startGame = findViewById(R.id.startGame);
        startGame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView playerCount = findViewById(R.id.playerCount);
                int numPlayers = Integer.parseInt(playerCount.getText().toString());

                EditText lifeTotal = findViewById(R.id.lifeTotal);
                String startingLT = lifeTotal.getText().toString();

                EditText holdValue = findViewById(R.id.holdValue);
                String holdVal = holdValue.getText().toString();

                CheckBox awakeSelect = findViewById(R.id.awakeSelect);
                String awake = awakeSelect.isChecked() ? "True" : "False";

                Spinner p1Color = findViewById(R.id.p1Color);
                String p1C = p1Color.getSelectedItemPosition() + "";

                Spinner p2Color = findViewById(R.id.p2Color);
                String p2C = p2Color.getSelectedItemPosition() + "";

                Spinner p3Color = findViewById(R.id.p3Color);
                String p3C = p3Color.getSelectedItemPosition() + "";

                Spinner p4Color = findViewById(R.id.p4Color);
                String p4C = p4Color.getSelectedItemPosition() + "";

                switch(numPlayers) {
                    case 1:
                        Intent intent1 = new Intent(HomeScreen.this, GameView1.class);
                        intent1.putExtra("LIFE_TOTAL", startingLT);
                        intent1.putExtra("HOLD_VALUE", holdVal);
                        intent1.putExtra("P1_COLOR", p1C);
                        intent1.putExtra("AWAKE", awake);
                        startActivity(intent1);
                        break;

                    case 2:
                        Intent intent2 = new Intent(HomeScreen.this, GameView2.class);
                        intent2.putExtra("LIFE_TOTAL", startingLT);
                        intent2.putExtra("HOLD_VALUE", holdVal);
                        intent2.putExtra("P1_COLOR", p1C);
                        intent2.putExtra("P2_COLOR", p2C);
                        intent2.putExtra("AWAKE", awake);
                        startActivity(intent2);
                        break;

                    case 3:
                        Intent intent3 = new Intent(HomeScreen.this, GameView3.class);
                        intent3.putExtra("LIFE_TOTAL", startingLT);
                        intent3.putExtra("HOLD_VALUE", holdVal);
                        intent3.putExtra("P1_COLOR", p1C);
                        intent3.putExtra("P2_COLOR", p2C);
                        intent3.putExtra("P3_COLOR", p3C);
                        intent3.putExtra("AWAKE", awake);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(HomeScreen.this, GameView4.class);
                        intent4.putExtra("LIFE_TOTAL", startingLT);
                        intent4.putExtra("HOLD_VALUE", holdVal);
                        intent4.putExtra("P1_COLOR", p1C);
                        intent4.putExtra("P2_COLOR", p2C);
                        intent4.putExtra("P3_COLOR", p3C);
                        intent4.putExtra("P4_COLOR", p4C);
                        intent4.putExtra("AWAKE", awake);
                        startActivity(intent4);
                        break;
                }
            }
        });

        SeekBar players = findViewById(R.id.players);
        players.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                TextView playerCount = findViewById(R.id.playerCount);
                int val = i + 1;
                playerCount.setText(val + "");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Spinner p1Color = findViewById(R.id.p1Color);
        p1Color.setSelection(0);

        Spinner p2Color = findViewById(R.id.p2Color);
        p2Color.setSelection(1);

        Spinner p3Color = findViewById(R.id.p3Color);
        p3Color.setSelection(2);

        Spinner p4Color = findViewById(R.id.p4Color);
        p4Color.setSelection(3);
    }
}

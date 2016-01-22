package elton.guesswhatsnext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

//hi adi
public class MainActivity extends AppCompatActivity {

    public String pokerCardsDeck[]= {"1s","1d","1c","1h","2s","2d","2c","2h","3s","3d","3c","3h",
            "4s","4d","4c","4h","5s","5d","5c","5h","6s","6d","6c","6h","7s","7d","7c","7h",
            "8s","8d","8c","8h","9s","9d","9c","9h","10s","10d","10c","10h","Js","Jd","Jc","Jh",
            "Qs","Qd","Qc","Qh","Ks","Kd","Kc","Kh"}; //deck of cards

    Button mDeck;
    TextView mDrawnCard;
    TextView mDrawnCard2;
    ImageView mImgView1;

    public int mIfCounter = 0;

    //int[] myImageList = new int[]{R.drawable.agnes, R.drawable.gummy, R.drawable.monkey};

    ArrayList<Integer> myImageList = new ArrayList<>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mDeck = (Button) findViewById(R.id.cardBack);
        mDrawnCard = (TextView) findViewById(R.id.drawnCard);
        mDrawnCard2 = (TextView) findViewById(R.id.drawnCard2);
        mImgView1 = (ImageView) findViewById(R.id.imageView);

        //deck of cards
        myImageList.add(R.drawable.ace_of_clubs);
        myImageList.add(R.drawable.ace_of_diamonds);
        myImageList.add(R.drawable.ace_of_hearts);
        myImageList.add(R.drawable.ace_of_spades2);

        myImageList.add(R.drawable.jack_of_clubs2);
        myImageList.add(R.drawable.jack_of_diamonds2);
        myImageList.add(R.drawable.jack_of_hearts2);
        myImageList.add(R.drawable.jack_of_spades2);

        myImageList.add(R.drawable.queen_of_clubs2);
        myImageList.add(R.drawable.queen_of_diamonds2);
        myImageList.add(R.drawable.queen_of_hearts2);
        myImageList.add(R.drawable.queen_of_spades2);

        myImageList.add(R.drawable.king_of_spades2);
        myImageList.add(R.drawable.king_of_hearts2);
        myImageList.add(R.drawable.king_of_diamonds2);
        myImageList.add(R.drawable.king_of_clubs2);

        myImageList.add(R.drawable.two_of_spades);
        myImageList.add(R.drawable.two_of_hearts);
        myImageList.add(R.drawable.two_of_diamonds);
        myImageList.add(R.drawable.two_of_clubs);

        myImageList.add(R.drawable.three_of_clubs);
        myImageList.add(R.drawable.three_of_diamonds);
        myImageList.add(R.drawable.three_of_hearts);
        myImageList.add(R.drawable.three_of_spades);

        myImageList.add(R.drawable.four_of_spades);
        myImageList.add(R.drawable.four_of_hearts);
        myImageList.add(R.drawable.four_of_diamonds);
        myImageList.add(R.drawable.four_of_clubs);

        myImageList.add(R.drawable.five_of_spades);
        myImageList.add(R.drawable.five_of_hearts);
        myImageList.add(R.drawable.five_of_diamonds);
        myImageList.add(R.drawable.five_of_clubs);

        myImageList.add(R.drawable.six_of_clubs);
        myImageList.add(R.drawable.six_of_diamonds);
        myImageList.add(R.drawable.six_of_hearts);
        myImageList.add(R.drawable.six_of_spades);

        myImageList.add(R.drawable.seven_of_spades);
        myImageList.add(R.drawable.seven_of_diamonds);
        myImageList.add(R.drawable.seven_of_hearts);
        myImageList.add(R.drawable.seven_of_clubs);

        myImageList.add(R.drawable.eight_of_clubs);
        myImageList.add(R.drawable.eight_of_diamonds);
        myImageList.add(R.drawable.eight_of_hearts);
        myImageList.add(R.drawable.eight_of_spades);

        myImageList.add(R.drawable.nine_of_clubs);
        myImageList.add(R.drawable.nine_of_diamonds);
        myImageList.add(R.drawable.nine_of_hearts);
        myImageList.add(R.drawable.nine_of_spades);

        myImageList.add(R.drawable.ten_of_diamonds);
        myImageList.add(R.drawable.ten_of_clubs);
        myImageList.add(R.drawable.ten_of_hearts);
        myImageList.add(R.drawable.ten_of_spades);
        //shuffle the deck
        Collections.shuffle(myImageList);

        //shuffle deck
       /* int theLength = pokerCardsDeck.length - 1;
        int toSwap; // The index we will swap  (i.e. the random number)
        String temp; // A temporary variable to hold reference to index variable i points to
        for (int i = theLength; i > 0; i--) {
            toSwap = new Random().nextInt(i);
            temp = pokerCardsDeck[i];
            pokerCardsDeck[i] = pokerCardsDeck[toSwap];
            pokerCardsDeck[toSwap] = temp;
        }*/

        mDeck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(mIfCounter<myImageList.size()-1){
                    mImgView1.setImageResource(myImageList.get(mIfCounter));
                    mIfCounter++;
                } else if(mIfCounter==myImageList.size()-1){
                    mImgView1.setImageResource(myImageList.get(mIfCounter));
                    mIfCounter++;
                }
                else{
                    mDrawnCard.setText(getString(R.string.game_end));
                }
                //mImgView1.setImageResource(myImageList[0]);

               /* if (mIfCounter < pokerCardsDeck.length-1){
                    mDrawnCard.setText(pokerCardsDeck[mIfCounter]);
                    mIfCounter++;
                } else if (mIfCounter == pokerCardsDeck.length-1){
                    mDrawnCard.setText(pokerCardsDeck[mIfCounter]);
                    mIfCounter++;
                }
                else if (mIfCounter>pokerCardsDeck.length-1){
                    mDrawnCard.setText(getString(R.string.game_end));
                }


                mDrawnCard2.setText(Arrays.toString(pokerCardsDeck).replaceAll("\\[|\\]", "")); */
            }

        });


        //System.arraycopy(pokerCardsDeck, 1, pokerCardsDeck, 0, theLength - 1);



       /* for (int i = 0; i < theLength ; i++) {
            pokerCardsDeck[i]=pokerCardsDeck[i+1];
        }*/





    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}

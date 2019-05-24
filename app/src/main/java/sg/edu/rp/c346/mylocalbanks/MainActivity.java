package sg.edu.rp.c346.mylocalbanks;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView DBSbank;
    TextView OCBCbank;
    TextView UOBbank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBSbank = findViewById(R.id.DBS);
        OCBCbank = findViewById(R.id.OCBC);
        UOBbank = findViewById(R.id.UOB);

        registerForContextMenu(DBSbank);
        registerForContextMenu(OCBCbank);
        registerForContextMenu(UOBbank);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        if (v.getId() == R.id.DBS) {
            menu.add(0, 0, 0, "Website");
            menu.add(0, 1, 1, "Contact bank");
        } else if (v.getId() == R.id.OCBC) {
            menu.add(0, 2, 1, "Website");
            menu.add(0, 3, 2, "Contact bank");
        } else if (v.getId() == R.id.UOB) {
            menu.add(0, 4, 1, "Website");
            menu.add(0, 5, 2, "Contact bank");
        }
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==0){

                    Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.dbs.com.sg/index/default.page"));
                    startActivity(intentCall);

                }

         else if(item.getItemId()==1){

                    Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse( "tel:" +1800111111 ));
                    startActivity(intentCall);


            }
        else if(item.getItemId()==2){

                    Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.uobgroup.com/uobgroup/index.page"));
                    startActivity(intentCall);


            }
        else if(item.getItemId()==3){

            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse( "tel:"+1800363333));
            startActivity(intentCall);


        }
        else if(item.getItemId()==4){

            Intent intentCall = new Intent(Intent.ACTION_VIEW, Uri.parse( "https://www.uobgroup.com/uobgroup/index.page"));
            startActivity(intentCall);


        }
        else if(item.getItemId()==5){

            Intent intentCall = new Intent(Intent.ACTION_DIAL, Uri.parse( "tel:"+1800222212));
            startActivity(intentCall);


        }


        return true;

    }


}
package cleancodesoft.com.shop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class countries  extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner customSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countries);
        customSpinner=findViewById(R.id.government_spinner);

        //spinnerItemList for spinner
        ArrayList<CustomItems> customList = new ArrayList<>();
        customList.add(new CustomItems("Alexandria"));
        customList.add(new CustomItems("Aswan"));
        customList.add(new CustomItems("Asyut"));
        customList.add(new CustomItems("Beheira"));
        customList.add(new CustomItems("Beni Suef"));
        customList.add(new CustomItems("Cairo"));
        customList.add(new CustomItems("Dakahlia"));
        customList.add(new CustomItems("Damietta"));
        customList.add(new CustomItems("Faiyum"));
        customList.add(new CustomItems("Gharbia"));
        customList.add(new CustomItems("Giza"));
        customList.add(new CustomItems("Ismailia"));
        customList.add(new CustomItems("Kafr El Sheikh"));
        customList.add(new CustomItems("Luxor"));
        customList.add(new CustomItems("Matruh"));
        customList.add(new CustomItems("Minya"));
        customList.add(new CustomItems("Monufia"));
        customList.add(new CustomItems("New Valley"));
        customList.add(new CustomItems("North Sinai"));
        customList.add(new CustomItems("Port Said"));
        customList.add(new CustomItems("Qalyubia"));
        customList.add(new CustomItems("Qena"));
        customList.add(new CustomItems("Red Sea"));
        customList.add(new CustomItems("Sharqia"));
        customList.add(new CustomItems("Sohag"));
        customList.add(new CustomItems("South Sinai"));
        customList.add(new CustomItems("Suez"));
        CustomAdapter customAdapter=new CustomAdapter(this,customList);
        if(customSpinner!=null){
            customSpinner.setAdapter(customAdapter);
            customSpinner.setOnItemSelectedListener(this);

    }
}
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        CustomItems items = (CustomItems) adapterView.getSelectedItem();
        Toast.makeText(this, items.getSpinnerText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}

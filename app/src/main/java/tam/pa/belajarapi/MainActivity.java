package tam.pa.belajarapi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tam.pa.belajarapi.api.API;
import tam.pa.belajarapi.model.DaftarKomunitas;
import tam.pa.belajarapi.model.Komunitas;

public class MainActivity extends AppCompatActivity {
    private List<DaftarKomunitas> dataList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadData();
    }
//    TODO 5 Get Data
    private void LoadData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        API api = retrofit.create(API.class);
        Call<Komunitas> call = api.view();
        call.enqueue(new Callback<Komunitas>() {
            @Override
            public void onResponse(Call<Komunitas> call, Response<Komunitas> response) {
                dataList = response.body().getKomunitas();
                String nama = "nama = ";
                for (int i = 0; i < dataList.size(); i++) {
                    nama+= dataList.get(i).getNama()+" \n";
                }
                Log.d("asda", ""+nama);
            }
            @Override
            public void onFailure(Call<Komunitas> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package tam.pa.belajarapi.api;

import retrofit2.Call;
import retrofit2.http.GET;
import tam.pa.belajarapi.model.Komunitas;

public interface API {
//    TODO 2 Deklarasi URL
    String URL = "https://dev.farizdotid.com/api/purwakarta/";
    @GET("komunitas")
    Call<Komunitas>view();
}

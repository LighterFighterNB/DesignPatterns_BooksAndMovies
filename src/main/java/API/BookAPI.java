package API;

import okhttp3.*;

/**
 * GoodReads API
 * key: RIWQy80W6TBDYlMptXJyQ
 * secret: iw2K3xHouX1j9mCfQwjGEX79UgQpB7FBOFN0pUWzuU
 */

public class BookAPI {
    public void getBook()
    {
        try {
            OkHttpClient client = new OkHttpClient();

            Request request = new Request.Builder()
                    .url("https://www.goodreads.com/search.xml?key= RIWQy80W6TBDYlMptXJyQ").get()
                    .build();

            Response response = client.newCall(request).execute();
            System.out.println(response.body().string());
        }catch(Exception ex) {

        }
    }

}

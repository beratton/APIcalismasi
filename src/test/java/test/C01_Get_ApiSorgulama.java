package test;

import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_Get_ApiSorgulama {
    /*
        https://restful-booker.herokuapp.com/booking/1419 url’ine
        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        ve response suresinin 5 sn’den kisa oldugunu manuel olarak test ediniz.
         */

@Test
    public void get01(){
    // 1-Gonderecegimiz Request icin gerekli olan URL ve Body (ihtiyac varsa) hazirliyoruz.

    String url= "https://restful-booker.herokuapp.com/booking/1419";

    // 2- Eger soruda bize verilmisse expected datayi hazirliyoruz.

    // 3- Bize donen Response u actual data olarak kaydedecegiz.

    Response response= given().when().get(url);

    response.prettyPrint(); // yazdirmak icin bu kullanilir.

    // status koduna ulasmak icin
    System.out.println("Status code: "+response.getStatusCode());
    // 4-Expected data ile actual data nin karsilastirilmasi - Assertion
    System.out.println("Status code: "+response.getStatusCode());
    System.out.println("Content type: "+response.getContentType());
    System.out.println("Server Header'inin degeri: "+response.getHeader("Server"));
    System.out.println("Status line: "+response.getStatusLine());
    System.out.println("Response suresi: "+response.getTime());

}




}

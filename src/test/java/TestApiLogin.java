import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.StandardHttpRequestRetryHandler;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static io.restassured.RestAssured.given;

public class TestApiLogin {
    @Test
    public void Test1() {
        String URL = "https://gate.21vek.by/sso/login-by-email";
        String body = "{\n" +
                "    \"email\": \"gwnjgnw@gmail.com\",\n" +
                "    \"password\": \"ehessr\"\n" +
                "}";
        given()
//                .header("Postman-Token","<calculated when request is sent>")
//                .header("Cookie","accessToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhbm8iOjEsInZlciI6MC4xLCJzdWIiOiI2NjM0YTJjYi02OWVjLTQ1ZjUtYTdiNi04NmE1MzkzYWYxMDgiLCJleHAiOjE3NzMwNzUxMTQsImlhdCI6MTc0MTUyODMxNH0.gbIyNWbmrXvuvTBJ_zdXr3La7LkP4SaAhhB_zKtecBc; refreshToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2NjM0YTJjYi02OWVjLTQ1ZjUtYTdiNi04NmE1MzkzYWYxMDgiLCJ2ZXIiOjAuMSwiZXhwIjoxNzczMDc")
//                .header("Content-Type", "application/json")
//                .header("Content-Length", "<calculated when request is sent>")
//                .header("Host", "<calculated when request is sent>")
//                .header("User-Agent", "PostmanRuntime/7.43.0")
//                .header("Accept", "*/*")
//                .header("Accept-Encoding", "gzip, deflate, br")
//                .header("Connection", "keep-alive")
//                .header("accept", "application/json")
//                .header("accept-language", "ru,en-US;q=0.9,en;q=0.8")
//                .header("cache-control", "no-cache")
//                .header("content-type", "application/json")
//                .header("origin", "https://www.21vek.by")
//                .header("pragma", "no-cache")
//                .header("priority", "u=1, i")
//                .header("referer", "https://www.21vek.by/")
//                .header("sec-ch-ua", "\"Not(A:Brand\";v=\"99\", \"Google Chrome\";v=\"133\", \"Chromium\";v=\"133\"")
//                .header("sec-ch-ua-mobile", "?0")
//                .header("sec-ch-ua-platform", "\"Windows\"")
//                .header("sec-fetch-dest", "empty")
//                .header("sec-fetch-mode", "cors")
//                .header("sec-fetch-site", "same-site")
//                .header("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/133.0.0.0 Safari/537.36")
//                .header("x-ft-split-group", "2288")
//                .header("x-ft-variants", "[{\"flag\":\"express-high\",\"variant\":\"control\"},{\"flag\":\"pd-desktop-lk\",\"variant\":\"pd-desktop-new\"},{\"flag\":\"search-v2\",\"variant\":\"new\"},{\"flag\":\"partly-pay-desktop\",\"variant\":\"enabled\"},{\"flag\":\"b2b-land-mob\",\"variant\":\"enabled\"},{\"flag\":\"gift-filter\",\"variant\":\"true\"},{\"flag\":\"test-manual-label\",\"variant\":\"on\"},{\"flag\":\"product-segments-sub\",\"variant\":\"enabled\"},{\"flag\":\"change-delivery-date\",\"variant\":\"enabled\"},{\"flag\":\"parts-mob-catalog\",\"variant\":\"parts-auto\"},{\"flag\":\"notice-mob\",\"variant\":\"enabled\"},{\"flag\":\"parts-mob-main\",\"variant\":\"parts-main\"},{\"flag\":\"pc-viewed-partlypay\",\"variant\":\"enabled\"},{\"flag\":\"b2b-land-desk\",\"variant\":\"enabled\"},{\"flag\":\"listing-delivery-d\",\"variant\":\"dd-minsk\"},{\"flag\":\"product-blocks-desk\",\"variant\":\"enabled\"},{\"flag\":\"presents-search\",\"variant\":\"on\"},{\"flag\":\"change-date-desktop\",\"variant\":\"new-date\"},{\"flag\":\"auth\",\"variant\":\"authorization\"},{\"flag\":\"listing-desktop-v2\",\"variant\":\"v2\"},{\"flag\":\"interval-desktop\",\"variant\":\"with-interval\"},{\"flag\":\"parts-banner-desk-2\",\"variant\":\"visible\"},{\"flag\":\"main-desk-v2\",\"variant\":\"true\"},{\"flag\":\"slave-promo-check\",\"variant\":\"fast\"},{\"flag\":\"parts-desktop\",\"variant\":\"visible\"},{\"flag\":\"main-mob-v2\",\"variant\":\"true\"},{\"flag\":\"paid-delivery-desk\",\"variant\":\"true\"},{\"flag\":\"change-date-mobile\",\"variant\":\"new-date\"},{\"flag\":\"navigation-bar\",\"variant\":\"test\"},{\"flag\":\"cart-recommendation\",\"variant\":\"enabled\"},{\"flag\":\"order-nps-cancelled\",\"variant\":\"enabled\"},{\"flag\":\"personal-data\",\"variant\":\"pd\"},{\"flag\":\"app-sheet\",\"variant\":\"enabled\"},{\"flag\":\"promo-codes-pp\",\"variant\":\"enabled\"},{\"flag\":\"is-mindbox-enabled\",\"variant\":\"is-mindbox-enabled\"},{\"flag\":\"payment-pp-agreement\",\"variant\":\"enabled\"},{\"flag\":\"notice-desk\",\"variant\":\"enabled\"},{\"flag\":\"similar-products\",\"variant\":\"enabled\"},{\"flag\":\"test-rich-content\",\"variant\":\"v1\"},{\"flag\":\"sentry\",\"variant\":\"enabled\"},{\"flag\":\"paid-delivery-mob\",\"variant\":\"true\"},{\"flag\":\"pc-desk\",\"variant\":\"enabled\"},{\"flag\":\"search-d-v2\",\"variant\":\"control\"},{\"flag\":\"parts-banner-desk-1\",\"variant\":\"visible\"},{\"flag\":\"cartrecommend\",\"variant\":\"cart\"},{\"flag\":\"b2b-mobile\",\"variant\":\"enabled\"},{\"flag\":\"recommendation\",\"variant\":\"product\"},{\"flag\":\"express-delivery\",\"variant\":\"with-express\"},{\"flag\":\"goods-labels-select\",\"variant\":\"slave\"},{\"flag\":\"auth-desk\",\"variant\":\"auth-desk\"},{\"flag\":\"interval-mobile\",\"variant\":\"with-interval\"},{\"flag\":\"listing-desk-v3\",\"variant\":\"true\"},{\"flag\":\"liquidation-sale\",\"variant\":\"enabled\"},{\"flag\":\"myproduct\",\"variant\":\"app-myproduct\"},{\"flag\":\"fast-slave-selection\",\"variant\":\"enable\"},{\"flag\":\"registration\",\"variant\":\"registration\"},{\"flag\":\"favorites\",\"variant\":\"favorites-header\"},{\"flag\":\"product-blocks-mob\",\"variant\":\"enabled\"},{\"flag\":\"ssr-listing-desktop\",\"variant\":\"on\"},{\"flag\":\"listing-mob-v3\",\"variant\":\"true\"},{\"flag\":\"premium-ab\",\"variant\":\"enabled\"},{\"flag\":\"emptycarttest\",\"variant\":\"enabled3\"},{\"flag\":\"ecart-add\",\"variant\":\"switch\"},{\"flag\":\"premium\",\"variant\":\"premium\"},{\"flag\":\"premium-delivery\",\"variant\":\"enabled\"},{\"flag\":\"main-rec\",\"variant\":\"on\"},{\"flag\":\"order-action-desk\",\"variant\":\"change-delivery\"},{\"flag\":\"cart-button-recomm\",\"variant\":\"visible\"},{\"flag\":\"partly-pay\",\"variant\":\"enabled\"},{\"flag\":\"b2b-desktop\",\"variant\":\"enabled\"},{\"flag\":\"disable-card-install\",\"variant\":\"switched-on\"}]")
//                .header("Cookie", "_rid_anm_id=40ed32dd-6834-468e-9711-0d5255e7a53b; _rid=40ed32dd-6834-468e-9711-0d5255e7a53b; sbjs_migrations=1418474375998%3D1; sbjs_first_add=fd%3D2024-10-27%2016%3A07%3A12%7C%7C%7Cep%3Dhttps%3A%2F%2Fwww.21vek.by%2F%3Futm_source%3Dgoogle%26utm_medium%3Dcpc%26utm_campaign%3D336837170%26utm_content%3D20888055050%7C528591151169%26utm_term%3D21%2520%25D0%25B2%25D0%25B5%25D0%25BA%26gad_source%3D1%26gclid%3DCjwKCAjwyfe4BhAWEiwAkIL8sBKoWY8JDD-iBydPt9DFpJ2WL2YeGVND2QSLspwX0CkQUymxpAIKjRoCaSEQAvD_BwE%7C%7C%7Crf%3Dhttps%3A%2F%2Fwww.google.com%2F; sbjs_first=typ%3Dutm%7C%7C%7Csrc%3Dgoogle%7C%7C%7Cmdm%3Dcpc%7C%7C%7Ccmp%3D336837170%7C%7C%7Ccnt%3D20888055050%7C528591151169%7C%7C%7Ctrm%3D21%2520%25D0%25B2%25D0%25B5%25D0%25BA; _ym_uid=1730034433876869000; _ym_d=1730034433; mindboxDeviceUUID=5c522511-8fde-4cd4-8a66-c21944832c99; directCrm-session=%7B%22deviceGuid%22%3A%225c522511-8fde-4cd4-8a66-c21944832c99%22%7D; popmechanic_sbjs_migrations=popmechanic_1418474375998%3D1%7C%7C%7C1471519752600%3D1%7C%7C%7C1471519752605%3D1; blueID=da788dfa-ecbe-4e91-9eda-8547b678012c; _ga=GA1.1.306532194.1730034434; tmr_lvid=250de81fb669d7c9b4ca225e574ef768; tmr_lvidTS=1730034441484; _fbp=fb.1.1730034441588.809572073733709548; _tt_enable_cookie=1; Settings[ft_split_group]=2288; _ttp=zx8wl54pHWr5WcubhX9BEir0az2.tt.1; Settings[detectum_filter]=Q3FrZQ%3D%3D.F0QfAjZXCw8UdABYUUEMK0cDBwBbOh5XcAkRaUMYQVxULhxHBgcBaBlWX1R8ZlwFAhxHNBBCXUQHb0YEWFUJOzEKHQFVCCkdVUZaEW5GAwBfAzcSdA4dBGpdRVxRQTUCAgcAADATW1N3X3VABhxGC0deSxRTR1ZTAxQSOC1eCw8UHEVaR15LGEBXVkYzBBJFflRcWVoEVxsEUFNVEE4%3D; _gcl_au=1.1.351988387.1737880584; Settings[userCity_]=Q3FrZQ%3D%3D.F0QCA2YAGAwOGkBERxYABEZSXVcJRFFFdBgFF1VBARFHSEsrRwMHBQ86HldwCRlpQxhBXFIuHEcGBwBoGVZfVCZmXAUCG000EEJdQwtvRgRYVVNFaBhdTEZNV1JHLhxHBgAAGjATW1N3XAtI; _gcl_gs=2.1.k1$i1738170293$u132138317; _ttgclid=Cj0KCQiAwOe8BhCCARIsAGKeD55mFTxhdWYPRjG-zBHpDVlMoFIg5udMeJxNaRc7d2AH0z5uFgikWf8aAnFeEALw_wcB; _gcl_aw=GCL.1738170795.Cj0KCQiAwOe8BhCCARIsAGKeD55mFTxhdWYPRjG-zBHpDVlMoFIg5udMeJxNaRc7d2AH0z5uFgikWf8aAnFeEALw_wcB; Settings[u_source]=Q3FrZQ%3D%3D.BBIfFzcABhpBXwJGV0MfElkdUU0%3D; tt_deduplication_cookie=getblue; sbjs_current_add=fd%3D2025-02-02%2013%3A15%3A54%7C%7C%7Cep%3Dhttps%3A%2F%2Fwww.21vek.by%2Fshower_set_parts%2Fimpkonus600014p_rubineta.html%3Futm_medium%3Dcpc%26utm_term%3D8703378%26utm_campaign%3Dshower_set_parts%26utm_source%3Dgetblue%7C%7C%7Crf%3D%28none%29; sbjs_current=typ%3Dutm%7C%7C%7Csrc%3Dgetblue%7C%7C%7Cmdm%3Dcpc%7C%7C%7Ccmp%3Dshower_set_parts%7C%7C%7Ccnt%3D%28none%29%7C%7C%7Ctrm%3D8703378; accessToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE3Mzk3MjAwNTYsInN1YiI6IjYzODhiYmJjLTE1ODgtNDQ0MS1iOGMwLTI3OGVjY2ZkN2Q1ZiIsImV4cCI6MTc3MTI2Njg1NiwiYW5vIjoxLCJ2ZXIiOjAuMX0.Qve6xwqubUsOu3mZK1S8P5MJjeaJzOu2p9gYGoV4F7U; refreshToken=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE3Mzk3MjAwNTYsImV4cCI6MTc3MTI2Njg1NiwidmVyIjowLjEsImFubyI6MSwianRpIjoiNjM4OGJiYmMtMTU4OC00NDQxLWI4YzAtMjc4ZWNjZmQ3ZDVmIn0.shMwEFjE4m4t2QRtkzQ7g-xYkpYZW1fn4d1woeHT8YI; 21vek=6388bbbc-1588-4441-b8c0-278eccfd7d5f; sbjs_udata=vst%3D28%7C%7C%7Cuip%3D%28none%29%7C%7C%7Cuag%3DMozilla%2F5.0%20%28Windows%20NT%2010.0%3B%20Win64%3B%20x64%29%20AppleWebKit%2F537.36%20%28KHTML%2C%20like%20Gecko%29%20Chrome%2F133.0.0.0%20Safari%2F537.36; _ym_isad=2; _ym_visorc=b; sbjs_session=pgs%3D2%7C%7C%7Ccpg%3Dhttps%3A%2F%2Fwww.21vek.by%2F; _ga_KBL22GMK8D=GS1.1.1741102592.29.1.1741102594.58.0.2057327794")
               .body(body)
        .when()
                .post(URL)
        .then()
                .log()
                .all()
                .statusCode(415);
    }

    @Test
    public void Test2(){
        String URL = "";
    }
}

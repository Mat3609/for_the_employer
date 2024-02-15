package binance_api.test;


import binance_api.pojo.TickerData;
import binance_api.pojo.TickersShort;
import binance_api.util.TickerComparator;
import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;


public class TickersTest {


    public List<TickerData> getAllTickers() {
        List<TickerData> tickerData = given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.kucoin.com/api/v1/market/allTickers")
                .then().log().all()
                .statusCode(200)
                .extract().body().jsonPath().getList("data.ticker", TickerData.class);

        return tickerData;
    }


    @Test
    public void filterByUSDT() {
        List<TickerData> usdTickers = getAllTickers().stream().filter(x -> x.getSymbol().endsWith("USDT"))
                .collect(Collectors.toList());
        Assert.assertTrue(usdTickers.stream().allMatch(x -> x.getSymbol().endsWith("USDT")));
        int i = 0;
    }

    @Test
    public void sortHighToLow() {
        List<TickerData> highToLow = getAllTickers().stream().filter(x -> x.getSymbol().endsWith("USDT")).sorted(new Comparator<TickerData>() {
            @Override
            public int compare(TickerData o1, TickerData o2) {
                return o2.getChangeRate().compareTo(o1.getChangeRate());
            }
        }).collect(Collectors.toList());
        List<TickerData> top10 = highToLow.stream().limit(10).collect(Collectors.toList());
        Assert.assertTrue(top10.get(0).getSymbol().equals("REQ-USDT"));
        int i = 0;
    }

    @Test
    public void sortLowToHigh() {
        List<TickerData> lowToHigh = getAllTickers()
                .stream()
                .limit(10)
                .sorted(new TickerComparator())
                .collect(Collectors.toList());

        List<String> map = getAllTickers().stream().map(x -> x.getSymbol().toLowerCase()).collect(Collectors.toList());
        int i = 0;
    }

    @Test
    public void getNameAndPrice() {
        List<TickersShort> tickersShorts = new ArrayList<>();
        getAllTickers().forEach(x -> tickersShorts.add(new TickersShort(x.getSymbolName(), x.getAveragePrice())));
        int i = 0;
    }


}

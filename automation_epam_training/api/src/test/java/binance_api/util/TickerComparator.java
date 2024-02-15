package binance_api.util;

import binance_api.pojo.TickerData;

import java.util.Comparator;

public class TickerComparator implements Comparator<TickerData> {

    @Override
    public int compare(TickerData o1, TickerData o2) {
        return o1.getChangeRate().compareTo(o2.getChangeRate());
    }
}

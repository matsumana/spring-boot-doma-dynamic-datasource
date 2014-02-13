package info.matsumana;

import org.joda.time.DateTime;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicRoutingDataSourceResolver extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        // システム時刻が偶数秒ならdataSource1に接続する
        DateTime dt = new DateTime();
        int sec = Integer.parseInt(dt.toString("s"));
        if (sec % 2 == 0) {
            return "dataSource1";
        } else {
            return "dataSource2";
        }
    }
}
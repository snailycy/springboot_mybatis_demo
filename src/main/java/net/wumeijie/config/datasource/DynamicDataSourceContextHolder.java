package net.wumeijie.config.datasource;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    public static List<String> dataSourceNames = new ArrayList<>();

    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    public static boolean containsDataSource(String dataSourceName){
        return dataSourceNames.contains(dataSourceName);
    }
}

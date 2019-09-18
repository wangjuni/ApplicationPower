package com.power.common.util;

import java.util.Map;
import java.util.Set;

/**
 * @author yu 2019/9/18.
 */
public class UrlUtil {

    /**
     * Get url join
     * @param url base url
     * @param params params
     * @return String
     */
    public static String urlJoin(String url, Map<String, String> params) {
        StringBuilder endUrl = new StringBuilder(url);
        if (null == params) {
            return url;
        }
        boolean isFirst = true;
        Set<Map.Entry<String, String>> entrySet = params.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            if (isFirst && !url.contains("?")) {
                isFirst = false;
                endUrl.append("?");
            } else {
                endUrl.append("&");
            }
            endUrl.append(entry.getKey());
            endUrl.append("=");
            endUrl.append(entry.getValue());
        }
        return endUrl.toString();
    }
}

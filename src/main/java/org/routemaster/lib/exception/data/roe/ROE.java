package org.routemaster.lib.exception.data.roe;

import java.util.Map;

public abstract class ROE extends RuntimeException {

    public abstract String getCode();
    public abstract String getDescription();
    public abstract Map<String, Object> getMeta();
}

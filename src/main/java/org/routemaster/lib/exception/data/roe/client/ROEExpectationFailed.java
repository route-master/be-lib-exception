package org.routemaster.lib.exception.data.roe.client;

import lombok.*;
import org.routemaster.lib.exception.data.roe.ROE;

import java.util.Map;

@AllArgsConstructor
@Getter
public class ROEExpectationFailed extends ROE {

    private String code;
    private String description;
    private Map<String, Object> meta;
}

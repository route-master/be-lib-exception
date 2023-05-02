package org.routemaster.lib.exception.data.roe;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ROEErrorResponse {
    private String code;
    private String description;
    private final Long timestamp = System.currentTimeMillis();
    private Map<String, Object> meta;

    public static class ROEErrorResponseBuilder {

        private String code;
        private String description;
        private final Long timestamp = System.currentTimeMillis();
        private Map<String, Object> meta;

        public ROEErrorResponseBuilder roe(ROE roe) {
            this.code = roe.getCode();
            this.description = roe.getDescription();
            this.meta = roe.getMeta();
            return this;
        }
    }
}

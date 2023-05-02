package org.routemaster.lib.exception.data.roe;

import org.routemaster.lib.exception.data.roe.client.*;
import org.routemaster.lib.exception.data.roe.server.*;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.util.EnumMap;
import java.util.Map;

@Component
public class ROEFactory {

    private static final Map<HttpStatus, Class<? extends ROE>> roeMap;

    static {
        roeMap = new EnumMap<>(HttpStatus.class);

        roeMap.put(HttpStatus.BAD_REQUEST, ROEBadRequest.class);
        roeMap.put(HttpStatus.UNAUTHORIZED, ROEUnauthorized.class);
        roeMap.put(HttpStatus.FORBIDDEN, ROEForbidden.class);
        roeMap.put(HttpStatus.NOT_FOUND, ROENotFound.class);
        roeMap.put(HttpStatus.METHOD_NOT_ALLOWED, ROEMethodNotAllowed.class);
        roeMap.put(HttpStatus.NOT_ACCEPTABLE, ROENotAcceptable.class);
        roeMap.put(HttpStatus.PROXY_AUTHENTICATION_REQUIRED, ROEProxyAuthenticationRequired.class);
        roeMap.put(HttpStatus.REQUEST_TIMEOUT, ROERequestTimeout.class);
        roeMap.put(HttpStatus.CONFLICT, ROEConflict.class);
        roeMap.put(HttpStatus.GONE, ROEGone.class);
        roeMap.put(HttpStatus.LENGTH_REQUIRED, ROELengthRequired.class);
        roeMap.put(HttpStatus.PRECONDITION_FAILED, ROEPreconditionFailed.class);
        roeMap.put(HttpStatus.PAYLOAD_TOO_LARGE, ROEPayloadTooLarge.class);
        roeMap.put(HttpStatus.URI_TOO_LONG, ROEURITooLong.class);
        roeMap.put(HttpStatus.UNSUPPORTED_MEDIA_TYPE, ROEUnsupportedMediaType.class);
        roeMap.put(HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE, ROERequestedRangeNotSatisfiable.class);
        roeMap.put(HttpStatus.EXPECTATION_FAILED, ROEExpectationFailed.class);
        roeMap.put(HttpStatus.I_AM_A_TEAPOT, ROEIAmATeapot.class);
        roeMap.put(HttpStatus.UNPROCESSABLE_ENTITY, ROEUnprocessableEntity.class);
        roeMap.put(HttpStatus.LOCKED, ROELocked.class);
        roeMap.put(HttpStatus.FAILED_DEPENDENCY, ROEFailedDependency.class);
        roeMap.put(HttpStatus.UPGRADE_REQUIRED, ROEUpgradeRequired.class);
        roeMap.put(HttpStatus.PRECONDITION_REQUIRED, ROEPreconditionRequired.class);
        roeMap.put(HttpStatus.TOO_MANY_REQUESTS, ROETooManyRequests.class);
        roeMap.put(HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE, ROERequestHeaderFieldsTooLarge.class);
        roeMap.put(HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, ROEUnavailableForLegalReasons.class);

        roeMap.put(HttpStatus.INTERNAL_SERVER_ERROR, ROEInternalServerError.class);
        roeMap.put(HttpStatus.NOT_IMPLEMENTED, ROENotImplemented.class);
        roeMap.put(HttpStatus.BAD_GATEWAY, ROEBadGateway.class);
        roeMap.put(HttpStatus.SERVICE_UNAVAILABLE, ROEServiceUnavailable.class);
        roeMap.put(HttpStatus.GATEWAY_TIMEOUT, ROEGatewayTimeout.class);
        roeMap.put(HttpStatus.HTTP_VERSION_NOT_SUPPORTED, ROEHTTPVersionNotSupported.class);
        roeMap.put(HttpStatus.VARIANT_ALSO_NEGOTIATES, ROEVariantAlsoNegotiates.class);
        roeMap.put(HttpStatus.INSUFFICIENT_STORAGE, ROEInsufficientStorage.class);
        roeMap.put(HttpStatus.LOOP_DETECTED, ROELoopDetected.class);
        roeMap.put(HttpStatus.NOT_EXTENDED, ROENotExtended.class);
        roeMap.put(HttpStatus.NETWORK_AUTHENTICATION_REQUIRED, ROENetworkAuthenticationRequired.class);
    }

    public ROE get(String code, String description, Map<String, Object> meta, HttpStatus status) {
        try {
            return roeMap.get(status)
                    .getConstructor(String.class, String.class, Map.class)
                    .newInstance(code, description, meta);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public ROE get(String code, String description, HttpStatus status) {
        return get(code, description, null, status);
    }
}

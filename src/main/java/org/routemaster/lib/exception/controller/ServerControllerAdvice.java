package org.routemaster.lib.exception.controller;

import org.routemaster.lib.exception.data.roe.ROE;
import org.routemaster.lib.exception.data.roe.ROEErrorResponse;
import org.routemaster.lib.exception.data.roe.server.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ServerControllerAdvice {

    @ExceptionHandler(ROEInternalServerError.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEInternalServerError roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ROENotImplemented.class)
    public ResponseEntity<ROEErrorResponse> roe(ROENotImplemented roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.NOT_IMPLEMENTED);
    }

    @ExceptionHandler(ROEBadGateway.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEBadGateway roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(ROEServiceUnavailable.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEServiceUnavailable roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(ROEGatewayTimeout.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEGatewayTimeout roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.GATEWAY_TIMEOUT);
    }

    @ExceptionHandler(ROEHTTPVersionNotSupported.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEHTTPVersionNotSupported roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    @ExceptionHandler(ROEVariantAlsoNegotiates.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEVariantAlsoNegotiates roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    @ExceptionHandler(ROEInsufficientStorage.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEInsufficientStorage roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.INSUFFICIENT_STORAGE);
    }

    @ExceptionHandler(ROELoopDetected.class)
    public ResponseEntity<ROEErrorResponse> roe(ROELoopDetected roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.LOOP_DETECTED);
    }

    @ExceptionHandler(ROENotExtended.class)
    public ResponseEntity<ROEErrorResponse> roe(ROENotExtended roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.NOT_EXTENDED);
    }

    @ExceptionHandler(ROENetworkAuthenticationRequired.class)
    public ResponseEntity<ROEErrorResponse> roe(ROENetworkAuthenticationRequired roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }


    private ROEErrorResponse buildROEErrorResponse(ROE roe) {
        return ROEErrorResponse.builder()
                .roe(roe)
                .build();
    }
}

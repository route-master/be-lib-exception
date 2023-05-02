package org.routemaster.lib.exception.controller;

import org.routemaster.lib.exception.data.roe.ROE;
import org.routemaster.lib.exception.data.roe.ROEErrorResponse;
import org.routemaster.lib.exception.data.roe.client.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public final class ClientControllerAdvice {

    @ExceptionHandler(ROEBadRequest.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEBadRequest roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(ROEUnauthorized.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEUnauthorized roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(ROEForbidden.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEForbidden roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(ROENotFound.class)
    public ResponseEntity<ROEErrorResponse> roe(ROENotFound roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(ROEMethodNotAllowed.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEMethodNotAllowed roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(ROENotAcceptable.class)
    public ResponseEntity<ROEErrorResponse> roe(ROENotAcceptable roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(ROEProxyAuthenticationRequired.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEProxyAuthenticationRequired roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    @ExceptionHandler(ROERequestTimeout.class)
    public ResponseEntity<ROEErrorResponse> roe(ROERequestTimeout roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(ROEConflict.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEConflict roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(ROEGone.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEGone roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.GONE);
    }

    @ExceptionHandler(ROELengthRequired.class)
    public ResponseEntity<ROEErrorResponse> roe(ROELengthRequired roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.LENGTH_REQUIRED);
    }

    @ExceptionHandler(ROEPreconditionFailed.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEPreconditionFailed roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.PRECONDITION_FAILED);
    }

    @ExceptionHandler(ROEPayloadTooLarge.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEPayloadTooLarge roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.PAYLOAD_TOO_LARGE);
    }

    @ExceptionHandler(ROEURITooLong.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEURITooLong roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.URI_TOO_LONG);
    }

    @ExceptionHandler(ROEUnsupportedMediaType.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEUnsupportedMediaType roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(ROERequestedRangeNotSatisfiable.class)
    public ResponseEntity<ROEErrorResponse> roe(ROERequestedRangeNotSatisfiable roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    @ExceptionHandler(ROEExpectationFailed.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEExpectationFailed roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(ROEIAmATeapot.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEIAmATeapot roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.I_AM_A_TEAPOT);
    }

    @ExceptionHandler(ROELocked.class)
    public ResponseEntity<ROEErrorResponse> roe(ROELocked roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.LOCKED);
    }

    @ExceptionHandler(ROEFailedDependency.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEFailedDependency roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.FAILED_DEPENDENCY);
    }

    @ExceptionHandler(ROEUpgradeRequired.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEUpgradeRequired roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.UPGRADE_REQUIRED);
    }

    @ExceptionHandler(ROEPreconditionRequired.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEPreconditionRequired roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.PRECONDITION_REQUIRED);
    }

    @ExceptionHandler(ROETooManyRequests.class)
    public ResponseEntity<ROEErrorResponse> roe(ROETooManyRequests roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.TOO_MANY_REQUESTS);
    }

    @ExceptionHandler(ROERequestHeaderFieldsTooLarge.class)
    public ResponseEntity<ROEErrorResponse> roe(ROERequestHeaderFieldsTooLarge roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    @ExceptionHandler(ROEUnavailableForLegalReasons.class)
    public ResponseEntity<ROEErrorResponse> roe(ROEUnavailableForLegalReasons roe) {
        return new ResponseEntity<>(buildROEErrorResponse(roe), HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    private ROEErrorResponse buildROEErrorResponse(ROE roe) {
        return ROEErrorResponse.builder()
                .roe(roe)
                .build();
    }
}

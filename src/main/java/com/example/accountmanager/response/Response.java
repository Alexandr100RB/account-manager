package com.example.accountmanager.response;

public class Response {
    private ResponseStatus responseStatus;
    private String message;

    public String Response(ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        return message;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public String getMessage() {
        return message;
    }

    public static final class ResponseBuilder {
        private ResponseStatus responseStatus;
        private String message;

        private ResponseBuilder() {
        }

        public static ResponseBuilder aResponse() {
            return new ResponseBuilder();
        }

        public ResponseBuilder withResponseStatus(ResponseStatus responseStatus) {
            this.responseStatus = responseStatus;
            return this;
        }

        public ResponseBuilder withMessage(String message) {
            this.message = message;
            return this;
        }

        public Response build() {
            Response response = new Response();
            response.message = this.message;
            response.responseStatus = this.responseStatus;
            return response;
        }
    }
}

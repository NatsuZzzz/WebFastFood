package com.fastfood.webff.dto.response;

public class ResponseDTO<T> {
    private int status;
    private String message;
    private T data;

    public ResponseDTO(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseDTO<T> success(T data){
        return new ResponseDTO<>(200, "Success", data);
    }

    public static <T> ResponseDTO<T> error(int status, String message){
        return new ResponseDTO<T>(status, message, null);
    }
}

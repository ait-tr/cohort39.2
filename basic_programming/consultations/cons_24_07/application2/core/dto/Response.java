package application2.core.dto;

import application2.service.validation.CoreError;

import java.util.List;

public class Response<T> {
    private T data;
    private List<CoreError> errors;

    public Response(T data, List<CoreError> errors) {
        this.data = data;
        this.errors = errors;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<CoreError> getErrors() {
        return errors;
    }

    public void setErrors(List<CoreError> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", errors=" + errors +
                '}';
    }
}

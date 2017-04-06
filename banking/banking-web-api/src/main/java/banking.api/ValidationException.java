package banking.api;

import com.google.common.collect.ImmutableList;

public class ValidationException extends RuntimeException {

    private final ApiError error;

    public ValidationException(ApiError error) {
        this.error = error;
    }

    public ApiError getError() {
        return error;
    }

    public static ValidationException notUniqe(String field) {
        ApiError error = new ApiError("Bad request", ImmutableList.of(), ImmutableList.of(new ApiError.FieldError(field, "NotUnique", "Not unique")));
        return new ValidationException(error);
    }

    public static ValidationException invalidFormat(String field) {
        ApiError error = new ApiError("Bad request", ImmutableList.of(), ImmutableList.of(new ApiError.FieldError(field, "InvalidFormat", "Invalid Format")));
        return new ValidationException(error);
    }

    public static ValidationException fieldRequired(String field) {
        ApiError error = new ApiError("Bad request", ImmutableList.of(), ImmutableList.of(new ApiError.FieldError(field, "NotNull", "May not be null")));
        return new ValidationException(error);
    }

    public static ValidationException numeralRequired(String field) {
        ApiError error = new ApiError("Bad request", ImmutableList.of(), ImmutableList.of(new ApiError.FieldError(field, "NumeralRequired", "At least one numeral required")));
        return new ValidationException(error);
    }

    public static ValidationException lowerCaseLetterRequired(String field) {
        ApiError error = new ApiError("Bad request", ImmutableList.of(), ImmutableList.of(new ApiError.FieldError(field, "LetterRequired", "At least one lover case letter required")));
        return new ValidationException(error);
    }
}
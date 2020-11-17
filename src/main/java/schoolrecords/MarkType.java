package schoolrecords;

public enum MarkType {

    A(5, "excellent"),
    B(4, "very good"),
    C(3, "improvement needed"),
    D(2, "close fail"),
    F(1, "fail");

    private int value;

    private String description;

    MarkType(int value, String description) {
        this.value = value;
        if (isEmpty(description)) {
            throw new IllegalArgumentException("Description must not be empty");
        }
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

}
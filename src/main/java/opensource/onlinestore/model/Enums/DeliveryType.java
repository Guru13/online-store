package opensource.onlinestore.model.Enums;

/**
 * Created by Alexei Huryanchyk
 */
public enum DeliveryType {

    COURIER("courier"), EXWORKS("exworks");

    private String value;

    DeliveryType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

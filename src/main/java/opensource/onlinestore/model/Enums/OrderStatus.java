package opensource.onlinestore.model.Enums;

/**
 * Created by Alexei Huryanchyk
 */
public enum OrderStatus {

    BUCKET("bucket"), ACCEPTED("accepted"), COLLECTED("collected"), FINISHED("finished");

    private String value;

    OrderStatus(String value){
        this.value = value;
    }

    private String getValue(){
        return value;
    }
}

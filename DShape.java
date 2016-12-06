package cs151.hw7;

/**
 * Created by Roshni Velluva Puthanidam on 28/11/16.
 */
public class DShape {

    public DShapeModel model;
    public static boolean isSelected = false;

    /**
     * Constructs a DShape object with a model for its data
     * @param model to store data in
     */
    public DShape(DShapeModel model) {
        this.model = model;
    }

    public void setModel(DShapeModel model) {
        this.model = model;
    }

    public DShapeModel getModel() {
        return this.model;
    }
}
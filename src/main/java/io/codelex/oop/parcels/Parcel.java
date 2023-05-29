package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private final int xLength;
    private final int yLength;
    private final int zLength;
    private final float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public int getxLength() {
        return xLength;
    }

    public int getyLength() {
        return yLength;
    }

    public int getzLength() {
        return zLength;
    }

    public float getWeight() {
        return weight;
    }

    public boolean isExpress() {
        return isExpress;
    }

    @Override
    public boolean validate() {
        boolean isValid = false;

        if ((this.getxLength() + this.getyLength() + this.getzLength()) <= 300 &&
                this.getxLength() >= 30 && this.getyLength() >= 30 && this.getzLength() >= 30) {

            if ((this.getWeight() <= 30.0f && !this.isExpress()) ||
                    (this.getWeight() <= 15.0f && this.isExpress())) {
                isValid = true;
            }
        }
        return isValid;
    }
}

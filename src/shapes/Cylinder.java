package shapes;

public class Cylinder extends ThreeDShape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public double getBaseArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return getBaseArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [radius=%.2f, height=%.2f, base area=%.2f, volume=%.2f]", radius, getHeight(), getBaseArea(), getVolume());
    }
}

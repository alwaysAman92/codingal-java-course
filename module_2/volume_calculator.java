
class Volume {

    // Private data members (Encapsulation)
    private double length;
    private double width;
    private double height;
    private double radius;

    // Setter methods
    void setLength(double length) {
        this.length = length;
    }

    void setWidth(double width) {
        this.width = width;
    }

    void setHeight(double height) {
        this.height = height;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate volume of cuboid
    double calculateCuboidVolume() {
        return length * width * height;
    }

    // Method to calculate volume of cube
    double calculateCubeVolume() {
        return length * length * length;
    }

    // Method to calculate volume of cylinder
    double calculateCylinderVolume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {

        Volume obj = new Volume();

        // Set values using setter methods
        obj.setLength(5);
        obj.setWidth(4);
        obj.setHeight(3);
        obj.setRadius(2);

        // Display volumes
        System.out.println("Volume of Cuboid: "
                + obj.calculateCuboidVolume());

        System.out.println("Volume of Cube: "
                + obj.calculateCubeVolume());

        System.out.println("Volume of Cylinder: "
                + obj.calculateCylinderVolume());
    }
}

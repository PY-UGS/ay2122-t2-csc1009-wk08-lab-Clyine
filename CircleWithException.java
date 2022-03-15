public class CircleWithException {
    private double radius, area, diameter;

    CircleWithException(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.diameter = 2 * radius;
    } 

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius){
            this.radius = radius;
    }

    public double getArea() {
        return this.area;
    }

    public double getDiameter() {
        return this.diameter;
    }

}
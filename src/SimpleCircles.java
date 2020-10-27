public class SimpleCircles {
    public static void main(String[] args) {
        SimpleCircles circle1 = new SimpleCircles();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        SimpleCircles circle2 = new SimpleCircles(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        SimpleCircles circle3 = new SimpleCircles(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

    }
    double radius;
    SimpleCircles(){
        radius = 1;
    }
    SimpleCircles(double newRadius){
        radius = newRadius;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }
    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    void setRadius(double newRadius){
        radius = newRadius;
    }
}

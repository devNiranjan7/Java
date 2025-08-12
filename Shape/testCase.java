package Shape;

public class testCase {
    public static void main(String[] args){
        Rectangle rect = new Rectangle(4,5);
        System.out.println("The perimeter of rectangle of length "+rect.getLength()+" and breadth "+rect.getBreadth()+" is "+rect.perimeter());
        System.out.println("The area of rectangle of length "+rect.getLength()+" and breadth "+rect.getBreadth()+" is "+rect.area());

        Square sq = new Square(3);
        System.out.println("The perimeter of square of side "+sq.getSide()+ " is "+sq.perimeter());
        System.out.println("The area of square of side "+sq.getSide()+ " is "+sq.area());
        
        Circle ci = new Circle(4);
        System.out.println("The circumference of circle of radius "+ci.getRadius()+" is "  +ci.perimeter());
        System.out.println("The area of circle of radius "+ci.getRadius()+" is "  +ci.area());

        Cylinder cy = new Cylinder(4,2);
        System.out.println("The surface area of cyllinder of radius "+cy.getRadius()+" and height "+cy.getHeight()+" is "  +cy.surfaceArea());
        System.out.println("The volume of cyllinder of radius "+cy.getRadius()+" and height "+cy.getHeight()+" is "  +cy.volume());

        Sphere sp = new Sphere(4);
        System.out.println("The surface area of sphere of radius "+sp.getRadius()+" is "  +sp.surfaceArea());
        System.out.println("The volume of sphere of radius "+sp.getRadius()+" is "  +sp.volume());
   }
}
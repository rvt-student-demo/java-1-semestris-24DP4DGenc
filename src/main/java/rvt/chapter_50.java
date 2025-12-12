package rvt;

final class chapter_50 {
    
    private final double width;
    private final double height;
    private final double length;

    public chapter_50(double width, double height, double length) {
        if (width <= 0 || height <= 0 || length <= 0) {
            throw new IllegalArgumentException("Box dimensions must be > 0");
        }
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public chapter_50(double side) {
        this(side, side, side);
    }

    
    public chapter_50(chapter_50 oldBox) {
        this(oldBox.width(), oldBox.height(), oldBox.length());
    }

    public double volume() {
        return width * height * length;
    }

    
    public double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
    }

    public double width()  { return width;  }
    public double height() { return height; }
    public double length() { return length; }

    
    public chapter_50 biggerBox(chapter_50 oldBox) {
        return new chapter_50(1.25 * oldBox.width(), 1.25 * oldBox.height(), 1.25 * oldBox.length());
    }

    public chapter_50 smallerBox(chapter_50 oldBox) {
        return new chapter_50(0.75 * oldBox.width(), 0.75 * oldBox.height(), 0.75 * oldBox.length());
    }

    public boolean nests(chapter_50 outsideBox) {
        return this.width  < outsideBox.width()
            && this.height < outsideBox.height()
            && this.length < outsideBox.length();
    }

    private double faceArea() {  
        return width * height;
    }

    private double topArea() {   
        return width * length;
    }

    private double sideArea() {  
        return height * length;
    }

    @Override
    public String toString() {
        return "Box(" + width + ", " + height + ", " + length + ")";
    }
}

public class chapter_50 {
    public static void main(String[] args) {
        Box box = new Box(2.5, 5.0, 6.0);

       
        System.out.println("Area: " + box.area() + " volume: " + box.volume());

       
        System.out.println("length: " + box.length() + " height: " + box.height() + " width: " + box.width());

        
        chapter_50 copy = new Box(box);
        System.out.println("Copy: " + copy + " area: " + copy.area());

        chapter_50 bigger = box.biggerBox(box);
        chapter_50 smaller = box.smallerBox(box);
        System.out.println("Bigger:  " + bigger + " volume: " + bigger.volume());
        System.out.println("Smaller: " + smaller + " volume: " + smaller.volume());

        
        System.out.println("box nests in bigger? " + box.nests(bigger));     
        System.out.println("bigger nests in box? " + bigger.nests(box));     

       
        }
}

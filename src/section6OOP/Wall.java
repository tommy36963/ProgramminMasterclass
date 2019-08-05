package section6OOP;

public class Wall {

    public static void main(String[] args) {

        Wall wall = new Wall(1.25,5);
        System.out.println("area = " + wall.getArea());

        System.out.println("height = " + wall.getHeight());
        System.out.println("width = " + wall.getWidth());
        System.out.println("area = " + wall.getArea());

    }
    private double width;
    private double height;

    public Wall() {

    }

    public Wall(double width, double height) {

        if(width < 0){
            this.width = 0.0;
        }else{
            this.width = width;
        }
        if(height < 0){
           this.height = 0.0;
        }else {
            this.height = height;
        }
    }


    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {

        if(width < 0){
            this.width = 0.0;
        }else
        this.width = width;
    }

    public void setHeight(double height) {

        if(height < 0){
            this.height = 0.0;
        }else
        this.height = height;
    }

    public double getArea(){
        return height * width;
    }
}

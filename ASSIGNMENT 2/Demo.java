class Shape 
{
    protected float dim1, dim2; // dimensions of shape

    public Shape(float dim1, float dim2) 
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public float getDim1() 
    {
        return dim1;
    }

    public void setDim1(float dim1) 
    {
        this.dim1 = dim1;
    }

    public float getDim2() 
    {
        return dim2;
    }

    public void setDim2(float dim2) 
    {
        this.dim2 = dim2;
    }
}

class Triangle extends Shape 
{
    public Triangle(float dim1, float dim2) 
    {
        super(dim1, dim2);
    }

    public float findArea() {
        return (dim1 * dim2) / 2;
    }
}

class Rectangle extends Shape 
{
    public Rectangle(float dim1, float dim2) 
    {
        super(dim1, dim2);
    }

    public float findArea() 
    {
        return dim1 * dim2;
    }
}

public class Demo 
{
    public static void main(String[] args) 
    {
        Triangle t = new Triangle(10, 20);
        Rectangle r = new Rectangle(10, 20);

        System.out.println("Area of Triangle with dimensions " + t.getDim1() + " and " + t.getDim2() + " is " + t.findArea());
        System.out.println("Area of Rectangle with dimensions " + r.getDim1() + " and " + r.getDim2() + " is " + r.findArea());
    }
}

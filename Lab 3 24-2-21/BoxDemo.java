class Box
{
    double width;
    double height;
    double depth;
    double vol2;
    public void vol()
    {
        width=10;
        height=20; 
        depth=30;
        vol2=width*height*depth;
        System.out.println("Volume is "+vol2);
    }
}
class BoxDemo
{
    public static void main(String args[])
    {
        Box mybox=new Box(); //Instantiation
        mybox.vol();
    }
}
        
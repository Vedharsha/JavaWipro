public class Box {
    int height;
    int width;
    int depth;
    Box(int height,int width,int depth){
        this.height=height;
        this.width=width;
        this.depth=depth;
    }
    public int volume(){
        return height*width*depth;
    }
    public static void main(String[] args) {
        Box b=new Box(6,3,2);
        System.out.println(b.volume());
    }
}
public class overload {
    public static void main(String[] args){
       System.out.println(add(10,20));
       System.out.println(add(2.3f,3.5f));

    }
    static public int add(int a,int b){
        return a+b;
    } 
    static public float add(float a,float b){
        return a+b;
    }
}

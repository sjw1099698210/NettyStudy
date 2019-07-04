public interface TestInterface<T> {


     <T>T getMsg(T t);

     void MsgString msg() default{
         System.out.print("----");  
     };

}

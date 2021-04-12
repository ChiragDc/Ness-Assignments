package day3.objectorientedprogramming;
class WebApp{
    public  void updateInfo(){
        System.out.println("WebApp to use app in web");
        System.out.println("v1.0 stock");
    }

}
class UIOverhaul extends WebApp{
        public void updateInfo(){
           super.updateInfo();
            System.out.println("v1.1 UI Overhaul Done for better aesthetics and navigation");
        }
}
class OptimizedApp extends UIOverhaul{
    @Override
    public void updateInfo() {
        super.updateInfo();
        System.out.println("v1.2 Optimized App to reduce lag and crashes");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        OptimizedApp oa =new OptimizedApp();
        oa.updateInfo();

    }
}

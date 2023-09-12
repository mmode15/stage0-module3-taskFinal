package lang.print.gaps.finalModuleTask;

public class NumberReverter {

    public  void revert(int number) {
        int revertNumber = 0;
        while(number > 0){
            revertNumber += (number % 10) ;
            number = (number -number % 10) /10;
            revertNumber*=10;
      }
        System.out.println(revertNumber/10);
    }
}

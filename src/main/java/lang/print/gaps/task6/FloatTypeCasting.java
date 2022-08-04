package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
//        int round;
//        boolean isUp=(numberToBeRounded-0.1)>=0.0;
//        if(isUp){
//            round= (int) Math.ceil(numberToBeRounded);
//        }
//        else {
//            round=(int) Math.floor(numberToBeRounded);
//        }
//        System.out.println(round);
        int round = Math.round(numberToBeRounded);
        System.out.println(round);
    }
}

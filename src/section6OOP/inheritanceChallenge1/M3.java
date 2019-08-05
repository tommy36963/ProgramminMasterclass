package section6OOP.inheritanceChallenge1;

public class M3 extends Car {

   private int bhp;

    public M3(int bhp) {
        super("M3", "Coupe", true, 3, 6, true);
        this.bhp = bhp;
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0){
            stop();
            changeGear(1);
        }else  if(newSpeed > 0 && newSpeed <=30){
            changeGear(1);
        }else if(newSpeed > 30 && newSpeed <=70){
            changeGear(2);
        }else if(newSpeed > 70 && newSpeed <= 100){
            changeGear(3);
        }else{
            changeGear(4);
        }

        if (newSpeed > 0){
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}

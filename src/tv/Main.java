package tv;

public class Main {
    public static void main(String[] args){
        TV tv1;
        tv1 = new TV();
        System.out.println(".........TV object 1.......");
        System.out.println("Current status is " + tv1.getStatus());
        System.out.println("Current channel is " + tv1.getCurrentChannel());
        System.out.println("Current volume is " + tv1.getCurrentVolumeLevel());
        System.out.println("After changing channel and volume level while off");
        for(int i=0;i<12;i++)
            tv1.channelUp();
        tv1.setVolume(5);
        System.out.println("Current status is " + tv1.getStatus());
        System.out.println("Current channel is " + tv1.getCurrentChannel());
        System.out.println("Current volume is " + tv1.getCurrentVolumeLevel());
        System.out.println("After changing channel and volume level while on");
        tv1.turnOn();
        for(int i=0;i<12;i++)
            tv1.channelUp();
        tv1.setVolume(5);
        System.out.println("Current status is " + tv1.getStatus());
        System.out.println("Current channel is " + tv1.getCurrentChannel());
        System.out.println("Current volume is " + tv1.getCurrentVolumeLevel());
        tv1.turnOff();
        tv1.volumeDown();
        tv1.channelUp();
        System.out.println("After turning off");
        System.out.println("Current status is " + tv1.getStatus());
        System.out.println("Current channel is " + tv1.getCurrentChannel());
        System.out.println("Current volume is " + tv1.getCurrentVolumeLevel());

    }
}

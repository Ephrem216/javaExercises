package tv;

public class TV {
    private int channel=1;
    private int volumeLevel=1;
    boolean on = false;
    TV(){

    }
    TV(int channel , int volumeLevel, boolean on){
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int channel){
        if(on && channel >= 1 && channel <= 120)
            this.channel = channel;
    }

    public void setVolume(int volumeLevel){
        if(on && volumeLevel >= 1 && volumeLevel <= 7)
            this.volumeLevel = volumeLevel;
    }

    public void channelUp(){
        if(on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if(on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if(on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if(on && volumeLevel > 1)
            volumeLevel--;
    }

    public int getCurrentChannel(){
        return channel;
    }

    public int getCurrentVolumeLevel(){
        return volumeLevel;
    }

    public boolean getStatus(){
        return on;
    }
}

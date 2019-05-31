package com.trimindtech.training.day03;

public class Remote {
    private static  int channel;
    private static int volume_level;
    private static boolean current_state;
    public  void start()
    {
        if (!current_state)
        {
            this.current_state=true;
            System.out.println("TV is on");
        }
    }
    public void RaiseVolume()
    {
        if(!this.current_state)
        {
            System.out.println("Tv is not on please start");
        }
        this.channel=channel+1;
        System.out.println("channel increment is"+" "+this.channel);
    }
    public void DecreaseVolume()
    {
        this.channel=channel-1;
        System.out.print("channel decrement is"+" "+this.channel);
    }
    public void IncreaseChannel()
    {
        this.volume_level=volume_level+1;
        System.out.println("volume increased"+" "+this.volume_level);
    }
    public void DecreaseChannel()
    {
        this.volume_level=volume_level-1;
        System.out.println("vlume level decreSED"+" "+volume_level);
    }
    public void SWITCHOFFON()
    {
        this.current_state=true;
        System.out.println("tv is on "+" "+this.current_state);
    }

    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("channel incremented is "+" "+this.channel);
    }

    public void setVolume_level(int volume_level) {
        this.volume_level = volume_level;
        System.out.println("Volume incremented is"+" "+this.volume_level);
    }

    public void setCurrent_state(boolean current_state) {
        this.current_state = current_state;
        System.out.println("the current state changed is"+" " +this.current_state);
    }
}

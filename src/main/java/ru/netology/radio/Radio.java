package ru.netology.radio;

public class Radio {
    private int currentChanel;
    private int currentVolume;
    private int numberChanel = 10;
    private int maxChanel =numberChanel-1;


    public Radio(int numberChanel, int maxChanel) {
        this.numberChanel = numberChanel;
        this.maxChanel = maxChanel;
    }

    // public Radio( int numberChanel) {
     //   this.numberChanel = numberChanel;
       // this.maxChanel = numberChanel - 1;
   // }


    // public int getNumberChanel() {
     //   return numberChanel;
   // }

    //public void setNumberChanel(int numberChanel) {
      //  this.numberChanel = numberChanel;
   // }

    // public int getMaxChanel() {
      //return  maxChanel;
   // }

   // public  void setMaxChanel(int numberChanel) {
     // this.maxChanel = numberChanel -1;
  //  }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public void setCurrentChanel(int currentChanel) {
        if (currentChanel < 0) {
            currentChanel = maxChanel;
        }
        if (currentChanel > maxChanel) {
            currentChanel = 0;
        }
        this.currentChanel = currentChanel;
    }

    public void next() {
        setCurrentChanel(currentChanel = currentChanel + 1);
    }

    public void prev() {
        setCurrentChanel(currentChanel = currentChanel - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void up() {
        setCurrentVolume(currentVolume = currentVolume + 1);
    }

    public void down() {
        setCurrentVolume(currentVolume = currentVolume - 1);
    }

}

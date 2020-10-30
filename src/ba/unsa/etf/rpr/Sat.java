package ba.unsa.etf.rpr;

public class Sat {
    int sati,minute,sekunde;
  public Sat(int sati, int minute,int sekunde){
      postavi(sati,minute,sekunde);
  }
  public void setSati(int sati){
      this.sati=sati;
    }
  public void setMinute(int minute)  {
      this.minute=minute;
  }
  public void setSekunde(int sekunde){
      this.sekunde=sekunde;
  }
  public int getSati(){
      return sati;
  }
  public int getMinute(){
      return minute;
    }
    public int getSekunde() {
        return sekunde;
    }
    public void postavi(int h, int min, int sec){
      setMinute(min);
      setSati(h);
      setSekunde(sec);
  }
  public void sljedeci(){
      sekunde++;
      if(sekunde == 60){sekunde = 0; minute++;}
      if(minute == 60){minute = 0; sati++;}
      if(sati == 24)sati=0;
  }
  public void prethodni(){
      sekunde--;
      if(sekunde == -1){sekunde = 59; minute--;}
      if(minute == -1){minute = 59; sati--;}
      if(sati == -1)sati=23;
  }
  public void PomjeriZa (int pomak){
      if(pomak>0) for(int i = 0; i < pomak; i++) sljedeci();
      else for (int i = 0; i < -pomak; i++) prethodni();
  }
  public void ispisi(){
      System.out.println(getSati()+":"+getMinute()+":"+getSekunde());
  }
}

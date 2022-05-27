package week_1.opp;

import javafx.scene.paint.Stop;

public class StopWatch {
  private long startTime ;
  private long endTime ;
  public StopWatch(){
  }
  public StopWatch(long startTime, long endTime){
      this.startTime = startTime;
      this.endTime = endTime;
  }
    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }
//    public long start(){
//    }
}

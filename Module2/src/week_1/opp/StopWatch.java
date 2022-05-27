package week_1.opp;

import javafx.scene.paint.Stop;

public class StopWatch {
    private long startTime;
    private long endTime;

    //  public StopWatch(){
//  }
//  public StopWatch(long startTime, long endTime){
//      this.startTime = startTime;
//      this.endTime = endTime;
//  }
    public long getEndTime() {
        return endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        long ela = (endTime - startTime);
        return ela;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        stopWatch.stop();
        System.out.println(stopWatch.getStartTime());
        System.out.println(stopWatch.getElapsedTime());
    }
}

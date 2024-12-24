package com.xworkz.railapp.train;

public class Train {
    private int trainId;
    private String trainName;
    private String trainSource;
    private String trainDestination;

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainSource(String trainSource) {
        this.trainSource = trainSource;
    }

    public String getTrainSource() {
        return trainSource;
    }

    public void setTrainDestination(String trainDestination) {
        this.trainDestination = trainDestination;
    }

    public String getTrainDestination() {
        return trainDestination;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainId=" + trainId +
                ", trainName='" + trainName + '\'' +
                ", trainSource='" + trainSource + '\'' +
                ", trainDestination='" + trainDestination + '\'' +
                '}';
    }
}

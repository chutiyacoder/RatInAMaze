package com.chutiyapa.beans;

public class Pixel {

    private boolean upWall =  false;
    private boolean downWall =  false;
    private boolean leftWall =  false;
    private boolean rightWall =  false;
    private boolean isStartingPoint =  false;
    private boolean isEndingPoint =  false;
    private int xCoordinate = -1;
    private int yCoordinate = -1;

    public Pixel(boolean upWall, boolean downWall, boolean leftWall, boolean rightWall, boolean isStartingPoint, boolean isEndingPoint, int xCoordinate, int yCoordinate) {
        this.upWall = upWall;
        this.downWall = downWall;
        this.leftWall = leftWall;
        this.rightWall = rightWall;
        this.isStartingPoint = isStartingPoint;
        this.isEndingPoint = isEndingPoint;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public Pixel(boolean upWall, boolean downWall, boolean leftWall, boolean rightWall, int xCoordinate, int yCoordinate) {
        this.upWall = upWall;
        this.downWall = downWall;
        this.leftWall = leftWall;
        this.rightWall = rightWall;
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public boolean isUpWall() {
        return upWall;
    }

    public void setUpWall(boolean upWall) {
        this.upWall = upWall;
    }

    public boolean isDownWall() {
        return downWall;
    }

    public void setDownWall(boolean downWall) {
        this.downWall = downWall;
    }

    public boolean isLeftWall() {
        return leftWall;
    }

    public void setLeftWall(boolean leftWall) {
        this.leftWall = leftWall;
    }

    public boolean isRightWall() {
        return rightWall;
    }

    public void setRightWall(boolean rightWall) {
        this.rightWall = rightWall;
    }

    public boolean isStartingPoint() {
        return isStartingPoint;
    }

    public void setStartingPoint(boolean startingPoint) {
        isStartingPoint = startingPoint;
    }

    public boolean isEndingPoint() {
        return isEndingPoint;
    }

    public void setEndingPoint(boolean endingPoint) {
        isEndingPoint = endingPoint;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}

package ru.stqa.ptf.sandbox;

public class Point {

  public double x;
  public double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double distance() {
    return Math.sqrt(this.y * this.y - this.x * this.x);
  }
}

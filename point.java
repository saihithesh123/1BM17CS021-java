import java.math.*;
class Point
{
private int x;
private int y;
void point()
{
x=0;
y=0;
}
int point(int x, int y)
{
this.x=x;
this.y=y;
}
int point(point ob)
{
x=ob.x;
y=ob.y;
}
double distance(point p)
{
return Math.sqrt(Math.pow((x-p.x),2) + Math.pow((y-p.y),2));
}
class PointDemo
{
public static void main (String args[])
{
point p1 = new point(1,2);
point p2 = new point(p1);
point p3 = new point(3,4);
double distance = p1.distance(p3);
{
System.out.println("distance" + distance);
}
}
package geometries;

import primitives.Point;
import primitives.Vector;

/**
 * Plane class represents a plane at the 3D world
 * @author roeygross
 */
public class Plane implements Geometry {
    /**
     * The normal vector to the plane
     */
    Vector normal;
    /**
     * The point on the plane that the normal goes through
     */
    Point p0;

    /**
     * Constructs an empty plane
     * @param a first point the plane
     * @param b second point the plane
     * @param c third point on the plane
     */
    public Plane(Point a,Point b,Point c) {
        normal=null;
        p0=a;
    }

    /**
     * Constructs a plane and saving the normalized normal vector
     * @param normal the normal vector to the plane
     * @param p0 the point on the plane
     */
    public Plane(Vector normal, Point p0) {
        this.normal = normal;
        this.normal.normalize();
        this.p0 = p0;
    }

    @Override
    public Vector getNormal(Point point) {
        return null;
    }

    /**
     * Calculates a normal vector to the plane
     * @return normal vector to the plane
     */
    public Vector getNormal()
    {
        Vector x = new Vector(0,0,0);
        x.subtract(x);
        return normal;
    }
}
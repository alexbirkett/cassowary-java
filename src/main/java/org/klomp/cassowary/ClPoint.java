// $Id: ClPoint.java,v 1.9 1999/04/20 00:26:35 gjb Exp $
//
// Cassowary Incremental Constraint Solver
// Original Smalltalk Implementation by Alan Borning
// This Java Implementation by Greg J. Badros, <gjb@cs.washington.edu>
// http://www.cs.washington.edu/homes/gjb
// (C) 1998, 1999 Greg J. Badros and Alan Borning
// See ../LICENSE for legal details regarding this software
//
// ClPoint
//

package org.klomp.cassowary;

public class ClPoint {

    private ClVariable x;

    private ClVariable y;

    public ClPoint(double x, double y) {
        this.x = new ClVariable(x);
        this.y = new ClVariable(y);
    }

    public ClPoint(double x, double y, int a) {
        this.x = new ClVariable("x" + a, x);
        this.y = new ClVariable("y" + a, y);
    }

    public ClPoint(ClVariable clv_x, ClVariable clv_y) {
        this.x = clv_x;
        this.y = clv_y;
    }

    public ClVariable X() {
        return x;
    }

    public ClVariable Y() {
        return y;
    }

    // use only before adding into the solver
    public void SetXY(double x, double y) {
        this.x.set_value(x);
        this.y.set_value(y);
    }

    public void SetXY(ClVariable clv_x, ClVariable clv_y) {
        this.x = clv_x;
        this.y = clv_y;
    }

    public double Xvalue() {
        return X().value();
    }

    public double Yvalue() {
        return Y().value();
    }

    @Override
    public String toString() {
        return "(" + x.toString() + ", " + y.toString() + ")";
    }

}
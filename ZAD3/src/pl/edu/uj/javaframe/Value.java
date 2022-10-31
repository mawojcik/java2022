package pl.edu.uj.javaframe;

import java.lang.Math;
import java.util.Objects;

abstract class Value{
    protected Object value;
    public abstract Value create(String v);
    public abstract  Value add(Value v);

    /**** YOUR CODE HERE *****/

    public abstract Value sub (Value v);
    public abstract Value mul (Value v);
    public abstract Value div (Value v);
    public abstract Value pow (Value v);
    public abstract boolean eq (Value v);
    public abstract boolean lte (Value v);
    public abstract boolean gte (Value v);        //greater than or equal
    public abstract boolean neq (Value v);
    public abstract boolean equals (Object other);
    public abstract int hashCode();

    @Override
    public String toString() {
        return value.toString();
    }

    public void print(){System.out.print(toString());}

}

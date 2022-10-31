package pl.edu.uj.javaframe;

import java.sql.SQLOutput;
import java.util.Objects;

public class MyDouble extends Value {
    @Override
    public Value create(String val) {
        MyDouble v = new MyDouble();
        v.value = Double.parseDouble(val);
        return v;
    }

    @Override
    public Value add(Value v) {
        MyDouble result  = new MyDouble();
        result.value = (Double)this.value + Double.parseDouble(v.value.toString());
        return result;

    }

    @Override
    public Value sub(Value v) {
        MyDouble result  = new MyDouble();
        result.value = (Double)this.value - Double.parseDouble(v.value.toString());
        return result;

    }

    @Override
    public Value mul(Value v) {
        MyDouble result  = new MyDouble();
        result.value = (Double)this.value * Double.parseDouble(v.value.toString());
        return result;
    }

    @Override
    public Value div(Value v) {
        MyDouble result  = new MyDouble();
        result.value = (Double)this.value / Double.parseDouble(v.value.toString());
        return result;
    }

    @Override
    public Value pow(Value v) {
        MyDouble result  = new MyDouble();
        result.value = Math.pow((Double)this.value, Double.parseDouble(v.value.toString()));
        return result;
    }

    @Override
    public boolean eq(Value v) {
        System.out.println("this.value " + this.value);
        System.out.println("v.value " + v.value);
        return (Double) this.value == Double.parseDouble(v.value.toString());
    }

    @Override
    public boolean lte(Value v) {
        if((Double)this.value <= (Double)v.value) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    @Override
    public boolean gte(Value v) {
        if((Double)this.value >= (Double)v.value) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    @Override
    public boolean neq(Value v) {
        System.out.println("this.value " + this.value);
        System.out.println("v.value " + v.value);
        return (Double)this.value != Double.parseDouble(v.value.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Value value1 = (Value) o;
        return Objects.equals(value, value1.value);
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}

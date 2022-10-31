package pl.edu.uj.javaframe;

import java.util.Objects;

public class Int extends Value{
    @Override
    public Value create(String val) {
        Int v = new Int();
        v.value = Integer.parseInt(val);
        return v;
    }

    @Override
    public Value add(Value v) {
        Int result  = new Int();
        if(v.value instanceof Integer){
            result.value = (Integer)this.value + (Integer)v.value;
        }else{
            result.value = (Integer)this.value + Double.valueOf(v.value.toString()).intValue();
        }
        return result;
    }

    @Override
    public Value sub(Value v) {
        Int result  = new Int();
        if(v.value instanceof Integer){
            result.value = (Integer)this.value - (Integer)v.value;
        }else{
            result.value = (Integer)this.value - Double.valueOf(v.value.toString()).intValue();
        }
        return result;
    }

    @Override
    public Value mul(Value v) {
        Int result = new Int();
        if(v.value instanceof Integer) {
            result.value = (Integer)this.value * (Integer)v.value;
        } else {
            result.value = (Integer)this.value * Double.valueOf(v.value.toString()).intValue();
        }

    return result;
    }

    @Override
    public Value div(Value v) {
        Int result = new Int();
        if(v.value instanceof Integer) {
            result.value = (Integer)this.value / (Integer)v.value;
        } else {
            result.value = (Integer)this.value / Double.valueOf(v.value.toString()).intValue();
        }

    return result;
    }

    @Override
    public Value pow(Value v) {
        Int result = new Int();
        if(v.value instanceof Integer) {
            result.value = Math.pow((Integer)this.value, (Integer)v.value);
        } else {
            result.value = Math.pow((Integer)this.value, Double.valueOf(v.value.toString()).intValue());
        }

        return result;
    }

    @Override
    public boolean eq(Value v) {
        System.out.println("this.value " + this.value);
        System.out.println("v.value " + v.value);
        if(v.value instanceof Integer) {
            return this.value == v.value;
        } else return (Integer)this.value == Double.valueOf(v.value.toString()).intValue();
    }

    @Override
    public boolean lte(Value v) {     //lower than or equal
        if((Integer)this.value <= (Integer)v.value) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    @Override
    public boolean gte(Value v) {     //greater than or equal
        if((Integer)this.value >= (Integer)v.value) {
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
        if(v.value instanceof Integer) {
            return this.value != v.value;
        } else return (Integer) this.value != Double.valueOf(v.value.toString()).intValue();
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

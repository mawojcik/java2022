package pl.edu.uj.javaframe;

public class MyString extends Value {
    @Override
    public Value create(String val) {
        MyString v = new MyString();
        v.value = val;
        return v;
    }

    @Override
    public Value add(Value v) {
        return null;
    }
    public Value sub(Value v) {
        return null;
    }
    public Value mul(Value v) {
        return null;
    }
    public Value div(Value v) {
        return null;
    }
    public Value pow(Value v) {
        return null;
    }
    public boolean eq(Value v) {
        return true;
    }
    public boolean lte(Value v) {
        return true;
    }
    public boolean gte(Value v) {
        return true;
    }
    public boolean neq(Value v) {
        return true;
    }
    public boolean equals(Object other) {
        return true;
    }
    public int hashCode() {
        return 0;
    }
}

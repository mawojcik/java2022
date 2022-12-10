package pl.edu.uj.javaframe;

public class MyImaginaryInt extends Int {

    private int real;
    private int imaginary;

    public Value create(String val) {
        MyImaginaryInt v = new MyImaginaryInt();

        if (val.contains("i")) {
            String[] parts = val.split("i");
            v.real = Integer.parseInt(parts[0]);
            v.imaginary = Integer.parseInt(parts[1]);
        } else {
            v.real = 0;
            v.imaginary = Integer.parseInt(val);
        }
        v.value = v.real + "i" + v.imaginary;
        return v;
    }

    public Value add(Value v) {
        MyImaginaryInt result = new MyImaginaryInt();
        if (v.toString().contains("i")) {
            String[] parts = v.toString().split("i");
            result.real = this.real + Integer.parseInt(parts[0]);
            result.imaginary = this.imaginary + Integer.parseInt(parts[1]);
        } else {
            result.real = this.real;
            result.imaginary = this.imaginary + Integer.parseInt(v.toString());
        }
        result.value = result.real + "i" + result.imaginary;
        return result;
    }


}
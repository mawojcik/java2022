package pl.edu.uj.javaframe;

public class MyImaginaryDouble extends MyDouble {

    private Double real;
    private Double imaginary;
    public Value create(String val) {
        MyImaginaryDouble v = new MyImaginaryDouble();

        if (val.contains("i")) {
            String[] parts = val.split("i");
            v.real = Double.parseDouble(parts[0]);
            v.imaginary = Double.parseDouble(parts[1]);
        } else {
            v.real = 0.0;
            v.imaginary = Double.parseDouble(val);
        }

        v.value = v.real + "i" + v.imaginary;
        return v;
    }
    public Value add(Value v) {
        MyImaginaryDouble result = new MyImaginaryDouble();
        if (v.toString().contains("i")) {
            String[] parts = v.toString().split("i");
            result.real = this.real + Double.parseDouble(parts[0]);
            result.imaginary = this.imaginary + Double.parseDouble(parts[1]);

        } else {
            result.real = this.real;
            result.imaginary = this.imaginary + Double.parseDouble(v.toString());
        }
        result.value = result.real +"i"+ result.imaginary;
        return result;
    }
}
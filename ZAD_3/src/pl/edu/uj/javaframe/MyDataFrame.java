package pl.edu.uj.javaframe;

public class MyDataFrame extends DataFrame {
    MyDataFrame(Class<? extends Value>[] types, String[] vals) {
        super(types, vals);
    }

    protected void print(){
        for (Series series : columns) {
            System.out.print(series.name + "\t");
        }
        System.out.println();
        for(int j =0; j < columns.get(0).values.size(); j++) {
            for (Series column : columns) {
                column.values.get(j).print();
                System.out.print("\t\t");
            }
            System.out.println();
        }
    }
}

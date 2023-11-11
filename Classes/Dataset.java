package Classes;

public class Dataset {


    float[][] data;
    int[] labels;
    String name;

    public Dataset(String name, float[][] data, int[] labels){

        this.name = name;
        this.data = data;
        this.labels = labels;

        

    }
    
}

package exercises;

public class Location {
    private double maxValue;
    private int row;
    private int column;

    public Location(){

    }

    public Location(double maxValue, int row, int column){
        this.maxValue = maxValue;
        this.row = row;
        this.column = column;
    }

    public double getMaxValue() {
        return maxValue;
    }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public  Location locateLargest(double [][] a){
        maxValue = a[0][0];
        row = 0;
        column = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                if(a[i][j] > maxValue){
                    maxValue = a[i][j];
                    row = i;
                    column = j;
                }
            }
        }
        return new Location(maxValue, row, column);
    }
}

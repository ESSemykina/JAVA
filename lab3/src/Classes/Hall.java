package Classes;

public class Hall {
    private int number;
    private int row;
    private int seat;

    public Hall(int number, int row, int seat) {
        this.number = number;
        this.row = row;
        this.seat = seat;
    }

    public int getNumber()
    {return number;}
    public void setNumber(int number)
    {this.number = number;}

    public int getRow()
    {return row;}
    public void setRow(int row)
    {this.row = row;}

    public int getSeat()
    {return seat;}
    public void setSeat(int seat)
    {this.seat = seat;}

}




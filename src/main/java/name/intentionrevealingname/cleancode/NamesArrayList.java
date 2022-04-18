package src.main.java.name.intentionrevealingname.cleancode;

// Notice that the simplicity of the code has not changed. It still has exactly the same number of operators and constants, with exactly the same number of nesting levels.

/*We can go further and write a simple class for cells instead of using an array of ints. It can include an intention-revealing function
        (call it isFlagged) to hide the magic numbers. It results in a new version of the function:*/



public class NamesArrayList {

    /*public List< int[]>getFlaggedCells(){
    List< int[]>flaggedCells=new ArrayList< int[]>();
    for(int[]cell:gameBoard)
        if(cell[STATUS_VALUE]= =FLAGGED)
            flaggedCells.add(cell);
    return flaggedCells;
}*/

    public List<Cell> getFlaggedCells() {
        List<Cell> flaggedCells = new ArrayList<Cell>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
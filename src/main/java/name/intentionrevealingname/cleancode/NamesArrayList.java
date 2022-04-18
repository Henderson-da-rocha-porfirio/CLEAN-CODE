package src.main.java.name.intentionrevealingname.cleancode;

// Notice that the simplicity of the code has not changed. It still has exactly the same number of operators and constants, with exactly the same number of nesting levels.

public List< int[]>getFlaggedCells(){
    List< int[]>flaggedCells=new ArrayList< int[]>();
    for(int[]cell:gameBoard)
        if(cell[STATUS_VALUE]= =FLAGGED)
            flaggedCells.add(cell);
    return flaggedCells;
}

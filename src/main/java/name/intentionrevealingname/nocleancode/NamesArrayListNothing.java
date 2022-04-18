package src.main.java.name.intentionrevealingname.nocleancode;

// The problem isn’t the simplicity of the code but the implicity of the code (to coin a phrase): the degree to which the context is not explicit in the code itself.
/*The code implicitly requires that we know the answers to questions such as:
        1. What kinds of things are in theList?
        2. What is the significance of the zeroth subscript of an item in theList?
        3. What is the significance of the value 4?
        4. How would I use the list being returned?*/

public List < int[] > getThem() {
  List < int[] > list1 = new ArrayList < int[] >();
  for (int[] x : theList)
    if (x[ 0] = = 4)
      list1. add( x);
  return list1;
}

package Interfaces;

import java.util.Set;

public interface Optimizer<E> {

    //what is an optimizer?

    //it takes a function and finds the max or minmimum

    //it takes a ground set and finds the subset that results in that funtion being optimized

    
    //what function im optimizing
    public void setFunction();
    public void getFunction();

    
    public void maximize();
    public void minimize();

    public Set<E> getBestSubset();

    
}

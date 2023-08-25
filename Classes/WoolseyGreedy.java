package Classes;

import Interfaces.SubmodularFunction;
import java.util.Set;
import java.util.HashSet;


public class WoolseyGreedy<E> implements Interfaces.Optimizer<E>, Runnable{

    
    SubmodularFunction<E> function;
    HashSet<E> selected;
    HashSet<E> groundSet;
    int[] weights;
    int mode;
    int k;

    public final int GREEDY = 0;
    public final int LAZYGREEDY = 1;

    
    public WoolseyGreedy(Interfaces.SubmodularFunction<E> f, Set<E> groundSet, int mode, int k){
        
        //weights are equal to the marginal gains that would be have been gained had the element been added to
            //  the selected subset last round
        this.weights = new int[groundSet.size()];
        this.function = f;
        this.selected = new HashSet<E>();
        this.groundSet = new HashSet<E>();
        this.mode = mode;
        this.k = k;

    }
    @Override
    public void setFunction(SubmodularFunction<E> f) {
        this.function = f;
    }

    @Override
    public SubmodularFunction<E> getFunction() {
        return this.function;
    }

    @Override
    public void maximize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximize'");
    }

    @Override
    public void minimize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimize'");
    }

    @Override
    public Set getBestSubset() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBestSubset'");
    }
    @Override
    public void run() {

        int groundSetUtility = this.function.evaluate(this.groundSet);


        int bestMarginalGain = -1;

        while((this.function.evaluate(this.selected) < groundSetUtility) && (this.selected.size() < this.k)){

            

        }
        
    }

}


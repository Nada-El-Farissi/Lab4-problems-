package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int currentNumberOfIntegers=0;
    int currentSize;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        currentSize=size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
        currentNumberOfIntegers=list.length;

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<currentNumberOfIntegers; i++)
            System.out.println(i + ":\t" + list[i]);
    }
    public void increaseSize(){
        currentSize=currentSize*2;
        int[] l=new int[currentSize];
        for (int i=0;i<list.length;i++){
            l[i]=list[i];
        }
        list=l;
    }
    public void addElement(int newVal){
        if (currentNumberOfIntegers==currentSize){//check if the array is full
            increaseSize();
        }
        list[currentNumberOfIntegers]=newVal; //currentNumberOfIntegers without +1 because of 0 indexation
        currentNumberOfIntegers++;
    }
    public void removeFirst(int firstVal){
        boolean found=false;
        int indexFound=-1;
        for (int i=0;i<currentNumberOfIntegers;i++){
            if (firstVal==list[i]){
                found=true;
                indexFound=i;
                break;
            }
        }
        if (found){//if found shift
            for (int i=indexFound;i<currentNumberOfIntegers-1;i++){
                list[i]=list[i+1];
            }
            currentNumberOfIntegers--;
        }
    }
    public void removeAll(int newVal){
        boolean found=false;
        int[] indexesFound=new int[currentNumberOfIntegers];
        int c=0;
        for (int i=0;i<currentNumberOfIntegers;i++){
            if (newVal==list[i]){
                found=true;
                indexesFound[c]=i;
                c++;
            }
        }
        if (found){//if found shift
            for (int j=c-1;j>=0;j--){
                for (int i=indexesFound[j];i<currentNumberOfIntegers-1;i++){
                    list[i]=list[i+1];
                }
                currentNumberOfIntegers--;

            }
        }

    }
}
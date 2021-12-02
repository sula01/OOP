package Task2;
public abstract class Operator{
    public int initialValue;
    public Operator(int val){
        this.initialValue = val;
    }
    abstract protected void execute(int anotherValue);
}

class Add extends Operator{
    public Add(int val){
        super(val);
    }
    public void execute(int anotherValue){
        this.initialValue += anotherValue;
    }
}

class Subtract extends Operator{
    public Subtract(int val){
        super(val);
    }
    public void execute(int anotherValue){
        this.initialValue -= anotherValue;
    }
}

class Multiply extends Operator{
    public Multiply(int val){
        super(val);
    }
    public void execute(int anotherValue){
        this.initialValue *= anotherValue;
    }
}

class Divide extends Operator{
    public Divide(int val){
        super(val);
    }
    public void execute(int anotherValue){
        this.initialValue /= anotherValue;
    }
}

class Clear extends Operator{
    public Clear(int val){
        super(val);
    }
    public void execute(int anotherValue){
        this.initialValue = 0;
    }
}
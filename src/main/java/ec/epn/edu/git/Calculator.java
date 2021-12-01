package ec.epn.edu.git;

public class Calculator {
    private int answer;

    public int addition(int a, int b){
        return a + b;
    }
    public int subtraction(int a, int b){
        return a - b;
    }

    public int division(int a, int b){
        if(b!=0) {
            return a / b;
        }else{
            return -1;
        }
    }
    public void timeout(int time){
        try{
            Thread.sleep(time);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public int getAnswer(){
        return answer;
    }
    public void setAnswer(int answer){
        this.answer = answer;
    }
}

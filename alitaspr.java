/**
 * Created by enriquef on 4/21/14.
 */
public class alitaspr {

    public void Num(){
        String dot = "";
        for(int i = 0; i < 25.; i++ ){
            dot = dot + ".";
            System.out.println("alitas"+ dot);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] args){
        alitaspr obj = new alitaspr();
        obj.Num();
    }
}

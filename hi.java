/**
 * Created by enriquef on 4/21/14.
 */
public class hi {

    public void Num(){
        for(int i = 0; i < 22; i++ ){
            System.out.println("Quique es chingon");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String [] args){
        hi obj = new hi();
        obj.Num();
    }
}

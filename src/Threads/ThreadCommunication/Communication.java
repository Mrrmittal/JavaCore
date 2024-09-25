/**
 * Author: Jatin Mittal
 * Date: 25-09-2024
 */

package src.Threads.ThreadCommunication;

public class Communication implements  Runnable{


    private Resources resources;

    public Communication(Resources resources){
        this.resources = resources;
    }

    @Override
    public void run(){
        for(int i=0; i<10; i++){
            resources.producer(resources.data);

        }
    }

}

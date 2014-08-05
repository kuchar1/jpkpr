package Satelita;

public class BallPhysic implements Runnable{

	
	Painting refPainting1;
	//orbitX
	//orbitY
	
	
	public BallPhysic(Painting obiekt4){
		this.refPainting1=obiekt4;
	Thread t1 = new Thread();
	t1.start();
	}

	
	public void ballMovement(){
		while(true){
			
			
			refPainting1.orbitX =13;
			refPainting1.orbitY = 13;
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
		
	}
	
	
	
	

	@Override
	public void run() {


		
	}
	
	
	
	
	
	
	
}
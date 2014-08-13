package JavaAdvanced3;

import java.lang.reflect.Field;


public class FabrykaZwierzatek {

	public static ZwierzeAkwariowe tworzZwierzadko(String rodzaj) {
		
		
			Class<? extends ZwierzeAkwariowe> cl;
			try {
				cl = (Class<? extends ZwierzeAkwariowe>) Class.forName("JavaAdvanced3."+rodzaj);
				Field [] mojePola=cl.getDeclaredFields();
				System.out.println("Zwierzadko typ: " + cl + "posiada nastepujece atrybuty");
				for( Field f: mojePola){
					System.out.println(f.getName().toString());
				}
				
				
				return (ZwierzeAkwariowe) cl.newInstance();
			} 
			catch (ClassNotFoundException e1) {
				System.out.println("Nie ma takiego zwierzadka");
				return null;
			}
			catch (InstantiationException e) { 
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
			
			
			
			
			
	}
			
	
	
	
	
	
	
	
	/*	
		
		if ( rodzaj.equals("Rybka")){
		return new Rybka();
		}
		else if ( rodzaj.equals("Krewetka")){
			return new Krewetka();
		}
		else{
			return null;
		}*/
	
}


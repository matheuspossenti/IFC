package decisao;

public class TesteVazio {

	public static void main(String[] args) {
		
		String s = "IFC";
		
		if (s.isEmpty()) {
			System.out.println("� vazia!");
		}else 
		if (s.equals("IFC")){
			System.out.println("� IFC!");
		}else {
			
			System.out.println("� outra coisa");
		}
			

	}

}
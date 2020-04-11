import entities.rooms;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			System.out.println("Digite a quantidade de quartos a ser alugados:");
			int renting = sc.nextInt();
			int i;
			
			rooms[]vector = new rooms[10];
			
			for(i=0;i<renting;i++) {
				System.out.println(" Digite o numero do quarto a ser ocupado:");
				int number = sc.nextInt();
				String breakline = sc.nextLine();
				System.out.println(" Digite o nome da ocupante:");
				String name = sc.nextLine();
				String breakline_2 = sc.nextLine();
				System.out.println(" Digite o e-mail do ocupante:");
				String email = sc.nextLine();
				int ocuppation= 1;
				vector[number]=new rooms(name,email,number);
			}
			
			System.out.println("Quartos Alugados:");
			int k;
			for(k=0;k<10;k++) {
				if(vector[k]!=null){
					System.out.println("Quarto: "+vector[k].getNumber_room());
					System.out.println("Nome do Ocupante: "+vector[k].getName());
					System.out.println("Email do Ocupante: "+vector[k].getEmail());
				}
			}
			
			sc.close();
	}

}

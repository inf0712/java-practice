class movie{
	String movieName;
	int ticketCount;
	double ticketPrice;

	double calculateTotal(){
		return ticketCount*ticketPrice;
	}

	double calculateDiscount(){
		if(ticketCount<3){
			return 0;
		}
		else if(ticketCount>3 && ticketCount<5){
			return 0.10*calculateTotal();
		}
		else{
			return 0.15*calculateTotal();
		}
	}

	double calculateFinalAmount(){
		return calculateTotal()+calculateDiscount();
	}

	void display(){
		System.out.println("Movie Name is "+movieName);
		System.out.println("Ticket Price is "+ticketPrice);
		System.out.println("Ticket Count is "+ticketCount);
		System.out.println("Total Amount : "+calculateTotal());
		System.out.println("Total Discount : "+calculateDiscount());
		System.out.println("Final Amount : "+calculateFinalAmount());
	}
}

public class ticket{
	public static void main(String args[]){
	
		String movie="Titanic";
		int TicketCount=4;
		double ticketPrice=170;

		movie m1=new movie();
		m1.movieName=movie;
		m1.ticketCount=TicketCount;
		m1.ticketPrice=ticketPrice;

		m1.calculateTotal();
		m1.calculateDiscount();
		m1.calculateFinalAmount();
		m1.display();
	}
}

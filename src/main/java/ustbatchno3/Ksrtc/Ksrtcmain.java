package ustbatchno3.Ksrtc;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ksrtcmain {

	interface UserInput {
        void accept(String input);
    }
	
	public static void main(String[] args) {
//		Scanner n = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		
		List<Ksrtc> ksrtc = new ArrayList<>();
		ksrtc.add(new Ksrtc("TVM", "Kochi", 530,LocalDateTime.of(2023, 3, 20, 8, 0)));
		ksrtc.add(new Ksrtc("Kazhakoottam", "Pathanamthitta", 180,LocalDateTime.of(2023, 3, 10, 8, 0)));
		ksrtc.add(new Ksrtc("Thrissur", "Malappuram", 100,LocalDateTime.of(2023, 3, 22, 12, 0)));
		
		 List<Ksrtc> availableSeats = new ArrayList<>();
	        availableSeats.add(20, null);
	        availableSeats.add(30, null);
	        availableSeats.add(10, null);
	        
	        UserInput handleInput = (input) -> {
	            // process the input here
	        };
	        
	        List<Ksrtc> filteredSchedules = ksrtc.stream()
	                .filter(schedule -> schedule.getSource().equalsIgnoreCase("TVM")
	                                    && schedule.getDestination().equalsIgnoreCase("Kochi")
	                                    && schedule.getDeptime().isAfter(LocalDateTime.now()))
	                .collect(Collectors.toList());
	        
	        if(!filteredSchedules.isEmpty()) {
	            int availableSeatCount = availableSeats.get(0);
	            if(availableSeatCount > 0) {
	                availableSeats.set(0, availableSeatCount - 1);
	                // process the booking here
	            }
	        }
	}

}

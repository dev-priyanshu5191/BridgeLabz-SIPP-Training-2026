
// import java.util.HashSet;

// public class EventEntry{
//     HashSet<String> set = new HashSet<>();

//     public void registerParticipant(String email){
//         if(set.add(email)){
//             System.out.println("Registration Success");
//         } else{
//             System.out.println("Email already exists");
//         }
//     }

//     public void displayParticipants() {
//         System.out.println("Registered Participants:");

//         for (String email : set) {
//             System.out.println(email);
//         }

//         System.out.println("Total Attendees = " + set.size());
//     }
//     public static void main(String[] args) {
//          EventEntry event = new EventEntry();

//         event.registerParticipant("abc@gmail.com");
//         event.registerParticipant("xyz@gmail.com");
//         event.registerParticipant("pqr@gmail.com");

//         event.registerParticipant("abc@gmail.com");

//         event.displayParticipants();


//     }
// }



public static void main(String[] args){
    HashMap<Integer,String> hs=new HashMap<>();
     hs.get(1);
     hs.keyset();
     hs.values();

     for(Map.Entry<Integer,String> entry:hs.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
     }

     String str="aaabbbcc";

}
public class hotelBookingsPossible {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> 
                        depart, int K) {
        int i = 0,j = 0,n = 0;
        Collections.sort(arrive);
        Collections.sort(depart);
        int size = arrive.size();
        while(i < size && j < size){
            if(arrive.get(i) < depart.get(j)){
                i++;
                n++;
            }
            else{
                j++;
                n--;
            }
            if(n > K) { return false; }
        }
        return true
    }
}
